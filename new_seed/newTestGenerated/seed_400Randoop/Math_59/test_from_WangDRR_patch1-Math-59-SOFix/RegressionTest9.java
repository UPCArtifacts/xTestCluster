import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

    public static boolean debug = false;

    @Test
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.9033391107665127d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9033391107665126d) + "'", double1 == (-0.9033391107665126d));
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.0239341746073216d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01787102267058828d + "'", double1 == 0.01787102267058828d);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        long long2 = org.apache.commons.math.util.FastMath.max(9223372036854775807L, 4L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        long long2 = org.apache.commons.math.util.FastMath.max(53L, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 53L + "'", long2 == 53L);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.516964265655408d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.1662915285707838d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1525610382590354d + "'", double1 == 1.1525610382590354d);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        double double2 = org.apache.commons.math.util.FastMath.min((-1.5707963267948963d), 416127.66138192907d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963267948963d) + "'", double2 == (-1.5707963267948963d));
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.1123679663409165d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7478095771555197d + "'", double1 == 0.7478095771555197d);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.8990819272930286d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 51.51359987037848d + "'", double1 == 51.51359987037848d);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        double double2 = org.apache.commons.math.util.FastMath.max((-29.500939575070156d), 3.81765898774876d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.81765898774876d + "'", double2 == 3.81765898774876d);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        double double1 = org.apache.commons.math.util.FastMath.floor(966980.6941481612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 966980.0d + "'", double1 == 966980.0d);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.7763568394002489E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002489E-15d + "'", double1 == 1.7763568394002489E-15d);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.7805951733159242d, 2.502154937700735d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5380626402239319d + "'", double2 == 0.5380626402239319d);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        double double2 = org.apache.commons.math.util.FastMath.max(0.38930040372081254d, 9.307013259236443d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.307013259236443d + "'", double2 == 9.307013259236443d);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9830787956514044d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) (-36));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) 10L, 35.30685281944005d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.000000000000002d + "'", double2 == 10.000000000000002d);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        double double1 = org.apache.commons.math.util.FastMath.tan(8.253215446498233E-30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.253215446498233E-30d + "'", double1 == 8.253215446498233E-30d);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 2147483647, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.00000000000001d + "'", double1 == 100.00000000000001d);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 1, 149);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9441850002921958d, (-0.8414709848078965d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8414709848078965d) + "'", double2 == (-0.8414709848078965d));
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 15472906L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.5472906E7f + "'", float1 == 1.5472906E7f);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.8587033066171034d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7095251320497278d + "'", double1 == 0.7095251320497278d);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.403108691968676E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.193861478082777d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9948376736367679d, (-0.8101087222704179d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2542036597000856d + "'", double2 == 2.2542036597000856d);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.7306786685136297d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.644483341943245d + "'", double1 == 4.644483341943245d);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-36.7368005696771d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-36.0d) + "'", double1 == (-36.0d));
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-1), (float) 53L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(3.3043013731747495d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.30430137317475d + "'", double1 == 3.30430137317475d);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.7321429324531826d), (double) 2.15561577E15f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7321429324531826d) + "'", double2 == (-0.7321429324531826d));
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        int int1 = org.apache.commons.math.util.FastMath.round(416128.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 416128 + "'", int1 == 416128);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        double double1 = org.apache.commons.math.util.FastMath.acos(5.040346812154621d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.005622464243162869d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999841939895557d + "'", double1 == 0.9999841939895557d);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.7612492183413337d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 43.61636736859132d + "'", double1 == 43.61636736859132d);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-3.8754705787895336d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5707539050029569d) + "'", double1 == (-1.5707539050029569d));
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        double double1 = org.apache.commons.math.util.FastMath.signum(11.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        double double2 = org.apache.commons.math.util.FastMath.max((double) 10, 1.2881954997339584d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 5, 45.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 45.0f + "'", float2 == 45.0f);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        long long1 = org.apache.commons.math.util.FastMath.round(3.053714424981457d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        double double1 = org.apache.commons.math.util.FastMath.log((-2.5049299044217186d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 45);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 45L + "'", long1 == 45L);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9902697229065449d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.431181872803843d + "'", double1 == 1.431181872803843d);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.017067660761448736d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01706600365598213d) + "'", double1 == (-0.01706600365598213d));
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        int int2 = org.apache.commons.math.util.FastMath.min(149, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        double double1 = org.apache.commons.math.util.FastMath.expm1(7.604073567738472d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2005.3522829578822d + "'", double1 == 2005.3522829578822d);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        double double1 = org.apache.commons.math.util.FastMath.ulp(295.4144370642092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.6843418860808015E-14d + "'", double1 == 5.6843418860808015E-14d);
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.7615941559557655d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.650880168023008d + "'", double1 == 0.650880168023008d);
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-5.89531575144793d), (-34.657359027997266d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-5.895315751447931d) + "'", double2 == (-5.895315751447931d));
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 97, 97.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.7615560214388488d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.11829814366494944d) + "'", double1 == (-0.11829814366494944d));
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.7306786685136297d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7306786685136297d + "'", double1 == 1.7306786685136297d);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 45, (float) (-36L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 45.0f + "'", float2 == 45.0f);
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 0.9975366607028198d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.2775176041484217d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.07359197216738352d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4971377659143368d + "'", double1 == 1.4971377659143368d);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        double double1 = org.apache.commons.math.util.FastMath.cosh(44.29385023697242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.6207439195145595E18d + "'", double1 == 8.6207439195145595E18d);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.057233205734539244d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2792211365930393d + "'", double1 == 3.2792211365930393d);
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.3132616875182228d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.008837862706915424d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.008837977758392242d) + "'", double1 == (-0.008837977758392242d));
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.38626711782658774d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9263218110954882d + "'", double1 == 0.9263218110954882d);
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.1215871282840145E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.448197327643066E-7d + "'", double1 == 5.448197327643066E-7d);
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.1161530356493914d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4391418681913921d + "'", double1 == 0.4391418681913921d);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.8623188722876839d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6218224167640864d + "'", double1 == 0.6218224167640864d);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.2389223526567926d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2730198930229881d) + "'", double1 == (-0.2730198930229881d));
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        double double1 = org.apache.commons.math.util.FastMath.signum(7.280109889280518d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.28111738892954613d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.28111738892954613d + "'", double1 == 0.28111738892954613d);
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.17364288451637427d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7603430083715822d) + "'", double1 == (-0.7603430083715822d));
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-39.62126752483498d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.1224236947215336d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7525586878958921d + "'", double1 == 0.7525586878958921d);
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.20414594311450418d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0209102525207299d + "'", double1 == 1.0209102525207299d);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        float float2 = org.apache.commons.math.util.FastMath.min(100.0f, (float) 2147483647);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.38930040372081254d, 0.09118740161511363d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3407103752330731d + "'", double2 == 1.3407103752330731d);
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        long long1 = org.apache.commons.math.util.FastMath.round(0.0037614443570399263d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.13271291339328767d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13193921867093453d + "'", double1 == 0.13193921867093453d);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        double double1 = org.apache.commons.math.util.FastMath.log(1.1118733076078493d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10604625733031672d + "'", double1 == 0.10604625733031672d);
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        double double1 = org.apache.commons.math.util.FastMath.log(295.4144370642092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.688379241835363d + "'", double1 == 5.688379241835363d);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.5668853211490716d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8435776692423236d + "'", double1 == 0.8435776692423236d);
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.7138297703395624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1967108470429453d + "'", double1 == 1.1967108470429453d);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-1.2554125869476498d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.9650846656626807d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.767632180370889d) + "'", double1 == (-0.767632180370889d));
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-53), (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.008838207883813806d), 189.3225229221956d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.3114437720352931d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.32214347159644924d + "'", double1 == 0.32214347159644924d);
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.5310724756574393d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        double double1 = org.apache.commons.math.util.FastMath.asin((-5.895315751447931d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.01745417873758517d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 2147483647L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 84677176);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.19842513149602495d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.373400766945016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1477895.5239208457d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1215.6872640283955d + "'", double1 == 1215.6872640283955d);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.1599753909038675d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.43818044005918d + "'", double1 == 1.43818044005918d);
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        double double1 = org.apache.commons.math.util.FastMath.exp(22.60451646247372d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.561705969853512E9d + "'", double1 == 6.561705969853512E9d);
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        double double2 = org.apache.commons.math.util.FastMath.max(93.29801381190705d, 2.9982229502979694d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 93.29801381190705d + "'", double2 == 93.29801381190705d);
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9402241834946016d, 0.7658461948190802d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8872547630517019d + "'", double2 == 0.8872547630517019d);
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.7612492183413337d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8724959703868744d + "'", double1 == 0.8724959703868744d);
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.3745669993918974d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1118733076078493d + "'", double1 == 1.1118733076078493d);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9033391107665129d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        double double1 = org.apache.commons.math.util.FastMath.asin(803227.6141649d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        double double1 = org.apache.commons.math.util.FastMath.log(1.8306189581832664d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6046541381824057d + "'", double1 == 0.6046541381824057d);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 3.9481478E13f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.30685277862425d + "'", double1 == 31.30685277862425d);
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        int int2 = org.apache.commons.math.util.FastMath.max((-2), 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        long long2 = org.apache.commons.math.util.FastMath.min(5L, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.0841005523291758d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.956779154231204d + "'", double1 == 2.956779154231204d);
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(4.214684851089401E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0034800731177357d + "'", double1 == 0.0034800731177357d);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.8693785117457933d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 49.81171952239862d + "'", double1 == 49.81171952239862d);
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.3129793350683445d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5044843364537537d) + "'", double1 == (-0.5044843364537537d));
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        double double1 = org.apache.commons.math.util.FastMath.ulp(6.561705969853512E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.5367431640625E-7d + "'", double1 == 9.5367431640625E-7d);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.02411962364530756d, 5.637986554446436d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.004278030156706235d + "'", double2 == 0.004278030156706235d);
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 100, 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.7055494495807495d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 'a', (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        double double2 = org.apache.commons.math.util.FastMath.max(5.366643026452033d, (-0.008838207883813806d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.366643026452033d + "'", double2 == 5.366643026452033d);
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.3852968325547366d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.385112409022803d + "'", double1 == 5.385112409022803d);
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        int int2 = org.apache.commons.math.util.FastMath.min(11013, 45);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 45 + "'", int2 == 45);
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.5711009442241053d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5098796108399273d + "'", double1 == 2.5098796108399273d);
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-35.35050620855721d), 1.675234572368367d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-35.350506208557206d) + "'", double2 == (-35.350506208557206d));
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.37754243147639266d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3686370946198846d + "'", double1 == 0.3686370946198846d);
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-1.2130532941206642d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        int int2 = org.apache.commons.math.util.FastMath.max(36, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        double double1 = org.apache.commons.math.util.FastMath.abs(3.8097187196293865d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8097187196293865d + "'", double1 == 3.8097187196293865d);
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.8781280698332341d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2050634318473186d) + "'", double1 == (-1.2050634318473186d));
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 32, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.876278270531895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4221441967506834d + "'", double1 == 1.4221441967506834d);
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(7.725864345518537d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.725864345518538d + "'", double1 == 7.725864345518538d);
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        long long2 = org.apache.commons.math.util.FastMath.min(84677176L, 6L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6L + "'", long2 == 6L);
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        double double1 = org.apache.commons.math.util.FastMath.signum(3.683604680594732d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.11829814366494944d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0020646921059506392d) + "'", double1 == (-0.0020646921059506392d));
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-4.999750016661555E-5d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.999625031243404E-5d) + "'", double1 == (-4.999625031243404E-5d));
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        double double2 = org.apache.commons.math.util.FastMath.max(1.3673722261798014d, 3.469446951953614E-18d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3673722261798014d + "'", double2 == 1.3673722261798014d);
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.052377963735134d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7529602598008407d + "'", double1 == 1.7529602598008407d);
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '4', 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        double double1 = org.apache.commons.math.util.FastMath.floor(3.4028045914528193d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        double double2 = org.apache.commons.math.util.FastMath.pow(22.248715438260383d, 11013.232874703415d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '#', 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        float float2 = org.apache.commons.math.util.FastMath.min(2.14748365E9f, (float) 15472906L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5472906E7f + "'", float2 == 1.5472906E7f);
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) (-2));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.7658461948190803d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.048891900480796d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7172991106570463d + "'", double1 == 0.7172991106570463d);
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        double double2 = org.apache.commons.math.util.FastMath.min(0.6868023880361244d, 0.1933463270565558d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1933463270565558d + "'", double2 == 0.1933463270565558d);
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.3132616875182228d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11835127454431413d + "'", double1 == 0.11835127454431413d);
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        double double2 = org.apache.commons.math.util.FastMath.max(2.10482857270117d, 2.0637969690534153d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.10482857270117d + "'", double2 == 2.10482857270117d);
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.9145768651795099d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9145768651795099d + "'", double1 == 1.9145768651795099d);
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 0, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.675234572368367d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9945512817213944d + "'", double1 == 0.9945512817213944d);
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.5044843364537537d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.46563653673650895d) + "'", double1 == (-0.46563653673650895d));
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.452674104609824d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.619376640742772d + "'", double1 == 10.619376640742772d);
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        long long2 = org.apache.commons.math.util.FastMath.max(97L, (long) 45);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 3);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.0f + "'", float1 == 3.0f);
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        double double2 = org.apache.commons.math.util.FastMath.max(0.30554713851424564d, 1.862645149230957E-9d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.30554713851424564d + "'", double2 == 0.30554713851424564d);
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) 5L, 1.04675969811694d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.999999999999999d + "'", double2 == 4.999999999999999d);
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 793006726156715L, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
        int int1 = org.apache.commons.math.util.FastMath.round(35.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.5445447624694046d, (double) 1586013452313419L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5445447624694049d + "'", double2 == 1.5445447624694049d);
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.27112864638649725d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        double double1 = org.apache.commons.math.util.FastMath.log10(5.691758600279624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.755246472440062d + "'", double1 == 0.755246472440062d);
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.571281590658235d, (-2.5049299044217186d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.09388666236377677d + "'", double2 == 0.09388666236377677d);
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.83076520720161d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.08052170019273971d) + "'", double1 == (-0.08052170019273971d));
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.0172646118010161d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2584553972582565d + "'", double1 == 0.2584553972582565d);
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9986081305645496d, (-34.657359027997266d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-34.657359027997266d) + "'", double2 == (-34.657359027997266d));
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 4.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7568024953079282d) + "'", double1 == (-0.7568024953079282d));
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
        double double1 = org.apache.commons.math.util.FastMath.expm1(3.1720269046268665E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.8713868162390155d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015208569001841612d + "'", double1 == 0.015208569001841612d);
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
        double double1 = org.apache.commons.math.util.FastMath.floor(57.292734699501686d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.0d + "'", double1 == 57.0d);
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        double double1 = org.apache.commons.math.util.FastMath.exp(11013.232874703393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 2155615773557597L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
        double double2 = org.apache.commons.math.util.FastMath.min(0.7172991106570463d, 0.006690129943162349d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.006690129943162349d + "'", double2 == 0.006690129943162349d);
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
        double double1 = org.apache.commons.math.util.FastMath.log10(11.163601120238772d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0478043105849544d + "'", double1 == 1.0478043105849544d);
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.20894025738121733d, 1.22459997143478d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14699383281419737d + "'", double2 == 0.14699383281419737d);
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.016455121993179136d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.016591253173120855d + "'", double1 == 0.016591253173120855d);
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.1217719640679913d, (-36.7368005696771d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.014677947671992464d + "'", double2 == 0.014677947671992464d);
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.1118733076078493d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
        float float1 = org.apache.commons.math.util.FastMath.abs(1.58601345E15f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.58601345E15f + "'", float1 == 1.58601345E15f);
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
        double double2 = org.apache.commons.math.util.FastMath.max(1.6699175736806615d, 3.7051926755065845E12d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.7051926755065845E12d + "'", double2 == 3.7051926755065845E12d);
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
        double double2 = org.apache.commons.math.util.FastMath.atan2(3.5556350168053608d, (-0.7367922631517189d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7751227249097072d + "'", double2 == 1.7751227249097072d);
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.692229922941576d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.054663569220438d + "'", double1 == 20.054663569220438d);
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.7453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9408416071039944d + "'", double1 == 0.9408416071039944d);
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
        int int1 = org.apache.commons.math.util.FastMath.round(1.5472906E7f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15472906 + "'", int1 == 15472906);
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(9.306922469822426d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.050724908906476d + "'", double1 == 3.050724908906476d);
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.24468093598772875d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24468093598772878d + "'", double1 == 0.24468093598772878d);
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.9429832520348356d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.587376254764669d + "'", double1 == 0.587376254764669d);
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 100L, 0.677838996146359d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5640180406451618d + "'", double2 == 1.5640180406451618d);
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
        double double2 = org.apache.commons.math.util.FastMath.max(36.04365338911715d, 0.3129793350683445d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 36.04365338911715d + "'", double2 == 36.04365338911715d);
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
        double double1 = org.apache.commons.math.util.FastMath.ceil(4.574710978503384d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
        float float2 = org.apache.commons.math.util.FastMath.max(1.0f, (float) 1L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
        double double1 = org.apache.commons.math.util.FastMath.expm1(6.561705969853512E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.412477959165965E-27d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3411822118996943E-9d + "'", double1 == 1.3411822118996943E-9d);
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.6243591771037418d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5845774691047715d + "'", double1 == 0.5845774691047715d);
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) 1477896);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3283064365386963E-10d + "'", double1 == 2.3283064365386963E-10d);
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.4785470608465352d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3072681526028136d + "'", double1 == 2.3072681526028136d);
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.7282657137693634d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7463298239423218d + "'", double1 == 0.7463298239423218d);
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 10L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 10.0f + "'", float1 == 10.0f);
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
        double double1 = org.apache.commons.math.util.FastMath.log1p(23.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1780538303479458d + "'", double1 == 3.1780538303479458d);
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.5215691996538042d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.6476534799298319d), (double) 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.015871531934626E-10d) + "'", double2 == (-3.015871531934626E-10d));
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.17364288451637427d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5578948219222873d + "'", double1 == 0.5578948219222873d);
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.9481480091340336E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 34051.09965918194d + "'", double1 == 34051.09965918194d);
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.5414729998706594d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5179955251134185d + "'", double1 == 0.5179955251134185d);
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
        double double1 = org.apache.commons.math.util.FastMath.log(0.7672312144687762d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.26496707001953784d) + "'", double1 == (-0.26496707001953784d));
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(19.990612120000147d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1145.3777043590796d + "'", double1 == 1145.3777043590796d);
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.8651519032445955d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3753668845100457d + "'", double1 == 2.3753668845100457d);
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 1, 416128);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
        double double1 = org.apache.commons.math.util.FastMath.rint(99.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.0399894657358901d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 59.58700712473184d + "'", double1 == 59.58700712473184d);
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.26035149959480436d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2633862394596655d + "'", double1 == 0.2633862394596655d);
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.8414709848078965d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.010869682119891842d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.010869896173410578d) + "'", double1 == (-0.010869896173410578d));
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4712");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.799263459336884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5796994106826333d + "'", double1 == 0.5796994106826333d);
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.6803595632804154d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7773465776088447d + "'", double1 == 0.7773465776088447d);
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4714");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.8743692948528521d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015260623073523378d + "'", double1 == 0.015260623073523378d);
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4715");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 1.0f, 2.1034585241152786d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.1967108470429453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07798922751278647d + "'", double1 == 0.07798922751278647d);
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4717");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.9916299884373267d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3709715186580659d + "'", double1 == 0.3709715186580659d);
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4718");
        double double1 = org.apache.commons.math.util.FastMath.exp(9.994072887542587E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0009999068626307d + "'", double1 == 1.0009999068626307d);
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4719");
        double double2 = org.apache.commons.math.util.FastMath.min(1.1670053339333535d, (-0.20414594311450418d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.20414594311450418d) + "'", double2 == (-0.20414594311450418d));
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4720");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.253350360695029d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4721");
        double double1 = org.apache.commons.math.util.FastMath.expm1(28.476411608537198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3288870502122705E12d + "'", double1 == 2.3288870502122705E12d);
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4722");
        double double1 = org.apache.commons.math.util.FastMath.sin(384.43435069728696d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9168218604785182d + "'", double1 == 0.9168218604785182d);
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4723");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.37138811771185687d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.37138811771185687d + "'", double1 == 0.37138811771185687d);
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4724");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 45);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4725");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 6L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.0f + "'", float1 == 6.0f);
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4726");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.5157707046119765d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.287543329097423d) + "'", double1 == (-0.287543329097423d));
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4727");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.7529602598008407d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9417115146170167d + "'", double1 == 0.9417115146170167d);
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4728");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.9033391107665126d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9033391107665126d + "'", double1 == 0.9033391107665126d);
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4729");
        float float2 = org.apache.commons.math.util.FastMath.max(57.0f, (float) 5L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4730");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0078125d, 0.6768673022400968d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.011541631678684466d + "'", double2 == 0.011541631678684466d);
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4731");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 5, (-0.010868826047427144d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5729700885805267d + "'", double2 == 1.5729700885805267d);
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4732");
        float float2 = org.apache.commons.math.util.FastMath.min((-36.0f), (float) 53L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-36.0f) + "'", float2 == (-36.0f));
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4733");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-1.1299083649462789d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0415522815958145d) + "'", double1 == (-1.0415522815958145d));
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4734");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.1134536045423387d, (double) 5L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1134536045423389d + "'", double2 == 1.1134536045423389d);
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4735");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.7478095771555197d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7478095771555198d + "'", double1 == 0.7478095771555198d);
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4736");
        int int2 = org.apache.commons.math.util.FastMath.min(2, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4737");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.6842868307608122d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8157762147915711d) + "'", double1 == (-0.8157762147915711d));
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4738");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 32, (float) 35L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4739");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.853200064217061d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2277207513970612d + "'", double1 == 1.2277207513970612d);
    }

    @Test
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4740");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.3690575314124793d, 0.7615560214388488d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.270260419944165d + "'", double2 == 1.270260419944165d);
    }

    @Test
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4741");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 57L, (float) (-2L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4742");
        double double1 = org.apache.commons.math.util.FastMath.cos(18741.93649013445d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6929085228370617d + "'", double1 == 0.6929085228370617d);
    }

    @Test
    public void test4743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4743");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.2545767570502781d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.24921603491753927d) + "'", double1 == (-0.24921603491753927d));
    }

    @Test
    public void test4744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4744");
        double double1 = org.apache.commons.math.util.FastMath.log(0.5662191695169732d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5687740504363148d) + "'", double1 == (-0.5687740504363148d));
    }

    @Test
    public void test4745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4745");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.8695168523156485d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4746");
        float float2 = org.apache.commons.math.util.FastMath.max(35.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test4747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4747");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.8554182836643192d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4748");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.19892537929119714d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4749");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(5.637986554446436d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 323.0328345212857d + "'", double1 == 323.0328345212857d);
    }

    @Test
    public void test4750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4750");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 52, (float) 84677176);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.4677176E7f + "'", float2 == 8.4677176E7f);
    }

    @Test
    public void test4751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4751");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.2753612114631538d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5600972363155949d) + "'", double1 == (-0.5600972363155949d));
    }

    @Test
    public void test4752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4752");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 15472906L, 1.4650188248182274d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4650188248182274d + "'", double2 == 1.4650188248182274d);
    }

    @Test
    public void test4753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4753");
        double double1 = org.apache.commons.math.util.FastMath.abs(303.2854656713273d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 303.2854656713273d + "'", double1 == 303.2854656713273d);
    }

    @Test
    public void test4754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4754");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-4.302546093059478E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.3025459603122967E-4d) + "'", double1 == (-4.3025459603122967E-4d));
    }

    @Test
    public void test4755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4755");
        long long2 = org.apache.commons.math.util.FastMath.max(39481480091340L, (long) (-36));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 39481480091340L + "'", long2 == 39481480091340L);
    }

    @Test
    public void test4756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4756");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, (-2.5049299044217186d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.141592653589793d + "'", double2 == 3.141592653589793d);
    }

    @Test
    public void test4757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4757");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.2413339035979167d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2367552807779586d + "'", double1 == 0.2367552807779586d);
    }

    @Test
    public void test4758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4758");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.6627966601314947d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0870691481926182d) + "'", double1 == (-1.0870691481926182d));
    }

    @Test
    public void test4759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4759");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) 53L, 17.247748258387592d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.99999999999999d + "'", double2 == 52.99999999999999d);
    }

    @Test
    public void test4760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4760");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.8986761182296238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4652950030131615d + "'", double1 == 1.4652950030131615d);
    }

    @Test
    public void test4761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4761");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4762");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.9171523356672742d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7938732240748443d) + "'", double1 == (-0.7938732240748443d));
    }

    @Test
    public void test4763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4763");
        long long1 = org.apache.commons.math.util.FastMath.abs(793006726156715L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 793006726156715L + "'", long1 == 793006726156715L);
    }

    @Test
    public void test4764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4764");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8333798993106615d, 1.7473083494263217d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4450387097066422d + "'", double2 == 0.4450387097066422d);
    }

    @Test
    public void test4765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4765");
        long long2 = org.apache.commons.math.util.FastMath.max(2147483647L, 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test4766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4766");
        double double1 = org.apache.commons.math.util.FastMath.atan(57.29577951308232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5533448061434307d + "'", double1 == 1.5533448061434307d);
    }

    @Test
    public void test4767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4767");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.6499429567608755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4768");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.17364817766693033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9849610023458857d + "'", double1 == 0.9849610023458857d);
    }

    @Test
    public void test4769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4769");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1224.999999999999d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1224.9999999999989d + "'", double2 == 1224.9999999999989d);
    }

    @Test
    public void test4770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4770");
        double double2 = org.apache.commons.math.util.FastMath.max(32.0d, (-0.9848929415691015d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void test4771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4771");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 793006726156715L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.9300672E14f + "'", float1 == 7.9300672E14f);
    }

    @Test
    public void test4772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4772");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8199744766146694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.071658885353307d + "'", double1 == 1.071658885353307d);
    }

    @Test
    public void test4773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4773");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9339826894350282d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.544623468212435d + "'", double1 == 2.544623468212435d);
    }

    @Test
    public void test4774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4774");
        double double2 = org.apache.commons.math.util.FastMath.min(0.011368429140754338d, 0.6099169425432279d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.011368429140754338d + "'", double2 == 0.011368429140754338d);
    }

    @Test
    public void test4775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4775");
        double double2 = org.apache.commons.math.util.FastMath.max(19.990612120000147d, 0.999787460148778d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 19.990612120000147d + "'", double2 == 19.990612120000147d);
    }

    @Test
    public void test4776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4776");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 10, 1477896L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1477896L + "'", long2 == 1477896L);
    }

    @Test
    public void test4777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4777");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.1200868748495079d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4778");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.5674991151269533d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5674991151269535d + "'", double1 == 1.5674991151269535d);
    }

    @Test
    public void test4779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4779");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.1d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0017453292519943296d + "'", double1 == 0.0017453292519943296d);
    }

    @Test
    public void test4780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4780");
        double double1 = org.apache.commons.math.util.FastMath.atan((-14.04469065108256d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.499714999892002d) + "'", double1 == (-1.499714999892002d));
    }

    @Test
    public void test4781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4781");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.970291913552122d + "'", double1 == 3.970291913552122d);
    }

    @Test
    public void test4782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4782");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(4.584967478670572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 262.6992857325621d + "'", double1 == 262.6992857325621d);
    }

    @Test
    public void test4783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4783");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.4548324228266097d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4784");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9168218604785182d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6506685335476448d + "'", double1 == 0.6506685335476448d);
    }

    @Test
    public void test4785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4785");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.2758693720989824d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2906699594446309d + "'", double1 == 0.2906699594446309d);
    }

    @Test
    public void test4786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4786");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9902697229065449d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5245730185111919d + "'", double1 == 1.5245730185111919d);
    }

    @Test
    public void test4787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4787");
        double double1 = org.apache.commons.math.util.FastMath.signum(5.6843418860808015E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4788");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test4789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4789");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.38095094490971865d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.006648848277258123d + "'", double1 == 0.006648848277258123d);
    }

    @Test
    public void test4790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4790");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0172646118010161d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test4791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4791");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.1498040080478718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.583175998895534d + "'", double1 == 8.583175998895534d);
    }

    @Test
    public void test4792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4792");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9402241834946016d, 0.0034800731177357d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0034800731177357d + "'", double2 == 0.0034800731177357d);
    }

    @Test
    public void test4793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4793");
        double double2 = org.apache.commons.math.util.FastMath.max(0.4963334177617679d, 0.6218224167640864d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6218224167640864d + "'", double2 == 0.6218224167640864d);
    }

    @Test
    public void test4794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4794");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.4495725029967728d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test4795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4795");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 100, 1477896);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1477896 + "'", int2 == 1477896);
    }

    @Test
    public void test4796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4796");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.634578497998064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011075484152426462d + "'", double1 == 0.011075484152426462d);
    }

    @Test
    public void test4797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4797");
        long long2 = org.apache.commons.math.util.FastMath.max(6L, 32035L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32035L + "'", long2 == 32035L);
    }

    @Test
    public void test4798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4798");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.7813863964118539d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8839606305779991d + "'", double1 == 0.8839606305779991d);
    }

    @Test
    public void test4799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4799");
        double double2 = org.apache.commons.math.util.FastMath.max(4.248699261105204d, 2.7123889803846897d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.248699261105204d + "'", double2 == 4.248699261105204d);
    }

    @Test
    public void test4800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4800");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.5674991151269535d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4801");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-34.768015146316124d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test4802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4802");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-1.2031992972018404d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4803");
        double double2 = org.apache.commons.math.util.FastMath.min(0.4450387097066422d, 0.011541631678684466d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.011541631678684466d + "'", double2 == 0.011541631678684466d);
    }

    @Test
    public void test4804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4804");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.07798922751278647d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0779103838865658d + "'", double1 == 0.0779103838865658d);
    }

    @Test
    public void test4805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4805");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.8415441278547194d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0001353885748059d + "'", double1 == 1.0001353885748059d);
    }

    @Test
    public void test4806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4806");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(21.91992231173425d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 21.919922311734254d + "'", double1 == 21.919922311734254d);
    }

    @Test
    public void test4807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4807");
        double double1 = org.apache.commons.math.util.FastMath.log10(17.490740823090167d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2428082044796174d + "'", double1 == 1.2428082044796174d);
    }

    @Test
    public void test4808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4808");
        double double1 = org.apache.commons.math.util.FastMath.log(1.611568870073207d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.477208157986425d + "'", double1 == 0.477208157986425d);
    }

    @Test
    public void test4809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4809");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.3745669993918976d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.953364543008684d + "'", double1 == 2.953364543008684d);
    }

    @Test
    public void test4810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4810");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.7819722235803451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 44.80370810761416d + "'", double1 == 44.80370810761416d);
    }

    @Test
    public void test4811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4811");
        long long2 = org.apache.commons.math.util.FastMath.max(5L, (long) (-36));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test4812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4812");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9999999999971125d, 8.88178419700125E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999999999971124d + "'", double2 == 0.9999999999971124d);
    }

    @Test
    public void test4813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4813");
        float float1 = org.apache.commons.math.util.FastMath.abs(1.5472906E7f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.5472906E7f + "'", float1 == 1.5472906E7f);
    }

    @Test
    public void test4814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4814");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.10105313197441d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1010531319744103d + "'", double1 == 2.1010531319744103d);
    }

    @Test
    public void test4815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4815");
        double double1 = org.apache.commons.math.util.FastMath.acos(32034.985999653978d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4816");
        double double2 = org.apache.commons.math.util.FastMath.max(2.403108691968676E-6d, 4.355065552987378d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.355065552987378d + "'", double2 == 4.355065552987378d);
    }

    @Test
    public void test4817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4817");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.015208569001841612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5555871714402396d + "'", double1 == 1.5555871714402396d);
    }

    @Test
    public void test4818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4818");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.3440585709080869E43d, 0.37138811771185687d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.040835396523128E16d + "'", double2 == 1.040835396523128E16d);
    }

    @Test
    public void test4819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4819");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9998039600078416d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.99990197519949d + "'", double1 == 0.99990197519949d);
    }

    @Test
    public void test4820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4820");
        long long2 = org.apache.commons.math.util.FastMath.max(11013L, (long) (-2));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11013L + "'", long2 == 11013L);
    }

    @Test
    public void test4821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4821");
        double double1 = org.apache.commons.math.util.FastMath.sinh(55.367870644634905d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.558155592227304E23d + "'", double1 == 5.558155592227304E23d);
    }

    @Test
    public void test4822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4822");
        double double1 = org.apache.commons.math.util.FastMath.log(1.4779900867225375d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3906831152792523d + "'", double1 == 0.3906831152792523d);
    }

    @Test
    public void test4823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4823");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.45967525618227173d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4824");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.04085581769411778d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.938893903907228E-18d + "'", double1 == 6.938893903907228E-18d);
    }

    @Test
    public void test4825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4825");
        int int2 = org.apache.commons.math.util.FastMath.min(53, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test4826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4826");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.6476534799298319d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7045007049922802d) + "'", double1 == (-0.7045007049922802d));
    }

    @Test
    public void test4827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4827");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-1.1951162469645535d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0612150085171435d) + "'", double1 == (-1.0612150085171435d));
    }

    @Test
    public void test4828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4828");
        long long1 = org.apache.commons.math.util.FastMath.round(9.038180812763819E-5d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4829");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.20535382550526307d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.20391356390254134d) + "'", double1 == (-0.20391356390254134d));
    }

    @Test
    public void test4830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4830");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9332525345454011d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4831");
        double double1 = org.apache.commons.math.util.FastMath.atanh(9.825659180793972d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4832");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9520464219027572d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test4833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4833");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test4834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4834");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.3162739259961891d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.31627392599618903d + "'", double2 == 0.31627392599618903d);
    }

    @Test
    public void test4835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4835");
        float float2 = org.apache.commons.math.util.FastMath.min(52.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test4836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4836");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.162063444860504d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1965223232699738d + "'", double1 == 3.1965223232699738d);
    }

    @Test
    public void test4837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4837");
        double double2 = org.apache.commons.math.util.FastMath.min(0.3707603104765322d, 1.071658885353307d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3707603104765322d + "'", double2 == 0.3707603104765322d);
    }

    @Test
    public void test4838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4838");
        double double1 = org.apache.commons.math.util.FastMath.cosh(4.680482178387856d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 53.9156620210734d + "'", double1 == 53.9156620210734d);
    }

    @Test
    public void test4839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4839");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.028369028739171288d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test4840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4840");
        int int1 = org.apache.commons.math.util.FastMath.round(53.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 53 + "'", int1 == 53);
    }

    @Test
    public void test4841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4841");
        double double2 = org.apache.commons.math.util.FastMath.min(0.36957752722542414d, 0.9644071731001379d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.36957752722542414d + "'", double2 == 0.36957752722542414d);
    }

    @Test
    public void test4842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4842");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7001754393517352d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7756431904284035d + "'", double1 == 0.7756431904284035d);
    }

    @Test
    public void test4843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4843");
        double double2 = org.apache.commons.math.util.FastMath.min(0.8862269254527579d, 0.7871127525111785d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7871127525111785d + "'", double2 == 0.7871127525111785d);
    }

    @Test
    public void test4844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4844");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 1, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4845");
        double double1 = org.apache.commons.math.util.FastMath.atan(97.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5604874136486533d + "'", double1 == 1.5604874136486533d);
    }

    @Test
    public void test4846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4846");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.5215691996538042d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.804953226789363d) + "'", double1 == (-0.804953226789363d));
    }

    @Test
    public void test4847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4847");
        double double1 = org.apache.commons.math.util.FastMath.log(0.7683152502780354d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2635551479263493d) + "'", double1 == (-0.2635551479263493d));
    }

    @Test
    public void test4848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4848");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test4849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4849");
        float float2 = org.apache.commons.math.util.FastMath.max(4.0f, (float) (-2L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test4850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4850");
        double double1 = org.apache.commons.math.util.FastMath.rint((-5.206879716514544E22d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.206879716514544E22d) + "'", double1 == (-5.206879716514544E22d));
    }

    @Test
    public void test4851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4851");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.24468093598772875d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9702146665846273d + "'", double1 == 0.9702146665846273d);
    }

    @Test
    public void test4852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4852");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9033391107665129d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7853981633974483d + "'", double1 == 0.7853981633974483d);
    }

    @Test
    public void test4853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4853");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 5, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test4854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4854");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.7522203923062025d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4855");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 149);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4856");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.5860134523134185E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5860134523134188E15d + "'", double1 == 1.5860134523134188E15d);
    }

    @Test
    public void test4857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4857");
        double double1 = org.apache.commons.math.util.FastMath.log(1.189207115002721d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1732867951399863d + "'", double1 == 0.1732867951399863d);
    }

    @Test
    public void test4858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4858");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) 52.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.053272382792838d) + "'", double1 == (-6.053272382792838d));
    }

    @Test
    public void test4859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4859");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.09933992780358329d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0993399278035833d + "'", double1 == 0.0993399278035833d);
    }

    @Test
    public void test4860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4860");
        double double1 = org.apache.commons.math.util.FastMath.log(51.51359987037848d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.941845847960965d + "'", double1 == 3.941845847960965d);
    }

    @Test
    public void test4861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4861");
        double double1 = org.apache.commons.math.util.FastMath.floor((-36.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-36.0d) + "'", double1 == (-36.0d));
    }

    @Test
    public void test4862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4862");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.7463298239423218d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6902084531060924d + "'", double1 == 0.6902084531060924d);
    }

    @Test
    public void test4863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4863");
        float float2 = org.apache.commons.math.util.FastMath.max(45.0f, (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test4864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4864");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.021412258165214085d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4865");
        double double1 = org.apache.commons.math.util.FastMath.log(35.000000000000014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.555348061489414d + "'", double1 == 3.555348061489414d);
    }

    @Test
    public void test4866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4866");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(3.6347792607040605d, 238.30043127241947d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.634779260704061d + "'", double2 == 3.634779260704061d);
    }

    @Test
    public void test4867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4867");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.50632862831693E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3766481874659711d) + "'", double1 == (-0.3766481874659711d));
    }

    @Test
    public void test4868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4868");
        double double1 = org.apache.commons.math.util.FastMath.asinh(318.93461049977685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.458135737308923d + "'", double1 == 6.458135737308923d);
    }

    @Test
    public void test4869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4869");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.6890624663225461d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9918472337211128d + "'", double1 == 0.9918472337211128d);
    }

    @Test
    public void test4870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4870");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9950547536867305d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8387887784527779d + "'", double1 == 0.8387887784527779d);
    }

    @Test
    public void test4871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4871");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.9999999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.389056098930649d + "'", double1 == 6.389056098930649d);
    }

    @Test
    public void test4872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4872");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.3283909087132568d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3887317335324654d + "'", double1 == 1.3887317335324654d);
    }

    @Test
    public void test4873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4873");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.20675080015374017d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4874");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.365395010882915d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.83076520720161d + "'", double1 == 0.83076520720161d);
    }

    @Test
    public void test4875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4875");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test4876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4876");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.9155040003582885E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.0d + "'", double1 == 52.0d);
    }

    @Test
    public void test4877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4877");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 416128);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4878");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.4650188248182272d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9021994443085871d + "'", double1 == 0.9021994443085871d);
    }

    @Test
    public void test4879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4879");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.356568665264778d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1069990812243715d + "'", double1 == 1.1069990812243715d);
    }

    @Test
    public void test4880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4880");
        int int2 = org.apache.commons.math.util.FastMath.max(0, 149);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 149 + "'", int2 == 149);
    }

    @Test
    public void test4881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4881");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.650880168023008d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2194070299562692d + "'", double1 == 1.2194070299562692d);
    }

    @Test
    public void test4882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4882");
        float float2 = org.apache.commons.math.util.FastMath.max(100.0f, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test4883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4883");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.9754001961551924d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8279263991776009d) + "'", double1 == (-0.8279263991776009d));
    }

    @Test
    public void test4884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4884");
        int int2 = org.apache.commons.math.util.FastMath.max((-1), (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4885");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 6L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test4886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4886");
        long long2 = org.apache.commons.math.util.FastMath.max(2L, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test4887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4887");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 35, 1.5472906E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test4888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4888");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.4184272923915598d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0073029339324377366d + "'", double1 == 0.0073029339324377366d);
    }

    @Test
    public void test4889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4889");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.6345784979980641d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6780340105920697d + "'", double1 == 0.6780340105920697d);
    }

    @Test
    public void test4890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4890");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7615941559557649d + "'", double1 == 0.7615941559557649d);
    }

    @Test
    public void test4891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4891");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.0004147729703148d, 2005.3522829578822d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.296975996234255d + "'", double2 == 2.296975996234255d);
    }

    @Test
    public void test4892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4892");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.5057929593184664d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5057929593184665d + "'", double1 == 0.5057929593184665d);
    }

    @Test
    public void test4893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4893");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.0133109241786307d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test4894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4894");
        double double2 = org.apache.commons.math.util.FastMath.pow(8.467720335926631E7d, 1.0209102525207299d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2403324490444341E8d + "'", double2 == 1.2403324490444341E8d);
    }

    @Test
    public void test4895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4895");
        double double1 = org.apache.commons.math.util.FastMath.tan((-2.1317761108019555d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5915576703333734d + "'", double1 == 1.5915576703333734d);
    }

    @Test
    public void test4896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4896");
        double double2 = org.apache.commons.math.util.FastMath.atan2(3.4657359027997265d, 0.6707931770950559d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3796103144511154d + "'", double2 == 1.3796103144511154d);
    }

    @Test
    public void test4897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4897");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 416128.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4898");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.2245999714347802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0316268884157165d + "'", double1 == 1.0316268884157165d);
    }

    @Test
    public void test4899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4899");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.0139617178500335d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5285016474885961d + "'", double1 == 0.5285016474885961d);
    }

    @Test
    public void test4900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4900");
        long long2 = org.apache.commons.math.util.FastMath.max((long) '#', (-2L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test4901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4901");
        double double2 = org.apache.commons.math.util.FastMath.min(1.1134536045423389d, (-3.8754705787895336d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.8754705787895336d) + "'", double2 == (-3.8754705787895336d));
    }

    @Test
    public void test4902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4902");
        double double1 = org.apache.commons.math.util.FastMath.acos((-10.055592286993075d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4903");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.3820287244081937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1755971777816556d + "'", double1 == 1.1755971777816556d);
    }

    @Test
    public void test4904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4904");
        double double1 = org.apache.commons.math.util.FastMath.tan(5.00264328101366d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.3479554871623756d) + "'", double1 == (-3.3479554871623756d));
    }

    @Test
    public void test4905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4905");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.24468093598772878d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.239912188341236d + "'", double1 == 0.239912188341236d);
    }

    @Test
    public void test4906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4906");
        double double1 = org.apache.commons.math.util.FastMath.sin((-2.185039863261519d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8172096612475641d) + "'", double1 == (-0.8172096612475641d));
    }

    @Test
    public void test4907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4907");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.5707963267948954d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.162447351509626d + "'", double1 == 1.162447351509626d);
    }

    @Test
    public void test4908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4908");
        double double1 = org.apache.commons.math.util.FastMath.atan(23.620277154609447d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5284850882241148d + "'", double1 == 1.5284850882241148d);
    }

    @Test
    public void test4909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4909");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.3235780930645504d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1504686406263103d + "'", double1 == 1.1504686406263103d);
    }

    @Test
    public void test4910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4910");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.3066167674914817d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0053514721345482704d + "'", double1 == 0.0053514721345482704d);
    }

    @Test
    public void test4911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4911");
        double double1 = org.apache.commons.math.util.FastMath.atan(7.896296018267969E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.570796326794884d + "'", double1 == 1.570796326794884d);
    }

    @Test
    public void test4912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4912");
        double double2 = org.apache.commons.math.util.FastMath.min(4.9E-324d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test4913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4913");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5574060173404456d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4914");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.0580220586617817d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0189782343563747d + "'", double1 == 1.0189782343563747d);
    }

    @Test
    public void test4915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4915");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.450905222306537d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1672181467171638d + "'", double1 == 1.1672181467171638d);
    }

    @Test
    public void test4916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4916");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9360992169392087d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2113712992280372d + "'", double1 == 1.2113712992280372d);
    }

    @Test
    public void test4917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4917");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9994533134057076d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4918");
        double double1 = org.apache.commons.math.util.FastMath.asin(28.000000000000004d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4919");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 1477896, 15472906L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1477896L + "'", long2 == 1477896L);
    }

    @Test
    public void test4920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4920");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7805951733159241d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6530481872478414d + "'", double1 == 0.6530481872478414d);
    }

    @Test
    public void test4921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4921");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.201488995569804d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4922");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test4923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4923");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-5.316577016430221E-6d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4924");
        int int2 = org.apache.commons.math.util.FastMath.max(32, 11013);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11013 + "'", int2 == 11013);
    }

    @Test
    public void test4925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4925");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.07454121709103567d, 7.930067261567155E14d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.399821544048882E-17d + "'", double2 == 9.399821544048882E-17d);
    }

    @Test
    public void test4926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4926");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.5127742681331149d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6699175736806615d + "'", double1 == 0.6699175736806615d);
    }

    @Test
    public void test4927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4927");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.070843830251405d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4928");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.010869682119891842d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.010870110224399774d) + "'", double1 == (-0.010870110224399774d));
    }

    @Test
    public void test4929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4929");
        double double1 = org.apache.commons.math.util.FastMath.log(1.0986122886681098d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0940478276166991d + "'", double1 == 0.0940478276166991d);
    }

    @Test
    public void test4930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4930");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.8365164337420498d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 47.92886114675442d + "'", double1 == 47.92886114675442d);
    }

    @Test
    public void test4931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4931");
        double double1 = org.apache.commons.math.util.FastMath.tan(1262023.5276316951d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.795297172557674d) + "'", double1 == (-4.795297172557674d));
    }

    @Test
    public void test4932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4932");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.5707963267948957d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.494107596574928E-16d + "'", double1 == 9.494107596574928E-16d);
    }

    @Test
    public void test4933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4933");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.0835112623546754d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6467212374248812d + "'", double1 == 1.6467212374248812d);
    }

    @Test
    public void test4934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4934");
        double double1 = org.apache.commons.math.util.FastMath.acos((-4.999750016661555E-5d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.570846324295084d + "'", double1 == 1.570846324295084d);
    }

    @Test
    public void test4935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4935");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.8337422720523482d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6824803147105846d) + "'", double1 == (-0.6824803147105846d));
    }

    @Test
    public void test4936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4936");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.5669767943827967d, (-0.001241651988975115d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0007048074194658d + "'", double2 == 1.0007048074194658d);
    }

    @Test
    public void test4937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4937");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.24468093598772878d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2188792207572072d + "'", double1 == 0.2188792207572072d);
    }

    @Test
    public void test4938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4938");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 57);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 57L + "'", long1 == 57L);
    }

    @Test
    public void test4939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4939");
        double double1 = org.apache.commons.math.util.FastMath.asinh(9.038180788153241E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.038180775847953E-5d + "'", double1 == 9.038180775847953E-5d);
    }

    @Test
    public void test4940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4940");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9891889676686395d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9963832574998945d + "'", double1 == 0.9963832574998945d);
    }

    @Test
    public void test4941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4941");
        double double1 = org.apache.commons.math.util.FastMath.atanh(7.896296018267969E13d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4942");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.11831214619987152d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6893862438357914d + "'", double1 == 1.6893862438357914d);
    }

    @Test
    public void test4943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4943");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.0009999068626307d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4944");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test4945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4945");
        double double2 = org.apache.commons.math.util.FastMath.max(0.015129758985515648d, (-0.008837977760189568d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.015129758985515648d + "'", double2 == 0.015129758985515648d);
    }

    @Test
    public void test4946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4946");
        double double1 = org.apache.commons.math.util.FastMath.atanh(52.00000000000001d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4947");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.477141806555308d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49739954541489634d + "'", double1 == 0.49739954541489634d);
    }

    @Test
    public void test4948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4948");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 15472906L, 4.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test4949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4949");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.7237289657353608d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7237289657353608d + "'", double1 == 0.7237289657353608d);
    }

    @Test
    public void test4950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4950");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 45L, 5.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 45.0f + "'", float2 == 45.0f);
    }

    @Test
    public void test4951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4951");
        double double2 = org.apache.commons.math.util.FastMath.max(203.72287995187472d, 1.313261687518223d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 203.72287995187472d + "'", double2 == 203.72287995187472d);
    }

    @Test
    public void test4952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4952");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.09917726107940236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0990153898205587d + "'", double1 == 0.0990153898205587d);
    }

    @Test
    public void test4953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4953");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.6360918665423811d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8813735870195428d + "'", double1 == 0.8813735870195428d);
    }

    @Test
    public void test4954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4954");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.07359197216738352d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07365856088055989d + "'", double1 == 0.07365856088055989d);
    }

    @Test
    public void test4955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4955");
        double double2 = org.apache.commons.math.util.FastMath.pow(199.00499987500626d, (-1.0682441653224442d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0035014824830410943d + "'", double2 == 0.0035014824830410943d);
    }

    @Test
    public void test4956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4956");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.9851462604682474d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4957");
        int int1 = org.apache.commons.math.util.FastMath.abs((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test4958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4958");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(465424.8713320038d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 77.49669753985923d + "'", double1 == 77.49669753985923d);
    }

    @Test
    public void test4959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4959");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.24619002710729038d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2791426222204005d + "'", double1 == 1.2791426222204005d);
    }

    @Test
    public void test4960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4960");
        float float2 = org.apache.commons.math.util.FastMath.min((-1.0f), (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test4961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4961");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.4262213939948603d), 0.32214347159644924d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9235855636672554d) + "'", double2 == (-0.9235855636672554d));
    }

    @Test
    public void test4962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4962");
        long long2 = org.apache.commons.math.util.FastMath.min(10L, 416128L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test4963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4963");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.7615941559557656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.650880168023008d + "'", double1 == 0.650880168023008d);
    }

    @Test
    public void test4964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4964");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (-36));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-36) + "'", int2 == (-36));
    }

    @Test
    public void test4965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4965");
        double double1 = org.apache.commons.math.util.FastMath.asin(2005.3522829578822d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4966");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(6.766375983153399E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.876847864333728E-5d + "'", double1 == 3.876847864333728E-5d);
    }

    @Test
    public void test4967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4967");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-53.00704927389939d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-53.0d) + "'", double1 == (-53.0d));
    }

    @Test
    public void test4968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4968");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.0192608780318253d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.771145792105561d + "'", double1 == 2.771145792105561d);
    }

    @Test
    public void test4969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4969");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.310651852518919d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36431415595777866d + "'", double1 == 0.36431415595777866d);
    }

    @Test
    public void test4970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4970");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-1), (float) 1586013452313419L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.58601345E15f + "'", float2 == 1.58601345E15f);
    }

    @Test
    public void test4971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4971");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.9754001961551925d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9917318921852735d) + "'", double1 == (-0.9917318921852735d));
    }

    @Test
    public void test4972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4972");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.03673618878368824d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03672792646886562d + "'", double1 == 0.03672792646886562d);
    }

    @Test
    public void test4973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4973");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.3745669993918976d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4974");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.0037614443570399263d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4975");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.017024767257676526d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test4976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4976");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.9117339147869651d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1474855016641485d) + "'", double1 == (-1.1474855016641485d));
    }

    @Test
    public void test4977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4977");
        long long2 = org.apache.commons.math.util.FastMath.min((-36L), (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-36L) + "'", long2 == (-36L));
    }

    @Test
    public void test4978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4978");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) 416128);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 645.0798400198227d + "'", double1 == 645.0798400198227d);
    }

    @Test
    public void test4979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4979");
        double double2 = org.apache.commons.math.util.FastMath.pow(4.680482178387855d, 0.8990819272930286d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.005402465832298d + "'", double2 == 4.005402465832298d);
    }

    @Test
    public void test4980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4980");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.0073029339324377366d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.007302804107846621d + "'", double1 == 0.007302804107846621d);
    }

    @Test
    public void test4981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4981");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.5708871266543591d, (-0.5063656411097343d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8826238623526614d + "'", double2 == 1.8826238623526614d);
    }

    @Test
    public void test4982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4982");
        long long2 = org.apache.commons.math.util.FastMath.max(3L, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test4983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4983");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 53, 5L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 53L + "'", long2 == 53L);
    }

    @Test
    public void test4984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4984");
        double double2 = org.apache.commons.math.util.FastMath.min(0.5686300059875781d, 9.602680054508745E-24d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.602680054508745E-24d + "'", double2 == 9.602680054508745E-24d);
    }

    @Test
    public void test4985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4985");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.6904492636009615d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4986");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.10757413843619563d), 11013.232920103304d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-9.76771663808282E-6d) + "'", double2 == (-9.76771663808282E-6d));
    }

    @Test
    public void test4987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4987");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.2378644027129617d, 0.9550315978940166d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9136668838819056d + "'", double2 == 0.9136668838819056d);
    }

    @Test
    public void test4988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4988");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.18352087838274772d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18455277575838422d + "'", double1 == 0.18455277575838422d);
    }

    @Test
    public void test4989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4989");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.8813735870195432d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9388149908366095d + "'", double1 == 0.9388149908366095d);
    }

    @Test
    public void test4990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4990");
        double double1 = org.apache.commons.math.util.FastMath.log10(7.821622829149065d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8932968697638163d + "'", double1 == 0.8932968697638163d);
    }

    @Test
    public void test4991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4991");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.716759133972877d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4992");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) 6);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.960170286650366d + "'", double1 == 0.960170286650366d);
    }

    @Test
    public void test4993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4993");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.7755575615628914E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test4994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4994");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9533010145860434d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.984184871799573d + "'", double1 == 0.984184871799573d);
    }

    @Test
    public void test4995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4995");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.08726646259971647d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4834187208706786d + "'", double1 == 1.4834187208706786d);
    }

    @Test
    public void test4996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4996");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.36431415595777866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4997");
        int int2 = org.apache.commons.math.util.FastMath.max((int) ' ', 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test4998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4998");
        long long2 = org.apache.commons.math.util.FastMath.min(36L, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 36L + "'", long2 == 36L);
    }

    @Test
    public void test4999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4999");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.6033293179688031d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test5000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test5000");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 5, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }
}

