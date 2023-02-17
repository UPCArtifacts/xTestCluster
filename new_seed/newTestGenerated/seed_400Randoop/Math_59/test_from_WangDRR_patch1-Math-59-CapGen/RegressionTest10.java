import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

    public static boolean debug = false;

    @Test
    public void test5001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5001");
        double double2 = org.apache.commons.math.util.FastMath.min(2.5091729483939074d, 1.0009877980461308d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0009877980461308d + "'", double2 == 1.0009877980461308d);
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        double double1 = org.apache.commons.math.util.FastMath.exp(24.678686683130433d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.221766492592815E10d + "'", double1 == 5.221766492592815E10d);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        int int2 = org.apache.commons.math.util.FastMath.min(2147483647, 1477896);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1477896 + "'", int2 == 1477896);
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-52.99999999999999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9591348389208239d, 0.9702843181545027d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9603247554669253d + "'", double2 == 0.9603247554669253d);
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.8378680586068442d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6846781937732479d + "'", double1 == 0.6846781937732479d);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 100, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36787944117144233d + "'", double1 == 0.36787944117144233d);
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.8813735870195429d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7071067811865475d) + "'", double1 == (-0.7071067811865475d));
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.00949495958537668d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.58601345231343E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.2840234699668822d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.28285835127574743d + "'", double1 == 0.28285835127574743d);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.7614645887194331d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.2239800905693157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7941529965594689d + "'", double1 == 0.7941529965594689d);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        double double1 = org.apache.commons.math.util.FastMath.atan(248.5313787931064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.566772711715153d + "'", double1 == 1.566772711715153d);
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.4622805158701188d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8950377376269645d + "'", double1 == 0.8950377376269645d);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        double double2 = org.apache.commons.math.util.FastMath.min(3.831008000716577E22d, 0.9158328057966899d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9158328057966899d + "'", double2 == 0.9158328057966899d);
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.5511122896377538d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.154492970399356d + "'", double1 == 2.154492970399356d);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.8081843818082922d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5923232378589243d + "'", double1 == 0.5923232378589243d);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.8735346502596505d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.878424366572043d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        int int2 = org.apache.commons.math.util.FastMath.min(97, 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.4253120969346567d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5539281628193607d) + "'", double1 == (-0.5539281628193607d));
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        double double1 = org.apache.commons.math.util.FastMath.acos(51.30685281944005d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        long long2 = org.apache.commons.math.util.FastMath.min(84677176L, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        double double2 = org.apache.commons.math.util.FastMath.pow(211.03126243924578d, (-0.496025759922821d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.07031761201688684d + "'", double2 == 0.07031761201688684d);
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.057233205734539196d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05726449777697603d + "'", double1 == 0.05726449777697603d);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        double double1 = org.apache.commons.math.util.FastMath.acos(8.467717600000001E7d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.5823209471693539d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8350660051181918d) + "'", double1 == (-0.8350660051181918d));
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.7027403004155557d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1532051400358147d) + "'", double1 == (-0.1532051400358147d));
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.023140907904583d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        double double1 = org.apache.commons.math.util.FastMath.log10(5.879453102073888E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.230663069467699d) + "'", double1 == (-4.230663069467699d));
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        double double1 = org.apache.commons.math.util.FastMath.tan((-3.8754705787895336d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9019255529734892d) + "'", double1 == (-0.9019255529734892d));
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.476058158779025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.375663470794074d + "'", double1 == 3.375663470794074d);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.7212254887267798d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9101942789115773d + "'", double1 == 0.9101942789115773d);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 11013, (float) (-53));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11013.0f + "'", float2 == 11013.0f);
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.42622139399486025d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.8623188722876837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6506783754890696d + "'", double1 == 0.6506783754890696d);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.2982445049454165E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3167971042250562E11d + "'", double1 == 1.3167971042250562E11d);
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.1624473515096263d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.017315053411302784d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.5090853520332064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1915391873235892d + "'", double1 == 1.1915391873235892d);
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.44301479880114863d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.029755017671104d + "'", double1 == 2.029755017671104d);
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.4495725029967728d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.449572502996773d + "'", double1 == 1.449572502996773d);
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.585786437626905d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.7235232133665006d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.788321920828275d + "'", double1 == 0.788321920828275d);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(384.43435069728696d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.709645177434216d + "'", double1 == 6.709645177434216d);
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.217652850343311d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3458490044330248d + "'", double1 == 0.3458490044330248d);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        double double2 = org.apache.commons.math.util.FastMath.min(9.999999999999998d, (double) 2.15561577E15f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.999999999999998d + "'", double2 == 9.999999999999998d);
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        double double1 = org.apache.commons.math.util.FastMath.acosh(4.4454545364061836E-4d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        double double1 = org.apache.commons.math.util.FastMath.abs(3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.141592653589793d + "'", double1 == 3.141592653589793d);
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.9182827862121189d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7428247546569945d) + "'", double1 == (-0.7428247546569945d));
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.6430898160505507d, (-0.5308456639204424d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6430898160505506d + "'", double2 == 0.6430898160505506d);
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2005.3522829578815d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.41032129904824216d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 35, (float) 52L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 35, (-36L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9335905118403581d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7510664917126777d + "'", double1 == 0.7510664917126777d);
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9591348389208239d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 53, (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) 9.223372E18f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.223372036854776E18d + "'", double1 == 9.223372036854776E18d);
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        double double2 = org.apache.commons.math.util.FastMath.max(0.7792419376831017d, 0.8587033066171034d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8587033066171034d + "'", double2 == 0.8587033066171034d);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        int int2 = org.apache.commons.math.util.FastMath.max(10, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.08704594528845264d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7071067811865476d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7853981633974484d + "'", double1 == 0.7853981633974484d);
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.35877271281906004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0062617651050046646d + "'", double1 == 0.0062617651050046646d);
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.9515228542117641d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9835725686067016d) + "'", double1 == (-0.9835725686067016d));
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        double double1 = org.apache.commons.math.util.FastMath.cosh(31.999999999999996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.948148009134021E13d + "'", double1 == 3.948148009134021E13d);
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        double double1 = org.apache.commons.math.util.FastMath.sinh(25.947493590387875d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.285884764145578E10d + "'", double1 == 9.285884764145578E10d);
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.5686300059875781d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7658461948190802d + "'", double1 == 1.7658461948190802d);
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-36), (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-36L) + "'", long2 == (-36L));
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        double double1 = org.apache.commons.math.util.FastMath.exp(32.307469852239215d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.073880313918737E14d + "'", double1 == 1.073880313918737E14d);
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.618990892446662d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.618990892446662d + "'", double1 == 0.618990892446662d);
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        double double1 = org.apache.commons.math.util.FastMath.log1p(32.677071525546346d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5168172356396723d + "'", double1 == 3.5168172356396723d);
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        double double1 = org.apache.commons.math.util.FastMath.log10(6.2771399790034055d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.797761813441364d + "'", double1 == 0.797761813441364d);
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) 1477896L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1477896.0d + "'", double1 == 1477896.0d);
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        double double1 = org.apache.commons.math.util.FastMath.tan(6283428.879192634d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-10.11091701010727d) + "'", double1 == (-10.11091701010727d));
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(32.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.656854249492381d + "'", double1 == 5.656854249492381d);
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        double double2 = org.apache.commons.math.util.FastMath.min(0.08341665804059989d, 0.6495717774798734d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08341665804059989d + "'", double2 == 0.08341665804059989d);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        double double1 = org.apache.commons.math.util.FastMath.sinh(14.206130012655933d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 738947.9999996615d + "'", double1 == 738947.9999996615d);
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        long long2 = org.apache.commons.math.util.FastMath.max((long) '#', 57L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 57L + "'", long2 == 57L);
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        double double1 = org.apache.commons.math.util.FastMath.ulp(9.0871877068532768E16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16.0d + "'", double1 == 16.0d);
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) -1, 9.223372E18f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        double double1 = org.apache.commons.math.util.FastMath.log(1.0148369064941645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.014727916325832233d + "'", double1 == 0.014727916325832233d);
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.20757312514495754d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.687989146026119d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        double double1 = org.apache.commons.math.util.FastMath.log(1.6773758358854114d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5172305697683406d + "'", double1 == 0.5172305697683406d);
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.4241520375805427d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.35217266165947814d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.35217266165947814d + "'", double1 == 0.35217266165947814d);
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1, (float) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.5436257195614518d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.026941351224813975d + "'", double1 == 0.026941351224813975d);
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.11858991704089483d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.944243605747584d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9944729848444953d + "'", double1 == 0.9944729848444953d);
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.34679171459871794d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3537847547832183d) + "'", double1 == (-0.3537847547832183d));
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.2129005211903137d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.673779386774358d + "'", double1 == 2.673779386774358d);
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.17453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.12329842152485081d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12392899818381369d + "'", double1 == 0.12392899818381369d);
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.2792211365930397d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 26.55508186172065d + "'", double1 == 26.55508186172065d);
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        double double1 = org.apache.commons.math.util.FastMath.floor((-11.811140782249282d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-12.0d) + "'", double1 == (-12.0d));
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.414213562373095d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9553166181245092d + "'", double1 == 0.9553166181245092d);
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) (-53.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.39592515018183416d) + "'", double1 == (-0.39592515018183416d));
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 10, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.2422079676186446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.932995401022578d + "'", double1 == 2.932995401022578d);
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.6535657774206833d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7939207820958831d + "'", double1 == 0.7939207820958831d);
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.566481311004089d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5953649790673516d + "'", double1 == 1.5953649790673516d);
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.1177647015329363d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        double double1 = org.apache.commons.math.util.FastMath.sin(1384853.16487161d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.989253146137494d + "'", double1 == 0.989253146137494d);
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 10, 97.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.4577979139729036d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.811983583514548d + "'", double1 == 8.811983583514548d);
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.02455177824591122d, 4.1625646422486104d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.024551778245911222d + "'", double2 == 0.024551778245911222d);
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1586013452313419L, (float) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.58601345E15f + "'", float2 == 1.58601345E15f);
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 1477896, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.540302305868139d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 30.957041787430857d + "'", double1 == 30.957041787430857d);
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        double double1 = org.apache.commons.math.util.FastMath.ulp(8.467720335926633E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4901161193847656E-8d + "'", double1 == 1.4901161193847656E-8d);
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(3.637978807091713E-12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0844083160439303E-10d + "'", double1 == 2.0844083160439303E-10d);
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.4541594839761731d), 0.5781043205336559d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6658993515826358d) + "'", double2 == (-0.6658993515826358d));
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        double double1 = org.apache.commons.math.util.FastMath.abs(8.881784197001248E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001248E-16d + "'", double1 == 8.881784197001248E-16d);
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.56173368499807d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.198627263049808d + "'", double1 == 1.198627263049808d);
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1936674.200214744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1096325796417902E8d + "'", double1 == 1.1096325796417902E8d);
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.41945302623948505d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.39646953600203544d + "'", double1 == 0.39646953600203544d);
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9996902999085691d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1747233577816847d + "'", double1 == 1.1747233577816847d);
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9520464219027572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8470555939422493d + "'", double1 == 0.8470555939422493d);
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.7282657137693634d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        double double1 = org.apache.commons.math.util.FastMath.tanh(7.111512116496156d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999986693961787d + "'", double1 == 0.9999986693961787d);
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        double double1 = org.apache.commons.math.util.FastMath.atan((-2.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1071487177940904d) + "'", double1 == (-1.1071487177940904d));
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, (-1.1624473515096263d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        double double1 = org.apache.commons.math.util.FastMath.exp(7.225973768125749E86d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 5, 2.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        int int2 = org.apache.commons.math.util.FastMath.max(35, 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.585786437626905d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-33.5630905720251d) + "'", double1 == (-33.5630905720251d));
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        long long2 = org.apache.commons.math.util.FastMath.max(57L, 36L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 57L + "'", long2 == 57L);
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        long long2 = org.apache.commons.math.util.FastMath.min((long) '4', (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.7805951733159242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9207504798385601d + "'", double1 == 0.9207504798385601d);
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) (-2.0f), 2.71828182845905d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6343243192283728d) + "'", double2 == (-0.6343243192283728d));
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.7091979782135539d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.012377839768313529d) + "'", double1 == (-0.012377839768313529d));
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        double double1 = org.apache.commons.math.util.FastMath.ulp(3.4089393878627656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        long long2 = org.apache.commons.math.util.FastMath.max((-53L), (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.6319270787987707d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6748329642467985d) + "'", double1 == (-0.6748329642467985d));
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.3301388768476645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3301388768476645d + "'", double1 == 0.3301388768476645d);
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        float float1 = org.apache.commons.math.util.FastMath.abs(115.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 115.0f + "'", float1 == 115.0f);
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(100.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-1L), (float) (-36L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-36.0f) + "'", float2 == (-36.0f));
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9944107743857756d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8774158801471853d + "'", double1 == 0.8774158801471853d);
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.4424808105122886d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.44248081051228866d + "'", double1 == 0.44248081051228866d);
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        float float1 = org.apache.commons.math.util.FastMath.abs(2.14748365E9f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.14748365E9f + "'", float1 == 2.14748365E9f);
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.5021549377007348d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 86.06713810498921d + "'", double1 == 86.06713810498921d);
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.3643141559577787d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        int int2 = org.apache.commons.math.util.FastMath.max(53, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        int int2 = org.apache.commons.math.util.FastMath.max(84677176, 84677176);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 84677176 + "'", int2 == 84677176);
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        double double2 = org.apache.commons.math.util.FastMath.max(13.890441852638668d, 0.5840734641020676d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 13.890441852638668d + "'", double2 == 13.890441852638668d);
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.08322398137173832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.487475973326022d + "'", double1 == 1.487475973326022d);
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        double double1 = org.apache.commons.math.util.FastMath.log(Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(7.7703727489272E13d, 2.2204460492503128E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.770372748927198E13d + "'", double2 == 7.770372748927198E13d);
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.179794913231601d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07180651934608964d + "'", double1 == 0.07180651934608964d);
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        double double1 = org.apache.commons.math.util.FastMath.signum((-1.432854651161728d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 149, 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 149L + "'", long2 == 149L);
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        double double1 = org.apache.commons.math.util.FastMath.floor(10.000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        long long2 = org.apache.commons.math.util.FastMath.min(36L, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 36L + "'", long2 == 36L);
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.159862088840656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.020243412319328427d + "'", double1 == 0.020243412319328427d);
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 97, (float) 11013);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        double double1 = org.apache.commons.math.util.FastMath.tan(8.673617379884035E-19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.673617379884035E-19d + "'", double1 == 8.673617379884035E-19d);
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.5067985556900776d, 0.2471906124334223d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1066583692063539d + "'", double2 == 1.1066583692063539d);
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        int int1 = org.apache.commons.math.util.FastMath.round(10.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.7615941559557652d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.913218149746555d + "'", double1 == 0.913218149746555d);
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.4636456564559829d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5898595141626499d + "'", double1 == 0.5898595141626499d);
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.03490658503988659d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        double double1 = org.apache.commons.math.util.FastMath.acos(3.1954271206598093d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9993832155237184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        double double1 = org.apache.commons.math.util.FastMath.log10(5506.500045400884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7408756471404097d + "'", double1 == 3.7408756471404097d);
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.4236164312943335d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 24.27143364555892d + "'", double1 == 24.27143364555892d);
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        int int2 = org.apache.commons.math.util.FastMath.min(149, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.3859684164526524d, 0.022126756261955736d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.38596841645265234d + "'", double2 == 0.38596841645265234d);
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9187506059390845d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8227393363495644d + "'", double1 == 0.8227393363495644d);
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.162447324572857d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.311231699521185d + "'", double1 == 2.311231699521185d);
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.7605576742458647d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.3127199080565219d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.716759133972877d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9999500037496876d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.999750016661555E-5d) + "'", double1 == (-4.999750016661555E-5d));
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.7586713254405011d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.7252048345581925d, 2.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7252048345581926d + "'", double2 == 0.7252048345581926d);
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.8554182836643192d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.1872713236960942d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0175865819274335d + "'", double1 == 1.0175865819274335d);
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
        double double1 = org.apache.commons.math.util.FastMath.sinh(5.691758600279624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 148.20553170468503d + "'", double1 == 148.20553170468503d);
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
        int int2 = org.apache.commons.math.util.FastMath.max(1477896, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1477896 + "'", int2 == 1477896);
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.38596841645265234d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4710382094761008d + "'", double1 == 1.4710382094761008d);
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.0376519448740174d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.694488280497519d + "'", double1 == 1.694488280497519d);
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1477896, (float) ' ');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1477896.0f + "'", float2 == 1477896.0f);
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9356959031938922d, 3.912812809961445d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.912812809961445d + "'", double2 == 3.912812809961445d);
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 0, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
        double double1 = org.apache.commons.math.util.FastMath.cosh(6.591804196680549E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000002172594207d + "'", double1 == 1.0000002172594207d);
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.4152182237572941d), (-0.8279263991776009d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.4152182237572941d) + "'", double2 == (-0.4152182237572941d));
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.044522437723423d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4493492819756304d + "'", double1 == 1.4493492819756304d);
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.5860134523134308E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.5165902998982612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.1072845368400976d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(200.00499987500626d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4907457682697065d + "'", double1 == 3.4907457682697065d);
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
        double double1 = org.apache.commons.math.util.FastMath.abs(55.417748437204494d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 55.417748437204494d + "'", double1 == 55.417748437204494d);
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
        double double1 = org.apache.commons.math.util.FastMath.atan((-1.5707963267948963d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0038848218538872d) + "'", double1 == (-1.0038848218538872d));
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
        double double2 = org.apache.commons.math.util.FastMath.min(5.298292365610485d, (-1.7456418720467646d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.7456418720467646d) + "'", double2 == (-1.7456418720467646d));
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 8.4677176E7f, 7.9277663657849295d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.070979049331375E62d + "'", double2 == 7.070979049331375E62d);
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.8812099535392037d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.015380015090605364d) + "'", double1 == (-0.015380015090605364d));
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9412085051809825d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8391848596426362d + "'", double1 == 0.8391848596426362d);
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
        double double1 = org.apache.commons.math.util.FastMath.sin(6.157240911549055d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.12561170478985625d) + "'", double1 == (-0.12561170478985625d));
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
        double double1 = org.apache.commons.math.util.FastMath.log10(11013.000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.041905639223649d + "'", double1 == 4.041905639223649d);
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.16703684659955795d), 0.6483608274590866d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.25214633649102913d) + "'", double2 == (-0.25214633649102913d));
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
        double double2 = org.apache.commons.math.util.FastMath.max(3.0d, 0.2546972731422684d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0d + "'", double2 == 3.0d);
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.02316541500114063d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.022901169891396195d + "'", double1 == 0.022901169891396195d);
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1L, (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
        double double1 = org.apache.commons.math.util.FastMath.asin(55.417748437204494d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9149994957367078d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.0192608780318253d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5216");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.26022281860914137d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3014062443540735d) + "'", double1 == (-0.3014062443540735d));
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (-36L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 36.0f + "'", float1 == 36.0f);
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.004407855229809197d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9956018451062615d + "'", double1 == 0.9956018451062615d);
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
        int int1 = org.apache.commons.math.util.FastMath.abs(53);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 53 + "'", int1 == 53);
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.5872139151569291d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5872139151569291d + "'", double1 == 0.5872139151569291d);
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.8279263991776009d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.736530362696137d) + "'", double1 == (-0.736530362696137d));
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 1, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5223");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 1586013452313419L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.6077178770248709d), 2.2387944825564388d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2387944825564388d + "'", double2 == 2.2387944825564388d);
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5225");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.311329466289671d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.311329466289671d + "'", double1 == 2.311329466289671d);
    }

    @Test
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5226");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5227");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.48961296732686727d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.31014708848519484d) + "'", double1 == (-0.31014708848519484d));
    }

    @Test
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5228");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.33628768678162146d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3299850016378005d + "'", double1 == 0.3299850016378005d);
    }

    @Test
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5229");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.6085491459180241d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 34.86729768739367d + "'", double1 == 34.86729768739367d);
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5230");
        double double1 = org.apache.commons.math.util.FastMath.asinh(4973.752448262787d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.205077044643586d + "'", double1 == 9.205077044643586d);
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5231");
        double double2 = org.apache.commons.math.util.FastMath.min(1.5707173906673306d, (-0.011028313824087112d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.011028313824087112d) + "'", double2 == (-0.011028313824087112d));
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5232");
        double double1 = org.apache.commons.math.util.FastMath.acos(4.806318343896785E8d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5233");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.7010302935299408d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.15426321451747033d) + "'", double1 == (-0.15426321451747033d));
    }

    @Test
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5234");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.739272481061051d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5534669114595383d + "'", double1 == 0.5534669114595383d);
    }

    @Test
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5235");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.0000000000000002d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5236");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9736862425967708d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5622549684434665d + "'", double1 == 0.5622549684434665d);
    }

    @Test
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5237");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.007393501491634464d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999726681923521d + "'", double1 == 0.9999726681923521d);
    }

    @Test
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5238");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.0749743545693506d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9299177605674704d + "'", double1 == 2.9299177605674704d);
    }

    @Test
    public void test5239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5239");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.6396562447182141d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.06880551211253791d) + "'", double1 == (-0.06880551211253791d));
    }

    @Test
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5240");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.3083117974611422d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3083117974611427d + "'", double1 == 2.3083117974611427d);
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5241");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.6108652381980155d, 1.0118705263048873d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6108652381980156d + "'", double2 == 0.6108652381980156d);
    }

    @Test
    public void test5242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5242");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 10, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5243");
        int int2 = org.apache.commons.math.util.FastMath.max(0, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test5244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5244");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.1046225788468809d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8932946146826604d + "'", double1 == 0.8932946146826604d);
    }

    @Test
    public void test5245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5245");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.21348529365373875d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5246");
        double double2 = org.apache.commons.math.util.FastMath.atan2(5.294660173051446d, 1.3132616875182228d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3276678128814854d + "'", double2 == 1.3276678128814854d);
    }

    @Test
    public void test5247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5247");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.7569959146612817d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3004678721409357d + "'", double1 == 1.3004678721409357d);
    }

    @Test
    public void test5248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5248");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.3332296899280631d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.32735182394122936d + "'", double1 == 0.32735182394122936d);
    }

    @Test
    public void test5249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5249");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 36, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test5250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5250");
        long long2 = org.apache.commons.math.util.FastMath.min(1586013452313419L, (long) 3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test5251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5251");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.368646920020492d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5075937999686018d + "'", double1 == 1.5075937999686018d);
    }

    @Test
    public void test5252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5252");
        double double1 = org.apache.commons.math.util.FastMath.log1p(10.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3978952727983707d + "'", double1 == 2.3978952727983707d);
    }

    @Test
    public void test5253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5253");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.9686168251319445d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7694577750448003d) + "'", double1 == (-0.7694577750448003d));
    }

    @Test
    public void test5254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5254");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.5328418429405195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.026753137071649866d + "'", double1 == 0.026753137071649866d);
    }

    @Test
    public void test5255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5255");
        long long1 = org.apache.commons.math.util.FastMath.round(0.7751999363750869d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test5256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5256");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.3043045862358962d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5257");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.473814720414451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5258");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.0077322051969947875d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5259");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2147483647L, (float) (-36));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-36.0f) + "'", float2 == (-36.0f));
    }

    @Test
    public void test5260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5260");
        double double2 = org.apache.commons.math.util.FastMath.min(1.31844433442071d, 1.2829807711056233E14d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.31844433442071d + "'", double2 == 1.31844433442071d);
    }

    @Test
    public void test5261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5261");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) 2.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.38905609893065d + "'", double1 == 7.38905609893065d);
    }

    @Test
    public void test5262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5262");
        double double1 = org.apache.commons.math.util.FastMath.log10((-1.348658628056262d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5263");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.148283155648077d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test5264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5264");
        long long2 = org.apache.commons.math.util.FastMath.min(4L, 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test5265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5265");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.1d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10016675001984403d + "'", double1 == 0.10016675001984403d);
    }

    @Test
    public void test5266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5266");
        double double1 = org.apache.commons.math.util.FastMath.log(15.333571352853085d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7300446307126625d + "'", double1 == 2.7300446307126625d);
    }

    @Test
    public void test5267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5267");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.2123899885214408d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5268");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.5992442618287416d, 0.7207960780149949d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6935752086037041d + "'", double2 == 0.6935752086037041d);
    }

    @Test
    public void test5269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5269");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.3126911014714069d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5270");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9830787956514044d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6726721993575189d + "'", double1 == 1.6726721993575189d);
    }

    @Test
    public void test5271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5271");
        long long1 = org.apache.commons.math.util.FastMath.round(1.5490315325589654d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test5272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5272");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 52, (float) 53L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 53.0f + "'", float2 == 53.0f);
    }

    @Test
    public void test5273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5273");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.008837977760189568d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.008838092816159753d) + "'", double1 == (-0.008838092816159753d));
    }

    @Test
    public void test5274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5274");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.00848826368395d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5275");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.999690299908569d, (-41.94454512494746d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1177635460638577d + "'", double2 == 3.1177635460638577d);
    }

    @Test
    public void test5276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5276");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.3605663563338206d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36887502277838163d + "'", double1 == 0.36887502277838163d);
    }

    @Test
    public void test5277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5277");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.9039295044086462d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7182058339587472d) + "'", double1 == (-0.7182058339587472d));
    }

    @Test
    public void test5278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5278");
        double double1 = org.apache.commons.math.util.FastMath.log10(6.4642859456318895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8105205590696517d + "'", double1 == 0.8105205590696517d);
    }

    @Test
    public void test5279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5279");
        double double1 = org.apache.commons.math.util.FastMath.exp(16.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8886110.520507872d + "'", double1 == 8886110.520507872d);
    }

    @Test
    public void test5280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5280");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 10, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test5281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5281");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.5308456639204424d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5881074181024651d + "'", double1 == 0.5881074181024651d);
    }

    @Test
    public void test5282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5282");
        int int2 = org.apache.commons.math.util.FastMath.max((int) 'a', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test5283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5283");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(45.41047360972814d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7925622793797507d + "'", double1 == 0.7925622793797507d);
    }

    @Test
    public void test5284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5284");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.17364817766693033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5285");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.8337422720523482d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5286");
        double double1 = org.apache.commons.math.util.FastMath.acos(4.194206803317586d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5287");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.2142337871918323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.832325067667665d + "'", double1 == 1.832325067667665d);
    }

    @Test
    public void test5288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5288");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.3043045862358962d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7615941559557649d + "'", double1 == 0.7615941559557649d);
    }

    @Test
    public void test5289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5289");
        double double2 = org.apache.commons.math.util.FastMath.max(2.757596917891017d, 21.72623702062758d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 21.72623702062758d + "'", double2 == 21.72623702062758d);
    }

    @Test
    public void test5290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5290");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.8096974249238272d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 46.39224513074613d + "'", double1 == 46.39224513074613d);
    }

    @Test
    public void test5291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5291");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.5954732329718483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8278831548941552d + "'", double1 == 0.8278831548941552d);
    }

    @Test
    public void test5292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5292");
        double double1 = org.apache.commons.math.util.FastMath.expm1(4.434556673422888d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 83.31473763748508d + "'", double1 == 83.31473763748508d);
    }

    @Test
    public void test5293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5293");
        double double1 = org.apache.commons.math.util.FastMath.log((-1.224646799147353E-16d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5294");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.9154315634767938d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9411987517398259d + "'", double1 == 0.9411987517398259d);
    }

    @Test
    public void test5295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5295");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-52.99999999999999d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5296");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.9754001961551924d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1375934887012633d) + "'", double1 == (-1.1375934887012633d));
    }

    @Test
    public void test5297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5297");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.4387190799581824d), 4.594700892207039d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.4387190799581824d) + "'", double2 == (-0.4387190799581824d));
    }

    @Test
    public void test5298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5298");
        double double1 = org.apache.commons.math.util.FastMath.asinh(7.211102550927978d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6735424271045924d + "'", double1 == 2.6735424271045924d);
    }

    @Test
    public void test5299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5299");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 52);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9512437185814275d + "'", double1 == 3.9512437185814275d);
    }

    @Test
    public void test5300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5300");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.9155040003582885E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.675640048483193E7d + "'", double1 == 2.675640048483193E7d);
    }

    @Test
    public void test5301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5301");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(6.9721357718677766d, 3.109163004257367d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.972135771867776d + "'", double2 == 6.972135771867776d);
    }

    @Test
    public void test5302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5302");
        double double1 = org.apache.commons.math.util.FastMath.rint(5557.690612768985d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5558.0d + "'", double1 == 5558.0d);
    }

    @Test
    public void test5303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5303");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.44736775427009084d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6688555556097975d + "'", double1 == 0.6688555556097975d);
    }

    @Test
    public void test5304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5304");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.0879329585365737d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08804632163486688d + "'", double1 == 0.08804632163486688d);
    }

    @Test
    public void test5305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5305");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.17229614643660981d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5306");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.6033293179688031d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8281953229790022d + "'", double1 == 1.8281953229790022d);
    }

    @Test
    public void test5307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5307");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-6.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test5308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5308");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.7614645887194331d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6507981596532404d + "'", double1 == 0.6507981596532404d);
    }

    @Test
    public void test5309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5309");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.6535657774206833d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6535657774206834d + "'", double1 == 0.6535657774206834d);
    }

    @Test
    public void test5310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5310");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.5840734641020676d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5551201185705784d + "'", double1 == 0.5551201185705784d);
    }

    @Test
    public void test5311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5311");
        double double1 = org.apache.commons.math.util.FastMath.acos(13.596393407514d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5312");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.4868981666828483d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.48689816668284824d) + "'", double1 == (-0.48689816668284824d));
    }

    @Test
    public void test5313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5313");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.570796326794896d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5314");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) 2147483647L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 21.487562597358306d + "'", double1 == 21.487562597358306d);
    }

    @Test
    public void test5315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5315");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9595656024571418d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4968107275536122d + "'", double1 == 1.4968107275536122d);
    }

    @Test
    public void test5316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5316");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 32, 52.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test5317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5317");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.5971542229890323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6827210822731735d + "'", double1 == 1.6827210822731735d);
    }

    @Test
    public void test5318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5318");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.161724629793691d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3977577903465466d + "'", double1 == 0.3977577903465466d);
    }

    @Test
    public void test5319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5319");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 3L, 2.15561577E15f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.15561577E15f + "'", float2 == 2.15561577E15f);
    }

    @Test
    public void test5320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5320");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.5195675877329186d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 29.769029948889358d + "'", double1 == 29.769029948889358d);
    }

    @Test
    public void test5321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5321");
        long long1 = org.apache.commons.math.util.FastMath.round((-2.4644670694724846d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-2L) + "'", long1 == (-2L));
    }

    @Test
    public void test5322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5322");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.7076312586751926d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3569364887189264d + "'", double1 == 2.3569364887189264d);
    }

    @Test
    public void test5323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5323");
        double double2 = org.apache.commons.math.util.FastMath.min(572.2646479502633d, 43.42944819032519d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 43.42944819032519d + "'", double2 == 43.42944819032519d);
    }

    @Test
    public void test5324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5324");
        double double2 = org.apache.commons.math.util.FastMath.atan2(3.066597411041876d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test5325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5325");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1477896, 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test5326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5326");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.4214027519155643d, 0.8580016718173996d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3521708576437375d + "'", double2 == 1.3521708576437375d);
    }

    @Test
    public void test5327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5327");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.415488095455529d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15468462807020164d + "'", double1 == 0.15468462807020164d);
    }

    @Test
    public void test5328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5328");
        int int2 = org.apache.commons.math.util.FastMath.min(10, 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test5329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5329");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.74342314569772E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7434231455210808E-5d + "'", double1 == 1.7434231455210808E-5d);
    }

    @Test
    public void test5330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5330");
        double double1 = org.apache.commons.math.util.FastMath.atanh(49.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5331");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.5552986459319043d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.225051084162106d + "'", double1 == 1.225051084162106d);
    }

    @Test
    public void test5332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5332");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.1096325796417902E8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 480.53652097639934d + "'", double1 == 480.53652097639934d);
    }

    @Test
    public void test5333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5333");
        double double1 = org.apache.commons.math.util.FastMath.tanh(8.467720335926633E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5334");
        double double2 = org.apache.commons.math.util.FastMath.min(0.7569959146612817d, 2.752220392306203d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7569959146612817d + "'", double2 == 0.7569959146612817d);
    }

    @Test
    public void test5335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5335");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 149);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 149L + "'", long1 == 149L);
    }

    @Test
    public void test5336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5336");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.3030851991129396d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005289834638583393d + "'", double1 == 0.005289834638583393d);
    }

    @Test
    public void test5337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5337");
        int int2 = org.apache.commons.math.util.FastMath.min(10, (-53));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-53) + "'", int2 == (-53));
    }

    @Test
    public void test5338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5338");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 97, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test5339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5339");
        double double1 = org.apache.commons.math.util.FastMath.log(3.8097187196293865d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3375553595443448d + "'", double1 == 1.3375553595443448d);
    }

    @Test
    public void test5340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5340");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.6080833035834908d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2160369210423622d) + "'", double1 == (-0.2160369210423622d));
    }

    @Test
    public void test5341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5341");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.36056635633382056d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.201921304016515d + "'", double1 == 1.201921304016515d);
    }

    @Test
    public void test5342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5342");
        double double1 = org.apache.commons.math.util.FastMath.ulp(3.375663470794074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test5343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5343");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 53, (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 53L + "'", long2 == 53L);
    }

    @Test
    public void test5344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5344");
        double double1 = org.apache.commons.math.util.FastMath.sin(4.2949672929999967E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5825180228008917d + "'", double1 == 0.5825180228008917d);
    }

    @Test
    public void test5345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5345");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.3083117974611427d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1006623109771612d) + "'", double1 == (-1.1006623109771612d));
    }

    @Test
    public void test5346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5346");
        double double1 = org.apache.commons.math.util.FastMath.tanh(7.770372748927198E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5347");
        double double1 = org.apache.commons.math.util.FastMath.rint(3.27767826196252E83d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.27767826196252E83d + "'", double1 == 3.27767826196252E83d);
    }

    @Test
    public void test5348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5348");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.1046225788468806d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5349");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.8355584369206923d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.014583245817083432d + "'", double1 == 0.014583245817083432d);
    }

    @Test
    public void test5350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5350");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-2.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.6268604078470186d) + "'", double1 == (-3.6268604078470186d));
    }

    @Test
    public void test5351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5351");
        double double1 = org.apache.commons.math.util.FastMath.tanh(36.04365338911715d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5352");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.5898595141626499d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8310188317442443d + "'", double1 == 0.8310188317442443d);
    }

    @Test
    public void test5353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5353");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-1.2554125869476498d), 0.5686300059875781d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.2554125869476496d) + "'", double2 == (-1.2554125869476496d));
    }

    @Test
    public void test5354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5354");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.7207960780149949d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.784852216765415d + "'", double1 == 0.784852216765415d);
    }

    @Test
    public void test5355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5355");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9971678302955945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2792211365930317d + "'", double1 == 3.2792211365930317d);
    }

    @Test
    public void test5356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5356");
        double double1 = org.apache.commons.math.util.FastMath.acos(4.041905639223649d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5357");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.17403209863049748d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test5358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5358");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 1, 115L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 115L + "'", long2 == 115L);
    }

    @Test
    public void test5359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5359");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.7252048345581925d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7252048345581925d + "'", double1 == 0.7252048345581925d);
    }

    @Test
    public void test5360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5360");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.8404766374262674d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2227947369108778d) + "'", double1 == (-1.2227947369108778d));
    }

    @Test
    public void test5361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5361");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.7235232133665006d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test5362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5362");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.6912431464778742d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7476213154644117d) + "'", double1 == (-0.7476213154644117d));
    }

    @Test
    public void test5363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5363");
        double double1 = org.apache.commons.math.util.FastMath.log10(16.307772698963607d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2123946495379194d + "'", double1 == 1.2123946495379194d);
    }

    @Test
    public void test5364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5364");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 100, 1477896);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test5365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5365");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0000000000000004d + "'", double1 == 2.0000000000000004d);
    }

    @Test
    public void test5366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5366");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.022126756261955736d, 0.6883420083174141d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.02212675626195574d + "'", double2 == 0.02212675626195574d);
    }

    @Test
    public void test5367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5367");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-1.506844020238002d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5068440202380018d) + "'", double1 == (-1.5068440202380018d));
    }

    @Test
    public void test5368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5368");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.5087272903217452E21d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5087272903217452E21d + "'", double1 == 1.5087272903217452E21d);
    }

    @Test
    public void test5369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5369");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-3.0461741036471235E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.0461741978670873E-4d) + "'", double1 == (-3.0461741978670873E-4d));
    }

    @Test
    public void test5370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5370");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.368646920020492d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5371");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-1.506844020238002d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7783917333079962d) + "'", double1 == (-0.7783917333079962d));
    }

    @Test
    public void test5372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5372");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.9117339147869651d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5373");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.166729680768071d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4032843392668881d + "'", double1 == 1.4032843392668881d);
    }

    @Test
    public void test5374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5374");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9908886150478887d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.693627006662349d + "'", double1 == 2.693627006662349d);
    }

    @Test
    public void test5375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5375");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.1745678692555659d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06987811638105146d + "'", double1 == 0.06987811638105146d);
    }

    @Test
    public void test5376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5376");
        double double1 = org.apache.commons.math.util.FastMath.expm1(4.267909605184542d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 70.37228331994979d + "'", double1 == 70.37228331994979d);
    }

    @Test
    public void test5377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5377");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 115L, 97.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test5378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5378");
        double double1 = org.apache.commons.math.util.FastMath.atan(36.000000000000014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430256902014756d + "'", double1 == 1.5430256902014756d);
    }

    @Test
    public void test5379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5379");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 5.879453102073888E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.879453102073888E-5d + "'", double2 == 5.879453102073888E-5d);
    }

    @Test
    public void test5380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5380");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.41032129904824216d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.38937226128359037d) + "'", double1 == (-0.38937226128359037d));
    }

    @Test
    public void test5381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5381");
        double double1 = org.apache.commons.math.util.FastMath.ulp(4.806318343896785E8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.9604644775390625E-8d + "'", double1 == 5.9604644775390625E-8d);
    }

    @Test
    public void test5382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5382");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.8414709848078965d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5383");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5860134523134298E15d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5384");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.8136000602258506d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5385");
        double double1 = org.apache.commons.math.util.FastMath.cosh(28.476411608537198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1644435251066353E12d + "'", double1 == 1.1644435251066353E12d);
    }

    @Test
    public void test5386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5386");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) 11013);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5387");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 149);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 149 + "'", int1 == 149);
    }

    @Test
    public void test5388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5388");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.989031169415003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.688628384713603d + "'", double1 == 2.688628384713603d);
    }

    @Test
    public void test5389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5389");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.8369144593899815d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.6686019672148054d) + "'", double1 == (-3.6686019672148054d));
    }

    @Test
    public void test5390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5390");
        int int2 = org.apache.commons.math.util.FastMath.max(1, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test5391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5391");
        double double2 = org.apache.commons.math.util.FastMath.max(0.017453292519943295d, (-0.7320704156816698d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.017453292519943295d + "'", double2 == 0.017453292519943295d);
    }

    @Test
    public void test5392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5392");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 97, (float) 11013L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11013.0f + "'", float2 == 11013.0f);
    }

    @Test
    public void test5393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5393");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.6390573296152584d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5394");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9158328057966899d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7414939629033547d + "'", double1 == 0.7414939629033547d);
    }

    @Test
    public void test5395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5395");
        double double1 = org.apache.commons.math.util.FastMath.log(1.554464678075398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4411312278882333d + "'", double1 == 0.4411312278882333d);
    }

    @Test
    public void test5396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5396");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.7453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1736481776669303d) + "'", double1 == (-0.1736481776669303d));
    }

    @Test
    public void test5397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5397");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.8713868162390156d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015208569001841614d + "'", double1 == 0.015208569001841614d);
    }

    @Test
    public void test5398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5398");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9999500037496876d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.718145927957616d + "'", double1 == 1.718145927957616d);
    }

    @Test
    public void test5399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5399");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.3458247401995457E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5400");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9074477826834271d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0372186106470789d + "'", double1 == 1.0372186106470789d);
    }

    @Test
    public void test5401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5401");
        double double1 = org.apache.commons.math.util.FastMath.sinh(44.770142683335514d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.388020644993609E19d + "'", double1 == 1.388020644993609E19d);
    }

    @Test
    public void test5402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5402");
        double double1 = org.apache.commons.math.util.FastMath.log(0.8243712042404339d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1931343599300331d) + "'", double1 == (-0.1931343599300331d));
    }

    @Test
    public void test5403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5403");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.3283064365386963E-10d, 1.5552986459319043d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.328306436538697E-10d + "'", double2 == 2.328306436538697E-10d);
    }

    @Test
    public void test5404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5404");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.7668816193536425d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7200779901622895d + "'", double1 == 0.7200779901622895d);
    }

    @Test
    public void test5405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5405");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.268524170518187d), 2.7181254820354117d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7181254820354117d + "'", double2 == 2.7181254820354117d);
    }

    @Test
    public void test5406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5406");
        long long1 = org.apache.commons.math.util.FastMath.round((double) 57.0f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 57L + "'", long1 == 57L);
    }

    @Test
    public void test5407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5407");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9996915601943024d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7852439197083758d + "'", double1 == 0.7852439197083758d);
    }

    @Test
    public void test5408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5408");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 1, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test5409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5409");
        double double1 = org.apache.commons.math.util.FastMath.log10(5.852975109821626E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.2326233227489847d) + "'", double1 == (-3.2326233227489847d));
    }

    @Test
    public void test5410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5410");
        double double1 = org.apache.commons.math.util.FastMath.cosh(3.392346359950966E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5411");
        long long1 = org.apache.commons.math.util.FastMath.round(3.708744903392718d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void test5412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5412");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.34990093648368725d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5413");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.5215691996538042d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4807536997382096d) + "'", double1 == (-0.4807536997382096d));
    }

    @Test
    public void test5414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5414");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.718145927957616d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5415");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2147483647, (float) 1765L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1765.0f + "'", float2 == 1765.0f);
    }

    @Test
    public void test5416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5416");
        double double1 = org.apache.commons.math.util.FastMath.ulp(30.957041787430857d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.552713678800501E-15d + "'", double1 == 3.552713678800501E-15d);
    }

    @Test
    public void test5417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5417");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.007812579475042568d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.007812658952510657d + "'", double1 == 0.007812658952510657d);
    }

    @Test
    public void test5418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5418");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5419");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.1096325796417902E8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18.5247097041612d + "'", double1 == 18.5247097041612d);
    }

    @Test
    public void test5420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5420");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.5816478800141874d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 33.325968687544645d + "'", double1 == 33.325968687544645d);
    }

    @Test
    public void test5421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5421");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9185375499501867d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6515632030701123d + "'", double1 == 0.6515632030701123d);
    }

    @Test
    public void test5422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5422");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.29540897515091935d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3436757763329488d + "'", double1 == 1.3436757763329488d);
    }

    @Test
    public void test5423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5423");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.4495725029967728d, 1.1624473515096263d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.539688775879394d + "'", double2 == 1.539688775879394d);
    }

    @Test
    public void test5424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5424");
        double double2 = org.apache.commons.math.util.FastMath.max((-3.6686019672148054d), 1.144170023011821E12d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.144170023011821E12d + "'", double2 == 1.144170023011821E12d);
    }

    @Test
    public void test5425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5425");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.270441887429704d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5426");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) 57.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test5427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5427");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.6433380240448354d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.871945894290764d + "'", double1 == 0.871945894290764d);
    }

    @Test
    public void test5428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5428");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.9835725686067016d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7546082841726734d) + "'", double1 == (-0.7546082841726734d));
    }

    @Test
    public void test5429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5429");
        double double1 = org.apache.commons.math.util.FastMath.log(1.4214027519155643d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3516442374686994d + "'", double1 == 0.3516442374686994d);
    }

    @Test
    public void test5430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5430");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.6879189320925984d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8439943304479269d) + "'", double1 == (-0.8439943304479269d));
    }

    @Test
    public void test5431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5431");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(9.860761315262648E-32d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1401849173675503E-16d + "'", double1 == 3.1401849173675503E-16d);
    }

    @Test
    public void test5432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5432");
        int int2 = org.apache.commons.math.util.FastMath.min((-36), 149);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-36) + "'", int2 == (-36));
    }

    @Test
    public void test5433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5433");
        double double1 = org.apache.commons.math.util.FastMath.log(1.470434916701856d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3855582187341452d + "'", double1 == 0.3855582187341452d);
    }

    @Test
    public void test5434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5434");
        int int2 = org.apache.commons.math.util.FastMath.max(32, 149);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 149 + "'", int2 == 149);
    }

    @Test
    public void test5435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5435");
        double double1 = org.apache.commons.math.util.FastMath.acos((-4.632512904931237d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5436");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) 35L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test5437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5437");
        double double1 = org.apache.commons.math.util.FastMath.asinh(5.221766492592815E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 25.371833863690377d + "'", double1 == 25.371833863690377d);
    }

    @Test
    public void test5438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5438");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-53), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-53L) + "'", long2 == (-53L));
    }

    @Test
    public void test5439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5439");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 115L, 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test5440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5440");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.01980133317597954d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.019802627397694055d + "'", double1 == 0.019802627397694055d);
    }

    @Test
    public void test5441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5441");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.650856032201109d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.650856032201109d + "'", double1 == 0.650856032201109d);
    }

    @Test
    public void test5442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5442");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.7944146264030465d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7944146264030465d + "'", double1 == 0.7944146264030465d);
    }

    @Test
    public void test5443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5443");
        double double1 = org.apache.commons.math.util.FastMath.cosh(7.930067261567154E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5444");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1765L, (float) (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test5445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5445");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.5642465536043678d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6390414790847105d + "'", double1 == 0.6390414790847105d);
    }

    @Test
    public void test5446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5446");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.02316541500114063d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5447");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-4946.677118114539d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5448");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.34264343564039074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.465157583976351d) + "'", double1 == (-0.465157583976351d));
    }

    @Test
    public void test5449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5449");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.694488280497519d, (-0.7777872910831916d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.001117769001706d + "'", double2 == 2.001117769001706d);
    }

    @Test
    public void test5450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5450");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.5356723210278893d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18629855661269387d + "'", double1 == 0.18629855661269387d);
    }

    @Test
    public void test5451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5451");
        double double1 = org.apache.commons.math.util.FastMath.ceil(45.41047360972814d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 46.0d + "'", double1 == 46.0d);
    }

    @Test
    public void test5452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5452");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.4007387961164683d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1835281137837277d + "'", double1 == 1.1835281137837277d);
    }

    @Test
    public void test5453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5453");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 3L, 97.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test5454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5454");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.8439943304479269d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5455");
        double double1 = org.apache.commons.math.util.FastMath.expm1(4.377725567322862d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 78.6566535193896d + "'", double1 == 78.6566535193896d);
    }

    @Test
    public void test5456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5456");
        double double1 = org.apache.commons.math.util.FastMath.acos((-1.5556080775287264d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5457");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 149, 3.9481478E13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 149.0f + "'", float2 == 149.0f);
    }

    @Test
    public void test5458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5458");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9532533939390466d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4898102688480725d + "'", double1 == 1.4898102688480725d);
    }

    @Test
    public void test5459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5459");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.2921629435656496d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5460");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1L, 149.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 149.0f + "'", float2 == 149.0f);
    }

    @Test
    public void test5461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5461");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 100, 53L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test5462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5462");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9603247554669253d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01758187565134793d) + "'", double1 == (-0.01758187565134793d));
    }

    @Test
    public void test5463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5463");
        double double1 = org.apache.commons.math.util.FastMath.log(1.5707963267948957d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.45158270528945427d + "'", double1 == 0.45158270528945427d);
    }

    @Test
    public void test5464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5464");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.4418123421690833d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.47448048099206047d) + "'", double1 == (-0.47448048099206047d));
    }

    @Test
    public void test5465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5465");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.0076108850910483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test5466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5466");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.6998927931783815d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5467");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9428090415820637d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2309594173407756d + "'", double1 == 1.2309594173407756d);
    }

    @Test
    public void test5468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5468");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-4.632512904931238d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-51.38113293712154d) + "'", double1 == (-51.38113293712154d));
    }

    @Test
    public void test5469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5469");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.0037614532268226615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0037685363701978d + "'", double1 == 1.0037685363701978d);
    }

    @Test
    public void test5470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5470");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.45967525618227173d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.47762949725975296d) + "'", double1 == (-0.47762949725975296d));
    }

    @Test
    public void test5471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5471");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.21551488653168732d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2405004495349136d + "'", double1 == 0.2405004495349136d);
    }

    @Test
    public void test5472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5472");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9908886150478888d, 20.306852820956568d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8303801932401368d + "'", double2 == 0.8303801932401368d);
    }

    @Test
    public void test5473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5473");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.724275869600789d, 3.912812809961445d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7242758696007892d + "'", double2 == 1.7242758696007892d);
    }

    @Test
    public void test5474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5474");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.7889389978403197d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.013769583109698013d) + "'", double1 == (-0.013769583109698013d));
    }

    @Test
    public void test5475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5475");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.5533448061434307d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test5476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5476");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.3113294662896715d, 2.5999999999999996d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.311329466289672d + "'", double2 == 2.311329466289672d);
    }

    @Test
    public void test5477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5477");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.2662000369860403d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5478");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) -1, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test5479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5479");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 100L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test5480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5480");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.0866878023604363d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.826917543547572d + "'", double1 == 0.826917543547572d);
    }

    @Test
    public void test5481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5481");
        int int1 = org.apache.commons.math.util.FastMath.abs((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test5482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5482");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 0, (-53));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5483");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(4.041905639223649d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07054456145937874d + "'", double1 == 0.07054456145937874d);
    }

    @Test
    public void test5484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5484");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.01709844279797004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.016953909626680193d + "'", double1 == 0.016953909626680193d);
    }

    @Test
    public void test5485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5485");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 10, (-53L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test5486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5486");
        double double2 = org.apache.commons.math.util.FastMath.atan2(9.306852821501208d, 1.592169628316262d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4013615732080147d + "'", double2 == 1.4013615732080147d);
    }

    @Test
    public void test5487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5487");
        double double2 = org.apache.commons.math.util.FastMath.min(0.5716315636979223d, (-0.4161468365471422d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.4161468365471422d) + "'", double2 == (-0.4161468365471422d));
    }

    @Test
    public void test5488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5488");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.0148369064941645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.172048609410293d + "'", double1 == 0.172048609410293d);
    }

    @Test
    public void test5489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5489");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 1, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5490");
        double double2 = org.apache.commons.math.util.FastMath.max(0.8029955704341625d, 0.6738724530171597d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8029955704341625d + "'", double2 == 0.8029955704341625d);
    }

    @Test
    public void test5491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5491");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.8250464049151596d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6898276558057294d + "'", double1 == 0.6898276558057294d);
    }

    @Test
    public void test5492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5492");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 4L, 5.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test5493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5493");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 9223372036854775807L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5494");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9999694819561995d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5495");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.1069990812243715d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8029990530558212d + "'", double1 == 0.8029990530558212d);
    }

    @Test
    public void test5496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5496");
        double double1 = org.apache.commons.math.util.FastMath.asinh(13268.823645422231d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.186319657706955d + "'", double1 == 10.186319657706955d);
    }

    @Test
    public void test5497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5497");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 2.6691802474911265E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test5498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5498");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.5586003788994619d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.44378822552973324d + "'", double1 == 0.44378822552973324d);
    }

    @Test
    public void test5499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5499");
        double double1 = org.apache.commons.math.util.FastMath.sinh(12.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 81377.39570642986d + "'", double1 == 81377.39570642986d);
    }

    @Test
    public void test5500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5500");
        double double1 = org.apache.commons.math.util.FastMath.acos(4.680482178387856d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }
}

