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
        double double1 = org.apache.commons.math.util.FastMath.expm1(7.106683508856263d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1219.0943964290645d + "'", double1 == 1219.0943964290645d);
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1833.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.99188518905606d + "'", double1 == 31.99188518905606d);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.757523200640581d, 0.03505838110136253d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9903114875094028d + "'", double2 == 0.9903114875094028d);
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) (-5));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999092042625951d) + "'", double1 == (-0.9999092042625951d));
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        float float2 = org.apache.commons.math.util.FastMath.min(51.0f, (float) 5L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.0078125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.007843097206448d + "'", double1 == 1.007843097206448d);
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.121131255272116d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9961166569635705d + "'", double1 == 0.9961166569635705d);
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.7015156767002263d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9385078997951388d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0824766957749856d + "'", double1 == 1.0824766957749856d);
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        double double1 = org.apache.commons.math.util.FastMath.cos(4.615120516841259d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0971151574318848d) + "'", double1 == (-0.0971151574318848d));
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.2261911708835167d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6605207131100779d + "'", double1 == 0.6605207131100779d);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.2543614206555753d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9503508426863698d + "'", double1 == 0.9503508426863698d);
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.4171748948550446d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3952240880533118d) + "'", double1 == (-0.3952240880533118d));
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.3516470133102479d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.938806681754034d + "'", double1 == 0.938806681754034d);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 4);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.0f + "'", float1 == 4.0f);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        double double2 = org.apache.commons.math.util.FastMath.min(9.306852817378903d, (-1.5424779567514729E-4d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5424779567514729E-4d) + "'", double2 == (-1.5424779567514729E-4d));
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.024649111432356895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5461447186340243d + "'", double1 == 1.5461447186340243d);
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        double double1 = org.apache.commons.math.util.FastMath.log1p(3.555348061489414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.516301940852837d + "'", double1 == 1.516301940852837d);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        double double1 = org.apache.commons.math.util.FastMath.signum((-1.5574077246549012d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.002378303970603899d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13348192268523312d + "'", double1 == 0.13348192268523312d);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.034776717477448635d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        int int2 = org.apache.commons.math.util.FastMath.min(10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.6180243309565554d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4812058561972497d + "'", double1 == 0.4812058561972497d);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.4651773501465964d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.086961379713775d + "'", double1 == 1.086961379713775d);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 100, (long) (-5));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5L) + "'", long2 == (-5L));
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9775291852754583d, 0.6180243309565554d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9860522640706723d + "'", double2 == 0.9860522640706723d);
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.4403028592460307d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9707255742310666d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24256291304290128d + "'", double1 == 0.24256291304290128d);
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        double double1 = org.apache.commons.math.util.FastMath.log10(10.1734036004608d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.007466274221142d + "'", double1 == 1.007466274221142d);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.3862943611198906d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        double double1 = org.apache.commons.math.util.FastMath.log10(6.350812057622625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8028292606614267d + "'", double1 == 0.8028292606614267d);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.64236324311418d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-13.94907302978827d) + "'", double1 == (-13.94907302978827d));
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.3952240880533118d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.326470907486371d) + "'", double1 == (-0.326470907486371d));
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.01420892545840321d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01420988180444818d + "'", double1 == 0.01420988180444818d);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        float float2 = org.apache.commons.math.util.FastMath.max(32.0f, (float) 2147483647);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        long long1 = org.apache.commons.math.util.FastMath.round(0.008935162900803345d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        int int2 = org.apache.commons.math.util.FastMath.max(3, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9998150716581506d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5404579084624257d + "'", double1 == 0.5404579084624257d);
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9335211344483768d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 53.486821090156674d + "'", double1 == 53.486821090156674d);
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.24154560853011509d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2732155230818425d + "'", double1 == 1.2732155230818425d);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.745474297486651d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.7430987570063676d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.7009464435335946d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0393154606197867d + "'", double1 == 1.0393154606197867d);
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.3936173560075417d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.975359632464468d + "'", double1 == 1.975359632464468d);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.009528896040185642d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009528896040185643d + "'", double1 == 0.009528896040185643d);
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9717769481908543d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9844937764850908d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.15141416880891d + "'", double1 == 1.15141416880891d);
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.28448959157673537d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3290834795645636d + "'", double1 == 1.3290834795645636d);
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.5706882123157566d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027413680827173704d + "'", double1 == 0.027413680827173704d);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.764297879283013d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7218684241594407d + "'", double1 == 0.7218684241594407d);
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        double double2 = org.apache.commons.math.util.FastMath.min(0.3141592653589793d, 0.9492691029357998d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3141592653589793d + "'", double2 == 0.3141592653589793d);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.3856693690918906d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        double double1 = org.apache.commons.math.util.FastMath.abs(5.293304824724492d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.293304824724492d + "'", double1 == 5.293304824724492d);
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.18148297420509218d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.17952899969001357d) + "'", double1 == (-0.17952899969001357d));
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(288.3206630503136d, (-0.39130744711005183d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 288.32066305031356d + "'", double2 == 288.32066305031356d);
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6881171418161356E43d + "'", double1 == 2.6881171418161356E43d);
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.8451846157611319d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 83, 3.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 'a', (-5L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.1361158038315415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8490333012771822d + "'", double1 == 0.8490333012771822d);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.939216676724527d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        long long2 = org.apache.commons.math.util.FastMath.min(6559L, 83L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 83L + "'", long2 == 83L);
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.7827911832928298d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        double double2 = org.apache.commons.math.util.FastMath.max(0.40985124626279884d, 0.12060942723254259d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.40985124626279884d + "'", double2 == 0.40985124626279884d);
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 1, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.7580608622489934d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5737618316160396d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.24820500581157004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.004331994571343558d + "'", double1 == 0.004331994571343558d);
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.41217040928917d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7442044624451434d + "'", double1 == 0.7442044624451434d);
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.1489123351881216d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0111079454968612d + "'", double1 == 1.0111079454968612d);
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8771900820709495d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.994092364175252d + "'", double1 == 0.994092364175252d);
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        double double1 = org.apache.commons.math.util.FastMath.exp(14.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1202604.2841647768d + "'", double1 == 1202604.2841647768d);
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 3280, 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3280L + "'", long2 == 3280L);
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9999999999979521d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7182818284534784d + "'", double1 == 2.7182818284534784d);
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.2363907989011117d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2363907989011117d + "'", double1 == 0.2363907989011117d);
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-16.133816900950777d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999999015598316d) + "'", double1 == (-0.9999999015598316d));
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-1.1174249668428897d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.8771900820709495d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.05690628730711007d) + "'", double1 == (-0.05690628730711007d));
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.6419693473089224d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.372814689377555d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9848065043413134d + "'", double1 == 4.9848065043413134d);
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(564.2988711233954d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 23.7549757129616d + "'", double1 == 23.7549757129616d);
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        double double2 = org.apache.commons.math.util.FastMath.min(0.5499324805615463d, 7.091500380984786E248d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5499324805615463d + "'", double2 == 0.5499324805615463d);
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.5315194283752256d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5569021855067275d + "'", double1 == 0.5569021855067275d);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        long long2 = org.apache.commons.math.util.FastMath.max((-1L), 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.2708164357864931d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        float float2 = org.apache.commons.math.util.FastMath.max(41.0f, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        long long1 = org.apache.commons.math.util.FastMath.abs(97L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 97L + "'", long1 == 97L);
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        double double1 = org.apache.commons.math.util.FastMath.log(0.39593320820718014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9265097480968746d) + "'", double1 == (-0.9265097480968746d));
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.1175823681357508E-22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.5283890156232007d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.39130744711005183d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.3290834795645636d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.9231784609934363d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9231784609934363d + "'", double1 == 0.9231784609934363d);
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.0262690355566166d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1, (float) 2);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.0109461818722032d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017644339434135358d + "'", double1 == 0.017644339434135358d);
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.44443064002423105d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.400600326943082d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.469566183975951d + "'", double1 == 5.469566183975951d);
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        double double1 = org.apache.commons.math.util.FastMath.tan((-17.84718067334252d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5655744078520792d + "'", double1 == 1.5655744078520792d);
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(3.591471064445103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 205.7761342360617d + "'", double1 == 205.7761342360617d);
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.1702959753638869d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1719714629128769d + "'", double1 == 0.1719714629128769d);
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.2182984788308782d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.5834613951988717d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5281699918502043d + "'", double1 == 0.5281699918502043d);
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.4626307887385793d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4463038927734924d) + "'", double1 == (-0.4463038927734924d));
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        int int2 = org.apache.commons.math.util.FastMath.min(3280, 3280);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3280 + "'", int2 == 3280);
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.23839534114633812d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2430166129797537d) + "'", double1 == (-0.2430166129797537d));
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        double double1 = org.apache.commons.math.util.FastMath.cos(7.109850196566456E11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6202188093282305d) + "'", double1 == (-0.6202188093282305d));
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.319776824715853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7798115718222199d + "'", double1 == 0.7798115718222199d);
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        double double1 = org.apache.commons.math.util.FastMath.ceil(7.109850196566456E11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.10985019657E11d + "'", double1 == 7.10985019657E11d);
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        double double1 = org.apache.commons.math.util.FastMath.sin(89.00499281765603d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8626058962062866d + "'", double1 == 0.8626058962062866d);
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        float float2 = org.apache.commons.math.util.FastMath.max((float) ' ', (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.0534147971775811d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.757190837993509d + "'", double1 == 1.757190837993509d);
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) 0.0f, 1.9939190592738272d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        float float2 = org.apache.commons.math.util.FastMath.max((float) '4', (float) 2005L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2005.0f + "'", float2 == 2005.0f);
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.7418580584129385d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.317808380333411d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 75.50485840007525d + "'", double1 == 75.50485840007525d);
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-323.3062153431158d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.6843418860808015E-14d + "'", double1 == 5.6843418860808015E-14d);
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.3205004784536856d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 75.65910426040207d + "'", double1 == 75.65910426040207d);
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.009528896040185643d, 0.22237987770833972d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.04282343610080969d + "'", double2 == 0.04282343610080969d);
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.0001849169413684d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0001849169413684d + "'", double1 == 1.0001849169413684d);
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.0343154071137053d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1139187675577995d + "'", double1 == 1.1139187675577995d);
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.33144561670275613d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18.99043497517871d + "'", double1 == 18.99043497517871d);
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.18584826590581568d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18373771326775734d + "'", double1 == 0.18373771326775734d);
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.18425105161950944d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1852953288937188d + "'", double1 == 0.1852953288937188d);
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.319776824715853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5781356913552533d + "'", double1 == 1.5781356913552533d);
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.3238180489947473d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.2453438403535575d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.0005784555913422d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7618369854566598d + "'", double1 == 0.7618369854566598d);
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.0754855858153687d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.821752223882498d + "'", double1 == 0.821752223882498d);
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 83.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 83.0d + "'", double2 == 83.0d);
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.2543614206555753d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5055990562803734d + "'", double1 == 3.5055990562803734d);
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 10, (float) ' ');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.13838687427840005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.928983836159852d + "'", double1 == 7.928983836159852d);
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 10, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        long long2 = org.apache.commons.math.util.FastMath.min(10L, (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(11012.232874703419d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.24804199389342d + "'", double1 == 22.24804199389342d);
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-1.5603171037625536d), 0.11574532203027807d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.4967513051492982d) + "'", double2 == (-1.4967513051492982d));
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(10.049875621120892d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17540341900446973d + "'", double1 == 0.17540341900446973d);
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.5860134523134298E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.25d + "'", double1 == 0.25d);
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) -1, (long) 36);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 36L + "'", long2 == 36L);
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.2710663101885897d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.150722216996343d + "'", double1 == 13.150722216996343d);
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9030746578456205d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9030746578456205d + "'", double1 == 0.9030746578456205d);
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (short) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.6567042118906716d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.287130223361518d + "'", double1 == 1.287130223361518d);
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 0L, (float) 3L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.024649111432356895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02464661606873139d + "'", double1 == 0.02464661606873139d);
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.0728365155995324d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(101.1002695260926d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 101.10026952609262d + "'", double1 == 101.10026952609262d);
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        int int1 = org.apache.commons.math.util.FastMath.round(100.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.093079357587117d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 62.62883386261312d + "'", double1 == 62.62883386261312d);
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.2708164357864931d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.27774466632759137d + "'", double1 == 0.27774466632759137d);
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        int int2 = org.apache.commons.math.util.FastMath.max(49, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 49 + "'", int2 == 49);
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 1, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        double double2 = org.apache.commons.math.util.FastMath.max(1.0798750298496722d, 1.5567229026732161d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5567229026732161d + "'", double2 == 1.5567229026732161d);
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        double double1 = org.apache.commons.math.util.FastMath.acos(3.0000000000000004d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        double double1 = org.apache.commons.math.util.FastMath.log(6559.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.788593431293735d + "'", double1 == 8.788593431293735d);
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.7406467636856449d, 2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7406467636856447d + "'", double2 == 0.7406467636856447d);
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.5344870970745856d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.40389008459726955d + "'", double1 == 0.40389008459726955d);
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.1884117453587528d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9917933885729989d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 0, 3280L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.8104773809652297d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06650537637061356d + "'", double1 == 0.06650537637061356d);
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 105L, (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.6952684310179387d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.99239499596348d) + "'", double1 == (-7.99239499596348d));
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        double double2 = org.apache.commons.math.util.FastMath.pow(23.566702073076858d, 0.7428042414504862d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.455610055638118d + "'", double2 == 10.455610055638118d);
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.4446678610097663d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.130462092319088d + "'", double1 == 1.130462092319088d);
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) 5.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 147.4131591025766d + "'", double1 == 147.4131591025766d);
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        long long1 = org.apache.commons.math.util.FastMath.round((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.07270966677774478d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.498022441476366d + "'", double1 == 1.498022441476366d);
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        double double1 = org.apache.commons.math.util.FastMath.ulp(14.703675447597915d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.8540342600388389d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.26811775505569796d + "'", double1 == 0.26811775505569796d);
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.9912395140417428d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-56.79384064119056d) + "'", double1 == (-56.79384064119056d));
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        int int2 = org.apache.commons.math.util.FastMath.min((int) 'a', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) ' ', 0.37287332357954484d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 31.999999999999996d + "'", double2 == 31.999999999999996d);
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.5111502441944042d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4911626011666589d + "'", double1 == 0.4911626011666589d);
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        int int1 = org.apache.commons.math.util.FastMath.abs(49);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 49 + "'", int1 == 49);
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        double double1 = org.apache.commons.math.util.FastMath.tan(34.999999999999886d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.47381472041431183d + "'", double1 == 0.47381472041431183d);
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9298471527633106d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
        double double1 = org.apache.commons.math.util.FastMath.rint(4.295214085529645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 2147483647);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2147483647L + "'", long1 == 2147483647L);
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 9.223372E18f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(Double.NaN, 0.8148475049841903d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
        long long1 = org.apache.commons.math.util.FastMath.round(1.5443307250557672d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.9912395140417428d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5328443826719127d + "'", double1 == 1.5328443826719127d);
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
        double double1 = org.apache.commons.math.util.FastMath.sinh(12.610439577969121d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 149835.36406408335d + "'", double1 == 149835.36406408335d);
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) -1, 3280);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3280 + "'", int2 == 3280);
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9999997749296758d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7182812166545416d + "'", double1 == 2.7182812166545416d);
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
        double double1 = org.apache.commons.math.util.FastMath.tan(1350.2725658295117d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7023108900190393d) + "'", double1 == (-0.7023108900190393d));
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 100, (float) 41L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
        double double2 = org.apache.commons.math.util.FastMath.max(0.016379320517716164d, 0.806677178940103d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.806677178940103d + "'", double2 == 0.806677178940103d);
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.538526609641118d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.369992654280958d + "'", double1 == 6.369992654280958d);
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
        double double2 = org.apache.commons.math.util.FastMath.max(5.620387737964422d, 1.3967916312027995d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.620387737964422d + "'", double2 == 5.620387737964422d);
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.038991025401791155d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.33909512969033245d + "'", double1 == 0.33909512969033245d);
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.993222846126381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.999999999999998d + "'", double1 == 9.999999999999998d);
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.40985124626279884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.1057044739884163d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.0342796520587978d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01805158531480737d + "'", double1 == 0.01805158531480737d);
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.753263026440201d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.753263026440201d + "'", double1 == 0.753263026440201d);
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.015938121814835213d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015936772466787583d + "'", double1 == 0.015936772466787583d);
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9891013135438893d, (-0.4171748948550446d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.4171748948550446d) + "'", double2 == (-0.4171748948550446d));
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
        double double2 = org.apache.commons.math.util.FastMath.pow(4.615120516841261d, 0.4342944819032518d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9429026116126435d + "'", double2 == 1.9429026116126435d);
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9941356190863951d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017350939764409778d + "'", double1 == 0.017350939764409778d);
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.04494641540543966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04493129583614894d + "'", double1 == 0.04493129583614894d);
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.24256291304290128d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24019129778942017d + "'", double1 == 0.24019129778942017d);
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
        long long1 = org.apache.commons.math.util.FastMath.abs(35L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 35L + "'", long1 == 35L);
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.27546793203913456d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5599289512552249d) + "'", double1 == (-0.5599289512552249d));
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.0011273202561264d, 1.1219529208307404d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7285489649870592d + "'", double2 == 0.7285489649870592d);
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
        double double2 = org.apache.commons.math.util.FastMath.max((double) 3280, 0.5119471234779015d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3280.0d + "'", double2 == 3280.0d);
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.6783203845295841d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1341992117730424d) + "'", double1 == (-1.1341992117730424d));
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
        float float2 = org.apache.commons.math.util.FastMath.max(3.0f, (float) 4);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.975359632464468d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
        long long1 = org.apache.commons.math.util.FastMath.round(1.0062173906847702d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5216");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.15390111975262427d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.416281099899578d + "'", double1 == 1.416281099899578d);
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.4129701157116966d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.532679550248382d) + "'", double1 == (-0.532679550248382d));
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 6559L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6559.0f + "'", float1 == 6559.0f);
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
        double double1 = org.apache.commons.math.util.FastMath.exp((-2.713130608547954d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06632883173314777d + "'", double1 == 0.06632883173314777d);
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.0000000000000047d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000047d + "'", double1 == 1.0000000000000047d);
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.225431076931693E-25d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.225431076931693E-25d + "'", double1 == 1.225431076931693E-25d);
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
        long long2 = org.apache.commons.math.util.FastMath.max(6559L, 49L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6559L + "'", long2 == 6559L);
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5223");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.036895443825105d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
        double double2 = org.apache.commons.math.util.FastMath.max((double) (-1.0f), 1.0000000000000018d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000000000000018d + "'", double2 == 1.0000000000000018d);
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5225");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.5328443826719127d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5328443826719127d + "'", double1 == 1.5328443826719127d);
    }

    @Test
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5226");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.5063656411095873d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5227");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5228");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.8677880986532194d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.06158631033111788d) + "'", double1 == (-0.06158631033111788d));
    }

    @Test
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5229");
        double double1 = org.apache.commons.math.util.FastMath.sin(87.86797250243188d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.09647152839964697d) + "'", double1 == (-0.09647152839964697d));
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5230");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.4624401575195365d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 26.49586930323442d + "'", double1 == 26.49586930323442d);
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5231");
        float float1 = org.apache.commons.math.util.FastMath.abs(36.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 36.0f + "'", float1 == 36.0f);
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5232");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.416281099899578d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1474089466969337d + "'", double1 == 1.1474089466969337d);
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5233");
        double double2 = org.apache.commons.math.util.FastMath.min(4.605170185988094d, (-0.24541566109532464d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.24541566109532464d) + "'", double2 == (-0.24541566109532464d));
    }

    @Test
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5234");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.6233795230203681d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.243853708567401d + "'", double1 == 2.243853708567401d);
    }

    @Test
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5235");
        double double1 = org.apache.commons.math.util.FastMath.log10(7.197874973409682E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-15.142795701282697d) + "'", double1 == (-15.142795701282697d));
    }

    @Test
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5236");
        double double1 = org.apache.commons.math.util.FastMath.log1p(8.881784197001252E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001248E-16d + "'", double1 == 8.881784197001248E-16d);
    }

    @Test
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5237");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.024231811661011956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02423418369650573d + "'", double1 == 0.02423418369650573d);
    }

    @Test
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5238");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) 36);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.12796368962740468d) + "'", double1 == (-0.12796368962740468d));
    }

    @Test
    public void test5239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5239");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.5751658111626728d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8391021170060218d + "'", double1 == 0.8391021170060218d);
    }

    @Test
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5240");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.0393154606197867d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8272809666161267d + "'", double1 == 2.8272809666161267d);
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5241");
        double double1 = org.apache.commons.math.util.FastMath.cos(8.207110122769961d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3458349416236008d) + "'", double1 == (-0.3458349416236008d));
    }

    @Test
    public void test5242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5242");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.4248349501142077d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.42483495011420774d + "'", double1 == 0.42483495011420774d);
    }

    @Test
    public void test5243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5243");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.5608425149227072d, 1.5242004660685926d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5608425149227073d + "'", double2 == 0.5608425149227073d);
    }

    @Test
    public void test5244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5244");
        float float2 = org.apache.commons.math.util.FastMath.min(6559.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5245");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test5246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5246");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.14204205990496743d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14156490267411437d + "'", double1 == 0.14156490267411437d);
    }

    @Test
    public void test5247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5247");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.32953831721022764d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5248");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-1.635447929274436d), 0.6271511736020818d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.2046174841836688d) + "'", double2 == (-1.2046174841836688d));
    }

    @Test
    public void test5249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5249");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5250");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1965.6378749304042d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5251");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.9998000664264803d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8183832327885827d + "'", double1 == 1.8183832327885827d);
    }

    @Test
    public void test5252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5252");
        long long2 = org.apache.commons.math.util.FastMath.max((-5L), (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test5253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5253");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 4, (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test5254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5254");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.11765201143093872d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5255");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 39481480091341L, (float) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.9481478E13f + "'", float2 == 3.9481478E13f);
    }

    @Test
    public void test5256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5256");
        double double1 = org.apache.commons.math.util.FastMath.log1p(13.150722216996343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6497656628571593d + "'", double1 == 2.6497656628571593d);
    }

    @Test
    public void test5257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5257");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.5707963001144702d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0038848141592405d + "'", double1 == 1.0038848141592405d);
    }

    @Test
    public void test5258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5258");
        long long1 = org.apache.commons.math.util.FastMath.round(0.5186693692550166d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test5259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5259");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.3877787807814457E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3877787807814457E-17d + "'", double1 == 1.3877787807814457E-17d);
    }

    @Test
    public void test5260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5260");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.5440211074304587d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test5261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5261");
        double double1 = org.apache.commons.math.util.FastMath.floor(8.0959035329611d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.0d + "'", double1 == 8.0d);
    }

    @Test
    public void test5262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5262");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2, (float) 5L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test5263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5263");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.281588225835499d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2743743817306181d) + "'", double1 == (-0.2743743817306181d));
    }

    @Test
    public void test5264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5264");
        double double2 = org.apache.commons.math.util.FastMath.min(0.44523769810820424d, 6.369992654280958d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.44523769810820424d + "'", double2 == 0.44523769810820424d);
    }

    @Test
    public void test5265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5265");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.3588470982042273d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8917039619221607d + "'", double1 == 3.8917039619221607d);
    }

    @Test
    public void test5266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5266");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9110439668248159d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.04046066354440338d) + "'", double1 == (-0.04046066354440338d));
    }

    @Test
    public void test5267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5267");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.017533279424944842d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test5268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5268");
        long long2 = org.apache.commons.math.util.FastMath.min(10L, (long) 3280);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test5269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5269");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 97L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.691673596021348E41d + "'", double1 == 6.691673596021348E41d);
    }

    @Test
    public void test5270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5270");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.15211025423281543d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5271");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.4705882352941176d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5272");
        int int2 = org.apache.commons.math.util.FastMath.max(32, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test5273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5273");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.02464661606873139d, 0.7068730370437739d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.034852985335759985d + "'", double2 == 0.034852985335759985d);
    }

    @Test
    public void test5274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5274");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.3801063813513533d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6165276809287262d + "'", double1 == 0.6165276809287262d);
    }

    @Test
    public void test5275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5275");
        double double1 = org.apache.commons.math.util.FastMath.expm1(53.486821090156674d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6944597378512866E23d + "'", double1 == 1.6944597378512866E23d);
    }

    @Test
    public void test5276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5276");
        long long1 = org.apache.commons.math.util.FastMath.round(2.5300284545496456d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test5277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5277");
        float float2 = org.apache.commons.math.util.FastMath.max(3280.0f, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3280.0f + "'", float2 == 3280.0f);
    }

    @Test
    public void test5278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5278");
        double double1 = org.apache.commons.math.util.FastMath.sinh(57.28518781699162d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7810373552008643E24d + "'", double1 == 3.7810373552008643E24d);
    }

    @Test
    public void test5279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5279");
        double double1 = org.apache.commons.math.util.FastMath.floor((-1.532821681221366d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test5280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5280");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.17540341900446973d, 0.13417614850536844d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9177909876895602d + "'", double2 == 0.9177909876895602d);
    }

    @Test
    public void test5281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5281");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.7715216602443775d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5282");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.6285343982292605d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5570422094840519d + "'", double1 == 0.5570422094840519d);
    }

    @Test
    public void test5283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5283");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.4694715627858907d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3283907090404725d) + "'", double1 == (-0.3283907090404725d));
    }

    @Test
    public void test5284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5284");
        double double1 = org.apache.commons.math.util.FastMath.exp(100.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6881171418161356E43d + "'", double1 == 2.6881171418161356E43d);
    }

    @Test
    public void test5285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5285");
        int int2 = org.apache.commons.math.util.FastMath.max(36, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test5286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5286");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.623379523020368d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5361295105054666d + "'", double1 == 0.5361295105054666d);
    }

    @Test
    public void test5287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5287");
        int int2 = org.apache.commons.math.util.FastMath.max((-5), (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test5288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5288");
        double double1 = org.apache.commons.math.util.FastMath.rint(4.61512051684126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test5289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5289");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2005.3522829578812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.0d + "'", double1 == 35.0d);
    }

    @Test
    public void test5290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5290");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.1088821403655396d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test5291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5291");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.020040621669131474d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.6980888105849437d) + "'", double1 == (-1.6980888105849437d));
    }

    @Test
    public void test5292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5292");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.5877618172544402d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1777623173828038d + "'", double1 == 1.1777623173828038d);
    }

    @Test
    public void test5293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5293");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.7351801576829817d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5294");
        double double2 = org.apache.commons.math.util.FastMath.max(0.12916659901223482d, 1.086961379713775d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.086961379713775d + "'", double2 == 1.086961379713775d);
    }

    @Test
    public void test5295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5295");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.0000000000000047d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.295779513082586d + "'", double1 == 57.295779513082586d);
    }

    @Test
    public void test5296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5296");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 36);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 36 + "'", int1 == 36);
    }

    @Test
    public void test5297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5297");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.0007236390591894d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5396932431839148d + "'", double1 == 0.5396932431839148d);
    }

    @Test
    public void test5298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5298");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.6782858550610651d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9704971179648549d + "'", double1 == 0.9704971179648549d);
    }

    @Test
    public void test5299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5299");
        double double1 = org.apache.commons.math.util.FastMath.log(0.6165276809287262d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.48365205725801996d) + "'", double1 == (-0.48365205725801996d));
    }

    @Test
    public void test5300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5300");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 6559L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6015665163590591d) + "'", double1 == (-0.6015665163590591d));
    }

    @Test
    public void test5301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5301");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(13.713704735340738d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.703201957136653d + "'", double1 == 3.703201957136653d);
    }

    @Test
    public void test5302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5302");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.4734562420520403d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49134394501154993d + "'", double1 == 0.49134394501154993d);
    }

    @Test
    public void test5303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5303");
        double double2 = org.apache.commons.math.util.FastMath.min(1.5707946849018772d, 0.9725420682979977d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9725420682979977d + "'", double2 == 0.9725420682979977d);
    }

    @Test
    public void test5304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5304");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.5067775983634798d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.48726566137191163d + "'", double1 == 0.48726566137191163d);
    }

    @Test
    public void test5305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5305");
        double double1 = org.apache.commons.math.util.FastMath.log(1.302111682830096d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2639873180109631d + "'", double1 == 0.2639873180109631d);
    }

    @Test
    public void test5306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5306");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.07222019603409709d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.41644043134766945d) + "'", double1 == (-0.41644043134766945d));
    }

    @Test
    public void test5307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5307");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8221857156655815d, 1.553337343543345d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8221857156655816d + "'", double2 == 0.8221857156655816d);
    }

    @Test
    public void test5308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5308");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.154434690031884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test5309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5309");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.3896191574681083d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5310");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 49L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 49.0f + "'", float1 == 49.0f);
    }

    @Test
    public void test5311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5311");
        double double1 = org.apache.commons.math.util.FastMath.sinh(7.02872884975508d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 564.2970990100332d + "'", double1 == 564.2970990100332d);
    }

    @Test
    public void test5312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5312");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.020028223269184096d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0202301338501234d + "'", double1 == 1.0202301338501234d);
    }

    @Test
    public void test5313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5313");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.5108256237659905d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test5314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5314");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.28847397809838626d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.28084920863165236d + "'", double1 == 0.28084920863165236d);
    }

    @Test
    public void test5315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5315");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.516301940852837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5163019408528373d + "'", double1 == 1.5163019408528373d);
    }

    @Test
    public void test5316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5316");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.3027386825521336d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2982952388073999d + "'", double1 == 0.2982952388073999d);
    }

    @Test
    public void test5317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5317");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9929402025489149d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11889592015824525d + "'", double1 == 0.11889592015824525d);
    }

    @Test
    public void test5318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5318");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.40893653071341846d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4089365307134184d) + "'", double1 == (-0.4089365307134184d));
    }

    @Test
    public void test5319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5319");
        long long2 = org.apache.commons.math.util.FastMath.min(2147483647L, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test5320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5320");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 36.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1556157735575975E15d + "'", double1 == 2.1556157735575975E15d);
    }

    @Test
    public void test5321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5321");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.5872139151569291d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6276125002048193d) + "'", double1 == (-0.6276125002048193d));
    }

    @Test
    public void test5322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5322");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.093079357587117d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7386363584579885d + "'", double1 == 0.7386363584579885d);
    }

    @Test
    public void test5323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5323");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232920103323d + "'", double1 == 11013.232920103323d);
    }

    @Test
    public void test5324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5324");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 'a', 35.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test5325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5325");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.8358515696195365d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7604195022182948d + "'", double1 == 0.7604195022182948d);
    }

    @Test
    public void test5326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5326");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.2062746732493863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3565024188670095d + "'", double1 == 0.3565024188670095d);
    }

    @Test
    public void test5327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5327");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2005, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2005.0f + "'", float2 == 2005.0f);
    }

    @Test
    public void test5328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5328");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.8391021170060218d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 48.077009884937624d + "'", double1 == 48.077009884937624d);
    }

    @Test
    public void test5329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5329");
        long long1 = org.apache.commons.math.util.FastMath.round(0.09761754175421355d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test5330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5330");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.6742905716087851d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8307927247660994d + "'", double1 == 0.8307927247660994d);
    }

    @Test
    public void test5331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5331");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 52L, 42.81354925721529d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 42.81354925721529d + "'", double2 == 42.81354925721529d);
    }

    @Test
    public void test5332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5332");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.22275386159456184d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963267948966d) + "'", double2 == (-1.5707963267948966d));
    }

    @Test
    public void test5333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5333");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 1, 3.9481478E13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test5334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5334");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.3877787807814457E-17d, 3.174802103936399d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.021362533392777E-54d + "'", double2 == 3.021362533392777E-54d);
    }

    @Test
    public void test5335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5335");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.26778933372473396d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9643581950821597d + "'", double1 == 0.9643581950821597d);
    }

    @Test
    public void test5336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5336");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.6903377571690373d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 39.553439924312926d + "'", double1 == 39.553439924312926d);
    }

    @Test
    public void test5337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5337");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.912801418045861d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7224741314941174d + "'", double1 == 0.7224741314941174d);
    }

    @Test
    public void test5338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5338");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.5154762810024204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5701593298424005d + "'", double1 == 0.5701593298424005d);
    }

    @Test
    public void test5339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5339");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-4.788598848288131d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.2701133633433246d) + "'", double1 == (-2.2701133633433246d));
    }

    @Test
    public void test5340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5340");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) 51L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7084297692661896d + "'", double1 == 3.7084297692661896d);
    }

    @Test
    public void test5341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5341");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.1259469553800836d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8096275495977845d + "'", double1 == 0.8096275495977845d);
    }

    @Test
    public void test5342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5342");
        double double2 = org.apache.commons.math.util.FastMath.min(48.077009884937624d, Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 48.077009884937624d + "'", double2 == 48.077009884937624d);
    }

    @Test
    public void test5343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5343");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.011408233318727529d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.9911123324751505E-4d) + "'", double1 == (-1.9911123324751505E-4d));
    }

    @Test
    public void test5344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5344");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.46895884275557587d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.008184875862427157d) + "'", double1 == (-0.008184875862427157d));
    }

    @Test
    public void test5345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5345");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test5346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5346");
        long long2 = org.apache.commons.math.util.FastMath.min(3L, (long) (-5));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5L) + "'", long2 == (-5L));
    }

    @Test
    public void test5347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5347");
        double double1 = org.apache.commons.math.util.FastMath.log(1.5504171915615343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.43852405056137d + "'", double1 == 0.43852405056137d);
    }

    @Test
    public void test5348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5348");
        double double1 = org.apache.commons.math.util.FastMath.log10(171.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2329961103921536d + "'", double1 == 2.2329961103921536d);
    }

    @Test
    public void test5349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5349");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.5707946849018772d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5350");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.26241365373669573d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test5351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5351");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 51, (long) 3280);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3280L + "'", long2 == 3280L);
    }

    @Test
    public void test5352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5352");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.10701348355876977d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.10680934945016536d) + "'", double1 == (-0.10680934945016536d));
    }

    @Test
    public void test5353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5353");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) 51L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9030861493754311d + "'", double1 == 0.9030861493754311d);
    }

    @Test
    public void test5354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5354");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.4129701157116966d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.39099165889953685d) + "'", double1 == (-0.39099165889953685d));
    }

    @Test
    public void test5355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5355");
        double double1 = org.apache.commons.math.util.FastMath.rint(8447.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8447.0d + "'", double1 == 8447.0d);
    }

    @Test
    public void test5356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5356");
        double double1 = org.apache.commons.math.util.FastMath.atanh(40.19388753718691d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5357");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.4109596116102156d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.007172598315315378d) + "'", double1 == (-0.007172598315315378d));
    }

    @Test
    public void test5358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5358");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8708761885459468d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9852092622487529d + "'", double1 == 0.9852092622487529d);
    }

    @Test
    public void test5359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5359");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9147226107566937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7233912473191666d + "'", double1 == 0.7233912473191666d);
    }

    @Test
    public void test5360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5360");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.5707963267948961d, 0.5403023023993377d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.570796326794896d + "'", double2 == 1.570796326794896d);
    }

    @Test
    public void test5361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5361");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.010308913146243284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.010309095741587301d + "'", double1 == 0.010309095741587301d);
    }

    @Test
    public void test5362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5362");
        double double1 = org.apache.commons.math.util.FastMath.atanh(42.81354925721529d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5363");
        double double1 = org.apache.commons.math.util.FastMath.acos(5.244348724433776E63d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5364");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.39130744711005183d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test5365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5365");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.9903383527331044d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.921070790142847d + "'", double1 == 9.921070790142847d);
    }

    @Test
    public void test5366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5366");
        long long2 = org.apache.commons.math.util.FastMath.max(3L, (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test5367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5367");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.7605884021621934d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7605884021621934d + "'", double1 == 0.7605884021621934d);
    }

    @Test
    public void test5368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5368");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.12270990624068587d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12333144183930954d + "'", double1 == 0.12333144183930954d);
    }

    @Test
    public void test5369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5369");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) 105.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test5370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5370");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.1226744880631757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9112457457114389d) + "'", double1 == (-0.9112457457114389d));
    }

    @Test
    public void test5371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5371");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 10, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test5372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5372");
        float float1 = org.apache.commons.math.util.FastMath.abs(3280.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3280.0f + "'", float1 == 3280.0f);
    }

    @Test
    public void test5373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5373");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.7386363584579885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7386363584579886d + "'", double1 == 0.7386363584579886d);
    }

    @Test
    public void test5374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5374");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.5750144820273283d, 1.287130223361518d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5750144820273284d + "'", double2 == 0.5750144820273284d);
    }

    @Test
    public void test5375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5375");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-1.0697079433475818d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0697079433475816d) + "'", double1 == (-1.0697079433475816d));
    }

    @Test
    public void test5376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5376");
        double double1 = org.apache.commons.math.util.FastMath.ceil(3.591471064445103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test5377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5377");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.37101925991283097d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3896045456008377d + "'", double1 == 0.3896045456008377d);
    }

    @Test
    public void test5378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5378");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.5063788250893344d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5309802039261721d) + "'", double1 == (-0.5309802039261721d));
    }

    @Test
    public void test5379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5379");
        double double1 = org.apache.commons.math.util.FastMath.expm1(4.644298430695373d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 102.99038372622381d + "'", double1 == 102.99038372622381d);
    }

    @Test
    public void test5380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5380");
        double double1 = org.apache.commons.math.util.FastMath.log(9.921070790142847d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2946608580261256d + "'", double1 == 2.2946608580261256d);
    }

    @Test
    public void test5381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5381");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.656854249492381d + "'", double1 == 5.656854249492381d);
    }

    @Test
    public void test5382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5382");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.4377635705533984d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5383");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.357488869363912d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.564389553932575d + "'", double1 == 10.564389553932575d);
    }

    @Test
    public void test5384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5384");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.01687178265730875d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7728390278240145d) + "'", double1 == (-1.7728390278240145d));
    }

    @Test
    public void test5385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5385");
        double double1 = org.apache.commons.math.util.FastMath.expm1(3.7353126200110887d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 40.90112264521706d + "'", double1 == 40.90112264521706d);
    }

    @Test
    public void test5386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5386");
        long long1 = org.apache.commons.math.util.FastMath.abs(49L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 49L + "'", long1 == 49L);
    }

    @Test
    public void test5387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5387");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 10, 32.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test5388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5388");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) 52);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5515679276951895d + "'", double1 == 1.5515679276951895d);
    }

    @Test
    public void test5389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5389");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 0.7615165085805536d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7615165085805536d + "'", double2 == 0.7615165085805536d);
    }

    @Test
    public void test5390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5390");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.7769994643832112d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0582197318914828d + "'", double1 == 1.0582197318914828d);
    }

    @Test
    public void test5391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5391");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.06036928144991057d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.938893903907228E-18d + "'", double1 == 6.938893903907228E-18d);
    }

    @Test
    public void test5392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5392");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.1271784427026251d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5393");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.0582197318914828d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5394");
        double double1 = org.apache.commons.math.util.FastMath.acos(3.8104773809652297d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5395");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.8358515696195364d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3701413791081227d + "'", double1 == 1.3701413791081227d);
    }

    @Test
    public void test5396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5396");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, 6559.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5397");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.3978952727983707d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.000000000000002d + "'", double1 == 11.000000000000002d);
    }

    @Test
    public void test5398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5398");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.3025850929940461d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.638569140438832d + "'", double1 == 3.638569140438832d);
    }

    @Test
    public void test5399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5399");
        int int2 = org.apache.commons.math.util.FastMath.max(2147483647, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test5400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5400");
        double double2 = org.apache.commons.math.util.FastMath.max(0.024913294410754103d, 0.6285343982292605d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6285343982292605d + "'", double2 == 0.6285343982292605d);
    }

    @Test
    public void test5401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5401");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 0L, (float) 6559L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6559.0f + "'", float2 == 6559.0f);
    }

    @Test
    public void test5402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5402");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.12765935971054657d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5403");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.48689816668285923d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4531113122902532d) + "'", double1 == (-0.4531113122902532d));
    }

    @Test
    public void test5404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5404");
        double double1 = org.apache.commons.math.util.FastMath.log(0.8036668909554542d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.21857041038725544d) + "'", double1 == (-0.21857041038725544d));
    }

    @Test
    public void test5405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5405");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.2667091410902068d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9646434516111302d + "'", double1 == 0.9646434516111302d);
    }

    @Test
    public void test5406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5406");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.05542260109486248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.673068691247645E-4d + "'", double1 == 9.673068691247645E-4d);
    }

    @Test
    public void test5407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5407");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.7456282765000656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1077652784594167d + "'", double1 == 1.1077652784594167d);
    }

    @Test
    public void test5408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5408");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.930067261567154E14d + "'", double1 == 7.930067261567154E14d);
    }

    @Test
    public void test5409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5409");
        double double1 = org.apache.commons.math.util.FastMath.sinh(4.404100224168282d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 40.886646994108474d + "'", double1 == 40.886646994108474d);
    }

    @Test
    public void test5410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5410");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 97.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.574710978503383d + "'", double1 == 4.574710978503383d);
    }

    @Test
    public void test5411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5411");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.229038087540316d, 0.3844732404433468d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2290380875403157d + "'", double2 == 1.2290380875403157d);
    }

    @Test
    public void test5412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5412");
        double double1 = org.apache.commons.math.util.FastMath.cos(6.939685341941263E20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9988116486579154d + "'", double1 == 0.9988116486579154d);
    }

    @Test
    public void test5413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5413");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.05690628730711007d), 1.5737618316160398d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5737618316160398d + "'", double2 == 1.5737618316160398d);
    }

    @Test
    public void test5414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5414");
        long long1 = org.apache.commons.math.util.FastMath.round(0.010308913146243284d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test5415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5415");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.04046066354440338d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.040438606289826505d) + "'", double1 == (-0.040438606289826505d));
    }

    @Test
    public void test5416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5416");
        int int2 = org.apache.commons.math.util.FastMath.max(51, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 51 + "'", int2 == 51);
    }

    @Test
    public void test5417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5417");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.1341338259903953d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05466430363978169d + "'", double1 == 0.05466430363978169d);
    }

    @Test
    public void test5418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5418");
        double double1 = org.apache.commons.math.util.FastMath.cosh(4.547473508864641E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5419");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.2737367544328376E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2737367544328376E-13d + "'", double1 == 2.2737367544328376E-13d);
    }

    @Test
    public void test5420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5420");
        long long1 = org.apache.commons.math.util.FastMath.round(0.7604870043227957d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test5421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5421");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.0074423261227956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5422");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.5461447186340243d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9966951177756361d + "'", double1 == 0.9966951177756361d);
    }

    @Test
    public void test5423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5423");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.106250657255404d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5424");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) -1, (float) 2);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test5425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5425");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) 97);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6929693744344998d + "'", double1 == 1.6929693744344998d);
    }

    @Test
    public void test5426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5426");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.6783712618582197d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test5427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5427");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.9952731515503572d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4735278632514661d) + "'", double1 == (-1.4735278632514661d));
    }

    @Test
    public void test5428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5428");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5429");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1965.6378749304042d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.584080701252641d + "'", double1 == 7.584080701252641d);
    }

    @Test
    public void test5430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5430");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.8095051177152213d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 46.38122673932307d + "'", double1 == 46.38122673932307d);
    }

    @Test
    public void test5431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5431");
        double double1 = org.apache.commons.math.util.FastMath.log1p(48.077009884937624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.893390694697032d + "'", double1 == 3.893390694697032d);
    }

    @Test
    public void test5432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5432");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.2301052825991547d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 25.282318619064693d + "'", double1 == 25.282318619064693d);
    }

    @Test
    public void test5433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5433");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.5281699918502043d, 0.7024348335001199d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6386554259769499d + "'", double2 == 0.6386554259769499d);
    }

    @Test
    public void test5434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5434");
        double double2 = org.apache.commons.math.util.FastMath.max(0.5501702829958328d, 8.417483164520446E-60d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5501702829958328d + "'", double2 == 0.5501702829958328d);
    }

    @Test
    public void test5435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5435");
        double double1 = org.apache.commons.math.util.FastMath.signum(4.466413831809194d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5436");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.6202188093282305d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test5437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5437");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.2326176679819249d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3360280059321412d + "'", double1 == 1.3360280059321412d);
    }

    @Test
    public void test5438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5438");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.071731403574208d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9687600907243215d + "'", double1 == 0.9687600907243215d);
    }

    @Test
    public void test5439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5439");
        double double1 = org.apache.commons.math.util.FastMath.log(0.27629111752846225d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.286300195494016d) + "'", double1 == (-1.286300195494016d));
    }

    @Test
    public void test5440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5440");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-1.1578552071446455d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5441");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.24256291304290128d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4925067644641049d + "'", double1 == 0.4925067644641049d);
    }

    @Test
    public void test5442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5442");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 41);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 41 + "'", int1 == 41);
    }

    @Test
    public void test5443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5443");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '4', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5444");
        double double1 = org.apache.commons.math.util.FastMath.log(0.024913294410754107d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.6923537059133382d) + "'", double1 == (-3.6923537059133382d));
    }

    @Test
    public void test5445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5445");
        int int2 = org.apache.commons.math.util.FastMath.max(1, 3280);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3280 + "'", int2 == 3280);
    }

    @Test
    public void test5446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5446");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.5347906902896264d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.006536307406899d + "'", double1 == 1.006536307406899d);
    }

    @Test
    public void test5447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5447");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, 36.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 36.0f + "'", float2 == 36.0f);
    }

    @Test
    public void test5448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5448");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.7647251540111925d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7048856958893577d + "'", double1 == 0.7048856958893577d);
    }

    @Test
    public void test5449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5449");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 0, (float) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test5450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5450");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5704558603240033d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5451");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test5452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5452");
        double double1 = org.apache.commons.math.util.FastMath.abs(7.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.0d + "'", double1 == 7.0d);
    }

    @Test
    public void test5453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5453");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 105L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 105 + "'", int1 == 105);
    }

    @Test
    public void test5454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5454");
        double double1 = org.apache.commons.math.util.FastMath.abs(3.638569140438832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.638569140438832d + "'", double1 == 3.638569140438832d);
    }

    @Test
    public void test5455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5455");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 83.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.564318773958797E35d + "'", double1 == 5.564318773958797E35d);
    }

    @Test
    public void test5456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5456");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 51, (float) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test5457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5457");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.302111682830096d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5458");
        double double1 = org.apache.commons.math.util.FastMath.ceil(31.99188518905606d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.0d + "'", double1 == 32.0d);
    }

    @Test
    public void test5459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5459");
        int int2 = org.apache.commons.math.util.FastMath.max(2005, 105);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2005 + "'", int2 == 2005);
    }

    @Test
    public void test5460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5460");
        double double1 = org.apache.commons.math.util.FastMath.tanh(55.03965705951179d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5461");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9999550340122695d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.952891941655864E-5d) + "'", double1 == (-1.952891941655864E-5d));
    }

    @Test
    public void test5462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5462");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.066255716330613d), (-0.745474297486651d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.052948304976176d) + "'", double2 == (-3.052948304976176d));
    }

    @Test
    public void test5463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5463");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) 51.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7075701760979363d + "'", double1 == 1.7075701760979363d);
    }

    @Test
    public void test5464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5464");
        double double1 = org.apache.commons.math.util.FastMath.ceil(3.1149712528373934d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test5465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5465");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8467900408269441d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8467900408269441d + "'", double1 == 0.8467900408269441d);
    }

    @Test
    public void test5466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5466");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (short) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test5467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5467");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9852092622487529d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9925770812630891d + "'", double1 == 0.9925770812630891d);
    }

    @Test
    public void test5468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5468");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 41L, 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 41.0f + "'", float2 == 41.0f);
    }

    @Test
    public void test5469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5469");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) 2147483647);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 46340.950001051984d + "'", double1 == 46340.950001051984d);
    }

    @Test
    public void test5470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5470");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, 49L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5471");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9091342957581129d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4821727754909737d + "'", double1 == 1.4821727754909737d);
    }

    @Test
    public void test5472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5472");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.5574077246549025d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5473");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1L, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test5474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5474");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.24256291304290128d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0295629067905003d + "'", double1 == 1.0295629067905003d);
    }

    @Test
    public void test5475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5475");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.9999999999999999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5476");
        float float2 = org.apache.commons.math.util.FastMath.max(3280.0f, (float) 41);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3280.0f + "'", float2 == 3280.0f);
    }

    @Test
    public void test5477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5477");
        long long2 = org.apache.commons.math.util.FastMath.max(97L, (long) 3280);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3280L + "'", long2 == 3280L);
    }

    @Test
    public void test5478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5478");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.129366163845515d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05283477200072701d + "'", double1 == 0.05283477200072701d);
    }

    @Test
    public void test5479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5479");
        double double1 = org.apache.commons.math.util.FastMath.log(0.32349849299466304d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.128560823492023d) + "'", double1 == (-1.128560823492023d));
    }

    @Test
    public void test5480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5480");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.9952731515503572d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.0226387736519045d) + "'", double1 == (-3.0226387736519045d));
    }

    @Test
    public void test5481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5481");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.7615941559557649d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test5482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5482");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.007172598315315378d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5483");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.118939603184909d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5484");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.004975165426584024d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5485");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.5504171915615343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.250638367015966d + "'", double1 == 2.250638367015966d);
    }

    @Test
    public void test5486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5486");
        double double1 = org.apache.commons.math.util.FastMath.exp(49.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9073465724950998E21d + "'", double1 == 1.9073465724950998E21d);
    }

    @Test
    public void test5487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5487");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.010309095749349842d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.010309278362160296d + "'", double1 == 0.010309278362160296d);
    }

    @Test
    public void test5488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5488");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.9661389135827213E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9663322113622317E-4d + "'", double1 == 1.9663322113622317E-4d);
    }

    @Test
    public void test5489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5489");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.929160175351254d, 43.51625986486027d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6191512388362495E12d + "'", double2 == 2.6191512388362495E12d);
    }

    @Test
    public void test5490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5490");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.024913294410754107d, 0.7068730370437739d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.02491329441075411d + "'", double2 == 0.02491329441075411d);
    }

    @Test
    public void test5491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5491");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.2708164357864931d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5492");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8721824073781502d, 0.6040309680760088d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8721824073781501d + "'", double2 == 0.8721824073781501d);
    }

    @Test
    public void test5493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5493");
        double double1 = org.apache.commons.math.util.FastMath.ceil(5.267831587699267d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.0d + "'", double1 == 6.0d);
    }

    @Test
    public void test5494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5494");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 'a', (long) (-5));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5L) + "'", long2 == (-5L));
    }

    @Test
    public void test5495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5495");
        double double1 = org.apache.commons.math.util.FastMath.atan((-1.5707963267948966d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0038848218538872d) + "'", double1 == (-1.0038848218538872d));
    }

    @Test
    public void test5496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5496");
        int int1 = org.apache.commons.math.util.FastMath.abs((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test5497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5497");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 0, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test5498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5498");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.0779815808758473d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.018814327862137076d + "'", double1 == 0.018814327862137076d);
    }

    @Test
    public void test5499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5499");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2302.9401181042886d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.742376031071901d + "'", double1 == 7.742376031071901d);
    }

    @Test
    public void test5500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5500");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }
}

