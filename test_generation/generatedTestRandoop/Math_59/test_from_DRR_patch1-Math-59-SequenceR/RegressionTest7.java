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
        double double1 = org.apache.commons.math.util.FastMath.tanh(5.267884728309446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999468636254574d + "'", double1 == 0.9999468636254574d);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.5476523162282666d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2614950711954901d) + "'", double1 == (-0.2614950711954901d));
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.15467365951537007d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5367912817072857d + "'", double1 == 0.5367912817072857d);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.4819946344796317d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5029298180234462d + "'", double1 == 0.5029298180234462d);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.11886728987977911d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11886728987977911d + "'", double1 == 0.11886728987977911d);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.8539880479975237d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8539880479975238d + "'", double1 == 0.8539880479975238d);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 28);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1604.281826366305d + "'", double1 == 1604.281826366305d);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.2604393535992218d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2664920422852502d + "'", double1 == 0.2664920422852502d);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        double double2 = org.apache.commons.math.util.FastMath.pow(286.00000000000006d, 3.5535399199098424E-90d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) 35);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        double double2 = org.apache.commons.math.util.FastMath.pow(270.3546380008244d, 0.5638717219103803d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 23.512494834056568d + "'", double2 == 23.512494834056568d);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.264102998611546d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9112042903736097d + "'", double1 == 1.9112042903736097d);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.99822295029797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 171.78552109133565d + "'", double1 == 171.78552109133565d);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.7183647855248692d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23511536410737136d + "'", double1 == 0.23511536410737136d);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.876278270531895d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.540302305868139d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8144772166995118d + "'", double1 == 0.8144772166995118d);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        double double1 = org.apache.commons.math.util.FastMath.sin(3.2997987378517206d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1575469486498566d) + "'", double1 == (-0.1575469486498566d));
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        double double2 = org.apache.commons.math.util.FastMath.max(1.0954243259038507d, (-0.05042853879473771d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0954243259038507d + "'", double2 == 1.0954243259038507d);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(3.053086467974937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7473083494263217d + "'", double1 == 1.7473083494263217d);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        double double1 = org.apache.commons.math.util.FastMath.sinh(7.569397566060481d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 968.9859567243174d + "'", double1 == 968.9859567243174d);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.03497717096803514d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.03496291770971693d) + "'", double1 == (-0.03496291770971693d));
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.37841993602148327d), 192.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0019709346146880593d) + "'", double2 == (-0.0019709346146880593d));
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.5459079327750913d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.026981183359624506d + "'", double1 == 0.026981183359624506d);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.11886728987977911d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        double double1 = org.apache.commons.math.util.FastMath.log(0.1531969697659333d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.8760308014670004d) + "'", double1 == (-1.8760308014670004d));
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.2949496123890058d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.024066581448410507d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.023781545449259364d + "'", double1 == 0.023781545449259364d);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        double double1 = org.apache.commons.math.util.FastMath.ulp(4.3777255673228614d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.0286185349173835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.30720038919415704d + "'", double1 == 0.30720038919415704d);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.381919166334245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5137540041501325d + "'", double1 == 1.5137540041501325d);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.3293232640668133d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12363060526841456d + "'", double1 == 0.12363060526841456d);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.31113287105457993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.31617702417284754d + "'", double1 == 0.31617702417284754d);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.030555897991319556d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.030565412958282755d) + "'", double1 == (-0.030565412958282755d));
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.8539880479975237d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3489961061146645d + "'", double1 == 1.3489961061146645d);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.4411269137881427d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4269587715167061d + "'", double1 == 0.4269587715167061d);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.06004622792980713d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4403954360585147d + "'", double1 == 3.4403954360585147d);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        float float2 = org.apache.commons.math.util.FastMath.min(52.0f, (float) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.4995723020409742d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4051799354776308d + "'", double1 == 0.4051799354776308d);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.017066003704239316d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.5397993958058634d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.9251475365964138d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.6236194323225612d) + "'", double1 == (-1.6236194323225612d));
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        long long1 = org.apache.commons.math.util.FastMath.round(3.637978807091713E-12d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        long long1 = org.apache.commons.math.util.FastMath.round(4.619945108332321E-11d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.41671114415975286d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.47588499532711054d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        double double1 = org.apache.commons.math.util.FastMath.tanh(261077.8315317605d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        double double1 = org.apache.commons.math.util.FastMath.asinh(9.044524487391685E157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.05709087716385303d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23893697320392468d + "'", double1 == 0.23893697320392468d);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) 3);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(3.7568396789787597d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 215.251057912766d + "'", double1 == 215.251057912766d);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, (-0.9754001961551926d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.141592653589793d + "'", double2 == 3.141592653589793d);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        double double2 = org.apache.commons.math.util.FastMath.max(1.4901161193847673E-8d, 0.5740225962860341d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5740225962860341d + "'", double2 == 0.5740225962860341d);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        double double1 = org.apache.commons.math.util.FastMath.atan(9.712293689529174E-39d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.712293689529174E-39d + "'", double1 == 9.712293689529174E-39d);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        double double2 = org.apache.commons.math.util.FastMath.max(0.4576692332118569d, 57.29577951308238d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 57.29577951308238d + "'", double2 == 57.29577951308238d);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        double double2 = org.apache.commons.math.util.FastMath.min((double) (short) 1, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        long long1 = org.apache.commons.math.util.FastMath.round(2.0393938154819877d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.7966043547446022d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6726669944799356d + "'", double1 == 0.6726669944799356d);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-7.090523728538517E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.090523728538516E-4d) + "'", double1 == (-7.090523728538516E-4d));
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        long long2 = org.apache.commons.math.util.FastMath.max(52L, (long) 72);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 72L + "'", long2 == 72L);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        double double1 = org.apache.commons.math.util.FastMath.asin(192.2131105221355d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        double double1 = org.apache.commons.math.util.FastMath.acosh(14.206130689293303d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3455797190266234d + "'", double1 == 3.3455797190266234d);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.5740524125174076d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5183291705463149d + "'", double1 == 0.5183291705463149d);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.148283155648077d, 2.542524056185831d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.987964445674528d + "'", double2 == 6.987964445674528d);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.004445306012183907d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1644247616460815d + "'", double1 == 0.1644247616460815d);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.11158130719039049d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        double double1 = org.apache.commons.math.util.FastMath.log(2.4219132975121505d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8845578466008552d + "'", double1 == 0.8845578466008552d);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 1, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        double double1 = org.apache.commons.math.util.FastMath.ulp(7.389056098930649d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        int int2 = org.apache.commons.math.util.FastMath.min(2, 57);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        double double1 = org.apache.commons.math.util.FastMath.acos(27.935504743358095d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.30720038919415704d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        double double2 = org.apache.commons.math.util.FastMath.max(0.7235232133665007d, 18.72514057803899d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 18.72514057803899d + "'", double2 == 18.72514057803899d);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 9223372036854775807L, (float) 72L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 72.0f + "'", float2 == 72.0f);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.43087067877290786d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 4, 72L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 72L + "'", long2 == 72L);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(3.174802103936399d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1748021039363996d + "'", double1 == 3.1748021039363996d);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        double double1 = org.apache.commons.math.util.FastMath.log(104.9439511105971d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.653426408689451d + "'", double1 == 4.653426408689451d);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) 2.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.38905609893065d + "'", double1 == 6.38905609893065d);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-36.7368005696771d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) 53.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.756285754221072d + "'", double1 == 3.756285754221072d);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        long long2 = org.apache.commons.math.util.FastMath.min((-3L), (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3L) + "'", long2 == (-3L));
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        double double2 = org.apache.commons.math.util.FastMath.min((-1.219022125506721d), 0.4269587715167061d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.219022125506721d) + "'", double2 == (-1.219022125506721d));
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.47402420806417284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        double double2 = org.apache.commons.math.util.FastMath.min(1.0943643578893503d, 1.3246090892520057d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0943643578893503d + "'", double2 == 1.0943643578893503d);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.6726669944799356d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7378072223293735d + "'", double1 == 0.7378072223293735d);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.8745129512124437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3977072091439116d + "'", double1 == 2.3977072091439116d);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.5302764730926062d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1523647554462573d + "'", double1 == 1.1523647554462573d);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        double double2 = org.apache.commons.math.util.FastMath.min(104.94395111059707d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.7344807723571088E24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.316996876365737E12d + "'", double1 == 1.316996876365737E12d);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        double double1 = org.apache.commons.math.util.FastMath.sinh(7.737125245533627E25d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9046745947545269d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2723278394410604d + "'", double1 == 1.2723278394410604d);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.008837632613846286d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.008837747659931517d) + "'", double1 == (-0.008837747659931517d));
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9900590857598653d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.307876973266691d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 74.93583069052579d + "'", double1 == 74.93583069052579d);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.4188768353857124E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 35, 72L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 72L + "'", long2 == 72L);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        int int1 = org.apache.commons.math.util.FastMath.abs((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.5579004906280912d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7469273663670994d + "'", double1 == 0.7469273663670994d);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.4486454104648996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4486454104648996d + "'", double1 == 1.4486454104648996d);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        double double2 = org.apache.commons.math.util.FastMath.min(1.0030948458264688d, 3.434381731912222d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0030948458264688d + "'", double2 == 1.0030948458264688d);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.82485040608572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.3887906953856204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.4128308409485173d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15009016663239344d + "'", double1 == 0.15009016663239344d);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.21348878684812134d, 1.3235780930645504d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.21348878684812136d + "'", double2 == 0.21348878684812136d);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        int int2 = org.apache.commons.math.util.FastMath.max(53, 28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.32179921168174863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.492415024135951d) + "'", double1 == (-0.492415024135951d));
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.18367240047815075d), (double) 5L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.18367240047815073d) + "'", double2 == (-0.18367240047815073d));
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.752220392306203d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(71.81168591902457d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.474177595438071d + "'", double1 == 8.474177595438071d);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.3887317335324652d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0097613808780075d + "'", double1 == 4.0097613808780075d);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-1.5578545843443006d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.269017577653561d) + "'", double1 == (-2.269017577653561d));
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.4021802218490915d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16781824161186867d + "'", double1 == 0.16781824161186867d);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-6.843036868748689d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.8985248817088516d) + "'", double1 == (-1.8985248817088516d));
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 0, (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        double double2 = org.apache.commons.math.util.FastMath.max((-3.0461741978670857E-4d), (-0.40604869080352307d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.0461741978670857E-4d) + "'", double2 == (-3.0461741978670857E-4d));
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.4143028416180226d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.005202448750892189d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005188962767592056d + "'", double1 == 0.005188962767592056d);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(28.0d, 0.6080872397649995d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 27.999999999999996d + "'", double2 == 27.999999999999996d);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.986213958420301d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.33372300080313627d, 83.0153117485777d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.00401999578242418d + "'", double2 == 0.00401999578242418d);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-7.369139609590174E-249d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.369139609590174E-249d) + "'", double1 == (-7.369139609590174E-249d));
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.7090924659923779d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        float float2 = org.apache.commons.math.util.FastMath.max(1.0f, (-53.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        double double2 = org.apache.commons.math.util.FastMath.min(0.3524366883898337d, (double) 35L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3524366883898337d + "'", double2 == 0.3524366883898337d);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        double double1 = org.apache.commons.math.util.FastMath.tanh(57.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9946861854499426d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9639660340333815d + "'", double1 == 2.9639660340333815d);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.7469273663670994d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7469273663670996d + "'", double1 == 0.7469273663670996d);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.1046225788468806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9993832155237184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.260440365722204d + "'", double1 == 57.260440365722204d);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        double double1 = org.apache.commons.math.util.FastMath.exp((-100.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.720075976020836E-44d + "'", double1 == 3.720075976020836E-44d);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        double double2 = org.apache.commons.math.util.FastMath.pow(80.09972275101016d, 286.4788975654116d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.7800607355415555d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5766474848126442d + "'", double1 == 0.5766474848126442d);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 0L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        double double2 = org.apache.commons.math.util.FastMath.pow(192.21311052213554d, 103504.4889592901d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 0.2975000227598567d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(4.716325081321902d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.716325081321903d + "'", double1 == 4.716325081321903d);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        long long1 = org.apache.commons.math.util.FastMath.round((double) 53);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 53L + "'", long1 == 53L);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 100, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        long long2 = org.apache.commons.math.util.FastMath.max(2L, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9988961914845736d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.23253594375779d + "'", double1 == 57.23253594375779d);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.062364267144095646d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        double double1 = org.apache.commons.math.util.FastMath.sin((-47.34153258046857d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21592861063242869d + "'", double1 == 0.21592861063242869d);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        long long1 = org.apache.commons.math.util.FastMath.round(2.9982229502979694d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.11943352419502769d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 52L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 52.0f + "'", float1 == 52.0f);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 4, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        double double2 = org.apache.commons.math.util.FastMath.min(1.9867717342662448d, 17.247748258387592d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9867717342662448d + "'", double2 == 1.9867717342662448d);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.465566310769166E8d, 1.0996411683627738d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4655663107691658E8d + "'", double2 == 1.4655663107691658E8d);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.1938614780827772d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1938614780827772d + "'", double1 == 1.1938614780827772d);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8066370946516902d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0434062927185241d + "'", double1 == 1.0434062927185241d);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        int int2 = org.apache.commons.math.util.FastMath.max(52, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.11943352419502769d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.11887045430169285d) + "'", double1 == (-0.11887045430169285d));
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.7469280195077934d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8434298298328096d) + "'", double1 == (-0.8434298298328096d));
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        double double1 = org.apache.commons.math.util.FastMath.acosh(41.40763396801269d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.4164666005855215d + "'", double1 == 4.4164666005855215d);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.2574599505487548d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3104037125409256d + "'", double1 == 1.3104037125409256d);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5707963267948795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9171523356672716d + "'", double1 == 0.9171523356672716d);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.29899893506723685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3084198953324345d + "'", double1 == 0.3084198953324345d);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        double double2 = org.apache.commons.math.util.FastMath.atan2(75.09455583665425d, 1.4667411450004126E-10d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267929435d + "'", double2 == 1.5707963267929435d);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.2614950711954901d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        double double1 = org.apache.commons.math.util.FastMath.asinh(5.2437141131408894E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 53.00704927389939d + "'", double1 == 53.00704927389939d);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.6984400637458461d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        double double1 = org.apache.commons.math.util.FastMath.cosh(4.15912713462618d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.01562118716425d + "'", double1 == 32.01562118716425d);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        double double1 = org.apache.commons.math.util.FastMath.acos(57.29577951308238d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        double double1 = org.apache.commons.math.util.FastMath.floor(3.6237264565928684d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        long long1 = org.apache.commons.math.util.FastMath.round(0.0034800731177357003d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        long long1 = org.apache.commons.math.util.FastMath.round(1.0455256631001846d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.21348878684812134d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.211870765669079d + "'", double1 == 0.211870765669079d);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) 4L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6094379124341003d + "'", double1 == 1.6094379124341003d);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.05448755243389763d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9985159205421982d + "'", double1 == 0.9985159205421982d);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        long long2 = org.apache.commons.math.util.FastMath.max(57L, (long) (-3));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 57L + "'", long2 == 57L);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 53.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.206879716514544E22d + "'", double1 == 5.206879716514544E22d);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-3.380515006246586d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.709965532085809d + "'", double1 == 14.709965532085809d);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        double double1 = org.apache.commons.math.util.FastMath.asin(11013.232874703415d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        double double1 = org.apache.commons.math.util.FastMath.floor(57.29577951308236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.0d + "'", double1 == 57.0d);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.2648394832966439d, 6.938893903907228E-18d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2648394832966436d + "'", double2 == 1.2648394832966436d);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        double double1 = org.apache.commons.math.util.FastMath.cos((-1.506844020238002d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06390872240731825d + "'", double1 == 0.06390872240731825d);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 4, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 28L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.231285321457375E11d + "'", double1 == 7.231285321457375E11d);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.1189038211438946d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1189038211438946d + "'", double1 == 1.1189038211438946d);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.9668078739084816d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.405442597106097d) + "'", double1 == (-3.405442597106097d));
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.542740246052261d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2420709504904546d + "'", double1 == 1.2420709504904546d);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 28L, (float) 601302L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 601302.0f + "'", float2 == 601302.0f);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.82485040608572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.171806431125281d + "'", double1 == 1.171806431125281d);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.000027401317026d, 0.47381472041445105d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1283261188573166d + "'", double2 == 1.1283261188573166d);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.5476523162282666d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.1716150192074115d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8247892170023737d + "'", double1 == 0.8247892170023737d);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.7253825588523148d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.0030948458264688d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.47310111718266d + "'", double1 == 57.47310111718266d);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.158010543951033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4690168630587714d + "'", double1 == 1.4690168630587714d);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.32681535598557454d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        int int2 = org.apache.commons.math.util.FastMath.min(1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        double double2 = org.apache.commons.math.util.FastMath.min(1.5083775167989393d, 215.251057912766d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5083775167989393d + "'", double2 == 1.5083775167989393d);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.387778780781446E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.387778780781446E-17d + "'", double1 == 1.387778780781446E-17d);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9496962111038966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 100, 5L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, (-0.8554182836643193d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.4636456564559829d, 1.146128035678238d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.41438749389108315d + "'", double2 == 0.41438749389108315d);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.5367912817072857d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2701945463732761d) + "'", double1 == (-0.2701945463732761d));
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        double double1 = org.apache.commons.math.util.FastMath.asin((-1.219022125506721d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.4374744323806797d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8726212203028842d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1916485442408997d + "'", double1 == 1.1916485442408997d);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-1.1531011997348775d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-66.06783209628024d) + "'", double1 == (-66.06783209628024d));
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 28L, (float) 28L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 28.0f + "'", float2 == 28.0f);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) 39481480091340L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.890818211544746E11d + "'", double1 == 6.890818211544746E11d);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        float float2 = org.apache.commons.math.util.FastMath.max((float) ' ', (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        long long2 = org.apache.commons.math.util.FastMath.max((-1L), (long) 53);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 53L + "'", long2 == 53L);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.6645439359795198d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7834116559678173d) + "'", double1 == (-0.7834116559678173d));
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-4.632512904931237d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-265.4234379924486d) + "'", double1 == (-265.4234379924486d));
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        double double1 = org.apache.commons.math.util.FastMath.log10((-1.001441413311334d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.1032762973918335d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (-3));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3) + "'", int1 == (-3));
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        long long1 = org.apache.commons.math.util.FastMath.round((-1.8985248817088516d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-2L) + "'", long1 == (-2L));
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        long long1 = org.apache.commons.math.util.FastMath.abs(74L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 74L + "'", long1 == 74L);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 10, (-3L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3L) + "'", long2 == (-3L));
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        long long1 = org.apache.commons.math.util.FastMath.round(5.258625856460398d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        double double1 = org.apache.commons.math.util.FastMath.log(0.1924023244417261d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.6481666595255564d) + "'", double1 == (-1.6481666595255564d));
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.3851125268672118d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3671391507352896d) + "'", double1 == (-0.3671391507352896d));
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.472855967130635d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5725317062401747d + "'", double1 == 1.5725317062401747d);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.5777877754722899d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5461721541136804d) + "'", double1 == (-0.5461721541136804d));
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 100, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.4472512595643944d), (-0.9659700754028168d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        double double2 = org.apache.commons.math.util.FastMath.max(2.301071078740414d, 1.007253333954012d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.301071078740414d + "'", double2 == 2.301071078740414d);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.21348878684812134d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21189945982621552d + "'", double1 == 0.21189945982621552d);
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        long long1 = org.apache.commons.math.util.FastMath.round(1.570054860258358d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        long long2 = org.apache.commons.math.util.FastMath.max(2147483647L, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.0286185349173835d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        double double1 = org.apache.commons.math.util.FastMath.asin(9.307013259236443d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.25008839294063845d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.329009420707914d + "'", double1 == 14.329009420707914d);
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (short) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.1538784231553383E30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4676097652834482E15d + "'", double1 == 1.4676097652834482E15d);
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.41671114415975286d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9144250650001362d + "'", double1 == 0.9144250650001362d);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        double double1 = org.apache.commons.math.util.FastMath.sinh(27.935504743358095d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.779623299504136E11d + "'", double1 == 6.779623299504136E11d);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.4509000100090763d, 5.916079783099616d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.041911449206605d + "'", double2 == 9.041911449206605d);
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        double double2 = org.apache.commons.math.util.FastMath.min(1.542740246052261d, 2.449489742783178d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.542740246052261d + "'", double2 == 1.542740246052261d);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        double double1 = org.apache.commons.math.util.FastMath.signum(88.76920606279324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-53L), 57.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-53.0f) + "'", float2 == (-53.0f));
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        double double2 = org.apache.commons.math.util.FastMath.min(2.07532458034302d, 1.1672838871475524d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1672838871475524d + "'", double2 == 1.1672838871475524d);
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.47746469952801107d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        double double1 = org.apache.commons.math.util.FastMath.log1p(69.84482292460207d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.260491892536774d + "'", double1 == 4.260491892536774d);
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1477895.5237242084d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.467717607067357E7d + "'", double1 == 8.467717607067357E7d);
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) 57);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.6881171418161737E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.688117141816174E43d + "'", double1 == 2.688117141816174E43d);
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.0000305177333457d, 0.6890624663225461d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9674630275799633d + "'", double2 == 0.9674630275799633d);
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.3132616875182228d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(57.29577951308238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.569397566060484d + "'", double1 == 7.569397566060484d);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.724506964483035d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        double double1 = org.apache.commons.math.util.FastMath.ulp(3265.8594322456925d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.547473508864641E-13d + "'", double1 == 4.547473508864641E-13d);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.5569083308639295d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.272392748970048d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0836118071458325d + "'", double1 == 1.0836118071458325d);
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.005440211108893698d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3117011361997944d) + "'", double1 == (-0.3117011361997944d));
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.584491534932266d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) 601302L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 601302.0d + "'", double1 == 601302.0d);
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.7245474750742176d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.7659703323114561d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 43.886867273679584d + "'", double1 == 43.886867273679584d);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.9867717342662448d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.263703453882342d) + "'", double1 == (-2.263703453882342d));
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-15.942385152878742d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4194303.9999999413d) + "'", double1 == (-4194303.9999999413d));
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        double double1 = org.apache.commons.math.util.FastMath.acos(36.04365338911715d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 72, (long) (-53));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-53L) + "'", long2 == (-53L));
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        double double1 = org.apache.commons.math.util.FastMath.atanh(11013.232874703393d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        double double1 = org.apache.commons.math.util.FastMath.atan(58.00670561851055d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5535586481244579d + "'", double1 == 1.5535586481244579d);
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-1.598874411320368d), (-0.2030392510751841d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.69710910933251d) + "'", double2 == (-1.69710910933251d));
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 0, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(28.45884779991685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1630.5718687404037d + "'", double1 == 1630.5718687404037d);
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        double double1 = org.apache.commons.math.util.FastMath.signum(5557.690612768985d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-4.550646685718122d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        float float2 = org.apache.commons.math.util.FastMath.min(232.0f, (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '4', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        int int1 = org.apache.commons.math.util.FastMath.abs(4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        double double1 = org.apache.commons.math.util.FastMath.atanh(4.4164666005855215d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        long long2 = org.apache.commons.math.util.FastMath.max((-1L), 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.794078527423028d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.017513188772614d + "'", double1 == 1.017513188772614d);
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        int int2 = org.apache.commons.math.util.FastMath.min(97, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-3L), (float) 97L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.2490457723982544d, 0.013388602139994326d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5600776728471155d + "'", double2 == 1.5600776728471155d);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.8212977905419555E24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1790330313692486d + "'", double1 == 0.1790330313692486d);
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.0413759433029089E23d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 9223372036854775807L, 1477896.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1477896.0f + "'", float2 == 1477896.0f);
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        double double1 = org.apache.commons.math.util.FastMath.cosh(116618.90399762256d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        double double1 = org.apache.commons.math.util.FastMath.log1p(7.6035750265302235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1521778176391675d + "'", double1 == 2.1521778176391675d);
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        double double1 = org.apache.commons.math.util.FastMath.asin((-9.088615669432869d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.7580564974852393d), (-0.021171773984568765d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.021171773984568765d) + "'", double2 == (-0.021171773984568765d));
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.8003329149759787d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        int int1 = org.apache.commons.math.util.FastMath.abs(2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (short) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        int int2 = org.apache.commons.math.util.FastMath.min(32, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-1.2266354000930777d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2266354000930775d) + "'", double1 == (-1.2266354000930775d));
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.1092738450937532d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8371582714590907d + "'", double1 == 0.8371582714590907d);
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        double double2 = org.apache.commons.math.util.FastMath.min((-66.06783209628024d), 0.9980845732903537d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-66.06783209628024d) + "'", double2 == (-66.06783209628024d));
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        double double2 = org.apache.commons.math.util.FastMath.pow(231.58466047909457d, (double) 3.9481478E13f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.1531969697659333d, 0.5498622334799267d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.15319696976593333d + "'", double2 == 0.15319696976593333d);
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.2648394832966436d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.9985221050176076d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.621304236535399d + "'", double1 == 3.621304236535399d);
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9999946013485154d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.13360144349841713d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.012054337993946678d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(7.2638973976934574E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1936674.200214744d + "'", double1 == 1936674.200214744d);
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.06390872240731825d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3998097478732469d + "'", double1 == 0.3998097478732469d);
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.018833921198998405d), 0.30651527099946596d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.06136814014227283d) + "'", double2 == (-0.06136814014227283d));
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        double double1 = org.apache.commons.math.util.FastMath.log(1.4422495703074083d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36620409622270317d + "'", double1 == 0.36620409622270317d);
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.7568396789787606d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.44041151091558656d + "'", double1 == 0.44041151091558656d);
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.155615773557597E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.9668078739084816d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8577073882411156d) + "'", double1 == (-0.8577073882411156d));
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.25008839294063845d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2475522144038352d + "'", double1 == 0.2475522144038352d);
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.4403954360585147d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.30802495663275425d + "'", double1 == 0.30802495663275425d);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        int int2 = org.apache.commons.math.util.FastMath.max(52, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.3065152709994659d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.0137651267062167d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0137651267062169d + "'", double1 == 1.0137651267062169d);
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(14.329009420707914d, 2.3686469200204923d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 14.329009420707912d + "'", double2 == 14.329009420707912d);
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-47.34153258046857d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        double double1 = org.apache.commons.math.util.FastMath.floor((-1.055287372175112d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.03497003954460952d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.034365653331052945d) + "'", double1 == (-0.034365653331052945d));
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        double double1 = org.apache.commons.math.util.FastMath.log(1.3383347192042697E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.3877787807814457E-17d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.6548866146797762d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8092506500953682d + "'", double1 == 0.8092506500953682d);
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.0455256631001846d, 4.3777255673228614d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.23443699695760933d + "'", double2 == 0.23443699695760933d);
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        double double2 = org.apache.commons.math.util.FastMath.min(0.3084198953324345d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.8205149405557769d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6871254771677591d + "'", double1 == 0.6871254771677591d);
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.309274745959981d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8640917881917065d + "'", double1 == 0.8640917881917065d);
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        double double1 = org.apache.commons.math.util.FastMath.atanh(3.393331768257697d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 4.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        double double1 = org.apache.commons.math.util.FastMath.log(0.22469894983086625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4929937734516805d) + "'", double1 == (-1.4929937734516805d));
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.17062332315326462d), 62.94584746189076d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0027106300438728367d) + "'", double2 == (-0.0027106300438728367d));
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.6974747010141326d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.34266379734457d + "'", double1 == 2.34266379734457d);
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.7201927932561937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.896360940747447d + "'", double1 == 0.896360940747447d);
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.9999999999882881d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5707914869904152d) + "'", double1 == (-1.5707914869904152d));
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9704682670117347d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9704682670117347d + "'", double1 == 0.9704682670117347d);
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.1748021039363996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0554107498129334d + "'", double1 == 0.0554107498129334d);
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        double double1 = org.apache.commons.math.util.FastMath.log10(3036.676314193363d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.482398502009961d + "'", double1 == 3.482398502009961d);
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.005188962767592056d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.673617379884035E-19d + "'", double1 == 8.673617379884035E-19d);
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.5037324957145496d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1295788105004783d + "'", double1 == 1.1295788105004783d);
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.703530868239122d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.432697160980512d + "'", double1 == 7.432697160980512d);
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8539880479975237d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5471935699921758d + "'", double1 == 0.5471935699921758d);
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
        long long1 = org.apache.commons.math.util.FastMath.round(0.7401549043526567d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.7730965638572164d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7115221034297141d) + "'", double1 == (-0.7115221034297141d));
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        double double1 = org.apache.commons.math.util.FastMath.exp((-2.7249979868612266d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0655463346717593d + "'", double1 == 0.0655463346717593d);
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.5597919847479074d, 0.6189512067707561d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6982980140748426d + "'", double2 == 0.6982980140748426d);
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.2204460492503128E-16d, 41.40763396801269d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.362407451161307E-18d + "'", double2 == 5.362407451161307E-18d);
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.3433588908440404d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8318928232769873d + "'", double1 == 3.8318928232769873d);
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        double double1 = org.apache.commons.math.util.FastMath.log10(5.298342365610589d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7241400178893855d + "'", double1 == 0.7241400178893855d);
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.3774620981682702d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3690290042649213d + "'", double1 == 0.3690290042649213d);
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.005200861212658299d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0051873834444522435d + "'", double1 == 0.0051873834444522435d);
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 52L, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5423560824282998d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        double double1 = org.apache.commons.math.util.FastMath.tanh(100.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9171523356672745d, 22026.465794806718d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.163865159672914E-5d + "'", double2 == 4.163865159672914E-5d);
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.2949496123890058d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.29940278466098974d) + "'", double1 == (-0.29940278466098974d));
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.0030948458264688d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) 2147483647);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 21.487562597358306d + "'", double1 == 21.487562597358306d);
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        float float1 = org.apache.commons.math.util.FastMath.abs(32.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 32.0f + "'", float1 == 32.0f);
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        double double2 = org.apache.commons.math.util.FastMath.max(3.732511156817248d, (-77.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.732511156817248d + "'", double2 == 3.732511156817248d);
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.5037324957145496d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        double double1 = org.apache.commons.math.util.FastMath.atan(3.756285754221072d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.310610594469108d + "'", double1 == 1.310610594469108d);
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.009999500037496552d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009999333396659885d + "'", double1 == 0.009999333396659885d);
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.6691306779508364d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2323464040026078d + "'", double1 == 1.2323464040026078d);
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        int int2 = org.apache.commons.math.util.FastMath.max((int) 'a', 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-1.8985248817088516d), 1.7456418720467646d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8273263794480143d) + "'", double2 == (-0.8273263794480143d));
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.542524056185831d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-1.2130532941206642d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '#', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 32, (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        double double1 = org.apache.commons.math.util.FastMath.acos((-1.5574077246549023d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.4253120969346567d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4529592297810597d) + "'", double1 == (-0.4529592297810597d));
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        double double2 = org.apache.commons.math.util.FastMath.min(0.7958192892471013d, 0.69066269187734d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.69066269187734d + "'", double2 == 0.69066269187734d);
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        long long1 = org.apache.commons.math.util.FastMath.round(1.272392748970048d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-1.1752011936438014d), 0.46364760900080604d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.1752011936438012d) + "'", double2 == (-1.1752011936438012d));
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(57.29577951308242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.29577951308243d + "'", double1 == 57.29577951308243d);
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.598780889335082d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.6569847686310842d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7874899863726001d + "'", double1 == 0.7874899863726001d);
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.48271109896197417d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5240616266093142d) + "'", double1 == (-0.5240616266093142d));
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-3), (float) 57);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.3744449684274126E7d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.9283350632110237d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3682156880790792d + "'", double1 == 1.3682156880790792d);
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
        double double2 = org.apache.commons.math.util.FastMath.atan2(58.00670561851055d, 0.4374744323806797d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5632546790890485d + "'", double2 == 1.5632546790890485d);
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        double double1 = org.apache.commons.math.util.FastMath.sin(4.260491892536774d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8996203146905095d) + "'", double1 == (-0.8996203146905095d));
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) -1, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
        double double2 = org.apache.commons.math.util.FastMath.min(1.151665335034499d, 1.1716150192074115d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.151665335034499d + "'", double2 == 1.151665335034499d);
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1477895.5237242084d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-2.41862874504907d), 86.42366562500266d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.027978420033734935d) + "'", double2 == (-0.027978420033734935d));
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(9.0871877068532832E16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5860134523134308E15d + "'", double1 == 1.5860134523134308E15d);
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.4374744323806797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4676988647424297d + "'", double1 == 0.4676988647424297d);
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9649955887750582d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.624776077971336d + "'", double1 == 2.624776077971336d);
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.5409471841379443d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 88.28977010367272d + "'", double1 == 88.28977010367272d);
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9410106931720924d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4764016559700286d + "'", double1 == 1.4764016559700286d);
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.5715810788975264d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4102002216622384d + "'", double1 == 0.4102002216622384d);
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        double double1 = org.apache.commons.math.util.FastMath.floor(192.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 192.0d + "'", double1 == 192.0d);
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.23316784367214288d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.5597919847479074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5894902375914016d + "'", double1 == 0.5894902375914016d);
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.4529592297810597d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.42432845551724413d) + "'", double1 == (-0.42432845551724413d));
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        double double1 = org.apache.commons.math.util.FastMath.rint((-9.088615669432869d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9.0d) + "'", double1 == (-9.0d));
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '#', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
        int int1 = org.apache.commons.math.util.FastMath.round(28.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28 + "'", int1 == 28);
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
        double double1 = org.apache.commons.math.util.FastMath.tan((-3.620554677378945d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5192922514920658d) + "'", double1 == (-0.5192922514920658d));
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.7842626635876098d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1907909950860303d + "'", double1 == 2.1907909950860303d);
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.11914740892957598d), 0.8735346502596506d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.11914740892957598d) + "'", double2 == (-0.11914740892957598d));
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.6384917413123372d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.8414709848078965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.5766474848126442d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9561770880181973d + "'", double1 == 0.9561770880181973d);
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.3428524237259708d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2947960259678524d + "'", double1 == 0.2947960259678524d);
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        double double2 = org.apache.commons.math.util.FastMath.max(0.09983440995178777d, 19.071130515668326d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 19.071130515668326d + "'", double2 == 19.071130515668326d);
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
        double double2 = org.apache.commons.math.util.FastMath.max(1.272392748970048d, 0.3998097478732469d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.272392748970048d + "'", double2 == 1.272392748970048d);
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.01728624313179109d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5535092226515d + "'", double1 == 1.5535092226515d);
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.7834116559678173d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9218565439993888d) + "'", double1 == (-0.9218565439993888d));
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.8431391046438417d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9182260640190093d + "'", double1 == 0.9182260640190093d);
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.06981317007977318d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.5574077246549023d, 1.0003046638203843d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.557407724654902d + "'", double2 == 1.557407724654902d);
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
        int int2 = org.apache.commons.math.util.FastMath.min(4, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        double double1 = org.apache.commons.math.util.FastMath.signum(29.169558789096715d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.4032536613179892d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6681425958947582d + "'", double1 == 0.6681425958947582d);
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-1.4442923814189608d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.130364145417361d) + "'", double1 == (-1.130364145417361d));
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
        double double1 = org.apache.commons.math.util.FastMath.atanh(57.260440365722204d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-2.980984492908097d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9948635511998325d) + "'", double1 == (-0.9948635511998325d));
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.5409471841379443d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9951585358453275d + "'", double1 == 0.9951585358453275d);
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
        double double1 = org.apache.commons.math.util.FastMath.asin(14.778873676342487d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
        double double1 = org.apache.commons.math.util.FastMath.abs((-9.775996303178843d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.775996303178843d + "'", double1 == 9.775996303178843d);
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.0137651267062167d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0045674819155863d + "'", double1 == 1.0045674819155863d);
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.8342233605065064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6066211551353723d + "'", double1 == 0.6066211551353723d);
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.22665386569399096d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.723044407228643d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.4190581615792427d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3968271116979769d + "'", double1 == 0.3968271116979769d);
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
        long long2 = org.apache.commons.math.util.FastMath.max((-53L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        double double1 = org.apache.commons.math.util.FastMath.atan(9.293358726420639E30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.7593534431810433d, (-1.219022125506721d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7593534431810431d + "'", double2 == 0.7593534431810431d);
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3383347192042695E42d + "'", double1 == 1.3383347192042695E42d);
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.007253333954012d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1203709466539101d + "'", double1 == 0.1203709466539101d);
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.6921231068842162d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6234354400286537d + "'", double1 == 2.6234354400286537d);
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3978952727983707d + "'", double1 == 2.3978952727983707d);
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.06981317007977318d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2642218198404007d + "'", double1 == 0.2642218198404007d);
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.0003046638203843d, 0.196094775945863d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.000304663820384d + "'", double2 == 1.000304663820384d);
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        double double1 = org.apache.commons.math.util.FastMath.log(1.5416614449118216d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4328606952063188d + "'", double1 == 0.4328606952063188d);
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
        int int2 = org.apache.commons.math.util.FastMath.min((int) ' ', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.4009585690078399d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9063641612633266d + "'", double1 == 1.9063641612633266d);
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 100, (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.18367240047815073d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.762747174039086d, (-0.008837747656337245d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9950026437156599d + "'", double2 == 0.9950026437156599d);
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.29940278466098974d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2949496123890058d) + "'", double1 == (-0.2949496123890058d));
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
        double double1 = org.apache.commons.math.util.FastMath.cos((-6.810594032269465d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8641141481658993d + "'", double1 == 0.8641141481658993d);
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
        double double1 = org.apache.commons.math.util.FastMath.asinh(8.205696208681136d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.801668109017674d + "'", double1 == 2.801668109017674d);
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
        double double1 = org.apache.commons.math.util.FastMath.ulp(3.946997808922293d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 1, (-53));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.11831214619987152d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8884186928096095d + "'", double1 == 0.8884186928096095d);
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) 32.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.0d + "'", double1 == 32.0d);
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
        int int1 = org.apache.commons.math.util.FastMath.abs(28);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28 + "'", int1 == 28);
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.2210278799953218d, 2.4219132975121505d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.22102787999532184d + "'", double2 == 0.22102787999532184d);
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 1477896.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
        double double1 = org.apache.commons.math.util.FastMath.log(9.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1972245773362196d + "'", double1 == 2.1972245773362196d);
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.40767170372406053d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9180464167538389d + "'", double1 == 0.9180464167538389d);
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.4908493554131868d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.45489029526695746d) + "'", double1 == (-0.45489029526695746d));
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.5445244839004441d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.253350360695029d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (short) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 100.0f + "'", float1 == 100.0f);
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.20787957635076193d, 1.343298655311511d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.20787957635076196d + "'", double2 == 0.20787957635076196d);
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.007402863214769922d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0073755965079926366d + "'", double1 == 0.0073755965079926366d);
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.1972245773362196d, 0.8693235746902677d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.194048843227285d + "'", double2 == 1.194048843227285d);
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) 1477896L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1477896.0d + "'", double1 == 1477896.0d);
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) 5.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.06436165309773824d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.06431722677489707d) + "'", double1 == (-0.06431722677489707d));
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
        double double2 = org.apache.commons.math.util.FastMath.max(1630.5718687404037d, 0.29899893506723685d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1630.5718687404037d + "'", double2 == 1630.5718687404037d);
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
        long long1 = org.apache.commons.math.util.FastMath.round(1.3383347192042695E42d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.04275721153934543d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0436982222538896d) + "'", double1 == (-0.0436982222538896d));
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 100, 72);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72 + "'", int2 == 72);
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.00875022181505636d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.00878861691279533d + "'", double1 == 0.00878861691279533d);
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
        double double1 = org.apache.commons.math.util.FastMath.log1p(89.95751709680616d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.510392552420711d + "'", double1 == 4.510392552420711d);
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-25.170419727719406d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-25.170419727719402d) + "'", double1 == (-25.170419727719402d));
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.0943643578893503d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9465506639355938d + "'", double1 == 0.9465506639355938d);
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-1.5707963267948966d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-90.0d) + "'", double1 == (-90.0d));
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-1.219022125506721d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2190221255067208d) + "'", double1 == (-1.2190221255067208d));
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.693889518756616d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5003710313659192d) + "'", double1 == (-0.5003710313659192d));
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
        int int2 = org.apache.commons.math.util.FastMath.max(57, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57 + "'", int2 == 57);
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.171806431125281d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2278182064756322d + "'", double1 == 2.2278182064756322d);
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
        double double1 = org.apache.commons.math.util.FastMath.log1p(231.58466047909457d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.4492542898406535d + "'", double1 == 5.4492542898406535d);
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.8212977905419555E24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5634006723940185E8d + "'", double1 == 1.5634006723940185E8d);
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9988961914845736d, 1.5467250970042679d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9988961914845736d + "'", double2 == 0.9988961914845736d);
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
        double double1 = org.apache.commons.math.util.FastMath.acosh(116618.90399762256d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.35981384720823d + "'", double1 == 12.35981384720823d);
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9816339318384565d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8683270054592955d + "'", double1 == 0.8683270054592955d);
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.2947960259678524d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9999468636254574d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7615718391387468d + "'", double1 == 0.7615718391387468d);
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.9387628649611217d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4739638638162964d + "'", double1 == 1.4739638638162964d);
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 72L, 286.00000000000006d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.24662339848588008d + "'", double2 == 0.24662339848588008d);
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.192092895507818E-7d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.4415943645925386d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 139.89305237407842d + "'", double1 == 139.89305237407842d);
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.49284442857018573d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49284442857018573d + "'", double1 == 0.49284442857018573d);
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 39481480091340L, (float) 97L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.5019419896466208d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(9.306852817378905d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.050713493164985d + "'", double1 == 3.050713493164985d);
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.5297515540876877d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.143630746302462d + "'", double1 == 1.143630746302462d);
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(9.860761315262648E-32d, 0.0078125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.86076131526265E-32d + "'", double2 == 9.86076131526265E-32d);
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.559512775607752d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9999468636254574d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5572257200654551d + "'", double1 == 1.5572257200654551d);
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
        double double2 = org.apache.commons.math.util.FastMath.min((-1.1183599281602883d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.1183599281602883d) + "'", double2 == (-1.1183599281602883d));
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.7330957838811774d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2011784219913253d + "'", double1 == 1.2011784219913253d);
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 4L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
        float float2 = org.apache.commons.math.util.FastMath.max((-1.0f), 9.223372E18f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
        double double1 = org.apache.commons.math.util.FastMath.acos(286.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }
}

