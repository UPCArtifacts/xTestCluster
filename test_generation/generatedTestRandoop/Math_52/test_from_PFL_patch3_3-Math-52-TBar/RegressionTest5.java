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
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation16 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, (double) 100L);
        double double17 = rotation16.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation18 = rotation16.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation24 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        double double25 = rotation24.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = rotation18.applyInverseTo(rotation24);
        double[][] doubleArray27 = rotation24.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation33 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-0.1855270382668764d), (double) '4', (-10.0d), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D34 = rotation33.getAxis();
        double double35 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation24, rotation33);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D36 = rotation33.getAxis();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-0.0d) + "'", double17 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation18);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(rotation26);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertNotNull(vector3D34);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertNotNull(vector3D36);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 10, 0.0d, (double) (byte) 0, 10.0d, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation17 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D18 = rotation17.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation24 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D25 = rotation24.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D18, vector3D25);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D18, (double) 100L);
        double double29 = rotation28.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation30 = rotation11.applyInverseTo(rotation28);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation31 = rotation5.applyInverseTo(rotation28);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation32 = rotation31.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation33 = rotation32.revert();
        double double34 = rotation33.getQ1();
        org.junit.Assert.assertNotNull(vector3D18);
        org.junit.Assert.assertNotNull(vector3D25);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-0.0d) + "'", double29 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation30);
        org.junit.Assert.assertNotNull(rotation31);
        org.junit.Assert.assertNotNull(rotation32);
        org.junit.Assert.assertNotNull(rotation33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double13 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation5, rotation12);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation19 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D20 = rotation19.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D27 = rotation26.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D20, vector3D27);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = rotation28.applyInverseTo(rotation34);
        double double36 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation12, rotation28);
        double double37 = rotation12.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation43 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D44 = rotation43.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation50 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double51 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation43, rotation50);
        double double52 = rotation50.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D59 = rotation58.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation65 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double66 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation58, rotation65);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation72 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D73 = rotation72.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation79 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double80 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation72, rotation79);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation81 = rotation65.applyInverseTo(rotation72);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation82 = rotation50.applyTo(rotation72);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D83 = rotation50.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D84 = rotation12.applyInverseTo(vector3D83);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation85 = rotation12.revert();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(vector3D20);
        org.junit.Assert.assertNotNull(vector3D27);
        org.junit.Assert.assertNotNull(rotation35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 3.141592653589793d + "'", double36 == 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 3.141592653589793d + "'", double37 == 3.141592653589793d);
        org.junit.Assert.assertNotNull(vector3D44);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 3.141592653589793d + "'", double52 == 3.141592653589793d);
        org.junit.Assert.assertNotNull(vector3D59);
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertNotNull(vector3D73);
        org.junit.Assert.assertTrue(Double.isNaN(double80));
        org.junit.Assert.assertNotNull(rotation81);
        org.junit.Assert.assertNotNull(rotation82);
        org.junit.Assert.assertNotNull(vector3D83);
        org.junit.Assert.assertNotNull(vector3D84);
        org.junit.Assert.assertNotNull(rotation85);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-0.20557451782484024d), (double) 100, (double) (-1), 97.0d, true);
        java.lang.Class<?> wildcardClass6 = rotation5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.geometry.euclidean.threed.Rotation rotation4 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(rotationOrder0, (-0.4497942902016142d), (-0.012362609385487295d), (-9.502464466516079d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 'a', 1.0d, 0.7555423460632325d, 0.001978792867119834d, false);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (short) 1, 0.0d, 17.66239947251099d, (double) '#', true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.junit.Assert.assertNotNull(vector3D6);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation16 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, (double) 100L);
        double double17 = rotation16.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation23 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D24 = rotation23.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation30 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D31 = rotation30.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation32 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D24, vector3D31);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D24, (double) 1L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation40 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D41 = rotation40.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation47 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D48 = rotation47.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D41, vector3D48);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation55 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D56 = rotation55.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation62 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D63 = rotation62.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation69 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D70 = rotation69.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation71 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D63, vector3D70);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation77 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D78 = rotation77.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation84 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D85 = rotation84.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation86 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D78, vector3D85);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation87 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D48, vector3D56, vector3D70, vector3D85);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation88 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D24, vector3D70);
        double double89 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation16, rotation88);
        double double90 = rotation88.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder91 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray92 = rotation88.getAngles(rotationOrder91);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.geometry.euclidean.threed.CardanEulerSingularityException; message: Euler angles singularity");
        } catch (org.apache.commons.math.geometry.euclidean.threed.CardanEulerSingularityException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-0.0d) + "'", double17 == (-0.0d));
        org.junit.Assert.assertNotNull(vector3D24);
        org.junit.Assert.assertNotNull(vector3D31);
        org.junit.Assert.assertNotNull(vector3D41);
        org.junit.Assert.assertNotNull(vector3D48);
        org.junit.Assert.assertNotNull(vector3D56);
        org.junit.Assert.assertNotNull(vector3D63);
        org.junit.Assert.assertNotNull(vector3D70);
        org.junit.Assert.assertNotNull(vector3D78);
        org.junit.Assert.assertNotNull(vector3D85);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 0.5309649148733836d + "'", double89 == 0.5309649148733836d);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 0.0d + "'", double90 == 0.0d);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.8775825618903728d, (double) 10.0f, (double) (byte) 10, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder7 = null;
        double[] doubleArray8 = rotation5.getAngles(rotationOrder7);
        double double9 = rotation5.getQ1();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[2.356194490192345, 3.017642674795779, -2.356194490192345]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.7057492528065779d + "'", double9 == 0.7057492528065779d);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D12 = rotation11.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation18 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D19 = rotation18.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D12, vector3D19);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation22 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D12, (double) 100L);
        double double23 = rotation22.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation24 = rotation5.applyInverseTo(rotation22);
        double double25 = rotation5.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D26 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D26, (double) 10.0f);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation30 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D26, (double) '#');
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder31 = null;
        double[] doubleArray32 = rotation30.getAngles(rotationOrder31);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation38 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), 8960.928033465932d, (double) 100L, (double) (short) 100, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation39 = rotation30.applyTo(rotation38);
        org.junit.Assert.assertNotNull(vector3D12);
        org.junit.Assert.assertNotNull(vector3D19);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-0.0d) + "'", double23 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertNotNull(vector3D26);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-0.05546049560495902, 2.6986718947111035, 0.14387680937736505]");
        org.junit.Assert.assertNotNull(rotation39);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-0.1855270382668764d), 0.8330717246011861d, 8960.928033465932d, 0.5028407436006902d, false);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D28 = rotation27.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D35 = rotation34.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation36 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D28, vector3D35);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D43 = rotation42.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D50 = rotation49.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D43, vector3D50);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D13, vector3D21, vector3D35, vector3D50);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation54 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D21, (double) 1);
        double double55 = rotation54.getQ1();
        double double56 = rotation54.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D57 = rotation54.getAxis();
        double double58 = rotation54.getQ2();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertNotNull(vector3D28);
        org.junit.Assert.assertNotNull(vector3D35);
        org.junit.Assert.assertNotNull(vector3D43);
        org.junit.Assert.assertNotNull(vector3D50);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.33900504942104487d + "'", double55 == 0.33900504942104487d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.33900504942104487d + "'", double56 == 0.33900504942104487d);
        org.junit.Assert.assertNotNull(vector3D57);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.33900504942104487d + "'", double58 == 0.33900504942104487d);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        double[][] doubleArray15 = rotation14.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation17 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray15, 0.016784652862817887d);
        java.lang.Class<?> wildcardClass18 = rotation17.getClass();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (short) -1, (-0.1730129508244783d), (-0.1730129508244783d), (double) 10.0f, false);
        double double6 = rotation5.getQ2();
        double double7 = rotation5.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation13 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D14 = rotation13.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation22 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D14, vector3D21);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = rotation22.applyInverseTo(rotation28);
        double double30 = rotation28.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation36 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D37 = rotation36.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation43 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double44 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation36, rotation43);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation50 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D51 = rotation50.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation57 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D58 = rotation57.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D51, vector3D58);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation65 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation66 = rotation59.applyInverseTo(rotation65);
        double double67 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation43, rotation59);
        double double68 = rotation59.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation69 = rotation28.applyInverseTo(rotation59);
        double double70 = rotation28.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation71 = rotation28.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation72 = rotation5.applyTo(rotation28);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation78 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D79 = rotation78.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation85 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double86 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation78, rotation85);
        double double87 = rotation85.getQ3();
        double double88 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation28, rotation85);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation94 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.3388903615770647d, (double) 0L, 9.649660284921133d, (double) (byte) 100, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation95 = rotation85.applyTo(rotation94);
        double double96 = rotation85.getQ1();
        double double97 = rotation85.getQ3();
        double double98 = rotation85.getQ2();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.1730129508244783d) + "'", double6 == (-0.1730129508244783d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(vector3D14);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertNotNull(rotation29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 3.141592653589793d + "'", double30 == 3.141592653589793d);
        org.junit.Assert.assertNotNull(vector3D37);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertNotNull(vector3D51);
        org.junit.Assert.assertNotNull(vector3D58);
        org.junit.Assert.assertNotNull(rotation66);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 3.141592653589793d + "'", double67 == 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertNotNull(rotation69);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 10.0d + "'", double70 == 10.0d);
        org.junit.Assert.assertNotNull(rotation71);
        org.junit.Assert.assertNotNull(rotation72);
        org.junit.Assert.assertNotNull(vector3D79);
        org.junit.Assert.assertTrue(Double.isNaN(double86));
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 1.0d + "'", double87 == 1.0d);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 0.0d + "'", double88 == 0.0d);
        org.junit.Assert.assertNotNull(rotation95);
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 10.0d + "'", double96 == 10.0d);
        org.junit.Assert.assertTrue("'" + double97 + "' != '" + 1.0d + "'", double97 == 1.0d);
        org.junit.Assert.assertTrue("'" + double98 + "' != '" + (-1.0d) + "'", double98 == (-1.0d));
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double13 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation5, rotation12);
        double double14 = rotation12.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D28 = rotation27.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D21, vector3D28);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation31 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D21, (double) 100L);
        double double32 = rotation31.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation33 = rotation31.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation39 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        double double40 = rotation39.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation41 = rotation33.applyInverseTo(rotation39);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D42 = rotation39.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D43 = rotation12.applyInverseTo(vector3D42);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D44 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.geometry.euclidean.threed.Rotation rotation45 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D43, vector3D44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertNotNull(vector3D28);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-0.0d) + "'", double32 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation33);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertNotNull(rotation41);
        org.junit.Assert.assertNotNull(vector3D42);
        org.junit.Assert.assertNotNull(vector3D43);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.9950846276202212d, 2.7755575615628914E-17d, 0.9456205751905904d, 8960.928033465932d, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D12 = rotation11.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation18 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D19 = rotation18.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D12, vector3D19);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D27 = rotation26.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation33 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D34 = rotation33.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D27, vector3D34);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation41 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D42 = rotation41.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation48 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D49 = rotation48.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation50 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D42, vector3D49);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = rotation35.applyTo(rotation50);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = rotation20.applyTo(rotation51);
        double double53 = rotation20.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D60 = rotation59.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation66 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D67 = rotation66.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation68 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D60, vector3D67);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation70 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D60, (double) 100L);
        double double71 = rotation70.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation72 = rotation70.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation78 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        double double79 = rotation78.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation80 = rotation72.applyInverseTo(rotation78);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation81 = rotation20.applyInverseTo(rotation72);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation87 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D88 = rotation87.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation94 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double95 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation87, rotation94);
        double double96 = rotation94.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation97 = rotation72.applyInverseTo(rotation94);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation98 = rotation5.applyTo(rotation94);
        org.junit.Assert.assertNotNull(vector3D12);
        org.junit.Assert.assertNotNull(vector3D19);
        org.junit.Assert.assertNotNull(vector3D27);
        org.junit.Assert.assertNotNull(vector3D34);
        org.junit.Assert.assertNotNull(vector3D42);
        org.junit.Assert.assertNotNull(vector3D49);
        org.junit.Assert.assertNotNull(rotation51);
        org.junit.Assert.assertNotNull(rotation52);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertNotNull(vector3D60);
        org.junit.Assert.assertNotNull(vector3D67);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + (-0.0d) + "'", double71 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation72);
        org.junit.Assert.assertTrue(Double.isNaN(double79));
        org.junit.Assert.assertNotNull(rotation80);
        org.junit.Assert.assertNotNull(rotation81);
        org.junit.Assert.assertNotNull(vector3D88);
        org.junit.Assert.assertTrue(Double.isNaN(double95));
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 10.0d + "'", double96 == 10.0d);
        org.junit.Assert.assertNotNull(rotation97);
        org.junit.Assert.assertNotNull(rotation98);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.7881701093115124d, 0.5309649148733836d, 0.0d, 116.90457705856772d, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-0.1855270382668764d), (double) 1, Double.NaN, (double) (short) 100, false);
        double double12 = rotation11.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation18 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 10, 0.0d, (double) (byte) 0, 10.0d, false);
        double double19 = rotation18.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation25 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D26 = rotation25.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation32 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D33 = rotation32.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D26, vector3D33);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation40 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D41 = rotation40.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation47 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D48 = rotation47.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation54 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D55 = rotation54.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation56 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D48, vector3D55);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation62 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D63 = rotation62.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation69 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D70 = rotation69.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation71 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D63, vector3D70);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation72 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D33, vector3D41, vector3D55, vector3D70);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D73 = rotation18.applyTo(vector3D55);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation75 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D55, (double) 100L);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D76 = rotation11.applyInverseTo(vector3D55);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D77 = rotation5.applyTo(vector3D76);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(vector3D26);
        org.junit.Assert.assertNotNull(vector3D33);
        org.junit.Assert.assertNotNull(vector3D41);
        org.junit.Assert.assertNotNull(vector3D48);
        org.junit.Assert.assertNotNull(vector3D55);
        org.junit.Assert.assertNotNull(vector3D63);
        org.junit.Assert.assertNotNull(vector3D70);
        org.junit.Assert.assertNotNull(vector3D73);
        org.junit.Assert.assertNotNull(vector3D76);
        org.junit.Assert.assertNotNull(vector3D77);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double13 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation5, rotation12);
        double double14 = rotation12.getAngle();
        double double15 = rotation12.getAngle();
        double double16 = rotation12.getQ0();
        double double17 = rotation12.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation23 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D24 = rotation23.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation30 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D31 = rotation30.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation32 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D24, vector3D31);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D24, (double) 100L);
        double double35 = rotation34.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation36 = rotation34.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        double double43 = rotation42.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = rotation36.applyInverseTo(rotation42);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D45 = rotation42.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D46 = rotation12.applyInverseTo(vector3D45);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation48 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D46, 3.1216925665368036d);
        double double49 = rotation48.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation50 = org.apache.commons.math.geometry.euclidean.threed.Rotation.IDENTITY;
        double double51 = rotation50.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = rotation50.revert();
        double double53 = rotation50.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation54 = rotation48.applyTo(rotation50);
        double double55 = rotation48.getQ3();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.141592653589793d + "'", double14 == 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 3.141592653589793d + "'", double15 == 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(vector3D24);
        org.junit.Assert.assertNotNull(vector3D31);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-0.0d) + "'", double35 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation36);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertNotNull(rotation44);
        org.junit.Assert.assertNotNull(vector3D45);
        org.junit.Assert.assertNotNull(vector3D46);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.09756195019404022d + "'", double49 == 0.09756195019404022d);
        org.junit.Assert.assertNotNull(rotation50);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertNotNull(rotation52);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertNotNull(rotation54);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.00975619501940402d + "'", double55 == 0.00975619501940402d);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.geometry.euclidean.threed.Rotation rotation4 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(rotationOrder0, (double) (-1.0f), (-0.9998152766216806d), 0.7368621407866713d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 10, 0.0d, (double) (byte) 0, 10.0d, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation17 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D18 = rotation17.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation24 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D25 = rotation24.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D18, vector3D25);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D18, (double) 100L);
        double double29 = rotation28.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation30 = rotation11.applyInverseTo(rotation28);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation31 = rotation5.applyInverseTo(rotation28);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation32 = rotation31.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation38 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-0.1855270382668764d), (double) 10, (double) (short) -1, (double) 100.0f, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation39 = rotation38.revert();
        double double40 = rotation38.getQ2();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D41 = rotation38.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation47 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D48 = rotation47.getAxis();
        double double49 = rotation47.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D50 = rotation47.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D41, vector3D50);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D52 = rotation32.applyTo(vector3D50);
        org.junit.Assert.assertNotNull(vector3D18);
        org.junit.Assert.assertNotNull(vector3D25);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-0.0d) + "'", double29 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation30);
        org.junit.Assert.assertNotNull(rotation31);
        org.junit.Assert.assertNotNull(rotation32);
        org.junit.Assert.assertNotNull(rotation39);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-1.0d) + "'", double40 == (-1.0d));
        org.junit.Assert.assertNotNull(vector3D41);
        org.junit.Assert.assertNotNull(vector3D48);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.9996303825414301d + "'", double49 == 0.9996303825414301d);
        org.junit.Assert.assertNotNull(vector3D50);
        org.junit.Assert.assertNotNull(vector3D52);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (short) 10, (double) (short) -1, (double) '4', 0.9996303825414301d, false);
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = rotation5.getAngles(rotationOrder6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.geometry.euclidean.threed.CardanEulerSingularityException; message: Euler angles singularity");
        } catch (org.apache.commons.math.geometry.euclidean.threed.CardanEulerSingularityException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-0.005755946541407356d), 0.09949879346007118d, (-0.5d), (double) 1L, true);
        double double6 = rotation5.getQ2();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation18 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D19 = rotation18.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation25 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D26 = rotation25.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D19, vector3D26);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D19, (double) 100L);
        double double30 = rotation29.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation31 = rotation12.applyInverseTo(rotation29);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation37 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D38 = rotation37.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D45 = rotation44.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation46 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D38, vector3D45);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D53 = rotation52.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D60 = rotation59.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation61 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D53, vector3D60);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation67 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D68 = rotation67.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation74 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D75 = rotation74.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation76 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D68, vector3D75);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation77 = rotation61.applyTo(rotation76);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation78 = rotation46.applyTo(rotation77);
        double[][] doubleArray79 = rotation78.getMatrix();
        double double80 = rotation78.getQ1();
        double[][] doubleArray81 = rotation78.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation83 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray81, (double) 100L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation85 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray81, 0.7881701093115122d);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation87 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray81, 0.9456205751905904d);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation88 = rotation31.applyInverseTo(rotation87);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation89 = rotation5.applyTo(rotation88);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.4454472216916607d) + "'", double6 == (-0.4454472216916607d));
        org.junit.Assert.assertNotNull(vector3D19);
        org.junit.Assert.assertNotNull(vector3D26);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-0.0d) + "'", double30 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation31);
        org.junit.Assert.assertNotNull(vector3D38);
        org.junit.Assert.assertNotNull(vector3D45);
        org.junit.Assert.assertNotNull(vector3D53);
        org.junit.Assert.assertNotNull(vector3D60);
        org.junit.Assert.assertNotNull(vector3D68);
        org.junit.Assert.assertNotNull(vector3D75);
        org.junit.Assert.assertNotNull(rotation77);
        org.junit.Assert.assertNotNull(rotation78);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 0.0d + "'", double80 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertNotNull(rotation88);
        org.junit.Assert.assertNotNull(rotation89);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D28 = rotation27.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D21, vector3D28);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D36 = rotation35.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D43 = rotation42.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D36, vector3D43);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation45 = rotation29.applyTo(rotation44);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation46 = rotation14.applyTo(rotation45);
        double[][] doubleArray47 = rotation46.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray47, (double) 100.0f);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation55 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation61 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D62 = rotation61.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D63 = rotation55.applyInverseTo(vector3D62);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D64 = rotation49.applyTo(vector3D63);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation66 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D63, 0.0d);
        double double67 = rotation66.getQ2();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertNotNull(vector3D28);
        org.junit.Assert.assertNotNull(vector3D36);
        org.junit.Assert.assertNotNull(vector3D43);
        org.junit.Assert.assertNotNull(rotation45);
        org.junit.Assert.assertNotNull(rotation46);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertNotNull(vector3D62);
        org.junit.Assert.assertNotNull(vector3D63);
        org.junit.Assert.assertNotNull(vector3D64);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.31538323081891095d, (double) 10.0f, 0.30408632088084614d, 1.3713780210687443d, false);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-0.1855270382668764d), (double) 1, Double.NaN, (double) (short) 100, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D12 = rotation11.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation18 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D19 = rotation18.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D12, vector3D19);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D27 = rotation26.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation33 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D34 = rotation33.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D27, vector3D34);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation36 = rotation20.applyTo(rotation35);
        double double37 = rotation35.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation38 = rotation35.revert();
        double double39 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation5, rotation35);
        double[][] doubleArray40 = rotation5.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation46 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-0.1855270382668764d), (double) 10, (double) (short) -1, (double) 100.0f, false);
        double[][] doubleArray47 = rotation46.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation53 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D54 = rotation53.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation60 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D61 = rotation60.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation62 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D54, vector3D61);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation64 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D54, (double) 100L);
        double double65 = rotation64.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation66 = rotation64.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation72 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        double double73 = rotation72.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation74 = rotation66.applyInverseTo(rotation72);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation75 = rotation46.applyInverseTo(rotation74);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation76 = rotation5.applyTo(rotation75);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D77 = rotation76.getAxis();
        org.junit.Assert.assertNotNull(vector3D12);
        org.junit.Assert.assertNotNull(vector3D19);
        org.junit.Assert.assertNotNull(vector3D27);
        org.junit.Assert.assertNotNull(vector3D34);
        org.junit.Assert.assertNotNull(rotation36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(rotation38);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertNotNull(vector3D54);
        org.junit.Assert.assertNotNull(vector3D61);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + (-0.0d) + "'", double65 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation66);
        org.junit.Assert.assertTrue(Double.isNaN(double73));
        org.junit.Assert.assertNotNull(rotation74);
        org.junit.Assert.assertNotNull(rotation75);
        org.junit.Assert.assertNotNull(rotation76);
        org.junit.Assert.assertNotNull(vector3D77);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        double double6 = rotation5.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation18 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D19 = rotation18.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation25 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D26 = rotation25.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D19, vector3D26);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D19, (double) 100L);
        double double30 = rotation29.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation31 = rotation12.applyInverseTo(rotation29);
        double double32 = rotation31.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D33 = rotation31.getAxis();
        double double34 = rotation31.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = rotation5.applyTo(rotation31);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.009949879346007117d) + "'", double6 == (-0.009949879346007117d));
        org.junit.Assert.assertNotNull(vector3D19);
        org.junit.Assert.assertNotNull(vector3D26);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-0.0d) + "'", double30 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 28.016837073341897d + "'", double32 == 28.016837073341897d);
        org.junit.Assert.assertNotNull(vector3D33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-76.08862863985493d) + "'", double34 == (-76.08862863985493d));
        org.junit.Assert.assertNotNull(rotation35);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation16 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, (double) 100L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation22 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D29 = rotation28.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D36 = rotation35.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation37 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D29, vector3D36);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D38 = rotation22.applyTo(vector3D29);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D45 = rotation44.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D52 = rotation51.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D59 = rotation58.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation60 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D52, vector3D59);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation62 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D52, (double) 100L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation63 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D45, vector3D52);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation69 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D70 = rotation69.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation71 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D38, vector3D52, vector3D70);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D72 = rotation71.getAxis();
        double double73 = rotation71.getQ1();
        double double74 = rotation71.getAngle();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D29);
        org.junit.Assert.assertNotNull(vector3D36);
        org.junit.Assert.assertNotNull(vector3D38);
        org.junit.Assert.assertNotNull(vector3D45);
        org.junit.Assert.assertNotNull(vector3D52);
        org.junit.Assert.assertNotNull(vector3D59);
        org.junit.Assert.assertNotNull(vector3D70);
        org.junit.Assert.assertNotNull(vector3D72);
        org.junit.Assert.assertTrue(Double.isNaN(double73));
        org.junit.Assert.assertTrue(Double.isNaN(double74));
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 10, 0.0d, (double) (byte) 0, 10.0d, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation17 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D18 = rotation17.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation24 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D25 = rotation24.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D18, vector3D25);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D18, (double) 100L);
        double double29 = rotation28.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation30 = rotation11.applyInverseTo(rotation28);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation31 = rotation5.applyInverseTo(rotation28);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation32 = rotation31.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation33 = rotation32.revert();
        double double34 = rotation32.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D35 = rotation32.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D36 = rotation32.getAxis();
        org.junit.Assert.assertNotNull(vector3D18);
        org.junit.Assert.assertNotNull(vector3D25);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-0.0d) + "'", double29 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation30);
        org.junit.Assert.assertNotNull(rotation31);
        org.junit.Assert.assertNotNull(rotation32);
        org.junit.Assert.assertNotNull(rotation33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 9.649660284921133d + "'", double34 == 9.649660284921133d);
        org.junit.Assert.assertNotNull(vector3D35);
        org.junit.Assert.assertNotNull(vector3D36);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 10, 0.0d, (double) (byte) 0, 10.0d, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation17 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D18 = rotation17.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation24 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D25 = rotation24.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D18, vector3D25);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D18, (double) 100L);
        double double29 = rotation28.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation30 = rotation11.applyInverseTo(rotation28);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation31 = rotation5.applyInverseTo(rotation28);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation32 = rotation31.revert();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D33 = rotation32.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation39 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D40 = rotation39.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation46 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double47 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation39, rotation46);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation53 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D54 = rotation53.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation60 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D61 = rotation60.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation62 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D54, vector3D61);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation68 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation69 = rotation62.applyInverseTo(rotation68);
        double double70 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation46, rotation62);
        double double71 = rotation62.getQ3();
        double double72 = rotation62.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation73 = rotation32.applyInverseTo(rotation62);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation74 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.geometry.euclidean.threed.Rotation rotation75 = rotation32.applyTo(rotation74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vector3D18);
        org.junit.Assert.assertNotNull(vector3D25);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-0.0d) + "'", double29 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation30);
        org.junit.Assert.assertNotNull(rotation31);
        org.junit.Assert.assertNotNull(rotation32);
        org.junit.Assert.assertNotNull(vector3D33);
        org.junit.Assert.assertNotNull(vector3D40);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertNotNull(vector3D54);
        org.junit.Assert.assertNotNull(vector3D61);
        org.junit.Assert.assertNotNull(rotation69);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 3.141592653589793d + "'", double70 == 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 1.0d + "'", double72 == 1.0d);
        org.junit.Assert.assertNotNull(rotation73);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-0.33900504942104487d), (double) 100.0f, (double) 10L, 3.1216925665368036d, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D12 = rotation11.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation18 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D19 = rotation18.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D12, vector3D19);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D27 = rotation26.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation33 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double34 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation26, rotation33);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation40 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D41 = rotation40.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation47 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double48 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation40, rotation47);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = rotation33.applyInverseTo(rotation40);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D50 = rotation49.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D12, vector3D50);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation53 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D12, 3.082566122054968d);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D54 = rotation5.applyInverseTo(vector3D12);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation56 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D12, 3.1390038567388605d);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D57 = rotation56.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = rotation56.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double60 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation58, rotation59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vector3D12);
        org.junit.Assert.assertNotNull(vector3D19);
        org.junit.Assert.assertNotNull(vector3D27);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(vector3D41);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertNotNull(rotation49);
        org.junit.Assert.assertNotNull(vector3D50);
        org.junit.Assert.assertNotNull(vector3D54);
        org.junit.Assert.assertNotNull(vector3D57);
        org.junit.Assert.assertNotNull(rotation58);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D28 = rotation27.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D35 = rotation34.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation36 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D28, vector3D35);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D43 = rotation42.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D50 = rotation49.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D43, vector3D50);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D13, vector3D21, vector3D35, vector3D50);
        double double53 = rotation52.getQ1();
        double double54 = rotation52.getQ2();
        double[][] doubleArray55 = rotation52.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation61 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D62 = rotation61.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation63 = rotation52.applyTo(rotation61);
        double double64 = rotation61.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder65 = null;
        double[] doubleArray66 = rotation61.getAngles(rotationOrder65);
        double[][] doubleArray67 = rotation61.getMatrix();
        double double68 = rotation61.getQ2();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertNotNull(vector3D28);
        org.junit.Assert.assertNotNull(vector3D35);
        org.junit.Assert.assertNotNull(vector3D43);
        org.junit.Assert.assertNotNull(vector3D50);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertNotNull(vector3D62);
        org.junit.Assert.assertNotNull(rotation63);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[2.356194490192345, 0.0543794248094174, -2.356194490192345]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.01922366120271981d + "'", double68 == 0.01922366120271981d);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation19 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D20 = rotation19.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation21 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D13, vector3D20);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation23 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D13, (double) 100L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D36 = rotation35.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D43 = rotation42.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D36, vector3D43);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D45 = rotation29.applyTo(vector3D36);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D52 = rotation51.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D59 = rotation58.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation65 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D66 = rotation65.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation67 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D59, vector3D66);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation69 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D59, (double) 100L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation70 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D52, vector3D59);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation76 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D77 = rotation76.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation78 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D13, vector3D45, vector3D59, vector3D77);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation80 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D59, (double) 1.0f);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D81 = rotation5.applyInverseTo(vector3D59);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation83 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D81, 10.0d);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D84 = rotation83.getAxis();
        double double85 = rotation83.getAngle();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D20);
        org.junit.Assert.assertNotNull(vector3D36);
        org.junit.Assert.assertNotNull(vector3D43);
        org.junit.Assert.assertNotNull(vector3D45);
        org.junit.Assert.assertNotNull(vector3D52);
        org.junit.Assert.assertNotNull(vector3D59);
        org.junit.Assert.assertNotNull(vector3D66);
        org.junit.Assert.assertNotNull(vector3D77);
        org.junit.Assert.assertNotNull(vector3D81);
        org.junit.Assert.assertNotNull(vector3D84);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 2.566370614359173d + "'", double85 == 2.566370614359173d);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D28 = rotation27.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D21, vector3D28);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation30 = rotation14.applyTo(rotation29);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation36 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 10, 0.0d, (double) (byte) 0, 10.0d, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation37 = rotation14.applyTo(rotation36);
        double double38 = rotation14.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D45 = rotation44.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double52 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation44, rotation51);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D59 = rotation58.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation65 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D66 = rotation65.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation67 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D59, vector3D66);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation73 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation74 = rotation67.applyInverseTo(rotation73);
        double double75 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation51, rotation67);
        double double76 = rotation67.getQ3();
        double double77 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation14, rotation67);
        double double78 = rotation67.getQ2();
        java.lang.Class<?> wildcardClass79 = rotation67.getClass();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertNotNull(vector3D28);
        org.junit.Assert.assertNotNull(rotation30);
        org.junit.Assert.assertNotNull(rotation37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(vector3D45);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertNotNull(vector3D59);
        org.junit.Assert.assertNotNull(vector3D66);
        org.junit.Assert.assertNotNull(rotation74);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 3.141592653589793d + "'", double75 == 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.0d + "'", double77 == 0.0d);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.0d + "'", double78 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double13 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation5, rotation12);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation19 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D20 = rotation19.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double27 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation19, rotation26);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = rotation12.applyInverseTo(rotation19);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation40 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation46 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D47 = rotation46.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation53 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D54 = rotation53.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation55 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D47, vector3D54);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D56 = rotation40.applyTo(vector3D47);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D57 = rotation34.applyTo(vector3D56);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = rotation28.applyTo(rotation34);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = rotation28.revert();
        double[][] doubleArray60 = rotation28.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D61 = rotation28.getAxis();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(vector3D20);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(rotation28);
        org.junit.Assert.assertNotNull(vector3D47);
        org.junit.Assert.assertNotNull(vector3D54);
        org.junit.Assert.assertNotNull(vector3D56);
        org.junit.Assert.assertNotNull(vector3D57);
        org.junit.Assert.assertNotNull(rotation58);
        org.junit.Assert.assertNotNull(rotation59);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertNotNull(vector3D61);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) 0, 100.0d, (double) (short) 100, false);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation19 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double20 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation12, rotation19);
        double double21 = rotation19.getAngle();
        double double22 = rotation19.getAngle();
        double double23 = rotation19.getQ0();
        double double24 = rotation19.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation30 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D31 = rotation30.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation37 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D38 = rotation37.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation39 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D31, vector3D38);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation41 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D31, (double) 100L);
        double double42 = rotation41.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation43 = rotation41.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        double double50 = rotation49.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = rotation43.applyInverseTo(rotation49);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D52 = rotation49.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D53 = rotation19.applyInverseTo(vector3D52);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D54 = rotation5.applyTo(vector3D53);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D55 = rotation5.getAxis();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 3.141592653589793d + "'", double21 == 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 3.141592653589793d + "'", double22 == 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(vector3D31);
        org.junit.Assert.assertNotNull(vector3D38);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-0.0d) + "'", double42 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation43);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertNotNull(rotation51);
        org.junit.Assert.assertNotNull(vector3D52);
        org.junit.Assert.assertNotNull(vector3D53);
        org.junit.Assert.assertNotNull(vector3D54);
        org.junit.Assert.assertNotNull(vector3D55);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D12 = rotation11.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation18 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D19 = rotation18.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D12, vector3D19);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation22 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D12, (double) 100L);
        double double23 = rotation22.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation24 = rotation5.applyInverseTo(rotation22);
        double double25 = rotation5.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D26 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D26, (double) 10.0f);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation30 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D26, 2.7755575615628914E-17d);
        double[][] doubleArray31 = rotation30.getMatrix();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.geometry.euclidean.threed.Rotation rotation33 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray31, (-0.9707361041235048d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.geometry.euclidean.threed.NotARotationMatrixException; message: unable to orthogonalize matrix in 10 iterations");
        } catch (org.apache.commons.math.geometry.euclidean.threed.NotARotationMatrixException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vector3D12);
        org.junit.Assert.assertNotNull(vector3D19);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-0.0d) + "'", double23 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertNotNull(vector3D26);
        org.junit.Assert.assertNotNull(doubleArray31);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation16 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, (double) 100L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation22 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D29 = rotation28.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D36 = rotation35.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation37 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D29, vector3D36);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D38 = rotation22.applyTo(vector3D29);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D45 = rotation44.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D52 = rotation51.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D59 = rotation58.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation60 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D52, vector3D59);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation62 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D52, (double) 100L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation63 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D45, vector3D52);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation69 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D70 = rotation69.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation71 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D38, vector3D52, vector3D70);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation73 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, (double) (short) -1);
        double double74 = rotation73.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder75 = null;
        double[] doubleArray76 = rotation73.getAngles(rotationOrder75);
        double double77 = rotation73.getAngle();
        double double78 = rotation73.getQ2();
        double double79 = rotation73.getQ0();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D29);
        org.junit.Assert.assertNotNull(vector3D36);
        org.junit.Assert.assertNotNull(vector3D38);
        org.junit.Assert.assertNotNull(vector3D45);
        org.junit.Assert.assertNotNull(vector3D52);
        org.junit.Assert.assertNotNull(vector3D59);
        org.junit.Assert.assertNotNull(vector3D70);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + (-0.33900504942104487d) + "'", double74 == (-0.33900504942104487d));
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[-0.7853981633974483, 0.9999999999999999, 0.7853981633974483]");
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 1.0d + "'", double77 == 1.0d);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + (-0.33900504942104487d) + "'", double78 == (-0.33900504942104487d));
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.8775825618903728d + "'", double79 == 0.8775825618903728d);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double13 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation5, rotation12);
        double double14 = rotation12.getAngle();
        double double15 = rotation12.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D16 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D17 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation18 = rotation12.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation24 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D25 = rotation24.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation31 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double32 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation24, rotation31);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation38 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D39 = rotation38.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation45 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double46 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation38, rotation45);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation47 = rotation31.applyInverseTo(rotation38);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation53 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D54 = rotation53.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation60 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D61 = rotation60.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation62 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D54, vector3D61);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation64 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D54, (double) 1L);
        double double65 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation38, rotation64);
        double double66 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation18, rotation38);
        double[][] doubleArray67 = rotation18.getMatrix();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.141592653589793d + "'", double14 == 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 3.141592653589793d + "'", double15 == 3.141592653589793d);
        org.junit.Assert.assertNotNull(vector3D16);
        org.junit.Assert.assertNotNull(vector3D17);
        org.junit.Assert.assertNotNull(rotation18);
        org.junit.Assert.assertNotNull(vector3D25);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertNotNull(vector3D39);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertNotNull(rotation47);
        org.junit.Assert.assertNotNull(vector3D54);
        org.junit.Assert.assertNotNull(vector3D61);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.9456205751905904d + "'", double65 == 0.9456205751905904d);
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertNotNull(doubleArray67);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.8775825618903728d, (double) 10.0f, (double) (byte) 10, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        double double7 = rotation5.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder8 = null;
        double[] doubleArray9 = rotation5.getAngles(rotationOrder8);
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder10 = null;
        double[] doubleArray11 = rotation5.getAngles(rotationOrder10);
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[2.356194490192345, 3.017642674795779, -2.356194490192345]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[2.356194490192345, 3.017642674795779, -2.356194490192345]");
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.geometry.euclidean.threed.Rotation rotation4 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(rotationOrder0, 0.054379424809409445d, (double) 0L, 0.4293897276747127d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-0.06415703545444096d), (-108.9963038254143d), (double) 0L, (double) ' ', false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation6 = rotation5.revert();
        double double7 = rotation6.getQ3();
        double double8 = rotation6.getQ3();
        double double9 = rotation6.getQ3();
        org.junit.Assert.assertNotNull(rotation6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 32.0d + "'", double8 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation21 = rotation14.applyInverseTo(rotation20);
        double double22 = rotation14.getQ2();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D29 = rotation28.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D36 = rotation35.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation37 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D29, vector3D36);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation43 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D44 = rotation43.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation50 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D51 = rotation50.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D44, vector3D51);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation53 = rotation37.applyTo(rotation52);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 10, 0.0d, (double) (byte) 0, 10.0d, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation60 = rotation37.applyTo(rotation59);
        double double61 = rotation59.getAngle();
        double double62 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation14, rotation59);
        java.lang.Class<?> wildcardClass63 = rotation14.getClass();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(rotation21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(vector3D29);
        org.junit.Assert.assertNotNull(vector3D36);
        org.junit.Assert.assertNotNull(vector3D44);
        org.junit.Assert.assertNotNull(vector3D51);
        org.junit.Assert.assertNotNull(rotation53);
        org.junit.Assert.assertNotNull(rotation60);
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D28 = rotation27.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D21, vector3D28);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D36 = rotation35.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D43 = rotation42.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D36, vector3D43);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation45 = rotation29.applyTo(rotation44);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation46 = rotation14.applyTo(rotation45);
        double double47 = rotation14.getQ3();
        double[][] doubleArray48 = rotation14.getMatrix();
        double double49 = rotation14.getQ1();
        double double50 = rotation14.getQ0();
        double double51 = rotation14.getQ3();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertNotNull(vector3D28);
        org.junit.Assert.assertNotNull(vector3D36);
        org.junit.Assert.assertNotNull(vector3D43);
        org.junit.Assert.assertNotNull(rotation45);
        org.junit.Assert.assertNotNull(rotation46);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 1.0d + "'", double50 == 1.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.geometry.euclidean.threed.Rotation rotation4 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(rotationOrder0, (double) 0.0f, 0.7739829449345762d, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(17.66239947251099d, 28.016837073341897d, (double) 100, Double.NaN, false);
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder6 = null;
        double[] doubleArray7 = rotation5.getAngles(rotationOrder6);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation13 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D14 = rotation13.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation22 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D14, vector3D21);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D29 = rotation28.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D36 = rotation35.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation37 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D29, vector3D36);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation38 = rotation22.applyTo(rotation37);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 10, 0.0d, (double) (byte) 0, 10.0d, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation45 = rotation22.applyTo(rotation44);
        double double46 = rotation22.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D59 = rotation58.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation65 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D66 = rotation65.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation67 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D59, vector3D66);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation69 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D59, (double) 100L);
        double double70 = rotation69.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation71 = rotation52.applyInverseTo(rotation69);
        double double72 = rotation52.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D73 = rotation52.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation75 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D73, 0.33900504942104487d);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D76 = rotation22.applyInverseTo(vector3D73);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D77 = rotation5.applyInverseTo(vector3D76);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation79 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D76, 0.01922366120271981d);
        double double80 = rotation79.getAngle();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[NaN, NaN, NaN]");
        org.junit.Assert.assertNotNull(vector3D14);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertNotNull(vector3D29);
        org.junit.Assert.assertNotNull(vector3D36);
        org.junit.Assert.assertNotNull(rotation38);
        org.junit.Assert.assertNotNull(rotation45);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertNotNull(vector3D59);
        org.junit.Assert.assertNotNull(vector3D66);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + (-0.0d) + "'", double70 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation71);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 1.0d + "'", double72 == 1.0d);
        org.junit.Assert.assertNotNull(vector3D73);
        org.junit.Assert.assertNotNull(vector3D76);
        org.junit.Assert.assertNotNull(vector3D77);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 0.019223661202719813d + "'", double80 == 0.019223661202719813d);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(116.90457705856772d, (-0.5d), 17.66239947251099d, 0.047917108096983706d, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D12 = rotation11.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation18 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double19 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation11, rotation18);
        double double20 = rotation18.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D27 = rotation26.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation33 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D34 = rotation33.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D27, vector3D34);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation41 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D42 = rotation41.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation48 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D49 = rotation48.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation50 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D42, vector3D49);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = rotation35.applyTo(rotation50);
        double double52 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation18, rotation51);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D59 = rotation58.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation65 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double66 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation58, rotation65);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation72 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D73 = rotation72.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation79 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double80 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation72, rotation79);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation81 = rotation65.applyInverseTo(rotation72);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation82 = rotation18.applyInverseTo(rotation72);
        double double83 = rotation72.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder84 = null;
        double[] doubleArray85 = rotation72.getAngles(rotationOrder84);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D86 = rotation72.getAxis();
        double double87 = rotation72.getQ2();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation88 = rotation5.applyInverseTo(rotation72);
        double double89 = rotation72.getQ1();
        java.lang.Class<?> wildcardClass90 = rotation72.getClass();
        org.junit.Assert.assertNotNull(vector3D12);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 3.141592653589793d + "'", double20 == 3.141592653589793d);
        org.junit.Assert.assertNotNull(vector3D27);
        org.junit.Assert.assertNotNull(vector3D34);
        org.junit.Assert.assertNotNull(vector3D42);
        org.junit.Assert.assertNotNull(vector3D49);
        org.junit.Assert.assertNotNull(rotation51);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 3.141592653589793d + "'", double52 == 3.141592653589793d);
        org.junit.Assert.assertNotNull(vector3D59);
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertNotNull(vector3D73);
        org.junit.Assert.assertTrue(Double.isNaN(double80));
        org.junit.Assert.assertNotNull(rotation81);
        org.junit.Assert.assertNotNull(rotation82);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 0.01922366120271981d + "'", double83 == 0.01922366120271981d);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[2.356194490192345, 0.0543794248094174, -2.356194490192345]");
        org.junit.Assert.assertNotNull(vector3D86);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 0.01922366120271981d + "'", double87 == 0.01922366120271981d);
        org.junit.Assert.assertNotNull(rotation88);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 0.01922366120271981d + "'", double89 == 0.01922366120271981d);
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D28 = rotation27.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D21, vector3D28);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D36 = rotation35.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D43 = rotation42.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D36, vector3D43);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation45 = rotation29.applyTo(rotation44);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation46 = rotation14.applyTo(rotation45);
        double[][] doubleArray47 = rotation46.getMatrix();
        double double48 = rotation46.getQ1();
        double[][] doubleArray49 = rotation46.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray49, (double) 100L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation53 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray49, (double) 0);
        double[][] doubleArray54 = rotation53.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation56 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray54, 6.052676660945175d);
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertNotNull(vector3D28);
        org.junit.Assert.assertNotNull(vector3D36);
        org.junit.Assert.assertNotNull(vector3D43);
        org.junit.Assert.assertNotNull(rotation45);
        org.junit.Assert.assertNotNull(rotation46);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertNotNull(doubleArray54);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0019129169749405736d, (-0.009949438965141721d), 0.7881701093115122d, 97.0d, false);
        double double6 = rotation5.getQ3();
        double double7 = rotation5.getAngle();
        double double8 = rotation5.getAngle();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 3.137766817306627d + "'", double7 == 3.137766817306627d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.137766817306627d + "'", double8 == 3.137766817306627d);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-0.33900504942104487d), (double) 100.0f, (double) 10L, 3.1216925665368036d, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D12 = rotation11.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation18 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D19 = rotation18.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D12, vector3D19);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D27 = rotation26.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation33 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double34 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation26, rotation33);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation40 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D41 = rotation40.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation47 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double48 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation40, rotation47);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = rotation33.applyInverseTo(rotation40);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D50 = rotation49.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D12, vector3D50);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation53 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D12, 3.082566122054968d);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D54 = rotation5.applyInverseTo(vector3D12);
        double double55 = rotation5.getAngle();
        org.junit.Assert.assertNotNull(vector3D12);
        org.junit.Assert.assertNotNull(vector3D19);
        org.junit.Assert.assertNotNull(vector3D27);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(vector3D41);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertNotNull(rotation49);
        org.junit.Assert.assertNotNull(vector3D50);
        org.junit.Assert.assertNotNull(vector3D54);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 3.1348494788015624d + "'", double55 == 3.1348494788015624d);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double13 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation5, rotation12);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation19 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D20 = rotation19.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double27 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation19, rotation26);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = rotation12.applyInverseTo(rotation19);
        double double29 = rotation12.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation30 = rotation12.revert();
        double double31 = rotation30.getQ1();
        double[][] doubleArray32 = rotation30.getMatrix();
        double double33 = rotation30.getQ2();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(vector3D20);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(rotation28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
        org.junit.Assert.assertNotNull(rotation30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1.0d) + "'", double33 == (-1.0d));
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (-1), 0.5309649148733836d, (double) (-1), (double) 1, true);
        double[][] doubleArray6 = rotation5.getMatrix();
        double double7 = rotation5.getQ0();
        double double8 = rotation5.getQ2();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D15 = rotation14.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation21 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double22 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation14, rotation21);
        double double23 = rotation21.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D30 = rotation29.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation36 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double37 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation29, rotation36);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation43 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D44 = rotation43.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation50 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D51 = rotation50.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D44, vector3D51);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = rotation52.applyInverseTo(rotation58);
        double double60 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation36, rotation52);
        double double61 = rotation52.getQ3();
        double double62 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation21, rotation52);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation68 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100, (double) (byte) -1, (double) (short) 10, 0.9456205751905904d, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation69 = rotation52.applyTo(rotation68);
        double[][] doubleArray70 = rotation69.getMatrix();
        double double71 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation5, rotation69);
        double double72 = rotation69.getAngle();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-0.5519957795875582d) + "'", double7 == (-0.5519957795875582d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.5519957795875582d) + "'", double8 == (-0.5519957795875582d));
        org.junit.Assert.assertNotNull(vector3D15);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertNotNull(vector3D30);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertNotNull(vector3D44);
        org.junit.Assert.assertNotNull(vector3D51);
        org.junit.Assert.assertNotNull(rotation59);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 3.141592653589793d + "'", double60 == 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 3.141592653589793d + "'", double62 == 3.141592653589793d);
        org.junit.Assert.assertNotNull(rotation69);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 1.849966407676733d + "'", double71 == 1.849966407676733d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.20120377604668613d + "'", double72 == 0.20120377604668613d);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) 'a', 0.9985901652033286d, 1.7182776971514875d, false);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        double double7 = rotation5.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation13 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(1.0d, (-0.001227201364295339d), 0.33900504942104487d, 3.7105407653375275d, true);
        double double14 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation5, rotation13);
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7182776971514875d + "'", double7 == 1.7182776971514875d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 1.0f, 100.0d, (-0.009949438965141721d), (double) 1.0f, false);
        double double6 = rotation5.getAngle();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.geometry.euclidean.threed.Rotation rotation4 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(rotationOrder0, (double) 1.0f, 0.9999995049998724d, (-1579.617450290328d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-0.9649660284921133d), (double) (short) 100, 0.0d, (double) 1.0f, false);
        double double6 = rotation5.getAngle();
        double[][] doubleArray7 = rotation5.getMatrix();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(doubleArray7);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D28 = rotation27.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D35 = rotation34.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation36 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D28, vector3D35);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D43 = rotation42.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D50 = rotation49.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D43, vector3D50);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D13, vector3D21, vector3D35, vector3D50);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation54 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D21, (double) 1);
        double double55 = rotation54.getQ1();
        double double56 = rotation54.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D57 = rotation54.getAxis();
        double double58 = rotation54.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder59 = null;
        double[] doubleArray60 = rotation54.getAngles(rotationOrder59);
        java.lang.Class<?> wildcardClass61 = rotation54.getClass();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertNotNull(vector3D28);
        org.junit.Assert.assertNotNull(vector3D35);
        org.junit.Assert.assertNotNull(vector3D43);
        org.junit.Assert.assertNotNull(vector3D50);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.33900504942104487d + "'", double55 == 0.33900504942104487d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.33900504942104487d + "'", double56 == 0.33900504942104487d);
        org.junit.Assert.assertNotNull(vector3D57);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 1.0d + "'", double58 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[2.356194490192345, 0.9999999999999999, -2.356194490192345]");
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(28.016837073341897d, (double) '4', (double) 10L, 0.0d, true);
        double[][] doubleArray6 = rotation5.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder7 = null;
        double[] doubleArray8 = rotation5.getAngles(rotationOrder7);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.7607846147136124, 2.168295864876348, -1.7607846147136124]");
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.geometry.euclidean.threed.Rotation rotation4 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(rotationOrder0, 3.1216925665368036d, 0.280459243752156d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation16 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, (double) 100L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation22 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D29 = rotation28.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D36 = rotation35.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation37 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D29, vector3D36);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D38 = rotation22.applyTo(vector3D29);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D45 = rotation44.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D52 = rotation51.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D59 = rotation58.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation60 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D52, vector3D59);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation62 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D52, (double) 100L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation63 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D45, vector3D52);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation69 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D70 = rotation69.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation71 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D38, vector3D52, vector3D70);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation73 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D52, (double) 1.0f);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation74 = rotation73.revert();
        double double75 = rotation73.getQ1();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D29);
        org.junit.Assert.assertNotNull(vector3D36);
        org.junit.Assert.assertNotNull(vector3D38);
        org.junit.Assert.assertNotNull(vector3D45);
        org.junit.Assert.assertNotNull(vector3D52);
        org.junit.Assert.assertNotNull(vector3D59);
        org.junit.Assert.assertNotNull(vector3D70);
        org.junit.Assert.assertNotNull(rotation74);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.33900504942104487d + "'", double75 == 0.33900504942104487d);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation0 = org.apache.commons.math.geometry.euclidean.threed.Rotation.IDENTITY;
        double double1 = rotation0.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation2 = rotation0.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation8 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D9 = rotation8.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation15 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D16 = rotation15.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation17 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D9, vector3D16);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation19 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D9, (double) 1L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation25 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D26 = rotation25.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation32 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D33 = rotation32.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D26, vector3D33);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation40 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D41 = rotation40.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation47 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D48 = rotation47.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation54 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D55 = rotation54.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation56 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D48, vector3D55);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation62 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D63 = rotation62.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation69 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D70 = rotation69.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation71 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D63, vector3D70);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation72 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D33, vector3D41, vector3D55, vector3D70);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation73 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D9, vector3D55);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D74 = rotation0.applyInverseTo(vector3D55);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation76 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D74, (double) (byte) 1);
        java.lang.Class<?> wildcardClass77 = vector3D74.getClass();
        org.junit.Assert.assertNotNull(rotation0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(rotation2);
        org.junit.Assert.assertNotNull(vector3D9);
        org.junit.Assert.assertNotNull(vector3D16);
        org.junit.Assert.assertNotNull(vector3D26);
        org.junit.Assert.assertNotNull(vector3D33);
        org.junit.Assert.assertNotNull(vector3D41);
        org.junit.Assert.assertNotNull(vector3D48);
        org.junit.Assert.assertNotNull(vector3D55);
        org.junit.Assert.assertNotNull(vector3D63);
        org.junit.Assert.assertNotNull(vector3D70);
        org.junit.Assert.assertNotNull(vector3D74);
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double13 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation5, rotation12);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation19 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D20 = rotation19.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double27 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation19, rotation26);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = rotation12.applyInverseTo(rotation19);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D35 = rotation34.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation41 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D42 = rotation41.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation43 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D35, vector3D42);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation45 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D35, (double) 1L);
        double double46 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation19, rotation45);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation47 = rotation19.revert();
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder48 = null;
        double[] doubleArray49 = rotation19.getAngles(rotationOrder48);
        double double50 = rotation19.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = rotation19.revert();
        double double52 = rotation51.getAngle();
        double double53 = rotation51.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation65 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D66 = rotation65.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation72 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D73 = rotation72.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation74 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D66, vector3D73);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D75 = rotation59.applyTo(vector3D66);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D76 = rotation51.applyTo(vector3D66);
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(vector3D20);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(rotation28);
        org.junit.Assert.assertNotNull(vector3D35);
        org.junit.Assert.assertNotNull(vector3D42);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.9456205751905904d + "'", double46 == 0.9456205751905904d);
        org.junit.Assert.assertNotNull(rotation47);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[2.356194490192345, 0.0543794248094174, -2.356194490192345]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.054379424809409445d + "'", double50 == 0.054379424809409445d);
        org.junit.Assert.assertNotNull(rotation51);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.054379424809409445d + "'", double52 == 0.054379424809409445d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-0.9996303825414301d) + "'", double53 == (-0.9996303825414301d));
        org.junit.Assert.assertNotNull(vector3D66);
        org.junit.Assert.assertNotNull(vector3D73);
        org.junit.Assert.assertNotNull(vector3D75);
        org.junit.Assert.assertNotNull(vector3D76);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-0.33900504942104487d), 0.8890808091523411d, (-0.20557451782484024d), 0.0d, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.09949879346007118d, (-0.0d), (double) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation17 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D18 = rotation17.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation24 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D25 = rotation24.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D18, vector3D25);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation32 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation33 = rotation26.applyInverseTo(rotation32);
        double double34 = rotation32.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = rotation11.applyInverseTo(rotation32);
        double double36 = rotation35.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation37 = rotation5.applyTo(rotation35);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation43 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D44 = rotation43.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation50 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D51 = rotation50.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation57 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D58 = rotation57.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D51, vector3D58);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation61 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D51, (double) 100L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation62 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D44, vector3D51);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation64 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D44, 0.0d);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation66 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D44, 0.7368621407866713d);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D67 = rotation37.applyInverseTo(vector3D44);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation69 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D44, (-5.7519881927834584E-5d));
        double double70 = rotation69.getAngle();
        org.junit.Assert.assertNotNull(vector3D18);
        org.junit.Assert.assertNotNull(vector3D25);
        org.junit.Assert.assertNotNull(rotation33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 3.141592653589793d + "'", double34 == 3.141592653589793d);
        org.junit.Assert.assertNotNull(rotation35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 9.999000062556641d + "'", double36 == 9.999000062556641d);
        org.junit.Assert.assertNotNull(rotation37);
        org.junit.Assert.assertNotNull(vector3D44);
        org.junit.Assert.assertNotNull(vector3D51);
        org.junit.Assert.assertNotNull(vector3D58);
        org.junit.Assert.assertNotNull(vector3D67);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 5.751988192783459E-5d + "'", double70 == 5.751988192783459E-5d);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D28 = rotation27.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D35 = rotation34.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation36 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D28, vector3D35);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D43 = rotation42.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D50 = rotation49.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D43, vector3D50);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D13, vector3D21, vector3D35, vector3D50);
        double double53 = rotation52.getQ3();
        double double54 = rotation52.getQ0();
        double double55 = rotation52.getQ2();
        double[][] doubleArray56 = rotation52.getMatrix();
        double[][] doubleArray57 = rotation52.getMatrix();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray57, 0.7071067811865476d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.geometry.euclidean.threed.NotARotationMatrixException; message: unable to orthogonalize matrix in 10 iterations");
        } catch (org.apache.commons.math.geometry.euclidean.threed.NotARotationMatrixException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertNotNull(vector3D28);
        org.junit.Assert.assertNotNull(vector3D35);
        org.junit.Assert.assertNotNull(vector3D43);
        org.junit.Assert.assertNotNull(vector3D50);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertNotNull(doubleArray57);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(1.0d, 2.7755575615628914E-17d, (double) (-1), 0.9996303825414301d, true);
        double double6 = rotation5.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation7 = rotation5.revert();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D8 = rotation7.getAxis();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.577207977069365d + "'", double6 == 0.577207977069365d);
        org.junit.Assert.assertNotNull(rotation7);
        org.junit.Assert.assertNotNull(vector3D8);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.geometry.euclidean.threed.Rotation rotation4 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(rotationOrder0, 97.0d, 0.0d, 0.5914138605204349d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation0 = org.apache.commons.math.geometry.euclidean.threed.Rotation.IDENTITY;
        double double1 = rotation0.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation2 = rotation0.revert();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D3 = rotation2.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation9 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D10 = rotation9.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation16 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D17 = rotation16.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation18 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D10, vector3D17);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation24 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D25 = rotation24.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation31 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D32 = rotation31.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation33 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D25, vector3D32);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation39 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D40 = rotation39.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation46 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D47 = rotation46.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation48 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D40, vector3D47);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = rotation33.applyTo(rotation48);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation50 = rotation18.applyTo(rotation49);
        double double51 = rotation50.getAngle();
        double double52 = rotation50.getAngle();
        double double53 = rotation50.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-0.1855270382668764d), (double) 1, Double.NaN, (double) (short) 100, false);
        double double60 = rotation59.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation61 = rotation59.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation67 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D68 = rotation67.getAxis();
        double double69 = rotation67.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D70 = rotation67.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D71 = rotation61.applyInverseTo(vector3D70);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D72 = rotation50.applyInverseTo(vector3D71);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation73 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D3, vector3D71);
        java.lang.Class<?> wildcardClass74 = vector3D71.getClass();
        org.junit.Assert.assertNotNull(rotation0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(rotation2);
        org.junit.Assert.assertNotNull(vector3D3);
        org.junit.Assert.assertNotNull(vector3D10);
        org.junit.Assert.assertNotNull(vector3D17);
        org.junit.Assert.assertNotNull(vector3D25);
        org.junit.Assert.assertNotNull(vector3D32);
        org.junit.Assert.assertNotNull(vector3D40);
        org.junit.Assert.assertNotNull(vector3D47);
        org.junit.Assert.assertNotNull(rotation49);
        org.junit.Assert.assertNotNull(rotation50);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertNotNull(rotation61);
        org.junit.Assert.assertNotNull(vector3D68);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.9996303825414301d + "'", double69 == 0.9996303825414301d);
        org.junit.Assert.assertNotNull(vector3D70);
        org.junit.Assert.assertNotNull(vector3D71);
        org.junit.Assert.assertNotNull(vector3D72);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D28 = rotation27.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D21, vector3D28);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D36 = rotation35.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D43 = rotation42.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D50 = rotation49.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D43, vector3D50);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation57 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D58 = rotation57.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation64 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D65 = rotation64.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation66 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D58, vector3D65);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation67 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D28, vector3D36, vector3D50, vector3D65);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation68 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D50);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation69 = rotation68.revert();
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder70 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray71 = rotation69.getAngles(rotationOrder70);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.geometry.euclidean.threed.CardanEulerSingularityException; message: Euler angles singularity");
        } catch (org.apache.commons.math.geometry.euclidean.threed.CardanEulerSingularityException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertNotNull(vector3D28);
        org.junit.Assert.assertNotNull(vector3D36);
        org.junit.Assert.assertNotNull(vector3D43);
        org.junit.Assert.assertNotNull(vector3D50);
        org.junit.Assert.assertNotNull(vector3D58);
        org.junit.Assert.assertNotNull(vector3D65);
        org.junit.Assert.assertNotNull(rotation69);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D28 = rotation27.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D35 = rotation34.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation36 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D28, vector3D35);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D43 = rotation42.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D50 = rotation49.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D43, vector3D50);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D13, vector3D21, vector3D35, vector3D50);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D59 = rotation58.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation65 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D66 = rotation65.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation67 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D59, vector3D66);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation73 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D74 = rotation73.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation80 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D81 = rotation80.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation82 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D74, vector3D81);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation83 = rotation67.applyTo(rotation82);
        double double84 = rotation83.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation85 = rotation52.applyInverseTo(rotation83);
        double double86 = rotation52.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation92 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, 0.9456205751905904d, (double) 'a', 3.082566122054968d, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation93 = rotation52.applyTo(rotation92);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D94 = rotation93.getAxis();
        double double95 = rotation93.getQ3();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertNotNull(vector3D28);
        org.junit.Assert.assertNotNull(vector3D35);
        org.junit.Assert.assertNotNull(vector3D43);
        org.junit.Assert.assertNotNull(vector3D50);
        org.junit.Assert.assertNotNull(vector3D59);
        org.junit.Assert.assertNotNull(vector3D66);
        org.junit.Assert.assertNotNull(vector3D74);
        org.junit.Assert.assertNotNull(vector3D81);
        org.junit.Assert.assertNotNull(rotation83);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 1.0d + "'", double84 == 1.0d);
        org.junit.Assert.assertNotNull(rotation85);
        org.junit.Assert.assertTrue(Double.isNaN(double86));
        org.junit.Assert.assertNotNull(rotation93);
        org.junit.Assert.assertNotNull(vector3D94);
        org.junit.Assert.assertTrue(Double.isNaN(double95));
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 1L, (-108.9963038254143d), (double) (short) 10, (-1.0d), false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation6 = org.apache.commons.math.geometry.euclidean.threed.Rotation.IDENTITY;
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation7 = rotation5.applyTo(rotation6);
        double double8 = rotation6.getQ3();
        double[][] doubleArray9 = rotation6.getMatrix();
        org.junit.Assert.assertNotNull(rotation6);
        org.junit.Assert.assertNotNull(rotation7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D12 = rotation11.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation18 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D19 = rotation18.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D12, vector3D19);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D27 = rotation26.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation33 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D34 = rotation33.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D27, vector3D34);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation36 = rotation20.applyTo(rotation35);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 10, 0.0d, (double) (byte) 0, 10.0d, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation43 = rotation20.applyTo(rotation42);
        double double44 = rotation20.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation50 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D51 = rotation50.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation57 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double58 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation50, rotation57);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation64 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D65 = rotation64.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation71 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D72 = rotation71.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation73 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D65, vector3D72);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation79 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation80 = rotation73.applyInverseTo(rotation79);
        double double81 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation57, rotation73);
        double double82 = rotation73.getQ3();
        double double83 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation20, rotation73);
        double double84 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation5, rotation20);
        double double85 = rotation5.getAngle();
        double double86 = rotation5.getQ2();
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder87 = null;
        double[] doubleArray88 = rotation5.getAngles(rotationOrder87);
        org.junit.Assert.assertNotNull(vector3D12);
        org.junit.Assert.assertNotNull(vector3D19);
        org.junit.Assert.assertNotNull(vector3D27);
        org.junit.Assert.assertNotNull(vector3D34);
        org.junit.Assert.assertNotNull(rotation36);
        org.junit.Assert.assertNotNull(rotation43);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertNotNull(vector3D51);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertNotNull(vector3D65);
        org.junit.Assert.assertNotNull(vector3D72);
        org.junit.Assert.assertNotNull(rotation80);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 3.141592653589793d + "'", double81 == 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 0.0d + "'", double83 == 0.0d);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 3.1216925665368036d + "'", double84 == 3.1216925665368036d);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 3.1216925665368036d + "'", double85 == 3.1216925665368036d);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 0.9949879346007117d + "'", double86 == 0.9949879346007117d);
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray88), "[-0.09966865249116204, 3.121692566536803, 0.09966865249116204]");
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(2.566370614359173d, (double) (byte) 1, (-0.280459243752156d), (-0.009949438965141721d), true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation17 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D18 = rotation17.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation24 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D25 = rotation24.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D18, vector3D25);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D18, (double) 100L);
        double double29 = rotation28.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation30 = rotation11.applyInverseTo(rotation28);
        double double31 = rotation11.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D32 = rotation11.getAxis();
        double double33 = rotation11.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = rotation11.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = rotation5.applyTo(rotation11);
        org.junit.Assert.assertNotNull(vector3D18);
        org.junit.Assert.assertNotNull(vector3D25);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-0.0d) + "'", double29 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
        org.junit.Assert.assertNotNull(vector3D32);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(rotation34);
        org.junit.Assert.assertNotNull(rotation35);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.geometry.euclidean.threed.Rotation rotation4 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(rotationOrder0, 3.1348494788015624d, 0.3046357671758828d, 0.31538323081891095d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation16 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, (double) 100L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation22 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D29 = rotation28.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D36 = rotation35.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation37 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D29, vector3D36);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D38 = rotation22.applyTo(vector3D29);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D45 = rotation44.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D52 = rotation51.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D59 = rotation58.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation60 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D52, vector3D59);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation62 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D52, (double) 100L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation63 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D45, vector3D52);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation69 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D70 = rotation69.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation71 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D38, vector3D52, vector3D70);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation73 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D38, (-0.0d));
        double double74 = rotation73.getQ1();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D29);
        org.junit.Assert.assertNotNull(vector3D36);
        org.junit.Assert.assertNotNull(vector3D38);
        org.junit.Assert.assertNotNull(vector3D45);
        org.junit.Assert.assertNotNull(vector3D52);
        org.junit.Assert.assertNotNull(vector3D59);
        org.junit.Assert.assertNotNull(vector3D70);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        double double6 = rotation5.getQ2();
        double double7 = rotation5.getQ2();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D8 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation10 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D8, (-0.005755946541407356d));
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation16 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 10, 0.0d, (double) (byte) 0, 10.0d, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation22 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D29 = rotation28.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D36 = rotation35.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation37 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D29, vector3D36);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation39 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D29, (double) 100L);
        double double40 = rotation39.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation41 = rotation22.applyInverseTo(rotation39);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = rotation16.applyInverseTo(rotation39);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation43 = rotation42.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = org.apache.commons.math.geometry.euclidean.threed.Rotation.IDENTITY;
        double double45 = rotation44.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation46 = rotation44.revert();
        double double47 = rotation44.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation53 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D54 = rotation53.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation60 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D61 = rotation60.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation62 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D54, vector3D61);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation68 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D69 = rotation68.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation75 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D76 = rotation75.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation77 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D69, vector3D76);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation83 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D84 = rotation83.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation90 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D91 = rotation90.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation92 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D84, vector3D91);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation93 = rotation77.applyTo(rotation92);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation94 = rotation62.applyTo(rotation93);
        double[][] doubleArray95 = rotation94.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation96 = rotation44.applyInverseTo(rotation94);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation97 = rotation42.applyTo(rotation44);
        double double98 = rotation42.getQ3();
        double double99 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation10, rotation42);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(vector3D8);
        org.junit.Assert.assertNotNull(vector3D29);
        org.junit.Assert.assertNotNull(vector3D36);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-0.0d) + "'", double40 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation41);
        org.junit.Assert.assertNotNull(rotation42);
        org.junit.Assert.assertNotNull(rotation43);
        org.junit.Assert.assertNotNull(rotation44);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertNotNull(rotation46);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertNotNull(vector3D54);
        org.junit.Assert.assertNotNull(vector3D61);
        org.junit.Assert.assertNotNull(vector3D69);
        org.junit.Assert.assertNotNull(vector3D76);
        org.junit.Assert.assertNotNull(vector3D84);
        org.junit.Assert.assertNotNull(vector3D91);
        org.junit.Assert.assertNotNull(rotation93);
        org.junit.Assert.assertNotNull(rotation94);
        org.junit.Assert.assertNotNull(doubleArray95);
        org.junit.Assert.assertNotNull(rotation96);
        org.junit.Assert.assertNotNull(rotation97);
        org.junit.Assert.assertTrue("'" + double98 + "' != '" + 9.649660284921133d + "'", double98 == 9.649660284921133d);
        org.junit.Assert.assertTrue(Double.isNaN(double99));
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D28 = rotation27.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D21, vector3D28);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D36 = rotation35.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D43 = rotation42.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D36, vector3D43);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation45 = rotation29.applyTo(rotation44);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation46 = rotation14.applyTo(rotation45);
        double[][] doubleArray47 = rotation46.getMatrix();
        double[][] doubleArray48 = rotation46.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation50 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray48, (double) (short) 100);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray48, (double) 100);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation54 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray48, 0.9950846276202212d);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation56 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray48, 1.7391742109522712d);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray48, 77.7583719842568d);
        double[][] doubleArray59 = rotation58.getMatrix();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertNotNull(vector3D28);
        org.junit.Assert.assertNotNull(vector3D36);
        org.junit.Assert.assertNotNull(vector3D43);
        org.junit.Assert.assertNotNull(rotation45);
        org.junit.Assert.assertNotNull(rotation46);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertNotNull(doubleArray59);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double13 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation5, rotation12);
        double double14 = rotation12.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double28 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation20, rotation27);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D35 = rotation34.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation41 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double42 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation34, rotation41);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation43 = rotation27.applyInverseTo(rotation34);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = rotation12.applyTo(rotation34);
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder45 = null;
        double[] doubleArray46 = rotation44.getAngles(rotationOrder45);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D53 = rotation52.getAxis();
        double double54 = rotation52.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation55 = rotation44.applyInverseTo(rotation52);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation61 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) 100, 0.33900504942104487d, 0.09949879346007118d, true);
        double double62 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation52, rotation61);
        double[][] doubleArray63 = rotation61.getMatrix();
        double double64 = rotation61.getQ2();
        double double65 = rotation61.getQ0();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.141592653589793d + "'", double14 == 3.141592653589793d);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(vector3D35);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertNotNull(rotation43);
        org.junit.Assert.assertNotNull(rotation44);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-0.31746367442260337, 1.2637009275001716, 3.026886383418824]");
        org.junit.Assert.assertNotNull(vector3D53);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.9996303825414301d + "'", double54 == 0.9996303825414301d);
        org.junit.Assert.assertNotNull(rotation55);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 3.1030128410395363d + "'", double62 == 3.1030128410395363d);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0033900293363519126d + "'", double64 == 0.0033900293363519126d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D28 = rotation27.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D35 = rotation34.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation36 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D28, vector3D35);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D43 = rotation42.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D50 = rotation49.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D43, vector3D50);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D13, vector3D21, vector3D35, vector3D50);
        double double53 = rotation52.getQ1();
        double double54 = rotation52.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation60 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-0.1855270382668764d), (double) 10, (double) (short) -1, (double) 100.0f, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation61 = rotation60.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation62 = rotation52.applyInverseTo(rotation60);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D63 = rotation62.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation65 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D63, (double) '4');
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation67 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D63, (double) 10L);
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertNotNull(vector3D28);
        org.junit.Assert.assertNotNull(vector3D35);
        org.junit.Assert.assertNotNull(vector3D43);
        org.junit.Assert.assertNotNull(vector3D50);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertNotNull(rotation61);
        org.junit.Assert.assertNotNull(rotation62);
        org.junit.Assert.assertNotNull(vector3D63);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.9456205751905904d, (double) 1, (double) ' ', 0.9996303825414301d, true);
        double double6 = rotation5.getQ2();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation7 = rotation5.revert();
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder8 = null;
        double[] doubleArray9 = rotation5.getAngles(rotationOrder8);
        java.lang.Class<?> wildcardClass10 = rotation5.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9985901652033286d + "'", double6 == 0.9985901652033286d);
        org.junit.Assert.assertNotNull(rotation7);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[2.297196832013673, 3.0556855990621923, 2.35967649887421]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 10, 0.0d, (double) (byte) 0, 10.0d, false);
        double[][] doubleArray6 = rotation5.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation19 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D20 = rotation19.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation21 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D13, vector3D20);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D28 = rotation27.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D35 = rotation34.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation36 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D28, vector3D35);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D43 = rotation42.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D50 = rotation49.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D43, vector3D50);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = rotation36.applyTo(rotation51);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation53 = rotation21.applyTo(rotation52);
        double[][] doubleArray54 = rotation53.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation56 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray54, (double) 10);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray54, (double) (byte) 100);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation64 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 10, 0.0d, (double) (byte) 0, 10.0d, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation70 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation76 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D77 = rotation76.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation83 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D84 = rotation83.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation85 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D77, vector3D84);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation87 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D77, (double) 100L);
        double double88 = rotation87.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation89 = rotation70.applyInverseTo(rotation87);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation90 = rotation64.applyInverseTo(rotation87);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation91 = rotation58.applyInverseTo(rotation64);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation92 = rotation64.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation93 = rotation5.applyTo(rotation64);
        double double94 = rotation93.getQ0();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D20);
        org.junit.Assert.assertNotNull(vector3D28);
        org.junit.Assert.assertNotNull(vector3D35);
        org.junit.Assert.assertNotNull(vector3D43);
        org.junit.Assert.assertNotNull(vector3D50);
        org.junit.Assert.assertNotNull(rotation52);
        org.junit.Assert.assertNotNull(rotation53);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertNotNull(vector3D77);
        org.junit.Assert.assertNotNull(vector3D84);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + (-0.0d) + "'", double88 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation89);
        org.junit.Assert.assertNotNull(rotation90);
        org.junit.Assert.assertNotNull(rotation91);
        org.junit.Assert.assertNotNull(rotation92);
        org.junit.Assert.assertNotNull(rotation93);
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 0.0d + "'", double94 == 0.0d);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation16 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, (double) 1L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation22 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D23 = rotation22.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D30 = rotation29.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation31 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D23, vector3D30);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation37 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D38 = rotation37.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D45 = rotation44.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D52 = rotation51.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation53 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D45, vector3D52);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D60 = rotation59.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation66 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D67 = rotation66.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation68 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D60, vector3D67);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation69 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D30, vector3D38, vector3D52, vector3D67);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation70 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D52);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation72 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, (double) 1L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation74 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, (-116.90457705856772d));
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation76 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, (double) 10);
        double double77 = rotation76.getQ3();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D23);
        org.junit.Assert.assertNotNull(vector3D30);
        org.junit.Assert.assertNotNull(vector3D38);
        org.junit.Assert.assertNotNull(vector3D45);
        org.junit.Assert.assertNotNull(vector3D52);
        org.junit.Assert.assertNotNull(vector3D60);
        org.junit.Assert.assertNotNull(vector3D67);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + (-0.0d) + "'", double77 == (-0.0d));
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-0.11924330679564402d), (-0.004923674848035068d), 0.06415703545444096d, 0.28366218546322625d, true);
        double double6 = rotation5.getAngle();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.363473904283164d + "'", double6 == 2.363473904283164d);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double13 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation5, rotation12);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation19 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D20 = rotation19.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D27 = rotation26.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D20, vector3D27);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = rotation28.applyInverseTo(rotation34);
        double double36 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation12, rotation28);
        double double37 = rotation28.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation43 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D44 = rotation43.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation50 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double51 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation43, rotation50);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation57 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D58 = rotation57.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation64 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double65 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation57, rotation64);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation66 = rotation50.applyInverseTo(rotation57);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation72 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation78 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation84 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D85 = rotation84.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation91 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D92 = rotation91.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation93 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D85, vector3D92);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D94 = rotation78.applyTo(vector3D85);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D95 = rotation72.applyTo(vector3D94);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation96 = rotation66.applyTo(rotation72);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation97 = rotation66.revert();
        double double98 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation28, rotation97);
        double double99 = rotation28.getQ2();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(vector3D20);
        org.junit.Assert.assertNotNull(vector3D27);
        org.junit.Assert.assertNotNull(rotation35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 3.141592653589793d + "'", double36 == 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(vector3D44);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertNotNull(vector3D58);
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertNotNull(rotation66);
        org.junit.Assert.assertNotNull(vector3D85);
        org.junit.Assert.assertNotNull(vector3D92);
        org.junit.Assert.assertNotNull(vector3D94);
        org.junit.Assert.assertNotNull(vector3D95);
        org.junit.Assert.assertNotNull(rotation96);
        org.junit.Assert.assertNotNull(rotation97);
        org.junit.Assert.assertTrue(Double.isNaN(double98));
        org.junit.Assert.assertTrue("'" + double99 + "' != '" + 0.0d + "'", double99 == 0.0d);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 10, 0.0d, (double) (byte) 0, 10.0d, false);
        double double6 = rotation5.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation19 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D20 = rotation19.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation21 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D13, vector3D20);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D28 = rotation27.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D35 = rotation34.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation41 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D42 = rotation41.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation43 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D35, vector3D42);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D50 = rotation49.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation56 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D57 = rotation56.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D50, vector3D57);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D20, vector3D28, vector3D42, vector3D57);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D60 = rotation5.applyTo(vector3D42);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation62 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D42, 0.7881701093115122d);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation68 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D69 = rotation68.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation75 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D76 = rotation75.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation77 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D69, vector3D76);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation79 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D69, (double) 100L);
        double double80 = rotation79.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation81 = rotation62.applyTo(rotation79);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D82 = rotation62.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder83 = null;
        double[] doubleArray84 = rotation62.getAngles(rotationOrder83);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D20);
        org.junit.Assert.assertNotNull(vector3D28);
        org.junit.Assert.assertNotNull(vector3D35);
        org.junit.Assert.assertNotNull(vector3D42);
        org.junit.Assert.assertNotNull(vector3D50);
        org.junit.Assert.assertNotNull(vector3D57);
        org.junit.Assert.assertNotNull(vector3D60);
        org.junit.Assert.assertNotNull(vector3D69);
        org.junit.Assert.assertNotNull(vector3D76);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + (-0.1855270382668764d) + "'", double80 == (-0.1855270382668764d));
        org.junit.Assert.assertNotNull(rotation81);
        org.junit.Assert.assertNotNull(vector3D82);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[2.356194490192345, 0.788170109311512, -2.356194490192345]");
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D28 = rotation27.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D35 = rotation34.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation36 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D28, vector3D35);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D43 = rotation42.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D50 = rotation49.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D43, vector3D50);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D13, vector3D21, vector3D35, vector3D50);
        double double53 = rotation52.getQ1();
        double double54 = rotation52.getQ2();
        double[][] doubleArray55 = rotation52.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder56 = null;
        double[] doubleArray57 = rotation52.getAngles(rotationOrder56);
        double double58 = rotation52.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation64 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 10, 0.0d, (double) (byte) 0, 10.0d, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation70 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation76 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D77 = rotation76.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation83 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D84 = rotation83.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation85 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D77, vector3D84);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation87 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D77, (double) 100L);
        double double88 = rotation87.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation89 = rotation70.applyInverseTo(rotation87);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation90 = rotation64.applyInverseTo(rotation87);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation91 = rotation90.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation92 = rotation52.applyInverseTo(rotation91);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D93 = rotation92.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation95 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D93, 0.9028084065328048d);
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertNotNull(vector3D28);
        org.junit.Assert.assertNotNull(vector3D35);
        org.junit.Assert.assertNotNull(vector3D43);
        org.junit.Assert.assertNotNull(vector3D50);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[NaN, NaN, NaN]");
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertNotNull(vector3D77);
        org.junit.Assert.assertNotNull(vector3D84);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + (-0.0d) + "'", double88 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation89);
        org.junit.Assert.assertNotNull(rotation90);
        org.junit.Assert.assertNotNull(rotation91);
        org.junit.Assert.assertNotNull(rotation92);
        org.junit.Assert.assertNotNull(vector3D93);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.geometry.euclidean.threed.Rotation rotation4 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(rotationOrder0, 14.405497554001874d, 0.33889036157706476d, (-0.5322022524502927d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation16 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, (double) 100L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation22 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D29 = rotation28.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D36 = rotation35.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation37 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D29, vector3D36);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D38 = rotation22.applyTo(vector3D29);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D45 = rotation44.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D52 = rotation51.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D59 = rotation58.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation60 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D52, vector3D59);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation62 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D52, (double) 100L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation63 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D45, vector3D52);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation69 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D70 = rotation69.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation71 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D38, vector3D52, vector3D70);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation73 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D52, (double) 1.0f);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation74 = rotation73.revert();
        double double75 = rotation73.getQ3();
        double[][] doubleArray76 = rotation73.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation78 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray76, 0.9996303825414301d);
        double double79 = rotation78.getQ3();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D29);
        org.junit.Assert.assertNotNull(vector3D36);
        org.junit.Assert.assertNotNull(vector3D38);
        org.junit.Assert.assertNotNull(vector3D45);
        org.junit.Assert.assertNotNull(vector3D52);
        org.junit.Assert.assertNotNull(vector3D59);
        org.junit.Assert.assertNotNull(vector3D70);
        org.junit.Assert.assertNotNull(rotation74);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.0d + "'", double75 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.0d + "'", double79 == 0.0d);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, 2.566370614359173d, 1.233771398170623d, 0.280459243752156d, false);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double13 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation5, rotation12);
        double double14 = rotation12.getAngle();
        double double15 = rotation12.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D16 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation22 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D23 = rotation22.getAxis();
        double double24 = rotation22.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D25 = rotation22.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D16, vector3D25);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D27 = rotation26.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D27, 0.0d);
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.141592653589793d + "'", double14 == 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 3.141592653589793d + "'", double15 == 3.141592653589793d);
        org.junit.Assert.assertNotNull(vector3D16);
        org.junit.Assert.assertNotNull(vector3D23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.9996303825414301d + "'", double24 == 0.9996303825414301d);
        org.junit.Assert.assertNotNull(vector3D25);
        org.junit.Assert.assertNotNull(vector3D27);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double13 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation5, rotation12);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation19 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D20 = rotation19.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double27 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation19, rotation26);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = rotation12.applyInverseTo(rotation19);
        double double29 = rotation28.getQ1();
        double double30 = rotation28.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder31 = null;
        double[] doubleArray32 = rotation28.getAngles(rotationOrder31);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation38 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation50 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D51 = rotation50.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation57 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D58 = rotation57.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D51, vector3D58);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D60 = rotation44.applyTo(vector3D51);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D61 = rotation38.applyTo(vector3D60);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation63 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D60, (double) 1.0f);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D64 = rotation28.applyTo(vector3D60);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation70 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D71 = rotation70.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation77 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D78 = rotation77.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation84 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D85 = rotation84.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation86 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D78, vector3D85);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation88 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D78, (double) 100L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation89 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D71, vector3D78);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation90 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D64, vector3D78);
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(vector3D20);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(rotation28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.015527486617021d + "'", double29 == 10.015527486617021d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.7881701093115122d + "'", double30 == 0.7881701093115122d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-0.31746367442260337, 1.2637009275001716, 3.026886383418824]");
        org.junit.Assert.assertNotNull(vector3D51);
        org.junit.Assert.assertNotNull(vector3D58);
        org.junit.Assert.assertNotNull(vector3D60);
        org.junit.Assert.assertNotNull(vector3D61);
        org.junit.Assert.assertNotNull(vector3D64);
        org.junit.Assert.assertNotNull(vector3D71);
        org.junit.Assert.assertNotNull(vector3D78);
        org.junit.Assert.assertNotNull(vector3D85);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D28 = rotation27.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D35 = rotation34.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation36 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D28, vector3D35);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D43 = rotation42.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D50 = rotation49.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D43, vector3D50);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D13, vector3D21, vector3D35, vector3D50);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation54 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D21, (double) 1);
        double double55 = rotation54.getQ1();
        double double56 = rotation54.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D57 = rotation54.getAxis();
        double double58 = rotation54.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder59 = null;
        double[] doubleArray60 = rotation54.getAngles(rotationOrder59);
        double double61 = rotation54.getQ2();
        double double62 = rotation54.getQ2();
        double double63 = rotation54.getQ2();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertNotNull(vector3D28);
        org.junit.Assert.assertNotNull(vector3D35);
        org.junit.Assert.assertNotNull(vector3D43);
        org.junit.Assert.assertNotNull(vector3D50);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.33900504942104487d + "'", double55 == 0.33900504942104487d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.33900504942104487d + "'", double56 == 0.33900504942104487d);
        org.junit.Assert.assertNotNull(vector3D57);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 1.0d + "'", double58 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[2.356194490192345, 0.9999999999999999, -2.356194490192345]");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.33900504942104487d + "'", double61 == 0.33900504942104487d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.33900504942104487d + "'", double62 == 0.33900504942104487d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.33900504942104487d + "'", double63 == 0.33900504942104487d);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D28 = rotation27.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D21, vector3D28);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D36 = rotation35.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D43 = rotation42.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D36, vector3D43);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation45 = rotation29.applyTo(rotation44);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation46 = rotation14.applyTo(rotation45);
        double[][] doubleArray47 = rotation46.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray47, (double) 10);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray47, (double) (byte) 100);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation53 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray47, (double) (short) 0);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation55 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray47, (double) 1);
        double double56 = rotation55.getQ3();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertNotNull(vector3D28);
        org.junit.Assert.assertNotNull(vector3D36);
        org.junit.Assert.assertNotNull(vector3D43);
        org.junit.Assert.assertNotNull(rotation45);
        org.junit.Assert.assertNotNull(rotation46);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation0 = org.apache.commons.math.geometry.euclidean.threed.Rotation.IDENTITY;
        double double1 = rotation0.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation2 = rotation0.revert();
        double double3 = rotation2.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation9 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D10 = rotation9.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation16 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double17 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation9, rotation16);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation23 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D24 = rotation23.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation30 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D31 = rotation30.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation32 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D24, vector3D31);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation38 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation39 = rotation32.applyInverseTo(rotation38);
        double double40 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation16, rotation32);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D41 = rotation16.getAxis();
        double[][] doubleArray42 = rotation16.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation48 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-0.0d), (double) (short) 1, 0.0d, 0.9996303825414301d, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = rotation16.applyTo(rotation48);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation50 = rotation2.applyTo(rotation48);
        double double51 = rotation50.getAngle();
        double double52 = rotation50.getQ1();
        org.junit.Assert.assertNotNull(rotation0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(rotation2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(vector3D10);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(vector3D24);
        org.junit.Assert.assertNotNull(vector3D31);
        org.junit.Assert.assertNotNull(rotation39);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 3.141592653589793d + "'", double40 == 3.141592653589793d);
        org.junit.Assert.assertNotNull(vector3D41);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertNotNull(rotation49);
        org.junit.Assert.assertNotNull(rotation50);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 3.141592653589793d + "'", double51 == 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + (-1.0d) + "'", double52 == (-1.0d));
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D12 = rotation11.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation18 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D19 = rotation18.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D12, vector3D19);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation22 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D12, (double) 100L);
        double double23 = rotation22.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation24 = rotation5.applyInverseTo(rotation22);
        double double25 = rotation5.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D26 = rotation5.getAxis();
        double double27 = rotation5.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = rotation5.revert();
        double double29 = rotation28.getQ2();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation30 = rotation28.revert();
        double double31 = rotation30.getQ2();
        double double32 = rotation30.getQ3();
        org.junit.Assert.assertNotNull(vector3D12);
        org.junit.Assert.assertNotNull(vector3D19);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-0.0d) + "'", double23 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertNotNull(vector3D26);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(rotation28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
        org.junit.Assert.assertNotNull(rotation30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 1.0d + "'", double32 == 1.0d);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double28 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation20, rotation27);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D35 = rotation34.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation41 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double42 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation34, rotation41);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation43 = rotation27.applyInverseTo(rotation34);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D44 = rotation43.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation45 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D44);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation46 = rotation45.revert();
        double double47 = rotation46.getQ3();
        double double48 = rotation46.getQ2();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(vector3D35);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertNotNull(rotation43);
        org.junit.Assert.assertNotNull(vector3D44);
        org.junit.Assert.assertNotNull(rotation46);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-0.8981984963621733d) + "'", double47 == (-0.8981984963621733d));
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + (-0.06415703545444096d) + "'", double48 == (-0.06415703545444096d));
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        double[][] doubleArray15 = rotation14.getMatrix();
        double[][] doubleArray16 = rotation14.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation22 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D23 = rotation22.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D30 = rotation29.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation31 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D23, vector3D30);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation37 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D38 = rotation37.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D45 = rotation44.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation46 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D38, vector3D45);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D53 = rotation52.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D60 = rotation59.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation61 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D53, vector3D60);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation62 = rotation46.applyTo(rotation61);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation63 = rotation31.applyTo(rotation62);
        double double64 = rotation31.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation70 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D71 = rotation70.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation77 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D78 = rotation77.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation79 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D71, vector3D78);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation81 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D71, (double) 100L);
        double double82 = rotation81.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation83 = rotation81.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation89 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        double double90 = rotation89.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation91 = rotation83.applyInverseTo(rotation89);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation92 = rotation31.applyInverseTo(rotation83);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation93 = rotation83.revert();
        double double94 = rotation83.getAngle();
        double double95 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation14, rotation83);
        double double96 = rotation14.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D97 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D98 = rotation14.applyTo(vector3D97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(vector3D23);
        org.junit.Assert.assertNotNull(vector3D30);
        org.junit.Assert.assertNotNull(vector3D38);
        org.junit.Assert.assertNotNull(vector3D45);
        org.junit.Assert.assertNotNull(vector3D53);
        org.junit.Assert.assertNotNull(vector3D60);
        org.junit.Assert.assertNotNull(rotation62);
        org.junit.Assert.assertNotNull(rotation63);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertNotNull(vector3D71);
        org.junit.Assert.assertNotNull(vector3D78);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + (-0.0d) + "'", double82 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation83);
        org.junit.Assert.assertTrue(Double.isNaN(double90));
        org.junit.Assert.assertNotNull(rotation91);
        org.junit.Assert.assertNotNull(rotation92);
        org.junit.Assert.assertNotNull(rotation93);
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 0.5309649148733836d + "'", double94 == 0.5309649148733836d);
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 0.5309649148733836d + "'", double95 == 0.5309649148733836d);
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 1.0d + "'", double96 == 1.0d);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (short) -1, (-0.8775825618903728d), (double) (byte) 100, 0.3388903615770647d, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D7 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation13 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D14 = rotation13.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double21 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation13, rotation20);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D28 = rotation27.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double35 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation27, rotation34);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation36 = rotation20.applyInverseTo(rotation27);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D43 = rotation42.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D50 = rotation49.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D43, vector3D50);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation53 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D43, (double) 1L);
        double double54 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation27, rotation53);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation55 = rotation53.revert();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D56 = rotation55.getAxis();
        double double57 = rotation55.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D58 = rotation55.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D7, vector3D58);
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder60 = null;
        double[] doubleArray61 = rotation59.getAngles(rotationOrder60);
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D7);
        org.junit.Assert.assertNotNull(vector3D14);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(vector3D28);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertNotNull(rotation36);
        org.junit.Assert.assertNotNull(vector3D43);
        org.junit.Assert.assertNotNull(vector3D50);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.9456205751905904d + "'", double54 == 0.9456205751905904d);
        org.junit.Assert.assertNotNull(rotation55);
        org.junit.Assert.assertNotNull(vector3D56);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 1.0d + "'", double57 == 1.0d);
        org.junit.Assert.assertNotNull(vector3D58);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[0.3883124854924854, 0.0036746809758540057, -1.1824838413024112]");
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (short) 100, 0.0d, 0.33900504942104487d, 0.0d, false);
        double double6 = rotation5.getQ2();
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = rotation5.getAngles(rotationOrder7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.geometry.euclidean.threed.CardanEulerSingularityException; message: Euler angles singularity");
        } catch (org.apache.commons.math.geometry.euclidean.threed.CardanEulerSingularityException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.33900504942104487d + "'", double6 == 0.33900504942104487d);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(1.1051177169214896d, (double) (short) 10, 2.566370614359174d, (-0.1730129508244783d), false);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D28 = rotation27.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D35 = rotation34.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation36 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D28, vector3D35);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D43 = rotation42.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D50 = rotation49.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D43, vector3D50);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D13, vector3D21, vector3D35, vector3D50);
        double double53 = rotation52.getQ1();
        double double54 = rotation52.getQ2();
        double double55 = rotation52.getQ1();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertNotNull(vector3D28);
        org.junit.Assert.assertNotNull(vector3D35);
        org.junit.Assert.assertNotNull(vector3D43);
        org.junit.Assert.assertNotNull(vector3D50);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue(Double.isNaN(double55));
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation17 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D18 = rotation17.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation24 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D25 = rotation24.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D18, vector3D25);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D27 = rotation11.applyTo(vector3D18);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D28 = rotation5.applyTo(vector3D27);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation30 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D27, (double) 1.0f);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation36 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D37 = rotation36.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation43 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D44 = rotation43.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation45 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D37, vector3D44);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D52 = rotation51.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D59 = rotation58.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation65 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D66 = rotation65.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation67 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D59, vector3D66);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation73 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D74 = rotation73.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation80 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D81 = rotation80.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation82 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D74, vector3D81);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation83 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D44, vector3D52, vector3D66, vector3D81);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation85 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D44, (-0.0d));
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation87 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D44, (double) 1L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation88 = rotation30.applyInverseTo(rotation87);
        double double89 = rotation30.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation90 = rotation30.revert();
        org.junit.Assert.assertNotNull(vector3D18);
        org.junit.Assert.assertNotNull(vector3D25);
        org.junit.Assert.assertNotNull(vector3D27);
        org.junit.Assert.assertNotNull(vector3D28);
        org.junit.Assert.assertNotNull(vector3D37);
        org.junit.Assert.assertNotNull(vector3D44);
        org.junit.Assert.assertNotNull(vector3D52);
        org.junit.Assert.assertNotNull(vector3D59);
        org.junit.Assert.assertNotNull(vector3D66);
        org.junit.Assert.assertNotNull(vector3D74);
        org.junit.Assert.assertNotNull(vector3D81);
        org.junit.Assert.assertNotNull(rotation88);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 0.8775825618903728d + "'", double89 == 0.8775825618903728d);
        org.junit.Assert.assertNotNull(rotation90);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.09949879346007118d, (-0.0d), (double) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D12 = rotation11.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation18 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D19 = rotation18.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D12, vector3D19);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = rotation20.applyInverseTo(rotation26);
        double double28 = rotation26.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = rotation5.applyInverseTo(rotation26);
        double double30 = rotation29.getQ3();
        double double31 = rotation29.getQ0();
        double double32 = rotation29.getQ2();
        org.junit.Assert.assertNotNull(vector3D12);
        org.junit.Assert.assertNotNull(vector3D19);
        org.junit.Assert.assertNotNull(rotation27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 3.141592653589793d + "'", double28 == 3.141592653589793d);
        org.junit.Assert.assertNotNull(rotation29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 9.999000062556641d + "'", double30 == 9.999000062556641d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.9999995049998724d + "'", double31 == 0.9999995049998724d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 9.949874420815573E-4d + "'", double32 == 9.949874420815573E-4d);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 10, 0.0d, (double) (byte) 0, 10.0d, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation17 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D18 = rotation17.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation24 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D25 = rotation24.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D18, vector3D25);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D18, (double) 100L);
        double double29 = rotation28.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation30 = rotation11.applyInverseTo(rotation28);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation31 = rotation5.applyInverseTo(rotation28);
        double double32 = rotation5.getQ3();
        double double33 = rotation5.getQ0();
        double double34 = rotation5.getQ3();
        double double35 = rotation5.getAngle();
        org.junit.Assert.assertNotNull(vector3D18);
        org.junit.Assert.assertNotNull(vector3D25);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-0.0d) + "'", double29 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation30);
        org.junit.Assert.assertNotNull(rotation31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (short) 10, (double) (byte) 0, 0.01922366120271981d, 0.9949879346007117d, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        double double7 = rotation5.getQ0();
        double[][] doubleArray8 = rotation5.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D15 = rotation14.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation21 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D22 = rotation21.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation23 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D15, vector3D22);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D30 = rotation29.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation36 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D37 = rotation36.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation38 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D30, vector3D37);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D45 = rotation44.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D52 = rotation51.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation53 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D45, vector3D52);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation54 = rotation38.applyTo(rotation53);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation55 = rotation23.applyTo(rotation54);
        double double56 = rotation23.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation62 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D63 = rotation62.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation69 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D70 = rotation69.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation71 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D63, vector3D70);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation73 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D63, (double) 100L);
        double double74 = rotation73.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation75 = rotation73.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation81 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        double double82 = rotation81.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation83 = rotation75.applyInverseTo(rotation81);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation84 = rotation23.applyInverseTo(rotation75);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation85 = rotation75.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation86 = rotation5.applyTo(rotation75);
        double double87 = rotation75.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D88 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D89 = rotation75.applyTo(vector3D88);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9950846276202212d + "'", double7 == 0.9950846276202212d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(vector3D15);
        org.junit.Assert.assertNotNull(vector3D22);
        org.junit.Assert.assertNotNull(vector3D30);
        org.junit.Assert.assertNotNull(vector3D37);
        org.junit.Assert.assertNotNull(vector3D45);
        org.junit.Assert.assertNotNull(vector3D52);
        org.junit.Assert.assertNotNull(rotation54);
        org.junit.Assert.assertNotNull(rotation55);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertNotNull(vector3D63);
        org.junit.Assert.assertNotNull(vector3D70);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + (-0.0d) + "'", double74 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation75);
        org.junit.Assert.assertTrue(Double.isNaN(double82));
        org.junit.Assert.assertNotNull(rotation83);
        org.junit.Assert.assertNotNull(rotation84);
        org.junit.Assert.assertNotNull(rotation85);
        org.junit.Assert.assertNotNull(rotation86);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + (-0.0d) + "'", double87 == (-0.0d));
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.geometry.euclidean.threed.Rotation rotation4 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(rotationOrder0, (double) (-1L), 0.30055282826141555d, 1.3583484577842444d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation16 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, (double) 1L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation22 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D23 = rotation22.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D30 = rotation29.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation31 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D23, vector3D30);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation37 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D38 = rotation37.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D45 = rotation44.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D52 = rotation51.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation53 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D45, vector3D52);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D60 = rotation59.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation66 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D67 = rotation66.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation68 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D60, vector3D67);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation69 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D30, vector3D38, vector3D52, vector3D67);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation70 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D52);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation72 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, (double) 1L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation74 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, (-116.90457705856772d));
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation80 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D81 = rotation80.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation87 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double88 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation80, rotation87);
        double double89 = rotation87.getQ1();
        double double90 = rotation87.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation91 = rotation87.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation92 = rotation74.applyInverseTo(rotation91);
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D23);
        org.junit.Assert.assertNotNull(vector3D30);
        org.junit.Assert.assertNotNull(vector3D38);
        org.junit.Assert.assertNotNull(vector3D45);
        org.junit.Assert.assertNotNull(vector3D52);
        org.junit.Assert.assertNotNull(vector3D60);
        org.junit.Assert.assertNotNull(vector3D67);
        org.junit.Assert.assertNotNull(vector3D81);
        org.junit.Assert.assertTrue(Double.isNaN(double88));
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 10.0d + "'", double89 == 10.0d);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 3.141592653589793d + "'", double90 == 3.141592653589793d);
        org.junit.Assert.assertNotNull(rotation91);
        org.junit.Assert.assertNotNull(rotation92);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation16 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, (double) 100L);
        double double17 = rotation16.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation23 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D24 = rotation23.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation30 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D31 = rotation30.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation32 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D24, vector3D31);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation38 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D39 = rotation38.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation45 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D46 = rotation45.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation47 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D39, vector3D46);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation48 = rotation32.applyTo(rotation47);
        double double49 = rotation47.getAngle();
        double double50 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation16, rotation47);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation56 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100, (double) (byte) -1, (double) (short) 10, 0.9456205751905904d, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D57 = rotation56.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = rotation56.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = rotation58.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation60 = rotation47.applyTo(rotation58);
        double double61 = rotation58.getQ2();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-0.1855270382668764d) + "'", double17 == (-0.1855270382668764d));
        org.junit.Assert.assertNotNull(vector3D24);
        org.junit.Assert.assertNotNull(vector3D31);
        org.junit.Assert.assertNotNull(vector3D39);
        org.junit.Assert.assertNotNull(vector3D46);
        org.junit.Assert.assertNotNull(rotation48);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.5309649148733836d + "'", double50 == 0.5309649148733836d);
        org.junit.Assert.assertNotNull(vector3D57);
        org.junit.Assert.assertNotNull(rotation58);
        org.junit.Assert.assertNotNull(rotation59);
        org.junit.Assert.assertNotNull(rotation60);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.09949438965141721d + "'", double61 == 0.09949438965141721d);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 100, (double) (byte) -1, (double) (short) 10, 0.9456205751905904d, true);
        double double6 = rotation5.getQ0();
        double[][] doubleArray7 = rotation5.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation9 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray7, 0.3388903615770647d);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation15 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (short) -1, (-0.1730129508244783d), (-0.1730129508244783d), (double) 10.0f, false);
        double double16 = rotation15.getQ2();
        double double17 = rotation15.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation23 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D24 = rotation23.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation30 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D31 = rotation30.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation32 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D24, vector3D31);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation38 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation39 = rotation32.applyInverseTo(rotation38);
        double double40 = rotation38.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation46 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D47 = rotation46.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation53 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double54 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation46, rotation53);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation60 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D61 = rotation60.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation67 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D68 = rotation67.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation69 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D61, vector3D68);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation75 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation76 = rotation69.applyInverseTo(rotation75);
        double double77 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation53, rotation69);
        double double78 = rotation69.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation79 = rotation38.applyInverseTo(rotation69);
        double double80 = rotation38.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation81 = rotation38.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation82 = rotation15.applyTo(rotation38);
        double double83 = rotation38.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation84 = rotation9.applyInverseTo(rotation38);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9949438965141721d + "'", double6 == 0.9949438965141721d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.1730129508244783d) + "'", double16 == (-0.1730129508244783d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(vector3D24);
        org.junit.Assert.assertNotNull(vector3D31);
        org.junit.Assert.assertNotNull(rotation39);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 3.141592653589793d + "'", double40 == 3.141592653589793d);
        org.junit.Assert.assertNotNull(vector3D47);
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertNotNull(vector3D61);
        org.junit.Assert.assertNotNull(vector3D68);
        org.junit.Assert.assertNotNull(rotation76);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 3.141592653589793d + "'", double77 == 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.0d + "'", double78 == 0.0d);
        org.junit.Assert.assertNotNull(rotation79);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 10.0d + "'", double80 == 10.0d);
        org.junit.Assert.assertNotNull(rotation81);
        org.junit.Assert.assertNotNull(rotation82);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 10.0d + "'", double83 == 10.0d);
        org.junit.Assert.assertNotNull(rotation84);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double13 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation5, rotation12);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation19 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D20 = rotation19.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double27 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation19, rotation26);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = rotation12.applyInverseTo(rotation19);
        double double29 = rotation28.getQ1();
        double double30 = rotation28.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation36 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D37 = rotation36.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation43 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D44 = rotation43.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation45 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D37, vector3D44);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = rotation45.applyInverseTo(rotation51);
        double double53 = rotation45.getQ2();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D60 = rotation59.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation66 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double67 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation59, rotation66);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation73 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D74 = rotation73.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation80 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D81 = rotation80.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation82 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D74, vector3D81);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation88 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation89 = rotation82.applyInverseTo(rotation88);
        double double90 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation66, rotation82);
        double double91 = rotation82.getQ3();
        double double92 = rotation82.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation93 = rotation45.applyTo(rotation82);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation94 = rotation45.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation95 = rotation94.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation96 = rotation28.applyTo(rotation94);
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(vector3D20);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(rotation28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.015527486617021d + "'", double29 == 10.015527486617021d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.015527486617021d + "'", double30 == 10.015527486617021d);
        org.junit.Assert.assertNotNull(vector3D37);
        org.junit.Assert.assertNotNull(vector3D44);
        org.junit.Assert.assertNotNull(rotation52);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertNotNull(vector3D60);
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertNotNull(vector3D74);
        org.junit.Assert.assertNotNull(vector3D81);
        org.junit.Assert.assertNotNull(rotation89);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 3.141592653589793d + "'", double90 == 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 0.0d + "'", double91 == 0.0d);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 1.0d + "'", double92 == 1.0d);
        org.junit.Assert.assertNotNull(rotation93);
        org.junit.Assert.assertNotNull(rotation94);
        org.junit.Assert.assertNotNull(rotation95);
        org.junit.Assert.assertNotNull(rotation96);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double13 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation5, rotation12);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation19 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D20 = rotation19.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D27 = rotation26.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D20, vector3D27);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = rotation28.applyInverseTo(rotation34);
        double double36 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation12, rotation28);
        double double37 = rotation12.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation43 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D44 = rotation43.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation50 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double51 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation43, rotation50);
        double double52 = rotation50.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D59 = rotation58.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation65 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double66 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation58, rotation65);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation72 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D73 = rotation72.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation79 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double80 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation72, rotation79);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation81 = rotation65.applyInverseTo(rotation72);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation82 = rotation50.applyTo(rotation72);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D83 = rotation50.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D84 = rotation12.applyInverseTo(vector3D83);
        double double85 = rotation12.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation91 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 0, (double) 1.0f, (double) 0.0f, 0.01922366120271981d, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation92 = rotation12.applyTo(rotation91);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D93 = rotation92.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation95 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D93, 0.24789995758802838d);
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(vector3D20);
        org.junit.Assert.assertNotNull(vector3D27);
        org.junit.Assert.assertNotNull(rotation35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 3.141592653589793d + "'", double36 == 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 3.141592653589793d + "'", double37 == 3.141592653589793d);
        org.junit.Assert.assertNotNull(vector3D44);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 3.141592653589793d + "'", double52 == 3.141592653589793d);
        org.junit.Assert.assertNotNull(vector3D59);
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertNotNull(vector3D73);
        org.junit.Assert.assertTrue(Double.isNaN(double80));
        org.junit.Assert.assertNotNull(rotation81);
        org.junit.Assert.assertNotNull(rotation82);
        org.junit.Assert.assertNotNull(vector3D83);
        org.junit.Assert.assertNotNull(vector3D84);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 10.0d + "'", double85 == 10.0d);
        org.junit.Assert.assertNotNull(rotation92);
        org.junit.Assert.assertNotNull(vector3D93);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double13 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation5, rotation12);
        double double14 = rotation12.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double28 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation20, rotation27);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D35 = rotation34.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation41 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D42 = rotation41.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation43 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D35, vector3D42);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation50 = rotation43.applyInverseTo(rotation49);
        double double51 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation27, rotation43);
        double double52 = rotation43.getQ3();
        double double53 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation12, rotation43);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D60 = rotation59.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation66 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D67 = rotation66.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation68 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D60, vector3D67);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation74 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation75 = rotation68.applyInverseTo(rotation74);
        double double76 = rotation68.getQ2();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation77 = rotation43.applyInverseTo(rotation68);
        double[][] doubleArray78 = rotation68.getMatrix();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(vector3D35);
        org.junit.Assert.assertNotNull(vector3D42);
        org.junit.Assert.assertNotNull(rotation50);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 3.141592653589793d + "'", double51 == 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 3.141592653589793d + "'", double53 == 3.141592653589793d);
        org.junit.Assert.assertNotNull(vector3D60);
        org.junit.Assert.assertNotNull(vector3D67);
        org.junit.Assert.assertNotNull(rotation75);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
        org.junit.Assert.assertNotNull(rotation77);
        org.junit.Assert.assertNotNull(doubleArray78);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D28 = rotation27.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D35 = rotation34.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation36 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D28, vector3D35);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D43 = rotation42.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D50 = rotation49.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D43, vector3D50);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D13, vector3D21, vector3D35, vector3D50);
        double double53 = rotation52.getQ2();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D54 = rotation52.getAxis();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertNotNull(vector3D28);
        org.junit.Assert.assertNotNull(vector3D35);
        org.junit.Assert.assertNotNull(vector3D43);
        org.junit.Assert.assertNotNull(vector3D50);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertNotNull(vector3D54);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D28 = rotation27.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D35 = rotation34.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation36 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D28, vector3D35);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D43 = rotation42.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D50 = rotation49.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D43, vector3D50);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D13, vector3D21, vector3D35, vector3D50);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation54 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D13, (-0.0d));
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation56 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D13, (double) 1L);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D57 = rotation56.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = rotation56.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation64 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation70 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D71 = rotation70.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation77 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D78 = rotation77.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation79 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D71, vector3D78);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation81 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D71, (double) 100L);
        double double82 = rotation81.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation83 = rotation64.applyInverseTo(rotation81);
        double double84 = rotation64.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D85 = rotation64.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation87 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D85, (double) 10.0f);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation89 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D85, 2.7755575615628914E-17d);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D90 = rotation58.applyInverseTo(vector3D85);
        double double91 = rotation58.getQ2();
        double double92 = rotation58.getAngle();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertNotNull(vector3D28);
        org.junit.Assert.assertNotNull(vector3D35);
        org.junit.Assert.assertNotNull(vector3D43);
        org.junit.Assert.assertNotNull(vector3D50);
        org.junit.Assert.assertNotNull(vector3D57);
        org.junit.Assert.assertNotNull(rotation58);
        org.junit.Assert.assertNotNull(vector3D71);
        org.junit.Assert.assertNotNull(vector3D78);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + (-0.0d) + "'", double82 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation83);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 1.0d + "'", double84 == 1.0d);
        org.junit.Assert.assertNotNull(vector3D85);
        org.junit.Assert.assertNotNull(vector3D90);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 0.33900504942104487d + "'", double91 == 0.33900504942104487d);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 1.0d + "'", double92 == 1.0d);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.geometry.euclidean.threed.Rotation rotation4 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(rotationOrder0, (-0.29309039211917487d), 0.0d, 0.0019129169749405736d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 0, (double) (byte) 100, (-0.005755946541407356d), 3.7105407653375275d, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation6 = rotation5.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation18 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D19 = rotation18.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation25 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D26 = rotation25.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D19, vector3D26);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D28 = rotation12.applyTo(vector3D19);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 10, 0.0d, (double) (byte) 0, 10.0d, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation40 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation46 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D47 = rotation46.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation53 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D54 = rotation53.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation55 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D47, vector3D54);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation57 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D47, (double) 100L);
        double double58 = rotation57.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = rotation40.applyInverseTo(rotation57);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation60 = rotation34.applyInverseTo(rotation57);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation61 = rotation12.applyTo(rotation34);
        double double62 = rotation12.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation63 = rotation5.applyTo(rotation12);
        double double64 = rotation63.getQ1();
        org.junit.Assert.assertNotNull(rotation6);
        org.junit.Assert.assertNotNull(vector3D19);
        org.junit.Assert.assertNotNull(vector3D26);
        org.junit.Assert.assertNotNull(vector3D28);
        org.junit.Assert.assertNotNull(vector3D47);
        org.junit.Assert.assertNotNull(vector3D54);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + (-0.0d) + "'", double58 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation59);
        org.junit.Assert.assertNotNull(rotation60);
        org.junit.Assert.assertNotNull(rotation61);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 3.1216925665368036d + "'", double62 == 3.1216925665368036d);
        org.junit.Assert.assertNotNull(rotation63);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.026951006689637166d + "'", double64 == 0.026951006689637166d);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D28 = rotation27.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D35 = rotation34.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation36 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D28, vector3D35);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D43 = rotation42.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D50 = rotation49.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D43, vector3D50);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D13, vector3D21, vector3D35, vector3D50);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation54 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D13, (-0.0d));
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation56 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D13, (double) 1L);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D57 = rotation56.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation63 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation69 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D70 = rotation69.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D71 = rotation63.applyInverseTo(vector3D70);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation77 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D78 = rotation77.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation84 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D85 = rotation84.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation86 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D78, vector3D85);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation88 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D78, (double) 1L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation89 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D71, vector3D78);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation90 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D57, vector3D71);
        double double91 = rotation90.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D92 = rotation90.getAxis();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertNotNull(vector3D28);
        org.junit.Assert.assertNotNull(vector3D35);
        org.junit.Assert.assertNotNull(vector3D43);
        org.junit.Assert.assertNotNull(vector3D50);
        org.junit.Assert.assertNotNull(vector3D57);
        org.junit.Assert.assertNotNull(vector3D70);
        org.junit.Assert.assertNotNull(vector3D71);
        org.junit.Assert.assertNotNull(vector3D78);
        org.junit.Assert.assertNotNull(vector3D85);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + (-0.005755946541407356d) + "'", double91 == (-0.005755946541407356d));
        org.junit.Assert.assertNotNull(vector3D92);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 10, 0.0d, (double) (byte) 0, 10.0d, false);
        double double6 = rotation5.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation19 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D20 = rotation19.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation21 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D13, vector3D20);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D28 = rotation27.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D35 = rotation34.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation41 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D42 = rotation41.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation43 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D35, vector3D42);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D50 = rotation49.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation56 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D57 = rotation56.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D50, vector3D57);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D20, vector3D28, vector3D42, vector3D57);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D60 = rotation5.applyTo(vector3D42);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D61 = rotation5.getAxis();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D20);
        org.junit.Assert.assertNotNull(vector3D28);
        org.junit.Assert.assertNotNull(vector3D35);
        org.junit.Assert.assertNotNull(vector3D42);
        org.junit.Assert.assertNotNull(vector3D50);
        org.junit.Assert.assertNotNull(vector3D57);
        org.junit.Assert.assertNotNull(vector3D60);
        org.junit.Assert.assertNotNull(vector3D61);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 10, 0.0d, (double) (byte) 0, 10.0d, false);
        double double6 = rotation5.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation19 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D20 = rotation19.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation21 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D13, vector3D20);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D28 = rotation27.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D35 = rotation34.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation41 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D42 = rotation41.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation43 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D35, vector3D42);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D50 = rotation49.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation56 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D57 = rotation56.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D50, vector3D57);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D20, vector3D28, vector3D42, vector3D57);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D60 = rotation5.applyTo(vector3D42);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation61 = rotation5.revert();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D62 = rotation61.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation63 = rotation61.revert();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D20);
        org.junit.Assert.assertNotNull(vector3D28);
        org.junit.Assert.assertNotNull(vector3D35);
        org.junit.Assert.assertNotNull(vector3D42);
        org.junit.Assert.assertNotNull(vector3D50);
        org.junit.Assert.assertNotNull(vector3D57);
        org.junit.Assert.assertNotNull(vector3D60);
        org.junit.Assert.assertNotNull(rotation61);
        org.junit.Assert.assertNotNull(vector3D62);
        org.junit.Assert.assertNotNull(rotation63);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-0.16026520139361466d), 0.003388584257121107d, 1.0d, 77.7583719842568d, true);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation21 = rotation14.applyInverseTo(rotation20);
        double double22 = rotation20.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D29 = rotation28.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double36 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation28, rotation35);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D43 = rotation42.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D50 = rotation49.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D43, vector3D50);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation57 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = rotation51.applyInverseTo(rotation57);
        double double59 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation35, rotation51);
        double double60 = rotation51.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation61 = rotation20.applyInverseTo(rotation51);
        double double62 = rotation20.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation63 = rotation20.revert();
        double double64 = rotation20.getQ1();
        double double65 = rotation20.getQ1();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(rotation21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 3.141592653589793d + "'", double22 == 3.141592653589793d);
        org.junit.Assert.assertNotNull(vector3D29);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertNotNull(vector3D43);
        org.junit.Assert.assertNotNull(vector3D50);
        org.junit.Assert.assertNotNull(rotation58);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 3.141592653589793d + "'", double59 == 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertNotNull(rotation61);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 10.0d + "'", double62 == 10.0d);
        org.junit.Assert.assertNotNull(rotation63);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 10.0d + "'", double64 == 10.0d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 10.0d + "'", double65 == 10.0d);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D28 = rotation27.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D21, vector3D28);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D36 = rotation35.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D43 = rotation42.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D36, vector3D43);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation45 = rotation29.applyTo(rotation44);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation46 = rotation14.applyTo(rotation45);
        double[][] doubleArray47 = rotation46.getMatrix();
        double double48 = rotation46.getQ1();
        double[][] doubleArray49 = rotation46.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray49, (double) 100L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation53 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray49, (double) 0);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation55 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray49, (double) 'a');
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D56 = rotation55.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation62 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.8775825618903728d, (double) 10.0f, (double) (byte) 10, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D63 = rotation62.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D64 = rotation55.applyInverseTo(vector3D63);
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertNotNull(vector3D28);
        org.junit.Assert.assertNotNull(vector3D36);
        org.junit.Assert.assertNotNull(vector3D43);
        org.junit.Assert.assertNotNull(rotation45);
        org.junit.Assert.assertNotNull(rotation46);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertNotNull(vector3D56);
        org.junit.Assert.assertNotNull(vector3D63);
        org.junit.Assert.assertNotNull(vector3D64);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-8.717516503499631d), (-0.4454472216916607d), 3.124250928329183d, 0.28366218546322625d, true);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double13 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation5, rotation12);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation19 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D20 = rotation19.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D27 = rotation26.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D20, vector3D27);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = rotation28.applyInverseTo(rotation34);
        double double36 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation12, rotation28);
        double double37 = rotation12.getAngle();
        double double38 = rotation12.getQ1();
        double double39 = rotation12.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation40 = org.apache.commons.math.geometry.euclidean.threed.Rotation.IDENTITY;
        double double41 = rotation40.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = rotation40.revert();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D43 = rotation42.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation45 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D43, 3.1216032962775833d);
        double double46 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation12, rotation45);
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(vector3D20);
        org.junit.Assert.assertNotNull(vector3D27);
        org.junit.Assert.assertNotNull(rotation35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 3.141592653589793d + "'", double36 == 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 3.141592653589793d + "'", double37 == 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 10.0d + "'", double38 == 10.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 10.0d + "'", double39 == 10.0d);
        org.junit.Assert.assertNotNull(rotation40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertNotNull(rotation42);
        org.junit.Assert.assertNotNull(vector3D43);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation16 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, (double) 100L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation22 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D29 = rotation28.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D36 = rotation35.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation37 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D29, vector3D36);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D38 = rotation22.applyTo(vector3D29);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D45 = rotation44.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D52 = rotation51.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D59 = rotation58.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation60 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D52, vector3D59);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation62 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D52, (double) 100L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation63 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D45, vector3D52);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation69 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D70 = rotation69.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation71 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D38, vector3D52, vector3D70);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation77 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D78 = rotation77.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation84 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D85 = rotation84.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation86 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D78, vector3D85);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation87 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D70, vector3D85);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation88 = rotation87.revert();
        double double89 = rotation88.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation95 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 0, (double) (byte) 100, (-0.005755946541407356d), 3.7105407653375275d, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation96 = rotation88.applyInverseTo(rotation95);
        double[][] doubleArray97 = rotation88.getMatrix();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D29);
        org.junit.Assert.assertNotNull(vector3D36);
        org.junit.Assert.assertNotNull(vector3D38);
        org.junit.Assert.assertNotNull(vector3D45);
        org.junit.Assert.assertNotNull(vector3D52);
        org.junit.Assert.assertNotNull(vector3D59);
        org.junit.Assert.assertNotNull(vector3D70);
        org.junit.Assert.assertNotNull(vector3D78);
        org.junit.Assert.assertNotNull(vector3D85);
        org.junit.Assert.assertNotNull(rotation88);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + (-1.0d) + "'", double89 == (-1.0d));
        org.junit.Assert.assertNotNull(rotation96);
        org.junit.Assert.assertNotNull(doubleArray97);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-0.1855270382668764d), (double) 1, Double.NaN, (double) (short) 100, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D12 = rotation11.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation18 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D19 = rotation18.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D12, vector3D19);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D27 = rotation26.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation33 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D34 = rotation33.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D27, vector3D34);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation36 = rotation20.applyTo(rotation35);
        double double37 = rotation35.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation38 = rotation35.revert();
        double double39 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation5, rotation35);
        double double40 = rotation5.getQ3();
        org.junit.Assert.assertNotNull(vector3D12);
        org.junit.Assert.assertNotNull(vector3D19);
        org.junit.Assert.assertNotNull(vector3D27);
        org.junit.Assert.assertNotNull(vector3D34);
        org.junit.Assert.assertNotNull(rotation36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(rotation38);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 100.0d + "'", double40 == 100.0d);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 10, 0.0d, (double) (byte) 0, 10.0d, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation17 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D18 = rotation17.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation24 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D25 = rotation24.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D18, vector3D25);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D18, (double) 100L);
        double double29 = rotation28.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation30 = rotation11.applyInverseTo(rotation28);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation31 = rotation5.applyInverseTo(rotation28);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation32 = rotation31.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation33 = rotation32.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation39 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D40 = rotation39.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation46 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D47 = rotation46.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation48 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D40, vector3D47);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation50 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D40, (double) 100L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = rotation33.applyInverseTo(rotation50);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D52 = rotation51.getAxis();
        double[][] doubleArray53 = rotation51.getMatrix();
        org.junit.Assert.assertNotNull(vector3D18);
        org.junit.Assert.assertNotNull(vector3D25);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-0.0d) + "'", double29 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation30);
        org.junit.Assert.assertNotNull(rotation31);
        org.junit.Assert.assertNotNull(rotation32);
        org.junit.Assert.assertNotNull(rotation33);
        org.junit.Assert.assertNotNull(vector3D40);
        org.junit.Assert.assertNotNull(vector3D47);
        org.junit.Assert.assertNotNull(rotation51);
        org.junit.Assert.assertNotNull(vector3D52);
        org.junit.Assert.assertNotNull(doubleArray53);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D28 = rotation27.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D21, vector3D28);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation30 = rotation14.applyTo(rotation29);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation36 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D37 = rotation36.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation43 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D44 = rotation43.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation45 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D37, vector3D44);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = rotation45.applyInverseTo(rotation51);
        double double53 = rotation45.getQ2();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D60 = rotation59.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation66 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double67 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation59, rotation66);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation73 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D74 = rotation73.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation80 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D81 = rotation80.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation82 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D74, vector3D81);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation88 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation89 = rotation82.applyInverseTo(rotation88);
        double double90 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation66, rotation82);
        double double91 = rotation82.getQ3();
        double double92 = rotation82.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation93 = rotation45.applyTo(rotation82);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation94 = rotation29.applyTo(rotation45);
        double double95 = rotation29.getAngle();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertNotNull(vector3D28);
        org.junit.Assert.assertNotNull(rotation30);
        org.junit.Assert.assertNotNull(vector3D37);
        org.junit.Assert.assertNotNull(vector3D44);
        org.junit.Assert.assertNotNull(rotation52);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertNotNull(vector3D60);
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertNotNull(vector3D74);
        org.junit.Assert.assertNotNull(vector3D81);
        org.junit.Assert.assertNotNull(rotation89);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 3.141592653589793d + "'", double90 == 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 0.0d + "'", double91 == 0.0d);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 1.0d + "'", double92 == 1.0d);
        org.junit.Assert.assertNotNull(rotation93);
        org.junit.Assert.assertNotNull(rotation94);
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 0.0d + "'", double95 == 0.0d);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D28 = rotation27.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D21, vector3D28);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D36 = rotation35.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D43 = rotation42.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D36, vector3D43);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation45 = rotation29.applyTo(rotation44);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation46 = rotation14.applyTo(rotation45);
        double double47 = rotation46.getAngle();
        double double48 = rotation46.getQ3();
        double double49 = rotation46.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation55 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double56 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation46, rotation55);
        double double57 = rotation46.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation63 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D64 = rotation63.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation70 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D71 = rotation70.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation72 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D64, vector3D71);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation74 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D64, (double) 100L);
        double double75 = rotation74.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation76 = rotation74.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation77 = rotation46.applyInverseTo(rotation76);
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertNotNull(vector3D28);
        org.junit.Assert.assertNotNull(vector3D36);
        org.junit.Assert.assertNotNull(vector3D43);
        org.junit.Assert.assertNotNull(rotation45);
        org.junit.Assert.assertNotNull(rotation46);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 1.0d + "'", double49 == 1.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 3.141592653589793d + "'", double56 == 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 1.0d + "'", double57 == 1.0d);
        org.junit.Assert.assertNotNull(vector3D64);
        org.junit.Assert.assertNotNull(vector3D71);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + (-0.0d) + "'", double75 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation76);
        org.junit.Assert.assertNotNull(rotation77);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation16 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, (double) 100L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation22 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D29 = rotation28.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D36 = rotation35.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation37 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D29, vector3D36);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D38 = rotation22.applyTo(vector3D29);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D45 = rotation44.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D52 = rotation51.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D59 = rotation58.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation60 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D52, vector3D59);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation62 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D52, (double) 100L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation63 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D45, vector3D52);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation69 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D70 = rotation69.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation71 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D38, vector3D52, vector3D70);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation73 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D38, (-0.0d));
        double double74 = rotation73.getQ0();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D29);
        org.junit.Assert.assertNotNull(vector3D36);
        org.junit.Assert.assertNotNull(vector3D38);
        org.junit.Assert.assertNotNull(vector3D45);
        org.junit.Assert.assertNotNull(vector3D52);
        org.junit.Assert.assertNotNull(vector3D59);
        org.junit.Assert.assertNotNull(vector3D70);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 1.0d + "'", double74 == 1.0d);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double13 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation5, rotation12);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation19 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D20 = rotation19.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D27 = rotation26.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D20, vector3D27);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = rotation28.applyInverseTo(rotation34);
        double double36 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation12, rotation28);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D37 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation43 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D44 = rotation43.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation50 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D51 = rotation50.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D44, vector3D51);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D59 = rotation58.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation65 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D66 = rotation65.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation72 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D73 = rotation72.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation74 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D66, vector3D73);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation80 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D81 = rotation80.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation87 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D88 = rotation87.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation89 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D81, vector3D88);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation90 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D51, vector3D59, vector3D73, vector3D88);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation92 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D59, (double) 1);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation93 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D37, vector3D59);
        double double94 = rotation93.getQ2();
        double double95 = rotation93.getQ3();
        java.lang.Class<?> wildcardClass96 = rotation93.getClass();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(vector3D20);
        org.junit.Assert.assertNotNull(vector3D27);
        org.junit.Assert.assertNotNull(rotation35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 3.141592653589793d + "'", double36 == 3.141592653589793d);
        org.junit.Assert.assertNotNull(vector3D37);
        org.junit.Assert.assertNotNull(vector3D44);
        org.junit.Assert.assertNotNull(vector3D51);
        org.junit.Assert.assertNotNull(vector3D59);
        org.junit.Assert.assertNotNull(vector3D66);
        org.junit.Assert.assertNotNull(vector3D73);
        org.junit.Assert.assertNotNull(vector3D81);
        org.junit.Assert.assertNotNull(vector3D88);
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + (-0.03877567139094669d) + "'", double94 == (-0.03877567139094669d));
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + (-0.4265323853004136d) + "'", double95 == (-0.4265323853004136d));
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D28 = rotation27.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D21, vector3D28);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D36 = rotation35.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D43 = rotation42.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D36, vector3D43);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation45 = rotation29.applyTo(rotation44);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation46 = rotation14.applyTo(rotation45);
        double[][] doubleArray47 = rotation46.getMatrix();
        double[][] doubleArray48 = rotation46.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation50 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray48, (double) (short) 100);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray48, (double) 100);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation64 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D65 = rotation64.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation71 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D72 = rotation71.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation73 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D65, vector3D72);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation75 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D65, (double) 100L);
        double double76 = rotation75.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation77 = rotation58.applyInverseTo(rotation75);
        double double78 = rotation58.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D79 = rotation58.getAxis();
        double double80 = rotation58.getAngle();
        double double81 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation52, rotation58);
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertNotNull(vector3D28);
        org.junit.Assert.assertNotNull(vector3D36);
        org.junit.Assert.assertNotNull(vector3D43);
        org.junit.Assert.assertNotNull(rotation45);
        org.junit.Assert.assertNotNull(rotation46);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertNotNull(vector3D65);
        org.junit.Assert.assertNotNull(vector3D72);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + (-0.0d) + "'", double76 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation77);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 1.0d + "'", double78 == 1.0d);
        org.junit.Assert.assertNotNull(vector3D79);
        org.junit.Assert.assertTrue(Double.isNaN(double80));
        org.junit.Assert.assertTrue(Double.isNaN(double81));
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation16 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, (double) 1L);
        double double17 = rotation16.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation23 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '#', 0.9996303825414301d, (-5.7519881927834584E-5d), (-0.001227201364295339d), true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D30 = rotation29.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation36 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D37 = rotation36.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation38 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D30, vector3D37);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D45 = rotation44.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D52 = rotation51.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation53 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D45, vector3D52);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D60 = rotation59.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation66 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D67 = rotation66.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation68 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D60, vector3D67);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation69 = rotation53.applyTo(rotation68);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation70 = rotation38.applyTo(rotation69);
        double double71 = rotation70.getAngle();
        double double72 = rotation70.getQ3();
        double double73 = rotation70.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation79 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double80 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation70, rotation79);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation81 = rotation23.applyTo(rotation70);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation82 = rotation16.applyTo(rotation81);
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.8775825618903728d + "'", double17 == 0.8775825618903728d);
        org.junit.Assert.assertNotNull(vector3D30);
        org.junit.Assert.assertNotNull(vector3D37);
        org.junit.Assert.assertNotNull(vector3D45);
        org.junit.Assert.assertNotNull(vector3D52);
        org.junit.Assert.assertNotNull(vector3D60);
        org.junit.Assert.assertNotNull(vector3D67);
        org.junit.Assert.assertNotNull(rotation69);
        org.junit.Assert.assertNotNull(rotation70);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 1.0d + "'", double73 == 1.0d);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 3.141592653589793d + "'", double80 == 3.141592653589793d);
        org.junit.Assert.assertNotNull(rotation81);
        org.junit.Assert.assertNotNull(rotation82);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double13 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation5, rotation12);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation19 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D20 = rotation19.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D27 = rotation26.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D20, vector3D27);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = rotation28.applyInverseTo(rotation34);
        double double36 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation12, rotation28);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D37 = rotation12.getAxis();
        double[][] doubleArray38 = rotation12.getMatrix();
        double double39 = rotation12.getQ2();
        double double40 = rotation12.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation46 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 10, 0.0d, (double) (byte) 0, 10.0d, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D59 = rotation58.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation65 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D66 = rotation65.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation67 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D59, vector3D66);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation69 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D59, (double) 100L);
        double double70 = rotation69.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation71 = rotation52.applyInverseTo(rotation69);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation72 = rotation46.applyInverseTo(rotation69);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation78 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D79 = rotation78.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation85 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D86 = rotation85.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation87 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D79, vector3D86);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation89 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D79, (double) 1L);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D90 = rotation72.applyTo(vector3D79);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D91 = rotation12.applyInverseTo(vector3D79);
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder92 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray93 = rotation12.getAngles(rotationOrder92);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.geometry.euclidean.threed.CardanEulerSingularityException; message: Euler angles singularity");
        } catch (org.apache.commons.math.geometry.euclidean.threed.CardanEulerSingularityException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(vector3D20);
        org.junit.Assert.assertNotNull(vector3D27);
        org.junit.Assert.assertNotNull(rotation35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 3.141592653589793d + "'", double36 == 3.141592653589793d);
        org.junit.Assert.assertNotNull(vector3D37);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-1.0d) + "'", double39 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 3.141592653589793d + "'", double40 == 3.141592653589793d);
        org.junit.Assert.assertNotNull(vector3D59);
        org.junit.Assert.assertNotNull(vector3D66);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + (-0.0d) + "'", double70 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation71);
        org.junit.Assert.assertNotNull(rotation72);
        org.junit.Assert.assertNotNull(vector3D79);
        org.junit.Assert.assertNotNull(vector3D86);
        org.junit.Assert.assertNotNull(vector3D90);
        org.junit.Assert.assertNotNull(vector3D91);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.geometry.euclidean.threed.Rotation rotation4 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(rotationOrder0, 2.9464325940915277d, 9.079262566818354d, 2.566370614359173d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D28 = rotation27.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D21, vector3D28);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D36 = rotation35.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D43 = rotation42.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D36, vector3D43);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation45 = rotation29.applyTo(rotation44);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation46 = rotation14.applyTo(rotation45);
        double[][] doubleArray47 = rotation46.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray47, (double) 100.0f);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation55 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation61 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D62 = rotation61.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D63 = rotation55.applyInverseTo(vector3D62);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D64 = rotation49.applyTo(vector3D63);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation66 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D64, 100.0d);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation68 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D64, (double) (short) 0);
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertNotNull(vector3D28);
        org.junit.Assert.assertNotNull(vector3D36);
        org.junit.Assert.assertNotNull(vector3D43);
        org.junit.Assert.assertNotNull(rotation45);
        org.junit.Assert.assertNotNull(rotation46);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertNotNull(vector3D62);
        org.junit.Assert.assertNotNull(vector3D63);
        org.junit.Assert.assertNotNull(vector3D64);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(10.015527486617021d, 0.09949879346007118d, (double) 0L, 17.66239947251099d, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (short) 100, (-8.717516503499631d), (-0.33900504942104487d), 0.7881701093115122d, false);
        double double12 = rotation11.getQ2();
        double double13 = rotation11.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation19 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D20 = rotation19.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D27 = rotation26.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D20, vector3D27);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D35 = rotation34.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation41 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D42 = rotation41.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation48 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D49 = rotation48.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation50 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D42, vector3D49);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation56 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D57 = rotation56.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation63 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D64 = rotation63.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation65 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D57, vector3D64);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation66 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D27, vector3D35, vector3D49, vector3D64);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation68 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D27, (-0.0d));
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation70 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D27, (-0.1855270382668764d));
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation71 = rotation11.applyInverseTo(rotation70);
        double double72 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation5, rotation71);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation78 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 0, (double) 0, (double) (short) 1, (double) (byte) 1, false);
        double double79 = rotation78.getQ1();
        double double80 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation71, rotation78);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.33900504942104487d) + "'", double12 == (-0.33900504942104487d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.7881701093115122d + "'", double13 == 0.7881701093115122d);
        org.junit.Assert.assertNotNull(vector3D20);
        org.junit.Assert.assertNotNull(vector3D27);
        org.junit.Assert.assertNotNull(vector3D35);
        org.junit.Assert.assertNotNull(vector3D42);
        org.junit.Assert.assertNotNull(vector3D49);
        org.junit.Assert.assertNotNull(vector3D57);
        org.junit.Assert.assertNotNull(vector3D64);
        org.junit.Assert.assertNotNull(rotation71);
        org.junit.Assert.assertTrue(Double.isNaN(double72));
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.0d + "'", double79 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double80));
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(10.015527486617021d, (double) (byte) 1, 0.0d, 0.9456205751905904d, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D12 = rotation11.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation18 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D19 = rotation18.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D12, vector3D19);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation22 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D12, (double) 100L);
        double double23 = rotation22.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D30 = rotation29.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation36 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D37 = rotation36.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation38 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D30, vector3D37);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D45 = rotation44.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D52 = rotation51.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation53 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D45, vector3D52);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation54 = rotation38.applyTo(rotation53);
        double double55 = rotation53.getAngle();
        double double56 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation22, rotation53);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation57 = rotation5.applyInverseTo(rotation22);
        double double58 = rotation22.getQ1();
        org.junit.Assert.assertNotNull(vector3D12);
        org.junit.Assert.assertNotNull(vector3D19);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-0.1855270382668764d) + "'", double23 == (-0.1855270382668764d));
        org.junit.Assert.assertNotNull(vector3D30);
        org.junit.Assert.assertNotNull(vector3D37);
        org.junit.Assert.assertNotNull(vector3D45);
        org.junit.Assert.assertNotNull(vector3D52);
        org.junit.Assert.assertNotNull(rotation54);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.5309649148733836d + "'", double56 == 0.5309649148733836d);
        org.junit.Assert.assertNotNull(rotation57);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + (-0.1855270382668764d) + "'", double58 == (-0.1855270382668764d));
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-9.649660284921133d), 0.09949879346007118d, (-0.08683602698544203d), 0.20120377604668613d, false);
        double double6 = rotation5.getAngle();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.4861182254705568d + "'", double6 == 0.4861182254705568d);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double13 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation5, rotation12);
        double double14 = rotation12.getAngle();
        double double15 = rotation12.getAngle();
        double double16 = rotation12.getQ0();
        double double17 = rotation12.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation23 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D24 = rotation23.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation30 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D31 = rotation30.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation32 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D24, vector3D31);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D24, (double) 100L);
        double double35 = rotation34.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation36 = rotation34.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        double double43 = rotation42.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = rotation36.applyInverseTo(rotation42);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D45 = rotation42.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D46 = rotation12.applyInverseTo(vector3D45);
        double[][] doubleArray47 = rotation12.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D48 = rotation12.getAxis();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.141592653589793d + "'", double14 == 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 3.141592653589793d + "'", double15 == 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(vector3D24);
        org.junit.Assert.assertNotNull(vector3D31);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-0.0d) + "'", double35 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation36);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertNotNull(rotation44);
        org.junit.Assert.assertNotNull(vector3D45);
        org.junit.Assert.assertNotNull(vector3D46);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertNotNull(vector3D48);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D12 = rotation11.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation18 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D19 = rotation18.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D12, vector3D19);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation22 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D12, (double) 100L);
        double double23 = rotation22.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation24 = rotation5.applyInverseTo(rotation22);
        double double25 = rotation24.getQ1();
        double double26 = rotation24.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = rotation24.revert();
        double[][] doubleArray28 = rotation27.getMatrix();
        double double29 = rotation27.getQ3();
        org.junit.Assert.assertNotNull(vector3D12);
        org.junit.Assert.assertNotNull(vector3D19);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-0.0d) + "'", double23 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 28.016837073341897d + "'", double25 == 28.016837073341897d);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertNotNull(rotation27);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-15.732467415526763d) + "'", double29 == (-15.732467415526763d));
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.geometry.euclidean.threed.Rotation rotation4 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(rotationOrder0, 3.1030128410395363d, 0.00979832648626751d, 0.8660145779932744d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 0, 0.3388903615770647d, 2.566370614359174d, (-0.11924330679564402d), false);
        double double6 = rotation5.getQ1();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.3388903615770647d + "'", double6 == 0.3388903615770647d);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double13 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation5, rotation12);
        double double14 = rotation12.getAngle();
        double double15 = rotation12.getAngle();
        double double16 = rotation12.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation22 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D23 = rotation22.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D30 = rotation29.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation31 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D23, vector3D30);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation37 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation38 = rotation31.applyInverseTo(rotation37);
        double double39 = rotation31.getQ2();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation45 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D46 = rotation45.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D53 = rotation52.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation54 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D46, vector3D53);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation60 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D61 = rotation60.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation67 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D68 = rotation67.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation69 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D61, vector3D68);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation70 = rotation54.applyTo(rotation69);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation76 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 10, 0.0d, (double) (byte) 0, 10.0d, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation77 = rotation54.applyTo(rotation76);
        double double78 = rotation76.getAngle();
        double double79 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation31, rotation76);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation80 = rotation12.applyInverseTo(rotation31);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation81 = rotation80.revert();
        double double82 = rotation80.getQ2();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.141592653589793d + "'", double14 == 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 3.141592653589793d + "'", double15 == 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(vector3D23);
        org.junit.Assert.assertNotNull(vector3D30);
        org.junit.Assert.assertNotNull(rotation38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(vector3D46);
        org.junit.Assert.assertNotNull(vector3D53);
        org.junit.Assert.assertNotNull(vector3D61);
        org.junit.Assert.assertNotNull(vector3D68);
        org.junit.Assert.assertNotNull(rotation70);
        org.junit.Assert.assertNotNull(rotation77);
        org.junit.Assert.assertTrue(Double.isNaN(double78));
        org.junit.Assert.assertTrue(Double.isNaN(double79));
        org.junit.Assert.assertNotNull(rotation80);
        org.junit.Assert.assertNotNull(rotation81);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + (-1.0d) + "'", double82 == (-1.0d));
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double13 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation5, rotation12);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation19 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D20 = rotation19.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D27 = rotation26.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D20, vector3D27);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = rotation28.applyInverseTo(rotation34);
        double double36 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation12, rotation28);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D37 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation43 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D44 = rotation43.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation50 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double51 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation43, rotation50);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation57 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D58 = rotation57.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation64 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double65 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation57, rotation64);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation66 = rotation50.applyInverseTo(rotation57);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation72 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D73 = rotation72.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation79 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D80 = rotation79.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation81 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D73, vector3D80);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation83 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D73, (double) 1L);
        double double84 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation57, rotation83);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation85 = rotation12.applyTo(rotation57);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation86 = rotation57.revert();
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder87 = null;
        double[] doubleArray88 = rotation86.getAngles(rotationOrder87);
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(vector3D20);
        org.junit.Assert.assertNotNull(vector3D27);
        org.junit.Assert.assertNotNull(rotation35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 3.141592653589793d + "'", double36 == 3.141592653589793d);
        org.junit.Assert.assertNotNull(vector3D37);
        org.junit.Assert.assertNotNull(vector3D44);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertNotNull(vector3D58);
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertNotNull(rotation66);
        org.junit.Assert.assertNotNull(vector3D73);
        org.junit.Assert.assertNotNull(vector3D80);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 0.9456205751905904d + "'", double84 == 0.9456205751905904d);
        org.junit.Assert.assertNotNull(rotation85);
        org.junit.Assert.assertNotNull(rotation86);
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray88), "[-0.7853981633974483, 0.0543794248094174, 0.7853981633974483]");
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.geometry.euclidean.threed.Rotation rotation4 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(rotationOrder0, 0.9456205751905904d, 3.7105407653375275d, 3.0926083294473456d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.geometry.euclidean.threed.Rotation rotation4 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(rotationOrder0, (double) (short) 100, 0.009030703746990424d, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double13 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation5, rotation12);
        double double14 = rotation12.getQ1();
        double double15 = rotation12.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation16 = rotation12.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation22 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D23 = rotation22.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D30 = rotation29.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation31 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D23, vector3D30);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation37 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D38 = rotation37.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D45 = rotation44.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D52 = rotation51.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation53 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D45, vector3D52);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D60 = rotation59.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation66 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D67 = rotation66.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation68 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D60, vector3D67);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation69 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D30, vector3D38, vector3D52, vector3D67);
        double double70 = rotation69.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D71 = rotation69.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D72 = rotation12.applyTo(vector3D71);
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 3.141592653589793d + "'", double15 == 3.141592653589793d);
        org.junit.Assert.assertNotNull(rotation16);
        org.junit.Assert.assertNotNull(vector3D23);
        org.junit.Assert.assertNotNull(vector3D30);
        org.junit.Assert.assertNotNull(vector3D38);
        org.junit.Assert.assertNotNull(vector3D45);
        org.junit.Assert.assertNotNull(vector3D52);
        org.junit.Assert.assertNotNull(vector3D60);
        org.junit.Assert.assertNotNull(vector3D67);
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertNotNull(vector3D71);
        org.junit.Assert.assertNotNull(vector3D72);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D28 = rotation27.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D21, vector3D28);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D36 = rotation35.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D43 = rotation42.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D36, vector3D43);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation45 = rotation29.applyTo(rotation44);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation46 = rotation14.applyTo(rotation45);
        double[][] doubleArray47 = rotation46.getMatrix();
        double[][] doubleArray48 = rotation46.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation50 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray48, 0.9950846276202212d);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray48, (double) 0L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation54 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray48, 0.0019129169749405736d);
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertNotNull(vector3D28);
        org.junit.Assert.assertNotNull(vector3D36);
        org.junit.Assert.assertNotNull(vector3D43);
        org.junit.Assert.assertNotNull(rotation45);
        org.junit.Assert.assertNotNull(rotation46);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertNotNull(doubleArray48);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation16 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, (double) 100L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation22 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D29 = rotation28.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D36 = rotation35.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation37 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D29, vector3D36);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D38 = rotation22.applyTo(vector3D29);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D45 = rotation44.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D52 = rotation51.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D59 = rotation58.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation60 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D52, vector3D59);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation62 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D52, (double) 100L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation63 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D45, vector3D52);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation69 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D70 = rotation69.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation71 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D38, vector3D52, vector3D70);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation73 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, (double) (short) -1);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation79 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D80 = rotation79.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation86 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D87 = rotation86.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation88 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D80, vector3D87);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation90 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D80, (double) 1L);
        double double91 = rotation90.getQ2();
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder92 = null;
        double[] doubleArray93 = rotation90.getAngles(rotationOrder92);
        double double94 = rotation90.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D95 = rotation90.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D96 = rotation73.applyInverseTo(vector3D95);
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D29);
        org.junit.Assert.assertNotNull(vector3D36);
        org.junit.Assert.assertNotNull(vector3D38);
        org.junit.Assert.assertNotNull(vector3D45);
        org.junit.Assert.assertNotNull(vector3D52);
        org.junit.Assert.assertNotNull(vector3D59);
        org.junit.Assert.assertNotNull(vector3D70);
        org.junit.Assert.assertNotNull(vector3D80);
        org.junit.Assert.assertNotNull(vector3D87);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 0.33900504942104487d + "'", double91 == 0.33900504942104487d);
        org.junit.Assert.assertNotNull(doubleArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray93), "[2.356194490192345, 0.9999999999999999, -2.356194490192345]");
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 1.0d + "'", double94 == 1.0d);
        org.junit.Assert.assertNotNull(vector3D95);
        org.junit.Assert.assertNotNull(vector3D96);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (short) 100, (-8.717516503499631d), (-0.33900504942104487d), 0.7881701093115122d, false);
        double double6 = rotation5.getAngle();
        double double7 = rotation5.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation8 = rotation5.revert();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D9 = rotation8.getAxis();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-8.717516503499631d) + "'", double7 == (-8.717516503499631d));
        org.junit.Assert.assertNotNull(rotation8);
        org.junit.Assert.assertNotNull(vector3D9);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation16 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, (double) 100L);
        double double17 = rotation16.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation18 = rotation16.revert();
        double double19 = rotation18.getQ3();
        double double20 = rotation18.getAngle();
        double double21 = rotation18.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-0.1855270382668764d), (double) 10, (double) (short) -1, (double) 100.0f, false);
        double[][] doubleArray28 = rotation27.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D35 = rotation34.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation41 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D42 = rotation41.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation43 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D35, vector3D42);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation45 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D35, (double) 100L);
        double double46 = rotation45.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation47 = rotation45.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation53 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        double double54 = rotation53.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation55 = rotation47.applyInverseTo(rotation53);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation56 = rotation27.applyInverseTo(rotation55);
        double double57 = rotation56.getQ1();
        double double58 = rotation56.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = rotation56.revert();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D60 = rotation59.getAxis();
        double double61 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation18, rotation59);
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-0.0d) + "'", double17 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-0.0d) + "'", double19 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.5309649148733836d + "'", double20 == 0.5309649148733836d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-0.9649660284921133d) + "'", double21 == (-0.9649660284921133d));
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertNotNull(vector3D35);
        org.junit.Assert.assertNotNull(vector3D42);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-0.0d) + "'", double46 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation47);
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertNotNull(rotation55);
        org.junit.Assert.assertNotNull(rotation56);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 8960.928033465932d + "'", double57 == 8960.928033465932d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 10924.868355180524d + "'", double58 == 10924.868355180524d);
        org.junit.Assert.assertNotNull(rotation59);
        org.junit.Assert.assertNotNull(vector3D60);
        org.junit.Assert.assertTrue(Double.isNaN(double61));
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-0.26510255275485917d), (double) (-1), 0.0033900293363519126d, 17.66239947251099d, true);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.geometry.euclidean.threed.Rotation rotation4 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(rotationOrder0, (-1.03030303030303d), (double) 100, 0.9949879346007117d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D28 = rotation27.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D21, vector3D28);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D36 = rotation35.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D43 = rotation42.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D36, vector3D43);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation45 = rotation29.applyTo(rotation44);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation46 = rotation14.applyTo(rotation45);
        double[][] doubleArray47 = rotation46.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray47, (double) 10);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray47, (double) (byte) 100);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation53 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray47, 0.0d);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation55 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray47, (double) '#');
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation57 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray47, 0.3388903615770647d);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray47, 10.315768314846704d);
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertNotNull(vector3D28);
        org.junit.Assert.assertNotNull(vector3D36);
        org.junit.Assert.assertNotNull(vector3D43);
        org.junit.Assert.assertNotNull(rotation45);
        org.junit.Assert.assertNotNull(rotation46);
        org.junit.Assert.assertNotNull(doubleArray47);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D12 = rotation11.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation5.applyInverseTo(vector3D12);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation19 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D20 = rotation19.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D27 = rotation26.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D20, vector3D27);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation30 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D20, (double) 1L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation31 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D13, vector3D20);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation33 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D13, 0.31538323081891095d);
        double double34 = rotation33.getQ1();
        double double35 = rotation33.getQ2();
        org.junit.Assert.assertNotNull(vector3D12);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D20);
        org.junit.Assert.assertNotNull(vector3D27);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-0.08683602698544203d) + "'", double34 == (-0.08683602698544203d));
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.13083118839773972d + "'", double35 == 0.13083118839773972d);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.geometry.euclidean.threed.Rotation rotation4 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(rotationOrder0, 0.4690350851266164d, 2.566370614359173d, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(3.1216925665368036d, Double.NaN, 0.33900504942104487d, (double) (-1), true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D12 = rotation11.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation18 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D19 = rotation18.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D12, vector3D19);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D27 = rotation26.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation33 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D34 = rotation33.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D27, vector3D34);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation41 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D42 = rotation41.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation48 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D49 = rotation48.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation50 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D42, vector3D49);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = rotation35.applyTo(rotation50);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = rotation20.applyTo(rotation51);
        double double53 = rotation52.getAngle();
        double double54 = rotation52.getQ3();
        double double55 = rotation52.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation61 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double62 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation52, rotation61);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation63 = rotation5.applyInverseTo(rotation52);
        double double64 = rotation52.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation65 = rotation52.revert();
        org.junit.Assert.assertNotNull(vector3D12);
        org.junit.Assert.assertNotNull(vector3D19);
        org.junit.Assert.assertNotNull(vector3D27);
        org.junit.Assert.assertNotNull(vector3D34);
        org.junit.Assert.assertNotNull(vector3D42);
        org.junit.Assert.assertNotNull(vector3D49);
        org.junit.Assert.assertNotNull(rotation51);
        org.junit.Assert.assertNotNull(rotation52);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 1.0d + "'", double55 == 1.0d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 3.141592653589793d + "'", double62 == 3.141592653589793d);
        org.junit.Assert.assertNotNull(rotation63);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertNotNull(rotation65);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation16 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, (double) 100L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation22 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D29 = rotation28.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D36 = rotation35.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation37 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D29, vector3D36);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D38 = rotation22.applyTo(vector3D29);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D45 = rotation44.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D52 = rotation51.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D59 = rotation58.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation60 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D52, vector3D59);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation62 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D52, (double) 100L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation63 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D45, vector3D52);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation69 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D70 = rotation69.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation71 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D38, vector3D52, vector3D70);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation73 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, (double) (short) -1);
        double double74 = rotation73.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder75 = null;
        double[] doubleArray76 = rotation73.getAngles(rotationOrder75);
        double double77 = rotation73.getAngle();
        double double78 = rotation73.getQ2();
        double[][] doubleArray79 = rotation73.getMatrix();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D29);
        org.junit.Assert.assertNotNull(vector3D36);
        org.junit.Assert.assertNotNull(vector3D38);
        org.junit.Assert.assertNotNull(vector3D45);
        org.junit.Assert.assertNotNull(vector3D52);
        org.junit.Assert.assertNotNull(vector3D59);
        org.junit.Assert.assertNotNull(vector3D70);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + (-0.33900504942104487d) + "'", double74 == (-0.33900504942104487d));
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[-0.7853981633974483, 0.9999999999999999, 0.7853981633974483]");
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 1.0d + "'", double77 == 1.0d);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + (-0.33900504942104487d) + "'", double78 == (-0.33900504942104487d));
        org.junit.Assert.assertNotNull(doubleArray79);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 1.0f, 3.141592653589793d, 0.33900504942104487d, 100.0d, true);
        double double6 = rotation5.getQ2();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0033881901213506493d + "'", double6 == 0.0033881901213506493d);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (short) 10, (double) (byte) 0, 0.01922366120271981d, 0.9949879346007117d, true);
        double double6 = rotation5.getQ0();
        double double7 = rotation5.getQ3();
        java.lang.Class<?> wildcardClass8 = rotation5.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9950846276202212d + "'", double6 == 0.9950846276202212d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.09900971983887621d + "'", double7 == 0.09900971983887621d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double13 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation5, rotation12);
        double double14 = rotation12.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double28 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation20, rotation27);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D35 = rotation34.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation41 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double42 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation34, rotation41);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation43 = rotation27.applyInverseTo(rotation34);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = rotation12.applyTo(rotation34);
        double double45 = rotation12.getQ3();
        double double46 = rotation12.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D47 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D47, (double) 10);
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.141592653589793d + "'", double14 == 3.141592653589793d);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(vector3D35);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertNotNull(rotation43);
        org.junit.Assert.assertNotNull(rotation44);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 1.0d + "'", double45 == 1.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 1.0d + "'", double46 == 1.0d);
        org.junit.Assert.assertNotNull(vector3D47);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (short) -1, (-0.1730129508244783d), (-0.1730129508244783d), (double) 10.0f, false);
        double double6 = rotation5.getQ2();
        double double7 = rotation5.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation13 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D14 = rotation13.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation22 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D14, vector3D21);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = rotation22.applyInverseTo(rotation28);
        double double30 = rotation28.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation36 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D37 = rotation36.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation43 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double44 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation36, rotation43);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation50 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D51 = rotation50.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation57 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D58 = rotation57.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D51, vector3D58);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation65 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation66 = rotation59.applyInverseTo(rotation65);
        double double67 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation43, rotation59);
        double double68 = rotation59.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation69 = rotation28.applyInverseTo(rotation59);
        double double70 = rotation28.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation71 = rotation28.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation72 = rotation5.applyTo(rotation28);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation78 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D79 = rotation78.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation85 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double86 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation78, rotation85);
        double double87 = rotation85.getQ3();
        double double88 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation28, rotation85);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation94 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.3388903615770647d, (double) 0L, 9.649660284921133d, (double) (byte) 100, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation95 = rotation85.applyTo(rotation94);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation96 = rotation94.revert();
        double double97 = rotation96.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D98 = rotation96.getAxis();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.1730129508244783d) + "'", double6 == (-0.1730129508244783d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(vector3D14);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertNotNull(rotation29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 3.141592653589793d + "'", double30 == 3.141592653589793d);
        org.junit.Assert.assertNotNull(vector3D37);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertNotNull(vector3D51);
        org.junit.Assert.assertNotNull(vector3D58);
        org.junit.Assert.assertNotNull(rotation66);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 3.141592653589793d + "'", double67 == 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertNotNull(rotation69);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 10.0d + "'", double70 == 10.0d);
        org.junit.Assert.assertNotNull(rotation71);
        org.junit.Assert.assertNotNull(rotation72);
        org.junit.Assert.assertNotNull(vector3D79);
        org.junit.Assert.assertTrue(Double.isNaN(double86));
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 1.0d + "'", double87 == 1.0d);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 0.0d + "'", double88 == 0.0d);
        org.junit.Assert.assertNotNull(rotation95);
        org.junit.Assert.assertNotNull(rotation96);
        org.junit.Assert.assertTrue("'" + double97 + "' != '" + 0.9953708042224798d + "'", double97 == 0.9953708042224798d);
        org.junit.Assert.assertNotNull(vector3D98);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation21 = rotation14.applyInverseTo(rotation20);
        double double22 = rotation20.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D29 = rotation28.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double36 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation28, rotation35);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D43 = rotation42.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D50 = rotation49.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D43, vector3D50);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation57 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = rotation51.applyInverseTo(rotation57);
        double double59 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation35, rotation51);
        double double60 = rotation51.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation61 = rotation20.applyInverseTo(rotation51);
        double double62 = rotation20.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation63 = rotation20.revert();
        double double64 = rotation63.getAngle();
        double double65 = rotation63.getQ2();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation71 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D72 = rotation71.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation78 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D79 = rotation78.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation80 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D72, vector3D79);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation82 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D72, (double) 100L);
        double double83 = rotation82.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation84 = rotation82.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation90 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        double double91 = rotation90.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation92 = rotation84.applyInverseTo(rotation90);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D93 = rotation90.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D94 = rotation63.applyTo(vector3D93);
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(rotation21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 3.141592653589793d + "'", double22 == 3.141592653589793d);
        org.junit.Assert.assertNotNull(vector3D29);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertNotNull(vector3D43);
        org.junit.Assert.assertNotNull(vector3D50);
        org.junit.Assert.assertNotNull(rotation58);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 3.141592653589793d + "'", double59 == 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertNotNull(rotation61);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 10.0d + "'", double62 == 10.0d);
        org.junit.Assert.assertNotNull(rotation63);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 3.141592653589793d + "'", double64 == 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + (-1.0d) + "'", double65 == (-1.0d));
        org.junit.Assert.assertNotNull(vector3D72);
        org.junit.Assert.assertNotNull(vector3D79);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + (-0.0d) + "'", double83 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation84);
        org.junit.Assert.assertTrue(Double.isNaN(double91));
        org.junit.Assert.assertNotNull(rotation92);
        org.junit.Assert.assertNotNull(vector3D93);
        org.junit.Assert.assertNotNull(vector3D94);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-9.502464466516079d), (-5.7519881927834584E-5d), 0.3376702666693241d, 1.3713780210687443d, false);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        double[][] doubleArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.geometry.euclidean.threed.Rotation rotation2 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray0, 0.9008385330051293d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double13 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation5, rotation12);
        double double14 = rotation12.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double28 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation20, rotation27);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D35 = rotation34.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation41 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double42 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation34, rotation41);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation43 = rotation27.applyInverseTo(rotation34);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = rotation12.applyTo(rotation34);
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder45 = null;
        double[] doubleArray46 = rotation44.getAngles(rotationOrder45);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D53 = rotation52.getAxis();
        double double54 = rotation52.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation55 = rotation44.applyInverseTo(rotation52);
        double double56 = rotation55.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder57 = null;
        double[] doubleArray58 = rotation55.getAngles(rotationOrder57);
        double double59 = rotation55.getQ2();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D60 = rotation55.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder61 = null;
        double[] doubleArray62 = rotation55.getAngles(rotationOrder61);
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder63 = null;
        double[] doubleArray64 = rotation55.getAngles(rotationOrder63);
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.141592653589793d + "'", double14 == 3.141592653589793d);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(vector3D35);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertNotNull(rotation43);
        org.junit.Assert.assertNotNull(rotation44);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-0.31746367442260337, 1.2637009275001716, 3.026886383418824]");
        org.junit.Assert.assertNotNull(vector3D53);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.9996303825414301d + "'", double54 == 0.9996303825414301d);
        org.junit.Assert.assertNotNull(rotation55);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 2.7755575615628914E-17d + "'", double56 == 2.7755575615628914E-17d);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[-0.10236003355258344, 1.9145318380980123, -3.0392326200372097]");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + (-1.03030303030303d) + "'", double59 == (-1.03030303030303d));
        org.junit.Assert.assertNotNull(vector3D60);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[-0.10236003355258344, 1.9145318380980123, -3.0392326200372097]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[-0.10236003355258344, 1.9145318380980123, -3.0392326200372097]");
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double13 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation5, rotation12);
        double double14 = rotation12.getAngle();
        double double15 = rotation12.getAngle();
        double double16 = rotation12.getQ0();
        double double17 = rotation12.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation23 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 0, (double) ' ', (double) (byte) 100, 17.66239947251099d, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation24 = rotation12.applyInverseTo(rotation23);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D25 = rotation24.getAxis();
        double double26 = rotation24.getQ1();
        double double27 = rotation24.getQ2();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.141592653589793d + "'", double14 == 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 3.141592653589793d + "'", double15 == 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(rotation24);
        org.junit.Assert.assertNotNull(vector3D25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.1051177169214896d + "'", double26 == 1.1051177169214896d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.3583484577842444d + "'", double27 == 1.3583484577842444d);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (short) -1, (-0.1730129508244783d), (-0.1730129508244783d), (double) 10.0f, false);
        double double6 = rotation5.getQ2();
        double double7 = rotation5.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation13 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D14 = rotation13.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation22 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D14, vector3D21);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = rotation22.applyInverseTo(rotation28);
        double double30 = rotation28.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation36 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D37 = rotation36.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation43 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double44 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation36, rotation43);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation50 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D51 = rotation50.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation57 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D58 = rotation57.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D51, vector3D58);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation65 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation66 = rotation59.applyInverseTo(rotation65);
        double double67 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation43, rotation59);
        double double68 = rotation59.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation69 = rotation28.applyInverseTo(rotation59);
        double double70 = rotation28.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation71 = rotation28.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation72 = rotation5.applyTo(rotation28);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation78 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D79 = rotation78.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation85 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double86 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation78, rotation85);
        double double87 = rotation85.getQ3();
        double double88 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation28, rotation85);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation94 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.3388903615770647d, (double) 0L, 9.649660284921133d, (double) (byte) 100, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation95 = rotation85.applyTo(rotation94);
        double double96 = rotation95.getQ3();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.1730129508244783d) + "'", double6 == (-0.1730129508244783d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(vector3D14);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertNotNull(rotation29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 3.141592653589793d + "'", double30 == 3.141592653589793d);
        org.junit.Assert.assertNotNull(vector3D37);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertNotNull(vector3D51);
        org.junit.Assert.assertNotNull(vector3D58);
        org.junit.Assert.assertNotNull(rotation66);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 3.141592653589793d + "'", double67 == 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertNotNull(rotation69);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 10.0d + "'", double70 == 10.0d);
        org.junit.Assert.assertNotNull(rotation71);
        org.junit.Assert.assertNotNull(rotation72);
        org.junit.Assert.assertNotNull(vector3D79);
        org.junit.Assert.assertTrue(Double.isNaN(double86));
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 1.0d + "'", double87 == 1.0d);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 0.0d + "'", double88 == 0.0d);
        org.junit.Assert.assertNotNull(rotation95);
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + (-0.9571257961101051d) + "'", double96 == (-0.9571257961101051d));
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double13 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation5, rotation12);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation19 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D20 = rotation19.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D27 = rotation26.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D20, vector3D27);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = rotation28.applyInverseTo(rotation34);
        double double36 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation12, rotation28);
        double double37 = rotation28.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation43 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D44 = rotation43.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation50 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double51 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation43, rotation50);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation57 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D58 = rotation57.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation64 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double65 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation57, rotation64);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation66 = rotation50.applyInverseTo(rotation57);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation72 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation78 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation84 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D85 = rotation84.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation91 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D92 = rotation91.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation93 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D85, vector3D92);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D94 = rotation78.applyTo(vector3D85);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D95 = rotation72.applyTo(vector3D94);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation96 = rotation66.applyTo(rotation72);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation97 = rotation66.revert();
        double double98 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation28, rotation97);
        double double99 = rotation97.getAngle();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(vector3D20);
        org.junit.Assert.assertNotNull(vector3D27);
        org.junit.Assert.assertNotNull(rotation35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 3.141592653589793d + "'", double36 == 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(vector3D44);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertNotNull(vector3D58);
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertNotNull(rotation66);
        org.junit.Assert.assertNotNull(vector3D85);
        org.junit.Assert.assertNotNull(vector3D92);
        org.junit.Assert.assertNotNull(vector3D94);
        org.junit.Assert.assertNotNull(vector3D95);
        org.junit.Assert.assertNotNull(rotation96);
        org.junit.Assert.assertNotNull(rotation97);
        org.junit.Assert.assertTrue(Double.isNaN(double98));
        org.junit.Assert.assertTrue(Double.isNaN(double99));
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D12 = rotation11.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation18 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D19 = rotation18.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D12, vector3D19);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation22 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D12, (double) 100L);
        double double23 = rotation22.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation24 = rotation5.applyInverseTo(rotation22);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation30 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D31 = rotation30.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation37 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D38 = rotation37.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation39 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D31, vector3D38);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation45 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation46 = rotation39.applyInverseTo(rotation45);
        double double47 = rotation39.getQ2();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation53 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D54 = rotation53.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation60 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D61 = rotation60.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation62 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D54, vector3D61);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation68 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D69 = rotation68.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation75 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D76 = rotation75.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation77 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D69, vector3D76);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation78 = rotation62.applyTo(rotation77);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation84 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 10, 0.0d, (double) (byte) 0, 10.0d, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation85 = rotation62.applyTo(rotation84);
        double double86 = rotation84.getAngle();
        double double87 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation39, rotation84);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation88 = rotation24.applyInverseTo(rotation39);
        double double89 = rotation88.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D90 = rotation88.getAxis();
        double double91 = rotation88.getQ3();
        org.junit.Assert.assertNotNull(vector3D12);
        org.junit.Assert.assertNotNull(vector3D19);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-0.0d) + "'", double23 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation24);
        org.junit.Assert.assertNotNull(vector3D31);
        org.junit.Assert.assertNotNull(vector3D38);
        org.junit.Assert.assertNotNull(rotation46);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertNotNull(vector3D54);
        org.junit.Assert.assertNotNull(vector3D61);
        org.junit.Assert.assertNotNull(vector3D69);
        org.junit.Assert.assertNotNull(vector3D76);
        org.junit.Assert.assertNotNull(rotation78);
        org.junit.Assert.assertNotNull(rotation85);
        org.junit.Assert.assertTrue(Double.isNaN(double86));
        org.junit.Assert.assertTrue(Double.isNaN(double87));
        org.junit.Assert.assertNotNull(rotation88);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 28.016837073341897d + "'", double89 == 28.016837073341897d);
        org.junit.Assert.assertNotNull(vector3D90);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + (-15.732467415526763d) + "'", double91 == (-15.732467415526763d));
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.geometry.euclidean.threed.Rotation rotation4 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(rotationOrder0, 0.5309649148733836d, 0.9996303825414301d, 0.9939575503841181d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double13 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation5, rotation12);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation19 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D20 = rotation19.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double27 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation19, rotation26);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = rotation12.applyInverseTo(rotation19);
        double double29 = rotation28.getQ1();
        double double30 = rotation28.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder31 = null;
        double[] doubleArray32 = rotation28.getAngles(rotationOrder31);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation38 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D39 = rotation38.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation45 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D46 = rotation45.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation47 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D39, vector3D46);
        double[][] doubleArray48 = rotation47.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation50 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray48, 3.7105407653375275d);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = rotation28.applyTo(rotation50);
        double double52 = rotation50.getQ2();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(vector3D20);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(rotation28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.015527486617021d + "'", double29 == 10.015527486617021d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.7881701093115122d + "'", double30 == 0.7881701093115122d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-0.31746367442260337, 1.2637009275001716, 3.026886383418824]");
        org.junit.Assert.assertNotNull(vector3D39);
        org.junit.Assert.assertNotNull(vector3D46);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertNotNull(rotation51);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 10, 0.0d, (double) (byte) 0, 10.0d, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation17 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D18 = rotation17.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation24 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D25 = rotation24.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D18, vector3D25);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D18, (double) 100L);
        double double29 = rotation28.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation30 = rotation11.applyInverseTo(rotation28);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation31 = rotation5.applyInverseTo(rotation28);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D32 = rotation28.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation38 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D45 = rotation44.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D46 = rotation38.applyInverseTo(vector3D45);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D47 = rotation28.applyTo(vector3D46);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation48 = rotation28.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation54 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D55 = rotation54.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation61 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double62 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation54, rotation61);
        double double63 = rotation61.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation69 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D70 = rotation69.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation76 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double77 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation69, rotation76);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation83 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D84 = rotation83.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation90 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double91 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation83, rotation90);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation92 = rotation76.applyInverseTo(rotation83);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation93 = rotation61.applyTo(rotation83);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D94 = rotation61.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D95 = rotation48.applyTo(vector3D94);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation97 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D95, 0.8906314560963666d);
        org.junit.Assert.assertNotNull(vector3D18);
        org.junit.Assert.assertNotNull(vector3D25);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-0.0d) + "'", double29 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation30);
        org.junit.Assert.assertNotNull(rotation31);
        org.junit.Assert.assertNotNull(vector3D32);
        org.junit.Assert.assertNotNull(vector3D45);
        org.junit.Assert.assertNotNull(vector3D46);
        org.junit.Assert.assertNotNull(vector3D47);
        org.junit.Assert.assertNotNull(rotation48);
        org.junit.Assert.assertNotNull(vector3D55);
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 3.141592653589793d + "'", double63 == 3.141592653589793d);
        org.junit.Assert.assertNotNull(vector3D70);
        org.junit.Assert.assertTrue(Double.isNaN(double77));
        org.junit.Assert.assertNotNull(vector3D84);
        org.junit.Assert.assertTrue(Double.isNaN(double91));
        org.junit.Assert.assertNotNull(rotation92);
        org.junit.Assert.assertNotNull(rotation93);
        org.junit.Assert.assertNotNull(vector3D94);
        org.junit.Assert.assertNotNull(vector3D95);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (-1), 0.0d, (-1.01885404374415d), (-0.5519957795875582d), false);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.47438148773598054d, (-0.11924330679564402d), 0.8890808091523411d, 0.8775825618903728d, false);
        double double6 = rotation5.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) 'a', 0.9985901652033286d, 1.7182776971514875d, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation13 = rotation5.applyTo(rotation12);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.47438148773598054d + "'", double6 == 0.47438148773598054d);
        org.junit.Assert.assertNotNull(rotation13);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation21 = rotation14.applyInverseTo(rotation20);
        double double22 = rotation14.getQ2();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D29 = rotation28.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D36 = rotation35.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation37 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D29, vector3D36);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation43 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D44 = rotation43.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation50 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D51 = rotation50.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D44, vector3D51);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation53 = rotation37.applyTo(rotation52);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 10, 0.0d, (double) (byte) 0, 10.0d, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation60 = rotation37.applyTo(rotation59);
        double double61 = rotation59.getAngle();
        double double62 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation14, rotation59);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D63 = rotation14.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation64 = rotation14.revert();
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder65 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray66 = rotation64.getAngles(rotationOrder65);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.geometry.euclidean.threed.CardanEulerSingularityException; message: Euler angles singularity");
        } catch (org.apache.commons.math.geometry.euclidean.threed.CardanEulerSingularityException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(rotation21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(vector3D29);
        org.junit.Assert.assertNotNull(vector3D36);
        org.junit.Assert.assertNotNull(vector3D44);
        org.junit.Assert.assertNotNull(vector3D51);
        org.junit.Assert.assertNotNull(rotation53);
        org.junit.Assert.assertNotNull(rotation60);
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertNotNull(vector3D63);
        org.junit.Assert.assertNotNull(rotation64);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        double double6 = rotation5.getQ2();
        double double7 = rotation5.getQ2();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D8 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.33900504942104487d, 0.01922366120271981d, Double.NaN, (double) 10L, false);
        double double15 = rotation14.getQ2();
        double[][] doubleArray16 = rotation14.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation17 = rotation5.applyInverseTo(rotation14);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation18 = rotation5.revert();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(vector3D8);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(rotation17);
        org.junit.Assert.assertNotNull(rotation18);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation16 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, (double) 100L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation22 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D29 = rotation28.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D36 = rotation35.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation37 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D29, vector3D36);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D38 = rotation22.applyTo(vector3D29);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D45 = rotation44.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D52 = rotation51.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D59 = rotation58.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation60 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D52, vector3D59);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation62 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D52, (double) 100L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation63 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D45, vector3D52);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation69 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D70 = rotation69.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation71 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D38, vector3D52, vector3D70);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation73 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D52, (double) 1.0f);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation74 = rotation73.revert();
        double double75 = rotation74.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D76 = rotation74.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D77 = rotation74.getAxis();
        double double78 = rotation74.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder79 = null;
        double[] doubleArray80 = rotation74.getAngles(rotationOrder79);
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D29);
        org.junit.Assert.assertNotNull(vector3D36);
        org.junit.Assert.assertNotNull(vector3D38);
        org.junit.Assert.assertNotNull(vector3D45);
        org.junit.Assert.assertNotNull(vector3D52);
        org.junit.Assert.assertNotNull(vector3D59);
        org.junit.Assert.assertNotNull(vector3D70);
        org.junit.Assert.assertNotNull(rotation74);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + (-0.8775825618903728d) + "'", double75 == (-0.8775825618903728d));
        org.junit.Assert.assertNotNull(vector3D76);
        org.junit.Assert.assertNotNull(vector3D77);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + (-0.8775825618903728d) + "'", double78 == (-0.8775825618903728d));
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[-0.7853981633974483, 0.9999999999999999, 0.7853981633974483]");
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation16 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, (double) 100L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation22 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D29 = rotation28.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D36 = rotation35.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation37 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D29, vector3D36);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D38 = rotation22.applyTo(vector3D29);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D45 = rotation44.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D52 = rotation51.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D59 = rotation58.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation60 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D52, vector3D59);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation62 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D52, (double) 100L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation63 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D45, vector3D52);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation69 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D70 = rotation69.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation71 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D38, vector3D52, vector3D70);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation77 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D78 = rotation77.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation84 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D85 = rotation84.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation86 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D78, vector3D85);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation87 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D70, vector3D85);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation88 = rotation87.revert();
        double[][] doubleArray89 = rotation87.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation90 = rotation87.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation96 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 10.0f, 0.7881701093115122d, (-0.1730129508244783d), (double) (byte) 0, true);
        double double97 = rotation96.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation98 = rotation87.applyTo(rotation96);
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D29);
        org.junit.Assert.assertNotNull(vector3D36);
        org.junit.Assert.assertNotNull(vector3D38);
        org.junit.Assert.assertNotNull(vector3D45);
        org.junit.Assert.assertNotNull(vector3D52);
        org.junit.Assert.assertNotNull(vector3D59);
        org.junit.Assert.assertNotNull(vector3D70);
        org.junit.Assert.assertNotNull(vector3D78);
        org.junit.Assert.assertNotNull(vector3D85);
        org.junit.Assert.assertNotNull(rotation88);
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertNotNull(rotation90);
        org.junit.Assert.assertTrue("'" + double97 + "' != '" + 0.0d + "'", double97 == 0.0d);
        org.junit.Assert.assertNotNull(rotation98);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation16 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, (double) 1L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation22 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D23 = rotation22.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D30 = rotation29.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation31 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D23, vector3D30);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation37 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D38 = rotation37.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D45 = rotation44.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D52 = rotation51.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation53 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D45, vector3D52);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D60 = rotation59.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation66 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D67 = rotation66.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation68 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D60, vector3D67);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation69 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D30, vector3D38, vector3D52, vector3D67);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation70 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D52);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation72 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, 10924.868355180524d);
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder73 = null;
        double[] doubleArray74 = rotation72.getAngles(rotationOrder73);
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D23);
        org.junit.Assert.assertNotNull(vector3D30);
        org.junit.Assert.assertNotNull(vector3D38);
        org.junit.Assert.assertNotNull(vector3D45);
        org.junit.Assert.assertNotNull(vector3D52);
        org.junit.Assert.assertNotNull(vector3D60);
        org.junit.Assert.assertNotNull(vector3D67);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[-0.7853981633974483, 1.5908940047765792, 0.7853981633974483]");
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (short) 10, (double) (byte) 0, 0.01922366120271981d, 0.9949879346007117d, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation17 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation23 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D24 = rotation23.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation30 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D31 = rotation30.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation32 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D24, vector3D31);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D33 = rotation17.applyTo(vector3D24);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D34 = rotation11.applyTo(vector3D33);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation36 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D33, (double) 1.0f);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D43 = rotation42.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D50 = rotation49.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D43, vector3D50);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation57 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D58 = rotation57.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation64 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double65 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation57, rotation64);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation71 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D72 = rotation71.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation78 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double79 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation71, rotation78);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation80 = rotation64.applyInverseTo(rotation71);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D81 = rotation80.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation82 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D43, vector3D81);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D83 = rotation36.applyTo(vector3D43);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D84 = rotation5.applyInverseTo(vector3D43);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation86 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D43, (-1.01885404374415d));
        double[][] doubleArray87 = rotation86.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation89 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray87, 9.649660284921133d);
        org.junit.Assert.assertNotNull(vector3D24);
        org.junit.Assert.assertNotNull(vector3D31);
        org.junit.Assert.assertNotNull(vector3D33);
        org.junit.Assert.assertNotNull(vector3D34);
        org.junit.Assert.assertNotNull(vector3D43);
        org.junit.Assert.assertNotNull(vector3D50);
        org.junit.Assert.assertNotNull(vector3D58);
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertNotNull(vector3D72);
        org.junit.Assert.assertTrue(Double.isNaN(double79));
        org.junit.Assert.assertNotNull(rotation80);
        org.junit.Assert.assertNotNull(vector3D81);
        org.junit.Assert.assertNotNull(vector3D83);
        org.junit.Assert.assertNotNull(vector3D84);
        org.junit.Assert.assertNotNull(doubleArray87);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (short) -1, (double) 10.0f, (double) (byte) 100, (-0.005755946541407356d), true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-0.1855270382668764d), (double) '4', (-10.0d), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation17 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D18 = rotation17.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation24 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D25 = rotation24.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D18, vector3D25);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation32 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D33 = rotation32.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation39 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D40 = rotation39.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation41 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D33, vector3D40);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = rotation26.applyTo(rotation41);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation48 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 10, 0.0d, (double) (byte) 0, 10.0d, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = rotation26.applyTo(rotation48);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation50 = rotation49.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation56 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D57 = rotation56.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D58 = rotation50.applyTo(vector3D57);
        double double59 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation11, rotation50);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation60 = rotation5.applyTo(rotation11);
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder61 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray62 = rotation11.getAngles(rotationOrder61);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.geometry.euclidean.threed.CardanEulerSingularityException; message: Euler angles singularity");
        } catch (org.apache.commons.math.geometry.euclidean.threed.CardanEulerSingularityException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vector3D18);
        org.junit.Assert.assertNotNull(vector3D25);
        org.junit.Assert.assertNotNull(vector3D33);
        org.junit.Assert.assertNotNull(vector3D40);
        org.junit.Assert.assertNotNull(rotation42);
        org.junit.Assert.assertNotNull(rotation49);
        org.junit.Assert.assertNotNull(rotation50);
        org.junit.Assert.assertNotNull(vector3D57);
        org.junit.Assert.assertNotNull(vector3D58);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertNotNull(rotation60);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-0.1855270382668764d), (double) 1, Double.NaN, (double) (short) 100, false);
        double double6 = rotation5.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation7 = rotation5.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation13 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D14 = rotation13.getAxis();
        double double15 = rotation13.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D16 = rotation13.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D17 = rotation7.applyInverseTo(vector3D16);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation19 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D16, (double) 10L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation25 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D26 = rotation25.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation32 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D33 = rotation32.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D26, vector3D33);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation40 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D41 = rotation40.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation47 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D48 = rotation47.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D41, vector3D48);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation50 = rotation34.applyTo(rotation49);
        double double51 = rotation49.getAngle();
        double double52 = rotation49.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D59 = rotation58.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation65 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double66 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation58, rotation65);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation72 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D73 = rotation72.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation79 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double80 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation72, rotation79);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation81 = rotation65.applyInverseTo(rotation72);
        double double82 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation49, rotation65);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation83 = rotation19.applyTo(rotation49);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D84 = rotation19.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation86 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D84, 0.119243306795644d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(rotation7);
        org.junit.Assert.assertNotNull(vector3D14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9996303825414301d + "'", double15 == 0.9996303825414301d);
        org.junit.Assert.assertNotNull(vector3D16);
        org.junit.Assert.assertNotNull(vector3D17);
        org.junit.Assert.assertNotNull(vector3D26);
        org.junit.Assert.assertNotNull(vector3D33);
        org.junit.Assert.assertNotNull(vector3D41);
        org.junit.Assert.assertNotNull(vector3D48);
        org.junit.Assert.assertNotNull(rotation50);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertNotNull(vector3D59);
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertNotNull(vector3D73);
        org.junit.Assert.assertTrue(Double.isNaN(double80));
        org.junit.Assert.assertNotNull(rotation81);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 3.141592653589793d + "'", double82 == 3.141592653589793d);
        org.junit.Assert.assertNotNull(rotation83);
        org.junit.Assert.assertNotNull(vector3D84);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (short) -1, 0.7881701093115122d, 0.0d, (-0.0d), false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (short) 100, 0.0d, 0.33900504942104487d, 0.0d, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = rotation5.applyTo(rotation11);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation18 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D19 = rotation18.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation25 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D26 = rotation25.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D19, vector3D26);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation33 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = rotation27.applyInverseTo(rotation33);
        double double35 = rotation27.getQ2();
        double[][] doubleArray36 = rotation27.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation38 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray36, 28.016837073341897d);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D39 = rotation38.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D40 = rotation12.applyTo(vector3D39);
        org.junit.Assert.assertNotNull(rotation12);
        org.junit.Assert.assertNotNull(vector3D19);
        org.junit.Assert.assertNotNull(vector3D26);
        org.junit.Assert.assertNotNull(rotation34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertNotNull(vector3D39);
        org.junit.Assert.assertNotNull(vector3D40);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 10, 28.016837073341897d, 0.01922366120271981d, 0.0d, false);
        double double6 = rotation5.getQ3();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D12 = rotation11.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation18 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D19 = rotation18.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D12, vector3D19);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation5.applyTo(vector3D12);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 10, 0.0d, (double) (byte) 0, 10.0d, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation33 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation39 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D40 = rotation39.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation46 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D47 = rotation46.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation48 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D40, vector3D47);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation50 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D40, (double) 100L);
        double double51 = rotation50.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = rotation33.applyInverseTo(rotation50);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation53 = rotation27.applyInverseTo(rotation50);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation54 = rotation5.applyTo(rotation27);
        double double55 = rotation5.getAngle();
        double double56 = rotation5.getQ3();
        double double57 = rotation5.getQ1();
        double double58 = rotation5.getQ2();
        double double59 = rotation5.getQ1();
        org.junit.Assert.assertNotNull(vector3D12);
        org.junit.Assert.assertNotNull(vector3D19);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertNotNull(vector3D40);
        org.junit.Assert.assertNotNull(vector3D47);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-0.0d) + "'", double51 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation52);
        org.junit.Assert.assertNotNull(rotation53);
        org.junit.Assert.assertNotNull(rotation54);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 3.1216925665368036d + "'", double55 == 3.1216925665368036d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.09949879346007118d + "'", double57 == 0.09949879346007118d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.9949879346007117d + "'", double58 == 0.9949879346007117d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.09949879346007118d + "'", double59 == 0.09949879346007118d);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation16 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, (double) 100L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation22 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D29 = rotation28.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D36 = rotation35.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation37 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D29, vector3D36);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D38 = rotation22.applyTo(vector3D29);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D45 = rotation44.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D52 = rotation51.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D59 = rotation58.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation60 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D52, vector3D59);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation62 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D52, (double) 100L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation63 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D45, vector3D52);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation69 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D70 = rotation69.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation71 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D38, vector3D52, vector3D70);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation77 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D78 = rotation77.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation84 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D85 = rotation84.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation86 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D78, vector3D85);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation87 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D70, vector3D85);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation88 = rotation87.revert();
        double[][] doubleArray89 = rotation87.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation91 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray89, 100.0d);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation93 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray89, 0.5914138605204349d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.geometry.euclidean.threed.Rotation rotation95 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray89, (-9.315457085569747d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.geometry.euclidean.threed.NotARotationMatrixException; message: unable to orthogonalize matrix in 10 iterations");
        } catch (org.apache.commons.math.geometry.euclidean.threed.NotARotationMatrixException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D29);
        org.junit.Assert.assertNotNull(vector3D36);
        org.junit.Assert.assertNotNull(vector3D38);
        org.junit.Assert.assertNotNull(vector3D45);
        org.junit.Assert.assertNotNull(vector3D52);
        org.junit.Assert.assertNotNull(vector3D59);
        org.junit.Assert.assertNotNull(vector3D70);
        org.junit.Assert.assertNotNull(vector3D78);
        org.junit.Assert.assertNotNull(vector3D85);
        org.junit.Assert.assertNotNull(rotation88);
        org.junit.Assert.assertNotNull(doubleArray89);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 0, 3.137766817306627d, 0.5309649148733836d, (double) (-1L), false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation6 = rotation5.revert();
        org.junit.Assert.assertNotNull(rotation6);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (short) 100, (-8.717516503499631d), (-0.33900504942104487d), 0.7881701093115122d, false);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation8 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, 0.20120377604668616d);
        org.junit.Assert.assertNotNull(vector3D6);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation16 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, (double) 100L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation22 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D29 = rotation28.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D36 = rotation35.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation37 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D29, vector3D36);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D38 = rotation22.applyTo(vector3D29);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D45 = rotation44.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D52 = rotation51.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D59 = rotation58.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation60 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D52, vector3D59);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation62 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D52, (double) 100L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation63 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D45, vector3D52);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation69 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D70 = rotation69.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation71 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D38, vector3D52, vector3D70);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation73 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D52, (double) 1.0f);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation74 = rotation73.revert();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D75 = rotation74.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation77 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D75, 0.00979832648626751d);
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D29);
        org.junit.Assert.assertNotNull(vector3D36);
        org.junit.Assert.assertNotNull(vector3D38);
        org.junit.Assert.assertNotNull(vector3D45);
        org.junit.Assert.assertNotNull(vector3D52);
        org.junit.Assert.assertNotNull(vector3D59);
        org.junit.Assert.assertNotNull(vector3D70);
        org.junit.Assert.assertNotNull(rotation74);
        org.junit.Assert.assertNotNull(vector3D75);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D12 = rotation11.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation18 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D19 = rotation18.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D12, vector3D19);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation22 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D12, (double) 100L);
        double double23 = rotation22.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation24 = rotation5.applyInverseTo(rotation22);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation30 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D31 = rotation30.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation37 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D38 = rotation37.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation39 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D31, vector3D38);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation45 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation46 = rotation39.applyInverseTo(rotation45);
        double double47 = rotation39.getQ2();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation53 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D54 = rotation53.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation60 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D61 = rotation60.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation62 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D54, vector3D61);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation68 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D69 = rotation68.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation75 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D76 = rotation75.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation77 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D69, vector3D76);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation78 = rotation62.applyTo(rotation77);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation84 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 10, 0.0d, (double) (byte) 0, 10.0d, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation85 = rotation62.applyTo(rotation84);
        double double86 = rotation84.getAngle();
        double double87 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation39, rotation84);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation88 = rotation24.applyInverseTo(rotation39);
        double double89 = rotation88.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D90 = rotation88.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation92 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D90, (double) (byte) 10);
        double double93 = rotation92.getAngle();
        double double94 = rotation92.getAngle();
        double double95 = rotation92.getQ3();
        org.junit.Assert.assertNotNull(vector3D12);
        org.junit.Assert.assertNotNull(vector3D19);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-0.0d) + "'", double23 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation24);
        org.junit.Assert.assertNotNull(vector3D31);
        org.junit.Assert.assertNotNull(vector3D38);
        org.junit.Assert.assertNotNull(rotation46);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertNotNull(vector3D54);
        org.junit.Assert.assertNotNull(vector3D61);
        org.junit.Assert.assertNotNull(vector3D69);
        org.junit.Assert.assertNotNull(vector3D76);
        org.junit.Assert.assertNotNull(rotation78);
        org.junit.Assert.assertNotNull(rotation85);
        org.junit.Assert.assertTrue(Double.isNaN(double86));
        org.junit.Assert.assertTrue(Double.isNaN(double87));
        org.junit.Assert.assertNotNull(rotation88);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 28.016837073341897d + "'", double89 == 28.016837073341897d);
        org.junit.Assert.assertNotNull(vector3D90);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 2.566370614359174d + "'", double93 == 2.566370614359174d);
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 2.566370614359174d + "'", double94 == 2.566370614359174d);
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 0.12610672980897766d + "'", double95 == 0.12610672980897766d);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(1.0d, (-0.001227201364295339d), 0.33900504942104487d, 3.7105407653375275d, true);
        double double6 = rotation5.getQ3();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9618146808616486d + "'", double6 == 0.9618146808616486d);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D28 = rotation27.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D21, vector3D28);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation30 = rotation14.applyTo(rotation29);
        double double31 = rotation29.getAngle();
        double double32 = rotation29.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation38 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '#', 0.9996303825414301d, (-5.7519881927834584E-5d), (-0.001227201364295339d), true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (short) 10, (double) (short) -1, (double) '4', 0.9996303825414301d, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation45 = rotation38.applyInverseTo(rotation44);
        double double46 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation29, rotation44);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(10.0d, 0.9950846276202212d, (double) '#', (double) 1L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation53 = rotation29.applyTo(rotation52);
        java.lang.Class<?> wildcardClass54 = rotation53.getClass();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertNotNull(vector3D28);
        org.junit.Assert.assertNotNull(rotation30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(rotation45);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertNotNull(rotation53);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double13 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation5, rotation12);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation19 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D20 = rotation19.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double27 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation19, rotation26);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = rotation12.applyInverseTo(rotation19);
        double double29 = rotation12.getQ3();
        double double30 = rotation12.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation36 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D43 = rotation42.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D50 = rotation49.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D43, vector3D50);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D52 = rotation36.applyTo(vector3D43);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation54 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D43, (double) (byte) 0);
        double double55 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation12, rotation54);
        double double56 = rotation54.getQ0();
        double double57 = rotation54.getQ2();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation63 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D64 = rotation63.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation70 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double71 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation63, rotation70);
        double double72 = rotation70.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation73 = rotation54.applyInverseTo(rotation70);
        double double74 = rotation54.getQ3();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(vector3D20);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(rotation28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
        org.junit.Assert.assertNotNull(vector3D43);
        org.junit.Assert.assertNotNull(vector3D50);
        org.junit.Assert.assertNotNull(vector3D52);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 3.141592653589793d + "'", double55 == 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 1.0d + "'", double56 == 1.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertNotNull(vector3D64);
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 3.141592653589793d + "'", double72 == 3.141592653589793d);
        org.junit.Assert.assertNotNull(rotation73);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(8960.928033465932d, 3.1030128410395363d, (-0.280459243752156d), (double) (-1), false);
        double double6 = rotation5.getQ1();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.1030128410395363d + "'", double6 == 3.1030128410395363d);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.7555423460632325d, 9.079262566818354d, (double) (short) 0, (-0.013206542220675752d), true);
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder6 = null;
        double[] doubleArray7 = rotation5.getAngles(rotationOrder6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.5882740995719722, 2.975517459594022, -1.5533185540178212]");
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double13 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation5, rotation12);
        double double14 = rotation12.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D28 = rotation27.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D21, vector3D28);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation31 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D21, (double) 100L);
        double double32 = rotation31.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation33 = rotation31.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation39 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        double double40 = rotation39.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation41 = rotation33.applyInverseTo(rotation39);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D42 = rotation39.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D43 = rotation12.applyInverseTo(vector3D42);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation45 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D42, (double) (byte) 10);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation57 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D58 = rotation57.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation64 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D65 = rotation64.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation66 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D58, vector3D65);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D67 = rotation51.applyTo(vector3D58);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation73 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-0.1855270382668764d), (double) 1, Double.NaN, (double) (short) 100, false);
        double double74 = rotation73.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation75 = rotation73.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation81 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D82 = rotation81.getAxis();
        double double83 = rotation81.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D84 = rotation81.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D85 = rotation75.applyInverseTo(vector3D84);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation87 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D84, (double) 10L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation88 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D67, vector3D84);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D89 = rotation45.applyTo(vector3D67);
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertNotNull(vector3D28);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-0.0d) + "'", double32 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation33);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertNotNull(rotation41);
        org.junit.Assert.assertNotNull(vector3D42);
        org.junit.Assert.assertNotNull(vector3D43);
        org.junit.Assert.assertNotNull(vector3D58);
        org.junit.Assert.assertNotNull(vector3D65);
        org.junit.Assert.assertNotNull(vector3D67);
        org.junit.Assert.assertTrue(Double.isNaN(double74));
        org.junit.Assert.assertNotNull(rotation75);
        org.junit.Assert.assertNotNull(vector3D82);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 0.9996303825414301d + "'", double83 == 0.9996303825414301d);
        org.junit.Assert.assertNotNull(vector3D84);
        org.junit.Assert.assertNotNull(vector3D85);
        org.junit.Assert.assertNotNull(vector3D89);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        double[][] doubleArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.geometry.euclidean.threed.Rotation rotation2 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray0, 3.1031429627612512d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 0, (double) 'a', (-0.009949438965141721d), 8960.928033465932d, false);
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = rotation5.getAngles(rotationOrder6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.geometry.euclidean.threed.CardanEulerSingularityException; message: Euler angles singularity");
        } catch (org.apache.commons.math.geometry.euclidean.threed.CardanEulerSingularityException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation16 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, (double) 100L);
        double double17 = rotation16.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation18 = rotation16.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation24 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        double double25 = rotation24.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation26 = rotation18.applyInverseTo(rotation24);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation32 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation38 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D45 = rotation44.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D52 = rotation51.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation53 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D45, vector3D52);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D54 = rotation38.applyTo(vector3D45);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D55 = rotation32.applyTo(vector3D54);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D56 = rotation24.applyInverseTo(vector3D55);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D55, 0.01922366120271981d);
        double double59 = rotation58.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation65 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 10, 0.0d, (double) (byte) 0, 10.0d, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation71 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation77 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D78 = rotation77.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation84 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D85 = rotation84.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation86 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D78, vector3D85);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation88 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D78, (double) 100L);
        double double89 = rotation88.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation90 = rotation71.applyInverseTo(rotation88);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation91 = rotation65.applyInverseTo(rotation88);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D92 = rotation88.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation93 = rotation58.applyTo(rotation88);
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder94 = null;
        double[] doubleArray95 = rotation93.getAngles(rotationOrder94);
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-0.0d) + "'", double17 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation18);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(rotation26);
        org.junit.Assert.assertNotNull(vector3D45);
        org.junit.Assert.assertNotNull(vector3D52);
        org.junit.Assert.assertNotNull(vector3D54);
        org.junit.Assert.assertNotNull(vector3D55);
        org.junit.Assert.assertNotNull(vector3D56);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.01922366120271981d + "'", double59 == 0.01922366120271981d);
        org.junit.Assert.assertNotNull(vector3D78);
        org.junit.Assert.assertNotNull(vector3D85);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + (-0.0d) + "'", double89 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation90);
        org.junit.Assert.assertNotNull(rotation91);
        org.junit.Assert.assertNotNull(vector3D92);
        org.junit.Assert.assertNotNull(rotation93);
        org.junit.Assert.assertNotNull(doubleArray95);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray95), "[-0.8079898914315989, 0.5433341716277834, 0.8139160815992001]");
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D28 = rotation27.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D21, vector3D28);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D36 = rotation35.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D43 = rotation42.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation44 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D36, vector3D43);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation45 = rotation29.applyTo(rotation44);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation46 = rotation14.applyTo(rotation45);
        double[][] doubleArray47 = rotation46.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray47, (double) '4');
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation51 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray47, (double) '4');
        double double52 = rotation51.getQ2();
        double double53 = rotation51.getQ2();
        double[][] doubleArray54 = rotation51.getMatrix();
        org.junit.Assert.assertNotNull(vector3D6);
        org.junit.Assert.assertNotNull(vector3D13);
        org.junit.Assert.assertNotNull(vector3D21);
        org.junit.Assert.assertNotNull(vector3D28);
        org.junit.Assert.assertNotNull(vector3D36);
        org.junit.Assert.assertNotNull(vector3D43);
        org.junit.Assert.assertNotNull(rotation45);
        org.junit.Assert.assertNotNull(rotation46);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray54);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(3.141592653589793d, (-8.717516503499631d), 9.999000062556641d, 10.0d, true);
        double double6 = rotation5.getQ2();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 10, 0.0d, (double) (byte) 0, 10.0d, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation18 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (byte) 100, (double) 10L, (double) (short) 100, (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation24 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D25 = rotation24.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation31 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D32 = rotation31.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation33 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D25, vector3D32);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D25, (double) 100L);
        double double36 = rotation35.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation37 = rotation18.applyInverseTo(rotation35);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation38 = rotation12.applyInverseTo(rotation35);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation39 = rotation38.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation40 = rotation39.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation46 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D53 = rotation52.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D54 = rotation46.applyInverseTo(vector3D53);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation56 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D54, (-0.6780618572586967d));
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D57 = rotation39.applyTo(vector3D54);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D58 = rotation5.applyInverseTo(vector3D57);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5914138605204349d + "'", double6 == 0.5914138605204349d);
        org.junit.Assert.assertNotNull(vector3D25);
        org.junit.Assert.assertNotNull(vector3D32);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-0.0d) + "'", double36 == (-0.0d));
        org.junit.Assert.assertNotNull(rotation37);
        org.junit.Assert.assertNotNull(rotation38);
        org.junit.Assert.assertNotNull(rotation39);
        org.junit.Assert.assertNotNull(rotation40);
        org.junit.Assert.assertNotNull(vector3D53);
        org.junit.Assert.assertNotNull(vector3D54);
        org.junit.Assert.assertNotNull(vector3D57);
        org.junit.Assert.assertNotNull(vector3D58);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-100.0d), 0.011384871683009012d, 8.9388072154218E-4d, (-0.16026520139361466d), false);
    }
}

