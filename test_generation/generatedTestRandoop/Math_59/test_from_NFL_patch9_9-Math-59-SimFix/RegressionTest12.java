import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12 {

    public static boolean debug = false;

    @Test
    public void test6001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6001");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.8113741275700294d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9464991302401815d + "'", double1 == 0.9464991302401815d);
    }

    @Test
    public void test6002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6002");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.0011324571552026256d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6003");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 1833);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6004");
        double double2 = org.apache.commons.math.util.FastMath.min(11013.232920103323d, 3.4657359027997265d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.4657359027997265d + "'", double2 == 3.4657359027997265d);
    }

    @Test
    public void test6005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6005");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 8);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 8L + "'", long1 == 8L);
    }

    @Test
    public void test6006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6006");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.240152057753145E41d, 0.9223834135669848d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.015667408324871E37d + "'", double2 == 8.015667408324871E37d);
    }

    @Test
    public void test6007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6007");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 175, 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 175L + "'", long2 == 175L);
    }

    @Test
    public void test6008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6008");
        double double1 = org.apache.commons.math.util.FastMath.cos(5.551115123125784E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6009");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.09995276840535378d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.09962188831741307d) + "'", double1 == (-0.09962188831741307d));
    }

    @Test
    public void test6010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6010");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-1.0899797098486261d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6011");
        double double1 = org.apache.commons.math.util.FastMath.expm1(10.067661995777765d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 23567.39729090051d + "'", double1 == 23567.39729090051d);
    }

    @Test
    public void test6012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6012");
        int int1 = org.apache.commons.math.util.FastMath.abs(14);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 14 + "'", int1 == 14);
    }

    @Test
    public void test6013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6013");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) 53L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 53.0d + "'", double1 == 53.0d);
    }

    @Test
    public void test6014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6014");
        double double2 = org.apache.commons.math.util.FastMath.max(35.00000000000001d, (double) 72L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 72.0d + "'", double2 == 72.0d);
    }

    @Test
    public void test6015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6015");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.0530864679749365d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 21.18061693582445d + "'", double1 == 21.18061693582445d);
    }

    @Test
    public void test6016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6016");
        float float2 = org.apache.commons.math.util.FastMath.min(14.0f, 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 14.0f + "'", float2 == 14.0f);
    }

    @Test
    public void test6017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6017");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) (-53.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6018");
        int int2 = org.apache.commons.math.util.FastMath.max(11013, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11013 + "'", int2 == 11013);
    }

    @Test
    public void test6019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6019");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.951998196031877d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.259698831624174d) + "'", double1 == (-1.259698831624174d));
    }

    @Test
    public void test6020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6020");
        int int2 = org.apache.commons.math.util.FastMath.min(2, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6021");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.1834687238125812d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.003202133304961666d) + "'", double1 == (-0.003202133304961666d));
    }

    @Test
    public void test6022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6022");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 10L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test6023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6023");
        double double1 = org.apache.commons.math.util.FastMath.rint(5.2771399790034055d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test6024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6024");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.0000023669425406d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000023669425409d + "'", double1 == 1.0000023669425409d);
    }

    @Test
    public void test6025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6025");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 10, (-36.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-36.0f) + "'", float2 == (-36.0f));
    }

    @Test
    public void test6026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6026");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(61.48941136975552d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9469968385824012d + "'", double1 == 3.9469968385824012d);
    }

    @Test
    public void test6027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6027");
        double double1 = org.apache.commons.math.util.FastMath.log1p(70187.3299035258d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.158937335503872d + "'", double1 == 11.158937335503872d);
    }

    @Test
    public void test6028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6028");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.6699684639824475d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5849591381518412d + "'", double1 == 0.5849591381518412d);
    }

    @Test
    public void test6029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6029");
        double double2 = org.apache.commons.math.util.FastMath.min(0.700702522942757d, 3.320630207612775d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.700702522942757d + "'", double2 == 0.700702522942757d);
    }

    @Test
    public void test6030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6030");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.5768196182814035d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6031");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8691858264600903d, 0.05471854119667448d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9923579019722977d + "'", double2 == 0.9923579019722977d);
    }

    @Test
    public void test6032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6032");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.971901295783916d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7495386073160457d + "'", double1 == 0.7495386073160457d);
    }

    @Test
    public void test6033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6033");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) (-2.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.03490658503988659d) + "'", double1 == (-0.03490658503988659d));
    }

    @Test
    public void test6034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6034");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 57, 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test6035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6035");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 5L, 3.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test6036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6036");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test6037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6037");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 2, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test6038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6038");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.0111706374508639E-10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0111706374508639E-10d + "'", double1 == 1.0111706374508639E-10d);
    }

    @Test
    public void test6039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6039");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.035124005767007416d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.32749249099426037d + "'", double1 == 0.32749249099426037d);
    }

    @Test
    public void test6040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6040");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.042291128921215566d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0431981396954004d + "'", double1 == 1.0431981396954004d);
    }

    @Test
    public void test6041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6041");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9988046725113348d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1733575460729626d + "'", double1 == 1.1733575460729626d);
    }

    @Test
    public void test6042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6042");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.0037857698423101618d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0037786218504155065d + "'", double1 == 0.0037786218504155065d);
    }

    @Test
    public void test6043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6043");
        double double1 = org.apache.commons.math.util.FastMath.expm1(813.951274474838d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test6044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6044");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0741466672417709d, 0.8700022875052251d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.10398654236861732d + "'", double2 == 0.10398654236861732d);
    }

    @Test
    public void test6045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6045");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.7615941559557655d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7023967071298753d + "'", double1 == 0.7023967071298753d);
    }

    @Test
    public void test6046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6046");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.2878368723990908d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.28026094829010634d) + "'", double1 == (-0.28026094829010634d));
    }

    @Test
    public void test6047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6047");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(3.677261497848975d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.6772614978489746d + "'", double2 == 3.6772614978489746d);
    }

    @Test
    public void test6048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6048");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 3L, 57.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test6049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6049");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.5282839739597525d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6050");
        long long1 = org.apache.commons.math.util.FastMath.abs((-36L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 36L + "'", long1 == 36L);
    }

    @Test
    public void test6051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6051");
        int int1 = org.apache.commons.math.util.FastMath.round(2.14748365E9f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test6052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6052");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.1819139347123162d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5943927097962465d + "'", double1 == 0.5943927097962465d);
    }

    @Test
    public void test6053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6053");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.356568665264778d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1124761597012491d + "'", double1 == 1.1124761597012491d);
    }

    @Test
    public void test6054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6054");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.8189894035442021E-12d, 2.589240193085527d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8189894035442023E-12d + "'", double2 == 1.8189894035442023E-12d);
    }

    @Test
    public void test6055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6055");
        double double1 = org.apache.commons.math.util.FastMath.floor((-1.541950429394781d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test6056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6056");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.8986761182296238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7156526376879583d + "'", double1 == 0.7156526376879583d);
    }

    @Test
    public void test6057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6057");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.07463853704904692d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6058");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.969914391648719d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6059");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.5705870643612196d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5705870643612196d + "'", double1 == 1.5705870643612196d);
    }

    @Test
    public void test6060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6060");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.0070912050862004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 114.99785514926563d + "'", double1 == 114.99785514926563d);
    }

    @Test
    public void test6061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6061");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(4477855.166669106d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 164.825099846192d + "'", double1 == 164.825099846192d);
    }

    @Test
    public void test6062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6062");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.0146903407800787d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test6063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6063");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 1477896, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1477896L + "'", long2 == 1477896L);
    }

    @Test
    public void test6064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6064");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5721494028333372d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9173669803900304d + "'", double1 == 0.9173669803900304d);
    }

    @Test
    public void test6065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6065");
        double double1 = org.apache.commons.math.util.FastMath.rint((-103.97207708399179d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-104.0d) + "'", double1 == (-104.0d));
    }

    @Test
    public void test6066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6066");
        double double1 = org.apache.commons.math.util.FastMath.abs(128.05875780734718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 128.05875780734718d + "'", double1 == 128.05875780734718d);
    }

    @Test
    public void test6067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6067");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.0000000002328306d, 2.6069417913449664d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3662813491858949d + "'", double2 == 0.3662813491858949d);
    }

    @Test
    public void test6068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6068");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.8108072797718955d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5619687066308396d + "'", double1 == 1.5619687066308396d);
    }

    @Test
    public void test6069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6069");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.242924991852436d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test6070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6070");
        int int2 = org.apache.commons.math.util.FastMath.max(36, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test6071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6071");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.042291128921215566d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04229112892121557d + "'", double1 == 0.04229112892121557d);
    }

    @Test
    public void test6072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6072");
        double double2 = org.apache.commons.math.util.FastMath.pow(32.69314718055993d, 0.39585386311332965d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.9765234413678128d + "'", double2 == 3.9765234413678128d);
    }

    @Test
    public void test6073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6073");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.0691962561940713d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7271602498444415d + "'", double1 == 0.7271602498444415d);
    }

    @Test
    public void test6074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6074");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.4142135623730951d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.113250378782928d + "'", double1 == 3.113250378782928d);
    }

    @Test
    public void test6075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6075");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.002160686891321d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7625000968146298d + "'", double1 == 0.7625000968146298d);
    }

    @Test
    public void test6076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6076");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.22226708771129583d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6077");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.285378842178129d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9096267009781183d + "'", double1 == 0.9096267009781183d);
    }

    @Test
    public void test6078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6078");
        double double2 = org.apache.commons.math.util.FastMath.min(7.2638973976934564E18d, (-86.33580274416312d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-86.33580274416312d) + "'", double2 == (-86.33580274416312d));
    }

    @Test
    public void test6079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6079");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.0523779637351338d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6080");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.2442033263957681d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8791697500646949d + "'", double1 == 1.8791697500646949d);
    }

    @Test
    public void test6081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6081");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.5133236589758516d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.230172207040889d + "'", double1 == 1.230172207040889d);
    }

    @Test
    public void test6082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6082");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.5995504841726446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.22217424196546995d) + "'", double1 == (-0.22217424196546995d));
    }

    @Test
    public void test6083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6083");
        long long1 = org.apache.commons.math.util.FastMath.round((-1.4413226701961004d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test6084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6084");
        long long2 = org.apache.commons.math.util.FastMath.max(175L, 175L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 175L + "'", long2 == 175L);
    }

    @Test
    public void test6085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6085");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.5303468257884512d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6086");
        float float2 = org.apache.commons.math.util.FastMath.min((float) ' ', 52.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test6087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6087");
        double double1 = org.apache.commons.math.util.FastMath.log(50.11367450037566d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.914293914967624d + "'", double1 == 3.914293914967624d);
    }

    @Test
    public void test6088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6088");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 3.1554436208840472E-30d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1554436208840472E-30d + "'", double2 == 3.1554436208840472E-30d);
    }

    @Test
    public void test6089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6089");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 84.73931296875567d + "'", double1 == 84.73931296875567d);
    }

    @Test
    public void test6090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6090");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.020511130091430484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5502837582369748d + "'", double1 == 1.5502837582369748d);
    }

    @Test
    public void test6091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6091");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.541179898172264d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test6092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6092");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.1001094562563805d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49137702783716286d + "'", double1 == 0.49137702783716286d);
    }

    @Test
    public void test6093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6093");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6094");
        double double2 = org.apache.commons.math.util.FastMath.min(0.4515827052894541d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test6095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6095");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.6557880892462952d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7693779545416956d) + "'", double1 == (-0.7693779545416956d));
    }

    @Test
    public void test6096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6096");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9258949934053917d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01615991616265527d + "'", double1 == 0.01615991616265527d);
    }

    @Test
    public void test6097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6097");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-1.5656994050637374d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9163389883947862d) + "'", double1 == (-0.9163389883947862d));
    }

    @Test
    public void test6098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6098");
        int int2 = org.apache.commons.math.util.FastMath.max((-3), 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test6099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6099");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.010374668118881438d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01037448200916367d) + "'", double1 == (-0.01037448200916367d));
    }

    @Test
    public void test6100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6100");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.4495725029967728d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.247981511804982d + "'", double1 == 2.247981511804982d);
    }

    @Test
    public void test6101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6101");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.2887644981019058d, 11014.999999999998d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test6102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6102");
        double double1 = org.apache.commons.math.util.FastMath.ceil(7.6035750265302235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.0d + "'", double1 == 8.0d);
    }

    @Test
    public void test6103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6103");
        double double1 = org.apache.commons.math.util.FastMath.asinh(31.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.1273944292716545d + "'", double1 == 4.1273944292716545d);
    }

    @Test
    public void test6104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6104");
        int int2 = org.apache.commons.math.util.FastMath.max(5, (-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test6105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6105");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.4210854715202007E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1554436208840472E-30d + "'", double1 == 3.1554436208840472E-30d);
    }

    @Test
    public void test6106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6106");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test6107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6107");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.13850408558812574d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test6108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6108");
        double double2 = org.apache.commons.math.util.FastMath.max((-1.267013246259975d), 4.041914822473389d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.041914822473389d + "'", double2 == 4.041914822473389d);
    }

    @Test
    public void test6109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6109");
        double double1 = org.apache.commons.math.util.FastMath.atanh(34.30685281944005d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6110");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.82983489855724d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9109527422195073d + "'", double1 == 0.9109527422195073d);
    }

    @Test
    public void test6111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6111");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.6557880892462952d), 8388608.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6557880892462952d) + "'", double2 == (-0.6557880892462952d));
    }

    @Test
    public void test6112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6112");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 36);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 36L + "'", long1 == 36L);
    }

    @Test
    public void test6113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6113");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1072.8715259107928d, 1.1470511776466854d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1072.8715259107926d + "'", double2 == 1072.8715259107926d);
    }

    @Test
    public void test6114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6114");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 36, 2.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test6115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6115");
        double double1 = org.apache.commons.math.util.FastMath.atanh(35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6116");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.883259400089535E100d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 230.89151329853462d + "'", double1 == 230.89151329853462d);
    }

    @Test
    public void test6117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6117");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.5670176959525735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.792334661673562d + "'", double1 == 3.792334661673562d);
    }

    @Test
    public void test6118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6118");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.5409928174322843d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5175732278655021d + "'", double1 == 0.5175732278655021d);
    }

    @Test
    public void test6119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6119");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.010374295917472898d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01032066851863032d) + "'", double1 == (-0.01032066851863032d));
    }

    @Test
    public void test6120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6120");
        int int2 = org.apache.commons.math.util.FastMath.max(14, 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
    }

    @Test
    public void test6121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6121");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.7473083494263217d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6122");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.1301927452503902d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test6123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6123");
        double double1 = org.apache.commons.math.util.FastMath.asin(9.557342734345765d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6124");
        double double1 = org.apache.commons.math.util.FastMath.tan((-3.6268604078470186d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5273248225058396d) + "'", double1 == (-0.5273248225058396d));
    }

    @Test
    public void test6125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6125");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9708235100106998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6126");
        float float2 = org.apache.commons.math.util.FastMath.min(57.0f, 11013.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test6127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6127");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.792495150309638E106d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 245.35077562587125d + "'", double1 == 245.35077562587125d);
    }

    @Test
    public void test6128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6128");
        double double1 = org.apache.commons.math.util.FastMath.tan(22.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.00885165604168446d + "'", double1 == 0.00885165604168446d);
    }

    @Test
    public void test6129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6129");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9917318921852735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7580998389315257d + "'", double1 == 0.7580998389315257d);
    }

    @Test
    public void test6130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6130");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6131");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.8410058489917948d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.43127650614885565d + "'", double1 == 0.43127650614885565d);
    }

    @Test
    public void test6132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6132");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6133");
        long long2 = org.apache.commons.math.util.FastMath.max(2147483647L, (long) 14);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test6134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6134");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 1, (float) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test6135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6135");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.8539880479975257d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6569817631588438d + "'", double1 == 0.6569817631588438d);
    }

    @Test
    public void test6136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6136");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.43930669835763825d), 4.6750163915861345d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.09369388631265108d) + "'", double2 == (-0.09369388631265108d));
    }

    @Test
    public void test6137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6137");
        long long1 = org.apache.commons.math.util.FastMath.round((double) 0L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test6138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6138");
        double double2 = org.apache.commons.math.util.FastMath.pow(198.57204013738644d, 0.5508591762880619d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 18.442902508503497d + "'", double2 == 18.442902508503497d);
    }

    @Test
    public void test6139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6139");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.2304174954646191E11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.049772952917979E12d + "'", double1 == 7.049772952917979E12d);
    }

    @Test
    public void test6140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6140");
        double double1 = org.apache.commons.math.util.FastMath.log10(9.306831688654869d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9688018598944426d + "'", double1 == 0.9688018598944426d);
    }

    @Test
    public void test6141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6141");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9998151400298467d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6142");
        double double2 = org.apache.commons.math.util.FastMath.pow(6.169643873696645d, (double) 5.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8939.237611701636d + "'", double2 == 8939.237611701636d);
    }

    @Test
    public void test6143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6143");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.010374668118881438d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000538173519995d + "'", double1 == 1.0000538173519995d);
    }

    @Test
    public void test6144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6144");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-1.3485292390836008d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1048079460065063d) + "'", double1 == (-1.1048079460065063d));
    }

    @Test
    public void test6145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6145");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9176021804981276d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6146");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.8324875211177079d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6942389006463813d + "'", double1 == 0.6942389006463813d);
    }

    @Test
    public void test6147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6147");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7615941559557649d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8657694832396585d + "'", double1 == 0.8657694832396585d);
    }

    @Test
    public void test6148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6148");
        double double1 = org.apache.commons.math.util.FastMath.rint((-53.99999999999999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-54.0d) + "'", double1 == (-54.0d));
    }

    @Test
    public void test6149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6149");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 100, (float) 72L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 72.0f + "'", float2 == 72.0f);
    }

    @Test
    public void test6150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6150");
        long long1 = org.apache.commons.math.util.FastMath.round(0.1671515410548442d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test6151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6151");
        double double1 = org.apache.commons.math.util.FastMath.log(1.0554351483188518d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05395314475007757d + "'", double1 == 0.05395314475007757d);
    }

    @Test
    public void test6152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6152");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.5872139151568908d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6215477523207813d) + "'", double1 == (-0.6215477523207813d));
    }

    @Test
    public void test6153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6153");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.3441486949905643d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4107883970794364d + "'", double1 == 0.4107883970794364d);
    }

    @Test
    public void test6154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6154");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.9999999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.414213562373095d + "'", double1 == 1.414213562373095d);
    }

    @Test
    public void test6155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6155");
        long long2 = org.apache.commons.math.util.FastMath.max(9223372036854775807L, 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
    }

    @Test
    public void test6156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6156");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-54.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.7797631496846193d) + "'", double1 == (-3.7797631496846193d));
    }

    @Test
    public void test6157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6157");
        long long2 = org.apache.commons.math.util.FastMath.min(32L, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test6158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6158");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8342233605065102d + "'", double1 == 0.8342233605065102d);
    }

    @Test
    public void test6159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6159");
        double double1 = org.apache.commons.math.util.FastMath.tanh(83.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6160");
        float float2 = org.apache.commons.math.util.FastMath.max(14.0f, (float) 5);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 14.0f + "'", float2 == 14.0f);
    }

    @Test
    public void test6161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6161");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.40910736701644745d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6396150146896549d + "'", double1 == 0.6396150146896549d);
    }

    @Test
    public void test6162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6162");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.21095412737801214d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6163");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.056630991823551025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5141350212841904d + "'", double1 == 1.5141350212841904d);
    }

    @Test
    public void test6164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6164");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9698479895022746d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9698479895022746d + "'", double1 == 0.9698479895022746d);
    }

    @Test
    public void test6165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6165");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 6, (float) (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test6166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6166");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.7227508140360495d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8819465551809471d + "'", double1 == 0.8819465551809471d);
    }

    @Test
    public void test6167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6167");
        double double2 = org.apache.commons.math.util.FastMath.pow(52.970206347678634d, (-1.0476958419065936d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0156220920879696d + "'", double2 == 0.0156220920879696d);
    }

    @Test
    public void test6168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6168");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.35180506528483635d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.35180506528483635d + "'", double1 == 0.35180506528483635d);
    }

    @Test
    public void test6169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6169");
        int int1 = org.apache.commons.math.util.FastMath.round(6.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test6170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6170");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-2.1103453443603275d), 0.8161870413788636d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.110345344360327d) + "'", double2 == (-2.110345344360327d));
    }

    @Test
    public void test6171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6171");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.105865973135149d, 2.2317672777233026d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4600502299070493d + "'", double2 == 0.4600502299070493d);
    }

    @Test
    public void test6172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6172");
        double double1 = org.apache.commons.math.util.FastMath.atan(6.15195825143981E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.151957475337841E-4d + "'", double1 == 6.151957475337841E-4d);
    }

    @Test
    public void test6173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6173");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.7260621198151926d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6174");
        int int2 = org.apache.commons.math.util.FastMath.min(5, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test6175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6175");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 175, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test6176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6176");
        double double1 = org.apache.commons.math.util.FastMath.acos(14.703675447601967d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6177");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.2950611482183454d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.29951951552861494d + "'", double1 == 0.29951951552861494d);
    }

    @Test
    public void test6178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6178");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.5954732329718483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.677511790861663d + "'", double1 == 0.677511790861663d);
    }

    @Test
    public void test6179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6179");
        double double1 = org.apache.commons.math.util.FastMath.rint((-35.99999999999999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-36.0d) + "'", double1 == (-36.0d));
    }

    @Test
    public void test6180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6180");
        double double2 = org.apache.commons.math.util.FastMath.max(0.6509498349092765d, (-0.9950547536867305d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6509498349092765d + "'", double2 == 0.6509498349092765d);
    }

    @Test
    public void test6181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6181");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 97, (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test6182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6182");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-3.0972636890463687d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.05405744917632496d) + "'", double1 == (-0.05405744917632496d));
    }

    @Test
    public void test6183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6183");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9990737979836914d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8807185116217423d + "'", double1 == 0.8807185116217423d);
    }

    @Test
    public void test6184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6184");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.1599753909038675d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0507101442133353d + "'", double1 == 1.0507101442133353d);
    }

    @Test
    public void test6185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6185");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.35311624476434156d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9316961634017225d + "'", double1 == 1.9316961634017225d);
    }

    @Test
    public void test6186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6186");
        double double2 = org.apache.commons.math.util.FastMath.min(0.21839450088746076d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test6187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6187");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.3106472496723418d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.144835031640953d + "'", double1 == 1.144835031640953d);
    }

    @Test
    public void test6188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6188");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(90.01745329225002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5711009442099724d + "'", double1 == 1.5711009442099724d);
    }

    @Test
    public void test6189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6189");
        double double1 = org.apache.commons.math.util.FastMath.exp(4.270561880171768E27d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test6190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6190");
        double double1 = org.apache.commons.math.util.FastMath.tanh(13.000002260326852d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999897818d + "'", double1 == 0.9999999999897818d);
    }

    @Test
    public void test6191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6191");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.668250757176408d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5890984799380379d + "'", double1 == 0.5890984799380379d);
    }

    @Test
    public void test6192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6192");
        int int2 = org.apache.commons.math.util.FastMath.min((-3), 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test6193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6193");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.3168008123704915d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8520458407940987d + "'", double1 == 3.8520458407940987d);
    }

    @Test
    public void test6194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6194");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.8554182836643194d), 2.158123084021473d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8554182836643193d) + "'", double2 == (-0.8554182836643193d));
    }

    @Test
    public void test6195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6195");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.1531436238758581d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8564041843827944d + "'", double1 == 0.8564041843827944d);
    }

    @Test
    public void test6196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6196");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.6799781366958019d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8230635102484072d + "'", double1 == 0.8230635102484072d);
    }

    @Test
    public void test6197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6197");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.6656171301354403d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7283204403428133d + "'", double1 == 0.7283204403428133d);
    }

    @Test
    public void test6198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6198");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-1.2015841995251388E-10d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6199");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.3308556102312834d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test6200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6200");
        long long2 = org.apache.commons.math.util.FastMath.max(1L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test6201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6201");
        long long1 = org.apache.commons.math.util.FastMath.round(1.3887317335324654d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test6202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6202");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.5143524375699184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5143524375699186d + "'", double1 == 0.5143524375699186d);
    }

    @Test
    public void test6203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6203");
        float float2 = org.apache.commons.math.util.FastMath.max(14.0f, (float) 4);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 14.0f + "'", float2 == 14.0f);
    }

    @Test
    public void test6204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6204");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 3, 2147483647L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test6205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6205");
        double double1 = org.apache.commons.math.util.FastMath.asinh(5.40752980333197E94d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 218.82393831231084d + "'", double1 == 218.82393831231084d);
    }

    @Test
    public void test6206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6206");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.586013452313441E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.586013452313441E15d + "'", double1 == 1.586013452313441E15d);
    }

    @Test
    public void test6207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6207");
        double double1 = org.apache.commons.math.util.FastMath.atanh(4.605170185988092d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6208");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.8833206860228293d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9398514169925102d + "'", double1 == 0.9398514169925102d);
    }

    @Test
    public void test6209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6209");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9998794887589783d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test6210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6210");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.29494961238899225d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2994027846609756d) + "'", double1 == (-0.2994027846609756d));
    }

    @Test
    public void test6211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6211");
        double double1 = org.apache.commons.math.util.FastMath.log1p(4.663528081877013d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7340470340425622d + "'", double1 == 1.7340470340425622d);
    }

    @Test
    public void test6212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6212");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8426364437777444d, 0.27281660270156344d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2576814029481187d + "'", double2 == 1.2576814029481187d);
    }

    @Test
    public void test6213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6213");
        int int2 = org.apache.commons.math.util.FastMath.min((-3), 72);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test6214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6214");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.701090835570466d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8441548246447903d + "'", double1 == 0.8441548246447903d);
    }

    @Test
    public void test6215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6215");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9986081305645496d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test6216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6216");
        double double1 = org.apache.commons.math.util.FastMath.acos(35.00000000000001d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6217");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(4.041914822473369d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07054472173732237d + "'", double1 == 0.07054472173732237d);
    }

    @Test
    public void test6218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6218");
        double double2 = org.apache.commons.math.util.FastMath.atan2(43.12841819466121d, 1.4657022738769552d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.53682479588095d + "'", double2 == 1.53682479588095d);
    }

    @Test
    public void test6219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6219");
        long long2 = org.apache.commons.math.util.FastMath.max(11013L, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11013L + "'", long2 == 11013L);
    }

    @Test
    public void test6220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6220");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.18284554275714865d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6221");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.3340213222681154E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3340213222681154E-8d + "'", double1 == 1.3340213222681154E-8d);
    }

    @Test
    public void test6222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6222");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.5436613490374845d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5172729093765123d + "'", double1 == 0.5172729093765123d);
    }

    @Test
    public void test6223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6223");
        double double1 = org.apache.commons.math.util.FastMath.acos((-2.589527355068891d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6224");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.603351882902383d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test6225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6225");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9999999999994668d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8813735870191659d + "'", double1 == 0.8813735870191659d);
    }

    @Test
    public void test6226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6226");
        double double1 = org.apache.commons.math.util.FastMath.acos((-1.38816984899935d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6227");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.0115104269844304d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.474598660889415d + "'", double1 == 6.474598660889415d);
    }

    @Test
    public void test6228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6228");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.000000837352016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6229");
        double double1 = org.apache.commons.math.util.FastMath.log(1.8086089434116457d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5925580102482355d + "'", double1 == 0.5925580102482355d);
    }

    @Test
    public void test6230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6230");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9103910184992512d, 0.6890624663225461d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9103910184992512d + "'", double2 == 0.9103910184992512d);
    }

    @Test
    public void test6231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6231");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 'a', (float) 11013);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test6232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6232");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.253350360695029d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0496842573695355d + "'", double1 == 1.0496842573695355d);
    }

    @Test
    public void test6233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6233");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.25921821707943726d, 1.586013452313441E15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6344011250429698E-16d + "'", double2 == 1.6344011250429698E-16d);
    }

    @Test
    public void test6234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6234");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.20140916094505582d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.18242215781448912d) + "'", double1 == (-0.18242215781448912d));
    }

    @Test
    public void test6235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6235");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.5321070224790865E26d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test6236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6236");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 72, (long) 2147483647);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 72L + "'", long2 == 72L);
    }

    @Test
    public void test6237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6237");
        float float1 = org.apache.commons.math.util.FastMath.abs(8.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 8.0f + "'", float1 == 8.0f);
    }

    @Test
    public void test6238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6238");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.28026094829010634d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2731465769562508d) + "'", double1 == (-0.2731465769562508d));
    }

    @Test
    public void test6239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6239");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.9867717342662448d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1044889974911132d + "'", double1 == 1.1044889974911132d);
    }

    @Test
    public void test6240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6240");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.7615945076219022d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7615945076219023d + "'", double1 == 0.7615945076219023d);
    }

    @Test
    public void test6241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6241");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-7.863185875775808d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6242");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.0037614443570399263d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0037614443570399263d + "'", double1 == 0.0037614443570399263d);
    }

    @Test
    public void test6243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6243");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 10L, (float) 57L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test6244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6244");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.5180500925877483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49518702726174274d + "'", double1 == 0.49518702726174274d);
    }

    @Test
    public void test6245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6245");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.5900247258946039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.038940111639949d + "'", double1 == 1.038940111639949d);
    }

    @Test
    public void test6246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6246");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) (-2L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test6247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6247");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 3, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test6248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6248");
        double double2 = org.apache.commons.math.util.FastMath.min(12.839059264996926d, 2.1556157735575975E15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 12.839059264996926d + "'", double2 == 12.839059264996926d);
    }

    @Test
    public void test6249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6249");
        long long2 = org.apache.commons.math.util.FastMath.min(5L, (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test6250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6250");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.6321205588285577d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test6251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6251");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.811629889474638d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test6252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6252");
        double double1 = org.apache.commons.math.util.FastMath.cosh(4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 51.859317725494705d + "'", double1 == 51.859317725494705d);
    }

    @Test
    public void test6253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6253");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 6L, 72.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.0f + "'", float2 == 6.0f);
    }

    @Test
    public void test6254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6254");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6255");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.02707543498557225d, (-0.01573708249221756d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.027075434985572248d + "'", double2 == 0.027075434985572248d);
    }

    @Test
    public void test6256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6256");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.003215579132524195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.6122443220970283E-5d + "'", double1 == 5.6122443220970283E-5d);
    }

    @Test
    public void test6257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6257");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) '#');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 35.0f + "'", float1 == 35.0f);
    }

    @Test
    public void test6258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6258");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.09962188831741307d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.995041842331175d + "'", double1 == 0.995041842331175d);
    }

    @Test
    public void test6259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6259");
        float float2 = org.apache.commons.math.util.FastMath.min(100.0f, (float) 32L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test6260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6260");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.253350360695029d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6261");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.586013452313419E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.768115672379124E13d + "'", double1 == 2.768115672379124E13d);
    }

    @Test
    public void test6262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6262");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.6196139432498801d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7133263504391507d + "'", double1 == 0.7133263504391507d);
    }

    @Test
    public void test6263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6263");
        double double1 = org.apache.commons.math.util.FastMath.ulp(73.1282163281567d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test6264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6264");
        double double1 = org.apache.commons.math.util.FastMath.ceil(27.722354182756217d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 28.0d + "'", double1 == 28.0d);
    }

    @Test
    public void test6265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6265");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.5686029556540668d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8426540432368208d + "'", double1 == 0.8426540432368208d);
    }

    @Test
    public void test6266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6266");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5395564933646284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6267");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 8, (float) 11013);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11013.0f + "'", float2 == 11013.0f);
    }

    @Test
    public void test6268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6268");
        double double1 = org.apache.commons.math.util.FastMath.log10(5.346450029952159E-116d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-115.27193448791039d) + "'", double1 == (-115.27193448791039d));
    }

    @Test
    public void test6269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6269");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.5711333929634348d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.571133392963435d + "'", double1 == 1.571133392963435d);
    }

    @Test
    public void test6270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6270");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.5942992187596847d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6363940138817533d) + "'", double1 == (-0.6363940138817533d));
    }

    @Test
    public void test6271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6271");
        double double1 = org.apache.commons.math.util.FastMath.exp(4.000424080966578E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000400122435732d + "'", double1 == 1.000400122435732d);
    }

    @Test
    public void test6272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6272");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.024704267641731482d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.02469924380280632d) + "'", double1 == (-0.02469924380280632d));
    }

    @Test
    public void test6273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6273");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8733922018678796d, 0.9939310354798899d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8733922018678797d + "'", double2 == 0.8733922018678797d);
    }

    @Test
    public void test6274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6274");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.1647182772090332d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6275");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.5334799003570143d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test6276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6276");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test6277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6277");
        double double2 = org.apache.commons.math.util.FastMath.max(2.208718528794109E-17d, (-1.9797298543946944d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.208718528794109E-17d + "'", double2 == 2.208718528794109E-17d);
    }

    @Test
    public void test6278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6278");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.0489207050997464d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6279");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(4.6750163915861345d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08159442861788258d + "'", double1 == 0.08159442861788258d);
    }

    @Test
    public void test6280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6280");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, (long) 53);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 53L + "'", long2 == 53L);
    }

    @Test
    public void test6281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6281");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1L, (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test6282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6282");
        long long1 = org.apache.commons.math.util.FastMath.round((-1.259698831624174d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test6283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6283");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.5790336546285149d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5472153692287495d + "'", double1 == 0.5472153692287495d);
    }

    @Test
    public void test6284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6284");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-100.01791180959569d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test6285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6285");
        long long2 = org.apache.commons.math.util.FastMath.max(5L, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test6286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6286");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.0035674409029537143d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6287");
        double double1 = org.apache.commons.math.util.FastMath.signum(8.654877925489926d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6288");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.7249318159569607d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6289");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.086833375744787d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.08694286878221595d) + "'", double1 == (-0.08694286878221595d));
    }

    @Test
    public void test6290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6290");
        double double2 = org.apache.commons.math.util.FastMath.max((double) 11013, 0.4573750283097829d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11013.0d + "'", double2 == 11013.0d);
    }

    @Test
    public void test6291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6291");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.5708871266543591d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3015267448474974d + "'", double1 == 2.3015267448474974d);
    }

    @Test
    public void test6292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6292");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.586013452313419E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.586013452313419E15d + "'", double1 == 1.586013452313419E15d);
    }

    @Test
    public void test6293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6293");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.3283064365386963E-10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.52587890625E-5d + "'", double1 == 1.52587890625E-5d);
    }

    @Test
    public void test6294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6294");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.0730374999763912d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6295");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.3390237543630367d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.34587900271182787d) + "'", double1 == (-0.34587900271182787d));
    }

    @Test
    public void test6296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6296");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 10, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6297");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.5545968900472338d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6194479861260864d) + "'", double1 == (-0.6194479861260864d));
    }

    @Test
    public void test6298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6298");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.0349065850398866d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test6299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6299");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(31.982025710274982d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5581916501017765d + "'", double1 == 0.5581916501017765d);
    }

    @Test
    public void test6300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6300");
        double double2 = org.apache.commons.math.util.FastMath.atan2(5506.500045400885d, 0.10398654236861732d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707774424688277d + "'", double2 == 1.5707774424688277d);
    }

    @Test
    public void test6301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6301");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.24398053114331036d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24893974898298887d + "'", double1 == 0.24893974898298887d);
    }

    @Test
    public void test6302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6302");
        double double1 = org.apache.commons.math.util.FastMath.sinh(8.213053064948797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1844.3935640983048d + "'", double1 == 1844.3935640983048d);
    }

    @Test
    public void test6303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6303");
        long long2 = org.apache.commons.math.util.FastMath.max((-53L), (long) 1477896);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1477896L + "'", long2 == 1477896L);
    }

    @Test
    public void test6304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6304");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.948148009134E13d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6305");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.0000000000000009d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430806348152448d + "'", double1 == 1.5430806348152448d);
    }

    @Test
    public void test6306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6306");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.7147788566799335d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.867872427215686d + "'", double1 == 0.867872427215686d);
    }

    @Test
    public void test6307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6307");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.07074101207510715d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test6308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6308");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9337643921132142d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.351459865881702d + "'", double1 == 1.351459865881702d);
    }

    @Test
    public void test6309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6309");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.5669767943827968d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6310");
        long long1 = org.apache.commons.math.util.FastMath.round(192.2131105221355d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 192L + "'", long1 == 192L);
    }

    @Test
    public void test6311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6311");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-103.97207708399179d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.702248465198799d) + "'", double1 == (-4.702248465198799d));
    }

    @Test
    public void test6312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6312");
        double double2 = org.apache.commons.math.util.FastMath.max(0.7095251320497278d, 0.6483608274590866d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7095251320497278d + "'", double2 == 0.7095251320497278d);
    }

    @Test
    public void test6313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6313");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 0.9223834135669848d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test6314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6314");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.09369388631265108d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test6315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6315");
        int int2 = org.apache.commons.math.util.FastMath.min((int) 'a', 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test6316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6316");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.8837010712667019d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6332384965093316d + "'", double1 == 0.6332384965093316d);
    }

    @Test
    public void test6317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6317");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.613523051633679d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.613523051633679d + "'", double1 == 0.613523051633679d);
    }

    @Test
    public void test6318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6318");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 72L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 72.0f + "'", float2 == 72.0f);
    }

    @Test
    public void test6319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6319");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.2732005436470559d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.26660042677059764d + "'", double1 == 0.26660042677059764d);
    }

    @Test
    public void test6320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6320");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-1.0316268884157165d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test6321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6321");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.18242215781448912d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test6322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6322");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.143775716219968d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6323");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-1.7456418720467646d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2040699473456506d) + "'", double1 == (-1.2040699473456506d));
    }

    @Test
    public void test6324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6324");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.007007049837584d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.007007049837584d + "'", double1 == 1.007007049837584d);
    }

    @Test
    public void test6325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6325");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9623033716478188d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6177191145603587d + "'", double1 == 2.6177191145603587d);
    }

    @Test
    public void test6326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6326");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-3L), (float) 192L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 192.0f + "'", float2 == 192.0f);
    }

    @Test
    public void test6327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6327");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.7162633894119446d, 1.7370361196913022d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7793829076450858d + "'", double2 == 0.7793829076450858d);
    }

    @Test
    public void test6328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6328");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.8088310611859937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.971803247564555d + "'", double1 == 0.971803247564555d);
    }

    @Test
    public void test6329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6329");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.25469727314226837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2900710226066556d + "'", double1 == 1.2900710226066556d);
    }

    @Test
    public void test6330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6330");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(35.000000000000014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.916079783099617d + "'", double1 == 5.916079783099617d);
    }

    @Test
    public void test6331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6331");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.7615911849474076d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7615911849474077d + "'", double1 == 0.7615911849474077d);
    }

    @Test
    public void test6332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6332");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.0361961097813307d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.03619610978133069d) + "'", double1 == (-0.03619610978133069d));
    }

    @Test
    public void test6333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6333");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.39592515018183416d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test6334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6334");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.22217424196546995d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0038776720354200085d) + "'", double1 == (-0.0038776720354200085d));
    }

    @Test
    public void test6335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6335");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.7655328088625728d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6929212591580326d + "'", double1 == 0.6929212591580326d);
    }

    @Test
    public void test6336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6336");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.760402149420859d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7068642230720426d + "'", double1 == 0.7068642230720426d);
    }

    @Test
    public void test6337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6337");
        double double1 = org.apache.commons.math.util.FastMath.log(0.5403023058681384d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6156264703860166d) + "'", double1 == (-0.6156264703860166d));
    }

    @Test
    public void test6338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6338");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8660262953611549d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1758128730549149d + "'", double1 == 1.1758128730549149d);
    }

    @Test
    public void test6339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6339");
        double double2 = org.apache.commons.math.util.FastMath.pow(164.825099846192d, 0.37076030339985566d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.637189981366365d + "'", double2 == 6.637189981366365d);
    }

    @Test
    public void test6340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6340");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.6535657774206833d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011406874694347337d + "'", double1 == 0.011406874694347337d);
    }

    @Test
    public void test6341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6341");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.263814502040431d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8170512232564604d + "'", double1 == 0.8170512232564604d);
    }

    @Test
    public void test6342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6342");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9751009553485449d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8277585368656382d + "'", double1 == 0.8277585368656382d);
    }

    @Test
    public void test6343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6343");
        int int2 = org.apache.commons.math.util.FastMath.max(72, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test6344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6344");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.089135847258365d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 62.402887364309386d + "'", double1 == 62.402887364309386d);
    }

    @Test
    public void test6345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6345");
        int int2 = org.apache.commons.math.util.FastMath.min((-3), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test6346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6346");
        double double1 = org.apache.commons.math.util.FastMath.atan(Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6347");
        double double1 = org.apache.commons.math.util.FastMath.log(2.2737367544323206E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-29.112181583517703d) + "'", double1 == (-29.112181583517703d));
    }

    @Test
    public void test6348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6348");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.5273248225058396d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6349");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 4L, 32.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test6350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6350");
        double double2 = org.apache.commons.math.util.FastMath.max(1.6666666666666667d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6666666666666667d + "'", double2 == 1.6666666666666667d);
    }

    @Test
    public void test6351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6351");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.5707963267948963d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948963d + "'", double1 == 1.5707963267948963d);
    }

    @Test
    public void test6352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6352");
        double double1 = org.apache.commons.math.util.FastMath.sinh(7.2638973976934574E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test6353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6353");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.1116752822606313d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.045977949371362146d + "'", double1 == 0.045977949371362146d);
    }

    @Test
    public void test6354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6354");
        double double1 = org.apache.commons.math.util.FastMath.ulp(4.194206803317587d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test6355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6355");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 2147483647, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test6356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6356");
        double double1 = org.apache.commons.math.util.FastMath.asinh(3.1554436208840472E-30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1554436208840472E-30d + "'", double1 == 3.1554436208840472E-30d);
    }

    @Test
    public void test6357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6357");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.396718545645432d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6358");
        double double1 = org.apache.commons.math.util.FastMath.cos(34.29227537470679d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.96502861484585d) + "'", double1 == (-0.96502861484585d));
    }

    @Test
    public void test6359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6359");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(3.6268604078470186d, 0.8216615418906639d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.626860407847018d + "'", double2 == 3.626860407847018d);
    }

    @Test
    public void test6360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6360");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.6040640580642322d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9265028436011328d) + "'", double1 == (-0.9265028436011328d));
    }

    @Test
    public void test6361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6361");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-3.0461741036471235E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.046174056537146E-4d) + "'", double1 == (-3.046174056537146E-4d));
    }

    @Test
    public void test6362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6362");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.18057375527870234d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test6363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6363");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9971678302955945d, 1.5234147844947254d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9956886301980555d + "'", double2 == 0.9956886301980555d);
    }

    @Test
    public void test6364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6364");
        double double2 = org.apache.commons.math.util.FastMath.max(2.6177191145603587d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6177191145603587d + "'", double2 == 2.6177191145603587d);
    }

    @Test
    public void test6365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6365");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.581170436626687d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test6366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6366");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.8369144593899818d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.277139979003407d + "'", double1 == 6.277139979003407d);
    }

    @Test
    public void test6367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6367");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.0343321433287331d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test6368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6368");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(21.323945308420996d, 1.4577979139729036d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 21.323945308420992d + "'", double2 == 21.323945308420992d);
    }

    @Test
    public void test6369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6369");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.43930669835763825d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4253120969346567d) + "'", double1 == (-0.4253120969346567d));
    }

    @Test
    public void test6370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6370");
        long long1 = org.apache.commons.math.util.FastMath.round((-265.4234379924486d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-265L) + "'", long1 == (-265L));
    }

    @Test
    public void test6371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6371");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.8410058489917948d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963267948966d) + "'", double2 == (-1.5707963267948966d));
    }

    @Test
    public void test6372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6372");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 97, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test6373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6373");
        double double2 = org.apache.commons.math.util.FastMath.max(0.110676677762472d, 1.5422326689561365d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5422326689561365d + "'", double2 == 1.5422326689561365d);
    }

    @Test
    public void test6374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6374");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) 11013L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11013.0f + "'", float2 == 11013.0f);
    }

    @Test
    public void test6375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6375");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.4137774971580666d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6376");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.9771597781758796d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9623778619367345d + "'", double1 == 0.9623778619367345d);
    }

    @Test
    public void test6377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6377");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.05469123964916419d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.056214447181021d + "'", double1 == 1.056214447181021d);
    }

    @Test
    public void test6378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6378");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.4967005963222833d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.643290437857676d + "'", double1 == 1.643290437857676d);
    }

    @Test
    public void test6379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6379");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.174526712441788d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6380");
        long long1 = org.apache.commons.math.util.FastMath.round(0.516964265655408d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test6381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6381");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 6, 175L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 175L + "'", long2 == 175L);
    }

    @Test
    public void test6382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6382");
        double double1 = org.apache.commons.math.util.FastMath.rint(7.2638973976934574E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.2638973976934574E18d + "'", double1 == 7.2638973976934574E18d);
    }

    @Test
    public void test6383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6383");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.9171523356672744d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7316717177637013d + "'", double1 == 2.7316717177637013d);
    }

    @Test
    public void test6384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6384");
        double double1 = org.apache.commons.math.util.FastMath.sin((-3.046638250970772E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.046638203839255E-4d) + "'", double1 == (-3.046638203839255E-4d));
    }

    @Test
    public void test6385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6385");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.24434609527920614d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test6386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6386");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.5223184878037187d, 0.12092714017201109d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9244655552262344d + "'", double2 == 0.9244655552262344d);
    }

    @Test
    public void test6387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6387");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.02517207093756238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.025174730005614206d + "'", double1 == 0.025174730005614206d);
    }

    @Test
    public void test6388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6388");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.509178480272973d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 143.76533696469124d + "'", double1 == 143.76533696469124d);
    }

    @Test
    public void test6389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6389");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, (long) 5);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test6390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6390");
        long long1 = org.apache.commons.math.util.FastMath.round(10.067661995777765d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test6391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6391");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.846168432333387d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3306994888566612d + "'", double1 == 1.3306994888566612d);
    }

    @Test
    public void test6392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6392");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 100, (-53));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test6393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6393");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.869205555527689d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6394");
        long long2 = org.apache.commons.math.util.FastMath.min(57L, (long) 72);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 57L + "'", long2 == 57L);
    }

    @Test
    public void test6395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6395");
        double double1 = org.apache.commons.math.util.FastMath.cosh(77.26503394947865d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7978269761159417E33d + "'", double1 == 1.7978269761159417E33d);
    }

    @Test
    public void test6396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6396");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-4.258659887385141d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6397");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.6995216443485196d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.15519884317973198d) + "'", double1 == (-0.15519884317973198d));
    }

    @Test
    public void test6398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6398");
        int int2 = org.apache.commons.math.util.FastMath.max(52, (-53));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test6399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6399");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.3283064365386963E-10d, 1.0000121526688588d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3276789148935412E-10d + "'", double2 == 2.3276789148935412E-10d);
    }

    @Test
    public void test6400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6400");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5607966601082315d + "'", double1 == 1.5607966601082315d);
    }

    @Test
    public void test6401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6401");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.53682479588095d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2396873782857314d + "'", double1 == 1.2396873782857314d);
    }

    @Test
    public void test6402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6402");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.9867717342662448d, 2.1745267124417875d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.449699991049512d + "'", double2 == 4.449699991049512d);
    }

    @Test
    public void test6403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6403");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.007812658949600008d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.007843257402717881d + "'", double1 == 0.007843257402717881d);
    }

    @Test
    public void test6404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6404");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.022350304650365d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.022350304650365d + "'", double1 == 1.022350304650365d);
    }

    @Test
    public void test6405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6405");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.554310590391778d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7445203760756168d + "'", double1 == 0.7445203760756168d);
    }

    @Test
    public void test6406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6406");
        float float2 = org.apache.commons.math.util.FastMath.min(1833.0f, 4.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test6407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6407");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.6237264565928684d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6408");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.4573750283097829d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 26.205658776827104d + "'", double1 == 26.205658776827104d);
    }

    @Test
    public void test6409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6409");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.6440339106610352d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6062152681491194d + "'", double1 == 0.6062152681491194d);
    }

    @Test
    public void test6410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6410");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.003215579132524195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0032155680496180387d + "'", double1 == 0.0032155680496180387d);
    }

    @Test
    public void test6411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6411");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.883847335314108d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0840241042915555d) + "'", double1 == (-1.0840241042915555d));
    }

    @Test
    public void test6412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6412");
        double double1 = org.apache.commons.math.util.FastMath.tanh(12.839059264996923d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999859017d + "'", double1 == 0.9999999999859017d);
    }

    @Test
    public void test6413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6413");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.7017203400855394d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7017203400855394d + "'", double1 == 0.7017203400855394d);
    }

    @Test
    public void test6414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6414");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8491928178865491d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.556341430708473d + "'", double1 == 0.556341430708473d);
    }

    @Test
    public void test6415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6415");
        double double2 = org.apache.commons.math.util.FastMath.atan2(44.1377407200944d, 1.4137774971580666d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5387762400014666d + "'", double2 == 1.5387762400014666d);
    }

    @Test
    public void test6416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6416");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 5, 36.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 36.0f + "'", float2 == 36.0f);
    }

    @Test
    public void test6417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6417");
        int int2 = org.apache.commons.math.util.FastMath.min(6, 11013);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test6418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6418");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.703530868239122d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06463880760001697d + "'", double1 == 0.06463880760001697d);
    }

    @Test
    public void test6419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6419");
        double double2 = org.apache.commons.math.util.FastMath.max(0.05471854119667448d, 5.477053318335443E41d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.477053318335443E41d + "'", double2 == 5.477053318335443E41d);
    }

    @Test
    public void test6420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6420");
        long long1 = org.apache.commons.math.util.FastMath.round(0.7834002924547043d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test6421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6421");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.375500687858178d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6422");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.7805951733159242d, (-0.024401614617990376d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0060625492755897d + "'", double2 == 1.0060625492755897d);
    }

    @Test
    public void test6423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6423");
        double double1 = org.apache.commons.math.util.FastMath.sinh(11985.408355492187d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test6424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6424");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.5135318290179205d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.921688867296064d + "'", double1 == 0.921688867296064d);
    }

    @Test
    public void test6425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6425");
        double double1 = org.apache.commons.math.util.FastMath.tan((-1.3485292390836008d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.424757461214042d) + "'", double1 == (-4.424757461214042d));
    }

    @Test
    public void test6426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6426");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.3465735902799727d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.42552536171551075d) + "'", double1 == (-0.42552536171551075d));
    }

    @Test
    public void test6427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6427");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.6254645332759822E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6254645332759822E-9d + "'", double1 == 1.6254645332759822E-9d);
    }

    @Test
    public void test6428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6428");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.5294446044440393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4161342916108155d + "'", double1 == 2.4161342916108155d);
    }

    @Test
    public void test6429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6429");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.8081843818082921d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6685874578446105d + "'", double1 == 0.6685874578446105d);
    }

    @Test
    public void test6430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6430");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.18284554275714865d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7379156220339965d) + "'", double1 == (-0.7379156220339965d));
    }

    @Test
    public void test6431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6431");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8088135854621756d, 0.9705211365109137d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.694766230465926d + "'", double2 == 0.694766230465926d);
    }

    @Test
    public void test6432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6432");
        double double2 = org.apache.commons.math.util.FastMath.max(0.953499812724235d, (-0.9562328011312552d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.953499812724235d + "'", double2 == 0.953499812724235d);
    }

    @Test
    public void test6433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6433");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) 2.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1071487177940904d + "'", double1 == 1.1071487177940904d);
    }

    @Test
    public void test6434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6434");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.3297402172855466d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9259994621638173d + "'", double1 == 0.9259994621638173d);
    }

    @Test
    public void test6435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6435");
        double double1 = org.apache.commons.math.util.FastMath.sinh(4.194206803317587d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 33.14301909217311d + "'", double1 == 33.14301909217311d);
    }

    @Test
    public void test6436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6436");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.396718545645432d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0419148224733896d + "'", double1 == 3.0419148224733896d);
    }

    @Test
    public void test6437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6437");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.2950611482183454d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2950611482183454d + "'", double1 == 0.2950611482183454d);
    }

    @Test
    public void test6438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6438");
        long long1 = org.apache.commons.math.util.FastMath.round(0.8092116512100659d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test6439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6439");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9746912786087358d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.827528604144108d + "'", double1 == 0.827528604144108d);
    }

    @Test
    public void test6440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6440");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.9930737478319205d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6441");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.5172729093765123d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5406513923499732d + "'", double1 == 0.5406513923499732d);
    }

    @Test
    public void test6442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6442");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5711333929634348d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6443");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.5858935063788343d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.010225770752365058d) + "'", double1 == (-0.010225770752365058d));
    }

    @Test
    public void test6444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6444");
        int int2 = org.apache.commons.math.util.FastMath.min(1, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test6445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6445");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.8890836430372238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0839397269179125d + "'", double1 == 1.0839397269179125d);
    }

    @Test
    public void test6446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6446");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9171473774587547d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707651109236087d + "'", double1 == 1.5707651109236087d);
    }

    @Test
    public void test6447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6447");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.9355072424226104d), 0.023970364804932462d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test6448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6448");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '#', 11013);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11013 + "'", int2 == 11013);
    }

    @Test
    public void test6449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6449");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.44721184908992395d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.101677010236478d + "'", double1 == 1.101677010236478d);
    }

    @Test
    public void test6450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6450");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.5607966601082315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999500037496876d + "'", double1 == 0.9999500037496876d);
    }

    @Test
    public void test6451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6451");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.7727923643371758d, 96.30685281944005d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7727923643371759d + "'", double2 == 0.7727923643371759d);
    }

    @Test
    public void test6452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6452");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.651496622684403d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.18608783129956102d) + "'", double1 == (-0.18608783129956102d));
    }

    @Test
    public void test6453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6453");
        double double1 = org.apache.commons.math.util.FastMath.signum(4.8094708340813614d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6454");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(3.320630207612775d, 1.9145768651795099d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.3206302076127745d + "'", double2 == 3.3206302076127745d);
    }

    @Test
    public void test6455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6455");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(7.896296018267969E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8886110.520507816d + "'", double1 == 8886110.520507816d);
    }

    @Test
    public void test6456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6456");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.4484495608966435d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6457");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.9163389883947862d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6458");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.4599610117337625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.305791649721376d + "'", double1 == 4.305791649721376d);
    }

    @Test
    public void test6459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6459");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.6576833375608168d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.011478739675941544d) + "'", double1 == (-0.011478739675941544d));
    }

    @Test
    public void test6460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6460");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.5665764324793966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5154807030756772d + "'", double1 == 0.5154807030756772d);
    }

    @Test
    public void test6461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6461");
        double double1 = org.apache.commons.math.util.FastMath.signum(3.561893127573004E64d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6462");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-8.711666086263719d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6463");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9999387116494891d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.175106622984111d + "'", double1 == 1.175106622984111d);
    }

    @Test
    public void test6464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6464");
        double double1 = org.apache.commons.math.util.FastMath.sin((-59.10786673843407d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5500245885985804d) + "'", double1 == (-0.5500245885985804d));
    }

    @Test
    public void test6465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6465");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(35.000000000000014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.00000000000002d + "'", double1 == 35.00000000000002d);
    }

    @Test
    public void test6466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6466");
        float float2 = org.apache.commons.math.util.FastMath.max(8.0f, (float) 1L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.0f + "'", float2 == 8.0f);
    }

    @Test
    public void test6467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6467");
        double double1 = org.apache.commons.math.util.FastMath.expm1(5.009340961621595d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 148.80597572185025d + "'", double1 == 148.80597572185025d);
    }

    @Test
    public void test6468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6468");
        long long1 = org.apache.commons.math.util.FastMath.abs(13L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 13L + "'", long1 == 13L);
    }

    @Test
    public void test6469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6469");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2955791.9999996633d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.592424373775739d + "'", double1 == 15.592424373775739d);
    }

    @Test
    public void test6470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6470");
        double double1 = org.apache.commons.math.util.FastMath.log(68.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.219507705176107d + "'", double1 == 4.219507705176107d);
    }

    @Test
    public void test6471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6471");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.7105940846527337d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.710594084652734d + "'", double1 == 2.710594084652734d);
    }

    @Test
    public void test6472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6472");
        float float2 = org.apache.commons.math.util.FastMath.max((-1.0f), (float) 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test6473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6473");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.4001817886098734d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9825115290840873d + "'", double1 == 1.9825115290840873d);
    }

    @Test
    public void test6474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6474");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.208718528794109E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.208718528794109E-17d + "'", double1 == 2.208718528794109E-17d);
    }

    @Test
    public void test6475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6475");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.242924991852436d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2429249918524363d + "'", double1 == 1.2429249918524363d);
    }

    @Test
    public void test6476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6476");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) 11013);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14642450064787196d + "'", double1 == 0.14642450064787196d);
    }

    @Test
    public void test6477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6477");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6478");
        double double1 = org.apache.commons.math.util.FastMath.cosh(271.6563638137265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.7624429094466747E117d + "'", double1 == 4.7624429094466747E117d);
    }

    @Test
    public void test6479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6479");
        double double1 = org.apache.commons.math.util.FastMath.tan(207.40708930571046d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0620536342835328d + "'", double1 == 0.0620536342835328d);
    }

    @Test
    public void test6480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6480");
        int int2 = org.apache.commons.math.util.FastMath.max(35, 11013);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11013 + "'", int2 == 11013);
    }

    @Test
    public void test6481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6481");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.2605621335399806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6482");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.5705870643612196d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.003824464754356d + "'", double1 == 1.003824464754356d);
    }

    @Test
    public void test6483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6483");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 14);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 14L + "'", long1 == 14L);
    }

    @Test
    public void test6484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6484");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.7447148114163482d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1058407875843006d + "'", double1 == 1.1058407875843006d);
    }

    @Test
    public void test6485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6485");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.0038802218743867d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6486");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.0000000000000377d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.29577951308448d + "'", double1 == 57.29577951308448d);
    }

    @Test
    public void test6487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6487");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-2.1317761108019555d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5010608089539734d) + "'", double1 == (-1.5010608089539734d));
    }

    @Test
    public void test6488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6488");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.53682479588095d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02682265271441237d + "'", double1 == 0.02682265271441237d);
    }

    @Test
    public void test6489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6489");
        double double2 = org.apache.commons.math.util.FastMath.max((-1.4193244267567873d), 1.0000191900636288d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000191900636288d + "'", double2 == 1.0000191900636288d);
    }

    @Test
    public void test6490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6490");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-189.37354569266589d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8421709430404007E-14d + "'", double1 == 2.8421709430404007E-14d);
    }

    @Test
    public void test6491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6491");
        double double1 = org.apache.commons.math.util.FastMath.atan(4.509011168189731d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.352550628208739d + "'", double1 == 1.352550628208739d);
    }

    @Test
    public void test6492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6492");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1262024.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 108.06603186456832d + "'", double1 == 108.06603186456832d);
    }

    @Test
    public void test6493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6493");
        int int2 = org.apache.commons.math.util.FastMath.min(1833, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6494");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.3297526675165189d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3422485405912392d) + "'", double1 == (-0.3422485405912392d));
    }

    @Test
    public void test6495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6495");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.677511790861663d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7305466429491709d + "'", double1 == 0.7305466429491709d);
    }

    @Test
    public void test6496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6496");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7182818284590453d + "'", double1 == 1.7182818284590453d);
    }

    @Test
    public void test6497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6497");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2204460492503136E-16d + "'", double1 == 2.2204460492503136E-16d);
    }

    @Test
    public void test6498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6498");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.1208093923028257d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.120809392302826d + "'", double1 == 2.120809392302826d);
    }

    @Test
    public void test6499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6499");
        double double1 = org.apache.commons.math.util.FastMath.exp(573.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.091500380984786E248d + "'", double1 == 7.091500380984786E248d);
    }

    @Test
    public void test6500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6500");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.0737192693285789E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0737192692873169E-5d + "'", double1 == 1.0737192692873169E-5d);
    }
}

