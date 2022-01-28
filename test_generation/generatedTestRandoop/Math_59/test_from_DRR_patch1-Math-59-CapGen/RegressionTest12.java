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
        double double2 = org.apache.commons.math.util.FastMath.max((double) 9.223372E18f, 2.1162729376788123d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.223372036854776E18d + "'", double2 == 9.223372036854776E18d);
    }

    @Test
    public void test6002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6002");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.0834193229964067d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6003");
        int int1 = org.apache.commons.math.util.FastMath.round(49.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 49 + "'", int1 == 49);
    }

    @Test
    public void test6004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6004");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.060399309368239d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.018507459334349722d + "'", double1 == 0.018507459334349722d);
    }

    @Test
    public void test6005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6005");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.6303775321964171d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.630377532196417d) + "'", double1 == (-0.630377532196417d));
    }

    @Test
    public void test6006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6006");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) 32);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test6007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6007");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.04539241756975537d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3567202561516277d + "'", double1 == 0.3567202561516277d);
    }

    @Test
    public void test6008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6008");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.9204604704918524d), 0.6782858550610651d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test6009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6009");
        double double1 = org.apache.commons.math.util.FastMath.floor(8.961927637439027E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6010");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.03538849883217154d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03602212401092414d + "'", double1 == 0.03602212401092414d);
    }

    @Test
    public void test6011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6011");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.2815882258354989d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7545843389046754d + "'", double1 == 0.7545843389046754d);
    }

    @Test
    public void test6012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6012");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.6055560406454773d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5444948122760284d + "'", double1 == 0.5444948122760284d);
    }

    @Test
    public void test6013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6013");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.6055560406454773d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8322707426928889d + "'", double1 == 0.8322707426928889d);
    }

    @Test
    public void test6014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6014");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9335880310041569d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.075239416561867d + "'", double1 == 1.075239416561867d);
    }

    @Test
    public void test6015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6015");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-1.3185862410962617d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.735309793621926d) + "'", double1 == (-1.735309793621926d));
    }

    @Test
    public void test6016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6016");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.1748926318726323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.237795289157782d + "'", double1 == 2.237795289157782d);
    }

    @Test
    public void test6017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6017");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9999550340122696d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test6018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6018");
        float float2 = org.apache.commons.math.util.FastMath.max(2005.0f, (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2005.0f + "'", float2 == 2005.0f);
    }

    @Test
    public void test6019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6019");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(58.966624055319045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 58.96662405531905d + "'", double1 == 58.96662405531905d);
    }

    @Test
    public void test6020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6020");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.0202301338501234d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6021");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.9696406022241435d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test6022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6022");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 51);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6023");
        double double2 = org.apache.commons.math.util.FastMath.min(1.0184447437332007d, 0.974424233965079d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.974424233965079d + "'", double2 == 0.974424233965079d);
    }

    @Test
    public void test6024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6024");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.3939063732470823d, 1.5707963267948597d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.23144341164525933d + "'", double2 == 0.23144341164525933d);
    }

    @Test
    public void test6025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6025");
        long long2 = org.apache.commons.math.util.FastMath.max(97L, 564L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 564L + "'", long2 == 564L);
    }

    @Test
    public void test6026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6026");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.14520099282133164d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9894768439443955d + "'", double1 == 0.9894768439443955d);
    }

    @Test
    public void test6027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6027");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.416281099899578d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9560051261391512d + "'", double1 == 0.9560051261391512d);
    }

    @Test
    public void test6028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6028");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.22275386159456184d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.25199819833424153d) + "'", double1 == (-0.25199819833424153d));
    }

    @Test
    public void test6029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6029");
        long long1 = org.apache.commons.math.util.FastMath.abs(9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test6030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6030");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.28588384821610197d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.33093785546777515d + "'", double1 == 0.33093785546777515d);
    }

    @Test
    public void test6031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6031");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.9186187449731414d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test6032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6032");
        double double2 = org.apache.commons.math.util.FastMath.max(8.881784197001254E-16d, 0.4651773501465964d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4651773501465964d + "'", double2 == 0.4651773501465964d);
    }

    @Test
    public void test6033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6033");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.570705526933711d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.810040610116589d + "'", double1 == 4.810040610116589d);
    }

    @Test
    public void test6034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6034");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-5), (float) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.0f) + "'", float2 == (-5.0f));
    }

    @Test
    public void test6035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6035");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.653029967135041E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267947314d + "'", double1 == 1.5707963267947314d);
    }

    @Test
    public void test6036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6036");
        int int2 = org.apache.commons.math.util.FastMath.max(97, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test6037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6037");
        double double1 = org.apache.commons.math.util.FastMath.asin(4.810040610116589d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6038");
        double double1 = org.apache.commons.math.util.FastMath.atan(1833.4649444186348d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5702509114577314d + "'", double1 == 1.5702509114577314d);
    }

    @Test
    public void test6039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6039");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 6559L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6559 + "'", int1 == 6559);
    }

    @Test
    public void test6040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6040");
        int int2 = org.apache.commons.math.util.FastMath.min(83, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6041");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.28748675692952264d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005017590464300794d + "'", double1 == 0.005017590464300794d);
    }

    @Test
    public void test6042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6042");
        double double1 = org.apache.commons.math.util.FastMath.rint(3.7621956910836314d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test6043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6043");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.3978952727983707d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.397895272798371d + "'", double1 == 2.397895272798371d);
    }

    @Test
    public void test6044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6044");
        float float2 = org.apache.commons.math.util.FastMath.min(51.0f, (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 51.0f + "'", float2 == 51.0f);
    }

    @Test
    public void test6045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6045");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9899750504798679d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9966471209260009d + "'", double1 == 0.9966471209260009d);
    }

    @Test
    public void test6046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6046");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.0111079454968612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6986857868719877d + "'", double1 == 0.6986857868719877d);
    }

    @Test
    public void test6047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6047");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.2467218939517983d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8473618503113074d + "'", double1 == 0.8473618503113074d);
    }

    @Test
    public void test6048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6048");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9999999999531204d, 0.07270966677774479d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.07270966677774479d + "'", double2 == 0.07270966677774479d);
    }

    @Test
    public void test6049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6049");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.9124755018057016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.264883142630315d + "'", double1 == 1.264883142630315d);
    }

    @Test
    public void test6050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6050");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.3669495678698107d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13575249203682044d + "'", double1 == 0.13575249203682044d);
    }

    @Test
    public void test6051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6051");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.1612398348874445d), 1.2062746732493863d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test6052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6052");
        double double1 = org.apache.commons.math.util.FastMath.tanh(152.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6053");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1350.2725658295117d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 23.566702073076858d + "'", double1 == 23.566702073076858d);
    }

    @Test
    public void test6054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6054");
        float float2 = org.apache.commons.math.util.FastMath.max(3280.0f, 4.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3280.0f + "'", float2 == 3280.0f);
    }

    @Test
    public void test6055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6055");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test6056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6056");
        long long2 = org.apache.commons.math.util.FastMath.min((long) '4', (long) 41);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 41L + "'", long2 == 41L);
    }

    @Test
    public void test6057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6057");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.0379428340982403d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0386718545681077d + "'", double1 == 1.0386718545681077d);
    }

    @Test
    public void test6058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6058");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.5691842460354224d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.297256892521212d + "'", double1 == 2.297256892521212d);
    }

    @Test
    public void test6059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6059");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.5501702829958328d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8194058173186031d + "'", double1 == 0.8194058173186031d);
    }

    @Test
    public void test6060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6060");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.6483608274590866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9124034991009713d + "'", double1 == 1.9124034991009713d);
    }

    @Test
    public void test6061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6061");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.2639873180109631d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.26706420183981067d + "'", double1 == 0.26706420183981067d);
    }

    @Test
    public void test6062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6062");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.6271511736020818d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.48683073947189004d + "'", double1 == 0.48683073947189004d);
    }

    @Test
    public void test6063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6063");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.4812058561972497d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6180243309565554d + "'", double1 == 0.6180243309565554d);
    }

    @Test
    public void test6064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6064");
        double double2 = org.apache.commons.math.util.FastMath.pow(34.30685281944006d, 0.01420892545840321d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0515165498868415d + "'", double2 == 1.0515165498868415d);
    }

    @Test
    public void test6065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6065");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.47381472041431183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.45766923321173114d + "'", double1 == 0.45766923321173114d);
    }

    @Test
    public void test6066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6066");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9988731032017402d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7848343974049664d + "'", double1 == 0.7848343974049664d);
    }

    @Test
    public void test6067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6067");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.0610850527508946d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0610850527508944d + "'", double2 == 1.0610850527508944d);
    }

    @Test
    public void test6068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6068");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 9223372036854775807L, (float) 1L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test6069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6069");
        double double1 = org.apache.commons.math.util.FastMath.log10(5.620387737964422d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7497662776063796d + "'", double1 == 0.7497662776063796d);
    }

    @Test
    public void test6070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6070");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.6113119967914531d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6071");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.11765201143093873d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11738226518994596d + "'", double1 == 0.11738226518994596d);
    }

    @Test
    public void test6072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6072");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9999999986859385d, (-24.533059822774465d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999999986859384d + "'", double2 == 0.9999999986859384d);
    }

    @Test
    public void test6073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6073");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.024913294410754103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6074");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.555348061489414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.99836867862969d + "'", double1 == 0.99836867862969d);
    }

    @Test
    public void test6075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6075");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.8218458394920244d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6076");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.5707055269350272d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6077");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.22275386159456184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22275386159456184d + "'", double1 == 0.22275386159456184d);
    }

    @Test
    public void test6078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6078");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(13.34453352613691d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 764.5854506184754d + "'", double1 == 764.5854506184754d);
    }

    @Test
    public void test6079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6079");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(85.7720556895209d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.410101716065497d + "'", double1 == 4.410101716065497d);
    }

    @Test
    public void test6080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6080");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.23862267553959204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6081");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 10, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test6082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6082");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.1928445361837339d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.831458987661877d + "'", double1 == 0.831458987661877d);
    }

    @Test
    public void test6083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6083");
        double double1 = org.apache.commons.math.util.FastMath.rint(2453.035678413897d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2453.0d + "'", double1 == 2453.0d);
    }

    @Test
    public void test6084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6084");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.11975712045798752d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11975712045798752d + "'", double1 == 0.11975712045798752d);
    }

    @Test
    public void test6085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6085");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.4575013994861012d, 0.15700035487971642d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4634912466044083d + "'", double2 == 1.4634912466044083d);
    }

    @Test
    public void test6086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6086");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-2.713130608547954d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3947302928006944d) + "'", double1 == (-1.3947302928006944d));
    }

    @Test
    public void test6087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6087");
        double double1 = org.apache.commons.math.util.FastMath.ceil(53.486821090156674d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 54.0d + "'", double1 == 54.0d);
    }

    @Test
    public void test6088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6088");
        int int2 = org.apache.commons.math.util.FastMath.max(2, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test6089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6089");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.13348192268523312d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13348192268523315d + "'", double1 == 0.13348192268523315d);
    }

    @Test
    public void test6090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6090");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.1612398348874445d), 0.7372144183864715d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test6091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6091");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test6092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6092");
        double double1 = org.apache.commons.math.util.FastMath.expm1(33.66561760358879d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.1763025667199225E14d + "'", double1 == 4.1763025667199225E14d);
    }

    @Test
    public void test6093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6093");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9999999999999645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.76159415595575d + "'", double1 == 0.76159415595575d);
    }

    @Test
    public void test6094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6094");
        double double1 = org.apache.commons.math.util.FastMath.acosh(4.9848065043413134d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2893253912714644d + "'", double1 == 2.2893253912714644d);
    }

    @Test
    public void test6095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6095");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.494840085597921d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.189576968878733d + "'", double1 == 1.189576968878733d);
    }

    @Test
    public void test6096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6096");
        double double2 = org.apache.commons.math.util.FastMath.min(1219.0943964290645d, 4.493423335506387d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.493423335506387d + "'", double2 == 4.493423335506387d);
    }

    @Test
    public void test6097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6097");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.7503427504189538d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test6098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6098");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-1.8655219413764763d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.307060884908975d + "'", double1 == 3.307060884908975d);
    }

    @Test
    public void test6099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6099");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.40893653071341846d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6100");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.0109461818722032d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.004728036364442429d + "'", double1 == 0.004728036364442429d);
    }

    @Test
    public void test6101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6101");
        double double1 = org.apache.commons.math.util.FastMath.log(0.04282343610080969d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.15066975380865d) + "'", double1 == (-3.15066975380865d));
    }

    @Test
    public void test6102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6102");
        long long1 = org.apache.commons.math.util.FastMath.round(0.7790360334325874d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test6103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6103");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 'a', 36L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test6104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6104");
        double double1 = org.apache.commons.math.util.FastMath.ceil(123.44001497540268d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 124.0d + "'", double1 == 124.0d);
    }

    @Test
    public void test6105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6105");
        float float2 = org.apache.commons.math.util.FastMath.min((-5.0f), 105.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.0f) + "'", float2 == (-5.0f));
    }

    @Test
    public void test6106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6106");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 0.014221771863635027d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.014221771863635027d + "'", double2 == 0.014221771863635027d);
    }

    @Test
    public void test6107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6107");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.6783203845295841d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8058871687495555d) + "'", double1 == (-0.8058871687495555d));
    }

    @Test
    public void test6108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6108");
        double double1 = org.apache.commons.math.util.FastMath.acos(97.00000000000001d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6109");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-3.380515006246586d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test6110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6110");
        double double1 = org.apache.commons.math.util.FastMath.log10(137.38927884571783d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.137952843933064d + "'", double1 == 2.137952843933064d);
    }

    @Test
    public void test6111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6111");
        int int2 = org.apache.commons.math.util.FastMath.min(2005, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test6112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6112");
        double double2 = org.apache.commons.math.util.FastMath.min(1.5507969934215646d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test6113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6113");
        double double1 = org.apache.commons.math.util.FastMath.tan(27.951773034959196d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3342339022745425d) + "'", double1 == (-0.3342339022745425d));
    }

    @Test
    public void test6114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6114");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.0241519893614606d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017874824255207426d + "'", double1 == 0.017874824255207426d);
    }

    @Test
    public void test6115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6115");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.40985124626279884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3883463677593004d + "'", double1 == 0.3883463677593004d);
    }

    @Test
    public void test6116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6116");
        int int2 = org.apache.commons.math.util.FastMath.max(83, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 83 + "'", int2 == 83);
    }

    @Test
    public void test6117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6117");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 41);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 41L + "'", long1 == 41L);
    }

    @Test
    public void test6118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6118");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6119");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.5707963001144702d, 1.0295629067905003d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5919071856104574d + "'", double2 == 1.5919071856104574d);
    }

    @Test
    public void test6120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6120");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.13794559088583247d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6121");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-1.5495411464777387d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2219332254334312d) + "'", double1 == (-1.2219332254334312d));
    }

    @Test
    public void test6122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6122");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 10, (-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test6123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6123");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.48549279735503514d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test6124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6124");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) 51);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 51.0f + "'", float2 == 51.0f);
    }

    @Test
    public void test6125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6125");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2453.035678413897d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.547473508864641E-13d + "'", double1 == 4.547473508864641E-13d);
    }

    @Test
    public void test6126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6126");
        double double2 = org.apache.commons.math.util.FastMath.max(1.2118662346608502d, 4.410101716065497d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.410101716065497d + "'", double2 == 4.410101716065497d);
    }

    @Test
    public void test6127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6127");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.41386243940890527d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4402630249707292d + "'", double1 == 0.4402630249707292d);
    }

    @Test
    public void test6128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6128");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(22.44007009032809d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.737095110964956d + "'", double1 == 4.737095110964956d);
    }

    @Test
    public void test6129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6129");
        double double2 = org.apache.commons.math.util.FastMath.min(0.1417162261588426d, (-0.9355520242262295d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9355520242262295d) + "'", double2 == (-0.9355520242262295d));
    }

    @Test
    public void test6130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6130");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.5701593298424005d, (-1.564538235027751d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5701593298424004d + "'", double2 == 0.5701593298424004d);
    }

    @Test
    public void test6131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6131");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 100, (float) 564L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test6132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6132");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.010309278362160296d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.010309643613013912d + "'", double1 == 0.010309643613013912d);
    }

    @Test
    public void test6133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6133");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1350.2725658295117d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test6134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6134");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.4531113122902532d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4388852878205555d) + "'", double1 == (-0.4388852878205555d));
    }

    @Test
    public void test6135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6135");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.5608425149227073d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7521480895180586d + "'", double1 == 0.7521480895180586d);
    }

    @Test
    public void test6136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6136");
        int int2 = org.apache.commons.math.util.FastMath.max(36, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test6137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6137");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.1739336174335393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test6138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6138");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.2169902071303054d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6139");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.3348133298708282d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.158638853279168d + "'", double1 == 4.158638853279168d);
    }

    @Test
    public void test6140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6140");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.5872139151569291d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6141");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 100, (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test6142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6142");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.7454273046925272d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9230914219683789d + "'", double1 == 0.9230914219683789d);
    }

    @Test
    public void test6143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6143");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.5063656411095873d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4671086505231195d) + "'", double1 == (-0.4671086505231195d));
    }

    @Test
    public void test6144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6144");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 100, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test6145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6145");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.37672359943834516d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.457501399486101d + "'", double1 == 1.457501399486101d);
    }

    @Test
    public void test6146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6146");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.2430166129797537d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test6147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6147");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-1), 51L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 51L + "'", long2 == 51L);
    }

    @Test
    public void test6148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6148");
        int int2 = org.apache.commons.math.util.FastMath.max(105, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 105 + "'", int2 == 105);
    }

    @Test
    public void test6149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6149");
        float float2 = org.apache.commons.math.util.FastMath.min((-1.0f), (float) 105L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test6150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6150");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.13025531550365874d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9915287637907535d + "'", double1 == 0.9915287637907535d);
    }

    @Test
    public void test6151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6151");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.6579332160517204d, 0.24256291304290128d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2175831832403397d + "'", double2 == 1.2175831832403397d);
    }

    @Test
    public void test6152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6152");
        long long1 = org.apache.commons.math.util.FastMath.round(0.8832389348340275d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test6153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6153");
        double double2 = org.apache.commons.math.util.FastMath.pow(3.082130173350885d, 1.1932800507380157d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.83121142203003d + "'", double2 == 3.83121142203003d);
    }

    @Test
    public void test6154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6154");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.1175823681357508E-22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.213285324654967E-20d + "'", double1 == 1.213285324654967E-20d);
    }

    @Test
    public void test6155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6155");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.3856693690918906d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.41378485261082415d) + "'", double1 == (-0.41378485261082415d));
    }

    @Test
    public void test6156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6156");
        double double1 = org.apache.commons.math.util.FastMath.signum(1965.6378749304042d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6157");
        double double2 = org.apache.commons.math.util.FastMath.pow(3.9588076367332303d, (-0.5708920866202177d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4558849058654814d + "'", double2 == 0.4558849058654814d);
    }

    @Test
    public void test6158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6158");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.3856693690918906d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0752968405690968d + "'", double1 == 1.0752968405690968d);
    }

    @Test
    public void test6159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6159");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.0109461818722032d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.003635494454249d + "'", double1 == 1.003635494454249d);
    }

    @Test
    public void test6160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6160");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.7024348335001199d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6161");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.757932679877424d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6485587228186701d + "'", double1 == 0.6485587228186701d);
    }

    @Test
    public void test6162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6162");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.036053812280867d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6163");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 97L, (float) 39481480091341L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test6164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6164");
        long long1 = org.apache.commons.math.util.FastMath.round(1.1752011936438014d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test6165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6165");
        double double1 = org.apache.commons.math.util.FastMath.log(12.238292298814303d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5045697492799017d + "'", double1 == 2.5045697492799017d);
    }

    @Test
    public void test6166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6166");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.688117141816441E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test6167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6167");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.8623188722876838d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.368646920020492d + "'", double1 == 1.368646920020492d);
    }

    @Test
    public void test6168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6168");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(3.5019296225954823d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.871344335656985d + "'", double1 == 1.871344335656985d);
    }

    @Test
    public void test6169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6169");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 97, 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test6170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6170");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.05466430363978169d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3795199469907521d + "'", double1 == 0.3795199469907521d);
    }

    @Test
    public void test6171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6171");
        long long2 = org.apache.commons.math.util.FastMath.min(3L, (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test6172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6172");
        double double1 = org.apache.commons.math.util.FastMath.cos((-1.374629511804778d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19491110392712058d + "'", double1 == 0.19491110392712058d);
    }

    @Test
    public void test6173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6173");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.0149280275816275d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7677926132124685d + "'", double1 == 0.7677926132124685d);
    }

    @Test
    public void test6174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6174");
        float float2 = org.apache.commons.math.util.FastMath.max((float) '#', (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test6175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6175");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.1002290708765434d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0489180477408822d + "'", double1 == 1.0489180477408822d);
    }

    @Test
    public void test6176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6176");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.017350939764409778d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6177");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.05690628730711007d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6178");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.0026502369232645037d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.568146086769186d + "'", double1 == 1.568146086769186d);
    }

    @Test
    public void test6179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6179");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9941356190863951d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9941356190863951d + "'", double1 == 0.9941356190863951d);
    }

    @Test
    public void test6180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6180");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 1, 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test6181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6181");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.33093785546777515d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.392273267448764d + "'", double1 == 1.392273267448764d);
    }

    @Test
    public void test6182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6182");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.662907307470914E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3896275258031838d) + "'", double1 == (-1.3896275258031838d));
    }

    @Test
    public void test6183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6183");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.3755807901428491d, (-0.3283907090404725d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.379315007273721d + "'", double2 == 1.379315007273721d);
    }

    @Test
    public void test6184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6184");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.014886179266898497d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.014886179266898497d + "'", double1 == 0.014886179266898497d);
    }

    @Test
    public void test6185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6185");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.18436379801697833d, 0.3801063813513533d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.18436379801697836d + "'", double2 == 0.18436379801697836d);
    }

    @Test
    public void test6186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6186");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.5961722400471147d), (double) 2005.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.973427543528077E-4d) + "'", double2 == (-2.973427543528077E-4d));
    }

    @Test
    public void test6187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6187");
        double double1 = org.apache.commons.math.util.FastMath.atan((-1.128560823492023d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.845722884619519d) + "'", double1 == (-0.845722884619519d));
    }

    @Test
    public void test6188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6188");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1735.2098785594192d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6189");
        int int2 = org.apache.commons.math.util.FastMath.min(97, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test6190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6190");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 32, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test6191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6191");
        double double1 = org.apache.commons.math.util.FastMath.acos(3.675016391586134d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6192");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.1489123351881216d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14946825286985244d + "'", double1 == 0.14946825286985244d);
    }

    @Test
    public void test6193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6193");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.024913294410754103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.024918450020804752d + "'", double1 == 0.024918450020804752d);
    }

    @Test
    public void test6194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6194");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.3250161631144044d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6195");
        double double2 = org.apache.commons.math.util.FastMath.max(0.024649111432356895d, 6.350812057622625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.350812057622625d + "'", double2 == 6.350812057622625d);
    }

    @Test
    public void test6196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6196");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2147483647L, 49.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test6197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6197");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.914747959740454d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05087194876325805d + "'", double1 == 0.05087194876325805d);
    }

    @Test
    public void test6198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6198");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.14287905018325445d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14239733028093693d + "'", double1 == 0.14239733028093693d);
    }

    @Test
    public void test6199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6199");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.9999192657925324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2599040965455128d + "'", double1 == 1.2599040965455128d);
    }

    @Test
    public void test6200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6200");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9625805862239727d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.27442718374687974d + "'", double1 == 0.27442718374687974d);
    }

    @Test
    public void test6201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6201");
        double double2 = org.apache.commons.math.util.FastMath.min(0.2708164357864931d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test6202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6202");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.8813735870195432d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9388149908366095d + "'", double1 == 0.9388149908366095d);
    }

    @Test
    public void test6203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6203");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.5691842460354224d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.802728750322895d + "'", double1 == 4.802728750322895d);
    }

    @Test
    public void test6204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6204");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5847565358656169E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5847565358642902E-6d + "'", double1 == 1.5847565358642902E-6d);
    }

    @Test
    public void test6205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6205");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9155494254642262d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7413398253777113d + "'", double1 == 0.7413398253777113d);
    }

    @Test
    public void test6206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6206");
        int int2 = org.apache.commons.math.util.FastMath.min(3, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test6207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6207");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.8135279227115655d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0579036066732326d) + "'", double1 == (-1.0579036066732326d));
    }

    @Test
    public void test6208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6208");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.03602212401092414d, 1.3701413791081227d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.036022124010924146d + "'", double2 == 0.036022124010924146d);
    }

    @Test
    public void test6209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6209");
        double double1 = org.apache.commons.math.util.FastMath.atan(99.99999999999996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5607966601082315d + "'", double1 == 1.5607966601082315d);
    }

    @Test
    public void test6210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6210");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.1912543356541123d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6211");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.17952899969001357d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1805076511219491d) + "'", double1 == (-0.1805076511219491d));
    }

    @Test
    public void test6212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6212");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9791146345645385d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5188709009619294d + "'", double1 == 1.5188709009619294d);
    }

    @Test
    public void test6213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6213");
        double double2 = org.apache.commons.math.util.FastMath.atan2(5.373543519361118d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test6214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6214");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 2147483647, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test6215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6215");
        long long1 = org.apache.commons.math.util.FastMath.round((-1.6571064922358931d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-2L) + "'", long1 == (-2L));
    }

    @Test
    public void test6216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6216");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.007414768657038784d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.007414768657038785d + "'", double1 == 0.007414768657038785d);
    }

    @Test
    public void test6217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6217");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-5L), (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test6218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6218");
        long long2 = org.apache.commons.math.util.FastMath.min(51L, 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test6219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6219");
        double double1 = org.apache.commons.math.util.FastMath.abs(206762.68551422175d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 206762.68551422175d + "'", double1 == 206762.68551422175d);
    }

    @Test
    public void test6220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6220");
        double double1 = org.apache.commons.math.util.FastMath.atanh(100.0000000000002d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6221");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.994092364175252d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9970418066336296d + "'", double1 == 0.9970418066336296d);
    }

    @Test
    public void test6222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6222");
        long long1 = org.apache.commons.math.util.FastMath.round(1.5707963267947314d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test6223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6223");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.598966569616076d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6224");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.8950841726012685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6392632558071726d + "'", double1 == 0.6392632558071726d);
    }

    @Test
    public void test6225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6225");
        double double2 = org.apache.commons.math.util.FastMath.atan2(97.60631798402139d, 4.176086084439524d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5280374072983534d + "'", double2 == 1.5280374072983534d);
    }

    @Test
    public void test6226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6226");
        int int2 = org.apache.commons.math.util.FastMath.min(49, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test6227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6227");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.3788396218579066d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.14536475001366d + "'", double1 == 5.14536475001366d);
    }

    @Test
    public void test6228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6228");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.0588134251582075E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6543612251060553E-24d + "'", double1 == 1.6543612251060553E-24d);
    }

    @Test
    public void test6229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6229");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6230");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.0386718545681077d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.018128243710009186d + "'", double1 == 0.018128243710009186d);
    }

    @Test
    public void test6231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6231");
        double double2 = org.apache.commons.math.util.FastMath.atan2(7.091500380984786E248d, 1.5691842460354224d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test6232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6232");
        long long2 = org.apache.commons.math.util.FastMath.max(2005L, 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
    }

    @Test
    public void test6233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6233");
        double double1 = org.apache.commons.math.util.FastMath.floor(4.810477380965351d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test6234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6234");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.44403286888919763d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4178805902828283d) + "'", double1 == (-0.4178805902828283d));
    }

    @Test
    public void test6235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6235");
        int int1 = org.apache.commons.math.util.FastMath.round(105.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 105 + "'", int1 == 105);
    }

    @Test
    public void test6236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6236");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.15480950261479168d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15419188287794433d + "'", double1 == 0.15419188287794433d);
    }

    @Test
    public void test6237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6237");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8143865674904548d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6191249712398811d + "'", double1 == 0.6191249712398811d);
    }

    @Test
    public void test6238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6238");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.2326176679819249d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6239");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.37799345256664757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36952607968973683d + "'", double1 == 0.36952607968973683d);
    }

    @Test
    public void test6240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6240");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.5422402091037605d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.997695297953666d + "'", double1 == 0.997695297953666d);
    }

    @Test
    public void test6241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6241");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.368646920020492d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.930029452077895d + "'", double1 == 2.930029452077895d);
    }

    @Test
    public void test6242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6242");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5209620005493156d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6243");
        double double1 = org.apache.commons.math.util.FastMath.log(5.564318773958797E35d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 82.30685281944005d + "'", double1 == 82.30685281944005d);
    }

    @Test
    public void test6244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6244");
        double double2 = org.apache.commons.math.util.FastMath.max(6.369992654280958d, 0.8721824073781502d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.369992654280958d + "'", double2 == 6.369992654280958d);
    }

    @Test
    public void test6245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6245");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 83L, (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test6246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6246");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-1.9911123324751505E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.9911123193187822E-4d) + "'", double1 == (-1.9911123193187822E-4d));
    }

    @Test
    public void test6247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6247");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.0149280275816273d, 0.020377724655755693d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5507210244087797d + "'", double2 == 1.5507210244087797d);
    }

    @Test
    public void test6248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6248");
        double double1 = org.apache.commons.math.util.FastMath.expm1(564.2970990100332d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.177921243040191E245d + "'", double1 == 1.177921243040191E245d);
    }

    @Test
    public void test6249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6249");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-1.0626395431802995d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6197711425174752d + "'", double1 == 1.6197711425174752d);
    }

    @Test
    public void test6250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6250");
        long long2 = org.apache.commons.math.util.FastMath.min(3280L, 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test6251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6251");
        float float1 = org.apache.commons.math.util.FastMath.abs(105.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 105.0f + "'", float1 == 105.0f);
    }

    @Test
    public void test6252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6252");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-1.5424779567514729E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5424779445183978E-4d) + "'", double1 == (-1.5424779445183978E-4d));
    }

    @Test
    public void test6253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6253");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.20637502874300212d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.20351781291274756d) + "'", double1 == (-0.20351781291274756d));
    }

    @Test
    public void test6254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6254");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.18425105161950944d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18425105161950947d + "'", double1 == 0.18425105161950947d);
    }

    @Test
    public void test6255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6255");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-1.7728390278240145d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6256");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.3669495678698107d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8324353015373301d + "'", double1 == 0.8324353015373301d);
    }

    @Test
    public void test6257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6257");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.392273267448764d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.392273267448764d + "'", double1 == 1.392273267448764d);
    }

    @Test
    public void test6258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6258");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 105, (float) 3);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 105.0f + "'", float2 == 105.0f);
    }

    @Test
    public void test6259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6259");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.0096275915360662d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8466337164655859d + "'", double1 == 0.8466337164655859d);
    }

    @Test
    public void test6260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6260");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) 32L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test6261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6261");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 0L, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test6262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6262");
        double double2 = org.apache.commons.math.util.FastMath.min(0.8657268681115803d, 0.7798115718222199d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7798115718222199d + "'", double2 == 0.7798115718222199d);
    }

    @Test
    public void test6263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6263");
        long long2 = org.apache.commons.math.util.FastMath.min(105L, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test6264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6264");
        double double1 = org.apache.commons.math.util.FastMath.log1p(10.000000004122308d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.397895273173126d + "'", double1 == 2.397895273173126d);
    }

    @Test
    public void test6265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6265");
        double double2 = org.apache.commons.math.util.FastMath.atan2(52.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test6266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6266");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.1415649026741144d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0100370564557222d + "'", double1 == 1.0100370564557222d);
    }

    @Test
    public void test6267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6267");
        float float2 = org.apache.commons.math.util.FastMath.min(6559.0f, (float) 83);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 83.0f + "'", float2 == 83.0f);
    }

    @Test
    public void test6268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6268");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(6.176458219595615E-4d, 0.47704875198110924d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.176458219595616E-4d + "'", double2 == 6.176458219595616E-4d);
    }

    @Test
    public void test6269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6269");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.9899924966004454d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017278628635716543d) + "'", double1 == (-0.017278628635716543d));
    }

    @Test
    public void test6270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6270");
        double double1 = org.apache.commons.math.util.FastMath.cos(9.306852821501208d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9930548847904904d) + "'", double1 == (-0.9930548847904904d));
    }

    @Test
    public void test6271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6271");
        float float2 = org.apache.commons.math.util.FastMath.min(2.14748365E9f, (float) 52L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test6272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6272");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.11765201143093872d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11819941115277124d + "'", double1 == 0.11819941115277124d);
    }

    @Test
    public void test6273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6273");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.5737618316160398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027467325603916487d + "'", double1 == 0.027467325603916487d);
    }

    @Test
    public void test6274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6274");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.03602212401092414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03603771279247703d + "'", double1 == 0.03603771279247703d);
    }

    @Test
    public void test6275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6275");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.19068994544354323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test6276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6276");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.7503427504189538d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7314551939292051d + "'", double1 == 0.7314551939292051d);
    }

    @Test
    public void test6277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6277");
        double double1 = org.apache.commons.math.util.FastMath.floor(48.077009884937624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 48.0d + "'", double1 == 48.0d);
    }

    @Test
    public void test6278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6278");
        float float2 = org.apache.commons.math.util.FastMath.max(5.0f, (float) 51);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 51.0f + "'", float2 == 51.0f);
    }

    @Test
    public void test6279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6279");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.845722884619519d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6280");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(199.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 199.00000000000003d + "'", double1 == 199.00000000000003d);
    }

    @Test
    public void test6281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6281");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.13025531550365874d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13062648470876106d + "'", double1 == 0.13062648470876106d);
    }

    @Test
    public void test6282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6282");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.4402630249707292d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5531156729965456d + "'", double1 == 1.5531156729965456d);
    }

    @Test
    public void test6283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6283");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.225431076931693E-25d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.225431076931693E-25d + "'", double1 == 1.225431076931693E-25d);
    }

    @Test
    public void test6284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6284");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(7.115667445692609d, 10.455610055638118d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.11566744569261d + "'", double2 == 7.11566744569261d);
    }

    @Test
    public void test6285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6285");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 2147483647L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.14748365E9f + "'", float1 == 2.14748365E9f);
    }

    @Test
    public void test6286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6286");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.6900198725289799d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8092798182143429d + "'", double1 == 0.8092798182143429d);
    }

    @Test
    public void test6287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6287");
        double double1 = org.apache.commons.math.util.FastMath.ceil(75.50485840007525d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 76.0d + "'", double1 == 76.0d);
    }

    @Test
    public void test6288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6288");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test6289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6289");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.5708920866202177d), 0.5221439448055225d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5221439448055225d + "'", double2 == 0.5221439448055225d);
    }

    @Test
    public void test6290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6290");
        double double1 = org.apache.commons.math.util.FastMath.atanh(3.5251431659552352d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6291");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.1912543356541123d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.020791310385821937d + "'", double1 == 0.020791310385821937d);
    }

    @Test
    public void test6292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6292");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, 6559L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6559L + "'", long2 == 6559L);
    }

    @Test
    public void test6293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6293");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.23923049735223084d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.234768790567349d + "'", double1 == 0.234768790567349d);
    }

    @Test
    public void test6294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6294");
        float float2 = org.apache.commons.math.util.FastMath.min(3.0f, (float) 49);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test6295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6295");
        long long1 = org.apache.commons.math.util.FastMath.round(0.5856304902609806d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test6296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6296");
        double double1 = org.apache.commons.math.util.FastMath.sin(3.013549154926294d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12769390357407567d + "'", double1 == 0.12769390357407567d);
    }

    @Test
    public void test6297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6297");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.4422495703074083d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2302012565517866d + "'", double1 == 3.2302012565517866d);
    }

    @Test
    public void test6298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6298");
        long long2 = org.apache.commons.math.util.FastMath.max(105L, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 105L + "'", long2 == 105L);
    }

    @Test
    public void test6299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6299");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.27799377989205787d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test6300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6300");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.5685262033089267d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6301");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.1612398348874445d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6302");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5293379817723d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6303");
        double double2 = org.apache.commons.math.util.FastMath.max(3.1622776601683795d, 0.8135279227115655d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622776601683795d + "'", double2 == 3.1622776601683795d);
    }

    @Test
    public void test6304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6304");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.0713634642907175d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6305");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.000000000000014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000069d + "'", double1 == 1.0000000000000069d);
    }

    @Test
    public void test6306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6306");
        double double1 = org.apache.commons.math.util.FastMath.rint(4.1247888682360925d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test6307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6307");
        double double1 = org.apache.commons.math.util.FastMath.asin(4.6953521612866584E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.6953521630119134E-5d + "'", double1 == 4.6953521630119134E-5d);
    }

    @Test
    public void test6308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6308");
        int int2 = org.apache.commons.math.util.FastMath.min(51, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6309");
        double double1 = org.apache.commons.math.util.FastMath.tan(286.4788975654116d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6753150753495823d + "'", double1 == 0.6753150753495823d);
    }

    @Test
    public void test6310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6310");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.6105647004975029d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.010656364320134486d + "'", double1 == 0.010656364320134486d);
    }

    @Test
    public void test6311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6311");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.28354302476765203d, 0.7727985235349918d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.35165416171574404d + "'", double2 == 0.35165416171574404d);
    }

    @Test
    public void test6312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6312");
        double double1 = org.apache.commons.math.util.FastMath.tan((-5.377465624848392d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.275068378811894d + "'", double1 == 1.275068378811894d);
    }

    @Test
    public void test6313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6313");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.116664850797739d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11692967909428997d + "'", double1 == 0.11692967909428997d);
    }

    @Test
    public void test6314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6314");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 6559, (long) 2005);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6559L + "'", long2 == 6559L);
    }

    @Test
    public void test6315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6315");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.026006127044727836d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.026009059342003336d + "'", double1 == 0.026009059342003336d);
    }

    @Test
    public void test6316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6316");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.8096121846576995d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3460335024784023d + "'", double1 == 1.3460335024784023d);
    }

    @Test
    public void test6317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6317");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8473618503113074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.132294165874122d + "'", double1 == 1.132294165874122d);
    }

    @Test
    public void test6318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6318");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.957286991855198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6319");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.11889592015824525d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6320");
        long long1 = org.apache.commons.math.util.FastMath.round(1.3440585709080678E43d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test6321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6321");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.23923049735223084d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6207816168525839d + "'", double1 == 0.6207816168525839d);
    }

    @Test
    public void test6322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6322");
        double double2 = org.apache.commons.math.util.FastMath.max(1.9073465724950998E21d, 0.9736488930495181d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9073465724950998E21d + "'", double2 == 1.9073465724950998E21d);
    }

    @Test
    public void test6323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6323");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 1.1077652784594167d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test6324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6324");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.1593112136080739d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6325");
        int int2 = org.apache.commons.math.util.FastMath.min(52, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test6326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6326");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.1175823681357508E-22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1175823681357508E-22d + "'", double1 == 2.1175823681357508E-22d);
    }

    @Test
    public void test6327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6327");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.7380632774182745d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7380632774182745d + "'", double1 == 0.7380632774182745d);
    }

    @Test
    public void test6328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6328");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2147483647L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test6329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6329");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7357191005950772d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6265517742228647d + "'", double1 == 0.6265517742228647d);
    }

    @Test
    public void test6330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6330");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9599742401453462d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6331");
        double double1 = org.apache.commons.math.util.FastMath.ulp(25.339410356026747d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.552713678800501E-15d + "'", double1 == 3.552713678800501E-15d);
    }

    @Test
    public void test6332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6332");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.19546435506906037d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6333");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(9.999999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.154434690031884d + "'", double1 == 2.154434690031884d);
    }

    @Test
    public void test6334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6334");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.4534321422024404E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4534321422024404E-7d + "'", double1 == 1.4534321422024404E-7d);
    }

    @Test
    public void test6335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6335");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.6023002278876782d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8263149130273308d + "'", double1 == 1.8263149130273308d);
    }

    @Test
    public void test6336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6336");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.999973512128498d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.999973512128498d + "'", double1 == 0.999973512128498d);
    }

    @Test
    public void test6337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6337");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 0, (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test6338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6338");
        double double2 = org.apache.commons.math.util.FastMath.atan2(11013.232874703393d, (-0.6723302958523574d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5708573742913643d + "'", double2 == 1.5708573742913643d);
    }

    @Test
    public void test6339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6339");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.39707373807201474d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4874656088536904d + "'", double1 == 1.4874656088536904d);
    }

    @Test
    public void test6340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6340");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.460094597035771d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6341");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9030746578456205d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9030746578456206d + "'", double1 == 0.9030746578456206d);
    }

    @Test
    public void test6342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6342");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-7.47197233734299E-43d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.471972337342989E-43d) + "'", double1 == (-7.471972337342989E-43d));
    }

    @Test
    public void test6343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6343");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9970418066336296d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6344");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(50.50495049504951d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8814776746953541d + "'", double1 == 0.8814776746953541d);
    }

    @Test
    public void test6345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6345");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.024918450020804752d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02491587133552733d + "'", double1 == 0.02491587133552733d);
    }

    @Test
    public void test6346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6346");
        double double1 = org.apache.commons.math.util.FastMath.acos(31.99188518905606d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6347");
        double double1 = org.apache.commons.math.util.FastMath.log(9.07998609361042E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9.306852803898902d) + "'", double1 == (-9.306852803898902d));
    }

    @Test
    public void test6348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6348");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.2737367544325796E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2737367544325796E-13d + "'", double1 == 2.2737367544325796E-13d);
    }

    @Test
    public void test6349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6349");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.770170914020331d, 0.1417162261588426d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9636682570456343d + "'", double2 == 0.9636682570456343d);
    }

    @Test
    public void test6350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6350");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.29256028373530374d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005106140211749865d + "'", double1 == 0.005106140211749865d);
    }

    @Test
    public void test6351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6351");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.9992790497916413d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.23494048220588d) + "'", double1 == (-7.23494048220588d));
    }

    @Test
    public void test6352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6352");
        int int2 = org.apache.commons.math.util.FastMath.max(1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test6353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6353");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.5154762810024204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 29.534615340538345d + "'", double1 == 29.534615340538345d);
    }

    @Test
    public void test6354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6354");
        int int2 = org.apache.commons.math.util.FastMath.min(3, 6559);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test6355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6355");
        double double1 = org.apache.commons.math.util.FastMath.atan(120.04229369805482d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5624661221785252d + "'", double1 == 1.5624661221785252d);
    }

    @Test
    public void test6356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6356");
        double double1 = org.apache.commons.math.util.FastMath.log(1.0232263688840315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.022960741947332802d + "'", double1 == 0.022960741947332802d);
    }

    @Test
    public void test6357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6357");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.8280082726548263d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6358");
        float float2 = org.apache.commons.math.util.FastMath.min(1.0f, (float) 35);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test6359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6359");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.290774892867231d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test6360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6360");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.64236324311418d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.64236324311418d + "'", double1 == 1.64236324311418d);
    }

    @Test
    public void test6361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6361");
        double double1 = org.apache.commons.math.util.FastMath.sinh(100.00000000000011d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709082206E43d + "'", double1 == 1.3440585709082206E43d);
    }

    @Test
    public void test6362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6362");
        double double1 = org.apache.commons.math.util.FastMath.log10(11.510506427637088d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.061094431700155d + "'", double1 == 1.061094431700155d);
    }

    @Test
    public void test6363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6363");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.9704971179648552d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test6364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6364");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 1, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test6365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6365");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.1057044739884163d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4899326697744564d + "'", double1 == 1.4899326697744564d);
    }

    @Test
    public void test6366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6366");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.809901974824097d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6367");
        double double1 = org.apache.commons.math.util.FastMath.cos(23.7549757129616d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1918342922844061d + "'", double1 == 0.1918342922844061d);
    }

    @Test
    public void test6368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6368");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9725420682979977d, 27.289917197127753d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9725420682979978d + "'", double2 == 0.9725420682979978d);
    }

    @Test
    public void test6369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6369");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) 36.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6109179126442243d + "'", double1 == 3.6109179126442243d);
    }

    @Test
    public void test6370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6370");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.5707960187421175d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6371");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.5856304902609806d, 1.006536307406899d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5835859084746703d + "'", double2 == 0.5835859084746703d);
    }

    @Test
    public void test6372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6372");
        double double2 = org.apache.commons.math.util.FastMath.max(0.29403979995923674d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.29403979995923674d + "'", double2 == 0.29403979995923674d);
    }

    @Test
    public void test6373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6373");
        double double1 = org.apache.commons.math.util.FastMath.ceil(7.63507874715665E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6374");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.4597216805978954E218d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test6375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6375");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9388149908366095d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6376");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.6645457244960807d), 1.3440585709082206E43d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6645457244960806d) + "'", double2 == (-0.6645457244960806d));
    }

    @Test
    public void test6377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6377");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.44443064002423105d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4299439001711639d) + "'", double1 == (-0.4299439001711639d));
    }

    @Test
    public void test6378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6378");
        long long1 = org.apache.commons.math.util.FastMath.round(0.8529152450684337d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test6379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6379");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.7668694253884004E30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.08712786030770052d) + "'", double1 == (-0.08712786030770052d));
    }

    @Test
    public void test6380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6380");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.3876206984207269d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test6381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6381");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 51, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 51L + "'", long2 == 51L);
    }

    @Test
    public void test6382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6382");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.9999999999999999d), 1.5704558603240033d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5704558603240033d + "'", double2 == 1.5704558603240033d);
    }

    @Test
    public void test6383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6383");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test6384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6384");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.1259469553800836d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6385");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7233912473191666d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6190055256400776d + "'", double1 == 0.6190055256400776d);
    }

    @Test
    public void test6386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6386");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6881171418161356E43d + "'", double1 == 2.6881171418161356E43d);
    }

    @Test
    public void test6387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6387");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.002653751905632d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7255050541267343d + "'", double1 == 2.7255050541267343d);
    }

    @Test
    public void test6388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6388");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.310462728666588E109d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6389");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 1, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test6390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6390");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.3376075000685986d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6391");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.026009059342003336d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5447843341634189d + "'", double1 == 1.5447843341634189d);
    }

    @Test
    public void test6392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6392");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9866275920404853d + "'", double1 == 0.9866275920404853d);
    }

    @Test
    public void test6393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6393");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-3.15066975380865d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.996339020316476d) + "'", double1 == (-0.996339020316476d));
    }

    @Test
    public void test6394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6394");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.7609889586512912d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test6395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6395");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.16601303451652813d, 0.4308194525790353d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.46134103366334883d + "'", double2 == 0.46134103366334883d);
    }

    @Test
    public void test6396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6396");
        double double1 = org.apache.commons.math.util.FastMath.asin(52.32176750100173d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6397");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.9992790497916413d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-57.25447210890429d) + "'", double1 == (-57.25447210890429d));
    }

    @Test
    public void test6398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6398");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test6399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6399");
        long long1 = org.apache.commons.math.util.FastMath.round((-1.9911123324751505E-4d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test6400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6400");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9567066132883968d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6031092951738333d + "'", double1 == 1.6031092951738333d);
    }

    @Test
    public void test6401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6401");
        int int2 = org.apache.commons.math.util.FastMath.max(97, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test6402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6402");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5900247258946039d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6403");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 10, 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test6404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6404");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.770170914020331d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3115346796568936d + "'", double1 == 1.3115346796568936d);
    }

    @Test
    public void test6405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6405");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(4.6953521630119134E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.006852263978432175d + "'", double1 == 0.006852263978432175d);
    }

    @Test
    public void test6406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6406");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.8770365420904747d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.05698231119766517d) + "'", double1 == (-0.05698231119766517d));
    }

    @Test
    public void test6407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6407");
        int int2 = org.apache.commons.math.util.FastMath.max(3, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test6408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6408");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.0025158823581013d, (double) 49);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1310240014968689d + "'", double2 == 1.1310240014968689d);
    }

    @Test
    public void test6409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6409");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.0001081203235103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7854522206368076d + "'", double1 == 0.7854522206368076d);
    }

    @Test
    public void test6410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6410");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9625660398138892d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9811044999457954d + "'", double1 == 0.9811044999457954d);
    }

    @Test
    public void test6411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6411");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.281588225835499d), (double) 105);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.6200245992721704E-58d) + "'", double2 == (-1.6200245992721704E-58d));
    }

    @Test
    public void test6412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6412");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.1077652784594167d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0275850194920664d + "'", double1 == 2.0275850194920664d);
    }

    @Test
    public void test6413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6413");
        double double1 = org.apache.commons.math.util.FastMath.abs(299669.7281315037d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 299669.7281315037d + "'", double1 == 299669.7281315037d);
    }

    @Test
    public void test6414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6414");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.015373606509534388d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12399034845315335d + "'", double1 == 0.12399034845315335d);
    }

    @Test
    public void test6415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6415");
        float float2 = org.apache.commons.math.util.FastMath.min((float) '#', 5.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test6416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6416");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.7182818284590833d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6417");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.14156490267411437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.111071450407014d + "'", double1 == 8.111071450407014d);
    }

    @Test
    public void test6418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6418");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.8068919472776069d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6789292437696473d + "'", double1 == 0.6789292437696473d);
    }

    @Test
    public void test6419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6419");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.6305279291448225d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6420");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.4272329713310417d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4030062718424735d + "'", double1 == 0.4030062718424735d);
    }

    @Test
    public void test6421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6421");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.3843321925803553d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3843321925803553d + "'", double1 == 1.3843321925803553d);
    }

    @Test
    public void test6422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6422");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.6576913458149568d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8530464537403997d + "'", double1 == 0.8530464537403997d);
    }

    @Test
    public void test6423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6423");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.8656100066608416d), 0.7436495683290354d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8610402434243729d) + "'", double2 == (-0.8610402434243729d));
    }

    @Test
    public void test6424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6424");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-1L), (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test6425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6425");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.7048856958893577d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01230257624348075d + "'", double1 == 0.01230257624348075d);
    }

    @Test
    public void test6426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6426");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.3342339022745425d), 0.00952904024195853d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.00952904024195853d + "'", double2 == 0.00952904024195853d);
    }

    @Test
    public void test6427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6427");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.630377532196417d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test6428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6428");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.2844895915767354d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6429");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.5566682095218779d, 1.5430806348152437d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.40498110632809253d + "'", double2 == 0.40498110632809253d);
    }

    @Test
    public void test6430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6430");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.24256291304290128d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24494852324295546d + "'", double1 == 0.24494852324295546d);
    }

    @Test
    public void test6431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6431");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.5713386007872874d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4519278680595284d + "'", double1 == 0.4519278680595284d);
    }

    @Test
    public void test6432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6432");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.3537560226829597d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36929085574486303d + "'", double1 == 0.36929085574486303d);
    }

    @Test
    public void test6433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6433");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.021927125068741424d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02169018304413586d + "'", double1 == 0.02169018304413586d);
    }

    @Test
    public void test6434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6434");
        double double1 = org.apache.commons.math.util.FastMath.atanh(8.673617379884035E-19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.673617379884035E-19d + "'", double1 == 8.673617379884035E-19d);
    }

    @Test
    public void test6435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6435");
        double double1 = org.apache.commons.math.util.FastMath.cosh(99.99999999999996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080104E43d + "'", double1 == 1.3440585709080104E43d);
    }

    @Test
    public void test6436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6436");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.082130173350885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9958022819838644d + "'", double1 == 0.9958022819838644d);
    }

    @Test
    public void test6437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6437");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.9588076367332303d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5975643993690379d + "'", double1 == 0.5975643993690379d);
    }

    @Test
    public void test6438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6438");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.5063788250893344d), 0.14782604738794858d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.2867615903564353d) + "'", double2 == (-1.2867615903564353d));
    }

    @Test
    public void test6439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6439");
        double double2 = org.apache.commons.math.util.FastMath.max(4.158638853279167d, 33.68761959437813d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 33.68761959437813d + "'", double2 == 33.68761959437813d);
    }

    @Test
    public void test6440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6440");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.938806681754034d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7538462758109956d + "'", double1 == 0.7538462758109956d);
    }

    @Test
    public void test6441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6441");
        double double1 = org.apache.commons.math.util.FastMath.atan(58.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5535566556003668d + "'", double1 == 1.5535566556003668d);
    }

    @Test
    public void test6442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6442");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8675168507333922d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9804989946001318d + "'", double1 == 0.9804989946001318d);
    }

    @Test
    public void test6443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6443");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.6214949279424251d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8617090835295915d + "'", double1 == 0.8617090835295915d);
    }

    @Test
    public void test6444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6444");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.008879097553696258d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.008879097553696258d + "'", double1 == 0.008879097553696258d);
    }

    @Test
    public void test6445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6445");
        long long1 = org.apache.commons.math.util.FastMath.round(1.2952631549714642d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test6446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6446");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.7816340724367478d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7044401639552135d) + "'", double1 == (-0.7044401639552135d));
    }

    @Test
    public void test6447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6447");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9034979604694945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.10148142631876089d) + "'", double1 == (-0.10148142631876089d));
    }

    @Test
    public void test6448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6448");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.47704875198110924d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4953498621566668d + "'", double1 == 0.4953498621566668d);
    }

    @Test
    public void test6449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6449");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9903114875094028d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6450");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.009529472907515197d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6632067821573728E-4d + "'", double1 == 1.6632067821573728E-4d);
    }

    @Test
    public void test6451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6451");
        int int2 = org.apache.commons.math.util.FastMath.min(2005, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test6452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6452");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.5209620005493156d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9891816798317401d + "'", double1 == 0.9891816798317401d);
    }

    @Test
    public void test6453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6453");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.1059577627892154d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6454");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) (short) 0, 7.63507874715665E-9d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test6455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6455");
        int int2 = org.apache.commons.math.util.FastMath.max(5, (-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test6456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6456");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.5594482377087571d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.160615567051236d + "'", double1 == 1.160615567051236d);
    }

    @Test
    public void test6457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6457");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.219379580148095d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9388859709502797d + "'", double1 == 0.9388859709502797d);
    }

    @Test
    public void test6458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6458");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.5781356913552533d, (-0.4089365307134184d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5781356913552531d + "'", double2 == 1.5781356913552531d);
    }

    @Test
    public void test6459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6459");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.8221857156655815d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0850300727533154d) + "'", double1 == (-0.0850300727533154d));
    }

    @Test
    public void test6460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6460");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.1474089466969337d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6461");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.5160141294778328d), 1.000000000000014d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5160141294778327d) + "'", double2 == (-0.5160141294778327d));
    }

    @Test
    public void test6462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6462");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.001600346789795746d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04000433463758329d + "'", double1 == 0.04000433463758329d);
    }

    @Test
    public void test6463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6463");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.2386752917259769d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24100148938087304d + "'", double1 == 0.24100148938087304d);
    }

    @Test
    public void test6464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6464");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.4937744707606272d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6465");
        double double1 = org.apache.commons.math.util.FastMath.exp(1219.0943964290645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test6466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6466");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9988116486579154d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017432551876353425d + "'", double1 == 0.017432551876353425d);
    }

    @Test
    public void test6467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6467");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.5314789170422551d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5314789170422554d + "'", double1 == 1.5314789170422554d);
    }

    @Test
    public void test6468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6468");
        double double1 = org.apache.commons.math.util.FastMath.atan(3.021362533392777E-54d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.021362533392777E-54d + "'", double1 == 3.021362533392777E-54d);
    }

    @Test
    public void test6469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6469");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.8807733836535281d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6470");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.5775745178565562d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.759983235247039d + "'", double1 == 0.759983235247039d);
    }

    @Test
    public void test6471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6471");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.2604124669171584d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6216694271519259d + "'", double1 == 1.6216694271519259d);
    }

    @Test
    public void test6472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6472");
        double double1 = org.apache.commons.math.util.FastMath.sin(118.70146570951638d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6280580358907252d) + "'", double1 == (-0.6280580358907252d));
    }

    @Test
    public void test6473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6473");
        int int1 = org.apache.commons.math.util.FastMath.abs(6559);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6559 + "'", int1 == 6559);
    }

    @Test
    public void test6474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6474");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.11078857541188204d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.11078857541188203d) + "'", double1 == (-0.11078857541188203d));
    }

    @Test
    public void test6475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6475");
        float float2 = org.apache.commons.math.util.FastMath.max(51.0f, 105.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 105.0f + "'", float2 == 105.0f);
    }

    @Test
    public void test6476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6476");
        double double1 = org.apache.commons.math.util.FastMath.expm1(4.641588833612778d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 102.70899308565293d + "'", double1 == 102.70899308565293d);
    }

    @Test
    public void test6477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6477");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.7763568394002505E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test6478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6478");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '#', 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test6479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6479");
        double double1 = org.apache.commons.math.util.FastMath.log((-1.5495411464777387d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6480");
        float float2 = org.apache.commons.math.util.FastMath.max((float) ' ', 9.223372E18f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test6481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6481");
        double double1 = org.apache.commons.math.util.FastMath.tan(98.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6998536538095259d + "'", double1 == 0.6998536538095259d);
    }

    @Test
    public void test6482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6482");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9130789561495836d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9130789561495837d + "'", double1 == 0.9130789561495837d);
    }

    @Test
    public void test6483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6483");
        double double1 = org.apache.commons.math.util.FastMath.cos(12.019343107182594d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8540744374799352d + "'", double1 == 0.8540744374799352d);
    }

    @Test
    public void test6484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6484");
        int int2 = org.apache.commons.math.util.FastMath.min(3, 51);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test6485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6485");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.014886179266898497d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000110801212674d + "'", double1 == 1.000110801212674d);
    }

    @Test
    public void test6486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6486");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.5188709009619294d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 19.24107645593106d + "'", double1 == 19.24107645593106d);
    }

    @Test
    public void test6487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6487");
        int int2 = org.apache.commons.math.util.FastMath.max(41, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 41 + "'", int2 == 41);
    }

    @Test
    public void test6488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6488");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.44104337593103254d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6489");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.047442967903742035d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0474074204641584d + "'", double1 == 0.0474074204641584d);
    }

    @Test
    public void test6490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6490");
        long long1 = org.apache.commons.math.util.FastMath.abs(83L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 83L + "'", long1 == 83L);
    }

    @Test
    public void test6491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6491");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1350.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test6492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6492");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.8021880834897168d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9309509414934176d + "'", double1 == 0.9309509414934176d);
    }

    @Test
    public void test6493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6493");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(87.86797250243188d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5034.463978760918d + "'", double1 == 5034.463978760918d);
    }

    @Test
    public void test6494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6494");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.2516432336066267d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.24906032356353255d) + "'", double1 == (-0.24906032356353255d));
    }

    @Test
    public void test6495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6495");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.8918074856677578d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015564976918834515d + "'", double1 == 0.015564976918834515d);
    }

    @Test
    public void test6496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6496");
        double double2 = org.apache.commons.math.util.FastMath.max(1.009088214590764d, 0.7603964251352016d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.009088214590764d + "'", double2 == 1.009088214590764d);
    }

    @Test
    public void test6497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6497");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.059903262040248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test6498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6498");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9791014009461632d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7748389154868989d + "'", double1 == 0.7748389154868989d);
    }

    @Test
    public void test6499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6499");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.000110801212674d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000036932373541d + "'", double1 == 1.000036932373541d);
    }

    @Test
    public void test6500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6500");
        int int2 = org.apache.commons.math.util.FastMath.min((-1), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }
}

