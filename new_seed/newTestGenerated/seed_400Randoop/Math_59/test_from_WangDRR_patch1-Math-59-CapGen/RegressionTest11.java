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
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.9877651168459853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.257346628641127d + "'", double1 == 1.257346628641127d);
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5502");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(211.03126243924578d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.95363582071512d + "'", double1 == 5.95363582071512d);
    }

    @Test
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5503");
        double double2 = org.apache.commons.math.util.FastMath.min(1.9086404266042183d, (double) 10L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9086404266042183d + "'", double2 == 1.9086404266042183d);
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5504");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.017066003704239316d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5505");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.9086404266042183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03331205968091278d + "'", double1 == 0.03331205968091278d);
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5506");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.5436257195614516d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5507");
        double double1 = org.apache.commons.math.util.FastMath.sin(55.417748437204494d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9048040471927284d) + "'", double1 == (-0.9048040471927284d));
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5508");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(22.24855859029184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3883106012234607d + "'", double1 == 0.3883106012234607d);
    }

    @Test
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5509");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.1016572581144659d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.10130923144299495d) + "'", double1 == (-0.10130923144299495d));
    }

    @Test
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5510");
        double double1 = org.apache.commons.math.util.FastMath.sin(41.32317658130462d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4639704888177957d) + "'", double1 == (-0.4639704888177957d));
    }

    @Test
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5511");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.5496441384595896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6178712608980507d + "'", double1 == 0.6178712608980507d);
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5512");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 57L, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5513");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.12561170478985625d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.11804275992385053d) + "'", double1 == (-0.11804275992385053d));
    }

    @Test
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5514");
        double double1 = org.apache.commons.math.util.FastMath.abs(25.371833863690377d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 25.371833863690377d + "'", double1 == 25.371833863690377d);
    }

    @Test
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5515");
        double double1 = org.apache.commons.math.util.FastMath.log(0.8278831548941552d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.18888325183244756d) + "'", double1 == (-0.18888325183244756d));
    }

    @Test
    public void test5516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5516");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.4046957684235926d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2693470119513588d + "'", double1 == 0.2693470119513588d);
    }

    @Test
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5517");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.366006587752973d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3838041495864976d + "'", double1 == 0.3838041495864976d);
    }

    @Test
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5518");
        double double2 = org.apache.commons.math.util.FastMath.max(3.053086467974937d, (-0.20529357054986405d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.053086467974937d + "'", double2 == 3.053086467974937d);
    }

    @Test
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5519");
        double double2 = org.apache.commons.math.util.FastMath.max(1.4022862643919898d, (-1.4250920813534227d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4022862643919898d + "'", double2 == 1.4022862643919898d);
    }

    @Test
    public void test5520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5520");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.06880551211253791d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5521");
        double double2 = org.apache.commons.math.util.FastMath.min(0.019480545428211527d, 2.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.019480545428211527d + "'", double2 == 0.019480545428211527d);
    }

    @Test
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5522");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.5430806348152446d, 1.1031594239427869d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6136995677025938d + "'", double2 == 1.6136995677025938d);
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5523");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.3075110144264994d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005367079687890197d + "'", double1 == 0.005367079687890197d);
    }

    @Test
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5524");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.1960821131474104d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5525");
        double double1 = org.apache.commons.math.util.FastMath.log(7.006492321624085E-46d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-103.97207708399179d) + "'", double1 == (-103.97207708399179d));
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5526");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.45883090031665263d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5822231267299434d + "'", double1 == 1.5822231267299434d);
    }

    @Test
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5527");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.6899595825111818d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.247615647908567d + "'", double1 == 1.247615647908567d);
    }

    @Test
    public void test5528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5528");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9502314013655482d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.834159538121333d + "'", double1 == 1.834159538121333d);
    }

    @Test
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5529");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.570796326794874d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5530");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.36792187455389946d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.35967715934161504d + "'", double1 == 0.35967715934161504d);
    }

    @Test
    public void test5531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5531");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.5433467420946743d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9958688390596887d + "'", double1 == 0.9958688390596887d);
    }

    @Test
    public void test5532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5532");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.2924316695611777d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3602963995329896d + "'", double1 == 0.3602963995329896d);
    }

    @Test
    public void test5533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5533");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 3, (float) 97L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test5534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5534");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.8449898195469685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6637388971372727d + "'", double1 == 0.6637388971372727d);
    }

    @Test
    public void test5535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5535");
        double double2 = org.apache.commons.math.util.FastMath.max(0.33932123363772365d, 0.9950347615814844d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9950347615814844d + "'", double2 == 0.9950347615814844d);
    }

    @Test
    public void test5536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5536");
        long long1 = org.apache.commons.math.util.FastMath.round(0.03331205968091278d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test5537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5537");
        double double1 = org.apache.commons.math.util.FastMath.log10(35.000000000000014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.544068044350276d + "'", double1 == 1.544068044350276d);
    }

    @Test
    public void test5538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5538");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.7694577750448003d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7694577750448003d + "'", double1 == 0.7694577750448003d);
    }

    @Test
    public void test5539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5539");
        double double1 = org.apache.commons.math.util.FastMath.log(1.388020644993609E19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 44.07699550277557d + "'", double1 == 44.07699550277557d);
    }

    @Test
    public void test5540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5540");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.2840234699668822d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2840234699668822d + "'", double1 == 1.2840234699668822d);
    }

    @Test
    public void test5541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5541");
        double double1 = org.apache.commons.math.util.FastMath.log(148.80597572185025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.00264328101366d + "'", double1 == 5.00264328101366d);
    }

    @Test
    public void test5542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5542");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.8623188722876837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5543");
        double double1 = org.apache.commons.math.util.FastMath.log(14.206130012655933d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.653673562487557d + "'", double1 == 2.653673562487557d);
    }

    @Test
    public void test5544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5544");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.006589358495248128d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1500600133633896E-4d + "'", double1 == 1.1500600133633896E-4d);
    }

    @Test
    public void test5545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5545");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.6997678580926362d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6524763776513632d) + "'", double1 == (-0.6524763776513632d));
    }

    @Test
    public void test5546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5546");
        double double2 = org.apache.commons.math.util.FastMath.max(0.3533464791127893d, 0.5013507798060325d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5013507798060325d + "'", double2 == 0.5013507798060325d);
    }

    @Test
    public void test5547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5547");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.2204460492503128E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4901161193847655E-8d + "'", double1 == 1.4901161193847655E-8d);
    }

    @Test
    public void test5548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5548");
        long long1 = org.apache.commons.math.util.FastMath.round(177.4022424239215d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 177L + "'", long1 == 177L);
    }

    @Test
    public void test5549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5549");
        double double2 = org.apache.commons.math.util.FastMath.max(0.10355008054994842d, 2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.718281828459045d + "'", double2 == 2.718281828459045d);
    }

    @Test
    public void test5550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5550");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2155615773557597L, (float) (-2));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.15561577E15f + "'", float2 == 2.15561577E15f);
    }

    @Test
    public void test5551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5551");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 32L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 32.0f + "'", float1 == 32.0f);
    }

    @Test
    public void test5552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5552");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.3436757763329488d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5553");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.7813863964118539d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5554");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9920794825112482d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7582476248074259d + "'", double1 == 0.7582476248074259d);
    }

    @Test
    public void test5555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5555");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5556");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.898094405353414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.898094405353414d + "'", double1 == 0.898094405353414d);
    }

    @Test
    public void test5557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5557");
        int int2 = org.apache.commons.math.util.FastMath.max((-53), (-53));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-53) + "'", int2 == (-53));
    }

    @Test
    public void test5558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5558");
        double double2 = org.apache.commons.math.util.FastMath.atan2(3.948147847987201E13d, 1.4981820211860783d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948586d + "'", double2 == 1.5707963267948586d);
    }

    @Test
    public void test5559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5559");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.2129005211903137d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5560");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.7237289657353609d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5561");
        double double1 = org.apache.commons.math.util.FastMath.ulp(3.399216241149525E248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9680578953622686E232d + "'", double1 == 4.9680578953622686E232d);
    }

    @Test
    public void test5562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5562");
        double double1 = org.apache.commons.math.util.FastMath.log10((-1.5513229058370135d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5563");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.3194821852228826d, 2.311329466289671d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7871586993733534d + "'", double2 == 0.7871586993733534d);
    }

    @Test
    public void test5564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5564");
        double double1 = org.apache.commons.math.util.FastMath.sin((-1.0112343375115525d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8474876949788251d) + "'", double1 == (-0.8474876949788251d));
    }

    @Test
    public void test5565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5565");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 84677176, 53.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 53.0f + "'", float2 == 53.0f);
    }

    @Test
    public void test5566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5566");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) 36L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.750470905699148d + "'", double1 == 7.750470905699148d);
    }

    @Test
    public void test5567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5567");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.008838092816159753d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.008877380414733809d) + "'", double1 == (-0.008877380414733809d));
    }

    @Test
    public void test5568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5568");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7615941559557649d) + "'", double1 == (-0.7615941559557649d));
    }

    @Test
    public void test5569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5569");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.165739117215784d, 1.070843830251405d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.28760883528134d + "'", double2 == 2.28760883528134d);
    }

    @Test
    public void test5570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5570");
        double double1 = org.apache.commons.math.util.FastMath.log1p(10.523809523809524d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4444152884332633d + "'", double1 == 2.4444152884332633d);
    }

    @Test
    public void test5571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5571");
        long long1 = org.apache.commons.math.util.FastMath.round(3.9512437185814275d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void test5572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5572");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.1578212823495775d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5573");
        double double2 = org.apache.commons.math.util.FastMath.min(6940436.902830199d, 0.6314731842513477d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6314731842513477d + "'", double2 == 0.6314731842513477d);
    }

    @Test
    public void test5574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5574");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9335905118403581d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0752430593754188d + "'", double1 == 1.0752430593754188d);
    }

    @Test
    public void test5575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5575");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) 84677176);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5576");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.3964729204944982d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.41945704196093253d + "'", double1 == 0.41945704196093253d);
    }

    @Test
    public void test5577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5577");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) 3.9481478E13f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9481478479872E13d + "'", double1 == 3.9481478479872E13d);
    }

    @Test
    public void test5578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5578");
        double double2 = org.apache.commons.math.util.FastMath.min(1.032743650897659d, 1.0416256328162727d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.032743650897659d + "'", double2 == 1.032743650897659d);
    }

    @Test
    public void test5579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5579");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.5358403285876145d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0052936202137148d + "'", double1 == 1.0052936202137148d);
    }

    @Test
    public void test5580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5580");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-2L), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5581");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(5.691758600279624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 326.1137458033114d + "'", double1 == 326.1137458033114d);
    }

    @Test
    public void test5582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5582");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.5169658075432558d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8025780413000834d + "'", double1 == 0.8025780413000834d);
    }

    @Test
    public void test5583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5583");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.03172806744895933d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03173339100057807d + "'", double1 == 0.03173339100057807d);
    }

    @Test
    public void test5584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5584");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9589242746631385d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7644327246520519d + "'", double1 == 0.7644327246520519d);
    }

    @Test
    public void test5585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5585");
        double double2 = org.apache.commons.math.util.FastMath.min(1.225051084162106d, 0.005289834638583393d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.005289834638583393d + "'", double2 == 0.005289834638583393d);
    }

    @Test
    public void test5586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5586");
        double double1 = org.apache.commons.math.util.FastMath.log(2.71828182845905d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000018d + "'", double1 == 1.0000000000000018d);
    }

    @Test
    public void test5587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5587");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(3.336822260414053d, 0.8829472498848988d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.3368222604140527d + "'", double2 == 3.3368222604140527d);
    }

    @Test
    public void test5588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5588");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.876278270531895d, 5.298292365610485d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8762782705318957d + "'", double2 == 2.8762782705318957d);
    }

    @Test
    public void test5589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5589");
        float float2 = org.apache.commons.math.util.FastMath.max((-2.0f), 11013.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11013.0f + "'", float2 == 11013.0f);
    }

    @Test
    public void test5590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5590");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.00421791656147471d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2416688173108333d + "'", double1 == 0.2416688173108333d);
    }

    @Test
    public void test5591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5591");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.006396965815520881d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.006396878560551169d + "'", double1 == 0.006396878560551169d);
    }

    @Test
    public void test5592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5592");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 0, (float) 2147483647);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5593");
        double double2 = org.apache.commons.math.util.FastMath.min(83.31473763748508d, 55.417748437204494d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 55.417748437204494d + "'", double2 == 55.417748437204494d);
    }

    @Test
    public void test5594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5594");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.921688867296064d, 7.225973768125749E86d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.275522022182941E-87d + "'", double2 == 1.275522022182941E-87d);
    }

    @Test
    public void test5595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5595");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.5135318290179205d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.202245961704393d + "'", double1 == 1.202245961704393d);
    }

    @Test
    public void test5596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5596");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 10L, (float) 2);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test5597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5597");
        double double1 = org.apache.commons.math.util.FastMath.tanh(51.30685281944005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5598");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.9534903170187385d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1046784232036018d) + "'", double1 == (-1.1046784232036018d));
    }

    @Test
    public void test5599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5599");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.3268153559855746d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5600");
        double double1 = org.apache.commons.math.util.FastMath.log(0.6076102029351266d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.49822171621071226d) + "'", double1 == (-0.49822171621071226d));
    }

    @Test
    public void test5601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5601");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.45158270528945427d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948957d + "'", double1 == 1.5707963267948957d);
    }

    @Test
    public void test5602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5602");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.5896069690147183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8385343721841685d + "'", double1 == 0.8385343721841685d);
    }

    @Test
    public void test5603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5603");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.5308456639204424d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.425820304226698d + "'", double1 == 0.425820304226698d);
    }

    @Test
    public void test5604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5604");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.2422079676186446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8930029987985794d + "'", double1 == 0.8930029987985794d);
    }

    @Test
    public void test5605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5605");
        float float2 = org.apache.commons.math.util.FastMath.min(5.0f, 97.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test5606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5606");
        double double2 = org.apache.commons.math.util.FastMath.min(0.4963334177617679d, 1.58601345231343E15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4963334177617679d + "'", double2 == 0.4963334177617679d);
    }

    @Test
    public void test5607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5607");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test5608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5608");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 11013, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11013L + "'", long2 == 11013L);
    }

    @Test
    public void test5609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5609");
        double double1 = org.apache.commons.math.util.FastMath.atanh(4.303190128915376d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5610");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(71.82861785000694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4115.476651063446d + "'", double1 == 4115.476651063446d);
    }

    @Test
    public void test5611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5611");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9154319198454343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5612");
        double double1 = org.apache.commons.math.util.FastMath.log(0.021139823109367732d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.856596666154631d) + "'", double1 == (-3.856596666154631d));
    }

    @Test
    public void test5613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5613");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.008837862706915424d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000039054162815d + "'", double1 == 1.000039054162815d);
    }

    @Test
    public void test5614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5614");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9221885224184981d, (-2.9999999999999996d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2750900651789134d + "'", double2 == 1.2750900651789134d);
    }

    @Test
    public void test5615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5615");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 1.7360015312242658d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test5616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5616");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9890316117253547d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5617");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8849970445005177d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8849970445005177d + "'", double1 == 0.8849970445005177d);
    }

    @Test
    public void test5618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5618");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.518508514962757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9787975827310413d + "'", double1 == 0.9787975827310413d);
    }

    @Test
    public void test5619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5619");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.2600854338811875d, 0.6345784979980641d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4254467485274722d + "'", double2 == 0.4254467485274722d);
    }

    @Test
    public void test5620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5620");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9532533939390466d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 54.61739627922902d + "'", double1 == 54.61739627922902d);
    }

    @Test
    public void test5621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5621");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.0148369064941645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7927618553535746d + "'", double1 == 0.7927618553535746d);
    }

    @Test
    public void test5622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5622");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.4046957684235926d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.532078310963095d + "'", double1 == 0.532078310963095d);
    }

    @Test
    public void test5623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5623");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9334810208242135d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7322127377455098d + "'", double1 == 0.7322127377455098d);
    }

    @Test
    public void test5624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5624");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) 32L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.0d + "'", double1 == 32.0d);
    }

    @Test
    public void test5625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5625");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 1477896);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1477896.0f + "'", float1 == 1477896.0f);
    }

    @Test
    public void test5626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5626");
        double double1 = org.apache.commons.math.util.FastMath.acos((-86.33580274416313d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5627");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.8025780413000834d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.231285867083744d + "'", double1 == 2.231285867083744d);
    }

    @Test
    public void test5628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5628");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9550315978940166d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5629");
        int int1 = org.apache.commons.math.util.FastMath.round(1765.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1765 + "'", int1 == 1765);
    }

    @Test
    public void test5630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5630");
        double double2 = org.apache.commons.math.util.FastMath.max(1.5707963267948823d, (-0.49822171621071226d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948823d + "'", double2 == 1.5707963267948823d);
    }

    @Test
    public void test5631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5631");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 0, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test5632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5632");
        double double2 = org.apache.commons.math.util.FastMath.max((-6.0d), 1764.9013237338472d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1764.9013237338472d + "'", double2 == 1764.9013237338472d);
    }

    @Test
    public void test5633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5633");
        long long1 = org.apache.commons.math.util.FastMath.round(0.3665191429188092d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test5634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5634");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5635");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.24939471654360185d, (-0.6912431464778742d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.795336476291213d + "'", double2 == 2.795336476291213d);
    }

    @Test
    public void test5636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5636");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.4022862643919898d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8693442561779453d + "'", double1 == 0.8693442561779453d);
    }

    @Test
    public void test5637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5637");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.172026904626868E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6370646542663131d + "'", double1 == 0.6370646542663131d);
    }

    @Test
    public void test5638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5638");
        double double2 = org.apache.commons.math.util.FastMath.max(0.7615560214388488d, (-1.3270448216204103d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7615560214388488d + "'", double2 == 0.7615560214388488d);
    }

    @Test
    public void test5639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5639");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.8743692948528521d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5640");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.77013924210893d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6562661263264857d + "'", double1 == 0.6562661263264857d);
    }

    @Test
    public void test5641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5641");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.4968107275536122d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4674185113191265d + "'", double1 == 3.4674185113191265d);
    }

    @Test
    public void test5642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5642");
        double double2 = org.apache.commons.math.util.FastMath.min(0.5534669114595383d, 0.9751009553485449d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5534669114595383d + "'", double2 == 0.5534669114595383d);
    }

    @Test
    public void test5643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5643");
        double double1 = org.apache.commons.math.util.FastMath.cosh(3.302190676759448d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.604450755278267d + "'", double1 == 13.604450755278267d);
    }

    @Test
    public void test5644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5644");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.0247930161489514d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5645");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(25.947493590387875d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1486.6818716719804d + "'", double1 == 1486.6818716719804d);
    }

    @Test
    public void test5646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5646");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.451512686597342d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4374287296357211d + "'", double1 == 0.4374287296357211d);
    }

    @Test
    public void test5647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5647");
        double double1 = org.apache.commons.math.util.FastMath.tanh(9.205077044643586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999797883551d + "'", double1 == 0.9999999797883551d);
    }

    @Test
    public void test5648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5648");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 100, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test5649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5649");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.6783632786807827d, 0.6033293179688031d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3667223555286947d + "'", double2 == 1.3667223555286947d);
    }

    @Test
    public void test5650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5650");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.9171523356672744d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5651");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 57L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5652");
        int int2 = org.apache.commons.math.util.FastMath.min(149, (-53));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-53) + "'", int2 == (-53));
    }

    @Test
    public void test5653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5653");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(5558.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5557.999999999999d + "'", double2 == 5557.999999999999d);
    }

    @Test
    public void test5654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5654");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.5515679276951895d, (-3.6686019672148054d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5515679276951893d + "'", double2 == 1.5515679276951893d);
    }

    @Test
    public void test5655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5655");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.4670602929020586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.136272913940844d + "'", double1 == 1.136272913940844d);
    }

    @Test
    public void test5656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5656");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 3L, (float) 11013);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11013.0f + "'", float2 == 11013.0f);
    }

    @Test
    public void test5657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5657");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.605170185988092d + "'", double1 == 4.605170185988092d);
    }

    @Test
    public void test5658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5658");
        long long2 = org.apache.commons.math.util.FastMath.min((long) ' ', (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test5659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5659");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.0057916796039132d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017554376398252185d + "'", double1 == 0.017554376398252185d);
    }

    @Test
    public void test5660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5660");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.24376859510303997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24376859510303997d + "'", double1 == 0.24376859510303997d);
    }

    @Test
    public void test5661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5661");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9995920864606948d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.272407788873885d + "'", double1 == 57.272407788873885d);
    }

    @Test
    public void test5662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5662");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.3673722261798014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3673722261798014d + "'", double1 == 1.3673722261798014d);
    }

    @Test
    public void test5663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5663");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.1888843883246802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8302325533825592d + "'", double1 == 0.8302325533825592d);
    }

    @Test
    public void test5664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5664");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.7010302935299408d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5665");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.868551121099462d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5666");
        long long1 = org.apache.commons.math.util.FastMath.round(0.8468841612020394d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test5667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5667");
        double double1 = org.apache.commons.math.util.FastMath.asinh(4.342944819032518d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1746985433466213d + "'", double1 == 2.1746985433466213d);
    }

    @Test
    public void test5668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5668");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 1, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test5669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5669");
        double double2 = org.apache.commons.math.util.FastMath.pow(13.890441852638668d, 0.3598056382824036d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5772448569076185d + "'", double2 == 2.5772448569076185d);
    }

    @Test
    public void test5670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5670");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.0000000000035623d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430806348194301d + "'", double1 == 1.5430806348194301d);
    }

    @Test
    public void test5671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5671");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 57, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test5672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5672");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-2.251799813685243E15d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.251799813685243E15d) + "'", double1 == (-2.251799813685243E15d));
    }

    @Test
    public void test5673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5673");
        long long2 = org.apache.commons.math.util.FastMath.min(9223372036854775807L, (long) 36);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 36L + "'", long2 == 36L);
    }

    @Test
    public void test5674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5674");
        long long2 = org.apache.commons.math.util.FastMath.min(1477896L, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test5675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5675");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.321264196906668d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7313698703983779d + "'", double1 == 0.7313698703983779d);
    }

    @Test
    public void test5676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5676");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(6.938893903907228E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.93889390390723E-18d + "'", double1 == 6.93889390390723E-18d);
    }

    @Test
    public void test5677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5677");
        double double1 = org.apache.commons.math.util.FastMath.log1p(4.6755933871952235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7361751195215849d + "'", double1 == 1.7361751195215849d);
    }

    @Test
    public void test5678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5678");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.5157707046119766d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8699128649852743d + "'", double1 == 0.8699128649852743d);
    }

    @Test
    public void test5679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5679");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.6931221821223308d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8305986322716694d + "'", double1 == 0.8305986322716694d);
    }

    @Test
    public void test5680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5680");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.415289655969459d, 3.4460977834217053d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.41528965596945905d + "'", double2 == 0.41528965596945905d);
    }

    @Test
    public void test5681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5681");
        double double2 = org.apache.commons.math.util.FastMath.min(0.004407855229809197d, 21.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.004407855229809197d + "'", double2 == 0.004407855229809197d);
    }

    @Test
    public void test5682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5682");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9428090415820634d, 0.8943859157098326d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8117491596404741d + "'", double2 == 0.8117491596404741d);
    }

    @Test
    public void test5683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5683");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9672221742711605d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5684");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.642821405345039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test5685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5685");
        int int2 = org.apache.commons.math.util.FastMath.min(1765, 1477896);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1765 + "'", int2 == 1765);
    }

    @Test
    public void test5686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5686");
        float float2 = org.apache.commons.math.util.FastMath.max((-2.0f), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5687");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 100, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test5688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5688");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 1586013452313419L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5689");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.138692313968385d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.185260748899299d + "'", double1 == 4.185260748899299d);
    }

    @Test
    public void test5690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5690");
        double double1 = org.apache.commons.math.util.FastMath.log10(32.67707152554634d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5142431287268614d + "'", double1 == 1.5142431287268614d);
    }

    @Test
    public void test5691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5691");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1752011936438014d + "'", double1 == 1.1752011936438014d);
    }

    @Test
    public void test5692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5692");
        double double2 = org.apache.commons.math.util.FastMath.min(0.989253146137494d, 0.30120026204161976d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.30120026204161976d + "'", double2 == 0.30120026204161976d);
    }

    @Test
    public void test5693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5693");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.6912431464778742d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5694");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.6945919658329778d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8567742816220214d + "'", double1 == 0.8567742816220214d);
    }

    @Test
    public void test5695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5695");
        double double1 = org.apache.commons.math.util.FastMath.atan(6.802168607459072E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test5696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5696");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.339637404328899d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.10238901681014d + "'", double1 == 1.10238901681014d);
    }

    @Test
    public void test5697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5697");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.0028916589561971d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0009629587315665d + "'", double1 == 1.0009629587315665d);
    }

    @Test
    public void test5698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5698");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.1034722043308d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1034722043308d + "'", double1 == 2.1034722043308d);
    }

    @Test
    public void test5699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5699");
        int int2 = org.apache.commons.math.util.FastMath.max((-2), 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test5700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5700");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.8735346502596505d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7666033939388069d + "'", double1 == 0.7666033939388069d);
    }

    @Test
    public void test5701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5701");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9187506059390845d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6516742481521918d + "'", double1 == 0.6516742481521918d);
    }

    @Test
    public void test5702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5702");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.07407874621034372d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5703");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.09952800231331152d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9950511755835721d + "'", double1 == 0.9950511755835721d);
    }

    @Test
    public void test5704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5704");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.1891662365896636d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.189166236589664d + "'", double1 == 2.189166236589664d);
    }

    @Test
    public void test5705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5705");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(3.3480571885407375d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.829769709154881d + "'", double1 == 1.829769709154881d);
    }

    @Test
    public void test5706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5706");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.915169171319882d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.649805958845672d + "'", double1 == 0.649805958845672d);
    }

    @Test
    public void test5707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5707");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-34.768015146316124d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5708");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.3815982947372531d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36409469054975907d + "'", double1 == 0.36409469054975907d);
    }

    @Test
    public void test5709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5709");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.385849999980594d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9982229502979694d + "'", double1 == 2.9982229502979694d);
    }

    @Test
    public void test5710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5710");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.0516871176602036d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.810585330955391d + "'", double1 == 0.810585330955391d);
    }

    @Test
    public void test5711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5711");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.8378680586068442d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3720328826546837d + "'", double1 == 1.3720328826546837d);
    }

    @Test
    public void test5712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5712");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1477896, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1477896.0f + "'", float2 == 1477896.0f);
    }

    @Test
    public void test5713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5713");
        double double2 = org.apache.commons.math.util.FastMath.min(0.3156563365585749d, 0.5395250166930861d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3156563365585749d + "'", double2 == 0.3156563365585749d);
    }

    @Test
    public void test5714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5714");
        int int1 = org.apache.commons.math.util.FastMath.abs(1765);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1765 + "'", int1 == 1765);
    }

    @Test
    public void test5715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5715");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.4210854715202007E-14d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5716");
        double double2 = org.apache.commons.math.util.FastMath.min(0.09917726107940236d, 83.31473763748508d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.09917726107940236d + "'", double2 == 0.09917726107940236d);
    }

    @Test
    public void test5717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5717");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-1.224646799147353E-16d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.224646799147353E-16d) + "'", double1 == (-1.224646799147353E-16d));
    }

    @Test
    public void test5718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5718");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.35217266165947814d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.006146572481469891d + "'", double1 == 0.006146572481469891d);
    }

    @Test
    public void test5719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5719");
        double double1 = org.apache.commons.math.util.FastMath.acosh(9.044524487391685E157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5720");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.6658993515826358d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8732451803351362d) + "'", double1 == (-0.8732451803351362d));
    }

    @Test
    public void test5721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5721");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(32.677071525546346d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1970373466578175d + "'", double1 == 3.1970373466578175d);
    }

    @Test
    public void test5722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5722");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-2.978724151380226E-4d), 0.6384917413123372d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.9787241513802256E-4d) + "'", double2 == (-2.9787241513802256E-4d));
    }

    @Test
    public void test5723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5723");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.2472279286356684d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03922152639746458d + "'", double1 == 0.03922152639746458d);
    }

    @Test
    public void test5724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5724");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.7252048345581926d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6632887472990315d + "'", double1 == 0.6632887472990315d);
    }

    @Test
    public void test5725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5725");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 3, 1765L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test5726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5726");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.897071434257196d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test5727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5727");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.0659610283405505d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.48366329117393175d + "'", double1 == 0.48366329117393175d);
    }

    @Test
    public void test5728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5728");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.5534669114595383d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5865211107924442d + "'", double1 == 0.5865211107924442d);
    }

    @Test
    public void test5729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5729");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.6783632786807827d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5730");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) 3);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5731");
        double double1 = org.apache.commons.math.util.FastMath.rint((-1.9805560385583565d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test5732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5732");
        int int2 = org.apache.commons.math.util.FastMath.min(1477896, 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
    }

    @Test
    public void test5733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5733");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.8210318612260353d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test5734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5734");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, (long) 5);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5735");
        double double1 = org.apache.commons.math.util.FastMath.rint(57.272407788873885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.0d + "'", double1 == 57.0d);
    }

    @Test
    public void test5736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5736");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 32, 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test5737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5737");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, 1765L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5738");
        double double1 = org.apache.commons.math.util.FastMath.acos(191.82954647182038d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5739");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9971678302955945d, 1.8544631004594128d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9947542017287134d + "'", double2 == 0.9947542017287134d);
    }

    @Test
    public void test5740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5740");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.7783917333079962d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3185552697980565d + "'", double1 == 1.3185552697980565d);
    }

    @Test
    public void test5741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5741");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.011697165240742895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0117658446014577d + "'", double1 == 1.0117658446014577d);
    }

    @Test
    public void test5742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5742");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.4967005954324934d, 1.04675969811694d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.49670059543249345d + "'", double2 == 0.49670059543249345d);
    }

    @Test
    public void test5743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5743");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.0589027237910782d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.024856065432143828d + "'", double1 == 0.024856065432143828d);
    }

    @Test
    public void test5744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5744");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) -1, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5745");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.3565686652647782d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8828470691743546d + "'", double1 == 2.8828470691743546d);
    }

    @Test
    public void test5746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5746");
        double double1 = org.apache.commons.math.util.FastMath.atan(200.00499987500626d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.565796493451564d + "'", double1 == 1.565796493451564d);
    }

    @Test
    public void test5747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5747");
        double double1 = org.apache.commons.math.util.FastMath.sin(6.766375983153399E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.766375983152882E-7d + "'", double1 == 6.766375983152882E-7d);
    }

    @Test
    public void test5748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5748");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-1.8688562153383976d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test5749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5749");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.4251053392695819d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.45390709349018515d + "'", double1 == 0.45390709349018515d);
    }

    @Test
    public void test5750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5750");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 35, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test5751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5751");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.42128462825823654d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5752");
        double double2 = org.apache.commons.math.util.FastMath.min(0.05723320573453925d, 11013.999999999998d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.05723320573453925d + "'", double2 == 0.05723320573453925d);
    }

    @Test
    public void test5753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5753");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) -1, (float) ' ');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test5754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5754");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.5494213976540494d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5755");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(13.604450755278267d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2374424586050351d + "'", double1 == 0.2374424586050351d);
    }

    @Test
    public void test5756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5756");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.622003184662269d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test5757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5757");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.604331810789432d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.386755364831908d + "'", double1 == 2.386755364831908d);
    }

    @Test
    public void test5758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5758");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9746955125367257d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.02563015159260395d) + "'", double1 == (-0.02563015159260395d));
    }

    @Test
    public void test5759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5759");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.41285127790450793d, 1.4657022738769552d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.412851277904508d + "'", double2 == 0.412851277904508d);
    }

    @Test
    public void test5760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5760");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) ' ');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 32L + "'", long1 == 32L);
    }

    @Test
    public void test5761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5761");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.11002669683705266d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.304065362528521d + "'", double1 == 6.304065362528521d);
    }

    @Test
    public void test5762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5762");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.053286411214247056d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5763");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1, (float) 52L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test5764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5764");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.7103669532614669d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5765");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.0000000000000007d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6500241495929224E-8d + "'", double1 == 3.6500241495929224E-8d);
    }

    @Test
    public void test5766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5766");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9999391764340757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.543009157742242d + "'", double1 == 1.543009157742242d);
    }

    @Test
    public void test5767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5767");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.7207960780149949d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0560693509174d + "'", double1 == 2.0560693509174d);
    }

    @Test
    public void test5768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5768");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.4255072156514325d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.438464090854896d + "'", double1 == 0.438464090854896d);
    }

    @Test
    public void test5769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5769");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.0589027237910782d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0589027237910784d + "'", double1 == 1.0589027237910784d);
    }

    @Test
    public void test5770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5770");
        float float1 = org.apache.commons.math.util.FastMath.abs(1477896.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1477896.0f + "'", float1 == 1477896.0f);
    }

    @Test
    public void test5771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5771");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.3440585709080678E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6919903846336738d + "'", double1 == 0.6919903846336738d);
    }

    @Test
    public void test5772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5772");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.4844415983612418d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9022968215006064d + "'", double1 == 0.9022968215006064d);
    }

    @Test
    public void test5773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5773");
        float float2 = org.apache.commons.math.util.FastMath.max(32.0f, 53.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 53.0f + "'", float2 == 53.0f);
    }

    @Test
    public void test5774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5774");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.03422749178784308d), (-0.25457675705027805d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.03422749178784308d) + "'", double2 == (-0.03422749178784308d));
    }

    @Test
    public void test5775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5775");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.3855582187341452d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36752470416626126d + "'", double1 == 0.36752470416626126d);
    }

    @Test
    public void test5776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5776");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.344058570908106E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5777");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.47762949725975296d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5199086400816771d) + "'", double1 == (-0.5199086400816771d));
    }

    @Test
    public void test5778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5778");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.7068886140376748d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 40.50173417021096d + "'", double1 == 40.50173417021096d);
    }

    @Test
    public void test5779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5779");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 57L, 149.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test5780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5780");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8982277679825335d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0239785748481378d + "'", double1 == 1.0239785748481378d);
    }

    @Test
    public void test5781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5781");
        double double2 = org.apache.commons.math.util.FastMath.min(0.8029990530558212d, 1.3023186765274486d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8029990530558212d + "'", double2 == 0.8029990530558212d);
    }

    @Test
    public void test5782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5782");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.36208966808181453d), 0.4252373880711206d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.36208966808181453d) + "'", double2 == (-0.36208966808181453d));
    }

    @Test
    public void test5783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5783");
        long long1 = org.apache.commons.math.util.FastMath.round((double) 4L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void test5784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5784");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 32L, 1.58601345E15f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.58601345E15f + "'", float2 == 1.58601345E15f);
    }

    @Test
    public void test5785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5785");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.03173339100057807d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9994965381991057d + "'", double1 == 0.9994965381991057d);
    }

    @Test
    public void test5786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5786");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.8657694832396586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6480542736638853d + "'", double1 == 0.6480542736638853d);
    }

    @Test
    public void test5787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5787");
        double double1 = org.apache.commons.math.util.FastMath.sin((-4.2063149707507666E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.2063148467129494E-4d) + "'", double1 == (-4.2063148467129494E-4d));
    }

    @Test
    public void test5788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5788");
        long long2 = org.apache.commons.math.util.FastMath.min(11013L, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5789");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.9991396955517629d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6318039343316998d) + "'", double1 == (-0.6318039343316998d));
    }

    @Test
    public void test5790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5790");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.302190676759448d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5188021469018157d + "'", double1 == 0.5188021469018157d);
    }

    @Test
    public void test5791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5791");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.18888325183244756d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0032966346463498227d) + "'", double1 == (-0.0032966346463498227d));
    }

    @Test
    public void test5792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5792");
        double double1 = org.apache.commons.math.util.FastMath.rint(5.656854249492381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.0d + "'", double1 == 6.0d);
    }

    @Test
    public void test5793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5793");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.8081843818082921d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9410626486988213d + "'", double1 == 0.9410626486988213d);
    }

    @Test
    public void test5794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5794");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.0037614443570399263d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.564958866090787E-5d + "'", double1 == 6.564958866090787E-5d);
    }

    @Test
    public void test5795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5795");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.7944146264030465d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7007025229427569d + "'", double1 == 0.7007025229427569d);
    }

    @Test
    public void test5796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5796");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7644327246520519d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8701609696899034d + "'", double1 == 0.8701609696899034d);
    }

    @Test
    public void test5797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5797");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.3023186765274486d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9159616970850739d + "'", double1 == 0.9159616970850739d);
    }

    @Test
    public void test5798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5798");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.3852968325547366d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5799");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.4067132730318201d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14820558525994956d + "'", double1 == 0.14820558525994956d);
    }

    @Test
    public void test5800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5800");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.0062617651050046646d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0062814109405827d + "'", double1 == 1.0062814109405827d);
    }

    @Test
    public void test5801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5801");
        double double2 = org.apache.commons.math.util.FastMath.atan2(8.467717600000001E7d, 1.3732849892136236d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963105770082d + "'", double2 == 1.5707963105770082d);
    }

    @Test
    public void test5802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5802");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(17.986111111111118d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.31391685851842466d + "'", double1 == 0.31391685851842466d);
    }

    @Test
    public void test5803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5803");
        float float2 = org.apache.commons.math.util.FastMath.min((-53.0f), (float) 35L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-53.0f) + "'", float2 == (-53.0f));
    }

    @Test
    public void test5804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5804");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.09254025572625442d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5805");
        double double2 = org.apache.commons.math.util.FastMath.max(7.781171137477771d, 1.253350360695029d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.781171137477771d + "'", double2 == 7.781171137477771d);
    }

    @Test
    public void test5806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5806");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.9039295044086462d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7857634747826419d) + "'", double1 == (-0.7857634747826419d));
    }

    @Test
    public void test5807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5807");
        double double1 = org.apache.commons.math.util.FastMath.log10((-1.1623266059131168d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5808");
        double double1 = org.apache.commons.math.util.FastMath.exp(4.9680578953622686E232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5809");
        double double1 = org.apache.commons.math.util.FastMath.signum(99.30685281944007d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5810");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.552713678800501E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.552713678800501E-15d + "'", double1 == 3.552713678800501E-15d);
    }

    @Test
    public void test5811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5811");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 57, (float) 35L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test5812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5812");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.7813863964118538d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5773919355274273d + "'", double1 == 0.5773919355274273d);
    }

    @Test
    public void test5813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5813");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.7211038773899042d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7510773914034626d + "'", double1 == 0.7510773914034626d);
    }

    @Test
    public void test5814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5814");
        long long2 = org.apache.commons.math.util.FastMath.min(2155615773557597L, 57L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 57L + "'", long2 == 57L);
    }

    @Test
    public void test5815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5815");
        float float2 = org.apache.commons.math.util.FastMath.min(3.0f, 8.4677176E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test5816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5816");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.7056364288847234d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7056364288847234d + "'", double1 == 0.7056364288847234d);
    }

    @Test
    public void test5817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5817");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.01329006421049858d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01329045544200573d + "'", double1 == 0.01329045544200573d);
    }

    @Test
    public void test5818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5818");
        double double1 = org.apache.commons.math.util.FastMath.atan(Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test5819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5819");
        long long1 = org.apache.commons.math.util.FastMath.round(0.45153245172720313d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test5820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5820");
        double double1 = org.apache.commons.math.util.FastMath.signum(3.7621956910836314d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5821");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 149L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 149 + "'", int1 == 149);
    }

    @Test
    public void test5822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5822");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 10, (float) 32L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test5823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5823");
        double double1 = org.apache.commons.math.util.FastMath.ceil(9.044524487391685E157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.044524487391685E157d + "'", double1 == 9.044524487391685E157d);
    }

    @Test
    public void test5824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5824");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.6842868307608122d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5825");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.2378644027129615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2378644027129617d + "'", double1 == 1.2378644027129617d);
    }

    @Test
    public void test5826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5826");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.2339641205849246d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test5827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5827");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-1.6112949659561453d), (-0.8732451803351362d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.611294965956145d) + "'", double2 == (-1.611294965956145d));
    }

    @Test
    public void test5828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5828");
        float float2 = org.apache.commons.math.util.FastMath.min(2.0f, (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test5829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5829");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.5026209698040973d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.008772390812648497d + "'", double1 == 0.008772390812648497d);
    }

    @Test
    public void test5830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5830");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.8316959613139696d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.24446805942027d + "'", double1 == 6.24446805942027d);
    }

    @Test
    public void test5831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5831");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.4639704888177957d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.008097812661958068d) + "'", double1 == (-0.008097812661958068d));
    }

    @Test
    public void test5832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5832");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 57, 1477896L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 57L + "'", long2 == 57L);
    }

    @Test
    public void test5833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5833");
        double double1 = org.apache.commons.math.util.FastMath.log10(4.276473161941219d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6310857508518927d + "'", double1 == 0.6310857508518927d);
    }

    @Test
    public void test5834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5834");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.3559037465428121d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9373319723561925d + "'", double1 == 0.9373319723561925d);
    }

    @Test
    public void test5835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5835");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430806348152437d + "'", double1 == 1.5430806348152437d);
    }

    @Test
    public void test5836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5836");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.0001545365584956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7187019348378976d + "'", double1 == 2.7187019348378976d);
    }

    @Test
    public void test5837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5837");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.5433467420946743d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.233281390813767d + "'", double1 == 2.233281390813767d);
    }

    @Test
    public void test5838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5838");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.17453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5839");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.8828470691743546d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8828470691743546d + "'", double1 == 2.8828470691743546d);
    }

    @Test
    public void test5840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5840");
        double double2 = org.apache.commons.math.util.FastMath.max(0.6105647004975027d, 0.28495825391099355d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6105647004975027d + "'", double2 == 0.6105647004975027d);
    }

    @Test
    public void test5841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5841");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9975366607028198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test5842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5842");
        long long2 = org.apache.commons.math.util.FastMath.min(36L, (long) 57);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 36L + "'", long2 == 36L);
    }

    @Test
    public void test5843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5843");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.8292136654695167d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9394827641334688d) + "'", double1 == (-0.9394827641334688d));
    }

    @Test
    public void test5844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5844");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.08804632163486688d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08804632163486688d + "'", double1 == 0.08804632163486688d);
    }

    @Test
    public void test5845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5845");
        long long1 = org.apache.commons.math.util.FastMath.abs((-53L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 53L + "'", long1 == 53L);
    }

    @Test
    public void test5846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5846");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.8950377376269645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.71387305951421d + "'", double1 == 0.71387305951421d);
    }

    @Test
    public void test5847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5847");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.1395513111913864E-6d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5848");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.8686709614860094d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4195087221622031d + "'", double1 == 0.4195087221622031d);
    }

    @Test
    public void test5849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5849");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.17230617170547372d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.15827857757091723d) + "'", double1 == (-0.15827857757091723d));
    }

    @Test
    public void test5850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5850");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9999092042625951d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8414219241931941d + "'", double1 == 0.8414219241931941d);
    }

    @Test
    public void test5851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5851");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.007812579475042568d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3635523491322297E-4d + "'", double1 == 1.3635523491322297E-4d);
    }

    @Test
    public void test5852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5852");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-36), (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test5853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5853");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.006589358495248128d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.37754243147639266d + "'", double1 == 0.37754243147639266d);
    }

    @Test
    public void test5854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5854");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.7927618553535746d, 0.8813735870195429d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8149051824456628d + "'", double2 == 0.8149051824456628d);
    }

    @Test
    public void test5855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5855");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) 35.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test5856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5856");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 32.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5857");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) -1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test5858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5858");
        double double1 = org.apache.commons.math.util.FastMath.floor(9.287781549441661d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.0d + "'", double1 == 9.0d);
    }

    @Test
    public void test5859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5859");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 0, (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5860");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 11013, 0.5157707046119765d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707494938970272d + "'", double2 == 1.5707494938970272d);
    }

    @Test
    public void test5861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5861");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.5607966601082315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9403184054350179d + "'", double1 == 0.9403184054350179d);
    }

    @Test
    public void test5862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5862");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7162579075638862d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.798425027260655d + "'", double1 == 0.798425027260655d);
    }

    @Test
    public void test5863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5863");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.7541871649905414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0526790432477904d + "'", double1 == 1.0526790432477904d);
    }

    @Test
    public void test5864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5864");
        double double1 = org.apache.commons.math.util.FastMath.ulp(5506.500045400884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.094947017729282E-13d + "'", double1 == 9.094947017729282E-13d);
    }

    @Test
    public void test5865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5865");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9107602588845184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7214969542037845d + "'", double1 == 0.7214969542037845d);
    }

    @Test
    public void test5866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5866");
        double double2 = org.apache.commons.math.util.FastMath.min(0.8470555939422493d, 1.5067985556900776d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8470555939422493d + "'", double2 == 0.8470555939422493d);
    }

    @Test
    public void test5867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5867");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.01628539292497197d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5868");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.01706517535661036d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01706600375250052d) + "'", double1 == (-0.01706600375250052d));
    }

    @Test
    public void test5869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5869");
        double double2 = org.apache.commons.math.util.FastMath.pow(5.95363582071512d, 0.16162584696387075d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3342119922907396d + "'", double2 == 1.3342119922907396d);
    }

    @Test
    public void test5870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5870");
        int int2 = org.apache.commons.math.util.FastMath.max(0, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test5871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5871");
        double double1 = org.apache.commons.math.util.FastMath.sinh(9.0871877068532832E16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5872");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.0664977916380836d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5873");
        double double1 = org.apache.commons.math.util.FastMath.ceil(7.105427357601003E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5874");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(99.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5729.577951308232d + "'", double1 == 5729.577951308232d);
    }

    @Test
    public void test5875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5875");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.1411917790307853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5876");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.0580220586617817d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2667629006989776d + "'", double1 == 1.2667629006989776d);
    }

    @Test
    public void test5877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5877");
        float float2 = org.apache.commons.math.util.FastMath.min(2.14748365E9f, (float) 2L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test5878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5878");
        float float2 = org.apache.commons.math.util.FastMath.min(115.0f, (float) 84677176);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 115.0f + "'", float2 == 115.0f);
    }

    @Test
    public void test5879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5879");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.33932123363772365d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5825128613496218d + "'", double1 == 0.5825128613496218d);
    }

    @Test
    public void test5880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5880");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.6846781937732479d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.816428234501134d + "'", double1 == 0.816428234501134d);
    }

    @Test
    public void test5881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5881");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 9223372036854775807L, 35.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test5882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5882");
        double double1 = org.apache.commons.math.util.FastMath.log(0.18106042748149917d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7089244499440412d) + "'", double1 == (-1.7089244499440412d));
    }

    @Test
    public void test5883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5883");
        double double2 = org.apache.commons.math.util.FastMath.pow(2979.3805346802806d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5884");
        double double1 = org.apache.commons.math.util.FastMath.log(2.7105940846527337d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9971678302955946d + "'", double1 == 0.9971678302955946d);
    }

    @Test
    public void test5885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5885");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.28495825391099355d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3297065169161863d + "'", double1 == 0.3297065169161863d);
    }

    @Test
    public void test5886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5886");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test5887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5887");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(91.40768008353618d, 4.214684851089404E-8d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 91.40768008353616d + "'", double2 == 91.40768008353616d);
    }

    @Test
    public void test5888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5888");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.8081139692195906d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5922842960560774d + "'", double1 == 0.5922842960560774d);
    }

    @Test
    public void test5889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5889");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.21714681913935818d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22065977799734446d + "'", double1 == 0.22065977799734446d);
    }

    @Test
    public void test5890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5890");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 100, (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5891");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.7811955944788658d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.467374993826298d + "'", double1 == 2.467374993826298d);
    }

    @Test
    public void test5892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5892");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.3284512750821519d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3284512750821519d + "'", double1 == 0.3284512750821519d);
    }

    @Test
    public void test5893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5893");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.17062095882471706d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1697943239686863d) + "'", double1 == (-0.1697943239686863d));
    }

    @Test
    public void test5894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5894");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.543080634815239d, 1.5433467420946743d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9532101142890315d + "'", double2 == 1.9532101142890315d);
    }

    @Test
    public void test5895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5895");
        double double1 = org.apache.commons.math.util.FastMath.floor(6.101067451441691d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.0d + "'", double1 == 6.0d);
    }

    @Test
    public void test5896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5896");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.18629855661269387d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.017403825300892d + "'", double1 == 1.017403825300892d);
    }

    @Test
    public void test5897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5897");
        double double1 = org.apache.commons.math.util.FastMath.signum(5.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5898");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.1500600133633896E-4d, 2.185039863261519d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1500600133633897E-4d + "'", double2 == 1.1500600133633897E-4d);
    }

    @Test
    public void test5899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5899");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-6.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-201.71315737027922d) + "'", double1 == (-201.71315737027922d));
    }

    @Test
    public void test5900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5900");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.8883855615856605d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6306657402554695d + "'", double1 == 0.6306657402554695d);
    }

    @Test
    public void test5901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5901");
        float float2 = org.apache.commons.math.util.FastMath.min(4.0f, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test5902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5902");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.4639704888177957d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7741589148255958d) + "'", double1 == (-0.7741589148255958d));
    }

    @Test
    public void test5903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5903");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 0L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test5904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5904");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.2717628242082613d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test5905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5905");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.0164187227291022d, 1.2767458950387724d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0210099745892995d + "'", double2 == 1.0210099745892995d);
    }

    @Test
    public void test5906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5906");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.28111738892954613d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2811173889295462d + "'", double1 == 0.2811173889295462d);
    }

    @Test
    public void test5907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5907");
        double double1 = org.apache.commons.math.util.FastMath.sin(57.70191572631413d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9140858750042244d + "'", double1 == 0.9140858750042244d);
    }

    @Test
    public void test5908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5908");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.7615560214388488d, 0.6632887472990315d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8542561319125584d + "'", double2 == 0.8542561319125584d);
    }

    @Test
    public void test5909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5909");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.9659700754028168d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8226009068357859d) + "'", double1 == (-0.8226009068357859d));
    }

    @Test
    public void test5910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5910");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.4593566380802732d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4593566380802732d + "'", double1 == 1.4593566380802732d);
    }

    @Test
    public void test5911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5911");
        double double2 = org.apache.commons.math.util.FastMath.pow((-1.506844020238002d), 0.6345784979980641d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test5912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5912");
        float float2 = org.apache.commons.math.util.FastMath.min((float) '4', (float) 36L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 36.0f + "'", float2 == 36.0f);
    }

    @Test
    public void test5913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5913");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.7085733084162253d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5914");
        double double1 = org.apache.commons.math.util.FastMath.asinh(200.00499987500626d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.991495795799467d + "'", double1 == 5.991495795799467d);
    }

    @Test
    public void test5915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5915");
        int int2 = org.apache.commons.math.util.FastMath.min((-53), 84677176);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-53) + "'", int2 == (-53));
    }

    @Test
    public void test5916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5916");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-2.5049299044217186d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-143.52191149947316d) + "'", double1 == (-143.52191149947316d));
    }

    @Test
    public void test5917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5917");
        float float2 = org.apache.commons.math.util.FastMath.min(100.0f, (float) (-36));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-36.0f) + "'", float2 == (-36.0f));
    }

    @Test
    public void test5918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5918");
        double double1 = org.apache.commons.math.util.FastMath.signum(14.174068730929205d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5919");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.7510773914034626d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9754222452038217d + "'", double1 == 0.9754222452038217d);
    }

    @Test
    public void test5920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5920");
        double double1 = org.apache.commons.math.util.FastMath.log(2.980232238769532E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-17.328679513998633d) + "'", double1 == (-17.328679513998633d));
    }

    @Test
    public void test5921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5921");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2979.3805346802806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.0d + "'", double1 == 52.0d);
    }

    @Test
    public void test5922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5922");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 100, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test5923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5923");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 97);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 97.0f + "'", float1 == 97.0f);
    }

    @Test
    public void test5924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5924");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.9171523356672744d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3996555069123393d + "'", double1 == 0.3996555069123393d);
    }

    @Test
    public void test5925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5925");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.8932946146826604d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.04900528419170972d) + "'", double1 == (-0.04900528419170972d));
    }

    @Test
    public void test5926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5926");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.5514266812416907d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5927");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.8542561319125584d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 48.945270981760515d + "'", double1 == 48.945270981760515d);
    }

    @Test
    public void test5928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5928");
        long long2 = org.apache.commons.math.util.FastMath.min(1586013452313419L, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test5929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5929");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.6998927931783815d, 70.37228331994979d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.009945246694090637d + "'", double2 == 0.009945246694090637d);
    }

    @Test
    public void test5930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5930");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 52L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test5931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5931");
        double double1 = org.apache.commons.math.util.FastMath.atanh(211.03126243924578d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5932");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 3L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5933");
        double double1 = org.apache.commons.math.util.FastMath.tan(4.15912713462618d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.619165243970861d + "'", double1 == 1.619165243970861d);
    }

    @Test
    public void test5934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5934");
        long long2 = org.apache.commons.math.util.FastMath.min(149L, 36L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 36L + "'", long2 == 36L);
    }

    @Test
    public void test5935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5935");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.2471906124334223d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.004314290066984452d + "'", double1 == 0.004314290066984452d);
    }

    @Test
    public void test5936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5936");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.2374424586050351d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2330785943501239d + "'", double1 == 0.2330785943501239d);
    }

    @Test
    public void test5937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5937");
        double double1 = org.apache.commons.math.util.FastMath.asinh(13.596393407513998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3043013731747495d + "'", double1 == 3.3043013731747495d);
    }

    @Test
    public void test5938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5938");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.23585732697719813d, 0.9149994957367078d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.23585732697719816d + "'", double2 == 0.23585732697719816d);
    }

    @Test
    public void test5939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5939");
        double double1 = org.apache.commons.math.util.FastMath.acos(34.86729768739367d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5940");
        long long2 = org.apache.commons.math.util.FastMath.max(4L, 84677176L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 84677176L + "'", long2 == 84677176L);
    }

    @Test
    public void test5941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5941");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.798425027260655d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0942525953367854d + "'", double1 == 1.0942525953367854d);
    }

    @Test
    public void test5942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5942");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.622003184662269d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8536192548050766d) + "'", double1 == (-0.8536192548050766d));
    }

    @Test
    public void test5943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5943");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-53), 4L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-53L) + "'", long2 == (-53L));
    }

    @Test
    public void test5944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5944");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 1, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test5945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5945");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.015380015090605364d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.015262346678200209d) + "'", double1 == (-0.015262346678200209d));
    }

    @Test
    public void test5946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5946");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 149, 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test5947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5947");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.6428702637760138d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5994952046300306d + "'", double1 == 0.5994952046300306d);
    }

    @Test
    public void test5948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5948");
        double double1 = org.apache.commons.math.util.FastMath.tan(262.1116315604069d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.66071342214928d + "'", double1 == 4.66071342214928d);
    }

    @Test
    public void test5949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5949");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.7601945740163978d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9508218731216449d + "'", double1 == 0.9508218731216449d);
    }

    @Test
    public void test5950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5950");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.8524213068750052d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5951");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5952");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.5604874136486535d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5604874136486537d + "'", double1 == 1.5604874136486537d);
    }

    @Test
    public void test5953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5953");
        double double1 = org.apache.commons.math.util.FastMath.signum(3.1970373466578175d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5954");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5955");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.6312937620005052d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8800413325526069d + "'", double1 == 1.8800413325526069d);
    }

    @Test
    public void test5956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5956");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.8849970445005177d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9600944078525353d + "'", double1 == 0.9600944078525353d);
    }

    @Test
    public void test5957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5957");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.0879329585365737d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09191491600039958d + "'", double1 == 0.09191491600039958d);
    }

    @Test
    public void test5958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5958");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.9982229502979694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1443601628891088d) + "'", double1 == (-0.1443601628891088d));
    }

    @Test
    public void test5959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5959");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8037511215230416d, 1.5430806348152388d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8037511215230417d + "'", double2 == 0.8037511215230417d);
    }

    @Test
    public void test5960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5960");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.5992442618287415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5961");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) 97L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test5962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5962");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.3301388768476645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3911613151469314d + "'", double1 == 0.3911613151469314d);
    }

    @Test
    public void test5963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5963");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-36.04365338911715d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-36.043653389117146d) + "'", double1 == (-36.043653389117146d));
    }

    @Test
    public void test5964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5964");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.012377839768313529d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test5965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5965");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 10, 97.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test5966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5966");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (-1L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test5967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5967");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.2706233294706026d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.230748339689824d + "'", double1 == 3.230748339689824d);
    }

    @Test
    public void test5968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5968");
        double double2 = org.apache.commons.math.util.FastMath.pow(200.0d, 658.3094075238282d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5969");
        long long2 = org.apache.commons.math.util.FastMath.min((-2L), (long) (-36));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-36L) + "'", long2 == (-36L));
    }

    @Test
    public void test5970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5970");
        double double1 = org.apache.commons.math.util.FastMath.asinh(17.247748258387592d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5416681014048166d + "'", double1 == 3.5416681014048166d);
    }

    @Test
    public void test5971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5971");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.3375553595443448d, 28.43781006905283d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.04699976315195149d + "'", double2 == 0.04699976315195149d);
    }

    @Test
    public void test5972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5972");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.5642069206141151d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test5973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5973");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.476058158779025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.302100120828712d + "'", double1 == 2.302100120828712d);
    }

    @Test
    public void test5974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5974");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.7410435382626417d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9527900004522903d + "'", double1 == 0.9527900004522903d);
    }

    @Test
    public void test5975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5975");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.6773758358854114d, 0.026753137071649866d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0139337222200737d + "'", double2 == 1.0139337222200737d);
    }

    @Test
    public void test5976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5976");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.4577979139729036d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8972240630331627d + "'", double1 == 0.8972240630331627d);
    }

    @Test
    public void test5977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5977");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-1.348658628056262d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.104843279659717d) + "'", double1 == (-1.104843279659717d));
    }

    @Test
    public void test5978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5978");
        double double1 = org.apache.commons.math.util.FastMath.acos(11013.232874695796d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5979");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.0589027237910782d, 230.89151329853462d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 548345.8516304415d + "'", double2 == 548345.8516304415d);
    }

    @Test
    public void test5980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5980");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.24187736759082779d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23726821590062963d + "'", double1 == 0.23726821590062963d);
    }

    @Test
    public void test5981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5981");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9908886150478887d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.003975161446914431d) + "'", double1 == (-0.003975161446914431d));
    }

    @Test
    public void test5982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5982");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.581016986177585d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5983");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.9930368739582951d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5984");
        int int2 = org.apache.commons.math.util.FastMath.max(57, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57 + "'", int2 == 57);
    }

    @Test
    public void test5985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5985");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.8762782705318957d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.050200526024349774d + "'", double1 == 0.050200526024349774d);
    }

    @Test
    public void test5986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5986");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1477896.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.899277193215765d + "'", double1 == 14.899277193215765d);
    }

    @Test
    public void test5987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5987");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5988");
        double double1 = org.apache.commons.math.util.FastMath.asin(4.76837158203125E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.768371582031431E-7d + "'", double1 == 4.768371582031431E-7d);
    }

    @Test
    public void test5989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5989");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9999999999999999d, 1.8800413325526069d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999999999999998d + "'", double2 == 0.9999999999999998d);
    }

    @Test
    public void test5990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5990");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.5912595710565535E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5991");
        double double2 = org.apache.commons.math.util.FastMath.max(1.9877651168459853d, 191.82954647182038d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 191.82954647182038d + "'", double2 == 191.82954647182038d);
    }

    @Test
    public void test5992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5992");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.6562661263264857d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8101025406246334d + "'", double1 == 0.8101025406246334d);
    }

    @Test
    public void test5993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5993");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.7068886140376748d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7068886140376748d + "'", double1 == 0.7068886140376748d);
    }

    @Test
    public void test5994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5994");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 8.4677176E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5995");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(52.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.00000000000001d + "'", double1 == 52.00000000000001d);
    }

    @Test
    public void test5996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5996");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.4761519398724137d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.025763711610474985d + "'", double1 == 0.025763711610474985d);
    }

    @Test
    public void test5997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5997");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(9.989075492968012E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.989075492968015E-4d + "'", double1 == 9.989075492968015E-4d);
    }

    @Test
    public void test5998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5998");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) 177L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 177.0f + "'", float2 == 177.0f);
    }

    @Test
    public void test5999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5999");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.842859999667966E24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.416614961533341E8d + "'", double1 == 1.416614961533341E8d);
    }

    @Test
    public void test6000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test6000");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.7857634747826419d), 0.16568881822443138d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }
}

