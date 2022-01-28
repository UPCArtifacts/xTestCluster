import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest13 {

    public static boolean debug = false;

    @Test
    public void test6501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6501");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(10, (int) ' ', 97, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6502");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, 32, 100, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test6503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6503");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) '4', (int) (byte) 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test6504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6504");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, (int) (short) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test6505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6505");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((-1), 52, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6506");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) 97, (java.lang.Integer) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6507");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 100);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test6508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6508");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (short) 1, (int) (short) -1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test6509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6509");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6510");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("hi!", "off", "yes", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6511");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 35, (java.lang.Integer) (-1), (java.lang.Integer) 1, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6512");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (byte) 10, (int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6513");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, 97, (int) (short) 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test6514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6514");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, 52, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test6515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6515");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { true };
        java.lang.Boolean boolean2 = org.apache.commons.lang.BooleanUtils.xor(booleanArray1);
        java.lang.Boolean boolean3 = org.apache.commons.lang.BooleanUtils.xor(booleanArray1);
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.xor(booleanArray1);
        java.lang.Boolean boolean5 = org.apache.commons.lang.BooleanUtils.xor(booleanArray1);
        java.lang.Boolean boolean6 = org.apache.commons.lang.BooleanUtils.xor(booleanArray1);
        java.lang.Boolean boolean7 = org.apache.commons.lang.BooleanUtils.xor(booleanArray1);
        java.lang.Boolean boolean8 = org.apache.commons.lang.BooleanUtils.xor(booleanArray1);
        java.lang.Class<?> wildcardClass9 = booleanArray1.getClass();
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test6516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6516");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(97, (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6517");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("on", "yes", "off", "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6518");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) 'a', (int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6519");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("off", "yes", "yes", "off");
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test6520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6520");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("no", "true", "true", "false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6521");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (byte) 10, (int) (byte) 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test6522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6522");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, (int) (byte) 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test6523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6523");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 32, (java.lang.Integer) 1, (java.lang.Integer) 35, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6524");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 10, (java.lang.Integer) 100, (java.lang.Integer) 52, (java.lang.Integer) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6525");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, (int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test6526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6526");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test6527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6527");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) '#', 52, 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test6528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6528");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) (-1), (java.lang.Integer) 97, (java.lang.Integer) 52, (java.lang.Integer) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6529");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(32, (int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6530");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "false", "on", "off");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "on" + "'", str4, "on");
    }

    @Test
    public void test6531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6531");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (short) 0, (int) ' ', (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6532");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, (int) (byte) 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test6533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6533");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 52, (java.lang.Integer) 97, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6534");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (byte) 10, (int) (short) 0, (int) (byte) 100, (int) (byte) 10);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test6535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6535");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, 97, 52, 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test6536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6536");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "no", "yes", "off");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "yes" + "'", str4, "yes");
    }

    @Test
    public void test6537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6537");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, (int) (short) -1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6538");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(0, 52, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6539");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, 97, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test6540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6540");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("yes", "on", "no", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6541");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, 35, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test6542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6542");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("false", "", "yes", "yes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6543");
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
        boolean boolean24 = org.apache.commons.lang.BooleanUtils.xor(booleanArray6);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test6544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6544");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 97, (java.lang.Integer) 100, (java.lang.Integer) (-1), (java.lang.Integer) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6545");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, 52, (int) (byte) 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test6546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6546");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) '#', (int) (byte) 1, (int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6547");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) 97, (java.lang.Integer) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6548");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) ' ', (int) ' ', 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test6549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6549");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, (int) ' ', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test6550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6550");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("", "yes", "false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6551");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) ' ', (int) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6552");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(10, 52, 52, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6553");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (byte) 1, 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test6554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6554");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, (int) (byte) 10, 35, (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test6555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6555");
        java.lang.Boolean[] booleanArray3 = new java.lang.Boolean[] { false, false, true };
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        java.lang.Boolean boolean5 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        java.lang.Boolean boolean6 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        java.lang.Boolean boolean7 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        java.lang.Boolean boolean8 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        java.lang.Boolean boolean9 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        java.lang.Boolean boolean10 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        java.lang.Boolean boolean11 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        java.lang.Boolean boolean12 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        java.lang.Boolean boolean13 = org.apache.commons.lang.BooleanUtils.xor(booleanArray3);
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + true + "'", boolean13, true);
    }

    @Test
    public void test6556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6556");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 32, (java.lang.Integer) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6557");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) 'a', (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6558");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "no", "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "no" + "'", str4, "no");
    }

    @Test
    public void test6559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6559");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 97, (java.lang.Integer) 1, (java.lang.Integer) (-1), (java.lang.Integer) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6560");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("on", "off", "on", "");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test6561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6561");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) '#', 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test6562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6562");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "hi!", "", "yes");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test6563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6563");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("true", "", "on", "yes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6564");
        boolean[] booleanArray4 = new boolean[] { true, true, false, true };
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
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[true, true, false, true]");
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
    }

    @Test
    public void test6565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6565");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean("off", "false", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6566");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((-1), 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6567");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (short) 0, 0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test6568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6568");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("yes", "off", "on", "false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6569");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) (-1), (java.lang.Integer) 100, (java.lang.Integer) 52, (java.lang.Integer) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6570");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (byte) 10, (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6571");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, (int) '4', 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test6572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6572");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 97, (java.lang.Integer) 35, (java.lang.Integer) 35, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6573");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 97, (java.lang.Integer) 52, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6574");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (short) 100, (int) (short) 0, (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6575");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("true", "", "", "no");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6576");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) ' ', 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6577");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) 100, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6578");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(97, (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6579");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(52, (int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6580");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "no", "true", "off");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "no" + "'", str4, "no");
    }

    @Test
    public void test6581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6581");
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
        java.lang.Class<?> wildcardClass24 = booleanArray4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test6582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6582");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (short) 10, 32, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6583");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang.BooleanUtils.xor(booleanArray1);
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.xor(booleanArray1);
        boolean boolean4 = org.apache.commons.lang.BooleanUtils.xor(booleanArray1);
        boolean boolean5 = org.apache.commons.lang.BooleanUtils.xor(booleanArray1);
        boolean boolean6 = org.apache.commons.lang.BooleanUtils.xor(booleanArray1);
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray1), "[false]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6584");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("false", "true", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6585");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(1, 10, 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6586");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(32, 97, (int) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6587");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "on", "", "off");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test6588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6588");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("no", "on", "on", "on");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6589");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 1, (java.lang.Integer) 32, (java.lang.Integer) 10, (java.lang.Integer) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6590");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 32, (java.lang.Integer) 52, (java.lang.Integer) 35, (java.lang.Integer) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6591");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (byte) -1, 1, (int) ' ', (int) (short) -1);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test6592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6592");
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
        boolean boolean27 = org.apache.commons.lang.BooleanUtils.xor(booleanArray4);
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test6593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6593");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, 35, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test6594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6594");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 35, (java.lang.Integer) 52, (java.lang.Integer) 1, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6595");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject(97, (int) (byte) 10, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6596");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "off", "off", "off");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "off" + "'", str4, "off");
    }

    @Test
    public void test6597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6597");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 35, (java.lang.Integer) 1, (java.lang.Integer) 0, (java.lang.Integer) 35);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test6598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6598");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "hi!", "yes", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test6599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6599");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 97, (java.lang.Integer) 0, (java.lang.Integer) 35, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6600");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 35, (java.lang.Integer) 32, (java.lang.Integer) 32, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6601");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (byte) 100, (int) ' ', 52, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6602");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("true", "off", "off", "true");
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test6603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6603");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) (-1));
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test6604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6604");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 10, (java.lang.Integer) 97, (java.lang.Integer) 0);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test6605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6605");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, (-1), (int) '4', 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test6606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6606");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "no", "off", "true");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "off" + "'", str4, "off");
    }

    @Test
    public void test6607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6607");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "on", "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "on" + "'", str4, "on");
    }

    @Test
    public void test6608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6608");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, 52, (int) (byte) 0, 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test6609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6609");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) 'a', (int) '#', (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6610");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(52, (int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6611");
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(52, 52, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test6612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6612");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "off", "true", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "off" + "'", str4, "off");
    }

    @Test
    public void test6613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6613");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 52, (java.lang.Integer) 0, (java.lang.Integer) 97, (java.lang.Integer) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6614");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (short) -1, (int) '#', 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test6615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6615");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, (int) (byte) 10, (-1), 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test6616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6616");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, (int) 'a', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test6617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6617");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test6618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6618");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (byte) 1, (int) ' ', (int) (byte) 0, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6619");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) true, "on", "false", "yes");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "on" + "'", str4, "on");
    }

    @Test
    public void test6620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6620");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, (int) (short) 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test6621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6621");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "no", "false", "false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6622");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, 32, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test6623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6623");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, 0, (int) (byte) 100, 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test6624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6624");
        boolean[] booleanArray2 = new boolean[] { true, true };
        boolean boolean3 = org.apache.commons.lang.BooleanUtils.xor(booleanArray2);
        boolean boolean4 = org.apache.commons.lang.BooleanUtils.xor(booleanArray2);
        boolean boolean5 = org.apache.commons.lang.BooleanUtils.xor(booleanArray2);
        boolean boolean6 = org.apache.commons.lang.BooleanUtils.xor(booleanArray2);
        boolean boolean7 = org.apache.commons.lang.BooleanUtils.xor(booleanArray2);
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray2), "[true, true]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test6625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6625");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, 0, (int) '#', 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test6626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6626");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(0, (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6627");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((java.lang.Integer) 100, (java.lang.Integer) 97, (java.lang.Integer) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6628");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(true, (-1), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6629");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((java.lang.Integer) 1, (java.lang.Integer) 52, (java.lang.Integer) 97, (java.lang.Integer) 1);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test6630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6630");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean((int) (byte) 0, (int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6631");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (short) 0, (int) (byte) 10, (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test6632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6632");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) false, 0, (int) (short) -1, 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test6633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6633");
        java.lang.String str4 = org.apache.commons.lang.BooleanUtils.toString((java.lang.Boolean) false, "hi!", "", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test6634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6634");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject("true", "on", "true", "no");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test6635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6635");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang.BooleanUtils.toBoolean(35, (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6636");
        int int3 = org.apache.commons.lang.BooleanUtils.toInteger(false, (int) (byte) -1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test6637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6637");
        java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) (byte) 1, (int) (byte) -1, 100, (int) (byte) 1);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test6638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6638");
        int int4 = org.apache.commons.lang.BooleanUtils.toInteger((java.lang.Boolean) true, (int) (short) 0, (int) '#', 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test6639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6639");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang.BooleanUtils.toBooleanObject((int) '4', (int) (byte) 0, (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}

