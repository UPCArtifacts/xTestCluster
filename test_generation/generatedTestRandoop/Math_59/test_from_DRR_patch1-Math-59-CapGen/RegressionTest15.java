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
        double double1 = org.apache.commons.math.util.FastMath.abs(171.78552109133565d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 171.78552109133565d + "'", double1 == 171.78552109133565d);
    }

    @Test
    public void test7502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7502");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 105);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 105 + "'", int1 == 105);
    }

    @Test
    public void test7503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7503");
        double double2 = org.apache.commons.math.util.FastMath.max(1.003635494454249d, 3.2710663101885897d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.2710663101885897d + "'", double2 == 3.2710663101885897d);
    }

    @Test
    public void test7504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7504");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.5707963267946692d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267946692d + "'", double1 == 1.5707963267946692d);
    }

    @Test
    public void test7505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7505");
        long long2 = org.apache.commons.math.util.FastMath.max(97L, (long) 2005);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2005L + "'", long2 == 2005L);
    }

    @Test
    public void test7506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7506");
        double double2 = org.apache.commons.math.util.FastMath.min(3.409448180683222d, (-0.5975274432265276d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5975274432265276d) + "'", double2 == (-0.5975274432265276d));
    }

    @Test
    public void test7507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7507");
        long long1 = org.apache.commons.math.util.FastMath.round(0.8733614431664554d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test7508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7508");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.4463038927734924d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test7509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7509");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.122078669996656d, 0.6023002278876782d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0718377507359773d + "'", double2 == 1.0718377507359773d);
    }

    @Test
    public void test7510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7510");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.5398933564353804d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8142716749361467d) + "'", double1 == (-0.8142716749361467d));
    }

    @Test
    public void test7511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7511");
        double double2 = org.apache.commons.math.util.FastMath.max(1.161186440228612d, 2453.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2453.0d + "'", double2 == 2453.0d);
    }

    @Test
    public void test7512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7512");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.5352878147661538d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8601218538660608d + "'", double1 == 0.8601218538660608d);
    }

    @Test
    public void test7513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7513");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.2325241103312965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0366291978447295d + "'", double1 == 1.0366291978447295d);
    }

    @Test
    public void test7514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7514");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8078050296186562d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6303775321964172d + "'", double1 == 0.6303775321964172d);
    }

    @Test
    public void test7515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7515");
        int int2 = org.apache.commons.math.util.FastMath.max(0, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test7516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7516");
        double double1 = org.apache.commons.math.util.FastMath.exp((-2.307990021938211E-5d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999769203661195d + "'", double1 == 0.9999769203661195d);
    }

    @Test
    public void test7517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7517");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.2118662346608502d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7518");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 100, 23L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test7519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7519");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.3076604860118306d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3076604860118308d + "'", double1 == 1.3076604860118308d);
    }

    @Test
    public void test7520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7520");
        long long1 = org.apache.commons.math.util.FastMath.round(1202604.2841647768d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1202604L + "'", long1 == 1202604L);
    }

    @Test
    public void test7521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7521");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.2634178653612851d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.26341786536128514d + "'", double1 == 0.26341786536128514d);
    }

    @Test
    public void test7522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7522");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.6497656628571593d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7523");
        int int1 = org.apache.commons.math.util.FastMath.round((-5.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-5) + "'", int1 == (-5));
    }

    @Test
    public void test7524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7524");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.12209768293718985d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12209768293718987d + "'", double1 == 0.12209768293718987d);
    }

    @Test
    public void test7525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7525");
        double double1 = org.apache.commons.math.util.FastMath.rint(3.2617842428105175d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test7526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7526");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.2169902071303054d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1684462041522576d + "'", double1 == 1.1684462041522576d);
    }

    @Test
    public void test7527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7527");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.24906032356353255d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.031176181367665d + "'", double1 == 1.031176181367665d);
    }

    @Test
    public void test7528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7528");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.4342944819032518d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test7529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7529");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.5242004660685926d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7530");
        double double1 = org.apache.commons.math.util.FastMath.acosh(53.486821090156674d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.672495070975756d + "'", double1 == 4.672495070975756d);
    }

    @Test
    public void test7531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7531");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.3877787807814457E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3877787807814457E-17d + "'", double1 == 1.3877787807814457E-17d);
    }

    @Test
    public void test7532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7532");
        double double2 = org.apache.commons.math.util.FastMath.max(0.806677178940103d, 2.273736754433096E-13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.806677178940103d + "'", double2 == 0.806677178940103d);
    }

    @Test
    public void test7533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7533");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 51, 49.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 49.0f + "'", float2 == 49.0f);
    }

    @Test
    public void test7534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7534");
        double double1 = org.apache.commons.math.util.FastMath.exp((-1.3649255980017991d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.25539967752754056d + "'", double1 == 0.25539967752754056d);
    }

    @Test
    public void test7535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7535");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.5499324805615463d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1550623802852666d + "'", double1 == 1.1550623802852666d);
    }

    @Test
    public void test7536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7536");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(170.75141916320402d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.980174466850851d + "'", double1 == 2.980174466850851d);
    }

    @Test
    public void test7537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7537");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 97, 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test7538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7538");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.09208020644278125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09182128027028821d + "'", double1 == 0.09182128027028821d);
    }

    @Test
    public void test7539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7539");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.8657694832396586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 49.604937420854704d + "'", double1 == 49.604937420854704d);
    }

    @Test
    public void test7540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7540");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.5309802039261721d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7541");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.8703261436731974d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7645392024697509d) + "'", double1 == (-0.7645392024697509d));
    }

    @Test
    public void test7542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7542");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 10, 2005);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2005 + "'", int2 == 2005);
    }

    @Test
    public void test7543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7543");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.8624815133123458d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 49.41655062085374d + "'", double1 == 49.41655062085374d);
    }

    @Test
    public void test7544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7544");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.5293871052736648d), 1.036895443825105d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.036895443825105d + "'", double2 == 1.036895443825105d);
    }

    @Test
    public void test7545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7545");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9782600344876317d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test7546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7546");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1L, (float) 52);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test7547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7547");
        long long1 = org.apache.commons.math.util.FastMath.abs((-5L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test7548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7548");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.0001966525547152d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1755046671185492d + "'", double1 == 1.1755046671185492d);
    }

    @Test
    public void test7549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7549");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.646195471540118d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-13.237607328676818d) + "'", double1 == (-13.237607328676818d));
    }

    @Test
    public void test7550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7550");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.3406624011429167d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test7551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7551");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.5746498405240853d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-32.92501055989591d) + "'", double1 == (-32.92501055989591d));
    }

    @Test
    public void test7552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7552");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.20637502874300256d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3629275470119726d + "'", double1 == 1.3629275470119726d);
    }

    @Test
    public void test7553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7553");
        long long1 = org.apache.commons.math.util.FastMath.round(5.078429063317607d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test7554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7554");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.330193321284595d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12391476297149813d + "'", double1 == 0.12391476297149813d);
    }

    @Test
    public void test7555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7555");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.6031002539686936d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6886978034872481d + "'", double1 == 0.6886978034872481d);
    }

    @Test
    public void test7556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7556");
        double double1 = org.apache.commons.math.util.FastMath.exp((-1.1578552071446455d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3141592653589793d + "'", double1 == 0.3141592653589793d);
    }

    @Test
    public void test7557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7557");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.029875845395236918d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7558");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.5835859084746703d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9476587426936512d + "'", double1 == 0.9476587426936512d);
    }

    @Test
    public void test7559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7559");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.160615567051236d, 1.9943400969063074d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1606155670512361d + "'", double2 == 1.1606155670512361d);
    }

    @Test
    public void test7560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7560");
        int int2 = org.apache.commons.math.util.FastMath.min(3, 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test7561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7561");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.6214949279424251d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8130089418575377d + "'", double1 == 0.8130089418575377d);
    }

    @Test
    public void test7562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7562");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8940757456435279d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0180447215576187d + "'", double1 == 1.0180447215576187d);
    }

    @Test
    public void test7563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7563");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8849970453777316d, 3.795905878436088d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8849970453777317d + "'", double2 == 0.8849970453777317d);
    }

    @Test
    public void test7564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7564");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.3076604860118308d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8362342347106707d + "'", double1 == 0.8362342347106707d);
    }

    @Test
    public void test7565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7565");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9625660398138893d, 0.5155089546197845d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9625660398138892d + "'", double2 == 0.9625660398138892d);
    }

    @Test
    public void test7566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7566");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.5496008503596722d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5496008503596723d + "'", double1 == 0.5496008503596723d);
    }

    @Test
    public void test7567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7567");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.44372725983318934d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test7568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7568");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.9170462317842702d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8214837205209411d) + "'", double1 == (-0.8214837205209411d));
    }

    @Test
    public void test7569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7569");
        long long1 = org.apache.commons.math.util.FastMath.round(0.6742905716087851d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test7570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7570");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 100, 51.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test7571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7571");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 5);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test7572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7572");
        double double1 = org.apache.commons.math.util.FastMath.log(1.7763568394002505E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-33.96421184743732d) + "'", double1 == (-33.96421184743732d));
    }

    @Test
    public void test7573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7573");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(4.440892098500626E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.750818884463626E-18d + "'", double1 == 7.750818884463626E-18d);
    }

    @Test
    public void test7574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7574");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.178598367428652d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7787628468551864d + "'", double1 == 1.7787628468551864d);
    }

    @Test
    public void test7575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7575");
        double double1 = org.apache.commons.math.util.FastMath.abs(100.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.00000000000001d + "'", double1 == 100.00000000000001d);
    }

    @Test
    public void test7576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7576");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-2.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test7577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7577");
        double double1 = org.apache.commons.math.util.FastMath.asinh(9.041584605696372d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8980257890440155d + "'", double1 == 2.8980257890440155d);
    }

    @Test
    public void test7578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7578");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.5160141294778327d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5392208450308552d) + "'", double1 == (-0.5392208450308552d));
    }

    @Test
    public void test7579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7579");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 1, 36L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 36L + "'", long2 == 36L);
    }

    @Test
    public void test7580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7580");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.6485587228186701d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6949916302120114d + "'", double1 == 0.6949916302120114d);
    }

    @Test
    public void test7581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7581");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.1321130459272635d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1022046803508374d + "'", double1 == 2.1022046803508374d);
    }

    @Test
    public void test7582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7582");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.1256209726545494d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7583");
        long long1 = org.apache.commons.math.util.FastMath.round(0.1408200865825788d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test7584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7584");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.5887690237160378d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5553377333741555d) + "'", double1 == (-0.5553377333741555d));
    }

    @Test
    public void test7585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7585");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.8307927247660993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7384661299203219d + "'", double1 == 0.7384661299203219d);
    }

    @Test
    public void test7586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7586");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.8513156925057356d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7587");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.6113119967914532d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7588");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.0384003448748685E38d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7589");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.5404579084624257d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9998150716581506d + "'", double1 == 0.9998150716581506d);
    }

    @Test
    public void test7590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7590");
        double double2 = org.apache.commons.math.util.FastMath.min(6.176458612301354E-4d, 0.12270990624068587d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.176458612301354E-4d + "'", double2 == 6.176458612301354E-4d);
    }

    @Test
    public void test7591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7591");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9645299563679709d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6235541816674206d + "'", double1 == 2.6235541816674206d);
    }

    @Test
    public void test7592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7592");
        double double1 = org.apache.commons.math.util.FastMath.tan(51.990383726224344d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.437634736081896d) + "'", double1 == (-6.437634736081896d));
    }

    @Test
    public void test7593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7593");
        long long2 = org.apache.commons.math.util.FastMath.max((-2L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test7594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7594");
        double double1 = org.apache.commons.math.util.FastMath.ulp(3.5055990562803734d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test7595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7595");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.26241365373669573d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2654357146060666d + "'", double1 == 0.2654357146060666d);
    }

    @Test
    public void test7596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7596");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.8391021170060218d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3142880837058624d + "'", double1 == 1.3142880837058624d);
    }

    @Test
    public void test7597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7597");
        double double1 = org.apache.commons.math.util.FastMath.rint(24.196389016690723d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 24.0d + "'", double1 == 24.0d);
    }

    @Test
    public void test7598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7598");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 32, 41.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 41.0f + "'", float2 == 41.0f);
    }

    @Test
    public void test7599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7599");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8280082726548262d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8280082726548262d + "'", double1 == 0.8280082726548262d);
    }

    @Test
    public void test7600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7600");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 0, (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test7601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7601");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.6632067821573728E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.570630006115914d + "'", double1 == 1.570630006115914d);
    }

    @Test
    public void test7602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7602");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.8548425446316326d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2738680187439355d) + "'", double1 == (-1.2738680187439355d));
    }

    @Test
    public void test7603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7603");
        double double1 = org.apache.commons.math.util.FastMath.asin(5.332679130150692d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7604");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (-2L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test7605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7605");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.7854964800073828d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 45.00563312680528d + "'", double1 == 45.00563312680528d);
    }

    @Test
    public void test7606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7606");
        double double2 = org.apache.commons.math.util.FastMath.min(1.317808380333411d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test7607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7607");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.6040309680760088d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 34.60842516595666d + "'", double1 == 34.60842516595666d);
    }

    @Test
    public void test7608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7608");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 10, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test7609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7609");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.5975274432265277d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5975274432265276d) + "'", double1 == (-0.5975274432265276d));
    }

    @Test
    public void test7610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7610");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.998019200072578d, (-0.5012964284823489d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0362753489190966d + "'", double2 == 2.0362753489190966d);
    }

    @Test
    public void test7611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7611");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.8603154559760037d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7612");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.04494641540543966d, 1.2261911632538862d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.036638904918590454d + "'", double2 == 0.036638904918590454d);
    }

    @Test
    public void test7613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7613");
        double double1 = org.apache.commons.math.util.FastMath.tanh(286.4788975654116d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7614");
        double double1 = org.apache.commons.math.util.FastMath.log(0.43469360908676247d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8331138429892707d) + "'", double1 == (-0.8331138429892707d));
    }

    @Test
    public void test7615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7615");
        long long2 = org.apache.commons.math.util.FastMath.min(52L, 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test7616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7616");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 49, (long) 3280);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3280L + "'", long2 == 3280L);
    }

    @Test
    public void test7617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7617");
        long long1 = org.apache.commons.math.util.FastMath.round(1.457501399486101d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test7618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7618");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.24100148938087304d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23872747392044252d + "'", double1 == 0.23872747392044252d);
    }

    @Test
    public void test7619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7619");
        double double2 = org.apache.commons.math.util.FastMath.atan2(3279.925622497139d, 0.010656364320134486d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.570793077829662d + "'", double2 == 1.570793077829662d);
    }

    @Test
    public void test7620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7620");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.4388852878205555d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0978660488991339d + "'", double1 == 1.0978660488991339d);
    }

    @Test
    public void test7621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7621");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.26956623098831756d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test7622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7622");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.000045400273399d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7623");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.24703638249282d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.24703638249282d + "'", double1 == 2.24703638249282d);
    }

    @Test
    public void test7624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7624");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.02037490473029824d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.020373495030962134d + "'", double1 == 0.020373495030962134d);
    }

    @Test
    public void test7625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7625");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(209278.06498540222d, (-0.9952490749257368d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 209278.0649854022d + "'", double2 == 209278.0649854022d);
    }

    @Test
    public void test7626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7626");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.086961379713775d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test7627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7627");
        double double1 = org.apache.commons.math.util.FastMath.rint(8.760408239696284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.0d + "'", double1 == 9.0d);
    }

    @Test
    public void test7628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7628");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.7646645087741661d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9144437116615921d) + "'", double1 == (-0.9144437116615921d));
    }

    @Test
    public void test7629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7629");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7630");
        double double1 = org.apache.commons.math.util.FastMath.log10((-7.08780687629274E-15d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7631");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test7632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7632");
        int int2 = org.apache.commons.math.util.FastMath.min(4, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test7633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7633");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.831458987661877d, 1.0889851353176776d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8314589876618771d + "'", double2 == 0.8314589876618771d);
    }

    @Test
    public void test7634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7634");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6881171418161356E43d + "'", double1 == 2.6881171418161356E43d);
    }

    @Test
    public void test7635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7635");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 100L, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test7636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7636");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-33.96421184743732d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7637");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.8135279227115656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9501932893010587d + "'", double1 == 0.9501932893010587d);
    }

    @Test
    public void test7638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7638");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 10, (long) 83);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test7639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7639");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.8940757456435278d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7640");
        long long1 = org.apache.commons.math.util.FastMath.round(0.6218224167640864d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test7641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7641");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.020026897690215144d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.020024220894126882d + "'", double1 == 0.020024220894126882d);
    }

    @Test
    public void test7642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7642");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.47381472041431183d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7643");
        double double1 = org.apache.commons.math.util.FastMath.acosh(35.52207115221653d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.263103220640103d + "'", double1 == 4.263103220640103d);
    }

    @Test
    public void test7644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7644");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.07270966677774479d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07264561806396652d + "'", double1 == 0.07264561806396652d);
    }

    @Test
    public void test7645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7645");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9492691029357998d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7646");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.381816156307044d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7647");
        double double1 = org.apache.commons.math.util.FastMath.exp((-2.2181320109034326d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10881217906347745d + "'", double1 == 0.10881217906347745d);
    }

    @Test
    public void test7648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7648");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9391633417659445d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test7649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7649");
        double double2 = org.apache.commons.math.util.FastMath.max((-1.1578552071446455d), 1.379315007273721d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.379315007273721d + "'", double2 == 1.379315007273721d);
    }

    @Test
    public void test7650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7650");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.7858371377510551d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.721570678516129d + "'", double1 == 0.721570678516129d);
    }

    @Test
    public void test7651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7651");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.44127637925208785d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3552893189498792d) + "'", double1 == (-0.3552893189498792d));
    }

    @Test
    public void test7652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7652");
        double double1 = org.apache.commons.math.util.FastMath.asin((-1375.0987083139757d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7653");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.045799397948117d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2694658298641721d + "'", double1 == 1.2694658298641721d);
    }

    @Test
    public void test7654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7654");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.8214837205209411d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3568248933557083d + "'", double1 == 1.3568248933557083d);
    }

    @Test
    public void test7655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7655");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 49, 0.013709499838954644d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.054803938897623d + "'", double2 == 1.054803938897623d);
    }

    @Test
    public void test7656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7656");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9704971179648549d, 2.24703638249282d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9704971179648549d + "'", double2 == 0.9704971179648549d);
    }

    @Test
    public void test7657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7657");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.467108650523244d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.05681425181566d + "'", double1 == 2.05681425181566d);
    }

    @Test
    public void test7658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7658");
        double double1 = org.apache.commons.math.util.FastMath.ulp(3.7084297692661896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test7659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7659");
        long long2 = org.apache.commons.math.util.FastMath.max(564L, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 564L + "'", long2 == 564L);
    }

    @Test
    public void test7660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7660");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.011796580410621019d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.558999472766477d + "'", double1 == 1.558999472766477d);
    }

    @Test
    public void test7661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7661");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.5707963001144702d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test7662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7662");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-2.3079900215284027E-5d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000000000266341d + "'", double1 == 1.000000000266341d);
    }

    @Test
    public void test7663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7663");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.24154560853011509d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3268380193609397d + "'", double1 == 1.3268380193609397d);
    }

    @Test
    public void test7664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7664");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.04589025719138692d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04590636572300886d + "'", double1 == 0.04590636572300886d);
    }

    @Test
    public void test7665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7665");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.6940658945086007E-21d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7666");
        double double1 = org.apache.commons.math.util.FastMath.log1p(21.45336887641879d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1114406642406047d + "'", double1 == 3.1114406642406047d);
    }

    @Test
    public void test7667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7667");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 3, (float) 3280L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test7668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7668");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9794838559949071d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test7669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7669");
        int int2 = org.apache.commons.math.util.FastMath.max(10, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test7670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7670");
        int int2 = org.apache.commons.math.util.FastMath.max(5, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test7671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7671");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.7615941559549048d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7050268435565652d + "'", double1 == 0.7050268435565652d);
    }

    @Test
    public void test7672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7672");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.0000000000000018d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6931471805599462d + "'", double1 == 0.6931471805599462d);
    }

    @Test
    public void test7673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7673");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.7545843389046754d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 43.23449790590727d + "'", double1 == 43.23449790590727d);
    }

    @Test
    public void test7674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7674");
        double double2 = org.apache.commons.math.util.FastMath.max(3.14964410796935d, 0.7618369854566598d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.14964410796935d + "'", double2 == 3.14964410796935d);
    }

    @Test
    public void test7675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7675");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-3L), (float) 49);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.0f) + "'", float2 == (-3.0f));
    }

    @Test
    public void test7676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7676");
        double double1 = org.apache.commons.math.util.FastMath.log(21.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.044522437723423d + "'", double1 == 3.044522437723423d);
    }

    @Test
    public void test7677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7677");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.24164116587899462d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24645685232995337d + "'", double1 == 0.24645685232995337d);
    }

    @Test
    public void test7678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7678");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.3131691680118311d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 75.23905111378363d + "'", double1 == 75.23905111378363d);
    }

    @Test
    public void test7679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7679");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9971213268799871d, 0.25968541812993223d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9971213268799871d + "'", double2 == 0.9971213268799871d);
    }

    @Test
    public void test7680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7680");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9773206322293115d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.009962932736145003d) + "'", double1 == (-0.009962932736145003d));
    }

    @Test
    public void test7681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7681");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.02464661606873139d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0249528546495883d + "'", double1 == 1.0249528546495883d);
    }

    @Test
    public void test7682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7682");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.7851995759897803d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9225573052103259d + "'", double1 == 0.9225573052103259d);
    }

    @Test
    public void test7683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7683");
        long long2 = org.apache.commons.math.util.FastMath.min(1L, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test7684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7684");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.3758756549624582d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2166547439945103d + "'", double1 == 1.2166547439945103d);
    }

    @Test
    public void test7685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7685");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.5702200276960676d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test7686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7686");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.7418580584129385d, 1.193280050738016d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7002553245950086d + "'", double2 == 0.7002553245950086d);
    }

    @Test
    public void test7687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7687");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.4422495703074083d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7688");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9433259196114583d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test7689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7689");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.1077652784594167d, 0.8194058173186031d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1077652784594165d + "'", double2 == 1.1077652784594165d);
    }

    @Test
    public void test7690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7690");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.2166539525524803d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7691");
        int int2 = org.apache.commons.math.util.FastMath.min(16, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test7692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7692");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 105, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test7693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7693");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.4694715627858907d, (-0.8454210262244998d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.46947156278589064d + "'", double2 == 0.46947156278589064d);
    }

    @Test
    public void test7694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7694");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.5538249887862297d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7695");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.2248497229193942E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.00349978531187185d + "'", double1 == 0.00349978531187185d);
    }

    @Test
    public void test7696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7696");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.5856304902609806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2323763202567335d) + "'", double1 == (-0.2323763202567335d));
    }

    @Test
    public void test7697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7697");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.403108691968676E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.403108691968676E-6d + "'", double1 == 2.403108691968676E-6d);
    }

    @Test
    public void test7698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7698");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.918651309156592d, 1.007466274221142d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.942086186513886d + "'", double2 == 2.942086186513886d);
    }

    @Test
    public void test7699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7699");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.9661389135827213E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5705997129022715d + "'", double1 == 1.5705997129022715d);
    }

    @Test
    public void test7700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7700");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.8141114601824925d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test7701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7701");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.3936173560075417d), 2.0275850194920664d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.1917460923835164d) + "'", double2 == (-0.1917460923835164d));
    }

    @Test
    public void test7702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7702");
        int int2 = org.apache.commons.math.util.FastMath.min(41, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test7703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7703");
        long long2 = org.apache.commons.math.util.FastMath.max(2005L, (long) 2147483647);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test7704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7704");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.5574075654456325d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test7705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7705");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.7380632774182745d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7706");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.22579135264471936d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7707");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.009088214590764d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test7708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7708");
        double double2 = org.apache.commons.math.util.FastMath.max(0.8221857156655815d, (-1.1578552071446455d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8221857156655815d + "'", double2 == 0.8221857156655815d);
    }

    @Test
    public void test7709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7709");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 6559, (float) 39481480091341L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.9481478E13f + "'", float2 == 3.9481478E13f);
    }

    @Test
    public void test7710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7710");
        double double2 = org.apache.commons.math.util.FastMath.max(0.33909512969033245d, 8.803406679429403E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.33909512969033245d + "'", double2 == 0.33909512969033245d);
    }

    @Test
    public void test7711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7711");
        double double1 = org.apache.commons.math.util.FastMath.tanh(7872.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7712");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.7248400717559731d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7713");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.8583791929340127d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7714");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.4422495703074083d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4422495703074085d + "'", double1 == 1.4422495703074085d);
    }

    @Test
    public void test7715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7715");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9725420682979978d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7498192537978206d + "'", double1 == 0.7498192537978206d);
    }

    @Test
    public void test7716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7716");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.017533279424944842d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0001537118814257d + "'", double1 == 1.0001537118814257d);
    }

    @Test
    public void test7717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7717");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.07270966677774479d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7718");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.2698824106894193d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2666181056897503d + "'", double1 == 0.2666181056897503d);
    }

    @Test
    public void test7719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7719");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.24331311680122625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7720");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 1, 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
    }

    @Test
    public void test7721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7721");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9586654676184498d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8518415814981072d + "'", double1 == 0.8518415814981072d);
    }

    @Test
    public void test7722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7722");
        double double2 = org.apache.commons.math.util.FastMath.min(0.4248349501142077d, 0.7615165085805536d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4248349501142077d + "'", double2 == 0.4248349501142077d);
    }

    @Test
    public void test7723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7723");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.5604872310455469d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2491946329717987d + "'", double1 == 1.2491946329717987d);
    }

    @Test
    public void test7724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7724");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.28350938628841055d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2913577481716683d + "'", double1 == 0.2913577481716683d);
    }

    @Test
    public void test7725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7725");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.6710040507981441E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9164522500590197E-6d + "'", double1 == 2.9164522500590197E-6d);
    }

    @Test
    public void test7726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7726");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.7567424583270177d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.030660940007385735d + "'", double1 == 0.030660940007385735d);
    }

    @Test
    public void test7727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7727");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.05542260109486248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23542005244851696d + "'", double1 == 0.23542005244851696d);
    }

    @Test
    public void test7728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7728");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(7.046745412134694E21d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.394489509276126E10d + "'", double1 == 8.394489509276126E10d);
    }

    @Test
    public void test7729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7729");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.2435651823220197d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6133847940611309d) + "'", double1 == (-0.6133847940611309d));
    }

    @Test
    public void test7730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7730");
        float float2 = org.apache.commons.math.util.FastMath.max(52.0f, (float) 2L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test7731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7731");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.428182669496151d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.457669233211857d) + "'", double1 == (-0.457669233211857d));
    }

    @Test
    public void test7732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7732");
        double double1 = org.apache.commons.math.util.FastMath.exp(328280.63500117435d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test7733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7733");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 2005, (long) 564);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2005L + "'", long2 == 2005L);
    }

    @Test
    public void test7734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7734");
        double double1 = org.apache.commons.math.util.FastMath.exp(58.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.545538935590104E25d + "'", double1 == 1.545538935590104E25d);
    }

    @Test
    public void test7735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7735");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9999009710012459d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7853486464463046d + "'", double1 == 0.7853486464463046d);
    }

    @Test
    public void test7736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7736");
        double double1 = org.apache.commons.math.util.FastMath.acosh(3.748066027288565E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18.132482812411777d + "'", double1 == 18.132482812411777d);
    }

    @Test
    public void test7737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7737");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9904398083453424d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6924183600522371d + "'", double1 == 1.6924183600522371d);
    }

    @Test
    public void test7738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7738");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.12391476297149813d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12455291438014174d + "'", double1 == 0.12455291438014174d);
    }

    @Test
    public void test7739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7739");
        double double1 = org.apache.commons.math.util.FastMath.atanh(47.98895829359383d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7740");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1, 52.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test7741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7741");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.9202613644617779d), 6.691673596021348E41d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test7742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7742");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 0, 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test7743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7743");
        double double1 = org.apache.commons.math.util.FastMath.exp(67.38522216300166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8408997859106198E29d + "'", double1 == 1.8408997859106198E29d);
    }

    @Test
    public void test7744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7744");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.3238180489947473d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7745");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.1499206005993003d, 0.5665394379443537d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1499206005993001d + "'", double2 == 1.1499206005993001d);
    }

    @Test
    public void test7746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7746");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(4.15912713462618d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6081778099169377d + "'", double1 == 1.6081778099169377d);
    }

    @Test
    public void test7747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7747");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.04494641542602665d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.043965606997777955d + "'", double1 == 0.043965606997777955d);
    }

    @Test
    public void test7748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7748");
        int int2 = org.apache.commons.math.util.FastMath.max(564, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 564 + "'", int2 == 564);
    }

    @Test
    public void test7749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7749");
        int int2 = org.apache.commons.math.util.FastMath.max(36, 51);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 51 + "'", int2 == 51);
    }

    @Test
    public void test7750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7750");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.1312066203280915d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test7751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7751");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test7752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7752");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.9785097773144031d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.978509777314403d + "'", double2 == 1.978509777314403d);
    }

    @Test
    public void test7753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7753");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 1.630981939772463d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test7754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7754");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.15152168239853733d), 0.9452141955055743d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.15152168239853733d) + "'", double2 == (-0.15152168239853733d));
    }

    @Test
    public void test7755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7755");
        double double1 = org.apache.commons.math.util.FastMath.log(1.0184447437332007d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.018276702619184522d + "'", double1 == 0.018276702619184522d);
    }

    @Test
    public void test7756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7756");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.4178805902828283d), 0.5352669621904063d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test7757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7757");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.14964410796935d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49826148373339413d + "'", double1 == 0.49826148373339413d);
    }

    @Test
    public void test7758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7758");
        double double1 = org.apache.commons.math.util.FastMath.log(0.24091947210469064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.423292541973343d) + "'", double1 == (-1.423292541973343d));
    }

    @Test
    public void test7759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7759");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.759353443181043d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1368941502672547d + "'", double1 == 1.1368941502672547d);
    }

    @Test
    public void test7760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7760");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.7271519293949413d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7761");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.6924183600522371d, 1.7798990962278105d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.551060149973663d + "'", double2 == 2.551060149973663d);
    }

    @Test
    public void test7762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7762");
        double double1 = org.apache.commons.math.util.FastMath.signum(8.587340256999986E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7763");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.8624815133123458d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.06425020495321662d) + "'", double1 == (-0.06425020495321662d));
    }

    @Test
    public void test7764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7764");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 2147483647, 83L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 83L + "'", long2 == 83L);
    }

    @Test
    public void test7765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7765");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.8540342600388389d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.228255240190465d + "'", double1 == 1.228255240190465d);
    }

    @Test
    public void test7766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7766");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.1063634786066832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7767");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (-5));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.0f + "'", float1 == 5.0f);
    }

    @Test
    public void test7768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7768");
        double double2 = org.apache.commons.math.util.FastMath.max(0.24100148938087304d, (-288.3206630503136d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.24100148938087304d + "'", double2 == 0.24100148938087304d);
    }

    @Test
    public void test7769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7769");
        long long1 = org.apache.commons.math.util.FastMath.abs(1202604L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1202604L + "'", long1 == 1202604L);
    }

    @Test
    public void test7770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7770");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.1754301470197195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17454255325865348d + "'", double1 == 0.17454255325865348d);
    }

    @Test
    public void test7771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7771");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 2005, (long) (-5));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2005L + "'", long2 == 2005L);
    }

    @Test
    public void test7772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7772");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.1624473515095703d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8603793191171789d + "'", double1 == 0.8603793191171789d);
    }

    @Test
    public void test7773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7773");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.14176215585771934d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test7774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7774");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.46517735014659645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test7775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7775");
        double double1 = org.apache.commons.math.util.FastMath.cos((-1.423292541973343d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14696948408309232d + "'", double1 == 0.14696948408309232d);
    }

    @Test
    public void test7776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7776");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.3629275470119726d, 0.40389008459726955d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1332147487725872d + "'", double2 == 1.1332147487725872d);
    }

    @Test
    public void test7777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7777");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.2774097573050645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2774097573050645d + "'", double1 == 2.2774097573050645d);
    }

    @Test
    public void test7778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7778");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.7080000778051354d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9364017098556218d + "'", double1 == 0.9364017098556218d);
    }

    @Test
    public void test7779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7779");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.37904451714063647d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7780");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.660102087863946d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test7781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7781");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(238.27245481202067d, 16.841267313175987d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 238.27245481202064d + "'", double2 == 238.27245481202064d);
    }

    @Test
    public void test7782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7782");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '#', 51);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test7783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7783");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(7871.825828205633d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 137.38927884571783d + "'", double1 == 137.38927884571783d);
    }

    @Test
    public void test7784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7784");
        double double2 = org.apache.commons.math.util.FastMath.max(1.5293379817723d, 98.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 98.0d + "'", double2 == 98.0d);
    }

    @Test
    public void test7785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7785");
        int int2 = org.apache.commons.math.util.FastMath.max(32, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test7786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7786");
        double double2 = org.apache.commons.math.util.FastMath.max(0.43197869742047307d, 0.7727985235349918d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7727985235349918d + "'", double2 == 0.7727985235349918d);
    }

    @Test
    public void test7787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7787");
        float float2 = org.apache.commons.math.util.FastMath.max(3.9481478E13f, (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.9481478E13f + "'", float2 == 3.9481478E13f);
    }

    @Test
    public void test7788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7788");
        long long1 = org.apache.commons.math.util.FastMath.round(2.3831824358869964d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test7789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7789");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.6422536607552369d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7790");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.015372395508685268d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015373001016267042d + "'", double1 == 0.015373001016267042d);
    }

    @Test
    public void test7791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7791");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.2430166129797537d), 0.28448959157673537d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.2430166129797537d) + "'", double2 == (-0.2430166129797537d));
    }

    @Test
    public void test7792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7792");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.648764830127854d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2179336308387003d + "'", double1 == 1.2179336308387003d);
    }

    @Test
    public void test7793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7793");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9787801483545738d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8662890074311554d + "'", double1 == 0.8662890074311554d);
    }

    @Test
    public void test7794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7794");
        double double1 = org.apache.commons.math.util.FastMath.acosh(8.760408239696284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8601161017291754d + "'", double1 == 2.8601161017291754d);
    }

    @Test
    public void test7795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7795");
        double double2 = org.apache.commons.math.util.FastMath.pow(8.89816576053034E36d, 0.2409478134865074d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.995638736585284E8d + "'", double2 == 7.995638736585284E8d);
    }

    @Test
    public void test7796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7796");
        long long2 = org.apache.commons.math.util.FastMath.min(564L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test7797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7797");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.1162729376788123d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.494457104618708d + "'", double1 == 1.494457104618708d);
    }

    @Test
    public void test7798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7798");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9676589901702034d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test7799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7799");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.8148475049841903d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9340256008432849d + "'", double1 == 0.9340256008432849d);
    }

    @Test
    public void test7800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7800");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(14.389377026852705d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4322824004238863d + "'", double1 == 2.4322824004238863d);
    }

    @Test
    public void test7801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7801");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(8.961927637199098E-6d, 1.2133974932616556d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.9619276371991E-6d + "'", double2 == 8.9619276371991E-6d);
    }

    @Test
    public void test7802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7802");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 97, (long) 51);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 51L + "'", long2 == 51L);
    }

    @Test
    public void test7803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7803");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.997695297953666d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.76062454003196d + "'", double1 == 0.76062454003196d);
    }

    @Test
    public void test7804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7804");
        long long2 = org.apache.commons.math.util.FastMath.max(2147483647L, (long) 36);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test7805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7805");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.4358324927765946d), 3.7581226324091723d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.4358324927765945d) + "'", double2 == (-0.4358324927765945d));
    }

    @Test
    public void test7806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7806");
        long long2 = org.apache.commons.math.util.FastMath.min(4L, 39481480091341L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test7807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7807");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.777357160368767d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.91420544965071d + "'", double1 == 4.91420544965071d);
    }

    @Test
    public void test7808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7808");
        double double1 = org.apache.commons.math.util.FastMath.abs((-1.0058280496756309d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0058280496756309d + "'", double1 == 1.0058280496756309d);
    }

    @Test
    public void test7809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7809");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, (long) 3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test7810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7810");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.1474089466969337d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9818648685487035d + "'", double1 == 0.9818648685487035d);
    }

    @Test
    public void test7811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7811");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.017453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0001523125762564d + "'", double1 == 1.0001523125762564d);
    }

    @Test
    public void test7812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7812");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.7605884021621934d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7813");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.44699510894891675d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test7814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7814");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.008837977760189355d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.008837862708712467d) + "'", double1 == (-0.008837862708712467d));
    }

    @Test
    public void test7815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7815");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.14946825286985244d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.5639000606367d + "'", double1 == 8.5639000606367d);
    }

    @Test
    public void test7816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7816");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.5501702829958328d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7335481865142015d + "'", double1 == 0.7335481865142015d);
    }

    @Test
    public void test7817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7817");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.0469397408294336d, 0.03602212401092414d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0016537503379725d + "'", double2 == 1.0016537503379725d);
    }

    @Test
    public void test7818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7818");
        double double1 = org.apache.commons.math.util.FastMath.cos(7.433209317616326E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.999999723737009d + "'", double1 == 0.999999723737009d);
    }

    @Test
    public void test7819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7819");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(572.9577948946323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.305661183012864d + "'", double1 == 8.305661183012864d);
    }

    @Test
    public void test7820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7820");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.4821727754909737d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 84.9222445448241d + "'", double1 == 84.9222445448241d);
    }

    @Test
    public void test7821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7821");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.5281699918502043d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0143523442104507d + "'", double1 == 1.0143523442104507d);
    }

    @Test
    public void test7822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7822");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9130789561495837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7399942318847219d + "'", double1 == 0.7399942318847219d);
    }

    @Test
    public void test7823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7823");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.2175831832403397d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2175831832403397d + "'", double1 == 1.2175831832403397d);
    }

    @Test
    public void test7824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7824");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.3588470982042273d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8236852617604836d + "'", double1 == 0.8236852617604836d);
    }

    @Test
    public void test7825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7825");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9999197990932152d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7826");
        double double1 = org.apache.commons.math.util.FastMath.abs(4.615828393869323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.615828393869323d + "'", double1 == 4.615828393869323d);
    }

    @Test
    public void test7827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7827");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.0046089101124813904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.673617379884035E-19d + "'", double1 == 8.673617379884035E-19d);
    }

    @Test
    public void test7828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7828");
        int int2 = org.apache.commons.math.util.FastMath.max(97, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test7829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7829");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.43087065683043346d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test7830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7830");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.1219529208307404d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0592227909324554d + "'", double1 == 1.0592227909324554d);
    }

    @Test
    public void test7831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7831");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.6055560406454773d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7832");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.9088339535934766d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9940685753209271d + "'", double1 == 0.9940685753209271d);
    }

    @Test
    public void test7833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7833");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.06632883173314777d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.00220056356627d + "'", double1 == 1.00220056356627d);
    }

    @Test
    public void test7834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7834");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 6559);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6559.0f + "'", float1 == 6559.0f);
    }

    @Test
    public void test7835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7835");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 4L, 3.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test7836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7836");
        double double1 = org.apache.commons.math.util.FastMath.sin(3.893390694697032d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6829532641260572d) + "'", double1 == (-0.6829532641260572d));
    }

    @Test
    public void test7837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7837");
        int int2 = org.apache.commons.math.util.FastMath.min(564, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test7838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7838");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.008879097553696258d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.008878980885221472d) + "'", double1 == (-0.008878980885221472d));
    }

    @Test
    public void test7839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7839");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.1053461109058813d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9959923525286914d + "'", double1 == 0.9959923525286914d);
    }

    @Test
    public void test7840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7840");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.1535845238145309d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4166015051703937d + "'", double1 == 1.4166015051703937d);
    }

    @Test
    public void test7841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7841");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.40893653071341846d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0847862898335785d + "'", double1 == 1.0847862898335785d);
    }

    @Test
    public void test7842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7842");
        double double1 = org.apache.commons.math.util.FastMath.acosh(8.044065639126247E-5d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7843");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.2023903267012446d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7844");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.4142135623730951d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7845");
        long long1 = org.apache.commons.math.util.FastMath.round(0.018814327862137076d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test7846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7846");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.40517925701617413d), 87.86797250243188d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.004611195338652399d) + "'", double2 == (-0.004611195338652399d));
    }

    @Test
    public void test7847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7847");
        int int2 = org.apache.commons.math.util.FastMath.min(16, 83);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
    }

    @Test
    public void test7848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7848");
        double double1 = org.apache.commons.math.util.FastMath.asinh(100.9642408323164d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.307938107407166d + "'", double1 == 5.307938107407166d);
    }

    @Test
    public void test7849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7849");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.170242506567483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7850");
        double double2 = org.apache.commons.math.util.FastMath.atan2(3.795936115902098d, 0.045392431815163135d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5588387313708774d + "'", double2 == 1.5588387313708774d);
    }

    @Test
    public void test7851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7851");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9443504370351302d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3351820637427309d + "'", double1 == 0.3351820637427309d);
    }

    @Test
    public void test7852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7852");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.275068378811894d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7853");
        long long1 = org.apache.commons.math.util.FastMath.round(68.98400770596488d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 69L + "'", long1 == 69L);
    }

    @Test
    public void test7854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7854");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.877060243390276d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.409913361063775d + "'", double1 == 1.409913361063775d);
    }

    @Test
    public void test7855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7855");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.5514523214622923d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test7856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7856");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.08645261777847496d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0037393557028285d + "'", double1 == 1.0037393557028285d);
    }

    @Test
    public void test7857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7857");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.6986857868719877d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 40.031746793541835d + "'", double1 == 40.031746793541835d);
    }

    @Test
    public void test7858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7858");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.24906032356353255d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.25170988290222607d) + "'", double1 == (-0.25170988290222607d));
    }

    @Test
    public void test7859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7859");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.060813326721670155d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0010613927803841934d) + "'", double1 == (-0.0010613927803841934d));
    }

    @Test
    public void test7860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7860");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.6842868307608122d), 0.19240232444172636d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6842868307608121d) + "'", double2 == (-0.6842868307608121d));
    }

    @Test
    public void test7861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7861");
        double double1 = org.apache.commons.math.util.FastMath.log((-2.713130608547954d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7862");
        long long2 = org.apache.commons.math.util.FastMath.max(4L, 51L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 51L + "'", long2 == 51L);
    }

    @Test
    public void test7863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7863");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) (byte) 100, 0.6861327785851723d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 23.564897614866904d + "'", double2 == 23.564897614866904d);
    }

    @Test
    public void test7864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7864");
        long long2 = org.apache.commons.math.util.FastMath.max(9223372036854775807L, 41L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
    }

    @Test
    public void test7865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7865");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.06632883173314777d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0011576565027447254d + "'", double1 == 0.0011576565027447254d);
    }

    @Test
    public void test7866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7866");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.4178805902828283d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7867");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 1.3845986357215d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test7868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7868");
        double double1 = org.apache.commons.math.util.FastMath.atanh(12.019343107182594d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7869");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9033391107665127d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7870");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.498241304416574d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-28.54712392216255d) + "'", double1 == (-28.54712392216255d));
    }

    @Test
    public void test7871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7871");
        double double1 = org.apache.commons.math.util.FastMath.cos(15.296003526156234d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9163378908166061d) + "'", double1 == (-0.9163378908166061d));
    }

    @Test
    public void test7872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7872");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.0295629067905003d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7873");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.4677992676220695d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2850531048749283d + "'", double1 == 2.2850531048749283d);
    }

    @Test
    public void test7874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7874");
        long long1 = org.apache.commons.math.util.FastMath.round(1.3216115088844413E-11d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test7875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7875");
        double double2 = org.apache.commons.math.util.FastMath.max(1.3496452317282857d, 2.2924316695611777d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2924316695611777d + "'", double2 == 2.2924316695611777d);
    }

    @Test
    public void test7876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7876");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.5751658111626728d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9579894991848626d + "'", double1 == 0.9579894991848626d);
    }

    @Test
    public void test7877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7877");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.059903262040248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0599032620402482d + "'", double1 == 1.0599032620402482d);
    }

    @Test
    public void test7878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7878");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9804989946001318d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19781162057140225d + "'", double1 == 0.19781162057140225d);
    }

    @Test
    public void test7879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7879");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.24769059955591424d, (double) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test7880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7880");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.0062173906847702d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7641929613515531d + "'", double1 == 0.7641929613515531d);
    }

    @Test
    public void test7881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7881");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-1.5424779445183978E-4d), (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5424779445183975E-4d) + "'", double2 == (-1.5424779445183975E-4d));
    }

    @Test
    public void test7882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7882");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9455557866374293d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7883");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.8674323532966371d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015139550603349008d + "'", double1 == 0.015139550603349008d);
    }

    @Test
    public void test7884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7884");
        double double1 = org.apache.commons.math.util.FastMath.atan(137.38927884571783d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5635178670076404d + "'", double1 == 1.5635178670076404d);
    }

    @Test
    public void test7885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7885");
        double double1 = org.apache.commons.math.util.FastMath.asinh(12.238292298814304d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1993819276481235d + "'", double1 == 3.1993819276481235d);
    }

    @Test
    public void test7886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7886");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.11975712045798752d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.12033293356356693d) + "'", double1 == (-0.12033293356356693d));
    }

    @Test
    public void test7887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7887");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9689105291896337d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test7888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7888");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.8918074856677578d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8918074856677579d + "'", double1 == 0.8918074856677579d);
    }

    @Test
    public void test7889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7889");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5521733681683334d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9141433760196229d + "'", double1 == 0.9141433760196229d);
    }

    @Test
    public void test7890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7890");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 35L, (float) 69L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 69.0f + "'", float2 == 69.0f);
    }

    @Test
    public void test7891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7891");
        int int2 = org.apache.commons.math.util.FastMath.min(16, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
    }

    @Test
    public void test7892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7892");
        int int2 = org.apache.commons.math.util.FastMath.min(1, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test7893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7893");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.19458415572564805d), (-0.27799377989205787d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test7894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7894");
        double double1 = org.apache.commons.math.util.FastMath.cosh(8.881784197001248E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7895");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.4953498621566668d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.40236020097336384d + "'", double1 == 0.40236020097336384d);
    }

    @Test
    public void test7896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7896");
        double double1 = org.apache.commons.math.util.FastMath.cosh(59.00015465023301d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1009300861002477E25d + "'", double1 == 2.1009300861002477E25d);
    }

    @Test
    public void test7897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7897");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.7545843389046754d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7285563280998666d + "'", double1 == 0.7285563280998666d);
    }

    @Test
    public void test7898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7898");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.8058871687495555d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6924714639225875d + "'", double1 == 0.6924714639225875d);
    }

    @Test
    public void test7899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7899");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 0, 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test7900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7900");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.21170821895742326d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21170821895742326d + "'", double1 == 0.21170821895742326d);
    }

    @Test
    public void test7901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7901");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.7497662776063796d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.643351509679445d + "'", double1 == 0.643351509679445d);
    }

    @Test
    public void test7902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7902");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.08037538236017182d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3877787807814457E-17d + "'", double1 == 1.3877787807814457E-17d);
    }

    @Test
    public void test7903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7903");
        int int2 = org.apache.commons.math.util.FastMath.max(1, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test7904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7904");
        double double2 = org.apache.commons.math.util.FastMath.max(2.1556157735575975E15d, 4.169533543042907d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1556157735575975E15d + "'", double2 == 2.1556157735575975E15d);
    }

    @Test
    public void test7905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7905");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.41881493312992785d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5201589976883458d + "'", double1 == 0.5201589976883458d);
    }

    @Test
    public void test7906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7906");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.44403286888919763d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.030890923830668d + "'", double1 == 2.030890923830668d);
    }

    @Test
    public void test7907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7907");
        double double1 = org.apache.commons.math.util.FastMath.tan((-3.9204788308384892d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.987060109182237d) + "'", double1 == (-0.987060109182237d));
    }

    @Test
    public void test7908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7908");
        int int2 = org.apache.commons.math.util.FastMath.min(100, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7909");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.8451846157611319d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.8655219413764765d) + "'", double1 == (-1.8655219413764765d));
    }

    @Test
    public void test7910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7910");
        double double2 = org.apache.commons.math.util.FastMath.min(0.6875573919608692d, 0.07270966677774478d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.07270966677774478d + "'", double2 == 0.07270966677774478d);
    }

    @Test
    public void test7911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7911");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.48549279735503514d), (-96.87824279114196d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.136581324737894d) + "'", double2 == (-3.136581324737894d));
    }

    @Test
    public void test7912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7912");
        double double1 = org.apache.commons.math.util.FastMath.log(0.7724076511504099d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.25824282279272437d) + "'", double1 == (-0.25824282279272437d));
    }

    @Test
    public void test7913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7913");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.4430227150499066d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.45896752092614523d + "'", double1 == 0.45896752092614523d);
    }

    @Test
    public void test7914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7914");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.99822295029797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test7915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7915");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.7896834592732402d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test7916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7916");
        double double2 = org.apache.commons.math.util.FastMath.pow(3.4124704496626688d, 1.8860316424407535E45d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test7917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7917");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5705297105245386d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9171099782237195d + "'", double1 == 0.9171099782237195d);
    }

    @Test
    public void test7918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7918");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 100, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test7919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7919");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 100, (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test7920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7920");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.0378978743822724d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.018114735207421163d + "'", double1 == 0.018114735207421163d);
    }

    @Test
    public void test7921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7921");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, Double.NaN);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test7922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7922");
        double double2 = org.apache.commons.math.util.FastMath.min(0.3516470133102479d, 0.4030062718424735d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3516470133102479d + "'", double2 == 0.3516470133102479d);
    }

    @Test
    public void test7923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7923");
        double double1 = org.apache.commons.math.util.FastMath.asin((-3.092409887937381d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7924");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8623188722876839d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8623188722876839d + "'", double1 == 0.8623188722876839d);
    }

    @Test
    public void test7925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7925");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9433259196114583d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.016464143216623296d + "'", double1 == 0.016464143216623296d);
    }

    @Test
    public void test7926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7926");
        int int2 = org.apache.commons.math.util.FastMath.max((int) 'a', 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test7927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7927");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 100, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test7928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7928");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 3280, (float) 1202604L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1202604.0f + "'", float2 == 1202604.0f);
    }

    @Test
    public void test7929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7929");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.019233140238467443d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.019231954668849867d + "'", double1 == 0.019231954668849867d);
    }

    @Test
    public void test7930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7930");
        double double1 = org.apache.commons.math.util.FastMath.log(1.2940397999592368d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2577689529157873d + "'", double1 == 0.2577689529157873d);
    }

    @Test
    public void test7931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7931");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) 36L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 36.0d + "'", double1 == 36.0d);
    }

    @Test
    public void test7932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7932");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9970418066336296d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.257421767558853d + "'", double1 == 3.257421767558853d);
    }

    @Test
    public void test7933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7933");
        int int2 = org.apache.commons.math.util.FastMath.min(6559, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test7934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7934");
        float float2 = org.apache.commons.math.util.FastMath.max(9.223372E18f, (float) 23L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test7935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7935");
        double double1 = org.apache.commons.math.util.FastMath.atanh(4.726172474886776d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7936");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(3.3980879737783396d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.39808797377834d + "'", double1 == 3.39808797377834d);
    }

    @Test
    public void test7937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7937");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.006846374908639821d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999765636668494d + "'", double1 == 0.9999765636668494d);
    }

    @Test
    public void test7938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7938");
        long long2 = org.apache.commons.math.util.FastMath.min(6559L, (long) 105);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 105L + "'", long2 == 105L);
    }

    @Test
    public void test7939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7939");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.0049514518537068d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7940");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9503508426863698d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9831685734046673d + "'", double1 == 0.9831685734046673d);
    }

    @Test
    public void test7941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7941");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.8414466887303463d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999550340122695d + "'", double1 == 0.9999550340122695d);
    }

    @Test
    public void test7942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7942");
        double double1 = org.apache.commons.math.util.FastMath.cos(32.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8342233605065064d + "'", double1 == 0.8342233605065064d);
    }

    @Test
    public void test7943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7943");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.6949916302120114d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8575469318578108d + "'", double1 == 0.8575469318578108d);
    }

    @Test
    public void test7944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7944");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.5594482377087571d), 3.591471064445103d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5594482377087571d) + "'", double2 == (-0.5594482377087571d));
    }

    @Test
    public void test7945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7945");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-2.307990021938211E-5d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.3079900217333068E-5d) + "'", double1 == (-2.3079900217333068E-5d));
    }

    @Test
    public void test7946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7946");
        double double1 = org.apache.commons.math.util.FastMath.log(1.5192931085450152d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.41824516651641247d + "'", double1 == 0.41824516651641247d);
    }

    @Test
    public void test7947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7947");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.47381472041431183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7795958460792296d + "'", double1 == 0.7795958460792296d);
    }

    @Test
    public void test7948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7948");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9130789561495837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.315570549581906d + "'", double1 == 52.315570549581906d);
    }

    @Test
    public void test7949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7949");
        double double1 = org.apache.commons.math.util.FastMath.asinh(8.296546582489277d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8125989009489683d + "'", double1 == 2.8125989009489683d);
    }

    @Test
    public void test7950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7950");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.6567042118906716d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7951");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.2698012268765735d, 149835.36406408335d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test7952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7952");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.5270148634788125d, 0.317146865907417d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0290692238685968d + "'", double2 == 1.0290692238685968d);
    }

    @Test
    public void test7953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7953");
        long long1 = org.apache.commons.math.util.FastMath.round(1.5860134523134298E15d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1586013452313430L + "'", long1 == 1586013452313430L);
    }

    @Test
    public void test7954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7954");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.9778302553902034d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test7955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7955");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.7605884021621934d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8721171951992424d + "'", double1 == 0.8721171951992424d);
    }

    @Test
    public void test7956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7956");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 100, 16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test7957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7957");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.8130089418575377d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.014189682883569176d + "'", double1 == 0.014189682883569176d);
    }

    @Test
    public void test7958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7958");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9966951177756361d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9966951177756361d + "'", double1 == 0.9966951177756361d);
    }

    @Test
    public void test7959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7959");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.3383347192042694E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3358347343868286E40d + "'", double1 == 2.3358347343868286E40d);
    }

    @Test
    public void test7960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7960");
        double double2 = org.apache.commons.math.util.FastMath.max(5.6640732741201365d, 9.221407309531983E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.6640732741201365d + "'", double2 == 5.6640732741201365d);
    }

    @Test
    public void test7961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7961");
        double double2 = org.apache.commons.math.util.FastMath.max(1.4900413211439332d, (-0.8781932128101281d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4900413211439332d + "'", double2 == 1.4900413211439332d);
    }
}

