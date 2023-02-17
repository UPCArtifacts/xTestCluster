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
        double double1 = org.apache.commons.math.util.FastMath.acos(129.27001792720287d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        double double1 = org.apache.commons.math.util.FastMath.log10((-2.282932090538714d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9857874761787422d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.401998708484765d + "'", double1 == 1.401998708484765d);
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        double double1 = org.apache.commons.math.util.FastMath.log10((-1.5424779445183978E-4d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.5440211074304587d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6049088147358453d) + "'", double1 == (-0.6049088147358453d));
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9588880213738242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6087939368450122d + "'", double1 == 1.6087939368450122d);
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.998019200072578d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4582054009704493d + "'", double1 == 3.4582054009704493d);
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        float float2 = org.apache.commons.math.util.FastMath.max(52.0f, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.27783527483180026d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 1, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        double double1 = org.apache.commons.math.util.FastMath.cos(100.0000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8623188722877847d + "'", double1 == 0.8623188722877847d);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.671032563057712d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 38.447333779053174d + "'", double1 == 38.447333779053174d);
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.1535902666964596d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.166013034516528d + "'", double1 == 1.166013034516528d);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9088714301767988d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.0443358463487644d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        double double1 = org.apache.commons.math.util.FastMath.atan(1833.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5702507731119777d + "'", double1 == 1.5702507731119777d);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.17950655952279498d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3903114864067188d + "'", double1 == 1.3903114864067188d);
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.939216676724527d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9392166767245271d + "'", double1 == 0.9392166767245271d);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.03505838110136253d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.5646454682250397d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.459551791780329d + "'", double1 == 6.459551791780329d);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        double double1 = org.apache.commons.math.util.FastMath.exp(101.1002695260926d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.077727050666997E43d + "'", double1 == 8.077727050666997E43d);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.1483650317358706d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.00258945829861682d + "'", double1 == 0.00258945829861682d);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.8721824073781502d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.643156935830446d + "'", double1 == 0.643156935830446d);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        double double2 = org.apache.commons.math.util.FastMath.min(0.14728591946206993d, 1.9943400969063074d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14728591946206993d + "'", double2 == 0.14728591946206993d);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.7085340422802743d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.3929872502058908d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3929872502058908d + "'", double1 == 0.3929872502058908d);
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.5718388723129227d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.519455363322024d + "'", double1 == 0.519455363322024d);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9999550340122696d, (-0.42949179560133843d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999550340122695d + "'", double2 == 0.9999550340122695d);
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.5202860320095168d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5735331849572494d + "'", double1 == 3.5735331849572494d);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.008837977760189355d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 100L, (float) 2739L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 1, 3280L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3280L + "'", long2 == 3280L);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.48706190399811883d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4532436627522913d) + "'", double1 == (-0.4532436627522913d));
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.45224619022500656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) -1, 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.662907307470914E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.662907307470914E42d + "'", double1 == 2.662907307470914E42d);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.8393096933013352d), 0.009483282630450406d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.009483282630450406d + "'", double2 == 0.009483282630450406d);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        int int2 = org.apache.commons.math.util.FastMath.max(2739, 2739);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2739 + "'", int2 == 2739);
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.0911874016151137d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.5825681430865692d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6218848214047328d + "'", double1 == 0.6218848214047328d);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.11975629384575985d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0020901416275943318d) + "'", double1 == (-0.0020901416275943318d));
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.12236703082541885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0074961919222725d + "'", double1 == 1.0074961919222725d);
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.01745240643728351d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017453292411980646d) + "'", double1 == (-0.017453292411980646d));
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.40310504119931384d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6682419027059644d + "'", double1 == 0.6682419027059644d);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 1, 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        double double1 = org.apache.commons.math.util.FastMath.exp(99.99999999999996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6881171418160207E43d + "'", double1 == 2.6881171418160207E43d);
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.3728048593649235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4518010068183069d + "'", double1 == 0.4518010068183069d);
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.8171027592644233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5972433421706609d + "'", double1 == 0.5972433421706609d);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.0002098303044837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.11185839875402E-5d + "'", double1 == 9.11185839875402E-5d);
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.28354302476765203d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.868551121099462d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.2586249478827862d) + "'", double1 == (-3.2586249478827862d));
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        double double2 = org.apache.commons.math.util.FastMath.min(0.13786975975049967d, 0.999900971001246d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.13786975975049967d + "'", double2 == 0.13786975975049967d);
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.3815006871452328d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.39082237583572904d + "'", double1 == 0.39082237583572904d);
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        long long2 = org.apache.commons.math.util.FastMath.max(689081821154L, 2739L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 689081821154L + "'", long2 == 689081821154L);
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9379924444723454d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 0, 2.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        long long1 = org.apache.commons.math.util.FastMath.abs(78L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 78L + "'", long1 == 78L);
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        double double1 = org.apache.commons.math.util.FastMath.log(1.8310416729209025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6048850250843338d + "'", double1 == 0.6048850250843338d);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.6340499054521955d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.5571330292496455d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        double double1 = org.apache.commons.math.util.FastMath.log(1.308886292985948d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.26917661759777844d + "'", double1 == 0.26917661759777844d);
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.6087939368450122d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.5534301753820028d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5534301753820028d + "'", double1 == 1.5534301753820028d);
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.234021194410018d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1, (float) 689081821154L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.6582696111348529d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011488972080125911d + "'", double1 == 0.011488972080125911d);
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        long long1 = org.apache.commons.math.util.FastMath.round(1.5574077246549505d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.3371848034806941d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8709944106221296d + "'", double1 == 0.8709944106221296d);
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        double double1 = org.apache.commons.math.util.FastMath.sinh(13.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 221206.6960033301d + "'", double1 == 221206.6960033301d);
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        double double1 = org.apache.commons.math.util.FastMath.tan(2738.593745198908d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.19754023952113d) + "'", double1 == (-1.19754023952113d));
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.412764978032765d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 138.24125019825223d + "'", double1 == 138.24125019825223d);
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        double double1 = org.apache.commons.math.util.FastMath.atanh(3.993222846126381d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        double double1 = org.apache.commons.math.util.FastMath.exp(4.746501045726147d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 115.18056710712904d + "'", double1 == 115.18056710712904d);
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.4260624389053682d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.02862897802551553d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.028621160257484037d) + "'", double1 == (-0.028621160257484037d));
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.5227846790767261d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4992948061207846d + "'", double1 == 0.4992948061207846d);
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        int int2 = org.apache.commons.math.util.FastMath.min(1, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        double double1 = org.apache.commons.math.util.FastMath.tan(4.535435535363617d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.592095927580033d + "'", double1 == 5.592095927580033d);
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.7253825588523148d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.15397127858923465d) + "'", double1 == (-0.15397127858923465d));
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        double double1 = org.apache.commons.math.util.FastMath.acosh(38.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.330560165114023d + "'", double1 == 4.330560165114023d);
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.4120398112486696d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.106250657255404d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8600369041818202d + "'", double1 == 0.8600369041818202d);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 78962960182681L, (float) 2);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.8962957E13f + "'", float2 == 7.8962957E13f);
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.7067535536595153d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.309879444991508d) + "'", double1 == (-7.309879444991508d));
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.23929808358597d, 0.06724533229170335d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2392980835859697d + "'", double2 == 1.2392980835859697d);
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 97L, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        double double2 = org.apache.commons.math.util.FastMath.pow(431.19370645968985d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(9.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 515.6620156177408d + "'", double1 == 515.6620156177408d);
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-38.816242111356935d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.2740910090504158d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 73.0000375341532d + "'", double1 == 73.0000375341532d);
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.16288628673873548d), 0.53635206842149d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.2948412747977115d) + "'", double2 == (-0.2948412747977115d));
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.7177916798535343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7177916798535343d + "'", double1 == 0.7177916798535343d);
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.5707963267948966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0038848218538872d + "'", double1 == 1.0038848218538872d);
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(18.87267627911232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1081.3246989097984d + "'", double1 == 1081.3246989097984d);
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-1.684163941897155d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9333998114441879d) + "'", double1 == (-0.9333998114441879d));
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        double double1 = org.apache.commons.math.util.FastMath.sinh(6559.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.238991635001947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0406976324224526d + "'", double1 == 1.0406976324224526d);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.8830864942993886d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.1774100225154747d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.970856367774133d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7490803696196576d + "'", double1 == 0.7490803696196576d);
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.8903600704689714d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2377093724987336d + "'", double1 == 1.2377093724987336d);
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 1.7992447670407306E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7992447670407306E-4d + "'", double2 == 1.7992447670407306E-4d);
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.7500546590807314d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4723407343250855d + "'", double1 == 0.4723407343250855d);
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        float float2 = org.apache.commons.math.util.FastMath.max(2.0f, (float) 13L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 13.0f + "'", float2 == 13.0f);
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        int int2 = org.apache.commons.math.util.FastMath.max(97, 13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.7326150325826912d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 41.975749374827494d + "'", double1 == 41.975749374827494d);
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 2005, (long) 5);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2005L + "'", long2 == 2005L);
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 100, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.06214609673410902d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3960997961549403d + "'", double1 == 0.3960997961549403d);
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.1494732094266326d), 1.0000908039833682d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.14836143426786802d) + "'", double2 == (-0.14836143426786802d));
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.01794337375926178d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.1317095101507044E-4d) + "'", double1 == (-3.1317095101507044E-4d));
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.7182818284590446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.35024917996074695d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.35745433920237724d + "'", double1 == 0.35745433920237724d);
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        double double1 = org.apache.commons.math.util.FastMath.abs(3.5735331849572494d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5735331849572494d + "'", double1 == 3.5735331849572494d);
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 4);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(38.8629167984213d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.2340128968764015d + "'", double1 == 6.2340128968764015d);
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2005L, (float) 1L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-1.5438317534371175d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2188333309194215d) + "'", double1 == (-1.2188333309194215d));
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-1.532821681221366d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.034279652058798d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0342796520587982d + "'", double1 == 2.0342796520587982d);
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 8L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 8.0f + "'", float1 == 8.0f);
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.9925591367766533d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 114.16522896753277d + "'", double1 == 114.16522896753277d);
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.5438317534371178d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        int int2 = org.apache.commons.math.util.FastMath.max(3, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        double double2 = org.apache.commons.math.util.FastMath.max(4.15912713462618d, 0.015371184736752325d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.15912713462618d + "'", double2 == 4.15912713462618d);
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.6932062576141789d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8048681679024523d + "'", double1 == 0.8048681679024523d);
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        double double1 = org.apache.commons.math.util.FastMath.log((-1.2005577706253316d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.41032129904824216d), 1.2778843899054422d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.4103212990482421d) + "'", double2 == (-0.4103212990482421d));
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) 6559.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.816837630902035d + "'", double1 == 3.816837630902035d);
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.2377093724987336d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 2, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.8709944106221296d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 100, 138L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.998064336484882d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01741950881839376d + "'", double1 == 0.01741950881839376d);
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 10L, (float) ' ');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) 4.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1578212823495775d + "'", double1 == 1.1578212823495775d);
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.33986957931062006d, 4.035274726494073E-14d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999999999999565d + "'", double2 == 0.9999999999999565d);
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.7733359594033115d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9178873860159678d + "'", double1 == 0.9178873860159678d);
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        long long1 = org.apache.commons.math.util.FastMath.round(1.1752012000048544d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.7003561790124813d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7948999578134455d + "'", double1 == 0.7948999578134455d);
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.21588220933551652d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.5501702829958329d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2595028713790396d) + "'", double1 == (-0.2595028713790396d));
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.1194710708535681d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.8451881338178735d) + "'", double1 == (-6.8451881338178735d));
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        int int2 = org.apache.commons.math.util.FastMath.min(5, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8166645746236464d, 0.014403743803069895d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8166645746236463d + "'", double2 == 0.8166645746236463d);
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        double double1 = org.apache.commons.math.util.FastMath.asinh(80.0302653271142d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.075591090954697d + "'", double1 == 5.075591090954697d);
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        double double1 = org.apache.commons.math.util.FastMath.tan(11013.232920103323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.5045996724459267d) + "'", double1 == (-2.5045996724459267d));
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        double double1 = org.apache.commons.math.util.FastMath.rint(9.337337939299603d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.0d + "'", double1 == 9.0d);
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        double double1 = org.apache.commons.math.util.FastMath.rint(31.306852819440063d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.0d + "'", double1 == 31.0d);
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        long long1 = org.apache.commons.math.util.FastMath.abs(9L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9L + "'", long1 == 9L);
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.4425944484799542d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 2739L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.915348169263078d + "'", double1 == 7.915348169263078d);
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        double double1 = org.apache.commons.math.util.FastMath.signum(7.04395999972525d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.7505520374326113d, 13.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7505520374326115d + "'", double2 == 0.7505520374326115d);
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        long long1 = org.apache.commons.math.util.FastMath.round(7.028730419947965d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 7L + "'", long1 == 7L);
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.6306583303604348d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6733028896192996d + "'", double1 == 0.6733028896192996d);
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        int int2 = org.apache.commons.math.util.FastMath.max(3, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        long long1 = org.apache.commons.math.util.FastMath.abs(138L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 138L + "'", long1 == 138L);
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.4567608960260546d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5789513055791293d + "'", double1 == 1.5789513055791293d);
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        double double1 = org.apache.commons.math.util.FastMath.tan(4.857041449915169d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.8648359430353025d) + "'", double1 == (-6.8648359430353025d));
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 0, (float) 2147483647L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        double double2 = org.apache.commons.math.util.FastMath.max((-1.5424779445183978E-4d), 3.762195691083632d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.762195691083632d + "'", double2 == 3.762195691083632d);
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        int int2 = org.apache.commons.math.util.FastMath.min(3, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.6536436208636119d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2213400826700138d + "'", double1 == 1.2213400826700138d);
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.7612912090796752d), (-6201.3610379120855d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7612912090796752d) + "'", double2 == (-0.7612912090796752d));
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.0348955683853929d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5850378723056733d + "'", double1 == 1.5850378723056733d);
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 2);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.0549995938530339d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.3796077390275217d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.006625404912081631d + "'", double1 == 0.006625404912081631d);
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.01040213636547643d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01040213636547643d + "'", double1 == 0.01040213636547643d);
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.665374127698126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2118662346608502d + "'", double1 == 1.2118662346608502d);
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        double double2 = org.apache.commons.math.util.FastMath.min((-323.30621534311575d), (-0.467108650523244d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-323.30621534311575d) + "'", double2 == (-323.30621534311575d));
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9717769481908543d, 0.07258194039108286d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9979242106602924d + "'", double2 == 0.9979242106602924d);
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.0812032351028643E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8870556335759314E-6d + "'", double1 == 1.8870556335759314E-6d);
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.1224435501265828d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1221396417910168d + "'", double1 == 0.1221396417910168d);
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
        double double1 = org.apache.commons.math.util.FastMath.sin(32.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5514266812416906d + "'", double1 == 0.5514266812416906d);
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.8540342600388389d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.26811775505569796d + "'", double1 == 0.26811775505569796d);
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.0658873316779507d, 2.702048418162471d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3757333601704966d + "'", double2 == 0.3757333601704966d);
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
        double double2 = org.apache.commons.math.util.FastMath.max(1.0523580336179443d, 0.39725437476826614d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0523580336179443d + "'", double2 == 1.0523580336179443d);
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.38625675609943166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.32660713332209224d + "'", double1 == 0.32660713332209224d);
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 8L, 8.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.0f + "'", float2 == 8.0f);
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
        double double1 = org.apache.commons.math.util.FastMath.asin(605.7106487655087d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
        long long1 = org.apache.commons.math.util.FastMath.round(1.5097736159129067d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.48271759369001654d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0670411894744107d + "'", double1 == 1.0670411894744107d);
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.030684258881318663d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.03116487793867911d) + "'", double1 == (-0.03116487793867911d));
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
        float float1 = org.apache.commons.math.util.FastMath.abs(51.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 51.0f + "'", float1 == 51.0f);
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9123687177766381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4902141673869016d + "'", double1 == 2.4902141673869016d);
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9032560372034026d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9032560372034026d + "'", double1 == 0.9032560372034026d);
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.2377093724987336d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9450375315476002d + "'", double1 == 0.9450375315476002d);
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 1, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
        double double1 = org.apache.commons.math.util.FastMath.atanh(8.583547562472901d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9688145798019268d, 0.9535608805502648d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9688145798019268d + "'", double2 == 0.9688145798019268d);
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9999999999999989d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999999989d + "'", double1 == 0.9999999999999989d);
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.4626307887385793d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
        double double1 = org.apache.commons.math.util.FastMath.log10(13.685691320277302d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1362667402918818d + "'", double1 == 1.1362667402918818d);
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 32L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5514266812416906d + "'", double1 == 0.5514266812416906d);
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.3388731471685563d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 19.4160011230739d + "'", double1 == 19.4160011230739d);
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
        double double1 = org.apache.commons.math.util.FastMath.asinh(5.267884728309446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.363665536795953d + "'", double1 == 2.363665536795953d);
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 100.0f, 1.451801006818307d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.451801006818307d + "'", double2 == 1.451801006818307d);
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.6778717693998079d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8259324122591325d + "'", double1 == 0.8259324122591325d);
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.27244342785294634d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
        long long1 = org.apache.commons.math.util.FastMath.abs(4L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.015372395508685268d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015255437332075723d + "'", double1 == 0.015255437332075723d);
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5840631038760165d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.26151182221334535d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9660002138002461d + "'", double1 == 0.9660002138002461d);
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) 36L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.12796368962740468d) + "'", double1 == (-0.12796368962740468d));
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.6049088147358453d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5461242228508565d + "'", double1 == 0.5461242228508565d);
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.7068730370437739d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7603964251352017d + "'", double1 == 0.7603964251352017d);
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.728323488481854d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7283234884818539d) + "'", double1 == (-0.7283234884818539d));
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5216");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.0002098303044837d, (-0.8988151898170457d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0002098303044835d + "'", double2 == 1.0002098303044835d);
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
        float float2 = org.apache.commons.math.util.FastMath.min((float) ' ', 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
        int int2 = org.apache.commons.math.util.FastMath.max(0, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
        double double1 = org.apache.commons.math.util.FastMath.sin(12.239326967783478d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.321244780875962d) + "'", double1 == (-0.321244780875962d));
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.8976134920167367d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.5063656411095873d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.39731803409111865d) + "'", double1 == (-0.39731803409111865d));
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8340324452479558d, 7.573807232972012d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.10967871581075508d + "'", double2 == 0.10967871581075508d);
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5223");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9385078997951388d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.473687822062709d + "'", double1 == 1.473687822062709d);
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-1.5450396126018462d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.219489807002804d) + "'", double1 == (-1.219489807002804d));
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5225");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 6559, 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6559L + "'", long2 == 6559L);
    }

    @Test
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5226");
        long long2 = org.apache.commons.math.util.FastMath.min(689081821154L, (long) 2739);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2739L + "'", long2 == 2739L);
    }

    @Test
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5227");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.18070977791825d + "'", double1 == 22.18070977791825d);
    }

    @Test
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5228");
        float float1 = org.apache.commons.math.util.FastMath.abs(4.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.0f + "'", float1 == 4.0f);
    }

    @Test
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5229");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 3L, (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5230");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.5410395588486396d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.43245722690312655d + "'", double1 == 0.43245722690312655d);
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5231");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.6162130215185162d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5522556214650427d + "'", double1 == 0.5522556214650427d);
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5232");
        long long1 = org.apache.commons.math.util.FastMath.round(0.14287905018325442d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5233");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.034315407113705d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5234");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.2261911708835171d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5235");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.435403483148737d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5236");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 0, (float) 52);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5237");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.134280534824291d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.812479188348797d + "'", double1 == 0.812479188348797d);
    }

    @Test
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5238");
        double double2 = org.apache.commons.math.util.FastMath.min(0.851124705208869d, 0.4968798877157107d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4968798877157107d + "'", double2 == 0.4968798877157107d);
    }

    @Test
    public void test5239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5239");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.2845600963063681d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.329177189539409d + "'", double1 == 1.329177189539409d);
    }

    @Test
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5240");
        double double1 = org.apache.commons.math.util.FastMath.log10(13.875621465855696d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1422524435530967d + "'", double1 == 1.1422524435530967d);
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5241");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.017539711657544456d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test5242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5242");
        long long2 = org.apache.commons.math.util.FastMath.min(138L, 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 138L + "'", long2 == 138L);
    }

    @Test
    public void test5243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5243");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.0724898276058306d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.909353576949627d + "'", double1 == 3.909353576949627d);
    }

    @Test
    public void test5244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5244");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 2739.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.915348169263078d + "'", double1 == 7.915348169263078d);
    }

    @Test
    public void test5245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5245");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 3L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.762747174039086d + "'", double1 == 1.762747174039086d);
    }

    @Test
    public void test5246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5246");
        int int2 = org.apache.commons.math.util.FastMath.max((int) ' ', 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test5247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5247");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.974148360226309d, (-0.054696319902792064d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5891848361040977d + "'", double2 == 1.5891848361040977d);
    }

    @Test
    public void test5248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5248");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.4422495703074083d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2009369551760027d + "'", double1 == 1.2009369551760027d);
    }

    @Test
    public void test5249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5249");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.6931471805599453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5250");
        long long1 = org.apache.commons.math.util.FastMath.round((-2.7673480719979073d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-3L) + "'", long1 == (-3L));
    }

    @Test
    public void test5251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5251");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 32L, (float) 51L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 51.0f + "'", float2 == 51.0f);
    }

    @Test
    public void test5252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5252");
        double double1 = org.apache.commons.math.util.FastMath.sinh(6.938893903907228E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.938893903907228E-18d + "'", double1 == 6.938893903907228E-18d);
    }

    @Test
    public void test5253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5253");
        double double1 = org.apache.commons.math.util.FastMath.floor(3.060134546374655E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5254");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.008837747656337032d), 3.2710663101885897d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0027017875255622562d) + "'", double2 == (-0.0027017875255622562d));
    }

    @Test
    public void test5255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5255");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.7219410057229039d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5256");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.247851365046994d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8476800315355498d + "'", double1 == 0.8476800315355498d);
    }

    @Test
    public void test5257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5257");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.5497922893701128d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.710491661779526d + "'", double1 == 4.710491661779526d);
    }

    @Test
    public void test5258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5258");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 1, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test5259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5259");
        double double1 = org.apache.commons.math.util.FastMath.exp(4.594700892207039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 98.95853185248363d + "'", double1 == 98.95853185248363d);
    }

    @Test
    public void test5260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5260");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5261");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9999984298108128d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5262");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.999999999733659d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01745329251529477d + "'", double1 == 0.01745329251529477d);
    }

    @Test
    public void test5263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5263");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5264");
        double double1 = org.apache.commons.math.util.FastMath.log10(20.938628468106426d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3209482309129792d + "'", double1 == 1.3209482309129792d);
    }

    @Test
    public void test5265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5265");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) 5);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5266");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.1478260473879486d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0109461818722032d + "'", double1 == 1.0109461818722032d);
    }

    @Test
    public void test5267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5267");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.99836867862969d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5268");
        double double2 = org.apache.commons.math.util.FastMath.max(0.12236703082541885d, 0.3815006871452328d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3815006871452328d + "'", double2 == 0.3815006871452328d);
    }

    @Test
    public void test5269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5269");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.6782995388565882d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.10729626364300879d) + "'", double1 == (-0.10729626364300879d));
    }

    @Test
    public void test5270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5270");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.9268335185771767d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6041949625277387d) + "'", double1 == (-0.6041949625277387d));
    }

    @Test
    public void test5271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5271");
        double double1 = org.apache.commons.math.util.FastMath.log(2.6881171418160207E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 99.99999999999996d + "'", double1 == 99.99999999999996d);
    }

    @Test
    public void test5272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5272");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.8012298966644482d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7182124253886498d + "'", double1 == 0.7182124253886498d);
    }

    @Test
    public void test5273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5273");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.6622841166519441d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8138084029130838d + "'", double1 == 0.8138084029130838d);
    }

    @Test
    public void test5274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5274");
        double double1 = org.apache.commons.math.util.FastMath.sinh(33.66561760358879d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0881512833599662E14d + "'", double1 == 2.0881512833599662E14d);
    }

    @Test
    public void test5275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5275");
        double double2 = org.apache.commons.math.util.FastMath.min(0.010308913146243284d, 3.552713678800501E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.552713678800501E-15d + "'", double2 == 3.552713678800501E-15d);
    }

    @Test
    public void test5276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5276");
        double double1 = org.apache.commons.math.util.FastMath.log(2.3358347343868286E40d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 92.95177303495919d + "'", double1 == 92.95177303495919d);
    }

    @Test
    public void test5277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5277");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-2.719630684615244d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3958432288613232d) + "'", double1 == (-1.3958432288613232d));
    }

    @Test
    public void test5278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5278");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(5.596172423257359E84d, 0.9803514567371407d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.596172423257358E84d + "'", double2 == 5.596172423257358E84d);
    }

    @Test
    public void test5279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5279");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.4009957838586076d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6332422789569626d + "'", double1 == 0.6332422789569626d);
    }

    @Test
    public void test5280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5280");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.499269126284287d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5202712924196591d + "'", double1 == 0.5202712924196591d);
    }

    @Test
    public void test5281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5281");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.6682419027059644d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8174606429094702d + "'", double1 == 0.8174606429094702d);
    }

    @Test
    public void test5282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5282");
        double double1 = org.apache.commons.math.util.FastMath.exp(32.000000000000014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.896296018268181E13d + "'", double1 == 7.896296018268181E13d);
    }

    @Test
    public void test5283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5283");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9091342957581129d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test5284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5284");
        double double1 = org.apache.commons.math.util.FastMath.atan((-56.72239180482502d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5531684309122575d) + "'", double1 == (-1.5531684309122575d));
    }

    @Test
    public void test5285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5285");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.046257937962002074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04625793796200208d + "'", double1 == 0.04625793796200208d);
    }

    @Test
    public void test5286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5286");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.8402235152809697d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7637703590388351d) + "'", double1 == (-0.7637703590388351d));
    }

    @Test
    public void test5287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5287");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.6003344910765165d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5288");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(328280.63500117435d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 328280.6350011744d + "'", double1 == 328280.6350011744d);
    }

    @Test
    public void test5289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5289");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 10, (long) 13);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test5290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5290");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.38625675609943166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.396569932281676d + "'", double1 == 0.396569932281676d);
    }

    @Test
    public void test5291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5291");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.584967478670572d + "'", double1 == 4.584967478670572d);
    }

    @Test
    public void test5292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5292");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.04537685793879663d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0010297062855298d + "'", double1 == 1.0010297062855298d);
    }

    @Test
    public void test5293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5293");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 3, (float) 13L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test5294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5294");
        double double1 = org.apache.commons.math.util.FastMath.asinh(9.357486930108681d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9321668957092757d + "'", double1 == 2.9321668957092757d);
    }

    @Test
    public void test5295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5295");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.0027017875255622562d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999963501743035d + "'", double1 == 0.9999963501743035d);
    }

    @Test
    public void test5296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5296");
        float float2 = org.apache.commons.math.util.FastMath.max(3.0f, (float) 138L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 138.0f + "'", float2 == 138.0f);
    }

    @Test
    public void test5297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5297");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.4319786974204732d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 24.750556201751934d + "'", double1 == 24.750556201751934d);
    }

    @Test
    public void test5298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5298");
        long long1 = org.apache.commons.math.util.FastMath.round(193.9948452238572d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 194L + "'", long1 == 194L);
    }

    @Test
    public void test5299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5299");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.0202287245984625d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5300");
        double double2 = org.apache.commons.math.util.FastMath.min(0.6162130215185162d, 0.9940685753209271d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6162130215185162d + "'", double2 == 0.6162130215185162d);
    }

    @Test
    public void test5301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5301");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9999994047424171d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test5302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5302");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2, (float) 2739);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test5303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5303");
        double double2 = org.apache.commons.math.util.FastMath.pow((-1.128560823492023d), 0.40589920499183396d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test5304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5304");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9998000199980002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5404705724323576d + "'", double1 == 0.5404705724323576d);
    }

    @Test
    public void test5305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5305");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(70.24416936194356d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4024.6944398415308d + "'", double1 == 4024.6944398415308d);
    }

    @Test
    public void test5306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5306");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 0, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5307");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 5);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999092042625951d + "'", double1 == 0.9999092042625951d);
    }

    @Test
    public void test5308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5308");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.5707055269350272d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5309");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.08760630539897361d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0874946295734575d + "'", double1 == 0.0874946295734575d);
    }

    @Test
    public void test5310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5310");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.301812843306464d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3203528371338629d + "'", double1 == 1.3203528371338629d);
    }

    @Test
    public void test5311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5311");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.7213175660100344d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6177247701528313d) + "'", double1 == (-0.6177247701528313d));
    }

    @Test
    public void test5312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5312");
        double double2 = org.apache.commons.math.util.FastMath.min(1.5604872310455469d, 10.000000004122308d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5604872310455469d + "'", double2 == 1.5604872310455469d);
    }

    @Test
    public void test5313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5313");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.568058636590814d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027367786072842938d + "'", double1 == 0.027367786072842938d);
    }

    @Test
    public void test5314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5314");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(68.98400770596488d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2039980656902276d + "'", double1 == 1.2039980656902276d);
    }

    @Test
    public void test5315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5315");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 10, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test5316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5316");
        long long1 = org.apache.commons.math.util.FastMath.abs(194L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 194L + "'", long1 == 194L);
    }

    @Test
    public void test5317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5317");
        long long2 = org.apache.commons.math.util.FastMath.min(6559L, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test5318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5318");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9998000199980002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0000000066669989E-4d) + "'", double1 == (-2.0000000066669989E-4d));
    }

    @Test
    public void test5319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5319");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.04147022652343259d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3822635923763218d) + "'", double1 == (-1.3822635923763218d));
    }

    @Test
    public void test5320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5320");
        double double1 = org.apache.commons.math.util.FastMath.acos(5.267884728309446d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5321");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9989119456406313d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test5322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5322");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) -1, 48L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 48L + "'", long2 == 48L);
    }

    @Test
    public void test5323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5323");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.013267166245943098d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.013266777040020012d) + "'", double1 == (-0.013266777040020012d));
    }

    @Test
    public void test5324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5324");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.5891848361040977d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-54.37565754902795d) + "'", double1 == (-54.37565754902795d));
    }

    @Test
    public void test5325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5325");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.8339178207386727d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6825740852031713d + "'", double1 == 0.6825740852031713d);
    }

    @Test
    public void test5326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5326");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.7328327111140163d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5327");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.473801085060013E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.473801085060013E-16d + "'", double1 == 1.473801085060013E-16d);
    }

    @Test
    public void test5328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5328");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.517526186412088d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009032535918180876d + "'", double1 == 0.009032535918180876d);
    }

    @Test
    public void test5329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5329");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.1489123351881216d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14946329799279776d + "'", double1 == 0.14946329799279776d);
    }

    @Test
    public void test5330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5330");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7177916798535343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6155395549547384d + "'", double1 == 0.6155395549547384d);
    }

    @Test
    public void test5331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5331");
        double double1 = org.apache.commons.math.util.FastMath.cos(5.849345000344263d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9073581391324249d + "'", double1 == 0.9073581391324249d);
    }

    @Test
    public void test5332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5332");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.7715216602443777d, (-0.9454760404994205d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7715216602443775d + "'", double2 == 1.7715216602443775d);
    }

    @Test
    public void test5333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5333");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.219379580148095d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5448367582308211d + "'", double1 == 1.5448367582308211d);
    }

    @Test
    public void test5334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5334");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.14782604738794858d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14891718150533476d + "'", double1 == 0.14891718150533476d);
    }

    @Test
    public void test5335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5335");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) 13.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5336");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.8488530563129772d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test5337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5337");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.02717745857346494d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02718080430674016d + "'", double1 == 0.02718080430674016d);
    }

    @Test
    public void test5338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5338");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 51, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test5339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5339");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.1259469553800836d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1259469553800836d + "'", double1 == 1.1259469553800836d);
    }

    @Test
    public void test5340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5340");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.8600369041818202d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.293486410453363d + "'", double1 == 1.293486410453363d);
    }

    @Test
    public void test5341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5341");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1081.3246989097984d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2737367544323206E-13d + "'", double1 == 2.2737367544323206E-13d);
    }

    @Test
    public void test5342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5342");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.14774023931602442d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.14827828493928633d) + "'", double1 == (-0.14827828493928633d));
    }

    @Test
    public void test5343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5343");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.4953487812212205d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1747425010840047d + "'", double1 == 0.1747425010840047d);
    }

    @Test
    public void test5344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5344");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '4', 6559);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test5345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5345");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.4879978688854127d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.487997868885413d + "'", double1 == 1.487997868885413d);
    }

    @Test
    public void test5346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5346");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.21588220933551652d), 2.302585092994046d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.2158822093355165d) + "'", double2 == (-0.2158822093355165d));
    }

    @Test
    public void test5347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5347");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(41.975749374827494d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 41.9757493748275d + "'", double1 == 41.9757493748275d);
    }

    @Test
    public void test5348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5348");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.6733028896192996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8167606283502402d + "'", double1 == 0.8167606283502402d);
    }

    @Test
    public void test5349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5349");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7996188932311933d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9266603087507735d + "'", double1 == 0.9266603087507735d);
    }

    @Test
    public void test5350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5350");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.2490457723982544d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.487013964433391d + "'", double1 == 2.487013964433391d);
    }

    @Test
    public void test5351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5351");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9298471527633106d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07273505820949148d) + "'", double1 == (-0.07273505820949148d));
    }

    @Test
    public void test5352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5352");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.3205004784536853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1491303139564657d + "'", double1 == 1.1491303139564657d);
    }

    @Test
    public void test5353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5353");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.7070340408585634d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5354");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.4397629335614917d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.470321192256895d + "'", double1 == 11.470321192256895d);
    }

    @Test
    public void test5355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5355");
        double double1 = org.apache.commons.math.util.FastMath.log10(32.29225137547852d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5090983245421576d + "'", double1 == 1.5090983245421576d);
    }

    @Test
    public void test5356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5356");
        double double1 = org.apache.commons.math.util.FastMath.expm1(3.1679596500040805d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.758958277746018d + "'", double1 == 22.758958277746018d);
    }

    @Test
    public void test5357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5357");
        float float2 = org.apache.commons.math.util.FastMath.min(51.0f, 2005.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 51.0f + "'", float2 == 51.0f);
    }

    @Test
    public void test5358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5358");
        double double1 = org.apache.commons.math.util.FastMath.atan((-1.6571064922358931d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.027835478861093d) + "'", double1 == (-1.027835478861093d));
    }

    @Test
    public void test5359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5359");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 0.047496451376835516d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.047496451376835516d + "'", double2 == 0.047496451376835516d);
    }

    @Test
    public void test5360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5360");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 3);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test5361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5361");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.0658873316779507d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8172803502453954d + "'", double1 == 0.8172803502453954d);
    }

    @Test
    public void test5362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5362");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.3458247401995457E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8685626227668134E25d + "'", double1 == 3.8685626227668134E25d);
    }

    @Test
    public void test5363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5363");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.086961379713775d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0425744000855646d + "'", double1 == 1.0425744000855646d);
    }

    @Test
    public void test5364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5364");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.027858987455275d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5365");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.4844347252766887d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5366");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.948148009134034E13d + "'", double1 == 3.948148009134034E13d);
    }

    @Test
    public void test5367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5367");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) 2005);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5368");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.0263497319331099d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.790859832184406d + "'", double1 == 2.790859832184406d);
    }

    @Test
    public void test5369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5369");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) 2739.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5064495543010613d) + "'", double1 == (-0.5064495543010613d));
    }

    @Test
    public void test5370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5370");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test5371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5371");
        double double2 = org.apache.commons.math.util.FastMath.max(1.013811841723194d, 0.9535608805502648d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.013811841723194d + "'", double2 == 1.013811841723194d);
    }

    @Test
    public void test5372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5372");
        float float2 = org.apache.commons.math.util.FastMath.max(100.0f, (float) 2005);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2005.0f + "'", float2 == 2005.0f);
    }

    @Test
    public void test5373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5373");
        double double2 = org.apache.commons.math.util.FastMath.pow(32.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5374");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.017455064928217585d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017453292519943295d + "'", double1 == 0.017453292519943295d);
    }

    @Test
    public void test5375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5375");
        double double1 = org.apache.commons.math.util.FastMath.log(0.8976134920167367d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1080157131137308d) + "'", double1 == (-0.1080157131137308d));
    }

    @Test
    public void test5376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5376");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9899750504798679d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5487107188577957d + "'", double1 == 0.5487107188577957d);
    }

    @Test
    public void test5377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5377");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.17633822983826752d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.003077682707816276d + "'", double1 == 0.003077682707816276d);
    }

    @Test
    public void test5378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5378");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.49768524144876375d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.46029477451592193d + "'", double1 == 0.46029477451592193d);
    }

    @Test
    public void test5379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5379");
        double double1 = org.apache.commons.math.util.FastMath.sinh(17.485714285714284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9629951688699707E7d + "'", double1 == 1.9629951688699707E7d);
    }

    @Test
    public void test5380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5380");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-4.9E-324d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.9E-324d) + "'", double1 == (-4.9E-324d));
    }

    @Test
    public void test5381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5381");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 51L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9318256327243257d + "'", double1 == 3.9318256327243257d);
    }

    @Test
    public void test5382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5382");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8414709846639918d, 1.2909366033525147d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.841470984663992d + "'", double2 == 0.841470984663992d);
    }

    @Test
    public void test5383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5383");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.12796368962740468d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9918238130969158d + "'", double1 == 0.9918238130969158d);
    }

    @Test
    public void test5384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5384");
        double double2 = org.apache.commons.math.util.FastMath.max(328280.6350011744d, 1833.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 328280.6350011744d + "'", double2 == 328280.6350011744d);
    }

    @Test
    public void test5385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5385");
        long long1 = org.apache.commons.math.util.FastMath.round(1.3453962389097756d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test5386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5386");
        double double1 = org.apache.commons.math.util.FastMath.atan(5.916079783099615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4033482475752073d + "'", double1 == 1.4033482475752073d);
    }

    @Test
    public void test5387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5387");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test5388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5388");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.4443527293734063d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3522721478954661d) + "'", double1 == (-0.3522721478954661d));
    }

    @Test
    public void test5389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5389");
        double double1 = org.apache.commons.math.util.FastMath.cosh(3.77573958634956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 21.82634224864968d + "'", double1 == 21.82634224864968d);
    }

    @Test
    public void test5390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5390");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 9.223372E18f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5391");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.7601526319909638d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test5392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5392");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9131871133554458d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5393");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 51);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 51L + "'", long1 == 51L);
    }

    @Test
    public void test5394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5394");
        double double1 = org.apache.commons.math.util.FastMath.atan(3.4279467535836454E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4279467535836454E-15d + "'", double1 == 3.4279467535836454E-15d);
    }

    @Test
    public void test5395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5395");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.19334632705655574d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19457169242762154d + "'", double1 == 0.19457169242762154d);
    }

    @Test
    public void test5396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5396");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 194L, (float) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test5397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5397");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.8135279227115655d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.014198740808226773d + "'", double1 == 0.014198740808226773d);
    }

    @Test
    public void test5398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5398");
        double double1 = org.apache.commons.math.util.FastMath.ulp(7.60339933974067d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test5399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5399");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.12240493707646952d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12271268142981998d + "'", double1 == 0.12271268142981998d);
    }

    @Test
    public void test5400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5400");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5401");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.5052997058324041d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 28.951540533398784d + "'", double1 == 28.951540533398784d);
    }

    @Test
    public void test5402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5402");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.016371056514872515d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.016238495587406535d + "'", double1 == 0.016238495587406535d);
    }

    @Test
    public void test5403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5403");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.9088339535934726d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18.335406162705468d + "'", double1 == 18.335406162705468d);
    }

    @Test
    public void test5404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5404");
        double double2 = org.apache.commons.math.util.FastMath.pow(18.335406162705468d, 0.1763382298382675d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6701920674592716d + "'", double2 == 1.6701920674592716d);
    }

    @Test
    public void test5405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5405");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9506431907144247d, 85.05331264764003d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 85.05331264764003d + "'", double2 == 85.05331264764003d);
    }

    @Test
    public void test5406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5406");
        double double1 = org.apache.commons.math.util.FastMath.signum((-1.2510593165140436d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5407");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.16172203947373598d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test5408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5408");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.04159438018192675d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.529189943578484d + "'", double1 == 1.529189943578484d);
    }

    @Test
    public void test5409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5409");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.4639620792590624d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.43330790510496064d) + "'", double1 == (-0.43330790510496064d));
    }

    @Test
    public void test5410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5410");
        double double1 = org.apache.commons.math.util.FastMath.log(2979.3805346802806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.999470683622238d + "'", double1 == 7.999470683622238d);
    }

    @Test
    public void test5411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5411");
        double double1 = org.apache.commons.math.util.FastMath.atanh(16.75071124639625d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5412");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.610564700497503d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7813863964118539d + "'", double1 == 0.7813863964118539d);
    }

    @Test
    public void test5413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5413");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 10, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test5414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5414");
        double double1 = org.apache.commons.math.util.FastMath.log(1.1174415923921306d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11104177982388856d + "'", double1 == 0.11104177982388856d);
    }

    @Test
    public void test5415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5415");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '4', 13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test5416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5416");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.02717411308730122d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5436188682214316d + "'", double1 == 1.5436188682214316d);
    }

    @Test
    public void test5417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5417");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) 97L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test5418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5418");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.373400766945016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1224236947215336d + "'", double1 == 1.1224236947215336d);
    }

    @Test
    public void test5419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5419");
        long long2 = org.apache.commons.math.util.FastMath.min(9L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5420");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 9L, 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test5421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5421");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5124299859921386d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5422");
        int int2 = org.apache.commons.math.util.FastMath.min(32, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test5423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5423");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.08783146533684513d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08783146533684513d + "'", double1 == 0.08783146533684513d);
    }

    @Test
    public void test5424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5424");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.129830963909753d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.129830963909753d + "'", double1 == 1.129830963909753d);
    }

    @Test
    public void test5425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5425");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9990759513130485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5419953503328847d + "'", double1 == 1.5419953503328847d);
    }

    @Test
    public void test5426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5426");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 7L, (float) (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test5427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5427");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.0261600244039246d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5428");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.6682419027059644d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5429");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.028471562981618036d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.02846387217529635d) + "'", double1 == (-0.02846387217529635d));
    }

    @Test
    public void test5430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5430");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.602651435823948d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.20483907696488424d + "'", double1 == 0.20483907696488424d);
    }

    @Test
    public void test5431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5431");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.7948999578134455d, (-2.7782672669540793d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.862923886687095d + "'", double2 == 2.862923886687095d);
    }

    @Test
    public void test5432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5432");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.7456282765000656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.12747763056945954d) + "'", double1 == (-0.12747763056945954d));
    }

    @Test
    public void test5433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5433");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.8160703637778226d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5434");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.7645999354632541d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7645999354632541d + "'", double1 == 0.7645999354632541d);
    }

    @Test
    public void test5435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5435");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.08760630539897361d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.29598362353173124d + "'", double1 == 0.29598362353173124d);
    }

    @Test
    public void test5436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5436");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2L, 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test5437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5437");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.0310116979478843d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4251356770314483d + "'", double1 == 1.4251356770314483d);
    }

    @Test
    public void test5438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5438");
        long long1 = org.apache.commons.math.util.FastMath.abs(48L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 48L + "'", long1 == 48L);
    }

    @Test
    public void test5439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5439");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, (long) 6559);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5440");
        double double1 = org.apache.commons.math.util.FastMath.expm1(4.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 53.598150033144236d + "'", double1 == 53.598150033144236d);
    }

    @Test
    public void test5441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5441");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.301812843306464d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5442");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1L, 3.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test5443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5443");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.045392431815163135d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0010304133430488d + "'", double1 == 1.0010304133430488d);
    }

    @Test
    public void test5444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5444");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.9995407254211099d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5445");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 35L, 2.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test5446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5446");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 13, (long) 48);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 48L + "'", long2 == 48L);
    }

    @Test
    public void test5447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5447");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.3453962389097756d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.46168239586417d) + "'", double1 == (-0.46168239586417d));
    }

    @Test
    public void test5448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5448");
        double double1 = org.apache.commons.math.util.FastMath.log(25.339410356026747d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.232360905325761d + "'", double1 == 3.232360905325761d);
    }

    @Test
    public void test5449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5449");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-1.0697079433475818d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5450");
        double double1 = org.apache.commons.math.util.FastMath.ulp(3.7152266900892013d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test5451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5451");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.20237568556709695d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5452");
        double double1 = org.apache.commons.math.util.FastMath.asin(138.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5453");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.2063348770899864d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0983327715633302d + "'", double1 == 1.0983327715633302d);
    }

    @Test
    public void test5454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5454");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.8454210262244998d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9497908096382249d) + "'", double1 == (-0.9497908096382249d));
    }

    @Test
    public void test5455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5455");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.1272994544561892d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0873078168317365d + "'", double1 == 3.0873078168317365d);
    }

    @Test
    public void test5456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5456");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.790859832184406d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5457");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.7771308193574424E20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5458");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.6633689306847952d, 0.5501702829958329d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3230655227552648d + "'", double2 == 1.3230655227552648d);
    }

    @Test
    public void test5459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5459");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.0025497213454224d, 0.041482114154463165d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0025497213454222d + "'", double2 == 1.0025497213454222d);
    }

    @Test
    public void test5460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5460");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(8.356469016601148d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14584789818058272d + "'", double1 == 0.14584789818058272d);
    }

    @Test
    public void test5461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5461");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.0038696050023175d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5462");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9586654676184496d, 0.7462913692181242d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9586654676184495d + "'", double2 == 0.9586654676184495d);
    }

    @Test
    public void test5463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5463");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.4585955050518922E86d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4585955050518922E86d + "'", double1 == 1.4585955050518922E86d);
    }

    @Test
    public void test5464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5464");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 51, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5465");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2182829050172777d + "'", double1 == 1.2182829050172777d);
    }

    @Test
    public void test5466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5466");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '#', (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test5467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5467");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.008837977760189355d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5425181113333807E-4d) + "'", double1 == (-1.5425181113333807E-4d));
    }

    @Test
    public void test5468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5468");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.1750843599550171d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7770674499746976d + "'", double1 == 0.7770674499746976d);
    }

    @Test
    public void test5469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5469");
        long long2 = org.apache.commons.math.util.FastMath.max(194L, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 194L + "'", long2 == 194L);
    }

    @Test
    public void test5470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5470");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.23310874770420992d), 1.5202860320095168d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.15214718429283577d) + "'", double2 == (-0.15214718429283577d));
    }

    @Test
    public void test5471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5471");
        double double2 = org.apache.commons.math.util.FastMath.min(0.4596132072859689d, 0.6975340031826087d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4596132072859689d + "'", double2 == 0.4596132072859689d);
    }

    @Test
    public void test5472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5472");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.912801418045861d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5473");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 0, 5L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5474");
        double double2 = org.apache.commons.math.util.FastMath.max(0.1472859194620699d, 0.8996379399296264d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8996379399296264d + "'", double2 == 0.8996379399296264d);
    }

    @Test
    public void test5475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5475");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.5707963267948712d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0038848218538798d + "'", double1 == 1.0038848218538798d);
    }

    @Test
    public void test5476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5476");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 138L, 36.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 36.0f + "'", float2 == 36.0f);
    }

    @Test
    public void test5477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5477");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 32L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5478");
        float float1 = org.apache.commons.math.util.FastMath.abs(78.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 78.0f + "'", float1 == 78.0f);
    }

    @Test
    public void test5479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5479");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.9899924966004454d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5480");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.16288628673873548d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16146084948443995d + "'", double1 == 0.16146084948443995d);
    }

    @Test
    public void test5481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5481");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.2565251565229353d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2537918989470119d + "'", double1 == 0.2537918989470119d);
    }

    @Test
    public void test5482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5482");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 1.0109461818722032d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test5483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5483");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.8830864942993886d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6329121829266997d + "'", double1 == 0.6329121829266997d);
    }

    @Test
    public void test5484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5484");
        double double1 = org.apache.commons.math.util.FastMath.sinh(5.149439664879342d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 86.1645476531233d + "'", double1 == 86.1645476531233d);
    }

    @Test
    public void test5485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5485");
        double double1 = org.apache.commons.math.util.FastMath.acos(13.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5486");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.1423973302809369d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5221964908180761d + "'", double1 == 0.5221964908180761d);
    }

    @Test
    public void test5487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5487");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9747047669009431d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9914961450719892d + "'", double1 == 0.9914961450719892d);
    }

    @Test
    public void test5488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5488");
        double double2 = org.apache.commons.math.util.FastMath.min(0.5522556214650427d, 1.1259023567118747d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5522556214650427d + "'", double2 == 0.5522556214650427d);
    }

    @Test
    public void test5489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5489");
        long long1 = org.apache.commons.math.util.FastMath.round(56.28181337742978d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 56L + "'", long1 == 56L);
    }

    @Test
    public void test5490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5490");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.7059602000407633d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.012321329878749128d) + "'", double1 == (-0.012321329878749128d));
    }

    @Test
    public void test5491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5491");
        double double1 = org.apache.commons.math.util.FastMath.rint(33.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 33.0d + "'", double1 == 33.0d);
    }

    @Test
    public void test5492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5492");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.999448616881847d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8411729433394295d) + "'", double1 == (-0.8411729433394295d));
    }

    @Test
    public void test5493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5493");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9385078997951388d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.016380052907402187d + "'", double1 == 0.016380052907402187d);
    }

    @Test
    public void test5494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5494");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9660002138002461d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7681059998291195d + "'", double1 == 0.7681059998291195d);
    }

    @Test
    public void test5495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5495");
        double double1 = org.apache.commons.math.util.FastMath.sin((-13.124315920229801d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5294442277710718d) + "'", double1 == (-0.5294442277710718d));
    }

    @Test
    public void test5496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5496");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 32, (float) 7L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test5497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5497");
        double double1 = org.apache.commons.math.util.FastMath.log10(85.7720556895209d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9333458188909523d + "'", double1 == 1.9333458188909523d);
    }

    @Test
    public void test5498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5498");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.2536951179519045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5032640441500233d + "'", double1 == 2.5032640441500233d);
    }

    @Test
    public void test5499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5499");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.602651435823948d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.602651435823948d + "'", double1 == 1.602651435823948d);
    }

    @Test
    public void test5500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5500");
        double double1 = org.apache.commons.math.util.FastMath.log(38.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6375861597263857d + "'", double1 == 3.6375861597263857d);
    }
}

