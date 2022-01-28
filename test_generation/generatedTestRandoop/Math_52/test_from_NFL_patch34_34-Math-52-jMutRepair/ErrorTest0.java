import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
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
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D84 = rotation29.applyInverseTo(vector3D52);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation86 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D52, 0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D6 and vector3D84", vector3D6.equals(vector3D84) ? vector3D6.hashCode() == vector3D84.hashCode() : true);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
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
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D53 = rotation52.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D54 = rotation46.applyTo(vector3D53);
        double double55 = rotation46.getQ2();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D6 and vector3D54", vector3D6.equals(vector3D54) ? vector3D6.hashCode() == vector3D54.hashCode() : true);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
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
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D84 = rotation29.applyInverseTo(vector3D52);
        double[][] doubleArray85 = rotation29.getMatrix();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D6 and vector3D84", vector3D6.equals(vector3D84) ? vector3D6.hashCode() == vector3D84.hashCode() : true);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
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
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D53 = rotation52.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D54 = rotation46.applyTo(vector3D53);
        double double55 = rotation46.getQ1();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D6 and vector3D54", vector3D6.equals(vector3D54) ? vector3D6.hashCode() == vector3D54.hashCode() : true);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation19 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D20 = rotation19.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation21 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D13, vector3D20);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation23 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D13, (double) 100L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation24 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation30 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D31 = rotation30.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation37 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D38 = rotation37.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation39 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D31, vector3D38);
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
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation71 = rotation39.applyTo(rotation70);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation77 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D78 = rotation77.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D79 = rotation71.applyTo(vector3D78);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D80 = rotation24.applyInverseTo(vector3D78);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D6 and vector3D79", vector3D6.equals(vector3D79) ? vector3D6.hashCode() == vector3D79.hashCode() : true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
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
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D53 = rotation52.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D54 = rotation46.applyTo(vector3D53);
        java.lang.Class<?> wildcardClass55 = vector3D53.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D6 and vector3D54", vector3D6.equals(vector3D54) ? vector3D6.hashCode() == vector3D54.hashCode() : true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
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
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation53 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D60 = rotation59.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation66 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D67 = rotation66.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation68 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D60, vector3D67);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D69 = rotation53.applyTo(vector3D60);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D70 = rotation46.applyInverseTo(vector3D60);
        double[][] doubleArray71 = rotation46.getMatrix();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D6 and vector3D70", vector3D6.equals(vector3D70) ? vector3D6.hashCode() == vector3D70.hashCode() : true);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
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
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation53 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D60 = rotation59.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation66 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D67 = rotation66.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation68 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D60, vector3D67);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D69 = rotation53.applyTo(vector3D60);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D70 = rotation46.applyInverseTo(vector3D60);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation72 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D70, (double) 1L);
        double double73 = rotation72.getQ1();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D6 and vector3D70", vector3D6.equals(vector3D70) ? vector3D6.hashCode() == vector3D70.hashCode() : true);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
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
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D53 = rotation52.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D54 = rotation46.applyTo(vector3D53);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation56 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D53, (double) (short) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D6 and vector3D54", vector3D6.equals(vector3D54) ? vector3D6.hashCode() == vector3D54.hashCode() : true);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
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
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation53 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D60 = rotation59.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation66 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D67 = rotation66.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation68 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D60, vector3D67);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D69 = rotation53.applyTo(vector3D60);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D70 = rotation46.applyInverseTo(vector3D60);
        double double71 = rotation46.getQ1();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D6 and vector3D70", vector3D6.equals(vector3D70) ? vector3D6.hashCode() == vector3D70.hashCode() : true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
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
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D53 = rotation52.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D54 = rotation46.applyTo(vector3D53);
        double[][] doubleArray55 = rotation46.getMatrix();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D6 and vector3D54", vector3D6.equals(vector3D54) ? vector3D6.hashCode() == vector3D54.hashCode() : true);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
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
        double double34 = rotation32.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation40 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D41 = rotation40.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation47 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D48 = rotation47.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D41, vector3D48);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation55 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D56 = rotation55.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation62 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D63 = rotation62.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation64 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D56, vector3D63);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation70 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D71 = rotation70.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation77 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D78 = rotation77.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation79 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D71, vector3D78);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation80 = rotation64.applyTo(rotation79);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation81 = rotation49.applyTo(rotation80);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation87 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D88 = rotation87.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D89 = rotation81.applyTo(vector3D88);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation91 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D89, (double) 0.0f);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation92 = rotation32.applyInverseTo(rotation91);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D18 and vector3D89", vector3D18.equals(vector3D89) ? vector3D18.hashCode() == vector3D89.hashCode() : true);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
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
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation53 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D60 = rotation59.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation66 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D67 = rotation66.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation68 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D60, vector3D67);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D69 = rotation53.applyTo(vector3D60);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D70 = rotation46.applyInverseTo(vector3D60);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation72 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D60, (double) '#');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D6 and vector3D70", vector3D6.equals(vector3D70) ? vector3D6.hashCode() == vector3D70.hashCode() : true);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
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
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D53 = rotation52.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D54 = rotation46.applyTo(vector3D53);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation55 = rotation46.revert();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D6 and vector3D54", vector3D6.equals(vector3D54) ? vector3D6.hashCode() == vector3D54.hashCode() : true);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
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
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D53 = rotation52.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D54 = rotation46.applyTo(vector3D53);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation56 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D54, (double) 0.0f);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation62 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation68 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D69 = rotation68.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation75 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D76 = rotation75.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation77 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D69, vector3D76);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D78 = rotation62.applyTo(vector3D69);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D79 = rotation56.applyTo(vector3D69);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D6 and vector3D54", vector3D6.equals(vector3D54) ? vector3D6.hashCode() == vector3D54.hashCode() : true);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
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
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation53 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D60 = rotation59.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation66 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D67 = rotation66.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation68 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D60, vector3D67);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D69 = rotation53.applyTo(vector3D60);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D70 = rotation46.applyInverseTo(vector3D60);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation72 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D70, (double) 1L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation74 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D70, (double) (-1.0f));
        double double75 = rotation74.getQ3();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D6 and vector3D70", vector3D6.equals(vector3D70) ? vector3D6.hashCode() == vector3D70.hashCode() : true);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
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
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D53 = rotation52.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D54 = rotation46.applyTo(vector3D53);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation56 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D54, (double) 0.0f);
        double double57 = rotation56.getAngle();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D6 and vector3D54", vector3D6.equals(vector3D54) ? vector3D6.hashCode() == vector3D54.hashCode() : true);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
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
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation53 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D60 = rotation59.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation66 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D67 = rotation66.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation68 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D60, vector3D67);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D69 = rotation53.applyTo(vector3D60);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D70 = rotation46.applyInverseTo(vector3D60);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation72 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D70, (double) 1L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation74 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D70, (double) (-1.0f));
        double double75 = rotation74.getAngle();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D6 and vector3D70", vector3D6.equals(vector3D70) ? vector3D6.hashCode() == vector3D70.hashCode() : true);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
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
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation80 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D81 = rotation80.getAxis();
        double double82 = rotation80.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D83 = rotation80.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation84 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D74, vector3D83);
        double double85 = rotation84.getAngle();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D9 and vector3D74", vector3D9.equals(vector3D74) ? vector3D9.hashCode() == vector3D74.hashCode() : true);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
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
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation53 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D60 = rotation59.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation66 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D67 = rotation66.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation68 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D60, vector3D67);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D69 = rotation53.applyTo(vector3D60);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D70 = rotation46.applyInverseTo(vector3D60);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation71 = rotation46.revert();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D6 and vector3D70", vector3D6.equals(vector3D70) ? vector3D6.hashCode() == vector3D70.hashCode() : true);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation0 = org.apache.commons.math.geometry.euclidean.threed.Rotation.IDENTITY;
        double double1 = rotation0.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation7 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D8 = rotation7.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D15 = rotation14.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation16 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D8, vector3D15);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation22 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D23 = rotation22.getAxis();
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
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation54 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D15, vector3D23, vector3D37, vector3D52);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation56 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D52, 1.0d);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D52, (double) 10);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D59 = rotation0.applyInverseTo(vector3D52);
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
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation90 = rotation74.applyTo(rotation89);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation96 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) 10, 0.0d, (double) (byte) 0, 10.0d, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation97 = rotation74.applyTo(rotation96);
        double double98 = rotation96.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation99 = rotation0.applyTo(rotation96);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D8 and vector3D59", vector3D8.equals(vector3D59) ? vector3D8.hashCode() == vector3D59.hashCode() : true);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
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
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation53 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D60 = rotation59.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation66 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D67 = rotation66.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation68 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D60, vector3D67);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D69 = rotation53.applyTo(vector3D60);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D70 = rotation46.applyInverseTo(vector3D60);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation72 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D60, (double) (-1L));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D6 and vector3D70", vector3D6.equals(vector3D70) ? vector3D6.hashCode() == vector3D70.hashCode() : true);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
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
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation76 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D55, 0.20120377604668613d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D9 and vector3D74", vector3D9.equals(vector3D74) ? vector3D9.hashCode() == vector3D74.hashCode() : true);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation21 = rotation14.applyInverseTo(rotation20);
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
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation57 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D58 = rotation57.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation64 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D65 = rotation64.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation66 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D58, vector3D65);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation67 = rotation51.applyTo(rotation66);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation68 = rotation36.applyTo(rotation67);
        double[][] doubleArray69 = rotation68.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation75 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation81 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D82 = rotation81.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation88 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D89 = rotation88.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation90 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D82, vector3D89);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D91 = rotation75.applyTo(vector3D82);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D92 = rotation68.applyInverseTo(vector3D82);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation94 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D92, (double) 1L);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D95 = rotation20.applyTo(vector3D92);
        double[][] doubleArray96 = rotation20.getMatrix();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D6 and vector3D92", vector3D6.equals(vector3D92) ? vector3D6.hashCode() == vector3D92.hashCode() : true);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
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
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation53 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D60 = rotation59.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation66 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D67 = rotation66.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation68 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D60, vector3D67);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D69 = rotation53.applyTo(vector3D60);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D70 = rotation46.applyInverseTo(vector3D60);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation72 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D70, 0.0d);
        double double73 = rotation72.getAngle();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D6 and vector3D70", vector3D6.equals(vector3D70) ? vector3D6.hashCode() == vector3D70.hashCode() : true);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) 0, 100.0d, (double) (short) 100, false);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        double[][] doubleArray7 = rotation5.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation8 = org.apache.commons.math.geometry.euclidean.threed.Rotation.IDENTITY;
        double double9 = rotation8.getQ3();
        double double10 = rotation8.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation16 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D17 = rotation16.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation23 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D24 = rotation23.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation25 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D17, vector3D24);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation31 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D32 = rotation31.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation38 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D39 = rotation38.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation40 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D32, vector3D39);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation41 = rotation25.applyTo(rotation40);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation47 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D48 = rotation47.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation54 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D55 = rotation54.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation56 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D48, vector3D55);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation62 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D63 = rotation62.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation69 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D70 = rotation69.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation76 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D77 = rotation76.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation78 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D70, vector3D77);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation84 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D85 = rotation84.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation91 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D92 = rotation91.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation93 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D85, vector3D92);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation94 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D55, vector3D63, vector3D77, vector3D92);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D95 = rotation40.applyInverseTo(vector3D63);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation97 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D95, (double) (short) 0);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D98 = rotation8.applyTo(vector3D95);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D99 = rotation5.applyTo(vector3D95);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D17 and vector3D98", vector3D17.equals(vector3D98) ? vector3D17.hashCode() == vector3D98.hashCode() : true);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
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
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D84 = rotation29.applyInverseTo(vector3D52);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation86 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D84, (double) (short) 0);
        double double87 = rotation86.getAngle();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D6 and vector3D84", vector3D6.equals(vector3D84) ? vector3D6.hashCode() == vector3D84.hashCode() : true);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double13 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation5, rotation12);
        double double14 = rotation12.getAngle();
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
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation50 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D51 = rotation50.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation57 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D58 = rotation57.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D51, vector3D58);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation60 = rotation44.applyTo(rotation59);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation61 = rotation29.applyTo(rotation60);
        double[][] doubleArray62 = rotation61.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation64 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray62, (double) 10);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation66 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray62, (double) (byte) 100);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation72 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D73 = rotation72.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation79 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double80 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation72, rotation79);
        double double81 = rotation79.getAngle();
        double double82 = rotation79.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D83 = rotation79.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation89 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D90 = rotation89.getAxis();
        double double91 = rotation89.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D92 = rotation89.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation93 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D83, vector3D92);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D94 = rotation66.applyTo(vector3D92);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation95 = rotation12.applyInverseTo(rotation66);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D6 and vector3D94", vector3D6.equals(vector3D94) ? vector3D6.hashCode() == vector3D94.hashCode() : true);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
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
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D84 = rotation29.applyInverseTo(vector3D52);
        double double85 = rotation29.getQ1();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D6 and vector3D84", vector3D6.equals(vector3D84) ? vector3D6.hashCode() == vector3D84.hashCode() : true);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
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
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation53 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D60 = rotation59.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation66 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D67 = rotation66.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation68 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D60, vector3D67);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D69 = rotation53.applyTo(vector3D60);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D70 = rotation46.applyInverseTo(vector3D60);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation72 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D70, (double) 1L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation74 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D70, (-0.8156840252218559d));
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder75 = null;
        double[] doubleArray76 = rotation74.getAngles(rotationOrder75);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D6 and vector3D70", vector3D6.equals(vector3D70) ? vector3D6.hashCode() == vector3D70.hashCode() : true);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
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
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation53 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D60 = rotation59.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation66 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D67 = rotation66.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation68 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D60, vector3D67);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D69 = rotation53.applyTo(vector3D60);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D70 = rotation46.applyInverseTo(vector3D60);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation72 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D70, (double) 1L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation74 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D70, (-0.8156840252218559d));
        double double75 = rotation74.getQ3();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D6 and vector3D70", vector3D6.equals(vector3D70) ? vector3D6.hashCode() == vector3D70.hashCode() : true);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
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
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation57 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D58 = rotation57.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation64 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double65 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation57, rotation64);
        double double66 = rotation64.getAngle();
        double double67 = rotation64.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D68 = rotation64.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation74 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D75 = rotation74.getAxis();
        double double76 = rotation74.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D77 = rotation74.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation78 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D68, vector3D77);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D79 = rotation51.applyTo(vector3D77);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation81 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D77, 116.90457705856772d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D6 and vector3D79", vector3D6.equals(vector3D79) ? vector3D6.hashCode() == vector3D79.hashCode() : true);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (short) 10, (double) (byte) 0, 0.01922366120271981d, 0.9949879346007117d, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
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
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D60 = rotation59.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D61 = rotation53.applyTo(vector3D60);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D62 = rotation5.applyTo(vector3D60);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D13 and vector3D61", vector3D13.equals(vector3D61) ? vector3D13.hashCode() == vector3D61.hashCode() : true);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D12 = rotation11.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation18 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D19 = rotation18.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D12, vector3D19);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation5.applyTo(vector3D12);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation23 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D12, 0.9996303825414301d);
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder24 = null;
        double[] doubleArray25 = rotation23.getAngles(rotationOrder24);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation31 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D32 = rotation31.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation38 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D39 = rotation38.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation40 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D32, vector3D39);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation46 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D47 = rotation46.getAxis();
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
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation78 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D39, vector3D47, vector3D61, vector3D76);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation80 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D76, 1.0d);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D81 = rotation23.applyInverseTo(vector3D76);
        double double82 = rotation23.getQ2();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D12 and vector3D81", vector3D12.equals(vector3D81) ? vector3D12.hashCode() == vector3D81.hashCode() : true);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
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
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation67 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D68 = rotation67.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation74 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D75 = rotation74.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation76 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D68, vector3D75);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D77 = rotation51.applyInverseTo(vector3D68);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation79 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D68, 0.8890808091523411d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D6 and vector3D77", vector3D6.equals(vector3D77) ? vector3D6.hashCode() == vector3D77.hashCode() : true);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
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
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D84 = rotation29.applyInverseTo(vector3D52);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation86 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D52, 0.8890808091523411d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D6 and vector3D84", vector3D6.equals(vector3D84) ? vector3D6.hashCode() == vector3D84.hashCode() : true);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
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
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation57 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D58 = rotation57.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation64 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double65 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation57, rotation64);
        double double66 = rotation64.getAngle();
        double double67 = rotation64.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D68 = rotation64.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation74 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D75 = rotation74.getAxis();
        double double76 = rotation74.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D77 = rotation74.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation78 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D68, vector3D77);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D79 = rotation51.applyTo(vector3D77);
        java.lang.Class<?> wildcardClass80 = rotation51.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D6 and vector3D79", vector3D6.equals(vector3D79) ? vector3D6.hashCode() == vector3D79.hashCode() : true);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
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
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation53 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D60 = rotation59.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation66 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D67 = rotation66.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation68 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D60, vector3D67);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D69 = rotation53.applyTo(vector3D60);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D70 = rotation46.applyInverseTo(vector3D60);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation72 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D70, 0.0d);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation73 = rotation72.revert();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D6 and vector3D70", vector3D6.equals(vector3D70) ? vector3D6.hashCode() == vector3D70.hashCode() : true);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
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
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D84 = rotation29.applyInverseTo(vector3D52);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation86 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D84, (double) (short) 0);
        double double87 = rotation86.getQ0();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D6 and vector3D84", vector3D6.equals(vector3D84) ? vector3D6.hashCode() == vector3D84.hashCode() : true);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D12 = rotation11.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation18 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D19 = rotation18.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D12, vector3D19);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation5.applyTo(vector3D12);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation23 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D12, 0.9996303825414301d);
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder24 = null;
        double[] doubleArray25 = rotation23.getAngles(rotationOrder24);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation31 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D32 = rotation31.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation38 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D39 = rotation38.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation40 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D32, vector3D39);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation46 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D47 = rotation46.getAxis();
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
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation78 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D39, vector3D47, vector3D61, vector3D76);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation80 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D76, 1.0d);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D81 = rotation23.applyInverseTo(vector3D76);
        java.lang.Class<?> wildcardClass82 = rotation23.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D12 and vector3D81", vector3D12.equals(vector3D81) ? vector3D12.hashCode() == vector3D81.hashCode() : true);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
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
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D56 = rotation54.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation62 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D63 = rotation62.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D64 = rotation54.applyTo(vector3D63);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation66 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D63, 0.3388903615770647d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D6 and vector3D64", vector3D6.equals(vector3D64) ? vector3D6.hashCode() == vector3D64.hashCode() : true);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-0.1855270382668764d), (double) 10, (double) (short) -1, (double) 100.0f, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation6 = rotation5.revert();
        double double7 = rotation5.getQ1();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation13 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (short) 10, (double) 10.0f, (-0.1730129508244783d), (double) (-1.0f), true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D14 = rotation13.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D21 = rotation20.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D28 = rotation27.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D21, vector3D28);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation36 = rotation29.applyInverseTo(rotation35);
        double double37 = rotation35.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation43 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D44 = rotation43.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation50 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double51 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation43, rotation50);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation57 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D58 = rotation57.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation64 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D65 = rotation64.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation66 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D58, vector3D65);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation72 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation73 = rotation66.applyInverseTo(rotation72);
        double double74 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation50, rotation66);
        double double75 = rotation66.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation76 = rotation35.applyInverseTo(rotation66);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation82 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D83 = rotation82.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation89 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D90 = rotation89.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation91 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D83, vector3D90);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D92 = rotation66.applyTo(vector3D90);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation93 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D14, vector3D92);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D94 = rotation5.applyTo(vector3D14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D21 and vector3D92", vector3D21.equals(vector3D92) ? vector3D21.hashCode() == vector3D92.hashCode() : true);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
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
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation53 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D60 = rotation59.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation66 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D67 = rotation66.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation68 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D60, vector3D67);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D69 = rotation53.applyTo(vector3D60);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D70 = rotation46.applyInverseTo(vector3D60);
        double double71 = rotation46.getAngle();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D6 and vector3D70", vector3D6.equals(vector3D70) ? vector3D6.hashCode() == vector3D70.hashCode() : true);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation0 = org.apache.commons.math.geometry.euclidean.threed.Rotation.IDENTITY;
        double double1 = rotation0.getQ3();
        double double2 = rotation0.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation8 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D9 = rotation8.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation15 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D16 = rotation15.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation17 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D9, vector3D16);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation23 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D24 = rotation23.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation30 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D31 = rotation30.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation32 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D24, vector3D31);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation33 = rotation17.applyTo(rotation32);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation39 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D40 = rotation39.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation46 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D47 = rotation46.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation48 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D40, vector3D47);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation54 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D55 = rotation54.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation61 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D62 = rotation61.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation68 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D69 = rotation68.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation70 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D62, vector3D69);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation76 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D77 = rotation76.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation83 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D84 = rotation83.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation85 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D77, vector3D84);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation86 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D47, vector3D55, vector3D69, vector3D84);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D87 = rotation32.applyInverseTo(vector3D55);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation89 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D87, (double) (short) 0);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D90 = rotation0.applyTo(vector3D87);
        java.lang.Class<?> wildcardClass91 = vector3D87.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D9 and vector3D90", vector3D9.equals(vector3D90) ? vector3D9.hashCode() == vector3D90.hashCode() : true);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
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
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D84 = rotation29.applyInverseTo(vector3D52);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation86 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D84, (double) (short) 0);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation88 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D84, 10.015527486617021d);
        double double89 = rotation88.getQ2();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D6 and vector3D84", vector3D6.equals(vector3D84) ? vector3D6.hashCode() == vector3D84.hashCode() : true);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (short) -1, 0.7881701093115122d, 0.0d, (-0.0d), false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (short) 100, 0.0d, 0.33900504942104487d, 0.0d, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = rotation5.applyTo(rotation11);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation13 = org.apache.commons.math.geometry.euclidean.threed.Rotation.IDENTITY;
        double double14 = rotation13.getQ3();
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
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation69 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D65, 1.0d);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation71 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D65, (double) 10);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D72 = rotation13.applyInverseTo(vector3D65);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D73 = rotation11.applyInverseTo(vector3D65);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D21 and vector3D72", vector3D21.equals(vector3D72) ? vector3D21.hashCode() == vector3D72.hashCode() : true);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation0 = org.apache.commons.math.geometry.euclidean.threed.Rotation.IDENTITY;
        double double1 = rotation0.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation7 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D8 = rotation7.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D15 = rotation14.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation16 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D8, vector3D15);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation22 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D23 = rotation22.getAxis();
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
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation54 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D15, vector3D23, vector3D37, vector3D52);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation56 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D52, 1.0d);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D52, (double) 10);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D59 = rotation0.applyInverseTo(vector3D52);
        double double60 = rotation0.getQ3();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D8 and vector3D59", vector3D8.equals(vector3D59) ? vector3D8.hashCode() == vector3D59.hashCode() : true);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation0 = org.apache.commons.math.geometry.euclidean.threed.Rotation.IDENTITY;
        double double1 = rotation0.getQ3();
        double double2 = rotation0.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation8 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D9 = rotation8.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation15 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D16 = rotation15.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation17 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D9, vector3D16);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation23 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D24 = rotation23.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation30 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D31 = rotation30.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation32 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D24, vector3D31);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation33 = rotation17.applyTo(rotation32);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation39 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D40 = rotation39.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation46 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D47 = rotation46.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation48 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D40, vector3D47);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation54 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D55 = rotation54.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation61 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D62 = rotation61.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation68 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D69 = rotation68.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation70 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D62, vector3D69);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation76 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D77 = rotation76.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation83 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D84 = rotation83.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation85 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D77, vector3D84);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation86 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D47, vector3D55, vector3D69, vector3D84);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D87 = rotation32.applyInverseTo(vector3D55);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation89 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D87, (double) (short) 0);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D90 = rotation0.applyTo(vector3D87);
        double double91 = rotation0.getAngle();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D9 and vector3D87", vector3D9.equals(vector3D87) ? vector3D9.hashCode() == vector3D87.hashCode() : true);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
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
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D56 = rotation54.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation62 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D63 = rotation62.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D64 = rotation54.applyTo(vector3D63);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation65 = rotation54.revert();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D6 and vector3D64", vector3D6.equals(vector3D64) ? vector3D6.hashCode() == vector3D64.hashCode() : true);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
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
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation80 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D81 = rotation80.getAxis();
        double double82 = rotation80.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D83 = rotation80.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation84 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D74, vector3D83);
        double double85 = rotation84.getQ1();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D9 and vector3D74", vector3D9.equals(vector3D74) ? vector3D9.hashCode() == vector3D74.hashCode() : true);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.09949879346007118d, 0.9996303825414301d, (double) 0L, 10.0d, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (short) 10, (double) 10.0f, (-0.1730129508244783d), (double) (-1.0f), true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D12 = rotation11.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation18 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D19 = rotation18.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation25 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D26 = rotation25.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D19, vector3D26);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation33 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = rotation27.applyInverseTo(rotation33);
        double double35 = rotation33.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation41 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D42 = rotation41.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation48 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double49 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation41, rotation48);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation55 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D56 = rotation55.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation62 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D63 = rotation62.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation64 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D56, vector3D63);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation70 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation71 = rotation64.applyInverseTo(rotation70);
        double double72 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation48, rotation64);
        double double73 = rotation64.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation74 = rotation33.applyInverseTo(rotation64);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation80 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D81 = rotation80.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation87 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D88 = rotation87.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation89 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D81, vector3D88);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D90 = rotation64.applyTo(vector3D88);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation91 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D12, vector3D90);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation92 = rotation5.applyInverseTo(rotation91);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D19 and vector3D90", vector3D19.equals(vector3D90) ? vector3D19.hashCode() == vector3D90.hashCode() : true);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation0 = org.apache.commons.math.geometry.euclidean.threed.Rotation.IDENTITY;
        double double1 = rotation0.getQ3();
        double double2 = rotation0.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation8 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D9 = rotation8.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation15 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D16 = rotation15.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation17 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D9, vector3D16);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation23 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D24 = rotation23.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation30 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D31 = rotation30.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation32 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D24, vector3D31);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation33 = rotation17.applyTo(rotation32);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation39 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D40 = rotation39.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation46 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D47 = rotation46.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation48 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D40, vector3D47);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation54 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D55 = rotation54.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation61 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D62 = rotation61.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation68 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D69 = rotation68.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation70 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D62, vector3D69);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation76 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D77 = rotation76.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation83 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D84 = rotation83.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation85 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D77, vector3D84);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation86 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D47, vector3D55, vector3D69, vector3D84);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D87 = rotation32.applyInverseTo(vector3D55);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation89 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D87, (double) (short) 0);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D90 = rotation0.applyTo(vector3D87);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation92 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D90, 0.9649660284921133d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D9 and vector3D87", vector3D9.equals(vector3D87) ? vector3D9.hashCode() == vector3D87.hashCode() : true);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (short) 10, (double) 10.0f, (-0.1730129508244783d), (double) (-1.0f), true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation19 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D20 = rotation19.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation21 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D13, vector3D20);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = rotation21.applyInverseTo(rotation27);
        double double29 = rotation27.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D36 = rotation35.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double43 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation35, rotation42);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D50 = rotation49.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation56 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D57 = rotation56.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D50, vector3D57);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation64 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation65 = rotation58.applyInverseTo(rotation64);
        double double66 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation42, rotation58);
        double double67 = rotation58.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation68 = rotation27.applyInverseTo(rotation58);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation74 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D75 = rotation74.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation81 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D82 = rotation81.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation83 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D75, vector3D82);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D84 = rotation58.applyTo(vector3D82);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation85 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D84);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation87 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D84, (double) '4');
        double double88 = rotation87.getQ2();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D13 and vector3D84", vector3D13.equals(vector3D84) ? vector3D13.hashCode() == vector3D84.hashCode() : true);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
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
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation50 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray48, 0.05506338499281072d);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation56 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation62 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D63 = rotation62.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation69 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D70 = rotation69.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation71 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D63, vector3D70);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D72 = rotation56.applyTo(vector3D63);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation78 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-0.1855270382668764d), (double) 1, Double.NaN, (double) (short) 100, false);
        double double79 = rotation78.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation80 = rotation78.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation86 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D87 = rotation86.getAxis();
        double double88 = rotation86.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D89 = rotation86.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D90 = rotation80.applyInverseTo(vector3D89);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation92 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D89, (double) 10L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation93 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D72, vector3D89);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D94 = rotation50.applyTo(vector3D89);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D95 = rotation50.getAxis();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D6 and vector3D94", vector3D6.equals(vector3D94) ? vector3D6.hashCode() == vector3D94.hashCode() : true);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
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
        double double27 = rotation24.getQ0();
        double double28 = rotation24.getQ0();
        double[][] doubleArray29 = rotation24.getMatrix();
        double[][] doubleArray30 = rotation24.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation31 = org.apache.commons.math.geometry.euclidean.threed.Rotation.IDENTITY;
        double double32 = rotation31.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation38 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D39 = rotation38.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation45 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D46 = rotation45.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation47 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D39, vector3D46);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation53 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D54 = rotation53.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation60 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D61 = rotation60.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation67 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D68 = rotation67.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation69 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D61, vector3D68);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation75 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D76 = rotation75.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation82 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D83 = rotation82.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation84 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D76, vector3D83);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation85 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D46, vector3D54, vector3D68, vector3D83);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation87 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D83, 1.0d);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation89 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D83, (double) 10);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D90 = rotation31.applyInverseTo(vector3D83);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D91 = rotation24.applyInverseTo(vector3D83);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D6 and vector3D90", vector3D6.equals(vector3D90) ? vector3D6.hashCode() == vector3D90.hashCode() : true);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
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
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation80 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-0.1855270382668764d), (double) 1, Double.NaN, (double) (short) 100, false);
        double double81 = rotation80.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation82 = rotation80.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation88 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D89 = rotation88.getAxis();
        double double90 = rotation88.getQ0();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D91 = rotation88.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D92 = rotation82.applyInverseTo(vector3D91);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation93 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D55, vector3D92);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D9 and vector3D74", vector3D9.equals(vector3D74) ? vector3D9.hashCode() == vector3D74.hashCode() : true);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
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
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation67 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D68 = rotation67.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation74 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D75 = rotation74.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation76 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D68, vector3D75);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D77 = rotation51.applyTo(vector3D75);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation79 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D75, (-0.16026520139361466d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D6 and vector3D77", vector3D6.equals(vector3D77) ? vector3D6.hashCode() == vector3D77.hashCode() : true);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
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
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation82 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D83 = rotation82.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation89 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D90 = rotation89.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation91 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D83, vector3D90);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation93 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D83, 0.0d);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D94 = rotation73.applyTo(vector3D83);
        java.lang.Class<?> wildcardClass95 = vector3D83.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D6 and vector3D94", vector3D6.equals(vector3D94) ? vector3D6.hashCode() == vector3D94.hashCode() : true);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
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
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D84 = rotation29.applyInverseTo(vector3D52);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation86 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D84, (double) (short) 0);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation88 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D84, 10.015527486617021d);
        double[][] doubleArray89 = rotation88.getMatrix();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D6 and vector3D84", vector3D6.equals(vector3D84) ? vector3D6.hashCode() == vector3D84.hashCode() : true);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation14 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D13);
        double[][] doubleArray15 = rotation14.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation17 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray15, 3.7105407653375275d);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation23 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D24 = rotation23.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation30 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D31 = rotation30.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation32 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D24, vector3D31);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D24, (double) 100L);
        double double35 = rotation34.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation36 = rotation34.revert();
        double double37 = rotation36.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D38 = rotation36.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D39 = rotation17.applyInverseTo(vector3D38);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation41 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D39, 0.003388584257121107d);
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder42 = null;
        double[] doubleArray43 = rotation41.getAngles(rotationOrder42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D6 and vector3D39", vector3D6.equals(vector3D39) ? vector3D6.hashCode() == vector3D39.hashCode() : true);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation0 = org.apache.commons.math.geometry.euclidean.threed.Rotation.IDENTITY;
        double double1 = rotation0.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation2 = rotation0.revert();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D3 = rotation2.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D3, 3.1216032962775833d);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation11 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D12 = rotation11.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation18 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D19 = rotation18.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation20 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D12, vector3D19);
        double[][] doubleArray21 = rotation20.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation23 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(doubleArray21, 3.7105407653375275d);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation29 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D30 = rotation29.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation36 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D37 = rotation36.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation38 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D30, vector3D37);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation40 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D30, (double) 100L);
        double double41 = rotation40.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = rotation40.revert();
        double double43 = rotation42.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D44 = rotation42.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D45 = rotation23.applyInverseTo(vector3D44);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation46 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D3, vector3D44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D12 and vector3D45", vector3D12.equals(vector3D45) ? vector3D12.hashCode() == vector3D45.hashCode() : true);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (short) 10, (double) 10.0f, (-0.1730129508244783d), (double) (-1.0f), true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation19 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D20 = rotation19.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation21 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D13, vector3D20);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = rotation21.applyInverseTo(rotation27);
        double double29 = rotation27.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D36 = rotation35.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double43 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation35, rotation42);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D50 = rotation49.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation56 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D57 = rotation56.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D50, vector3D57);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation64 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation65 = rotation58.applyInverseTo(rotation64);
        double double66 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation42, rotation58);
        double double67 = rotation58.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation68 = rotation27.applyInverseTo(rotation58);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation74 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D75 = rotation74.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation81 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D82 = rotation81.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation83 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D75, vector3D82);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D84 = rotation58.applyTo(vector3D82);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation85 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D84);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D86 = rotation85.getAxis();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D13 and vector3D84", vector3D13.equals(vector3D84) ? vector3D13.hashCode() == vector3D84.hashCode() : true);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
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
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D84 = rotation29.applyInverseTo(vector3D52);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation85 = rotation29.revert();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D6 and vector3D84", vector3D6.equals(vector3D84) ? vector3D6.hashCode() == vector3D84.hashCode() : true);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
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
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation67 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D68 = rotation67.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation74 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D75 = rotation74.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation76 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D68, vector3D75);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D77 = rotation51.applyTo(vector3D75);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation79 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D77, (-1.0d));
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder80 = null;
        double[] doubleArray81 = rotation79.getAngles(rotationOrder80);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D6 and vector3D77", vector3D6.equals(vector3D77) ? vector3D6.hashCode() == vector3D77.hashCode() : true);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.09949879346007118d, 0.9996303825414301d, (double) 0L, 10.0d, false);
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
        double[][] doubleArray53 = rotation52.getMatrix();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation65 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D66 = rotation65.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation72 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D73 = rotation72.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation74 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D66, vector3D73);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D75 = rotation59.applyTo(vector3D66);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D76 = rotation52.applyInverseTo(vector3D66);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation78 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D76, (double) 1L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation80 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D76, (-0.8156840252218559d));
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation81 = rotation5.applyInverseTo(rotation80);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D12 and vector3D76", vector3D12.equals(vector3D76) ? vector3D12.hashCode() == vector3D76.hashCode() : true);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
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
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation78 = rotation77.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation84 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D85 = rotation84.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D86 = rotation78.applyTo(vector3D85);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D87 = rotation35.applyInverseTo(vector3D85);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation89 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D85, 116.90457705856772d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D12 and vector3D87", vector3D12.equals(vector3D87) ? vector3D12.hashCode() == vector3D87.hashCode() : true);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
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
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D53 = rotation52.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D54 = rotation46.applyTo(vector3D53);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation56 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D53, 0.28366218546322625d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D6 and vector3D54", vector3D6.equals(vector3D54) ? vector3D6.hashCode() == vector3D54.hashCode() : true);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
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
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation78 = rotation77.revert();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation84 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D85 = rotation84.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D86 = rotation78.applyTo(vector3D85);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D87 = rotation35.applyInverseTo(vector3D85);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation89 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D87, (-8.717516503499631d));
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation90 = rotation89.revert();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D12 and vector3D87", vector3D12.equals(vector3D87) ? vector3D12.hashCode() == vector3D87.hashCode() : true);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
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
        double double75 = rotation0.getQ1();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D9 and vector3D74", vector3D9.equals(vector3D74) ? vector3D9.hashCode() == vector3D74.hashCode() : true);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (short) 10, (double) 10.0f, (-0.1730129508244783d), (double) (-1.0f), true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation19 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D20 = rotation19.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation21 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D13, vector3D20);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = rotation21.applyInverseTo(rotation27);
        double double29 = rotation27.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D36 = rotation35.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double43 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation35, rotation42);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D50 = rotation49.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation56 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D57 = rotation56.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D50, vector3D57);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation64 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation65 = rotation58.applyInverseTo(rotation64);
        double double66 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation42, rotation58);
        double double67 = rotation58.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation68 = rotation27.applyInverseTo(rotation58);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation74 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D75 = rotation74.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation81 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D82 = rotation81.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation83 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D75, vector3D82);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D84 = rotation58.applyTo(vector3D82);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation85 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D84);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation87 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D84, (double) '4');
        org.apache.commons.math.geometry.euclidean.threed.RotationOrder rotationOrder88 = null;
        double[] doubleArray89 = rotation87.getAngles(rotationOrder88);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D13 and vector3D84", vector3D13.equals(vector3D84) ? vector3D13.hashCode() == vector3D84.hashCode() : true);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test71");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (short) 10, (double) 10.0f, (-0.1730129508244783d), (double) (-1.0f), true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation19 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D20 = rotation19.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation21 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D13, vector3D20);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = rotation21.applyInverseTo(rotation27);
        double double29 = rotation27.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D36 = rotation35.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double43 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation35, rotation42);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D50 = rotation49.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation56 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D57 = rotation56.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D50, vector3D57);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation64 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation65 = rotation58.applyInverseTo(rotation64);
        double double66 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation42, rotation58);
        double double67 = rotation58.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation68 = rotation27.applyInverseTo(rotation58);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation74 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D75 = rotation74.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation81 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D82 = rotation81.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation83 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D75, vector3D82);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D84 = rotation58.applyTo(vector3D82);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation85 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D84);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation86 = rotation85.revert();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D13 and vector3D84", vector3D13.equals(vector3D84) ? vector3D13.hashCode() == vector3D84.hashCode() : true);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test72");
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
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation53 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-1.0d), (double) (byte) 10, (double) (byte) 100, (double) 0L, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation59 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D60 = rotation59.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation66 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D67 = rotation66.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation68 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D60, vector3D67);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D69 = rotation53.applyTo(vector3D60);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D70 = rotation46.applyInverseTo(vector3D60);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation72 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D70, (double) 1L);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation74 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D70, (-0.8156840252218559d));
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation76 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D70, 0.9985901652033286d);
        double double77 = rotation76.getQ0();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D6 and vector3D70", vector3D6.equals(vector3D70) ? vector3D6.hashCode() == vector3D70.hashCode() : true);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test73");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation5 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) (short) 10, (double) 10.0f, (-0.1730129508244783d), (double) (-1.0f), true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D6 = rotation5.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation19 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D20 = rotation19.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation21 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D13, vector3D20);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation28 = rotation21.applyInverseTo(rotation27);
        double double29 = rotation27.getAngle();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation35 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D36 = rotation35.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation42 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double43 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation35, rotation42);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation49 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D50 = rotation49.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation56 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D57 = rotation56.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation58 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D50, vector3D57);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation64 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation65 = rotation58.applyInverseTo(rotation64);
        double double66 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation42, rotation58);
        double double67 = rotation58.getQ3();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation68 = rotation27.applyInverseTo(rotation58);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation74 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D75 = rotation74.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation81 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D82 = rotation81.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation83 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D75, vector3D82);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D84 = rotation58.applyTo(vector3D82);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation85 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D6, vector3D84);
        double double86 = rotation85.getAngle();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D13 and vector3D84", vector3D13.equals(vector3D84) ? vector3D13.hashCode() == vector3D84.hashCode() : true);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test74");
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation0 = org.apache.commons.math.geometry.euclidean.threed.Rotation.IDENTITY;
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation6 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((-0.33900504942104487d), (double) 100.0f, (double) 10L, 3.1216925665368036d, true);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation12 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D13 = rotation12.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation19 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D20 = rotation19.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation21 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D13, vector3D20);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation27 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D28 = rotation27.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation34 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double35 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation27, rotation34);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation41 = new org.apache.commons.math.geometry.euclidean.threed.Rotation((double) '4', (double) 1, (double) (short) 1, (double) (short) 0, true);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D42 = rotation41.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation48 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(0.0d, (double) (short) 10, (double) (-1L), (double) 1L, false);
        double double49 = org.apache.commons.math.geometry.euclidean.threed.Rotation.distance(rotation41, rotation48);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation50 = rotation34.applyInverseTo(rotation41);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D51 = rotation50.getAxis();
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation52 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D13, vector3D51);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation54 = new org.apache.commons.math.geometry.euclidean.threed.Rotation(vector3D13, 3.082566122054968d);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D55 = rotation6.applyInverseTo(vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Vector3D vector3D56 = rotation0.applyInverseTo(vector3D13);
        org.apache.commons.math.geometry.euclidean.threed.Rotation rotation57 = rotation0.revert();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector3D13 and vector3D56", vector3D13.equals(vector3D56) ? vector3D13.hashCode() == vector3D56.hashCode() : true);
    }
}

