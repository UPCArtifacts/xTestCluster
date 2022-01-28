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
        double double1 = org.apache.commons.math.util.FastMath.exp(1.3235780930645504d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7568396789787597d + "'", double1 == 3.7568396789787597d);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.22469894983086627d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2285994658896716d + "'", double1 == 0.2285994658896716d);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        double double1 = org.apache.commons.math.util.FastMath.sin(100.00000000000003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5063656411097343d) + "'", double1 == (-0.5063656411097343d));
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        long long2 = org.apache.commons.math.util.FastMath.max((long) ' ', (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        double double2 = org.apache.commons.math.util.FastMath.min(1.263239527598922d, (-0.5440211108893698d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5440211108893698d) + "'", double2 == (-0.5440211108893698d));
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.223372036854776E18d + "'", double1 == 9.223372036854776E18d);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        int int1 = org.apache.commons.math.util.FastMath.abs((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.709975946676697d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 97);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.267831587699267d + "'", double1 == 5.267831587699267d);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 10, (float) 52L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        long long1 = org.apache.commons.math.util.FastMath.round(2.3686469200204927d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.05723320573453925d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2792211365930397d + "'", double1 == 3.2792211365930397d);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.9251475365964139d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-53.00704927389939d) + "'", double1 == (-53.00704927389939d));
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.5504145203048696d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        int int1 = org.apache.commons.math.util.FastMath.abs((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        double double1 = org.apache.commons.math.util.FastMath.asinh(7.930067261567155E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.0d + "'", double1 == 35.0d);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 0, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        double double1 = org.apache.commons.math.util.FastMath.sinh(11013.232874703393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9999999958776927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.47402420806417284d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.8554182836643194d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8554182836643194d) + "'", double2 == (-0.8554182836643194d));
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.2583723393689585d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1217719640679913d + "'", double1 == 1.1217719640679913d);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        double double1 = org.apache.commons.math.util.FastMath.log10(11013.232920103323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.041914824263685d + "'", double1 == 4.041914824263685d);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        long long1 = org.apache.commons.math.util.FastMath.abs(100L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) '#');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 35L + "'", long1 == 35L);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        float float2 = org.apache.commons.math.util.FastMath.max(10.0f, (float) 1L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        long long2 = org.apache.commons.math.util.FastMath.max(3L, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 100, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.9999999999999999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.17364817766693033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.41671114415975286d + "'", double1 == 0.41671114415975286d);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 97, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.2519457609704085d, 0.3964729204944982d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.264102998611546d + "'", double2 == 1.264102998611546d);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        long long2 = org.apache.commons.math.util.FastMath.max(100L, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.8554182836643193d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4251053392695819d + "'", double1 == 0.4251053392695819d);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6483608274590866d + "'", double1 == 0.6483608274590866d);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9171473774587547d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        double double1 = org.apache.commons.math.util.FastMath.tan(5.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.380515006246586d) + "'", double1 == (-3.380515006246586d));
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        double double1 = org.apache.commons.math.util.FastMath.floor(11013.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.0d + "'", double1 == 11013.0d);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 0, 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.6321205588285577d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6842868307608122d) + "'", double1 == (-0.6842868307608122d));
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.6881171418161356E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        double double1 = org.apache.commons.math.util.FastMath.tan(9.307013259236443d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.11831214619987152d) + "'", double1 == (-0.11831214619987152d));
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        int int1 = org.apache.commons.math.util.FastMath.round(100.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        double double1 = org.apache.commons.math.util.FastMath.expm1(34.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5860134523134185E15d + "'", double1 == 1.5860134523134185E15d);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 100, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        float float2 = org.apache.commons.math.util.FastMath.max(100.0f, (float) 1L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        double double1 = org.apache.commons.math.util.FastMath.atanh(28.45884779991685d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 0, 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.2204460492503128E-16d, 1.5467250970042676d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.220446049250313E-16d + "'", double2 == 2.220446049250313E-16d);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        float float2 = org.apache.commons.math.util.FastMath.max(10.0f, (float) 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        double double1 = org.apache.commons.math.util.FastMath.signum(3.2710663101885893d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        long long1 = org.apache.commons.math.util.FastMath.round(1.5708871266543591d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.6321205588285577d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.3887317335324652d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18106042748149917d + "'", double1 == 0.18106042748149917d);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        long long1 = org.apache.commons.math.util.FastMath.round(3.948148009134034E13d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 39481480091340L + "'", long1 == 39481480091340L);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.6881171418161737E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 43.42944819032519d + "'", double1 == 43.42944819032519d);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        double double1 = org.apache.commons.math.util.FastMath.acos(32.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        float float2 = org.apache.commons.math.util.FastMath.max(100.0f, (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5574077246549023d + "'", double1 == 1.5574077246549023d);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.5504145203048696d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.009606545630105158d) + "'", double1 == (-0.009606545630105158d));
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        double double1 = org.apache.commons.math.util.FastMath.asinh(4.041914822473389d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1048285727011695d + "'", double1 == 2.1048285727011695d);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        double double1 = org.apache.commons.math.util.FastMath.exp(9.307013259236443d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11014.999999999998d + "'", double1 == 11014.999999999998d);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(3.7621956910836314d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 215.5579348013961d + "'", double1 == 215.5579348013961d);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.634578497998064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7966043547446022d + "'", double1 == 0.7966043547446022d);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.47402420806417284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6884941597894443d + "'", double1 == 0.6884941597894443d);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        double double1 = org.apache.commons.math.util.FastMath.log1p(35.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5835189384561104d + "'", double1 == 3.5835189384561104d);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        double double1 = org.apache.commons.math.util.FastMath.sinh(36.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1556157735575975E15d + "'", double1 == 2.1556157735575975E15d);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        double double1 = org.apache.commons.math.util.FastMath.expm1(43.42944819032519d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.2638973976934574E18d + "'", double1 == 7.2638973976934574E18d);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) 97.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9867717342662448d + "'", double1 == 1.9867717342662448d);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) 35L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.58351893845611d + "'", double1 == 3.58351893845611d);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.2285994658896716d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        double double1 = org.apache.commons.math.util.FastMath.tan(11013.232874703413d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.5049299044217186d) + "'", double1 == (-2.5049299044217186d));
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.22469894983086625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        float float2 = org.apache.commons.math.util.FastMath.max(1.0f, (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 0, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 9223372036854775807L, (float) (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-53.00704927389939d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.2437141131408894E22d + "'", double1 == 5.2437141131408894E22d);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        double double2 = org.apache.commons.math.util.FastMath.max(4.041914824263685d, (double) 52.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 32);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(11013.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.24855859029184d + "'", double1 == 22.24855859029184d);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.8554182836643193d), 11014.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.1563686078816606d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.3777255673228614d + "'", double1 == 4.3777255673228614d);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        double double1 = org.apache.commons.math.util.FastMath.exp(5557.690612768985d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8713868162390155d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8713868162390155d + "'", double1 == 0.8713868162390155d);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.0030948458264688d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8431391046438417d + "'", double1 == 0.8431391046438417d);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.5467250970042679d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.454505008613144d + "'", double1 == 2.454505008613144d);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.2519457609704085d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        float float1 = org.apache.commons.math.util.FastMath.abs(0.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 22026.465794806718d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        double double1 = org.apache.commons.math.util.FastMath.asin(7.896296018267969E13d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        float float2 = org.apache.commons.math.util.FastMath.min((float) '#', (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2246467991473532E-16d) + "'", double1 == (-1.2246467991473532E-16d));
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 97.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3796077390275217d + "'", double1 == 0.3796077390275217d);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        double double1 = org.apache.commons.math.util.FastMath.log(2005.3522829578812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.6035750265302235d + "'", double1 == 7.6035750265302235d);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        double double1 = org.apache.commons.math.util.FastMath.floor(7.930067261567155E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.93006726156715E14d + "'", double1 == 7.93006726156715E14d);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(5.267831587699267d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7399788154926485d + "'", double1 == 1.7399788154926485d);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        double double1 = org.apache.commons.math.util.FastMath.abs(9.044524487391685E157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.044524487391685E157d + "'", double1 == 9.044524487391685E157d);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.41671114415975286d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.516964265655408d + "'", double1 == 0.516964265655408d);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        double double1 = org.apache.commons.math.util.FastMath.floor(4.3777255673228614d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.264102998611546d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3019079198404987d + "'", double1 == 0.3019079198404987d);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) -1, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        double double2 = org.apache.commons.math.util.FastMath.max(1.1217719640679913d, 1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1217719640679913d + "'", double2 == 1.1217719640679913d);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 10.0f + "'", float1 == 10.0f);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 10, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        double double1 = org.apache.commons.math.util.FastMath.cos(14.899276870949834d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6904492636009615d) + "'", double1 == (-0.6904492636009615d));
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        float float2 = org.apache.commons.math.util.FastMath.max(52.0f, (float) 35L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        double double1 = org.apache.commons.math.util.FastMath.asin(11.147713248144797d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-2.5049299044217186d), 3.399216241149525E248d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-7.369139609590174E-249d) + "'", double2 == (-7.369139609590174E-249d));
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (-1));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        double double1 = org.apache.commons.math.util.FastMath.cos(3.2710663101885893d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9916299884373267d) + "'", double1 == (-0.9916299884373267d));
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.8402785435782614d, 0.6890624663225461d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8402785435782612d + "'", double2 == 1.8402785435782612d);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        double double2 = org.apache.commons.math.util.FastMath.max((double) (short) 1, 28.45884779991685d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 28.45884779991685d + "'", double2 == 28.45884779991685d);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.3686469200204927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.388267471840758d + "'", double1 == 5.388267471840758d);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.516964265655408d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8693235746902677d + "'", double1 == 0.8693235746902677d);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        double double1 = org.apache.commons.math.util.FastMath.log(1477895.5237245467d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.206129690390002d + "'", double1 == 14.206129690390002d);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        double double1 = org.apache.commons.math.util.FastMath.asinh(32.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.15912713462618d + "'", double1 == 4.15912713462618d);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        double double1 = org.apache.commons.math.util.FastMath.sinh(Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 32.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.948148009134034E13d + "'", double1 == 3.948148009134034E13d);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-3.380515006246586d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9659700754028168d) + "'", double1 == (-0.9659700754028168d));
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 100L, (float) 39481480091340L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        double double1 = org.apache.commons.math.util.FastMath.signum(4.691649480399158E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.9982229502979694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.049875621120886d + "'", double1 == 10.049875621120886d);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.11831214619987152d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.454505008613144d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        long long1 = org.apache.commons.math.util.FastMath.round(0.3156563365585749d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.5708871266543591d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.253350360695029d + "'", double1 == 1.253350360695029d);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        int int2 = org.apache.commons.math.util.FastMath.max((int) ' ', (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.09933992780358329d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.691758600279624d + "'", double1 == 5.691758600279624d);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        double double2 = org.apache.commons.math.util.FastMath.max(0.17453292519943295d, 0.6890624663225461d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6890624663225461d + "'", double2 == 0.6890624663225461d);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.6931471805599453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.9754001961551926d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3485292390836008d) + "'", double1 == (-1.3485292390836008d));
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8623188722876839d + "'", double1 == 0.8623188722876839d);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        long long1 = org.apache.commons.math.util.FastMath.round(0.30102999566398114d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(4.248291097914389d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0741466672417709d + "'", double1 == 0.0741466672417709d);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.9982229502979694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.248867972642223d + "'", double1 == 1.248867972642223d);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5574077246549023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9149994957367078d + "'", double1 == 0.9149994957367078d);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        int int2 = org.apache.commons.math.util.FastMath.max(10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.29577951308232d + "'", double1 == 57.29577951308232d);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.0000000000000007d, 104.9439511105971d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000000000000009d + "'", double2 == 1.0000000000000009d);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 100, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 1L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(10.049875621120886d, 0.0507428532869755d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.049875621120885d + "'", double2 == 10.049875621120885d);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.7966043547446022d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.17453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17542037193601015d + "'", double1 == 0.17542037193601015d);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9830787956514044d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017066003704239316d) + "'", double1 == (-0.017066003704239316d));
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 0, (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(7.2638973976934574E18d, Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.2638973976934564E18d + "'", double2 == 7.2638973976934564E18d);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        double double1 = org.apache.commons.math.util.FastMath.log(4.15912713462618d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.425305228849993d + "'", double1 == 1.425305228849993d);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        double double1 = org.apache.commons.math.util.FastMath.expm1(5.298342365610589d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 199.00499987500626d + "'", double1 == 199.00499987500626d);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.5467250970042679d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        long long2 = org.apache.commons.math.util.FastMath.min(1L, 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        double double1 = org.apache.commons.math.util.FastMath.rint(1477895.5237245467d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1477896.0d + "'", double1 == 1477896.0d);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        double double2 = org.apache.commons.math.util.FastMath.max(7.6035750265302235d, 0.7601945740163978d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.6035750265302235d + "'", double2 == 7.6035750265302235d);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.5860134523134298E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.58601345231343E15d + "'", double1 == 1.58601345231343E15d);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.3156563365585749d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.7658461948190802d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 97, (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.7615941559557649d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8726936208978296d + "'", double1 == 0.8726936208978296d);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 1, 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3132616875182228d + "'", double1 == 1.3132616875182228d);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        double double2 = org.apache.commons.math.util.FastMath.max((double) 100.0f, 2.1048285727011695d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 10L, (float) 39481480091340L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.9481478E13f + "'", float2 == 3.9481478E13f);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 10L, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.40767170372406053d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6384917413123372d + "'", double1 == 0.6384917413123372d);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        double double1 = org.apache.commons.math.util.FastMath.atan(11013.232874703393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.570705526935434d + "'", double1 == 1.570705526935434d);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        double double1 = org.apache.commons.math.util.FastMath.cosh(9.306831672164943d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5506.500045400885d + "'", double1 == 5506.500045400885d);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) -1, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.8813735870195429d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6360918665423811d + "'", double1 == 0.6360918665423811d);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(3.141592653589793d, 0.09933992780358329d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1415926535897927d + "'", double2 == 3.1415926535897927d);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(35.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2005.3522829578812d + "'", double1 == 2005.3522829578812d);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-1.3485292390836008d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-77.26503394947866d) + "'", double1 == (-77.26503394947866d));
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(8.881784197001254E-16d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.881784197001252E-16d + "'", double2 == 8.881784197001252E-16d);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.5860134523134185E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        double double1 = org.apache.commons.math.util.FastMath.ceil(10.049875621120885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.0d + "'", double1 == 11.0d);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.5440680443502757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        double double2 = org.apache.commons.math.util.FastMath.max(10.000000000000002d, (-0.11831214619987152d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.000000000000002d + "'", double2 == 10.000000000000002d);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        double double1 = org.apache.commons.math.util.FastMath.log1p(4.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6094379124341003d + "'", double1 == 1.6094379124341003d);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.0d + "'", double1 == 32.0d);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.1556157735575975E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.155615773557597E15d + "'", double1 == 2.155615773557597E15d);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.6842868307608122d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) 2);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0986122886681098d + "'", double1 == 1.0986122886681098d);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        double double1 = org.apache.commons.math.util.FastMath.acos(5.267831587699267d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.8657694832396586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 97, (float) ' ');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.6499429567608755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.866213764556301d + "'", double1 == 0.866213764556301d);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.6384917413123372d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5638717219103803d + "'", double1 == 0.5638717219103803d);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        long long2 = org.apache.commons.math.util.FastMath.max(10L, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        long long1 = org.apache.commons.math.util.FastMath.round(57.29577951308232d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 57L + "'", long1 == 57L);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.3023186765274486d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6347792607040605d + "'", double1 == 3.6347792607040605d);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 0, 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        long long1 = org.apache.commons.math.util.FastMath.round(1.264102998611546d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '4', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.6904492636009615d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5013507798060323d + "'", double1 == 0.5013507798060323d);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        double double1 = org.apache.commons.math.util.FastMath.tan(5.298292365610485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.506844020238002d) + "'", double1 == (-1.506844020238002d));
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.5013507798060323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5013507798060324d + "'", double1 == 0.5013507798060324d);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.0741466672417709d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07414666724177091d + "'", double1 == 0.07414666724177091d);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.4154931988910127d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1469544105044815d + "'", double1 == 1.1469544105044815d);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        long long1 = org.apache.commons.math.util.FastMath.round((double) (-1L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) -1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.0741466672417709d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.27229885648267216d + "'", double1 == 0.27229885648267216d);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-1), (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        double double2 = org.apache.commons.math.util.FastMath.max(1224.999999999999d, (-0.5440211108893698d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1224.999999999999d + "'", double2 == 1224.999999999999d);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-1.5574077246549023d), 0.5716315636979223d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.219022125506721d) + "'", double2 == (-1.219022125506721d));
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 10, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9508218731216449d, (-36.04365338911715d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.157240911549055d + "'", double2 == 6.157240911549055d);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, (double) 57L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 57.0d + "'", double2 == 57.0d);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.5860134523134308E15d, 3.948148009134034E13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5459079327750913d + "'", double2 == 1.5459079327750913d);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.762747174039086d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2461900271072904d + "'", double1 == 0.2461900271072904d);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.5063656411097588d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.008837747656337245d) + "'", double1 == (-0.008837747656337245d));
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(14.206129690390002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4219132975121505d + "'", double1 == 2.4219132975121505d);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) 1L, 2.3686469200204923d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000000000000002d + "'", double2 == 1.0000000000000002d);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 39481480091340L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.32681535598557454d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18.72514057803899d + "'", double1 == 18.72514057803899d);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        double double2 = org.apache.commons.math.util.FastMath.min((double) (byte) 100, 0.6884941597894443d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6884941597894443d + "'", double2 == 0.6884941597894443d);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(28.476411608537198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0537144249814574d + "'", double1 == 3.0537144249814574d);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        double double1 = org.apache.commons.math.util.FastMath.expm1(3.564317279302415E38d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.0000000000000007d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 2147483647, 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        int int2 = org.apache.commons.math.util.FastMath.max((-1), 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.3964729204944982d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7346342576927686d + "'", double1 == 0.7346342576927686d);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0741466672417709d, 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.07414666724177091d + "'", double2 == 0.07414666724177091d);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 114.59155902616465d + "'", double1 == 114.59155902616465d);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.3019079198404987d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.263830819196742d + "'", double1 == 0.263830819196742d);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        int int1 = org.apache.commons.math.util.FastMath.abs(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        double double1 = org.apache.commons.math.util.FastMath.tan(5557.690612768985d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.216499084404722d + "'", double1 == 0.216499084404722d);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.5127742681331149d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6699175736806615d + "'", double1 == 1.6699175736806615d);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        double double1 = org.apache.commons.math.util.FastMath.asinh(11.147713248144797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.106387248181345d + "'", double1 == 3.106387248181345d);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.7658461948190802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6535657774206833d + "'", double1 == 0.6535657774206833d);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.5013507798060323d, (-2.5049299044217186d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.637986554446436d + "'", double2 == 5.637986554446436d);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.6094379124341003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9591348389208239d + "'", double1 == 0.9591348389208239d);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9999999958776927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.175201187282749d + "'", double1 == 1.175201187282749d);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        long long1 = org.apache.commons.math.util.FastMath.abs(3L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 2, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        double double1 = org.apache.commons.math.util.FastMath.acos(3.7621956910836314d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) 52);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5607966601082315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.017453292519943295d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.0461741978670857E-4d) + "'", double1 == (-3.0461741978670857E-4d));
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 0, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        double double2 = org.apache.commons.math.util.FastMath.min(1.7399788154926485d, 199.00499987500626d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7399788154926485d + "'", double2 == 1.7399788154926485d);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        int int2 = org.apache.commons.math.util.FastMath.max((int) ' ', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        double double1 = org.apache.commons.math.util.FastMath.atan(3.7568396789787597d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3106472496723418d + "'", double1 == 1.3106472496723418d);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(4.3777255673228614d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.377725567322862d + "'", double1 == 4.377725567322862d);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.30102999566398114d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.247748258387592d + "'", double1 == 17.247748258387592d);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.0000000000000009d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.540302305868139d + "'", double1 == 0.540302305868139d);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        float float1 = org.apache.commons.math.util.FastMath.abs(52.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 52.0f + "'", float1 == 52.0f);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-1.506844020238002d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        double double1 = org.apache.commons.math.util.FastMath.tan(7.930067261567155E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.632512904931238d) + "'", double1 == (-4.632512904931238d));
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.017453292519943295d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017453292519943295d + "'", double1 == 0.017453292519943295d);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        double double2 = org.apache.commons.math.util.FastMath.max(3.58351893845611d, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.58351893845611d + "'", double2 == 3.58351893845611d);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        double double1 = org.apache.commons.math.util.FastMath.tan(5.267831587699267d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.6112949659561453d) + "'", double1 == (-1.6112949659561453d));
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 57L, (float) 52L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        double double1 = org.apache.commons.math.util.FastMath.log1p(8.881784197001254E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.88178419700125E-16d + "'", double1 == 8.88178419700125E-16d);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        long long1 = org.apache.commons.math.util.FastMath.abs(32L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 32L + "'", long1 == 32L);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        double double2 = org.apache.commons.math.util.FastMath.max(1.883259400089535E100d, 18.72514057803899d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.883259400089535E100d + "'", double2 == 1.883259400089535E100d);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.570705526935434d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232874695796d + "'", double1 == 11013.232874695796d);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7853981633974483d) + "'", double1 == (-0.7853981633974483d));
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.5440680443502757d, 5.298292365610485d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2835736696417744d + "'", double2 == 0.2835736696417744d);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.155615773557597E15d, 7.896296018267969E13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        double double1 = org.apache.commons.math.util.FastMath.log(0.6535657774206833d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4253120969346567d) + "'", double1 == (-0.4253120969346567d));
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.8813735870195429d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.1317761108019555d) + "'", double1 == (-2.1317761108019555d));
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.8745129512124437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7672312144687762d + "'", double1 == 0.7672312144687762d);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) 97.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3383347192042695E42d + "'", double1 == 1.3383347192042695E42d);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        long long1 = org.apache.commons.math.util.FastMath.round(10.049875621120886d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 35.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        double double2 = org.apache.commons.math.util.FastMath.pow(28.4764116085372d, (double) 10L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.506328628316938E14d + "'", double2 == 3.506328628316938E14d);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.4210854715202004E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1554436208840472E-30d + "'", double1 == 3.1554436208840472E-30d);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        double double1 = org.apache.commons.math.util.FastMath.signum(4.644483341943245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.2285994658896716d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22665386569399096d + "'", double1 == 0.22665386569399096d);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        long long2 = org.apache.commons.math.util.FastMath.min(57L, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, (double) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        double double1 = org.apache.commons.math.util.FastMath.log(8.881784197001254E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-34.657359027997266d) + "'", double1 == (-34.657359027997266d));
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 35, 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.7212254887267799d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2715542753135176d + "'", double1 == 1.2715542753135176d);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        double double1 = org.apache.commons.math.util.FastMath.atan((-34.657359027997266d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.541950429394781d) + "'", double1 == (-1.541950429394781d));
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9508218731216449d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9751009553485449d + "'", double1 == 0.9751009553485449d);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.3019079198404987d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.29750002275985665d + "'", double1 == 0.29750002275985665d);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.6483608274590866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.217652850343311d + "'", double1 == 1.217652850343311d);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.5860134523134308E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.0871877068532832E16d + "'", double1 == 9.0871877068532832E16d);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        long long1 = org.apache.commons.math.util.FastMath.round(4.644483341943245d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8813735870195429d + "'", double1 == 0.8813735870195429d);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        double double1 = org.apache.commons.math.util.FastMath.tanh(8.88178419700125E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.88178419700125E-16d + "'", double1 == 8.88178419700125E-16d);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 9223372036854775807L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.752220392306203d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7370361196913022d + "'", double1 == 1.7370361196913022d);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        double double1 = org.apache.commons.math.util.FastMath.log(1.0000000000000018d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002489E-15d + "'", double1 == 1.7763568394002489E-15d);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 0, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.5607966601082315d, 2005.3522829578812d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5607966601082317d + "'", double2 == 1.5607966601082317d);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.3490760817142498d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9975366607028198d + "'", double1 == 0.9975366607028198d);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        double double1 = org.apache.commons.math.util.FastMath.signum((-1.1752011936438014d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5607966601082315d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        double double1 = org.apache.commons.math.util.FastMath.abs((-36.04365338911715d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 36.04365338911715d + "'", double1 == 36.04365338911715d);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        long long1 = org.apache.commons.math.util.FastMath.round((-53.00704927389939d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-53L) + "'", long1 == (-53L));
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.4251053392695819d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4380253164811876d + "'", double1 == 0.4380253164811876d);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        double double1 = org.apache.commons.math.util.FastMath.log10(5.729577951308232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7581226324091722d + "'", double1 == 0.7581226324091722d);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) 3.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.454505008613144d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1L, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        double double1 = org.apache.commons.math.util.FastMath.log(0.47402420806417284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7464968867258404d) + "'", double1 == (-0.7464968867258404d));
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) 3.9481478E13f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        double double1 = org.apache.commons.math.util.FastMath.atan((-3.0461741978670857E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.0461741036471235E-4d) + "'", double1 == (-3.0461741036471235E-4d));
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.425305228849993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.193861478082777d + "'", double1 == 1.193861478082777d);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.1048285727011695d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.1189038211438946d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.817884356931778d, (-0.8813735870195429d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0222383329741738d + "'", double2 == 2.0222383329741738d);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) ' ');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 32.0f + "'", float1 == 32.0f);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        double double1 = org.apache.commons.math.util.FastMath.sinh(14.899276870949834d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1477895.5237242084d + "'", double1 == 1477895.5237242084d);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.883259400089535E100d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5777877754722899d) + "'", double1 == (-0.5777877754722899d));
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        int int2 = org.apache.commons.math.util.FastMath.max(32, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        double double1 = org.apache.commons.math.util.FastMath.tan(4.9E-324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.09966865249116202d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4636456564559829d + "'", double1 == 0.4636456564559829d);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        double double1 = org.apache.commons.math.util.FastMath.ulp(3.948148009134034E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0078125d + "'", double1 == 0.0078125d);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.0000000000000007d, 1.58601345231343E15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.876278270531895d + "'", double2 == 2.876278270531895d);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        double double1 = org.apache.commons.math.util.FastMath.expm1(7.93006726156715E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(4.691649480399158E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.77037274892726E13d + "'", double1 == 7.77037274892726E13d);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        double double1 = org.apache.commons.math.util.FastMath.log(0.8431391046438417d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.17062332315326464d) + "'", double1 == (-0.17062332315326464d));
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        long long1 = org.apache.commons.math.util.FastMath.round(1.709975946676697d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) 3.9481478E13f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.596393407513998d + "'", double1 == 13.596393407513998d);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.6105647004975028d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7813863964118538d + "'", double1 == 0.7813863964118538d);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.3887317335324652d, 5.729577951308232d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3887317335324654d + "'", double2 == 1.3887317335324654d);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9171473774587547d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6080872397649995d + "'", double1 == 0.6080872397649995d);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        double double1 = org.apache.commons.math.util.FastMath.ceil(9.0871877068532832E16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.0871877068532832E16d + "'", double1 == 9.0871877068532832E16d);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.0986122886681098d, 1.3092866533194534d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1310377402202207d + "'", double2 == 1.1310377402202207d);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 1, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        double double2 = org.apache.commons.math.util.FastMath.max(1.5459079327750913d, (-0.8554182836643193d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5459079327750913d + "'", double2 == 1.5459079327750913d);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.883259400089535E100d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        double double1 = org.apache.commons.math.util.FastMath.rint((-1.506844020238002d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        double double1 = org.apache.commons.math.util.FastMath.floor((-3.0461741036471235E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        long long1 = org.apache.commons.math.util.FastMath.abs(2L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (short) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        int int2 = org.apache.commons.math.util.FastMath.min((int) 'a', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        double double2 = org.apache.commons.math.util.FastMath.min(2.6881171418161356E43d, 3.58351893845611d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.58351893845611d + "'", double2 == 3.58351893845611d);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        long long1 = org.apache.commons.math.util.FastMath.round(0.41671114415975286d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.3796077390275217d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.32179921168174863d + "'", double1 == 0.32179921168174863d);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.32681535598557454d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5716776679087391d + "'", double1 == 0.5716776679087391d);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        double double1 = org.apache.commons.math.util.FastMath.sinh(7.930067261567154E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        double double1 = org.apache.commons.math.util.FastMath.cos(4.377725567322862d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3284512750821519d) + "'", double1 == (-0.3284512750821519d));
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.3132616875182228d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.25469727314226837d + "'", double1 == 0.25469727314226837d);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        long long1 = org.apache.commons.math.util.FastMath.round(0.6296609567811063d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9149994957367078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8199744766146694d + "'", double1 == 0.8199744766146694d);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.25194576097040833d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5019419896466207d + "'", double1 == 0.5019419896466207d);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5459079327750913d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.5504145203048696d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (-53L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-53) + "'", int1 == (-53));
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) 97.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.584967478670572d + "'", double1 == 4.584967478670572d);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.1310377402202207d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        float float2 = org.apache.commons.math.util.FastMath.min(10.0f, (float) 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.148283155648077d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5347252927908293d) + "'", double1 == (-1.5347252927908293d));
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2, (float) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) 2147483647);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0523779637351338d + "'", double1 == 1.0523779637351338d);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 0, 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        double double2 = org.apache.commons.math.util.FastMath.max(0.8713868162390155d, 8.881784197001254E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8713868162390155d + "'", double2 == 0.8713868162390155d);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.22469894983086627d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0253512046806867d + "'", double1 == 1.0253512046806867d);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.17062332315326464d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.17062332315326462d) + "'", double1 == (-0.17062332315326462d));
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        double double1 = org.apache.commons.math.util.FastMath.rint(11.147713248144797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.0d + "'", double1 == 11.0d);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        double double1 = org.apache.commons.math.util.FastMath.ulp(22026.465794806718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.637978807091713E-12d + "'", double1 == 3.637978807091713E-12d);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.008837747656337245d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.008837747656337243d) + "'", double2 == (-0.008837747656337243d));
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.58351893845611d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        double double1 = org.apache.commons.math.util.FastMath.asinh(10.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.99822295029797d + "'", double1 == 2.99822295029797d);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        double double1 = org.apache.commons.math.util.FastMath.log(2.752220392306203d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.012408001278103d + "'", double1 == 1.012408001278103d);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        double double1 = org.apache.commons.math.util.FastMath.atanh(5.691758600279624d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        double double1 = org.apache.commons.math.util.FastMath.log(1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-36.7368005696771d) + "'", double1 == (-36.7368005696771d));
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        int int2 = org.apache.commons.math.util.FastMath.min(52, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        double double2 = org.apache.commons.math.util.FastMath.atan2(3.3490760817142498d, Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.008837747656337245d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.008798809557313648d) + "'", double1 == (-0.008798809557313648d));
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        double double1 = org.apache.commons.math.util.FastMath.asinh(4.248291097914389d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1532366900854942d + "'", double1 == 2.1532366900854942d);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        int int2 = org.apache.commons.math.util.FastMath.max(2147483647, (-53));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        double double1 = org.apache.commons.math.util.FastMath.log(1.5707651109236087d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4515628324511178d + "'", double1 == 0.4515628324511178d);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.99822295029797d + "'", double1 == 2.99822295029797d);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 35L, 3.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.5607966601082315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0009877980461306d + "'", double1 == 1.0009877980461306d);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        float float2 = org.apache.commons.math.util.FastMath.max((float) '4', (float) 32);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.570705526935434d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.301071078740414d + "'", double1 == 2.301071078740414d);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.6881171418161356E43d, 0.6384917413123372d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.688117141816135E43d + "'", double2 == 2.688117141816135E43d);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.0253512046806867d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.41032129904824216d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        double double2 = org.apache.commons.math.util.FastMath.atan2(8.88178419700125E-16d, 1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.446441332248135d + "'", double2 == 1.446441332248135d);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.5440680443502757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9960820508065507d + "'", double1 == 0.9960820508065507d);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        int int2 = org.apache.commons.math.util.FastMath.max(100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        long long1 = org.apache.commons.math.util.FastMath.round(0.5514266812416906d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        double double1 = org.apache.commons.math.util.FastMath.tanh(4.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.999329299739067d + "'", double1 == 0.999329299739067d);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 100, (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        double double1 = org.apache.commons.math.util.FastMath.log(35.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5553480614894135d + "'", double1 == 3.5553480614894135d);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-1), 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(4.15912713462618d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0393938154819877d + "'", double1 == 2.0393938154819877d);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.017453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        double double1 = org.apache.commons.math.util.FastMath.exp((-4.632512904931238d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009730277093455045d + "'", double1 == 0.009730277093455045d);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        double double2 = org.apache.commons.math.util.FastMath.pow(199.00499987500626d, 0.7615941559557649d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 56.33799391295282d + "'", double2 == 56.33799391295282d);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) 5L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.373400766945016d + "'", double1 == 1.373400766945016d);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0741466672417709d, 0.6931471805599453d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0741466672417709d + "'", double2 == 0.0741466672417709d);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        double double1 = org.apache.commons.math.util.FastMath.atan(11014.999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707055415023634d + "'", double1 == 1.5707055415023634d);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9830787956514044d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8322083902453669d + "'", double1 == 0.8322083902453669d);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-1), (long) (-53));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 32, (float) 52L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.5707651109236087d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02741502296107092d + "'", double1 == 0.02741502296107092d);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        long long2 = org.apache.commons.math.util.FastMath.max(32L, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        long long1 = org.apache.commons.math.util.FastMath.round(1.9999999999999998d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-3.0461741036471235E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.0461741978670873E-4d) + "'", double1 == (-3.0461741978670873E-4d));
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9960820508065507d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5440680443502757d + "'", double1 == 1.5440680443502757d);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        int int1 = org.apache.commons.math.util.FastMath.abs((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.0030948458264688d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017507307769456783d + "'", double1 == 0.017507307769456783d);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.17062332315326464d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8862269254527579d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8862269254527579d + "'", double1 == 0.8862269254527579d);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        double double2 = org.apache.commons.math.util.FastMath.max(34.99999999999999d, 0.540302305868139d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 34.99999999999999d + "'", double2 == 34.99999999999999d);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.217652850343311d, 2.3686469200204923d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4748409916077942d + "'", double2 == 0.4748409916077942d);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.17364817766693033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5579004906280912d + "'", double1 == 0.5579004906280912d);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.017453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0461741978670857E-4d + "'", double1 == 3.0461741978670857E-4d);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.22665386569399096d, 7.2638973976934564E18d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1202790084281963E-20d + "'", double2 == 3.1202790084281963E-20d);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.22469894983086625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.344162252208615d + "'", double1 == 1.344162252208615d);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.4251053392695819d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5297515540876877d + "'", double1 == 0.5297515540876877d);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(35.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2710663101885897d + "'", double1 == 3.2710663101885897d);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        long long2 = org.apache.commons.math.util.FastMath.min(2L, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(10.049875621120885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.158010543951033d + "'", double1 == 2.158010543951033d);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        long long2 = org.apache.commons.math.util.FastMath.min((long) '#', (long) (-53));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-53L) + "'", long2 == (-53L));
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) 3L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4422495703074083d + "'", double1 == 1.4422495703074083d);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        double double1 = org.apache.commons.math.util.FastMath.log(11013.232874703413d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.306852817378903d + "'", double1 == 9.306852817378903d);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        double double1 = org.apache.commons.math.util.FastMath.abs((-1.219022125506721d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.219022125506721d + "'", double1 == 1.219022125506721d);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.7370361196913022d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.986213958420301d + "'", double1 == 0.986213958420301d);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.17453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.41777137910516676d + "'", double1 == 0.41777137910516676d);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.22469894983086625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22099213933267595d + "'", double1 == 0.22099213933267595d);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        double double1 = org.apache.commons.math.util.FastMath.ceil(3.6347792607040605d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.09966865249116202d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09983440995178777d + "'", double1 == 0.09983440995178777d);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.344162252208615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.5777877754722899d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.8726936208978296d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9556244815546298d + "'", double1 == 0.9556244815546298d);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        long long1 = org.apache.commons.math.util.FastMath.abs(57L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 57L + "'", long1 == 57L);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        double double2 = org.apache.commons.math.util.FastMath.max(1.4593566380802732d, Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4593566380802732d + "'", double2 == 1.4593566380802732d);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(11013.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 192.2131105221355d + "'", double1 == 192.2131105221355d);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 35L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.155615773557597E15d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        int int1 = org.apache.commons.math.util.FastMath.round((float) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.9754001961551926d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        double double2 = org.apache.commons.math.util.FastMath.max((-36.7368005696771d), (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.3284512750821519d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9465430622761263d + "'", double1 == 0.9465430622761263d);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.193861478082777d, 3.2710663101885893d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1938614780827772d + "'", double2 == 1.1938614780827772d);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        double double1 = org.apache.commons.math.util.FastMath.acos(100.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        double double1 = org.apache.commons.math.util.FastMath.log(0.3156563365585749d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1531011997348775d) + "'", double1 == (-1.1531011997348775d));
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        double double1 = org.apache.commons.math.util.FastMath.floor(43.42944819032519d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 43.0d + "'", double1 == 43.0d);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        double double1 = org.apache.commons.math.util.FastMath.log10(35.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5440680443502757d + "'", double1 == 1.5440680443502757d);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.217652850343311d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5416614449118216d + "'", double1 == 1.5416614449118216d);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) -1, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        long long2 = org.apache.commons.math.util.FastMath.max(35L, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) 2.0f, (double) 35.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0000000000000004d + "'", double2 == 2.0000000000000004d);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.5063656411097343d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.39731803409120725d) + "'", double1 == (-0.39731803409120725d));
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 35L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 35.0f + "'", float1 == 35.0f);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        double double1 = org.apache.commons.math.util.FastMath.asin(4.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.5777877754722899d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.5607966601082315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2493184782545368d + "'", double1 == 1.2493184782545368d);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.017507307769456783d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        double double1 = org.apache.commons.math.util.FastMath.log(7.6035750265302235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0286185349173835d + "'", double1 == 2.0286185349173835d);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.0000000000000009d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.841470984807897d + "'", double1 == 0.841470984807897d);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        double double2 = org.apache.commons.math.util.FastMath.max(0.473814720414451d, 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.473814720414451d + "'", double2 == 0.473814720414451d);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.817884356931778d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 0, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.9982229502979694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1443601628891088d) + "'", double1 == (-0.1443601628891088d));
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        double double1 = org.apache.commons.math.util.FastMath.rint((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.3284512750821519d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3346634130618275d) + "'", double1 == (-0.3346634130618275d));
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.7763568394002489E-15d, 1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5083775167989393d + "'", double2 == 1.5083775167989393d);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        double double2 = org.apache.commons.math.util.FastMath.max(0.216499084404722d, (-0.7853981633974483d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.216499084404722d + "'", double2 == 0.216499084404722d);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-7.369139609590174E-249d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.945982489867764E-83d) + "'", double1 == (-1.945982489867764E-83d));
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.5440680443502757d, 10.000000000000002d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1531969697659333d + "'", double2 == 0.1531969697659333d);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.817884356931778d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0359863753497582d + "'", double1 == 1.0359863753497582d);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.5467250970042679d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9997103019367587d + "'", double1 == 0.9997103019367587d);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        double double2 = org.apache.commons.math.util.FastMath.max(0.5127742681331149d, 1.6094379124341003d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6094379124341003d + "'", double2 == 1.6094379124341003d);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 10, (float) 1L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 0, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(114.59155902616465d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        long long1 = org.apache.commons.math.util.FastMath.round(5.267831587699267d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(11013.232920103323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 104.94395132690269d + "'", double1 == 104.94395132690269d);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.18106042748149917d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1820645932624315d + "'", double1 == 0.1820645932624315d);
    }
}

