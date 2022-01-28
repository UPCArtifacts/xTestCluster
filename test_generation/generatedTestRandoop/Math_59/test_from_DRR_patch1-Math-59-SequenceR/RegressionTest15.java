import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest15 {

    public static boolean debug = false;

    @Test
    public void test7501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7501");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.5942976368321509d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.023499146756074504d) + "'", double1 == (-0.023499146756074504d));
    }

    @Test
    public void test7502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7502");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.09950404679582d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09934057491960102d + "'", double1 == 0.09934057491960102d);
    }

    @Test
    public void test7503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7503");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.10369438987766068d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4669152025129495d + "'", double1 == 1.4669152025129495d);
    }

    @Test
    public void test7504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7504");
        int int2 = org.apache.commons.math.util.FastMath.max(0, 102);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
    }

    @Test
    public void test7505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7505");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.6747464171883842d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9635349941081834d + "'", double1 == 1.9635349941081834d);
    }

    @Test
    public void test7506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7506");
        double double1 = org.apache.commons.math.util.FastMath.rint(4.669392297463842d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test7507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7507");
        long long2 = org.apache.commons.math.util.FastMath.max(4L, (long) 102);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 102L + "'", long2 == 102L);
    }

    @Test
    public void test7508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7508");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(14.329009420707914d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.329009420707916d + "'", double1 == 14.329009420707916d);
    }

    @Test
    public void test7509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7509");
        long long1 = org.apache.commons.math.util.FastMath.round(97.00000000000001d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 97L + "'", long1 == 97L);
    }

    @Test
    public void test7510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7510");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.7348529557280805d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7348529557280806d + "'", double1 == 0.7348529557280806d);
    }

    @Test
    public void test7511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7511");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, 53.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test7512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7512");
        double double1 = org.apache.commons.math.util.FastMath.acos(164.79860560666518d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7513");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 57L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 57 + "'", int1 == 57);
    }

    @Test
    public void test7514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7514");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.19484471582527388d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.19484471582527385d) + "'", double1 == (-0.19484471582527385d));
    }

    @Test
    public void test7515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7515");
        double double1 = org.apache.commons.math.util.FastMath.rint((-9.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9.0d) + "'", double1 == (-9.0d));
    }

    @Test
    public void test7516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7516");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.13766929481533965d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1481164331866891d) + "'", double1 == (-0.1481164331866891d));
    }

    @Test
    public void test7517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7517");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.520684332357967d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1386464735462236d + "'", double1 == 1.1386464735462236d);
    }

    @Test
    public void test7518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7518");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.250656177740729d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7519");
        double double1 = org.apache.commons.math.util.FastMath.acosh(4.8104773809653505d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2529606289011888d + "'", double1 == 2.2529606289011888d);
    }

    @Test
    public void test7520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7520");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.19484471582527385d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.19361419144913797d) + "'", double1 == (-0.19361419144913797d));
    }

    @Test
    public void test7521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7521");
        double double2 = org.apache.commons.math.util.FastMath.max(2.193245818431283d, 9.712293689529174E-39d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.193245818431283d + "'", double2 == 2.193245818431283d);
    }

    @Test
    public void test7522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7522");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 97L, 32.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test7523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7523");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.6677728501812283d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.94988978444572d + "'", double1 == 1.94988978444572d);
    }

    @Test
    public void test7524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7524");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.008837747656337245d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000390531460073d + "'", double1 == 1.0000390531460073d);
    }

    @Test
    public void test7525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7525");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-2.7249979868612266d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.047560186980945586d) + "'", double1 == (-0.047560186980945586d));
    }

    @Test
    public void test7526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7526");
        float float2 = org.apache.commons.math.util.FastMath.max(89.0f, (float) 39481480091340L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.9481478E13f + "'", float2 == 3.9481478E13f);
    }

    @Test
    public void test7527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7527");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.1676411246422755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8625825676333084d + "'", double1 == 0.8625825676333084d);
    }

    @Test
    public void test7528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7528");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.5707963267948681d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 89.99999999999837d + "'", double1 == 89.99999999999837d);
    }

    @Test
    public void test7529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7529");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.017505519291455614d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017504625230579923d + "'", double1 == 0.017504625230579923d);
    }

    @Test
    public void test7530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7530");
        int int2 = org.apache.commons.math.util.FastMath.max(53, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
    }

    @Test
    public void test7531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7531");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.141928933339286d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-8.131928871134688d) + "'", double1 == (-8.131928871134688d));
    }

    @Test
    public void test7532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7532");
        double double2 = org.apache.commons.math.util.FastMath.max(9.712293689529172E-39d, (-0.047560186980945586d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.712293689529172E-39d + "'", double2 == 9.712293689529172E-39d);
    }

    @Test
    public void test7533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7533");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.09950404679582d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test7534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7534");
        float float2 = org.apache.commons.math.util.FastMath.max(1248.0f, (float) 1477896);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1477896.0f + "'", float2 == 1477896.0f);
    }

    @Test
    public void test7535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7535");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.21317875147664192d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2147970821614511d + "'", double1 == 0.2147970821614511d);
    }

    @Test
    public void test7536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7536");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.5707952637376876d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 940683.1462539841d + "'", double1 == 940683.1462539841d);
    }

    @Test
    public void test7537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7537");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.454505008613144d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test7538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7538");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(14.709965532085809d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 842.8189417714292d + "'", double1 == 842.8189417714292d);
    }

    @Test
    public void test7539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7539");
        double double1 = org.apache.commons.math.util.FastMath.acos((-3.046174103647121E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5711009442099724d + "'", double1 == 1.5711009442099724d);
    }

    @Test
    public void test7540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7540");
        long long1 = org.apache.commons.math.util.FastMath.round(0.6090693194205808d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test7541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7541");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.1620035212715816d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7904755456289917d) + "'", double1 == (-0.7904755456289917d));
    }

    @Test
    public void test7542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7542");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.9218565439993888d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3183345225215068d) + "'", double1 == (-1.3183345225215068d));
    }

    @Test
    public void test7543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7543");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.3933489534882026d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.950103995115168d + "'", double1 == 10.950103995115168d);
    }

    @Test
    public void test7544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7544");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.7035740325184427d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.43193826644873456d + "'", double1 == 0.43193826644873456d);
    }

    @Test
    public void test7545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7545");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.002596984843338d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7546");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-14.148409796207115d), 0.04134068757158039d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-14.148409796207114d) + "'", double2 == (-14.148409796207114d));
    }

    @Test
    public void test7547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7547");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test7548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7548");
        double double1 = org.apache.commons.math.util.FastMath.cos(1833.4649444186343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3387904745834194d + "'", double1 == 0.3387904745834194d);
    }

    @Test
    public void test7549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7549");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8092506500953682d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9005163012544152d + "'", double1 == 0.9005163012544152d);
    }

    @Test
    public void test7550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7550");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.0522257274488631d, (-0.8945584950807156d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.052225727448863d + "'", double2 == 1.052225727448863d);
    }

    @Test
    public void test7551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7551");
        double double1 = org.apache.commons.math.util.FastMath.log1p(16.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.833213344056216d + "'", double1 == 2.833213344056216d);
    }

    @Test
    public void test7552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7552");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(147.41315910257657d, (-2.269017577653561d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 147.41315910257654d + "'", double2 == 147.41315910257654d);
    }

    @Test
    public void test7553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7553");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.2249009368704327d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.224900936870433d + "'", double1 == 2.224900936870433d);
    }

    @Test
    public void test7554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7554");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.008798582499187173d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test7555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7555");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-100.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.298342365610589d) + "'", double1 == (-5.298342365610589d));
    }

    @Test
    public void test7556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7556");
        long long1 = org.apache.commons.math.util.FastMath.round(1.0253512046806867d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test7557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7557");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 101L, (float) 3);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 101.0f + "'", float2 == 101.0f);
    }

    @Test
    public void test7558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7558");
        double double1 = org.apache.commons.math.util.FastMath.log(1.539809006499305d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4316583869805062d + "'", double1 == 0.4316583869805062d);
    }

    @Test
    public void test7559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7559");
        double double1 = org.apache.commons.math.util.FastMath.cosh(7.840596973007444d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1270.861056852593d + "'", double1 == 1270.861056852593d);
    }

    @Test
    public void test7560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7560");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test7561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7561");
        double double1 = org.apache.commons.math.util.FastMath.ceil(3.58351893845611d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test7562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7562");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.559512775607752d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.227327990780888d + "'", double1 == 1.227327990780888d);
    }

    @Test
    public void test7563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7563");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.011800076512800236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011800350358700291d + "'", double1 == 0.011800350358700291d);
    }

    @Test
    public void test7564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7564");
        long long2 = org.apache.commons.math.util.FastMath.max(9L, (long) (-2));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9L + "'", long2 == 9L);
    }

    @Test
    public void test7565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7565");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.2261911708835183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.021401073190801822d + "'", double1 == 0.021401073190801822d);
    }

    @Test
    public void test7566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7566");
        double double1 = org.apache.commons.math.util.FastMath.sinh(55.603735851147455d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.036645264905108E23d + "'", double1 == 7.036645264905108E23d);
    }

    @Test
    public void test7567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7567");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9704682670117347d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6391800109847143d + "'", double1 == 1.6391800109847143d);
    }

    @Test
    public void test7568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7568");
        double double1 = org.apache.commons.math.util.FastMath.acos((-1.0125173861454009d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7569");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.9649955887750582d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test7570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7570");
        double double1 = org.apache.commons.math.util.FastMath.sin((-2.9971422632833347E7d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.38854868851818014d) + "'", double1 == (-0.38854868851818014d));
    }

    @Test
    public void test7571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7571");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.3809848803456371d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3718349129179599d + "'", double1 == 0.3718349129179599d);
    }

    @Test
    public void test7572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7572");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9446562348733084d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7573");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.279394493926661d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7574");
        double double1 = org.apache.commons.math.util.FastMath.tanh(15.020183597142925d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999998203d + "'", double1 == 0.9999999999998203d);
    }

    @Test
    public void test7575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7575");
        double double2 = org.apache.commons.math.util.FastMath.min(232.0d, (-0.8646647167633873d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8646647167633873d) + "'", double2 == (-0.8646647167633873d));
    }

    @Test
    public void test7576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7576");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.7776740307447068d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.916079783099615d + "'", double1 == 5.916079783099615d);
    }

    @Test
    public void test7577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7577");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.146128035678238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2114912846884023d + "'", double1 == 2.2114912846884023d);
    }

    @Test
    public void test7578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7578");
        long long2 = org.apache.commons.math.util.FastMath.max(2L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test7579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7579");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.270493131269137d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test7580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7580");
        double double1 = org.apache.commons.math.util.FastMath.sinh(43.42944819032519d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6319486988467287E18d + "'", double1 == 3.6319486988467287E18d);
    }

    @Test
    public void test7581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7581");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.09191694304343966d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.08781909063097872d) + "'", double1 == (-0.08781909063097872d));
    }

    @Test
    public void test7582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7582");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test7583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7583");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 100, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test7584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7584");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.3092866533194534d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3092866533194534d + "'", double1 == 1.3092866533194534d);
    }

    @Test
    public void test7585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7585");
        long long2 = org.apache.commons.math.util.FastMath.min(9223372036854775807L, (long) 232);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 232L + "'", long2 == 232L);
    }

    @Test
    public void test7586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7586");
        double double1 = org.apache.commons.math.util.FastMath.acos(198.99499987499382d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7587");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9144250650001362d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5538901022684188d + "'", double1 == 1.5538901022684188d);
    }

    @Test
    public void test7588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7588");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.0864361697580084E27d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7589");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(5.260052243696693d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 301.3787935821397d + "'", double1 == 301.3787935821397d);
    }

    @Test
    public void test7590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7590");
        double double2 = org.apache.commons.math.util.FastMath.min(0.11943352419502769d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test7591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7591");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.5837567576054801d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 33.44679847303543d + "'", double1 == 33.44679847303543d);
    }

    @Test
    public void test7592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7592");
        long long2 = org.apache.commons.math.util.FastMath.max(232L, (long) 4);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 232L + "'", long2 == 232L);
    }

    @Test
    public void test7593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7593");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.4963334177617679d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.496333417761768d + "'", double1 == 0.496333417761768d);
    }

    @Test
    public void test7594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7594");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.05235987755982989d, 1.1920928955078125E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707940500651734d + "'", double2 == 1.5707940500651734d);
    }

    @Test
    public void test7595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7595");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.262669278697344d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7596");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.07682653184743575d, (-0.29940278466098974d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.890412634681452d + "'", double2 == 2.890412634681452d);
    }

    @Test
    public void test7597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7597");
        double double1 = org.apache.commons.math.util.FastMath.tanh(9.860761315262648E-32d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.860761315262648E-32d + "'", double1 == 9.860761315262648E-32d);
    }

    @Test
    public void test7598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7598");
        long long1 = org.apache.commons.math.util.FastMath.round((double) 3L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test7599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7599");
        double double1 = org.apache.commons.math.util.FastMath.log(0.7740840138843887d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2560748662127301d) + "'", double1 == (-0.2560748662127301d));
    }

    @Test
    public void test7600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7600");
        long long2 = org.apache.commons.math.util.FastMath.min(39481480091340L, (-2L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test7601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7601");
        long long2 = org.apache.commons.math.util.FastMath.max(3L, (long) 969);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 969L + "'", long2 == 969L);
    }

    @Test
    public void test7602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7602");
        long long1 = org.apache.commons.math.util.FastMath.round(4.031845492717505E74d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test7603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7603");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.44041151091558656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.42729008767944754d + "'", double1 == 0.42729008767944754d);
    }

    @Test
    public void test7604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7604");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.1238746832737802E29d, 0.9122545643872476d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test7605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7605");
        double double1 = org.apache.commons.math.util.FastMath.cosh(29.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.965667148572021E12d + "'", double1 == 1.965667148572021E12d);
    }

    @Test
    public void test7606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7606");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.7166094064727634d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test7607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7607");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.0027106267244845546d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5735069568387792d + "'", double1 == 1.5735069568387792d);
    }

    @Test
    public void test7608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7608");
        double double1 = org.apache.commons.math.util.FastMath.atanh(3.124144993981348d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7609");
        double double1 = org.apache.commons.math.util.FastMath.abs(181.9027613448098d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 181.9027613448098d + "'", double1 == 181.9027613448098d);
    }

    @Test
    public void test7610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7610");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9999998508398553d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.841470904216317d + "'", double1 == 0.841470904216317d);
    }

    @Test
    public void test7611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7611");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.15009016663239344d, 41.40763396801269d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.15009016663239347d + "'", double2 == 0.15009016663239347d);
    }

    @Test
    public void test7612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7612");
        double double1 = org.apache.commons.math.util.FastMath.rint(6.115016634173588d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.0d + "'", double1 == 6.0d);
    }

    @Test
    public void test7613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7613");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.6707095703362789d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test7614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7614");
        double double1 = org.apache.commons.math.util.FastMath.log(1630.5718687404037d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.396686071988984d + "'", double1 == 7.396686071988984d);
    }

    @Test
    public void test7615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7615");
        double double1 = org.apache.commons.math.util.FastMath.rint(3.9481478479872E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9481478479872E13d + "'", double1 == 3.9481478479872E13d);
    }

    @Test
    public void test7616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7616");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) 89);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.464745095584537d + "'", double1 == 4.464745095584537d);
    }

    @Test
    public void test7617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7617");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5860134523134298E15d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7618");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.23269263081791292d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7619");
        double double2 = org.apache.commons.math.util.FastMath.pow(10.55522688394848d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test7620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7620");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 1, 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test7621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7621");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.7621186826519104d, 2.635637153201499E14d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7621186826519106d + "'", double2 == 1.7621186826519106d);
    }

    @Test
    public void test7622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7622");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.5715810788975262d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8142538948245024d + "'", double1 == 3.8142538948245024d);
    }

    @Test
    public void test7623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7623");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 3, (float) 4L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test7624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7624");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-1.5496763660156136d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7625");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.948148009134063E13d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7626");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 100, 1477896L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test7627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7627");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test7628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7628");
        long long1 = org.apache.commons.math.util.FastMath.round((-3.9672999628447583d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-4L) + "'", long1 == (-4L));
    }

    @Test
    public void test7629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7629");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.3248393855056821d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9242248883668087d + "'", double1 == 0.9242248883668087d);
    }

    @Test
    public void test7630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7630");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.669987343523587d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7631");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.7456418720467646d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1557701227887287d + "'", double1 == 1.1557701227887287d);
    }

    @Test
    public void test7632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7632");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.014929865531701196d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.014929310891176578d) + "'", double1 == (-0.014929310891176578d));
    }

    @Test
    public void test7633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7633");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.267831587699267d + "'", double1 == 5.267831587699267d);
    }

    @Test
    public void test7634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7634");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.8519280895446752d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0196562977062233d + "'", double1 == 1.0196562977062233d);
    }

    @Test
    public void test7635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7635");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.0010571609087238003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0010577199002813d + "'", double1 == 1.0010577199002813d);
    }

    @Test
    public void test7636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7636");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.7615718391387468d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test7637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7637");
        double double2 = org.apache.commons.math.util.FastMath.max(7.478987859894819d, 0.6726669944799356d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.478987859894819d + "'", double2 == 7.478987859894819d);
    }

    @Test
    public void test7638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7638");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.514825281439211d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.49443249085056257d) + "'", double1 == (-0.49443249085056257d));
    }

    @Test
    public void test7639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7639");
        double double1 = org.apache.commons.math.util.FastMath.log10(5.316655831697727d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.72563854761297d + "'", double1 == 0.72563854761297d);
    }

    @Test
    public void test7640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7640");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.5253572079317006d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.553134867835981d + "'", double1 == 0.553134867835981d);
    }

    @Test
    public void test7641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7641");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.22659551363623145d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6096544792651646d + "'", double1 == 0.6096544792651646d);
    }

    @Test
    public void test7642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7642");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-9.775996303178843d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8803.011218410285d + "'", double1 == 8803.011218410285d);
    }

    @Test
    public void test7643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7643");
        double double2 = org.apache.commons.math.util.FastMath.pow(12.0d, 4.800718826393155d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 151651.15593379317d + "'", double2 == 151651.15593379317d);
    }

    @Test
    public void test7644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7644");
        int int2 = org.apache.commons.math.util.FastMath.max(2, (-53));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test7645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7645");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.13766929481533965d), 1.451863517420987d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.13766929481533965d) + "'", double2 == (-0.13766929481533965d));
    }

    @Test
    public void test7646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7646");
        double double1 = org.apache.commons.math.util.FastMath.acos(13.596393407513998d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7647");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) 1248);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2737367544323206E-13d + "'", double1 == 2.2737367544323206E-13d);
    }

    @Test
    public void test7648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7648");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.0437260685878431d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6145363412000076d + "'", double1 == 1.6145363412000076d);
    }

    @Test
    public void test7649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7649");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.5945153260434693d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test7650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7650");
        double double1 = org.apache.commons.math.util.FastMath.cosh(4.486039811284383d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 44.39023561528664d + "'", double1 == 44.39023561528664d);
    }

    @Test
    public void test7651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7651");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.17062332315326462d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7422585607040884d + "'", double1 == 1.7422585607040884d);
    }

    @Test
    public void test7652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7652");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.7871071944553747d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9023536647681283d + "'", double1 == 2.9023536647681283d);
    }

    @Test
    public void test7653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7653");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.816336034199522d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7654");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.030565412958282755d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.031042277393927648d) + "'", double1 == (-0.031042277393927648d));
    }

    @Test
    public void test7655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7655");
        float float2 = org.apache.commons.math.util.FastMath.min((-1.0f), (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test7656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7656");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.7961183190466935d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test7657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7657");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 100, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test7658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7658");
        int int2 = org.apache.commons.math.util.FastMath.max(4, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test7659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7659");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.7740840138843889d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6855293804289002d + "'", double1 == 0.6855293804289002d);
    }

    @Test
    public void test7660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7660");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.5990022811290326d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4693798604480683d + "'", double1 == 0.4693798604480683d);
    }

    @Test
    public void test7661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7661");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5729.5779513082325d + "'", double1 == 5729.5779513082325d);
    }

    @Test
    public void test7662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7662");
        double double2 = org.apache.commons.math.util.FastMath.max((-7.090523728538516E-4d), 8.474177595438071d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.474177595438071d + "'", double2 == 8.474177595438071d);
    }

    @Test
    public void test7663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7663");
        double double1 = org.apache.commons.math.util.FastMath.signum(401613.8070818261d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7664");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-1), (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test7665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7665");
        double double1 = org.apache.commons.math.util.FastMath.log(1.5707963267948968d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.451582705289455d + "'", double1 == 0.451582705289455d);
    }

    @Test
    public void test7666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7666");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.185039863261519d) + "'", double1 == (-2.185039863261519d));
    }

    @Test
    public void test7667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7667");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(28.72385800275325d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1645.7558348908353d + "'", double1 == 1645.7558348908353d);
    }

    @Test
    public void test7668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7668");
        double double2 = org.apache.commons.math.util.FastMath.max(0.22473781349273705d, 184946.72416436448d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 184946.72416436448d + "'", double2 == 184946.72416436448d);
    }

    @Test
    public void test7669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7669");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.4874595421493757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17244516205757682d + "'", double1 == 0.17244516205757682d);
    }

    @Test
    public void test7670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7670");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.5707940500651734d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.810466428820983d + "'", double1 == 4.810466428820983d);
    }

    @Test
    public void test7671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7671");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.1783563265944834d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2963122958605662d + "'", double1 == 1.2963122958605662d);
    }

    @Test
    public void test7672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7672");
        long long2 = org.apache.commons.math.util.FastMath.min(74L, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test7673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7673");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.4677992676220695d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9033267687086359d + "'", double1 == 0.9033267687086359d);
    }

    @Test
    public void test7674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7674");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.6137606174793193d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7675");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 2147483647L, 0.5766474848126442d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 240565.79963231593d + "'", double2 == 240565.79963231593d);
    }

    @Test
    public void test7676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7676");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.14192893333928602d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test7677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7677");
        long long1 = org.apache.commons.math.util.FastMath.round(2.1556157735575975E15d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2155615773557598L + "'", long1 == 2155615773557598L);
    }

    @Test
    public void test7678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7678");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(62.945847461890764d, 1.6036753829452688E8d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 62.94584746189077d + "'", double2 == 62.94584746189077d);
    }

    @Test
    public void test7679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7679");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 44.3614195558365d + "'", double1 == 44.3614195558365d);
    }

    @Test
    public void test7680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7680");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 100, 1477896);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test7681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7681");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 100, 1248L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test7682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7682");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(5.461870527159005E-4d, 8.619944404759956d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.461870527159006E-4d + "'", double2 == 5.461870527159006E-4d);
    }

    @Test
    public void test7683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7683");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.1286764106923521d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12939374232171894d + "'", double1 == 0.12939374232171894d);
    }

    @Test
    public void test7684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7684");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.11943352419502769d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3455915568919873d + "'", double1 == 0.3455915568919873d);
    }

    @Test
    public void test7685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7685");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9608273643459554d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017354636730028558d) + "'", double1 == (-0.017354636730028558d));
    }

    @Test
    public void test7686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7686");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.6099169425432279d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6099169425432279d + "'", double1 == 0.6099169425432279d);
    }

    @Test
    public void test7687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7687");
        double double2 = org.apache.commons.math.util.FastMath.pow((-1.0009549590653368d), 0.011800076512800236d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test7688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7688");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.30241706620693265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2635688859043317d + "'", double1 == 1.2635688859043317d);
    }

    @Test
    public void test7689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7689");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test7690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7690");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.7292718625455186d, 7.77037274892726E13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.385288017826408E-15d + "'", double2 == 9.385288017826408E-15d);
    }

    @Test
    public void test7691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7691");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 4, (-3L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test7692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7692");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.1511334730668343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test7693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7693");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.416993700614301d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8841482777464066d + "'", double1 == 0.8841482777464066d);
    }

    @Test
    public void test7694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7694");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.583574664711627d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test7695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7695");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.1784446247204259d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8269605324947317d + "'", double1 == 0.8269605324947317d);
    }

    @Test
    public void test7696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7696");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9999999999990843d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test7697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7697");
        double double2 = org.apache.commons.math.util.FastMath.max(9.293358726420639E30d, (-0.2595645499995829d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.293358726420639E30d + "'", double2 == 9.293358726420639E30d);
    }

    @Test
    public void test7698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7698");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 77703727489273L, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.7703726E13f + "'", float2 == 7.7703726E13f);
    }

    @Test
    public void test7699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7699");
        double double2 = org.apache.commons.math.util.FastMath.max(0.8822572094027574d, 1.811385510344456d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.811385510344456d + "'", double2 == 1.811385510344456d);
    }

    @Test
    public void test7700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7700");
        double double1 = org.apache.commons.math.util.FastMath.tanh(8.467717607067357E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7701");
        double double1 = org.apache.commons.math.util.FastMath.rint(100.69314718055996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 101.0d + "'", double1 == 101.0d);
    }

    @Test
    public void test7702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7702");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.4143028416180226d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4143028416180228d + "'", double1 == 1.4143028416180228d);
    }

    @Test
    public void test7703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7703");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.9457864398311168E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7704");
        double double1 = org.apache.commons.math.util.FastMath.cosh(3.2710663101885893d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.188688139030397d + "'", double1 == 13.188688139030397d);
    }

    @Test
    public void test7705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7705");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.211870765669079d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21028920065729026d + "'", double1 == 0.21028920065729026d);
    }

    @Test
    public void test7706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7706");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.06324595785917293d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7707");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 232, 601302L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 601302L + "'", long2 == 601302L);
    }

    @Test
    public void test7708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7708");
        double double1 = org.apache.commons.math.util.FastMath.asinh(5.729577951308232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.446318939202734d + "'", double1 == 2.446318939202734d);
    }

    @Test
    public void test7709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7709");
        double double2 = org.apache.commons.math.util.FastMath.min(3.3490760817142498d, 1.2083233764351042d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2083233764351042d + "'", double2 == 1.2083233764351042d);
    }

    @Test
    public void test7710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7710");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-1.7268482287672338d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7711");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.05235987755982989d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05240777928304121d + "'", double1 == 0.05240777928304121d);
    }

    @Test
    public void test7712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7712");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9999998508398554d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01745328991660766d + "'", double1 == 0.01745328991660766d);
    }

    @Test
    public void test7713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7713");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.7099378310397425d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.012390752636110705d + "'", double1 == 0.012390752636110705d);
    }

    @Test
    public void test7714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7714");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(57.23253594375779d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.5652188298659135d + "'", double1 == 7.5652188298659135d);
    }

    @Test
    public void test7715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7715");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.8859114568793057d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.941228695312306d + "'", double1 == 0.941228695312306d);
    }

    @Test
    public void test7716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7716");
        double double1 = org.apache.commons.math.util.FastMath.log10((-5.317386859664129E-6d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7717");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 100, (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test7718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7718");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.43087067877290774d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.46096535893150953d) + "'", double1 == (-0.46096535893150953d));
    }

    @Test
    public void test7719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7719");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.5440633201885449E-10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000001544063d + "'", double1 == 1.0000000001544063d);
    }

    @Test
    public void test7720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7720");
        long long2 = org.apache.commons.math.util.FastMath.max(3L, (long) 3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test7721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7721");
        double double1 = org.apache.commons.math.util.FastMath.atan(29.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5363272257953886d + "'", double1 == 1.5363272257953886d);
    }

    @Test
    public void test7722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7722");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.5255792925185617d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7723");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.4992802918419843d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.478464722586322d + "'", double1 == 3.478464722586322d);
    }

    @Test
    public void test7724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7724");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.16143935615846078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16285664666618355d + "'", double1 == 0.16285664666618355d);
    }

    @Test
    public void test7725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7725");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-2.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7726");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-2), (float) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test7727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7727");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.94988978444572d, 1.6847038494719164d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.080215281929411d + "'", double2 == 3.080215281929411d);
    }

    @Test
    public void test7728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7728");
        int int2 = org.apache.commons.math.util.FastMath.min(52, 28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 28 + "'", int2 == 28);
    }

    @Test
    public void test7729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7729");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.009275094654817158d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.009275360639246574d) + "'", double1 == (-0.009275360639246574d));
    }

    @Test
    public void test7730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7730");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.0138559185957692d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.756208266233414d + "'", double1 == 2.756208266233414d);
    }

    @Test
    public void test7731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7731");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.008798355458637962d), 326.4268172911656d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.00879835545863796d) + "'", double2 == (-0.00879835545863796d));
    }

    @Test
    public void test7732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7732");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.9413588930953838d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.980057921432669d) + "'", double1 == (-0.980057921432669d));
    }

    @Test
    public void test7733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7733");
        double double1 = org.apache.commons.math.util.FastMath.log1p(102.04284677693161d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.635144889856113d + "'", double1 == 4.635144889856113d);
    }

    @Test
    public void test7734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7734");
        int int2 = org.apache.commons.math.util.FastMath.max((-1), 72);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72 + "'", int2 == 72);
    }

    @Test
    public void test7735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7735");
        int int2 = org.apache.commons.math.util.FastMath.max((-5), (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test7736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7736");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.876278270531895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test7737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7737");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test7738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7738");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.1189396031849523d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1189396031849521d + "'", double2 == 1.1189396031849521d);
    }

    @Test
    public void test7739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7739");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 2.357395366001277d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test7740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7740");
        double double2 = org.apache.commons.math.util.FastMath.min(0.19123459503123072d, 4.72826651551309d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.19123459503123072d + "'", double2 == 0.19123459503123072d);
    }

    @Test
    public void test7741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7741");
        double double1 = org.apache.commons.math.util.FastMath.log(0.005187336916194732d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.261534831761479d) + "'", double1 == (-5.261534831761479d));
    }

    @Test
    public void test7742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7742");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.5259757919358272d), 2.224900936870433d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test7743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7743");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.0776903657094035d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03249400038708566d + "'", double1 == 0.03249400038708566d);
    }

    @Test
    public void test7744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7744");
        double double1 = org.apache.commons.math.util.FastMath.log((-3.380515006246586d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7745");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.09486957516151237d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09951544165007464d + "'", double1 == 0.09951544165007464d);
    }

    @Test
    public void test7746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7746");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.7344047376585783d, 113.90634361049858d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.360429172832473E-16d + "'", double2 == 5.360429172832473E-16d);
    }

    @Test
    public void test7747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7747");
        double double1 = org.apache.commons.math.util.FastMath.signum(72.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7748");
        double double1 = org.apache.commons.math.util.FastMath.log10(31.59442154605463d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4996104083894752d + "'", double1 == 1.4996104083894752d);
    }

    @Test
    public void test7749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7749");
        int int1 = org.apache.commons.math.util.FastMath.round(7.7703726E13f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test7750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7750");
        long long2 = org.apache.commons.math.util.FastMath.min(10L, (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test7751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7751");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.0776903657094035d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.391675209244385d + "'", double1 == 0.391675209244385d);
    }

    @Test
    public void test7752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7752");
        double double1 = org.apache.commons.math.util.FastMath.signum(88.62082012530739d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7753");
        double double2 = org.apache.commons.math.util.FastMath.max((double) 2, 0.7740840138843887d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0d + "'", double2 == 2.0d);
    }

    @Test
    public void test7754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7754");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.28366218546322625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2799895618621916d + "'", double1 == 0.2799895618621916d);
    }

    @Test
    public void test7755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7755");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) -1, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test7756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7756");
        double double1 = org.apache.commons.math.util.FastMath.atan(4.744539888821176d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3630681161596467d + "'", double1 == 1.3630681161596467d);
    }

    @Test
    public void test7757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7757");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.261386590818358E115d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.261386590818358E115d + "'", double1 == 2.261386590818358E115d);
    }

    @Test
    public void test7758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7758");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.6499429567608755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7759");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.5037794860076608d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06696668707590557d + "'", double1 == 0.06696668707590557d);
    }

    @Test
    public void test7760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7760");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9988961914845736d, 1.811385510344456d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9980014726668577d + "'", double2 == 0.9980014726668577d);
    }

    @Test
    public void test7761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7761");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.05074122630354142d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05074122630354142d + "'", double1 == 0.05074122630354142d);
    }

    @Test
    public void test7762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7762");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.01745320894256045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017451436991612522d + "'", double1 == 0.017451436991612522d);
    }

    @Test
    public void test7763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7763");
        double double1 = org.apache.commons.math.util.FastMath.log(1.2360236088027983d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21189945982621552d + "'", double1 == 0.21189945982621552d);
    }

    @Test
    public void test7764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7764");
        double double1 = org.apache.commons.math.util.FastMath.ulp(44.3614195558365d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test7765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7765");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9560273016457693d, 0.029849141866779647d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9560273016457692d + "'", double2 == 0.9560273016457692d);
    }

    @Test
    public void test7766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7766");
        int int2 = org.apache.commons.math.util.FastMath.min(232, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7767");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1147604.843300052d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20029.483027419494d + "'", double1 == 20029.483027419494d);
    }

    @Test
    public void test7768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7768");
        double double2 = org.apache.commons.math.util.FastMath.max(0.016388539363305053d, 16.80357337942421d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 16.80357337942421d + "'", double2 == 16.80357337942421d);
    }

    @Test
    public void test7769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7769");
        int int2 = org.apache.commons.math.util.FastMath.max(6, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test7770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7770");
        double double2 = org.apache.commons.math.util.FastMath.max(0.5206130698160022d, 0.391675209244385d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5206130698160022d + "'", double2 == 0.5206130698160022d);
    }

    @Test
    public void test7771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7771");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 102, (float) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 102.0f + "'", float2 == 102.0f);
    }

    @Test
    public void test7772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7772");
        long long1 = org.apache.commons.math.util.FastMath.round(1.373400766945016d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test7773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7773");
        long long1 = org.apache.commons.math.util.FastMath.abs(4252L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4252L + "'", long1 == 4252L);
    }

    @Test
    public void test7774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7774");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.135365503154222d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7775");
        double double1 = org.apache.commons.math.util.FastMath.asin((-4.084289455298593d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7776");
        double double2 = org.apache.commons.math.util.FastMath.min(0.5996370952320068d, (-0.014930974924027406d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.014930974924027406d) + "'", double2 == (-0.014930974924027406d));
    }

    @Test
    public void test7777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7777");
        double double1 = org.apache.commons.math.util.FastMath.cosh(3.8318928232769873d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 23.085738804433994d + "'", double1 == 23.085738804433994d);
    }

    @Test
    public void test7778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7778");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.21287422124955813d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21129840046651427d + "'", double1 == 0.21129840046651427d);
    }

    @Test
    public void test7779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7779");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.8683429710876526d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7780");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.465566310769166E8d, 151651.15593379317d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test7781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7781");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 2147483647, (long) 102);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 102L + "'", long2 == 102L);
    }

    @Test
    public void test7782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7782");
        double double1 = org.apache.commons.math.util.FastMath.asinh(57.29577951308232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.741450291257945d + "'", double1 == 4.741450291257945d);
    }

    @Test
    public void test7783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7783");
        double double1 = org.apache.commons.math.util.FastMath.floor(75.2443520910225d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 75.0d + "'", double1 == 75.0d);
    }

    @Test
    public void test7784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7784");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.6529255272818217d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8675367533506818d + "'", double1 == 0.8675367533506818d);
    }

    @Test
    public void test7785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7785");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(6.157240911549056d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8328575610666067d + "'", double1 == 1.8328575610666067d);
    }

    @Test
    public void test7786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7786");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.7642704897432505d, 2.6260580840928345d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7642704897432506d + "'", double2 == 0.7642704897432506d);
    }

    @Test
    public void test7787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7787");
        long long2 = org.apache.commons.math.util.FastMath.min(10L, 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test7788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7788");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.772175097777117d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6481924520644847d + "'", double1 == 0.6481924520644847d);
    }

    @Test
    public void test7789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7789");
        long long2 = org.apache.commons.math.util.FastMath.max(35L, (long) 4);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test7790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7790");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.1759576279657875d, 1.4246618760255017d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1759576279657877d + "'", double2 == 1.1759576279657877d);
    }

    @Test
    public void test7791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7791");
        long long2 = org.apache.commons.math.util.FastMath.min((-1L), (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test7792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7792");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.6548866146797762d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.924924246850124d + "'", double1 == 0.924924246850124d);
    }

    @Test
    public void test7793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7793");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.11886886458581854d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11886886458581854d + "'", double1 == 0.11886886458581854d);
    }

    @Test
    public void test7794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7794");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
    }

    @Test
    public void test7795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7795");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.3664097912383717d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3586700384077287d + "'", double1 == 0.3586700384077287d);
    }

    @Test
    public void test7796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7796");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.7228697444076502d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.272847390159998d + "'", double1 == 1.272847390159998d);
    }

    @Test
    public void test7797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7797");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.09486957516151237d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7798");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.4992802918419843d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7799");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.5712986229603103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5440584043412822d + "'", double1 == 0.5440584043412822d);
    }

    @Test
    public void test7800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7800");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.653501741449947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 37.44289168953149d + "'", double1 == 37.44289168953149d);
    }

    @Test
    public void test7801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7801");
        double double1 = org.apache.commons.math.util.FastMath.expm1(5.166552341720382d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 174.30938753009468d + "'", double1 == 174.30938753009468d);
    }

    @Test
    public void test7802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7802");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.38579264111060985d, 0.46026355771252025d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6450803196606872d + "'", double2 == 0.6450803196606872d);
    }

    @Test
    public void test7803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7803");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) 28);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9626058663135666d) + "'", double1 == (-0.9626058663135666d));
    }

    @Test
    public void test7804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7804");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.4190581615792427d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7483270334358754d + "'", double1 == 0.7483270334358754d);
    }

    @Test
    public void test7805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7805");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-4194303.9999999413d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.4031591719483587E8d) + "'", double1 == (-2.4031591719483587E8d));
    }

    @Test
    public void test7806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7806");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.141592653589793d + "'", double1 == 3.141592653589793d);
    }

    @Test
    public void test7807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7807");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.5990022811290326d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5396855605270986d + "'", double1 == 0.5396855605270986d);
    }

    @Test
    public void test7808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7808");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.8942257319186149d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8942257319186149d + "'", double1 == 0.8942257319186149d);
    }

    @Test
    public void test7809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7809");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.328887050212274E12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 29.169558789096715d + "'", double1 == 29.169558789096715d);
    }

    @Test
    public void test7810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7810");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.1672838871475524d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7811");
        double double1 = org.apache.commons.math.util.FastMath.abs(3.8142538948245024d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8142538948245024d + "'", double1 == 3.8142538948245024d);
    }

    @Test
    public void test7812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7812");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.0074303321477398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test7813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7813");
        int int2 = org.apache.commons.math.util.FastMath.max((-5), 12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test7814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7814");
        double double1 = org.apache.commons.math.util.FastMath.rint((-5.261534831761479d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.0d) + "'", double1 == (-5.0d));
    }

    @Test
    public void test7815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7815");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.442702015629826d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6653585617017533d + "'", double1 == 0.6653585617017533d);
    }

    @Test
    public void test7816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7816");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.3019325609863106d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test7817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7817");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 72L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7818");
        double double1 = org.apache.commons.math.util.FastMath.ulp(4.041914824263687d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test7819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7819");
        double double1 = org.apache.commons.math.util.FastMath.cosh(17.247748258387592d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5472906394139022E7d + "'", double1 == 1.5472906394139022E7d);
    }

    @Test
    public void test7820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7820");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1L, (float) (-2L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test7821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7821");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.6483608274590866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011316031180115923d + "'", double1 == 0.011316031180115923d);
    }

    @Test
    public void test7822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7822");
        double double1 = org.apache.commons.math.util.FastMath.sin(20029.483027419494d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9666300649018228d) + "'", double1 == (-0.9666300649018228d));
    }

    @Test
    public void test7823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7823");
        long long1 = org.apache.commons.math.util.FastMath.round((double) 232);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 232L + "'", long1 == 232L);
    }

    @Test
    public void test7824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7824");
        int int2 = org.apache.commons.math.util.FastMath.min(53, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7825");
        double double1 = org.apache.commons.math.util.FastMath.sin(5.166552341720382d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8986283849236173d) + "'", double1 == (-0.8986283849236173d));
    }

    @Test
    public void test7826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7826");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9998885350647092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.761547339568855d + "'", double1 == 0.761547339568855d);
    }

    @Test
    public void test7827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7827");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.8393046750511655d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.566799316631632d + "'", double1 == 2.566799316631632d);
    }

    @Test
    public void test7828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7828");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (-5L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.0f + "'", float1 == 5.0f);
    }

    @Test
    public void test7829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7829");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-1.6112949659561453d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.604461414258045d + "'", double1 == 2.604461414258045d);
    }

    @Test
    public void test7830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7830");
        double double1 = org.apache.commons.math.util.FastMath.acosh(5557.690612768985d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.31608511601036d + "'", double1 == 9.31608511601036d);
    }

    @Test
    public void test7831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7831");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.449489742783178d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7832");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.47822800904141777d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49863593016115887d + "'", double1 == 0.49863593016115887d);
    }

    @Test
    public void test7833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7833");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.0021077275374186714d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test7834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7834");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.32179921168174863d, 4.669392297463842d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0688079250527684d + "'", double2 == 0.0688079250527684d);
    }

    @Test
    public void test7835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7835");
        int int2 = org.apache.commons.math.util.FastMath.min(601302, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test7836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7836");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) 102L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.318144022197688d + "'", double1 == 5.318144022197688d);
    }

    @Test
    public void test7837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7837");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.4143028416180226d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7838");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.09934057491960102d, 0.16820452546122452d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5334745778994142d + "'", double2 == 0.5334745778994142d);
    }

    @Test
    public void test7839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7839");
        double double1 = org.apache.commons.math.util.FastMath.acos(326.4268172911656d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7840");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9413588930953838d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.749853766767637d + "'", double1 == 1.749853766767637d);
    }

    @Test
    public void test7841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7841");
        long long1 = org.apache.commons.math.util.FastMath.round(2.737035667152499d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test7842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7842");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.4472512595643944d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.101695229315887d + "'", double1 == 1.101695229315887d);
    }

    @Test
    public void test7843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7843");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.03769633946808679d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7844");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.6055965365175096d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.59079985816977d + "'", double1 == 2.59079985816977d);
    }

    @Test
    public void test7845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7845");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 601302L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4452066812775426E7d + "'", double1 == 3.4452066812775426E7d);
    }

    @Test
    public void test7846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7846");
        int int1 = org.apache.commons.math.util.FastMath.round(12.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12 + "'", int1 == 12);
    }

    @Test
    public void test7847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7847");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.1747717338999963d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7848");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.48136823741490475d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.008401460657411845d) + "'", double1 == (-0.008401460657411845d));
    }

    @Test
    public void test7849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7849");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.3887906953856204d, 0.5940920277793489d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.38879069538562044d + "'", double2 == 0.38879069538562044d);
    }

    @Test
    public void test7850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7850");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.0027104462228626325d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7851");
        double double1 = org.apache.commons.math.util.FastMath.log(1.5459079327750913d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.43561139650002567d + "'", double1 == 0.43561139650002567d);
    }

    @Test
    public void test7852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7852");
        long long2 = org.apache.commons.math.util.FastMath.max(1L, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test7853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7853");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) (-2), 0.5638735088551485d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test7854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7854");
        long long2 = org.apache.commons.math.util.FastMath.max(35L, (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test7855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7855");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.4683782958316801d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.00817474340714285d + "'", double1 == 0.00817474340714285d);
    }

    @Test
    public void test7856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7856");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.011800076512800236d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7857");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 0.21320856864113585d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test7858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7858");
        double double1 = org.apache.commons.math.util.FastMath.atanh(44.39023561528664d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7859");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.9862648361376543E44d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7860");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(66.33827290905562d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3800.903057875933d + "'", double1 == 3800.903057875933d);
    }

    @Test
    public void test7861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7861");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.03317994201506513d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9994495962220703d + "'", double1 == 0.9994495962220703d);
    }

    @Test
    public void test7862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7862");
        double double1 = org.apache.commons.math.util.FastMath.atanh(4.781572054374191d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7863");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.7109804067944506d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.263574398852732d + "'", double1 == 1.263574398852732d);
    }

    @Test
    public void test7864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7864");
        long long1 = org.apache.commons.math.util.FastMath.round(0.8058581231888494d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test7865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7865");
        double double2 = org.apache.commons.math.util.FastMath.max(4.031845492717505E74d, 83.0153117485777d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.031845492717505E74d + "'", double2 == 4.031845492717505E74d);
    }

    @Test
    public void test7866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7866");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.2648394832966436d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7867");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(3.0937355862524263d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0937355862524267d + "'", double1 == 3.0937355862524267d);
    }

    @Test
    public void test7868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7868");
        double double1 = org.apache.commons.math.util.FastMath.acos(7.6035750265302235d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7869");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.7740840138843889d, (-0.016921204348595564d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0043424965706633d + "'", double2 == 1.0043424965706633d);
    }

    @Test
    public void test7870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7870");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.8393046750511655d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6854405966461316d) + "'", double1 == (-0.6854405966461316d));
    }

    @Test
    public void test7871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7871");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.7730965638572164d), 174.30938753009468d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7730965638572163d) + "'", double2 == (-0.7730965638572163d));
    }

    @Test
    public void test7872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7872");
        double double1 = org.apache.commons.math.util.FastMath.acosh(6.691673596021348E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test7873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7873");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9132263633319788d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015938806856157044d + "'", double1 == 0.015938806856157044d);
    }

    @Test
    public void test7874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7874");
        double double1 = org.apache.commons.math.util.FastMath.atan((-2.527570075824369d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.194056888776085d) + "'", double1 == (-1.194056888776085d));
    }

    @Test
    public void test7875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7875");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 232);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 232L + "'", long1 == 232L);
    }

    @Test
    public void test7876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7876");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.621997083449871E29d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.588736295171415d + "'", double1 == 1.588736295171415d);
    }

    @Test
    public void test7877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7877");
        long long1 = org.apache.commons.math.util.FastMath.round(0.7109804067944506d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test7878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7878");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.496333417761768d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49633341776176804d + "'", double1 == 0.49633341776176804d);
    }

    @Test
    public void test7879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7879");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-2.6794873638029523E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.6794872996769935E-4d) + "'", double1 == (-2.6794872996769935E-4d));
    }

    @Test
    public void test7880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7880");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 74L, (float) 57L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 74.0f + "'", float2 == 74.0f);
    }

    @Test
    public void test7881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7881");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) -1, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7882");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 1, 57);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test7883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7883");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 101.0f, 4.678332431486619d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3816705475899916E9d + "'", double2 == 2.3816705475899916E9d);
    }
}

