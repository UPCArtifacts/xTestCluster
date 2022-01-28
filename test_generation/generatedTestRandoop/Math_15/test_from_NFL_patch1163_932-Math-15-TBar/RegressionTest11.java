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
        double double1 = org.apache.commons.math3.util.FastMath.log(3.559984735131298E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.940584115005904d) + "'", double1 == (-7.940584115005904d));
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5502");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-0.04672473093607536d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9989085983435377d + "'", double1 == 0.9989085983435377d);
    }

    @Test
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5503");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(4.802059275094712d, (-1.0000001192092896d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.802059275094712d) + "'", double2 == (-4.802059275094712d));
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5504");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-0.0078124200636759305d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.007812579008396863d) + "'", double1 == (-0.007812579008396863d));
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5505");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.012777554145719352d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.360065229747617d) + "'", double1 == (-4.360065229747617d));
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5506");
        float float2 = org.apache.commons.math3.util.FastMath.min(10239.998f, 6.8719477E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10239.998f + "'", float2 == 10239.998f);
    }

    @Test
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5507");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(512.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.936085770210967d + "'", double1 == 8.936085770210967d);
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5508");
        double double1 = org.apache.commons.math3.util.FastMath.abs(2.7745699020368657d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7745699020368657d + "'", double1 == 2.7745699020368657d);
    }

    @Test
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5509");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(40.999996f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5510");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.20962587148475365d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9781088370666045d + "'", double1 == 0.9781088370666045d);
    }

    @Test
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5511");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-3), 57L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3L) + "'", long2 == (-3L));
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5512");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(3.808243886679093d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5513");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.05240777928304121d, 0.8342233605065102d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8342233605065102d + "'", double2 == 0.8342233605065102d);
    }

    @Test
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5514");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 7, 16.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.0f + "'", float2 == 7.0f);
    }

    @Test
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5515");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(10239.998f, 6);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 655359.9f + "'", float2 == 655359.9f);
    }

    @Test
    public void test5516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5516");
        long long1 = org.apache.commons.math3.util.FastMath.abs((-47L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 47L + "'", long1 == 47L);
    }

    @Test
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5517");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(2.2737367544323206E-13d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5518");
        float float1 = org.apache.commons.math3.util.FastMath.signum(1.5258789E-5f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5519");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(16.007850859820163d, 1.6441739259957566d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 16.007850859820163d + "'", double2 == 16.007850859820163d);
    }

    @Test
    public void test5520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5520");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.08276253029821971d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9965771362396577d + "'", double1 == 0.9965771362396577d);
    }

    @Test
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5521");
        double double2 = org.apache.commons.math3.util.FastMath.pow(4.8443635619146716E-5d, 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.8443635619146716E-5d + "'", double2 == 4.8443635619146716E-5d);
    }

    @Test
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5522");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 1.5258789E-5f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5523");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(16.999998f, (float) 10240L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 16.999998f + "'", float2 == 16.999998f);
    }

    @Test
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5524");
        float float1 = org.apache.commons.math3.util.FastMath.signum((-6.1572651E13f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5525");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(26.65333863364665d, (-8));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.10411460403768223d + "'", double2 == 0.10411460403768223d);
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5526");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-18), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-18L) + "'", long2 == (-18L));
    }

    @Test
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5527");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.570629771684025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5087952203655264d + "'", double1 == 2.5087952203655264d);
    }

    @Test
    public void test5528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5528");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-0.3619730303123131d), 178.72171540421934d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0020253416578653568d) + "'", double2 == (-0.0020253416578653568d));
    }

    @Test
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5529");
        double double1 = org.apache.commons.math3.util.FastMath.abs(5.2601359015483735E210d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.2601359015483735E210d + "'", double1 == 5.2601359015483735E210d);
    }

    @Test
    public void test5530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5530");
        double double2 = org.apache.commons.math3.util.FastMath.pow(5.2974079942825565d, 15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.260246045135304E10d + "'", double2 == 7.260246045135304E10d);
    }

    @Test
    public void test5531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5531");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 4.656613E-10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.668042644536231E-8d + "'", double1 == 2.668042644536231E-8d);
    }

    @Test
    public void test5532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5532");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) (-46.999992f));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-47L) + "'", long1 == (-47L));
    }

    @Test
    public void test5533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5533");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.2504230129550942d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22348190443041302d + "'", double1 == 0.22348190443041302d);
    }

    @Test
    public void test5534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5534");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(16026.431110775147d, (-0.7218595826821476d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 16026.431110775145d + "'", double2 == 16026.431110775145d);
    }

    @Test
    public void test5535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5535");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-0.02857142857142857d), 0.7221586788190554d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.02857142857142857d) + "'", double2 == (-0.02857142857142857d));
    }

    @Test
    public void test5536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5536");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.0d, 0.799080308109824d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.799080308109824d + "'", double2 == 0.799080308109824d);
    }

    @Test
    public void test5537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5537");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.006285734418917205d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.006285775811039082d + "'", double1 == 0.006285775811039082d);
    }

    @Test
    public void test5538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5538");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 32768.004f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5539");
        int int2 = org.apache.commons.math3.util.FastMath.max(511, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 511 + "'", int2 == 511);
    }

    @Test
    public void test5540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5540");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-0.8414709848078965d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5541");
        int int2 = org.apache.commons.math3.util.FastMath.max(8, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test5542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5542");
        double double1 = org.apache.commons.math3.util.FastMath.sin(2.0586440673137732E108d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7276773398368294d + "'", double1 == 0.7276773398368294d);
    }

    @Test
    public void test5543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5543");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(2.775557561562892E-17d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5544");
        double double1 = org.apache.commons.math3.util.FastMath.exp(56.93526894286123d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.329336311489081E24d + "'", double1 == 5.329336311489081E24d);
    }

    @Test
    public void test5545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5545");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 4.656613E-10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.6566128730773926E-10d + "'", double1 == 4.6566128730773926E-10d);
    }

    @Test
    public void test5546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5546");
        int int2 = org.apache.commons.math3.util.FastMath.max((-18), (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test5547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5547");
        int int1 = org.apache.commons.math3.util.FastMath.abs(8);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test5548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5548");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 24.249996f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5549");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-0.33319605018370174d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4052592045833028d) + "'", double1 == (-0.4052592045833028d));
    }

    @Test
    public void test5550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5550");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(167.61264592409196d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 167.612645924092d + "'", double1 == 167.612645924092d);
    }

    @Test
    public void test5551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5551");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.2533449363319665d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.503333821963085d + "'", double1 == 0.503333821963085d);
    }

    @Test
    public void test5552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5552");
        int int2 = org.apache.commons.math3.util.FastMath.min(511, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5553");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(8.429369702178807E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.004384617376208488d + "'", double1 == 0.004384617376208488d);
    }

    @Test
    public void test5554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5554");
        long long2 = org.apache.commons.math3.util.FastMath.min((-17L), (long) (-41));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-41L) + "'", long2 == (-41L));
    }

    @Test
    public void test5555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5555");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (byte) 1, (-0.3365629458057544d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.99999994f + "'", float2 == 0.99999994f);
    }

    @Test
    public void test5556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5556");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 6207.9995f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.792951674091327d + "'", double1 == 3.792951674091327d);
    }

    @Test
    public void test5557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5557");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-0.2981479726743438d), 1.6543612251060553E-24d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0d) + "'", double2 == (-0.0d));
    }

    @Test
    public void test5558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5558");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.8726936208978296d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8726936208978298d + "'", double1 == 0.8726936208978298d);
    }

    @Test
    public void test5559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5559");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1833.464944418635d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5560");
        float float1 = org.apache.commons.math3.util.FastMath.signum((-40.999992f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test5561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5561");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(2.3841860752327193E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5562");
        int int2 = org.apache.commons.math3.util.FastMath.max(41, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test5563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5563");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.5447444452006056d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4348584890312084d + "'", double1 == 0.4348584890312084d);
    }

    @Test
    public void test5564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5564");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.006220050026892d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5565");
        float float2 = org.apache.commons.math3.util.FastMath.min((-23.0f), (-0.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-23.0f) + "'", float2 == (-23.0f));
    }

    @Test
    public void test5566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5566");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, 0.6341049784159862d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test5567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5567");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5568");
        double double1 = org.apache.commons.math3.util.FastMath.signum(2.58037251265019648E17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5569");
        double double2 = org.apache.commons.math3.util.FastMath.pow(403.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5570");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.6455314445180025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1805980508882694d + "'", double1 == 1.1805980508882694d);
    }

    @Test
    public void test5571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5571");
        long long2 = org.apache.commons.math3.util.FastMath.max(1L, (long) 45);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 45L + "'", long2 == 45L);
    }

    @Test
    public void test5572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5572");
        float float2 = org.apache.commons.math3.util.FastMath.min((-6.1572651E13f), (float) (-7));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.1572651E13f) + "'", float2 == (-6.1572651E13f));
    }

    @Test
    public void test5573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5573");
        float float2 = org.apache.commons.math3.util.FastMath.max(655359.9f, 2.34187232E17f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.34187232E17f + "'", float2 == 2.34187232E17f);
    }

    @Test
    public void test5574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5574");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.1742984407142925d, (-0.31604169520790676d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.950488987782623d + "'", double2 == 0.950488987782623d);
    }

    @Test
    public void test5575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5575");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-9.072165316244842E-36d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5576");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(35.00247388670647d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test5577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5577");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.017947881070324214d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9998389411060563d + "'", double1 == 0.9998389411060563d);
    }

    @Test
    public void test5578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5578");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(16026.431110775145d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16026.431110775147d + "'", double1 == 16026.431110775147d);
    }

    @Test
    public void test5579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5579");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(9.011035410141817d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999702049527d + "'", double1 == 0.9999999702049527d);
    }

    @Test
    public void test5580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5580");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.8855630621884312d, (-0.9974947163822921d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.8855630621884312d) + "'", double2 == (-1.8855630621884312d));
    }

    @Test
    public void test5581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5581");
        int int2 = org.apache.commons.math3.util.FastMath.min((-17), (-1023));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1023) + "'", int2 == (-1023));
    }

    @Test
    public void test5582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5582");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(6400.0005f, 2.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6400.0005f + "'", float2 == 6400.0005f);
    }

    @Test
    public void test5583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5583");
        double double1 = org.apache.commons.math3.util.FastMath.log10(3.010299956639812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4786097723456752d + "'", double1 == 0.4786097723456752d);
    }

    @Test
    public void test5584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5584");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.0315726969549555d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8054745282687201d + "'", double1 == 1.8054745282687201d);
    }

    @Test
    public void test5585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5585");
        float float1 = org.apache.commons.math3.util.FastMath.abs(6400.0005f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6400.0005f + "'", float1 == 6400.0005f);
    }

    @Test
    public void test5586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5586");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-0.8360218615377305d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.014591334102485542d) + "'", double1 == (-0.014591334102485542d));
    }

    @Test
    public void test5587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5587");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-0.9713101757929392d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5588");
        double double2 = org.apache.commons.math3.util.FastMath.max(47216.661210973005d, 0.7771211630872562d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 47216.661210973005d + "'", double2 == 47216.661210973005d);
    }

    @Test
    public void test5589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5589");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.05235987755982989d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0537548970256727d + "'", double1 == 1.0537548970256727d);
    }

    @Test
    public void test5590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5590");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.7000611280165643d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7648028061060886d + "'", double1 == 0.7648028061060886d);
    }

    @Test
    public void test5591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5591");
        long long2 = org.apache.commons.math3.util.FastMath.min(9223372036854775807L, (long) 10240);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10240L + "'", long2 == 10240L);
    }

    @Test
    public void test5592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5592");
        double double1 = org.apache.commons.math3.util.FastMath.acos(2.26374993599281344E17d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5593");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.19611987703015257d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1948839253625035d + "'", double1 == 0.1948839253625035d);
    }

    @Test
    public void test5594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5594");
        int int1 = org.apache.commons.math3.util.FastMath.round(655359.9f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 655360 + "'", int1 == 655360);
    }

    @Test
    public void test5595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5595");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.9791496723130869d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6621915440204624d + "'", double1 == 2.6621915440204624d);
    }

    @Test
    public void test5596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5596");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(42.97463715202101d, 0.6065655566820689d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 42.97463715202101d + "'", double2 == 42.97463715202101d);
    }

    @Test
    public void test5597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5597");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 3, (-4503599627370496L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test5598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5598");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(3.58351893845611d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test5599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5599");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 1.5258789E-5f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5600");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(6.905339522827515E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.905338425253609E-4d + "'", double1 == 6.905338425253609E-4d);
    }

    @Test
    public void test5601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5601");
        float float2 = org.apache.commons.math3.util.FastMath.max(10240.0f, (float) (-19));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10240.0f + "'", float2 == 10240.0f);
    }

    @Test
    public void test5602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5602");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(8.24305788136677E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.243058814865674E-4d + "'", double1 == 8.243058814865674E-4d);
    }

    @Test
    public void test5603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5603");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-0.03490658295929199d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5604");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1.0000001f, 0.060135240003378346d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test5605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5605");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.6197751905438618d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test5606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5606");
        long long1 = org.apache.commons.math3.util.FastMath.round((-6.053272382793105d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-6L) + "'", long1 == (-6L));
    }

    @Test
    public void test5607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5607");
        int int2 = org.apache.commons.math3.util.FastMath.max((-8), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test5608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5608");
        float float1 = org.apache.commons.math3.util.FastMath.abs(97.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 97.0f + "'", float1 == 97.0f);
    }

    @Test
    public void test5609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5609");
        double double1 = org.apache.commons.math3.util.FastMath.tan(2.236696324052198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2729086863889119d) + "'", double1 == (-1.2729086863889119d));
    }

    @Test
    public void test5610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5610");
        int int2 = org.apache.commons.math3.util.FastMath.max(100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test5611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5611");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) (-1.1E-44f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1210387714598537E-44d) + "'", double1 == (-1.1210387714598537E-44d));
    }

    @Test
    public void test5612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5612");
        int int2 = org.apache.commons.math3.util.FastMath.max((-47), 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test5613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5613");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.1230445261115651d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1230445261115654d + "'", double1 == 1.1230445261115654d);
    }

    @Test
    public void test5614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5614");
        double double1 = org.apache.commons.math3.util.FastMath.rint(13.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.0d + "'", double1 == 13.0d);
    }

    @Test
    public void test5615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5615");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-0.9952731515503571d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.044324190046362d + "'", double1 == 3.044324190046362d);
    }

    @Test
    public void test5616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5616");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(8.0d, 0.04669075745245177d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.000136250516706d + "'", double2 == 8.000136250516706d);
    }

    @Test
    public void test5617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5617");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-89.2328896037985d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5618");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-0.8837563087406048d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0838295454652982d) + "'", double1 == (-1.0838295454652982d));
    }

    @Test
    public void test5619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5619");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.9115170270339398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.969590299587744d + "'", double1 == 0.969590299587744d);
    }

    @Test
    public void test5620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5620");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-17), (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-17L) + "'", long2 == (-17L));
    }

    @Test
    public void test5621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5621");
        double double1 = org.apache.commons.math3.util.FastMath.log(4.575741909831946d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.520768851663472d + "'", double1 == 1.520768851663472d);
    }

    @Test
    public void test5622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5622");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(3.6268604078470186d, 0.49205974021214605d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.6268604078470186d + "'", double2 == 3.6268604078470186d);
    }

    @Test
    public void test5623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5623");
        float float1 = org.apache.commons.math3.util.FastMath.abs(4.5036002E15f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.5036002E15f + "'", float1 == 4.5036002E15f);
    }

    @Test
    public void test5624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5624");
        float float1 = org.apache.commons.math3.util.FastMath.signum(51.999992f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test5625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5625");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-2), (long) 61);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test5626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5626");
        int int2 = org.apache.commons.math3.util.FastMath.min((-10), 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10) + "'", int2 == (-10));
    }

    @Test
    public void test5627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5627");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.21280863569583866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5970303593578004d + "'", double1 == 0.5970303593578004d);
    }

    @Test
    public void test5628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5628");
        double double1 = org.apache.commons.math3.util.FastMath.log10(2.3841860752327193E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.622659852835652d) + "'", double1 == (-6.622659852835652d));
    }

    @Test
    public void test5629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5629");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.759169725377571d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.759169725377571d + "'", double1 == 0.759169725377571d);
    }

    @Test
    public void test5630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5630");
        float float2 = org.apache.commons.math3.util.FastMath.max((-6.4851835E18f), 1.71798692E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.71798692E10f + "'", float2 == 1.71798692E10f);
    }

    @Test
    public void test5631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5631");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1664.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5632");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(55.51535513730588d, (-0.38874545763980906d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 55.51671621279514d + "'", double2 == 55.51671621279514d);
    }

    @Test
    public void test5633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5633");
        double double1 = org.apache.commons.math3.util.FastMath.tan(10.000001907348633d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6483635366065764d + "'", double1 == 0.6483635366065764d);
    }

    @Test
    public void test5634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5634");
        int int1 = org.apache.commons.math3.util.FastMath.round(10.000001f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test5635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5635");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.9953195530693064d, 2560.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9953195530693064d + "'", double2 == 0.9953195530693064d);
    }

    @Test
    public void test5636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5636");
        int int2 = org.apache.commons.math3.util.FastMath.min(13, (-127));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-127) + "'", int2 == (-127));
    }

    @Test
    public void test5637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5637");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-0.25132724169328774d), (double) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.2513272416932877d) + "'", double2 == (-0.2513272416932877d));
    }

    @Test
    public void test5638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5638");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(3.0d, 0.7949487914783152d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.17979516591326083d) + "'", double2 == (-0.17979516591326083d));
    }

    @Test
    public void test5639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5639");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.0468426300829488d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7805758055913187d + "'", double1 == 0.7805758055913187d);
    }

    @Test
    public void test5640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5640");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.7094568947067256d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.782069053352967d + "'", double1 == 0.782069053352967d);
    }

    @Test
    public void test5641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5641");
        int int2 = org.apache.commons.math3.util.FastMath.max(127, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 127 + "'", int2 == 127);
    }

    @Test
    public void test5642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5642");
        double double1 = org.apache.commons.math3.util.FastMath.tan(8.971567242793748d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4870211444092283d) + "'", double1 == (-0.4870211444092283d));
    }

    @Test
    public void test5643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5643");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) 2);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7621956910836314d + "'", double1 == 3.7621956910836314d);
    }

    @Test
    public void test5644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5644");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.5956484387948465d, (double) 34.999996f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 34.999996185302734d + "'", double2 == 34.999996185302734d);
    }

    @Test
    public void test5645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5645");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(4.3404848255064437E30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5646");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.6980426398060633d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5647");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (short) 1, 10.000002f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test5648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5648");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.9073467001376322E-6d, 1.6672556629700335d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9073467001376322E-6d + "'", double2 == 1.9073467001376322E-6d);
    }

    @Test
    public void test5649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5649");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(3.133713443962294d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5650");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 7L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test5651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5651");
        double double2 = org.apache.commons.math3.util.FastMath.pow(3.831008000716577E22d, 1.048297543927715d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.72097405257708E23d + "'", double2 == 4.72097405257708E23d);
    }

    @Test
    public void test5652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5652");
        long long1 = org.apache.commons.math3.util.FastMath.round(571.90945520504d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 572L + "'", long1 == 572L);
    }

    @Test
    public void test5653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5653");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.5707963267948967d, 0.02711025494194475d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.434272028161461d + "'", double2 == 6.434272028161461d);
    }

    @Test
    public void test5654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5654");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 24.249994f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7724861916251571d) + "'", double1 == (-0.7724861916251571d));
    }

    @Test
    public void test5655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5655");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 48.5f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6857417386022637d + "'", double1 == 1.6857417386022637d);
    }

    @Test
    public void test5656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5656");
        long long1 = org.apache.commons.math3.util.FastMath.round(6.905338425253609E-4d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test5657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5657");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.04647454434494028d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0010801360290196d + "'", double1 == 1.0010801360290196d);
    }

    @Test
    public void test5658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5658");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 41, 42875.01401901398d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 41.00000000000001d + "'", double2 == 41.00000000000001d);
    }

    @Test
    public void test5659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5659");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.024600920295739914d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test5660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5660");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.5639495664692888d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7776536914795704d + "'", double1 == 3.7776536914795704d);
    }

    @Test
    public void test5661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5661");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(1.2207031E-4f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.4551915E-11f + "'", float1 == 1.4551915E-11f);
    }

    @Test
    public void test5662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5662");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.027235643304099704d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027235643304099708d + "'", double1 == 0.027235643304099708d);
    }

    @Test
    public void test5663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5663");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.25d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5664");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-0.11638109333444258d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.11611854943761853d) + "'", double1 == (-0.11611854943761853d));
    }

    @Test
    public void test5665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5665");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test5666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5666");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.7236894193081456d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2364590157625752d + "'", double1 == 0.2364590157625752d);
    }

    @Test
    public void test5667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5667");
        int int2 = org.apache.commons.math3.util.FastMath.max((-64), 655360);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 655360 + "'", int2 == 655360);
    }

    @Test
    public void test5668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5668");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(3.141592653577698d, (double) 0.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test5669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5669");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 3.33289488E12f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.33289488384E12d + "'", double1 == 3.33289488384E12d);
    }

    @Test
    public void test5670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5670");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.1200795222140087d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test5671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5671");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0690169939145268d, 12);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1680796888166992E-14d + "'", double2 == 1.1680796888166992E-14d);
    }

    @Test
    public void test5672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5672");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 511, (long) (-1023));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1023L) + "'", long2 == (-1023L));
    }

    @Test
    public void test5673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5673");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-20));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20 + "'", int1 == 20);
    }

    @Test
    public void test5674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5674");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.08369000730960287d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08388622129738016d + "'", double1 == 0.08388622129738016d);
    }

    @Test
    public void test5675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5675");
        double double1 = org.apache.commons.math3.util.FastMath.tan(3.33289488384E12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.9836536212095137d) + "'", double1 == (-1.9836536212095137d));
    }

    @Test
    public void test5676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5676");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-8192.0f), (-0.01737254084242038d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8191.9995f) + "'", float2 == (-8191.9995f));
    }

    @Test
    public void test5677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5677");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.10411460403768223d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0018171426398677375d + "'", double1 == 0.0018171426398677375d);
    }

    @Test
    public void test5678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5678");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(2.5452223306482584d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.586326606377429d + "'", double1 == 1.586326606377429d);
    }

    @Test
    public void test5679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5679");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.3999655238984033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7367851306125031d + "'", double1 == 0.7367851306125031d);
    }

    @Test
    public void test5680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5680");
        int int2 = org.apache.commons.math3.util.FastMath.max((-18), 63);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 63 + "'", int2 == 63);
    }

    @Test
    public void test5681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5681");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 24);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.9073486E-6f + "'", float1 == 1.9073486E-6f);
    }

    @Test
    public void test5682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5682");
        int int1 = org.apache.commons.math3.util.FastMath.round(126.99999f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 127 + "'", int1 == 127);
    }

    @Test
    public void test5683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5683");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(1.2207033E-4f, 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.4414065E-4f + "'", float2 == 2.4414065E-4f);
    }

    @Test
    public void test5684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5684");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.7364591792920474d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5685");
        float float2 = org.apache.commons.math3.util.FastMath.min(2.74877907E11f, 5120.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5120.0f + "'", float2 == 5120.0f);
    }

    @Test
    public void test5686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5686");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-0.15469196324980172d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1534754763076395d) + "'", double1 == (-0.1534754763076395d));
    }

    @Test
    public void test5687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5687");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.000018866625139d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000094332680762d + "'", double1 == 1.0000094332680762d);
    }

    @Test
    public void test5688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5688");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.0014232401139463186d, 0.9738830555738022d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0014614065750416256d + "'", double2 == 0.0014614065750416256d);
    }

    @Test
    public void test5689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5689");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.570460864019617d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5084066197126056d + "'", double1 == 2.5084066197126056d);
    }

    @Test
    public void test5690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5690");
        int int2 = org.apache.commons.math3.util.FastMath.max(127, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 127 + "'", int2 == 127);
    }

    @Test
    public void test5691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5691");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.5604874144594285d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4449982176269198d + "'", double1 == 0.4449982176269198d);
    }

    @Test
    public void test5692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5692");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 57L, (-12));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.013916016f + "'", float2 == 0.013916016f);
    }

    @Test
    public void test5693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5693");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.7367851306125031d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9031924201242516d + "'", double1 == 0.9031924201242516d);
    }

    @Test
    public void test5694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5694");
        double double1 = org.apache.commons.math3.util.FastMath.atan(7.896280957292998E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.570796326794884d + "'", double1 == 1.570796326794884d);
    }

    @Test
    public void test5695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5695");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-0.6912431464778742d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5696");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.2499461922437631d, 0.0689622149987218d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.02590266775112407d) + "'", double2 == (-0.02590266775112407d));
    }

    @Test
    public void test5697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5697");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.0885816328207447d, 2153.28968210235d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0885816328207447d + "'", double2 == 0.0885816328207447d);
    }

    @Test
    public void test5698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5698");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.7669541186975021d, 12);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.04142214727422398d + "'", double2 == 0.04142214727422398d);
    }

    @Test
    public void test5699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5699");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-3.2819493855383146d), 6.6917246496340396E41d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.2819493855383146d + "'", double2 == 3.2819493855383146d);
    }

    @Test
    public void test5700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5700");
        int int2 = org.apache.commons.math3.util.FastMath.min(13, 63);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test5701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5701");
        float float1 = org.apache.commons.math3.util.FastMath.signum((-6.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test5702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5702");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-0.12887618051864808d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.12816970312934028d) + "'", double1 == (-0.12816970312934028d));
    }

    @Test
    public void test5703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5703");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(571.90945520504d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3829808035826506E248d + "'", double1 == 2.3829808035826506E248d);
    }

    @Test
    public void test5704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5704");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(5.071208929787076d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 79.68029973182804d + "'", double1 == 79.68029973182804d);
    }

    @Test
    public void test5705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5705");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.6007036339115129d, (-0.9036922050915067d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6007036339115128d + "'", double2 == 0.6007036339115128d);
    }

    @Test
    public void test5706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5706");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 41, (long) 17);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 41L + "'", long2 == 41L);
    }

    @Test
    public void test5707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5707");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5708");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.0003675054958237d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test5709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5709");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.3558508871372632d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4273946894858439d + "'", double1 == 0.4273946894858439d);
    }

    @Test
    public void test5710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5710");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test5711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5711");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-0.559492086485665d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5712");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.2984702407800952d), (double) 4096L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test5713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5713");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(0.0f, 6208);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5714");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.26765060022823E32d, 1.5715400163821727d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.26765060022823E32d + "'", double2 == 1.26765060022823E32d);
    }

    @Test
    public void test5715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5715");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) (-41L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test5716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5716");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1752011936438045d + "'", double1 == 1.1752011936438045d);
    }

    @Test
    public void test5717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5717");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.626504523747204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test5718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5718");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) (-23L), 1.5271361867276063d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5271361867276063d + "'", double2 == 1.5271361867276063d);
    }

    @Test
    public void test5719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5719");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-1.9999999f), 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.535301E30f) + "'", float2 == (-2.535301E30f));
    }

    @Test
    public void test5720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5720");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(8.852647460508905E-221d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.852647460508905E-221d + "'", double1 == 8.852647460508905E-221d);
    }

    @Test
    public void test5721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5721");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-0.4281895641080631d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.428189564108063d) + "'", double1 == (-0.428189564108063d));
    }

    @Test
    public void test5722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5722");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(3.33289488E12f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 41 + "'", int1 == 41);
    }

    @Test
    public void test5723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5723");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.9074467814501962d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5724");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 32768L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.00390625f + "'", float1 == 0.00390625f);
    }

    @Test
    public void test5725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5725");
        float float2 = org.apache.commons.math3.util.FastMath.max(0.0f, 1.1920929E-7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1920929E-7f + "'", float2 == 1.1920929E-7f);
    }

    @Test
    public void test5726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5726");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.015625d, 1.1323002075191344d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.009012847871504834d + "'", double2 == 0.009012847871504834d);
    }

    @Test
    public void test5727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5727");
        float float1 = org.apache.commons.math3.util.FastMath.signum(35839.996f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test5728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5728");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.524157902758725E-4d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test5729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5729");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.07074101207510715d), (-47));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.1626536597037242E54d) + "'", double2 == (-1.1626536597037242E54d));
    }

    @Test
    public void test5730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5730");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) ' ', 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test5731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5731");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 1024L, 11013.237121318984d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1024.0001f + "'", float2 == 1024.0001f);
    }

    @Test
    public void test5732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5732");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2.0634370688955608d, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5733");
        double double1 = org.apache.commons.math3.util.FastMath.asin(41.00000000000001d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5734");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1.3642422E-12f, 4.086065389836995d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.3642423E-12f + "'", float2 == 1.3642423E-12f);
    }

    @Test
    public void test5735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5735");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(3.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.0000002f + "'", float1 == 3.0000002f);
    }

    @Test
    public void test5736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5736");
        double double1 = org.apache.commons.math3.util.FastMath.exp(41.0215022494985d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.5375054863290842E17d + "'", double1 == 6.5375054863290842E17d);
    }

    @Test
    public void test5737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5737");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.9147226107566936d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9147226107566937d + "'", double1 == 0.9147226107566937d);
    }

    @Test
    public void test5738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5738");
        float float1 = org.apache.commons.math3.util.FastMath.signum(1.9073485E-6f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test5739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5739");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(7.275957614156956E-12d, 0.9960689204702708d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.304672864124483E-12d + "'", double2 == 7.304672864124483E-12d);
    }

    @Test
    public void test5740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5740");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 62, (-0.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-62.0f) + "'", float2 == (-62.0f));
    }

    @Test
    public void test5741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5741");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.42826253011881144d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4577670266704841d + "'", double1 == 0.4577670266704841d);
    }

    @Test
    public void test5742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5742");
        float float2 = org.apache.commons.math3.util.FastMath.max(35.0f, (float) 20);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test5743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5743");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.1724387787793572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.014904443502529d + "'", double1 == 1.014904443502529d);
    }

    @Test
    public void test5744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5744");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.3807463595665448d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3807463595665448d + "'", double1 == 1.3807463595665448d);
    }

    @Test
    public void test5745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5745");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.027415566677401863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5620027728581896d) + "'", double1 == (-1.5620027728581896d));
    }

    @Test
    public void test5746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5746");
        long long1 = org.apache.commons.math3.util.FastMath.round((-4.248699261236361d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-4L) + "'", long1 == (-4L));
    }

    @Test
    public void test5747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5747");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.0001015515136908d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.718557888110264d + "'", double1 == 2.718557888110264d);
    }

    @Test
    public void test5748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5748");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((-1.0000001f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test5749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5749");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-0.9396926207858932d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.016400730189408342d) + "'", double1 == (-0.016400730189408342d));
    }

    @Test
    public void test5750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5750");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 63L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test5751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5751");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 0.00390625f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.003913889338347573d + "'", double1 == 0.003913889338347573d);
    }

    @Test
    public void test5752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5752");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.9947461586351523d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.969656292428325d + "'", double1 == 2.969656292428325d);
    }

    @Test
    public void test5753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5753");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.9990382024714676d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5754");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(2.993222941974403d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.000000953675826d + "'", double1 == 10.000000953675826d);
    }

    @Test
    public void test5755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5755");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.25534195296645534d, (-2.7494413523026204d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.25534195296645534d) + "'", double2 == (-0.25534195296645534d));
    }

    @Test
    public void test5756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5756");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-4.663853435426824d), (double) 32);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.663853435426824d + "'", double2 == 4.663853435426824d);
    }

    @Test
    public void test5757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5757");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 13);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 13L + "'", long1 == 13L);
    }

    @Test
    public void test5758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5758");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.010200069899324198d, 365942.161553766d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 365942.1615537662d + "'", double2 == 365942.1615537662d);
    }

    @Test
    public void test5759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5759");
        float float1 = org.apache.commons.math3.util.FastMath.abs(9.536743E-7f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.536743E-7f + "'", float1 == 9.536743E-7f);
    }

    @Test
    public void test5760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5760");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-0.4052592045833028d), 6.830189170012751E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707794729169535d) + "'", double2 == (-1.5707794729169535d));
    }

    @Test
    public void test5761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5761");
        double double2 = org.apache.commons.math3.util.FastMath.pow(8.000136250516706d, 3.228996546770822d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 824.324737255184d + "'", double2 == 824.324737255184d);
    }

    @Test
    public void test5762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5762");
        double double1 = org.apache.commons.math3.util.FastMath.signum(4.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5763");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.010200600563003249d, 212);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test5764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5764");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(3.228996546770822d, (-32.57791748631743d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.04279921323653d + "'", double2 == 3.04279921323653d);
    }

    @Test
    public void test5765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5765");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.9604221081779567E-308d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5766");
        double double1 = org.apache.commons.math3.util.FastMath.tan(13.282283863634309d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8698632079998672d + "'", double1 == 0.8698632079998672d);
    }

    @Test
    public void test5767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5767");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.473814720414451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.32439145079886367d) + "'", double1 == (-0.32439145079886367d));
    }

    @Test
    public void test5768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5768");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) 1.5625001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4901725564234125d + "'", double1 == 2.4901725564234125d);
    }

    @Test
    public void test5769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5769");
        double double2 = org.apache.commons.math3.util.FastMath.max((-0.30530773052749755d), (-0.4228161333483835d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.30530773052749755d) + "'", double2 == (-0.30530773052749755d));
    }

    @Test
    public void test5770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5770");
        double double1 = org.apache.commons.math3.util.FastMath.atan(6.905338425253609E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.905337327680332E-4d + "'", double1 == 6.905337327680332E-4d);
    }

    @Test
    public void test5771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5771");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.39505127952814223d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.39505127952814223d + "'", double1 == 0.39505127952814223d);
    }

    @Test
    public void test5772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5772");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-2.34187198E17f), 13);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.9184615E21f) + "'", float2 == (-1.9184615E21f));
    }

    @Test
    public void test5773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5773");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.217652850343311d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6483608274590867d + "'", double1 == 0.6483608274590867d);
    }

    @Test
    public void test5774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5774");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-1.5424980429823686E-4d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5775");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.6278878161546924d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4653937651677232d) + "'", double1 == (-0.4653937651677232d));
    }

    @Test
    public void test5776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5776");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-0.3589153218773263d), (-0.0078124200636759305d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.592559640086425d) + "'", double2 == (-1.592559640086425d));
    }

    @Test
    public void test5777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5777");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.9950371902099892d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test5778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5778");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((-8.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-7.9999995f) + "'", float1 == (-7.9999995f));
    }

    @Test
    public void test5779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5779");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2.4802620430283604E-16d, 0.8447979300678613d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.553960912948675E-14d + "'", double2 == 6.553960912948675E-14d);
    }

    @Test
    public void test5780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5780");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(128.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 128.0f + "'", float2 == 128.0f);
    }

    @Test
    public void test5781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5781");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) (-1.2676505E30f), (-0.004057112455263634d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.004057112455263634d) + "'", double2 == (-0.004057112455263634d));
    }

    @Test
    public void test5782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5782");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.9073485191268187E-6d, 0.0014232401139463186d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9073485191268187E-6d + "'", double2 == 1.9073485191268187E-6d);
    }

    @Test
    public void test5783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5783");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.1230445261115654d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.050396975372059706d + "'", double1 == 0.050396975372059706d);
    }

    @Test
    public void test5784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5784");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-2.5343896302784006d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5705726858986964d) + "'", double1 == (-0.5705726858986964d));
    }

    @Test
    public void test5785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5785");
        float float2 = org.apache.commons.math3.util.FastMath.max(96.99999f, (-23.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 96.99999f + "'", float2 == 96.99999f);
    }

    @Test
    public void test5786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5786");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(6.964193590833434d, 1.6929693744345d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.964193590833434d + "'", double2 == 6.964193590833434d);
    }

    @Test
    public void test5787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5787");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) (-35.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5788");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.21791392265914586d, 1.9073485191245059E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707875740337338d + "'", double2 == 1.5707875740337338d);
    }

    @Test
    public void test5789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5789");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.782069053352967d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.864265997649556d + "'", double1 == 0.864265997649556d);
    }

    @Test
    public void test5790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5790");
        int int1 = org.apache.commons.math3.util.FastMath.round((-6.4851835E18f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test5791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5791");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 10239.998f, 5.267884728309446d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.267884728309446d + "'", double2 == 5.267884728309446d);
    }

    @Test
    public void test5792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5792");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(4.476961205229636d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6481413052534384d + "'", double1 == 1.6481413052534384d);
    }

    @Test
    public void test5793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5793");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) (-2.34187198E17f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5794");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.36008937454964746d, 0.024600919695150193d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5025833954211225d + "'", double2 == 1.5025833954211225d);
    }

    @Test
    public void test5795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5795");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 40.000004f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6981317673767591d + "'", double1 == 0.6981317673767591d);
    }

    @Test
    public void test5796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5796");
        float float1 = org.apache.commons.math3.util.FastMath.signum((-511.5f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test5797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5797");
        double double2 = org.apache.commons.math3.util.FastMath.max(13.000004955821908d, (double) 32.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void test5798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5798");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(2.0000002f, (int) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.0072003E15f + "'", float2 == 9.0072003E15f);
    }

    @Test
    public void test5799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5799");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.9800851433251829d, 96.9999923706055d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.01010362752657458d + "'", double2 == 0.01010362752657458d);
    }

    @Test
    public void test5800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5800");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (byte) 1, (long) 40);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 40L + "'", long2 == 40L);
    }

    @Test
    public void test5801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5801");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 41L, 40.999992f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 41.0f + "'", float2 == 41.0f);
    }

    @Test
    public void test5802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5802");
        float float1 = org.apache.commons.math3.util.FastMath.signum(13.000002f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test5803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5803");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.649978363952606d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6112061730672714d + "'", double1 == 0.6112061730672714d);
    }

    @Test
    public void test5804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5804");
        double double1 = org.apache.commons.math3.util.FastMath.cos(29.8285307045427d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01659874225643082d) + "'", double1 == (-0.01659874225643082d));
    }

    @Test
    public void test5805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5805");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) (-5.9999995f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999877116390765d) + "'", double1 == (-0.9999877116390765d));
    }

    @Test
    public void test5806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5806");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 17L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 17 + "'", int1 == 17);
    }

    @Test
    public void test5807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5807");
        double double1 = org.apache.commons.math3.util.FastMath.log(4.600444344825681d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5261528955311234d + "'", double1 == 1.5261528955311234d);
    }

    @Test
    public void test5808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5808");
        double double1 = org.apache.commons.math3.util.FastMath.signum(6.102016471589291E38d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5809");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.010200600563003249d, 0.9956802361437771d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.010404662760165878d + "'", double2 == 0.010404662760165878d);
    }

    @Test
    public void test5810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5810");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) (-35L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-35.0d) + "'", double1 == (-35.0d));
    }

    @Test
    public void test5811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5811");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.45158266504217837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6719990067270772d + "'", double1 == 0.6719990067270772d);
    }

    @Test
    public void test5812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5812");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(4.0442461145352135E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0442461145352135E-15d + "'", double1 == 4.0442461145352135E-15d);
    }

    @Test
    public void test5813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5813");
        double double1 = org.apache.commons.math3.util.FastMath.cos(2.993222846126381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9890133769134045d) + "'", double1 == (-0.9890133769134045d));
    }

    @Test
    public void test5814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5814");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-0.07336779761599267d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9973097902073448d + "'", double1 == 0.9973097902073448d);
    }

    @Test
    public void test5815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5815");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-2025.4348094013412d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-35.350506208557206d) + "'", double1 == (-35.350506208557206d));
    }

    @Test
    public void test5816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5816");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(3580.56673991988d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 205151.36246232543d + "'", double1 == 205151.36246232543d);
    }

    @Test
    public void test5817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5817");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 1.3642423E-12f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3642422694998269E-12d + "'", double1 == 1.3642422694998269E-12d);
    }

    @Test
    public void test5818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5818");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.0452982054695486E-58d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0452982054695487E-58d + "'", double1 == 1.0452982054695487E-58d);
    }

    @Test
    public void test5819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5819");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 40L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test5820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5820");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(12.948283984893761d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2555982551476657d + "'", double1 == 3.2555982551476657d);
    }

    @Test
    public void test5821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5821");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.9990382024714676d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5822");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-0.004921566601151844d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.004921526865106985d) + "'", double1 == (-0.004921526865106985d));
    }

    @Test
    public void test5823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5823");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) (-4503599627370496L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test5824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5824");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) (byte) 10, 3.814697265671259E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.2126522008770735E-10d) + "'", double2 == (-1.2126522008770735E-10d));
    }

    @Test
    public void test5825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5825");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-0.1469512391741817d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1474807043705884d) + "'", double1 == (-0.1474807043705884d));
    }

    @Test
    public void test5826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5826");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-0.0078124200636759305d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.007781982425498658d) + "'", double1 == (-0.007781982425498658d));
    }

    @Test
    public void test5827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5827");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(127.00001f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 127.000015f + "'", float1 == 127.000015f);
    }

    @Test
    public void test5828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5828");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.0536712127723509E-8d, (double) (-23));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0045702117323778E183d + "'", double2 == 3.0045702117323778E183d);
    }

    @Test
    public void test5829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5829");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(37648.554832912145d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 37648.55483291215d + "'", double1 == 37648.55483291215d);
    }

    @Test
    public void test5830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5830");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-0.9999998f), (-1.0d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.9999999f) + "'", float2 == (-0.9999999f));
    }

    @Test
    public void test5831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5831");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.0204957449291814d, 1.191775238644318d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.191775238644318d + "'", double2 == 1.191775238644318d);
    }

    @Test
    public void test5832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5832");
        double double2 = org.apache.commons.math3.util.FastMath.log((-0.6196706391381169d), 1.3377546286248103d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test5833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5833");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.926359837370816d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07649252654575009d) + "'", double1 == (-0.07649252654575009d));
    }

    @Test
    public void test5834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5834");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-5.9999995f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test5835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5835");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(70.66879307164307d, (-0.2981479726743438d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5750152498975885d + "'", double2 == 1.5750152498975885d);
    }

    @Test
    public void test5836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5836");
        int int2 = org.apache.commons.math3.util.FastMath.max(35, (-7));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test5837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5837");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.15555771015911288d, (double) 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.243720356333669E-11d + "'", double2 == 7.243720356333669E-11d);
    }

    @Test
    public void test5838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5838");
        double double2 = org.apache.commons.math3.util.FastMath.max((-1.220703121968351E-4d), 0.6690316852237952d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6690316852237952d + "'", double2 == 0.6690316852237952d);
    }

    @Test
    public void test5839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5839");
        double double1 = org.apache.commons.math3.util.FastMath.log10(4.7139912438183694E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.3266112285076845d) + "'", double1 == (-6.3266112285076845d));
    }

    @Test
    public void test5840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5840");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.9280538062512562d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.03242684373739102d) + "'", double1 == (-0.03242684373739102d));
    }

    @Test
    public void test5841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5841");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(2.3841858E-7f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.384186E-7f + "'", float1 == 2.384186E-7f);
    }

    @Test
    public void test5842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5842");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(55.51535513730588d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.034512373570679d + "'", double1 == 4.034512373570679d);
    }

    @Test
    public void test5843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5843");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 4096);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4096 + "'", int1 == 4096);
    }

    @Test
    public void test5844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5844");
        float float2 = org.apache.commons.math3.util.FastMath.max(40.999996f, (float) 47L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 47.0f + "'", float2 == 47.0f);
    }

    @Test
    public void test5845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5845");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.722369115788189d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6708957656748274d + "'", double1 == 0.6708957656748274d);
    }

    @Test
    public void test5846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5846");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(4.6566128730773926E-10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.656612873077394E-10d + "'", double1 == 4.656612873077394E-10d);
    }

    @Test
    public void test5847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5847");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.9988880079339814d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9988880079339814d + "'", double2 == 0.9988880079339814d);
    }

    @Test
    public void test5848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5848");
        double double2 = org.apache.commons.math3.util.FastMath.log(4.547473508865675E-13d, 0.394408050322395d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.03273753892205462d + "'", double2 == 0.03273753892205462d);
    }

    @Test
    public void test5849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5849");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 6400.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.457200456011224d + "'", double1 == 9.457200456011224d);
    }

    @Test
    public void test5850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5850");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-4.278021864198175d), 46.99953232786417d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.278021864198175d) + "'", double2 == (-4.278021864198175d));
    }

    @Test
    public void test5851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5851");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(52.000008f, (double) 43);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.000004f + "'", float2 == 52.000004f);
    }

    @Test
    public void test5852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5852");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(54.51884946898193d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.7559303312471385E23d + "'", double1 == 4.7559303312471385E23d);
    }

    @Test
    public void test5853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5853");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.005405263502771015d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5854");
        long long1 = org.apache.commons.math3.util.FastMath.abs(4609435868686548992L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4609435868686548992L + "'", long1 == 4609435868686548992L);
    }

    @Test
    public void test5855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5855");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(6.236369590203704d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 255.5009784735812d + "'", double1 == 255.5009784735812d);
    }

    @Test
    public void test5856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5856");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-2.3722982078608363d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test5857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5857");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.012696609983792819d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.012695927780078789d + "'", double1 == 0.012695927780078789d);
    }

    @Test
    public void test5858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5858");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-0.9171523356672744d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9171523356672743d) + "'", double1 == (-0.9171523356672743d));
    }

    @Test
    public void test5859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5859");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(7.6293945E-6f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.094947E-13f + "'", float1 == 9.094947E-13f);
    }

    @Test
    public void test5860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5860");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-0.7292653317441247d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6226156814428505d) + "'", double1 == (-0.6226156814428505d));
    }

    @Test
    public void test5861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5861");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) (-1.9999999f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test5862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5862");
        double double1 = org.apache.commons.math3.util.FastMath.acos(15.000032311418927d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5863");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.9057280121902186d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5864");
        int int2 = org.apache.commons.math3.util.FastMath.max(512, (-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 512 + "'", int2 == 512);
    }

    @Test
    public void test5865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5865");
        double double1 = org.apache.commons.math3.util.FastMath.floor(48.499996185302734d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 48.0d + "'", double1 == 48.0d);
    }

    @Test
    public void test5866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5866");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.41614683654714246d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.40498522065241216d) + "'", double1 == (-0.40498522065241216d));
    }

    @Test
    public void test5867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5867");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) (-40));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2291.831180523293d) + "'", double1 == (-2291.831180523293d));
    }

    @Test
    public void test5868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5868");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(7.693138355419427E-18d, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.693138355419427E-18d + "'", double2 == 7.693138355419427E-18d);
    }

    @Test
    public void test5869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5869");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(8.497152238144289E37d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5870");
        double double1 = org.apache.commons.math3.util.FastMath.exp(2.135016052687385E72d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5871");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) (-511));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5872");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.888024818894126E22d, 5557.000000066743d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5557.000000066743d + "'", double2 == 5557.000000066743d);
    }

    @Test
    public void test5873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5873");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(28.834862376755318d, (-2));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.2087155941888295d + "'", double2 == 7.2087155941888295d);
    }

    @Test
    public void test5874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5874");
        long long1 = org.apache.commons.math3.util.FastMath.round(6.048315279876172d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 6L + "'", long1 == 6L);
    }

    @Test
    public void test5875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5875");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(3.0517578125E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0517578115526096E-5d + "'", double1 == 3.0517578115526096E-5d);
    }

    @Test
    public void test5876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5876");
        long long1 = org.apache.commons.math3.util.FastMath.round(10.536049848239342d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 11L + "'", long1 == 11L);
    }

    @Test
    public void test5877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5877");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-2025.4348094013415d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2025.4348094013412d) + "'", double1 == (-2025.4348094013412d));
    }

    @Test
    public void test5878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5878");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.5146893481167586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1354024508652873d + "'", double1 == 1.1354024508652873d);
    }

    @Test
    public void test5879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5879");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.9912174443839006d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9912174443839007d + "'", double1 == 0.9912174443839007d);
    }

    @Test
    public void test5880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5880");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(7.2087155941888295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.20871559418883d + "'", double1 == 7.20871559418883d);
    }

    @Test
    public void test5881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5881");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(3.951243865300542d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 226.38959730867901d + "'", double1 == 226.38959730867901d);
    }

    @Test
    public void test5882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5882");
        double double2 = org.apache.commons.math3.util.FastMath.pow(221206.6960055904d, 0.25261234754667417d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 22.395565749013024d + "'", double2 == 22.395565749013024d);
    }

    @Test
    public void test5883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5883");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.5705521861747473d, 2.465190328815662E-32d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test5884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5884");
        double double2 = org.apache.commons.math3.util.FastMath.pow(10.04074995214716d, 0.6108653047770426d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.09208066049754d + "'", double2 == 4.09208066049754d);
    }

    @Test
    public void test5885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5885");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(96.99999f, (-0.8026817217694402d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 96.999985f + "'", float2 == 96.999985f);
    }

    @Test
    public void test5886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5886");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) (-48.499996f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5887");
        float float1 = org.apache.commons.math3.util.FastMath.signum(40.999992f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test5888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5888");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 41.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 41.0d + "'", double1 == 41.0d);
    }

    @Test
    public void test5889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5889");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(8.971567242793748d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.97156724279375d + "'", double1 == 8.97156724279375d);
    }

    @Test
    public void test5890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5890");
        long long1 = org.apache.commons.math3.util.FastMath.round(75.04851188756716d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 75L + "'", long1 == 75L);
    }

    @Test
    public void test5891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5891");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.7790360334325874d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1793704123873463d + "'", double1 == 1.1793704123873463d);
    }

    @Test
    public void test5892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5892");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test5893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5893");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 512);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 512L + "'", long1 == 512L);
    }

    @Test
    public void test5894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5894");
        float float2 = org.apache.commons.math3.util.FastMath.max(9.094947E-13f, 3.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test5895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5895");
        long long2 = org.apache.commons.math3.util.FastMath.min(64L, (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test5896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5896");
        float float2 = org.apache.commons.math3.util.FastMath.max(3.0000002f, (-6.1572651E13f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0000002f + "'", float2 == 3.0000002f);
    }

    @Test
    public void test5897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5897");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-43.0f), 3.4657359027997265d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-42.999996f) + "'", float2 == (-42.999996f));
    }

    @Test
    public void test5898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5898");
        double double2 = org.apache.commons.math3.util.FastMath.min((-0.7422546989427481d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7422546989427481d) + "'", double2 == (-0.7422546989427481d));
    }

    @Test
    public void test5899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5899");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) (-0.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test5900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5900");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (byte) 10, 511L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 511L + "'", long2 == 511L);
    }

    @Test
    public void test5901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5901");
        long long1 = org.apache.commons.math3.util.FastMath.round(3.6032287479334557d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void test5902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5902");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(255.5009784735812d, 52.40974502154654d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 255.5009784735812d + "'", double2 == 255.5009784735812d);
    }

    @Test
    public void test5903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5903");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(3.897326848573678E-6d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-18) + "'", int1 == (-18));
    }

    @Test
    public void test5904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5904");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) (-4096.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4096.0d) + "'", double1 == (-4096.0d));
    }

    @Test
    public void test5905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5905");
        int int2 = org.apache.commons.math3.util.FastMath.min(7, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5906");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.2461900271072904d, 3.321378896348242E-32d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test5907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5907");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) (-1.2676505E30f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test5908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5908");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(61.48000813767197d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.811793083814148d + "'", double1 == 4.811793083814148d);
    }

    @Test
    public void test5909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5909");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.0786758194172248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07573419573678206d + "'", double1 == 0.07573419573678206d);
    }

    @Test
    public void test5910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5910");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 19.999998f, 0.07389332354379241d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 19.999998092651364d + "'", double2 == 19.999998092651364d);
    }

    @Test
    public void test5911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5911");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(2.4901725564234125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.355428087198985d + "'", double1 == 1.355428087198985d);
    }

    @Test
    public void test5912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5912");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0d, 1.5395564933646286d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test5913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5913");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.0571243112754385d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8780826078734687d + "'", double1 == 1.8780826078734687d);
    }

    @Test
    public void test5914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5914");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 2147483647, (long) 43);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 43L + "'", long2 == 43L);
    }

    @Test
    public void test5915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5915");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(184.91157758310626d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0116907721169196E80d + "'", double1 == 1.0116907721169196E80d);
    }

    @Test
    public void test5916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5916");
        float float1 = org.apache.commons.math3.util.FastMath.abs(1.8880248E22f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.8880248E22f + "'", float1 == 1.8880248E22f);
    }

    @Test
    public void test5917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5917");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(Float.NEGATIVE_INFINITY, (float) (-64L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.NEGATIVE_INFINITY + "'", float2 == Float.NEGATIVE_INFINITY);
    }

    @Test
    public void test5918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5918");
        int int2 = org.apache.commons.math3.util.FastMath.min(101, (-127));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-127) + "'", int2 == (-127));
    }

    @Test
    public void test5919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5919");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(97.00001f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 97.000015f + "'", float1 == 97.000015f);
    }

    @Test
    public void test5920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5920");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.000018866625139d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5921");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.0000000000727596d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5922");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.0015785474074175d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5923");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.7675283643313486d, 0.17296530872742752d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9552682056670088d + "'", double2 == 0.9552682056670088d);
    }

    @Test
    public void test5924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5924");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(2.4901725564234125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5625001192092896d + "'", double1 == 1.5625001192092896d);
    }

    @Test
    public void test5925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5925");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 35, 20L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 20L + "'", long2 == 20L);
    }

    @Test
    public void test5926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5926");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(2.792966096227409E-4d, 25.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.792966096227409E-4d + "'", double2 == 2.792966096227409E-4d);
    }

    @Test
    public void test5927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5927");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(45.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test5928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5928");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.026048934789964995d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9996607456821384d + "'", double1 == 0.9996607456821384d);
    }

    @Test
    public void test5929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5929");
        double double1 = org.apache.commons.math3.util.FastMath.rint(12.963213729101282d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.0d + "'", double1 == 13.0d);
    }

    @Test
    public void test5930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5930");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(5.784276743882713E20d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 68 + "'", int1 == 68);
    }

    @Test
    public void test5931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5931");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.30988320573923506d, (-135.9226750568748d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 135.9230282999094d + "'", double2 == 135.9230282999094d);
    }

    @Test
    public void test5932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5932");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.25301447720775033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.004415935682487392d + "'", double1 == 0.004415935682487392d);
    }

    @Test
    public void test5933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5933");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(2.691262368354216E-19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.8148248609680896E-35d + "'", double1 == 4.8148248609680896E-35d);
    }

    @Test
    public void test5934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5934");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.6931472401645883d, 57);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.453828014809257E-10d + "'", double2 == 8.453828014809257E-10d);
    }

    @Test
    public void test5935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5935");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 127L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.5373187666271475d + "'", double1 == 5.5373187666271475d);
    }

    @Test
    public void test5936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5936");
        float float2 = org.apache.commons.math3.util.FastMath.max(32767.998f, 15.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32767.998f + "'", float2 == 32767.998f);
    }

    @Test
    public void test5937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5937");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-46.999996f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test5938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5938");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(14.999999f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.536743E-7f + "'", float1 == 9.536743E-7f);
    }

    @Test
    public void test5939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5939");
        double double1 = org.apache.commons.math3.util.FastMath.tan(2.1175823681357513E-22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1175823681357513E-22d + "'", double1 == 2.1175823681357513E-22d);
    }

    @Test
    public void test5940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5940");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.5403023058681398d, 0.9912174443839007d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1289103612676163d + "'", double2 == 1.1289103612676163d);
    }

    @Test
    public void test5941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5941");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-1.6567018738452282E-6d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.656701873845986E-6d) + "'", double1 == (-1.656701873845986E-6d));
    }

    @Test
    public void test5942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5942");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(46340.95001184158d, 0.6483635366065764d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.1854035768611937d) + "'", double2 == (-0.1854035768611937d));
    }

    @Test
    public void test5943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5943");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 57L, (-43.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-57.0f) + "'", float2 == (-57.0f));
    }

    @Test
    public void test5944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5944");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-0.7091941783435723d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7883545632203803d) + "'", double1 == (-0.7883545632203803d));
    }

    @Test
    public void test5945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5945");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-1.0f), 0.5675658254707852d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.99999994f) + "'", float2 == (-0.99999994f));
    }

    @Test
    public void test5946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5946");
        int int2 = org.apache.commons.math3.util.FastMath.min(35, (-47));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-47) + "'", int2 == (-47));
    }

    @Test
    public void test5947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5947");
        long long1 = org.apache.commons.math3.util.FastMath.round((-2400.8743011177776d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-2401L) + "'", long1 == (-2401L));
    }

    @Test
    public void test5948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5948");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 45);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5949");
        float float2 = org.apache.commons.math3.util.FastMath.max(1.9073485E-6f, (float) 127);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 127.0f + "'", float2 == 127.0f);
    }

    @Test
    public void test5950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5950");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(5.043637531419156d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08802808120042323d + "'", double1 == 0.08802808120042323d);
    }

    @Test
    public void test5951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5951");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(17.20768966381521d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5393467669822156d + "'", double1 == 3.5393467669822156d);
    }

    @Test
    public void test5952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5952");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.03274454486619997d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test5953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5953");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.3282591674459436d, 5.68627886E8d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3282591674459436d + "'", double2 == 1.3282591674459436d);
    }

    @Test
    public void test5954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5954");
        double double1 = org.apache.commons.math3.util.FastMath.floor(6.058571630099851d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.0d + "'", double1 == 6.0d);
    }

    @Test
    public void test5955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5955");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) 3.8146973E-6f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.001953125d + "'", double1 == 0.001953125d);
    }

    @Test
    public void test5956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5956");
        double double1 = org.apache.commons.math3.util.FastMath.abs(70.66879307164307d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 70.66879307164307d + "'", double1 == 70.66879307164307d);
    }

    @Test
    public void test5957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5957");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) (-17.0f), 5.916079783099616d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-16.999999999999996d) + "'", double2 == (-16.999999999999996d));
    }

    @Test
    public void test5958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5958");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.055985424956187115d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05592700522743649d + "'", double1 == 0.05592700522743649d);
    }

    @Test
    public void test5959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5959");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) (-2.34187198E17f), (int) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0546853767611393E33d) + "'", double2 == (-1.0546853767611393E33d));
    }

    @Test
    public void test5960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5960");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(9.536743164059608E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000004547d + "'", double1 == 1.0000000000004547d);
    }

    @Test
    public void test5961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5961");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) (-64L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test5962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5962");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (short) -1, (long) (-19));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-19L) + "'", long2 == (-19L));
    }

    @Test
    public void test5963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5963");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (-6));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 6L + "'", long1 == 6L);
    }

    @Test
    public void test5964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5964");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(5.916079783099616d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 369.9546370761337d + "'", double1 == 369.9546370761337d);
    }

    @Test
    public void test5965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5965");
        double double1 = org.apache.commons.math3.util.FastMath.acos(2.7711415651109443d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5966");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(200.5576604135868d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.853465795562755d + "'", double1 == 5.853465795562755d);
    }

    @Test
    public void test5967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5967");
        int int1 = org.apache.commons.math3.util.FastMath.abs(7);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test5968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5968");
        double double2 = org.apache.commons.math3.util.FastMath.log((-0.950212931632136d), (-0.7568024953079282d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test5969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5969");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 6208L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5970");
        int int1 = org.apache.commons.math3.util.FastMath.abs(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test5971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5971");
        double double1 = org.apache.commons.math3.util.FastMath.rint(223.47899536523738d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 223.0d + "'", double1 == 223.0d);
    }

    @Test
    public void test5972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5972");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.13743892845200512d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1473316345134246d + "'", double1 == 1.1473316345134246d);
    }

    @Test
    public void test5973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5973");
        double double2 = org.apache.commons.math3.util.FastMath.min(4.6566128730773926E-10d, 1.791759469228055d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.6566128730773926E-10d + "'", double2 == 4.6566128730773926E-10d);
    }

    @Test
    public void test5974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5974");
        long long1 = org.apache.commons.math3.util.FastMath.round((-0.9999999999795215d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test5975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5975");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.05240777928304121d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22892745419246074d + "'", double1 == 0.22892745419246074d);
    }

    @Test
    public void test5976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5976");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-1.656701873845986E-6d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9.492202528278994E-5d) + "'", double1 == (-9.492202528278994E-5d));
    }

    @Test
    public void test5977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5977");
        int int2 = org.apache.commons.math3.util.FastMath.max(15, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test5978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5978");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 13.000002f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.000001907348635d + "'", double1 == 13.000001907348635d);
    }

    @Test
    public void test5979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5979");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 9.536743E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.536743164059608E-7d + "'", double1 == 9.536743164059608E-7d);
    }

    @Test
    public void test5980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5980");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 62);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 62L + "'", long1 == 62L);
    }

    @Test
    public void test5981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5981");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.0986122886681098d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test5982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5982");
        long long1 = org.apache.commons.math3.util.FastMath.round((-8.000000000000002d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-8L) + "'", long1 == (-8L));
    }

    @Test
    public void test5983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5983");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.4210854715202004E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715201903E-14d + "'", double1 == 1.4210854715201903E-14d);
    }

    @Test
    public void test5984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5984");
        double double2 = org.apache.commons.math3.util.FastMath.max((-0.6256632450775597d), (-0.017453292519943295d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.017453292519943295d) + "'", double2 == (-0.017453292519943295d));
    }

    @Test
    public void test5985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5985");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-0.007781982425498658d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test5986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5986");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 8L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7686593833135738d + "'", double1 == 2.7686593833135738d);
    }

    @Test
    public void test5987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5987");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 13, (long) 6);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6L + "'", long2 == 6L);
    }

    @Test
    public void test5988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5988");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(511.50081845742295d, 1.23145302310912E15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 511.500818457423d + "'", double2 == 511.500818457423d);
    }

    @Test
    public void test5989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5989");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) (-47L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test5990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5990");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.08037538236017183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08028887010705382d + "'", double1 == 0.08028887010705382d);
    }

    @Test
    public void test5991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5991");
        int int1 = org.apache.commons.math3.util.FastMath.round((-42.999996f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-43) + "'", int1 == (-43));
    }

    @Test
    public void test5992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5992");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) (-3));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3) + "'", int1 == (-3));
    }

    @Test
    public void test5993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5993");
        double double1 = org.apache.commons.math3.util.FastMath.rint(61.48000813767197d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 61.0d + "'", double1 == 61.0d);
    }

    @Test
    public void test5994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5994");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(4.369491427691419d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 39.50805009700306d + "'", double1 == 39.50805009700306d);
    }

    @Test
    public void test5995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5995");
        double double1 = org.apache.commons.math3.util.FastMath.log((-1.4731414029041368d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5996");
        int int2 = org.apache.commons.math3.util.FastMath.min((-20), 40);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-20) + "'", int2 == (-20));
    }

    @Test
    public void test5997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5997");
        double double1 = org.apache.commons.math3.util.FastMath.abs(511.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 511.0d + "'", double1 == 511.0d);
    }

    @Test
    public void test5998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5998");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-0.9999999999795215d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5999");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.9379018508748678d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3920854323190326d + "'", double1 == 1.3920854323190326d);
    }

    @Test
    public void test6000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test6000");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(4.741297982545108d, (-3.6268604078470186d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.741297982545107d + "'", double2 == 4.741297982545107d);
    }
}

