import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

    public static boolean debug = false;

    @Test
    public void test5501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5501");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.7185364026199064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2351587359434276d + "'", double1 == 0.2351587359434276d);
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5502");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.8351015231807235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.265770234070143d + "'", double1 == 5.265770234070143d);
    }

    @Test
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5503");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.6699684639824476d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6699684639824476d + "'", double1 == 0.6699684639824476d);
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5504");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.1454450659800949d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5505");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.7182625987939137d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4505726674589844d) + "'", double1 == (-0.4505726674589844d));
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5506");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-1.2246467991473532E-16d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2246467991473532E-16d) + "'", double1 == (-1.2246467991473532E-16d));
    }

    @Test
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5507");
        double double2 = org.apache.commons.math.util.FastMath.max((-2.592236257454505d), 0.017455064928217585d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.017455064928217585d + "'", double2 == 0.017455064928217585d);
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5508");
        double double2 = org.apache.commons.math.util.FastMath.max(0.6955886362231636d, 1.030536856379932d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.030536856379932d + "'", double2 == 1.030536856379932d);
    }

    @Test
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5509");
        double double1 = org.apache.commons.math.util.FastMath.log10(5.590038910379708E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.252585169125315d) + "'", double1 == (-3.252585169125315d));
    }

    @Test
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5510");
        double double2 = org.apache.commons.math.util.FastMath.min(1.529468828731893d, 8.88178419700125E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.88178419700125E-16d + "'", double2 == 8.88178419700125E-16d);
    }

    @Test
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5511");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.167735703405218d, 7.2919553545008196d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 281.931214360923d + "'", double2 == 281.931214360923d);
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5512");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.3564962504917153d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02367532586203818d + "'", double1 == 0.02367532586203818d);
    }

    @Test
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5513");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.5656841938016288d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5514");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9577535432799731d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0431647958206752d) + "'", double1 == (-0.0431647958206752d));
    }

    @Test
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5515");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.2618589996500895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.600920695439653d + "'", double1 == 9.600920695439653d);
    }

    @Test
    public void test5516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5516");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.32179921168174863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0522257274488631d + "'", double1 == 1.0522257274488631d);
    }

    @Test
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5517");
        float float1 = org.apache.commons.math.util.FastMath.abs(4477855.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4477855.0f + "'", float1 == 4477855.0f);
    }

    @Test
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5518");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.017438277374752006d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017440045319705992d) + "'", double1 == (-0.017440045319705992d));
    }

    @Test
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5519");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.9349901766807889d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5520");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.0481349678163028d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.888220740267501d + "'", double1 == 0.888220740267501d);
    }

    @Test
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5521");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.45737502830978294d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4289700495324938d + "'", double1 == 0.4289700495324938d);
    }

    @Test
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5522");
        double double1 = org.apache.commons.math.util.FastMath.log10((-1.1364083366959243d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5523");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 793006726156715L, (float) 793006726156715L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.9300672E14f + "'", float2 == 7.9300672E14f);
    }

    @Test
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5524");
        double double1 = org.apache.commons.math.util.FastMath.cos(90.00000004020679d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4480736520739018d) + "'", double1 == (-0.4480736520739018d));
    }

    @Test
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5525");
        double double2 = org.apache.commons.math.util.FastMath.max(37.40464270515639d, 0.9822255582717379d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 37.40464270515639d + "'", double2 == 37.40464270515639d);
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5526");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.015058070638819365d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5527");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.3017603360460153d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11453103468260846d + "'", double1 == 0.11453103468260846d);
    }

    @Test
    public void test5528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5528");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5529");
        double double1 = org.apache.commons.math.util.FastMath.log(0.2461900271072904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4016515733337434d) + "'", double1 == (-1.4016515733337434d));
    }

    @Test
    public void test5530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5530");
        double double1 = org.apache.commons.math.util.FastMath.abs((-1.1189396031849523d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1189396031849523d + "'", double1 == 1.1189396031849523d);
    }

    @Test
    public void test5531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5531");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9350771598391504d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.06712622920621965d) + "'", double1 == (-0.06712622920621965d));
    }

    @Test
    public void test5532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5532");
        double double1 = org.apache.commons.math.util.FastMath.rint(5068.8763808433d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5069.0d + "'", double1 == 5069.0d);
    }

    @Test
    public void test5533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5533");
        double double1 = org.apache.commons.math.util.FastMath.log(1.2256904788257033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.20350434138645837d + "'", double1 == 0.20350434138645837d);
    }

    @Test
    public void test5534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5534");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.7702828829128011d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01344397247858235d) + "'", double1 == (-0.01344397247858235d));
    }

    @Test
    public void test5535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5535");
        double double1 = org.apache.commons.math.util.FastMath.asinh(199.00499987500626d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.986483442563748d + "'", double1 == 5.986483442563748d);
    }

    @Test
    public void test5536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5536");
        double double2 = org.apache.commons.math.util.FastMath.max(1.5707963267948961d, 0.5896069690147183d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948961d + "'", double2 == 1.5707963267948961d);
    }

    @Test
    public void test5537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5537");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.23664550481769292d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5538");
        long long1 = org.apache.commons.math.util.FastMath.round(0.033377737685972374d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test5539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5539");
        double double2 = org.apache.commons.math.util.FastMath.max(0.983031862437426d, 1.5563025007672873d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5563025007672873d + "'", double2 == 1.5563025007672873d);
    }

    @Test
    public void test5540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5540");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 35L, (float) 53L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 53.0f + "'", float2 == 53.0f);
    }

    @Test
    public void test5541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5541");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.0105291415464854d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5542");
        double double1 = org.apache.commons.math.util.FastMath.floor(43.66827237527655d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 43.0d + "'", double1 == 43.0d);
    }

    @Test
    public void test5543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5543");
        double double1 = org.apache.commons.math.util.FastMath.tanh(11014.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5544");
        double double1 = org.apache.commons.math.util.FastMath.signum(37.40464270515639d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5545");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) 4.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test5546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5546");
        int int2 = org.apache.commons.math.util.FastMath.max((int) ' ', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test5547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5547");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.6931471805599463d, 0.7421640100660715d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7512607668762089d + "'", double2 == 0.7512607668762089d);
    }

    @Test
    public void test5548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5548");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.18115812444149643d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1821639330059432d) + "'", double1 == (-0.1821639330059432d));
    }

    @Test
    public void test5549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5549");
        double double1 = org.apache.commons.math.util.FastMath.rint(28.476411608537195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 28.0d + "'", double1 == 28.0d);
    }

    @Test
    public void test5550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5550");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.8461684323333872d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test5551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5551");
        double double1 = org.apache.commons.math.util.FastMath.log10(34.99999999540764d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5440680442932917d + "'", double1 == 1.5440680442932917d);
    }

    @Test
    public void test5552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5552");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.6699175736806615d, 3.162277660168379d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4858539886678194d + "'", double2 == 0.4858539886678194d);
    }

    @Test
    public void test5553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5553");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 28);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.27090578830786904d + "'", double1 == 0.27090578830786904d);
    }

    @Test
    public void test5554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5554");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 1, (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test5555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5555");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.2117649211245782d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2149882416150459d + "'", double1 == 0.2149882416150459d);
    }

    @Test
    public void test5556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5556");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.01718962461003295d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017339081420988972d) + "'", double1 == (-0.017339081420988972d));
    }

    @Test
    public void test5557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5557");
        double double1 = org.apache.commons.math.util.FastMath.tanh(288.95123313714026d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5558");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.8554182836643193d), 405.30084950781344d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test5559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5559");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.8572314663028362d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.049853137223771d + "'", double1 == 1.049853137223771d);
    }

    @Test
    public void test5560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5560");
        long long1 = org.apache.commons.math.util.FastMath.round(1.3282591577868472d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test5561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5561");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.5479174221765761d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5562");
        double double2 = org.apache.commons.math.util.FastMath.min(1.40429714988426d, 6.691673596021348E41d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.40429714988426d + "'", double2 == 1.40429714988426d);
    }

    @Test
    public void test5563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5563");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-10.374583898014649d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-16017.492999826993d) + "'", double1 == (-16017.492999826993d));
    }

    @Test
    public void test5564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5564");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.4480736520739018d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3611423708902208d) + "'", double1 == (-0.3611423708902208d));
    }

    @Test
    public void test5565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5565");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.493777178147216d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5410431391696334d + "'", double1 == 0.5410431391696334d);
    }

    @Test
    public void test5566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5566");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.2014038779280567d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5567");
        double double2 = org.apache.commons.math.util.FastMath.min(0.01417015866070404d, (-0.5573691630451039d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5573691630451039d) + "'", double2 == (-0.5573691630451039d));
    }

    @Test
    public void test5568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5568");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.02563295851681163d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5964320931584124d + "'", double1 == 1.5964320931584124d);
    }

    @Test
    public void test5569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5569");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 4477855L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4477855.0f + "'", float2 == 4477855.0f);
    }

    @Test
    public void test5570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5570");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-4.536148481055609d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-259.90216320916545d) + "'", double1 == (-259.90216320916545d));
    }

    @Test
    public void test5571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5571");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.419216020537747d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5065221217444504d + "'", double1 == 1.5065221217444504d);
    }

    @Test
    public void test5572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5572");
        double double1 = org.apache.commons.math.util.FastMath.sinh(11013.232874703395d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5573");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.5553313201112098d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9993932696191532d + "'", double1 == 0.9993932696191532d);
    }

    @Test
    public void test5574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5574");
        double double2 = org.apache.commons.math.util.FastMath.min(0.28738952988751526d, 1.0596843711268005d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.28738952988751526d + "'", double2 == 0.28738952988751526d);
    }

    @Test
    public void test5575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5575");
        double double1 = org.apache.commons.math.util.FastMath.log(0.08368912628241729d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.480646222919951d) + "'", double1 == (-2.480646222919951d));
    }

    @Test
    public void test5576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5576");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-1.4214298233873417d), 0.7699888226765638d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.4214298233873415d) + "'", double2 == (-1.4214298233873415d));
    }

    @Test
    public void test5577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5577");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8718862068518762d, 4.6540468455730294E-27d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8718862068518761d + "'", double2 == 0.8718862068518761d);
    }

    @Test
    public void test5578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5578");
        float float2 = org.apache.commons.math.util.FastMath.max(2.14748365E9f, (float) 32L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test5579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5579");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.019180341523815665d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0989526189341596d + "'", double1 == 1.0989526189341596d);
    }

    @Test
    public void test5580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5580");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.5223956895814861d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4814032181812175d + "'", double1 == 0.4814032181812175d);
    }

    @Test
    public void test5581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5581");
        float float2 = org.apache.commons.math.util.FastMath.min(5.0f, (float) 2);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test5582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5582");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9697059811445589d, 0.5585053606381855d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5585053606381855d + "'", double2 == 0.5585053606381855d);
    }

    @Test
    public void test5583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5583");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.6250159944861234d, (-0.9796516822121061d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5737008837680104d + "'", double2 == 2.5737008837680104d);
    }

    @Test
    public void test5584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5584");
        double double1 = org.apache.commons.math.util.FastMath.asinh(52.45232219780884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.653142644460657d + "'", double1 == 4.653142644460657d);
    }

    @Test
    public void test5585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5585");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 52L, 32.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test5586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5586");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.7162579075638862d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.779091278954217d + "'", double1 == 0.779091278954217d);
    }

    @Test
    public void test5587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5587");
        double double2 = org.apache.commons.math.util.FastMath.pow(12.242700776533084d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5588");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.9210509322442526d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5589");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.9349901766807889d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.923976038617364d + "'", double1 == 6.923976038617364d);
    }

    @Test
    public void test5590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5590");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(67.40322401739334d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.069679639162746d + "'", double1 == 4.069679639162746d);
    }

    @Test
    public void test5591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5591");
        double double1 = org.apache.commons.math.util.FastMath.log1p(4973.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.51197962436335d + "'", double1 == 8.51197962436335d);
    }

    @Test
    public void test5592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5592");
        double double1 = org.apache.commons.math.util.FastMath.atan(8.881784197001254E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001254E-16d + "'", double1 == 8.881784197001254E-16d);
    }

    @Test
    public void test5593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5593");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9952563459747216d, 0.007812579475042568d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.007812579475042568d + "'", double2 == 0.007812579475042568d);
    }

    @Test
    public void test5594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5594");
        int int2 = org.apache.commons.math.util.FastMath.max((-115), 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test5595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5595");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 100, 4L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test5596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5596");
        double double1 = org.apache.commons.math.util.FastMath.atanh(4.632512904931238d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5597");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.0221870678414093d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 58.56700486016551d + "'", double1 == 58.56700486016551d);
    }

    @Test
    public void test5598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5598");
        double double1 = org.apache.commons.math.util.FastMath.ceil(78.69006752597979d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 79.0d + "'", double1 == 79.0d);
    }

    @Test
    public void test5599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5599");
        double double1 = org.apache.commons.math.util.FastMath.log(1.0390143537125156d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.038272526951901455d + "'", double1 == 0.038272526951901455d);
    }

    @Test
    public void test5600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5600");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.46627444884951624d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1106897560020559d + "'", double1 == 1.1106897560020559d);
    }

    @Test
    public void test5601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5601");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.7424877582997027d, 2.3505504618025204d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4966479748217987d + "'", double2 == 0.4966479748217987d);
    }

    @Test
    public void test5602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5602");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 2062.6480624709634d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test5603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5603");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.4210854715202007E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5604");
        double double1 = org.apache.commons.math.util.FastMath.abs((-7.52574989159953d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.52574989159953d + "'", double1 == 7.52574989159953d);
    }

    @Test
    public void test5605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5605");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.8300978655089688d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5606");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.4289700495324938d, 0.8214948155164382d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4989311994917956d + "'", double2 == 0.4989311994917956d);
    }

    @Test
    public void test5607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5607");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.980232238769531E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7075472925031875E-6d + "'", double1 == 1.7075472925031875E-6d);
    }

    @Test
    public void test5608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5608");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test5609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5609");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.6842868307608122d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5610");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.3859684164526524d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36787944117144233d + "'", double1 == 0.36787944117144233d);
    }

    @Test
    public void test5611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5611");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9016563503921403d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5612");
        float float1 = org.apache.commons.math.util.FastMath.abs(2063.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2063.0f + "'", float1 == 2063.0f);
    }

    @Test
    public void test5613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5613");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.007812579475042568d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.562983667842386d + "'", double1 == 1.562983667842386d);
    }

    @Test
    public void test5614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5614");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test5615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5615");
        double double1 = org.apache.commons.math.util.FastMath.exp(35.46556569423d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5263846769253795E15d + "'", double1 == 2.5263846769253795E15d);
    }

    @Test
    public void test5616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5616");
        double double1 = org.apache.commons.math.util.FastMath.acosh(8388608.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16.635532333438682d + "'", double1 == 16.635532333438682d);
    }

    @Test
    public void test5617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5617");
        double double2 = org.apache.commons.math.util.FastMath.max(0.32179921168174863d, 0.5661631704961736d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5661631704961736d + "'", double2 == 0.5661631704961736d);
    }

    @Test
    public void test5618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5618");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.6931471805599463d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7500000000000012d + "'", double1 == 0.7500000000000012d);
    }

    @Test
    public void test5619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5619");
        int int2 = org.apache.commons.math.util.FastMath.max(52, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test5620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5620");
        double double2 = org.apache.commons.math.util.FastMath.max(33.85767924684394d, 229.1831180523293d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 229.1831180523293d + "'", double2 == 229.1831180523293d);
    }

    @Test
    public void test5621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5621");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.7001797585188416d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test5622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5622");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-1.2861574922647803E-250d), 5.298292365610485d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.427494376514244E-251d) + "'", double2 == (-2.427494376514244E-251d));
    }

    @Test
    public void test5623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5623");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.016455121993179136d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5624");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.9251475365964139d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3273845772164696d) + "'", double1 == (-1.3273845772164696d));
    }

    @Test
    public void test5625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5625");
        double double2 = org.apache.commons.math.util.FastMath.max(2.0133109241786307d, 1.5512127510085636d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0133109241786307d + "'", double2 == 2.0133109241786307d);
    }

    @Test
    public void test5626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5626");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.198408826999716d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test5627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5627");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.4573750283097829d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.42897004953249374d + "'", double1 == 0.42897004953249374d);
    }

    @Test
    public void test5628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5628");
        double double1 = org.apache.commons.math.util.FastMath.expm1(22.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.584912845131592E9d + "'", double1 == 3.584912845131592E9d);
    }

    @Test
    public void test5629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5629");
        double double2 = org.apache.commons.math.util.FastMath.min(0.3483380896528481d, 0.8414709827920579d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3483380896528481d + "'", double2 == 0.3483380896528481d);
    }

    @Test
    public void test5630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5630");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.5013507798060324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.128330879172867d + "'", double1 == 1.128330879172867d);
    }

    @Test
    public void test5631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5631");
        double double1 = org.apache.commons.math.util.FastMath.acos(9.044524487391685E157d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5632");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9009272373598115d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 51.61932834909814d + "'", double1 == 51.61932834909814d);
    }

    @Test
    public void test5633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5633");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.7473086252997854d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3245616965685951d + "'", double1 == 1.3245616965685951d);
    }

    @Test
    public void test5634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5634");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '#', (-36));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test5635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5635");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.2441875297784895d), (-0.8898968261331758d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test5636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5636");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.2204460492503128E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-15.653559774527022d) + "'", double1 == (-15.653559774527022d));
    }

    @Test
    public void test5637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5637");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.7612492183413339d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9130802587818665d + "'", double1 == 0.9130802587818665d);
    }

    @Test
    public void test5638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5638");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(7.516258181075712E96d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.516258181075711E96d + "'", double2 == 7.516258181075711E96d);
    }

    @Test
    public void test5639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5639");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8323529090607977d, (-0.01344397247858235d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8323529090607976d + "'", double2 == 0.8323529090607976d);
    }

    @Test
    public void test5640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5640");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.5777877754722899d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8328934556322386d) + "'", double1 == (-0.8328934556322386d));
    }

    @Test
    public void test5641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5641");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 100, (float) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test5642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5642");
        double double1 = org.apache.commons.math.util.FastMath.log(1.7629292891930137d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5669767943827968d + "'", double1 == 0.5669767943827968d);
    }

    @Test
    public void test5643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5643");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 53, (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test5644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5644");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017453292519943295d) + "'", double1 == (-0.017453292519943295d));
    }

    @Test
    public void test5645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5645");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9975865056243414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9975865056243414d + "'", double1 == 0.9975865056243414d);
    }

    @Test
    public void test5646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5646");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.013125840905313d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 58.047834799516934d + "'", double1 == 58.047834799516934d);
    }

    @Test
    public void test5647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5647");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.015406296237756672d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015406296237756672d + "'", double1 == 0.015406296237756672d);
    }

    @Test
    public void test5648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5648");
        double double1 = org.apache.commons.math.util.FastMath.tanh(14.323944878270579d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999992766d + "'", double1 == 0.9999999999992766d);
    }

    @Test
    public void test5649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5649");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 61.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 61.0d + "'", double1 == 61.0d);
    }

    @Test
    public void test5650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5650");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.7212254887267799d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7652264863963173d + "'", double1 == 0.7652264863963173d);
    }

    @Test
    public void test5651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5651");
        long long1 = org.apache.commons.math.util.FastMath.round(1.1555698629817919d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test5652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5652");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.5769476754472138d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5489574575371663d + "'", double1 == 0.5489574575371663d);
    }

    @Test
    public void test5653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5653");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 10, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test5654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5654");
        double double2 = org.apache.commons.math.util.FastMath.pow(20.085536923187668d, 0.8788236337430255d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 13.963836789530315d + "'", double2 == 13.963836789530315d);
    }

    @Test
    public void test5655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5655");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-1.3609952876549178d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0782392590210543d + "'", double1 == 2.0782392590210543d);
    }

    @Test
    public void test5656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5656");
        long long2 = org.apache.commons.math.util.FastMath.min((long) ' ', (-3L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3L) + "'", long2 == (-3L));
    }

    @Test
    public void test5657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5657");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.7370361196913022d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test5658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5658");
        long long2 = org.apache.commons.math.util.FastMath.min(4477855L, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test5659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5659");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 1, (long) 11013);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test5660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5660");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.0842021724855044E-19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0842021724855044E-19d + "'", double1 == 1.0842021724855044E-19d);
    }

    @Test
    public void test5661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5661");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(24.678686683130433d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 24.678686683130437d + "'", double1 == 24.678686683130437d);
    }

    @Test
    public void test5662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5662");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.43930669835763825d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5785812223437699d) + "'", double1 == (-0.5785812223437699d));
    }

    @Test
    public void test5663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5663");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.013597097873114517d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999075608889144d + "'", double1 == 0.9999075608889144d);
    }

    @Test
    public void test5664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5664");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.1045617373477326d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9871316494039277d + "'", double1 == 1.9871316494039277d);
    }

    @Test
    public void test5665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5665");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(11.267396586565031d, (-0.007423096440071042d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11.26739658656503d + "'", double2 == 11.26739658656503d);
    }

    @Test
    public void test5666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5666");
        double double2 = org.apache.commons.math.util.FastMath.min(0.7162579075638862d, 1.1850304425981046d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7162579075638862d + "'", double2 == 0.7162579075638862d);
    }

    @Test
    public void test5667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5667");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.0549780757198273d, (-0.4742570847547076d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9932694174888552d + "'", double2 == 1.9932694174888552d);
    }

    @Test
    public void test5668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5668");
        double double1 = org.apache.commons.math.util.FastMath.ulp(16.03457109897233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.552713678800501E-15d + "'", double1 == 3.552713678800501E-15d);
    }

    @Test
    public void test5669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5669");
        int int2 = org.apache.commons.math.util.FastMath.min((-115), (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-115) + "'", int2 == (-115));
    }

    @Test
    public void test5670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5670");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 3L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test5671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5671");
        int int2 = org.apache.commons.math.util.FastMath.max(97, 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test5672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5672");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.7075472925031875E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5673");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.014458637267179124d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.014459141040746276d + "'", double1 == 0.014459141040746276d);
    }

    @Test
    public void test5674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5674");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.971901295783916d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.012377838852570225d) + "'", double1 == (-0.012377838852570225d));
    }

    @Test
    public void test5675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5675");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8373564163103412d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.938699128765109d + "'", double1 == 0.938699128765109d);
    }

    @Test
    public void test5676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5676");
        double double2 = org.apache.commons.math.util.FastMath.min(36.000000000000014d, 1.7075472925031877E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7075472925031877E-6d + "'", double2 == 1.7075472925031877E-6d);
    }

    @Test
    public void test5677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5677");
        double double1 = org.apache.commons.math.util.FastMath.signum(4.8679319012240025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5678");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 52.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5679");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.0232274785474735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7968780678647089d + "'", double1 == 0.7968780678647089d);
    }

    @Test
    public void test5680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5680");
        double double1 = org.apache.commons.math.util.FastMath.asinh(3121.3640828137964d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.739172597506503d + "'", double1 == 8.739172597506503d);
    }

    @Test
    public void test5681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5681");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-1.2052372928768276d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0642022850401216d) + "'", double1 == (-1.0642022850401216d));
    }

    @Test
    public void test5682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5682");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.706390147061685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.706390147061685d + "'", double1 == 1.706390147061685d);
    }

    @Test
    public void test5683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5683");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 0, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test5684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5684");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.3769270190230555d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3680649538063987d + "'", double1 == 0.3680649538063987d);
    }

    @Test
    public void test5685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5685");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.5563025007672873d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9385618787955408d + "'", double1 == 0.9385618787955408d);
    }

    @Test
    public void test5686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5686");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.013875824602429277d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5687");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.5459079327750913d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.024885824654119138d + "'", double1 == 0.024885824654119138d);
    }

    @Test
    public void test5688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5688");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(5.590038619245502E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.590038619245503E-4d + "'", double1 == 5.590038619245503E-4d);
    }

    @Test
    public void test5689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5689");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.09901443649234584d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.31466559470705696d + "'", double1 == 0.31466559470705696d);
    }

    @Test
    public void test5690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5690");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.1526029135263929d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7666777673389189d + "'", double1 == 0.7666777673389189d);
    }

    @Test
    public void test5691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5691");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.4856741544225798d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.218882338219149d + "'", double1 == 1.218882338219149d);
    }

    @Test
    public void test5692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5692");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3282.8063500117437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5693");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.5427661770824743d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.677511216267253d + "'", double1 == 3.677511216267253d);
    }

    @Test
    public void test5694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5694");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.10666980032367356d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.10626796129410888d) + "'", double1 == (-0.10626796129410888d));
    }

    @Test
    public void test5695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5695");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 5L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.0f + "'", float1 == 5.0f);
    }

    @Test
    public void test5696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5696");
        double double1 = org.apache.commons.math.util.FastMath.cosh(229.1831180523293d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7058212483549011E99d + "'", double1 == 1.7058212483549011E99d);
    }

    @Test
    public void test5697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5697");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 52L, 3.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test5698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5698");
        double double2 = org.apache.commons.math.util.FastMath.min(7.93006726156715E14d, 6.298292365610484d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.298292365610484d + "'", double2 == 6.298292365610484d);
    }

    @Test
    public void test5699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5699");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.1720048136876373d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5784258930966143d + "'", double1 == 0.5784258930966143d);
    }

    @Test
    public void test5700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5700");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.017438277374752006d), 0.7215087615242686d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.017438277374752006d) + "'", double2 == (-0.017438277374752006d));
    }

    @Test
    public void test5701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5701");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.17364817766693033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18963695133799308d + "'", double1 == 0.18963695133799308d);
    }

    @Test
    public void test5702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5702");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(4.691029831908528d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08187391587607998d + "'", double1 == 0.08187391587607998d);
    }

    @Test
    public void test5703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5703");
        long long1 = org.apache.commons.math.util.FastMath.abs(53L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 53L + "'", long1 == 53L);
    }

    @Test
    public void test5704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5704");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.6630829213736404d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5705");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.8124637725080135d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9331139203296678d + "'", double1 == 0.9331139203296678d);
    }

    @Test
    public void test5706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5706");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 2155615773557598L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.15561577E15f + "'", float1 == 2.15561577E15f);
    }

    @Test
    public void test5707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5707");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.6858376391226194d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.881875150563274d + "'", double1 == 0.881875150563274d);
    }

    @Test
    public void test5708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5708");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(31.306852819440046d, 1.6158008682147178d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 31.306852819440042d + "'", double2 == 31.306852819440042d);
    }

    @Test
    public void test5709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5709");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(8.270624161294801d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14434962280958885d + "'", double1 == 0.14434962280958885d);
    }

    @Test
    public void test5710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5710");
        double double1 = org.apache.commons.math.util.FastMath.sin(630998.4197775756d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.11030121080009957d) + "'", double1 == (-0.11030121080009957d));
    }

    @Test
    public void test5711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5711");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 57, (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test5712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5712");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.287543329097423d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test5713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5713");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.4023892583804743d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9201279448875392d + "'", double1 == 0.9201279448875392d);
    }

    @Test
    public void test5714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5714");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.8825659038653866d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5715");
        double double1 = org.apache.commons.math.util.FastMath.signum(1477895.5237242084d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5716");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.2024664181803648d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5717");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test5718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5718");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 100, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test5719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5719");
        double double1 = org.apache.commons.math.util.FastMath.ulp(14.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test5720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5720");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, (-2L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test5721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5721");
        int int1 = org.apache.commons.math.util.FastMath.abs((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test5722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5722");
        double double1 = org.apache.commons.math.util.FastMath.rint(15.272626674815957d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.0d + "'", double1 == 15.0d);
    }

    @Test
    public void test5723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5723");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 28, (long) 61);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 61L + "'", long2 == 61L);
    }

    @Test
    public void test5724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5724");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5725");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.5572942752342611d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5726");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8788236337430255d, 1.5656841938016288d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8168979791449944d + "'", double2 == 0.8168979791449944d);
    }

    @Test
    public void test5727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5727");
        double double1 = org.apache.commons.math.util.FastMath.cosh(11.077668423659947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32354.91574275393d + "'", double1 == 32354.91574275393d);
    }

    @Test
    public void test5728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5728");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9594878221418731d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6103591628169576d + "'", double1 == 2.6103591628169576d);
    }

    @Test
    public void test5729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5729");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.0481349678163028d, 3.0517578125E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0481349678163023d + "'", double2 == 2.0481349678163023d);
    }

    @Test
    public void test5730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5730");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.4274266235030733d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15455379269598704d + "'", double1 == 0.15455379269598704d);
    }

    @Test
    public void test5731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5731");
        int int2 = org.apache.commons.math.util.FastMath.min(28, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 28 + "'", int2 == 28);
    }

    @Test
    public void test5732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5732");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.8059788673771909d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.238886999985516d + "'", double1 == 1.238886999985516d);
    }

    @Test
    public void test5733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5733");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.7051700342143223d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2167132734129704d + "'", double1 == 1.2167132734129704d);
    }

    @Test
    public void test5734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5734");
        double double1 = org.apache.commons.math.util.FastMath.sin(573.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9425345992440989d + "'", double1 == 0.9425345992440989d);
    }

    @Test
    public void test5735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5735");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 57);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 57 + "'", int1 == 57);
    }

    @Test
    public void test5736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5736");
        double double1 = org.apache.commons.math.util.FastMath.ulp(75.13548422015074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test5737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5737");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.2735244882819095d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5738");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 10, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test5739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5739");
        int int2 = org.apache.commons.math.util.FastMath.min(52, 28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 28 + "'", int2 == 28);
    }

    @Test
    public void test5740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5740");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.14481870237280076d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5741");
        double double2 = org.apache.commons.math.util.FastMath.min(0.4251053392695819d, (-0.7553181134071862d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7553181134071862d) + "'", double2 == (-0.7553181134071862d));
    }

    @Test
    public void test5742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5742");
        float float2 = org.apache.commons.math.util.FastMath.max(52.0f, 4477855.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4477855.0f + "'", float2 == 4477855.0f);
    }

    @Test
    public void test5743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5743");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.2538007084319281d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.00442965800603128d + "'", double1 == 0.00442965800603128d);
    }

    @Test
    public void test5744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5744");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.3773411238234914d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test5745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5745");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) (-53));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5746");
        double double1 = org.apache.commons.math.util.FastMath.sinh(92560.48544260226d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5747");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9903301413773637d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.009716915305559275d) + "'", double1 == (-0.009716915305559275d));
    }

    @Test
    public void test5748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5748");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.5414729998706594d, 1.8842619154287341d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5414729998706596d + "'", double2 == 0.5414729998706596d);
    }

    @Test
    public void test5749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5749");
        long long1 = org.apache.commons.math.util.FastMath.abs(34L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 34L + "'", long1 == 34L);
    }

    @Test
    public void test5750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5750");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.24643471584737353d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-14.119669143560207d) + "'", double1 == (-14.119669143560207d));
    }

    @Test
    public void test5751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5751");
        double double1 = org.apache.commons.math.util.FastMath.signum((-11.552453009332421d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5752");
        float float2 = org.apache.commons.math.util.FastMath.min(11013.0f, (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test5753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5753");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.8792846300053567d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5754");
        double double1 = org.apache.commons.math.util.FastMath.asin(56.93525951038501d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5755");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5756");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.5572942752342611d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.478333999970658d + "'", double1 == 2.478333999970658d);
    }

    @Test
    public void test5757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5757");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) (-3L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.049787068367863944d + "'", double1 == 0.049787068367863944d);
    }

    @Test
    public void test5758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5758");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.5999999999999996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.694732228393676d + "'", double1 == 6.694732228393676d);
    }

    @Test
    public void test5759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5759");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) (-9223372036854775808L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9.2233720368547748E18d) + "'", double1 == (-9.2233720368547748E18d));
    }

    @Test
    public void test5760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5760");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 2063L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2063.0f + "'", float1 == 2063.0f);
    }

    @Test
    public void test5761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5761");
        double double1 = org.apache.commons.math.util.FastMath.cos(4.644483341943246d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0678534630003934d) + "'", double1 == (-0.0678534630003934d));
    }

    @Test
    public void test5762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5762");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 97L, (float) 2063L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2063.0f + "'", float2 == 2063.0f);
    }

    @Test
    public void test5763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5763");
        double double2 = org.apache.commons.math.util.FastMath.max(3.584912845131592E9d, 11013.232874695796d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.584912845131592E9d + "'", double2 == 3.584912845131592E9d);
    }

    @Test
    public void test5764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5764");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-1.5574077246549023d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9149994957367078d) + "'", double1 == (-0.9149994957367078d));
    }

    @Test
    public void test5765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5765");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.7853981633974483d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8686709614860095d) + "'", double1 == (-0.8686709614860095d));
    }

    @Test
    public void test5766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5766");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.0965832309956893d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.533811507790112d + "'", double1 == 5.533811507790112d);
    }

    @Test
    public void test5767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5767");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.8140679949148034d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5768");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 97L, (float) 32L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test5769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5769");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.9171523356672744d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0512497153941978d) + "'", double1 == (-1.0512497153941978d));
    }

    @Test
    public void test5770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5770");
        double double2 = org.apache.commons.math.util.FastMath.min(1.0866466588126182d, 0.8402550739104362d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8402550739104362d + "'", double2 == 0.8402550739104362d);
    }

    @Test
    public void test5771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5771");
        double double2 = org.apache.commons.math.util.FastMath.min(3.414062290979883d, 1.7058212483549011E99d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.414062290979883d + "'", double2 == 3.414062290979883d);
    }

    @Test
    public void test5772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5772");
        long long1 = org.apache.commons.math.util.FastMath.round(1.008360251176708d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test5773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5773");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 57, (float) 53L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test5774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5774");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.8693235746902677d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.645343411117965d + "'", double1 == 0.645343411117965d);
    }

    @Test
    public void test5775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5775");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.5440211108893698d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8556343548213666d + "'", double1 == 0.8556343548213666d);
    }

    @Test
    public void test5776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5776");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.641678208992432d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5985406840781461d + "'", double1 == 0.5985406840781461d);
    }

    @Test
    public void test5777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5777");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-53), (-3L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-53L) + "'", long2 == (-53L));
    }

    @Test
    public void test5778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5778");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.03492076949174773d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03553765937419076d + "'", double1 == 0.03553765937419076d);
    }

    @Test
    public void test5779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5779");
        double double1 = org.apache.commons.math.util.FastMath.log10(32.677071525546346d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5142431287268616d + "'", double1 == 1.5142431287268616d);
    }

    @Test
    public void test5780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5780");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-2.5049299044217186d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.043719274363825854d) + "'", double1 == (-0.043719274363825854d));
    }

    @Test
    public void test5781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5781");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.6105647004975028d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5782");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.32468210900718336d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3306756088874898d) + "'", double1 == (-0.3306756088874898d));
    }

    @Test
    public void test5783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5783");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.37960773902752176d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.006625404912081632d + "'", double1 == 0.006625404912081632d);
    }

    @Test
    public void test5784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5784");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.1850304425981046d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8698775629777257d + "'", double1 == 0.8698775629777257d);
    }

    @Test
    public void test5785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5785");
        double double1 = org.apache.commons.math.util.FastMath.asin((-2.1928939093273927d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5786");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.99822295029797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.049875621120893d + "'", double1 == 20.049875621120893d);
    }

    @Test
    public void test5787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5787");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9623033716478188d, 0.8427269113676636d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8515477441508226d + "'", double2 == 0.8515477441508226d);
    }

    @Test
    public void test5788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5788");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.2759872104089567d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05717676307486055d + "'", double1 == 0.05717676307486055d);
    }

    @Test
    public void test5789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5789");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 0L, (float) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5790");
        double double1 = org.apache.commons.math.util.FastMath.signum((-1.5574077246549023d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5791");
        double double2 = org.apache.commons.math.util.FastMath.max((-2.5049299044217186d), 5068.8763808433d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5068.8763808433d + "'", double2 == 5068.8763808433d);
    }

    @Test
    public void test5792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5792");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.8792846300053567d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7702828829128011d + "'", double1 == 0.7702828829128011d);
    }

    @Test
    public void test5793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5793");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.6051551910487805d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.21813323696198497d) + "'", double1 == (-0.21813323696198497d));
    }

    @Test
    public void test5794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5794");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9617542719885633d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6162821204491213d + "'", double1 == 2.6162821204491213d);
    }

    @Test
    public void test5795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5795");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.6866289917030872d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5796");
        double double1 = org.apache.commons.math.util.FastMath.asin(2488.324087887704d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5797");
        float float2 = org.apache.commons.math.util.FastMath.max(35.0f, (float) 1477896);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1477896.0f + "'", float2 == 1477896.0f);
    }

    @Test
    public void test5798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5798");
        double double1 = org.apache.commons.math.util.FastMath.log1p(140.3454242220617d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.951206711645765d + "'", double1 == 4.951206711645765d);
    }

    @Test
    public void test5799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5799");
        double double1 = org.apache.commons.math.util.FastMath.cos(30.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15425144988758405d + "'", double1 == 0.15425144988758405d);
    }

    @Test
    public void test5800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5800");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 0, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5801");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-115), 2.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-115.0f) + "'", float2 == (-115.0f));
    }

    @Test
    public void test5802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5802");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.3477823395416573d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3477823395416573d + "'", double1 == 0.3477823395416573d);
    }

    @Test
    public void test5803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5803");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.7702828829128011d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8487475964136366d) + "'", double1 == (-0.8487475964136366d));
    }

    @Test
    public void test5804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5804");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5805");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.841317126163967d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6994315602193237d + "'", double1 == 0.6994315602193237d);
    }

    @Test
    public void test5806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5806");
        long long1 = org.apache.commons.math.util.FastMath.round(1.5707963267948957d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test5807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5807");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.7756492399470994d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5808");
        int int1 = org.apache.commons.math.util.FastMath.round(7.9300672E14f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test5809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5809");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 100, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test5810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5810");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-4.965976906313292E-6d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test5811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5811");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.6917300921120252d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8317031273910331d + "'", double1 == 0.8317031273910331d);
    }

    @Test
    public void test5812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5812");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.6584559915698317E36d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6584559915698323E36d + "'", double1 == 2.6584559915698323E36d);
    }

    @Test
    public void test5813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5813");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9999999999992766d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5814");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.7208852476093055d, 10.049875621120886d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7208852476093057d + "'", double2 == 1.7208852476093057d);
    }

    @Test
    public void test5815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5815");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 1, (float) 2155615773557598L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test5816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5816");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.5609005988965426d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009789562227152743d + "'", double1 == 0.009789562227152743d);
    }

    @Test
    public void test5817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5817");
        double double1 = org.apache.commons.math.util.FastMath.exp((-14.119669143560207d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.377438616232547E-7d + "'", double1 == 7.377438616232547E-7d);
    }

    @Test
    public void test5818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5818");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.5271796258079011d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02665431273972284d + "'", double1 == 0.02665431273972284d);
    }

    @Test
    public void test5819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5819");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 0, 57L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5820");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.011869972069403d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005124708115545339d + "'", double1 == 0.005124708115545339d);
    }

    @Test
    public void test5821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5821");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.0413863622181858d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5050241665006766d + "'", double1 == 0.5050241665006766d);
    }

    @Test
    public void test5822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5822");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.6250159944861234d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2017643533306004d + "'", double1 == 1.2017643533306004d);
    }

    @Test
    public void test5823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5823");
        double double1 = org.apache.commons.math.util.FastMath.exp(8.673617379884035E-19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5824");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.493777178147216d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5140883340610262d + "'", double1 == 0.5140883340610262d);
    }

    @Test
    public void test5825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5825");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.8936827444199411d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5826");
        double double1 = org.apache.commons.math.util.FastMath.abs(48.99489795918369d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 48.99489795918369d + "'", double1 == 48.99489795918369d);
    }

    @Test
    public void test5827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5827");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.9051076669497566d), 0.5344733951434961d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5344733951434961d + "'", double2 == 0.5344733951434961d);
    }

    @Test
    public void test5828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5828");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-1.6899857126771445d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test5829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5829");
        long long2 = org.apache.commons.math.util.FastMath.min((-1L), (long) (-115));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-115L) + "'", long2 == (-115L));
    }

    @Test
    public void test5830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5830");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(11012.999999999989d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.248558590291832d + "'", double1 == 22.248558590291832d);
    }

    @Test
    public void test5831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5831");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.5401776706283436E45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5401776706283436E45d + "'", double1 == 1.5401776706283436E45d);
    }

    @Test
    public void test5832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5832");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.7626139187213443d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9989219698272144d + "'", double1 == 0.9989219698272144d);
    }

    @Test
    public void test5833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5833");
        float float1 = org.apache.commons.math.util.FastMath.abs(5.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.0f + "'", float1 == 5.0f);
    }

    @Test
    public void test5834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5834");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.502154937700735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.567739246697935d + "'", double1 == 1.567739246697935d);
    }

    @Test
    public void test5835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5835");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.7346342576927686d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0847193829771844d + "'", double1 == 2.0847193829771844d);
    }

    @Test
    public void test5836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5836");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.4576692332118569d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5803861773395897d + "'", double1 == 0.5803861773395897d);
    }

    @Test
    public void test5837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5837");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9163192498513427d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7933663630716363d + "'", double1 == 0.7933663630716363d);
    }

    @Test
    public void test5838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5838");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.25d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.004363323129985824d + "'", double1 == 0.004363323129985824d);
    }

    @Test
    public void test5839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5839");
        long long2 = org.apache.commons.math.util.FastMath.max((-53L), 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test5840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5840");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.2837077863503052d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-16.255258772871752d) + "'", double1 == (-16.255258772871752d));
    }

    @Test
    public void test5841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5841");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.0522257274488631d, 9.612434767874704E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000004893466914d + "'", double2 == 1.0000004893466914d);
    }

    @Test
    public void test5842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5842");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-1.8256472186458474d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test5843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5843");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.45771669378667196d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.47542538074060653d + "'", double1 == 0.47542538074060653d);
    }

    @Test
    public void test5844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5844");
        int int2 = org.apache.commons.math.util.FastMath.max(53, 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
    }

    @Test
    public void test5845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5845");
        double double1 = org.apache.commons.math.util.FastMath.floor((-2.6750248568426245d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.0d) + "'", double1 == (-3.0d));
    }

    @Test
    public void test5846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5846");
        float float2 = org.apache.commons.math.util.FastMath.min(1.0f, (-115.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-115.0f) + "'", float2 == (-115.0f));
    }

    @Test
    public void test5847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5847");
        double double2 = org.apache.commons.math.util.FastMath.atan2(4.509011168189731d, (-35.350506208557206d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.014726176906717d + "'", double2 == 3.014726176906717d);
    }

    @Test
    public void test5848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5848");
        double double1 = org.apache.commons.math.util.FastMath.log1p(3282.8063500117437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.096758501114941d + "'", double1 == 8.096758501114941d);
    }

    @Test
    public void test5849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5849");
        double double1 = org.apache.commons.math.util.FastMath.asin(33.781990896044064d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5850");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.4219132975121505d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1792217834311784d + "'", double1 == 1.1792217834311784d);
    }

    @Test
    public void test5851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5851");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.8859573840357964d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test5852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5852");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.9999999999999992d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7615941559557645d) + "'", double1 == (-0.7615941559557645d));
    }

    @Test
    public void test5853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5853");
        double double2 = org.apache.commons.math.util.FastMath.min(0.5669767943827967d, 2.7105940846527337d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5669767943827967d + "'", double2 == 0.5669767943827967d);
    }

    @Test
    public void test5854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5854");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.7237289657353608d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5855");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5672839406622014d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5856");
        double double2 = org.apache.commons.math.util.FastMath.pow(8.51197962436335d, 1.1310377402202207d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11.269371096318844d + "'", double2 == 11.269371096318844d);
    }

    @Test
    public void test5857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5857");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test5858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5858");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 2147483647);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5859");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.008838092819754681d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5860");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.02393945884531d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2124820061452817d + "'", double1 == 1.2124820061452817d);
    }

    @Test
    public void test5861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5861");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.8848263231172628d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5862");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.5724499077477837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.798963696601334d + "'", double1 == 32.798963696601334d);
    }

    @Test
    public void test5863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5863");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.02563295851681163d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5864");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.0550256221829202d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.261932617573192d + "'", double1 == 1.261932617573192d);
    }

    @Test
    public void test5865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5865");
        float float2 = org.apache.commons.math.util.FastMath.min(32.0f, (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test5866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5866");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1477896L, (float) 3L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test5867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5867");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.4365272545793937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6607020921560591d + "'", double1 == 0.6607020921560591d);
    }

    @Test
    public void test5868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5868");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.6982469888270821d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.839296111154643d + "'", double1 == 0.839296111154643d);
    }

    @Test
    public void test5869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5869");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 36L, (float) (-36L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 36.0f + "'", float2 == 36.0f);
    }

    @Test
    public void test5870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5870");
        double double1 = org.apache.commons.math.util.FastMath.log(0.5259944849453191d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6424645511942247d) + "'", double1 == (-0.6424645511942247d));
    }

    @Test
    public void test5871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5871");
        double double2 = org.apache.commons.math.util.FastMath.pow(5.904340862875605E-7d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5872");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.015390197088988328d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5873");
        double double1 = org.apache.commons.math.util.FastMath.expm1(51.61932834909814d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6181194770972477E22d + "'", double1 == 2.6181194770972477E22d);
    }

    @Test
    public void test5874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5874");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.44138521123769286d, 2.645295841649998d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4413852112376929d + "'", double2 == 0.4413852112376929d);
    }

    @Test
    public void test5875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5875");
        double double1 = org.apache.commons.math.util.FastMath.log1p(8388608.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.942385272088025d + "'", double1 == 15.942385272088025d);
    }

    @Test
    public void test5876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5876");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-1.4872649669851485d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5877");
        float float2 = org.apache.commons.math.util.FastMath.min((-53.0f), 9.223372E18f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-53.0f) + "'", float2 == (-53.0f));
    }

    @Test
    public void test5878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5878");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.141592653589793d + "'", double1 == 3.141592653589793d);
    }

    @Test
    public void test5879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5879");
        double double1 = org.apache.commons.math.util.FastMath.abs(3.484141155511086d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.484141155511086d + "'", double1 == 3.484141155511086d);
    }

    @Test
    public void test5880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5880");
        double double1 = org.apache.commons.math.util.FastMath.sin(11.267396586565031d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9632832319723059d) + "'", double1 == (-0.9632832319723059d));
    }

    @Test
    public void test5881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5881");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.6094379124341003d, 0.20350434138645834d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1016892267331362d + "'", double2 == 1.1016892267331362d);
    }

    @Test
    public void test5882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5882");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.0920413661465178d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5883");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430806348152437d + "'", double1 == 1.5430806348152437d);
    }

    @Test
    public void test5884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5884");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(6.756960248771417E-7d, 0.846168432333387d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.756960248771418E-7d + "'", double2 == 6.756960248771418E-7d);
    }

    @Test
    public void test5885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5885");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.3246090892520057d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7474040395446648d + "'", double1 == 1.7474040395446648d);
    }

    @Test
    public void test5886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5886");
        double double1 = org.apache.commons.math.util.FastMath.cos(65.3011208856134d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7823758560306139d) + "'", double1 == (-0.7823758560306139d));
    }

    @Test
    public void test5887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5887");
        float float2 = org.apache.commons.math.util.FastMath.min(32.0f, (float) 4477855);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test5888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5888");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.5149779865389813d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8015480371995959d + "'", double1 == 0.8015480371995959d);
    }

    @Test
    public void test5889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5889");
        long long1 = org.apache.commons.math.util.FastMath.round(0.0037614443570399268d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test5890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5890");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.003875819055588d, 0.9100930808226745d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0035267423921865d + "'", double2 == 1.0035267423921865d);
    }

    @Test
    public void test5891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5891");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.40429714988426d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4042971498842602d + "'", double1 == 1.4042971498842602d);
    }

    @Test
    public void test5892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5892");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.0550256221829202d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8699128649852744d + "'", double1 == 0.8699128649852744d);
    }

    @Test
    public void test5893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5893");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.3083596576175056d, 0.010714594648513057d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.536063230604564d + "'", double2 == 1.536063230604564d);
    }

    @Test
    public void test5894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5894");
        double double1 = org.apache.commons.math.util.FastMath.sin(4.644483341943246d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.997695297953666d) + "'", double1 == (-0.997695297953666d));
    }

    @Test
    public void test5895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5895");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.5740962263285927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5740962263285927d + "'", double1 == 0.5740962263285927d);
    }

    @Test
    public void test5896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5896");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.403108691968676E-6d, 3.674292154581808d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.255899984420274E-21d + "'", double2 == 2.255899984420274E-21d);
    }

    @Test
    public void test5897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5897");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.18963695133799308d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.380003951667169d + "'", double1 == 1.380003951667169d);
    }

    @Test
    public void test5898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5898");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test5899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5899");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.5578300447656457d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5323298995605776d) + "'", double1 == (-0.5323298995605776d));
    }

    @Test
    public void test5900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5900");
        int int2 = org.apache.commons.math.util.FastMath.min(3, 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test5901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5901");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.04147130059125977d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3761304947975805d + "'", double1 == 2.3761304947975805d);
    }

    @Test
    public void test5902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5902");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 97, (float) (-115));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-115.0f) + "'", float2 == (-115.0f));
    }

    @Test
    public void test5903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5903");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.0344564187202214d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5904");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.10626705440853382d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.10666980032367356d) + "'", double1 == (-0.10666980032367356d));
    }

    @Test
    public void test5905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5905");
        double double1 = org.apache.commons.math.util.FastMath.log(83.13074571165504d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.420414617930467d + "'", double1 == 4.420414617930467d);
    }

    @Test
    public void test5906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5906");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.570796326794803d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02741556778080214d + "'", double1 == 0.02741556778080214d);
    }

    @Test
    public void test5907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5907");
        int int2 = org.apache.commons.math.util.FastMath.min(57, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test5908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5908");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (-53));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 53.0f + "'", float1 == 53.0f);
    }

    @Test
    public void test5909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5909");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.876278270531895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.748096496408667d + "'", double1 == 17.748096496408667d);
    }

    @Test
    public void test5910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5910");
        double double1 = org.apache.commons.math.util.FastMath.tanh(179.50384807756595d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5911");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.3485292390836008d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12986036735175643d + "'", double1 == 0.12986036735175643d);
    }

    @Test
    public void test5912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5912");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.015058070638819365d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5913");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(5.685719999335932E24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2576775945507415E26d + "'", double1 == 3.2576775945507415E26d);
    }

    @Test
    public void test5914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5914");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 53, (long) 61);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 53L + "'", long2 == 53L);
    }

    @Test
    public void test5915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5915");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.660978172148109d), 0.017453292519943295d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5443972131929948d) + "'", double2 == (-1.5443972131929948d));
    }

    @Test
    public void test5916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5916");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.01660986102055906d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01661138875770783d) + "'", double1 == (-0.01661138875770783d));
    }

    @Test
    public void test5917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5917");
        int int1 = org.apache.commons.math.util.FastMath.abs(4477855);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4477855 + "'", int1 == 4477855);
    }

    @Test
    public void test5918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5918");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2147483647, (float) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test5919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5919");
        double double1 = org.apache.commons.math.util.FastMath.tan((-1.506844020238002d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-15.615329340443445d) + "'", double1 == (-15.615329340443445d));
    }

    @Test
    public void test5920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5920");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-1), (long) 53);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test5921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5921");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.06310629616292701d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0011014126467817403d + "'", double1 == 0.0011014126467817403d);
    }

    @Test
    public void test5922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5922");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.1907693164837155d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.18848829766254063d) + "'", double1 == (-0.18848829766254063d));
    }

    @Test
    public void test5923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5923");
        double double1 = org.apache.commons.math.util.FastMath.asinh(18501.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.518727244949929d + "'", double1 == 10.518727244949929d);
    }

    @Test
    public void test5924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5924");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.5414729998706596d, 0.45651311918339676d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5414729998706594d + "'", double2 == 0.5414729998706594d);
    }

    @Test
    public void test5925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5925");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.0000075007552947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7615973060625362d + "'", double1 == 0.7615973060625362d);
    }

    @Test
    public void test5926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5926");
        long long2 = org.apache.commons.math.util.FastMath.max(1L, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test5927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5927");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.5707963267948966d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5928");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.7399788154926485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2027664911609595d + "'", double1 == 1.2027664911609595d);
    }

    @Test
    public void test5929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5929");
        long long2 = org.apache.commons.math.util.FastMath.min((-115L), 4L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-115L) + "'", long2 == (-115L));
    }

    @Test
    public void test5930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5930");
        int int2 = org.apache.commons.math.util.FastMath.min(53, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
    }

    @Test
    public void test5931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5931");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.217652850343311d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3792468199971823d + "'", double1 == 2.3792468199971823d);
    }

    @Test
    public void test5932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5932");
        long long2 = org.apache.commons.math.util.FastMath.min(100L, (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test5933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5933");
        double double1 = org.apache.commons.math.util.FastMath.sin(5.444945510686242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7434670966012458d) + "'", double1 == (-0.7434670966012458d));
    }

    @Test
    public void test5934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5934");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.218882338219149d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8393241772657645d + "'", double1 == 0.8393241772657645d);
    }

    @Test
    public void test5935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5935");
        double double1 = org.apache.commons.math.util.FastMath.tan(14.476482730108396d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.833124132830975d) + "'", double1 == (-2.833124132830975d));
    }

    @Test
    public void test5936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5936");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.1011775851339626d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.10152425312560447d) + "'", double1 == (-0.10152425312560447d));
    }

    @Test
    public void test5937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5937");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '4', (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test5938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5938");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.289563200948447d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7437428060704568d + "'", double1 == 0.7437428060704568d);
    }

    @Test
    public void test5939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5939");
        double double1 = org.apache.commons.math.util.FastMath.cos((-1.7678470809183595d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.19577801365447028d) + "'", double1 == (-0.19577801365447028d));
    }

    @Test
    public void test5940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5940");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.719463918234335d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7194639182343352d + "'", double1 == 1.7194639182343352d);
    }

    @Test
    public void test5941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5941");
        double double1 = org.apache.commons.math.util.FastMath.signum(3.0517578125E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5942");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.938699128765109d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.35195913111800936d + "'", double1 == 0.35195913111800936d);
    }

    @Test
    public void test5943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5943");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.842859999667966E24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5944");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.7487731841429789d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9080646321988937d + "'", double1 == 0.9080646321988937d);
    }

    @Test
    public void test5945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5945");
        double double1 = org.apache.commons.math.util.FastMath.expm1(195.61136026791206d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.972931698648085E84d + "'", double1 == 8.972931698648085E84d);
    }

    @Test
    public void test5946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5946");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.9516311810082599d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4032145281394839d) + "'", double1 == (-1.4032145281394839d));
    }

    @Test
    public void test5947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5947");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.021361775150108318d, 43.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.02136177515010832d + "'", double2 == 0.02136177515010832d);
    }

    @Test
    public void test5948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5948");
        double double1 = org.apache.commons.math.util.FastMath.signum(140.3454242220617d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5949");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.7649452892668915d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5950");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.360182623737135d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.592885788190275d + "'", double1 == 9.592885788190275d);
    }

    @Test
    public void test5951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5951");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(5.8000374548825615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.800037454882562d + "'", double1 == 5.800037454882562d);
    }

    @Test
    public void test5952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5952");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.3300364017644222d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test5953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5953");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2155615773557598L, (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.15561577E15f + "'", float2 == 2.15561577E15f);
    }

    @Test
    public void test5954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5954");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test5955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5955");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) 36);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.750470905699148d + "'", double1 == 7.750470905699148d);
    }

    @Test
    public void test5956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5956");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.0000573996218827d, 5.590038619245503E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000000320856899d + "'", double2 == 1.0000000320856899d);
    }

    @Test
    public void test5957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5957");
        long long2 = org.apache.commons.math.util.FastMath.min(32L, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5958");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.1275951258796755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9687826287975424d + "'", double1 == 0.9687826287975424d);
    }

    @Test
    public void test5959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5959");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.4772282118533498d), 1.4149155116131065d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.3253018341792235d) + "'", double2 == (-0.3253018341792235d));
    }

    @Test
    public void test5960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5960");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.3147657312070724d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5961");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.8323529090607977d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3668727859428367d + "'", double1 == 1.3668727859428367d);
    }

    @Test
    public void test5962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5962");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-235.83169600397733d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5963");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.7430243621557113d, 2.8421709430404007E-14d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999999999999916d + "'", double2 == 0.9999999999999916d);
    }

    @Test
    public void test5964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5964");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.8734651779958067d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9539072347830265d + "'", double1 == 0.9539072347830265d);
    }

    @Test
    public void test5965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5965");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.641588833612779d + "'", double1 == 4.641588833612779d);
    }

    @Test
    public void test5966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5966");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.0718547487488204d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5967");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.563552507824052d, (-5.434540364205759d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08812273022707183d + "'", double2 == 0.08812273022707183d);
    }

    @Test
    public void test5968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5968");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.0523779637351338d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7827291422469325d + "'", double1 == 0.7827291422469325d);
    }

    @Test
    public void test5969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5969");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9830787956514044d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.00741167123689159d) + "'", double1 == (-0.00741167123689159d));
    }

    @Test
    public void test5970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5970");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.25407782155012953d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5971");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.7162579075638862d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5972");
        int int2 = org.apache.commons.math.util.FastMath.max(100, 1477896);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1477896 + "'", int2 == 1477896);
    }

    @Test
    public void test5973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5973");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(86.73801698433716d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5138639830274463d + "'", double1 == 1.5138639830274463d);
    }

    @Test
    public void test5974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5974");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.8410058489917948d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5975");
        double double1 = org.apache.commons.math.util.FastMath.acosh(563.9323559833009d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.028080702549518d + "'", double1 == 7.028080702549518d);
    }

    @Test
    public void test5976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5976");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.21551488653168732d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.217219076444677d + "'", double1 == 0.217219076444677d);
    }

    @Test
    public void test5977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5977");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 35.0f, 7.006492321624085E-46d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5978");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.8260916783213061d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5622431581351535d) + "'", double1 == (-0.5622431581351535d));
    }

    @Test
    public void test5979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5979");
        double double2 = org.apache.commons.math.util.FastMath.max(0.32681535598557454d, 3.6268604078470186d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.6268604078470186d + "'", double2 == 3.6268604078470186d);
    }

    @Test
    public void test5980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5980");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(5.697222728536797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.386885570892915d + "'", double1 == 2.386885570892915d);
    }

    @Test
    public void test5981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5981");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 2063L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2063 + "'", int1 == 2063);
    }

    @Test
    public void test5982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5982");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8718862068518761d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8718862068518761d + "'", double1 == 0.8718862068518761d);
    }

    @Test
    public void test5983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5983");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.015614538593136463d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5984");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9434257847789064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9434257847789065d + "'", double1 == 0.9434257847789065d);
    }

    @Test
    public void test5985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5985");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.6080872397649996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.010613124473263432d + "'", double1 == 0.010613124473263432d);
    }

    @Test
    public void test5986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5986");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.9936026854386766d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9936026854386768d + "'", double1 == 1.9936026854386768d);
    }

    @Test
    public void test5987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5987");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (-36.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5988");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5989");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.6438517469625918d), 0.41498791363815524d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test5990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5990");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.0000000320856899d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7182819156769944d + "'", double1 == 1.7182819156769944d);
    }

    @Test
    public void test5991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5991");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.4742570847547076d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6223472360131463d + "'", double1 == 0.6223472360131463d);
    }

    @Test
    public void test5992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5992");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.16151472810737288d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16013183117085358d + "'", double1 == 0.16013183117085358d);
    }

    @Test
    public void test5993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5993");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.1271307019409333d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.086786869829072d + "'", double1 == 2.086786869829072d);
    }

    @Test
    public void test5994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5994");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8805489308698096d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9988340999854693d + "'", double1 == 0.9988340999854693d);
    }

    @Test
    public void test5995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5995");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.983031862437426d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1491859173764585d + "'", double1 == 1.1491859173764585d);
    }

    @Test
    public void test5996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5996");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.7615941559557649d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5330785122775574d) + "'", double1 == (-0.5330785122775574d));
    }

    @Test
    public void test5997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5997");
        long long1 = org.apache.commons.math.util.FastMath.round(2048.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2048L + "'", long1 == 2048L);
    }

    @Test
    public void test5998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5998");
        float float2 = org.apache.commons.math.util.FastMath.max(9.223372E18f, (float) 36L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test5999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5999");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.248867972642223d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2488679726422232d + "'", double1 == 1.2488679726422232d);
    }

    @Test
    public void test6000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test6000");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.02393945884531d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }
}

