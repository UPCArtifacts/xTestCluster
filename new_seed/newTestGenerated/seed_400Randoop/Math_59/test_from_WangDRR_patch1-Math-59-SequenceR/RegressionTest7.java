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
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9443504370351302d, (-2.741896957789622d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.809901974824097d + "'", double2 == 2.809901974824097d);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9795918367346939d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.663368930684795d + "'", double1 == 2.663368930684795d);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.7854928705551182d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013709436842128431d + "'", double1 == 0.013709436842128431d);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.6371840522608367d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.178598367428652d + "'", double1 == 1.178598367428652d);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.4124704496626688d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5330688992857334d + "'", double1 == 0.5330688992857334d);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        long long1 = org.apache.commons.math.util.FastMath.round(0.6783712618582197d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        double double1 = org.apache.commons.math.util.FastMath.log(0.15491406168101263d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.8648847565896696d) + "'", double1 == (-1.8648847565896696d));
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        double double1 = org.apache.commons.math.util.FastMath.log(1.0523757085397754d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05105018795236219d + "'", double1 == 0.05105018795236219d);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.5108256237659907d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4705882352941177d) + "'", double1 == (-0.4705882352941177d));
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.6105647004975028d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.21426830783673328d) + "'", double1 == (-0.21426830783673328d));
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.6199770987338742d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8526913992993734d + "'", double1 == 0.8526913992993734d);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.278010815082652d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.28172266585745886d + "'", double1 == 0.28172266585745886d);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.3580113828839064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3580113828839064d + "'", double1 == 1.3580113828839064d);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.5507969934215644d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5507969934215646d + "'", double1 == 1.5507969934215646d);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.4403028592460305d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 82.5232750554226d + "'", double1 == 82.5232750554226d);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.1535902666964596d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15480950261479168d + "'", double1 == 0.15480950261479168d);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.002017330101351759d, 1.7769994643832112d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6240153029588445E-5d + "'", double2 == 1.6240153029588445E-5d);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.09711515743188391d), 1.231690697458971d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.06571071737855876d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0021597261446225d + "'", double1 == 1.0021597261446225d);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.020378157273836d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 58.46336191912694d + "'", double1 == 58.46336191912694d);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        double double1 = org.apache.commons.math.util.FastMath.log10(20.049875621120893d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.302111682830096d + "'", double1 == 1.302111682830096d);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.7216329479064553d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9110439668248159d + "'", double1 == 0.9110439668248159d);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.40205067186377547d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7380632774182745d) + "'", double1 == (-0.7380632774182745d));
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 52);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9866275920404853d + "'", double1 == 0.9866275920404853d);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        double double2 = org.apache.commons.math.util.FastMath.max(0.22579135264471936d, 3.555348061489414d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.555348061489414d + "'", double2 == 3.555348061489414d);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.7372144183864715d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8586119137226501d + "'", double1 == 0.8586119137226501d);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.6233795230203681d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6645457244960807d) + "'", double1 == (-0.6645457244960807d));
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9586654676184497d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.764297879283013d + "'", double1 == 0.764297879283013d);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.3496452317282857d, 1.3649537293954457d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7797589011677598d + "'", double2 == 0.7797589011677598d);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.041446469648192756d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.233773586888595E-4d + "'", double1 == 7.233773586888595E-4d);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.9952731515503573d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.7380632774182745d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        int int2 = org.apache.commons.math.util.FastMath.max(5, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.0001894322564966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        double double1 = org.apache.commons.math.util.FastMath.log1p(299669.7281315037d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.610439577969121d + "'", double1 == 12.610439577969121d);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.1059577627892154d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.7208856239751529d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.3755807901428491d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3844732404433468d + "'", double1 == 0.3844732404433468d);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.4705882352941176d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5108256237659905d) + "'", double1 == (-0.5108256237659905d));
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.663368930684795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.34453352613691d + "'", double1 == 13.34453352613691d);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.1423973302809369d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.141916586172396d + "'", double1 == 0.141916586172396d);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.534330728057407d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 30.614895581841942d + "'", double1 == 30.614895581841942d);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 52L, (float) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.27746265011900656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24487580597087105d + "'", double1 == 0.24487580597087105d);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.4675027412274724d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.04144646964819275d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0008590278831344d + "'", double1 == 1.0008590278831344d);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.9088339535934726d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9999999999999837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16.21975758172915d + "'", double1 == 16.21975758172915d);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        long long1 = org.apache.commons.math.util.FastMath.round(1.1535902666964597d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        long long1 = org.apache.commons.math.util.FastMath.round(36.99082568500844d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 37L + "'", long1 == 37L);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 4L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.0928900516588147d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        double double1 = org.apache.commons.math.util.FastMath.tanh(9.999999995877692d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999958776927d + "'", double1 == 0.9999999958776927d);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        double double1 = org.apache.commons.math.util.FastMath.asinh(81.78552109133564d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.097284778145676d + "'", double1 == 5.097284778145676d);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.3205004784536856d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1491303139564657d + "'", double1 == 1.1491303139564657d);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.2701149951815156d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2701149951815156d + "'", double1 == 0.2701149951815156d);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(34.30685281944006d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1965.6378749304042d + "'", double1 == 1965.6378749304042d);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 0.7068730370437739d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.44699510894891675d), 102.66025548936804d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 102.66025548936804d + "'", double2 == 102.66025548936804d);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.723945865132188d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8979152839017209d + "'", double1 == 0.8979152839017209d);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.05729428410226429d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.05723171521667502d) + "'", double1 == (-0.05723171521667502d));
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 51);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 51L + "'", long1 == 51L);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9950371902099892d, 32.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        double double2 = org.apache.commons.math.util.FastMath.min(1.570705526933711d, 0.5834613951988717d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5834613951988717d + "'", double2 == 0.5834613951988717d);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        long long1 = org.apache.commons.math.util.FastMath.round(49.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 49L + "'", long1 == 49L);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.5707963267948967d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5186693692550166d + "'", double1 == 0.5186693692550166d);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.8940757456435277d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8940757456435278d + "'", double1 == 0.8940757456435278d);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        long long2 = org.apache.commons.math.util.FastMath.max(3L, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.37101925991283097d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3801063813513533d + "'", double1 == 0.3801063813513533d);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.6734086685536975d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        double double1 = org.apache.commons.math.util.FastMath.tanh(7.922473077851842E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.922471420323541E-4d + "'", double1 == 7.922471420323541E-4d);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 2.14748365E9f, 0.5340248990657174d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 96268.21174846243d + "'", double2 == 96268.21174846243d);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(99.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.641588833612778d + "'", double1 == 4.641588833612778d);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.868551121099462d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3669495678698107d + "'", double1 == 1.3669495678698107d);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.05729428410226429d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        int int2 = org.apache.commons.math.util.FastMath.min(10, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.7384229611146216d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 10, 51);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8896578254184928d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.47420105633127485d + "'", double1 == 0.47420105633127485d);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) 4.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        double double2 = org.apache.commons.math.util.FastMath.max(1.2233932393493425d, 6.176458219595615E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2233932393493425d + "'", double2 == 1.2233932393493425d);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        float float2 = org.apache.commons.math.util.FastMath.min(35.0f, (float) 49L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.6371840522608367d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 97, 5L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.4486454104648998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4486454104649d + "'", double1 == 1.4486454104649d);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        double double1 = org.apache.commons.math.util.FastMath.log(1.2389916350019468d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21429785121335637d + "'", double1 == 0.21429785121335637d);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        double double1 = org.apache.commons.math.util.FastMath.expm1(3.993222846126381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 53.229380982910065d + "'", double1 == 53.229380982910065d);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.6567734310571898d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7871182468501413d + "'", double1 == 0.7871182468501413d);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.647090741264414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1809708426156516d + "'", double1 == 1.1809708426156516d);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        long long2 = org.apache.commons.math.util.FastMath.min(1L, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        double double2 = org.apache.commons.math.util.FastMath.min((-1.1752011936438014d), 0.9605415309056046d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.1752011936438014d) + "'", double2 == (-1.1752011936438014d));
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        double double1 = org.apache.commons.math.util.FastMath.ulp(24.19638901669072d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.552713678800501E-15d + "'", double1 == 3.552713678800501E-15d);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        double double2 = org.apache.commons.math.util.FastMath.min(1.0679458541891842d, 3.475279369318095d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0679458541891842d + "'", double2 == 1.0679458541891842d);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.6894198109289533d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7606877815053108d + "'", double1 == 0.7606877815053108d);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        double double1 = org.apache.commons.math.util.FastMath.exp(564.2979850674102d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1789654113753112E245d + "'", double1 == 1.1789654113753112E245d);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.7922638897815387d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9253157489514579d + "'", double1 == 0.9253157489514579d);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        double double2 = org.apache.commons.math.util.FastMath.min(1.85186683311429d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.5707398226283833d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6033526819225967d + "'", double1 == 1.6033526819225967d);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        double double1 = org.apache.commons.math.util.FastMath.sinh(5.6146685600490525d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 137.20938277674583d + "'", double1 == 137.20938277674583d);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        double double1 = org.apache.commons.math.util.FastMath.tan(5.097284778145676d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.4685219244217045d) + "'", double1 == (-2.4685219244217045d));
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7719511309063009d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8819048085939799d + "'", double1 == 0.8819048085939799d);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        int int1 = org.apache.commons.math.util.FastMath.round(32.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.7871182468501413d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.0951332666770965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 120.04229369805482d + "'", double1 == 120.04229369805482d);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.44403286888919763d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        long long2 = org.apache.commons.math.util.FastMath.max(10L, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.6632456843634446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.17832556722311482d) + "'", double1 == (-0.17832556722311482d));
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.8980044321716312d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9476309577950855d + "'", double1 == 0.9476309577950855d);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        double double2 = org.apache.commons.math.util.FastMath.min(1.4900413211439332d, 0.43081945257903537d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.43081945257903537d + "'", double2 == 0.43081945257903537d);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9385078997951388d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        double double1 = org.apache.commons.math.util.FastMath.ulp(3.5019296225954823d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        double double1 = org.apache.commons.math.util.FastMath.log10(34.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5314789170422551d + "'", double1 == 1.5314789170422551d);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-1.570796326794879d), 0.5111502441944042d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963267948788d) + "'", double2 == (-1.5707963267948788d));
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        int int2 = org.apache.commons.math.util.FastMath.max(5, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.6312239307697934d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.19981654464613555d) + "'", double1 == (-0.19981654464613555d));
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.5574077246549027d, 1.0000000000002274d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5574077246549025d + "'", double2 == 1.5574077246549025d);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.4319786974204732d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4466855876047786d + "'", double1 == 0.4466855876047786d);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.01809842369803621d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13453038206307233d + "'", double1 == 0.13453038206307233d);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.6567734310571898d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7050189848914605d + "'", double1 == 0.7050189848914605d);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.7208856239751529d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.751221467511077d + "'", double1 == 0.751221467511077d);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.238693057170856d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3081720045294924d + "'", double1 == 1.3081720045294924d);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        float float2 = org.apache.commons.math.util.FastMath.min(100.0f, (float) 52L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9033391107665127d, 0.8950841726012685d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9033391107665127d + "'", double2 == 0.9033391107665127d);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.8259324122591327d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.38195407365429795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.32349849299466304d + "'", double1 == 0.32349849299466304d);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(24256.840282162542d, 0.451582705289455d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 24256.84028216254d + "'", double2 == 24256.84028216254d);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        double double1 = org.apache.commons.math.util.FastMath.log(0.38818646476211366d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9462694755163052d) + "'", double1 == (-0.9462694755163052d));
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.5063656411095873d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9676589901702034d, (-36.34032616795694d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1149712528373934d + "'", double2 == 3.1149712528373934d);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.1772213045900053d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2453438403535575d + "'", double1 == 2.2453438403535575d);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.036895443825105d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 3L, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9999550340122696d, 0.015372395508685268d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.015372395508685268d + "'", double2 == 0.015372395508685268d);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.20963059080589155d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2066128872074633d + "'", double1 == 0.2066128872074633d);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.47420105633127485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5154762810024204d + "'", double1 == 0.5154762810024204d);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        float float2 = org.apache.commons.math.util.FastMath.min(32.0f, 3280.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.5737618316160396d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5737618316160398d + "'", double1 == 1.5737618316160398d);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.806677178940103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.3440585709080678E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.700888353141718E44d + "'", double1 == 7.700888353141718E44d);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.5665394379443537d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7621584293004213d + "'", double1 == 1.7621584293004213d);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        double double2 = org.apache.commons.math.util.FastMath.pow(7.635078747156649E-9d, 0.009574440517976634d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8361467015331896d + "'", double2 == 0.8361467015331896d);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.5160141294778328d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7256995658276514d) + "'", double1 == (-0.7256995658276514d));
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 2);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        double double2 = org.apache.commons.math.util.FastMath.pow(4.0d, 0.6186254796916717d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.357488869363912d + "'", double2 == 2.357488869363912d);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 0.19486506597972084d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.38150068714523283d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3815006871452329d + "'", double1 == 0.3815006871452329d);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        long long1 = org.apache.commons.math.util.FastMath.round(0.7454273046925272d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 10L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        long long2 = org.apache.commons.math.util.FastMath.max(4L, 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.8479780433329283E-10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0588134251582075E-8d + "'", double1 == 1.0588134251582075E-8d);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.0609297062414165d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8414709848078965d) + "'", double1 == (-0.8414709848078965d));
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        long long1 = org.apache.commons.math.util.FastMath.round(1.1150719867773047d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        double double1 = org.apache.commons.math.util.FastMath.log(0.618990892446662d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4796647197391239d) + "'", double1 == (-0.4796647197391239d));
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2147483647, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 2005, 52.32176750100173d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.32176750100173d + "'", double2 == 52.32176750100173d);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9734594443576854d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9734594443576854d + "'", double1 == 0.9734594443576854d);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.0220501245488431d, (-0.6342583428795024d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.022050124548843d + "'", double2 == 1.022050124548843d);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.23513817840335524d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23513817840335524d + "'", double1 == 0.23513817840335524d);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.024151726835551d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6433908135793367d + "'", double1 == 1.6433908135793367d);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        int int2 = org.apache.commons.math.util.FastMath.max(52, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        double double1 = org.apache.commons.math.util.FastMath.atan(7.419949789789507E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.419948428089307E-4d + "'", double1 == 7.419948428089307E-4d);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.9481480091340625E13d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.007414768657038784d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        double double1 = org.apache.commons.math.util.FastMath.acos(7.211102550927978d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.038399603650754E38d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.85186683311429d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.4705882352941176d), 1.129830963909753d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.39465938646477783d) + "'", double2 == (-0.39465938646477783d));
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9091342957581129d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.6233795230203681d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5887690237160378d) + "'", double1 == (-0.5887690237160378d));
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.16299078079570548d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.019230769230769586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0001849169413684d + "'", double1 == 1.0001849169413684d);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.48706190399811883d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        long long1 = org.apache.commons.math.util.FastMath.round(1.6567042118906716d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.4920344106948838d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.47241994041774293d + "'", double1 == 0.47241994041774293d);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.8222073183777727d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6000485785214585d + "'", double1 == 0.6000485785214585d);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.4623267743738125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8950171058201956d + "'", double1 == 0.8950171058201956d);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        long long2 = org.apache.commons.math.util.FastMath.max(49L, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 49L + "'", long2 == 49L);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        double double1 = org.apache.commons.math.util.FastMath.cosh(8.875921921551335d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3578.771129355673d + "'", double1 == 3578.771129355673d);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        double double1 = org.apache.commons.math.util.FastMath.asin(118.70146570951638d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.8807733836535281d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9891013135438892d, 1.0020193662807058d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9891013135438893d + "'", double2 == 0.9891013135438893d);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.129830963909753d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4268126801343756d + "'", double1 == 0.4268126801343756d);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        long long2 = org.apache.commons.math.util.FastMath.max(49L, 39481480091341L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 39481480091341L + "'", long2 == 39481480091341L);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.4870619039981188d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.506549180277372d) + "'", double1 == (-0.506549180277372d));
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        double double1 = org.apache.commons.math.util.FastMath.abs((-1.5603171037625536d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5603171037625536d + "'", double1 == 1.5603171037625536d);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.556490997222833d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4424339268948981d + "'", double1 == 0.4424339268948981d);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.5574077246549023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2479614275509088d + "'", double1 == 1.2479614275509088d);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        long long1 = org.apache.commons.math.util.FastMath.abs(2147483647L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2147483647L + "'", long1 == 2147483647L);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1, (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        double double1 = org.apache.commons.math.util.FastMath.atanh(147.4131591025766d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        double double2 = org.apache.commons.math.util.FastMath.atan2(3.993222846126381d, 0.23089832850992176d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5130380898365219d + "'", double2 == 1.5130380898365219d);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2979.3805346802806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.547473508864641E-13d + "'", double1 == 4.547473508864641E-13d);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7719167525452196d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6480426263882401d + "'", double1 == 0.6480426263882401d);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) 5);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(7.922471420323541E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04539241756975537d + "'", double1 == 0.04539241756975537d);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.773775678340353d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3318317004563125d + "'", double1 == 1.3318317004563125d);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.5780769490282481d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7826070881910157d + "'", double1 == 1.7826070881910157d);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 2147483647L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        int int2 = org.apache.commons.math.util.FastMath.min(2005, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        double double2 = org.apache.commons.math.util.FastMath.min(3.993222846126381d, 5729.5779513082325d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.993222846126381d + "'", double2 == 3.993222846126381d);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        double double1 = org.apache.commons.math.util.FastMath.tanh(8.788723182374374d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999535225788d + "'", double1 == 0.9999999535225788d);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.0648180240443148d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        long long2 = org.apache.commons.math.util.FastMath.max(6559L, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6559L + "'", long2 == 6559L);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 1.5707963267948948d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        double double2 = org.apache.commons.math.util.FastMath.pow(4.644483341943245d, 24256.84028216254d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        double double1 = org.apache.commons.math.util.FastMath.log10((-1.3348404966530283d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.3728048593649235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.38202996368107867d + "'", double1 == 0.38202996368107867d);
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.8518668331142898d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.226865813845656d + "'", double1 == 1.226865813845656d);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.9481480091341E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9785097773144031d + "'", double1 == 1.9785097773144031d);
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.008837977760189355d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5063788250893344d) + "'", double1 == (-0.5063788250893344d));
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        float float2 = org.apache.commons.math.util.FastMath.max(2005.0f, (float) 6559L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6559.0f + "'", float2 == 6559.0f);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(18.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3141592653589793d + "'", double1 == 0.3141592653589793d);
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 37L, (float) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.2566275487052346d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.26241365373669573d + "'", double1 == 0.26241365373669573d);
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.20977711114722197d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.019343107182594d + "'", double1 == 12.019343107182594d);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.13237524813391602d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8781932128101281d) + "'", double1 == (-0.8781932128101281d));
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.2111828491680883d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        long long1 = org.apache.commons.math.util.FastMath.round(1.4711276743037347d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 36);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 36L + "'", long1 == 36L);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 2147483647, 51L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 51L + "'", long2 == 51L);
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.7615941559557649d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        double double1 = org.apache.commons.math.util.FastMath.log((-2.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-2.7131306085479543d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9912395140417428d) + "'", double1 == (-0.9912395140417428d));
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.8704401477824153d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9329738194517654d + "'", double1 == 0.9329738194517654d);
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.009529184458135628d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.00952904024195853d + "'", double1 == 0.00952904024195853d);
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-1), (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 'a', 0.4602546797556596d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.211471469934278d + "'", double2 == 8.211471469934278d);
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        double double2 = org.apache.commons.math.util.FastMath.max(1.0001081203235103d, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        double double1 = org.apache.commons.math.util.FastMath.asinh(7.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.644120761058629d + "'", double1 == 2.644120761058629d);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        long long1 = org.apache.commons.math.util.FastMath.round(82.5232750554226d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 83L + "'", long1 == 83L);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        long long2 = org.apache.commons.math.util.FastMath.max(5L, 83L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 83L + "'", long2 == 83L);
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.0654662031349924d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        double double1 = org.apache.commons.math.util.FastMath.asin(13.067188648029997d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 5);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 74.20321057778875d + "'", double1 == 74.20321057778875d);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.38202996368107867d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 21.88870456646193d + "'", double1 == 21.88870456646193d);
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.8310416729209025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3531598844633632d + "'", double1 == 1.3531598844633632d);
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.7059602000407633d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7609889586512912d + "'", double1 == 0.7609889586512912d);
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '#', 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.0086972736692794d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6597188392706284d + "'", double1 == 3.6597188392706284d);
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.2248497229193942E-5d, 0.44726467702583395d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.006354376503654261d + "'", double2 == 0.006354376503654261d);
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.8259963669851865d), 7.419949789789507E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8259963669851865d) + "'", double2 == (-0.8259963669851865d));
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        int int2 = org.apache.commons.math.util.FastMath.min((-1), 51);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        double double1 = org.apache.commons.math.util.FastMath.signum(11013.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.428182669496151d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7537194024558177d) + "'", double1 == (-0.7537194024558177d));
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 4L, (float) 6559L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        double double2 = org.apache.commons.math.util.FastMath.min(0.5006478239302304d, (-0.34770688124939175d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.34770688124939175d) + "'", double2 == (-0.34770688124939175d));
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        double double1 = org.apache.commons.math.util.FastMath.log(0.3141592653589793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1578552071446455d) + "'", double1 == (-1.1578552071446455d));
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        double double1 = org.apache.commons.math.util.FastMath.log1p(118.70146570951638d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.785000857347075d + "'", double1 == 4.785000857347075d);
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(4.158638853279167d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 238.27245481202067d + "'", double1 == 238.27245481202067d);
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 1, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(102.66025548936804d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 102.66025548936805d + "'", double1 == 102.66025548936805d);
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9030746578456205d, 564.2988711233953d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.001600346789795746d + "'", double2 == 0.001600346789795746d);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9557606135662686d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.12236703082541885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.34980999246079125d + "'", double1 == 0.34980999246079125d);
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        double double1 = org.apache.commons.math.util.FastMath.atanh(8.692617836018588d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.025854498747691985d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.1966267533422026d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(57.295779276891516d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8551464155167325d + "'", double1 == 3.8551464155167325d);
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.41032129904824216d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.0000000001847977d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.99822295029797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 171.78552109133565d + "'", double1 == 171.78552109133565d);
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.38818646476211366d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.40893653071341846d) + "'", double1 == (-0.40893653071341846d));
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.082130173350885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.87946975321415d + "'", double1 == 10.87946975321415d);
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.2349946114235455d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 1, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.1472859194620699d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14836503173587057d + "'", double1 == 0.14836503173587057d);
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.8980044321716312d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7317114834832753d + "'", double1 == 0.7317114834832753d);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.463837428330972d, 0.41386243940890527d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.295263154971464d + "'", double2 == 1.295263154971464d);
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.01965354335811999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1260650868976465d + "'", double1 == 1.1260650868976465d);
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.5085350159312789d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5334825240161821d) + "'", double1 == (-0.5334825240161821d));
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9999999535225788d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.07258194039108286d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07270980201850795d + "'", double1 == 0.07270980201850795d);
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2005L, 32.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        int int2 = org.apache.commons.math.util.FastMath.max(0, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 52.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        long long2 = org.apache.commons.math.util.FastMath.max(6559L, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6559L + "'", long2 == 6559L);
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        double double1 = org.apache.commons.math.util.FastMath.sin((-1.0697079433475818d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.877060243390276d) + "'", double1 == (-0.877060243390276d));
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.1760939939322343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.400600326943082d + "'", double1 == 2.400600326943082d);
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        int int2 = org.apache.commons.math.util.FastMath.min(1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 'a', (float) 2005L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2005.0f + "'", float2 == 2005.0f);
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.0867705308894857d, 1.0654662031349924d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0987194816406858d + "'", double2 == 1.0987194816406858d);
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        double double1 = org.apache.commons.math.util.FastMath.tan((-1.3649255980017991d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.788598848288131d) + "'", double1 == (-4.788598848288131d));
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.6342583428795024d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        float float2 = org.apache.commons.math.util.FastMath.min(9.223372E18f, (float) 2147483647);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9917933885729989d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.533488069366356d + "'", double1 == 1.533488069366356d);
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.46895884275557587d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6329157518089751d) + "'", double1 == (-0.6329157518089751d));
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.2737367544323206E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2737367544323206E-13d + "'", double1 == 2.2737367544323206E-13d);
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        double double2 = org.apache.commons.math.util.FastMath.max(0.20812481305103553d, 0.3606730780703395d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3606730780703395d + "'", double2 == 0.3606730780703395d);
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(4.615120516841259d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.148283155648077d + "'", double1 == 2.148283155648077d);
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        int int2 = org.apache.commons.math.util.FastMath.min(2147483647, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.027066513565235144d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027066513565235147d + "'", double1 == 0.027066513565235147d);
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        double double1 = org.apache.commons.math.util.FastMath.atan(8.881784197001252E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        double double2 = org.apache.commons.math.util.FastMath.min(23.566702073076858d, 2.302585092994046d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.302585092994046d + "'", double2 == 2.302585092994046d);
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.019462906223117808d, 3.5251431659552352d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.315628919625611E-7d + "'", double2 == 9.315628919625611E-7d);
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.7345106490374572d, 1.653029967135041E-13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7345106490374571d + "'", double2 == 0.7345106490374571d);
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-1.2240401467946807d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.01637843834123187d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.016379170612585522d) + "'", double1 == (-0.016379170612585522d));
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9999999958776927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.0021597261446225d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.3367845712965752d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.3877787807814457E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.403108691968676E-6d + "'", double1 == 2.403108691968676E-6d);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.0987194816406858d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0318793982144276d + "'", double1 == 1.0318793982144276d);
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.5006478239302304d, 0.4345379130038666d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8559725029698935d + "'", double2 == 0.8559725029698935d);
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.5594482377087571d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.8548425446316326d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9914978027470505d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6952684310179387d + "'", double1 == 1.6952684310179387d);
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.1928445361837339d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0113842453998398d + "'", double1 == 1.0113842453998398d);
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9999999535225788d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5574075654456325d + "'", double1 == 1.5574075654456325d);
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        int int2 = org.apache.commons.math.util.FastMath.max((int) 'a', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.5119471234779015d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.46517735014659645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4651773501465965d + "'", double1 == 0.4651773501465965d);
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(47.0d, 147.41315910257663d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 47.00000000000001d + "'", double2 == 47.00000000000001d);
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-1.5701287081656916d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.41777137910516676d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-1.5424779506349352E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5424779445183978E-4d) + "'", double1 == (-1.5424779445183978E-4d));
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) 2L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.38905609893065d + "'", double1 == 6.38905609893065d);
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        double double1 = org.apache.commons.math.util.FastMath.log(0.6860864438010045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3767516478232912d) + "'", double1 == (-0.3767516478232912d));
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        double double1 = org.apache.commons.math.util.FastMath.acosh(58.46336191912694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.7614742956440415d + "'", double1 == 4.7614742956440415d);
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1622776601683795d + "'", double1 == 3.1622776601683795d);
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.1479594040306007d, 0.9999999535225788d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.135079852099922d + "'", double2 == 1.135079852099922d);
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        double double2 = org.apache.commons.math.util.FastMath.min(1.4213280739250442d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        int int1 = org.apache.commons.math.util.FastMath.round(4.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        double double1 = org.apache.commons.math.util.FastMath.atan(3.748066027288565E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963001144702d + "'", double1 == 1.5707963001144702d);
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7317114834832753d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6241113009286544d + "'", double1 == 0.6241113009286544d);
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9534625892455924d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8685511210994623d + "'", double1 == 1.8685511210994623d);
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.010308913146243284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.010309095749349842d + "'", double1 == 0.010309095749349842d);
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        double double1 = org.apache.commons.math.util.FastMath.log(1.0055748560585922d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005559374061838583d + "'", double1 == 0.005559374061838583d);
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.0911052960943115d, (-1.5707963267948966d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5344870970745856d + "'", double2 == 2.5344870970745856d);
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.008837977760189355d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5796344196146512d + "'", double1 == 1.5796344196146512d);
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3578.771129355673d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.296003526156234d + "'", double1 == 15.296003526156234d);
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.6783203845295841d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.745474297486651d) + "'", double1 == (-0.745474297486651d));
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.8414709848078964d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2261911708835167d + "'", double1 == 1.2261911708835167d);
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        double double1 = org.apache.commons.math.util.FastMath.abs(12.010147458377778d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.010147458377778d + "'", double1 == 12.010147458377778d);
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.373400766945016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        double double1 = org.apache.commons.math.util.FastMath.cosh(5.916079783099616d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 185.47866641176898d + "'", double1 == 185.47866641176898d);
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) 5L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        long long1 = org.apache.commons.math.util.FastMath.round(0.7403654500754642d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.012097700501686678d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.012097405429255696d + "'", double1 == 0.012097405429255696d);
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        double double1 = org.apache.commons.math.util.FastMath.exp(50.50495049504956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.590556703111504E21d + "'", double1 == 8.590556703111504E21d);
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8656496755126944d, (-1.5707963267948788d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2543614206555753d + "'", double2 == 1.2543614206555753d);
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        double double2 = org.apache.commons.math.util.FastMath.atan2(7.922473906616227E-4d, 1.6649237511146353d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.7584601417043006E-4d + "'", double2 == 4.7584601417043006E-4d);
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        double double1 = org.apache.commons.math.util.FastMath.exp(4.605170185988091d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 99.99999999999996d + "'", double1 == 99.99999999999996d);
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.557407724654903d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19240232444172636d + "'", double1 == 0.19240232444172636d);
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        double double1 = org.apache.commons.math.util.FastMath.asinh(328280.6350011744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.394771296631976d + "'", double1 == 13.394771296631976d);
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.5856304902609806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.46098211388712107d + "'", double1 == 0.46098211388712107d);
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        int int2 = org.apache.commons.math.util.FastMath.max(3, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        float float2 = org.apache.commons.math.util.FastMath.max(3280.0f, 51.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3280.0f + "'", float2 == 3280.0f);
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        double double1 = org.apache.commons.math.util.FastMath.asin(4.6151205168412615d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.1088821403655396d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8036668909554542d + "'", double1 == 0.8036668909554542d);
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        double double2 = org.apache.commons.math.util.FastMath.atan2(7.211102550927978d, 2.533480711437213d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2329366436825557d + "'", double2 == 1.2329366436825557d);
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.1189396031849521d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 97.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        int int2 = org.apache.commons.math.util.FastMath.max(51, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 51 + "'", int2 == 51);
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        double double1 = org.apache.commons.math.util.FastMath.log1p(64.11051679254084d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.176086084439524d + "'", double1 == 4.176086084439524d);
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.04540802173355351d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04645474909357235d + "'", double1 == 0.04645474909357235d);
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        double double2 = org.apache.commons.math.util.FastMath.max(2.5684916247485625d, 3.970291913552122d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.970291913552122d + "'", double2 == 3.970291913552122d);
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        double double1 = org.apache.commons.math.util.FastMath.rint(15.296003526156234d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.0d + "'", double1 == 15.0d);
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        double double1 = org.apache.commons.math.util.FastMath.exp((-15.099557124773774d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7691447726306185E-7d + "'", double1 == 2.7691447726306185E-7d);
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        double double1 = org.apache.commons.math.util.FastMath.atan((-3.880519781392989d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3185862410962617d) + "'", double1 == (-1.3185862410962617d));
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.2698012268765735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9550419440421795d + "'", double1 == 0.9550419440421795d);
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.39707373807201474d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0798750298496722d + "'", double1 == 1.0798750298496722d);
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        int int1 = org.apache.commons.math.util.FastMath.abs(36);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 36 + "'", int1 == 36);
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 10, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
        double double2 = org.apache.commons.math.util.FastMath.atan2(3.1053461109058813d, 0.3815006871452329d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4485559835397435d + "'", double2 == 1.4485559835397435d);
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        double double1 = org.apache.commons.math.util.FastMath.signum((-1.2240401467946807d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        double double1 = org.apache.commons.math.util.FastMath.atanh(4.295214085529645d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, 83L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.703333949748545d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.4308194525790353d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4596132072859689d + "'", double1 == 0.4596132072859689d);
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
        double double2 = org.apache.commons.math.util.FastMath.min(0.8542643515376653d, 2005.3522829578812d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8542643515376653d + "'", double2 == 0.8542643515376653d);
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
        long long1 = org.apache.commons.math.util.FastMath.round(1.4640783251232936d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.5092033284084692d, 0.3796077390275217d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.509203328408469d + "'", double2 == 1.509203328408469d);
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.11765201143093872d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11765201143093873d + "'", double1 == 0.11765201143093873d);
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
        double double1 = org.apache.commons.math.util.FastMath.acos(6.389478437674908E19d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.1260650868976465d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
        double double1 = org.apache.commons.math.util.FastMath.tan((-2.3079900215284027E-5d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.307990021938211E-5d) + "'", double1 == (-2.307990021938211E-5d));
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        float float2 = org.apache.commons.math.util.FastMath.max((-1.0f), (float) 35);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.6876964991326107d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.004619514690056837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.004608877478660571d + "'", double1 == 0.004608877478660571d);
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.4562069848775176d, (double) 3280.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.390874944925892E-4d + "'", double2 == 1.390874944925892E-4d);
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.39593320820718014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3856693690918906d + "'", double1 == 0.3856693690918906d);
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        float float2 = org.apache.commons.math.util.FastMath.max(52.0f, (float) 52);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        double double2 = org.apache.commons.math.util.FastMath.min((-36.34032616795694d), 0.34980999246079125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-36.34032616795694d) + "'", double2 == (-36.34032616795694d));
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.6414234112961992d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7605884021621934d + "'", double1 == 0.7605884021621934d);
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8721824073781502d, 0.8918074856677578d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7742732308037816d + "'", double2 == 0.7742732308037816d);
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.15617144518908815d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0027257059161474467d + "'", double1 == 0.0027257059161474467d);
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        double double1 = org.apache.commons.math.util.FastMath.tan(7.197874973409682E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.197874973409682E-16d + "'", double1 == 7.197874973409682E-16d);
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9882281837083275d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.686470321113186d + "'", double1 == 2.686470321113186d);
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(147.41315910257663d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8446.151861268154d + "'", double1 == 8446.151861268154d);
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.8143865674904548d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3503505927690682d + "'", double1 == 1.3503505927690682d);
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.0001081203235103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.6953521612866584E-5d + "'", double1 == 4.6953521612866584E-5d);
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9953681804907311d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.7357191005950772d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-9.338683839135873d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5684.717147901503d) + "'", double1 == (-5684.717147901503d));
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-1.5701287081656916d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9170462317842702d) + "'", double1 == (-0.9170462317842702d));
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
        double double1 = org.apache.commons.math.util.FastMath.rint(52.32176750100173d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.0d + "'", double1 == 52.0d);
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        int int2 = org.apache.commons.math.util.FastMath.min(2147483647, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.42583531879039677d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.45358995168228144d + "'", double1 == 0.45358995168228144d);
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        double double1 = org.apache.commons.math.util.FastMath.exp(573.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.091500380984786E248d + "'", double1 == 7.091500380984786E248d);
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9962731540917057d, (-0.05729428410226429d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.05729428410226429d) + "'", double2 == (-0.05729428410226429d));
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.025854498747691985d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.766302783569967d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
        double double1 = org.apache.commons.math.util.FastMath.acos((-1.3185862410962617d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
        double double1 = org.apache.commons.math.util.FastMath.log1p(9.079986068656757E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.079573862873686E-5d + "'", double1 == 9.079573862873686E-5d);
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        double double2 = org.apache.commons.math.util.FastMath.max(2453.035678413897d, 0.42846204504183943d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2453.035678413897d + "'", double2 == 2453.035678413897d);
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
        double double2 = org.apache.commons.math.util.FastMath.max(0.7615165085805535d, 1.0368954438251052d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0368954438251052d + "'", double2 == 1.0368954438251052d);
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.16601303451652813d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4040111144795653d + "'", double1 == 1.4040111144795653d);
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.9204604704918524d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9727510630877674d) + "'", double1 == (-0.9727510630877674d));
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.9170462317842702d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
        double double1 = org.apache.commons.math.util.FastMath.ceil(45.603769410297964d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 46.0d + "'", double1 == 46.0d);
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(7872.0d, 5.267884728309446d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7871.999999999999d + "'", double2 == 7871.999999999999d);
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7742732308037816d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6494073931557557d + "'", double1 == 0.6494073931557557d);
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
        int int2 = org.apache.commons.math.util.FastMath.min((-1), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.13417614850536844d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.3141592653589793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.369107770624847d + "'", double1 == 1.369107770624847d);
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.5504171915615343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1573983488113466d + "'", double1 == 1.1573983488113466d);
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.46517735014659645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5038981879533445d + "'", double1 == 0.5038981879533445d);
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.009528896040185642d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009528607643185543d + "'", double1 == 0.009528607643185543d);
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.05723171521667502d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.057169350827127846d) + "'", double1 == (-0.057169350827127846d));
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.0008590278831344d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.017939523577309636d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017939523577309636d + "'", double1 == 0.017939523577309636d);
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.6782858550610652d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8786264103981242d + "'", double1 == 0.8786264103981242d);
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.38625675609943166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.32660713332209224d + "'", double1 == 0.32660713332209224d);
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
        double double1 = org.apache.commons.math.util.FastMath.rint(7.419949789789507E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9925551120260716d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
        double double1 = org.apache.commons.math.util.FastMath.atan(4.574710978503383d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3555884200224508d + "'", double1 == 1.3555884200224508d);
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 1, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
        double double1 = org.apache.commons.math.util.FastMath.atan(27.951773034959196d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5350356726278824d + "'", double1 == 1.5350356726278824d);
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(12.239326967783478d, 0.8896578254184928d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 12.239326967783477d + "'", double2 == 12.239326967783477d);
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.7719167525452196d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.16390996121117d + "'", double1 == 2.16390996121117d);
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.5574077246549023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0120948455406893d + "'", double1 == 1.0120948455406893d);
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
        double double1 = org.apache.commons.math.util.FastMath.sinh(27.289917197127753d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.554925098283228E11d + "'", double1 == 3.554925098283228E11d);
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.34770688124939175d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.38818646476211366d), 0.7813863964118538d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.3881864647621136d) + "'", double2 == (-0.3881864647621136d));
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
        int int2 = org.apache.commons.math.util.FastMath.min(2, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.5707963267948966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3012989023072947d + "'", double1 == 2.3012989023072947d);
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 4, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 3);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.5473651378551416d, 7.922473906616227E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9995226746451285d + "'", double2 == 0.9995226746451285d);
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5063656411097588d) + "'", double1 == (-0.5063656411097588d));
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.05723171521667502d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0571693100705275d) + "'", double1 == (-0.0571693100705275d));
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
        double double1 = org.apache.commons.math.util.FastMath.cos(238.27245481202067d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8829970372855591d + "'", double1 == 0.8829970372855591d);
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.19611987703015216d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19488392536250315d + "'", double1 == 0.19488392536250315d);
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.0523757085397754d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.1772213045900053d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 0, 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.9384993119631392d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.39121448595757846d + "'", double1 == 0.39121448595757846d);
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.6342583428795024d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5652293147812666d) + "'", double1 == (-0.5652293147812666d));
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.3314536537354545E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3314536537354545E42d + "'", double1 == 1.3314536537354545E42d);
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.9960122203732344d), 7.091500380984786E248d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9960122203732343d) + "'", double2 == (-0.9960122203732343d));
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.06341245279958997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06332759252502575d + "'", double1 == 0.06332759252502575d);
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
        float float1 = org.apache.commons.math.util.FastMath.abs(3.9481478E13f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.9481478E13f + "'", float1 == 3.9481478E13f);
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        double double1 = org.apache.commons.math.util.FastMath.log(0.8253695151090449d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.19192409582154932d) + "'", double1 == (-0.19192409582154932d));
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.8819048085939799d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6356818791600741d + "'", double1 == 0.6356818791600741d);
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.26736318179044144d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2611695699563672d) + "'", double1 == (-0.2611695699563672d));
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        double double1 = org.apache.commons.math.util.FastMath.signum((-1.6112949659561453d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9999197990932152d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 83L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 83.0f + "'", float1 == 83.0f);
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9999997749296758d, 0.20812481305103553d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999997749296757d + "'", double2 == 0.9999997749296757d);
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.5063656411097465d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7059602000407383d) + "'", double1 == (-0.7059602000407383d));
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-1.5424779506349352E-4d), 2.702048418162471d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-5.7085503671632166E-5d) + "'", double2 == (-5.7085503671632166E-5d));
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
        double double1 = org.apache.commons.math.util.FastMath.abs(63.11171283996957d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 63.11171283996957d + "'", double1 == 63.11171283996957d);
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.045392431815163135d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04537684510870222d + "'", double1 == 0.04537684510870222d);
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
        double double2 = org.apache.commons.math.util.FastMath.max(1.5574075654456325d, 0.39593320820718014d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5574075654456325d + "'", double2 == 1.5574075654456325d);
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
        long long1 = org.apache.commons.math.util.FastMath.round(1.178598367428652d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9999997749296758d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6931470680247769d + "'", double1 == 0.6931470680247769d);
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '#', 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.7755575615628914E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.8012298966644482d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5884697075000961d + "'", double1 == 0.5884697075000961d);
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.7317114834832753d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7317114834832754d + "'", double1 == 0.7317114834832754d);
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.7949001954883153d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3479613719631407d + "'", double1 == 1.3479613719631407d);
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.7993878774634113d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-45.80155157257448d) + "'", double1 == (-45.80155157257448d));
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.703333949748545d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7033339497485451d + "'", double1 == 1.7033339497485451d);
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.19240232444172636d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2121580997058449d + "'", double1 == 0.2121580997058449d);
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 1, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.178598367428652d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2498159612437756d + "'", double1 == 2.2498159612437756d);
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.0213710154485947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7037760017056153d + "'", double1 == 0.7037760017056153d);
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-3.552713678800564E-14d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.287406448412928E-5d) + "'", double1 == (-3.287406448412928E-5d));
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0020088234623122656d, 7.38905609893065d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0020088234623122656d + "'", double2 == 0.0020088234623122656d);
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9917933885729989d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.0049514518537068d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.5063788250893344d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.46711895782037055d) + "'", double1 == (-0.46711895782037055d));
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.1259469553800836d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7037401198988091d + "'", double1 == 1.7037401198988091d);
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.03505120341912517d, 1.1789654113753112E245d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.973047646769935E-247d + "'", double2 == 2.973047646769935E-247d);
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 6559L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 375803.0178263069d + "'", double1 == 375803.0178263069d);
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.2737367544325796E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2737367544325796E-13d + "'", double1 == 2.2737367544325796E-13d);
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
        float float2 = org.apache.commons.math.util.FastMath.min(2.0f, (float) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 37L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 37.0f + "'", float1 == 37.0f);
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.016379903021458187d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }
}

