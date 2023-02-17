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
        double double1 = org.apache.commons.math.util.FastMath.expm1(84.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0250773222011426E36d + "'", double1 == 3.0250773222011426E36d);
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5502");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.147483648E9d, 0.10558035700584559d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.666482894409937d + "'", double2 == 9.666482894409937d);
    }

    @Test
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5503");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9137514854687232d, 36.000000000000014d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9137514854687233d + "'", double2 == 0.9137514854687233d);
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5504");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.9902697229065449d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01728346714753112d) + "'", double1 == (-0.01728346714753112d));
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5505");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.0997501702946164d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5506");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9550315978940166d, 0.3796077390275217d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9550315978940165d + "'", double2 == 0.9550315978940165d);
    }

    @Test
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5507");
        long long2 = org.apache.commons.math.util.FastMath.min(274877906944L, 1477896L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1477896L + "'", long2 == 1477896L);
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5508");
        double double1 = org.apache.commons.math.util.FastMath.atan(100.00000000000004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5607966601082315d + "'", double1 == 1.5607966601082315d);
    }

    @Test
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5509");
        int int2 = org.apache.commons.math.util.FastMath.max(3, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5510");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-1.2582773960442621d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.021961083464393048d) + "'", double1 == (-0.021961083464393048d));
    }

    @Test
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5511");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.74342314569772E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7434079482530322E-5d + "'", double1 == 1.7434079482530322E-5d);
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5512");
        long long2 = org.apache.commons.math.util.FastMath.max((-1L), 26L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 26L + "'", long2 == 26L);
    }

    @Test
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5513");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.05042677562564d, 1.450905222306537d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6266394763546572d + "'", double2 == 0.6266394763546572d);
    }

    @Test
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5514");
        double double2 = org.apache.commons.math.util.FastMath.min(0.1933463270565558d, 0.4804565494962835d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1933463270565558d + "'", double2 == 0.1933463270565558d);
    }

    @Test
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5515");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.8934964811466461d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2531606858262283d + "'", double1 == 1.2531606858262283d);
    }

    @Test
    public void test5516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5516");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 11013, 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5517");
        double double2 = org.apache.commons.math.util.FastMath.max(4.194206803317586d, 0.7835271334741006d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.194206803317586d + "'", double2 == 4.194206803317586d);
    }

    @Test
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5518");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.242092215277729d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.89295747964186d + "'", double1 == 0.89295747964186d);
    }

    @Test
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5519");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2147483647L, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test5520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5520");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-2L), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5521");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.3707603033998557d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5522");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.02191108311321608d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.02190757731519929d) + "'", double1 == (-0.02190757731519929d));
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5523");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9532533939390466d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8479294907986558d + "'", double1 == 0.8479294907986558d);
    }

    @Test
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5524");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 9.044524487391685E157d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5525");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.6203272079179196d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4284550213021703d + "'", double1 == 2.4284550213021703d);
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5526");
        double double1 = org.apache.commons.math.util.FastMath.acos(1936674.200214744d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5527");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.523746987213264d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8060720191365187d + "'", double1 == 0.8060720191365187d);
    }

    @Test
    public void test5528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5528");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.2929710785315947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3186600801982646d + "'", double1 == 1.3186600801982646d);
    }

    @Test
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5529");
        double double2 = org.apache.commons.math.util.FastMath.min(0.5326596333479113d, 0.297288184003927d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.297288184003927d + "'", double2 == 0.297288184003927d);
    }

    @Test
    public void test5530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5530");
        long long1 = org.apache.commons.math.util.FastMath.round(1.2185696235757997d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test5531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5531");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.5021549377007268d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.026217549537967982d + "'", double1 == 0.026217549537967982d);
    }

    @Test
    public void test5532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5532");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.8359466061307562d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5533");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.999720323431057d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.841319842005267d + "'", double1 == 0.841319842005267d);
    }

    @Test
    public void test5534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5534");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.020084001944983E204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.525711700080349E202d + "'", double1 == 3.525711700080349E202d);
    }

    @Test
    public void test5535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5535");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.6065871573381095d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5452489258696552d + "'", double1 == 0.5452489258696552d);
    }

    @Test
    public void test5536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5536");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.4628824377340256d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4465290746610793d + "'", double1 == 0.4465290746610793d);
    }

    @Test
    public void test5537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5537");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.1016572581144659d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.10200962766482866d) + "'", double1 == (-0.10200962766482866d));
    }

    @Test
    public void test5538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5538");
        float float2 = org.apache.commons.math.util.FastMath.max(1.58601345E15f, (-36.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.58601345E15f + "'", float2 == 1.58601345E15f);
    }

    @Test
    public void test5539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5539");
        double double1 = org.apache.commons.math.util.FastMath.log10(11014.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.041945072145264d + "'", double1 == 4.041945072145264d);
    }

    @Test
    public void test5540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5540");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.4418411684567414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2284739872639117d + "'", double1 == 3.2284739872639117d);
    }

    @Test
    public void test5541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5541");
        double double1 = org.apache.commons.math.util.FastMath.abs(100.00000000000003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.00000000000003d + "'", double1 == 100.00000000000003d);
    }

    @Test
    public void test5542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5542");
        double double1 = org.apache.commons.math.util.FastMath.log(0.34488021217053316d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0645581333424115d) + "'", double1 == (-1.0645581333424115d));
    }

    @Test
    public void test5543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5543");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.8973512833173551d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.9526382490267222d) + "'", double1 == (-2.9526382490267222d));
    }

    @Test
    public void test5544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5544");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.3283064365386963E-10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3283064365386963E-10d + "'", double1 == 2.3283064365386963E-10d);
    }

    @Test
    public void test5545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5545");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9993832155237184d, (-0.9848929415691015d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9993832155237184d + "'", double2 == 0.9993832155237184d);
    }

    @Test
    public void test5546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5546");
        double double2 = org.apache.commons.math.util.FastMath.max(0.4081112474421564d, 35.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void test5547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5547");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.6082399792973231d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2159250373033931d) + "'", double1 == (-0.2159250373033931d));
    }

    @Test
    public void test5548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5548");
        double double2 = org.apache.commons.math.util.FastMath.min(5.298292365610485d, 7.951853132063153E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.951853132063153E-7d + "'", double2 == 7.951853132063153E-7d);
    }

    @Test
    public void test5549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5549");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8965647786762592d, 0.9970705359106596d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8968515932523886d + "'", double2 == 0.8968515932523886d);
    }

    @Test
    public void test5550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5550");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) 45.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7853981633974483d + "'", double1 == 0.7853981633974483d);
    }

    @Test
    public void test5551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5551");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.7076312586751927d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5552");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9468959422161157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.05456607333704717d) + "'", double1 == (-0.05456607333704717d));
    }

    @Test
    public void test5553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5553");
        double double1 = org.apache.commons.math.util.FastMath.exp(99.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6881171418160975E43d + "'", double1 == 2.6881171418160975E43d);
    }

    @Test
    public void test5554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5554");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.569270896282244d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.16645809349362d + "'", double1 == 1.16645809349362d);
    }

    @Test
    public void test5555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5555");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.132601058453798d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5556");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.2710663101885893d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5557");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 6L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.27941549819892586d) + "'", double1 == (-0.27941549819892586d));
    }

    @Test
    public void test5558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5558");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.7414193357820069d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6379868275818775d + "'", double1 == 0.6379868275818775d);
    }

    @Test
    public void test5559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5559");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.0000002279511566d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.899791817897942E-8d + "'", double1 == 9.899791817897942E-8d);
    }

    @Test
    public void test5560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5560");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 4, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test5561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5561");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.009730277093455045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999526612273403d + "'", double1 == 0.9999526612273403d);
    }

    @Test
    public void test5562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5562");
        double double2 = org.apache.commons.math.util.FastMath.max(2.8909283794231584d, 24.678686683130433d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 24.678686683130433d + "'", double2 == 24.678686683130433d);
    }

    @Test
    public void test5563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5563");
        long long1 = org.apache.commons.math.util.FastMath.round(992.483685087183d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 992L + "'", long1 == 992L);
    }

    @Test
    public void test5564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5564");
        double double1 = org.apache.commons.math.util.FastMath.log10(8.881784197001252E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-15.05149978319906d) + "'", double1 == (-15.05149978319906d));
    }

    @Test
    public void test5565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5565");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.01706848947107439d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01706848947107439d + "'", double1 == 0.01706848947107439d);
    }

    @Test
    public void test5566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5566");
        double double1 = org.apache.commons.math.util.FastMath.log(1.4073861552074949d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.34173419336074057d + "'", double1 == 0.34173419336074057d);
    }

    @Test
    public void test5567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5567");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.27631948176648663d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.27631948176648663d + "'", double1 == 0.27631948176648663d);
    }

    @Test
    public void test5568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5568");
        double double1 = org.apache.commons.math.util.FastMath.log((-3036.676314193363d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5569");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.9713697672395085d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test5570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5570");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.302585092994046d + "'", double1 == 2.302585092994046d);
    }

    @Test
    public void test5571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5571");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.6735424271045924d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04666211804473563d + "'", double1 == 0.04666211804473563d);
    }

    @Test
    public void test5572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5572");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.536829045004206d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2150201906932097d + "'", double1 == 1.2150201906932097d);
    }

    @Test
    public void test5573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5573");
        double double2 = org.apache.commons.math.util.FastMath.max(1.7992428657093575d, 1.4828196330754233d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7992428657093575d + "'", double2 == 1.7992428657093575d);
    }

    @Test
    public void test5574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5574");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.26485486485821585d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5575");
        long long1 = org.apache.commons.math.util.FastMath.round(96.10655605346267d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 96L + "'", long1 == 96L);
    }

    @Test
    public void test5576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5576");
        double double2 = org.apache.commons.math.util.FastMath.max(0.8119506301746697d, (-0.07492623841795108d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8119506301746697d + "'", double2 == 0.8119506301746697d);
    }

    @Test
    public void test5577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5577");
        float float2 = org.apache.commons.math.util.FastMath.max(1.5472906E7f, (float) 45L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5472906E7f + "'", float2 == 1.5472906E7f);
    }

    @Test
    public void test5578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5578");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 55L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 55.0f + "'", float1 == 55.0f);
    }

    @Test
    public void test5579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5579");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.1224236947215336d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5580");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.3089447962273203d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5581");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.8968515932523886d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7147613963190421d + "'", double1 == 0.7147613963190421d);
    }

    @Test
    public void test5582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5582");
        double double1 = org.apache.commons.math.util.FastMath.signum(84.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5583");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.2309594173407747d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2309594173407747d + "'", double1 == 1.2309594173407747d);
    }

    @Test
    public void test5584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5584");
        int int2 = org.apache.commons.math.util.FastMath.max((int) 'a', 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test5585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5585");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.0997501702946164d, 2.5999999999999996d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.40015915394355495d + "'", double2 == 0.40015915394355495d);
    }

    @Test
    public void test5586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5586");
        double double1 = org.apache.commons.math.util.FastMath.asin(215.5579348013961d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5587");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.8570531296713235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test5588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5588");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.5638717219103803d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test5589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5589");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.025630151592603893d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5590");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.6811167122883163d, 0.9428090415820634d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.625623792204324d + "'", double2 == 0.625623792204324d);
    }

    @Test
    public void test5591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5591");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.9234103443381365d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9384731635777024d + "'", double1 == 0.9384731635777024d);
    }

    @Test
    public void test5592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5592");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 28L, (-4.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.0f) + "'", float2 == (-4.0f));
    }

    @Test
    public void test5593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5593");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.011891368313492844d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011821221539798888d + "'", double1 == 0.011821221539798888d);
    }

    @Test
    public void test5594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5594");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7226544327451406d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6185508274133591d + "'", double1 == 0.6185508274133591d);
    }

    @Test
    public void test5595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5595");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.3521126124417233d, 28.000000000000004d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4659.723947308037d + "'", double2 == 4659.723947308037d);
    }

    @Test
    public void test5596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5596");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2049.000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.625595072132454d + "'", double1 == 7.625595072132454d);
    }

    @Test
    public void test5597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5597");
        long long1 = org.apache.commons.math.util.FastMath.round(0.5422969773856958d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test5598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5598");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.8862269254527579d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5599");
        double double2 = org.apache.commons.math.util.FastMath.min(0.784134301546406d, 0.021248852757409047d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.021248852757409047d + "'", double2 == 0.021248852757409047d);
    }

    @Test
    public void test5600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5600");
        double double1 = org.apache.commons.math.util.FastMath.sinh(8.881784197001246E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001246E-16d + "'", double1 == 8.881784197001246E-16d);
    }

    @Test
    public void test5601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5601");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.8060720191365187d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.239095565962494d + "'", double1 == 1.239095565962494d);
    }

    @Test
    public void test5602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5602");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.5127742681331149d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5664864884745471d + "'", double1 == 0.5664864884745471d);
    }

    @Test
    public void test5603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5603");
        double double1 = org.apache.commons.math.util.FastMath.ceil(4.85314001086485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test5604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5604");
        double double2 = org.apache.commons.math.util.FastMath.min(4.844187086458591d, 1.8746388394445976d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8746388394445976d + "'", double2 == 1.8746388394445976d);
    }

    @Test
    public void test5605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5605");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8365164337420496d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5799018512655504d + "'", double1 == 0.5799018512655504d);
    }

    @Test
    public void test5606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5606");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 35L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test5607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5607");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(28.94075637751001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1658.1831963476445d + "'", double1 == 1658.1831963476445d);
    }

    @Test
    public void test5608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5608");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.8795409825708094d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9581173253719134d) + "'", double1 == (-0.9581173253719134d));
    }

    @Test
    public void test5609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5609");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1752011936438014d) + "'", double1 == (-1.1752011936438014d));
    }

    @Test
    public void test5610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5610");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.3228658238308055d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9235079035981572d + "'", double1 == 0.9235079035981572d);
    }

    @Test
    public void test5611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5611");
        double double2 = org.apache.commons.math.util.FastMath.min(199.00499987500626d, 1.3074614241103386d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3074614241103386d + "'", double2 == 1.3074614241103386d);
    }

    @Test
    public void test5612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5612");
        double double1 = org.apache.commons.math.util.FastMath.log(0.11831214619987152d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.134428840403784d) + "'", double1 == (-2.134428840403784d));
    }

    @Test
    public void test5613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5613");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-1.0682441653224442d), 0.7629292891930134d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.068244165322444d) + "'", double2 == (-1.068244165322444d));
    }

    @Test
    public void test5614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5614");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9990552668871044d, 0.32681535598557454d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9990552668871043d + "'", double2 == 0.9990552668871043d);
    }

    @Test
    public void test5615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5615");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1477896L, (float) 84677176);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.4677176E7f + "'", float2 == 8.4677176E7f);
    }

    @Test
    public void test5616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5616");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-4.965964575911209E-6d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.8452881141118595E-4d) + "'", double1 == (-2.8452881141118595E-4d));
    }

    @Test
    public void test5617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5617");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.1279175336939193d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12722660407021483d + "'", double1 == 0.12722660407021483d);
    }

    @Test
    public void test5618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5618");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 53, (float) 57);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 53.0f + "'", float2 == 53.0f);
    }

    @Test
    public void test5619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5619");
        double double2 = org.apache.commons.math.util.FastMath.min(1.1670420650504933d, (-1.2599210498948732d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.2599210498948732d) + "'", double2 == (-1.2599210498948732d));
    }

    @Test
    public void test5620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5620");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 0L, 11013.232874695796d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test5621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5621");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.1034585241152786d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4889687749862388d + "'", double1 == 1.4889687749862388d);
    }

    @Test
    public void test5622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5622");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 5558L, 3.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5558.0f + "'", float2 == 5558.0f);
    }

    @Test
    public void test5623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5623");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.9839623687554913d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9628768152069855d + "'", double1 == 0.9628768152069855d);
    }

    @Test
    public void test5624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5624");
        double double1 = org.apache.commons.math.util.FastMath.sinh(34.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.930067261567098E14d + "'", double1 == 7.930067261567098E14d);
    }

    @Test
    public void test5625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5625");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.0595018713561494E-4d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5626");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9999526612273403d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.7339893174783004E-5d) + "'", double1 == (-4.7339893174783004E-5d));
    }

    @Test
    public void test5627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5627");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9922991399818323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6974291155723162d + "'", double1 == 2.6974291155723162d);
    }

    @Test
    public void test5628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5628");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.7051926755065845E12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15474.03585939394d + "'", double1 == 15474.03585939394d);
    }

    @Test
    public void test5629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5629");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-77.26503394947866d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5630");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.414213562373095d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9553166181245092d + "'", double1 == 0.9553166181245092d);
    }

    @Test
    public void test5631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5631");
        float float2 = org.apache.commons.math.util.FastMath.min((-2.0f), (float) 28L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test5632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5632");
        double double2 = org.apache.commons.math.util.FastMath.min(0.7103669532614669d, 0.5013507798060323d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5013507798060323d + "'", double2 == 0.5013507798060323d);
    }

    @Test
    public void test5633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5633");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 100, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test5634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5634");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 97, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test5635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5635");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.8809373872769856d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3799380148686868d + "'", double1 == 1.3799380148686868d);
    }

    @Test
    public void test5636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5636");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-53.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3036.676314193363d) + "'", double1 == (-3036.676314193363d));
    }

    @Test
    public void test5637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5637");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.0009877980461308d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test5638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5638");
        double double1 = org.apache.commons.math.util.FastMath.log(1.560196367709658d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4448116900765942d + "'", double1 == 0.4448116900765942d);
    }

    @Test
    public void test5639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5639");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.6275902047702033d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.20348407773031d + "'", double1 == 1.20348407773031d);
    }

    @Test
    public void test5640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5640");
        double double2 = org.apache.commons.math.util.FastMath.pow(13.781934843695915d, 0.320301064820172d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3169799080967435d + "'", double2 == 2.3169799080967435d);
    }

    @Test
    public void test5641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5641");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 0.8060720191365187d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test5642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5642");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.1751491377060278d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5643");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.006625404912081631d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.006625404912081631d + "'", double1 == 0.006625404912081631d);
    }

    @Test
    public void test5644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5644");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.199781099457594d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.425305228849993d + "'", double1 == 1.425305228849993d);
    }

    @Test
    public void test5645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5645");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.7360711750351105d, 0.9899950066593376d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7383312956481652d + "'", double2 == 0.7383312956481652d);
    }

    @Test
    public void test5646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5646");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.023676589738255212d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3565686652647782d + "'", double1 == 1.3565686652647782d);
    }

    @Test
    public void test5647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5647");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.5452489258696552d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49918823683717345d + "'", double1 == 0.49918823683717345d);
    }

    @Test
    public void test5648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5648");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test5649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5649");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.02125525174622087d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.6725337469025936d) + "'", double1 == (-1.6725337469025936d));
    }

    @Test
    public void test5650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5650");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-15.385301667943363d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999999999999134d) + "'", double1 == (-0.9999999999999134d));
    }

    @Test
    public void test5651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5651");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.27631948176648663d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5652");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.2764592626816602d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5653");
        long long1 = org.apache.commons.math.util.FastMath.abs(45L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 45L + "'", long1 == 45L);
    }

    @Test
    public void test5654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5654");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5655");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.3964729204944982d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5656");
        double double2 = org.apache.commons.math.util.FastMath.max(0.7425442460725571d, 0.0035151607961293246d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7425442460725571d + "'", double2 == 0.7425442460725571d);
    }

    @Test
    public void test5657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5657");
        double double1 = org.apache.commons.math.util.FastMath.sinh(4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 49.99500000000002d + "'", double1 == 49.99500000000002d);
    }

    @Test
    public void test5658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5658");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test5659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5659");
        double double2 = org.apache.commons.math.util.FastMath.max(0.21051295027658917d, 6.849561650499365E20d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.849561650499365E20d + "'", double2 == 6.849561650499365E20d);
    }

    @Test
    public void test5660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5660");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 416128);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5661");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.6437933524252503d, 54.653831440602524d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.011778928598537844d + "'", double2 == 0.011778928598537844d);
    }

    @Test
    public void test5662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5662");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.6433380240448354d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5663");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.0004446442786143d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5589319175923895d + "'", double1 == 1.5589319175923895d);
    }

    @Test
    public void test5664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5664");
        double double2 = org.apache.commons.math.util.FastMath.max(2.4219132975121505d, 0.21051295027658917d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4219132975121505d + "'", double2 == 2.4219132975121505d);
    }

    @Test
    public void test5665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5665");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.1316153248585041d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5666");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.3678794411714423d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.35251342177761896d + "'", double1 == 0.35251342177761896d);
    }

    @Test
    public void test5667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5667");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.3268153559855746d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.38654543622728665d + "'", double1 == 0.38654543622728665d);
    }

    @Test
    public void test5668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5668");
        double double2 = org.apache.commons.math.util.FastMath.min(1.3799380148686868d, (-3.114099791007893d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.114099791007893d) + "'", double2 == (-3.114099791007893d));
    }

    @Test
    public void test5669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5669");
        double double1 = org.apache.commons.math.util.FastMath.cosh(7.762595266812182d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1175.4992937548511d + "'", double1 == 1175.4992937548511d);
    }

    @Test
    public void test5670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5670");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) (-36));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5671");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.1072845368400976d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 120.73851019411804d + "'", double1 == 120.73851019411804d);
    }

    @Test
    public void test5672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5672");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.5427661770824743d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2182538856266794d + "'", double1 == 1.2182538856266794d);
    }

    @Test
    public void test5673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5673");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.7105940846527337d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9911951549090088d + "'", double1 == 0.9911951549090088d);
    }

    @Test
    public void test5674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5674");
        int int2 = org.apache.commons.math.util.FastMath.max(5, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test5675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5675");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.7206435247136849d, 0.11688393127179245d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9624314612760874d + "'", double2 == 0.9624314612760874d);
    }

    @Test
    public void test5676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5676");
        double double1 = org.apache.commons.math.util.FastMath.log10(4.15912713462618d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6190021959174035d + "'", double1 == 0.6190021959174035d);
    }

    @Test
    public void test5677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5677");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 1, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5678");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-1.7456418720467646d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2040699473456506d) + "'", double1 == (-1.2040699473456506d));
    }

    @Test
    public void test5679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5679");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) -1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5680");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.0133109241786307d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0133109241786302d + "'", double2 == 2.0133109241786302d);
    }

    @Test
    public void test5681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5681");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.4253120969346567d), 7.2638973976934554E18d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.42531209693465666d) + "'", double2 == (-0.42531209693465666d));
    }

    @Test
    public void test5682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5682");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) 28L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0365889718756627d + "'", double1 == 3.0365889718756627d);
    }

    @Test
    public void test5683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5683");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 32, (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test5684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5684");
        double double1 = org.apache.commons.math.util.FastMath.log(192.9948452238572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.262663479863525d + "'", double1 == 5.262663479863525d);
    }

    @Test
    public void test5685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5685");
        long long2 = org.apache.commons.math.util.FastMath.min(36L, 39481480091340L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 36L + "'", long2 == 36L);
    }

    @Test
    public void test5686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5686");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.6535657774206833d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011406874694347337d + "'", double1 == 0.011406874694347337d);
    }

    @Test
    public void test5687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5687");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.748779069440004E11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.748779069440004E11d + "'", double1 == 2.748779069440004E11d);
    }

    @Test
    public void test5688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5688");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(4.040168003889966E204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3148457514668943E206d + "'", double1 == 2.3148457514668943E206d);
    }

    @Test
    public void test5689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5689");
        double double1 = org.apache.commons.math.util.FastMath.abs(63.50393700787401d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 63.50393700787401d + "'", double1 == 63.50393700787401d);
    }

    @Test
    public void test5690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5690");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.37754243147639266d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36057130885140404d + "'", double1 == 0.36057130885140404d);
    }

    @Test
    public void test5691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5691");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.40992093582609207d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5692");
        double double1 = org.apache.commons.math.util.FastMath.acos(36.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5693");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.5029550818601886d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test5694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5694");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.0012941034727495246d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.00129410311154313d + "'", double1 == 0.00129410311154313d);
    }

    @Test
    public void test5695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5695");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 6, (long) (-4));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4L) + "'", long2 == (-4L));
    }

    @Test
    public void test5696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5696");
        double double2 = org.apache.commons.math.util.FastMath.pow((-86.33580274416313d), 0.015766241744913406d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test5697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5697");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-1.5544646780753981d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4719274375428872d + "'", double1 == 2.4719274375428872d);
    }

    @Test
    public void test5698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5698");
        long long2 = org.apache.commons.math.util.FastMath.min(57L, (long) (-53));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-53L) + "'", long2 == (-53L));
    }

    @Test
    public void test5699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5699");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.5585053606381855d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5700");
        long long2 = org.apache.commons.math.util.FastMath.min(274877906944L, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test5701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5701");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, (-2L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test5702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5702");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.3148457514668943E206d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5255592905123202d) + "'", double1 == (-0.5255592905123202d));
    }

    @Test
    public void test5703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5703");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-3.380515006246585d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.3805150062465845d) + "'", double1 == (-3.3805150062465845d));
    }

    @Test
    public void test5704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5704");
        double double1 = org.apache.commons.math.util.FastMath.log1p(3.4028045914528193d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4822417450149294d + "'", double1 == 1.4822417450149294d);
    }

    @Test
    public void test5705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5705");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.3127199080565219d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9515003168337755d + "'", double1 == 0.9515003168337755d);
    }

    @Test
    public void test5706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5706");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.7417440442090276d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9162927480809122d) + "'", double1 == (-0.9162927480809122d));
    }

    @Test
    public void test5707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5707");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.3112833096758056d, 0.5303019207992773d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3112833096758054d + "'", double2 == 1.3112833096758054d);
    }

    @Test
    public void test5708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5708");
        double double2 = org.apache.commons.math.util.FastMath.min(0.3283909087132568d, 97.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3283909087132568d + "'", double2 == 0.3283909087132568d);
    }

    @Test
    public void test5709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5709");
        double double2 = org.apache.commons.math.util.FastMath.atan2(6.157240911549055d, 2.6691802474911265E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707958932922472d + "'", double2 == 1.5707958932922472d);
    }

    @Test
    public void test5710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5710");
        double double1 = org.apache.commons.math.util.FastMath.signum(4.039222367276798E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5711");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) 55L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test5712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5712");
        int int2 = org.apache.commons.math.util.FastMath.min(52, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test5713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5713");
        int int2 = org.apache.commons.math.util.FastMath.max(53, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
    }

    @Test
    public void test5714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5714");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-1.6112949659561453d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.404832480311054d) + "'", double1 == (-2.404832480311054d));
    }

    @Test
    public void test5715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5715");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.921688867296064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.03541565814434553d) + "'", double1 == (-0.03541565814434553d));
    }

    @Test
    public void test5716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5716");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.40669796742333153d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.41800258125107864d) + "'", double1 == (-0.41800258125107864d));
    }

    @Test
    public void test5717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5717");
        double double2 = org.apache.commons.math.util.FastMath.min(4.281420761381717E21d, 2.749996267789066d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.749996267789066d + "'", double2 == 2.749996267789066d);
    }

    @Test
    public void test5718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5718");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.7201065497963348d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5719");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.31466697030166657d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3257168815772031d + "'", double1 == 0.3257168815772031d);
    }

    @Test
    public void test5720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5720");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.0026974917280683974d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.002697485185365283d + "'", double1 == 0.002697485185365283d);
    }

    @Test
    public void test5721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5721");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.0559214943204758d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4683682275564067d + "'", double1 == 1.4683682275564067d);
    }

    @Test
    public void test5722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5722");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.5668854225622851d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8276214977541574d + "'", double1 == 0.8276214977541574d);
    }

    @Test
    public void test5723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5723");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.6103789692086523d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6103789692086523d + "'", double1 == 0.6103789692086523d);
    }

    @Test
    public void test5724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5724");
        int int2 = org.apache.commons.math.util.FastMath.max((int) ' ', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test5725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5725");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.2602228186091414d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.25729587517940483d) + "'", double1 == (-0.25729587517940483d));
    }

    @Test
    public void test5726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5726");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.5874010519681996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9506539170750531d + "'", double1 == 0.9506539170750531d);
    }

    @Test
    public void test5727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5727");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.0798649870014492d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5728");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.8372393319006808d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6695159922750784d + "'", double1 == 0.6695159922750784d);
    }

    @Test
    public void test5729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5729");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(74.20994852478785d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 74.20994852478786d + "'", double1 == 74.20994852478786d);
    }

    @Test
    public void test5730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5730");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(63.50393700787401d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.968935751270304d + "'", double1 == 7.968935751270304d);
    }

    @Test
    public void test5731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5731");
        double double1 = org.apache.commons.math.util.FastMath.log1p(3.2395798055406804d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4444641618660718d + "'", double1 == 1.4444641618660718d);
    }

    @Test
    public void test5732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5732");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.5674991151269533d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.251998049170586d + "'", double1 == 1.251998049170586d);
    }

    @Test
    public void test5733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5733");
        double double1 = org.apache.commons.math.util.FastMath.tanh(13.781934843695916d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.999999999997861d + "'", double1 == 0.999999999997861d);
    }

    @Test
    public void test5734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5734");
        double double1 = org.apache.commons.math.util.FastMath.expm1(35.30685281944005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1556157735575925E15d + "'", double1 == 2.1556157735575925E15d);
    }

    @Test
    public void test5735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5735");
        double double1 = org.apache.commons.math.util.FastMath.atan(9.326148873149265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4639790534053778d + "'", double1 == 1.4639790534053778d);
    }

    @Test
    public void test5736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5736");
        float float2 = org.apache.commons.math.util.FastMath.max(35.0f, 53.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 53.0f + "'", float2 == 53.0f);
    }

    @Test
    public void test5737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5737");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9952300096280062d, 0.7266953932355397d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7266953932355397d + "'", double2 == 0.7266953932355397d);
    }

    @Test
    public void test5738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5738");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.3046768398228529d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5739");
        double double2 = org.apache.commons.math.util.FastMath.min(1.03908175332576d, (-36.04365338911715d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-36.04365338911715d) + "'", double2 == (-36.04365338911715d));
    }

    @Test
    public void test5740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5740");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-1.2031992972018404d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6997678580926362d) + "'", double1 == (-0.6997678580926362d));
    }

    @Test
    public void test5741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5741");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.009328131131954251d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6280660131038732E-4d + "'", double1 == 1.6280660131038732E-4d);
    }

    @Test
    public void test5742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5742");
        long long1 = org.apache.commons.math.util.FastMath.abs(96L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 96L + "'", long1 == 96L);
    }

    @Test
    public void test5743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5743");
        double double1 = org.apache.commons.math.util.FastMath.acosh(18.013888888888896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5835189384561104d + "'", double1 == 3.5835189384561104d);
    }

    @Test
    public void test5744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5744");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(352.78391767704466d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.065934266407987d + "'", double1 == 7.065934266407987d);
    }

    @Test
    public void test5745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5745");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9550315978940165d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9847800613130506d + "'", double1 == 0.9847800613130506d);
    }

    @Test
    public void test5746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5746");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(11013.232874695796d, 32.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11013.232874695794d + "'", double2 == 11013.232874695794d);
    }

    @Test
    public void test5747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5747");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.30557409445340483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005333274057012056d + "'", double1 == 0.005333274057012056d);
    }

    @Test
    public void test5748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5748");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.20414594311450418d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.20273091198900292d) + "'", double1 == (-0.20273091198900292d));
    }

    @Test
    public void test5749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5749");
        long long2 = org.apache.commons.math.util.FastMath.min(2L, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test5750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5750");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.5860134523134308E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.25d + "'", double1 == 0.25d);
    }

    @Test
    public void test5751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5751");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.43442052080657173d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9071140885834325d + "'", double1 == 0.9071140885834325d);
    }

    @Test
    public void test5752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5752");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.0798649870014492d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5753");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 6);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 6L + "'", long1 == 6L);
    }

    @Test
    public void test5754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5754");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.0788418462814133d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5755");
        double double1 = org.apache.commons.math.util.FastMath.acos(4.851644805886466E9d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5756");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.6114619437197315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test5757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5757");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5758");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.4262213939948603d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test5759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5759");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, 1586013452313419L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5760");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.7841343015464058d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5761");
        long long2 = org.apache.commons.math.util.FastMath.max(9223372036854775807L, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
    }

    @Test
    public void test5762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5762");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5763");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.9934865306650267d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0273949957959574d + "'", double1 == 3.0273949957959574d);
    }

    @Test
    public void test5764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5764");
        double double2 = org.apache.commons.math.util.FastMath.pow(11013.232920103323d, 1.7711544466071394d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4416353194738101E7d + "'", double2 == 1.4416353194738101E7d);
    }

    @Test
    public void test5765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5765");
        double double1 = org.apache.commons.math.util.FastMath.cosh(54.4780803985937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2829673798684508E23d + "'", double1 == 2.2829673798684508E23d);
    }

    @Test
    public void test5766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5766");
        double double1 = org.apache.commons.math.util.FastMath.exp((-4.7339893174783004E-5d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999526612273403d + "'", double1 == 0.9999526612273403d);
    }

    @Test
    public void test5767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5767");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0028590734924855603d, 5.2437141131408894E22d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0028590734924855607d + "'", double2 == 0.0028590734924855607d);
    }

    @Test
    public void test5768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5768");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.2464988104479273d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.35150619296419316d + "'", double1 == 0.35150619296419316d);
    }

    @Test
    public void test5769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5769");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 10, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test5770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5770");
        double double1 = org.apache.commons.math.util.FastMath.expm1(4.377725567322862d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 78.6566535193896d + "'", double1 == 78.6566535193896d);
    }

    @Test
    public void test5771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5771");
        double double1 = org.apache.commons.math.util.FastMath.atan(20.085536923187668d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5210503339560446d + "'", double1 == 1.5210503339560446d);
    }

    @Test
    public void test5772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5772");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.11994633011584259d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.11965892319205529d) + "'", double1 == (-0.11965892319205529d));
    }

    @Test
    public void test5773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5773");
        double double1 = org.apache.commons.math.util.FastMath.ulp(96.84399620220857d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test5774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5774");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.2723414689118315d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.27939113541057986d) + "'", double1 == (-0.27939113541057986d));
    }

    @Test
    public void test5775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5775");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.0000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1073424338879928E-8d + "'", double1 == 2.1073424338879928E-8d);
    }

    @Test
    public void test5776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5776");
        double double2 = org.apache.commons.math.util.FastMath.min(1.0192640011039094d, 0.01110465023619529d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.01110465023619529d + "'", double2 == 0.01110465023619529d);
    }

    @Test
    public void test5777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5777");
        float float2 = org.apache.commons.math.util.FastMath.max(2.14748365E9f, (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test5778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5778");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.7399788154926485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5779");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.5310724756574393d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.009268963266939753d) + "'", double1 == (-0.009268963266939753d));
    }

    @Test
    public void test5780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5780");
        double double1 = org.apache.commons.math.util.FastMath.ceil(14.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.0d + "'", double1 == 14.0d);
    }

    @Test
    public void test5781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5781");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9651775697905436d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9824345117057643d + "'", double1 == 0.9824345117057643d);
    }

    @Test
    public void test5782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5782");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.159396881398953d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.275257407030804d + "'", double1 == 4.275257407030804d);
    }

    @Test
    public void test5783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5783");
        double double1 = org.apache.commons.math.util.FastMath.log(1.5545602336450495d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4411926976881834d + "'", double1 == 0.4411926976881834d);
    }

    @Test
    public void test5784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5784");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(8044516.569932792d, 0.6437933524252503d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8044516.569932791d + "'", double2 == 8044516.569932791d);
    }

    @Test
    public void test5785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5785");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 15472906L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.865322106026485E8d + "'", double1 == 8.865322106026485E8d);
    }

    @Test
    public void test5786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5786");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.057233205734539244d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5787");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 3L, 9.223372E18f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test5788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5788");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.3162739259961891d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5789");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.8757729564429687d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0670347395032962d + "'", double1 == 1.0670347395032962d);
    }

    @Test
    public void test5790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5790");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.011406874694347337d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5791");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-29.500939575070156d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.243883679799138E12d + "'", double1 == 3.243883679799138E12d);
    }

    @Test
    public void test5792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5792");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.647653479929832d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.523272206011415d + "'", double1 == 0.523272206011415d);
    }

    @Test
    public void test5793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5793");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.09950371902099892d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09966799788222286d + "'", double1 == 0.09966799788222286d);
    }

    @Test
    public void test5794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5794");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.357332604544835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3573326045448353d + "'", double1 == 1.3573326045448353d);
    }

    @Test
    public void test5795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5795");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 992L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 992.0f + "'", float1 == 992.0f);
    }

    @Test
    public void test5796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5796");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.3106472496723418d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.25722461567215d + "'", double1 == 0.25722461567215d);
    }

    @Test
    public void test5797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5797");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.6691802474974652E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6691802474911265E-6d + "'", double1 == 2.6691802474911265E-6d);
    }

    @Test
    public void test5798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5798");
        float float2 = org.apache.commons.math.util.FastMath.max(36.0f, (float) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test5799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5799");
        double double2 = org.apache.commons.math.util.FastMath.max(1.4593566380802732d, (-1.5707963267948963d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4593566380802732d + "'", double2 == 1.4593566380802732d);
    }

    @Test
    public void test5800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5800");
        double double1 = org.apache.commons.math.util.FastMath.tanh(966980.6941481612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5801");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.862645149230957E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.862645149230957E-9d + "'", double1 == 1.862645149230957E-9d);
    }

    @Test
    public void test5802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5802");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 3.9481478E13f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5803");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.36341525809683245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.822160499606017d + "'", double1 == 20.822160499606017d);
    }

    @Test
    public void test5804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5804");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.0037614532268226615d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5805");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 35L, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test5806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5806");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.0038586340573412d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1811641407394071d + "'", double1 == 1.1811641407394071d);
    }

    @Test
    public void test5807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5807");
        int int1 = org.apache.commons.math.util.FastMath.round(2.15561577E15f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test5808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5808");
        double double2 = org.apache.commons.math.util.FastMath.min(7.4764165040274095d, 1.0732851129357383E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0732851129357383E-4d + "'", double2 == 1.0732851129357383E-4d);
    }

    @Test
    public void test5809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5809");
        double double2 = org.apache.commons.math.util.FastMath.min(0.5896069690147185d, 2.231911890816295d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5896069690147185d + "'", double2 == 0.5896069690147185d);
    }

    @Test
    public void test5810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5810");
        long long1 = org.apache.commons.math.util.FastMath.round(4.3368086899420177E-19d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test5811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5811");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2147483647, 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test5812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5812");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.4596752561822718d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8961966196779236d + "'", double1 == 0.8961966196779236d);
    }

    @Test
    public void test5813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5813");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9906175883772129d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.836364683622981d + "'", double1 == 0.836364683622981d);
    }

    @Test
    public void test5814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5814");
        long long2 = org.apache.commons.math.util.FastMath.min(26L, 6L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6L + "'", long2 == 6L);
    }

    @Test
    public void test5815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5815");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.3148457514668943E206d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5816");
        double double1 = org.apache.commons.math.util.FastMath.log10(5.303304908059076d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7245465971507706d + "'", double1 == 0.7245465971507706d);
    }

    @Test
    public void test5817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5817");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.057233205734539244d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5818");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 416128L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5819");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.762613918721344d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06567000136305376d + "'", double1 == 0.06567000136305376d);
    }

    @Test
    public void test5820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5820");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.0589027237910784d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.48982900228029397d + "'", double1 == 0.48982900228029397d);
    }

    @Test
    public void test5821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5821");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.4868981666828483d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5085350159312664d) + "'", double1 == (-0.5085350159312664d));
    }

    @Test
    public void test5822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5822");
        double double1 = org.apache.commons.math.util.FastMath.atan(77.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5578100438747242d + "'", double1 == 1.5578100438747242d);
    }

    @Test
    public void test5823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5823");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.01110465023619529d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011104878473958486d + "'", double1 == 0.011104878473958486d);
    }

    @Test
    public void test5824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5824");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) 84677176L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5825");
        double double2 = org.apache.commons.math.util.FastMath.atan2(148.80597572185025d, 0.7925622793797507d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5654702316482487d + "'", double2 == 1.5654702316482487d);
    }

    @Test
    public void test5826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5826");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.4508027339032588d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02532128450354703d + "'", double1 == 0.02532128450354703d);
    }

    @Test
    public void test5827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5827");
        float float2 = org.apache.commons.math.util.FastMath.min(2.74877907E11f, 53.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 53.0f + "'", float2 == 53.0f);
    }

    @Test
    public void test5828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5828");
        double double1 = org.apache.commons.math.util.FastMath.signum(74.20994852478785d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5829");
        double double2 = org.apache.commons.math.util.FastMath.max(9.306831672164943d, 0.0026285273327564763d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.306831672164943d + "'", double2 == 9.306831672164943d);
    }

    @Test
    public void test5830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5830");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.0002284177042067d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8415943774673813d + "'", double1 == 0.8415943774673813d);
    }

    @Test
    public void test5831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5831");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) 96L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9822712330395684d + "'", double1 == 1.9822712330395684d);
    }

    @Test
    public void test5832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5832");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.8286413964890955d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 46.00000000000002d + "'", double1 == 46.00000000000002d);
    }

    @Test
    public void test5833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5833");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.8774490568828722d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5834");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.0327340166022558d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5835");
        float float2 = org.apache.commons.math.util.FastMath.max((-4.0f), 5.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test5836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5836");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test5837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5837");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.0026974949994306666d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0026938632893418863d + "'", double1 == 0.0026938632893418863d);
    }

    @Test
    public void test5838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5838");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.0035151607961293246d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999938218286504d + "'", double1 == 0.9999938218286504d);
    }

    @Test
    public void test5839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5839");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 28L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28 + "'", int1 == 28);
    }

    @Test
    public void test5840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5840");
        long long2 = org.apache.commons.math.util.FastMath.min(1477896L, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test5841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5841");
        float float2 = org.apache.commons.math.util.FastMath.min(2.14748365E9f, 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test5842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5842");
        double double1 = org.apache.commons.math.util.FastMath.abs(148.99999999999997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 148.99999999999997d + "'", double1 == 148.99999999999997d);
    }

    @Test
    public void test5843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5843");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.614586012538512d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6540131316009389d + "'", double1 == 0.6540131316009389d);
    }

    @Test
    public void test5844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5844");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.7629292891930134d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6517246316790853d + "'", double1 == 0.6517246316790853d);
    }

    @Test
    public void test5845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5845");
        long long1 = org.apache.commons.math.util.FastMath.round(1.9689724168752079d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test5846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5846");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.6803629519678808d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5847");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2155615773557597L, (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test5848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5848");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.34555558058171215d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test5849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5849");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.49670059543249345d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7047698882844623d + "'", double1 == 0.7047698882844623d);
    }

    @Test
    public void test5850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5850");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9632991984933736d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9632991984933738d + "'", double1 == 0.9632991984933738d);
    }

    @Test
    public void test5851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5851");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.021373301521365424d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5852");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.5422969773856958d, 0.8662137645563011d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5422969773856959d + "'", double2 == 0.5422969773856959d);
    }

    @Test
    public void test5853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5853");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5854");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(5.306858963633532d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09262216185437916d + "'", double1 == 0.09262216185437916d);
    }

    @Test
    public void test5855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5855");
        double double1 = org.apache.commons.math.util.FastMath.exp(46.00000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.496119420602651E19d + "'", double1 == 9.496119420602651E19d);
    }

    @Test
    public void test5856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5856");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.0467596981169403d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.018269403209322497d + "'", double1 == 0.018269403209322497d);
    }

    @Test
    public void test5857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5857");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 52, (-4L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4L) + "'", long2 == (-4L));
    }

    @Test
    public void test5858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5858");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) 28L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4471580313422192d + "'", double1 == 1.4471580313422192d);
    }

    @Test
    public void test5859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5859");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) 32);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8342233605065102d + "'", double1 == 0.8342233605065102d);
    }

    @Test
    public void test5860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5860");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.0454926245955656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.598159103388802d + "'", double1 == 1.598159103388802d);
    }

    @Test
    public void test5861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5861");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.6275902047702033d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5338767858417175d + "'", double1 == 0.5338767858417175d);
    }

    @Test
    public void test5862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5862");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9550315978940165d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1069763556213847d + "'", double1 == 1.1069763556213847d);
    }

    @Test
    public void test5863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5863");
        double double1 = org.apache.commons.math.util.FastMath.floor(19.569197741437403d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 19.0d + "'", double1 == 19.0d);
    }

    @Test
    public void test5864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5864");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9926395119337849d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9926395119337849d + "'", double1 == 0.9926395119337849d);
    }

    @Test
    public void test5865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5865");
        double double2 = org.apache.commons.math.util.FastMath.max(2.0584642065884995d, 1.5589319175923895d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0584642065884995d + "'", double2 == 2.0584642065884995d);
    }

    @Test
    public void test5866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5866");
        double double1 = org.apache.commons.math.util.FastMath.ulp(7.6035750265302235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test5867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5867");
        long long2 = org.apache.commons.math.util.FastMath.min(416128L, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test5868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5868");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(44.78115991081384d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5511180743491364d + "'", double1 == 3.5511180743491364d);
    }

    @Test
    public void test5869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5869");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.7966043547446022d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7966043547446022d + "'", double1 == 0.7966043547446022d);
    }

    @Test
    public void test5870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5870");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.6203272079179196d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9246716726944555d + "'", double1 == 0.9246716726944555d);
    }

    @Test
    public void test5871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5871");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (short) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test5872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5872");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 4L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0634370688955608d + "'", double1 == 2.0634370688955608d);
    }

    @Test
    public void test5873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5873");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.2280945400058982d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.414716727196769d + "'", double1 == 3.414716727196769d);
    }

    @Test
    public void test5874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5874");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9294662936171667d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5331568547961711d + "'", double1 == 1.5331568547961711d);
    }

    @Test
    public void test5875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5875");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.0221161044594675d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8532136103204698d + "'", double1 == 0.8532136103204698d);
    }

    @Test
    public void test5876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5876");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.0537144249814574d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05329737113157181d + "'", double1 == 0.05329737113157181d);
    }

    @Test
    public void test5877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5877");
        long long2 = org.apache.commons.math.util.FastMath.max(39481480091340L, (long) (-4));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 39481480091340L + "'", long2 == 39481480091340L);
    }

    @Test
    public void test5878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5878");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.7748700530452005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 44.39678371056821d + "'", double1 == 44.39678371056821d);
    }

    @Test
    public void test5879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5879");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.006611020084001d, 1.9822712330395684d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.013147383459829d + "'", double2 == 1.013147383459829d);
    }

    @Test
    public void test5880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5880");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.3234882492226412d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test5881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5881");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.5840734641020676d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6237381136780014d + "'", double1 == 0.6237381136780014d);
    }

    @Test
    public void test5882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5882");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test5883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5883");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.2917098371502295d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5884");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 4, (float) 4);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test5885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5885");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.9987219253646197d), 0.556667905035692d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0623045387468983d) + "'", double2 == (-1.0623045387468983d));
    }

    @Test
    public void test5886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5886");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.4444641618660718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8938259422075032d + "'", double1 == 0.8938259422075032d);
    }

    @Test
    public void test5887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5887");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.12627697313707573d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.12661500383639537d) + "'", double1 == (-0.12661500383639537d));
    }

    @Test
    public void test5888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5888");
        double double1 = org.apache.commons.math.util.FastMath.atan(17.322108077097887d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.51313063704041d + "'", double1 == 1.51313063704041d);
    }

    @Test
    public void test5889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5889");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.5433467420946743d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test5890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5890");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.5623823663631259d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5097429109888841d + "'", double1 == 0.5097429109888841d);
    }

    @Test
    public void test5891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5891");
        double double2 = org.apache.commons.math.util.FastMath.min(0.35150619296419316d, 0.881370696966641d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.35150619296419316d + "'", double2 == 0.35150619296419316d);
    }

    @Test
    public void test5892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5892");
        double double1 = org.apache.commons.math.util.FastMath.ceil(77.35348403241947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 78.0d + "'", double1 == 78.0d);
    }

    @Test
    public void test5893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5893");
        double double1 = org.apache.commons.math.util.FastMath.asin(104.94284158531254d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5894");
        int int1 = org.apache.commons.math.util.FastMath.abs(4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test5895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5895");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.3573326045448348d, 5.8658557382779835d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.002312262538282d + "'", double2 == 6.002312262538282d);
    }

    @Test
    public void test5896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5896");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.8480859447769493d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.598384287471028d + "'", double1 == 8.598384287471028d);
    }

    @Test
    public void test5897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5897");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.43338071209297463d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.44707485970024896d + "'", double1 == 0.44707485970024896d);
    }

    @Test
    public void test5898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5898");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) 149.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 149.0d + "'", double1 == 149.0d);
    }

    @Test
    public void test5899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5899");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(3.0530864679749365d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 174.92896910346724d + "'", double1 == 174.92896910346724d);
    }

    @Test
    public void test5900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5900");
        double double1 = org.apache.commons.math.util.FastMath.rint((-1.9323667197459253d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test5901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5901");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 10, (float) 15472906L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test5902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5902");
        float float2 = org.apache.commons.math.util.FastMath.min(11013.0f, (float) 274877906944L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11013.0f + "'", float2 == 11013.0f);
    }

    @Test
    public void test5903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5903");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.4419647419307422d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2008183634216885d + "'", double1 == 1.2008183634216885d);
    }

    @Test
    public void test5904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5904");
        double double1 = org.apache.commons.math.util.FastMath.tan(30.772666314109507d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.749623682035209d) + "'", double1 == (-0.749623682035209d));
    }

    @Test
    public void test5905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5905");
        float float2 = org.apache.commons.math.util.FastMath.max(97.0f, (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test5906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5906");
        double double1 = org.apache.commons.math.util.FastMath.log(2.56173368499807d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9406842499833806d + "'", double1 == 0.9406842499833806d);
    }

    @Test
    public void test5907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5907");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.58601345231343E15d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5908");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.10757413843619562d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5909");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.9429832520348356d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.610535769400057d) + "'", double1 == (-0.610535769400057d));
    }

    @Test
    public void test5910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5910");
        int int1 = org.apache.commons.math.util.FastMath.round(55.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 55 + "'", int1 == 55);
    }

    @Test
    public void test5911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5911");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-1.2554125869476498d), (-1.1321790744880604d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.2554125869476496d) + "'", double2 == (-1.2554125869476496d));
    }

    @Test
    public void test5912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5912");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.4535367551487675d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8975305571361484d + "'", double1 == 0.8975305571361484d);
    }

    @Test
    public void test5913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5913");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.5896069690147183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6770633813383413d + "'", double1 == 0.6770633813383413d);
    }

    @Test
    public void test5914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5914");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 55, (float) 15472906);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 55.0f + "'", float2 == 55.0f);
    }

    @Test
    public void test5915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5915");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.08560294061168246d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6565041614446792d + "'", double1 == 1.6565041614446792d);
    }

    @Test
    public void test5916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5916");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.8554182836643194d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8554182836643194d + "'", double1 == 0.8554182836643194d);
    }

    @Test
    public void test5917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5917");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.7907435667822754d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7108764319918052d) + "'", double1 == (-0.7108764319918052d));
    }

    @Test
    public void test5918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5918");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 1477896L, 1.0314323214767873d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2309777.270505642d + "'", double2 == 2309777.270505642d);
    }

    @Test
    public void test5919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5919");
        double double1 = org.apache.commons.math.util.FastMath.floor(6.072857379539184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.0d + "'", double1 == 6.0d);
    }

    @Test
    public void test5920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5920");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.297288184003927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0445165537976555d + "'", double1 == 1.0445165537976555d);
    }

    @Test
    public void test5921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5921");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.7237289657353609d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5922");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.3211090992020036d, 2.8909283794231584d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3211090992020038d + "'", double2 == 1.3211090992020038d);
    }

    @Test
    public void test5923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5923");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.05326119751852293d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05328638258660904d + "'", double1 == 0.05328638258660904d);
    }

    @Test
    public void test5924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5924");
        double double1 = org.apache.commons.math.util.FastMath.cos(30.6034126950388d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.687675513571108d + "'", double1 == 0.687675513571108d);
    }

    @Test
    public void test5925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5925");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 96L, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 96.0f + "'", float2 == 96.0f);
    }

    @Test
    public void test5926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5926");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.45482676655224064d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7690395437782217d) + "'", double1 == (-0.7690395437782217d));
    }

    @Test
    public void test5927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5927");
        long long1 = org.apache.commons.math.util.FastMath.round(1.05042677562564d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test5928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5928");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 4.0f, 6.849561650499365E20d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5929");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.0484411939287768d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.048441193928777d + "'", double1 == 1.048441193928777d);
    }

    @Test
    public void test5930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5930");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.9117339147869651d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7905667351815867d) + "'", double1 == (-0.7905667351815867d));
    }

    @Test
    public void test5931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5931");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.403108691970989E-6d, 1.356568665264778d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7714611530551837E-6d + "'", double2 == 1.7714611530551837E-6d);
    }

    @Test
    public void test5932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5932");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.7588984970945903d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6881226183630952d + "'", double1 == 0.6881226183630952d);
    }

    @Test
    public void test5933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5933");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.9754001961551924d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9754001961551924d + "'", double1 == 0.9754001961551924d);
    }

    @Test
    public void test5934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5934");
        double double2 = org.apache.commons.math.util.FastMath.pow((-3.1979842669242053d), 288.86094539228486d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test5935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5935");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 100, (float) 57L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test5936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5936");
        int int2 = org.apache.commons.math.util.FastMath.min((-36), (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-36) + "'", int2 == (-36));
    }

    @Test
    public void test5937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5937");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.3603078162116136d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5938");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.10757413843619563d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1073677333361692d + "'", double1 == 0.1073677333361692d);
    }

    @Test
    public void test5939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5939");
        int int2 = org.apache.commons.math.util.FastMath.min(32, 15472906);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test5940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5940");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-57.29577951308232d) + "'", double1 == (-57.29577951308232d));
    }

    @Test
    public void test5941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5941");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-4), (float) 36L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.0f) + "'", float2 == (-4.0f));
    }

    @Test
    public void test5942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5942");
        double double1 = org.apache.commons.math.util.FastMath.signum(3036.676314193363d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5943");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.7554612895086841d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9855566614434984d + "'", double1 == 0.9855566614434984d);
    }

    @Test
    public void test5944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5944");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.302585092994046d + "'", double1 == 2.302585092994046d);
    }

    @Test
    public void test5945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5945");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.3686469200204927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04134068757158039d + "'", double1 == 0.04134068757158039d);
    }

    @Test
    public void test5946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5946");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '4', (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5947");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) (-36L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3195228302435696E-16d + "'", double1 == 2.3195228302435696E-16d);
    }

    @Test
    public void test5948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5948");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.614586012538512d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.21141732814483233d) + "'", double1 == (-0.21141732814483233d));
    }

    @Test
    public void test5949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5949");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.7748700530452005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5950");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.4271591231967482d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 81.77019445276477d + "'", double1 == 81.77019445276477d);
    }

    @Test
    public void test5951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5951");
        long long2 = org.apache.commons.math.util.FastMath.min(9223372036854775807L, (long) (-53));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-53L) + "'", long2 == (-53L));
    }

    @Test
    public void test5952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5952");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.4650188248182272d, 0.3600357884336912d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3298168749545565d + "'", double2 == 1.3298168749545565d);
    }

    @Test
    public void test5953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5953");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.7849678260893329d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0581840032117762d) + "'", double1 == (-1.0581840032117762d));
    }

    @Test
    public void test5954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5954");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 5, 3.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test5955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5955");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9963655798023592d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5450279681718437d + "'", double1 == 1.5450279681718437d);
    }

    @Test
    public void test5956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5956");
        long long2 = org.apache.commons.math.util.FastMath.min(149L, 45L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 45L + "'", long2 == 45L);
    }

    @Test
    public void test5957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5957");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.3730212381267685d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.006510448785177916d) + "'", double1 == (-0.006510448785177916d));
    }

    @Test
    public void test5958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5958");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5707962024866189d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9171523159231902d + "'", double1 == 0.9171523159231902d);
    }

    @Test
    public void test5959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5959");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.7852097698166124d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7210773218691856d + "'", double1 == 0.7210773218691856d);
    }

    @Test
    public void test5960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5960");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) (-2.0f), 1.08473267747442d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.9999999999999998d) + "'", double2 == (-1.9999999999999998d));
    }

    @Test
    public void test5961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5961");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.7755575615628914E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test5962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5962");
        double double1 = org.apache.commons.math.util.FastMath.acos(57.292734699501686d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5963");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 55, (long) 53);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 55L + "'", long2 == 55L);
    }

    @Test
    public void test5964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5964");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 2L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test5965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5965");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-1.162447351509626d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0514559851130003d) + "'", double1 == (-1.0514559851130003d));
    }

    @Test
    public void test5966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5966");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 4, 1586013452313419L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test5967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5967");
        int int2 = org.apache.commons.math.util.FastMath.min(15472906, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test5968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5968");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.7367922631517189d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5213531713147186d) + "'", double1 == (-0.5213531713147186d));
    }

    @Test
    public void test5969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5969");
        long long2 = org.apache.commons.math.util.FastMath.min(32L, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test5970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5970");
        double double1 = org.apache.commons.math.util.FastMath.sin(4.267909605184542d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9028346501073946d) + "'", double1 == (-0.9028346501073946d));
    }

    @Test
    public void test5971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5971");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.7076312586751926d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6091893082042464d) + "'", double1 == (-0.6091893082042464d));
    }

    @Test
    public void test5972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5972");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9984579799537394d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5521381569387243d + "'", double1 == 1.5521381569387243d);
    }

    @Test
    public void test5973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5973");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.5815258540844123d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6573514531697934d) + "'", double1 == (-0.6573514531697934d));
    }

    @Test
    public void test5974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5974");
        int int2 = org.apache.commons.math.util.FastMath.max(2, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test5975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5975");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-1.6112949659561453d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5976");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.0997501702946164d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4538187573398871d + "'", double1 == 0.4538187573398871d);
    }

    @Test
    public void test5977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5977");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.2228636002804178E-47d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.222863600280418E-47d + "'", double1 == 1.222863600280418E-47d);
    }

    @Test
    public void test5978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5978");
        double double1 = org.apache.commons.math.util.FastMath.signum(7.930067261567154E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5979");
        double double1 = org.apache.commons.math.util.FastMath.acos(27.308232836016487d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5980");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 416128);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 416128L + "'", long1 == 416128L);
    }

    @Test
    public void test5981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5981");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.5433467420946743d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1556362859261584d + "'", double1 == 1.1556362859261584d);
    }

    @Test
    public void test5982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5982");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.193861478082777d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5261269750759006d + "'", double1 == 2.5261269750759006d);
    }

    @Test
    public void test5983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5983");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.7453292519943295d, 0.6103789692086523d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7453292519943293d + "'", double2 == 1.7453292519943293d);
    }

    @Test
    public void test5984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5984");
        double double1 = org.apache.commons.math.util.FastMath.signum(135.7134716738357d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5985");
        double double1 = org.apache.commons.math.util.FastMath.expm1(9.0871877068532832E16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5986");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(3.399216241149525E248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3992162411495254E248d + "'", double1 == 3.3992162411495254E248d);
    }

    @Test
    public void test5987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5987");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.5258817486693113d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test5988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5988");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 52, (float) (-36));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test5989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5989");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 416128);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 416128 + "'", int1 == 416128);
    }

    @Test
    public void test5990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5990");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.5520864868395452d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6159796876652948d) + "'", double1 == (-0.6159796876652948d));
    }

    @Test
    public void test5991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5991");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.5954732329718483d, (-0.7465363222182906d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4725617387019807d + "'", double2 == 1.4725617387019807d);
    }

    @Test
    public void test5992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5992");
        long long2 = org.apache.commons.math.util.FastMath.min(10L, 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test5993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5993");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.5664864884745471d, 0.0078125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.557006051274013d + "'", double2 == 1.557006051274013d);
    }

    @Test
    public void test5994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5994");
        double double1 = org.apache.commons.math.util.FastMath.rint(238.30043127241947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 238.0d + "'", double1 == 238.0d);
    }

    @Test
    public void test5995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5995");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1936674.200214744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5996");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.0026285303595750607d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.002628536413256146d + "'", double1 == 0.002628536413256146d);
    }

    @Test
    public void test5997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5997");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9171523356672744d, 17.986111111111118d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.21109027286148008d + "'", double2 == 0.21109027286148008d);
    }

    @Test
    public void test5998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5998");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.3966070444871779d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8846160456277937d + "'", double1 == 0.8846160456277937d);
    }

    @Test
    public void test5999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5999");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.0001523125762564d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.00005076828129d + "'", double1 == 1.00005076828129d);
    }

    @Test
    public void test6000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test6000");
        double double1 = org.apache.commons.math.util.FastMath.acos(363.7080191456556d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }
}

