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
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) 32);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test6002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6002");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.357488869363912d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3309136634491152d + "'", double1 == 1.3309136634491152d);
    }

    @Test
    public void test6003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6003");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.18148297420509218d), 1.0655569873089485d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test6004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6004");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.15919070276695985d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test6005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6005");
        double double1 = org.apache.commons.math.util.FastMath.expm1(4.9E-324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test6006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6006");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9999493435066203d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7181441333212035d + "'", double1 == 2.7181441333212035d);
    }

    @Test
    public void test6007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6007");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.9836542011042855d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1038580544061618d + "'", double1 == 1.1038580544061618d);
    }

    @Test
    public void test6008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6008");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.8816651612292111d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4149175874172992d + "'", double1 == 1.4149175874172992d);
    }

    @Test
    public void test6009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6009");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.11889592015824525d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11917624175994264d + "'", double1 == 0.11917624175994264d);
    }

    @Test
    public void test6010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6010");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.0911052960943115d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3208591316625293d + "'", double1 == 1.3208591316625293d);
    }

    @Test
    public void test6011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6011");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.6241113009286544d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8665863865235954d + "'", double1 == 0.8665863865235954d);
    }

    @Test
    public void test6012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6012");
        long long1 = org.apache.commons.math.util.FastMath.round(0.6335140007329974d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test6013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6013");
        float float2 = org.apache.commons.math.util.FastMath.max(2005.0f, (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2005.0f + "'", float2 == 2005.0f);
    }

    @Test
    public void test6014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6014");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9149994957367079d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.914999495736708d + "'", double1 == 0.914999495736708d);
    }

    @Test
    public void test6015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6015");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 9223372036854775807L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6016");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.0008590278831344d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6017");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 51);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6018");
        double double2 = org.apache.commons.math.util.FastMath.min(0.47420105633127485d, 1.135079852099922d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.47420105633127485d + "'", double2 == 0.47420105633127485d);
    }

    @Test
    public void test6019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6019");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.7033339497485451d, 0.9503508426863698d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6588837857725012d + "'", double2 == 1.6588837857725012d);
    }

    @Test
    public void test6020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6020");
        long long2 = org.apache.commons.math.util.FastMath.max(97L, (-15L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test6021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6021");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.460094597035771d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8960104973414255d + "'", double1 == 0.8960104973414255d);
    }

    @Test
    public void test6022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6022");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.662907307470914E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test6023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6023");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.7603964251352016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5655390252410818d + "'", double1 == 0.5655390252410818d);
    }

    @Test
    public void test6024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6024");
        long long1 = org.apache.commons.math.util.FastMath.abs(9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test6025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6025");
        double double1 = org.apache.commons.math.util.FastMath.expm1(62.62883386261312d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5825482301723447E27d + "'", double1 == 1.5825482301723447E27d);
    }

    @Test
    public void test6026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6026");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.7078167915714771d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6027");
        double double2 = org.apache.commons.math.util.FastMath.max(1.1573983488113466d, 1.123919126120245d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1573983488113466d + "'", double2 == 1.1573983488113466d);
    }

    @Test
    public void test6028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6028");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.5223832855023487d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.583135108718574d + "'", double1 == 4.583135108718574d);
    }

    @Test
    public void test6029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6029");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-5), (float) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.0f) + "'", float2 == (-5.0f));
    }

    @Test
    public void test6030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6030");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8996379399296265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4518567236099446d + "'", double1 == 0.4518567236099446d);
    }

    @Test
    public void test6031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6031");
        int int2 = org.apache.commons.math.util.FastMath.max(97, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test6032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6032");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7426431749340047d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8370086477683244d + "'", double1 == 0.8370086477683244d);
    }

    @Test
    public void test6033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6033");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.3893722612835904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.37131109331272355d + "'", double1 == 0.37131109331272355d);
    }

    @Test
    public void test6034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6034");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 6559L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6559 + "'", int1 == 6559);
    }

    @Test
    public void test6035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6035");
        int int2 = org.apache.commons.math.util.FastMath.min(83, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6036");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.2133974932616556d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0211777813928616d + "'", double1 == 0.0211777813928616d);
    }

    @Test
    public void test6037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6037");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.7621584293004213d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test6038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6038");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.104278850811079d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1042788508110792d + "'", double1 == 2.1042788508110792d);
    }

    @Test
    public void test6039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6039");
        float float2 = org.apache.commons.math.util.FastMath.min(51.0f, (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 51.0f + "'", float2 == 51.0f);
    }

    @Test
    public void test6040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6040");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.01687178265730875d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.25648008999175614d + "'", double1 == 0.25648008999175614d);
    }

    @Test
    public void test6041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6041");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-1.742359248835562d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6042");
        double double1 = org.apache.commons.math.util.FastMath.tanh(4.15912713462618d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9995120760870788d + "'", double1 == 0.9995120760870788d);
    }

    @Test
    public void test6043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6043");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.2724434278529467d), (-0.008879097553696258d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.2724434278529467d) + "'", double2 == (-0.2724434278529467d));
    }

    @Test
    public void test6044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6044");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.18148297420509218d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6045");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.42483495011420774d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3717797621305171d) + "'", double1 == (-0.3717797621305171d));
    }

    @Test
    public void test6046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6046");
        double double2 = org.apache.commons.math.util.FastMath.pow((-89.00499281765603d), 0.010320479063999152d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test6047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6047");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5515679276951895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9140438217020382d + "'", double1 == 0.9140438217020382d);
    }

    @Test
    public void test6048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6048");
        float float2 = org.apache.commons.math.util.FastMath.max(3280.0f, 4.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3280.0f + "'", float2 == 3280.0f);
    }

    @Test
    public void test6049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6049");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test6050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6050");
        long long2 = org.apache.commons.math.util.FastMath.min((long) '4', (long) 37);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 37L + "'", long2 == 37L);
    }

    @Test
    public void test6051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6051");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.837589179357618E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.837589179357618E-15d + "'", double1 == 1.837589179357618E-15d);
    }

    @Test
    public void test6052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6052");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.5501702829958328d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8194058173186031d + "'", double1 == 0.8194058173186031d);
    }

    @Test
    public void test6053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6053");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.6483608274590866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9124034991009713d + "'", double1 == 1.9124034991009713d);
    }

    @Test
    public void test6054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6054");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.2639873180109631d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.26706420183981067d + "'", double1 == 0.26706420183981067d);
    }

    @Test
    public void test6055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6055");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.6241113009286544d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.48496077444565683d + "'", double1 == 0.48496077444565683d);
    }

    @Test
    public void test6056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6056");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.4812058561972497d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6180243309565554d + "'", double1 == 0.6180243309565554d);
    }

    @Test
    public void test6057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6057");
        double double2 = org.apache.commons.math.util.FastMath.pow(34.30685281944006d, 0.01409149002819991d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0510800773516065d + "'", double2 == 1.0510800773516065d);
    }

    @Test
    public void test6058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6058");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.47381472041431183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.45766923321173114d + "'", double1 == 0.45766923321173114d);
    }

    @Test
    public void test6059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6059");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9988731032017402d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7848343974049664d + "'", double1 == 0.7848343974049664d);
    }

    @Test
    public void test6060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6060");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.0609297062414165d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0609297062414162d + "'", double2 == 1.0609297062414162d);
    }

    @Test
    public void test6061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6061");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 9223372036854775807L, (float) 1L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test6062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6062");
        double double1 = org.apache.commons.math.util.FastMath.log10(5.620387737964422d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7497662776063796d + "'", double1 == 0.7497662776063796d);
    }

    @Test
    public void test6063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6063");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.6113119967914531d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6064");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.11765201143093873d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11738226518994596d + "'", double1 == 0.11738226518994596d);
    }

    @Test
    public void test6065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6065");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9999999986859385d, (-24.533059822774465d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999999986859384d + "'", double2 == 0.9999999986859384d);
    }

    @Test
    public void test6066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6066");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.024913294410754103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6067");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.555348061489414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.99836867862969d + "'", double1 == 0.99836867862969d);
    }

    @Test
    public void test6068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6068");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.5531510717185382d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0085213420117332d + "'", double1 == 1.0085213420117332d);
    }

    @Test
    public void test6069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6069");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.0343154071137053d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6070");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.37101925991283097d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.37101925991283097d + "'", double1 == 0.37101925991283097d);
    }

    @Test
    public void test6071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6071");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.2844895915767354d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16.300052912747475d + "'", double1 == 16.300052912747475d);
    }

    @Test
    public void test6072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6072");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9476309577950855d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9822297410034884d + "'", double1 == 0.9822297410034884d);
    }

    @Test
    public void test6073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6073");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.01468312461911342d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6074");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 10, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test6075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6075");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.37904451714063647d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3618773974801683d) + "'", double1 == (-0.3618773974801683d));
    }

    @Test
    public void test6076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6076");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9022955440581245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6077");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.11975712045798752d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11975712045798752d + "'", double1 == 0.11975712045798752d);
    }

    @Test
    public void test6078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6078");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.4575013994861012d, 0.15700035487971642d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4634912466044083d + "'", double2 == 1.4634912466044083d);
    }

    @Test
    public void test6079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6079");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-2.713130608547954d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3947302928006944d) + "'", double1 == (-1.3947302928006944d));
    }

    @Test
    public void test6080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6080");
        double double1 = org.apache.commons.math.util.FastMath.ceil(53.486821090156674d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 54.0d + "'", double1 == 54.0d);
    }

    @Test
    public void test6081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6081");
        int int2 = org.apache.commons.math.util.FastMath.max(2, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test6082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6082");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.12621937302162323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12621937302162325d + "'", double1 == 0.12621937302162325d);
    }

    @Test
    public void test6083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6083");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.1612398348874445d), 0.7372144183864715d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test6084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6084");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test6085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6085");
        double double1 = org.apache.commons.math.util.FastMath.expm1(33.66561760358879d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.1763025667199225E14d + "'", double1 == 4.1763025667199225E14d);
    }

    @Test
    public void test6086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6086");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9999999999999645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.76159415595575d + "'", double1 == 0.76159415595575d);
    }

    @Test
    public void test6087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6087");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.87163938376703d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.239456935305343d + "'", double1 == 1.239456935305343d);
    }

    @Test
    public void test6088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6088");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.494840085597921d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.189576968878733d + "'", double1 == 1.189576968878733d);
    }

    @Test
    public void test6089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6089");
        double double2 = org.apache.commons.math.util.FastMath.min(206761.6855142214d, 4.493423335506387d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.493423335506387d + "'", double2 == 4.493423335506387d);
    }

    @Test
    public void test6090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6090");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.7503427504189538d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test6091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6091");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-1.8655219413764763d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.307060884908975d + "'", double1 == 3.307060884908975d);
    }

    @Test
    public void test6092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6092");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.40893653071341846d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6093");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.0109461818722032d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.004728036364442429d + "'", double1 == 0.004728036364442429d);
    }

    @Test
    public void test6094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6094");
        double double1 = org.apache.commons.math.util.FastMath.log(0.04282343610080969d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.15066975380865d) + "'", double1 == (-3.15066975380865d));
    }

    @Test
    public void test6095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6095");
        long long1 = org.apache.commons.math.util.FastMath.round(0.7790360334325874d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test6096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6096");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 'a', 36L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test6097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6097");
        double double1 = org.apache.commons.math.util.FastMath.ceil(123.44001497540268d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 124.0d + "'", double1 == 124.0d);
    }

    @Test
    public void test6098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6098");
        float float2 = org.apache.commons.math.util.FastMath.min((-5.0f), 105.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.0f) + "'", float2 == (-5.0f));
    }

    @Test
    public void test6099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6099");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 0.6895564260441728d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6895564260441728d + "'", double2 == 0.6895564260441728d);
    }

    @Test
    public void test6100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6100");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.6783203845295841d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8058871687495555d) + "'", double1 == (-0.8058871687495555d));
    }

    @Test
    public void test6101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6101");
        double double1 = org.apache.commons.math.util.FastMath.acos(97.00000000000001d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6102");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-3.380515006246586d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test6103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6103");
        double double1 = org.apache.commons.math.util.FastMath.log10(137.38927884571783d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.137952843933064d + "'", double1 == 2.137952843933064d);
    }

    @Test
    public void test6104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6104");
        int int2 = org.apache.commons.math.util.FastMath.min(2005, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test6105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6105");
        double double2 = org.apache.commons.math.util.FastMath.min(1.5507969934215646d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test6106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6106");
        double double1 = org.apache.commons.math.util.FastMath.tan(27.951773034959196d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3342339022745425d) + "'", double1 == (-0.3342339022745425d));
    }

    @Test
    public void test6107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6107");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.0241519893614606d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017874824255207426d + "'", double1 == 0.017874824255207426d);
    }

    @Test
    public void test6108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6108");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.40985124626279884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3883463677593004d + "'", double1 == 0.3883463677593004d);
    }

    @Test
    public void test6109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6109");
        int int2 = org.apache.commons.math.util.FastMath.max(83, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 83 + "'", int2 == 83);
    }

    @Test
    public void test6110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6110");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 37);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 37L + "'", long1 == 37L);
    }

    @Test
    public void test6111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6111");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6112");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.5707963001144702d, 0.6230461176848097d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3249263073028634d + "'", double2 == 1.3249263073028634d);
    }

    @Test
    public void test6113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6113");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.1260190148607026d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6114");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-1.5495411464777387d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2219332254334312d) + "'", double1 == (-1.2219332254334312d));
    }

    @Test
    public void test6115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6115");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 10, (-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test6116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6116");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.6902517951841332d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test6117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6117");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) 51);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 51.0f + "'", float2 == 51.0f);
    }

    @Test
    public void test6118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6118");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2453.035678413897d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.547473508864641E-13d + "'", double1 == 4.547473508864641E-13d);
    }

    @Test
    public void test6119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6119");
        double double2 = org.apache.commons.math.util.FastMath.max(1.2118662346608502d, 16.300052912747475d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 16.300052912747475d + "'", double2 == 16.300052912747475d);
    }

    @Test
    public void test6120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6120");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.41386243940890527d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4402630249707292d + "'", double1 == 0.4402630249707292d);
    }

    @Test
    public void test6121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6121");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.973047646769935E-247d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.452566044322558E-124d + "'", double1 == 5.452566044322558E-124d);
    }

    @Test
    public void test6122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6122");
        double double2 = org.apache.commons.math.util.FastMath.min(0.1417162261588426d, (-0.9355520242262295d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9355520242262295d) + "'", double2 == (-0.9355520242262295d));
    }

    @Test
    public void test6123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6123");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.5701593298424005d, (-1.564538235027751d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5701593298424004d + "'", double2 == 0.5701593298424004d);
    }

    @Test
    public void test6124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6124");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 100, (float) (-15L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-15.0f) + "'", float2 == (-15.0f));
    }

    @Test
    public void test6125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6125");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.8656496755126944d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3154569363008912d + "'", double1 == 1.3154569363008912d);
    }

    @Test
    public void test6126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6126");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.0049514518537068d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6956198469260817d + "'", double1 == 0.6956198469260817d);
    }

    @Test
    public void test6127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6127");
        double double1 = org.apache.commons.math.util.FastMath.expm1(3.082130173350885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.804800966092852d + "'", double1 == 20.804800966092852d);
    }

    @Test
    public void test6128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6128");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.0068699188553262855d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.006869864817938295d) + "'", double1 == (-0.006869864817938295d));
    }

    @Test
    public void test6129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6129");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.1315693185520315d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.12328149982556645d) + "'", double1 == (-0.12328149982556645d));
    }

    @Test
    public void test6130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6130");
        int int2 = org.apache.commons.math.util.FastMath.max(36, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test6131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6131");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.1074946319245942d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6132");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9962731540917057d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6133");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.0343154071137053d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6134");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.7224741314941174d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8814547807230491d + "'", double1 == 0.8814547807230491d);
    }

    @Test
    public void test6135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6135");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.7063058773712644d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6136");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 83L, (float) 49);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 49.0f + "'", float2 == 49.0f);
    }

    @Test
    public void test6137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6137");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.6802768287445087d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6138");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.998019200072578d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5506433159893342d + "'", double1 == 1.5506433159893342d);
    }

    @Test
    public void test6139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6139");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.015372395508685268d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015371184736752325d + "'", double1 == 0.015371184736752325d);
    }

    @Test
    public void test6140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6140");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 100, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test6141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6141");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.3180014821023565d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 27.60512605483086d + "'", double1 == 27.60512605483086d);
    }

    @Test
    public void test6142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6142");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.3131691680118311d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test6143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6143");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-1), 51L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 51L + "'", long2 == 51L);
    }

    @Test
    public void test6144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6144");
        int int2 = org.apache.commons.math.util.FastMath.max(105, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 105 + "'", int2 == 105);
    }

    @Test
    public void test6145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6145");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 83, 97.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 83.0f + "'", float2 == 83.0f);
    }

    @Test
    public void test6146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6146");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.1124649919871528E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6147");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.1483650317358706d, (-0.7866720044340358d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.955183880127572d + "'", double2 == 2.955183880127572d);
    }

    @Test
    public void test6148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6148");
        long long1 = org.apache.commons.math.util.FastMath.round(1.773775678340353d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test6149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6149");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.914999495736708d, 1.4519004066366517d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.878996049643103d + "'", double2 == 0.878996049643103d);
    }

    @Test
    public void test6150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6150");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.7774954015215239d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 101.84298461109496d + "'", double1 == 101.84298461109496d);
    }

    @Test
    public void test6151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6151");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.05105018795236219d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2920026546246028d) + "'", double1 == (-1.2920026546246028d));
    }

    @Test
    public void test6152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6152");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.32660713332209224d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6153");
        float float1 = org.apache.commons.math.util.FastMath.abs((-5.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.0f + "'", float1 == 5.0f);
    }

    @Test
    public void test6154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6154");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.1152127885098424d, 2.106250657255404d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2581930243950237d + "'", double2 == 1.2581930243950237d);
    }

    @Test
    public void test6155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6155");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.7858371377510551d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9228069352205487d + "'", double1 == 0.9228069352205487d);
    }

    @Test
    public void test6156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6156");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.570705526933711d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0231525181516248d + "'", double1 == 1.0231525181516248d);
    }

    @Test
    public void test6157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6157");
        double double1 = org.apache.commons.math.util.FastMath.atan(24256.84028216254d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707551013101344d + "'", double1 == 1.5707551013101344d);
    }

    @Test
    public void test6158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6158");
        double double1 = org.apache.commons.math.util.FastMath.asin(238.80649712605756d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6159");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.16601303451652816d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6160");
        float float2 = org.apache.commons.math.util.FastMath.min(3.9481478E13f, (float) 2147483647L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test6161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6161");
        long long1 = org.apache.commons.math.util.FastMath.round(1.420282415626885d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test6162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6162");
        double double1 = org.apache.commons.math.util.FastMath.log(1.0021597261446225d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0021573972886372176d + "'", double1 == 0.0021573972886372176d);
    }

    @Test
    public void test6163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6163");
        double double1 = org.apache.commons.math.util.FastMath.sinh(11013.232920103323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test6164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6164");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.6356818791600742d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8883093013254685d + "'", double1 == 0.8883093013254685d);
    }

    @Test
    public void test6165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6165");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.37287332357954484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6106335427894088d + "'", double1 == 0.6106335427894088d);
    }

    @Test
    public void test6166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6166");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 97, 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test6167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6167");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.0986122886681096d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0318458398102472d + "'", double1 == 1.0318458398102472d);
    }

    @Test
    public void test6168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6168");
        long long2 = org.apache.commons.math.util.FastMath.min(3L, (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test6169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6169");
        double double1 = org.apache.commons.math.util.FastMath.tanh(4.295214085529645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.999628316119926d + "'", double1 == 0.999628316119926d);
    }

    @Test
    public void test6170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6170");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 97L, (-5.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test6171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6171");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.09189023888044913d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.303134027915787d + "'", double1 == 0.303134027915787d);
    }

    @Test
    public void test6172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6172");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.549440964133183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6173");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.5708920866202177d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6174");
        double double1 = org.apache.commons.math.util.FastMath.acos(470.23277203381366d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6175");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.366857789636033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.366857789636033d + "'", double1 == 2.366857789636033d);
    }

    @Test
    public void test6176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6176");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2005, (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test6177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6177");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.914999495736708d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4967739928730976d + "'", double1 == 2.4967739928730976d);
    }

    @Test
    public void test6178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6178");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.038991025401791155d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03901079677802508d + "'", double1 == 0.03901079677802508d);
    }

    @Test
    public void test6179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6179");
        double double2 = org.apache.commons.math.util.FastMath.pow(8.0d, 0.5107291743426533d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8922405011409196d + "'", double2 == 2.8922405011409196d);
    }

    @Test
    public void test6180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6180");
        double double1 = org.apache.commons.math.util.FastMath.abs(6559.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6559.0d + "'", double1 == 6559.0d);
    }

    @Test
    public void test6181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6181");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 6559);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6559 + "'", int1 == 6559);
    }

    @Test
    public void test6182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6182");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.0006178365651222d, 0.8940757456435278d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.000617836565122d + "'", double2 == 1.000617836565122d);
    }

    @Test
    public void test6183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6183");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.323818048994663d, (double) 2005.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.602582826063854E-4d + "'", double2 == 6.602582826063854E-4d);
    }

    @Test
    public void test6184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6184");
        double double1 = org.apache.commons.math.util.FastMath.atan(4.311231547115194E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948963d + "'", double1 == 1.5707963267948963d);
    }

    @Test
    public void test6185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6185");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.054822099620526d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6186");
        int int2 = org.apache.commons.math.util.FastMath.min(97, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test6187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6187");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 32, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test6188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6188");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.3606730780703395d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.201806883241836d + "'", double1 == 1.201806883241836d);
    }

    @Test
    public void test6189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6189");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.1556157735575975E15d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6190");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.3702197021636928d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.918586942130121d + "'", double1 == 4.918586942130121d);
    }

    @Test
    public void test6191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6191");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9999103740052037d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6192");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.19185280219404077d), 0.14891233518812158d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14891233518812158d + "'", double2 == 0.14891233518812158d);
    }

    @Test
    public void test6193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6193");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 0, (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test6194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6194");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(8.692617836018588d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1517148018561089d + "'", double1 == 0.1517148018561089d);
    }

    @Test
    public void test6195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6195");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.5884697075000961d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5589126412572623d + "'", double1 == 0.5589126412572623d);
    }

    @Test
    public void test6196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6196");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.6903377571690373d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8837997527839734d + "'", double1 == 0.8837997527839734d);
    }

    @Test
    public void test6197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6197");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.549440964133183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9891013135438892d + "'", double1 == 0.9891013135438892d);
    }

    @Test
    public void test6198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6198");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 5L, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test6199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6199");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.0794627783515645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4420342500618923d + "'", double1 == 1.4420342500618923d);
    }

    @Test
    public void test6200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6200");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(5.362545819211763E122d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.359408083430186E120d + "'", double1 == 9.359408083430186E120d);
    }

    @Test
    public void test6201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6201");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.6233795230203681d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5361295105054665d + "'", double1 == 0.5361295105054665d);
    }

    @Test
    public void test6202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6202");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9557606135662686d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7423799067262445d + "'", double1 == 0.7423799067262445d);
    }

    @Test
    public void test6203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6203");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.8930205839940679d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.728945661475505d + "'", double1 == 0.728945661475505d);
    }

    @Test
    public void test6204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6204");
        int int2 = org.apache.commons.math.util.FastMath.min(3, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test6205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6205");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-9.338683839135873d), 0.9666101045767669d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-9.338683839135872d) + "'", double2 == (-9.338683839135872d));
    }

    @Test
    public void test6206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6206");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.06340421154563104d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06331945226504293d + "'", double1 == 0.06331945226504293d);
    }

    @Test
    public void test6207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6207");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.570794982590176d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6208");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7218684241594407d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8064984475118836d + "'", double1 == 0.8064984475118836d);
    }

    @Test
    public void test6209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6209");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9525912254636142d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.489079345930119d + "'", double1 == 1.489079345930119d);
    }

    @Test
    public void test6210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6210");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.003632002313892395d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test6211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6211");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 2147483647, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test6212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6212");
        long long1 = org.apache.commons.math.util.FastMath.round(1.5707963267948948d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test6213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6213");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.3967916312027995d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3967916312027997d + "'", double1 == 1.3967916312027997d);
    }

    @Test
    public void test6214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6214");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-5L), (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test6215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6215");
        long long2 = org.apache.commons.math.util.FastMath.min(52L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test6216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6216");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.2778843899054422d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0648945134334458d + "'", double1 == 1.0648945134334458d);
    }

    @Test
    public void test6217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6217");
        double double1 = org.apache.commons.math.util.FastMath.abs(206762.68551422175d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 206762.68551422175d + "'", double1 == 206762.68551422175d);
    }

    @Test
    public void test6218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6218");
        double double1 = org.apache.commons.math.util.FastMath.atanh(100.0000000000002d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6219");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.994092364175252d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9970418066336296d + "'", double1 == 0.9970418066336296d);
    }

    @Test
    public void test6220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6220");
        long long1 = org.apache.commons.math.util.FastMath.round(0.5655390252410818d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test6221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6221");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.598966569616076d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6222");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.8950841726012685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6392632558071726d + "'", double1 == 0.6392632558071726d);
    }

    @Test
    public void test6223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6223");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.849516037404099d, 4.176086084439524d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5987759188525763d + "'", double2 == 0.5987759188525763d);
    }

    @Test
    public void test6224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6224");
        int int2 = org.apache.commons.math.util.FastMath.min(49, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test6225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6225");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.3788396218579066d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.14536475001366d + "'", double1 == 5.14536475001366d);
    }

    @Test
    public void test6226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6226");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.0588134251582075E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6543612251060553E-24d + "'", double1 == 1.6543612251060553E-24d);
    }

    @Test
    public void test6227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6227");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6228");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.3717797621305171d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.006488780941458852d) + "'", double1 == (-0.006488780941458852d));
    }

    @Test
    public void test6229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6229");
        double double2 = org.apache.commons.math.util.FastMath.atan2(7.091500380984786E248d, 1.5719165983462795d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test6230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6230");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 3, 83L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 83L + "'", long2 == 83L);
    }

    @Test
    public void test6231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6231");
        double double1 = org.apache.commons.math.util.FastMath.floor(4.810477380965351d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test6232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6232");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.44403286888919763d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4178805902828283d) + "'", double1 == (-0.4178805902828283d));
    }

    @Test
    public void test6233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6233");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.15480950261479168d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15419188287794433d + "'", double1 == 0.15419188287794433d);
    }

    @Test
    public void test6234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6234");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8143865674904548d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6191249712398811d + "'", double1 == 0.6191249712398811d);
    }

    @Test
    public void test6235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6235");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.2326176679819249d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6236");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.8554013581256903d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7753474587674877d + "'", double1 == 0.7753474587674877d);
    }

    @Test
    public void test6237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6237");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.5422402091037605d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.997695297953666d + "'", double1 == 0.997695297953666d);
    }

    @Test
    public void test6238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6238");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.0021573972886372176d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0021597261446224536d + "'", double1 == 0.0021597261446224536d);
    }

    @Test
    public void test6239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6239");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5209620005493156d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6240");
        double double1 = org.apache.commons.math.util.FastMath.log(5.564318773958797E35d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 82.30685281944005d + "'", double1 == 82.30685281944005d);
    }

    @Test
    public void test6241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6241");
        double double2 = org.apache.commons.math.util.FastMath.max(6.369992654280958d, 0.8721824073781502d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.369992654280958d + "'", double2 == 6.369992654280958d);
    }

    @Test
    public void test6242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6242");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 83L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test6243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6243");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-1.9911123324751505E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.9911123193187822E-4d) + "'", double1 == (-1.9911123193187822E-4d));
    }

    @Test
    public void test6244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6244");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.0149280275816273d, 0.020377724655755693d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5507210244087797d + "'", double2 == 1.5507210244087797d);
    }

    @Test
    public void test6245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6245");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9396792204180952d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5591603602565889d + "'", double1 == 1.5591603602565889d);
    }

    @Test
    public void test6246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6246");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-1.0626395431802995d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6197711425174752d + "'", double1 == 1.6197711425174752d);
    }

    @Test
    public void test6247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6247");
        long long2 = org.apache.commons.math.util.FastMath.min(1L, 5L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test6248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6248");
        float float1 = org.apache.commons.math.util.FastMath.abs(49.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 49.0f + "'", float1 == 49.0f);
    }

    @Test
    public void test6249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6249");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-1.5424779567514729E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5424779445183978E-4d) + "'", double1 == (-1.5424779445183978E-4d));
    }

    @Test
    public void test6250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6250");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.20637502874300212d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.20351781291274756d) + "'", double1 == (-0.20351781291274756d));
    }

    @Test
    public void test6251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6251");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.18425105161950944d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18425105161950947d + "'", double1 == 0.18425105161950947d);
    }

    @Test
    public void test6252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6252");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-1.7728390278240145d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6253");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.3669495678698107d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8324353015373301d + "'", double1 == 0.8324353015373301d);
    }

    @Test
    public void test6254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6254");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.03901079677802508d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03901079677802508d + "'", double1 == 0.03901079677802508d);
    }

    @Test
    public void test6255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6255");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 105, (float) 3);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 105.0f + "'", float2 == 105.0f);
    }

    @Test
    public void test6256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6256");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.0072966706191648d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8453909573373105d + "'", double1 == 0.8453909573373105d);
    }

    @Test
    public void test6257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6257");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) 32L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test6258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6258");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 0L, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test6259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6259");
        double double2 = org.apache.commons.math.util.FastMath.min(0.8657268681115803d, 0.8956160578519576d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8657268681115803d + "'", double2 == 0.8657268681115803d);
    }

    @Test
    public void test6260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6260");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 10, (long) 37);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test6261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6261");
        double double1 = org.apache.commons.math.util.FastMath.log1p(10.000000004122308d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.397895273173126d + "'", double1 == 2.397895273173126d);
    }

    @Test
    public void test6262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6262");
        double double2 = org.apache.commons.math.util.FastMath.atan2(52.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test6263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6263");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.13453038206307236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0090628681244609d + "'", double1 == 1.0090628681244609d);
    }

    @Test
    public void test6264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6264");
        float float2 = org.apache.commons.math.util.FastMath.min(2.0f, (float) 83);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test6265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6265");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(6.176458219595615E-4d, 0.47704875198110924d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.176458219595616E-4d + "'", double2 == 6.176458219595616E-4d);
    }

    @Test
    public void test6266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6266");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.9899924966004454d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017278628635716543d) + "'", double1 == (-0.017278628635716543d));
    }

    @Test
    public void test6267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6267");
        double double1 = org.apache.commons.math.util.FastMath.cos(9.306852821501208d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9930548847904904d) + "'", double1 == (-0.9930548847904904d));
    }

    @Test
    public void test6268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6268");
        float float2 = org.apache.commons.math.util.FastMath.min(9.223372E18f, (float) 52L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test6269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6269");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.11765201143093872d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11819941115277124d + "'", double1 == 0.11819941115277124d);
    }

    @Test
    public void test6270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6270");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.5737618316160398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027467325603916487d + "'", double1 == 0.027467325603916487d);
    }

    @Test
    public void test6271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6271");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8559497220918313d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1520853992999893d + "'", double1 == 1.1520853992999893d);
    }

    @Test
    public void test6272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6272");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.19068994544354323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test6273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6273");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.7503427504189538d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7314551939292051d + "'", double1 == 0.7314551939292051d);
    }

    @Test
    public void test6274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6274");
        double double1 = org.apache.commons.math.util.FastMath.floor(48.077009884937624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 48.0d + "'", double1 == 48.0d);
    }

    @Test
    public void test6275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6275");
        float float2 = org.apache.commons.math.util.FastMath.max(3.0f, (float) 51);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 51.0f + "'", float2 == 51.0f);
    }

    @Test
    public void test6276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6276");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.6563683817636521d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1828523477230036d) + "'", double1 == (-0.1828523477230036d));
    }

    @Test
    public void test6277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6277");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.11574532203027807d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11574532203027808d + "'", double1 == 0.11574532203027808d);
    }

    @Test
    public void test6278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6278");
        double double1 = org.apache.commons.math.util.FastMath.asin(36.99082568500844d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6279");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9599742401453463d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.611629197368077d + "'", double1 == 2.611629197368077d);
    }

    @Test
    public void test6280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6280");
        double double1 = org.apache.commons.math.util.FastMath.atan(7.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4288992721907328d + "'", double1 == 1.4288992721907328d);
    }

    @Test
    public void test6281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6281");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.20961661679872087d, (-0.9355520242262295d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.20961661679872085d + "'", double2 == 0.20961661679872085d);
    }

    @Test
    public void test6282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6282");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 2147483647L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.14748365E9f + "'", float1 == 2.14748365E9f);
    }

    @Test
    public void test6283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6283");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.7351801576829817d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.744863914535764d + "'", double1 == 0.744863914535764d);
    }

    @Test
    public void test6284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6284");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.0087993245951855E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6285");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, (long) 5);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test6286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6286");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.6286768505698068d), 661.9876068032265d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 661.9876068032265d + "'", double2 == 661.9876068032265d);
    }

    @Test
    public void test6287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6287");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.16299078079570548d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1644575701943076d) + "'", double1 == (-0.1644575701943076d));
    }

    @Test
    public void test6288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6288");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.028543951110762265d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.981859284110942E-4d) + "'", double1 == (-4.981859284110942E-4d));
    }

    @Test
    public void test6289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6289");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.24395830743395697d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23923103476797372d + "'", double1 == 0.23923103476797372d);
    }

    @Test
    public void test6290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6290");
        float float2 = org.apache.commons.math.util.FastMath.min(32.0f, (float) 49);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test6291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6291");
        long long1 = org.apache.commons.math.util.FastMath.round(2979.3805346802806d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2979L + "'", long1 == 2979L);
    }

    @Test
    public void test6292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6292");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9335211344483768d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8037200209710283d + "'", double1 == 0.8037200209710283d);
    }

    @Test
    public void test6293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6293");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.31939525110418027d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2734116922871087d) + "'", double1 == (-0.2734116922871087d));
    }

    @Test
    public void test6294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6294");
        long long2 = org.apache.commons.math.util.FastMath.max(105L, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 105L + "'", long2 == 105L);
    }

    @Test
    public void test6295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6295");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.1008050323661345d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6296");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.296331137721705d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6297");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.1748926318726323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6298");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5443307250557672d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6299");
        double double2 = org.apache.commons.math.util.FastMath.max((-1.5603171037625536d), 1.1015071856306502d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1015071856306502d + "'", double2 == 1.1015071856306502d);
    }

    @Test
    public void test6300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6300");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.6483608274590866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6947506487576603d + "'", double1 == 0.6947506487576603d);
    }

    @Test
    public void test6301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6301");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.5665394379443537d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6302");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.5063656411097466d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6303");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.4403028592460307d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6304");
        double double1 = org.apache.commons.math.util.FastMath.asin(8.417483164520446E-60d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.417483164520446E-60d + "'", double1 == 8.417483164520446E-60d);
    }

    @Test
    public void test6305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6305");
        int int2 = org.apache.commons.math.util.FastMath.min(51, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6306");
        double double1 = org.apache.commons.math.util.FastMath.tan(4.7614742956440415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-20.356327405966944d) + "'", double1 == (-20.356327405966944d));
    }

    @Test
    public void test6307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6307");
        double double1 = org.apache.commons.math.util.FastMath.floor(3.3180014821023565d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test6308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6308");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-7.47197233734299E-43d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3041051890457165E-44d) + "'", double1 == (-1.3041051890457165E-44d));
    }

    @Test
    public void test6309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6309");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.090716866767325d, 0.2708164357864931d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.32742569679141d + "'", double2 == 1.32742569679141d);
    }

    @Test
    public void test6310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6310");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.9960122203732343d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5438317534371175d) + "'", double1 == (-1.5438317534371175d));
    }

    @Test
    public void test6311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6311");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.5586683478888236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5881862714082574d + "'", double1 == 0.5881862714082574d);
    }

    @Test
    public void test6312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6312");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 6559, (long) 2005);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6559L + "'", long2 == 6559L);
    }

    @Test
    public void test6313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6313");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.2737367544325796E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2737367544325796E-13d + "'", double1 == 2.2737367544325796E-13d);
    }

    @Test
    public void test6314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6314");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.0078125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000305177333457d + "'", double1 == 1.0000305177333457d);
    }

    @Test
    public void test6315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6315");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.0211777813928616d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.021180948028153138d + "'", double1 == 0.021180948028153138d);
    }

    @Test
    public void test6316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6316");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.9999192657925324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6317");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.791759469228055d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.45174640302101d) + "'", double1 == (-4.45174640302101d));
    }

    @Test
    public void test6318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6318");
        double double1 = org.apache.commons.math.util.FastMath.floor(10.000000004122308d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test6319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6319");
        long long1 = org.apache.commons.math.util.FastMath.round(0.4623267743738125d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test6320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6320");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.3025850929940463d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3205004784536853d + "'", double1 == 1.3205004784536853d);
    }

    @Test
    public void test6321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6321");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.7420423771974395d), 0.9882281837083275d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9882281837083275d + "'", double2 == 0.9882281837083275d);
    }

    @Test
    public void test6322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6322");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 9.673068691247645E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test6323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6323");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.7616718053900854d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6324");
        int int2 = org.apache.commons.math.util.FastMath.min(52, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test6325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6325");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.6731224799838768d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5146916291180931d + "'", double1 == 0.5146916291180931d);
    }

    @Test
    public void test6326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6326");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.2940397999592368d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2940397999592368d + "'", double1 == 1.2940397999592368d);
    }

    @Test
    public void test6327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6327");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 5, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test6328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6328");
        double double1 = org.apache.commons.math.util.FastMath.ceil(7.028730419947964d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.0d + "'", double1 == 8.0d);
    }

    @Test
    public void test6329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6329");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.2860799720538746d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test6330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6330");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6331");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.010308913146243284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.217639453589928d + "'", double1 == 0.217639453589928d);
    }

    @Test
    public void test6332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6332");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.024913294410754103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.024913294410754103d + "'", double1 == 0.024913294410754103d);
    }

    @Test
    public void test6333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6333");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.0020173301013517594d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0020193662807058d + "'", double1 == 1.0020193662807058d);
    }

    @Test
    public void test6334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6334");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.7305151979037297d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7305151979037297d + "'", double1 == 0.7305151979037297d);
    }

    @Test
    public void test6335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6335");
        float float2 = org.apache.commons.math.util.FastMath.max(105.0f, 9.223372E18f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test6336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6336");
        double double2 = org.apache.commons.math.util.FastMath.atan2(5.267831587699267d, 2005.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.002627341379824885d + "'", double2 == 0.002627341379824885d);
    }

    @Test
    public void test6337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6337");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.04488451981553791d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0448694504574604d + "'", double1 == 0.0448694504574604d);
    }

    @Test
    public void test6338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6338");
        double double1 = org.apache.commons.math.util.FastMath.exp(99.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6881171418160975E43d + "'", double1 == 2.6881171418160975E43d);
    }

    @Test
    public void test6339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6339");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.0928900516588147d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.045413818379504d + "'", double1 == 1.045413818379504d);
    }

    @Test
    public void test6340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6340");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.40205067186377547d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4020506718637754d) + "'", double1 == (-0.4020506718637754d));
    }

    @Test
    public void test6341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6341");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.5422402091037605d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5422402091037606d + "'", double1 == 0.5422402091037606d);
    }

    @Test
    public void test6342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6342");
        double double1 = org.apache.commons.math.util.FastMath.floor(21.45336887641879d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 21.0d + "'", double1 == 21.0d);
    }

    @Test
    public void test6343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6343");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.606759086334487d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.010589943822929332d + "'", double1 == 0.010589943822929332d);
    }

    @Test
    public void test6344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6344");
        double double1 = org.apache.commons.math.util.FastMath.sin(9.079986118564083E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.079986106087252E-5d + "'", double1 == 9.079986106087252E-5d);
    }

    @Test
    public void test6345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6345");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.6929693744344998d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6346");
        double double1 = org.apache.commons.math.util.FastMath.log(0.1411200080598672d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.958144629610086d) + "'", double1 == (-1.958144629610086d));
    }

    @Test
    public void test6347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6347");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.7319773776434012d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8984848612879983d + "'", double1 == 0.8984848612879983d);
    }

    @Test
    public void test6348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6348");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.4451963704655766d, (-5.0500272064426E9d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test6349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6349");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9734612034524097d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6797889571752663d + "'", double1 == 0.6797889571752663d);
    }

    @Test
    public void test6350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6350");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.0103622330573048d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8470244465913828d + "'", double1 == 0.8470244465913828d);
    }

    @Test
    public void test6351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6351");
        int int2 = org.apache.commons.math.util.FastMath.max(1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test6352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6352");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.8811250880125626d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 50.484748766213045d + "'", double1 == 50.484748766213045d);
    }

    @Test
    public void test6353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6353");
        int int2 = org.apache.commons.math.util.FastMath.min(3, 6559);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test6354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6354");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.00999245790494023d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.009992125345170985d) + "'", double1 == (-0.009992125345170985d));
    }

    @Test
    public void test6355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6355");
        double double1 = org.apache.commons.math.util.FastMath.log(2.504654289280179d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9181507167414247d + "'", double1 == 0.9181507167414247d);
    }

    @Test
    public void test6356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6356");
        double double1 = org.apache.commons.math.util.FastMath.signum((-38.816242111356935d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test6357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6357");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 5L, 35.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test6358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6358");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.9280435760521517d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test6359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6359");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.6199770987338742d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6199770987338742d + "'", double1 == 0.6199770987338742d);
    }

    @Test
    public void test6360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6360");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.7452953479050968d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 21.148938145819436d + "'", double1 == 21.148938145819436d);
    }

    @Test
    public void test6361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6361");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.167375502789719d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06721057546131326d + "'", double1 == 0.06721057546131326d);
    }

    @Test
    public void test6362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6362");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.2325241103312965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test6363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6363");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 1, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test6364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6364");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.4633067985287282d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6335167458382318d + "'", double1 == 1.6335167458382318d);
    }

    @Test
    public void test6365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6365");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.0211777813928616d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6366");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.0149280275816273d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5276810693514821d + "'", double1 == 0.5276810693514821d);
    }

    @Test
    public void test6367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6367");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(4.785000857347075d, 0.6407835429487976d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.785000857347074d + "'", double2 == 4.785000857347074d);
    }

    @Test
    public void test6368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6368");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.273736754432579E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2737367544323206E-13d + "'", double1 == 2.2737367544323206E-13d);
    }

    @Test
    public void test6369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6369");
        double double1 = org.apache.commons.math.util.FastMath.asinh(42.81354925721529d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.450138165019805d + "'", double1 == 4.450138165019805d);
    }

    @Test
    public void test6370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6370");
        double double1 = org.apache.commons.math.util.FastMath.signum(89.2328896037985d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6371");
        double double1 = org.apache.commons.math.util.FastMath.floor(12.238292298814303d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.0d + "'", double1 == 12.0d);
    }

    @Test
    public void test6372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6372");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.3254103039381046d, 1.5707963267948957d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.17144660033660744d + "'", double2 == 0.17144660033660744d);
    }

    @Test
    public void test6373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6373");
        double double2 = org.apache.commons.math.util.FastMath.max(0.2326176679819249d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2326176679819249d + "'", double2 == 0.2326176679819249d);
    }

    @Test
    public void test6374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6374");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.5612728052012839d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test6375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6375");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.3758756549624582d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.76043148711341d + "'", double1 == 10.76043148711341d);
    }

    @Test
    public void test6376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6376");
        double double1 = org.apache.commons.math.util.FastMath.ceil(4.450138165019805d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test6377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6377");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.385849999980594d, 0.8058302155599485d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3858499999805938d + "'", double2 == 1.3858499999805938d);
    }

    @Test
    public void test6378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6378");
        double double1 = org.apache.commons.math.util.FastMath.sin(7.370686677641594d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8854685683825531d + "'", double1 == 0.8854685683825531d);
    }

    @Test
    public void test6379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6379");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9030746578456205d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test6380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6380");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.663368930684795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8878137708151884d) + "'", double1 == (-0.8878137708151884d));
    }

    @Test
    public void test6381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6381");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.3796077390275217d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test6382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6382");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 51, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 51L + "'", long2 == 51L);
    }

    @Test
    public void test6383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6383");
        double double2 = org.apache.commons.math.util.FastMath.max(0.6367066872377056d, (-0.11975712045798752d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6367066872377056d + "'", double2 == 0.6367066872377056d);
    }

    @Test
    public void test6384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6384");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test6385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6385");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) (-5L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.0d) + "'", double1 == (-5.0d));
    }

    @Test
    public void test6386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6386");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.4596132072859689d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.42976891224036634d + "'", double1 == 0.42976891224036634d);
    }

    @Test
    public void test6387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6387");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.0609297062414165d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8890557142011084d + "'", double1 == 2.8890557142011084d);
    }

    @Test
    public void test6388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6388");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.5707551013101344d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.810279070791128d + "'", double1 == 4.810279070791128d);
    }

    @Test
    public void test6389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6389");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.47241994041774293d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4920344106948838d + "'", double1 == 0.4920344106948838d);
    }

    @Test
    public void test6390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6390");
        long long1 = org.apache.commons.math.util.FastMath.round(1.000140801872929d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test6391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6391");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 1, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test6392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6392");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.2739449866281343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6393");
        double double1 = org.apache.commons.math.util.FastMath.acos((-10.992355853476756d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6394");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.9925591367766533d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9123687177766382d + "'", double1 == 0.9123687177766382d);
    }

    @Test
    public void test6395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6395");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.0800937412236662d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7932338570435191d + "'", double1 == 0.7932338570435191d);
    }

    @Test
    public void test6396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6396");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.642227864217147d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test6397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6397");
        double double2 = org.apache.commons.math.util.FastMath.pow((-24.533059822774465d), 36.99082568500844d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test6398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6398");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.1624473515095703d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6399");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(198.99999999999997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11401.86012310338d + "'", double1 == 11401.86012310338d);
    }

    @Test
    public void test6400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6400");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test6401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6401");
        long long1 = org.apache.commons.math.util.FastMath.round(0.01537239550868527d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test6402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6402");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.2581930243950237d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.519056888809403d + "'", double1 == 2.519056888809403d);
    }

    @Test
    public void test6403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6403");
        int int2 = org.apache.commons.math.util.FastMath.max(97, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test6404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6404");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7314551939292051d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8204535763759429d + "'", double1 == 0.8204535763759429d);
    }

    @Test
    public void test6405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6405");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 10, 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test6406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6406");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9030746578456205d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4362493519873452d + "'", double1 == 1.4362493519873452d);
    }

    @Test
    public void test6407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6407");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.5068676300960874d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7119463674295188d + "'", double1 == 0.7119463674295188d);
    }

    @Test
    public void test6408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6408");
        double double1 = org.apache.commons.math.util.FastMath.log10((-24.53305982277447d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6409");
        int int2 = org.apache.commons.math.util.FastMath.max(3, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test6410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6410");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.9943400969063074d, 4.466413831809194d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 21.828675629485357d + "'", double2 == 21.828675629485357d);
    }

    @Test
    public void test6411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6411");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.5155089546197845d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4759776534963569d + "'", double1 == 0.4759776534963569d);
    }

    @Test
    public void test6412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6412");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.19185280219404077d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6413");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) (short) 1, 1.5706591026530312d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test6414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6414");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9557606135662686d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6006479189181169d + "'", double1 == 1.6006479189181169d);
    }

    @Test
    public void test6415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6415");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.6268147226219475d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6268147226219475d + "'", double1 == 0.6268147226219475d);
    }

    @Test
    public void test6416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6416");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.703333949748545d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3051183661831385d + "'", double1 == 1.3051183661831385d);
    }

    @Test
    public void test6417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6417");
        float float2 = org.apache.commons.math.util.FastMath.min(49.0f, (float) 36);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 36.0f + "'", float2 == 36.0f);
    }

    @Test
    public void test6418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6418");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.297283862524131d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6419");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(34.999999999999886d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2005.3522829578746d + "'", double1 == 2005.3522829578746d);
    }

    @Test
    public void test6420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6420");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.08037538236017182d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.080289092775048d + "'", double1 == 0.080289092775048d);
    }

    @Test
    public void test6421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6421");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.4122900538217174d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9546748667869766d + "'", double1 == 0.9546748667869766d);
    }

    @Test
    public void test6422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6422");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.6576913458149568d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7177498730544969d + "'", double1 == 0.7177498730544969d);
    }

    @Test
    public void test6423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6423");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.1349395210236586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1341264194469235d + "'", double1 == 0.1341264194469235d);
    }

    @Test
    public void test6424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6424");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.5321993930593862d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6425");
        double double2 = org.apache.commons.math.util.FastMath.atan2(3.138288992714996d, 4.3531453422859885d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6246316300492014d + "'", double2 == 0.6246316300492014d);
    }

    @Test
    public void test6426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6426");
        float float2 = org.apache.commons.math.util.FastMath.max(3.0f, 5.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test6427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6427");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) 36.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6283185307179586d + "'", double1 == 0.6283185307179586d);
    }

    @Test
    public void test6428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6428");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.5039575531546748d), 0.1884117453587528d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1884117453587528d + "'", double2 == 0.1884117453587528d);
    }

    @Test
    public void test6429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6429");
        long long1 = org.apache.commons.math.util.FastMath.round(0.3815006871452329d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test6430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6430");
        double double1 = org.apache.commons.math.util.FastMath.signum(572.9577951308232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6431");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.12328149982556645d), 1.7009464435335946d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test6432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6432");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.6341601637191014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6775286413946284d + "'", double1 == 0.6775286413946284d);
    }

    @Test
    public void test6433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6433");
        double double1 = org.apache.commons.math.util.FastMath.log1p(5.493423335506387d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8707898701544898d + "'", double1 == 1.8707898701544898d);
    }

    @Test
    public void test6434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6434");
        double double1 = org.apache.commons.math.util.FastMath.tan((-1.0824640400314665d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.882360502503538d) + "'", double1 == (-1.882360502503538d));
    }

    @Test
    public void test6435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6435");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.6929693744344998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9906444414790561d + "'", double1 == 0.9906444414790561d);
    }

    @Test
    public void test6436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6436");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.02464661606873139d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.024651608464124265d + "'", double1 == 0.024651608464124265d);
    }

    @Test
    public void test6437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6437");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-1.9911123193187822E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000198226413d + "'", double1 == 1.0000000198226413d);
    }

    @Test
    public void test6438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6438");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.038991025401791155d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03897127805768254d + "'", double1 == 0.03897127805768254d);
    }

    @Test
    public void test6439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6439");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.3923993423012373d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.40627172921049576d) + "'", double1 == (-0.40627172921049576d));
    }

    @Test
    public void test6440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6440");
        double double2 = org.apache.commons.math.util.FastMath.atan2(8.587340256999986E9d, 0.7483443290970896d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267077516d + "'", double2 == 1.5707963267077516d);
    }

    @Test
    public void test6441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6441");
        double double2 = org.apache.commons.math.util.FastMath.max((-1.0697079433475818d), 1202604.2841647768d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1202604.2841647768d + "'", double2 == 1202604.2841647768d);
    }

    @Test
    public void test6442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6442");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.1189396031849521d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8414709848078964d + "'", double1 == 0.8414709848078964d);
    }

    @Test
    public void test6443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6443");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.804303050943432d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6773592518177712d + "'", double1 == 0.6773592518177712d);
    }

    @Test
    public void test6444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6444");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.45151387510561236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4670123098920739d + "'", double1 == 0.4670123098920739d);
    }

    @Test
    public void test6445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6445");
        double double1 = org.apache.commons.math.util.FastMath.expm1(53.229380982910065d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3098646929407478E23d + "'", double1 == 1.3098646929407478E23d);
    }

    @Test
    public void test6446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6446");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.005034820724142851d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005034820724142851d + "'", double1 == 0.005034820724142851d);
    }

    @Test
    public void test6447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6447");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9998000199980001d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test6448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6448");
        double double1 = org.apache.commons.math.util.FastMath.sin(370.9546370761337d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24420903982029665d + "'", double1 == 0.24420903982029665d);
    }

    @Test
    public void test6449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6449");
        double double1 = org.apache.commons.math.util.FastMath.log(1.120541818054245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11381233444976029d + "'", double1 == 0.11381233444976029d);
    }

    @Test
    public void test6450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6450");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.6360896066027169d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6798604961248779d + "'", double1 == 0.6798604961248779d);
    }

    @Test
    public void test6451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6451");
        double double1 = org.apache.commons.math.util.FastMath.floor(31.99188518905606d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.0d + "'", double1 == 31.0d);
    }

    @Test
    public void test6452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6452");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(47.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8203047484373349d + "'", double1 == 0.8203047484373349d);
    }

    @Test
    public void test6453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6453");
        int int2 = org.apache.commons.math.util.FastMath.min(2005, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test6454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6454");
        double double1 = org.apache.commons.math.util.FastMath.atan(1965.6378749304042d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.570287586132905d + "'", double1 == 1.570287586132905d);
    }

    @Test
    public void test6455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6455");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.1760939939322343d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6456");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.3208591316625293d, 0.6775286413946284d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.207490554722237d + "'", double2 == 1.207490554722237d);
    }

    @Test
    public void test6457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6457");
        int int2 = org.apache.commons.math.util.FastMath.max(5, (-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test6458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6458");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2005.3522829578812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test6459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6459");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.7079512070864725d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6502786776183651d + "'", double1 == 0.6502786776183651d);
    }

    @Test
    public void test6460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6460");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.5006478239302304d, 6558.851092551817d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5006478239302306d + "'", double2 == 0.5006478239302306d);
    }

    @Test
    public void test6461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6461");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.2599210498948732d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10034333188799374d + "'", double1 == 0.10034333188799374d);
    }

    @Test
    public void test6462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6462");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.8657694832396586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6463");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8657268681115803d, 1.1760939939322341d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8657268681115804d + "'", double2 == 0.8657268681115804d);
    }

    @Test
    public void test6464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6464");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9046530420463418d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.951132504988838d + "'", double1 == 0.951132504988838d);
    }

    @Test
    public void test6465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6465");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.6033526819225967d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6466");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.5297358172636923d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6467");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9931536250913602d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6997350136230507d + "'", double1 == 2.6997350136230507d);
    }

    @Test
    public void test6468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6468");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.1828523477230036d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0031913755127679693d) + "'", double1 == (-0.0031913755127679693d));
    }
}

