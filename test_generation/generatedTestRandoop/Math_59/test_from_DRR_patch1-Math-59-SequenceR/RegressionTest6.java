import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) ' ');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 32L + "'", long1 == 32L);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.0149280275816275d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7677926132124685d + "'", double1 == 0.7677926132124685d);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.403648339910223d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.020183597142925d + "'", double1 == 15.020183597142925d);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.011032585021104841d), 5.691758600279624d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.011032585021104841d) + "'", double2 == (-0.011032585021104841d));
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.5206130698160022d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4995723020409742d + "'", double1 == 0.4995723020409742d);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.017284521648775933d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01728624313179109d + "'", double1 == 0.01728624313179109d);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.7763568394002505E-15d, 1.2519457609704083d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4188768353857124E-15d + "'", double2 == 1.4188768353857124E-15d);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.634578497998064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        int int2 = org.apache.commons.math.util.FastMath.min(3, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        double double2 = org.apache.commons.math.util.FastMath.min((-6.128666380978778d), 0.7340722322122621d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-6.128666380978778d) + "'", double2 == (-6.128666380978778d));
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        int int2 = org.apache.commons.math.util.FastMath.min(100, 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        int int2 = org.apache.commons.math.util.FastMath.max(53, (-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9903210539364167d, (-0.5162631492122485d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9903210539364166d + "'", double2 == 0.9903210539364166d);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        double double1 = org.apache.commons.math.util.FastMath.log(Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.1938614780827772d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8735346502596506d + "'", double1 == 0.8735346502596506d);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 5, (-2L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.5127742681331149d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.41394522878666795d + "'", double1 == 0.41394522878666795d);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        double double1 = org.apache.commons.math.util.FastMath.floor(7.2638973976934564E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.2638973976934564E18d + "'", double1 == 7.2638973976934564E18d);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2L, (float) (-53));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        double double1 = org.apache.commons.math.util.FastMath.exp(22026.465794806718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.263830819196742d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.2347857777188793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5733724749885676d + "'", double1 == 1.5733724749885676d);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.2204460492503128E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2204460492503128E-16d + "'", double1 == 2.2204460492503128E-16d);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.1092738450937532d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.3300895400924683d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.3235780930645504d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8431082790768843d + "'", double1 == 0.8431082790768843d);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        double double1 = org.apache.commons.math.util.FastMath.acosh(248.5313787931064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.208712243496336d + "'", double1 == 6.208712243496336d);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        double double1 = org.apache.commons.math.util.FastMath.floor(192.21311052213548d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 192.0d + "'", double1 == 192.0d);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(6.896181061029328d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6260580840928345d + "'", double1 == 2.6260580840928345d);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 100, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.40859244341429657d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 4, 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.22665386569399096d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2228507766040782d + "'", double1 == 0.2228507766040782d);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.761594155955765d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9132181497465549d + "'", double1 == 0.9132181497465549d);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        float float2 = org.apache.commons.math.util.FastMath.max(53.0f, (float) (-3));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 53.0f + "'", float2 == 53.0f);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.159705192572887d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5579004906280911d + "'", double1 == 0.5579004906280911d);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9950915100179343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9950915100179344d + "'", double1 == 0.9950915100179344d);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.06254420428363117d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.25008839294063845d + "'", double1 == 0.25008839294063845d);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        double double1 = org.apache.commons.math.util.FastMath.cos(11013.232874703393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.37076031045626007d + "'", double1 == 0.37076031045626007d);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.0145592787614723d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.007253333954012d + "'", double1 == 1.007253333954012d);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.542740246052261d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.5748946607304181d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        float float1 = org.apache.commons.math.util.FastMath.abs(2.14748365E9f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.14748365E9f + "'", float1 == 2.14748365E9f);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        long long1 = org.apache.commons.math.util.FastMath.abs((-1L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.46096535893150964d), 28.4764116085372d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.4609653589315096d) + "'", double2 == (-0.4609653589315096d));
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        double double2 = org.apache.commons.math.util.FastMath.min(0.05709087716385303d, 4.716325081321902d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.05709087716385303d + "'", double2 == 0.05709087716385303d);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 0, (float) 57);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        double double1 = org.apache.commons.math.util.FastMath.tanh(8.205696208681136d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999998508398553d + "'", double1 == 0.9999998508398553d);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-1.055287372175112d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.651907619133025d) + "'", double1 == (-0.651907619133025d));
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.013388202148675738d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013388602139994326d + "'", double1 == 0.013388602139994326d);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-1.219022125506721d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.508377516798939d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        double double1 = org.apache.commons.math.util.FastMath.floor(7.2638973976934574E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.2638973976934574E18d + "'", double1 == 7.2638973976934574E18d);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.2976534827417238d, 0.901922893385097d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2976534827417239d + "'", double2 == 0.2976534827417239d);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.11886886458581854d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.810684256279498d) + "'", double1 == (-6.810684256279498d));
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.5127742681331149d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5127742681331149d + "'", double1 == 0.5127742681331149d);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.9649955887750582d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.352281190436129d) + "'", double1 == (-3.352281190436129d));
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) 32);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.0d + "'", double1 == 32.0d);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.11943352419502769d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.843036868748689d) + "'", double1 == (-6.843036868748689d));
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.0232274785475506d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        double double1 = org.apache.commons.math.util.FastMath.ulp(57.29577951308242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 5);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.0054349534891949d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(74.20321057778875d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4251.530792427802d + "'", double1 == 4251.530792427802d);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.309274745959981d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9659976907478611d + "'", double1 == 0.9659976907478611d);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        double double2 = org.apache.commons.math.util.FastMath.atan2(3.9481480091340625E13d, 0.6795226183513794d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948795d + "'", double2 == 1.5707963267948795d);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        int int2 = org.apache.commons.math.util.FastMath.max(53, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.2592664089300267d, 1.387778780781446E-17d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.38415859170297456d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4683782958316801d + "'", double1 == 0.4683782958316801d);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.15529712916720415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.05375489702567273d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05372904237133229d + "'", double1 == 0.05372904237133229d);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        double double1 = org.apache.commons.math.util.FastMath.log1p(4.041914824263686d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6177859353790225d + "'", double1 == 1.6177859353790225d);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.060496865085628314d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.062364267144095646d + "'", double1 == 0.062364267144095646d);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.36945265746442124d), 0.3019079198404987d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3019079198404987d + "'", double2 == 0.3019079198404987d);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        long long1 = org.apache.commons.math.util.FastMath.round(1.5302764730926062d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        double double2 = org.apache.commons.math.util.FastMath.max(0.8539880479975237d, (-0.11943352419502769d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8539880479975237d + "'", double2 == 0.8539880479975237d);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        long long2 = org.apache.commons.math.util.FastMath.max(9223372036854775807L, 39481480091340L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 2.3288870502122705E12d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.0009877980461306d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        double double1 = org.apache.commons.math.util.FastMath.asin(4.967145917811647d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        double double2 = org.apache.commons.math.util.FastMath.max((double) 2L, 0.060423223162373904d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0d + "'", double2 == 2.0d);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        int int2 = org.apache.commons.math.util.FastMath.max(57, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.7468039524918473d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9410106931720924d + "'", double1 == 0.9410106931720924d);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.5740524125174076d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.9936266556409077d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 114.22639329300515d + "'", double1 == 114.22639329300515d);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        double double1 = org.apache.commons.math.util.FastMath.acosh(4.158638853279167d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.103555437009692d + "'", double1 == 2.103555437009692d);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.9209970573119075d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7090924659923779d + "'", double1 == 1.7090924659923779d);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.7813863964118539d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.01883280792598242d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.018831694692450707d) + "'", double1 == (-0.018831694692450707d));
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        double double1 = org.apache.commons.math.util.FastMath.tan(113.90634361049858d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0483708557630074d + "'", double1 == 1.0483708557630074d);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        double double1 = org.apache.commons.math.util.FastMath.asin(7.77037274892726E13d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (-53));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 53.0f + "'", float1 == 53.0f);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        double double1 = org.apache.commons.math.util.FastMath.sin((-36.7368005696771d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8205149405557769d + "'", double1 == 0.8205149405557769d);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.8564300092625501d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6944137478171459d + "'", double1 == 0.6944137478171459d);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9816339318384565d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        int int2 = org.apache.commons.math.util.FastMath.min((-53), 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-53) + "'", int2 == (-53));
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        double double1 = org.apache.commons.math.util.FastMath.exp((-1.1531011997348775d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.31565633655857495d + "'", double1 == 0.31565633655857495d);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.141928933339286d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        double double1 = org.apache.commons.math.util.FastMath.tan((-2.980984492908097d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1620035212715816d + "'", double1 == 0.1620035212715816d);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.709975946676697d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.854849316209146d + "'", double1 == 2.854849316209146d);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        int int1 = org.apache.commons.math.util.FastMath.abs((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        double double1 = org.apache.commons.math.util.FastMath.log(0.5013507798060323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6904492636009615d) + "'", double1 == (-0.6904492636009615d));
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.21348878684812134d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        int int2 = org.apache.commons.math.util.FastMath.max(53, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.0000000000000004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.000000000000001d + "'", double1 == 2.000000000000001d);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9425687912622992d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        double double2 = org.apache.commons.math.util.FastMath.atan2(9.223372036854776E18d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        double double1 = org.apache.commons.math.util.FastMath.expm1(114.22639329300515d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.054079817020544E49d + "'", double1 == 4.054079817020544E49d);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.5063656411097343d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7970546072131296d) + "'", double1 == (-0.7970546072131296d));
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.651907619133025d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5729527623083676d) + "'", double1 == (-0.5729527623083676d));
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 32);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 32L + "'", long1 == 32L);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 2147483647);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-3.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.9999999999999996d) + "'", double1 == (-2.9999999999999996d));
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.570054860258358d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 89.95751709680616d + "'", double1 == 89.95751709680616d);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.842859999667966E24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.842859999667966E24d + "'", double1 == 2.842859999667966E24d);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.1924023244417261d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9815477015624721d + "'", double1 == 0.9815477015624721d);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.881373587019543d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7224284372420833d + "'", double1 == 0.7224284372420833d);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(89.95751709680616d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.480699513047791d + "'", double1 == 4.480699513047791d);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        double double1 = org.apache.commons.math.util.FastMath.sinh(62.945847461890764d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0864361697580084E27d + "'", double1 == 1.0864361697580084E27d);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        int int2 = org.apache.commons.math.util.FastMath.max(2, 57);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57 + "'", int2 == 57);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.012408001278103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 58.00670561851055d + "'", double1 == 58.00670561851055d);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        float float2 = org.apache.commons.math.util.FastMath.min(2.14748365E9f, (float) 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 28L, (float) 97L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        double double1 = org.apache.commons.math.util.FastMath.floor(34.982780458176066d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 34.0d + "'", double1 == 34.0d);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.6569847686310842d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7712847557374057d + "'", double1 == 0.7712847557374057d);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.02984471039941535d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.029840280115945614d + "'", double1 == 0.029840280115945614d);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        double double1 = org.apache.commons.math.util.FastMath.abs(57.974985279021965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.974985279021965d + "'", double1 == 57.974985279021965d);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.4288764780867376d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        long long2 = org.apache.commons.math.util.FastMath.min((long) ' ', 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 57L, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        double double1 = org.apache.commons.math.util.FastMath.abs(4.718578581151767d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.718578581151767d + "'", double1 == 4.718578581151767d);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-1.5707963267948963d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        long long2 = org.apache.commons.math.util.FastMath.max((long) '#', (long) 4);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        double double1 = org.apache.commons.math.util.FastMath.asin(57.29577951308242d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        double double1 = org.apache.commons.math.util.FastMath.abs(97.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.0003046638203843d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1756713690335514d + "'", double1 == 1.1756713690335514d);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9980845732903538d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.172247689798102d + "'", double1 == 1.172247689798102d);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.4472512595643944d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4324887986615609d) + "'", double1 == (-0.4324887986615609d));
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7235232133665007d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6190869198926165d + "'", double1 == 0.6190869198926165d);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) (-3L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4422495703074083d) + "'", double1 == (-1.4422495703074083d));
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.248867972642223d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.06057085833608861d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0010571609087238003d + "'", double1 == 0.0010571609087238003d);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 2147483647L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        double double1 = org.apache.commons.math.util.FastMath.rint(72.50483309958452d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 73.0d + "'", double1 == 73.0d);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.723044407228643d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.882468649088755d + "'", double1 == 0.882468649088755d);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7813863964118539d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.653501741449947d + "'", double1 == 0.653501741449947d);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        double double1 = org.apache.commons.math.util.FastMath.abs(192.2171757448326d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 192.2171757448326d + "'", double1 == 192.2171757448326d);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.9251475365964138d), 0.5037324957145496d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9251475365964137d) + "'", double2 == (-0.9251475365964137d));
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        double double1 = org.apache.commons.math.util.FastMath.log(1.9729356641053681d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6795226183513794d + "'", double1 == 0.6795226183513794d);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.6921231068842162d, (-0.6904492636009615d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.695471478541913d + "'", double2 == 0.695471478541913d);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        double double1 = org.apache.commons.math.util.FastMath.ceil(8.205696208681136d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.0d + "'", double1 == 9.0d);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        float float1 = org.apache.commons.math.util.FastMath.abs(53.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 53.0f + "'", float1 == 53.0f);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        double double1 = org.apache.commons.math.util.FastMath.log(5.916079783099616d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7776740307447068d + "'", double1 == 1.7776740307447068d);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.7708231552724154d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8801322811985435d) + "'", double1 == (-0.8801322811985435d));
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) '4');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 52.0f + "'", float1 == 52.0f);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        double double2 = org.apache.commons.math.util.FastMath.min(1.416347758287445d, 0.9067423244966043d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9067423244966043d + "'", double2 == 0.9067423244966043d);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        double double1 = org.apache.commons.math.util.FastMath.tan(199.0049998750063d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8923911571889502d + "'", double1 == 1.8923911571889502d);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) (-3L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9950547536867305d) + "'", double1 == (-0.9950547536867305d));
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        double double1 = org.apache.commons.math.util.FastMath.log(2.8353789697787954d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0421756036529368d + "'", double1 == 1.0421756036529368d);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.8643238493907622d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        double double2 = org.apache.commons.math.util.FastMath.max(1.3574158419544757d, (double) 601302L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 601302.0d + "'", double2 == 601302.0d);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.9982229502979694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.989740156313126d) + "'", double1 == (-0.989740156313126d));
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.6027624231806457d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6974747010141326d) + "'", double1 == (-0.6974747010141326d));
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.06981317007977318d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.009430054193516505d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 2147483647, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.1217719640679913d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9171473774587547d, (-100.30909595621492d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-100.30909595621492d) + "'", double2 == (-100.30909595621492d));
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        double double1 = org.apache.commons.math.util.FastMath.atanh(3.4683328494106918d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        int int2 = org.apache.commons.math.util.FastMath.max(5, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.7740840138843887d, 0.04341821200278071d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5147652438503667d + "'", double2 == 1.5147652438503667d);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.57108749076139d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.4190581615792427d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.41905816157924275d + "'", double1 == 0.41905816157924275d);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9946861854499426d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.877611156728114d + "'", double1 == 0.877611156728114d);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        double double1 = org.apache.commons.math.util.FastMath.ceil(32.07371813130684d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 33.0d + "'", double1 == 33.0d);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2147483647L, (float) 53);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 53.0f + "'", float2 == 53.0f);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) '#', (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.33667481938672716d + "'", double2 == 0.33667481938672716d);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.09966865249116186d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.001441413311334d) + "'", double1 == (-1.001441413311334d));
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.3796077390275217d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.1756713690335514d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8260817927395347d + "'", double1 == 0.8260817927395347d);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.1102230246251565E-16d, 90.01446758943851d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2333828709502029E-18d + "'", double2 == 1.2333828709502029E-18d);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        double double2 = org.apache.commons.math.util.FastMath.min(27.935504743358095d, (-36.04365338911715d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-36.04365338911715d) + "'", double2 == (-36.04365338911715d));
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '4', (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(5.551115123125783E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.688523605579533E-19d + "'", double1 == 9.688523605579533E-19d);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.7853981633974483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1932800507380152d + "'", double1 == 2.1932800507380152d);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.986213958420301d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-1.3740813228449729d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.023982243273803952d) + "'", double1 == (-0.023982243273803952d));
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.4324887986615609d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.43248879866156087d) + "'", double1 == (-0.43248879866156087d));
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.6884941597894443d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6029621121886053d + "'", double1 == 0.6029621121886053d);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.007402863214769922d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000027401317026d + "'", double1 == 1.000027401317026d);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        double double2 = org.apache.commons.math.util.FastMath.min(2.155615773557597E15d, 0.21348878684812134d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.21348878684812134d + "'", double2 == 0.21348878684812134d);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.0000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5403023058681395d + "'", double1 == 0.5403023058681395d);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        double double1 = org.apache.commons.math.util.FastMath.tanh(6.208712243496336d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999919051407145d + "'", double1 == 0.9999919051407145d);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        int int2 = org.apache.commons.math.util.FastMath.min(57, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 57, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.4711276743037347d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.35414242816297d + "'", double1 == 4.35414242816297d);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.034970039544609526d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.03497716747869283d) + "'", double1 == (-0.03497716747869283d));
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        double double1 = org.apache.commons.math.util.FastMath.log((-28.268076694535583d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.07609566151369249d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07616912206432258d + "'", double1 == 0.07616912206432258d);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.7311284168939934d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8550604755770164d + "'", double1 == 0.8550604755770164d);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.7245451197632213d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7245451197632213d + "'", double1 == 0.7245451197632213d);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        long long2 = org.apache.commons.math.util.FastMath.max(1477896L, (long) 5);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1477896L + "'", long2 == 1477896L);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        double double1 = org.apache.commons.math.util.FastMath.signum(104.94395132690269d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-15.942385152878742d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.024068905282849447d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.024066581448410507d + "'", double1 == 0.024066581448410507d);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-53L), (-53.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-53.0f) + "'", float2 == (-53.0f));
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9139954154840256d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9704682670117347d + "'", double1 == 0.9704682670117347d);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.45593812776599624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.2210278799953218d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21749753606973166d + "'", double1 == 0.21749753606973166d);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.9999999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4161468365471422d) + "'", double1 == (-0.4161468365471422d));
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.1938614780827772d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        double double1 = org.apache.commons.math.util.FastMath.log10(8.949844845080285d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9518155064321638d + "'", double1 == 0.9518155064321638d);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        double double1 = org.apache.commons.math.util.FastMath.cos((-4.550646685718122d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.16103800476216618d) + "'", double1 == (-0.16103800476216618d));
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.5265129967102895d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.48271109896197417d) + "'", double1 == (-0.48271109896197417d));
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.1752011936438014d, 0.33372300080313627d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2941091710599992d + "'", double2 == 1.2941091710599992d);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(5.507288054547833E-32d, 6.769991363293242d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.507288054547834E-32d + "'", double2 == 5.507288054547834E-32d);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.7658461948190802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.307876973266691d + "'", double1 == 1.307876973266691d);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        int int2 = org.apache.commons.math.util.FastMath.min(72, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 32, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        double double1 = org.apache.commons.math.util.FastMath.asin(7.478987859894819d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.08619966571131166d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.08609295595102832d) + "'", double1 == (-0.08609295595102832d));
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        long long1 = org.apache.commons.math.util.FastMath.round(0.33667481938672716d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.4944324908505626d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4944324908505626d + "'", double1 == 0.4944324908505626d);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9224287714823782d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7592181952216696d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6406162314544411d + "'", double1 == 0.6406162314544411d);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.99836867862969d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.090523728538517E-4d) + "'", double1 == (-7.090523728538517E-4d));
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        double double1 = org.apache.commons.math.util.FastMath.exp(10.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22026.465794806718d + "'", double1 == 22026.465794806718d);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 6L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.0f + "'", float1 == 6.0f);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        int int2 = org.apache.commons.math.util.FastMath.min(97, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.8945584950807156d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4442923814189608d) + "'", double1 == (-1.4442923814189608d));
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 1.57108749076139d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8311436343658638d, 9.044524487391685E157d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.18946745652025E-159d + "'", double2 == 9.18946745652025E-159d);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        int int2 = org.apache.commons.math.util.FastMath.max(97, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        long long1 = org.apache.commons.math.util.FastMath.round(0.7615941559557649d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.2030392510751841d), 1.5733724749885676d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.12833788652217074d) + "'", double2 == (-0.12833788652217074d));
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 100, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.07609566151369249d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0760956615136925d + "'", double1 == 0.0760956615136925d);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.946997808922293d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06888810733469602d + "'", double1 == 0.06888810733469602d);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        double double1 = org.apache.commons.math.util.FastMath.cos(114.22639329300515d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.42751178833719056d + "'", double1 == 0.42751178833719056d);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        long long1 = org.apache.commons.math.util.FastMath.round(0.06057085833608861d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.5777877754722899d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6520112072674529d) + "'", double1 == (-0.6520112072674529d));
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.5707963267948681d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2533141373154888d + "'", double1 == 1.2533141373154888d);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.832208390245367d, 3.6120970385294773d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8322083902453671d + "'", double2 == 0.8322083902453671d);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) 2);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0000000000000004d + "'", double1 == 2.0000000000000004d);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 1, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5647693741018842d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.0421756036529368d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017940902525888144d + "'", double1 == 0.017940902525888144d);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        double double2 = org.apache.commons.math.util.FastMath.min(2.631800352235365E13d, (double) 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.147483648E9d + "'", double2 == 2.147483648E9d);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.46364760900080604d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5898626184376444d + "'", double1 == 0.5898626184376444d);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.5733724749885676d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999966817320772d + "'", double1 == 0.9999966817320772d);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.5467250970042676d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4545050086131437d + "'", double1 == 2.4545050086131437d);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        double double1 = org.apache.commons.math.util.FastMath.rint(3.1202790084281963E-20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9999966817320772d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7853965042607342d + "'", double1 == 0.7853965042607342d);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.11886728987977911d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.11914740892957598d) + "'", double1 == (-0.11914740892957598d));
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.13360144349841713d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1336014434984171d) + "'", double1 == (-0.1336014434984171d));
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.1217719640679913d, (-1.0125173861454009d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.305048990018662d + "'", double2 == 2.305048990018662d);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 53L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3036.676314193363d + "'", double1 == 3036.676314193363d);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        double double1 = org.apache.commons.math.util.FastMath.log1p(52.69314718055995d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9832853803466297d + "'", double1 == 3.9832853803466297d);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.0286185349173835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3333254119364666d + "'", double1 == 1.3333254119364666d);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.5535399199098424E-90d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-89.44933880139808d) + "'", double1 == (-89.44933880139808d));
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.6982469888270821d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7659703323114561d + "'", double1 == 0.7659703323114561d);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        long long1 = org.apache.commons.math.util.FastMath.round(57.29577951308238d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 57L + "'", long1 == 57L);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        double double1 = org.apache.commons.math.util.FastMath.asin((-1.5347252927908293d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        int int2 = org.apache.commons.math.util.FastMath.min(10, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.7672312144687762d, 2.99822295029797d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7672312144687763d + "'", double2 == 0.7672312144687763d);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.5707055415023634d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3010711152883965d + "'", double1 == 2.3010711152883965d);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-1.5025652899631845d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.810295527926742d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1278889674580024d + "'", double1 == 1.1278889674580024d);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-7.369139609590174E-249d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.369139609590174E-249d) + "'", double1 == (-7.369139609590174E-249d));
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.3851125268672118d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        double double1 = org.apache.commons.math.util.FastMath.asin(71.81168591902457d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.005195033303871199d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 10L, (float) 1L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9999500037496876d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 5L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.0f + "'", float1 == 5.0f);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) -1, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.8009077307264113d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6645439359795198d) + "'", double1 == (-0.6645439359795198d));
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-1.475783864064788d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9006750627339184d) + "'", double1 == (-0.9006750627339184d));
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 28, (float) 2);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 28.0f + "'", float2 == 28.0f);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        double double1 = org.apache.commons.math.util.FastMath.ceil(8.88178419700125E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 53, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        double double2 = org.apache.commons.math.util.FastMath.min((-36.04365338911715d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-36.04365338911715d) + "'", double2 == (-36.04365338911715d));
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.7179170498164851d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.03489241440794944d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.938893903907228E-18d + "'", double1 == 6.938893903907228E-18d);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-1), (float) 35);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9407428152797754d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.5647693741018842d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.781572054374191d + "'", double1 == 4.781572054374191d);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9999998508398553d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7615940933123242d + "'", double1 == 0.7615940933123242d);
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        double double1 = org.apache.commons.math.util.FastMath.log(1.1373220393635d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1286764106923521d + "'", double1 == 0.1286764106923521d);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        float float2 = org.apache.commons.math.util.FastMath.max(53.0f, (float) 2147483647);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.36945265746442124d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.35351286477594024d) + "'", double1 == (-0.35351286477594024d));
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.9036922050915067d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7856166766042585d) + "'", double1 == (-0.7856166766042585d));
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-53.7871501258819d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-53.0d) + "'", double1 == (-53.0d));
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        double double2 = org.apache.commons.math.util.FastMath.max(0.6065871571457463d, 0.024066581448410507d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6065871571457463d + "'", double2 == 0.6065871571457463d);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        int int2 = org.apache.commons.math.util.FastMath.min(32, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        double double1 = org.apache.commons.math.util.FastMath.sinh(57.29577951308237d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8212977905419555E24d + "'", double1 == 3.8212977905419555E24d);
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.1032762973918335d, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1032762973918333d + "'", double2 == 1.1032762973918333d);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(7.138127355756959d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.671727410451328d + "'", double1 == 2.671727410451328d);
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.3065152709994659d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.31133746861371714d + "'", double1 == 0.31133746861371714d);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8623188722876841d, (-0.1336014434984171d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.724506964483035d + "'", double2 == 1.724506964483035d);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 97L, 5.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.21749753606973166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.40859244341429657d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.4154931988910127d, 1.3862943611198906d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7958192892471013d + "'", double2 == 0.7958192892471013d);
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) (-1.0f), 0.0078125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5629839857347956d) + "'", double2 == (-1.5629839857347956d));
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        double double1 = org.apache.commons.math.util.FastMath.ulp(6.691673596021348E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.737125245533627E25d + "'", double1 == 7.737125245533627E25d);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        double double1 = org.apache.commons.math.util.FastMath.acos(4.049630518106203d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.2583723393689585d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.43248879866156087d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5664947917800695d) + "'", double1 == (-0.5664947917800695d));
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        long long1 = org.apache.commons.math.util.FastMath.round(1.0137651267062167d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9496962111038966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2522644298967984d + "'", double1 == 1.2522644298967984d);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.5189448670992995d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8683429710876526d + "'", double1 == 0.8683429710876526d);
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        double double1 = org.apache.commons.math.util.FastMath.sinh(103504.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) -1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        int int2 = org.apache.commons.math.util.FastMath.min(2, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        long long2 = org.apache.commons.math.util.FastMath.min(35L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        double double1 = org.apache.commons.math.util.FastMath.asinh(3.6347792607040605d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0021027160061187d + "'", double1 == 2.0021027160061187d);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, 39481480091340L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9999998508398553d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.461870529191683E-4d + "'", double1 == 5.461870529191683E-4d);
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        double double2 = org.apache.commons.math.util.FastMath.pow((-5.260052243696693d), 0.45593812776599624d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.363655626077857d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5374184941250892d + "'", double1 == 1.5374184941250892d);
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.83752767994986d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(99.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5729.577951308232d + "'", double1 == 5729.577951308232d);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-4.632512904931238d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.0d) + "'", double1 == (-4.0d));
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.2204460492503185E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4901161193847673E-8d + "'", double1 == 1.4901161193847673E-8d);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        long long1 = org.apache.commons.math.util.FastMath.round(0.16393896798747645d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.5777877754722899d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.0988845141611678d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4411269137881427d + "'", double1 == 0.4411269137881427d);
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 53, 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 53L + "'", long2 == 53L);
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.00875022181505636d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.8643238493907622d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015085296975380386d + "'", double1 == 0.015085296975380386d);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) 28L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.552713678800501E-15d + "'", double1 == 3.552713678800501E-15d);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        double double1 = org.apache.commons.math.util.FastMath.asinh(11013.232874703393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.540947184137944d, 14.206129690390002d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 465.3044235814479d + "'", double2 == 465.3044235814479d);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        double double1 = org.apache.commons.math.util.FastMath.exp((-3.380515006246586d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03402992459718327d + "'", double1 == 0.03402992459718327d);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.309274745959981d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        double double1 = org.apache.commons.math.util.FastMath.log1p(3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4260624389053682d + "'", double1 == 1.4260624389053682d);
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        long long1 = org.apache.commons.math.util.FastMath.round(1.5466217204533386d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.009716915305559164d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        double double1 = org.apache.commons.math.util.FastMath.tanh(22025.465794806718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2005.3522829578812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 114898.22225041104d + "'", double1 == 114898.22225041104d);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.9832853803466297d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 53.69314718055995d + "'", double1 == 53.69314718055995d);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        double double1 = org.apache.commons.math.util.FastMath.signum((-3.0461741036471235E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        double double2 = org.apache.commons.math.util.FastMath.min(3036.676314193363d, 4.810327220066308d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.810327220066308d + "'", double2 == 4.810327220066308d);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.47381472041445105d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.008269626915648563d + "'", double1 == 0.008269626915648563d);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        long long1 = org.apache.commons.math.util.FastMath.abs(97L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 97L + "'", long1 == 97L);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.715662658536639d, (double) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6036753829452688E8d + "'", double2 == 1.6036753829452688E8d);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        long long2 = org.apache.commons.math.util.FastMath.min(1L, 5L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        int int2 = org.apache.commons.math.util.FastMath.min((-1), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.41394522878666795d, (-4.632512904931237d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.052472826372941d + "'", double2 == 3.052472826372941d);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.05047132954481966d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6212891090067323d + "'", double1 == 1.6212891090067323d);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 97.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.3106472496723418d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7085733084162253d + "'", double1 == 3.7085733084162253d);
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        float float1 = org.apache.commons.math.util.FastMath.abs(35.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 35.0f + "'", float1 == 35.0f);
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.16820452546122452d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15546797649195332d + "'", double1 == 0.15546797649195332d);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.0455256631001846d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7800607355415555d + "'", double1 == 0.7800607355415555d);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) -1, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 28L, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 28.0f + "'", float2 == 28.0f);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.4636456564559829d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4472118490899239d + "'", double1 == 0.4472118490899239d);
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        int int2 = org.apache.commons.math.util.FastMath.min(35, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '4', 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        double double1 = org.apache.commons.math.util.FastMath.cos(36.000000000000014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.12796368962739058d) + "'", double1 == (-0.12796368962739058d));
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.0769647493626147d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0769647493626149d + "'", double1 == 1.0769647493626149d);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 0.6114464160932404d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.5083775167989393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        double double2 = org.apache.commons.math.util.FastMath.max(0.011800076512800236d, 0.4288764780867376d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4288764780867376d + "'", double2 == 0.4288764780867376d);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.496773992873097d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.251840827131708d + "'", double1 == 1.251840827131708d);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        double double1 = org.apache.commons.math.util.FastMath.expm1(4.584967478670572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.00000000000004d + "'", double1 == 97.00000000000004d);
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.7659703323114561d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 0, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) (short) 10, 1.5929264334035065d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4128308409485173d + "'", double2 == 1.4128308409485173d);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        double double1 = org.apache.commons.math.util.FastMath.acos(3.732511156817248d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 0, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.3686469200204927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3330101080431218d + "'", double1 == 1.3330101080431218d);
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.8393046750511655d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.0954243259038507d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9904513401802029d + "'", double1 == 1.9904513401802029d);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.7226995482024658d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 41.40763396801269d + "'", double1 == 41.40763396801269d);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-53.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-53.0d) + "'", double1 == (-53.0d));
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.5715810788975264d, 0.18422346241992238d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4992802918419843d + "'", double2 == 1.4992802918419843d);
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.6114464160932404d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.010671753160346287d + "'", double1 == 0.010671753160346287d);
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        double double1 = org.apache.commons.math.util.FastMath.log1p(3227.9292774459186d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.079905868209936d + "'", double1 == 8.079905868209936d);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        long long1 = org.apache.commons.math.util.FastMath.round(3.7242338042509196E-22d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        long long1 = org.apache.commons.math.util.FastMath.round(74.20321057778875d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 74L + "'", long1 == 74L);
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        double double2 = org.apache.commons.math.util.FastMath.min(1.0421756036529368d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        float float2 = org.apache.commons.math.util.FastMath.max(1.0f, (float) 97L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.3796077390275217d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3887906953856204d + "'", double1 == 0.3887906953856204d);
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.9649955887750582d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9649955887750582d + "'", double1 == 0.9649955887750582d);
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-1.7456418720467646d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.1924336773023863d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.018572567079965d + "'", double1 == 1.018572567079965d);
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        double double2 = org.apache.commons.math.util.FastMath.min(1.0149280275816275d, 4.480699513047791d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0149280275816275d + "'", double2 == 1.0149280275816275d);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.6105647004975028d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(3.637978807091713E-12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.637978807091714E-12d + "'", double1 == 3.637978807091714E-12d);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.216499084404722d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21317875147664192d + "'", double1 == 0.21317875147664192d);
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        long long2 = org.apache.commons.math.util.FastMath.max((-53L), (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        double double1 = org.apache.commons.math.util.FastMath.abs(43.42944819032519d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 43.42944819032519d + "'", double1 == 43.42944819032519d);
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.004921566601151856d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.004921566601151857d + "'", double1 == 0.004921566601151857d);
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.017940902525888144d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13394365429496144d + "'", double1 == 0.13394365429496144d);
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.4908493554131868d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        double double2 = org.apache.commons.math.util.FastMath.max((double) 97L, 0.18422346241992238d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.264102998611546d, (-0.5813794361776217d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8726212203028842d + "'", double2 == 0.8726212203028842d);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 1.4992802918419843d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        double double1 = org.apache.commons.math.util.FastMath.log(3.564317279302415E38d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 88.76920606279324d + "'", double1 == 88.76920606279324d);
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        double double1 = org.apache.commons.math.util.FastMath.expm1(9.306852817378903d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11012.232874703419d + "'", double1 == 11012.232874703419d);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.4609653589315096d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-26.411369568508626d) + "'", double1 == (-26.411369568508626d));
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        int int2 = org.apache.commons.math.util.FastMath.min((int) 'a', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.48271109896197417d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-27.657308694642932d) + "'", double1 == (-27.657308694642932d));
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9999999999990843d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(6.115016634173588d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.472855967130635d + "'", double1 == 2.472855967130635d);
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        long long2 = org.apache.commons.math.util.FastMath.min(2147483647L, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.29899893506723685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.817884356931778d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.147483648E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1290.1591550923501d + "'", double1 == 1290.1591550923501d);
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 28);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28 + "'", int1 == 28);
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.25008839294063845d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24748960330606537d + "'", double1 == 0.24748960330606537d);
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        double double1 = org.apache.commons.math.util.FastMath.sin(99.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.506365641109771d) + "'", double1 == (-0.506365641109771d));
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.6036753829452688E8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.21127011215504418d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2352459649529257d + "'", double1 == 1.2352459649529257d);
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-1.6111038742580877d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8003329149759787d) + "'", double1 == (-0.8003329149759787d));
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.482433365515615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        int int2 = org.apache.commons.math.util.FastMath.min((int) ' ', 57);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.001885141133518411d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000017768790728d + "'", double1 == 1.0000017768790728d);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        double double2 = org.apache.commons.math.util.FastMath.min(1.5710488338654254d, 3.2710663101885897d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5710488338654254d + "'", double2 == 1.5710488338654254d);
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-26.411369568508626d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.9672999628447583d) + "'", double1 == (-3.9672999628447583d));
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 53, (long) 3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.9251475365964138d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0628837175857748d) + "'", double1 == (-1.0628837175857748d));
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9171523356672744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3055336652009295d + "'", double1 == 1.3055336652009295d);
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.17062332315326464d), (-4.550646685718122d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.1041159064537145d) + "'", double2 == (-3.1041159064537145d));
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.06254420428363117d, 0.20787957635076193d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.06254420428363118d + "'", double2 == 0.06254420428363118d);
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.9475357648137084d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.527570075824369d) + "'", double1 == (-2.527570075824369d));
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.0488079432890174d, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.953463411865515d + "'", double2 == 0.953463411865515d);
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        double double1 = org.apache.commons.math.util.FastMath.tanh(9.293358726420639E30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.6177859350239399d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-6.810684256279498d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.0d) + "'", double1 == (-6.0d));
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        double double1 = org.apache.commons.math.util.FastMath.sin(56.5058975143737d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.04275721153934543d) + "'", double1 == (-0.04275721153934543d));
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        double double1 = org.apache.commons.math.util.FastMath.acosh(14.899276870949834d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.393331768257697d + "'", double1 == 3.393331768257697d);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-53), (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-53L) + "'", long2 == (-53L));
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.5664947917800695d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1647954793901711d + "'", double1 == 1.1647954793901711d);
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.7592181952216696d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7592181952216696d + "'", double1 == 0.7592181952216696d);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 100, (float) 28);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 28.0f + "'", float2 == 28.0f);
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        long long1 = org.apache.commons.math.util.FastMath.round(0.8425647914073723d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.5083775167989393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.062378286155180526d + "'", double1 == 0.062378286155180526d);
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.7871071944553747d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0697975170022183d + "'", double1 == 3.0697975170022183d);
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        double double1 = org.apache.commons.math.util.FastMath.ulp(104.94395132690269d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        double double2 = org.apache.commons.math.util.FastMath.min(0.21348878684812134d, (-0.8945584950807156d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8945584950807156d) + "'", double2 == (-0.8945584950807156d));
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 52, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.6904492636009615d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6042872728524414d) + "'", double1 == (-0.6042872728524414d));
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.0864361697580084E27d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        double double2 = org.apache.commons.math.util.FastMath.max(103.00961449578338d, 0.0051950800397900995d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 103.00961449578338d + "'", double2 == 103.00961449578338d);
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.0975855140010009d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0106146460254415d) + "'", double1 == (-1.0106146460254415d));
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.7386831067060273d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.3788272112277034d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.970242640033142d + "'", double1 == 3.970242640033142d);
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        float float2 = org.apache.commons.math.util.FastMath.min(1477896.0f, 53.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 53.0f + "'", float2 == 53.0f);
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9290452453166923d, 1.3828763427709216d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9032312123760041d + "'", double2 == 0.9032312123760041d);
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        double double2 = org.apache.commons.math.util.FastMath.max(0.8431082790768843d, 0.9376658284517877d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9376658284517877d + "'", double2 == 0.9376658284517877d);
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        double double1 = org.apache.commons.math.util.FastMath.cosh(3.865393058796651d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 23.871490496694555d + "'", double1 == 23.871490496694555d);
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.3485292390836008d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22044150548481528d + "'", double1 == 0.22044150548481528d);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.1784446247204259d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4707796599556535d + "'", double1 == 1.4707796599556535d);
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.20787957635076193d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.20638559288074199d + "'", double1 == 0.20638559288074199d);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        long long2 = org.apache.commons.math.util.FastMath.min(5L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        double double1 = org.apache.commons.math.util.FastMath.log1p(13.359533360579945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6644140673107377d + "'", double1 == 2.6644140673107377d);
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        double double1 = org.apache.commons.math.util.FastMath.expm1(6.896181061029328d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 987.4925056352512d + "'", double1 == 987.4925056352512d);
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.7490362681090366d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01307314909535369d + "'", double1 == 0.01307314909535369d);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        int int2 = org.apache.commons.math.util.FastMath.max((-1), 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.4415943645925386d, 0.8414709848078964d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2389045558899838d + "'", double2 == 1.2389045558899838d);
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        long long2 = org.apache.commons.math.util.FastMath.max(97L, 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 43.42944819032519d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 10, 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        int int2 = org.apache.commons.math.util.FastMath.min((-53), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-53) + "'", int2 == (-53));
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(4.716325081321902d, 5.206879716514544E22d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.716325081321903d + "'", double2 == 4.716325081321903d);
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        int int2 = org.apache.commons.math.util.FastMath.min(5, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        int int2 = org.apache.commons.math.util.FastMath.max(72, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72 + "'", int2 == 72);
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.0000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000002d + "'", double1 == 1.0000000000000002d);
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        int int2 = org.apache.commons.math.util.FastMath.max(100, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.012821786594683294d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.012822137910701758d + "'", double1 == 0.012822137910701758d);
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        double double1 = org.apache.commons.math.util.FastMath.asinh(3.637978807091714E-12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.637978807091714E-12d + "'", double1 == 3.637978807091714E-12d);
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) 4);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1578212823495775d + "'", double1 == 1.1578212823495775d);
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) (-2L));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.6177859350239399d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9988961914845736d + "'", double1 == 0.9988961914845736d);
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.7235232133665007d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7235232133665008d + "'", double1 == 0.7235232133665008d);
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 2L, 1.8855630621884312d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8148414809468997d + "'", double2 == 0.8148414809468997d);
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9950915100179343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.704971861977569d + "'", double1 == 2.704971861977569d);
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.7853965042607342d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013707754933003484d + "'", double1 == 0.013707754933003484d);
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.7568396789787606d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4021802218490915d + "'", double1 == 1.4021802218490915d);
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        double double1 = org.apache.commons.math.util.FastMath.log10(4.158638853279167d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6189512067707561d + "'", double1 == 0.6189512067707561d);
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        long long1 = org.apache.commons.math.util.FastMath.round(99.9949998749938d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        double double1 = org.apache.commons.math.util.FastMath.log((-2.9999999999999996d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        double double1 = org.apache.commons.math.util.FastMath.log(28.45884779991685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.348459106948174d + "'", double1 == 3.348459106948174d);
    }
}

