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
        double double1 = org.apache.commons.math.util.FastMath.atan(1.241721948438556d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8928118390776919d + "'", double1 == 0.8928118390776919d);
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5502");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.43350576899781335d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4200548580917883d + "'", double1 == 0.4200548580917883d);
    }

    @Test
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5503");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-1.001441413311334d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5504");
        float float2 = org.apache.commons.math.util.FastMath.max(56.0f, (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 56.0f + "'", float2 == 56.0f);
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5505");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.8683429710876526d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.06130870681507055d) + "'", double1 == (-0.06130870681507055d));
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5506");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.4995723020409742d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6480162667527689d + "'", double1 == 0.6480162667527689d);
    }

    @Test
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5507");
        double double1 = org.apache.commons.math.util.FastMath.abs(270.3546380008244d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 270.3546380008244d + "'", double1 == 270.3546380008244d);
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5508");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.5162631492122485d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5509");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.017066003704239316d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01706766071317347d) + "'", double1 == (-0.01706766071317347d));
    }

    @Test
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5510");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.12796368962739058d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1286690890578239d) + "'", double1 == (-0.1286690890578239d));
    }

    @Test
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5511");
        double double2 = org.apache.commons.math.util.FastMath.max(3.10236374558935d, 1.1092738450937532d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.10236374558935d + "'", double2 == 3.10236374558935d);
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5512");
        double double2 = org.apache.commons.math.util.FastMath.max(2.929020930583958d, 1.0359297553560505d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.929020930583958d + "'", double2 == 2.929020930583958d);
    }

    @Test
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5513");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.512774268133115d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.29007377656292815d) + "'", double1 == (-0.29007377656292815d));
    }

    @Test
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5514");
        double double2 = org.apache.commons.math.util.FastMath.min(4.810327220066308d, 1.3169578969248166d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3169578969248166d + "'", double2 == 1.3169578969248166d);
    }

    @Test
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5515");
        double double2 = org.apache.commons.math.util.FastMath.pow(153.91803466365488d, (-0.4253120969346567d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.11741384550580532d + "'", double2 == 0.11741384550580532d);
    }

    @Test
    public void test5516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5516");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.016146870580322156d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.8181605552002917E-4d) + "'", double1 == (-2.8181605552002917E-4d));
    }

    @Test
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5517");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.001970935890733557d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5518");
        double double1 = org.apache.commons.math.util.FastMath.log(0.211870765669079d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.551778786089821d) + "'", double1 == (-1.551778786089821d));
    }

    @Test
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5519");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.16143935615846078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.175201187282749d + "'", double1 == 1.175201187282749d);
    }

    @Test
    public void test5520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5520");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.0000017768790728d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.543082723008087d + "'", double1 == 1.543082723008087d);
    }

    @Test
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5521");
        float float1 = org.apache.commons.math.util.FastMath.abs(601302.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 601302.0f + "'", float1 == 601302.0f);
    }

    @Test
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5522");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 57);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5523");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.147104553392378d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5524");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9829427757283234d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8321329645353112d + "'", double1 == 0.8321329645353112d);
    }

    @Test
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5525");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.6178334732240378d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0171665417993763d + "'", double1 == 1.0171665417993763d);
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5526");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) 969.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.986323777050765d + "'", double1 == 2.986323777050765d);
    }

    @Test
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5527");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 72L, (float) 72L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 72.0f + "'", float2 == 72.0f);
    }

    @Test
    public void test5528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5528");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.9171523356672744d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6080833035834908d + "'", double1 == 0.6080833035834908d);
    }

    @Test
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5529");
        double double2 = org.apache.commons.math.util.FastMath.max(1.3489961061146645d, 1.4210854715202004E-14d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3489961061146645d + "'", double2 == 1.3489961061146645d);
    }

    @Test
    public void test5530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5530");
        long long1 = org.apache.commons.math.util.FastMath.round((-4.632512904931238d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-5L) + "'", long1 == (-5L));
    }

    @Test
    public void test5531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5531");
        double double1 = org.apache.commons.math.util.FastMath.log10((-9.088615669432869d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5532");
        double double1 = org.apache.commons.math.util.FastMath.log(5.298292365610486d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6673845734742285d + "'", double1 == 1.6673845734742285d);
    }

    @Test
    public void test5533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5533");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 6);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.0f + "'", float1 == 6.0f);
    }

    @Test
    public void test5534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5534");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.0421756036529368d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0421756036529368d + "'", double1 == 1.0421756036529368d);
    }

    @Test
    public void test5535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5535");
        double double1 = org.apache.commons.math.util.FastMath.log(2.8421709430404007E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-31.191623125197538d) + "'", double1 == (-31.191623125197538d));
    }

    @Test
    public void test5536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5536");
        double double1 = org.apache.commons.math.util.FastMath.rint((-26.411369568508626d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-26.0d) + "'", double1 == (-26.0d));
    }

    @Test
    public void test5537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5537");
        double double1 = org.apache.commons.math.util.FastMath.log(326.4268172911656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.788205780533459d + "'", double1 == 5.788205780533459d);
    }

    @Test
    public void test5538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5538");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.0115470718397392d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017654826942511064d + "'", double1 == 0.017654826942511064d);
    }

    @Test
    public void test5539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5539");
        double double1 = org.apache.commons.math.util.FastMath.asinh(6.066371512547204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5026329548726327d + "'", double1 == 2.5026329548726327d);
    }

    @Test
    public void test5540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5540");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9868053513896203d, 0.9999609473623688d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999609473623688d + "'", double2 == 0.9999609473623688d);
    }

    @Test
    public void test5541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5541");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.6982469888270821d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8356117452663541d + "'", double1 == 0.8356117452663541d);
    }

    @Test
    public void test5542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5542");
        long long1 = org.apache.commons.math.util.FastMath.round(88.76920606279324d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 89L + "'", long1 == 89L);
    }

    @Test
    public void test5543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5543");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9560273016457693d, 0.9376658284517877d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9560273016457693d + "'", double2 == 0.9560273016457693d);
    }

    @Test
    public void test5544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5544");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 57L, 57.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test5545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5545");
        float float1 = org.apache.commons.math.util.FastMath.abs(2.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test5546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5546");
        float float1 = org.apache.commons.math.util.FastMath.abs(74.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 74.0f + "'", float1 == 74.0f);
    }

    @Test
    public void test5547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5547");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.6090693194205808d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6548866146797762d + "'", double1 == 0.6548866146797762d);
    }

    @Test
    public void test5548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5548");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.8640917881917065d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5549");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.03606321239200799d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.036047586453723045d + "'", double1 == 0.036047586453723045d);
    }

    @Test
    public void test5550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5550");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.3383347192043265E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5551");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) 6L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.0d + "'", double1 == 6.0d);
    }

    @Test
    public void test5552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5552");
        int int2 = org.apache.commons.math.util.FastMath.max((int) 'a', 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test5553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5553");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.3293232640668133d, 2.148283155648077d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.554116896801992d + "'", double2 == 0.554116896801992d);
    }

    @Test
    public void test5554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5554");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5707963267948968d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5555");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.8996203146905095d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5556");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9999952113687003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test5557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5557");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.0042200026983256434d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5558");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.3774620981682702d, 1.385849999980594d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.265918226844118d + "'", double2 == 0.265918226844118d);
    }

    @Test
    public void test5559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5559");
        double double1 = org.apache.commons.math.util.FastMath.sin(3.0461741978670857E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.046174150757102E-4d + "'", double1 == 3.046174150757102E-4d);
    }

    @Test
    public void test5560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5560");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 74L, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5561");
        double double1 = org.apache.commons.math.util.FastMath.tan(4.230106993761132d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9101657252259991d + "'", double1 == 1.9101657252259991d);
    }

    @Test
    public void test5562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5562");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5877866649021191d + "'", double1 == 0.5877866649021191d);
    }

    @Test
    public void test5563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5563");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7588728630103169d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.640412574791911d + "'", double1 == 0.640412574791911d);
    }

    @Test
    public void test5564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5564");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8550604755770164d, 1.7468039524918473d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7606971644263034d + "'", double2 == 0.7606971644263034d);
    }

    @Test
    public void test5565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5565");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.7228697444076502d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.543991356549775d + "'", double1 == 0.543991356549775d);
    }

    @Test
    public void test5566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5566");
        long long1 = org.apache.commons.math.util.FastMath.round(1.4329395021738325d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test5567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5567");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.06262594923388144d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5568");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 969L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 969 + "'", int1 == 969);
    }

    @Test
    public void test5569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5569");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.574894660730418d), 5.685719999335931E24d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.574894660730418d) + "'", double2 == (-0.574894660730418d));
    }

    @Test
    public void test5570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5570");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 2147483647);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5571");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.42751178833719056d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5334372562372883d + "'", double1 == 0.5334372562372883d);
    }

    @Test
    public void test5572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5572");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.035284687279155354d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03529934148039703d + "'", double1 == 0.03529934148039703d);
    }

    @Test
    public void test5573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5573");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-1.5347252927908293d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5574");
        double double2 = org.apache.commons.math.util.FastMath.min(9.041911449206605d, 0.1531969697659333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1531969697659333d + "'", double2 == 0.1531969697659333d);
    }

    @Test
    public void test5575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5575");
        double double1 = org.apache.commons.math.util.FastMath.acos(3.2792211365930397d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5576");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 32L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test5577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5577");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.876278270531895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 164.7986056066652d + "'", double1 == 164.7986056066652d);
    }

    @Test
    public void test5578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5578");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.8144772166995118d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9338840974176666d + "'", double1 == 0.9338840974176666d);
    }

    @Test
    public void test5579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5579");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9961652815068444d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1692925400108032d + "'", double1 == 1.1692925400108032d);
    }

    @Test
    public void test5580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5580");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.7158126647533047E-21d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7158126647533047E-21d + "'", double1 == 1.7158126647533047E-21d);
    }

    @Test
    public void test5581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5581");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.26661184065549276d), 0.262669278697344d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.26661184065549276d) + "'", double2 == (-0.26661184065549276d));
    }

    @Test
    public void test5582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5582");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.9867447596767658d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5583");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.1756713690335514d, 1.226902356338711d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1756713690335516d + "'", double2 == 1.1756713690335516d);
    }

    @Test
    public void test5584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5584");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) 6, (-77.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.999999999999999d + "'", double2 == 5.999999999999999d);
    }

    @Test
    public void test5585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5585");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 0L, (float) 74L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 74.0f + "'", float2 == 74.0f);
    }

    @Test
    public void test5586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5586");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(114.22639329300515d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6544.690244690648d + "'", double1 == 6544.690244690648d);
    }

    @Test
    public void test5587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5587");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.7490362681090366d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6428840350083856d + "'", double1 == 0.6428840350083856d);
    }

    @Test
    public void test5588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5588");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 32L, (float) 1L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test5589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5589");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 232.0f, 3.3455797190266234d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.3455797190266234d + "'", double2 == 3.3455797190266234d);
    }

    @Test
    public void test5590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5590");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.1484294459615878d, (-3.405442597106097d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.816336034199522d + "'", double2 == 2.816336034199522d);
    }

    @Test
    public void test5591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5591");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.20057203709370552d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19925100799002374d + "'", double1 == 0.19925100799002374d);
    }

    @Test
    public void test5592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5592");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) -1, (float) 2);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test5593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5593");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7455364476418086d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6324785073638743d + "'", double1 == 0.6324785073638743d);
    }

    @Test
    public void test5594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5594");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-17.908902087289203d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.9971422632833347E7d) + "'", double1 == (-2.9971422632833347E7d));
    }

    @Test
    public void test5595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5595");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.22102787999532184d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5596");
        double double1 = org.apache.commons.math.util.FastMath.log((-1.5578545843443006d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5597");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.1694893490615264d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2203477449828406d + "'", double1 == 3.2203477449828406d);
    }

    @Test
    public void test5598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5598");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(102.39369977975828d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.678332431486619d + "'", double1 == 4.678332431486619d);
    }

    @Test
    public void test5599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5599");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.07428299663566632d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07165345917579712d + "'", double1 == 0.07165345917579712d);
    }

    @Test
    public void test5600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5600");
        double double1 = org.apache.commons.math.util.FastMath.atan(5.362407451161307E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.362407451161307E-18d + "'", double1 == 5.362407451161307E-18d);
    }

    @Test
    public void test5601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5601");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 0L, (float) 28);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5602");
        double double2 = org.apache.commons.math.util.FastMath.min(28.4764116085372d, 0.017190812494679297d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.017190812494679297d + "'", double2 == 0.017190812494679297d);
    }

    @Test
    public void test5603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5603");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 100, 57);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test5604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5604");
        long long2 = org.apache.commons.math.util.FastMath.max(56L, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 56L + "'", long2 == 56L);
    }

    @Test
    public void test5605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5605");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.4819946344796317d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5255792925185617d + "'", double1 == 0.5255792925185617d);
    }

    @Test
    public void test5606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5606");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.3132616875182228d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 75.2443520910225d + "'", double1 == 75.2443520910225d);
    }

    @Test
    public void test5607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5607");
        double double1 = org.apache.commons.math.util.FastMath.ceil(5.206879716514544E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.206879716514544E22d + "'", double1 == 5.206879716514544E22d);
    }

    @Test
    public void test5608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5608");
        double double1 = org.apache.commons.math.util.FastMath.log(3.9481480091340625E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.306852819440063d + "'", double1 == 31.306852819440063d);
    }

    @Test
    public void test5609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5609");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.6921231068842162d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8075636249243465d + "'", double1 == 2.8075636249243465d);
    }

    @Test
    public void test5610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5610");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.704971861977569d, 215.5579348013961d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4325515993152254E93d + "'", double2 == 1.4325515993152254E93d);
    }

    @Test
    public void test5611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5611");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 2.0222383329741738d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test5612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5612");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.8693235746902677d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5613");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.0988845141611678d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0988845141611678d + "'", double1 == 1.0988845141611678d);
    }

    @Test
    public void test5614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5614");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.4559381277659963d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5615");
        double double2 = org.apache.commons.math.util.FastMath.pow((-3.352281190436129d), (-3.046174197867085E-4d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test5616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5616");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.7776740307447068d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 101.85321931168104d + "'", double1 == 101.85321931168104d);
    }

    @Test
    public void test5617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5617");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.5725317062401747d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0043849128553528d + "'", double1 == 1.0043849128553528d);
    }

    @Test
    public void test5618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5618");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.4849173591353842d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3143322686752248d) + "'", double1 == (-0.3143322686752248d));
    }

    @Test
    public void test5619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5619");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.011800076512800236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011799528855315898d + "'", double1 == 0.011799528855315898d);
    }

    @Test
    public void test5620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5620");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.07532458034302d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test5621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5621");
        double double1 = org.apache.commons.math.util.FastMath.acos(3.948148009134034E13d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5622");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.3288870502122705E12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5623");
        double double1 = org.apache.commons.math.util.FastMath.acosh(7.47898785989482d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.700744932618965d + "'", double1 == 2.700744932618965d);
    }

    @Test
    public void test5624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5624");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 102);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 102 + "'", int1 == 102);
    }

    @Test
    public void test5625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5625");
        double double2 = org.apache.commons.math.util.FastMath.max(5.258625856460398d, 1.482433365515615d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.258625856460398d + "'", double2 == 5.258625856460398d);
    }

    @Test
    public void test5626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5626");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.6177859350239399d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4217887386975745d + "'", double1 == 2.4217887386975745d);
    }

    @Test
    public void test5627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5627");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test5628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5628");
        double double2 = org.apache.commons.math.util.FastMath.max(232.0d, 0.9999966817320772d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 232.0d + "'", double2 == 232.0d);
    }

    @Test
    public void test5629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5629");
        long long1 = org.apache.commons.math.util.FastMath.round((-2.5757640260722034d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-3L) + "'", long1 == (-3L));
    }

    @Test
    public void test5630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5630");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 969);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5631");
        double double2 = org.apache.commons.math.util.FastMath.atan2(10.690128972137646d, 0.892949116787485d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4874595421493757d + "'", double2 == 1.4874595421493757d);
    }

    @Test
    public void test5632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5632");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.4288764780867377d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5633");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.7704121203896118d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9704682670117346d + "'", double1 == 0.9704682670117346d);
    }

    @Test
    public void test5634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5634");
        double double2 = org.apache.commons.math.util.FastMath.max(1.307876973266691d, 1.1659350422353596d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.307876973266691d + "'", double2 == 1.307876973266691d);
    }

    @Test
    public void test5635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5635");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.141928933339286d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5636");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.342928417311719d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9307335986766819d + "'", double1 == 0.9307335986766819d);
    }

    @Test
    public void test5637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5637");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.40859244341429657d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3354149668578434d) + "'", double1 == (-0.3354149668578434d));
    }

    @Test
    public void test5638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5638");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9999999845347045d, 0.7920437201135672d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7920437201135672d + "'", double2 == 0.7920437201135672d);
    }

    @Test
    public void test5639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5639");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.797850593225596d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.335529133262637d + "'", double1 == 1.335529133262637d);
    }

    @Test
    public void test5640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5640");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.986323777050765d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5641");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.2604393535992218d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.922075780350696d + "'", double1 == 14.922075780350696d);
    }

    @Test
    public void test5642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5642");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.9729356641053681d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4314660052292418d + "'", double1 == 1.4314660052292418d);
    }

    @Test
    public void test5643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5643");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.0393938154819877d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9667076202684051d + "'", double1 == 0.9667076202684051d);
    }

    @Test
    public void test5644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5644");
        int int2 = org.apache.commons.math.util.FastMath.max(3, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test5645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5645");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.0412420976514144d), 16.89056810518696d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test5646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5646");
        double double1 = org.apache.commons.math.util.FastMath.log10(4.741450291257946d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.675911201832825d + "'", double1 == 0.675911201832825d);
    }

    @Test
    public void test5647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5647");
        float float2 = org.apache.commons.math.util.FastMath.min(56.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5648");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) 4);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5874010519681996d + "'", double1 == 1.5874010519681996d);
    }

    @Test
    public void test5649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5649");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) -1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5650");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.42631174417624496d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4263117441762449d + "'", double2 == 0.4263117441762449d);
    }

    @Test
    public void test5651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5651");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.6520112072674529d), 2.4967739928730976d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6520112072674528d) + "'", double2 == (-0.6520112072674528d));
    }

    @Test
    public void test5652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5652");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.41905816157924275d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7483270334358754d + "'", double1 == 0.7483270334358754d);
    }

    @Test
    public void test5653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5653");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 232L, (float) 4L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 232.0f + "'", float2 == 232.0f);
    }

    @Test
    public void test5654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5654");
        double double1 = org.apache.commons.math.util.FastMath.log(0.8371582714590908d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.17774213263016947d) + "'", double1 == (-0.17774213263016947d));
    }

    @Test
    public void test5655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5655");
        long long2 = org.apache.commons.math.util.FastMath.min(969L, 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test5656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5656");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.3383347192042886E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3383347192042886E42d + "'", double1 == 1.3383347192042886E42d);
    }

    @Test
    public void test5657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5657");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.023781545449259364d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3625821845411108d + "'", double1 == 1.3625821845411108d);
    }

    @Test
    public void test5658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5658");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.1373220393635d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8135103761073599d + "'", double1 == 0.8135103761073599d);
    }

    @Test
    public void test5659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5659");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.1283261188573166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5660");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.20350434138645834d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3658604883745558d + "'", double1 == 1.3658604883745558d);
    }

    @Test
    public void test5661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5661");
        long long1 = org.apache.commons.math.util.FastMath.round(12.232006459765389d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 12L + "'", long1 == 12L);
    }

    @Test
    public void test5662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5662");
        double double1 = org.apache.commons.math.util.FastMath.asinh(97.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.267884728309446d + "'", double1 == 5.267884728309446d);
    }

    @Test
    public void test5663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5663");
        long long2 = org.apache.commons.math.util.FastMath.min(2147483647L, 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test5664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5664");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.28751871345990776d, 1.373400766945016d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.18052262049242931d + "'", double2 == 0.18052262049242931d);
    }

    @Test
    public void test5665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5665");
        double double1 = org.apache.commons.math.util.FastMath.cosh(28.476411608537198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1644435251066353E12d + "'", double1 == 1.1644435251066353E12d);
    }

    @Test
    public void test5666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5666");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 100, (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test5667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5667");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.11858913363418261d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test5668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5668");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 3, 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test5669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5669");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 57, (long) 53);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 53L + "'", long2 == 53L);
    }

    @Test
    public void test5670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5670");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.920997057311908d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9209970573119084d + "'", double1 == 2.9209970573119084d);
    }

    @Test
    public void test5671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5671");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.1278889674580024d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7551303931717063d + "'", double1 == 0.7551303931717063d);
    }

    @Test
    public void test5672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5672");
        double double1 = org.apache.commons.math.util.FastMath.cos(69.84482292460207d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7453180650273789d + "'", double1 == 0.7453180650273789d);
    }

    @Test
    public void test5673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5673");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.13530303620439413d), 0.016390006834163424d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.1353030362043941d) + "'", double2 == (-0.1353030362043941d));
    }

    @Test
    public void test5674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5674");
        double double2 = org.apache.commons.math.util.FastMath.min(4.049630518106203d, (-0.13530303620439413d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.13530303620439413d) + "'", double2 == (-0.13530303620439413d));
    }

    @Test
    public void test5675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5675");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8369386687558497d, 0.02287085931419646d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5434763214626195d + "'", double2 == 1.5434763214626195d);
    }

    @Test
    public void test5676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5676");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.1597051925728867d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5677");
        int int2 = org.apache.commons.math.util.FastMath.min(52, 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test5678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5678");
        float float2 = org.apache.commons.math.util.FastMath.max(6.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.0f + "'", float2 == 6.0f);
    }

    @Test
    public void test5679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5679");
        int int2 = org.apache.commons.math.util.FastMath.max(28, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 28 + "'", int2 == 28);
    }

    @Test
    public void test5680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5680");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9816339318384565d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5681");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.5639455846427255d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5943169106002987d + "'", double1 == 0.5943169106002987d);
    }

    @Test
    public void test5682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5682");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.125588153733179d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05137951371295043d + "'", double1 == 0.05137951371295043d);
    }

    @Test
    public void test5683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5683");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.09966865249116202d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09983374988500592d + "'", double1 == 0.09983374988500592d);
    }

    @Test
    public void test5684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5684");
        double double2 = org.apache.commons.math.util.FastMath.min(1.193861478082777d, 0.740687539890472d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.740687539890472d + "'", double2 == 0.740687539890472d);
    }

    @Test
    public void test5685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5685");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.6633107195211883d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5686");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.7158126647533047E-21d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7158126647533047E-21d + "'", double1 == 1.7158126647533047E-21d);
    }

    @Test
    public void test5687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5687");
        double double1 = org.apache.commons.math.util.FastMath.atan(3.0537144249814574d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2543319811638522d + "'", double1 == 1.2543319811638522d);
    }

    @Test
    public void test5688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5688");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) 9.223372E18f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 44.3614195558365d + "'", double1 == 44.3614195558365d);
    }

    @Test
    public void test5689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5689");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.8308672778518115E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.635637153201499E14d + "'", double1 == 2.635637153201499E14d);
    }

    @Test
    public void test5690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5690");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.4143028416180226d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4143028416180226d + "'", double1 == 1.4143028416180226d);
    }

    @Test
    public void test5691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5691");
        int int2 = org.apache.commons.math.util.FastMath.max((int) ' ', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test5692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5692");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 28);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.27090578830786904d + "'", double1 == 0.27090578830786904d);
    }

    @Test
    public void test5693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5693");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.1578212823495775d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7690990470717161d + "'", double1 == 0.7690990470717161d);
    }

    @Test
    public void test5694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5694");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.4576692332118568d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5695");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.6974747010141326d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7664665890780167d + "'", double1 == 0.7664665890780167d);
    }

    @Test
    public void test5696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5696");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(6.157240911549055d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.157240911549056d + "'", double1 == 6.157240911549056d);
    }

    @Test
    public void test5697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5697");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.557407724654902d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2479614275509088d + "'", double1 == 1.2479614275509088d);
    }

    @Test
    public void test5698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5698");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.6077292684620609d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.47482279119744175d + "'", double1 == 0.47482279119744175d);
    }

    @Test
    public void test5699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5699");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(338.9664028342795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18.411040243133453d + "'", double1 == 18.411040243133453d);
    }

    @Test
    public void test5700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5700");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.265918226844118d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2598226673740662d + "'", double1 == 0.2598226673740662d);
    }

    @Test
    public void test5701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5701");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9904394498257181d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6924173947675911d + "'", double1 == 1.6924173947675911d);
    }

    @Test
    public void test5702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5702");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.40859244341429657d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0846416894617181d + "'", double1 == 1.0846416894617181d);
    }

    @Test
    public void test5703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5703");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 'a', (float) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test5704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5704");
        double double2 = org.apache.commons.math.util.FastMath.min(0.7601945740163978d, (-3.0461741978670873E-4d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.0461741978670873E-4d) + "'", double2 == (-3.0461741978670873E-4d));
    }

    @Test
    public void test5705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5705");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.07532458034302d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3593939659730807d + "'", double1 == 1.3593939659730807d);
    }

    @Test
    public void test5706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5706");
        double double2 = org.apache.commons.math.util.FastMath.min(0.44333907546532597d, 3.137830415726692E-34d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.137830415726692E-34d + "'", double2 == 3.137830415726692E-34d);
    }

    @Test
    public void test5707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5707");
        int int1 = org.apache.commons.math.util.FastMath.abs(102);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 102 + "'", int1 == 102);
    }

    @Test
    public void test5708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5708");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.30720038919415704d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3596133926077122d + "'", double1 == 0.3596133926077122d);
    }

    @Test
    public void test5709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5709");
        long long1 = org.apache.commons.math.util.FastMath.abs(9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test5710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5710");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-1.8985248817088514d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5711");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-2.1317761108019555d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2870058778506d) + "'", double1 == (-1.2870058778506d));
    }

    @Test
    public void test5712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5712");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 1477896);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1477896.0f + "'", float1 == 1477896.0f);
    }

    @Test
    public void test5713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5713");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) (-2));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2599210498948732d) + "'", double1 == (-1.2599210498948732d));
    }

    @Test
    public void test5714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5714");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-2.0d), 2.3515046736041096d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.9999999999999998d) + "'", double2 == (-1.9999999999999998d));
    }

    @Test
    public void test5715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5715");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.82358273457349d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.014374230380885937d + "'", double1 == 0.014374230380885937d);
    }

    @Test
    public void test5716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5716");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.2474896033060654d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24497082768837525d + "'", double1 == 0.24497082768837525d);
    }

    @Test
    public void test5717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5717");
        long long2 = org.apache.commons.math.util.FastMath.min(89L, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test5718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5718");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.015085296975380387d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.734723475976807E-18d + "'", double1 == 1.734723475976807E-18d);
    }

    @Test
    public void test5719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5719");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.008791790599507117d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999613524579686d + "'", double1 == 0.9999613524579686d);
    }

    @Test
    public void test5720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5720");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.06390872240731825d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0639523065568946d + "'", double1 == 0.0639523065568946d);
    }

    @Test
    public void test5721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5721");
        double double1 = org.apache.commons.math.util.FastMath.signum((-1.506844020238002d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5722");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.5192922514920658d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1168189022570827d + "'", double1 == 2.1168189022570827d);
    }

    @Test
    public void test5723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5723");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.949477120674141d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5724");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.31565633655857495d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test5725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5725");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, (long) 2147483647);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5726");
        double double1 = org.apache.commons.math.util.FastMath.rint((-3.046174103647121E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5727");
        long long2 = org.apache.commons.math.util.FastMath.max((-3L), 232L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 232L + "'", long2 == 232L);
    }

    @Test
    public void test5728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5728");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5729");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.6244090200701623d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8964216248301711d + "'", double1 == 0.8964216248301711d);
    }

    @Test
    public void test5730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5730");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.22665386569399096d, (double) 4);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.00263907979834818d + "'", double2 == 0.00263907979834818d);
    }

    @Test
    public void test5731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5731");
        double double1 = org.apache.commons.math.util.FastMath.exp(36.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.311231547115195E15d + "'", double1 == 4.311231547115195E15d);
    }

    @Test
    public void test5732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5732");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.38614487937318d, 0.4913849717236785d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3861448793731799d + "'", double2 == 1.3861448793731799d);
    }

    @Test
    public void test5733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5733");
        double double1 = org.apache.commons.math.util.FastMath.log10((-1.1183599281602883d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5734");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 10, 57);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test5735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5735");
        double double1 = org.apache.commons.math.util.FastMath.expm1(286.4788975654116d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6073803869591123E124d + "'", double1 == 2.6073803869591123E124d);
    }

    @Test
    public void test5736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5736");
        double double1 = org.apache.commons.math.util.FastMath.atan(4.605170185988091d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3569687047394818d + "'", double1 == 1.3569687047394818d);
    }

    @Test
    public void test5737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5737");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.2225981852327883d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2207644459833123d + "'", double1 == 0.2207644459833123d);
    }

    @Test
    public void test5738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5738");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.41671114415975274d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test5739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5739");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.5448049645710876d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6109634842191889d + "'", double1 == 0.6109634842191889d);
    }

    @Test
    public void test5740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5740");
        long long2 = org.apache.commons.math.util.FastMath.max(102L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 102L + "'", long2 == 102L);
    }

    @Test
    public void test5741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5741");
        int int2 = org.apache.commons.math.util.FastMath.min((int) 'a', (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test5742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5742");
        double double1 = org.apache.commons.math.util.FastMath.acosh(4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2083244963961874d + "'", double1 == 2.2083244963961874d);
    }

    @Test
    public void test5743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5743");
        double double2 = org.apache.commons.math.util.FastMath.min(34.999999999999986d, (double) 72);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 34.999999999999986d + "'", double2 == 34.999999999999986d);
    }

    @Test
    public void test5744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5744");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 10, 102.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 102.0f + "'", float2 == 102.0f);
    }

    @Test
    public void test5745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5745");
        double double1 = org.apache.commons.math.util.FastMath.signum(4.644298430695373d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5746");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.44333907546532597d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0077377265696175505d + "'", double1 == 0.0077377265696175505d);
    }

    @Test
    public void test5747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5747");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9649955887750582d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9823418899624805d + "'", double1 == 0.9823418899624805d);
    }

    @Test
    public void test5748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5748");
        double double1 = org.apache.commons.math.util.FastMath.sinh(439.50133562451674d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.732285479446789E190d + "'", double1 == 3.732285479446789E190d);
    }

    @Test
    public void test5749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5749");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9903301413773637d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.009716915305559275d) + "'", double1 == (-0.009716915305559275d));
    }

    @Test
    public void test5750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5750");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-2.0000217136384455d), 1.4655663107691658E8d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.000021713638445d) + "'", double2 == (-2.000021713638445d));
    }

    @Test
    public void test5751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5751");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(49.40723197656493d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2830.825869680975d + "'", double1 == 2830.825869680975d);
    }

    @Test
    public void test5752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5752");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.01349308047516302d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5753");
        float float2 = org.apache.commons.math.util.FastMath.min((float) ' ', 3.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test5754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5754");
        double double1 = org.apache.commons.math.util.FastMath.acosh(7.366912598987926E39d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 92.49096451110407d + "'", double1 == 92.49096451110407d);
    }

    @Test
    public void test5755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5755");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.3092866533194534d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5756");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.5440680443502757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0008397416207215d + "'", double1 == 1.0008397416207215d);
    }

    @Test
    public void test5757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5757");
        double double1 = org.apache.commons.math.util.FastMath.cosh(3.637978807091714E-12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5758");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.8640948048351971d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3728572146723934d + "'", double1 == 2.3728572146723934d);
    }

    @Test
    public void test5759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5759");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9859950710226582d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.153705005202714d + "'", double1 == 1.153705005202714d);
    }

    @Test
    public void test5760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5760");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(7.737125245533627E25d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.737125245533628E25d + "'", double1 == 7.737125245533628E25d);
    }

    @Test
    public void test5761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5761");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9560273016457694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5767698527717893d + "'", double1 == 0.5767698527717893d);
    }

    @Test
    public void test5762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5762");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7712847557374057d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6476758923319749d + "'", double1 == 0.6476758923319749d);
    }

    @Test
    public void test5763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5763");
        float float2 = org.apache.commons.math.util.FastMath.max(601302.0f, (float) 28L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 601302.0f + "'", float2 == 601302.0f);
    }

    @Test
    public void test5764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5764");
        double double2 = org.apache.commons.math.util.FastMath.max(0.5297515540876877d, 0.8549344892399791d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8549344892399791d + "'", double2 == 0.8549344892399791d);
    }

    @Test
    public void test5765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5765");
        double double1 = org.apache.commons.math.util.FastMath.tanh(4.951760157141521E27d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5766");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.5088925547167915d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1502828516528005d + "'", double1 == 2.1502828516528005d);
    }

    @Test
    public void test5767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5767");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.2227953217324957d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22659551363623145d + "'", double1 == 0.22659551363623145d);
    }

    @Test
    public void test5768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5768");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.5729527623083676d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-32.827775140631694d) + "'", double1 == (-32.827775140631694d));
    }

    @Test
    public void test5769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5769");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.473814720414451d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5770");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 9223372036854775807L, 5.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test5771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5771");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.23443699695760933d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2365903764701667d + "'", double1 == 0.2365903764701667d);
    }

    @Test
    public void test5772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5772");
        double double2 = org.apache.commons.math.util.FastMath.min(0.5837567576054801d, 0.3156563365585749d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3156563365585749d + "'", double2 == 0.3156563365585749d);
    }

    @Test
    public void test5773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5773");
        double double2 = org.apache.commons.math.util.FastMath.min(1.5657713697140057d, 0.37755336453841626d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.37755336453841626d + "'", double2 == 0.37755336453841626d);
    }

    @Test
    public void test5774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5774");
        long long1 = org.apache.commons.math.util.FastMath.round((double) 53L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 53L + "'", long1 == 53L);
    }

    @Test
    public void test5775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5775");
        float float2 = org.apache.commons.math.util.FastMath.max(6.0f, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.0f + "'", float2 == 6.0f);
    }

    @Test
    public void test5776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5776");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.816336034199522d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9475687543867164d) + "'", double1 == (-0.9475687543867164d));
    }

    @Test
    public void test5777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5777");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.6499429567608755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7961183190466935d + "'", double1 == 0.7961183190466935d);
    }

    @Test
    public void test5778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5778");
        double double1 = org.apache.commons.math.util.FastMath.sin(6.38905609893065d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10567312490307698d + "'", double1 == 0.10567312490307698d);
    }

    @Test
    public void test5779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5779");
        long long2 = org.apache.commons.math.util.FastMath.min(3L, 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test5780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5780");
        float float1 = org.apache.commons.math.util.FastMath.abs(56.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 56.0f + "'", float1 == 56.0f);
    }

    @Test
    public void test5781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5781");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.5542673435415335d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1915257222118903d + "'", double1 == 0.1915257222118903d);
    }

    @Test
    public void test5782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5782");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.24107101134909706d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.004207482879154361d) + "'", double1 == (-0.004207482879154361d));
    }

    @Test
    public void test5783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5783");
        double double1 = org.apache.commons.math.util.FastMath.asin((-66.06783209628024d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5784");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.5693829901728757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06229748544319709d + "'", double1 == 0.06229748544319709d);
    }

    @Test
    public void test5785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5785");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.0176614589589157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5253572079317006d + "'", double1 == 0.5253572079317006d);
    }

    @Test
    public void test5786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5786");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.855146420814101d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5787");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.6094379124341003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0148369064941645d + "'", double1 == 1.0148369064941645d);
    }

    @Test
    public void test5788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5788");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.8945584950807156d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1074424089031707d) + "'", double1 == (-1.1074424089031707d));
    }

    @Test
    public void test5789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5789");
        double double1 = org.apache.commons.math.util.FastMath.log10(14.206129690390002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1524757751089236d + "'", double1 == 1.1524757751089236d);
    }

    @Test
    public void test5790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5790");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.171806431125281d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2278182064756322d + "'", double1 == 3.2278182064756322d);
    }

    @Test
    public void test5791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5791");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.05305491663174207d, (-0.6974747010141326d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.065671704270677d + "'", double2 == 3.065671704270677d);
    }

    @Test
    public void test5792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5792");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(49.40723197656493d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8623188722876839d + "'", double1 == 0.8623188722876839d);
    }

    @Test
    public void test5793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5793");
        float float2 = org.apache.commons.math.util.FastMath.min(1.0f, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test5794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5794");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.012408001278103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5795");
        double double2 = org.apache.commons.math.util.FastMath.max(16.646983997654825d, (-0.9475687543867164d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 16.646983997654825d + "'", double2 == 16.646983997654825d);
    }

    @Test
    public void test5796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5796");
        double double1 = org.apache.commons.math.util.FastMath.sin(1477895.5237242084d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6937705463751468d + "'", double1 == 0.6937705463751468d);
    }

    @Test
    public void test5797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5797");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.021168611178002193d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5798");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.2166443409544712d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3758405357755255d + "'", double1 == 3.3758405357755255d);
    }

    @Test
    public void test5799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5799");
        double double1 = org.apache.commons.math.util.FastMath.signum((-100.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5800");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.4097917119315355d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5801");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 12L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 12.0f + "'", float1 == 12.0f);
    }

    @Test
    public void test5802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5802");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1, (float) 3L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test5803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5803");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.7923970945438066d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5835538829420422d + "'", double1 == 0.5835538829420422d);
    }

    @Test
    public void test5804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5804");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.4415943645925386d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7648432895416004d) + "'", double1 == (-0.7648432895416004d));
    }

    @Test
    public void test5805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5805");
        long long2 = org.apache.commons.math.util.FastMath.min(1248L, (long) 1477896);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1248L + "'", long2 == 1248L);
    }

    @Test
    public void test5806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5806");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 97L, 6.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.0f + "'", float2 == 6.0f);
    }

    @Test
    public void test5807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5807");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.5162631492122485d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5162631492122485d + "'", double1 == 0.5162631492122485d);
    }

    @Test
    public void test5808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5808");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.5403023058681395d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5669767943827972d + "'", double1 == 0.5669767943827972d);
    }

    @Test
    public void test5809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5809");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5810");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.8681319821391921d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7149268838299869d + "'", double1 == 0.7149268838299869d);
    }

    @Test
    public void test5811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5811");
        long long1 = org.apache.commons.math.util.FastMath.round(0.852392823283385d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test5812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5812");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.3769270190230555d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5813");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-3), 57.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.0f) + "'", float2 == (-3.0f));
    }

    @Test
    public void test5814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5814");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.5740225962860341d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5815");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(5.507288054547834E-32d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3467611839613835E-16d + "'", double1 == 2.3467611839613835E-16d);
    }

    @Test
    public void test5816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5816");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(3036.676314193363d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3036.6763141933634d + "'", double1 == 3036.6763141933634d);
    }

    @Test
    public void test5817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5817");
        double double1 = org.apache.commons.math.util.FastMath.floor(22.24855859029184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.0d + "'", double1 == 22.0d);
    }

    @Test
    public void test5818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5818");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-32.827775140631694d), 0.5193393241142585d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-32.82777514063169d) + "'", double2 == (-32.82777514063169d));
    }

    @Test
    public void test5819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5819");
        float float2 = org.apache.commons.math.util.FastMath.min(601302.0f, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5820");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-2.0000217136384455d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.03490696401437005d) + "'", double1 == (-0.03490696401437005d));
    }

    @Test
    public void test5821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5821");
        double double1 = org.apache.commons.math.util.FastMath.exp(207.48544908632314d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2876137727795652E90d + "'", double1 == 1.2876137727795652E90d);
    }

    @Test
    public void test5822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5822");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-15.942385152878742d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2782471115387936d) + "'", double1 == (-0.2782471115387936d));
    }

    @Test
    public void test5823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5823");
        long long2 = org.apache.commons.math.util.FastMath.min(12L, (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 12L + "'", long2 == 12L);
    }

    @Test
    public void test5824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5824");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.40859244341429657d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5825");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.5707963267929435d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.953165577260533E-12d + "'", double1 == 1.953165577260533E-12d);
    }

    @Test
    public void test5826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5826");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-1.047695165899868d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6009087592740006d + "'", double1 == 1.6009087592740006d);
    }

    @Test
    public void test5827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5827");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.6548866146797762d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.924924246850124d + "'", double1 == 1.924924246850124d);
    }

    @Test
    public void test5828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5828");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.1295788105004783d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3855917866824072d + "'", double1 == 1.3855917866824072d);
    }

    @Test
    public void test5829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5829");
        double double1 = org.apache.commons.math.util.FastMath.floor(4.781572054374191d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test5830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5830");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.029840281693512497d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.029840281693512497d + "'", double1 == 0.029840281693512497d);
    }

    @Test
    public void test5831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5831");
        double double2 = org.apache.commons.math.util.FastMath.max(114898.22225041104d, 0.4636456564559829d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 114898.22225041104d + "'", double2 == 114898.22225041104d);
    }

    @Test
    public void test5832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5832");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-10.162168244741062d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test5833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5833");
        long long2 = org.apache.commons.math.util.FastMath.min(97L, 1477896L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test5834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5834");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.1620035212715816d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5451401275587432d + "'", double1 == 0.5451401275587432d);
    }

    @Test
    public void test5835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5835");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.07205361290155955d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07205361290155955d + "'", double1 == 0.07205361290155955d);
    }

    @Test
    public void test5836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5836");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.2493184782545368d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8480924206096192d + "'", double1 == 0.8480924206096192d);
    }

    @Test
    public void test5837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5837");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.2278182064756322d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4395010458716009d + "'", double1 == 1.4395010458716009d);
    }

    @Test
    public void test5838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5838");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.028681504300924d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7973750751032043d + "'", double1 == 2.7973750751032043d);
    }

    @Test
    public void test5839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5839");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.9972021756248309d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.631089855569921d) + "'", double1 == (-0.631089855569921d));
    }

    @Test
    public void test5840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5840");
        double double1 = org.apache.commons.math.util.FastMath.sin(104.94395111059707d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9555128079474221d) + "'", double1 == (-0.9555128079474221d));
    }

    @Test
    public void test5841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5841");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 28, 89L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 89L + "'", long2 == 89L);
    }

    @Test
    public void test5842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5842");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.3383347192043265E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.668093098623403E43d + "'", double1 == 7.668093098623403E43d);
    }

    @Test
    public void test5843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5843");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.516964265655408d, 1.1414869946644686d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.47088940064748364d + "'", double2 == 0.47088940064748364d);
    }

    @Test
    public void test5844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5844");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.3288870502122705E12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.8828125E-4d + "'", double1 == 4.8828125E-4d);
    }

    @Test
    public void test5845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5845");
        double double1 = org.apache.commons.math.util.FastMath.asin((-2.1522840460757315d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5846");
        float float1 = org.apache.commons.math.util.FastMath.abs(969.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 969.0f + "'", float1 == 969.0f);
    }

    @Test
    public void test5847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5847");
        int int2 = org.apache.commons.math.util.FastMath.max(102, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
    }

    @Test
    public void test5848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5848");
        double double1 = org.apache.commons.math.util.FastMath.floor((-100.01791180959569d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-101.0d) + "'", double1 == (-101.0d));
    }

    @Test
    public void test5849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5849");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 53, (float) 232);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 53.0f + "'", float2 == 53.0f);
    }

    @Test
    public void test5850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5850");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-3.0466382509707714E-4d), 1.1295788105004783d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.697145297674331E-4d) + "'", double2 == (-2.697145297674331E-4d));
    }

    @Test
    public void test5851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5851");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.929020930583958d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3683902677659912d + "'", double1 == 1.3683902677659912d);
    }

    @Test
    public void test5852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5852");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.5898626184376444d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6308886990004812d + "'", double1 == 0.6308886990004812d);
    }

    @Test
    public void test5853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5853");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.2347857777188793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8900738051850847d + "'", double1 == 0.8900738051850847d);
    }

    @Test
    public void test5854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5854");
        double double1 = org.apache.commons.math.util.FastMath.ulp(27.935504743358095d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.552713678800501E-15d + "'", double1 == 3.552713678800501E-15d);
    }

    @Test
    public void test5855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5855");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.4545050086131437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9853485435170221d + "'", double1 == 0.9853485435170221d);
    }

    @Test
    public void test5856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5856");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 2.0f, 1.570491709370399d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.570491709370399d + "'", double2 == 1.570491709370399d);
    }

    @Test
    public void test5857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5857");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.8431082790768843d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5858");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.3524366883898337d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36017358796285076d + "'", double1 == 0.36017358796285076d);
    }

    @Test
    public void test5859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5859");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8321329645353112d, (-25.170419727719402d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 102.04284677693161d + "'", double2 == 102.04284677693161d);
    }

    @Test
    public void test5860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5860");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test5861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5861");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.5860134523134298E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5862");
        double double1 = org.apache.commons.math.util.FastMath.floor((-6.843036868748689d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.0d) + "'", double1 == (-7.0d));
    }

    @Test
    public void test5863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5863");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-4.632512904931237d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-51.3811329371215d) + "'", double1 == (-51.3811329371215d));
    }

    @Test
    public void test5864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5864");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.0730374999763912d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test5865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5865");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.5477745439281119d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 88.68094900486665d + "'", double1 == 88.68094900486665d);
    }

    @Test
    public void test5866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5866");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.1353030362043941d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5867");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.4944324908505626d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.514825281439211d) + "'", double1 == (-0.514825281439211d));
    }

    @Test
    public void test5868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5868");
        float float2 = org.apache.commons.math.util.FastMath.min(57.0f, (float) 969L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test5869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5869");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 601302L, (float) (-3));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.0f) + "'", float2 == (-3.0f));
    }

    @Test
    public void test5870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5870");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(9.306852817378903d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.050713493164985d + "'", double1 == 3.050713493164985d);
    }

    @Test
    public void test5871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5871");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.68435456E8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.956418979396394d + "'", double1 == 5.956418979396394d);
    }

    @Test
    public void test5872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5872");
        float float2 = org.apache.commons.math.util.FastMath.max(9.223372E18f, (float) 56L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test5873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5873");
        double double1 = org.apache.commons.math.util.FastMath.log(56.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.02535169073515d + "'", double1 == 4.02535169073515d);
    }

    @Test
    public void test5874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5874");
        double double2 = org.apache.commons.math.util.FastMath.pow(4.691649480399158E41d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5875");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) (-2.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8646647167633873d) + "'", double1 == (-0.8646647167633873d));
    }

    @Test
    public void test5876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5876");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 12L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12 + "'", int1 == 12);
    }

    @Test
    public void test5877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5877");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9704682670117346d, 3.0937355862524263d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9704682670117347d + "'", double2 == 0.9704682670117347d);
    }

    @Test
    public void test5878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5878");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.8473655875129774d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6137606174793193d + "'", double1 == 0.6137606174793193d);
    }

    @Test
    public void test5879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5879");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.631800352235365E13d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5880");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 100, (float) 601302);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test5881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5881");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.6211377330821444d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5882");
        double double1 = org.apache.commons.math.util.FastMath.abs((-1.0125173861454009d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0125173861454009d + "'", double1 == 1.0125173861454009d);
    }

    @Test
    public void test5883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5883");
        double double1 = org.apache.commons.math.util.FastMath.sin(9.86076131526265E-32d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.86076131526265E-32d + "'", double1 == 9.86076131526265E-32d);
    }

    @Test
    public void test5884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5884");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.3246090892520057d, 0.8809945689944431d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2810280157535896d + "'", double2 == 1.2810280157535896d);
    }

    @Test
    public void test5885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5885");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5707946637374584d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5886");
        double double1 = org.apache.commons.math.util.FastMath.cosh(6.779623299504136E11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5887");
        double double1 = org.apache.commons.math.util.FastMath.signum((-13.332305669662203d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5888");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.02914555989764255d, 1.8566490404809322d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.029145559897642552d + "'", double2 == 0.029145559897642552d);
    }

    @Test
    public void test5889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5889");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8726212203028842d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9876604284616479d + "'", double1 == 0.9876604284616479d);
    }

    @Test
    public void test5890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5890");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.3330101080431218d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23555171591958068d + "'", double1 == 0.23555171591958068d);
    }

    @Test
    public void test5891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5891");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 12, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 12.0f + "'", float2 == 12.0f);
    }

    @Test
    public void test5892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5892");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.6212891090067325d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1747717338999963d + "'", double1 == 1.1747717338999963d);
    }

    @Test
    public void test5893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5893");
        long long1 = org.apache.commons.math.util.FastMath.round(1.1647954793901711d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test5894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5894");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.03606321239200799d, 0.6077292684620609d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1327656754280628d + "'", double2 == 0.1327656754280628d);
    }

    @Test
    public void test5895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5895");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.5898626184376444d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5898626184376445d + "'", double1 == 0.5898626184376445d);
    }

    @Test
    public void test5896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5896");
        double double1 = org.apache.commons.math.util.FastMath.sin(52.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9866275920404853d + "'", double1 == 0.9866275920404853d);
    }

    @Test
    public void test5897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5897");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.251840827131708d, 1.1624473515096263d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8224081017903951d + "'", double2 == 0.8224081017903951d);
    }

    @Test
    public void test5898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5898");
        double double1 = org.apache.commons.math.util.FastMath.sin(11.491347542702698d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8796011261305746d) + "'", double1 == (-0.8796011261305746d));
    }

    @Test
    public void test5899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5899");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.429982300184234d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.429982300184234d + "'", double1 == 2.429982300184234d);
    }

    @Test
    public void test5900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5900");
        double double2 = org.apache.commons.math.util.FastMath.pow(3.434381731912222d, 41.40763396801269d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5424860955797707E22d + "'", double2 == 1.5424860955797707E22d);
    }

    @Test
    public void test5901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5901");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 102, (float) 5L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test5902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5902");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 10, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test5903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5903");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.6621341344260797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8471332895752729d + "'", double1 == 0.8471332895752729d);
    }

    @Test
    public void test5904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5904");
        float float1 = org.apache.commons.math.util.FastMath.abs(57.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 57.0f + "'", float1 == 57.0f);
    }

    @Test
    public void test5905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5905");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.6212891090067325d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2602128295221702d + "'", double1 == 1.2602128295221702d);
    }

    @Test
    public void test5906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5906");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test5907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5907");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test5908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5908");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.9036922050915067d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-51.777749330614135d) + "'", double1 == (-51.777749330614135d));
    }

    @Test
    public void test5909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5909");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 72, (float) 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 72.0f + "'", float2 == 72.0f);
    }

    @Test
    public void test5910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5910");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.5569083308639295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5911");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.9063641612633266d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5912");
        double double1 = org.apache.commons.math.util.FastMath.log(2.3977072091439116d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8745129512124437d + "'", double1 == 0.8745129512124437d);
    }

    @Test
    public void test5913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5913");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.8308672778518115E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1954662165539965E41d + "'", double1 == 3.1954662165539965E41d);
    }

    @Test
    public void test5914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5914");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '#', 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test5915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5915");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.4764016559700286d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.377166757077596d + "'", double1 == 4.377166757077596d);
    }

    @Test
    public void test5916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5916");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.41032129904824216d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.38874545763980906d) + "'", double1 == (-0.38874545763980906d));
    }

    @Test
    public void test5917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5917");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9993832155237184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.6794873638029523E-4d) + "'", double1 == (-2.6794873638029523E-4d));
    }

    @Test
    public void test5918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5918");
        double double1 = org.apache.commons.math.util.FastMath.rint(4.15912713462618d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test5919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5919");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.0730374999763912d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 61.48052000791639d + "'", double1 == 61.48052000791639d);
    }

    @Test
    public void test5920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5920");
        long long2 = org.apache.commons.math.util.FastMath.min(39481480091340L, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test5921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5921");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1248.1525277673024d, 9.306852817378903d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5633399621833288d + "'", double2 == 1.5633399621833288d);
    }

    @Test
    public void test5922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5922");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.0118543769141768d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5923");
        int int1 = org.apache.commons.math.util.FastMath.abs(12);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12 + "'", int1 == 12);
    }

    @Test
    public void test5924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5924");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 28L, (float) 3);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test5925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5925");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) 601302);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3346123295521544d + "'", double1 == 2.3346123295521544d);
    }

    @Test
    public void test5926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5926");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 74, (-5L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5L) + "'", long2 == (-5L));
    }

    @Test
    public void test5927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5927");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9999952113687003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01745320894256045d + "'", double1 == 0.01745320894256045d);
    }

    @Test
    public void test5928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5928");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.5228075827238494d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4798640040970981d + "'", double1 == 0.4798640040970981d);
    }

    @Test
    public void test5929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5929");
        double double1 = org.apache.commons.math.util.FastMath.asinh(11013.232874695796d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.99999999999931d + "'", double1 == 9.99999999999931d);
    }

    @Test
    public void test5930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5930");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(3.9481480091340625E13d, 1.0138559185957692d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.948148009134062E13d + "'", double2 == 3.948148009134062E13d);
    }

    @Test
    public void test5931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5931");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.5238371020216578d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4806560649585677d + "'", double1 == 0.4806560649585677d);
    }

    @Test
    public void test5932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5932");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.920997057311908d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5933");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 2147483647, (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test5934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5934");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.0514262063398037d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5935");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.4210854715202004E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4221817809573358E-5d + "'", double1 == 2.4221817809573358E-5d);
    }

    @Test
    public void test5936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5936");
        long long2 = org.apache.commons.math.util.FastMath.min((-1L), (long) 74);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test5937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5937");
        int int2 = org.apache.commons.math.util.FastMath.min(4, 969);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test5938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5938");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.5445244839004441d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7237884982746804d + "'", double1 == 0.7237884982746804d);
    }

    @Test
    public void test5939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5939");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 1, 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test5940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5940");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.0171665417993763d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8506216678210412d + "'", double1 == 0.8506216678210412d);
    }

    @Test
    public void test5941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5941");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.9171523356672744d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7245474750742176d) + "'", double1 == (-0.7245474750742176d));
    }

    @Test
    public void test5942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5942");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.22102787999532184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22469894983086627d + "'", double1 == 0.22469894983086627d);
    }

    @Test
    public void test5943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5943");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.1202790084281963E-20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1202790084281963E-20d + "'", double1 == 3.1202790084281963E-20d);
    }

    @Test
    public void test5944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5944");
        int int2 = org.apache.commons.math.util.FastMath.max(35, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test5945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5945");
        double double1 = org.apache.commons.math.util.FastMath.acosh(8.205696208681136d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7942420380825768d + "'", double1 == 2.7942420380825768d);
    }

    @Test
    public void test5946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5946");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) 5);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.28366218546322625d + "'", double1 == 0.28366218546322625d);
    }

    @Test
    public void test5947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5947");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.4802234523765396d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4802234523765398d + "'", double1 == 1.4802234523765398d);
    }

    @Test
    public void test5948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5948");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.1738549976522452d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5949");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.9649955887750582d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3809848803456371d + "'", double1 == 0.3809848803456371d);
    }

    @Test
    public void test5950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5950");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) 601302.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 84.40423075008775d + "'", double1 == 84.40423075008775d);
    }

    @Test
    public void test5951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5951");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.7922335744099078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2083233764351042d + "'", double1 == 1.2083233764351042d);
    }

    @Test
    public void test5952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5952");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.07682653184743575d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07697804104883779d + "'", double1 == 0.07697804104883779d);
    }

    @Test
    public void test5953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5953");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.5265129967102895d), 0.14254654307427825d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5265129967102894d) + "'", double2 == (-0.5265129967102894d));
    }

    @Test
    public void test5954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5954");
        double double1 = org.apache.commons.math.util.FastMath.signum(3.4683328494106918d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5955");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.3968271116979769d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5956");
        double double1 = org.apache.commons.math.util.FastMath.expm1(57.29577951308237d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.642595581083911E24d + "'", double1 == 7.642595581083911E24d);
    }

    @Test
    public void test5957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5957");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.7237884982746804d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7237884982746805d + "'", double1 == 0.7237884982746805d);
    }

    @Test
    public void test5958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5958");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.014930974924027406d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test5959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5959");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 601302L, (float) 1248L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 601302.0f + "'", float2 == 601302.0f);
    }

    @Test
    public void test5960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5960");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.0393938154819877d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.9754930146748417d) + "'", double1 == (-1.9754930146748417d));
    }

    @Test
    public void test5961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5961");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9122545643872476d, 0.1430337574877913d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9869502196946448d + "'", double2 == 0.9869502196946448d);
    }

    @Test
    public void test5962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5962");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 102, 5L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test5963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5963");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.16393896798747645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16321337278960105d + "'", double1 == 0.16321337278960105d);
    }

    @Test
    public void test5964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5964");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-1.5331510601832288d), 0.7958192892471013d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0920059914005305d) + "'", double2 == (-1.0920059914005305d));
    }

    @Test
    public void test5965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5965");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.05488618398122305d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5966");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.1659350422353596d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7602765479495022d + "'", double1 == 1.7602765479495022d);
    }

    @Test
    public void test5967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5967");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.0436982222538896d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0437260685878431d) + "'", double1 == (-0.0437260685878431d));
    }

    @Test
    public void test5968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5968");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.3574158419544757d, 1.4136054464127965d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5402942606583656d + "'", double2 == 1.5402942606583656d);
    }

    @Test
    public void test5969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5969");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-1.1961853422678859d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8324873537968617d) + "'", double1 == (-0.8324873537968617d));
    }

    @Test
    public void test5970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5970");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-3.0466382509707714E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.06728841474049795d) + "'", double1 == (-0.06728841474049795d));
    }

    @Test
    public void test5971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5971");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.862332614347913d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6106548779547d + "'", double1 == 2.6106548779547d);
    }

    @Test
    public void test5972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5972");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8519280895446752d, 0.7490362681090366d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8868890161973975d + "'", double2 == 0.8868890161973975d);
    }

    @Test
    public void test5973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5973");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.8014237616909528d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.946953256703941d + "'", double1 == 0.946953256703941d);
    }

    @Test
    public void test5974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5974");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.637978807091713E-12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-11.439139835231286d) + "'", double1 == (-11.439139835231286d));
    }

    @Test
    public void test5975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5975");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.0138559185957692d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5976");
        double double1 = org.apache.commons.math.util.FastMath.floor((-13.332305669662203d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-14.0d) + "'", double1 == (-14.0d));
    }

    @Test
    public void test5977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5977");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 10, 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
    }

    @Test
    public void test5978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5978");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.7650313545698383d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013352316018235846d + "'", double1 == 0.013352316018235846d);
    }

    @Test
    public void test5979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5979");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.25469727314226837d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5980");
        double double1 = org.apache.commons.math.util.FastMath.acosh(100.00000000000003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.298292365610485d + "'", double1 == 5.298292365610485d);
    }

    @Test
    public void test5981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5981");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.04050876663449861d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04051985370229045d + "'", double1 == 0.04051985370229045d);
    }

    @Test
    public void test5982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5982");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.8554182836643194d), 1.344162252208615d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test5983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5983");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.22099213933267595d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24731362580806773d + "'", double1 == 0.24731362580806773d);
    }

    @Test
    public void test5984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5984");
        double double2 = org.apache.commons.math.util.FastMath.max((double) 89L, (-0.018833921356972847d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 89.0d + "'", double2 == 89.0d);
    }

    @Test
    public void test5985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5985");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.24662339848588008d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4966119193956988d + "'", double1 == 0.4966119193956988d);
    }

    @Test
    public void test5986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5986");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 89L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 89 + "'", int1 == 89);
    }

    @Test
    public void test5987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5987");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.10713415391836659d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10713415391836659d + "'", double1 == 0.10713415391836659d);
    }

    @Test
    public void test5988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5988");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.175201187282749d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5989");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.5667721456124328d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5667721456124329d + "'", double1 == 0.5667721456124329d);
    }

    @Test
    public void test5990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5990");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.7473083494263217d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.030496283745076888d + "'", double1 == 0.030496283745076888d);
    }

    @Test
    public void test5991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5991");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) 102);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 102.00000000000001d + "'", double1 == 102.00000000000001d);
    }

    @Test
    public void test5992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5992");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) 56L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 56.0f + "'", float2 == 56.0f);
    }

    @Test
    public void test5993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5993");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(5.685719999335931E24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7848230096318725E8d + "'", double1 == 1.7848230096318725E8d);
    }

    @Test
    public void test5994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5994");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.19611958311551322d, (-1.4077955424908757d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.907996327355766d + "'", double2 == 9.907996327355766d);
    }

    @Test
    public void test5995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5995");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.5019419896466207d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5996");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.5088925547167915d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5217204624939757d + "'", double1 == 3.5217204624939757d);
    }

    @Test
    public void test5997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5997");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.7942420380825768d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16.350231202722476d + "'", double1 == 16.350231202722476d);
    }

    @Test
    public void test5998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5998");
        double double1 = org.apache.commons.math.util.FastMath.atan(74.20321057778875d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.557320636726051d + "'", double1 == 1.557320636726051d);
    }

    @Test
    public void test5999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5999");
        double double1 = org.apache.commons.math.util.FastMath.expm1(41.3576616065595d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.1496444962220147E17d + "'", double1 == 9.1496444962220147E17d);
    }

    @Test
    public void test6000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test6000");
        double double1 = org.apache.commons.math.util.FastMath.sinh(76.16461263958305d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.9819253630868655E32d + "'", double1 == 5.9819253630868655E32d);
    }
}

