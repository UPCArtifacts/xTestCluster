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
        double double1 = org.apache.commons.math.util.FastMath.log10(0.017455064928217585d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7580785313863723d) + "'", double1 == (-1.7580785313863723d));
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        long long1 = org.apache.commons.math.util.FastMath.round(0.15617144518908815d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        double double1 = org.apache.commons.math.util.FastMath.log(1.3042395695680862d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.26562016562412466d + "'", double1 == 0.26562016562412466d);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        double double1 = org.apache.commons.math.util.FastMath.log(11.89617103759529d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.476216586794516d + "'", double1 == 2.476216586794516d);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.6632456843634444d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.580519347575949d + "'", double1 == 0.580519347575949d);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        double double1 = org.apache.commons.math.util.FastMath.log10(3279.9256224971386d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5158639955088393d + "'", double1 == 3.5158639955088393d);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.552713678800501E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.52587890625E-5d + "'", double1 == 1.52587890625E-5d);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.05362981780341266d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.053655559099401555d) + "'", double1 == (-0.053655559099401555d));
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.939216676724527d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.939216676724527d + "'", double1 == 0.939216676724527d);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(18936.71296522655d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18936.712965226554d + "'", double1 == 18936.712965226554d);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.2561874369417856d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 129.27001792720287d + "'", double1 == 129.27001792720287d);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.5585053606381855d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6248693519093275d + "'", double1 == 0.6248693519093275d);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9999092042625952d, 0.8339178207386727d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999242832456278d + "'", double2 == 0.9999242832456278d);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 100, 9.223372E18f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.0928900516588147d, 92.95177303495919d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3852.5788319472163d + "'", double2 == 3852.5788319472163d);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.5287499284227858d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1430755383155013d + "'", double1 == 1.1430755383155013d);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.5872139151569291d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-33.64487900984524d) + "'", double1 == (-33.64487900984524d));
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        double double1 = org.apache.commons.math.util.FastMath.log10(4.211267075873332d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6244127849728577d + "'", double1 == 0.6244127849728577d);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.4333079051049607d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4639620792590624d) + "'", double1 == (-0.4639620792590624d));
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.7084604840787458d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8914668753193978d + "'", double1 == 0.8914668753193978d);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.6633689306847952d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9957182156111833d + "'", double1 == 0.9957182156111833d);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        double double2 = org.apache.commons.math.util.FastMath.max((-2.9024129480722718E-12d), 123.44001497540268d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 123.44001497540268d + "'", double2 == 123.44001497540268d);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.383182435886996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5437559508831038d + "'", double1 == 1.5437559508831038d);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        double double1 = org.apache.commons.math.util.FastMath.sinh(68.98400770596488d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.553484793848369E29d + "'", double1 == 4.553484793848369E29d);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5607966601082315d + "'", double1 == 1.5607966601082315d);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.2565251565229352d, 7.028730419947964d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.036480464389695044d + "'", double2 == 0.036480464389695044d);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.4486454104648998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.025283632106517222d + "'", double1 == 0.025283632106517222d);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        double double1 = org.apache.commons.math.util.FastMath.signum((-1.5424779506349352E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        double double1 = org.apache.commons.math.util.FastMath.log(0.6872483617622163d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.37505953569776607d) + "'", double1 == (-0.37505953569776607d));
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        int int2 = org.apache.commons.math.util.FastMath.max(97, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.1344439571520295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        double double1 = org.apache.commons.math.util.FastMath.log1p(3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4260624389053682d + "'", double1 == 1.4260624389053682d);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.8414709848078966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.5231317788620231d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2813888969383246d) + "'", double1 == (-0.2813888969383246d));
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-1.3348404966530283d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.03538849883217154d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4511378595928281d) + "'", double1 == (-1.4511378595928281d));
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8052085614665847d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8950841726012685d + "'", double1 == 0.8950841726012685d);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.3862943611198906d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.26562016562412466d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3042395695680862d + "'", double1 == 0.3042395695680862d);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        double double1 = org.apache.commons.math.util.FastMath.sin(6559.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6015665163590591d) + "'", double1 == (-0.6015665163590591d));
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 5L, (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.61512051684126d + "'", double1 == 4.61512051684126d);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        double double1 = org.apache.commons.math.util.FastMath.rint(4.295214085529645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.1906899454435433d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7966806685070602d + "'", double1 == 1.7966806685070602d);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.5702200276960676d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.914747959740454d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        long long1 = org.apache.commons.math.util.FastMath.round(0.1472859194620699d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.5063656411097587d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.8940757456435277d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.5534301753820028d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.4593566380802732d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8975275723469739d + "'", double1 == 0.8975275723469739d);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.723945865132188d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.672173436193738d + "'", double1 == 0.672173436193738d);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(3.2710663101885897d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8086089434116457d + "'", double1 == 1.8086089434116457d);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.6649237511146353d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6649237511146353d + "'", double1 == 1.6649237511146353d);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.7601526319909638d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 43.55353759884347d + "'", double1 == 43.55353759884347d);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 12.238292298814303d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        double double2 = org.apache.commons.math.util.FastMath.max(0.745427304692527d, (-0.40517925701617413d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.745427304692527d + "'", double2 == 0.745427304692527d);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.45961320728596883d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7717278381943499d + "'", double1 == 0.7717278381943499d);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9131871133554458d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7400532113272699d + "'", double1 == 0.7400532113272699d);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9999999999999837d, 0.9747047669009431d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999999999999837d + "'", double2 == 0.9999999999999837d);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        double double2 = org.apache.commons.math.util.FastMath.min(0.978364500953377d, 123.44001497540268d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.978364500953377d + "'", double2 == 0.978364500953377d);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.019529180206536243d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.019526698037128812d + "'", double1 == 0.019526698037128812d);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.1752012000048542d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1752012000048544d + "'", double1 == 1.1752012000048544d);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-1), 3280L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3280L + "'", long2 == 3280L);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        double double1 = org.apache.commons.math.util.FastMath.asin(9.089390493111633E-243d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.089390493111633E-243d + "'", double1 == 9.089390493111633E-243d);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.914747959740454d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.732113092200869d + "'", double1 == 1.732113092200869d);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-1.635447929274436d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9268335185771767d) + "'", double1 == (-0.9268335185771767d));
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.7328327111140163d, 33.66561760358879d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.853019787182933E-5d + "'", double2 == 2.853019787182933E-5d);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) 2005L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.609701103711254d + "'", double1 == 12.609701103711254d);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.1574928494310313d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.075868416411148d + "'", double1 == 1.075868416411148d);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 3);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.0f + "'", float1 == 3.0f);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        double double1 = org.apache.commons.math.util.FastMath.log(1.773775678340353d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5731104262529237d + "'", double1 == 0.5731104262529237d);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        int int2 = org.apache.commons.math.util.FastMath.min(4, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.653029967135041E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5243548967072378E-29d + "'", double1 == 2.5243548967072378E-29d);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        int int1 = org.apache.commons.math.util.FastMath.round(6559.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6559 + "'", int1 == 6559);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        int int2 = org.apache.commons.math.util.FastMath.min((-1), (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        double double1 = org.apache.commons.math.util.FastMath.acos(138.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.791759469228055d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        double double2 = org.apache.commons.math.util.FastMath.max(0.999900971001246d, 1.791759469228055d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.791759469228055d + "'", double2 == 1.791759469228055d);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        float float2 = org.apache.commons.math.util.FastMath.min(32.0f, (float) 5);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.04219811538317294d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.938893903907228E-18d + "'", double1 == 6.938893903907228E-18d);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 97, 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.1598987305185837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.159898730518584d + "'", double1 == 1.159898730518584d);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        double double1 = org.apache.commons.math.util.FastMath.log((-7.47197233734299E-43d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9896517787489434d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6902974904623846d + "'", double1 == 1.6902974904623846d);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.07270966677774478d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4173791190844389d + "'", double1 == 0.4173791190844389d);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        long long2 = org.apache.commons.math.util.FastMath.min(10L, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        double double2 = org.apache.commons.math.util.FastMath.min(1.5900247258946039d, 0.15491406168101263d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.15491406168101263d + "'", double2 == 0.15491406168101263d);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.946229138796503d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        double double2 = org.apache.commons.math.util.FastMath.min((-2.9024129480722718E-12d), (-0.9730337692042502d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9730337692042502d) + "'", double2 == (-0.9730337692042502d));
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        double double1 = org.apache.commons.math.util.FastMath.asin(22.24871540768837d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        double double1 = org.apache.commons.math.util.FastMath.exp(3749630.166340615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.5506433159893342d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1574546139504494d + "'", double1 == 1.1574546139504494d);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        double double2 = org.apache.commons.math.util.FastMath.min(0.15339215657878688d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.6391335074803455d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7994582587479758d + "'", double1 == 0.7994582587479758d);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        double double1 = org.apache.commons.math.util.FastMath.sinh(99.99999999999997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080294E43d + "'", double1 == 1.3440585709080294E43d);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.2577689529157872d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.26363402215252263d + "'", double1 == 0.26363402215252263d);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.6696927901138922d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7337950365886181d) + "'", double1 == (-0.7337950365886181d));
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.319776824715853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9149994957367079d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.425609362311924d + "'", double1 == 52.425609362311924d);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        long long2 = org.apache.commons.math.util.FastMath.max(100L, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        double double1 = org.apache.commons.math.util.FastMath.log10(51.999999999999986d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.716003343634799d + "'", double1 == 1.716003343634799d);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        int int1 = org.apache.commons.math.util.FastMath.abs((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.1906899454435433d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0911874016151137d + "'", double1 == 1.0911874016151137d);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.3067775938384247d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3067775938384247d + "'", double1 == 1.3067775938384247d);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        double double2 = org.apache.commons.math.util.FastMath.min(0.6632456843634444d, (-0.5545968900472498d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5545968900472498d) + "'", double2 == (-0.5545968900472498d));
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 4.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.6177859350239399d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.2233932393493425d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08756607619334543d + "'", double1 == 0.08756607619334543d);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.020695062331941d, (-0.8414709848078965d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.020695062331940996d + "'", double2 == 0.020695062331940996d);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        int int2 = org.apache.commons.math.util.FastMath.max(1, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-3.8933129033597975d), 4.644483341943227d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.893312903359797d) + "'", double2 == (-3.893312903359797d));
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.3588470982042273d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9091342957581129d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9534853411343631d + "'", double1 == 0.9534853411343631d);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.5160141294778328d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5968949588006862d + "'", double1 == 0.5968949588006862d);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-5.377465624848392d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-108.2341682164588d) + "'", double1 == (-108.2341682164588d));
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        double double1 = org.apache.commons.math.util.FastMath.cos(3.748066027288565E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6018150242418875d) + "'", double1 == (-0.6018150242418875d));
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.7281588344338537d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3973007232145152d + "'", double1 == 1.3973007232145152d);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        float float2 = org.apache.commons.math.util.FastMath.min(9.223372E18f, (float) 2L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        double double2 = org.apache.commons.math.util.FastMath.max(0.38625675609943166d, 5.267831587699267d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.267831587699267d + "'", double2 == 5.267831587699267d);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.4403028592460305d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.40310504119931384d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5160141294778328d) + "'", double1 == (-0.5160141294778328d));
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(7.573807232972011d, 3279.9256224971386d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.573807232972012d + "'", double2 == 7.573807232972012d);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        double double1 = org.apache.commons.math.util.FastMath.log(8.207110122769961d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1050008667091253d + "'", double1 == 2.1050008667091253d);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.8524543594406487d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.0086972736692794d, 52.83789332827162d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.03799792737079887d + "'", double2 == 0.03799792737079887d);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.4161468365471424d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.34041658757742116d) + "'", double1 == (-0.34041658757742116d));
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        long long1 = org.apache.commons.math.util.FastMath.abs(2147483647L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2147483647L + "'", long1 == 2147483647L);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 13.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.0d + "'", double1 == 13.0d);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 4, (float) 5);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.7059602000404158d), 1.0038398873153356d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7059602000404158d) + "'", double2 == (-0.7059602000404158d));
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.0584580199563727d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7850729780863955d + "'", double1 == 0.7850729780863955d);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.36020687119376654d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.37712359523644484d + "'", double1 == 0.37712359523644484d);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        float float2 = org.apache.commons.math.util.FastMath.min(5.0f, 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-18.714973875118524d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-18.71497387511852d) + "'", double1 == (-18.71497387511852d));
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.03505120341912517d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.4711276743037347d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.35414242816297d + "'", double1 == 4.35414242816297d);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.5063656411097587d), 3.7581226324091723d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.8402864822065015d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.043904921102047d + "'", double1 == 1.043904921102047d);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.7992447670407306E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.015371184736752325d, 19.508135772975283d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.2270816216740666E-36d + "'", double2 == 4.2270816216740666E-36d);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 2.7755575615628914E-17d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        long long1 = org.apache.commons.math.util.FastMath.round(2.652900463031381d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 100, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        long long2 = org.apache.commons.math.util.FastMath.max(2L, 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.4422495703074083d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 82.63481338317098d + "'", double1 == 82.63481338317098d);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 13L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 13 + "'", int1 == 13);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.0590011172720796d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.4944906593359573d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9970901348720806d + "'", double1 == 0.9970901348720806d);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        long long1 = org.apache.commons.math.util.FastMath.round(2.8005374133426096E22d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        double double1 = org.apache.commons.math.util.FastMath.log(1.1598987305185835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1483327000302118d + "'", double1 == 0.1483327000302118d);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 2005);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2005.0f + "'", float1 == 2005.0f);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        float float2 = org.apache.commons.math.util.FastMath.max(3.9481478E13f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.9481478E13f + "'", float2 == 3.9481478E13f);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 2005, (-0.8988151898170457d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8988151898170457d) + "'", double2 == (-0.8988151898170457d));
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.557153674151176d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.557153674151176d + "'", double1 == 1.557153674151176d);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.5108256237659906d), 1.2118662346608502d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5108256237659905d) + "'", double2 == (-0.5108256237659905d));
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        double double1 = org.apache.commons.math.util.FastMath.abs((-1.374629511804778d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.374629511804778d + "'", double1 == 1.374629511804778d);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.46664446687876304d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5037517052427105d + "'", double1 == 0.5037517052427105d);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        int int2 = org.apache.commons.math.util.FastMath.max(52, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.7082073213196237d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6162130215185162d + "'", double1 == 0.6162130215185162d);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.8809094881441943E7d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        double double1 = org.apache.commons.math.util.FastMath.acosh(5.267831587699267d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.345632762712187d + "'", double1 == 2.345632762712187d);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.702048418162471d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-7.47197233734299E-43d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.47197233734299E-43d) + "'", double1 == (-7.47197233734299E-43d));
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.0611064769287215d, 2.2873554892516914d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4343536696908125d + "'", double2 == 0.4343536696908125d);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        double double1 = org.apache.commons.math.util.FastMath.signum(10.000000004122308d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.999999931632527d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8813735386764384d + "'", double1 == 0.8813735386764384d);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        double double1 = org.apache.commons.math.util.FastMath.rint(4.493423335506387d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.8657694832396586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3987810008982051d + "'", double1 == 1.3987810008982051d);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.23107092469448914d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8039745794464932d + "'", double1 == 1.8039745794464932d);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9988731032017402d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        long long1 = org.apache.commons.math.util.FastMath.round(77.9699955054746d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 78L + "'", long1 == 78L);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        long long1 = org.apache.commons.math.util.FastMath.round(1.009088214590764d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        double double1 = org.apache.commons.math.util.FastMath.sin(2453.0356784138967d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.521138217286205d + "'", double1 == 0.521138217286205d);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.238693057170856d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1751698710092806d + "'", double1 == 1.1751698710092806d);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.002644512574656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.538075138574733d + "'", double1 == 0.538075138574733d);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        long long2 = org.apache.commons.math.util.FastMath.max(3280L, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3280L + "'", long2 == 3280L);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.4343536696908125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0958239871017827d + "'", double1 == 1.0958239871017827d);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.3322863883917696d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.338726674323305d + "'", double1 == 0.338726674323305d);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.8988151898170457d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.012097700501686678d, 5.298342365610589d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.01209770050168668d + "'", double2 == 0.01209770050168668d);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.038991025401791155d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9992399462688565d + "'", double1 == 0.9992399462688565d);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 'a', (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        double double1 = org.apache.commons.math.util.FastMath.sinh(199.0929391679245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4585955050518922E86d + "'", double1 == 1.4585955050518922E86d);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.5706326162312105d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5706326162312105d + "'", double1 == 1.5706326162312105d);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.652900463031381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2955214994351725d + "'", double1 == 1.2955214994351725d);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.26562016562412466d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5153835131473694d + "'", double1 == 0.5153835131473694d);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        float float2 = org.apache.commons.math.util.FastMath.max((float) '#', (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.25096172890041585d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.25643891956011705d) + "'", double1 == (-0.25643891956011705d));
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.3815006871452328d, 2.466704833957299d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.15344430643143228d + "'", double2 == 0.15344430643143228d);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9149994957367079d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        double double1 = org.apache.commons.math.util.FastMath.tanh(76.75804819986975d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.8809094881441943E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.725290298461914E-9d + "'", double1 == 3.725290298461914E-9d);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.13025531550365874d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.463079837504604d + "'", double1 == 7.463079837504604d);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-1.6112949659561453d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9795918367346939d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.663368930684795d + "'", double1 == 2.663368930684795d);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-1.5534301753820028d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.4342944819032518d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        int int2 = org.apache.commons.math.util.FastMath.min(2005, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        double double2 = org.apache.commons.math.util.FastMath.min(4.644298430695373d, (double) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.644298430695373d + "'", double2 == 4.644298430695373d);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.06571071737855876d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.06561630304380342d) + "'", double1 == (-0.06561630304380342d));
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.3314536537354545E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3314536537354545E42d + "'", double1 == 1.3314536537354545E42d);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        long long2 = org.apache.commons.math.util.FastMath.max(39481480091341L, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 39481480091341L + "'", long2 == 39481480091341L);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 0.5231317788620231d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.85186683311429d, 123.44001497540268d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0808165501200012E33d + "'", double2 == 1.0808165501200012E33d);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.7123889803846899d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9455557866374292d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.23929808358597d + "'", double1 == 1.23929808358597d);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.2847130244570347d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.2118662346608502d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.665374127698126d + "'", double1 == 2.665374127698126d);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.38818646476211366d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-22.241446094972964d) + "'", double1 == (-22.241446094972964d));
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 78962960182681L, 13.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.8962957E13f + "'", float2 == 7.8962957E13f);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.770170914020331d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013442018252748935d + "'", double1 == 0.013442018252748935d);
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2005L, (float) 1L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2005.0f + "'", float2 == 2005.0f);
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        long long2 = org.apache.commons.math.util.FastMath.max(2147483647L, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        double double1 = org.apache.commons.math.util.FastMath.tan(129.27001792720287d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5013401197718211d + "'", double1 == 0.5013401197718211d);
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.37287332357954484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 21.3640677341238d + "'", double1 == 21.3640677341238d);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.174240018845341d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06975687732553194d + "'", double1 == 0.06975687732553194d);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        double double1 = org.apache.commons.math.util.FastMath.ulp(7.197874973409682E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.860761315262648E-32d + "'", double1 == 9.860761315262648E-32d);
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        long long1 = org.apache.commons.math.util.FastMath.round(0.5287499284227858d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        long long2 = org.apache.commons.math.util.FastMath.min(52L, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.7798578119818305d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.25967827695144485d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2539945895800115d) + "'", double1 == (-0.2539945895800115d));
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.614234282244587d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2705251993740962d + "'", double1 == 1.2705251993740962d);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        double double1 = org.apache.commons.math.util.FastMath.sin((-1.6011050627869963d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9995407254211099d) + "'", double1 == (-0.9995407254211099d));
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 1, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        double double2 = org.apache.commons.math.util.FastMath.pow(27.289917197127753d, (-0.8135279227115655d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.06788473056620924d + "'", double2 == 0.06788473056620924d);
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        double double2 = org.apache.commons.math.util.FastMath.max(4.281623811241125E59d, 1.7992447670407306E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.281623811241125E59d + "'", double2 == 4.281623811241125E59d);
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        double double1 = org.apache.commons.math.util.FastMath.asinh(100.00000000000323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.298342365610621d + "'", double1 == 5.298342365610621d);
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.8402235152809697d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        long long2 = org.apache.commons.math.util.FastMath.max((-1L), 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9989523981229464d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.525018934125927d + "'", double1 == 1.525018934125927d);
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5293379817723d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        double double1 = org.apache.commons.math.util.FastMath.sinh(4.61512051684126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 50.49504950495051d + "'", double1 == 50.49504950495051d);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.23606797749979d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 128.11725781509188d + "'", double1 == 128.11725781509188d);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.1088821403655396d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.053034728945603d + "'", double1 == 1.053034728945603d);
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.5708920866202177d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.841419241695424d + "'", double1 == 0.841419241695424d);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '#', 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.0701878462127337d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07024548853517748d + "'", double1 == 0.07024548853517748d);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.40517925701617413d), 1.6633689306847952d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        double double2 = org.apache.commons.math.util.FastMath.min((-18.714973875118524d), (-108.2341682164588d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-108.2341682164588d) + "'", double2 == (-108.2341682164588d));
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 6559);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6559 + "'", int1 == 6559);
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        int int2 = org.apache.commons.math.util.FastMath.min((-1), 13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.219379580148095d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.1483650317358706d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5293917690144072d + "'", double1 == 0.5293917690144072d);
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        float float2 = org.apache.commons.math.util.FastMath.min(6559.0f, (float) 32);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 35.0f, 0.9410822616658444d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9410822616658444d + "'", double2 == 0.9410822616658444d);
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        double double1 = org.apache.commons.math.util.FastMath.log(0.06589908747968856d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.719630684615244d) + "'", double1 == (-2.719630684615244d));
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.8012298966644482d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5884697075000961d + "'", double1 == 0.5884697075000961d);
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        float float2 = org.apache.commons.math.util.FastMath.max(100.0f, (float) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(6.17645782688986E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.176457826889861E-4d + "'", double1 == 6.176457826889861E-4d);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.8259963669851865d), 1.0046874060688094d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6880974875514901d) + "'", double2 == (-0.6880974875514901d));
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        double double1 = org.apache.commons.math.util.FastMath.signum((-2.7131306085479543d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.6975340031826088d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.835185011349347d + "'", double1 == 0.835185011349347d);
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.1574457518571803d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        double double1 = org.apache.commons.math.util.FastMath.ulp(18936.712965226554d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.637978807091713E-12d + "'", double1 == 3.637978807091713E-12d);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.1344439571520295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4359440230218101d + "'", double1 == 1.4359440230218101d);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.7418580584129385d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9052605736700935d + "'", double1 == 0.9052605736700935d);
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.7949001954883153d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 102.84020584868686d + "'", double1 == 102.84020584868686d);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.1189396031849521d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        double double1 = org.apache.commons.math.util.FastMath.rint((-2.3784176643307493d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-23.03580664819349d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.552713678800501E-15d + "'", double1 == 3.552713678800501E-15d);
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(10.571645135349055d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 605.7106487655087d + "'", double1 == 605.7106487655087d);
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.11918867249339503d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.11975629384575985d) + "'", double1 == (-0.11975629384575985d));
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.6576913458149568d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.706142388099178d + "'", double1 == 0.706142388099178d);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8052085614665847d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6347692319286742d + "'", double1 == 0.6347692319286742d);
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        long long2 = org.apache.commons.math.util.FastMath.min(51L, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        double double1 = org.apache.commons.math.util.FastMath.atanh(5.551115123125783E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.3216115088844413E-11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3216115088844413E-11d + "'", double1 == 1.3216115088844413E-11d);
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        double double2 = org.apache.commons.math.util.FastMath.atan2(3.465735902799727d, 0.04746076762388862d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5571028999260903d + "'", double2 == 1.5571028999260903d);
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-108.2341682164588d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6201.3610379120855d) + "'", double1 == (-6201.3610379120855d));
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.047442967903742035d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04746078367186166d + "'", double1 == 0.04746078367186166d);
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.6310781936490033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        double double1 = org.apache.commons.math.util.FastMath.atanh(4.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) -1, (float) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        int int2 = org.apache.commons.math.util.FastMath.max(0, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.4148895340330202d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4415030395451661d + "'", double1 == 0.4415030395451661d);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 10, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.8574443553084918d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7561726915035568d + "'", double1 == 0.7561726915035568d);
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.09808293184436E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.098082962629895E-4d + "'", double1 == 2.098082962629895E-4d);
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        int int2 = org.apache.commons.math.util.FastMath.min(1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 6559L, 97.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6559.0f + "'", float2 == 6559.0f);
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        double double2 = org.apache.commons.math.util.FastMath.atan2(Double.POSITIVE_INFINITY, 0.9999999999999645d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.2705251993740962d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2296263093844666d + "'", double1 == 3.2296263093844666d);
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        double double1 = org.apache.commons.math.util.FastMath.signum((-5.377465624848392d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) -1, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.22906366042640255d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0263499943255474d + "'", double1 == 1.0263499943255474d);
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.6931463954650435d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5265885704492408d + "'", double1 == 0.5265885704492408d);
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.4124704496626688d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        double double2 = org.apache.commons.math.util.FastMath.max(0.7418580584129385d, 3749630.166340615d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3749630.166340615d + "'", double2 == 3749630.166340615d);
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        int int2 = org.apache.commons.math.util.FastMath.min(2147483647, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.27746265011900656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2774626501190066d + "'", double1 == 0.2774626501190066d);
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.7668694253884004E30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        double double2 = org.apache.commons.math.util.FastMath.min(573.0d, 24.19638901669072d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 24.19638901669072d + "'", double2 == 24.19638901669072d);
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9379924444723454d, 0.7373603731804845d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9538957088157914d + "'", double2 == 0.9538957088157914d);
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.6105647004975029d, 4.281623811241125E59d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.610564700497503d + "'", double2 == 0.610564700497503d);
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.284009411162292d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.25643891956011705d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2592587853135318d) + "'", double1 == (-0.2592587853135318d));
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.1598987305185835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.9976952979536658d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.007017107983878209d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.03011360650845773d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3111149807940147d + "'", double1 == 0.3111149807940147d);
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.8816651612292111d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9588880213738242d + "'", double1 == 0.9588880213738242d);
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.912801418045861d, 8.692617836018588d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1046253673776422d + "'", double2 == 0.1046253673776422d);
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        double double1 = org.apache.commons.math.util.FastMath.log(4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5271796258079011d + "'", double1 == 1.5271796258079011d);
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.26736318179044144d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.5293917690144072d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.697899279538019d + "'", double1 == 0.697899279538019d);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.04144646964819275d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.041434612619286396d + "'", double1 == 0.041434612619286396d);
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.1050008667091253d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4896307927473578d + "'", double1 == 1.4896307927473578d);
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.5534301753820028d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.577493508324686d + "'", double1 == 57.577493508324686d);
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        int int2 = org.apache.commons.math.util.FastMath.max((int) 'a', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.5337813023984244d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(3.9318256327243257d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.931825632724326d + "'", double1 == 3.931825632724326d);
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(43.55353759884347d, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 43.55353759884348d + "'", double2 == 43.55353759884348d);
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.630949191594277d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2770862114964194d + "'", double1 == 1.2770862114964194d);
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9917933885729989d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.1004404717609073d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9506431907144248d + "'", double1 == 0.9506431907144248d);
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.6622841166519441d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.939216676724527d + "'", double1 == 0.939216676724527d);
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        double double1 = org.apache.commons.math.util.FastMath.log(0.8058302155599485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.21588220933551652d) + "'", double1 == (-0.21588220933551652d));
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.1485728867362902d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.220446049250313E-16d, 1.5066117617628818d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.473801085060013E-16d + "'", double2 == 1.473801085060013E-16d);
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 35.0f, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.019526698037128812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.019524216624750866d + "'", double1 == 0.019524216624750866d);
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9999092042625952d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.000000000000485d + "'", double1 == 5.000000000000485d);
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        double double1 = org.apache.commons.math.util.FastMath.asin(564.2988711233952d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.01745240643728351d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        double double2 = org.apache.commons.math.util.FastMath.atan2(128.11725781509188d, 10.049875621120892d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4925138349840654d + "'", double2 == 1.4925138349840654d);
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        double double1 = org.apache.commons.math.util.FastMath.acos((-2.3784176643307493d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(503.55674565883726d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.955780749541316d + "'", double1 == 7.955780749541316d);
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5972229600067989d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.5681875589916088d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5681875589916089d + "'", double1 == 0.5681875589916089d);
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.13355056135114907d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1343531595693342d + "'", double1 == 0.1343531595693342d);
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.11918867249339503d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11918867249339503d + "'", double1 == 0.11918867249339503d);
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.219379580148095d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0861389180081439d + "'", double1 == 0.0861389180081439d);
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.33144561670275613d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.49297772472673135d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.123994463510342d + "'", double1 == 1.123994463510342d);
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
        double double1 = org.apache.commons.math.util.FastMath.sinh(7.217373703740946d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 681.4521151915139d + "'", double1 == 681.4521151915139d);
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.012097700501686678d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5586983311819098d + "'", double1 == 1.5586983311819098d);
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        long long1 = org.apache.commons.math.util.FastMath.round(7.573807232972011d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 8L + "'", long1 == 8L);
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.27244342785294634d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2691808962207932d) + "'", double1 == (-0.2691808962207932d));
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.9318256327243257d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 51.0d + "'", double1 == 51.0d);
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.14728591946206993d, 2.0951332666770965d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.01807952103938486d + "'", double2 == 0.01807952103938486d);
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9990391188952762d, 7.38905609893065d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.13439029099843006d + "'", double2 == 0.13439029099843006d);
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        double double1 = org.apache.commons.math.util.FastMath.exp(4.574710978503383d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.467829725531415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16667567850160245d + "'", double1 == 0.16667567850160245d);
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        double double1 = org.apache.commons.math.util.FastMath.asinh(4.594700892207039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.229687871848033d + "'", double1 == 2.229687871848033d);
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        double double1 = org.apache.commons.math.util.FastMath.log1p(4.605170185988091d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7236894193081453d + "'", double1 == 1.7236894193081453d);
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        float float2 = org.apache.commons.math.util.FastMath.max(32.0f, 52.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5095237688959358E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.50952377462876E-4d + "'", double1 == 1.50952377462876E-4d);
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.4248349501142077d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4009957838586076d + "'", double1 == 0.4009957838586076d);
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.5585053606381855d, 2.0867705308894857d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.26151182221334535d + "'", double2 == 0.26151182221334535d);
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        double double1 = org.apache.commons.math.util.FastMath.asin(76.75804819986975d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        double double1 = org.apache.commons.math.util.FastMath.signum(5.551115123125784E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.1760939939322341d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7775315238017034d + "'", double1 == 0.7775315238017034d);
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.23606797749979d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.356469016601148d + "'", double1 == 8.356469016601148d);
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        float float1 = org.apache.commons.math.util.FastMath.abs(7.8962957E13f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.8962957E13f + "'", float1 == 7.8962957E13f);
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        double double2 = org.apache.commons.math.util.FastMath.max(0.6199770987338742d, 0.02048526137339397d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6199770987338742d + "'", double2 == 0.6199770987338742d);
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        int int1 = org.apache.commons.math.util.FastMath.abs(13);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 13 + "'", int1 == 13);
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.4896307927473578d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.6388749269043887d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8943483995140633d + "'", double1 == 1.8943483995140633d);
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.99836867862969d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7845818370481663d + "'", double1 == 0.7845818370481663d);
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.9960122203732344d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8393096933013352d) + "'", double1 == (-0.8393096933013352d));
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.1194710708535681d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0071451610978088d + "'", double1 == 1.0071451610978088d);
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        int int2 = org.apache.commons.math.util.FastMath.max((int) 'a', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.999999931632527d, 8.692617836018588d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.11453663798776123d + "'", double2 == 0.11453663798776123d);
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.4173791190844389d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.17453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1763382298382675d + "'", double1 == 0.1763382298382675d);
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) -1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
        long long2 = org.apache.commons.math.util.FastMath.min(36L, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9795918367346937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2023756855670975d + "'", double1 == 0.2023756855670975d);
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.705146651282202d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.851124705208869d + "'", double1 == 0.851124705208869d);
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
        double double2 = org.apache.commons.math.util.FastMath.min(0.8362763531273804d, 1.4585955050518922E86d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8362763531273804d + "'", double2 == 0.8362763531273804d);
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        long long1 = org.apache.commons.math.util.FastMath.round(6.890818211544855E11d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 689081821154L + "'", long1 == 689081821154L);
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.24769059955591424d, 3.3554432E7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.24769059955591427d + "'", double2 == 0.24769059955591427d);
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.1763382298382675d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17633822983826752d + "'", double1 == 0.17633822983826752d);
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.46517735014659645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.086961379713775d + "'", double1 == 1.086961379713775d);
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.19334632705655572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1958111284153483d + "'", double1 == 0.1958111284153483d);
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.4333079051049607d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4626307887385793d) + "'", double1 == (-0.4626307887385793d));
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
        float float2 = org.apache.commons.math.util.FastMath.max(35.0f, (float) 8L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.8479780433329283E-10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8479780433329283E-10d + "'", double1 == 1.8479780433329283E-10d);
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1735.209878559419d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.459459785700431d + "'", double1 == 7.459459785700431d);
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-22.241446094972964d), (-0.9992790497916413d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.6156948231154247d) + "'", double2 == (-1.6156948231154247d));
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.8704401477824153d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.764612681954403d + "'", double1 == 0.764612681954403d);
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 97L, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.016112503727829505d), 19.781104616480253d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.016112503727829505d) + "'", double2 == (-0.016112503727829505d));
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
        double double1 = org.apache.commons.math.util.FastMath.atanh(38.8629167984213d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.3376337436860346d, 0.5707963267948968d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1674689322429517d + "'", double2 == 1.1674689322429517d);
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-2.5922362574545064d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.04524305768215654d) + "'", double1 == (-0.04524305768215654d));
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.739146853975915d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.883764179245988d) + "'", double1 == (-5.883764179245988d));
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.3440585709083352E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.4210854715202004E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.142219984546603E-13d + "'", double1 == 8.142219984546603E-13d);
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9734594443576854d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5124299859921386d + "'", double1 == 1.5124299859921386d);
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.020693600382622544d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.684163941897155d) + "'", double1 == (-1.684163941897155d));
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9562562360485877d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9088714301767988d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        double double1 = org.apache.commons.math.util.FastMath.sinh(6.241434156324286E213d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.20637502874300212d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.20349421473032764d) + "'", double1 == (-0.20349421473032764d));
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
        double double1 = org.apache.commons.math.util.FastMath.rint((-3.092409887937381d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.0d) + "'", double1 == (-3.0d));
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 6559L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6559 + "'", int1 == 6559);
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.7616311154793817d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9535608805502648d + "'", double1 == 0.9535608805502648d);
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        double double1 = org.apache.commons.math.util.FastMath.exp(96.99484522385717d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3314536537354545E42d + "'", double1 == 1.3314536537354545E42d);
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9795918367346937d, 0.9995920864606948d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9795918367346937d + "'", double2 == 0.9795918367346937d);
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.027066513565235144d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        double double1 = org.apache.commons.math.util.FastMath.floor((-108.2341682164588d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-109.0d) + "'", double1 == (-109.0d));
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        double double1 = org.apache.commons.math.util.FastMath.acos(6.938893903907228E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.1574928494310313d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7689468296853795d + "'", double1 == 0.7689468296853795d);
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
        double double2 = org.apache.commons.math.util.FastMath.max(1.525018934125927d, 1735.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1735.0d + "'", double2 == 1735.0d);
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
        double double2 = org.apache.commons.math.util.FastMath.max(0.5496008503596722d, 1.614234282244587d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.614234282244587d + "'", double2 == 1.614234282244587d);
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) 7872L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.914747959740454d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4284564432169993d + "'", double1 == 1.4284564432169993d);
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.4333079051049607d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
        double double1 = org.apache.commons.math.util.FastMath.ceil(7872.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7872.0d + "'", double1 == 7872.0d);
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.22906366042640255d, (double) 7872L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.22906366042640258d + "'", double2 == 0.22906366042640258d);
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.6783712618582197d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5904595247658336d + "'", double1 == 0.5904595247658336d);
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
        int int2 = org.apache.commons.math.util.FastMath.min(4, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.14836503173587057d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1599362326291829d + "'", double1 == 1.1599362326291829d);
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.174240018845341d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0549995938530339d + "'", double1 == 1.0549995938530339d);
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.06214609673410902d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06222628822952982d + "'", double1 == 0.06222628822952982d);
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.5507969934215644d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.998064336484882d + "'", double1 == 0.998064336484882d);
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.8005374133426096E22d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.5607088415259998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5607088415259998d + "'", double1 == 1.5607088415259998d);
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9596936803142382d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9863798950554904d + "'", double1 == 0.9863798950554904d);
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.9995407254211099d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.685862315671209d) + "'", double1 == (-7.685862315671209d));
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.04147022652343259d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.025283632106517222d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.6310781936490033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0208063722335754d + "'", double1 == 1.0208063722335754d);
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 10, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.8860316424407535E45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.23886037395044873d, 0.5681875589916088d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.23886037395044876d + "'", double2 == 0.23886037395044876d);
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.149497948085797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.58054943433846d + "'", double1 == 8.58054943433846d);
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9142246332006481d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.3118919046891928d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7219410057229039d + "'", double1 == 1.7219410057229039d);
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(7.046745412134694E21d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.394489509276126E10d + "'", double1 == 8.394489509276126E10d);
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(38.8629167984213d, (-0.9231784609934363d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 38.862916798421296d + "'", double2 == 38.862916798421296d);
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
        double double1 = org.apache.commons.math.util.FastMath.log(1.5703334748399476d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4512880011622596d + "'", double1 == 0.4512880011622596d);
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
        int int2 = org.apache.commons.math.util.FastMath.min(3, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.993222846126381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.949874371066198d + "'", double1 == 9.949874371066198d);
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2, (float) 5L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
        double double1 = org.apache.commons.math.util.FastMath.floor(6558.851092551817d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6558.0d + "'", double1 == 6558.0d);
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.723945865132188d, 1.5574075654456325d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.604651599722822d + "'", double2 == 0.604651599722822d);
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.1752011936438014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9227673888116062d + "'", double1 == 0.9227673888116062d);
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
        double double1 = org.apache.commons.math.util.FastMath.tanh(7.930067261567154E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.345632762712187d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6995992123661955d) + "'", double1 == (-0.6995992123661955d));
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
        double double1 = org.apache.commons.math.util.FastMath.asinh(4.211267075873332d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.144718287100234d + "'", double1 == 2.144718287100234d);
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.14728591946206993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.011408233318727529d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
        int int2 = org.apache.commons.math.util.FastMath.max(6559, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6559 + "'", int2 == 6559);
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.728323488481854d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.48271759369001654d + "'", double1 == 0.48271759369001654d);
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.003031968853450674d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0030319595627053245d + "'", double1 == 0.0030319595627053245d);
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
        double double1 = org.apache.commons.math.util.FastMath.rint(33.66561760358879d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 34.0d + "'", double1 == 34.0d);
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.7992447670407303E-4d, 0.41934812792152054d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7992447670407306E-4d + "'", double2 == 1.7992447670407306E-4d);
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.1760939939322343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8262159668530399d + "'", double1 == 0.8262159668530399d);
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
        double double1 = org.apache.commons.math.util.FastMath.log(0.1489074174955618d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.90443052525043d) + "'", double1 == (-1.90443052525043d));
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.1884117453587528d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9823029524291397d + "'", double1 == 0.9823029524291397d);
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.047460767623888615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04742516418921198d + "'", double1 == 0.04742516418921198d);
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.04539243181516313d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.7177916798535343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 0L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.01030818285411862d, 4.615120516841259d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.010308182854118622d + "'", double2 == 0.010308182854118622d);
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
        double double2 = org.apache.commons.math.util.FastMath.atan2(51.68668337796996d, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        double double1 = org.apache.commons.math.util.FastMath.abs(3.9588076367332294d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9588076367332294d + "'", double1 == 3.9588076367332294d);
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.331951496713014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.129830963909753d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9043400555523963d + "'", double1 == 0.9043400555523963d);
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
        double double2 = org.apache.commons.math.util.FastMath.max(0.1936227590745503d, 0.48885097713844194d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.48885097713844194d + "'", double2 == 0.48885097713844194d);
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
        long long1 = org.apache.commons.math.util.FastMath.round((double) 10L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
        double double1 = org.apache.commons.math.util.FastMath.log1p(12.609701103711254d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6107828549021033d + "'", double1 == 2.6107828549021033d);
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
        int int2 = org.apache.commons.math.util.FastMath.min((int) 'a', 2005);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.6388749269043887d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8943483995140632d + "'", double1 == 0.8943483995140632d);
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.6419693473089224d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49589634295642904d + "'", double1 == 0.49589634295642904d);
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(4.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.000000000000001d + "'", double1 == 4.000000000000001d);
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.3383347192042695E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.69314718055995d + "'", double1 == 97.69314718055995d);
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9857874761787422d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 56.4814618818951d + "'", double1 == 56.4814618818951d);
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.5574077246549503d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5574077246549505d + "'", double1 == 1.5574077246549505d);
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
        int int2 = org.apache.commons.math.util.FastMath.max(1, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.015371184793963343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015489929088311694d + "'", double1 == 0.015489929088311694d);
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.38195407365429795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.32349849299466304d + "'", double1 == 0.32349849299466304d);
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.13881569933980162d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5177811015637935d + "'", double1 == 0.5177811015637935d);
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
        double double2 = org.apache.commons.math.util.FastMath.min(6.176459005007259E-4d, 4.2270816216740666E-36d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.2270816216740666E-36d + "'", double2 == 4.2270816216740666E-36d);
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.0918040996853897d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9448225075237339d + "'", double1 == 0.9448225075237339d);
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.756742458327018d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.983070082218447d + "'", double1 == 2.983070082218447d);
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.02717745857346494d, 0.015489929088311694d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0527617447411117d + "'", double2 == 1.0527617447411117d);
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.25967827695144485d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.5370437824787192d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 30.77034214977244d + "'", double1 == 30.77034214977244d);
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 5, (float) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
        double double1 = org.apache.commons.math.util.FastMath.ulp(74.68585461772224d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
        double double1 = org.apache.commons.math.util.FastMath.signum(5792.618751480198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.27726145677245667d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.5440211074304587d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1516653330585762d + "'", double1 == 1.1516653330585762d);
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.0071451610978088d, 1.6929693744344998d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.007145161097809d + "'", double2 == 1.007145161097809d);
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.1650486009423269d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16657228212058228d + "'", double1 == 0.16657228212058228d);
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.0051059437697842d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.575038585598328d + "'", double1 == 1.575038585598328d);
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0030319595627053245d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(8.512599360064637d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0418354108384595d + "'", double1 == 2.0418354108384595d);
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
        long long1 = org.apache.commons.math.util.FastMath.abs(52L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 52L + "'", long1 == 52L);
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
        float float2 = org.apache.commons.math.util.FastMath.max(2.0f, (float) 51L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 51.0f + "'", float2 == 51.0f);
    }
}

