import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        long long2 = org.apache.commons.math.util.FastMath.min(45L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.307194259161069d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8360321798777053d + "'", double1 == 0.8360321798777053d);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.1441700230118208E12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9193629443874066d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.016045910400389767d + "'", double1 == 0.016045910400389767d);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-5.206879716514544E22d), 2.502154937700735d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963267948966d) + "'", double2 == (-1.5707963267948966d));
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 0, 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 3.8108072797718955d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        long long2 = org.apache.commons.math.util.FastMath.min(45L, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.0835112623546757d, 0.053286411214247056d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0835112623546754d + "'", double2 == 1.0835112623546754d);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        int int2 = org.apache.commons.math.util.FastMath.min(57, (-53));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-53) + "'", int2 == (-53));
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        int int1 = org.apache.commons.math.util.FastMath.abs(57);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 57 + "'", int1 == 57);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '#', 149);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 149 + "'", int2 == 149);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.8337422720523482d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8337422720523482d + "'", double1 == 0.8337422720523482d);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        int int2 = org.apache.commons.math.util.FastMath.max(84677176, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 84677176 + "'", int2 == 84677176);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.27631948176648663d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.27984920853320866d + "'", double1 == 0.27984920853320866d);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.8813735870195432d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7949577687638787d + "'", double1 == 0.7949577687638787d);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.3106472496723418d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7568396789787584d + "'", double1 == 3.7568396789787584d);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.3574158419544757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13271291339328767d + "'", double1 == 0.13271291339328767d);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.7103669532614669d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6521120104928195d + "'", double1 == 0.6521120104928195d);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.013865150856733838d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01386515085673384d + "'", double1 == 0.01386515085673384d);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.07454121709103567d, (-7.52574989159953d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.131688154945343d + "'", double2 == 3.131688154945343d);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.4650188248182274d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.327624706282432d + "'", double1 == 4.327624706282432d);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) 32L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5585053606381855d + "'", double1 == 0.5585053606381855d);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.176962421128026d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5614275029490499d) + "'", double1 == (-0.5614275029490499d));
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.2136609872391593d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        long long1 = org.apache.commons.math.util.FastMath.round(416127.66138192907d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 416128L + "'", long1 == 416128L);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.9016684086532855d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.6229585671655451d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.433704240591099d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8924232090626707d + "'", double1 == 0.8924232090626707d);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.4032630823831073d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.394411534628069d) + "'", double1 == (-0.394411534628069d));
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.771137740740136d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.556529890912072d + "'", double1 == 1.556529890912072d);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.118870081899753d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.7282657137693634d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7282657137693634d + "'", double1 == 0.7282657137693634d);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(4.574710978503383d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.574710978503384d + "'", double1 == 4.574710978503384d);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        int int1 = org.apache.commons.math.util.FastMath.round(1.58601345E15f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.0028590734924855603d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16381284443715088d + "'", double1 == 0.16381284443715088d);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.02411494803001423d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02411962364530756d + "'", double1 == 0.02411962364530756d);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        double double2 = org.apache.commons.math.util.FastMath.pow(14.899277193215994d, 0.677511790861663d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.234954028085534d + "'", double2 == 6.234954028085534d);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-1L), (float) 32L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8199744766146694d, (-0.6229585671655451d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1316153248585041d + "'", double2 == 1.1316153248585041d);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.766978271236858d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3088320802468052d + "'", double1 == 1.3088320802468052d);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(327.1084999525159d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18741.93649013445d + "'", double1 == 18741.93649013445d);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        double double1 = org.apache.commons.math.util.FastMath.log10((-3036.676314193363d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.012599649098168814d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.23269451697447066d) + "'", double1 == (-0.23269451697447066d));
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        int int1 = org.apache.commons.math.util.FastMath.abs(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        double double2 = org.apache.commons.math.util.FastMath.max(1.8351015231807233d, 0.9157372585173394d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8351015231807233d + "'", double2 == 1.8351015231807233d);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.193861478082777d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0926396835566503d + "'", double1 == 1.0926396835566503d);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.05723320573453925d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05726445674725292d + "'", double1 == 0.05726445674725292d);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        double double1 = org.apache.commons.math.util.FastMath.atan(4.680482178387856d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3603078162116136d + "'", double1 == 1.3603078162116136d);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.217380259166629d, 4.248291097914389d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.48105018967490865d + "'", double2 == 0.48105018967490865d);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.748066029033894E7d + "'", double1 == 3.748066029033894E7d);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.8693235746902677d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        double double1 = org.apache.commons.math.util.FastMath.log(7.951853132063153E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-14.04469065108256d) + "'", double1 == (-14.04469065108256d));
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        double double1 = org.apache.commons.math.util.FastMath.rint((-10.017874927409903d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-10.0d) + "'", double1 == (-10.0d));
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.3603078162116136d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8587920411303291d + "'", double1 == 0.8587920411303291d);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.1742549955138671d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.28495825391099355d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5452187590232507d) + "'", double1 == (-0.5452187590232507d));
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.0026285182523425486d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.3088320802468052d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11688393127179245d + "'", double1 == 0.11688393127179245d);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-3.8754705787895336d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-24.092316404524105d) + "'", double1 == (-24.092316404524105d));
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-34.657359027997266d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.3565686652647782d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8828470691743546d + "'", double1 == 2.8828470691743546d);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.6699175736806615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9950915100179343d + "'", double1 == 0.9950915100179343d);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.180041580820244E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2490718174402814E16d + "'", double1 == 1.2490718174402814E16d);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        float float2 = org.apache.commons.math.util.FastMath.min(35.0f, 35.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) 2.15561577E15f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.30685281589777d + "'", double1 == 35.30685281589777d);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        double double1 = org.apache.commons.math.util.FastMath.cosh(11014.999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9926395119337849d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.6082399792973231d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7061231096103905d + "'", double1 == 0.7061231096103905d);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        long long1 = org.apache.commons.math.util.FastMath.round(1.0580220586617817d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.6506325163944369d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.5614275029490499d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        double double1 = org.apache.commons.math.util.FastMath.tanh(4.437442032932441d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.999720323431057d + "'", double1 == 0.999720323431057d);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.5528548740537169d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5279804254677947d) + "'", double1 == (-0.5279804254677947d));
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.5528548740537169d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5528548740537169d + "'", double1 == 0.5528548740537169d);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.31712849292107215d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-18.170124207721837d) + "'", double1 == (-18.170124207721837d));
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 22.24855859029184d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        double double2 = org.apache.commons.math.util.FastMath.max(0.4430227241169226d, 0.755461289508684d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.755461289508684d + "'", double2 == 0.755461289508684d);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(35.30685281944005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.280597898745615d + "'", double1 == 3.280597898745615d);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        double double1 = org.apache.commons.math.util.FastMath.atan(26.339410356026733d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5328486305031588d + "'", double1 == 1.5328486305031588d);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.7835271334741006d), (double) 2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0d + "'", double2 == 2.0d);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.8554182836643194d), 4.3777255673228614d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8554182836643194d) + "'", double2 == (-0.8554182836643194d));
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        long long1 = org.apache.commons.math.util.FastMath.round((-3.6268604078470186d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-4L) + "'", long1 == (-4L));
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.6530481872478414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5785150749710588d + "'", double1 == 0.5785150749710588d);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.43930669835763825d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4393066983576382d) + "'", double1 == (-0.4393066983576382d));
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        long long2 = org.apache.commons.math.util.FastMath.max(1586013452313419L, (long) 36);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1586013452313419L + "'", long2 == 1586013452313419L);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.3833162101372999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.393384092660241d + "'", double1 == 0.393384092660241d);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        double double1 = org.apache.commons.math.util.FastMath.acosh(8.467720335926631E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18.947504158256688d + "'", double1 == 18.947504158256688d);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        double double1 = org.apache.commons.math.util.FastMath.tanh(7.93006726156715E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        double double2 = org.apache.commons.math.util.FastMath.pow(4.248291097914389d, 1764.9013237338472d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.0026285333864166493d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.051269224554469806d + "'", double1 == 0.051269224554469806d);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 45L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 45.0f + "'", float1 == 45.0f);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        double double1 = org.apache.commons.math.util.FastMath.log(2.6934058165391472d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9908064955841372d + "'", double1 == 0.9908064955841372d);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        int int2 = org.apache.commons.math.util.FastMath.min((-36), (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-36) + "'", int2 == (-36));
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) 149);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8421709430404007E-14d + "'", double1 == 2.8421709430404007E-14d);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 100, 1477896);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.766978271236858d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6966776618121893d + "'", double1 == 0.6966776618121893d);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.1200868748495079d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        double double2 = org.apache.commons.math.util.FastMath.max(4.85314001086485d, 1.0001353885748059d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.85314001086485d + "'", double2 == 4.85314001086485d);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 52L, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.5452187590232507d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        long long2 = org.apache.commons.math.util.FastMath.max(2155615773557597L, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2155615773557597L + "'", long2 == 2155615773557597L);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.00000000000001d + "'", double1 == 35.00000000000001d);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        double double1 = org.apache.commons.math.util.FastMath.log(4.759755815723173d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.560196367709658d + "'", double1 == 1.560196367709658d);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        double double1 = org.apache.commons.math.util.FastMath.expm1(7.951386703658792E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.951386703658795E-16d + "'", double1 == 7.951386703658795E-16d);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.7992428657093575d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.5408212093041704d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.814737873122817d + "'", double1 == 0.814737873122817d);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 10, (long) 1477896);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        double double2 = org.apache.commons.math.util.FastMath.min(1.817884356931778d, 0.6885025193255089d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6885025193255089d + "'", double2 == 0.6885025193255089d);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9695968919838217d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9995895072691775d, (double) 1586013452313419L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9995895072691775d + "'", double2 == 0.9995895072691775d);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.853200064217061d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.6063268761536349d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8336836665378882d + "'", double1 == 1.8336836665378882d);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        double double2 = org.apache.commons.math.util.FastMath.min(0.5013507798060323d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(22.180709777452588d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.709640090012462d + "'", double1 == 4.709640090012462d);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.3127199080565219d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.31784189721835715d + "'", double1 == 0.31784189721835715d);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        double double1 = org.apache.commons.math.util.FastMath.tan(215.5579348013961d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.6661203985235478d) + "'", double1 == (-2.6661203985235478d));
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.03172806744895933d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03173339314553415d + "'", double1 == 0.03173339314553415d);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.6879830786861454d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 97);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 97L + "'", long1 == 97L);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        double double1 = org.apache.commons.math.util.FastMath.floor(11.591953275521519d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.0d + "'", double1 == 11.0d);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        long long2 = org.apache.commons.math.util.FastMath.max(10L, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.0637969690534153d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.31466697030166657d + "'", double1 == 0.31466697030166657d);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.8575532158463938d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9260416922830169d + "'", double1 == 0.9260416922830169d);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.3440585709080869E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080869E43d + "'", double1 == 1.3440585709080869E43d);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        double double2 = org.apache.commons.math.util.FastMath.min(1.002631991009127d, (-0.8375930412496614d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8375930412496614d) + "'", double2 == (-0.8375930412496614d));
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.7306786685136297d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.07414666724177091d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1299083649462789d) + "'", double1 == (-1.1299083649462789d));
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.9033391107665127d), 0.8809373872769856d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9033391107665126d) + "'", double2 == (-0.9033391107665126d));
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 10, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        double double1 = org.apache.commons.math.util.FastMath.log10(4.327624706282431d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6362495915029428d + "'", double1 == 0.6362495915029428d);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(5.366643026452033d, 1.4419647419307422d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.366643026452032d + "'", double2 == 5.366643026452032d);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.41032129904824216d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.42280635864377986d) + "'", double1 == (-0.42280635864377986d));
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.2775176041484217d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5267993964958784d + "'", double1 == 0.5267993964958784d);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.135922199745734d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.114043989714556d + "'", double1 == 3.114043989714556d);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.7370361196913022d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7522203923062025d + "'", double1 == 2.7522203923062025d);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        double double1 = org.apache.commons.math.util.FastMath.cos((-3.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9899924966004454d) + "'", double1 == (-0.9899924966004454d));
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.3162739259961891d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6813252169987396d + "'", double1 == 0.6813252169987396d);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 11013, (float) 4L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0026974884567037482d, 1.2715542753135176d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2715542753135176d + "'", double2 == 1.2715542753135176d);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        double double1 = org.apache.commons.math.util.FastMath.ulp(7.4764165040274095d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.6883420083174141d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.523746987213264d + "'", double1 == 0.523746987213264d);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.9942575694137897d), 4.041914822473389d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9942575694137896d) + "'", double2 == (-0.9942575694137896d));
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        double double1 = org.apache.commons.math.util.FastMath.log(148.80597572185025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.00264328101366d + "'", double1 == 5.00264328101366d);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.5127742681331149d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        double double2 = org.apache.commons.math.util.FastMath.atan2(53.0d, 0.7819722235803451d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5560432043521122d + "'", double2 == 1.5560432043521122d);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.130497003573102d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.419050069773651d + "'", double1 == 7.419050069773651d);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        long long1 = org.apache.commons.math.util.FastMath.abs(11013L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 11013L + "'", long1 == 11013L);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        double double1 = org.apache.commons.math.util.FastMath.floor((-52.61372804946848d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-53.0d) + "'", double1 == (-53.0d));
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 36L, (float) 52);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        double double2 = org.apache.commons.math.util.FastMath.min((-1.5707963267948966d), 3.3480571885407375d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963267948966d) + "'", double2 == (-1.5707963267948966d));
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5472906394139022E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.7367922631517189d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9434257847789064d) + "'", double1 == (-0.9434257847789064d));
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        float float2 = org.apache.commons.math.util.FastMath.min(9.223372E18f, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.7871127525111784d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7871127525111785d + "'", double1 == 0.7871127525111785d);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.40767170372406053d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.0026974884567037482d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15455470385438266d + "'", double1 == 0.15455470385438266d);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.24619002710729043d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2791426222204005d + "'", double1 == 1.2791426222204005d);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.0222383329741738d, 7.951386703658795E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000000000000007d + "'", double2 == 1.0000000000000007d);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-1.5707963267948966d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (short) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 100.0f + "'", float1 == 100.0f);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.5403023058681398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.154434690031884d, 0.002205218707991866d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0016940011094824d + "'", double2 == 1.0016940011094824d);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 0.4419864533963391d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.5949065948500845d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5949065948500846d + "'", double1 == 0.5949065948500846d);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        long long1 = org.apache.commons.math.util.FastMath.round(6.34960155562218d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 6L + "'", long1 == 6L);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1477896L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1477896.0f + "'", float2 == 1477896.0f);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        long long2 = org.apache.commons.math.util.FastMath.max((-4L), (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.23191437957608327d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.287715158104549d + "'", double1 == 13.287715158104549d);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.09917726107940236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        double double1 = org.apache.commons.math.util.FastMath.sin((-3.3520838269185758d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.20894025738121733d + "'", double1 == 0.20894025738121733d);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        long long1 = org.apache.commons.math.util.FastMath.round(0.8587033066171034d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.08776598447540371d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (-53L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 53.0f + "'", float1 == 53.0f);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2155615773557597L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.15561577E15f + "'", float2 == 2.15561577E15f);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        double double2 = org.apache.commons.math.util.FastMath.min(0.2743356563668091d, 189.3225229221956d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2743356563668091d + "'", double2 == 0.2743356563668091d);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.6699175736806615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6699175736806615d + "'", double1 == 1.6699175736806615d);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.9999999999999999d), 2.0808864545885957E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9999999999999998d) + "'", double2 == (-0.9999999999999998d));
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.4393066983576382d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4393066983576382d + "'", double1 == 0.4393066983576382d);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) 84677176L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0314323214767873d + "'", double1 == 1.0314323214767873d);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        int int2 = org.apache.commons.math.util.FastMath.max((-36), (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        double double1 = org.apache.commons.math.util.FastMath.atan(4.499686190671499d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3521126124417233d + "'", double1 == 1.3521126124417233d);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.003576212944920802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0035762205678407963d + "'", double1 == 0.0035762205678407963d);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        double double1 = org.apache.commons.math.util.FastMath.acosh(4.594700892207039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.205992763916979d + "'", double1 == 2.205992763916979d);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8543714174431914d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5464562895278918d + "'", double1 == 0.5464562895278918d);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.477141806555308d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5192770005594214d + "'", double1 == 0.5192770005594214d);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 52, 1.03908175332576d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5508166443572533d + "'", double2 == 1.5508166443572533d);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.10526095353969918d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10506753677637078d + "'", double1 == 0.10506753677637078d);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        double double1 = org.apache.commons.math.util.FastMath.rint((-1.2554125869476498d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.7615941559557656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3043045862358968d + "'", double1 == 1.3043045862358968d);
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        double double1 = org.apache.commons.math.util.FastMath.acos(416128.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        double double1 = org.apache.commons.math.util.FastMath.floor((-1.0476958419065936d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        long long1 = org.apache.commons.math.util.FastMath.round(0.7852869460862587d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9948376736367679d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.838670567945424d + "'", double1 == 0.838670567945424d);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        double double1 = org.apache.commons.math.util.FastMath.log1p(127.14212645660416d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.85314001086485d + "'", double1 == 4.85314001086485d);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        double double1 = org.apache.commons.math.util.FastMath.cos(1262023.527631695d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.20414594311450418d) + "'", double1 == (-0.20414594311450418d));
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 5, 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.7266953932355397d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7923652280736779d + "'", double1 == 0.7923652280736779d);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9157372585176266d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4494190750372284d + "'", double1 == 1.4494190750372284d);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.0026974884567037482d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0026974917280683974d + "'", double1 == 0.0026974917280683974d);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.6826664571216056d, (-77.26503394947866d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6826664571216055d + "'", double2 == 0.6826664571216055d);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9983608366524339d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5416808877895967d + "'", double1 == 0.5416808877895967d);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        long long2 = org.apache.commons.math.util.FastMath.max(100L, 416128L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 416128L + "'", long2 == 416128L);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        double double1 = org.apache.commons.math.util.FastMath.sinh(231.58466047909457d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.883259400089535E100d + "'", double1 == 1.883259400089535E100d);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.650856032201109d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.650856032201109d + "'", double1 == 0.650856032201109d);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.2200909184537633d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19892537929119714d + "'", double1 == 0.19892537929119714d);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.7949577687638787d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8916040425905878d + "'", double1 == 0.8916040425905878d);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        long long1 = org.apache.commons.math.util.FastMath.abs(15472906L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 15472906L + "'", long1 == 15472906L);
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 57L, 52.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.7819722235803451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.05042677562564d + "'", double1 == 1.05042677562564d);
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.30102999566398114d, 0.1d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2500725948322744d + "'", double2 == 1.2500725948322744d);
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.5992428797223133d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.2083543502704377d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8361851675767115d + "'", double1 == 0.8361851675767115d);
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        double double1 = org.apache.commons.math.util.FastMath.ulp(3.6347792607040605d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.193861478082777d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 68.40322401739336d + "'", double1 == 68.40322401739336d);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-34.657359027997266d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9946617253101226d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7038095562247406d + "'", double1 == 2.7038095562247406d);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        double double1 = org.apache.commons.math.util.FastMath.atanh(148.80597572185025d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.03908175332576d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        int int2 = org.apache.commons.math.util.FastMath.min((int) 'a', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        double double2 = org.apache.commons.math.util.FastMath.min(64.07496514575753d, (-0.8508659131646942d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8508659131646942d) + "'", double2 == (-0.8508659131646942d));
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        double double1 = org.apache.commons.math.util.FastMath.tanh(4.2146848510894035E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.214684851089401E-8d + "'", double1 == 4.214684851089401E-8d);
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        double double1 = org.apache.commons.math.util.FastMath.floor(18741.93649013445d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18741.0d + "'", double1 == 18741.0d);
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        long long2 = org.apache.commons.math.util.FastMath.max(2L, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 215.5579348013961d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.5860134523134185E15d, (-4.632512904931238d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.840451469933454E-71d + "'", double2 == 3.840451469933454E-71d);
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.634578497998064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.19751464758227577d) + "'", double1 == (-0.19751464758227577d));
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.017453292519943295d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01745417873758517d) + "'", double1 == (-0.01745417873758517d));
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.3521126124417233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.816325517616662d + "'", double1 == 0.816325517616662d);
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.313261687518223d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.796745936845354d + "'", double1 == 3.796745936845354d);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.2014038779280567d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.539592182845684d + "'", double1 == 11.539592182845684d);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        float float2 = org.apache.commons.math.util.FastMath.max(8.4677176E7f, (float) 1477896L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.4677176E7f + "'", float2 == 8.4677176E7f);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9033391107665127d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015766241744913406d + "'", double1 == 0.015766241744913406d);
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 35L, 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        long long2 = org.apache.commons.math.util.FastMath.max(11013L, 15472906L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 15472906L + "'", long2 == 15472906L);
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.2545767570502781d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2602228186091414d) + "'", double1 == (-0.2602228186091414d));
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.0222383329741738d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 115.86572164899141d + "'", double1 == 115.86572164899141d);
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        double double1 = org.apache.commons.math.util.FastMath.log10(173988.73655062242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.240521134419134d + "'", double1 == 5.240521134419134d);
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.7819722235803451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        long long1 = org.apache.commons.math.util.FastMath.round(55.367870644634905d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 55L + "'", long1 == 55L);
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        long long1 = org.apache.commons.math.util.FastMath.abs(2147483647L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2147483647L + "'", long1 == 2147483647L);
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        long long2 = org.apache.commons.math.util.FastMath.min((-2L), (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        long long1 = org.apache.commons.math.util.FastMath.round(0.10757413843619563d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        double double1 = org.apache.commons.math.util.FastMath.log(18.947504158256688d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9416722161660465d + "'", double1 == 2.9416722161660465d);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.10526095353969918d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10487390963856849d + "'", double1 == 0.10487390963856849d);
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.25457675705027805d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        double double1 = org.apache.commons.math.util.FastMath.sin(3.7621956910836314d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5815258540844123d) + "'", double1 == (-0.5815258540844123d));
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        long long2 = org.apache.commons.math.util.FastMath.min(2L, (long) 5);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.883259400089535E100d, 0.7850896760339817d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.306360105454386E78d + "'", double2 == 5.306360105454386E78d);
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        double double2 = org.apache.commons.math.util.FastMath.max(1.5707963263292353d, 41.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 41.0d + "'", double2 == 41.0d);
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.4436354751788103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.163085598195192d + "'", double1 == 1.163085598195192d);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 10, 149L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 149L + "'", long2 == 149L);
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.09917726107940236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09934057169626952d + "'", double1 == 0.09934057169626952d);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.8174375413706592E17d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.410122136122596d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9261711162367934d + "'", double1 == 1.9261711162367934d);
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 53);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 53.0f + "'", float1 == 53.0f);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(5506.500045400884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 74.20579522787209d + "'", double1 == 74.20579522787209d);
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.9145768651795099d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.33704882067673875d) + "'", double1 == (-0.33704882067673875d));
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        int int2 = org.apache.commons.math.util.FastMath.min(36, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        double double1 = org.apache.commons.math.util.FastMath.sinh(7.419050069773651d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 833.7240977253724d + "'", double1 == 833.7240977253724d);
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.0222383329741738d, 0.963822509477476d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9713697672395085d + "'", double2 == 1.9713697672395085d);
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        double double2 = org.apache.commons.math.util.FastMath.min(100.0d, (-0.43930669835763825d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.43930669835763825d) + "'", double2 == (-0.43930669835763825d));
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 6L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        double double1 = org.apache.commons.math.util.FastMath.signum((-3.3520838269185758d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(15.333571352853085d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4843594926881187d + "'", double1 == 2.4843594926881187d);
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        float float2 = org.apache.commons.math.util.FastMath.min(149.0f, (float) 52);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        double double2 = org.apache.commons.math.util.FastMath.min((-2.9999999999999996d), (-0.5215691996538042d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.9999999999999996d) + "'", double2 == (-2.9999999999999996d));
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        double double1 = org.apache.commons.math.util.FastMath.log(1936674.200214744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.476482730108396d + "'", double1 == 14.476482730108396d);
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.5860134523134308E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.0d + "'", double1 == 35.0d);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-1.2246467991473532E-16d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.016709298534876E-15d) + "'", double1 == (-7.016709298534876E-15d));
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 1, (float) 6);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.0f + "'", float2 == 6.0f);
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.7076312586751926d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7076312586751925d) + "'", double1 == (-0.7076312586751925d));
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.01745417873758517d), 1.5607966601082317d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.011182399124905689d) + "'", double2 == (-0.011182399124905689d));
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        double double1 = org.apache.commons.math.util.FastMath.signum(14.206130012655933d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.01180062424654847d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10863067820164095d + "'", double1 == 0.10863067820164095d);
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.6813252169987396d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8315832436782697d + "'", double1 == 0.8315832436782697d);
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.3833162101372999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        double double1 = org.apache.commons.math.util.FastMath.acos(9.307013259236443d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-15.385301667943363d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.4871501547072263d) + "'", double1 == (-2.4871501547072263d));
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.03900892838436512d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2350469597522027d + "'", double1 == 2.2350469597522027d);
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.8813735870195429d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.7615941559557649d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.3686469200204927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.3127199080565219d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.917530901357853d + "'", double1 == 17.917530901357853d);
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9033391107665127d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2688363802786087d + "'", double1 == 1.2688363802786087d);
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.5598925417941161d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5896069690147185d + "'", double1 == 0.5896069690147185d);
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        double double1 = org.apache.commons.math.util.FastMath.acos(10.017874927409903d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        long long2 = org.apache.commons.math.util.FastMath.min(1586013452313419L, 4L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        double double1 = org.apache.commons.math.util.FastMath.atanh(11013.232920103323d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        double double1 = org.apache.commons.math.util.FastMath.atan(7.419050069773651d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4368156672802337d + "'", double1 == 1.4368156672802337d);
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.16371340869567735d), 2.9802322387695312E-8d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.570796144755303d) + "'", double2 == (-1.570796144755303d));
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        int int2 = org.apache.commons.math.util.FastMath.min(5, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(44.78115991081385d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2565.7714645900714d + "'", double1 == 2565.7714645900714d);
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.4466128799118947d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 32L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.3686469200204927d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 55L, 11013.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 55.0f + "'", float2 == 55.0f);
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        int int2 = org.apache.commons.math.util.FastMath.max(2147483647, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.797523050064412d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.091769430162713d + "'", double1 == 1.091769430162713d);
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 3, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        double double1 = org.apache.commons.math.util.FastMath.sin(4.709640090012462d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999962218032399d) + "'", double1 == (-0.9999962218032399d));
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        double double1 = org.apache.commons.math.util.FastMath.tan(192.9948452238572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.621316807284695d + "'", double1 == 4.621316807284695d);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        int int2 = org.apache.commons.math.util.FastMath.min(10, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-36), (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        double double2 = org.apache.commons.math.util.FastMath.atan2(7.419050069773651d, 0.7095251320497278d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4754507266465335d + "'", double2 == 1.4754507266465335d);
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.7853981633974483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999999999d + "'", double1 == 0.9999999999999999d);
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.016455121993179136d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1L, 45.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        double double1 = org.apache.commons.math.util.FastMath.cosh(3.1215871282840145E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000004872154d + "'", double1 == 1.0000000004872154d);
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.45967525618227173d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6155849427385279d) + "'", double1 == (-0.6155849427385279d));
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        double double1 = org.apache.commons.math.util.FastMath.asin(11014.999999999998d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        double double2 = org.apache.commons.math.util.FastMath.max(0.838670567945424d, 2048.0000000000005d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2048.0000000000005d + "'", double2 == 2048.0000000000005d);
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.6879830786861454d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2992240294445547d + "'", double1 == 1.2992240294445547d);
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 149);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 149L + "'", long1 == 149L);
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 100, 11013);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(3.828641396489095d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8286413964890955d + "'", double1 == 3.8286413964890955d);
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        double double1 = org.apache.commons.math.util.FastMath.atan(45.41047360972814d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5487785339621303d + "'", double1 == 1.5487785339621303d);
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        double double2 = org.apache.commons.math.util.FastMath.min(0.5414729998706594d, 1.1752011936466082d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5414729998706594d + "'", double2 == 0.5414729998706594d);
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        double double2 = org.apache.commons.math.util.FastMath.pow(3.2710663101885893d, 1.9261711162367934d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.803468465097513d + "'", double2 == 9.803468465097513d);
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(3.948148009134034E13d, 0.6883420083174141d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.9481480091340336E13d + "'", double2 == 3.9481480091340336E13d);
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        double double1 = org.apache.commons.math.util.FastMath.atanh(8.305661184154149d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 52.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9155040003582885E22d + "'", double1 == 1.9155040003582885E22d);
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.5777877754722899d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9999999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.4436354751788103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.5704205492947558d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1623546477028162d + "'", double1 == 1.1623546477028162d);
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.5706386041602216d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1624084433472168d + "'", double1 == 1.1624084433472168d);
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.04084445256892067d, 1.8336836665378882d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.022270853073133732d + "'", double2 == 0.022270853073133732d);
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        double double1 = org.apache.commons.math.util.FastMath.log((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.038686412312912d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4124415438623874d) + "'", double1 == (-1.4124415438623874d));
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.3600357884336912d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.43338071209297463d + "'", double1 == 0.43338071209297463d);
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.217380259166629d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5368290450042061d + "'", double1 == 1.5368290450042061d);
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        double double1 = org.apache.commons.math.util.FastMath.asinh(4.15912713462618d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.132601058453798d + "'", double1 == 2.132601058453798d);
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) 35L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.473814720414451d + "'", double1 == 0.473814720414451d);
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        int int2 = org.apache.commons.math.util.FastMath.max((int) 'a', (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.7925622793797507d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.1563686078816606d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.156368607881661d + "'", double1 == 2.156368607881661d);
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8617100707735503d, 0.7554612895086841d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8617100707735502d + "'", double2 == 0.8617100707735502d);
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.00285907349248556d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05347030477270127d + "'", double1 == 0.05347030477270127d);
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 52);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.0d + "'", double1 == 52.0d);
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        double double1 = org.apache.commons.math.util.FastMath.asinh(77.35348403241947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.041574577518914d + "'", double1 == 5.041574577518914d);
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        double double1 = org.apache.commons.math.util.FastMath.log(70515.43768240382d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.1635869390475d + "'", double1 == 11.1635869390475d);
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-1.1752011936438014d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.868551121099462d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3669495678698107d + "'", double1 == 1.3669495678698107d);
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.5521802813382803d, (double) 2147483647);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5712898075366827E-10d + "'", double2 == 2.5712898075366827E-10d);
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
        double double2 = org.apache.commons.math.util.FastMath.min(0.015707579305579825d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.07454121709103567d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07440361544177959d + "'", double1 == 0.07440361544177959d);
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5707963267948764d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9171523356672712d + "'", double1 == 0.9171523356672712d);
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        long long1 = org.apache.commons.math.util.FastMath.abs(416128L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 416128L + "'", long1 == 416128L);
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.650856032201109d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7767824437153557d + "'", double1 == 0.7767824437153557d);
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.1742549955138671d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1751491377060278d) + "'", double1 == (-0.1751491377060278d));
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        double double1 = org.apache.commons.math.util.FastMath.log(0.761594155955765d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2723414689118315d) + "'", double1 == (-0.2723414689118315d));
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.6108652381980153d, 2.6701224592653805d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.22490746112810533d + "'", double2 == 0.22490746112810533d);
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.163085598195192d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.5267993964958784d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8076349221631601d + "'", double1 == 0.8076349221631601d);
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.8649540891548834d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0450588814264876d + "'", double1 == 1.0450588814264876d);
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.19892537929119714d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19892537929119716d + "'", double1 == 0.19892537929119716d);
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.7453292519943295d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        double double1 = org.apache.commons.math.util.FastMath.abs(3.7051926755065845E12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7051926755065845E12d + "'", double1 == 3.7051926755065845E12d);
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.8686198410610924d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015160276174665898d + "'", double1 == 0.015160276174665898d);
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.3140833526702298d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5029550818601886d) + "'", double1 == (-0.5029550818601886d));
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.002205218707991866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.3368086899420177E-19d + "'", double1 == 4.3368086899420177E-19d);
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 5L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 74.20994852478785d + "'", double1 == 74.20994852478785d);
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.10482857270117d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.041914822473392d + "'", double1 == 4.041914822473392d);
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
        double double1 = org.apache.commons.math.util.FastMath.acos(14.206129690390002d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.18702182332316017d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1764.9013237338472d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.168997321391517d + "'", double1 == 8.168997321391517d);
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
        double double1 = org.apache.commons.math.util.FastMath.exp(4.214684851089401E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000421468493d + "'", double1 == 1.0000000421468493d);
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.748779069440004E11d, 23151.90693368639d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.5029550818601886d), (-0.9171523356672742d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.6399881172379436d) + "'", double2 == (-2.6399881172379436d));
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
        double double1 = org.apache.commons.math.util.FastMath.exp((-7.375234893767539d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.265795015415366E-4d + "'", double1 == 6.265795015415366E-4d);
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.755461289508684d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.12178778438053141d) + "'", double1 == (-0.12178778438053141d));
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        double double1 = org.apache.commons.math.util.FastMath.asinh(4.437442032932441d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.195686308942626d + "'", double1 == 2.195686308942626d);
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2048.0000000000005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.6251071482389d + "'", double1 == 7.6251071482389d);
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
        float float2 = org.apache.commons.math.util.FastMath.max(149.0f, (float) 52L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 149.0f + "'", float2 == 149.0f);
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.14287905018325442d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14336970329182344d + "'", double1 == 0.14336970329182344d);
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.0222383329741738d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9655655123714447d + "'", double1 == 0.9655655123714447d);
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.013277137307171d, 0.03673618878368824d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5525513908179496d + "'", double2 == 1.5525513908179496d);
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.4779900867225375d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.9848929415691015d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
        int int2 = org.apache.commons.math.util.FastMath.max((-2), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.2261911708835171d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8002921300658523d + "'", double1 == 0.8002921300658523d);
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        double double1 = org.apache.commons.math.util.FastMath.expm1(12.19860548267097d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 198511.1294275471d + "'", double1 == 198511.1294275471d);
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
        double double2 = org.apache.commons.math.util.FastMath.max(0.3129793350683445d, 173988.73655062242d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 173988.73655062242d + "'", double2 == 173988.73655062242d);
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.6082399792973231d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
        double double1 = org.apache.commons.math.util.FastMath.exp((-4.632512904931238d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009730277093455045d + "'", double1 == 0.009730277093455045d);
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.7076312586751927d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6158292738883674d) + "'", double1 == (-0.6158292738883674d));
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
        double double1 = org.apache.commons.math.util.FastMath.sin(7.930067261567155E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9774849108893232d + "'", double1 == 0.9774849108893232d);
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.48837199120847863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1216427622091434d + "'", double1 == 1.1216427622091434d);
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
        int int2 = org.apache.commons.math.util.FastMath.max(36, (-53));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.248867972642223d, 0.003576212944920802d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5679327709600677d + "'", double2 == 1.5679327709600677d);
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.1399766769213089d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.3074614241103386d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 100, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
        long long2 = org.apache.commons.math.util.FastMath.min(57L, (-4L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4L) + "'", long2 == (-4L));
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9332525345454011d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3674330141314497d + "'", double1 == 0.3674330141314497d);
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.48837199120847863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5312987770791809d + "'", double1 == 0.5312987770791809d);
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
        double double2 = org.apache.commons.math.util.FastMath.min(2.842859999667966E24d, (-0.7367922631517189d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7367922631517189d) + "'", double2 == (-0.7367922631517189d));
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        long long1 = org.apache.commons.math.util.FastMath.round(1.2583723393689585d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.37076030339985566d, 5.043629138314787d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3707603033998557d + "'", double2 == 0.3707603033998557d);
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.4077166057103022d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.40771660571030227d + "'", double1 == 0.40771660571030227d);
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.586013445029888E15d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.4149733479708179d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.44160428466265983d + "'", double1 == 0.44160428466265983d);
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.281321279551499E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.281321279551499E-14d + "'", double1 == 1.281321279551499E-14d);
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        int int1 = org.apache.commons.math.util.FastMath.round((-53.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-53) + "'", int1 == (-53));
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
        float float2 = org.apache.commons.math.util.FastMath.max((float) '#', (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.376727508058575d + "'", double1 == 0.376727508058575d);
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.7763568394002505E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002489E-15d + "'", double1 == 1.7763568394002489E-15d);
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        double double2 = org.apache.commons.math.util.FastMath.atan2(5.00264328101366d, (-0.9848929415691015d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.765184808842236d + "'", double2 == 1.765184808842236d);
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.9033391107665127d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7853981633974483d) + "'", double1 == (-0.7853981633974483d));
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-2), (float) 52L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
        double double2 = org.apache.commons.math.util.FastMath.min(0.5585053606381855d, (double) 57.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5585053606381855d + "'", double2 == 0.5585053606381855d);
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.5674991151269533d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
        double double2 = org.apache.commons.math.util.FastMath.atan2(4.680482178387855d, 0.13271291339328767d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5424493831867074d + "'", double2 == 1.5424493831867074d);
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.7601945740163978d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013267898272381876d + "'", double1 == 0.013267898272381876d);
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.3458247401995457E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7201065497963348d + "'", double1 == 0.7201065497963348d);
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9999995015891399d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7182804736381985d + "'", double1 == 2.7182804736381985d);
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.28495825391099355d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16.326905286517214d + "'", double1 == 16.326905286517214d);
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        double double1 = org.apache.commons.math.util.FastMath.cosh(22.60451646247372d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.280852984926756E9d + "'", double1 == 3.280852984926756E9d);
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.2350469597522027d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.349286652365943d + "'", double1 == 0.349286652365943d);
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.01180062424654847d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.7367922631517189d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-34.657359027997266d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.629499534213125E14d) + "'", double1 == (-5.629499534213125E14d));
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
        double double1 = org.apache.commons.math.util.FastMath.tanh(572.9577951308232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
        double double1 = org.apache.commons.math.util.FastMath.rint(3.399216241149525E248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.399216241149525E248d + "'", double1 == 3.399216241149525E248d);
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
        int int2 = org.apache.commons.math.util.FastMath.min(35, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        double double1 = org.apache.commons.math.util.FastMath.tan((-4.965964575870387E-6d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.965964575911209E-6d) + "'", double1 == (-4.965964575911209E-6d));
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.015707579305579825d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0158315917905658d + "'", double1 == 1.0158315917905658d);
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
        double double2 = org.apache.commons.math.util.FastMath.min(1.5707963267948764d, 1.5067985556900776d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5067985556900776d + "'", double2 == 1.5067985556900776d);
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        double double1 = org.apache.commons.math.util.FastMath.acosh(10.000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.993222846126381d + "'", double1 == 2.993222846126381d);
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.282781601724098d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9684798222642294d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2517426096322996d + "'", double1 == 0.2517426096322996d);
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.14028675761500198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13127977254262357d + "'", double1 == 0.13127977254262357d);
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
        double double2 = org.apache.commons.math.util.FastMath.max(0.28111738892954613d, 238.30043127241947d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 238.30043127241947d + "'", double2 == 238.30043127241947d);
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
        double double2 = org.apache.commons.math.util.FastMath.max(1.2661711883825657d, (-3.3520838269185758d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2661711883825657d + "'", double2 == 1.2661711883825657d);
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.5707173906673306d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1624278792992704d + "'", double1 == 1.1624278792992704d);
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.014014916583006168d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.118384612948669d + "'", double1 == 0.118384612948669d);
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.6500970221088582d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9999999958776927d, 1.2130532941206642d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999999958776928d + "'", double2 == 0.9999999958776928d);
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.525881748669311d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9097172013945863d + "'", double1 == 0.9097172013945863d);
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
        int int1 = org.apache.commons.math.util.FastMath.abs(3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
        int int2 = org.apache.commons.math.util.FastMath.min(97, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.6885025193255089d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9171523356672712d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.502154937700727d + "'", double1 == 2.502154937700727d);
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.7162579075638862d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8947254893223937d + "'", double1 == 0.8947254893223937d);
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
        double double1 = org.apache.commons.math.util.FastMath.atanh(57.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7767824437153557d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.650856032201109d + "'", double1 == 0.650856032201109d);
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
        double double1 = org.apache.commons.math.util.FastMath.atan(3.0000000000000004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2490457723982544d + "'", double1 == 1.2490457723982544d);
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.5971542229890323d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.1752011936466082d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1752011936466082d + "'", double1 == 1.1752011936466082d);
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-3.04617424497707E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.046638298095111E-4d) + "'", double1 == (-3.046638298095111E-4d));
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.3796077390275217d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.002205222282650664d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.006625404912081631d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.006625307971731655d + "'", double1 == 0.006625307971731655d);
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        long long2 = org.apache.commons.math.util.FastMath.max(2L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.8337422720523482d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6949795685472816d + "'", double1 == 0.6949795685472816d);
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.7629292891930135d, 1.0732851129357383E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7629292891930134d + "'", double2 == 0.7629292891930134d);
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.036783162923711d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.665909510804426d + "'", double1 == 7.665909510804426d);
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.473814720414451d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.00285907349248556d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0028590773876418156d + "'", double1 == 0.0028590773876418156d);
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.9999999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0986122886681096d + "'", double1 == 1.0986122886681096d);
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(18.013888888888896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.244277192748949d + "'", double1 == 4.244277192748949d);
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.038686412312912d, 1.3573326045448348d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.038686412312912005d + "'", double2 == 0.038686412312912005d);
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
        double double1 = org.apache.commons.math.util.FastMath.log((-1.1321790744880604d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
        int int2 = org.apache.commons.math.util.FastMath.min((int) 'a', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.6063268761536349d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6441666662680666d + "'", double1 == 0.6441666662680666d);
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
        float float2 = org.apache.commons.math.util.FastMath.min(149.0f, (float) (-2));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
        double double1 = org.apache.commons.math.util.FastMath.floor(14.899276870949834d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.0d + "'", double1 == 14.0d);
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.301297204502775d, 0.7629292891930135d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.888685222337704d + "'", double2 == 1.888685222337704d);
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.6881171418161737E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8134633577082349d + "'", double1 == 0.8134633577082349d);
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5900247258946039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9201531231110199d + "'", double1 == 0.9201531231110199d);
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.5433467420946743d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2185696235757997d + "'", double1 == 1.2185696235757997d);
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.3745669993918974d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.4210854715202007E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
        int int2 = org.apache.commons.math.util.FastMath.max(11013, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11013 + "'", int2 == 11013);
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.06572532608811625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0679333434477085d + "'", double1 == 1.0679333434477085d);
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
        double double1 = org.apache.commons.math.util.FastMath.atan((-1.2031992972018404d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8773671774142848d) + "'", double1 == (-0.8773671774142848d));
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
        double double1 = org.apache.commons.math.util.FastMath.rint((-1.2582773960442621d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(18.947504158256688d, 100.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 18.94750415825669d + "'", double2 == 18.94750415825669d);
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.18702182332316017d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.18487140694284424d) + "'", double1 == (-0.18487140694284424d));
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
        double double1 = org.apache.commons.math.util.FastMath.log(3.81765898774876d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.339637404328899d + "'", double1 == 1.339637404328899d);
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
        double double1 = org.apache.commons.math.util.FastMath.cos(8.467717607067357E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6436460504146816d + "'", double1 == 0.6436460504146816d);
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.5414729998706594d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.494102162974031d + "'", double1 == 0.494102162974031d);
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.5408212093041704d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 6);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.0f + "'", float1 == 6.0f);
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.4466128799118947d, 0.0012941034727495246d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4466128799118945d + "'", double2 == 1.4466128799118945d);
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
        double double1 = org.apache.commons.math.util.FastMath.log1p(20.13501082303189d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.050930946109083d + "'", double1 == 3.050930946109083d);
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.5598925417941161d, 1.2583723393689585d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4186329953040121d + "'", double2 == 0.4186329953040121d);
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
        double double1 = org.apache.commons.math.util.FastMath.abs(149.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 149.0d + "'", double1 == 149.0d);
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.0028875952298260572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.3368086899420177E-19d + "'", double1 == 4.3368086899420177E-19d);
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
        double double1 = org.apache.commons.math.util.FastMath.sin((-27.03274004183787d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9463004713928234d) + "'", double1 == (-0.9463004713928234d));
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.43930669835763825d), 0.5521802813382803d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5521802813382803d + "'", double2 == 0.5521802813382803d);
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
        long long1 = org.apache.commons.math.util.FastMath.round(2.6881171418161356E43d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }
}

