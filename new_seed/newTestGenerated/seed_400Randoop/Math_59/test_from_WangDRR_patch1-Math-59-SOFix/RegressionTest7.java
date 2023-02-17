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
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.8668713349201806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015129758985515648d + "'", double1 == 0.015129758985515648d);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-5.206879716514544E22d), 2.502154937700735d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963267948966d) + "'", double2 == (-1.5707963267948966d));
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 0, 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 3.8108072797718955d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        long long2 = org.apache.commons.math.util.FastMath.min(45L, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.0835112623546757d, 0.053286411214247056d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0835112623546754d + "'", double2 == 1.0835112623546754d);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        int int2 = org.apache.commons.math.util.FastMath.min(57, (-53));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-53) + "'", int2 == (-53));
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        int int1 = org.apache.commons.math.util.FastMath.abs(57);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 57 + "'", int1 == 57);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '#', 149);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 149 + "'", int2 == 149);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.8337422720523482d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8337422720523482d + "'", double1 == 0.8337422720523482d);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        int int2 = org.apache.commons.math.util.FastMath.max(84677176, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 84677176 + "'", int2 == 84677176);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.27631948176648663d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.27984920853320866d + "'", double1 == 0.27984920853320866d);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.8813735870195432d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7949577687638787d + "'", double1 == 0.7949577687638787d);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.3106472496723418d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7568396789787584d + "'", double1 == 3.7568396789787584d);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.3574158419544757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13271291339328767d + "'", double1 == 0.13271291339328767d);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.7103669532614669d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6521120104928195d + "'", double1 == 0.6521120104928195d);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.013865150856733838d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01386515085673384d + "'", double1 == 0.01386515085673384d);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.07454121709103567d, (-7.52574989159953d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.131688154945343d + "'", double2 == 3.131688154945343d);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.4650188248182274d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.327624706282432d + "'", double1 == 4.327624706282432d);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) 32L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5585053606381855d + "'", double1 == 0.5585053606381855d);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.17265199025933411d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5568315867464496d) + "'", double1 == (-0.5568315867464496d));
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.2136609872391593d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        long long1 = org.apache.commons.math.util.FastMath.round(416127.66138192907d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 416128L + "'", long1 == 416128L);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.9016684086532855d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.6229585671655451d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.433704240591099d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8924232090626707d + "'", double1 == 0.8924232090626707d);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.4032630823831073d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.394411534628069d) + "'", double1 == (-0.394411534628069d));
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.771137740740136d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.556529890912072d + "'", double1 == 1.556529890912072d);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.118870081899753d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.7282657137693634d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7282657137693634d + "'", double1 == 0.7282657137693634d);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(4.574710978503383d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.574710978503384d + "'", double1 == 4.574710978503384d);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        int int1 = org.apache.commons.math.util.FastMath.round(1.58601345E15f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.3883026525195956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 79.5438826761901d + "'", double1 == 79.5438826761901d);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.02411494803001423d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02411962364530756d + "'", double1 == 0.02411962364530756d);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        double double2 = org.apache.commons.math.util.FastMath.pow(14.899277193215994d, 0.677511790861663d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.234954028085534d + "'", double2 == 6.234954028085534d);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-1L), (float) 32L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8199744766146694d, (-0.6229585671655451d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1316153248585041d + "'", double2 == 1.1316153248585041d);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.3653950108829147d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0675028145281935d + "'", double1 == 1.0675028145281935d);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(327.1084999525159d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18741.93649013445d + "'", double1 == 18741.93649013445d);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        double double1 = org.apache.commons.math.util.FastMath.log10((-3036.676314193363d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.012599649098168814d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.23269451697447066d) + "'", double1 == (-0.23269451697447066d));
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        int int1 = org.apache.commons.math.util.FastMath.abs(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        double double2 = org.apache.commons.math.util.FastMath.max(1.8351015231807233d, 0.9176834530090925d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8351015231807233d + "'", double2 == 1.8351015231807233d);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.193861478082777d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0926396835566503d + "'", double1 == 1.0926396835566503d);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.05723320573453925d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05726445674725292d + "'", double1 == 0.05726445674725292d);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        double double1 = org.apache.commons.math.util.FastMath.atan(4.680482178387856d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3603078162116136d + "'", double1 == 1.3603078162116136d);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.2362144855962494d, 4.248291097914389d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4845280286046115d + "'", double2 == 0.4845280286046115d);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.748066029033894E7d + "'", double1 == 3.748066029033894E7d);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.8693235746902677d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        double double1 = org.apache.commons.math.util.FastMath.log(7.951853132063153E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-14.04469065108256d) + "'", double1 == (-14.04469065108256d));
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        double double1 = org.apache.commons.math.util.FastMath.rint((-10.017874927409903d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-10.0d) + "'", double1 == (-10.0d));
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.3603078162116136d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8587920411303291d + "'", double1 == 0.8587920411303291d);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.17013486028186428d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.28495825391099355d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5452187590232507d) + "'", double1 == (-0.5452187590232507d));
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.010868826047427144d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.0675028145281935d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.028369028739171288d + "'", double1 == 0.028369028739171288d);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-3.8754705787895336d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-24.092316404524105d) + "'", double1 == (-24.092316404524105d));
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-34.657359027997266d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.3565686652647782d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8828470691743546d + "'", double1 == 2.8828470691743546d);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.6699175736806615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9950915100179343d + "'", double1 == 0.9950915100179343d);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(536.7148441762085d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 30751.49537331838d + "'", double1 == 30751.49537331838d);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        float float2 = org.apache.commons.math.util.FastMath.min(35.0f, 35.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) 2.15561577E15f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.30685281589777d + "'", double1 == 35.30685281589777d);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        double double1 = org.apache.commons.math.util.FastMath.cosh(11014.999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        double double1 = org.apache.commons.math.util.FastMath.rint(11211.863579677763d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11212.0d + "'", double1 == 11212.0d);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.8508659131646942d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2592815284109646d) + "'", double1 == (-1.2592815284109646d));
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        long long1 = org.apache.commons.math.util.FastMath.round(1.4495725029967728d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        long long1 = org.apache.commons.math.util.FastMath.round((double) 2147483647L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2147483647L + "'", long1 == 2147483647L);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.8414709848078965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        double double1 = org.apache.commons.math.util.FastMath.ulp(3.2395798055406804d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.003761435487319938d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0037614177479929033d + "'", double1 == 0.0037614177479929033d);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        double double1 = org.apache.commons.math.util.FastMath.asinh(3.7568396789787597d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.033985452519997d + "'", double1 == 2.033985452519997d);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.403108691970989E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0015501963398134408d + "'", double1 == 0.0015501963398134408d);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.6879830786861454d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 96.71430629821528d + "'", double1 == 96.71430629821528d);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 57.00000000000001d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        double double2 = org.apache.commons.math.util.FastMath.max(0.8081843818082921d, 2.1563686078816606d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1563686078816606d + "'", double2 == 2.1563686078816606d);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9034600343951873d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9667250714965472d + "'", double1 == 0.9667250714965472d);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.4418411684567414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9644071731001379d + "'", double1 == 0.9644071731001379d);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        double double2 = org.apache.commons.math.util.FastMath.max(0.24371064248078259d, 1.5860134523134298E15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5860134523134298E15d + "'", double2 == 1.5860134523134298E15d);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        double double2 = org.apache.commons.math.util.FastMath.min(1.9936026854386766d, 3.5835189384561104d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9936026854386766d + "'", double2 == 1.9936026854386766d);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.8686709614860095d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.38008276443149036d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.363219329202442d + "'", double1 == 0.363219329202442d);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.017023944947506645d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017023944947506642d) + "'", double1 == (-0.017023944947506642d));
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 1, (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        double double1 = org.apache.commons.math.util.FastMath.asin(28.43781006905283d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.17542037193601015d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17364288451637427d + "'", double1 == 0.17364288451637427d);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        double double2 = org.apache.commons.math.util.FastMath.pow(35.0d, 7.930067261567266E14d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.8668713349201806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.953494547896576d + "'", double1 == 0.953494547896576d);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(7.951386703658792E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8198203318046334E-8d + "'", double1 == 2.8198203318046334E-8d);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 416128L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 416128.0f + "'", float1 == 416128.0f);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        double double1 = org.apache.commons.math.util.FastMath.log(0.2835736696417744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2602833319285365d) + "'", double1 == (-1.2602833319285365d));
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        int int2 = org.apache.commons.math.util.FastMath.min((-36), (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-36) + "'", int2 == (-36));
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 100, 1477896);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.3653950108829147d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1967392051773464d + "'", double1 == 1.1967392051773464d);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.1200868748495079d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        double double2 = org.apache.commons.math.util.FastMath.max(2.917270110745145d, 1.0001353885748059d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.917270110745145d + "'", double2 == 2.917270110745145d);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 52L, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.5452187590232507d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        long long2 = org.apache.commons.math.util.FastMath.max(2L, (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.00000000000001d + "'", double1 == 35.00000000000001d);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        double double1 = org.apache.commons.math.util.FastMath.log(4.757333145663087d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5596872477209207d + "'", double1 == 1.5596872477209207d);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        double double1 = org.apache.commons.math.util.FastMath.expm1(7.951386703658792E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.951386703658795E-16d + "'", double1 == 7.951386703658795E-16d);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.675234572368367d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.5408212093041704d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.814737873122817d + "'", double1 == 0.814737873122817d);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 11013, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        double double2 = org.apache.commons.math.util.FastMath.min(1.817884356931778d, 0.6885025193255089d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6885025193255089d + "'", double2 == 0.6885025193255089d);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9695968919838217d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9995895072691775d, (double) 1586013452313419L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9995895072691775d + "'", double2 == 0.9995895072691775d);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.853200064217061d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.6472147166391762d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.910212928316845d + "'", double1 == 1.910212928316845d);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        double double2 = org.apache.commons.math.util.FastMath.min(0.5013507798060323d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(22.180709777452588d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.709640090012462d + "'", double1 == 4.709640090012462d);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.3127199080565219d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.31784189721835715d + "'", double1 == 0.31784189721835715d);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        double double1 = org.apache.commons.math.util.FastMath.tan(215.5579348013961d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.6661203985235478d) + "'", double1 == (-2.6661203985235478d));
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.03172806744895933d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03173339314553415d + "'", double1 == 0.03173339314553415d);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.6879830786861454d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        long long1 = org.apache.commons.math.util.FastMath.abs((-1L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        double double1 = org.apache.commons.math.util.FastMath.floor(11.591953275521519d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.0d + "'", double1 == 11.0d);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 10, 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.0637969690534153d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.31466697030166657d + "'", double1 == 0.31466697030166657d);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.8575532158463938d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9260416922830169d + "'", double1 == 0.9260416922830169d);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.3440585709080869E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080869E43d + "'", double1 == 1.3440585709080869E43d);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9891889676686395d, (-0.8375930412496614d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8375930412496614d) + "'", double2 == (-0.8375930412496614d));
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.7306786685136297d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        double double1 = org.apache.commons.math.util.FastMath.ulp(4.194206803317586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.07414666724177091d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1299083649462789d) + "'", double1 == (-1.1299083649462789d));
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.9033391107665127d), 0.8809373872769856d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9033391107665126d) + "'", double2 == (-0.9033391107665126d));
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 10, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        double double1 = org.apache.commons.math.util.FastMath.log10(4.327624706282431d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6362495915029428d + "'", double1 == 0.6362495915029428d);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(5.366643026452033d, 1.4419647419307422d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.366643026452032d + "'", double2 == 5.366643026452032d);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.41032129904824216d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.42280635864377986d) + "'", double1 == (-0.42280635864377986d));
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.2775176041484217d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5267993964958784d + "'", double1 == 0.5267993964958784d);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.135922199745734d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.114043989714556d + "'", double1 == 3.114043989714556d);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.7370361196913022d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7522203923062025d + "'", double1 == 2.7522203923062025d);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        double double1 = org.apache.commons.math.util.FastMath.cos((-3.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9899924966004454d) + "'", double1 == (-0.9899924966004454d));
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.3162739259961891d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6813252169987396d + "'", double1 == 0.6813252169987396d);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 11013, (float) 4L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        double double2 = org.apache.commons.math.util.FastMath.max(11.163601120238772d, 1.2715542753135176d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11.163601120238772d + "'", double2 == 11.163601120238772d);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        double double1 = org.apache.commons.math.util.FastMath.ulp(7.4764165040274095d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.6883420083174141d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.523746987213264d + "'", double1 == 0.523746987213264d);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.9942575694137897d), 4.041914822473389d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9942575694137896d) + "'", double2 == (-0.9942575694137896d));
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        double double1 = org.apache.commons.math.util.FastMath.log(148.80597572185025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.00264328101366d + "'", double1 == 5.00264328101366d);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.5127742681331149d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        double double2 = org.apache.commons.math.util.FastMath.atan2(53.0d, 0.7819722235803451d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5560432043521122d + "'", double2 == 1.5560432043521122d);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.130497003573102d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.419050069773651d + "'", double1 == 7.419050069773651d);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        double double1 = org.apache.commons.math.util.FastMath.floor((-52.61372804946848d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-53.0d) + "'", double1 == (-53.0d));
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 36L, (float) 52);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        double double2 = org.apache.commons.math.util.FastMath.min((-1.5707963267948966d), 3.3480571885407375d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963267948966d) + "'", double2 == (-1.5707963267948966d));
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5472906394139022E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.7367922631517189d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9434257847789064d) + "'", double1 == (-0.9434257847789064d));
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        float float2 = org.apache.commons.math.util.FastMath.min(3.9481478E13f, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.7871127525111784d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7871127525111785d + "'", double1 == 0.7871127525111785d);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.40767170372406053d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(11.163601120238772d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 639.6272283571994d + "'", double1 == 639.6272283571994d);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.24619002710729043d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2791426222204005d + "'", double1 == 1.2791426222204005d);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.0222383329741738d, 7.951386703658795E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000000000000007d + "'", double2 == 1.0000000000000007d);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-1.5707963267948966d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (short) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 100.0f + "'", float1 == 100.0f);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.5403023058681398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.154434690031884d, 0.002205218707991866d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0016940011094824d + "'", double2 == 1.0016940011094824d);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 0.4419864533963391d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.39449755004161075d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3944975500416108d + "'", double1 == 0.3944975500416108d);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        long long1 = org.apache.commons.math.util.FastMath.round(6.34960155562218d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 6L + "'", long1 == 6L);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1477896L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1477896.0f + "'", float2 == 1477896.0f);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) -1, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.37138811771185687d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 21.278971706197215d + "'", double1 == 21.278971706197215d);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.09917726107940236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        double double1 = org.apache.commons.math.util.FastMath.sin((-3.3520838269185758d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.20894025738121733d + "'", double1 == 0.20894025738121733d);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        long long1 = org.apache.commons.math.util.FastMath.round(0.8587033066171034d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.08776598447540371d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (-53L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 53.0f + "'", float1 == 53.0f);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2155615773557597L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.15561577E15f + "'", float2 == 2.15561577E15f);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        double double2 = org.apache.commons.math.util.FastMath.min(0.2743356563668091d, 189.3225229221956d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2743356563668091d + "'", double2 == 0.2743356563668091d);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.6699175736806615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6699175736806615d + "'", double1 == 1.6699175736806615d);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.9999999999999999d), 2.0808864545885957E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9999999999999998d) + "'", double2 == (-0.9999999999999998d));
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.363219329202442d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.363219329202442d + "'", double1 == 0.363219329202442d);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.17352652702107887d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.17528947615916912d) + "'", double1 == (-0.17528947615916912d));
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        int int2 = org.apache.commons.math.util.FastMath.max((-36), (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        double double1 = org.apache.commons.math.util.FastMath.atan(28.43781006905283d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5356463583707127d + "'", double1 == 1.5356463583707127d);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        double double1 = org.apache.commons.math.util.FastMath.asin((-15.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.6915215721218745d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.8233097813984472d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6768673022400968d + "'", double1 == 0.6768673022400968d);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.39560468389355125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4184272923915598d + "'", double1 == 0.4184272923915598d);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.7370361196913022d, 0.9402241834946016d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0746720081896708d + "'", double2 == 1.0746720081896708d);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.388020644993609E19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.6868023880361244d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6418211471568946d + "'", double1 == 0.6418211471568946d);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.9686168251319445d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.668135051225122d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.241222991681755d + "'", double1 == 7.241222991681755d);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.9092974268256817d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7123889803846897d + "'", double1 == 2.7123889803846897d);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.070843830251405d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        long long1 = org.apache.commons.math.util.FastMath.round(11013.232920103323d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 11013L + "'", long1 == 11013L);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        long long1 = org.apache.commons.math.util.FastMath.round(0.5408212093041704d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.921688867296064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7966236347636957d + "'", double1 == 0.7966236347636957d);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.11803632173468953d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1115738623399643d + "'", double1 == 0.1115738623399643d);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        double double1 = org.apache.commons.math.util.FastMath.cos(1262023.527631695d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.20414594311450418d) + "'", double1 == (-0.20414594311450418d));
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) -1, 1477896L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1477896L + "'", long2 == 1477896L);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.7266953932355397d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7923652280736779d + "'", double1 == 0.7923652280736779d);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9176834530093733d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4514637639272718d + "'", double1 == 1.4514637639272718d);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        double double1 = org.apache.commons.math.util.FastMath.asin(11.163601120238772d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        double double1 = org.apache.commons.math.util.FastMath.floor(54.44761727370922d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 54.0d + "'", double1 == 54.0d);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(10.437911002510875d, (-77.26503394947866d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.437911002510873d + "'", double2 == 10.437911002510873d);
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
        long long2 = org.apache.commons.math.util.FastMath.max((long) 84677176, (long) 11013);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 84677176L + "'", long2 == 84677176L);
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
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 149);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 149L + "'", long1 == 149L);
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 57L, 32.0f);
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
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.0080212625522527d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7649423546396938d + "'", double1 == 0.7649423546396938d);
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
        double double1 = org.apache.commons.math.util.FastMath.exp(1.001244835092151d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.721667748088015d + "'", double1 == 2.721667748088015d);
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
        double double1 = org.apache.commons.math.util.FastMath.floor(0.38930040372081254d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
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
        double double2 = org.apache.commons.math.util.FastMath.min(9.272410972265918d, (-0.8508659131646942d));
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
        long long2 = org.apache.commons.math.util.FastMath.max(416128L, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 416128L + "'", long2 == 416128L);
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
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.6768673022400968d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        double double1 = org.apache.commons.math.util.FastMath.tan((-7.52574989159953d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.9364233859784283d) + "'", double1 == (-2.9364233859784283d));
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(3.5556350168053608d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 203.72287995187472d + "'", double1 == 203.72287995187472d);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        float float2 = org.apache.commons.math.util.FastMath.max(5.0f, (float) 1477896L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1477896.0f + "'", float2 == 1477896.0f);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.0080212625522527d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017593289961647027d + "'", double1 == 0.017593289961647027d);
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 35L, 97.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-36), 4L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        double double1 = org.apache.commons.math.util.FastMath.tan((-4.2063149707507666E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.2063152188264206E-4d) + "'", double1 == (-4.2063152188264206E-4d));
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.7615560214388488d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 43.63394589122048d + "'", double1 == 43.63394589122048d);
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.927002471590281d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.03291910793037927d) + "'", double1 == (-0.03291910793037927d));
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.5896069690147184d);
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
        long long1 = org.apache.commons.math.util.FastMath.round(2.6881171418161737E43d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        long long2 = org.apache.commons.math.util.FastMath.min(39481480091340L, 6L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6L + "'", long2 == 6L);
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        long long1 = org.apache.commons.math.util.FastMath.round(0.4996289686340808d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        double double1 = org.apache.commons.math.util.FastMath.log(9.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1972245773362196d + "'", double1 == 2.1972245773362196d);
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        double double1 = org.apache.commons.math.util.FastMath.tanh(7.2638973976934574E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.7955086123527585d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.891912895047918d + "'", double1 == 0.891912895047918d);
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 5, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.81743754137065952E17d, 0.3283909087132568d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 465424.8713320038d + "'", double2 == 465424.8713320038d);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        double double2 = org.apache.commons.math.util.FastMath.max(1.1310470982913303d, 4.644483341943245d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.644483341943245d + "'", double2 == 4.644483341943245d);
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.2378644027129617d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0399894657358901d + "'", double1 == 1.0399894657358901d);
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        long long1 = org.apache.commons.math.util.FastMath.round(7.93006726156715E14d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 793006726156715L + "'", long1 == 793006726156715L);
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 53, (long) (-2));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 53L + "'", long2 == 53L);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.0004446442786143d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.04084445256892067d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04085581769411778d + "'", double1 == 0.04085581769411778d);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        double double1 = org.apache.commons.math.util.FastMath.sinh(4.5087686982174615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 45.3994615987879d + "'", double1 == 45.3994615987879d);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 793006726156715L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.5435938534266392E16d + "'", double1 == 4.5435938534266392E16d);
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 1586013452313419L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.58601345E15f + "'", float1 == 1.58601345E15f);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.363655626077857d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5374184941250892d + "'", double1 == 1.5374184941250892d);
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.339637404328899d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22910577404371865d + "'", double1 == 0.22910577404371865d);
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
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.5560432043521122d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2645297908155797d + "'", double1 == 2.2645297908155797d);
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.193861478082777d, 0.6930491557595924d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.130662172395292d + "'", double2 == 1.130662172395292d);
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        double double2 = org.apache.commons.math.util.FastMath.min(10.0d, 1.3440585709080678E43d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        int int2 = org.apache.commons.math.util.FastMath.min((-1), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) (-53.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.1224236947215336d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0392473890246534d + "'", double1 == 1.0392473890246534d);
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        float float2 = org.apache.commons.math.util.FastMath.min(2.15561577E15f, (float) 52);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        double double2 = org.apache.commons.math.util.FastMath.min((-35.35050620855721d), 4.5435938534266392E16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-35.35050620855721d) + "'", double2 == (-35.35050620855721d));
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        double double1 = org.apache.commons.math.util.FastMath.log(34.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5553480614894135d + "'", double1 == 3.5553480614894135d);
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.7683152502780354d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5700272573010841d + "'", double1 == 0.5700272573010841d);
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-1.2246467991473532E-16d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.016709298534876E-15d) + "'", double1 == (-7.016709298534876E-15d));
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 1, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.017023944947506642d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01702394494750664d) + "'", double1 == (-0.01702394494750664d));
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-1.7456418720467646d), 0.6885025193255089d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.1951162469645535d) + "'", double2 == (-1.1951162469645535d));
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.7871127525111785d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.11803632173468953d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3435641450074346d + "'", double1 == 0.3435641450074346d);
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.2027522105204773d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.4430227241169226d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.7944146264030465d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6527531305852572d + "'", double1 == 0.6527531305852572d);
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.3745669993918976d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1118733076078493d + "'", double1 == 1.1118733076078493d);
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.4593566380802732d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 83.61497616640041d + "'", double1 == 83.61497616640041d);
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.7370361196913022d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        double double1 = org.apache.commons.math.util.FastMath.rint(57.29577951308232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.0d + "'", double1 == 57.0d);
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        double double1 = org.apache.commons.math.util.FastMath.ulp(11014.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8189894035458565E-12d + "'", double1 == 1.8189894035458565E-12d);
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(3.8108072797718955d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 218.34317366865955d + "'", double1 == 218.34317366865955d);
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.4436354751788103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.821622829149065d + "'", double1 == 7.821622829149065d);
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.7367922631517189d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8052881239252931d) + "'", double1 == (-0.8052881239252931d));
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.675234572368367d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        long long2 = org.apache.commons.math.util.FastMath.min(2155615773557597L, 11013L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11013L + "'", long2 == 11013L);
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.6881171418161356E43d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.7871127525111785d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6668333172919337d + "'", double1 == 0.6668333172919337d);
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.6500970221088582d, 22.180709777452588d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.02930072909258234d + "'", double2 == 0.02930072909258234d);
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9684798222642294d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 55.48980635932044d + "'", double1 == 55.48980635932044d);
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.005178496136374047d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005178519281788412d + "'", double1 == 0.005178519281788412d);
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.145976303209723d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 97L, (float) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 10, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        double double1 = org.apache.commons.math.util.FastMath.atanh(57.292734699501686d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        long long2 = org.apache.commons.math.util.FastMath.max(793006726156715L, 5L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 793006726156715L + "'", long2 == 793006726156715L);
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.130662172395292d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9046945134253409d + "'", double1 == 0.9046945134253409d);
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.7075093757430987d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8552072360648283d + "'", double1 == 0.8552072360648283d);
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        int int2 = org.apache.commons.math.util.FastMath.min(52, 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 11013, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11013.0f + "'", float2 == 11013.0f);
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.6559985046992765d, 0.9735605461531053d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5929342920349832d + "'", double2 == 0.5929342920349832d);
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.5840734641020676d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6610060414837631d + "'", double1 == 0.6610060414837631d);
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.502154937700735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        float float2 = org.apache.commons.math.util.FastMath.min(149.0f, (float) (-53));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-53.0f) + "'", float2 == (-53.0f));
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.5860134523134308E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) 5);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.791759469228055d + "'", double1 == 1.791759469228055d);
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.8849970445005177d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0864876632426175d + "'", double1 == 1.0864876632426175d);
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        double double2 = org.apache.commons.math.util.FastMath.max(0.7923652280736779d, 1.0787619161000124d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0787619161000124d + "'", double2 == 1.0787619161000124d);
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.9171523356672743d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 2147483647);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2147483647L + "'", long1 == 2147483647L);
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 0, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.5128928810496862d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4739086341741761d) + "'", double1 == (-0.4739086341741761d));
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        double double2 = org.apache.commons.math.util.FastMath.min(5.2437141131408894E22d, 0.8229371012645613d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8229371012645613d + "'", double2 == 0.8229371012645613d);
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        double double2 = org.apache.commons.math.util.FastMath.pow(194.9663415979849d, (-0.9394827641334688d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.007057036850945338d + "'", double2 == 0.007057036850945338d);
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(3.0537144249814574d, 1.3454196513649108d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.053714424981457d + "'", double2 == 3.053714424981457d);
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        double double1 = org.apache.commons.math.util.FastMath.atanh(11014.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 4.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 27.289917197127753d + "'", double1 == 27.289917197127753d);
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        double double1 = org.apache.commons.math.util.FastMath.ceil(77.26503394947866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 78.0d + "'", double1 == 78.0d);
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.8587033066171034d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(9.984096369658629E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09994695977117724d + "'", double1 == 0.09994695977117724d);
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(35.69314718055995d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.292518932727564d + "'", double1 == 3.292518932727564d);
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.5540801229283607d, 0.31784189721835715d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3690575314124793d + "'", double2 == 1.3690575314124793d);
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        double double1 = org.apache.commons.math.util.FastMath.log((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        double double1 = org.apache.commons.math.util.FastMath.log10((-8.711666086263719d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.5679890550656346d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.796992001228429d + "'", double1 == 3.796992001228429d);
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.5540801229283607d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.224391898887561d + "'", double1 == 1.224391898887561d);
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        double double1 = org.apache.commons.math.util.FastMath.asinh(10.049875621120886d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0031735464552978d + "'", double1 == 3.0031735464552978d);
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 84.73931296875567d + "'", double1 == 84.73931296875567d);
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        int int2 = org.apache.commons.math.util.FastMath.max(1477896, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1477896 + "'", int2 == 1477896);
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.7123889803846897d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.388020644993609E19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3880206449936091E19d + "'", double1 == 1.3880206449936091E19d);
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(3.948148009134034E13d, (-0.7076312586751927d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.9481480091340336E13d + "'", double2 == 3.9481480091340336E13d);
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(3.469446951953614E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.862645149230957E-9d + "'", double1 == 1.862645149230957E-9d);
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        double double1 = org.apache.commons.math.util.FastMath.floor(3.4657359027997265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.017023944947506645d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017023122756475405d) + "'", double1 == (-0.017023122756475405d));
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-1.541950429394781d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.786036626268317d) + "'", double1 == (-0.786036626268317d));
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 32L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4657359027997265d + "'", double1 == 3.4657359027997265d);
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        double double1 = org.apache.commons.math.util.FastMath.acosh(9.989082137816156E-4d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.6472147166391762d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8044965609865441d + "'", double1 == 0.8044965609865441d);
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9428090415820634d, 0.9171523356672744d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7991915029216112d + "'", double2 == 0.7991915029216112d);
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        double double2 = org.apache.commons.math.util.FastMath.min((-1.118359928160288d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.118359928160288d) + "'", double2 == (-1.118359928160288d));
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
        int int1 = org.apache.commons.math.util.FastMath.round(45.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 45 + "'", int1 == 45);
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.2717628242082612d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.26535415056108935d) + "'", double1 == (-0.26535415056108935d));
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.118870081899753d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8071755356156836d + "'", double1 == 0.8071755356156836d);
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
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9171523356672744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948968d + "'", double1 == 1.5707963267948968d);
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.06572532608811625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06577273855851125d + "'", double1 == 0.06577273855851125d);
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        double double1 = org.apache.commons.math.util.FastMath.log(1.3694345116302007d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.31439788939558555d + "'", double1 == 0.31439788939558555d);
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.6530481872478414d, 0.9998039600078416d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5786048356980145d + "'", double2 == 0.5786048356980145d);
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.36957752722542414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.192242010190033d + "'", double1 == 1.192242010190033d);
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.8860860745183966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9604880600327923d + "'", double1 == 0.9604880600327923d);
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) (-36));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.7621445381930754d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7621445381930755d + "'", double1 == 0.7621445381930755d);
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.38930040372081254d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4109752067988277d + "'", double1 == 0.4109752067988277d);
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.6610060414837631d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6610060414837631d + "'", double1 == 0.6610060414837631d);
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.02465177322928096d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.302546093059478E-4d) + "'", double1 == (-4.302546093059478E-4d));
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.1046225788468806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04321391609967149d + "'", double1 == 0.04321391609967149d);
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        double double1 = org.apache.commons.math.util.FastMath.ulp(32.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.4779900867225375d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.306110394417042d + "'", double1 == 2.306110394417042d);
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.786036626268317d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8695168523156485d) + "'", double1 == (-0.8695168523156485d));
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
        double double1 = org.apache.commons.math.util.FastMath.acos((-1.4747880453493696d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.1016572581144659d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.3066167674914817d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3020049587260321d + "'", double1 == 0.3020049587260321d);
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
        double double1 = org.apache.commons.math.util.FastMath.exp((-2.4387890526067095d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0872664625997165d + "'", double1 == 0.0872664625997165d);
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.7306786685136297d, 1.3953649341158527d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1498040080478718d + "'", double2 == 2.1498040080478718d);
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.5433467420946743d, 9.038180788153241E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707377645772738d + "'", double2 == 1.5707377645772738d);
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
        double double1 = org.apache.commons.math.util.FastMath.log10(2005.3522829578812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.302190676759448d + "'", double1 == 3.302190676759448d);
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.693889518756616d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.647653479929832d) + "'", double1 == (-0.647653479929832d));
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-1.3485292390836008d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 4L, 1477896.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1477896.0f + "'", float2 == 1477896.0f);
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.00949495958537668d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.009495102259670249d) + "'", double1 == (-0.009495102259670249d));
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.2556637328313827d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8498642241004605d + "'", double1 == 0.8498642241004605d);
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.1173954566600866d, 0.5514266812416906d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1123679663409165d + "'", double2 == 1.1123679663409165d);
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.008838092819754681d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.008838207883813806d) + "'", double1 == (-0.008838207883813806d));
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.8554182836643193d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        int int2 = org.apache.commons.math.util.FastMath.max((-2), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
        double double1 = org.apache.commons.math.util.FastMath.log1p(36.000000000000014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.610917912644225d + "'", double1 == 3.610917912644225d);
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.986771734266245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.29195535450082d + "'", double1 == 6.29195535450082d);
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        double double2 = org.apache.commons.math.util.FastMath.max(0.677838996146359d, 0.4636456564559828d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.677838996146359d + "'", double2 == 0.677838996146359d);
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
        double double1 = org.apache.commons.math.util.FastMath.rint(203.72287995187472d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 204.0d + "'", double1 == 204.0d);
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000002d + "'", double1 == 1.0000000000000002d);
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.6418211471568946d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5706040832448086d + "'", double1 == 0.5706040832448086d);
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        double double1 = org.apache.commons.math.util.FastMath.sin(4.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7568024953079282d) + "'", double1 == (-0.7568024953079282d));
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.015129758985515648d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0001144569868137d + "'", double1 == 1.0001144569868137d);
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
        int int2 = org.apache.commons.math.util.FastMath.max(36, (-53));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.5625847965301676d, 0.38714087209326337d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3279301050129204d + "'", double2 == 1.3279301050129204d);
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.5832682320789061d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.005178519281788412d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005178565573424058d + "'", double1 == 0.005178565573424058d);
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 100, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
        long long2 = org.apache.commons.math.util.FastMath.min(57L, 6L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6L + "'", long2 == 6L);
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.3852968325547366d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.5707651109236087d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32034.985999653978d + "'", double1 == 32034.985999653978d);
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        double double2 = org.apache.commons.math.util.FastMath.min(10.049875621120886d, (-27.03274004183787d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-27.03274004183787d) + "'", double2 == (-27.03274004183787d));
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.6803595632804155d, (-0.4541594839761731d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6803595632804154d + "'", double2 == 0.6803595632804154d);
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.470434916701856d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.7399788154926485d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.313261687518223d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.796745936845354d + "'", double1 == 3.796745936845354d);
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 45);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 45 + "'", int1 == 45);
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-1), (float) 1477896L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1477896.0f + "'", float2 == 1477896.0f);
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.1719235979111335d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17278201040941962d + "'", double1 == 0.17278201040941962d);
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.29225491648198393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2563886896772048d + "'", double1 == 0.2563886896772048d);
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.9171523356672744d), 0.40992093582609207d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.1504819491870772d) + "'", double2 == (-1.1504819491870772d));
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
        long long1 = org.apache.commons.math.util.FastMath.abs(15472906L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 15472906L + "'", long1 == 15472906L);
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.56173368499807d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.547905963836717d + "'", double1 == 0.547905963836717d);
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2L, (float) 5);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
        double double2 = org.apache.commons.math.util.FastMath.min(0.1d, 1.0835112623546757d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1d + "'", double2 == 0.1d);
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.3529804386339674d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.016455121993179136d, 30751.49537331838d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.350998965551086E-7d + "'", double2 == 5.350998965551086E-7d);
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9891893911299775d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0172646118010161d + "'", double1 == 0.0172646118010161d);
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
        double double1 = org.apache.commons.math.util.FastMath.tan(639.6272283571994d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.08856646710337d) + "'", double1 == (-3.08856646710337d));
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.39449755004161075d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4836385494853932d + "'", double1 == 1.4836385494853932d);
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.01706683222077747d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.977857455908435d + "'", double1 == 0.977857455908435d);
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
        double double1 = org.apache.commons.math.util.FastMath.cosh(4.741297982545108d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.29577951308233d + "'", double1 == 57.29577951308233d);
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.26035149959480436d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5844399164946341d) + "'", double1 == (-0.5844399164946341d));
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        double double1 = org.apache.commons.math.util.FastMath.floor(35.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.0d + "'", double1 == 35.0d);
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.2459645599353212d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 149.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.563585508454165E64d + "'", double1 == 2.563585508454165E64d);
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        double double1 = org.apache.commons.math.util.FastMath.tanh(148.99999999999997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.3968786974024636d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
        int int2 = org.apache.commons.math.util.FastMath.min(35, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.1316153248585041d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1286541698196357d + "'", double1 == 2.1286541698196357d);
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
        double double1 = org.apache.commons.math.util.FastMath.exp(13.596393407514d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 803227.6141649d + "'", double1 == 803227.6141649d);
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        double double2 = org.apache.commons.math.util.FastMath.min(1.0484411939287768d, 0.38930040372081254d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.38930040372081254d + "'", double2 == 0.38930040372081254d);
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.5707963267948961d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0232274785475501d + "'", double1 == 1.0232274785475501d);
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
        double double1 = org.apache.commons.math.util.FastMath.floor(3.7568396789787597d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.026102280813798d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
        double double1 = org.apache.commons.math.util.FastMath.log1p(4.437442032932441d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.693308735747852d + "'", double1 == 1.693308735747852d);
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
        double double2 = org.apache.commons.math.util.FastMath.max((-10.0d), 28.000000000000004d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 28.000000000000004d + "'", double2 == 28.000000000000004d);
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
        double double2 = org.apache.commons.math.util.FastMath.max(0.3283909087132567d, 0.761511811895975d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.761511811895975d + "'", double2 == 0.761511811895975d);
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.791759469228055d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.6203702025697551d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8528715809224588d) + "'", double1 == (-0.8528715809224588d));
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.5971542229890328d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.611568870073207d + "'", double1 == 1.611568870073207d);
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.1034585241152786d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) 10, 1.6475439282580142d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.999999999999998d + "'", double2 == 9.999999999999998d);
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.168501181378485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8237910919979325d + "'", double1 == 0.8237910919979325d);
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
        int int1 = org.apache.commons.math.util.FastMath.abs(3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
        int int2 = org.apache.commons.math.util.FastMath.min(97, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.1072845368400976d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.0139617178500335d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.756499886438907d + "'", double1 == 2.756499886438907d);
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(39.74137414560076d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.412565217356853d + "'", double1 == 3.412565217356853d);
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.192242010190033d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.010869682135065003d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.010869254081131837d) + "'", double1 == (-0.010869254081131837d));
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9993832155237184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5356723210278893d + "'", double1 == 1.5356723210278893d);
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.5987609268125889d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5987609268125889d + "'", double1 == 0.5987609268125889d);
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.5127742681331149d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8004030615452978d + "'", double1 == 0.8004030615452978d);
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.4073861552074949d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8785415760154557d + "'", double1 == 0.8785415760154557d);
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.7076312586751926d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.04051985370229124d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04049769956657208d + "'", double1 == 0.04049769956657208d);
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
        long long2 = org.apache.commons.math.util.FastMath.max(2L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
        double double1 = org.apache.commons.math.util.FastMath.atan((-1.0476958419065936d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8086863969991327d) + "'", double1 == (-0.8086863969991327d));
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(6.29195535450082d, 4.3777255673228614d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.2919553545008196d + "'", double2 == 6.2919553545008196d);
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
        double double1 = org.apache.commons.math.util.FastMath.exp(4.276858964458209d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 72.01388621073826d + "'", double1 == 72.01388621073826d);
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
        double double1 = org.apache.commons.math.util.FastMath.acosh(4.15912713462618d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.103676392483125d + "'", double1 == 2.103676392483125d);
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.01702394494750664d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017024767257676526d) + "'", double1 == (-0.017024767257676526d));
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.0080212625522527d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6971497906938651d + "'", double1 == 0.6971497906938651d);
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(11013.232920103323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 104.94395132690269d + "'", double1 == 104.94395132690269d);
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(3.121587127777053E-5d, 0.28495825391099355d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.121587127777054E-5d + "'", double2 == 3.121587127777054E-5d);
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
        double double1 = org.apache.commons.math.util.FastMath.log(0.025470578295336027d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.6702312852883354d) + "'", double1 == (-3.6702312852883354d));
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
        int int2 = org.apache.commons.math.util.FastMath.min((int) 'a', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.4514637639272718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0175660469936023d + "'", double1 == 2.0175660469936023d);
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 57, (float) 52);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.470434916701856d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
        double double2 = org.apache.commons.math.util.FastMath.pow(148.80597572185025d, 1477896.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.28162208224762103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.27791419527934d + "'", double1 == 0.27791419527934d);
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.43305085726475895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.40786779792830646d + "'", double1 == 0.40786779792830646d);
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.0986122886681098d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4548324228266097d + "'", double1 == 0.4548324228266097d);
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.8659525529524847d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3820287244081937d + "'", double1 == 1.3820287244081937d);
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.719463918234335d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
        double double1 = org.apache.commons.math.util.FastMath.rint(8.881784197001252E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
        int int2 = org.apache.commons.math.util.FastMath.max(11013, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11013 + "'", int2 == 11013);
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.5999999999999996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.463738035001686d + "'", double1 == 13.463738035001686d);
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
        double double1 = org.apache.commons.math.util.FastMath.atan(630998.4197775756d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.570794742004874d + "'", double1 == 1.570794742004874d);
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.0017885376783303671d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) (short) 1, 2.10482857270117d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000000000000002d + "'", double2 == 1.0000000000000002d);
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 11013.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.1538315676666131d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.8355185716249157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6707931770950559d + "'", double1 == 0.6707931770950559d);
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-3.6702312852883354d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9987033404909239d) + "'", double1 == (-0.9987033404909239d));
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
        double double1 = org.apache.commons.math.util.FastMath.ceil(189.3225229221956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 190.0d + "'", double1 == 190.0d);
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
        float float1 = org.apache.commons.math.util.FastMath.abs(416128.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 416128.0f + "'", float1 == 416128.0f);
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.007057036850945338d, (-0.9754001961551926d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.007057036850945337d + "'", double2 == 0.007057036850945337d);
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.4963334177617679d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4030177275552311d + "'", double1 == 0.4030177275552311d);
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.39592515018183416d), 0.29251651548170565d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9344903757271339d) + "'", double2 == (-0.9344903757271339d));
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
        double double1 = org.apache.commons.math.util.FastMath.abs((-10.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
        double double1 = org.apache.commons.math.util.FastMath.ulp(6.802168607459072E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
        double double1 = org.apache.commons.math.util.FastMath.sin(3.6347792607040605d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4734351421020861d) + "'", double1 == (-0.4734351421020861d));
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
        double double2 = org.apache.commons.math.util.FastMath.max(1.5472906394139022E7d, (-1.2130532941206642d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5472906394139022E7d + "'", double2 == 1.5472906394139022E7d);
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
        long long1 = org.apache.commons.math.util.FastMath.round(96.71430629821528d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 97L + "'", long1 == 97L);
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
        double double1 = org.apache.commons.math.util.FastMath.log1p(4.806318343896785E8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 19.990612120000147d + "'", double1 == 19.990612120000147d);
    }
}

