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
        double double1 = org.apache.commons.math.util.FastMath.tan(0.6199770987338742d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7138744339600523d + "'", double1 == 0.7138744339600523d);
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5502");
        double double1 = org.apache.commons.math.util.FastMath.atanh(8.881784197001252E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5503");
        double double2 = org.apache.commons.math.util.FastMath.max((double) 97.0f, (-0.8402235152809697d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5504");
        double double2 = org.apache.commons.math.util.FastMath.max(147.4131591025766d, 7.915348169263078d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 147.4131591025766d + "'", double2 == 147.4131591025766d);
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5505");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.0899577325456637d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.037409656768053565d + "'", double1 == 0.037409656768053565d);
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5506");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.1632208669247299d), 0.8623188722877847d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.1632208669247299d) + "'", double2 == (-0.1632208669247299d));
    }

    @Test
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5507");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.046257937962002074d, 2226.6811121176097d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5508");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.2966885710872325d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.00517819241850946d + "'", double1 == 0.00517819241850946d);
    }

    @Test
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5509");
        double double1 = org.apache.commons.math.util.FastMath.log(0.2565251565229353d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3605285430676521d) + "'", double1 == (-1.3605285430676521d));
    }

    @Test
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5510");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.014198740808226773d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0143000217145544d + "'", double1 == 1.0143000217145544d);
    }

    @Test
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5511");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.04159438018192675d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000865170956049d + "'", double1 == 1.000865170956049d);
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5512");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 689081821154L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.8908181E11f + "'", float1 == 6.8908181E11f);
    }

    @Test
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5513");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.8479727390944818d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2488923238463094d) + "'", double1 == (-1.2488923238463094d));
    }

    @Test
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5514");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.0051059437697842d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5515");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.0010304133430488d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8420272726980571d + "'", double1 == 0.8420272726980571d);
    }

    @Test
    public void test5516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5516");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.473801085060013E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.473801085060013E-16d + "'", double1 == 1.473801085060013E-16d);
    }

    @Test
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5517");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.4532436627522913d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5518");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 138L, (float) 32L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 138.0f + "'", float2 == 138.0f);
    }

    @Test
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5519");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.3881771663389437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18160580090340211d + "'", double1 == 0.18160580090340211d);
    }

    @Test
    public void test5520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5520");
        double double2 = org.apache.commons.math.util.FastMath.max((-1.9080796112182217d), 0.08794443625241963d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08794443625241963d + "'", double2 == 0.08794443625241963d);
    }

    @Test
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5521");
        long long1 = org.apache.commons.math.util.FastMath.round(1.5422326689561365d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5522");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.4640783251232936d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16556431118885373d + "'", double1 == 0.16556431118885373d);
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5523");
        double double1 = org.apache.commons.math.util.FastMath.abs(13.067188648029997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.067188648029997d + "'", double1 == 13.067188648029997d);
    }

    @Test
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5524");
        double double1 = org.apache.commons.math.util.FastMath.log(1.059903262040248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05817764173314428d + "'", double1 == 0.05817764173314428d);
    }

    @Test
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5525");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.5202860320095168d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5202860320095168d + "'", double1 == 1.5202860320095168d);
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5526");
        double double1 = org.apache.commons.math.util.FastMath.log(0.5582527903380249d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5829433899079937d) + "'", double1 == (-0.5829433899079937d));
    }

    @Test
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5527");
        double double1 = org.apache.commons.math.util.FastMath.rint(4.340690375060061d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test5528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5528");
        double double1 = org.apache.commons.math.util.FastMath.log((-1.11742496684289d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5529");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.0202287245984625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017806350367665633d + "'", double1 == 0.017806350367665633d);
    }

    @Test
    public void test5530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5530");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.557153674151176d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2260538988828056d + "'", double1 == 1.2260538988828056d);
    }

    @Test
    public void test5531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5531");
        double double2 = org.apache.commons.math.util.FastMath.max(33.66561760358879d, 0.1428790501832544d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 33.66561760358879d + "'", double2 == 33.66561760358879d);
    }

    @Test
    public void test5532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5532");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.930313428991271d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.711815827999984d + "'", double1 == 1.711815827999984d);
    }

    @Test
    public void test5533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5533");
        long long1 = org.apache.commons.math.util.FastMath.round(0.15344430643143228d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test5534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5534");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.5851104659669798d), (-0.5063656411097587d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5063656411097587d) + "'", double2 == (-0.5063656411097587d));
    }

    @Test
    public void test5535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5535");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 10, (float) 13L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 13.0f + "'", float2 == 13.0f);
    }

    @Test
    public void test5536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5536");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (-1L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test5537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5537");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.09711515743188391d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.09726846354343018d) + "'", double1 == (-0.09726846354343018d));
    }

    @Test
    public void test5538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5538");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.22899890530590894d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5539");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9392166767245271d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.734862149100379d + "'", double1 == 0.734862149100379d);
    }

    @Test
    public void test5540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5540");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.930313428991271d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.930313428991271d + "'", double1 == 2.930313428991271d);
    }

    @Test
    public void test5541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5541");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 100, 51);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test5542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5542");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 3280L, 1.0911874016151137d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5704636477213114d + "'", double2 == 1.5704636477213114d);
    }

    @Test
    public void test5543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5543");
        double double1 = org.apache.commons.math.util.FastMath.asin(21.445599564021325d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5544");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.301812843306464d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test5545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5545");
        double double1 = org.apache.commons.math.util.FastMath.ulp(100.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test5546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5546");
        double double1 = org.apache.commons.math.util.FastMath.log10(8.692617836018588d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9391505866357995d + "'", double1 == 0.9391505866357995d);
    }

    @Test
    public void test5547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5547");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.66161881444429d, (-0.013642088109793105d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5790062612779625d + "'", double2 == 1.5790062612779625d);
    }

    @Test
    public void test5548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5548");
        double double1 = org.apache.commons.math.util.FastMath.sin(3.4748273059530623d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3271014459350721d) + "'", double1 == (-0.3271014459350721d));
    }

    @Test
    public void test5549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5549");
        float float2 = org.apache.commons.math.util.FastMath.min(100.0f, (float) 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test5550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5550");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.1194710708535681d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.12004275193709507d) + "'", double1 == (-0.12004275193709507d));
    }

    @Test
    public void test5551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5551");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.602651435823948d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9565307084111944d + "'", double1 == 0.9565307084111944d);
    }

    @Test
    public void test5552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5552");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.02017149514354095d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0201687597341265d + "'", double1 == 0.0201687597341265d);
    }

    @Test
    public void test5553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5553");
        double double2 = org.apache.commons.math.util.FastMath.pow(3.141592653589793d, 0.12240493707646952d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1504125183324254d + "'", double2 == 1.1504125183324254d);
    }

    @Test
    public void test5554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5554");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.0046874060688096d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6954881414061408d + "'", double1 == 0.6954881414061408d);
    }

    @Test
    public void test5555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5555");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.9992790497916413d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test5556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5556");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9823029524291397d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5557");
        double double2 = org.apache.commons.math.util.FastMath.min(147.4131591025766d, 1.5735827215807552d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5735827215807552d + "'", double2 == 1.5735827215807552d);
    }

    @Test
    public void test5558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5558");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.5504171915615343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.250638367015966d + "'", double1 == 2.250638367015966d);
    }

    @Test
    public void test5559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5559");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.5108256237659905d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3999999999999999d) + "'", double1 == (-0.3999999999999999d));
    }

    @Test
    public void test5560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5560");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.8189894035458565E-12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8189894035458565E-12d + "'", double1 == 1.8189894035458565E-12d);
    }

    @Test
    public void test5561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5561");
        float float1 = org.apache.commons.math.util.FastMath.abs(6.8908181E11f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.8908181E11f + "'", float1 == 6.8908181E11f);
    }

    @Test
    public void test5562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5562");
        double double1 = org.apache.commons.math.util.FastMath.ceil(42.81354925721529d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 43.0d + "'", double1 == 43.0d);
    }

    @Test
    public void test5563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5563");
        double double2 = org.apache.commons.math.util.FastMath.min(1.0430410006679824d, 2.034315407113705d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0430410006679824d + "'", double2 == 1.0430410006679824d);
    }

    @Test
    public void test5564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5564");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 7872L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7872.0f + "'", float2 == 7872.0f);
    }

    @Test
    public void test5565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5565");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.4203522483336561d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-24.084409738353585d) + "'", double1 == (-24.084409738353585d));
    }

    @Test
    public void test5566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5566");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.5856586910882368d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8366584420141147d + "'", double1 == 0.8366584420141147d);
    }

    @Test
    public void test5567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5567");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.7452953479050968d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 21.148938145819436d + "'", double1 == 21.148938145819436d);
    }

    @Test
    public void test5568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5568");
        double double1 = org.apache.commons.math.util.FastMath.atan(47.29016150730573d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5496534303375047d + "'", double1 == 1.5496534303375047d);
    }

    @Test
    public void test5569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5569");
        double double2 = org.apache.commons.math.util.FastMath.min(1.1578212823495775d, 0.2577689529157872d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2577689529157872d + "'", double2 == 0.2577689529157872d);
    }

    @Test
    public void test5570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5570");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.011408233318727529d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5571");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.6292322371010406d, 2.097434105410637d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6292322371010407d + "'", double2 == 0.6292322371010407d);
    }

    @Test
    public void test5572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5572");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.020695062331940996d, 2.0741994078890014d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.020695062331941d + "'", double2 == 0.020695062331941d);
    }

    @Test
    public void test5573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5573");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 32L, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test5574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5574");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(17.328679543800956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 992.8602023944795d + "'", double1 == 992.8602023944795d);
    }

    @Test
    public void test5575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5575");
        double double1 = org.apache.commons.math.util.FastMath.atan(152.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5642174743418802d + "'", double1 == 1.5642174743418802d);
    }

    @Test
    public void test5576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5576");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2739L, 9.223372E18f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2739.0f + "'", float2 == 2739.0f);
    }

    @Test
    public void test5577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5577");
        double double2 = org.apache.commons.math.util.FastMath.min(1.2213400826700138d, 4.644483341943227d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2213400826700138d + "'", double2 == 1.2213400826700138d);
    }

    @Test
    public void test5578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5578");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.027247780965780947d, 2.6881171418160207E43d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0136381537068384E-45d + "'", double2 == 1.0136381537068384E-45d);
    }

    @Test
    public void test5579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5579");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-10.992355853476756d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.092409887937381d) + "'", double1 == (-3.092409887937381d));
    }

    @Test
    public void test5580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5580");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 194L, (float) 13);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 194.0f + "'", float2 == 194.0f);
    }

    @Test
    public void test5581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5581");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.580519347575949d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5230427998625113d + "'", double1 == 0.5230427998625113d);
    }

    @Test
    public void test5582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5582");
        double double1 = org.apache.commons.math.util.FastMath.sinh(5.893061714674763d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 181.25537068558586d + "'", double1 == 181.25537068558586d);
    }

    @Test
    public void test5583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5583");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.1194710708535681d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5584");
        double double1 = org.apache.commons.math.util.FastMath.log(7.028730419947965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9500060949114084d + "'", double1 == 1.9500060949114084d);
    }

    @Test
    public void test5585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5585");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.2705251993740962d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5627232110812894d + "'", double1 == 3.5627232110812894d);
    }

    @Test
    public void test5586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5586");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.2055441846608936d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7909742742143219d + "'", double1 == 0.7909742742143219d);
    }

    @Test
    public void test5587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5587");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.0149280275816275d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7928067428890339d + "'", double1 == 0.7928067428890339d);
    }

    @Test
    public void test5588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5588");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 97, (float) 1L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test5589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5589");
        double double2 = org.apache.commons.math.util.FastMath.min(0.8524543594406486d, 0.9035086050663308d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8524543594406486d + "'", double2 == 0.8524543594406486d);
    }

    @Test
    public void test5590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5590");
        int int2 = org.apache.commons.math.util.FastMath.max(48, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test5591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5591");
        long long2 = org.apache.commons.math.util.FastMath.max(100L, (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test5592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5592");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.04742516418921198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04746076762388862d + "'", double1 == 0.04746076762388862d);
    }

    @Test
    public void test5593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5593");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.6177247701528313d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-35.39302223044608d) + "'", double1 == (-35.39302223044608d));
    }

    @Test
    public void test5594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5594");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9066335230777042d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5595");
        double double1 = org.apache.commons.math.util.FastMath.log(2.719301677299958d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0003751110587236d + "'", double1 == 1.0003751110587236d);
    }

    @Test
    public void test5596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5596");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.345632762712187d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.267831587699267d + "'", double1 == 5.267831587699267d);
    }

    @Test
    public void test5597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5597");
        double double2 = org.apache.commons.math.util.FastMath.pow(4.746501045726147d, 0.24769059955591424d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4707246714180582d + "'", double2 == 1.4707246714180582d);
    }

    @Test
    public void test5598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5598");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, (-0.4532436627522913d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.9E-324d) + "'", double2 == (-4.9E-324d));
    }

    @Test
    public void test5599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5599");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.999999931632527d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5600");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.041434612619286396d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.041434612619286396d + "'", double1 == 0.041434612619286396d);
    }

    @Test
    public void test5601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5601");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.5108256237659907d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5602");
        double double2 = org.apache.commons.math.util.FastMath.pow(3.931825632724326d, 0.28448959157673537d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.476236283011521d + "'", double2 == 1.476236283011521d);
    }

    @Test
    public void test5603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5603");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(5.362545819211763E122d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0725124288635857E124d + "'", double1 == 3.0725124288635857E124d);
    }

    @Test
    public void test5604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5604");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.1074946319245942d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8363598864682662d + "'", double1 == 0.8363598864682662d);
    }

    @Test
    public void test5605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5605");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.12627374894863147d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5606");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.14836503173587057d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14728591946206987d + "'", double1 == 0.14728591946206987d);
    }

    @Test
    public void test5607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5607");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9992399462688565d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5608");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.6388749269043887d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8777613940476336d + "'", double1 == 0.8777613940476336d);
    }

    @Test
    public void test5609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5609");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.853019787182933E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000285306048617d + "'", double1 == 1.0000285306048617d);
    }

    @Test
    public void test5610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5610");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.6649237511146353d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0973040326685208d + "'", double1 == 1.0973040326685208d);
    }

    @Test
    public void test5611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5611");
        double double2 = org.apache.commons.math.util.FastMath.max(0.6576913458149567d, 0.7053686466330485d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7053686466330485d + "'", double2 == 0.7053686466330485d);
    }

    @Test
    public void test5612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5612");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.1015071856306502d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3381637552994425d + "'", double1 == 1.3381637552994425d);
    }

    @Test
    public void test5613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5613");
        double double2 = org.apache.commons.math.util.FastMath.max(1.0235192552613448d, 3.4582054009704493d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.4582054009704493d + "'", double2 == 3.4582054009704493d);
    }

    @Test
    public void test5614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5614");
        long long1 = org.apache.commons.math.util.FastMath.round(25.339410356026747d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 25L + "'", long1 == 25L);
    }

    @Test
    public void test5615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5615");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5616");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.6912193154397878d), 1.4585955050518922E86d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.738937649579527E-87d) + "'", double2 == (-4.738937649579527E-87d));
    }

    @Test
    public void test5617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5617");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.6310781936490033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-16.568637592269997d) + "'", double1 == (-16.568637592269997d));
    }

    @Test
    public void test5618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5618");
        double double2 = org.apache.commons.math.util.FastMath.max(5.267831587699267d, 0.7372146681639586d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.267831587699267d + "'", double2 == 5.267831587699267d);
    }

    @Test
    public void test5619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5619");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.2334031175112168d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5620");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.1752012000048542d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8657694859111376d + "'", double1 == 0.8657694859111376d);
    }

    @Test
    public void test5621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5621");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.7853981633974483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1932800507380155d + "'", double1 == 1.1932800507380155d);
    }

    @Test
    public void test5622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5622");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.6817244223382299d), 1.3209482309129792d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6817244223382299d) + "'", double2 == (-0.6817244223382299d));
    }

    @Test
    public void test5623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5623");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-1.3958432288613232d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1430012795180615d + "'", double1 == 2.1430012795180615d);
    }

    @Test
    public void test5624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5624");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.1063634786066832d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5625");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.7733359594033115d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 44.30888661951011d + "'", double1 == 44.30888661951011d);
    }

    @Test
    public void test5626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5626");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) 97);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.267884728309446d + "'", double1 == 5.267884728309446d);
    }

    @Test
    public void test5627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5627");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.14191465995125369d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14096956326341126d + "'", double1 == 0.14096956326341126d);
    }

    @Test
    public void test5628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5628");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 100, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test5629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5629");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 32L, 0.5422402091037605d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.548665972822148d + "'", double2 == 6.548665972822148d);
    }

    @Test
    public void test5630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5630");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.38625675609943166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.41312391116311825d) + "'", double1 == (-0.41312391116311825d));
    }

    @Test
    public void test5631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5631");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5632");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.2592587853135318d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6376433390367477d) + "'", double1 == (-0.6376433390367477d));
    }

    @Test
    public void test5633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5633");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '4', 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test5634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5634");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.6365522825478772d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6365522825478771d + "'", double2 == 0.6365522825478771d);
    }

    @Test
    public void test5635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5635");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(24.750556201751934d, 0.003854698434102049d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 24.75055620175193d + "'", double2 == 24.75055620175193d);
    }

    @Test
    public void test5636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5636");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.6701920674592716d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.186466477731043d + "'", double1 == 1.186466477731043d);
    }

    @Test
    public void test5637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5637");
        float float2 = org.apache.commons.math.util.FastMath.max((float) '#', (float) 3280L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3280.0f + "'", float2 == 3280.0f);
    }

    @Test
    public void test5638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5638");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9176220725460068d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.08596965880719257d) + "'", double1 == (-0.08596965880719257d));
    }

    @Test
    public void test5639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5639");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 10, 2739L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test5640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5640");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.7715216602443775d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.030918885741660723d + "'", double1 == 0.030918885741660723d);
    }

    @Test
    public void test5641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5641");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.22331704219228246d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-12.795124010962718d) + "'", double1 == (-12.795124010962718d));
    }

    @Test
    public void test5642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5642");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.9867717342662448d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9867717342662448d + "'", double1 == 1.9867717342662448d);
    }

    @Test
    public void test5643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5643");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9298471527633106d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7305226257794997d + "'", double1 == 0.7305226257794997d);
    }

    @Test
    public void test5644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5644");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9335211344483768d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5645");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.345632762712187d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5646");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.12627374894863147d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test5647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5647");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.7895475094113655d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3453532714112804d + "'", double1 == 1.3453532714112804d);
    }

    @Test
    public void test5648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5648");
        long long1 = org.apache.commons.math.util.FastMath.abs(6559L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 6559L + "'", long1 == 6559L);
    }

    @Test
    public void test5649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5649");
        long long2 = org.apache.commons.math.util.FastMath.min((-1L), (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test5650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5650");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.23886037395044873d, 7.999470683622238d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0604300389845743E-5d + "'", double2 == 1.0604300389845743E-5d);
    }

    @Test
    public void test5651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5651");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.6303775321964172d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2053551699703147d + "'", double1 == 1.2053551699703147d);
    }

    @Test
    public void test5652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5652");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 0, 78962960182681L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5653");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.14675398103145348d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5654");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) -1, 21L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test5655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5655");
        double double1 = org.apache.commons.math.util.FastMath.sin(4.440892098500626E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test5656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5656");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.7189893924092378d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7189893924092379d + "'", double1 == 0.7189893924092379d);
    }

    @Test
    public void test5657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5657");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.0246369024478919d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7053903770478629d + "'", double1 == 0.7053903770478629d);
    }

    @Test
    public void test5658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5658");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.29243127846782413d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9575458145664311d + "'", double1 == 0.9575458145664311d);
    }

    @Test
    public void test5659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5659");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.15562022042706086d, 35.00000000000001d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1556202204270609d + "'", double2 == 0.1556202204270609d);
    }

    @Test
    public void test5660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5660");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 0.0f, 0.7603964251352017d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test5661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5661");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.6108965818975884d, 1.8809094881441943E7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.564455610710864E-8d + "'", double2 == 8.564455610710864E-8d);
    }

    @Test
    public void test5662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5662");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5663");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.0238739333695548d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test5664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5664");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test5665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5665");
        float float2 = org.apache.commons.math.util.FastMath.max(32.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test5666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5666");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.7645999354632541d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5667");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.02048526137339397d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.020486694162895648d + "'", double1 == 0.020486694162895648d);
    }

    @Test
    public void test5668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5668");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.999999931632527d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.969161728757356E-8d) + "'", double1 == (-2.969161728757356E-8d));
    }

    @Test
    public void test5669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5669");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.866258807710104d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9787378906540083d + "'", double1 == 0.9787378906540083d);
    }

    @Test
    public void test5670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5670");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9999963501743035d, 1.293486410453363d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999963501743035d + "'", double2 == 0.9999963501743035d);
    }

    @Test
    public void test5671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5671");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.6388749269043887d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5672");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-1.5531684309122575d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5673");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.0027160852291315484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.00271607855019982d + "'", double1 == 0.00271607855019982d);
    }

    @Test
    public void test5674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5674");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.6929693744345d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2972502726478083d + "'", double1 == 1.2972502726478083d);
    }

    @Test
    public void test5675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5675");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.4160734237838899d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7465461478651482d) + "'", double1 == (-0.7465461478651482d));
    }

    @Test
    public void test5676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5676");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9891013135438892d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9891013135438892d + "'", double1 == 0.9891013135438892d);
    }

    @Test
    public void test5677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5677");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 0, 13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test5678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5678");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.46664446687876304d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.44989205441499264d + "'", double1 == 0.44989205441499264d);
    }

    @Test
    public void test5679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5679");
        double double1 = org.apache.commons.math.util.FastMath.log1p(32.000000000000014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4965075614664807d + "'", double1 == 3.4965075614664807d);
    }

    @Test
    public void test5680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5680");
        double double1 = org.apache.commons.math.util.FastMath.rint(10.000000004122308d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test5681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5681");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.000000000000014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.540302305868128d + "'", double1 == 0.540302305868128d);
    }

    @Test
    public void test5682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5682");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-7.309879444991508d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.309879444991507d) + "'", double1 == (-7.309879444991507d));
    }

    @Test
    public void test5683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5683");
        double double1 = org.apache.commons.math.util.FastMath.log1p(5.244348724433776E63d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 146.72001192201665d + "'", double1 == 146.72001192201665d);
    }

    @Test
    public void test5684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5684");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9364017098556218d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9676785157559414d + "'", double1 == 0.9676785157559414d);
    }

    @Test
    public void test5685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5685");
        double double1 = org.apache.commons.math.util.FastMath.tanh(6.176457826889861E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.176457041478607E-4d + "'", double1 == 6.176457041478607E-4d);
    }

    @Test
    public void test5686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5686");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.20625262779927644d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22906366042640255d + "'", double1 == 0.22906366042640255d);
    }

    @Test
    public void test5687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5687");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.1601773562338082d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1588281866452191d + "'", double1 == 0.1588281866452191d);
    }

    @Test
    public void test5688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5688");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.3884945877179433d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0764179467223927d + "'", double1 == 1.0764179467223927d);
    }

    @Test
    public void test5689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5689");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 100L, 8.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test5690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5690");
        double double2 = org.apache.commons.math.util.FastMath.min(1.8919275091860766d, 0.8339178207386727d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8339178207386727d + "'", double2 == 0.8339178207386727d);
    }

    @Test
    public void test5691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5691");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.7992447670407306E-4d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5692");
        double double2 = org.apache.commons.math.util.FastMath.min(0.8058302155599487d, (-0.1194710708535681d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.1194710708535681d) + "'", double2 == (-0.1194710708535681d));
    }

    @Test
    public void test5693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5693");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9455557866374292d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5742437113278376d + "'", double1 == 1.5742437113278376d);
    }

    @Test
    public void test5694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5694");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.4319786974204731d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.007539450568463592d + "'", double1 == 0.007539450568463592d);
    }

    @Test
    public void test5695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5695");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.02037631437103149d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.27313365150510754d + "'", double1 == 0.27313365150510754d);
    }

    @Test
    public void test5696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5696");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.38818646476211366d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7294801232296593d + "'", double1 == 0.7294801232296593d);
    }

    @Test
    public void test5697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5697");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.2634178653612851d, 0.7928067428890339d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.26341786536128514d + "'", double2 == 0.26341786536128514d);
    }

    @Test
    public void test5698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5698");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(5.916079783099615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10325507102576027d + "'", double1 == 0.10325507102576027d);
    }

    @Test
    public void test5699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5699");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.4129701157116966d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4013315207626536d) + "'", double1 == (-0.4013315207626536d));
    }

    @Test
    public void test5700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5700");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.14675398103145348d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test5701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5701");
        double double1 = org.apache.commons.math.util.FastMath.cos(7.419949789789507E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999997247217383d + "'", double1 == 0.9999997247217383d);
    }

    @Test
    public void test5702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5702");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.5960035785549811d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6385148847175612d + "'", double1 == 0.6385148847175612d);
    }

    @Test
    public void test5703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5703");
        long long1 = org.apache.commons.math.util.FastMath.abs(78962960182681L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 78962960182681L + "'", long1 == 78962960182681L);
    }

    @Test
    public void test5704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5704");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.5066117617628818d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5705");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.5789513055791293d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5706");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.3648534103948403d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5707");
        int int2 = org.apache.commons.math.util.FastMath.min(51, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 51 + "'", int2 == 51);
    }

    @Test
    public void test5708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5708");
        double double1 = org.apache.commons.math.util.FastMath.ulp(564.2988711233953d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1368683772161603E-13d + "'", double1 == 1.1368683772161603E-13d);
    }

    @Test
    public void test5709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5709");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5710");
        double double1 = org.apache.commons.math.util.FastMath.rint((-1.532821681221366d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test5711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5711");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 51, 36L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 51L + "'", long2 == 51L);
    }

    @Test
    public void test5712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5712");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test5713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5713");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, 3280L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5714");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.1750843599550171d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5715");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.00517819241850946d, 7.930067261567154E14d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test5716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5716");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.0584580199563727d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6144570714392064d + "'", double1 == 1.6144570714392064d);
    }

    @Test
    public void test5717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5717");
        double double1 = org.apache.commons.math.util.FastMath.exp(4.644298430695373d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 103.99038372622381d + "'", double1 == 103.99038372622381d);
    }

    @Test
    public void test5718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5718");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.4953672865336895d, (double) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.49536728653368955d + "'", double2 == 0.49536728653368955d);
    }

    @Test
    public void test5719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5719");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.3522721478954661d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5720");
        int int2 = org.apache.commons.math.util.FastMath.min(2, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test5721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5721");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.3757333601704966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4560588387254195d + "'", double1 == 0.4560588387254195d);
    }

    @Test
    public void test5722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5722");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.7775315238017035d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6608897153692804d + "'", double1 == 0.6608897153692804d);
    }

    @Test
    public void test5723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5723");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.1906899454435433d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9286251713009589d + "'", double1 == 0.9286251713009589d);
    }

    @Test
    public void test5724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5724");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (-3L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3) + "'", int1 == (-3));
    }

    @Test
    public void test5725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5725");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.6245182179883367d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test5726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5726");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 3280L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5727");
        long long2 = org.apache.commons.math.util.FastMath.max(3280L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3280L + "'", long2 == 3280L);
    }

    @Test
    public void test5728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5728");
        int int2 = org.apache.commons.math.util.FastMath.min((int) 'a', 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test5729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5729");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.3428455230553182d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4954971112214381d + "'", double1 == 1.4954971112214381d);
    }

    @Test
    public void test5730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5730");
        double double2 = org.apache.commons.math.util.FastMath.min(0.8414709848078964d, 0.35024840708547117d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.35024840708547117d + "'", double2 == 0.35024840708547117d);
    }

    @Test
    public void test5731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5731");
        float float2 = org.apache.commons.math.util.FastMath.max(3.0f, 9.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.0f + "'", float2 == 9.0f);
    }

    @Test
    public void test5732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5732");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.2539945895800114d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5733");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.6017821704857126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.010503080254773528d + "'", double1 == 0.010503080254773528d);
    }

    @Test
    public void test5734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5734");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9863798950554904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5735");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.9088339535934726d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7055304024242641d + "'", double1 == 1.7055304024242641d);
    }

    @Test
    public void test5736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5736");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.017453292519943295d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01745417862959511d) + "'", double1 == (-0.01745417862959511d));
    }

    @Test
    public void test5737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5737");
        double double1 = org.apache.commons.math.util.FastMath.log(1.007145161097809d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.007119755381093258d + "'", double1 == 0.007119755381093258d);
    }

    @Test
    public void test5738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5738");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9660002138002461d, 1.7755413388321177d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9660002138002463d + "'", double2 == 0.9660002138002463d);
    }

    @Test
    public void test5739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5739");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 48);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 48L + "'", long1 == 48L);
    }

    @Test
    public void test5740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5740");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.5461242228508565d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.290613059216106d + "'", double1 == 31.290613059216106d);
    }

    @Test
    public void test5741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5741");
        double double1 = org.apache.commons.math.util.FastMath.signum(7871.825828205634d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5742");
        float float2 = org.apache.commons.math.util.FastMath.min(36.0f, (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test5743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5743");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.01627067580558459d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5744");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.14827828493928633d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.14882708441540551d) + "'", double1 == (-0.14882708441540551d));
    }

    @Test
    public void test5745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5745");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-1.11742496684289d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5746");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.0115210545205378d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5567229026732161d + "'", double1 == 1.5567229026732161d);
    }

    @Test
    public void test5747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5747");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9043400555523963d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.470301123487744d + "'", double1 == 2.470301123487744d);
    }

    @Test
    public void test5748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5748");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.09808293184436E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0980829472371274E-4d + "'", double1 == 2.0980829472371274E-4d);
    }

    @Test
    public void test5749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5749");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(20.049875621120893d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.049875621120897d + "'", double1 == 20.049875621120897d);
    }

    @Test
    public void test5750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5750");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 2005L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2005 + "'", int1 == 2005);
    }

    @Test
    public void test5751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5751");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 9L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.0f + "'", float1 == 9.0f);
    }

    @Test
    public void test5752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5752");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.166013034516528d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.39381957453390254d + "'", double1 == 0.39381957453390254d);
    }

    @Test
    public void test5753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5753");
        double double1 = org.apache.commons.math.util.FastMath.tanh(13.875621465855696d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999982265d + "'", double1 == 0.9999999999982265d);
    }

    @Test
    public void test5754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5754");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 9223372036854775807L, (float) 9L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test5755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5755");
        double double2 = org.apache.commons.math.util.FastMath.max(1.5574075654456325d, 0.8623188722877847d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5574075654456325d + "'", double2 == 1.5574075654456325d);
    }

    @Test
    public void test5756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5756");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.2310709246944891d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2270443183859707d) + "'", double1 == (-0.2270443183859707d));
    }

    @Test
    public void test5757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5757");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.0014863595869859044d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0014863601342796227d + "'", double1 == 0.0014863601342796227d);
    }

    @Test
    public void test5758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5758");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.0079835661910628d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5759");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.1189396031849523d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 64.11051679254085d + "'", double1 == 64.11051679254085d);
    }

    @Test
    public void test5760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5760");
        double double1 = org.apache.commons.math.util.FastMath.acosh(5.268356063861754E-9d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5761");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 9223372036854775807L, (float) 4L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test5762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5762");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.12627374894863147d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1266095903310893d) + "'", double1 == (-0.1266095903310893d));
    }

    @Test
    public void test5763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5763");
        double double2 = org.apache.commons.math.util.FastMath.min(0.6306583303604348d, 89.42202966819183d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6306583303604348d + "'", double2 == 0.6306583303604348d);
    }

    @Test
    public void test5764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5764");
        double double2 = org.apache.commons.math.util.FastMath.min(1.0000000041223074d, 0.015255437332075723d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.015255437332075723d + "'", double2 == 0.015255437332075723d);
    }

    @Test
    public void test5765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5765");
        long long1 = org.apache.commons.math.util.FastMath.round(4.74325165022966d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test5766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5766");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-3), (float) 689081821154L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.8908181E11f + "'", float2 == 6.8908181E11f);
    }

    @Test
    public void test5767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5767");
        double double1 = org.apache.commons.math.util.FastMath.cos(96.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9251475365964085d) + "'", double1 == (-0.9251475365964085d));
    }

    @Test
    public void test5768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5768");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.0011273202561264d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5393533554611306d + "'", double1 == 0.5393533554611306d);
    }

    @Test
    public void test5769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5769");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.6576913458149567d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6112914008019903d + "'", double1 == 0.6112914008019903d);
    }

    @Test
    public void test5770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5770");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 78962960182681L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.8962957E13f + "'", float1 == 7.8962957E13f);
    }

    @Test
    public void test5771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5771");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test5772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5772");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 51, 2739L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 51L + "'", long2 == 51L);
    }

    @Test
    public void test5773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5773");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.02718080430674016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027553572080275403d + "'", double1 == 0.027553572080275403d);
    }

    @Test
    public void test5774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5774");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.6582696111348529d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1815961935499913d) + "'", double1 == (-0.1815961935499913d));
    }

    @Test
    public void test5775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5775");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.8717898497955656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06757548082422932d + "'", double1 == 0.06757548082422932d);
    }

    @Test
    public void test5776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5776");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.3209482309129792d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5777");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 21L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
    }

    @Test
    public void test5778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5778");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.8086089434116457d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5779");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.5294442277710718d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.009240544980284001d) + "'", double1 == (-0.009240544980284001d));
    }

    @Test
    public void test5780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5780");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.06279620701139618d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9980289660288556d + "'", double1 == 0.9980289660288556d);
    }

    @Test
    public void test5781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5781");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.0000000000000142d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5782");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.473814720414451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49361759023450513d + "'", double1 == 0.49361759023450513d);
    }

    @Test
    public void test5783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5783");
        double double1 = org.apache.commons.math.util.FastMath.exp(5.849345000344263d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 347.00701654883756d + "'", double1 == 347.00701654883756d);
    }

    @Test
    public void test5784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5784");
        double double2 = org.apache.commons.math.util.FastMath.atan2(7.028730419947965d, 1833.4649444186343d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003833558972313443d + "'", double2 == 0.003833558972313443d);
    }

    @Test
    public void test5785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5785");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.10729626364300879d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.001872673075658389d) + "'", double1 == (-0.001872673075658389d));
    }

    @Test
    public void test5786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5786");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 689081821154L, 9.223372E18f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.8908181E11f + "'", float2 == 6.8908181E11f);
    }

    @Test
    public void test5787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5787");
        double double1 = org.apache.commons.math.util.FastMath.signum(3.1398597617912154d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5788");
        double double2 = org.apache.commons.math.util.FastMath.max(0.39707373807201474d, (double) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.39707373807201474d + "'", double2 == 0.39707373807201474d);
    }

    @Test
    public void test5789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5789");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.7101417768967997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6519412826634519d + "'", double1 == 0.6519412826634519d);
    }

    @Test
    public void test5790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5790");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.00517819241850946d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.2858218154800927d) + "'", double1 == (-2.2858218154800927d));
    }

    @Test
    public void test5791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5791");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.020377724655755693d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0205867680149634d + "'", double1 == 1.0205867680149634d);
    }

    @Test
    public void test5792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5792");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9562562360485877d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5793");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.7584073102891926d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5794");
        float float2 = org.apache.commons.math.util.FastMath.max((-1.0f), (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5795");
        double double1 = org.apache.commons.math.util.FastMath.log1p(4.746501045726147d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7485911558028446d + "'", double1 == 1.7485911558028446d);
    }

    @Test
    public void test5796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5796");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9988731032017402d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5412502135621129d + "'", double1 == 0.5412502135621129d);
    }

    @Test
    public void test5797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5797");
        long long2 = org.apache.commons.math.util.FastMath.min(1L, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test5798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5798");
        float float2 = org.apache.commons.math.util.FastMath.min(7872.0f, (float) 6559L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6559.0f + "'", float2 == 6559.0f);
    }

    @Test
    public void test5799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5799");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.06757548082422932d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06757548082422932d + "'", double1 == 0.06757548082422932d);
    }

    @Test
    public void test5800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5800");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.5454678216376646d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5729223979982487d + "'", double1 == 0.5729223979982487d);
    }

    @Test
    public void test5801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5801");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5802");
        double double1 = org.apache.commons.math.util.FastMath.atan(43.55353759884347d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.54784011275668d + "'", double1 == 1.54784011275668d);
    }

    @Test
    public void test5803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5803");
        long long1 = org.apache.commons.math.util.FastMath.round(2.363665536795953d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test5804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5804");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.12952606822871066d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5805");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 100, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test5806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5806");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.4519004066366517d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test5807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5807");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.0000000000000142d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000000000000007d + "'", double1 == 1.000000000000007d);
    }

    @Test
    public void test5808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5808");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.99822295029797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9982229502979703d + "'", double1 == 2.9982229502979703d);
    }

    @Test
    public void test5809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5809");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.2623340685354996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5810");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) (-3L), 138.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.9999999999999996d) + "'", double2 == (-2.9999999999999996d));
    }

    @Test
    public void test5811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5811");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 1, (float) 25L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test5812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5812");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.063677972537624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.036017975321662656d + "'", double1 == 0.036017975321662656d);
    }

    @Test
    public void test5813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5813");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.3322863883917696d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3941520603114104d + "'", double1 == 1.3941520603114104d);
    }

    @Test
    public void test5814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5814");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5815");
        long long2 = org.apache.commons.math.util.FastMath.min(25L, 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test5816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5816");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49714987269413385d + "'", double1 == 0.49714987269413385d);
    }

    @Test
    public void test5817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5817");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) 3L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9899924966004454d) + "'", double1 == (-0.9899924966004454d));
    }

    @Test
    public void test5818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5818");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-1.1662871024540074E-10d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5819");
        double double1 = org.apache.commons.math.util.FastMath.exp(7.93006726156721E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5820");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.541576288123802E-20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.541576288123802E-20d + "'", double1 == 2.541576288123802E-20d);
    }

    @Test
    public void test5821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5821");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.5287499284227858d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5822");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.9730337692042502d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9730337692042502d + "'", double1 == 0.9730337692042502d);
    }

    @Test
    public void test5823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5823");
        double double2 = org.apache.commons.math.util.FastMath.max(5792.618751480198d, 1.9925591367766533d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5792.618751480198d + "'", double2 == 5792.618751480198d);
    }

    @Test
    public void test5824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5824");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.99991199244082d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test5825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5825");
        long long2 = org.apache.commons.math.util.FastMath.min(3280L, (long) 2147483647);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3280L + "'", long2 == 3280L);
    }

    @Test
    public void test5826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5826");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.154434690031884d + "'", double1 == 2.154434690031884d);
    }

    @Test
    public void test5827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5827");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.5097736159129067d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5097736159129067d + "'", double1 == 1.5097736159129067d);
    }

    @Test
    public void test5828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5828");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9565307084111944d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7427253832183113d + "'", double1 == 0.7427253832183113d);
    }

    @Test
    public void test5829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5829");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.3230655227552648d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7836188215702459d + "'", double1 == 0.7836188215702459d);
    }

    @Test
    public void test5830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5830");
        double double1 = org.apache.commons.math.util.FastMath.exp((-4.9E-324d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5831");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.1307229674874573d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.097895368343585d + "'", double1 == 2.097895368343585d);
    }

    @Test
    public void test5832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5832");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.7895475094113655d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9761692172288481d + "'", double1 == 0.9761692172288481d);
    }

    @Test
    public void test5833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5833");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(564.2988711233953d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.8488732663904d + "'", double1 == 9.8488732663904d);
    }

    @Test
    public void test5834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5834");
        long long2 = org.apache.commons.math.util.FastMath.max(5L, 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test5835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5835");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.0523580336179443d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 60.29567386299461d + "'", double1 == 60.29567386299461d);
    }

    @Test
    public void test5836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5836");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.1958111284153483d, 0.26811775505569796d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6458460763235493d + "'", double2 == 0.6458460763235493d);
    }

    @Test
    public void test5837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5837");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.7966806685070602d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test5838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5838");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.8420272726980571d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0010304133430488d + "'", double1 == 1.0010304133430488d);
    }

    @Test
    public void test5839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5839");
        int int2 = org.apache.commons.math.util.FastMath.max(21, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test5840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5840");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.7053903770478629d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5841");
        float float2 = org.apache.commons.math.util.FastMath.min(10.0f, 3280.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test5842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5842");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.5707963267948961d, (-0.21588220933551652d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7073755799648442d + "'", double2 == 1.7073755799648442d);
    }

    @Test
    public void test5843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5843");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.149497948085797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1472430585748867d + "'", double1 == 1.1472430585748867d);
    }

    @Test
    public void test5844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5844");
        double double1 = org.apache.commons.math.util.FastMath.asin(100.00000000000323d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5845");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.8193243886355482d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6864135387770072d + "'", double1 == 0.6864135387770072d);
    }

    @Test
    public void test5846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5846");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9144143970315091d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test5847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5847");
        double double1 = org.apache.commons.math.util.FastMath.tanh(Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5848");
        double double2 = org.apache.commons.math.util.FastMath.min(1.7035516195697273d, 1.5202860320095168d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5202860320095168d + "'", double2 == 1.5202860320095168d);
    }

    @Test
    public void test5849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5849");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.26151182221334535d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5850");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.8976134920167367d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1143250647965253d + "'", double1 == 1.1143250647965253d);
    }

    @Test
    public void test5851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5851");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9999999999999645d, 49.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999999999982592d + "'", double2 == 0.9999999999982592d);
    }

    @Test
    public void test5852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5852");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5853");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8299156566489104d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.928519628251389d + "'", double1 == 0.928519628251389d);
    }

    @Test
    public void test5854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5854");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9450375315476002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0921224793192523d + "'", double1 == 1.0921224793192523d);
    }

    @Test
    public void test5855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5855");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.3209482309129792d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 75.68475858658621d + "'", double1 == 75.68475858658621d);
    }

    @Test
    public void test5856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5856");
        double double1 = org.apache.commons.math.util.FastMath.sinh(70.24416936194356d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.605554840023866E30d + "'", double1 == 1.605554840023866E30d);
    }

    @Test
    public void test5857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5857");
        float float2 = org.apache.commons.math.util.FastMath.min(3.0f, (float) 3L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test5858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5858");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 13L, (float) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 13.0f + "'", float2 == 13.0f);
    }

    @Test
    public void test5859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5859");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.851630931467367d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9228385186300835d + "'", double1 == 0.9228385186300835d);
    }

    @Test
    public void test5860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5860");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.5829433899079937d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6593834165041728d) + "'", double1 == (-0.6593834165041728d));
    }

    @Test
    public void test5861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5861");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 7872L, (float) 78L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7872.0f + "'", float2 == 7872.0f);
    }

    @Test
    public void test5862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5862");
        double double1 = org.apache.commons.math.util.FastMath.log((-18.714973875118524d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5863");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.27629111752846225d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5864");
        double double1 = org.apache.commons.math.util.FastMath.log(1.008398253529292d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.00836318440756933d + "'", double1 == 0.00836318440756933d);
    }

    @Test
    public void test5865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5865");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9688145798019269d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6348192394260208d + "'", double1 == 1.6348192394260208d);
    }

    @Test
    public void test5866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5866");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 21);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
    }

    @Test
    public void test5867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5867");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9379924444723454d, 0.9980781474306382d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9379924444723455d + "'", double2 == 0.9379924444723455d);
    }

    @Test
    public void test5868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5868");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.8524543594406486d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6165114406056d + "'", double1 == 0.6165114406056d);
    }

    @Test
    public void test5869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5869");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.013811841723194d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5870");
        float float2 = org.apache.commons.math.util.FastMath.min(2005.0f, 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2005.0f + "'", float2 == 2005.0f);
    }

    @Test
    public void test5871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5871");
        double double1 = org.apache.commons.math.util.FastMath.acos((-1.5424779445183978E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5709505745899601d + "'", double1 == 1.5709505745899601d);
    }

    @Test
    public void test5872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5872");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.7430987570063676d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7430987570063676d + "'", double1 == 2.7430987570063676d);
    }

    @Test
    public void test5873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5873");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.2360642776393149d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2338778787153304d) + "'", double1 == (-0.2338778787153304d));
    }

    @Test
    public void test5874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5874");
        double double2 = org.apache.commons.math.util.FastMath.pow(99.99999999999997d, 3.762195691083632d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.344963492510279E7d + "'", double2 == 3.344963492510279E7d);
    }

    @Test
    public void test5875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5875");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.393531189495465d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5876");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.06788473056620924d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0023050533232358d + "'", double1 == 1.0023050533232358d);
    }

    @Test
    public void test5877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5877");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.04715964144523967d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5878");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.661652614839894d, 0.7603964251352017d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6616526148398941d + "'", double2 == 0.6616526148398941d);
    }

    @Test
    public void test5879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5879");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.7884788267086713d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8727557646218309d) + "'", double1 == (-0.8727557646218309d));
    }

    @Test
    public void test5880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5880");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.14903806966647556d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9889143695266539d + "'", double1 == 0.9889143695266539d);
    }

    @Test
    public void test5881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5881");
        float float2 = org.apache.commons.math.util.FastMath.min(3.0f, (float) 1L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test5882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5882");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.5158639955088393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.520584954265737d + "'", double1 == 1.520584954265737d);
    }

    @Test
    public void test5883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5883");
        long long1 = org.apache.commons.math.util.FastMath.round((double) 39481480091341L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 39481480091341L + "'", long1 == 39481480091341L);
    }

    @Test
    public void test5884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5884");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.29243127846782413d, 2.930313428991271d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.02724472556210625d + "'", double2 == 0.02724472556210625d);
    }

    @Test
    public void test5885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5885");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6000000000000001d + "'", double1 == 0.6000000000000001d);
    }

    @Test
    public void test5886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5886");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9999893299850896d, 0.1588281866452191d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4132821837278862d + "'", double2 == 1.4132821837278862d);
    }

    @Test
    public void test5887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5887");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.6853169696133173d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6329184470359335d) + "'", double1 == (-0.6329184470359335d));
    }

    @Test
    public void test5888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5888");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.14782604738794858d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14782604738794858d + "'", double1 == 0.14782604738794858d);
    }

    @Test
    public void test5889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5889");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.004619531120223835d, 1.5735827215807552d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1137401802179983E-4d + "'", double2 == 2.1137401802179983E-4d);
    }

    @Test
    public void test5890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5890");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 9223372036854775807L, (float) 2);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test5891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5891");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.5087348157117294d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.104510911076623d + "'", double1 == 2.104510911076623d);
    }

    @Test
    public void test5892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5892");
        double double1 = org.apache.commons.math.util.FastMath.asinh(5.298342365610621d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.369330062946262d + "'", double1 == 2.369330062946262d);
    }

    @Test
    public void test5893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5893");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.8020200379631092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 45.952363260208216d + "'", double1 == 45.952363260208216d);
    }

    @Test
    public void test5894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5894");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 97, (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test5895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5895");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.16299078079570548d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5896");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.12270990624068587d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12333144183930954d + "'", double1 == 0.12333144183930954d);
    }

    @Test
    public void test5897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5897");
        double double1 = org.apache.commons.math.util.FastMath.log(0.26363402215252263d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3331934173358142d) + "'", double1 == (-1.3331934173358142d));
    }

    @Test
    public void test5898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5898");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.8208003129928877d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.014325667963125883d + "'", double1 == 0.014325667963125883d);
    }

    @Test
    public void test5899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5899");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 0, 2005);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5900");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.5063656411097466d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6026819659087853d + "'", double1 == 0.6026819659087853d);
    }

    @Test
    public void test5901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5901");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.8193243886355482d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6747019849034382d + "'", double1 == 0.6747019849034382d);
    }

    @Test
    public void test5902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5902");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.26363402215252263d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5789985444586833d) + "'", double1 == (-0.5789985444586833d));
    }

    @Test
    public void test5903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5903");
        double double1 = org.apache.commons.math.util.FastMath.rint(9.07998610608725E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5904");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.6817244223382299d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-39.059932190974635d) + "'", double1 == (-39.059932190974635d));
    }

    @Test
    public void test5905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5905");
        long long2 = org.apache.commons.math.util.FastMath.min(2739L, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5906");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.5706326162312105d, 1.8919275091860766d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6928719750090248d + "'", double2 == 0.6928719750090248d);
    }

    @Test
    public void test5907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5907");
        double double1 = org.apache.commons.math.util.FastMath.atanh(11013.232920103323d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5908");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 3, (float) 52L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test5909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5909");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.5635488491325358d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 137.97662274805728d + "'", double1 == 137.97662274805728d);
    }

    @Test
    public void test5910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5910");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 1, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test5911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5911");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-5.883764179245988d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.10269105733874431d) + "'", double1 == (-0.10269105733874431d));
    }

    @Test
    public void test5912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5912");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.017806350367665633d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017804468676211778d + "'", double1 == 0.017804468676211778d);
    }

    @Test
    public void test5913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5913");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.010308913146243284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.010308730560601208d + "'", double1 == 0.010308730560601208d);
    }

    @Test
    public void test5914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5914");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.4403028592460305d, (-0.06561630304380342d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4403028592460303d + "'", double2 == 1.4403028592460303d);
    }

    @Test
    public void test5915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5915");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9999009710012459d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7615525631804252d + "'", double1 == 0.7615525631804252d);
    }

    @Test
    public void test5916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5916");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.003027381705607183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5677689404649247d + "'", double1 == 1.5677689404649247d);
    }

    @Test
    public void test5917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5917");
        long long2 = org.apache.commons.math.util.FastMath.max(36L, (long) 2147483647);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test5918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5918");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 2739);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2739L + "'", long1 == 2739L);
    }

    @Test
    public void test5919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5919");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(47.7974777282436d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6291227665749557d + "'", double1 == 3.6291227665749557d);
    }

    @Test
    public void test5920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5920");
        long long2 = org.apache.commons.math.util.FastMath.min(13L, 3280L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 13L + "'", long2 == 13L);
    }

    @Test
    public void test5921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5921");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.20483907696488424d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22732754379732215d + "'", double1 == 0.22732754379732215d);
    }

    @Test
    public void test5922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5922");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 97, (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test5923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5923");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.3381637552994425d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9730628546057956d + "'", double1 == 0.9730628546057956d);
    }

    @Test
    public void test5924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5924");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.485329946666348d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.902461798031745d + "'", double1 == 0.902461798031745d);
    }

    @Test
    public void test5925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5925");
        double double1 = org.apache.commons.math.util.FastMath.tan(6.691673596021348E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03799291018846901d + "'", double1 == 0.03799291018846901d);
    }

    @Test
    public void test5926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5926");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.618990892446662d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7123866874039658d + "'", double1 == 0.7123866874039658d);
    }

    @Test
    public void test5927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5927");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.16146084948443995d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5928");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.6567734310571898d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7919663796566081d + "'", double1 == 0.7919663796566081d);
    }

    @Test
    public void test5929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5929");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.8363823423457781d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8363823423457782d + "'", double1 == 0.8363823423457782d);
    }

    @Test
    public void test5930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5930");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.1516653330585762d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5931");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.3383347192042695E42d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5932");
        double double1 = org.apache.commons.math.util.FastMath.exp(21.42227207044929d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0117525015297403E9d + "'", double1 == 2.0117525015297403E9d);
    }

    @Test
    public void test5933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5933");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9450375315476002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9813328842264898d + "'", double1 == 0.9813328842264898d);
    }

    @Test
    public void test5934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5934");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.1143250647965253d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.04751061270329d + "'", double1 == 2.04751061270329d);
    }

    @Test
    public void test5935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5935");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.0393768734000801d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7011855619031937d + "'", double1 == 1.7011855619031937d);
    }

    @Test
    public void test5936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5936");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(41.9757493748275d, 0.0030319595626882427d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 41.975749374827494d + "'", double2 == 41.975749374827494d);
    }

    @Test
    public void test5937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5937");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 21);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5938");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9889143695266539d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5939");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(9.899494936611662d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.899494936611664d + "'", double1 == 9.899494936611664d);
    }

    @Test
    public void test5940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5940");
        double double1 = org.apache.commons.math.util.FastMath.ceil(50.49504950495051d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 51.0d + "'", double1 == 51.0d);
    }

    @Test
    public void test5941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5941");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 25L, (float) 97L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test5942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5942");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) 5.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.380515006246586d) + "'", double1 == (-3.380515006246586d));
    }

    @Test
    public void test5943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5943");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.92801823594317d, 1.5448367582308211d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8910049251263005d + "'", double2 == 0.8910049251263005d);
    }

    @Test
    public void test5944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5944");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 4, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test5945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5945");
        double double1 = org.apache.commons.math.util.FastMath.asinh(3.9588076367332294d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0846732104219567d + "'", double1 == 2.0846732104219567d);
    }

    @Test
    public void test5946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5946");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.2055441846608936d, 0.4977525408008414d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1792307629308398d + "'", double2 == 1.1792307629308398d);
    }

    @Test
    public void test5947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5947");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.4532436627522913d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5948");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.175084359955017d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7736045268926388d + "'", double1 == 1.7736045268926388d);
    }

    @Test
    public void test5949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5949");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.604651599722822d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7004472690069533d + "'", double1 == 0.7004472690069533d);
    }

    @Test
    public void test5950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5950");
        double double2 = org.apache.commons.math.util.FastMath.pow(5729.5779513082325d, (-1.2510593165140436d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9877678776653313E-5d + "'", double2 == 1.9877678776653313E-5d);
    }

    @Test
    public void test5951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5951");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.7755413388321177d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.94421359643267d + "'", double1 == 0.94421359643267d);
    }

    @Test
    public void test5952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5952");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(24.19638901669072d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.892345609784375d + "'", double1 == 2.892345609784375d);
    }

    @Test
    public void test5953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5953");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.35745433920237724d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2052556094374671d + "'", double1 == 1.2052556094374671d);
    }

    @Test
    public void test5954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5954");
        double double2 = org.apache.commons.math.util.FastMath.pow(3.757983587242636d, 564.2988711233953d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5955");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.5063656411097587d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5956");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.26917661759777844d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5957");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5395564933646284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5958");
        int int2 = org.apache.commons.math.util.FastMath.max(52, 2739);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2739 + "'", int2 == 2739);
    }

    @Test
    public void test5959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5959");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.16288628673873548d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.002842902009938511d + "'", double1 == 0.002842902009938511d);
    }

    @Test
    public void test5960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5960");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.2478513650469938d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.690275465609302d + "'", double1 == 0.690275465609302d);
    }

    @Test
    public void test5961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5961");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9999999999531204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707866438602893d + "'", double1 == 1.5707866438602893d);
    }

    @Test
    public void test5962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5962");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.36787944117144233d, 1.7580423413226773d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.17238199883357147d + "'", double2 == 0.17238199883357147d);
    }

    @Test
    public void test5963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5963");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.4870619039981188d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3855710038440939d) + "'", double1 == (-0.3855710038440939d));
    }

    @Test
    public void test5964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5964");
        double double2 = org.apache.commons.math.util.FastMath.max(0.009528896040185642d, 1.4519004066366517d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4519004066366517d + "'", double2 == 1.4519004066366517d);
    }

    @Test
    public void test5965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5965");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.9867486543660318d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.409520717962681d + "'", double1 == 1.409520717962681d);
    }

    @Test
    public void test5966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5966");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.009240544980284001d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009240544980284001d + "'", double1 == 0.009240544980284001d);
    }

    @Test
    public void test5967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5967");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.1763382298382675d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5968");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 21);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 21L + "'", long1 == 21L);
    }

    @Test
    public void test5969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5969");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.5293379817723d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5293379817723003d + "'", double1 == 1.5293379817723003d);
    }

    @Test
    public void test5970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5970");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.8727557646218309d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.015232461658411594d) + "'", double1 == (-0.015232461658411594d));
    }

    @Test
    public void test5971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5971");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.6251633290015512d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6251633290015514d + "'", double1 == 0.6251633290015514d);
    }

    @Test
    public void test5972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5972");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) 2739L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2739.0f + "'", float2 == 2739.0f);
    }

    @Test
    public void test5973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5973");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9992399462688565d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.999746584542316d + "'", double1 == 0.999746584542316d);
    }

    @Test
    public void test5974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5974");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9562562360485877d, (-0.23313271272363228d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0104824397734113d + "'", double2 == 1.0104824397734113d);
    }

    @Test
    public void test5975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5975");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.5675937536109087d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5976");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.062007555527654586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06397038355532145d + "'", double1 == 0.06397038355532145d);
    }

    @Test
    public void test5977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5977");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.7992447670407303E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0001799406640834d + "'", double1 == 1.0001799406640834d);
    }

    @Test
    public void test5978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5978");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9032560372034026d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.734611107657628d + "'", double1 == 0.734611107657628d);
    }

    @Test
    public void test5979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5979");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9736488930495181d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6475876192871106d + "'", double1 == 1.6475876192871106d);
    }

    @Test
    public void test5980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5980");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-11.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-29937.07084924806d) + "'", double1 == (-29937.07084924806d));
    }

    @Test
    public void test5981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5981");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.22732754379732215d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22929057421233265d + "'", double1 == 0.22929057421233265d);
    }

    @Test
    public void test5982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5982");
        double double1 = org.apache.commons.math.util.FastMath.expm1(9.079986106087252E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.0803983493028E-5d + "'", double1 == 9.0803983493028E-5d);
    }

    @Test
    public void test5983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5983");
        long long1 = org.apache.commons.math.util.FastMath.round(1.0001181575986342d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test5984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5984");
        float float2 = org.apache.commons.math.util.FastMath.max(8.0f, (float) 32);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test5985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5985");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.14782604738794858d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1478260473879486d + "'", double1 == 0.1478260473879486d);
    }

    @Test
    public void test5986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5986");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.8174606429094702d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9569883994962827d + "'", double1 == 0.9569883994962827d);
    }

    @Test
    public void test5987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5987");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.7992447670407303E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5988");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 48);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5989");
        double double2 = org.apache.commons.math.util.FastMath.min(2.837819326205786E-7d, 0.5265885704492409d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.837819326205786E-7d + "'", double2 == 2.837819326205786E-7d);
    }

    @Test
    public void test5990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5990");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.6365522825478771d, 0.14891718150533476d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9349481445117352d + "'", double2 == 0.9349481445117352d);
    }

    @Test
    public void test5991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5991");
        long long2 = org.apache.commons.math.util.FastMath.max(52L, 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test5992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5992");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.06589908747968856d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.997829440810687d + "'", double1 == 0.997829440810687d);
    }

    @Test
    public void test5993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5993");
        double double1 = org.apache.commons.math.util.FastMath.atan((-7.47197233734299E-43d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.47197233734299E-43d) + "'", double1 == (-7.47197233734299E-43d));
    }

    @Test
    public void test5994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5994");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9891013135438892d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6876829354996263d + "'", double1 == 0.6876829354996263d);
    }

    @Test
    public void test5995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5995");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.046257937962002074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.047344526031532254d + "'", double1 == 0.047344526031532254d);
    }

    @Test
    public void test5996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5996");
        double double1 = org.apache.commons.math.util.FastMath.ceil(64.11051679254085d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 65.0d + "'", double1 == 65.0d);
    }

    @Test
    public void test5997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5997");
        double double2 = org.apache.commons.math.util.FastMath.max(0.723945865132188d, 0.41777137910516676d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.723945865132188d + "'", double2 == 0.723945865132188d);
    }

    @Test
    public void test5998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5998");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.306647226228379E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000002307d + "'", double1 == 1.0000000000002307d);
    }

    @Test
    public void test5999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5999");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 100, 7.8962957E13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test6000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test6000");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.4920344106948838d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0563712563028285d + "'", double1 == 1.0563712563028285d);
    }
}

