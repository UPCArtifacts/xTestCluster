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
        double double1 = org.apache.commons.math.util.FastMath.acosh(7.217373703740946d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6648040494764125d + "'", double1 == 2.6648040494764125d);
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5502");
        long long2 = org.apache.commons.math.util.FastMath.min(37L, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 37L + "'", long2 == 37L);
    }

    @Test
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5503");
        double double2 = org.apache.commons.math.util.FastMath.max(0.009574147965999787d, (-0.008837977760189355d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.009574147965999787d + "'", double2 == 0.009574147965999787d);
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5504");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.8809094881441943E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707962736291272d + "'", double1 == 1.5707962736291272d);
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5505");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 3280, (float) 105);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 105.0f + "'", float2 == 105.0f);
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5506");
        float float2 = org.apache.commons.math.util.FastMath.min(37.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5507");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 36L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 36.0f + "'", float1 == 36.0f);
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5508");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8786264103981242d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5509");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9996486002063534d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8811250880125626d + "'", double1 == 0.8811250880125626d);
    }

    @Test
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5510");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 1.2023903267012446d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5511");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8842201103634084d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0040296487051747d + "'", double1 == 1.0040296487051747d);
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5512");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8215162026997922d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6067312385435193d + "'", double1 == 0.6067312385435193d);
    }

    @Test
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5513");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.5330688992857334d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.810826215478297d + "'", double1 == 0.810826215478297d);
    }

    @Test
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5514");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-45.80155157257448d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.577887905898817d) + "'", double1 == (-3.577887905898817d));
    }

    @Test
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5515");
        double double2 = org.apache.commons.math.util.FastMath.min(0.8554013581256903d, (-1.5534301753820028d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5534301753820028d) + "'", double2 == (-1.5534301753820028d));
    }

    @Test
    public void test5516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5516");
        long long1 = org.apache.commons.math.util.FastMath.round(0.4968798877157107d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5517");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.8412810707398334d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01468312461911342d + "'", double1 == 0.01468312461911342d);
    }

    @Test
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5518");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.2533141373154901d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5519");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.009529184458135626d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009529040241958529d + "'", double1 == 0.009529040241958529d);
    }

    @Test
    public void test5520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5520");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.5540437953657898d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.009669888429378734d) + "'", double1 == (-0.009669888429378734d));
    }

    @Test
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5521");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.3314536537354545E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5522");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.0342796520587978d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8594943771085399d + "'", double1 == 0.8594943771085399d);
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5523");
        double double1 = org.apache.commons.math.util.FastMath.atanh(16.21975758172915d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5524");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.1321130459272635d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05388979502465133d + "'", double1 == 0.05388979502465133d);
    }

    @Test
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5525");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.7089878066060047d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.52336793069389d + "'", double1 == 4.52336793069389d);
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5526");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.49073352302501017d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49073352302501017d + "'", double1 == 0.49073352302501017d);
    }

    @Test
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5527");
        double double1 = org.apache.commons.math.util.FastMath.log(2.2873554892516914d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8273963420743508d + "'", double1 == 0.8273963420743508d);
    }

    @Test
    public void test5528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5528");
        double double1 = org.apache.commons.math.util.FastMath.tan(7.627257854466711E-64d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.627257854466711E-64d + "'", double1 == 7.627257854466711E-64d);
    }

    @Test
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5529");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.9999999999999996d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5530");
        double double2 = org.apache.commons.math.util.FastMath.max(3.1053461109058813d, 97.68799240441712d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.68799240441712d + "'", double2 == 97.68799240441712d);
    }

    @Test
    public void test5531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5531");
        double double2 = org.apache.commons.math.util.FastMath.max(18.99043497517871d, (-2.741896957789622d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 18.99043497517871d + "'", double2 == 18.99043497517871d);
    }

    @Test
    public void test5532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5532");
        double double1 = org.apache.commons.math.util.FastMath.log10((-1.5707963267948788d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5533");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0046089101124813904d, 1.002644512574656d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0046089101124813904d + "'", double2 == 0.0046089101124813904d);
    }

    @Test
    public void test5534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5534");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.5287499284227857d, 1.323818048994663d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4301637214490176d + "'", double2 == 0.4301637214490176d);
    }

    @Test
    public void test5535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5535");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(8.881784197001252E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5501637768927253E-17d + "'", double1 == 1.5501637768927253E-17d);
    }

    @Test
    public void test5536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5536");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.9998000664264803d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5537");
        double double1 = org.apache.commons.math.util.FastMath.log(1.9867486543660318d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6864994605337984d + "'", double1 == 0.6864994605337984d);
    }

    @Test
    public void test5538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5538");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.0006178365651222d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7199618012878553d + "'", double1 == 2.7199618012878553d);
    }

    @Test
    public void test5539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5539");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.561952222929018d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.162094282860613d + "'", double1 == 1.162094282860613d);
    }

    @Test
    public void test5540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5540");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.5108256237659906d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.563846263782836d) + "'", double1 == (-0.563846263782836d));
    }

    @Test
    public void test5541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5541");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 3);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5542");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.5707963267948966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5543");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.0055748560585922d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7881778361100139d + "'", double1 == 0.7881778361100139d);
    }

    @Test
    public void test5544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5544");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.5461447186340243d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18925014130462198d + "'", double1 == 0.18925014130462198d);
    }

    @Test
    public void test5545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5545");
        float float2 = org.apache.commons.math.util.FastMath.max(32.0f, 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test5546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5546");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.0006726695078443d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5397361517984688d + "'", double1 == 0.5397361517984688d);
    }

    @Test
    public void test5547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5547");
        double double2 = org.apache.commons.math.util.FastMath.max(1.5567229026732161d, 8446.151861268154d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8446.151861268154d + "'", double2 == 8446.151861268154d);
    }

    @Test
    public void test5548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5548");
        long long1 = org.apache.commons.math.util.FastMath.round(1.1809708426156516d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test5549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5549");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8975275723469739d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8975275723469739d + "'", double1 == 0.8975275723469739d);
    }

    @Test
    public void test5550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5550");
        double double1 = org.apache.commons.math.util.FastMath.log(0.8095773352318997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2112429758606906d) + "'", double1 == (-0.2112429758606906d));
    }

    @Test
    public void test5551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5551");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9410822616658446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9410822616658446d + "'", double1 == 0.9410822616658446d);
    }

    @Test
    public void test5552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5552");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) 97L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test5553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5553");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(34.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5934119456780721d + "'", double1 == 0.5934119456780721d);
    }

    @Test
    public void test5554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5554");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.2961470362394922d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0760996764458408d + "'", double1 == 1.0760996764458408d);
    }

    @Test
    public void test5555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5555");
        double double2 = org.apache.commons.math.util.FastMath.max(1.4274266235030733d, 0.9925551120260716d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4274266235030733d + "'", double2 == 1.4274266235030733d);
    }

    @Test
    public void test5556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5556");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.0263252183666915d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0130771038606545d + "'", double1 == 1.0130771038606545d);
    }

    @Test
    public void test5557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5557");
        long long1 = org.apache.commons.math.util.FastMath.round(0.01805158531480737d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test5558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5558");
        double double2 = org.apache.commons.math.util.FastMath.max(0.6527019197008838d, (-0.5309802039261721d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6527019197008838d + "'", double2 == 0.6527019197008838d);
    }

    @Test
    public void test5559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5559");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 97L, 51.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test5560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5560");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5706591026530312d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5561");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.2706542725261827d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5562");
        double double1 = org.apache.commons.math.util.FastMath.tanh(101.10026952609262d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5563");
        double double1 = org.apache.commons.math.util.FastMath.signum(10.564389553932575d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5564");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.6577567619657163d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6577567619657163d + "'", double1 == 0.6577567619657163d);
    }

    @Test
    public void test5565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5565");
        int int2 = org.apache.commons.math.util.FastMath.max(2147483647, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test5566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5566");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9920889238170656d, 2.686470321113186d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3537560226829597d + "'", double2 == 0.3537560226829597d);
    }

    @Test
    public void test5567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5567");
        double double1 = org.apache.commons.math.util.FastMath.asin((-23.03580664819349d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5568");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.8485804212570964d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5569");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.0824766957749856d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test5570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5570");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.5238595366439741d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5571");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9011144562406516d, 67.38522216300166d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.013371785665437428d + "'", double2 == 0.013371785665437428d);
    }

    @Test
    public void test5572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5572");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.0548220996205258d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8851287220586892d + "'", double1 == 0.8851287220586892d);
    }

    @Test
    public void test5573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5573");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 97, 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test5574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5574");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8811250880125626d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2124393143157512d + "'", double1 == 1.2124393143157512d);
    }

    @Test
    public void test5575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5575");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.06571071737855874d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.06796916427391411d) + "'", double1 == (-0.06796916427391411d));
    }

    @Test
    public void test5576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5576");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.6367066872377056d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5626530027358592d + "'", double1 == 0.5626530027358592d);
    }

    @Test
    public void test5577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5577");
        double double2 = org.apache.commons.math.util.FastMath.pow(3.8832761544354315d, 7.419949789789507E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0010071559713323d + "'", double2 == 1.0010071559713323d);
    }

    @Test
    public void test5578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5578");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.761650491274035d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5662511487428941d + "'", double1 == 0.5662511487428941d);
    }

    @Test
    public void test5579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5579");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.1189414060601215d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test5580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5580");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.4937744707606272d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5581");
        double double2 = org.apache.commons.math.util.FastMath.min(1.2203415586770938d, 0.32485344594992666d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.32485344594992666d + "'", double2 == 0.32485344594992666d);
    }

    @Test
    public void test5582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5582");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.6563683817636521d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7045234484287022d + "'", double1 == 0.7045234484287022d);
    }

    @Test
    public void test5583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5583");
        double double1 = org.apache.commons.math.util.FastMath.expm1(6.691673596021348E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5584");
        double double1 = org.apache.commons.math.util.FastMath.atanh(263.25696924845715d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5585");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-1.0697079433475818d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5586");
        double double2 = org.apache.commons.math.util.FastMath.min(7.197874973409682E-16d, (-0.1612398348874445d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.1612398348874445d) + "'", double2 == (-0.1612398348874445d));
    }

    @Test
    public void test5587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5587");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.7208856239751529d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3758756549624582d + "'", double1 == 2.3758756549624582d);
    }

    @Test
    public void test5588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5588");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-5), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5589");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-24.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1375.0987083139757d) + "'", double1 == (-1375.0987083139757d));
    }

    @Test
    public void test5590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5590");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.7403654500754643d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9046530420463418d + "'", double1 == 0.9046530420463418d);
    }

    @Test
    public void test5591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5591");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.5440211074304587d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5712556690037496d) + "'", double1 == (-0.5712556690037496d));
    }

    @Test
    public void test5592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5592");
        double double1 = org.apache.commons.math.util.FastMath.atan(3.7084297692661896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.307405231350816d + "'", double1 == 1.307405231350816d);
    }

    @Test
    public void test5593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5593");
        double double2 = org.apache.commons.math.util.FastMath.min(6.389478437674908E19d, 24256.840282162542d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 24256.840282162542d + "'", double2 == 24256.840282162542d);
    }

    @Test
    public void test5594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5594");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9199653037215056d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0834193229964067d) + "'", double1 == (-0.0834193229964067d));
    }

    @Test
    public void test5595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5595");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9773206322293115d, (-20.060581741340517d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9773206322293114d + "'", double2 == 0.9773206322293114d);
    }

    @Test
    public void test5596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5596");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.13453038206307233d, 0.24769059955591424d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.13453038206307236d + "'", double2 == 0.13453038206307236d);
    }

    @Test
    public void test5597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5597");
        float float2 = org.apache.commons.math.util.FastMath.max(5.0f, (float) 3280L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3280.0f + "'", float2 == 3280.0f);
    }

    @Test
    public void test5598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5598");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.2329366436825557d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 70.64206609003546d + "'", double1 == 70.64206609003546d);
    }

    @Test
    public void test5599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5599");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.2688363802786091d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.903339110766513d + "'", double1 == 0.903339110766513d);
    }

    @Test
    public void test5600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5600");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 0, (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5601");
        double double2 = org.apache.commons.math.util.FastMath.min(6.369992654280958d, 1.0006726695078443d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0006726695078443d + "'", double2 == 1.0006726695078443d);
    }

    @Test
    public void test5602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5602");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.4519004066366514d, (-0.9999999887173522d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1739336581489326d + "'", double2 == 2.1739336581489326d);
    }

    @Test
    public void test5603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5603");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-3.6030305945752334d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.993646568183319d) + "'", double1 == (-1.993646568183319d));
    }

    @Test
    public void test5604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5604");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 39481480091341L, (float) 2L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.9481478E13f + "'", float2 == 3.9481478E13f);
    }

    @Test
    public void test5605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5605");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.15480950261479168d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1535845238145309d + "'", double1 == 0.1535845238145309d);
    }

    @Test
    public void test5606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5606");
        double double1 = org.apache.commons.math.util.FastMath.sinh(23.566702073076858d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.587340256999986E9d + "'", double1 == 8.587340256999986E9d);
    }

    @Test
    public void test5607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5607");
        double double2 = org.apache.commons.math.util.FastMath.pow((-9.338683839135873d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5608");
        double double1 = org.apache.commons.math.util.FastMath.log(1.5706882123157566d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.45151387510561236d + "'", double1 == 0.45151387510561236d);
    }

    @Test
    public void test5609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5609");
        double double1 = org.apache.commons.math.util.FastMath.exp(21.88870456646193d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.207329724785045E9d + "'", double1 == 3.207329724785045E9d);
    }

    @Test
    public void test5610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5610");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(170.75141916320402d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.547808231904055d + "'", double1 == 5.547808231904055d);
    }

    @Test
    public void test5611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5611");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.004331994571343558d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.004322638493447736d + "'", double1 == 0.004322638493447736d);
    }

    @Test
    public void test5612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5612");
        double double1 = org.apache.commons.math.util.FastMath.atan(6.350812057622625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4146184662102623d + "'", double1 == 1.4146184662102623d);
    }

    @Test
    public void test5613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5613");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 4, (float) 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test5614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5614");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.15852257137134684d), (-0.506549180277372d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.506549180277372d) + "'", double2 == (-0.506549180277372d));
    }

    @Test
    public void test5615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5615");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test5616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5616");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 0, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test5617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5617");
        double double1 = org.apache.commons.math.util.FastMath.atanh(3.8832761544354315d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5618");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9775291852754583d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 56.00829666714566d + "'", double1 == 56.00829666714566d);
    }

    @Test
    public void test5619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5619");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.7110135287323527d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5620");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9830779426147055d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017066871424174703d) + "'", double1 == (-0.017066871424174703d));
    }

    @Test
    public void test5621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5621");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.6742905716087851d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2360789440604127d + "'", double1 == 1.2360789440604127d);
    }

    @Test
    public void test5622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5622");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9171523356672742d, 0.4723407343250855d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9599742401453463d + "'", double2 == 0.9599742401453463d);
    }

    @Test
    public void test5623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5623");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 30.295139316469992d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test5624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5624");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.0262690355566166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5625");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.7023108900190393d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7023108900190393d + "'", double1 == 0.7023108900190393d);
    }

    @Test
    public void test5626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5626");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.3501232012518495d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5627");
        double double2 = org.apache.commons.math.util.FastMath.pow(206761.6855142214d, 1.6433908135793367d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.437442442543248E8d + "'", double2 == 5.437442442543248E8d);
    }

    @Test
    public void test5628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5628");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.5396932431839148d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 30.9221450661659d + "'", double1 == 30.9221450661659d);
    }

    @Test
    public void test5629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5629");
        double double1 = org.apache.commons.math.util.FastMath.atan(9.346544323973411d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4642103801992226d + "'", double1 == 1.4642103801992226d);
    }

    @Test
    public void test5630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5630");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 2005L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2005 + "'", int1 == 2005);
    }

    @Test
    public void test5631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5631");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.6388749269043887d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.19458415572564805d) + "'", double1 == (-0.19458415572564805d));
    }

    @Test
    public void test5632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5632");
        double double1 = org.apache.commons.math.util.FastMath.tanh(5.615978772723304d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.999973512128498d + "'", double1 == 0.999973512128498d);
    }

    @Test
    public void test5633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5633");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.8479780433329283E-10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5634");
        float float1 = org.apache.commons.math.util.FastMath.abs(51.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 51.0f + "'", float1 == 51.0f);
    }

    @Test
    public void test5635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5635");
        double double1 = org.apache.commons.math.util.FastMath.acos(4.6151205168412615d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5636");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.009529184458135626d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.009574731697409d + "'", double1 == 1.009574731697409d);
    }

    @Test
    public void test5637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5637");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.0263252183666915d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2289564131109745d + "'", double1 == 0.2289564131109745d);
    }

    @Test
    public void test5638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5638");
        double double2 = org.apache.commons.math.util.FastMath.max(1.1124045972580494d, (-0.8295667582777111d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1124045972580494d + "'", double2 == 1.1124045972580494d);
    }

    @Test
    public void test5639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5639");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.7009464435335946d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6483099600325346d + "'", double1 == 2.6483099600325346d);
    }

    @Test
    public void test5640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5640");
        int int2 = org.apache.commons.math.util.FastMath.max(4, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test5641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5641");
        double double2 = org.apache.commons.math.util.FastMath.max(0.044914698054776665d, 0.6742905716087851d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6742905716087851d + "'", double2 == 0.6742905716087851d);
    }

    @Test
    public void test5642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5642");
        long long1 = org.apache.commons.math.util.FastMath.round(1.6944597378512866E23d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test5643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5643");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5644");
        double double2 = org.apache.commons.math.util.FastMath.atan2(45.00000000000001d, 7.458883652534391d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4065367829936408d + "'", double2 == 1.4065367829936408d);
    }

    @Test
    public void test5645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5645");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.773775678340353d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1752011936438014d + "'", double1 == 1.1752011936438014d);
    }

    @Test
    public void test5646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5646");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) 37);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8407712554027597d) + "'", double1 == (-0.8407712554027597d));
    }

    @Test
    public void test5647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5647");
        double double2 = org.apache.commons.math.util.FastMath.max(0.027576681278744613d, (-0.5063656411097465d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.027576681278744613d + "'", double2 == 0.027576681278744613d);
    }

    @Test
    public void test5648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5648");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) 105.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5612728052012839d + "'", double1 == 1.5612728052012839d);
    }

    @Test
    public void test5649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5649");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.012097405429255696d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.012170875003147102d + "'", double1 == 0.012170875003147102d);
    }

    @Test
    public void test5650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5650");
        double double2 = org.apache.commons.math.util.FastMath.min(0.5960035785549811d, 0.1535845238145309d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1535845238145309d + "'", double2 == 0.1535845238145309d);
    }

    @Test
    public void test5651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5651");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.48918804941198646d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1220577081499448d + "'", double1 == 1.1220577081499448d);
    }

    @Test
    public void test5652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5652");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.7853981633974484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6674572160283836d + "'", double1 == 0.6674572160283836d);
    }

    @Test
    public void test5653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5653");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.8721824073781501d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 49.97237090832783d + "'", double1 == 49.97237090832783d);
    }

    @Test
    public void test5654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5654");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.0546274546035364d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.919478395420294d + "'", double1 == 0.919478395420294d);
    }

    @Test
    public void test5655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5655");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.642227864217147d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5664145707743943d) + "'", double1 == (-0.5664145707743943d));
    }

    @Test
    public void test5656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5656");
        int int2 = org.apache.commons.math.util.FastMath.max((int) 'a', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test5657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5657");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 36L, 0.024231811661011956d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.090716866767325d + "'", double2 == 1.090716866767325d);
    }

    @Test
    public void test5658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5658");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.8429918589553218d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07417661947709976d) + "'", double1 == (-0.07417661947709976d));
    }

    @Test
    public void test5659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5659");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 36, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5660");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(6.6816769952264465d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8834835249601802d + "'", double1 == 1.8834835249601802d);
    }

    @Test
    public void test5661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5661");
        int int2 = org.apache.commons.math.util.FastMath.min((-5), (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test5662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5662");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.017939523577309636d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.017939523577309633d) + "'", double2 == (-0.017939523577309633d));
    }

    @Test
    public void test5663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5663");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8577635057812734d, 11.000000000000002d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8577635057812735d + "'", double2 == 0.8577635057812735d);
    }

    @Test
    public void test5664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5664");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.732511156817248d + "'", double1 == 3.732511156817248d);
    }

    @Test
    public void test5665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5665");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 39481480091341L, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.9481478E13f + "'", float2 == 3.9481478E13f);
    }

    @Test
    public void test5666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5666");
        double double1 = org.apache.commons.math.util.FastMath.log(1.87163938376703d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6268147226219475d + "'", double1 == 0.6268147226219475d);
    }

    @Test
    public void test5667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5667");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 83, (long) 105);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 83L + "'", long2 == 83L);
    }

    @Test
    public void test5668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5668");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9177909876895602d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.016018474580313573d + "'", double1 == 0.016018474580313573d);
    }

    @Test
    public void test5669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5669");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.2169902071303054d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2169902071303054d + "'", double1 == 2.2169902071303054d);
    }

    @Test
    public void test5670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5670");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.2973397658232583E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.433209317616326E-4d + "'", double1 == 7.433209317616326E-4d);
    }

    @Test
    public void test5671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5671");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.23513817840335527d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23513817840335527d + "'", double1 == 0.23513817840335527d);
    }

    @Test
    public void test5672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5672");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.8786264103981242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7057305228913112d + "'", double1 == 0.7057305228913112d);
    }

    @Test
    public void test5673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5673");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.02743512020789183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5674");
        double double1 = org.apache.commons.math.util.FastMath.acos(35.522071152216526d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5675");
        long long1 = org.apache.commons.math.util.FastMath.round(2.3758756549624582d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test5676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5676");
        double double1 = org.apache.commons.math.util.FastMath.asinh(5.615978772723304d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4265970856990524d + "'", double1 == 2.4265970856990524d);
    }

    @Test
    public void test5677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5677");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 97, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test5678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5678");
        double double2 = org.apache.commons.math.util.FastMath.pow(5.540576635540658E-29d, 0.5068676300960875d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.7612684746384655E-15d + "'", double2 == 4.7612684746384655E-15d);
    }

    @Test
    public void test5679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5679");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 4L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test5680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5680");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.31982834465543714d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0515825442092397d + "'", double1 == 1.0515825442092397d);
    }

    @Test
    public void test5681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5681");
        long long2 = org.apache.commons.math.util.FastMath.min(32L, 5L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test5682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5682");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.0342796520587978d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test5683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5683");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 0, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5684");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 83, 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test5685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5685");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.3876206984207269d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9832702015119618d + "'", double1 == 0.9832702015119618d);
    }

    @Test
    public void test5686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5686");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.16601303451652816d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16601303451652819d + "'", double1 == 0.16601303451652819d);
    }

    @Test
    public void test5687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5687");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-6.210206070423941d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5688");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9891013135438892d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.549440964133183d + "'", double1 == 0.549440964133183d);
    }

    @Test
    public void test5689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5689");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9999732656496859d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5573161494475687d + "'", double1 == 1.5573161494475687d);
    }

    @Test
    public void test5690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5690");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-1.9080796112182217d), 0.016379903021458187d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.9080796112182214d) + "'", double2 == (-1.9080796112182214d));
    }

    @Test
    public void test5691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5691");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.7503427504189538d), 0.4451963704655766d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7503427504189538d) + "'", double2 == (-0.7503427504189538d));
    }

    @Test
    public void test5692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5692");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.7182818284589487d, 0.46767478906827653d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3050576120022406d + "'", double2 == 1.3050576120022406d);
    }

    @Test
    public void test5693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5693");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.024913294410754107d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test5694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5694");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5695");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 100, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test5696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5696");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '4', 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test5697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5697");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.0582197318914828d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5698");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.763174989259044d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8394460338243901d) + "'", double1 == (-0.8394460338243901d));
    }

    @Test
    public void test5699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5699");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.7386363584579885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1315693185520315d) + "'", double1 == (-0.1315693185520315d));
    }

    @Test
    public void test5700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5700");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.8832761544354315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 24.281268577433625d + "'", double1 == 24.281268577433625d);
    }

    @Test
    public void test5701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5701");
        double double2 = org.apache.commons.math.util.FastMath.min((double) (short) 1, 6558.851092551817d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5702");
        double double1 = org.apache.commons.math.util.FastMath.signum(572.9577948946323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5703");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.0000000000000047d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5704");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.3665789367467411d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3513674588745653d + "'", double1 == 0.3513674588745653d);
    }

    @Test
    public void test5705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5705");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.0000000041223074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8813735899344545d + "'", double1 == 0.8813735899344545d);
    }

    @Test
    public void test5706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5706");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.8940757456435277d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9633662731223872d + "'", double1 == 0.9633662731223872d);
    }

    @Test
    public void test5707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5707");
        double double1 = org.apache.commons.math.util.FastMath.abs(9.848857801796104d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.848857801796104d + "'", double1 == 9.848857801796104d);
    }

    @Test
    public void test5708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5708");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) -1, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test5709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5709");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.7618369854566598d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6902517951841332d + "'", double1 == 0.6902517951841332d);
    }

    @Test
    public void test5710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5710");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.035892577326765d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.110505475945193d + "'", double1 == 1.110505475945193d);
    }

    @Test
    public void test5711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5711");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9852091021909104d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5712");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.5712556690037496d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8412227123888032d + "'", double1 == 0.8412227123888032d);
    }

    @Test
    public void test5713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5713");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.9170462317842702d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9170462317842701d) + "'", double1 == (-0.9170462317842701d));
    }

    @Test
    public void test5714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5714");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(206762.68551422175d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 454.711650955d + "'", double1 == 454.711650955d);
    }

    @Test
    public void test5715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5715");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9998000199980002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.693047185559612d + "'", double1 == 0.693047185559612d);
    }

    @Test
    public void test5716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5716");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.999329299739067d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.999664593620814d + "'", double1 == 0.999664593620814d);
    }

    @Test
    public void test5717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5717");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 36.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5718");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.8215162026997922d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2739449866281343d + "'", double1 == 1.2739449866281343d);
    }

    @Test
    public void test5719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5719");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.009483282630450406d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009482998360211877d + "'", double1 == 0.009482998360211877d);
    }

    @Test
    public void test5720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5720");
        float float2 = org.apache.commons.math.util.FastMath.max((float) '#', (float) 5L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test5721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5721");
        double double2 = org.apache.commons.math.util.FastMath.min(1.020378157273836d, 0.9092974268256817d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9092974268256817d + "'", double2 == 0.9092974268256817d);
    }

    @Test
    public void test5722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5722");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.7812235738686848d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5723");
        double double2 = org.apache.commons.math.util.FastMath.min(0.34993634420390274d, 1.3838278255465983d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.34993634420390274d + "'", double2 == 0.34993634420390274d);
    }

    @Test
    public void test5724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5724");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.5108256237659906d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.39999999999999997d) + "'", double1 == (-0.39999999999999997d));
    }

    @Test
    public void test5725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5725");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.0601505205018036d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01850311714948812d + "'", double1 == 0.01850311714948812d);
    }

    @Test
    public void test5726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5726");
        long long1 = org.apache.commons.math.util.FastMath.abs(105L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 105L + "'", long1 == 105L);
    }

    @Test
    public void test5727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5727");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.5665394379443537d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5728");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(5.615978772723304d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7774954015215239d + "'", double1 == 1.7774954015215239d);
    }

    @Test
    public void test5729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5729");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) (short) 10, 2.719301677299958d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.999999999999998d + "'", double2 == 9.999999999999998d);
    }

    @Test
    public void test5730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5730");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.9992790497916413d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017440709565064497d) + "'", double1 == (-0.017440709565064497d));
    }

    @Test
    public void test5731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5731");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.8370086477683244d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7426431749340047d + "'", double1 == 0.7426431749340047d);
    }

    @Test
    public void test5732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5732");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 2005, 3280L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2005L + "'", long2 == 2005L);
    }

    @Test
    public void test5733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5733");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.6731224799838768d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test5734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5734");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.0011273202561264d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5393533554611306d + "'", double1 == 0.5393533554611306d);
    }

    @Test
    public void test5735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5735");
        double double1 = org.apache.commons.math.util.FastMath.asin(4.641588833612778d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5736");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.20812481305103553d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5737");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.44603181533298825d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1084695524210841d + "'", double1 == 1.1084695524210841d);
    }

    @Test
    public void test5738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5738");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.916591747188271d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test5739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5739");
        int int2 = org.apache.commons.math.util.FastMath.min(3280, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3280 + "'", int2 == 3280);
    }

    @Test
    public void test5740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5740");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.4879978688854127d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test5741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5741");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5742");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.8593549916052095d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5743");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 'a', 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test5744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5744");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test5745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5745");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.4274266235030735d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5746");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.04540802173355351d, 2.2453438403535575d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.656081302343674E-4d + "'", double2 == 9.656081302343674E-4d);
    }

    @Test
    public void test5747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5747");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.7853981633974483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3246090892520057d + "'", double1 == 1.3246090892520057d);
    }

    @Test
    public void test5748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5748");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.44443064002423105d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6411892396145616d + "'", double1 == 0.6411892396145616d);
    }

    @Test
    public void test5749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5749");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.006354376503654261d, 0.5186693692550166d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.006354376503654262d + "'", double2 == 0.006354376503654262d);
    }

    @Test
    public void test5750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5750");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.2334031175112035d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09110504180084364d + "'", double1 == 0.09110504180084364d);
    }

    @Test
    public void test5751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5751");
        int int2 = org.apache.commons.math.util.FastMath.min(100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test5752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5752");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.009483282630450406d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.00952839143559888d + "'", double1 == 0.00952839143559888d);
    }

    @Test
    public void test5753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5753");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.017644339434135358d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017643423934446175d + "'", double1 == 0.017643423934446175d);
    }

    @Test
    public void test5754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5754");
        double double1 = org.apache.commons.math.util.FastMath.ulp(3.3180014821023565d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test5755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5755");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 51L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5756");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-5), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5757");
        int int2 = org.apache.commons.math.util.FastMath.min(3, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test5758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5758");
        double double1 = org.apache.commons.math.util.FastMath.acosh(7.627257854466711E-64d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5759");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.3376075000685986d), 0.9443504370351302d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.3376075000685986d) + "'", double2 == (-0.3376075000685986d));
    }

    @Test
    public void test5760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5760");
        float float2 = org.apache.commons.math.util.FastMath.max(2.0f, (float) 83);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 83.0f + "'", float2 == 83.0f);
    }

    @Test
    public void test5761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5761");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.49134394501154993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5762");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.8245906506052292d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.014391821834223422d + "'", double1 == 0.014391821834223422d);
    }

    @Test
    public void test5763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5763");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9736488930495181d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5764");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.8422760256473161d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9177559728202895d + "'", double1 == 0.9177559728202895d);
    }

    @Test
    public void test5765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5765");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.4602546797556596d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.47667728856676383d + "'", double1 == 0.47667728856676383d);
    }

    @Test
    public void test5766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5766");
        double double1 = org.apache.commons.math.util.FastMath.log(0.015373606509534388d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.175103102923241d) + "'", double1 == (-4.175103102923241d));
    }

    @Test
    public void test5767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5767");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.6645457244960807d), 0.9931536250913602d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6645457244960806d) + "'", double2 == (-0.6645457244960806d));
    }

    @Test
    public void test5768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5768");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 572.9577951308232d + "'", double1 == 572.9577951308232d);
    }

    @Test
    public void test5769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5769");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.1679173671934143E40d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5770");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2, (float) 3);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test5771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5771");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9410822616658446d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5772");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.557407724654903d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5773");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-3.6923537059133387d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5774");
        double double1 = org.apache.commons.math.util.FastMath.cosh(81.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.530486572925153E34d + "'", double1 == 7.530486572925153E34d);
    }

    @Test
    public void test5775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5775");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.5398933564353804d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5828104020387707d + "'", double1 == 0.5828104020387707d);
    }

    @Test
    public void test5776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5776");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.04537684510870222d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.045392418971857494d + "'", double1 == 0.045392418971857494d);
    }

    @Test
    public void test5777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5777");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.8495160374040984d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.849516037404099d + "'", double1 == 2.849516037404099d);
    }

    @Test
    public void test5778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5778");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 83);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 83 + "'", int1 == 83);
    }

    @Test
    public void test5779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5779");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.4274266235030735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14287905018325414d + "'", double1 == 0.14287905018325414d);
    }

    @Test
    public void test5780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5780");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.5186693692550166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4766723751659123d + "'", double1 == 0.4766723751659123d);
    }

    @Test
    public void test5781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5781");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 37, (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test5782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5782");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.4109596116102156d), 2.021274582737079d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.021274582737079d + "'", double2 == 2.021274582737079d);
    }

    @Test
    public void test5783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5783");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9852091021909104d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7553120507051592d + "'", double1 == 0.7553120507051592d);
    }

    @Test
    public void test5784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5784");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.7763568394002505E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test5785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5785");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.994092364175252d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9108492743842254d + "'", double1 == 2.9108492743842254d);
    }

    @Test
    public void test5786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5786");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.373400766945016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 78.69006752597979d + "'", double1 == 78.69006752597979d);
    }

    @Test
    public void test5787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5787");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.0001341536109207d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.016379903021454603d + "'", double1 == 0.016379903021454603d);
    }

    @Test
    public void test5788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5788");
        float float2 = org.apache.commons.math.util.FastMath.min(32.0f, (float) 52L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test5789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5789");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.004988998432693164d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.004989019128835027d + "'", double1 == 0.004989019128835027d);
    }

    @Test
    public void test5790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5790");
        double double2 = org.apache.commons.math.util.FastMath.min(1.3205004784536856d, 0.23066270610605835d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.23066270610605835d + "'", double2 == 0.23066270610605835d);
    }

    @Test
    public void test5791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5791");
        double double2 = org.apache.commons.math.util.FastMath.min(Double.POSITIVE_INFINITY, 8.881784197001248E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.881784197001248E-16d + "'", double2 == 8.881784197001248E-16d);
    }

    @Test
    public void test5792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5792");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9961166569635705d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test5793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5793");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 83, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 83.0f + "'", float2 == 83.0f);
    }

    @Test
    public void test5794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5794");
        double double1 = org.apache.commons.math.util.FastMath.cos((-3.8933129033597975d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7305151979037297d) + "'", double1 == (-0.7305151979037297d));
    }

    @Test
    public void test5795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5795");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.9999999999999996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9899924966004454d) + "'", double1 == (-0.9899924966004454d));
    }

    @Test
    public void test5796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5796");
        double double1 = org.apache.commons.math.util.FastMath.sin(3279.925622497139d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10271069580023484d + "'", double1 == 0.10271069580023484d);
    }

    @Test
    public void test5797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5797");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 4L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.0f + "'", float1 == 4.0f);
    }

    @Test
    public void test5798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5798");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 3, 3280L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test5799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5799");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.5586683478888236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7483427651077704d + "'", double1 == 0.7483427651077704d);
    }

    @Test
    public void test5800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5800");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9437759606812824d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.02513108895156632d) + "'", double1 == (-0.02513108895156632d));
    }

    @Test
    public void test5801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5801");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.6771773793540653d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011818974889755111d + "'", double1 == 0.011818974889755111d);
    }

    @Test
    public void test5802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5802");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.22579135264471936d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5803");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9335211344483768d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2041117693158079d + "'", double1 == 1.2041117693158079d);
    }

    @Test
    public void test5804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5804");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(526.8331299048269d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.194972725426231d + "'", double1 == 9.194972725426231d);
    }

    @Test
    public void test5805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5805");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.3873278861326919d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9259216633721817d + "'", double1 == 0.9259216633721817d);
    }

    @Test
    public void test5806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5806");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.834032445247956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.986376732742283d + "'", double1 == 0.986376732742283d);
    }

    @Test
    public void test5807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5807");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.8245906506052292d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6895564260441728d + "'", double1 == 0.6895564260441728d);
    }

    @Test
    public void test5808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5808");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.3796077390275217d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3893722612835904d + "'", double1 == 0.3893722612835904d);
    }

    @Test
    public void test5809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5809");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.1998574867931386d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.319643795940943d + "'", double1 == 3.319643795940943d);
    }

    @Test
    public void test5810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5810");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.27629111752846225d, 0.13355056135114904d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.120541818054245d + "'", double2 == 1.120541818054245d);
    }

    @Test
    public void test5811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5811");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.6015665163590591d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.010499316380217913d) + "'", double1 == (-0.010499316380217913d));
    }

    @Test
    public void test5812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5812");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 10, 49.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test5813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5813");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.018549468453479d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5814");
        double double2 = org.apache.commons.math.util.FastMath.max(9.0d, (double) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.0d + "'", double2 == 9.0d);
    }

    @Test
    public void test5815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5815");
        double double1 = org.apache.commons.math.util.FastMath.sin(9.079986106087252E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.07998609361042E-5d + "'", double1 == 9.07998609361042E-5d);
    }

    @Test
    public void test5816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5816");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.2389916350019468d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09306837426568475d + "'", double1 == 0.09306837426568475d);
    }

    @Test
    public void test5817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5817");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.5130380898365219d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.540504321144943d + "'", double1 == 4.540504321144943d);
    }

    @Test
    public void test5818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5818");
        double double1 = org.apache.commons.math.util.FastMath.signum(9.346544323973411d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5819");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.15339215657878688d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15400014759046565d + "'", double1 == 0.15400014759046565d);
    }

    @Test
    public void test5820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5820");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2147483647L, (float) 49);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test5821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5821");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.5594482377087571d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8197273324702877d) + "'", double1 == (-0.8197273324702877d));
    }

    @Test
    public void test5822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5822");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.3845986357215d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18512365528736835d + "'", double1 == 0.18512365528736835d);
    }

    @Test
    public void test5823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5823");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5824");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 5, 2005.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test5825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5825");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9259216633721817d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9259216633721817d + "'", double1 == 0.9259216633721817d);
    }

    @Test
    public void test5826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5826");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.999999931632527d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1752010881472805d + "'", double1 == 1.1752010881472805d);
    }

    @Test
    public void test5827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5827");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5828");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.4486454104649d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9666101045767669d + "'", double1 == 0.9666101045767669d);
    }

    @Test
    public void test5829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5829");
        long long1 = org.apache.commons.math.util.FastMath.round((-15.142795701282697d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-15L) + "'", long1 == (-15L));
    }

    @Test
    public void test5830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5830");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9995920864606948d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5831");
        float float2 = org.apache.commons.math.util.FastMath.min(10.0f, 3280.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test5832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5832");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-1.139171425638416d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5833");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.19240232444172636d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4386368936167207d + "'", double1 == 0.4386368936167207d);
    }

    @Test
    public void test5834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5834");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(5.540576635540658E-29d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.540576635540659E-29d + "'", double1 == 5.540576635540659E-29d);
    }

    @Test
    public void test5835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5835");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.2599210498948732d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5836");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-1.5603171037625536d), 3.8917039619221607d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5603171037625534d) + "'", double2 == (-1.5603171037625534d));
    }

    @Test
    public void test5837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5837");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 10L, (float) 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test5838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5838");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.19031501614144256d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.003321623647654327d + "'", double1 == 0.003321623647654327d);
    }

    @Test
    public void test5839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5839");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.8797429772373989d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4148895340330202d + "'", double1 == 0.4148895340330202d);
    }

    @Test
    public void test5840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5840");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.5604872310455469d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02723564011707427d + "'", double1 == 0.02723564011707427d);
    }

    @Test
    public void test5841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5841");
        long long2 = org.apache.commons.math.util.FastMath.min(3280L, (-15L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-15L) + "'", long2 == (-15L));
    }

    @Test
    public void test5842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5842");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.763174989259044d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5843");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.0688352722094745d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9976317879787119d + "'", double1 == 0.9976317879787119d);
    }

    @Test
    public void test5844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5844");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.041446469648192756d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0008590278831344d + "'", double1 == 1.0008590278831344d);
    }

    @Test
    public void test5845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5845");
        double double1 = org.apache.commons.math.util.FastMath.exp(6.241434156324286E213d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5846");
        double double1 = org.apache.commons.math.util.FastMath.floor(101.10026952609262d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 101.0d + "'", double1 == 101.0d);
    }

    @Test
    public void test5847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5847");
        double double1 = org.apache.commons.math.util.FastMath.abs(3.948148009134034E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.948148009134034E13d + "'", double1 == 3.948148009134034E13d);
    }

    @Test
    public void test5848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5848");
        double double2 = org.apache.commons.math.util.FastMath.max(1.5707960187421175d, 137.38927884571783d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 137.38927884571783d + "'", double2 == 137.38927884571783d);
    }

    @Test
    public void test5849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5849");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.3537560226829597d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test5850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5850");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 52, 37L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 37L + "'", long2 == 37L);
    }

    @Test
    public void test5851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5851");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(7.370686677641593d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9461186593911408d + "'", double1 == 1.9461186593911408d);
    }

    @Test
    public void test5852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5852");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.4705882352941176d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4705882352941176d + "'", double1 == 0.4705882352941176d);
    }

    @Test
    public void test5853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5853");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.14891233518812158d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14782130697168147d + "'", double1 == 0.14782130697168147d);
    }

    @Test
    public void test5854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5854");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 36);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 36.0f + "'", float1 == 36.0f);
    }

    @Test
    public void test5855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5855");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.5073232748473712d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5856");
        double double1 = org.apache.commons.math.util.FastMath.exp(6.6816769952264465d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 797.6556557409763d + "'", double1 == 797.6556557409763d);
    }

    @Test
    public void test5857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5857");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.561952222929018d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7540935415234277d + "'", double1 == 0.7540935415234277d);
    }

    @Test
    public void test5858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5858");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.029875845395236918d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.02987140123225264d) + "'", double1 == (-0.02987140123225264d));
    }

    @Test
    public void test5859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5859");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.638569140438832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06350501156211757d + "'", double1 == 0.06350501156211757d);
    }

    @Test
    public void test5860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5860");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 97, 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test5861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5861");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.6214949279424251d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.60903635988817d + "'", double1 == 35.60903635988817d);
    }

    @Test
    public void test5862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5862");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8956160578519576d, 1.0263252183666915d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8930205839940679d + "'", double2 == 0.8930205839940679d);
    }

    @Test
    public void test5863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5863");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9997923526102078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test5864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5864");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 1, (float) 51L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test5865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5865");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-45.801551572574475d), 0.09189023888044913d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5687900603598932d) + "'", double2 == (-1.5687900603598932d));
    }

    @Test
    public void test5866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5866");
        double double1 = org.apache.commons.math.util.FastMath.log1p(11013.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.306922469822426d + "'", double1 == 9.306922469822426d);
    }

    @Test
    public void test5867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5867");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.3314955002296929d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5868");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.1598987305185837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.859294024659841d + "'", double1 == 0.859294024659841d);
    }

    @Test
    public void test5869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5869");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.6881171418161356E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.951760157141521E27d + "'", double1 == 4.951760157141521E27d);
    }

    @Test
    public void test5870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5870");
        double double1 = org.apache.commons.math.util.FastMath.tanh(5.551115123125783E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test5871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5871");
        double double2 = org.apache.commons.math.util.FastMath.min((-2.3079900215284027E-5d), 2.0634370688955608d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.3079900215284027E-5d) + "'", double2 == (-2.3079900215284027E-5d));
    }

    @Test
    public void test5872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5872");
        double double1 = org.apache.commons.math.util.FastMath.ceil(6.369992654280958d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.0d + "'", double1 == 7.0d);
    }

    @Test
    public void test5873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5873");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.010308730556720751d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.010308913150124476d + "'", double1 == 0.010308913150124476d);
    }

    @Test
    public void test5874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5874");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.47667728856676383d, 0.28172266585745886d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8116121448957726d + "'", double2 == 0.8116121448957726d);
    }

    @Test
    public void test5875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5875");
        int int2 = org.apache.commons.math.util.FastMath.max(0, 51);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 51 + "'", int2 == 51);
    }

    @Test
    public void test5876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5876");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-1.5687900603598932d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.2962694498554344d) + "'", double1 == (-2.2962694498554344d));
    }

    @Test
    public void test5877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5877");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.0000000000000142d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5878");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.903339110766513d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.031307691441385d + "'", double1 == 1.031307691441385d);
    }

    @Test
    public void test5879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5879");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.4640783251232936d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test5880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5880");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.7866720044340358d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-45.072985715167036d) + "'", double1 == (-45.072985715167036d));
    }

    @Test
    public void test5881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5881");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.2332224121042599d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5882");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.0768893216246815d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.822360861120021d + "'", double1 == 10.822360861120021d);
    }

    @Test
    public void test5883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5883");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1, (float) 35);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test5884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5884");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 0, (float) 49);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5885");
        double double1 = org.apache.commons.math.util.FastMath.tan((-1.493095594279128d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-12.84398086442106d) + "'", double1 == (-12.84398086442106d));
    }

    @Test
    public void test5886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5886");
        float float2 = org.apache.commons.math.util.FastMath.max((-1.0f), (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5887");
        double double1 = org.apache.commons.math.util.FastMath.log(10.270240799447087d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3292504705445696d + "'", double1 == 2.3292504705445696d);
    }

    @Test
    public void test5888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5888");
        int int1 = org.apache.commons.math.util.FastMath.abs(2005);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2005 + "'", int1 == 2005);
    }

    @Test
    public void test5889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5889");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.1226744880631757d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5890");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.1598639151884341d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5891");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.4531113122902532d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.36435262567673204d) + "'", double1 == (-0.36435262567673204d));
    }

    @Test
    public void test5892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5892");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.5268171949666718d, 1.9461186593911408d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.526817194966672d + "'", double2 == 1.526817194966672d);
    }

    @Test
    public void test5893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5893");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.019228399099707562d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01904586955638303d + "'", double1 == 0.01904586955638303d);
    }

    @Test
    public void test5894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5894");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 49, (float) 2005L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 49.0f + "'", float2 == 49.0f);
    }

    @Test
    public void test5895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5895");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.2334031175112035d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5896");
        double double1 = org.apache.commons.math.util.FastMath.abs(7.93006726156721E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.93006726156721E14d + "'", double1 == 7.93006726156721E14d);
    }

    @Test
    public void test5897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5897");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.1057044739884163d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8603154559760037d + "'", double1 == 0.8603154559760037d);
    }

    @Test
    public void test5898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5898");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.3458349416236008d), 0.8674323532966371d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test5899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5899");
        double double1 = org.apache.commons.math.util.FastMath.floor(1350.2725658295117d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1350.0d + "'", double1 == 1350.0d);
    }

    @Test
    public void test5900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5900");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.3458349416236008d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.060399309368239d + "'", double1 == 1.060399309368239d);
    }

    @Test
    public void test5901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5901");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.15480950261479168d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5902");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(3.256962950186429d, 0.9999999535225789d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.2569629501864283d + "'", double2 == 3.2569629501864283d);
    }

    @Test
    public void test5903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5903");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.19068994544354323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19184771387583854d + "'", double1 == 0.19184771387583854d);
    }

    @Test
    public void test5904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5904");
        double double1 = org.apache.commons.math.util.FastMath.cos(6.528325605543861E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999997869048315d + "'", double1 == 0.9999997869048315d);
    }

    @Test
    public void test5905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5905");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 3280, (float) 36L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 36.0f + "'", float2 == 36.0f);
    }

    @Test
    public void test5906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5906");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.052375708539775356d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.37414789288563605d + "'", double1 == 0.37414789288563605d);
    }

    @Test
    public void test5907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5907");
        int int1 = org.apache.commons.math.util.FastMath.round(36.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 36 + "'", int1 == 36);
    }

    @Test
    public void test5908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5908");
        long long1 = org.apache.commons.math.util.FastMath.round(1.2240401467946809d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test5909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5909");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.23089832850992176d, 0.5586683478888236d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4409235992694476d + "'", double2 == 0.4409235992694476d);
    }

    @Test
    public void test5910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5910");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.022050124548843d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0220501245488431d + "'", double1 == 1.0220501245488431d);
    }

    @Test
    public void test5911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5911");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.12635496824759004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1260190148607026d + "'", double1 == 0.1260190148607026d);
    }

    @Test
    public void test5912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5912");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.45620698487751754d, 0.8490333012771822d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.49306002492053314d + "'", double2 == 0.49306002492053314d);
    }

    @Test
    public void test5913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5913");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.8222073183777728d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7326499267490831d + "'", double1 == 0.7326499267490831d);
    }

    @Test
    public void test5914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5914");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.757421577635591d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.757421577635591d + "'", double1 == 0.757421577635591d);
    }

    @Test
    public void test5915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5915");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.045799397948117d, 0.13417614850536844d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1008050323661345d + "'", double2 == 1.1008050323661345d);
    }

    @Test
    public void test5916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5916");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 'a', 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test5917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5917");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5918");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.2701149951815156d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.297283862524131d + "'", double1 == 1.297283862524131d);
    }

    @Test
    public void test5919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5919");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test5920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5920");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.1483794481285463d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9825023553843626d + "'", double1 == 0.9825023553843626d);
    }

    @Test
    public void test5921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5921");
        int int2 = org.apache.commons.math.util.FastMath.min(2005, 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test5922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5922");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.0713634642907175d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 61.38460482837299d + "'", double1 == 61.38460482837299d);
    }

    @Test
    public void test5923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5923");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5924");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.5209620005493156d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5925");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.4531113122902532d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4886084917392758d) + "'", double1 == (-0.4886084917392758d));
    }

    @Test
    public void test5926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5926");
        double double1 = org.apache.commons.math.util.FastMath.log(49.00510204081635d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8919244159721402d + "'", double1 == 3.8919244159721402d);
    }

    @Test
    public void test5927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5927");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.0046089101124813904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.044065639126247E-5d + "'", double1 == 8.044065639126247E-5d);
    }

    @Test
    public void test5928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5928");
        double double1 = org.apache.commons.math.util.FastMath.exp(5.916079783099616d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 370.9546370761337d + "'", double1 == 370.9546370761337d);
    }

    @Test
    public void test5929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5929");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.3314536537354545E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5930");
        double double1 = org.apache.commons.math.util.FastMath.log10((-1.8648847565896696d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5931");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9046530420463418d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5932");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.87163938376703d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 107.23703746031701d + "'", double1 == 107.23703746031701d);
    }

    @Test
    public void test5933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5933");
        long long2 = org.apache.commons.math.util.FastMath.min(97L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5934");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.6335140007329975d, 0.5473651378551417d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8582223106685993d + "'", double2 == 0.8582223106685993d);
    }

    @Test
    public void test5935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5935");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.7540935415234277d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.982378144193713d + "'", double1 == 0.982378144193713d);
    }

    @Test
    public void test5936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5936");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 83L, 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 83.0f + "'", float2 == 83.0f);
    }

    @Test
    public void test5937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5937");
        double double1 = org.apache.commons.math.util.FastMath.tan(5.006715348489118d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.298908792988334d) + "'", double1 == (-3.298908792988334d));
    }

    @Test
    public void test5938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5938");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-5), (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5L) + "'", long2 == (-5L));
    }

    @Test
    public void test5939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5939");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.28847397809838626d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005034820724142851d + "'", double1 == 0.005034820724142851d);
    }

    @Test
    public void test5940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5940");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.1612398348874445d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.15985689504214476d) + "'", double1 == (-0.15985689504214476d));
    }

    @Test
    public void test5941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5941");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.1256209726545494d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9674721194636711d + "'", double1 == 0.9674721194636711d);
    }

    @Test
    public void test5942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5942");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8370086477683244d, 0.8692376423995615d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8370086477683245d + "'", double2 == 0.8370086477683245d);
    }

    @Test
    public void test5943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5943");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-1.3348404966530283d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8704274115404477d) + "'", double1 == (-0.8704274115404477d));
    }

    @Test
    public void test5944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5944");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.017644339434135358d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5531510717185382d + "'", double1 == 1.5531510717185382d);
    }

    @Test
    public void test5945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5945");
        long long2 = org.apache.commons.math.util.FastMath.max(97L, 4L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test5946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5946");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.8623188722876838d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3023186765274481d + "'", double1 == 1.3023186765274481d);
    }

    @Test
    public void test5947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5947");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.999848038217972d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999493435066203d + "'", double1 == 0.9999493435066203d);
    }

    @Test
    public void test5948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5948");
        long long2 = org.apache.commons.math.util.FastMath.min(9223372036854775807L, 49L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 49L + "'", long2 == 49L);
    }

    @Test
    public void test5949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5949");
        long long2 = org.apache.commons.math.util.FastMath.min(4L, 2147483647L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test5950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5950");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.2570569097055435E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9377540799288403d + "'", double1 == 0.9377540799288403d);
    }

    @Test
    public void test5951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5951");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.1760939939322341d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8262159668530399d + "'", double1 == 0.8262159668530399d);
    }

    @Test
    public void test5952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5952");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.02723564011707427d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027242376401033767d + "'", double1 == 0.027242376401033767d);
    }

    @Test
    public void test5953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5953");
        double double1 = org.apache.commons.math.util.FastMath.tan(7.63507874715665E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.63507874715665E-9d + "'", double1 == 7.63507874715665E-9d);
    }

    @Test
    public void test5954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5954");
        int int2 = org.apache.commons.math.util.FastMath.max((int) 'a', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test5955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5955");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.36435262567673204d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5956");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.7322313444854719d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7436845326240755d + "'", double1 == 0.7436845326240755d);
    }

    @Test
    public void test5957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5957");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(7.896296018268069E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.89629601826807E13d + "'", double1 == 7.89629601826807E13d);
    }

    @Test
    public void test5958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5958");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.40517925701617413d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5959");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.6015665163590591d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2162570222831786d + "'", double1 == 2.2162570222831786d);
    }

    @Test
    public void test5960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5960");
        double double1 = org.apache.commons.math.util.FastMath.exp(97.0051545022222d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3452509781112992E42d + "'", double1 == 1.3452509781112992E42d);
    }

    @Test
    public void test5961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5961");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9998958821382987d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999652928415267d + "'", double1 == 0.9999652928415267d);
    }

    @Test
    public void test5962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5962");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.7813863964118538d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1844987482873206d + "'", double1 == 1.1844987482873206d);
    }

    @Test
    public void test5963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5963");
        double double1 = org.apache.commons.math.util.FastMath.tan(63.896986040629635d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8061007849924742d + "'", double1 == 1.8061007849924742d);
    }

    @Test
    public void test5964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5964");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.030547495921930887d), 2.5646454682250392d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.030547495921930883d) + "'", double2 == (-0.030547495921930883d));
    }

    @Test
    public void test5965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5965");
        double double1 = org.apache.commons.math.util.FastMath.signum(23.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5966");
        double double1 = org.apache.commons.math.util.FastMath.expm1(46.38122673932307d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.390307407884034E20d + "'", double1 == 1.390307407884034E20d);
    }

    @Test
    public void test5967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5967");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.5860134523134298E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.58601345231343E15d + "'", double1 == 1.58601345231343E15d);
    }

    @Test
    public void test5968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5968");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.5608425149227073d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5969");
        float float2 = org.apache.commons.math.util.FastMath.max((float) '#', (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test5970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5970");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.5344870970745856d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6946192052286232d) + "'", double1 == (-0.6946192052286232d));
    }

    @Test
    public void test5971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5971");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9234637104758648d, 2.3012989023072947d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8325698907954988d + "'", double2 == 0.8325698907954988d);
    }

    @Test
    public void test5972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5972");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 3, 5L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test5973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5973");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.532679550248382d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5102486780486013d) + "'", double1 == (-0.5102486780486013d));
    }

    @Test
    public void test5974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5974");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-7.99239499596348d), 5729.5779513082325d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0013949351732186355d) + "'", double2 == (-0.0013949351732186355d));
    }

    @Test
    public void test5975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5975");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.2091065616223926d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5976");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9443504370351302d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4800374208664642d + "'", double1 == 1.4800374208664642d);
    }

    @Test
    public void test5977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5977");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.295263154971464d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5978");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9995226746451285d, (-0.29488975471104756d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.000140801872929d + "'", double2 == 1.000140801872929d);
    }

    @Test
    public void test5979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5979");
        double double1 = org.apache.commons.math.util.FastMath.tanh(5.6640732741201365d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999759412402541d + "'", double1 == 0.9999759412402541d);
    }

    @Test
    public void test5980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5980");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-5.0500272064426E9d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1715.6600526011878d) + "'", double1 == (-1715.6600526011878d));
    }

    @Test
    public void test5981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5981");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.12433970308534949d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.446133984511757d + "'", double1 == 1.446133984511757d);
    }

    @Test
    public void test5982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5982");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 3, 1.0002075755522553d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.000684213170353d + "'", double2 == 3.000684213170353d);
    }

    @Test
    public void test5983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5983");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.0001849169413684d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7616718053900854d + "'", double1 == 0.7616718053900854d);
    }

    @Test
    public void test5984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5984");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.7465002900392412d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.573625770555483d + "'", double1 == 0.573625770555483d);
    }

    @Test
    public void test5985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5985");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.14836503173587057d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5986");
        double double1 = org.apache.commons.math.util.FastMath.floor(24256.84028216254d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 24256.0d + "'", double1 == 24256.0d);
    }

    @Test
    public void test5987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5987");
        int int2 = org.apache.commons.math.util.FastMath.max(3280, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3280 + "'", int2 == 3280);
    }

    @Test
    public void test5988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5988");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.2240401467946809d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0213635307381619d + "'", double1 == 0.0213635307381619d);
    }

    @Test
    public void test5989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5989");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 51L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.624876682545505d + "'", double1 == 4.624876682545505d);
    }

    @Test
    public void test5990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5990");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.1793704123873463d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5991");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.7580608622489934d, 0.010309095741587301d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9971485401976661d + "'", double2 == 0.9971485401976661d);
    }

    @Test
    public void test5992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5992");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.693147182621099d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000041223074d + "'", double1 == 1.0000000041223074d);
    }

    @Test
    public void test5993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5993");
        double double2 = org.apache.commons.math.util.FastMath.max(5.437442442543248E8d, 0.745427304692527d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.437442442543248E8d + "'", double2 == 5.437442442543248E8d);
    }

    @Test
    public void test5994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5994");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.7326499267490831d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8559497220918313d + "'", double1 == 0.8559497220918313d);
    }

    @Test
    public void test5995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5995");
        int int1 = org.apache.commons.math.util.FastMath.round(49.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 49 + "'", int1 == 49);
    }

    @Test
    public void test5996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5996");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.06340421154563104d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06340421154563104d + "'", double1 == 0.06340421154563104d);
    }

    @Test
    public void test5997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5997");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.086961379713775d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5998");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.6931471805599453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6931471805599454d + "'", double1 == 0.6931471805599454d);
    }

    @Test
    public void test5999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5999");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.5474250491067253E26d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7007662034747296E24d + "'", double1 == 2.7007662034747296E24d);
    }

    @Test
    public void test6000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test6000");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.38785408736876786d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3878540873687679d + "'", double1 == 0.3878540873687679d);
    }
}

