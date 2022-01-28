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
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.05723171521667502d), 0.9240711877135174d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.061855305450760255d) + "'", double2 == (-0.061855305450760255d));
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5502");
        double double2 = org.apache.commons.math.util.FastMath.min(0.8058302155599485d, 206762.68551422175d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8058302155599485d + "'", double2 == 0.8058302155599485d);
    }

    @Test
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5503");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.0046089101124813904d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5504");
        long long2 = org.apache.commons.math.util.FastMath.min(41L, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 41L + "'", long2 == 41L);
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5505");
        double double2 = org.apache.commons.math.util.FastMath.max(0.7403654500754642d, 1.3845986357215d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3845986357215d + "'", double2 == 1.3845986357215d);
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5506");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.773775678340353d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0574432900288215d + "'", double1 == 1.0574432900288215d);
    }

    @Test
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5507");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 3280, (float) 105);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 105.0f + "'", float2 == 105.0f);
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5508");
        float float2 = org.apache.commons.math.util.FastMath.min(41.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5509");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 36L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 36.0f + "'", float1 == 36.0f);
    }

    @Test
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5510");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.929160175351254d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5511");
        double double1 = org.apache.commons.math.util.FastMath.tanh(48.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5512");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.4651773501465964d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4498507013354103d + "'", double1 == 0.4498507013354103d);
    }

    @Test
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5513");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 9.079573912775348E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5514");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.21587545335317393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19546435506906037d + "'", double1 == 0.19546435506906037d);
    }

    @Test
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5515");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.9231784609934363d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.060012192715002d) + "'", double1 == (-1.060012192715002d));
    }

    @Test
    public void test5516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5516");
        double double1 = org.apache.commons.math.util.FastMath.acos(7872.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5517");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(9.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.080083823051904d + "'", double1 == 2.080083823051904d);
    }

    @Test
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5518");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4677992676220695d + "'", double1 == 1.4677992676220695d);
    }

    @Test
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5519");
        double double2 = org.apache.commons.math.util.FastMath.min(1.0049514518537068d, 0.7853981633974484d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7853981633974484d + "'", double2 == 0.7853981633974484d);
    }

    @Test
    public void test5520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5520");
        long long1 = org.apache.commons.math.util.FastMath.round(1.0469397408294336d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5521");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.0046089101124813904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.044065639126247E-5d + "'", double1 == 8.044065639126247E-5d);
    }

    @Test
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5522");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.4446678610097663d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5523");
        double double1 = org.apache.commons.math.util.FastMath.sin(3.970291913552122d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7370529091738747d) + "'", double1 == (-0.7370529091738747d));
    }

    @Test
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5524");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.05283477200072701d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.221407309531983E-4d + "'", double1 == 9.221407309531983E-4d);
    }

    @Test
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5525");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.6881171418161356E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5526");
        double double1 = org.apache.commons.math.util.FastMath.sin(4.785000857347075d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9973649157540598d) + "'", double1 == (-0.9973649157540598d));
    }

    @Test
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5527");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.0025158823581013d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5528");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.4308194525790353d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.36570469544600726d) + "'", double1 == (-0.36570469544600726d));
    }

    @Test
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5529");
        double double1 = org.apache.commons.math.util.FastMath.expm1(55.03965705951179d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.006069332887537E23d + "'", double1 == 8.006069332887537E23d);
    }

    @Test
    public void test5530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5530");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test5531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5531");
        double double1 = org.apache.commons.math.util.FastMath.log(9.079986118564083E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9.306852801150697d) + "'", double1 == (-9.306852801150697d));
    }

    @Test
    public void test5532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5532");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.017533279424944842d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01753507631545335d + "'", double1 == 0.01753507631545335d);
    }

    @Test
    public void test5533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5533");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.16678521231533142d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16835805345638843d + "'", double1 == 0.16835805345638843d);
    }

    @Test
    public void test5534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5534");
        double double2 = org.apache.commons.math.util.FastMath.max(3.225663992422657E-6d, (-0.5108256237659907d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.225663992422657E-6d + "'", double2 == 3.225663992422657E-6d);
    }

    @Test
    public void test5535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5535");
        double double2 = org.apache.commons.math.util.FastMath.max(0.01537239550868527d, (-0.07496085456049556d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.01537239550868527d + "'", double2 == 0.01537239550868527d);
    }

    @Test
    public void test5536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5536");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.7256995658276514d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5537");
        double double2 = org.apache.commons.math.util.FastMath.min(0.8221857156655816d, 1.2533141373154901d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8221857156655816d + "'", double2 == 0.8221857156655816d);
    }

    @Test
    public void test5538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5538");
        double double2 = org.apache.commons.math.util.FastMath.pow(3.697768889097982E-4d, 0.1362667799148092d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3406624011429167d + "'", double2 == 0.3406624011429167d);
    }

    @Test
    public void test5539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5539");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.2504643611022631d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.004371427760138506d) + "'", double1 == (-0.004371427760138506d));
    }

    @Test
    public void test5540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5540");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.23606797749979d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5541");
        double double1 = org.apache.commons.math.util.FastMath.log((-323.3062153431158d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5542");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.0409818737157925d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.831996312410793d + "'", double1 == 2.831996312410793d);
    }

    @Test
    public void test5543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5543");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.5515679276951895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4653893333223524d + "'", double1 == 2.4653893333223524d);
    }

    @Test
    public void test5544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5544");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.28448959157673537d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.29256028373530374d + "'", double1 == 0.29256028373530374d);
    }

    @Test
    public void test5545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5545");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.3844732404433468d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.37507088473432376d + "'", double1 == 0.37507088473432376d);
    }

    @Test
    public void test5546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5546");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.18436379801697833d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18231654777431763d + "'", double1 == 0.18231654777431763d);
    }

    @Test
    public void test5547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5547");
        double double1 = org.apache.commons.math.util.FastMath.log10(81.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9084850188786497d + "'", double1 == 1.9084850188786497d);
    }

    @Test
    public void test5548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5548");
        float float2 = org.apache.commons.math.util.FastMath.max(32.0f, 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test5549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5549");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.2891939498759002d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9584740560207139d + "'", double1 == 0.9584740560207139d);
    }

    @Test
    public void test5550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5550");
        double double2 = org.apache.commons.math.util.FastMath.max(0.675894270215288d, (-1.7552508693369808d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.675894270215288d + "'", double2 == 0.675894270215288d);
    }

    @Test
    public void test5551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5551");
        long long1 = org.apache.commons.math.util.FastMath.round(9.079986106087252E-5d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test5552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5552");
        double double1 = org.apache.commons.math.util.FastMath.log10(5.373543519361118d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7302607705000467d + "'", double1 == 0.7302607705000467d);
    }

    @Test
    public void test5553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5553");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8975275723469739d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8975275723469739d + "'", double1 == 0.8975275723469739d);
    }

    @Test
    public void test5554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5554");
        double double1 = org.apache.commons.math.util.FastMath.log(0.8092007725687939d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.21170821895742326d) + "'", double1 == (-0.21170821895742326d));
    }

    @Test
    public void test5555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5555");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9410822616658446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9410822616658446d + "'", double1 == 0.9410822616658446d);
    }

    @Test
    public void test5556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5556");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) 97L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test5557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5557");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(34.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5934119456780721d + "'", double1 == 0.5934119456780721d);
    }

    @Test
    public void test5558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5558");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.365994962674879d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1180568005746387d + "'", double1 == 1.1180568005746387d);
    }

    @Test
    public void test5559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5559");
        double double2 = org.apache.commons.math.util.FastMath.max(1.4274266235030733d, 0.9925551120260716d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4274266235030733d + "'", double2 == 1.4274266235030733d);
    }

    @Test
    public void test5560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5560");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.04494641540543966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2120056966344057d + "'", double1 == 0.2120056966344057d);
    }

    @Test
    public void test5561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5561");
        long long1 = org.apache.commons.math.util.FastMath.round(0.01805158531480737d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test5562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5562");
        double double2 = org.apache.commons.math.util.FastMath.max(0.6527019197008838d, (-0.5309802039261721d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6527019197008838d + "'", double2 == 0.6527019197008838d);
    }

    @Test
    public void test5563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5563");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 97L, 51.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test5564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5564");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5706591026530312d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5565");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.2706542725261827d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5566");
        double double1 = org.apache.commons.math.util.FastMath.tanh(101.10026952609262d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5567");
        double double1 = org.apache.commons.math.util.FastMath.signum(10.564389553932575d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5568");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.6579332160517204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6579332160517204d + "'", double1 == 0.6579332160517204d);
    }

    @Test
    public void test5569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5569");
        int int2 = org.apache.commons.math.util.FastMath.max(2147483647, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test5570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5570");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9920889238170656d, 2.686470321113186d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3537560226829597d + "'", double2 == 0.3537560226829597d);
    }

    @Test
    public void test5571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5571");
        double double1 = org.apache.commons.math.util.FastMath.asin((-23.03580664819349d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5572");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.8485804212570964d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5573");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.0824766957749856d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test5574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5574");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.02491329441075411d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.603568839713185d) + "'", double1 == (-1.603568839713185d));
    }

    @Test
    public void test5575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5575");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-1.1578552071446455d), (-0.0590011172720796d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.6217095394989354d) + "'", double2 == (-1.6217095394989354d));
    }

    @Test
    public void test5576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5576");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.24091947210469064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23859564399305908d + "'", double1 == 0.23859564399305908d);
    }

    @Test
    public void test5577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5577");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 97, 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test5578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5578");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.7555996620388388d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.349415927420927d) + "'", double1 == (-5.349415927420927d));
    }

    @Test
    public void test5579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5579");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.4973278323358539d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.915221293162716d + "'", double1 == 0.915221293162716d);
    }

    @Test
    public void test5580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5580");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-15.099557124773774d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999999999998467d) + "'", double1 == (-0.9999999999998467d));
    }

    @Test
    public void test5581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5581");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.0d, 1.5685262033089267d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5582");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.7616420810027175d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5662463746452879d + "'", double1 == 0.5662463746452879d);
    }

    @Test
    public void test5583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5583");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.1189414060601215d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test5584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5584");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.4937744707606272d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5585");
        double double2 = org.apache.commons.math.util.FastMath.min(1.2203415586770938d, 0.2853242860200621d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2853242860200621d + "'", double2 == 0.2853242860200621d);
    }

    @Test
    public void test5586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5586");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.6563683817636521d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7045234484287022d + "'", double1 == 0.7045234484287022d);
    }

    @Test
    public void test5587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5587");
        double double1 = org.apache.commons.math.util.FastMath.expm1(6.691673596021348E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5588");
        double double1 = org.apache.commons.math.util.FastMath.atanh(263.25696924845715d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5589");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-1.0697079433475818d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5590");
        double double2 = org.apache.commons.math.util.FastMath.min(7.197874973409682E-16d, (-0.1612398348874445d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.1612398348874445d) + "'", double2 == (-0.1612398348874445d));
    }

    @Test
    public void test5591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5591");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.7208856239751529d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3758756549624582d + "'", double1 == 2.3758756549624582d);
    }

    @Test
    public void test5592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5592");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-5), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5593");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-24.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1375.0987083139757d) + "'", double1 == (-1375.0987083139757d));
    }

    @Test
    public void test5594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5594");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.7403654500754643d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9046530420463418d + "'", double1 == 0.9046530420463418d);
    }

    @Test
    public void test5595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5595");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.5440211074304587d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5712556690037496d) + "'", double1 == (-0.5712556690037496d));
    }

    @Test
    public void test5596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5596");
        double double1 = org.apache.commons.math.util.FastMath.atan(3.7084297692661896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.307405231350816d + "'", double1 == 1.307405231350816d);
    }

    @Test
    public void test5597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5597");
        double double2 = org.apache.commons.math.util.FastMath.min(6.939685341941263E20d, 24256.840282162542d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 24256.840282162542d + "'", double2 == 24256.840282162542d);
    }

    @Test
    public void test5598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5598");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9199653037215056d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0834193229964067d) + "'", double1 == (-0.0834193229964067d));
    }

    @Test
    public void test5599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5599");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9773206322293115d, (-17.30564573670598d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9773206322293114d + "'", double2 == 0.9773206322293114d);
    }

    @Test
    public void test5600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5600");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.14156490267411437d, 0.24769059955591424d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1415649026741144d + "'", double2 == 0.1415649026741144d);
    }

    @Test
    public void test5601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5601");
        float float2 = org.apache.commons.math.util.FastMath.max(5.0f, (float) 3280L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3280.0f + "'", float2 == 3280.0f);
    }

    @Test
    public void test5602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5602");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.229038087540316d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 70.41869527689032d + "'", double1 == 70.41869527689032d);
    }

    @Test
    public void test5603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5603");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.2688363802786091d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.903339110766513d + "'", double1 == 0.903339110766513d);
    }

    @Test
    public void test5604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5604");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 0, (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5605");
        double double2 = org.apache.commons.math.util.FastMath.min(6.369992654280958d, 1.000883802631338d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.000883802631338d + "'", double2 == 1.000883802631338d);
    }

    @Test
    public void test5606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5606");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.4519004066366514d, (-0.9999999015598316d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1739336174335393d + "'", double2 == 2.1739336174335393d);
    }

    @Test
    public void test5607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5607");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-3.6030305945752334d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.993646568183319d) + "'", double1 == (-1.993646568183319d));
    }

    @Test
    public void test5608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5608");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 39481480091341L, (float) 2L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.9481478E13f + "'", float2 == 3.9481478E13f);
    }

    @Test
    public void test5609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5609");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.15480950261479168d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1535845238145309d + "'", double1 == 0.1535845238145309d);
    }

    @Test
    public void test5610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5610");
        double double1 = org.apache.commons.math.util.FastMath.sinh(23.566702073076858d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.587340256999986E9d + "'", double1 == 8.587340256999986E9d);
    }

    @Test
    public void test5611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5611");
        double double2 = org.apache.commons.math.util.FastMath.pow((-9.338683839135873d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5612");
        double double1 = org.apache.commons.math.util.FastMath.log(1.5706882123157566d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.45151387510561236d + "'", double1 == 0.45151387510561236d);
    }

    @Test
    public void test5613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5613");
        double double1 = org.apache.commons.math.util.FastMath.exp(21.88870456646193d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.207329724785045E9d + "'", double1 == 3.207329724785045E9d);
    }

    @Test
    public void test5614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5614");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(170.75141916320402d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.547808231904055d + "'", double1 == 5.547808231904055d);
    }

    @Test
    public void test5615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5615");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.004331994571343558d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.004322638493447736d + "'", double1 == 0.004322638493447736d);
    }

    @Test
    public void test5616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5616");
        double double1 = org.apache.commons.math.util.FastMath.atan(6.350812057622625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4146184662102623d + "'", double1 == 1.4146184662102623d);
    }

    @Test
    public void test5617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5617");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 4, (float) 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test5618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5618");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.15852257137134684d), (-0.506549180277372d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.506549180277372d) + "'", double2 == (-0.506549180277372d));
    }

    @Test
    public void test5619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5619");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test5620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5620");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 0, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test5621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5621");
        double double1 = org.apache.commons.math.util.FastMath.atanh(3.8922621958654235d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5622");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9775291852754583d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 56.00829666714566d + "'", double1 == 56.00829666714566d);
    }

    @Test
    public void test5623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5623");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.7110135287323527d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5624");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9830779426147055d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017066871424174703d) + "'", double1 == (-0.017066871424174703d));
    }

    @Test
    public void test5625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5625");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.6742905716087851d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2360789440604127d + "'", double1 == 1.2360789440604127d);
    }

    @Test
    public void test5626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5626");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9171523356672742d, 0.4723407343250855d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9599742401453463d + "'", double2 == 0.9599742401453463d);
    }

    @Test
    public void test5627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5627");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 30.295139316469992d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test5628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5628");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.0262690355566166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5629");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.7023108900190393d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7023108900190393d + "'", double1 == 0.7023108900190393d);
    }

    @Test
    public void test5630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5630");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.3020404972892391d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5631");
        double double2 = org.apache.commons.math.util.FastMath.pow(1219.0943964290645d, 1.6350720608475984d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 111145.89446467179d + "'", double2 == 111145.89446467179d);
    }

    @Test
    public void test5632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5632");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.5396932431839148d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 30.9221450661659d + "'", double1 == 30.9221450661659d);
    }

    @Test
    public void test5633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5633");
        double double1 = org.apache.commons.math.util.FastMath.atan(9.346544323973411d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4642103801992226d + "'", double1 == 1.4642103801992226d);
    }

    @Test
    public void test5634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5634");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 2005L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2005 + "'", int1 == 2005);
    }

    @Test
    public void test5635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5635");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.6388749269043887d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.19458415572564805d) + "'", double1 == (-0.19458415572564805d));
    }

    @Test
    public void test5636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5636");
        double double1 = org.apache.commons.math.util.FastMath.tanh(5.615978772723304d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.999973512128498d + "'", double1 == 0.999973512128498d);
    }

    @Test
    public void test5637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5637");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.8479780433329283E-10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5638");
        float float1 = org.apache.commons.math.util.FastMath.abs(51.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 51.0f + "'", float1 == 51.0f);
    }

    @Test
    public void test5639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5639");
        double double1 = org.apache.commons.math.util.FastMath.acos(4.6151205168412615d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5640");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.009529184458135626d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.009574731697409d + "'", double1 == 1.009574731697409d);
    }

    @Test
    public void test5641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5641");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.04494641540543966d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5642");
        double double2 = org.apache.commons.math.util.FastMath.max(0.5033275154762994d, 15.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
    }

    @Test
    public void test5643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5643");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.5574077246549023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.267909768656306d + "'", double1 == 2.267909768656306d);
    }

    @Test
    public void test5644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5644");
        int int2 = org.apache.commons.math.util.FastMath.max(4, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test5645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5645");
        double double2 = org.apache.commons.math.util.FastMath.max(0.3565024188670095d, 1.0342796520587978d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0342796520587978d + "'", double2 == 1.0342796520587978d);
    }

    @Test
    public void test5646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5646");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.7612912090796752d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test5647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5647");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5648");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.0096275915360662d, 1.1928445361837339d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7024023044096629d + "'", double2 == 0.7024023044096629d);
    }

    @Test
    public void test5649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5649");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.4796647197391239d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5650");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.11765201143093873d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1181978802114079d + "'", double1 == 0.1181978802114079d);
    }

    @Test
    public void test5651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5651");
        double double2 = org.apache.commons.math.util.FastMath.max(57.816495852442316d, 1.0111079454968612d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 57.816495852442316d + "'", double2 == 57.816495852442316d);
    }

    @Test
    public void test5652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5652");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9092974268256817d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5653");
        double double1 = org.apache.commons.math.util.FastMath.atan(50.50495049504956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5509988744578d + "'", double1 == 1.5509988744578d);
    }

    @Test
    public void test5654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5654");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.8548425446316326d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5746498405240853d) + "'", double1 == (-0.5746498405240853d));
    }

    @Test
    public void test5655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5655");
        double double2 = org.apache.commons.math.util.FastMath.min(3.021362533392777E-54d, 0.821752223882498d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.021362533392777E-54d + "'", double2 == 3.021362533392777E-54d);
    }

    @Test
    public void test5656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5656");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.2724546286048326d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5657");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.29393556482342d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16.841267313175987d + "'", double1 == 16.841267313175987d);
    }

    @Test
    public void test5658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5658");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) 97);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.267884728309446d + "'", double1 == 5.267884728309446d);
    }

    @Test
    public void test5659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5659");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.1417162261588426d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1407750673921175d + "'", double1 == 0.1407750673921175d);
    }

    @Test
    public void test5660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5660");
        int int2 = org.apache.commons.math.util.FastMath.max((int) 'a', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test5661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5661");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 5L, 0.1472859194620699d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2675013768438783d + "'", double2 == 1.2675013768438783d);
    }

    @Test
    public void test5662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5662");
        double double1 = org.apache.commons.math.util.FastMath.log10(21.42227207044929d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.330865530703539d + "'", double1 == 1.330865530703539d);
    }

    @Test
    public void test5663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5663");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 36, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5664");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.6952684310179387d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1923748987380904d + "'", double1 == 1.1923748987380904d);
    }

    @Test
    public void test5665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5665");
        int int2 = org.apache.commons.math.util.FastMath.min((-5), (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test5666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5666");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(58.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 57.99999999999999d + "'", double2 == 57.99999999999999d);
    }

    @Test
    public void test5667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5667");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.6276125002048193d), 0.015938121814835213d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6276125002048192d) + "'", double2 == (-0.6276125002048192d));
    }

    @Test
    public void test5668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5668");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(7.584080701252641d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9647214285457892d + "'", double1 == 1.9647214285457892d);
    }

    @Test
    public void test5669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5669");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 39481480091341L, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.9481478E13f + "'", float2 == 3.9481478E13f);
    }

    @Test
    public void test5670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5670");
        double double1 = org.apache.commons.math.util.FastMath.log((-1.0626395431802995d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5671");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 83, (long) 105);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 83L + "'", long2 == 83L);
    }

    @Test
    public void test5672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5672");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.5612761748756014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027249409784522016d + "'", double1 == 0.027249409784522016d);
    }

    @Test
    public void test5673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5673");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.8574823967149504E17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8574823967149504E17d + "'", double1 == 2.8574823967149504E17d);
    }

    @Test
    public void test5674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5674");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(31.999999999999996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1833.464944418634d + "'", double1 == 1833.464944418634d);
    }

    @Test
    public void test5675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5675");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.0046089101124813904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0046089101124813904d + "'", double1 == 0.0046089101124813904d);
    }

    @Test
    public void test5676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5676");
        double double1 = org.apache.commons.math.util.FastMath.floor(5.244348724433776E63d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.244348724433776E63d + "'", double1 == 5.244348724433776E63d);
    }

    @Test
    public void test5677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5677");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.5474250491067253E26d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5678");
        long long1 = org.apache.commons.math.util.FastMath.round(2.5684916247485625d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test5679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5679");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.7101417768967997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6609552393905143d + "'", double1 == 0.6609552393905143d);
    }

    @Test
    public void test5680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5680");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 97, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test5681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5681");
        double double2 = org.apache.commons.math.util.FastMath.pow(22.24871540768837d, 0.632533598810219d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.115667445692609d + "'", double2 == 7.115667445692609d);
    }

    @Test
    public void test5682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5682");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 4L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test5683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5683");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.7068730370437739d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2604124669171584d + "'", double1 == 1.2604124669171584d);
    }

    @Test
    public void test5684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5684");
        long long2 = org.apache.commons.math.util.FastMath.min(32L, 5L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test5685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5685");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.04494641542602665d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5686");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 0, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5687");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 83, 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test5688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5688");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.1063634786066836d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8940757456435279d + "'", double1 == 0.8940757456435279d);
    }

    @Test
    public void test5689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5689");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(89.2328896037985d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 89.23288960379851d + "'", double1 == 89.23288960379851d);
    }

    @Test
    public void test5690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5690");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.1928445361837339d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7851995759897803d + "'", double1 == 0.7851995759897803d);
    }

    @Test
    public void test5691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5691");
        double double1 = org.apache.commons.math.util.FastMath.cos(4.9E-324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5692");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.5509988744578d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 50.5049504950495d + "'", double1 == 50.5049504950495d);
    }

    @Test
    public void test5693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5693");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.045799397948117d, (-7.47197233734299E-43d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0457993979481164d + "'", double2 == 2.0457993979481164d);
    }

    @Test
    public void test5694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5694");
        double double2 = org.apache.commons.math.util.FastMath.min((-1.7552508693369808d), 0.9335211344483768d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.7552508693369808d) + "'", double2 == (-1.7552508693369808d));
    }

    @Test
    public void test5695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5695");
        double double2 = org.apache.commons.math.util.FastMath.atan2(5792.618751480198d, 1.1624473515095703d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5705956494526137d + "'", double2 == 1.5705956494526137d);
    }

    @Test
    public void test5696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5696");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.8607584570148492d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5697");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.9999999015598316d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test5698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5698");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5699");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 100, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test5700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5700");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '4', 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test5701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5701");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.1535845238145309d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5702");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.7325613286016606d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7998630706317855d + "'", double1 == 0.7998630706317855d);
    }

    @Test
    public void test5703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5703");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.48689816668285923d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5704");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.2732155230818425d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.646195471540118d + "'", double1 == 1.646195471540118d);
    }

    @Test
    public void test5705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5705");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.29332775741353423d), 1.4844603454294543d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.29332775741353423d) + "'", double2 == (-0.29332775741353423d));
    }

    @Test
    public void test5706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5706");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.006846374908639821d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5707");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.2756780870602893d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5708");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.3376075000685986d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.32559235937852027d) + "'", double1 == (-0.32559235937852027d));
    }

    @Test
    public void test5709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5709");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-15.954589770191003d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.4638744139941062d) + "'", double1 == (-3.4638744139941062d));
    }

    @Test
    public void test5710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5710");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.8918900011220077d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9625805862239727d + "'", double1 == 0.9625805862239727d);
    }

    @Test
    public void test5711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5711");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.6219097454839793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6219097454839793d + "'", double1 == 0.6219097454839793d);
    }

    @Test
    public void test5712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5712");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) -1, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test5713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5713");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.1277481342023209d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1202228428623669d + "'", double1 == 0.1202228428623669d);
    }

    @Test
    public void test5714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5714");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9091342957581129d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5715");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9550419440421795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5775745178565562d + "'", double1 == 0.5775745178565562d);
    }

    @Test
    public void test5716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5716");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.3120421100391796E-12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.31204211003918E-12d + "'", double1 == 2.31204211003918E-12d);
    }

    @Test
    public void test5717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5717");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.40498456639956293d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5718");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.015938121814835213d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01581244357602706d + "'", double1 == 0.01581244357602706d);
    }

    @Test
    public void test5719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5719");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.5607966601082317d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2493184782545368d + "'", double1 == 1.2493184782545368d);
    }

    @Test
    public void test5720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5720");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.1750561146072973d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8258862954435631d + "'", double1 == 0.8258862954435631d);
    }

    @Test
    public void test5721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5721");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.6124156806283731d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.844882667516732d + "'", double1 == 0.844882667516732d);
    }

    @Test
    public void test5722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5722");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.0000000000000142d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7853981633974554d + "'", double1 == 0.7853981633974554d);
    }

    @Test
    public void test5723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5723");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.8813735870195432d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4142135623730951d + "'", double1 == 1.4142135623730951d);
    }

    @Test
    public void test5724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5724");
        float float2 = org.apache.commons.math.util.FastMath.max((float) '#', (float) 5L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test5725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5725");
        double double2 = org.apache.commons.math.util.FastMath.min(0.12060942723254259d, 0.2577689529157872d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.12060942723254259d + "'", double2 == 0.12060942723254259d);
    }

    @Test
    public void test5726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5726");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.5872139151569291d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5727");
        double double2 = org.apache.commons.math.util.FastMath.min(0.18373771326775734d, 0.718989392409238d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.18373771326775734d + "'", double2 == 0.18373771326775734d);
    }

    @Test
    public void test5728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5728");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.6645457244960807d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.48549279735503514d) + "'", double1 == (-0.48549279735503514d));
    }

    @Test
    public void test5729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5729");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.008879214226770233d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.54971523247063E-4d) + "'", double1 == (-1.54971523247063E-4d));
    }

    @Test
    public void test5730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5730");
        long long1 = org.apache.commons.math.util.FastMath.abs(105L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 105L + "'", long1 == 105L);
    }

    @Test
    public void test5731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5731");
        double double1 = org.apache.commons.math.util.FastMath.acosh(286.4788975654116d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.350809011846739d + "'", double1 == 6.350809011846739d);
    }

    @Test
    public void test5732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5732");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.7035516195697273d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.194313750711617d + "'", double1 == 1.194313750711617d);
    }

    @Test
    public void test5733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5733");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.8193243886355482d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9357330325001649d + "'", double1 == 0.9357330325001649d);
    }

    @Test
    public void test5734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5734");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.5975274432265277d), 423.3617290541267d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5975274432265276d) + "'", double2 == (-0.5975274432265276d));
    }

    @Test
    public void test5735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5735");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.675894270215288d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011796580410621019d + "'", double1 == 0.011796580410621019d);
    }

    @Test
    public void test5736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5736");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.8108022215564694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7248400717559731d + "'", double1 == 0.7248400717559731d);
    }

    @Test
    public void test5737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5737");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 2005, 3280L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2005L + "'", long2 == 2005L);
    }

    @Test
    public void test5738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5738");
        double double1 = org.apache.commons.math.util.FastMath.ulp(7.928983836159852d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test5739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5739");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.5834613951988717d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8345607153475648d + "'", double1 == 0.8345607153475648d);
    }

    @Test
    public void test5740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5740");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.489463554203778E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4894635597110736E-4d + "'", double1 == 1.4894635597110736E-4d);
    }

    @Test
    public void test5741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5741");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.9785097773144031d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5742");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.05729428410226429d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6281220033287191d + "'", double1 == 1.6281220033287191d);
    }

    @Test
    public void test5743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5743");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.6020907673908776d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5744");
        int int2 = org.apache.commons.math.util.FastMath.min(3280, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3280 + "'", int2 == 3280);
    }

    @Test
    public void test5745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5745");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.3120421100391796E-12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0389678347315804E-28d + "'", double1 == 4.0389678347315804E-28d);
    }

    @Test
    public void test5746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5746");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5747");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.4764999550079779d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5748");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 'a', 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test5749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5749");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test5750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5750");
        double double1 = org.apache.commons.math.util.FastMath.acos(64.11051679254084d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5751");
        double double2 = org.apache.commons.math.util.FastMath.pow((-3.552713678800564E-14d), (-1.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.81474976710651E13d) + "'", double2 == (-2.81474976710651E13d));
    }

    @Test
    public void test5752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5752");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.295263154971464d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9628913372701d + "'", double1 == 1.9628913372701d);
    }

    @Test
    public void test5753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5753");
        double double1 = org.apache.commons.math.util.FastMath.exp(6559.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5754");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.09189023888044913d, 0.2326176679819249d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.09189023888044914d + "'", double2 == 0.09189023888044914d);
    }

    @Test
    public void test5755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5755");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) 83);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.919078092376074d + "'", double1 == 1.919078092376074d);
    }

    @Test
    public void test5756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5756");
        int int2 = org.apache.commons.math.util.FastMath.min(100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test5757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5757");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5758");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.1793704123873463d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8675168507333922d + "'", double1 == 0.8675168507333922d);
    }

    @Test
    public void test5759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5759");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.5982902226602422d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9996220666530747d + "'", double1 == 0.9996220666530747d);
    }

    @Test
    public void test5760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5760");
        double double1 = org.apache.commons.math.util.FastMath.ulp(5.362545819211763E122d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.339195571168229E106d + "'", double1 == 7.339195571168229E106d);
    }

    @Test
    public void test5761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5761");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test5762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5762");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-5), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5763");
        int int2 = org.apache.commons.math.util.FastMath.min(3, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test5764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5764");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.9770658357928819d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5765");
        double double2 = org.apache.commons.math.util.FastMath.min(0.4961362064880912d, 564.2988711233952d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4961362064880912d + "'", double2 == 0.4961362064880912d);
    }

    @Test
    public void test5766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5766");
        float float2 = org.apache.commons.math.util.FastMath.max(2.0f, (float) 83);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 83.0f + "'", float2 == 83.0f);
    }

    @Test
    public void test5767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5767");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.167375502789719d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5768");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.2349946114235455d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.021554722213728842d + "'", double1 == 0.021554722213728842d);
    }

    @Test
    public void test5769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5769");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9997917751171265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5770");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.3939063732470823d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6276196087177983d + "'", double1 == 0.6276196087177983d);
    }

    @Test
    public void test5771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5771");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.5796344196146512d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.323565423292549d + "'", double1 == 2.323565423292549d);
    }

    @Test
    public void test5772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5772");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.01753507631545335d, 533.2433869852506d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.017535076315453355d + "'", double2 == 0.017535076315453355d);
    }

    @Test
    public void test5773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5773");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(57.271284253105414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3281.402874996991d + "'", double1 == 3281.402874996991d);
    }

    @Test
    public void test5774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5774");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9410822616658444d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5775");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2, (float) 3);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test5776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5776");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.469446951953614E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test5777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5777");
        double double1 = org.apache.commons.math.util.FastMath.acosh(3.970291913552122d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.055735923596816d + "'", double1 == 2.055735923596816d);
    }

    @Test
    public void test5778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5778");
        double double1 = org.apache.commons.math.util.FastMath.cosh(199.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.329143595868801E86d + "'", double1 == 1.329143595868801E86d);
    }

    @Test
    public void test5779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5779");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.5294913521432763d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.615828393869323d + "'", double1 == 4.615828393869323d);
    }

    @Test
    public void test5780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5780");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.7400532113272699d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8094792583202497d + "'", double1 == 0.8094792583202497d);
    }

    @Test
    public void test5781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5781");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) 97);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.00000000000001d + "'", double1 == 97.00000000000001d);
    }

    @Test
    public void test5782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5782");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 83);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 83 + "'", int1 == 83);
    }

    @Test
    public void test5783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5783");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.5335854272192775d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03720231281827955d + "'", double1 == 0.03720231281827955d);
    }

    @Test
    public void test5784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5784");
        double double1 = org.apache.commons.math.util.FastMath.tanh(40.39461231087824d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5785");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 41, (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test5786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5786");
        double double2 = org.apache.commons.math.util.FastMath.max(74.68585461772224d, 1.7253825588523148d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 74.68585461772224d + "'", double2 == 74.68585461772224d);
    }

    @Test
    public void test5787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5787");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.6576913458149568d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.706142388099178d + "'", double1 == 0.706142388099178d);
    }

    @Test
    public void test5788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5788");
        double double1 = org.apache.commons.math.util.FastMath.atanh(7.635078747156649E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.635078747156649E-9d + "'", double1 == 7.635078747156649E-9d);
    }

    @Test
    public void test5789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5789");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.7035516195697273d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.60631798402139d + "'", double1 == 97.60631798402139d);
    }

    @Test
    public void test5790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5790");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.0291617385510083d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24091947210469045d + "'", double1 == 0.24091947210469045d);
    }

    @Test
    public void test5791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5791");
        float float2 = org.apache.commons.math.util.FastMath.min(32.0f, (float) 52L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test5792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5792");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.5515643720383434d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.253465122149187d + "'", double1 == 2.253465122149187d);
    }

    @Test
    public void test5793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5793");
        double double2 = org.apache.commons.math.util.FastMath.min(0.019228399099707562d, 0.026006127044727836d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.019228399099707562d + "'", double2 == 0.019228399099707562d);
    }

    @Test
    public void test5794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5794");
        double double2 = org.apache.commons.math.util.FastMath.min(0.39165310745452653d, 11013.232874703393d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.39165310745452653d + "'", double2 == 0.39165310745452653d);
    }

    @Test
    public void test5795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5795");
        long long1 = org.apache.commons.math.util.FastMath.round(564.2988711233953d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 564L + "'", long1 == 564L);
    }

    @Test
    public void test5796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5796");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 83L, (float) 3L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 83.0f + "'", float2 == 83.0f);
    }

    @Test
    public void test5797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5797");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.554498693205925d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.016296912121706763d + "'", double1 == 0.016296912121706763d);
    }

    @Test
    public void test5798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5798");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.194992268641593d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36702059284620847d + "'", double1 == 0.36702059284620847d);
    }

    @Test
    public void test5799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5799");
        double double1 = org.apache.commons.math.util.FastMath.sin(67.38522216300166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9873829586752012d) + "'", double1 == (-0.9873829586752012d));
    }

    @Test
    public void test5800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5800");
        long long2 = org.apache.commons.math.util.FastMath.min(4L, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test5801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5801");
        float float1 = org.apache.commons.math.util.FastMath.abs(4.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.0f + "'", float1 == 4.0f);
    }

    @Test
    public void test5802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5802");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.6218224167640864d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8623188722876839d + "'", double1 == 0.8623188722876839d);
    }

    @Test
    public void test5803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5803");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.12060942723254259d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9186187449731414d) + "'", double1 == (-0.9186187449731414d));
    }

    @Test
    public void test5804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5804");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.41367458077606883d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0072199834663496405d + "'", double1 == 0.0072199834663496405d);
    }

    @Test
    public void test5805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5805");
        double double1 = org.apache.commons.math.util.FastMath.rint((-1.564538235027751d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test5806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5806");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test5807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5807");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.36702059284620847d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3758040581533036d + "'", double1 == 0.3758040581533036d);
    }

    @Test
    public void test5808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5808");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.6015665163590591d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.010499316380217913d) + "'", double1 == (-0.010499316380217913d));
    }

    @Test
    public void test5809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5809");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.3277046831761643d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6866772216106064d) + "'", double1 == (-0.6866772216106064d));
    }

    @Test
    public void test5810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5810");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.697768889097982E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6977689733670266E-4d + "'", double1 == 3.6977689733670266E-4d);
    }

    @Test
    public void test5811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5811");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7896834592732402d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9102928793350592d + "'", double1 == 0.9102928793350592d);
    }

    @Test
    public void test5812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5812");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.5242004660685926d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18304209008882052d + "'", double1 == 0.18304209008882052d);
    }

    @Test
    public void test5813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5813");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.9999999999999997d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36787944117144245d + "'", double1 == 0.36787944117144245d);
    }

    @Test
    public void test5814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5814");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.2551261440342657d), 0.9364017098556218d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.2659974316960944d) + "'", double2 == (-0.2659974316960944d));
    }

    @Test
    public void test5815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5815");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.8148475049841903d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.014221771863635027d + "'", double1 == 0.014221771863635027d);
    }

    @Test
    public void test5816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5816");
        float float2 = org.apache.commons.math.util.FastMath.min(51.0f, 3280.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 51.0f + "'", float2 == 51.0f);
    }

    @Test
    public void test5817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5817");
        double double2 = org.apache.commons.math.util.FastMath.max(2.79382339397931d, 0.9524012787544386d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.79382339397931d + "'", double2 == 2.79382339397931d);
    }

    @Test
    public void test5818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5818");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.075347727094991d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8797555222439518d + "'", double1 == 0.8797555222439518d);
    }

    @Test
    public void test5819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5819");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.00020763301592d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.016451283400314E-5d + "'", double1 == 9.016451283400314E-5d);
    }

    @Test
    public void test5820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5820");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.11765201143093872d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.124852607402586d + "'", double1 == 1.124852607402586d);
    }

    @Test
    public void test5821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5821");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.5705956494526137d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5822");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7854964800073828d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9034979604694945d + "'", double1 == 0.9034979604694945d);
    }

    @Test
    public void test5823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5823");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.5328443826719127d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0379428340982403d + "'", double1 == 0.0379428340982403d);
    }

    @Test
    public void test5824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5824");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 49);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 49 + "'", int1 == 49);
    }

    @Test
    public void test5825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5825");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 10, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5826");
        float float2 = org.apache.commons.math.util.FastMath.min(51.0f, (float) 564L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 51.0f + "'", float2 == 51.0f);
    }

    @Test
    public void test5827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5827");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.1258102894883197d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1258102894883197d + "'", double1 == 1.1258102894883197d);
    }

    @Test
    public void test5828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5828");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.7851995759897803d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.868407927927943d + "'", double1 == 0.868407927927943d);
    }

    @Test
    public void test5829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5829");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5830");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.999999999733659d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7853981632642778d + "'", double1 == 0.7853981632642778d);
    }

    @Test
    public void test5831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5831");
        long long1 = org.apache.commons.math.util.FastMath.round(1.3759428780910872d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test5832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5832");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.15852257137134684d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5833");
        float float2 = org.apache.commons.math.util.FastMath.min(10.0f, 3280.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test5834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5834");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.019228399099707562d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5835");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-51.9999999999999d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5836");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.416281099899578d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4162810998995783d + "'", double1 == 1.4162810998995783d);
    }

    @Test
    public void test5837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5837");
        double double1 = org.apache.commons.math.util.FastMath.floor(101.1002695260926d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 101.0d + "'", double1 == 101.0d);
    }

    @Test
    public void test5838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5838");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9625660398138893d, (-1.54971523247063E-4d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9625660398138892d + "'", double2 == 0.9625660398138892d);
    }

    @Test
    public void test5839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5839");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 10L, (float) 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test5840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5840");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.8345607153475648d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01456583229061418d + "'", double1 == 0.01456583229061418d);
    }

    @Test
    public void test5841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5841");
        double double1 = org.apache.commons.math.util.FastMath.exp(9.07998609361042E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000908039833682d + "'", double1 == 1.0000908039833682d);
    }

    @Test
    public void test5842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5842");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(96.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6929693744344994d + "'", double1 == 1.6929693744344994d);
    }

    @Test
    public void test5843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5843");
        long long2 = org.apache.commons.math.util.FastMath.min(3280L, 564L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 564L + "'", long2 == 564L);
    }

    @Test
    public void test5844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5844");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9998958821382987d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.5220166958829836E-5d) + "'", double1 == (-4.5220166958829836E-5d));
    }

    @Test
    public void test5845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5845");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.8733614431664554d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6422536607552369d + "'", double1 == 0.6422536607552369d);
    }

    @Test
    public void test5846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5846");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430806348152437d + "'", double1 == 1.5430806348152437d);
    }

    @Test
    public void test5847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5847");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.9459101490553132d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.999999999999999d + "'", double1 == 6.999999999999999d);
    }

    @Test
    public void test5848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5848");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.1057044739884163d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.045563434900543d + "'", double1 == 4.045563434900543d);
    }

    @Test
    public void test5849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5849");
        double double1 = org.apache.commons.math.util.FastMath.floor(101.10026952609262d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 101.0d + "'", double1 == 101.0d);
    }

    @Test
    public void test5850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5850");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.2023903267012446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2023903267012446d + "'", double1 == 1.2023903267012446d);
    }

    @Test
    public void test5851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5851");
        double double2 = org.apache.commons.math.util.FastMath.max(4.295214085529645d, 0.6144289961559061d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.295214085529645d + "'", double2 == 4.295214085529645d);
    }

    @Test
    public void test5852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5852");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.030158182390908228d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test5853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5853");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 52, 41L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 41L + "'", long2 == 41L);
    }

    @Test
    public void test5854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5854");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.154434690031884d + "'", double1 == 2.154434690031884d);
    }

    @Test
    public void test5855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5855");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.42846204504183943d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.42846204504183943d + "'", double1 == 0.42846204504183943d);
    }

    @Test
    public void test5856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5856");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7045234484287022d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6072311414472692d + "'", double1 == 0.6072311414472692d);
    }

    @Test
    public void test5857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5857");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 36);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 36.0f + "'", float1 == 36.0f);
    }

    @Test
    public void test5858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5858");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.010309278362160296d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5859");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.8703261436731974d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.41881493312992785d + "'", double1 == 0.41881493312992785d);
    }

    @Test
    public void test5860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5860");
        double double1 = org.apache.commons.math.util.FastMath.expm1(51.74236647977493d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.960903427927607E22d + "'", double1 == 2.960903427927607E22d);
    }

    @Test
    public void test5861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5861");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.7024348335001199d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6460780391838616d + "'", double1 == 0.6460780391838616d);
    }

    @Test
    public void test5862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5862");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.7604870043227957d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013273002144061135d + "'", double1 == 0.013273002144061135d);
    }

    @Test
    public void test5863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5863");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 97, 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test5864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5864");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.2891939498759002d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-16.569592788606958d) + "'", double1 == (-16.569592788606958d));
    }

    @Test
    public void test5865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5865");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.3503505927690682d, 3280.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5866");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.2815882258354989d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test5867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5867");
        double double1 = org.apache.commons.math.util.FastMath.asin(9.673068691247645E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.673070199735257E-4d + "'", double1 == 9.673070199735257E-4d);
    }

    @Test
    public void test5868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5868");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5705956494526137d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5869");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 1, (float) 51L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test5870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5870");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9088714301767988d, 0.005559374061838583d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5646796148552646d + "'", double2 == 1.5646796148552646d);
    }

    @Test
    public void test5871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5871");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9734594443576854d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.679788065799492d + "'", double1 == 0.679788065799492d);
    }

    @Test
    public void test5872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5872");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.8518668331142898d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5873");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.3788396218579066d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9433259196114583d + "'", double1 == 0.9433259196114583d);
    }

    @Test
    public void test5874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5874");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.6842868307608122d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test5875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5875");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5607966601082315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9155494254642262d + "'", double1 == 0.9155494254642262d);
    }

    @Test
    public void test5876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5876");
        double double2 = org.apache.commons.math.util.FastMath.min(0.20977711114722197d, 0.9534625892455924d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.20977711114722197d + "'", double2 == 0.20977711114722197d);
    }

    @Test
    public void test5877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5877");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.6835723937915076d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5878");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7442044624451434d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8393430392715959d + "'", double1 == 0.8393430392715959d);
    }

    @Test
    public void test5879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5879");
        double double2 = org.apache.commons.math.util.FastMath.pow(9.194972725426231d, 0.5662463746452879d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.5124240848438144d + "'", double2 == 3.5124240848438144d);
    }

    @Test
    public void test5880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5880");
        int int2 = org.apache.commons.math.util.FastMath.max(0, 51);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 51 + "'", int2 == 51);
    }

    @Test
    public void test5881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5881");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.725178994914957d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7904314121668521d + "'", double1 == 0.7904314121668521d);
    }

    @Test
    public void test5882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5882");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.7089878066060047d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5883");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.019828997233014522d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01983029668292673d + "'", double1 == 0.01983029668292673d);
    }

    @Test
    public void test5884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5884");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1833.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1833.0d + "'", double1 == 1833.0d);
    }

    @Test
    public void test5885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5885");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.7621584293004213d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.9642408323164d + "'", double1 == 100.9642408323164d);
    }

    @Test
    public void test5886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5886");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.2360789440604127d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5887");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.1415649026741144d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14203821814476517d + "'", double1 == 0.14203821814476517d);
    }

    @Test
    public void test5888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5888");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1, (float) 35);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test5889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5889");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 0, (float) 49);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5890");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.5651071406809116d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6015951862692743d + "'", double1 == 1.6015951862692743d);
    }

    @Test
    public void test5891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5891");
        double double1 = org.apache.commons.math.util.FastMath.tan(7072.591881122253d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1777006370558898d + "'", double1 == 1.1777006370558898d);
    }

    @Test
    public void test5892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5892");
        float float2 = org.apache.commons.math.util.FastMath.max((-1.0f), (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5893");
        double double1 = org.apache.commons.math.util.FastMath.log(0.019228399099707562d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.951366972992147d) + "'", double1 == (-3.951366972992147d));
    }

    @Test
    public void test5894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5894");
        int int1 = org.apache.commons.math.util.FastMath.abs(2005);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2005 + "'", int1 == 2005);
    }

    @Test
    public void test5895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5895");
        double double2 = org.apache.commons.math.util.FastMath.pow(4.158638853279167d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5896");
        double double1 = org.apache.commons.math.util.FastMath.log(92.95177303495919d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.532080789133015d + "'", double1 == 4.532080789133015d);
    }

    @Test
    public void test5897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5897");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9683140799247235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6335008426764623d + "'", double1 == 1.6335008426764623d);
    }

    @Test
    public void test5898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5898");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9599742401453463d, 0.6386554259769499d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9599742401453462d + "'", double2 == 0.9599742401453462d);
    }

    @Test
    public void test5899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5899");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.4261475807848434d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8863046416414531d + "'", double1 == 0.8863046416414531d);
    }

    @Test
    public void test5900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5900");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.04746075958226597d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.047496443317032074d + "'", double1 == 0.047496443317032074d);
    }

    @Test
    public void test5901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5901");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 49, (float) 2005L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 49.0f + "'", float2 == 49.0f);
    }

    @Test
    public void test5902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5902");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.2334031175112035d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5903");
        double double1 = org.apache.commons.math.util.FastMath.abs(7.93006726156721E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.93006726156721E14d + "'", double1 == 7.93006726156721E14d);
    }

    @Test
    public void test5904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5904");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.1057044739884163d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8603154559760037d + "'", double1 == 0.8603154559760037d);
    }

    @Test
    public void test5905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5905");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.3458349416236008d), 0.8674323532966371d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test5906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5906");
        double double1 = org.apache.commons.math.util.FastMath.floor(1350.2725658295117d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1350.0d + "'", double1 == 1350.0d);
    }

    @Test
    public void test5907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5907");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.3458349416236008d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.060399309368239d + "'", double1 == 1.060399309368239d);
    }

    @Test
    public void test5908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5908");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.15480950261479168d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5909");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(3.256962950186429d, 0.9999999535225789d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.2569629501864283d + "'", double2 == 3.2569629501864283d);
    }

    @Test
    public void test5910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5910");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.19068994544354323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19184771387583854d + "'", double1 == 0.19184771387583854d);
    }

    @Test
    public void test5911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5911");
        double double1 = org.apache.commons.math.util.FastMath.cos(6.528325605543861E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999997869048315d + "'", double1 == 0.9999997869048315d);
    }

    @Test
    public void test5912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5912");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 3280, (float) 36L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 36.0f + "'", float2 == 36.0f);
    }

    @Test
    public void test5913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5913");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.052375708539775356d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.37414789288563605d + "'", double1 == 0.37414789288563605d);
    }

    @Test
    public void test5914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5914");
        int int1 = org.apache.commons.math.util.FastMath.round(36.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 36 + "'", int1 == 36);
    }

    @Test
    public void test5915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5915");
        long long1 = org.apache.commons.math.util.FastMath.round(1.2240401467946809d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test5916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5916");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.26870538272188704d, 0.5586683478888236d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.47990444276596017d + "'", double2 == 0.47990444276596017d);
    }

    @Test
    public void test5917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5917");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.0291617385510081d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0291617385510083d + "'", double1 == 1.0291617385510083d);
    }

    @Test
    public void test5918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5918");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.13838687427840005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13794559088583247d + "'", double1 == 0.13794559088583247d);
    }

    @Test
    public void test5919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5919");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.48854405300441117d, 0.8490333012771822d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5221439448055225d + "'", double2 == 0.5221439448055225d);
    }

    @Test
    public void test5920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5920");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.8280082726548263d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.736585739814542d + "'", double1 == 0.736585739814542d);
    }

    @Test
    public void test5921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5921");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.757421577635591d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.757421577635591d + "'", double1 == 0.757421577635591d);
    }

    @Test
    public void test5922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5922");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.045799397948117d, 0.13417614850536844d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1008050323661345d + "'", double2 == 1.1008050323661345d);
    }

    @Test
    public void test5923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5923");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 'a', 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test5924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5924");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5925");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.2430166129797537d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3253218418939707d + "'", double1 == 1.3253218418939707d);
    }

    @Test
    public void test5926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5926");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test5927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5927");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.15141416880891d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9844937764850908d + "'", double1 == 0.9844937764850908d);
    }

    @Test
    public void test5928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5928");
        int int2 = org.apache.commons.math.util.FastMath.min(2005, 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test5929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5929");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(105.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6016.0568488736435d + "'", double1 == 6016.0568488736435d);
    }

    @Test
    public void test5930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5930");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5931");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.009529184458135626d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009529472907515197d + "'", double1 == 0.009529472907515197d);
    }

    @Test
    public void test5932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5932");
        double double1 = org.apache.commons.math.util.FastMath.log(3.993222846126381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3845986357215d + "'", double1 == 1.3845986357215d);
    }

    @Test
    public void test5933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5933");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) 3.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05235987755982989d + "'", double1 == 0.05235987755982989d);
    }

    @Test
    public void test5934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5934");
        double double1 = org.apache.commons.math.util.FastMath.exp(1965.6378749304042d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5935");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.3788396218579066d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.880691164759764d + "'", double1 == 0.880691164759764d);
    }

    @Test
    public void test5936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5936");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.5574077246549025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19240232444172625d + "'", double1 == 0.19240232444172625d);
    }

    @Test
    public void test5937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5937");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.4914382287865444d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5938");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.014686439244896644d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8414709848078773d + "'", double1 == 0.8414709848078773d);
    }

    @Test
    public void test5939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5939");
        long long2 = org.apache.commons.math.util.FastMath.min(97L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5940");
        double double2 = org.apache.commons.math.util.FastMath.atan2(50.50495049504951d, 2302.9401181042886d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.021927125068741424d + "'", double2 == 0.021927125068741424d);
    }

    @Test
    public void test5941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5941");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.6536436208636119d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7816340724367478d) + "'", double1 == (-0.7816340724367478d));
    }

    @Test
    public void test5942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5942");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 83L, 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 83.0f + "'", float2 == 83.0f);
    }

    @Test
    public void test5943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5943");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.38785408736876786d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4085486228629643d + "'", double1 == 0.4085486228629643d);
    }

    @Test
    public void test5944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5944");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-5), (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5L) + "'", long2 == (-5L));
    }

    @Test
    public void test5945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5945");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(9.079573862873686E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5846845858516596E-6d + "'", double1 == 1.5846845858516596E-6d);
    }

    @Test
    public void test5946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5946");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.1180568005746387d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8068919472776069d + "'", double1 == 0.8068919472776069d);
    }

    @Test
    public void test5947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5947");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.302585092994046d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5713088006770572d + "'", double1 == 1.5713088006770572d);
    }

    @Test
    public void test5948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5948");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.4397629335614917d, 12.019343107182594d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.439762933561492d + "'", double2 == 2.439762933561492d);
    }

    @Test
    public void test5949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5949");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.8490992029155888d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6905985797206106d + "'", double1 == 0.6905985797206106d);
    }

    @Test
    public void test5950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5950");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8235811162606056d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6031002539686936d + "'", double1 == 0.6031002539686936d);
    }

    @Test
    public void test5951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5951");
        long long2 = org.apache.commons.math.util.FastMath.max(97L, 4L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test5952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5952");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-1.5701287081656916d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5953");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.18650080065297936d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5713386007872874d + "'", double1 == 0.5713386007872874d);
    }

    @Test
    public void test5954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5954");
        long long2 = org.apache.commons.math.util.FastMath.min(9223372036854775807L, 49L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 49L + "'", long2 == 49L);
    }

    @Test
    public void test5955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5955");
        double double1 = org.apache.commons.math.util.FastMath.expm1(5.564318773958797E35d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5956");
        long long2 = org.apache.commons.math.util.FastMath.min(4L, 2147483647L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test5957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5957");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9646434516111302d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8218458394920244d + "'", double1 == 0.8218458394920244d);
    }

    @Test
    public void test5958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5958");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.15269750911695396d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.15152168239853733d) + "'", double1 == (-0.15152168239853733d));
    }

    @Test
    public void test5959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5959");
        double double1 = org.apache.commons.math.util.FastMath.tan(20.938628468106426d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.753539335176573d) + "'", double1 == (-1.753539335176573d));
    }

    @Test
    public void test5960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5960");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.116272937678812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.6477215443668323d) + "'", double1 == (-1.6477215443668323d));
    }

    @Test
    public void test5961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5961");
        int int2 = org.apache.commons.math.util.FastMath.max((int) 'a', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test5962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5962");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 5L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2924316695611777d + "'", double1 == 2.2924316695611777d);
    }

    @Test
    public void test5963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5963");
        double double1 = org.apache.commons.math.util.FastMath.cos(5.362545819211763E122d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8626671474772162d) + "'", double1 == (-0.8626671474772162d));
    }

    @Test
    public void test5964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5964");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.5035448147047986d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5035448147047985d) + "'", double1 == (-0.5035448147047985d));
    }

    @Test
    public void test5965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5965");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9130789561495836d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5966");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8259324122591327d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.598942234760144d + "'", double1 == 0.598942234760144d);
    }

    @Test
    public void test5967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5967");
        double double1 = org.apache.commons.math.util.FastMath.exp(97.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3383347192042886E42d + "'", double1 == 1.3383347192042886E42d);
    }

    @Test
    public void test5968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5968");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(20.938628468106426d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.756233944410949d + "'", double1 == 2.756233944410949d);
    }

    @Test
    public void test5969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5969");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.7537194024558177d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5293871052736648d) + "'", double1 == (-0.5293871052736648d));
    }

    @Test
    public void test5970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5970");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.7075701760979363d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.2656909132782515d) + "'", double1 == (-7.2656909132782515d));
    }

    @Test
    public void test5971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5971");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(7072.591881122252d, 0.6285343982292605d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7072.591881122251d + "'", double2 == 7072.591881122251d);
    }

    @Test
    public void test5972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5972");
        double double1 = org.apache.commons.math.util.FastMath.signum((-3.6923537059133382d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5973");
        double double1 = org.apache.commons.math.util.FastMath.rint(5.547808231904055d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.0d + "'", double1 == 6.0d);
    }

    @Test
    public void test5974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5974");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-5.349415927420927d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9952490749257368d) + "'", double1 == (-0.9952490749257368d));
    }

    @Test
    public void test5975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5975");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.2233932393493425d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2233932393493427d + "'", double1 == 1.2233932393493427d);
    }

    @Test
    public void test5976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5976");
        double double1 = org.apache.commons.math.util.FastMath.ceil(9.0871877068532768E16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.0871877068532768E16d + "'", double1 == 9.0871877068532768E16d);
    }

    @Test
    public void test5977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5977");
        float float2 = org.apache.commons.math.util.FastMath.max((float) '#', (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test5978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5978");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.6177859350239399d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-21.26563556360102d) + "'", double1 == (-21.26563556360102d));
    }

    @Test
    public void test5979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5979");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.939216676724527d, 1.287130223361518d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9224567901476869d + "'", double2 == 0.9224567901476869d);
    }

    @Test
    public void test5980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5980");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 3, 5L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test5981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5981");
        double double1 = org.apache.commons.math.util.FastMath.asinh(22.24804199389342d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.795905878436088d + "'", double1 == 3.795905878436088d);
    }

    @Test
    public void test5982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5982");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.010308913146243284d, 0.009483282630450406d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8270889450070834d + "'", double2 == 0.8270889450070834d);
    }

    @Test
    public void test5983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5983");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.776356839400251E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5984");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.41879794067495774d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0889851353176776d + "'", double1 == 1.0889851353176776d);
    }

    @Test
    public void test5985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5985");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.1408200865825788d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14176215585771934d + "'", double1 == 0.14176215585771934d);
    }

    @Test
    public void test5986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5986");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.4448003358617309d, (-0.29488975471104756d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2698502401706306d + "'", double2 == 1.2698502401706306d);
    }

    @Test
    public void test5987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5987");
        double double1 = org.apache.commons.math.util.FastMath.tanh(5.6640732741201365d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999759412402541d + "'", double1 == 0.9999759412402541d);
    }

    @Test
    public void test5988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5988");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-5.0500272064426E9d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1715.6600526011878d) + "'", double1 == (-1715.6600526011878d));
    }

    @Test
    public void test5989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5989");
        double double1 = org.apache.commons.math.util.FastMath.acos((-3.052948304976176d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5990");
        double double2 = org.apache.commons.math.util.FastMath.pow((-96.87824279114196d), 7072.591881122251d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test5991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5991");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.41367458077606883d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3833411645476898d) + "'", double1 == (-0.3833411645476898d));
    }

    @Test
    public void test5992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5992");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.5514266812416906d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5993");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.6276125002048193d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5994");
        int int2 = org.apache.commons.math.util.FastMath.max(3280, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3280 + "'", int2 == 3280);
    }

    @Test
    public void test5995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5995");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.8771900820709495d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01530985509797735d + "'", double1 == 0.01530985509797735d);
    }

    @Test
    public void test5996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5996");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.01420892545840321d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5997");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.15481538423886812d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5998");
        double double1 = org.apache.commons.math.util.FastMath.asin(1219.0943964290645d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5999");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.9112457457114389d), 58.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.004558897188299265d + "'", double2 == 0.004558897188299265d);
    }

    @Test
    public void test6000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test6000");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.1478260473879486d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1593112136080739d + "'", double1 == 0.1593112136080739d);
    }
}

