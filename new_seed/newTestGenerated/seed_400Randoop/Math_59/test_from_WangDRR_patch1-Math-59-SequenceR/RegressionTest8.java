import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

    public static boolean debug = false;

    @Test
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.5006478239302304d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.7742732308037816d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8799279690996199d + "'", double1 == 0.8799279690996199d);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.1478260473879486d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0109461818722032d + "'", double1 == 1.0109461818722032d);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.054822099620526d, 0.8052085614665847d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0548220996205258d + "'", double2 == 2.0548220996205258d);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.40517925701617413d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4298300354182664d) + "'", double1 == (-0.4298300354182664d));
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8797735902569003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2091065616223926d + "'", double1 == 1.2091065616223926d);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.5334825240161821d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5334825240161821d) + "'", double2 == (-0.5334825240161821d));
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(9.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.080083823051904d + "'", double1 == 2.080083823051904d);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 3L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        int int2 = org.apache.commons.math.util.FastMath.max((-1), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 4);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 4L, 3.9481478E13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.9481478E13f + "'", float2 == 3.9481478E13f);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.3844732404433468d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1761591916756073d + "'", double1 == 1.1761591916756073d);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9999997749296757d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.0588134251582075E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0588134251582076E-8d + "'", double1 == 1.0588134251582076E-8d);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(3279.925622497139d, (-1.6571064922358931d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3279.9256224971386d + "'", double2 == 3279.9256224971386d);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        double double1 = org.apache.commons.math.util.FastMath.atanh(20.938628468106426d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.017453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.223372E18f + "'", float1 == 9.223372E18f);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.7612912090796752d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.004619531120223835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0046302176032862d + "'", double1 == 1.0046302176032862d);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.8842201103634084d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7970917298292344d + "'", double1 == 0.7970917298292344d);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.295263154971464d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1380962854571945d + "'", double1 == 1.1380962854571945d);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        double double1 = org.apache.commons.math.util.FastMath.tan(7072.591881122252d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1777006370537189d + "'", double1 == 1.1777006370537189d);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.38818646476211366d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4109596116102156d) + "'", double1 == (-0.4109596116102156d));
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        double double1 = org.apache.commons.math.util.FastMath.atanh(7.951386703658792E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.951386703658792E-16d + "'", double1 == 7.951386703658792E-16d);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 2005, (long) 36);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 36L + "'", long2 == 36L);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        long long2 = org.apache.commons.math.util.FastMath.max(1L, 83L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 83L + "'", long2 == 83L);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        double double2 = org.apache.commons.math.util.FastMath.min(1.5567229026732161d, 27.289917197127753d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5567229026732161d + "'", double2 == 1.5567229026732161d);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-5.377465624848392d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.09385448056641864d) + "'", double1 == (-0.09385448056641864d));
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.1598639151884341d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1612398348874445d) + "'", double1 == (-0.1612398348874445d));
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 1, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        double double1 = org.apache.commons.math.util.FastMath.asinh(58.46336191912694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.761620581534833d + "'", double1 == 4.761620581534833d);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8770365420904747d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2023903267012446d + "'", double1 == 1.2023903267012446d);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.766302783569967d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.151795873695697d + "'", double1 == 2.151795873695697d);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 10, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.6912193154397878d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.763174989259044d) + "'", double1 == (-0.763174989259044d));
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 52, (float) 32L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.3923993423012373d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0779815808758473d + "'", double1 == 1.0779815808758473d);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 3, 52.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017453292519943295d + "'", double1 == 0.017453292519943295d);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 52, (float) 49L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        int int1 = org.apache.commons.math.util.FastMath.abs(4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.012097700501686678d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5586983311819098d + "'", double1 == 1.5586983311819098d);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        int int2 = org.apache.commons.math.util.FastMath.min(1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.653029967135041E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.471164052548702E-12d + "'", double1 == 9.471164052548702E-12d);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.5119471234779015d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.008935162900803345d + "'", double1 == 0.008935162900803345d);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        double double1 = org.apache.commons.math.util.FastMath.log10((-1.570796326794879d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.2111828491680883d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2080984037677835d + "'", double1 == 0.2080984037677835d);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.834032445247956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7406467636856449d + "'", double1 == 0.7406467636856449d);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        long long2 = org.apache.commons.math.util.FastMath.min(2L, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.570796326794896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.0068699188553262855d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.006846374908639821d) + "'", double1 == (-0.006846374908639821d));
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7037760017056153d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.606759086334487d + "'", double1 == 0.606759086334487d);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.837589179357618E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.3025850929940463d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36221568869946336d + "'", double1 == 0.36221568869946336d);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 5L, 97.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2147483647L, (float) 2);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        float float2 = org.apache.commons.math.util.FastMath.max((float) '#', 4.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.7317114834832754d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8554013581256903d + "'", double1 == 0.8554013581256903d);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        double double2 = org.apache.commons.math.util.FastMath.max(1.9943400969063074d, 1133.3738086310673d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1133.3738086310673d + "'", double2 == 1133.3738086310673d);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(3.082130173350885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7555996620388388d + "'", double1 == 1.7555996620388388d);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        double double2 = org.apache.commons.math.util.FastMath.max(171.0d, 4.6151205168412615d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 171.0d + "'", double2 == 171.0d);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        long long2 = org.apache.commons.math.util.FastMath.min(4L, 83L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.6991570920917849d, 0.7050189848914605d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7812235738686848d + "'", double2 == 0.7812235738686848d);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.8542643515376653d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3876206984207269d + "'", double1 == 1.3876206984207269d);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(7.635078747156649E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.63507874715665E-9d + "'", double1 == 7.63507874715665E-9d);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        double double1 = org.apache.commons.math.util.FastMath.tanh(8.875921921551335d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999609606873d + "'", double1 == 0.9999999609606873d);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.31939525110418027d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(7.370686677641593d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.370686677641594d + "'", double1 == 7.370686677641594d);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 100, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        double double1 = org.apache.commons.math.util.FastMath.atan(3.5019296225954823d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2926422254903027d + "'", double1 == 1.2926422254903027d);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.3025057412487842d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7033263753983814d + "'", double1 == 1.7033263753983814d);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.5496008503596722d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7325613286016606d + "'", double1 == 0.7325613286016606d);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9199653037215055d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3131691680118311d + "'", double1 == 1.3131691680118311d);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.011408233318727529d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.7380632774182745d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6279736133602432d) + "'", double1 == (-0.6279736133602432d));
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        long long1 = org.apache.commons.math.util.FastMath.round(0.8842201103634084d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        double double1 = org.apache.commons.math.util.FastMath.acos(3.9481480091340625E13d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        double double1 = org.apache.commons.math.util.FastMath.log(1.5607966601082315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4451963704655766d + "'", double1 == 0.4451963704655766d);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.123919126120245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.123919126120245d + "'", double1 == 1.123919126120245d);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9385078997951388d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.016380052907402187d + "'", double1 == 0.016380052907402187d);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 2147483647L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.1344439571520295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 100, (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.6876964991326107d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.11663410139203768d) + "'", double1 == (-0.11663410139203768d));
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        int int2 = org.apache.commons.math.util.FastMath.min(100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        double double1 = org.apache.commons.math.util.FastMath.rint(34.30685281944006d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 34.0d + "'", double1 == 34.0d);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.5545968900472498d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5039575531546748d) + "'", double1 == (-0.5039575531546748d));
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.11975712045798752d), 0.03011360650845773d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.428182669496151d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.8730666287004054d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.394241857841933d + "'", double1 == 2.394241857841933d);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.5191429678165033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5751658111626728d + "'", double1 == 0.5751658111626728d);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.17364817766693033d, 1.3722988115580157d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.12586921067986145d + "'", double2 == 0.12586921067986145d);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.1478260473879486d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.0011273202561264d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0005635013611711d + "'", double1 == 1.0005635013611711d);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        double double1 = org.apache.commons.math.util.FastMath.ceil(13.394771296631976d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.0d + "'", double1 == 14.0d);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.7771562635532541d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5750144820273283d + "'", double1 == 0.5750144820273283d);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.5574077246549023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 89.2328896037985d + "'", double1 == 89.2328896037985d);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.4485559835397435d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.256962950186429d + "'", double1 == 4.256962950186429d);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.745427304692527d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 42.70983849269427d + "'", double1 == 42.70983849269427d);
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        double double2 = org.apache.commons.math.util.FastMath.min(4.547473508864641E-13d, 0.9814130836189597d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.547473508864641E-13d + "'", double2 == 4.547473508864641E-13d);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        double double1 = org.apache.commons.math.util.FastMath.signum(1834.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        double double2 = org.apache.commons.math.util.FastMath.pow(48.50515463917526d, (-0.1612398348874445d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5347906902896264d + "'", double2 == 0.5347906902896264d);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 2005L, 0.027413983024288702d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.027413983024288702d + "'", double2 == 0.027413983024288702d);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.1063634786066834d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1063634786066836d + "'", double1 == 1.1063634786066836d);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.13417614850536844d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8095051177152213d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8095051177152213d + "'", double1 == 0.8095051177152213d);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.009529184458135628d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009529184458135628d + "'", double1 == 0.009529184458135628d);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 0L, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.1998574867931386d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9022955440581245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4457314998531122d + "'", double1 == 0.4457314998531122d);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.8624815133123458d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7807183390706619d + "'", double1 == 0.7807183390706619d);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.0844617095432145d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.0402623201520615d + "'", double1 == 7.0402623201520615d);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.5684916247485625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        double double1 = org.apache.commons.math.util.FastMath.rint((-1.5701287081656916d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.983070082218447d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9948848769417228d + "'", double1 == 0.9948848769417228d);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        double double1 = org.apache.commons.math.util.FastMath.floor(6.176458612301354E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        long long1 = org.apache.commons.math.util.FastMath.round(99.99999999999999d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.999329299739067d, 4.176086084439524d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9972020797656458d + "'", double2 == 0.9972020797656458d);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.7063058773712645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3062564362985027d + "'", double1 == 1.3062564362985027d);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.016380052907402187d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.016514941461497356d + "'", double1 == 0.016514941461497356d);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.5314789170422551d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.625011775625124d + "'", double1 == 4.625011775625124d);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(4.1679596500040805d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 238.80649712605756d + "'", double1 == 238.80649712605756d);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.8425603366327095d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3223052547579184d + "'", double1 == 1.3223052547579184d);
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        double double2 = org.apache.commons.math.util.FastMath.max(47.00000000000001d, 7.091500380984786E248d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.091500380984786E248d + "'", double2 == 7.091500380984786E248d);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.8135279227115656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.014198740808226775d + "'", double1 == 0.014198740808226775d);
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.38818646476211366d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.37904451714063647d) + "'", double1 == (-0.37904451714063647d));
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.7035516195697273d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.493423335506387d + "'", double1 == 5.493423335506387d);
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        int int2 = org.apache.commons.math.util.FastMath.min(4, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 35L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 35.0f + "'", float1 == 35.0f);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 37L, (float) 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.8306743480624521d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.7970917298292344d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3348577465674303d + "'", double1 == 1.3348577465674303d);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.034315407113705d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.016251890378381414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12748290229823533d + "'", double1 == 0.12748290229823533d);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.0212745827370786d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.021274582737079d + "'", double1 == 2.021274582737079d);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        long long1 = org.apache.commons.math.util.FastMath.round(1.3025850929940461d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5834613951988719d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.13453038206307233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1349395210236586d + "'", double1 == 0.1349395210236586d);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 1, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        double double1 = org.apache.commons.math.util.FastMath.log(0.17286387060702385d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7552508693369808d) + "'", double1 == (-1.7552508693369808d));
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        double double2 = org.apache.commons.math.util.FastMath.max(0.7050189848914605d, 0.2650835638831246d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7050189848914605d + "'", double2 == 0.7050189848914605d);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 9223372036854775807L, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9142246332006481d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9142246332006481d + "'", double2 == 0.9142246332006481d);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.0368954438251052d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2708164357864931d + "'", double1 == 0.2708164357864931d);
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.7866720044340358d), 0.7063058773712644d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.868551121099462d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 52L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(5.893061714674763d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4275629167283723d + "'", double1 == 2.4275629167283723d);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.706873037043774d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.010309095749349842d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.010308730556720751d + "'", double1 == 0.010308730556720751d);
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.5750144820273283d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.777156263553254d + "'", double1 == 1.777156263553254d);
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        double double1 = org.apache.commons.math.util.FastMath.tan((-1.6571064922358931d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.557336411107308d + "'", double1 == 11.557336411107308d);
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.8551464155167325d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8657268681115803d + "'", double1 == 0.8657268681115803d);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        double double1 = org.apache.commons.math.util.FastMath.abs(5.298342365610589d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.298342365610589d + "'", double1 == 5.298342365610589d);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        double double2 = org.apache.commons.math.util.FastMath.pow((-4.788598848288131d), (-0.16299078079570548d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.008879097553696258d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.008879214226770233d) + "'", double1 == (-0.008879214226770233d));
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        double double1 = org.apache.commons.math.util.FastMath.expm1(7072.591881122252d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 0, 6559L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        long long1 = org.apache.commons.math.util.FastMath.round(1.0580782213705773d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.554925098283228E11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0654757904459418d) + "'", double1 == (-2.0654757904459418d));
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 'a', 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.38818646476211366d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0762952597946127d + "'", double1 == 1.0762952597946127d);
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
        double double2 = org.apache.commons.math.util.FastMath.min((-2.4685219244217045d), (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.4685219244217045d) + "'", double2 == (-2.4685219244217045d));
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.8307927247660993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6742905716087851d + "'", double1 == 0.6742905716087851d);
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 0.019233140238467443d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.1612398348874445d), 137.20938277674583d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.1612398348874445d) + "'", double2 == (-0.1612398348874445d));
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) 51L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 51.0d + "'", double1 == 51.0d);
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.0548220996205258d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        double double2 = org.apache.commons.math.util.FastMath.min(7.370686677641594d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.49297772472673135d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5155089546197845d + "'", double1 == 0.5155089546197845d);
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.123919126120245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7009464435335946d + "'", double1 == 1.7009464435335946d);
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 52, (long) 4);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.15002289137601957d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3873278861326919d + "'", double1 == 0.3873278861326919d);
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 100, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 52, 97.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.4485559835397435d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.256962950186429d + "'", double1 == 3.256962950186429d);
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.36649792250229657d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9335880310041569d + "'", double1 == 0.9335880310041569d);
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        double double1 = org.apache.commons.math.util.FastMath.log(1.2490457723982544d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22237987770833972d + "'", double1 == 0.22237987770833972d);
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 5, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        double double1 = org.apache.commons.math.util.FastMath.log10(42.70983849269427d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6305279291448225d + "'", double1 == 1.6305279291448225d);
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.07270966677774478d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.7325613286016606d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.13515601116722967d) + "'", double1 == (-0.13515601116722967d));
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-1L), (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9625203725139667d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.39121448595757846d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.37290979003287206d + "'", double1 == 0.37290979003287206d);
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.27746265011900656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0387403444697436d + "'", double1 == 1.0387403444697436d);
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
        double double1 = org.apache.commons.math.util.FastMath.log(4.211267075873332d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4377635705533984d + "'", double1 == 1.4377635705533984d);
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.2650835638831246d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        int int2 = org.apache.commons.math.util.FastMath.max(2005, 3280);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3280 + "'", int2 == 3280);
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 35, (long) 4);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.0020108397896328144d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        double double1 = org.apache.commons.math.util.FastMath.floor(70.09526929955547d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 70.0d + "'", double1 == 70.0d);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 1, 3280L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.723945865132188d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.012635238952755494d + "'", double1 == 0.012635238952755494d);
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.435403483148737d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.757932679877424d + "'", double1 == 0.757932679877424d);
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
        int int2 = org.apache.commons.math.util.FastMath.max(100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        double double2 = org.apache.commons.math.util.FastMath.max(0.017533279424944842d, 1.135079852099922d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.135079852099922d + "'", double2 == 1.135079852099922d);
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.718281828459045d, (-0.8295667582777111d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7182818284590446d + "'", double2 == 2.7182818284590446d);
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9423260789913604d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.06571071737855876d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.06571071737855874d) + "'", double1 == (-0.06571071737855874d));
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2453.0355994876113d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.498228778891956d + "'", double1 == 8.498228778891956d);
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.28847397809838626d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5398933564353804d) + "'", double1 == (-0.5398933564353804d));
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        int int2 = org.apache.commons.math.util.FastMath.max(4, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
        double double2 = org.apache.commons.math.util.FastMath.min(0.8021880834897168d, 19.781104616480253d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8021880834897168d + "'", double2 == 0.8021880834897168d);
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(47.7974777282436d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2738.593745198908d + "'", double1 == 2738.593745198908d);
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.32317036277189654d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.28003064688945284d + "'", double1 == 0.28003064688945284d);
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.5287499284227858d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 30.295139316469992d + "'", double1 == 30.295139316469992d);
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.384371602954472d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.8486007400083447d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.34980999246079125d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
        double double1 = org.apache.commons.math.util.FastMath.asinh(Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
        double double1 = org.apache.commons.math.util.FastMath.atan(11.553863346113918d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4844603454294543d + "'", double1 == 1.4844603454294543d);
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
        double double2 = org.apache.commons.math.util.FastMath.min(1.4122900538217174d, 0.8559725029698935d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8559725029698935d + "'", double2 == 0.8559725029698935d);
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.3193952511041802d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.7621584293004213d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0546274546035364d + "'", double1 == 1.0546274546035364d);
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
        long long1 = org.apache.commons.math.util.FastMath.round(2.1479594040306007d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.4900413211439332d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.026006127044727836d + "'", double1 == 0.026006127044727836d);
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9149994957367079d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.425609362311924d + "'", double1 == 52.425609362311924d);
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(35.522071152216526d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.52207115221653d + "'", double1 == 35.52207115221653d);
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(7.0402623201520615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.916591747188271d + "'", double1 == 1.916591747188271d);
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
        float float2 = org.apache.commons.math.util.FastMath.max(37.0f, (float) 5L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 37.0f + "'", float2 == 37.0f);
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9329738194517654d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7319773776434012d + "'", double1 == 0.7319773776434012d);
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
        double double2 = org.apache.commons.math.util.FastMath.pow(14.0d, 0.719714945907588d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.6816769952264465d + "'", double2 == 6.6816769952264465d);
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.038399603650754E38d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '4', 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
        double double2 = org.apache.commons.math.util.FastMath.pow(6.17645900500726E-4d, 0.473814720414451d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.030158182390908228d + "'", double2 == 0.030158182390908228d);
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.776356839400251E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.776356839400251E-15d + "'", double1 == 1.776356839400251E-15d);
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.017939523577309636d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 32);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.948148009134034E13d + "'", double1 == 3.948148009134034E13d);
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
        double double1 = org.apache.commons.math.util.FastMath.floor(14.389377026852705d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.0d + "'", double1 == 14.0d);
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9891013135438892d, 1.5574077105338615d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9830779426147055d + "'", double2 == 0.9830779426147055d);
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
        double double2 = org.apache.commons.math.util.FastMath.min(1.2248497229193942E-5d, 0.8245906506052292d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2248497229193942E-5d + "'", double2 == 1.2248497229193942E-5d);
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.016251890378381414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5545437209125812d + "'", double1 == 1.5545437209125812d);
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
        double double1 = org.apache.commons.math.util.FastMath.tanh(572.9577948946323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
        double double1 = org.apache.commons.math.util.FastMath.exp(7.233773586888595E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0007236390591894d + "'", double1 == 1.0007236390591894d);
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 5.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.6577567619657163d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.20637502874300212d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9787801483545738d + "'", double1 == 0.9787801483545738d);
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
        long long1 = org.apache.commons.math.util.FastMath.round(99.99999999999997d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 49L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 49 + "'", int1 == 49);
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
        double double1 = org.apache.commons.math.util.FastMath.sinh(99.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080487E43d + "'", double1 == 1.3440585709080487E43d);
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.12586921067986145d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1341338259903953d + "'", double1 == 1.1341338259903953d);
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(21.42227207044929d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1227.4057772177239d + "'", double1 == 1227.4057772177239d);
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.770170914020331d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4249");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-2.741896957789622d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9355520242262295d) + "'", double1 == (-0.9355520242262295d));
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4251");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 1, (long) 36);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4252");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1L, (float) 3);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4253");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.8295667582777111d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9280435760521517d) + "'", double1 == (-0.9280435760521517d));
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.04539241756975537d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04536127946087134d + "'", double1 == 0.04536127946087134d);
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4255");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9948848769417228d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4256");
        double double1 = org.apache.commons.math.util.FastMath.log1p(6.6816769952264465d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.038837882076222d + "'", double1 == 2.038837882076222d);
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4257");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9998000199980002d, (-1.5707963267948966d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9998000199980001d + "'", double2 == 0.9998000199980001d);
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
        double double1 = org.apache.commons.math.util.FastMath.cos(9.079985974466559E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999958776927d + "'", double1 == 0.9999999958776927d);
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.295263154971464d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2952631549714642d + "'", double1 == 1.2952631549714642d);
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4260");
        double double1 = org.apache.commons.math.util.FastMath.rint((-1.3185862410962617d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4261");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.7239458651321878d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4262");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.8486007400083447d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6903377571690373d + "'", double1 == 0.6903377571690373d);
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4263");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.4160734237838899d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9999192657925324d + "'", double1 == 1.9999192657925324d);
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4264");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) -1, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4265");
        int int1 = org.apache.commons.math.util.FastMath.abs(3280);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3280 + "'", int1 == 3280);
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4266");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.3367845712965752d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9438220940914429d + "'", double1 == 0.9438220940914429d);
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.7483443290970895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7483443290970896d + "'", double1 == 0.7483443290970896d);
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4268");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.1598639151884341d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.15852257137134684d) + "'", double1 == (-0.15852257137134684d));
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4269");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.28448959157673537d, 1.533488069366356d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2844895915767354d + "'", double2 == 0.2844895915767354d);
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4270");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.5160141294778328d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4271");
        double double1 = org.apache.commons.math.util.FastMath.asin(24256.84028216254d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4272");
        double double2 = org.apache.commons.math.util.FastMath.min(2.719301677299958d, 0.9199653037215055d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9199653037215055d + "'", double2 == 0.9199653037215055d);
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4273");
        long long1 = org.apache.commons.math.util.FastMath.round(0.8975275723469739d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4274");
        double double1 = org.apache.commons.math.util.FastMath.exp(27.289917197127753d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.109850196566456E11d + "'", double1 == 7.109850196566456E11d);
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4275");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.8624815133123458d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7594592601350437d + "'", double1 == 0.7594592601350437d);
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4276");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.35650241886700945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2062746732493863d + "'", double1 == 1.2062746732493863d);
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4277");
        double double1 = org.apache.commons.math.util.FastMath.log(18.51629785054141d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.918651309156592d + "'", double1 == 2.918651309156592d);
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4278");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.46517735014659645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.38197629326263133d + "'", double1 == 0.38197629326263133d);
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4279");
        long long2 = org.apache.commons.math.util.FastMath.min(3280L, 5L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4280");
        double double1 = org.apache.commons.math.util.FastMath.acos(18.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4281");
        double double2 = org.apache.commons.math.util.FastMath.max(0.15481538423886812d, 1.0000000000002274d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000000000002274d + "'", double2 == 1.0000000000002274d);
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4282");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.178598367428652d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9240711877135174d + "'", double1 == 0.9240711877135174d);
    }

    @Test
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4283");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4284");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 10, (long) 2147483647);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4285");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.3479613719631407d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3479613719631407d + "'", double1 == 1.3479613719631407d);
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4286");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.001600346789795746d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4287");
        float float2 = org.apache.commons.math.util.FastMath.max(83.0f, 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 83.0f + "'", float2 == 83.0f);
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4288");
        double double1 = org.apache.commons.math.util.FastMath.floor(3.3554432E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3554432E7d + "'", double1 == 3.3554432E7d);
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4289");
        double double1 = org.apache.commons.math.util.FastMath.log10((-2.4685219244217045d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4290");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.045392431815163135d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3567202934678819d + "'", double1 == 0.3567202934678819d);
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4291");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.5603171037625536d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1598565775321763d + "'", double1 == 1.1598565775321763d);
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4292");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) 3280.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4293");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.7615941559557649d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4669214877224426d + "'", double1 == 0.4669214877224426d);
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4294");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9666819391258082d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.014716395414842405d) + "'", double1 == (-0.014716395414842405d));
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4295");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.001600346789795746d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0016003481560184533d + "'", double1 == 0.0016003481560184533d);
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4296");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.9982229502979716d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9950371902099892d + "'", double1 == 0.9950371902099892d);
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4297");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.5287499284227857d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5067775983634798d + "'", double1 == 0.5067775983634798d);
    }

    @Test
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4298");
        float float1 = org.apache.commons.math.util.FastMath.abs(2005.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2005.0f + "'", float1 == 2005.0f);
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4299");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(8.999999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9999999999999996d + "'", double1 == 2.9999999999999996d);
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4300");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 36, (float) 6559L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6559.0f + "'", float2 == 6559.0f);
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4301");
        double double2 = org.apache.commons.math.util.FastMath.min(2453.035678413897d, 0.04539241756975537d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.04539241756975537d + "'", double2 == 0.04539241756975537d);
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4302");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(3.748066027288565E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.147483647E9d + "'", double1 == 2.147483647E9d);
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4303");
        int int2 = org.apache.commons.math.util.FastMath.min(5, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4304");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.5872139151569291d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4305");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.04539241756975537d, (-2.2181320109034326d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.121131255272116d + "'", double2 == 3.121131255272116d);
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4306");
        double double1 = org.apache.commons.math.util.FastMath.ceil(138.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 138.0d + "'", double1 == 138.0d);
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4307");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.837589179357618E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2071981478811056E-17d + "'", double1 == 3.2071981478811056E-17d);
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4308");
        long long1 = org.apache.commons.math.util.FastMath.round(100.00000000000001d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4309");
        double double1 = org.apache.commons.math.util.FastMath.log(1.0546274546035364d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05318758096666653d + "'", double1 == 0.05318758096666653d);
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4310");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.06519350381048933d, (-0.5063656411097465d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.013549154926294d + "'", double2 == 3.013549154926294d);
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4311");
        long long1 = org.apache.commons.math.util.FastMath.round(1.8479780433329283E-10d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4312");
        float float2 = org.apache.commons.math.util.FastMath.max(4.0f, 83.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 83.0f + "'", float2 == 83.0f);
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4313");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.1932800507380157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.193280050738016d + "'", double1 == 1.193280050738016d);
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4314");
        double double1 = org.apache.commons.math.util.FastMath.log(1.2261911632538862d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.20391274970972287d + "'", double1 == 0.20391274970972287d);
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4315");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.8559725029698935d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7079512070864725d + "'", double1 == 0.7079512070864725d);
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4316");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 36L, 2005.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2005.0f + "'", float2 == 2005.0f);
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4317");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.4268126801343756d, (-10.992355853476756d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11602.806055674742d + "'", double2 == 11602.806055674742d);
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4318");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4319");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.28172266585745886d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24820500581157004d + "'", double1 == 0.24820500581157004d);
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4320");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.323818048994663d, 1.0000000000002274d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3238180489947473d + "'", double2 == 1.3238180489947473d);
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4321");
        float float2 = org.apache.commons.math.util.FastMath.min(3.9481478E13f, (float) 32);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4322");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9734612034524097d, 1.66161881444429d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9734612034524097d + "'", double2 == 0.9734612034524097d);
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4323");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 2005L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2005.0f + "'", float1 == 2005.0f);
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4324");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.7208856239751529d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4325");
        double double1 = org.apache.commons.math.util.FastMath.tan(171.78552109133565d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.564538235027751d) + "'", double1 == (-1.564538235027751d));
    }

    @Test
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4326");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.5856304902609806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8366450127823373d + "'", double1 == 0.8366450127823373d);
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4327");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.004988998432693165d, (-1.5424779506349352E-4d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.004988998432693164d + "'", double2 == 0.004988998432693164d);
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4328");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 2147483647, 5L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4329");
        double double1 = org.apache.commons.math.util.FastMath.log(3.1053461109058813d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.13312517806403d + "'", double1 == 1.13312517806403d);
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4330");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.016514941461497356d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.016514190748486233d + "'", double1 == 0.016514190748486233d);
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4331");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.1361158038315415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.974424233965079d + "'", double1 == 0.974424233965079d);
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4332");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 0, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4333");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.16299078079570548d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8495990210054282d + "'", double1 == 0.8495990210054282d);
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4334");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 1.653029967135041E-13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4335");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.2080984037677835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.20517022151040765d + "'", double1 == 0.20517022151040765d);
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4336");
        double double1 = org.apache.commons.math.util.FastMath.log((double) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9512437185814275d + "'", double1 == 3.9512437185814275d);
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4337");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.36649792250229657d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4338");
        double double2 = org.apache.commons.math.util.FastMath.max(1.5534301753820028d, 11013.232874703393d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11013.232874703393d + "'", double2 == 11013.232874703393d);
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4339");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.8827950360317249d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4340");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(7072.591881122252d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7072.591881122253d + "'", double1 == 7072.591881122253d);
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4341");
        double double1 = org.apache.commons.math.util.FastMath.tan((-51.9999999999999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.053272382796583d + "'", double1 == 6.053272382796583d);
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4342");
        double double1 = org.apache.commons.math.util.FastMath.tanh(64.01562118716426d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4343");
        double double1 = org.apache.commons.math.util.FastMath.cosh(4.61512051684126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 50.50495049504951d + "'", double1 == 50.50495049504951d);
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4344");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.23886037395044873d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4345");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9311647277905255d, 0.7594592601350437d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9472768005714263d + "'", double2 == 0.9472768005714263d);
    }

    @Test
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4346");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 100, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4347");
        double double1 = org.apache.commons.math.util.FastMath.signum(9.306852817378902d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4348");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-5684.717147901503d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-17.84718067334252d) + "'", double1 == (-17.84718067334252d));
    }

    @Test
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4349");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.3759428780910872d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1057044739884163d + "'", double1 == 2.1057044739884163d);
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4350");
        double double1 = org.apache.commons.math.util.FastMath.signum(4.584967478670572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4351");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 3.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1411200080598672d + "'", double1 == 0.1411200080598672d);
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4352");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.1074946319245942d, 0.939216676724527d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8674323532966371d + "'", double2 == 0.8674323532966371d);
    }

    @Test
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4353");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4354");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.8685511210994623d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4355");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.8310416729209025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2133974932616556d + "'", double1 == 1.2133974932616556d);
    }

    @Test
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4356");
        double double1 = org.apache.commons.math.util.FastMath.cosh(5.267884728309446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0051545022222d + "'", double1 == 97.0051545022222d);
    }

    @Test
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4357");
        double double2 = org.apache.commons.math.util.FastMath.min(1.373400766945016d, 1.3967916312027995d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.373400766945016d + "'", double2 == 1.373400766945016d);
    }

    @Test
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4358");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.2539945895800114d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4359");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.15002289137601957d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4360");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.030547495921930887d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.030552247040394446d) + "'", double1 == (-0.030552247040394446d));
    }

    @Test
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4361");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.1535902666964597d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4362");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-1.635447929274436d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.028543951110762265d) + "'", double1 == (-0.028543951110762265d));
    }

    @Test
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4363");
        double double1 = org.apache.commons.math.util.FastMath.tan(6558.851092551817d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0181028280828426d) + "'", double1 == (-1.0181028280828426d));
    }

    @Test
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4364");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.5321993930593862d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5321993930593867d + "'", double1 == 2.5321993930593867d);
    }

    @Test
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4365");
        float float2 = org.apache.commons.math.util.FastMath.min(32.0f, 3.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test4366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4366");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2005, 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test4367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4367");
        int int2 = org.apache.commons.math.util.FastMath.max((int) ' ', 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4368");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.6356818791600741d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5937263380238003d + "'", double1 == 0.5937263380238003d);
    }

    @Test
    public void test4369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4369");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.7033339497485451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test4370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4370");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 1, 9.079573862873686E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test4371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4371");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.2701149951815156d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.26381901300017374d) + "'", double1 == (-0.26381901300017374d));
    }

    @Test
    public void test4372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4372");
        int int2 = org.apache.commons.math.util.FastMath.min((-1), (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4373");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.4705882352941177d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4374");
        int int2 = org.apache.commons.math.util.FastMath.min(5, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test4375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4375");
        double double1 = org.apache.commons.math.util.FastMath.exp(12.239326967783478d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 206762.68551422175d + "'", double1 == 206762.68551422175d);
    }

    @Test
    public void test4376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4376");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 97L, (float) 37L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test4377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4377");
        double double1 = org.apache.commons.math.util.FastMath.log(0.8805765261215637d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1271784427026251d) + "'", double1 == (-0.1271784427026251d));
    }

    @Test
    public void test4378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4378");
        double double1 = org.apache.commons.math.util.FastMath.expm1(9.306852817378903d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11012.232874703419d + "'", double1 == 11012.232874703419d);
    }

    @Test
    public void test4379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4379");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8827950360317249d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test4380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4380");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.6303775321964172d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8078050296186562d + "'", double1 == 0.8078050296186562d);
    }

    @Test
    public void test4381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4381");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.044914698054776665d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5258665137193053d + "'", double1 == 1.5258665137193053d);
    }

    @Test
    public void test4382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4382");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4383");
        double double1 = org.apache.commons.math.util.FastMath.cos((-10.992355853476756d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0032184285312627904d) + "'", double1 == (-0.0032184285312627904d));
    }

    @Test
    public void test4384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4384");
        float float2 = org.apache.commons.math.util.FastMath.min(4.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test4385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4385");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.21118284916808827d, 0.5501702829958329d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4250570810610052d + "'", double2 == 0.4250570810610052d);
    }

    @Test
    public void test4386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4386");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.5637157691514306d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.534330728057407d + "'", double1 == 0.534330728057407d);
    }

    @Test
    public void test4387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4387");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.23606797749979d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.23606797749979d + "'", double1 == 2.23606797749979d);
    }

    @Test
    public void test4388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4388");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.019462906223117808d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13950952018811408d + "'", double1 == 0.13950952018811408d);
    }

    @Test
    public void test4389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4389");
        double double1 = org.apache.commons.math.util.FastMath.acosh(50.50495049504951d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.61512051684126d + "'", double1 == 4.61512051684126d);
    }

    @Test
    public void test4390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4390");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(4.605170185988091d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08037538236017182d + "'", double1 == 0.08037538236017182d);
    }

    @Test
    public void test4391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4391");
        int int2 = org.apache.commons.math.util.FastMath.max(49, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 49 + "'", int2 == 49);
    }

    @Test
    public void test4392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4392");
        int int2 = org.apache.commons.math.util.FastMath.min(32, 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test4393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4393");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9917933885729989d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8755587145552816d + "'", double1 == 0.8755587145552816d);
    }

    @Test
    public void test4394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4394");
        double double1 = org.apache.commons.math.util.FastMath.tanh(12.010147458377778d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999260142d + "'", double1 == 0.9999999999260142d);
    }

    @Test
    public void test4395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4395");
        double double1 = org.apache.commons.math.util.FastMath.log(0.8770365420904747d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1312066203280915d) + "'", double1 == (-0.1312066203280915d));
    }

    @Test
    public void test4396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4396");
        int int2 = org.apache.commons.math.util.FastMath.max(2, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test4397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4397");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7483443290970896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6341601637191014d + "'", double1 == 0.6341601637191014d);
    }

    @Test
    public void test4398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4398");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.32485344594992666d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.32485344594992666d + "'", double1 == 0.32485344594992666d);
    }

    @Test
    public void test4399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4399");
        double double1 = org.apache.commons.math.util.FastMath.tan((-96.87824279114196d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5608425149227072d + "'", double1 == 0.5608425149227072d);
    }

    @Test
    public void test4400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4400");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.7078167915714771d, 9.079573862873686E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.570668051033129d + "'", double2 == 1.570668051033129d);
    }

    @Test
    public void test4401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4401");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.110505475945193d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.035892577326765d + "'", double1 == 2.035892577326765d);
    }

    @Test
    public void test4402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4402");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.41367458077606883d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3461924000940324d + "'", double1 == 0.3461924000940324d);
    }

    @Test
    public void test4403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4403");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.2698012268765735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2698012268765737d + "'", double1 == 1.2698012268765737d);
    }

    @Test
    public void test4404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4404");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 5);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 286.4788975654116d + "'", double1 == 286.4788975654116d);
    }

    @Test
    public void test4405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4405");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.8012298966644482d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9287932460284145d + "'", double1 == 0.9287932460284145d);
    }

    @Test
    public void test4406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4406");
        float float2 = org.apache.commons.math.util.FastMath.max(2005.0f, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2005.0f + "'", float2 == 2005.0f);
    }

    @Test
    public void test4407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4407");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.002644512574656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0026445125746561d + "'", double1 == 1.0026445125746561d);
    }

    @Test
    public void test4408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4408");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.534330728057407d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4409");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.009529184458135628d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09761754175421355d + "'", double1 == 0.09761754175421355d);
    }

    @Test
    public void test4410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4410");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.5707963267948712d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8104773809652297d + "'", double1 == 3.8104773809652297d);
    }

    @Test
    public void test4411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4411");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.6860864438010045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8283033525230985d + "'", double1 == 0.8283033525230985d);
    }

    @Test
    public void test4412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4412");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.0655569873089485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4413");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.6303775321964172d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6303775321964171d) + "'", double1 == (-0.6303775321964171d));
    }

    @Test
    public void test4414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4414");
        long long2 = org.apache.commons.math.util.FastMath.min((long) '#', 83L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test4415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4415");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 37L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4416");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.02037490473029824d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0002075755522553d + "'", double1 == 1.0002075755522553d);
    }

    @Test
    public void test4417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4417");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.32485344594992666d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3838278255465983d + "'", double1 == 1.3838278255465983d);
    }

    @Test
    public void test4418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4418");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.9249802099283556d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0626395431802995d) + "'", double1 == (-1.0626395431802995d));
    }

    @Test
    public void test4419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4419");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.16601303451652816d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16678521231533142d + "'", double1 == 0.16678521231533142d);
    }

    @Test
    public void test4420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4420");
        int int2 = org.apache.commons.math.util.FastMath.min(52, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test4421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4421");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.6723302958523574d), 0.4623267743738125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6723302958523573d) + "'", double2 == (-0.6723302958523573d));
    }

    @Test
    public void test4422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4422");
        float float1 = org.apache.commons.math.util.FastMath.abs(6559.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6559.0f + "'", float1 == 6559.0f);
    }

    @Test
    public void test4423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4423");
        double double2 = org.apache.commons.math.util.FastMath.min(0.016514941461497356d, (-1.0626395431802995d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0626395431802995d) + "'", double2 == (-1.0626395431802995d));
    }

    @Test
    public void test4424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4424");
        int int2 = org.apache.commons.math.util.FastMath.max(36, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test4425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4425");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.993222846126381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.949874371066198d + "'", double1 == 9.949874371066198d);
    }

    @Test
    public void test4426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4426");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.4868981666828592d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4427");
        double double2 = org.apache.commons.math.util.FastMath.min(4.035274726494073E-14d, 1735.209878559419d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.035274726494073E-14d + "'", double2 == 4.035274726494073E-14d);
    }

    @Test
    public void test4428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4428");
        double double1 = org.apache.commons.math.util.FastMath.log(99.99999999999996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.605170185988091d + "'", double1 == 4.605170185988091d);
    }

    @Test
    public void test4429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4429");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.45961320728596894d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3376075000685986d) + "'", double1 == (-0.3376075000685986d));
    }

    @Test
    public void test4430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4430");
        float float2 = org.apache.commons.math.util.FastMath.min(10.0f, (float) 52);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test4431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4431");
        double double1 = org.apache.commons.math.util.FastMath.acos(52.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4432");
        double double1 = org.apache.commons.math.util.FastMath.abs(7.63507874715665E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.63507874715665E-9d + "'", double1 == 7.63507874715665E-9d);
    }

    @Test
    public void test4433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4433");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 0, 51);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4434");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 32, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test4435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4435");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.0867705308894857d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4436");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9586654676184497d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.929160175351254d + "'", double1 == 1.929160175351254d);
    }

    @Test
    public void test4437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4437");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 10, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test4438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4438");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9666819391258082d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01687178265730875d + "'", double1 == 0.01687178265730875d);
    }

    @Test
    public void test4439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4439");
        double double2 = org.apache.commons.math.util.FastMath.min(1.1760939939322343d, 0.606759086334487d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.606759086334487d + "'", double2 == 0.606759086334487d);
    }

    @Test
    public void test4440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4440");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.76837158203125E-7d + "'", double1 == 4.76837158203125E-7d);
    }

    @Test
    public void test4441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4441");
        long long1 = org.apache.commons.math.util.FastMath.round((-4.788598848288131d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-5L) + "'", long1 == (-5L));
    }

    @Test
    public void test4442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4442");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(51.0d, 9.471164052548702E-12d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 50.99999999999999d + "'", double2 == 50.99999999999999d);
    }

    @Test
    public void test4443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4443");
        double double1 = org.apache.commons.math.util.FastMath.ceil(4.256962950186429d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test4444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4444");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-1.0d), 0.4250570810610052d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9999999999999999d) + "'", double2 == (-0.9999999999999999d));
    }

    @Test
    public void test4445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4445");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.2698012268765735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.718989392409238d + "'", double1 == 0.718989392409238d);
    }

    @Test
    public void test4446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4446");
        float float2 = org.apache.commons.math.util.FastMath.max((float) ' ', (float) 4);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test4447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4447");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) 37L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test4448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4448");
        float float2 = org.apache.commons.math.util.FastMath.max(10.0f, (float) 3L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test4449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4449");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.030158182390908228d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.030617546607945655d + "'", double1 == 0.030617546607945655d);
    }

    @Test
    public void test4450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4450");
        double double2 = org.apache.commons.math.util.FastMath.atan2(4.76837158203125E-7d, 0.1478260473879486d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.225663992422657E-6d + "'", double2 == 3.225663992422657E-6d);
    }

    @Test
    public void test4451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4451");
        double double2 = org.apache.commons.math.util.FastMath.pow(42.86787163447061d, 2.3025850929940463d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5729.577951308247d + "'", double2 == 5729.577951308247d);
    }

    @Test
    public void test4452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4452");
        double double1 = org.apache.commons.math.util.FastMath.cos(11.553863346113918d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5297358172636923d + "'", double1 == 0.5297358172636923d);
    }

    @Test
    public void test4453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4453");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 32L, 35.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test4454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4454");
        long long1 = org.apache.commons.math.util.FastMath.round(104.94395132690269d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 105L + "'", long1 == 105L);
    }

    @Test
    public void test4455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4455");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.5410395588486396d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4937744707606272d + "'", double1 == 0.4937744707606272d);
    }

    @Test
    public void test4456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4456");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.0262690355566166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7724076511504099d + "'", double1 == 0.7724076511504099d);
    }

    @Test
    public void test4457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4457");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8012298966644482d, 1.0648180240443148d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8012298966644483d + "'", double2 == 0.8012298966644483d);
    }

    @Test
    public void test4458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4458");
        double double1 = org.apache.commons.math.util.FastMath.log(0.5501702829958329d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5975274432265277d) + "'", double1 == (-0.5975274432265277d));
    }

    @Test
    public void test4459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4459");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.8770365420904747d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4460");
        float float2 = org.apache.commons.math.util.FastMath.min(3280.0f, (float) 5);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test4461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4461");
        long long2 = org.apache.commons.math.util.FastMath.min(39481480091341L, 83L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 83L + "'", long2 == 83L);
    }

    @Test
    public void test4462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4462");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.4567608960260546d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.493210561926633d + "'", double1 == 0.493210561926633d);
    }

    @Test
    public void test4463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4463");
        double double1 = org.apache.commons.math.util.FastMath.log(0.024913294410754103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.6923537059133387d) + "'", double1 == (-3.6923537059133387d));
    }

    @Test
    public void test4464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4464");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(199.0d, 3.552713678800501E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 198.99999999999997d + "'", double2 == 198.99999999999997d);
    }

    @Test
    public void test4465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4465");
        float float2 = org.apache.commons.math.util.FastMath.min(32.0f, (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test4466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4466");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.6723302958523574d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4467");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-1L), (float) 3280);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3280.0f + "'", float2 == 3280.0f);
    }

    @Test
    public void test4468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4468");
        long long1 = org.apache.commons.math.util.FastMath.round(32.009338481576d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 32L + "'", long1 == 32L);
    }

    @Test
    public void test4469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4469");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(137.20938277674583d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3947554940834146d + "'", double1 == 2.3947554940834146d);
    }

    @Test
    public void test4470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4470");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9131871133554458d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015938121814835213d + "'", double1 == 0.015938121814835213d);
    }

    @Test
    public void test4471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4471");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.5607966601082315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4472");
        double double1 = org.apache.commons.math.util.FastMath.atan(21.445599564021325d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5242004660685926d + "'", double1 == 1.5242004660685926d);
    }

    @Test
    public void test4473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4473");
        double double1 = org.apache.commons.math.util.FastMath.log(100.0000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.605170185988094d + "'", double1 == 4.605170185988094d);
    }

    @Test
    public void test4474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4474");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.6105647004975029d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4475");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 2005);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2005 + "'", int1 == 2005);
    }

    @Test
    public void test4476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4476");
        double double1 = org.apache.commons.math.util.FastMath.sinh(9.471164052548702E-12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.471164052548702E-12d + "'", double1 == 9.471164052548702E-12d);
    }

    @Test
    public void test4477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4477");
        float float2 = org.apache.commons.math.util.FastMath.min(83.0f, (float) 35);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test4478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4478");
        int int2 = org.apache.commons.math.util.FastMath.min(32, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4479");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.4575013994861008d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4480");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.23695510898143343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2326176679819249d + "'", double1 == 0.2326176679819249d);
    }

    @Test
    public void test4481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4481");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.135079852099922d, 0.019464135019843936d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.002469207837293d + "'", double2 == 1.002469207837293d);
    }

    @Test
    public void test4482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4482");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.3358347343868286E40d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.39130744711005183d) + "'", double1 == (-0.39130744711005183d));
    }

    @Test
    public void test4483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4483");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) 83.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test4484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4484");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.2778843899054422d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2778843899054422d + "'", double1 == 1.2778843899054422d);
    }

    @Test
    public void test4485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4485");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.0811447892938331E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0811447892938332E-4d + "'", double1 == 1.0811447892938332E-4d);
    }

    @Test
    public void test4486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4486");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.104278850811079d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.036726594326735876d + "'", double1 == 0.036726594326735876d);
    }

    @Test
    public void test4487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4487");
        long long2 = org.apache.commons.math.util.FastMath.max(100L, 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test4488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4488");
        long long2 = org.apache.commons.math.util.FastMath.max(105L, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 105L + "'", long2 == 105L);
    }

    @Test
    public void test4489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4489");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.2351381784033553d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4490");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.39465938646477783d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5019639817960942d) + "'", double1 == (-0.5019639817960942d));
    }

    @Test
    public void test4491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4491");
        int int2 = org.apache.commons.math.util.FastMath.max(0, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test4492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4492");
        double double2 = org.apache.commons.math.util.FastMath.min(1.0001081203235103d, 0.9033391107665127d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9033391107665127d + "'", double2 == 0.9033391107665127d);
    }

    @Test
    public void test4493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4493");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.6342583428795024d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0058280496756309d) + "'", double1 == (-1.0058280496756309d));
    }

    @Test
    public void test4494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4494");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.6632456843634446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 38.00117849429131d + "'", double1 == 38.00117849429131d);
    }

    @Test
    public void test4495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4495");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9110439668248159d, 1.0986122886681098d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0986122886681098d + "'", double2 == 1.0986122886681098d);
    }

    @Test
    public void test4496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4496");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5223832855023487d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4497");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.39465938646477783d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.40498456639956293d) + "'", double1 == (-0.40498456639956293d));
    }

    @Test
    public void test4498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4498");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.6576913458149568d, 0.5751658111626728d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7858371377510551d + "'", double2 == 0.7858371377510551d);
    }

    @Test
    public void test4499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4499");
        double double2 = org.apache.commons.math.util.FastMath.max(0.04746076762388862d, 0.2520720804617534d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2520720804617534d + "'", double2 == 0.2520720804617534d);
    }

    @Test
    public void test4500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4500");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.11663410139203768d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }
}

