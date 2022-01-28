import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest14 {

    public static boolean debug = false;

    @Test
    public void test7001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7001");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.5504145203048696d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5504145203048695d) + "'", double1 == (-0.5504145203048695d));
    }

    @Test
    public void test7002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7002");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) 102L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9862648361376543E44d + "'", double1 == 1.9862648361376543E44d);
    }

    @Test
    public void test7003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7003");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.017453770763144784d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000027401317026d + "'", double1 == 1.000027401317026d);
    }

    @Test
    public void test7004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7004");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.62090858658536d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.62090858658536d + "'", double1 == 1.62090858658536d);
    }

    @Test
    public void test7005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7005");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.43087067877290786d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.45967525618227173d) + "'", double1 == (-0.45967525618227173d));
    }

    @Test
    public void test7006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7006");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.033192126091518455d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03317994201506513d + "'", double1 == 0.03317994201506513d);
    }

    @Test
    public void test7007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7007");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 9L, 12.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 12.0f + "'", float2 == 12.0f);
    }

    @Test
    public void test7008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7008");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.19172688492398907d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19172688492398907d + "'", double1 == 0.19172688492398907d);
    }

    @Test
    public void test7009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7009");
        int int2 = org.apache.commons.math.util.FastMath.min(969, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test7010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7010");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.2574599505487548d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2936400003707059d + "'", double1 == 0.2936400003707059d);
    }

    @Test
    public void test7011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7011");
        int int2 = org.apache.commons.math.util.FastMath.max(1477896, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1477896 + "'", int2 == 1477896);
    }

    @Test
    public void test7012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7012");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) 53L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 53.0d + "'", double1 == 53.0d);
    }

    @Test
    public void test7013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7013");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.13766929481533965d), 0.852392823283385d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.13766929481533963d) + "'", double2 == (-0.13766929481533963d));
    }

    @Test
    public void test7014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7014");
        double double1 = org.apache.commons.math.util.FastMath.asin(5.77909264836158d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7015");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.5422326689561365d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.6750163915861345d + "'", double1 == 4.6750163915861345d);
    }

    @Test
    public void test7016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7016");
        double double1 = org.apache.commons.math.util.FastMath.cos(6.157240911549055d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9920794825112482d + "'", double1 == 0.9920794825112482d);
    }

    @Test
    public void test7017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7017");
        double double1 = org.apache.commons.math.util.FastMath.expm1(192.49154750458044d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.962934499547642E83d + "'", double1 == 3.962934499547642E83d);
    }

    @Test
    public void test7018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7018");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.5874010519681996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2422869359501354d + "'", double1 == 1.2422869359501354d);
    }

    @Test
    public void test7019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7019");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.09917661929213893d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test7020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7020");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.9742985252307768d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7021");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.7278403355734606d, (-2.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7925710137162216d + "'", double2 == 2.7925710137162216d);
    }

    @Test
    public void test7022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7022");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.014929865531701196d), 13247.898147933502d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 13247.898147933502d + "'", double2 == 13247.898147933502d);
    }

    @Test
    public void test7023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7023");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.0074303321477398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8454623448290611d + "'", double1 == 0.8454623448290611d);
    }

    @Test
    public void test7024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7024");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.21462793138890232d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21462793138890232d + "'", double1 == 0.21462793138890232d);
    }

    @Test
    public void test7025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7025");
        int int2 = org.apache.commons.math.util.FastMath.max((int) 'a', (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test7026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7026");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(3.9481480091340625E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.948148009134063E13d + "'", double1 == 3.948148009134063E13d);
    }

    @Test
    public void test7027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7027");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-2.1317761108019555d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-122.141774015765d) + "'", double1 == (-122.141774015765d));
    }

    @Test
    public void test7028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7028");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.554116896801992d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0096711642901284d + "'", double1 == 0.0096711642901284d);
    }

    @Test
    public void test7029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7029");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.877611156728114d, 0.005299577531174295d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5647577605400214d + "'", double2 == 1.5647577605400214d);
    }

    @Test
    public void test7030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7030");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.540947184137944d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 33.49184944465622d + "'", double1 == 33.49184944465622d);
    }

    @Test
    public void test7031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7031");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.7711544466071394d, 0.554116896801992d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.865890798507244d + "'", double2 == 0.865890798507244d);
    }

    @Test
    public void test7032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7032");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.5265129967102895d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5025216627732692d) + "'", double1 == (-0.5025216627732692d));
    }

    @Test
    public void test7033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7033");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 0, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test7034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7034");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.7389538577032342d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test7035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7035");
        float float2 = org.apache.commons.math.util.FastMath.min(1248.0f, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test7036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7036");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.29750002275985665d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.30659916323769026d + "'", double1 == 0.30659916323769026d);
    }

    @Test
    public void test7037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7037");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9823418899624805d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7038");
        double double1 = org.apache.commons.math.util.FastMath.log(0.8640948048351971d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.14607278837922302d) + "'", double1 == (-0.14607278837922302d));
    }

    @Test
    public void test7039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7039");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.408169345019964d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1208606652530595d + "'", double1 == 1.1208606652530595d);
    }

    @Test
    public void test7040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7040");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(39.74137414560076d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.412565217356853d + "'", double1 == 3.412565217356853d);
    }

    @Test
    public void test7041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7041");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.3293232640668136d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7042");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 0.7581226324091723d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7581226324091723d + "'", double2 == 0.7581226324091723d);
    }

    @Test
    public void test7043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7043");
        long long2 = org.apache.commons.math.util.FastMath.min(601302L, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test7044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7044");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.0943643578893503d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7045");
        float float1 = org.apache.commons.math.util.FastMath.abs((-2.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test7046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7046");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.0877997771113341d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9421151949180543d + "'", double1 == 0.9421151949180543d);
    }

    @Test
    public void test7047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7047");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(62.92757612309441d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.977531867956209d + "'", double1 == 3.977531867956209d);
    }

    @Test
    public void test7048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7048");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.1524592039206207d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7049");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.07205361290155955d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.002596984843338d + "'", double1 == 1.002596984843338d);
    }

    @Test
    public void test7050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7050");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.5813794361776217d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test7051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7051");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.10332511048643829d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10350905981621714d + "'", double1 == 0.10350905981621714d);
    }

    @Test
    public void test7052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7052");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.5664947917800695d), 2.006281968213695d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.2751962554034454d) + "'", double2 == (-0.2751962554034454d));
    }

    @Test
    public void test7053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7053");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 89);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 89.0f + "'", float1 == 89.0f);
    }

    @Test
    public void test7054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7054");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(34.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2005.3522829578808d + "'", double1 == 2005.3522829578808d);
    }

    @Test
    public void test7055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7055");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.34266379734457d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7166094064727634d + "'", double1 == 0.7166094064727634d);
    }

    @Test
    public void test7056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7056");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.1276321542566607d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.088335134411092d + "'", double1 == 3.088335134411092d);
    }

    @Test
    public void test7057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7057");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.5562468617341296d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9809337083572521d + "'", double1 == 0.9809337083572521d);
    }

    @Test
    public void test7058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7058");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.5461721541136804d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1485841022671868d + "'", double1 == 2.1485841022671868d);
    }

    @Test
    public void test7059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7059");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.06728841474049795d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7060");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test7061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7061");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 5.729577951308232d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test7062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7062");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.7235232133665008d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7494779149675448d + "'", double1 == 0.7494779149675448d);
    }

    @Test
    public void test7063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7063");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.30051681990383783d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2595645499995829d) + "'", double1 == (-0.2595645499995829d));
    }

    @Test
    public void test7064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7064");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.31113287105457993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6776133685039394d + "'", double1 == 0.6776133685039394d);
    }

    @Test
    public void test7065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7065");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) 969);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.569412058702345d + "'", double1 == 7.569412058702345d);
    }

    @Test
    public void test7066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7066");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.03402992459718327d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.939342284262531E-4d + "'", double1 == 5.939342284262531E-4d);
    }

    @Test
    public void test7067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7067");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(5.656854249492381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.6568542494923815d + "'", double1 == 5.6568542494923815d);
    }

    @Test
    public void test7068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7068");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 0.8425647914073723d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test7069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7069");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test7070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7070");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.557320636726051d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.267693921875507d + "'", double1 == 2.267693921875507d);
    }

    @Test
    public void test7071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7071");
        long long1 = org.apache.commons.math.util.FastMath.round(1.3383347192042886E42d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test7072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7072");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.545073735561594d, 0.9444595170440677d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0221301659411706d + "'", double2 == 1.0221301659411706d);
    }

    @Test
    public void test7073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7073");
        double double2 = org.apache.commons.math.util.FastMath.min((-1.598874411320368d), 1.5440680443502757d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.598874411320368d) + "'", double2 == (-1.598874411320368d));
    }

    @Test
    public void test7074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7074");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 1248L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1248.0f + "'", float1 == 1248.0f);
    }

    @Test
    public void test7075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7075");
        long long2 = org.apache.commons.math.util.FastMath.max(57L, (long) (-53));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 57L + "'", long2 == 57L);
    }

    @Test
    public void test7076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7076");
        double double2 = org.apache.commons.math.util.FastMath.max(0.036047586453723045d, 5.4492542898406535d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.4492542898406535d + "'", double2 == 5.4492542898406535d);
    }

    @Test
    public void test7077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7077");
        double double2 = org.apache.commons.math.util.FastMath.atan2(6.691673596021443E41d, 2.538696470620462d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test7078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7078");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.1208606652530595d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7079");
        double double2 = org.apache.commons.math.util.FastMath.pow(1477895.5237245467d, 0.31660012669051746d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 89.80695837330096d + "'", double2 == 89.80695837330096d);
    }

    @Test
    public void test7080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7080");
        double double1 = org.apache.commons.math.util.FastMath.cosh(28.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.231285321457375E11d + "'", double1 == 7.231285321457375E11d);
    }

    @Test
    public void test7081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7081");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.1217719640679913d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04990458168640765d + "'", double1 == 0.04990458168640765d);
    }

    @Test
    public void test7082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7082");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) (-2L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8646647167633873d) + "'", double1 == (-0.8646647167633873d));
    }

    @Test
    public void test7083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7083");
        double double1 = org.apache.commons.math.util.FastMath.tan(100.69314718055996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.163619352272645d + "'", double1 == 0.163619352272645d);
    }

    @Test
    public void test7084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7084");
        double double1 = org.apache.commons.math.util.FastMath.cos(100.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8623188722876911d + "'", double1 == 0.8623188722876911d);
    }

    @Test
    public void test7085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7085");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.1924023244417261d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19123459503123072d + "'", double1 == 0.19123459503123072d);
    }

    @Test
    public void test7086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7086");
        int int2 = org.apache.commons.math.util.FastMath.max((-53), 57);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57 + "'", int2 == 57);
    }

    @Test
    public void test7087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7087");
        double double1 = org.apache.commons.math.util.FastMath.log(1.5137540041501325d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4145926610675508d + "'", double1 == 0.4145926610675508d);
    }

    @Test
    public void test7088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7088");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.3132616875182228d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7089");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 89);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test7090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7090");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.241721948438556d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7091");
        double double1 = org.apache.commons.math.util.FastMath.asin((-6.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7092");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.009716915305559164d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.734723475976807E-18d + "'", double1 == 1.734723475976807E-18d);
    }

    @Test
    public void test7093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7093");
        double double1 = org.apache.commons.math.util.FastMath.tan(201.7156361224559d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7660691491841535d + "'", double1 == 0.7660691491841535d);
    }

    @Test
    public void test7094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7094");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 89L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 89.0f + "'", float2 == 89.0f);
    }

    @Test
    public void test7095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7095");
        double double2 = org.apache.commons.math.util.FastMath.min(0.22468060813060853d, 2.9283350632110237d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.22468060813060853d + "'", double2 == 0.22468060813060853d);
    }

    @Test
    public void test7096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7096");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.44041151091558656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.007686630929159932d + "'", double1 == 0.007686630929159932d);
    }

    @Test
    public void test7097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7097");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.4963334177617679d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test7098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7098");
        double double1 = org.apache.commons.math.util.FastMath.sin(4.248291097914389d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8942257319186149d) + "'", double1 == (-0.8942257319186149d));
    }

    @Test
    public void test7099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7099");
        double double2 = org.apache.commons.math.util.FastMath.pow(4.6750163915861345d, 0.8131112435465191d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.504355850034856d + "'", double2 == 3.504355850034856d);
    }

    @Test
    public void test7100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7100");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.4276814831852547d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.00746445003139546d) + "'", double1 == (-0.00746445003139546d));
    }

    @Test
    public void test7101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7101");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9903301413773639d, 4.951760157141521E27d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.990330141377364d + "'", double2 == 0.990330141377364d);
    }

    @Test
    public void test7102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7102");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 1, 1477896);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1477896 + "'", int2 == 1477896);
    }

    @Test
    public void test7103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7103");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.1736535179105314d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17192878030453262d + "'", double1 == 0.17192878030453262d);
    }

    @Test
    public void test7104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7104");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.28834004602265E12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267944596d + "'", double1 == 1.5707963267944596d);
    }

    @Test
    public void test7105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7105");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.3058674334245912d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7106");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9122545643872476d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test7107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7107");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.018833921198998405d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.018836148574490275d + "'", double1 == 0.018836148574490275d);
    }

    @Test
    public void test7108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7108");
        long long1 = org.apache.commons.math.util.FastMath.round(0.8135103761073599d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test7109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7109");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9555813042538992d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9775383901688461d + "'", double1 == 0.9775383901688461d);
    }

    @Test
    public void test7110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7110");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(5.316655831697726d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7453378854576553d + "'", double1 == 1.7453378854576553d);
    }

    @Test
    public void test7111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7111");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 0, (float) 28);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 28.0f + "'", float2 == 28.0f);
    }

    @Test
    public void test7112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7112");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.7348529557280805d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7453464783221161d + "'", double1 == 0.7453464783221161d);
    }

    @Test
    public void test7113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7113");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.029849141866779647d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17276904198026813d + "'", double1 == 0.17276904198026813d);
    }

    @Test
    public void test7114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7114");
        long long2 = org.apache.commons.math.util.FastMath.min(969L, 4L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test7115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7115");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(8.474177595438071d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.038758824281132d + "'", double1 == 2.038758824281132d);
    }

    @Test
    public void test7116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7116");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 0, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test7117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7117");
        double double2 = org.apache.commons.math.util.FastMath.max(0.7212254887267799d, 1.0000000000004547d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000000000004547d + "'", double2 == 1.0000000000004547d);
    }

    @Test
    public void test7118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7118");
        double double1 = org.apache.commons.math.util.FastMath.abs((-25.170419727719402d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 25.170419727719402d + "'", double1 == 25.170419727719402d);
    }

    @Test
    public void test7119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7119");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test7120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7120");
        long long1 = org.apache.commons.math.util.FastMath.round(1.2079041565509856d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test7121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7121");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.3977072091439116d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2231008538939223d + "'", double1 == 1.2231008538939223d);
    }

    @Test
    public void test7122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7122");
        int int2 = org.apache.commons.math.util.FastMath.min(74, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test7123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7123");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.5632546790890485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999715619097289d + "'", double1 == 0.9999715619097289d);
    }

    @Test
    public void test7124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7124");
        double double1 = org.apache.commons.math.util.FastMath.log10(32.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.505149978319906d + "'", double1 == 1.505149978319906d);
    }

    @Test
    public void test7125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7125");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(3.2710663101885893d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8086089434116457d + "'", double1 == 1.8086089434116457d);
    }

    @Test
    public void test7126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7126");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.012119806270522783d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.012120399730310741d + "'", double1 == 0.012120399730310741d);
    }

    @Test
    public void test7127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7127");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8506216678210412d, 0.8623188722876839d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8697819829870315d + "'", double2 == 0.8697819829870315d);
    }

    @Test
    public void test7128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7128");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.3355291332626371d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23310282673975077d + "'", double1 == 0.23310282673975077d);
    }

    @Test
    public void test7129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7129");
        double double1 = org.apache.commons.math.util.FastMath.log10(12.232006459765387d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0874977017567589d + "'", double1 == 1.0874977017567589d);
    }

    @Test
    public void test7130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7130");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1477896, (float) 601302L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 601302.0f + "'", float2 == 601302.0f);
    }

    @Test
    public void test7131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7131");
        double double1 = org.apache.commons.math.util.FastMath.atan(154.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5643029115666711d + "'", double1 == 1.5643029115666711d);
    }

    @Test
    public void test7132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7132");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 72, (float) 89);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 89.0f + "'", float2 == 89.0f);
    }

    @Test
    public void test7133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7133");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.163619352272645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16361935227264504d + "'", double1 == 0.16361935227264504d);
    }

    @Test
    public void test7134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7134");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.8926886900311722d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7135");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.7658461948190802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.010203549216311d + "'", double1 == 1.010203549216311d);
    }

    @Test
    public void test7136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7136");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.001739546146996826d, 1.4593566380802732d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.00119199466239196d + "'", double2 == 0.00119199466239196d);
    }

    @Test
    public void test7137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7137");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.9812209335997889d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3766925500261076d) + "'", double1 == (-1.3766925500261076d));
    }

    @Test
    public void test7138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7138");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.7922335744099077d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.669987343523587d + "'", double1 == 0.669987343523587d);
    }

    @Test
    public void test7139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7139");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.42631174417624496d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test7140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7140");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) -1, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test7141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7141");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0010571609087238003d, 1.0483708557630074d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.589204468440194E-4d + "'", double2 == 7.589204468440194E-4d);
    }

    @Test
    public void test7142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7142");
        double double1 = org.apache.commons.math.util.FastMath.asin((-14.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7143");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9859950710226582d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9953097260645588d + "'", double1 == 0.9953097260645588d);
    }

    @Test
    public void test7144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7144");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.4210854715202004E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7145");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.193245818431283d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.964262312821631d + "'", double1 == 7.964262312821631d);
    }

    @Test
    public void test7146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7146");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(7.366912598987926E39d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9457864398311168E13d + "'", double1 == 1.9457864398311168E13d);
    }

    @Test
    public void test7147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7147");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1147604.843300052d, (-0.6888366918779438d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1147604.8433000518d + "'", double2 == 1147604.8433000518d);
    }

    @Test
    public void test7148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7148");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.5706591838009425d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7291.659346922947d + "'", double1 == 7291.659346922947d);
    }

    @Test
    public void test7149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7149");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test7150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7150");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 2147483647, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test7151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7151");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.5019419896466207d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5258426474391339d + "'", double1 == 0.5258426474391339d);
    }

    @Test
    public void test7152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7152");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.2134887868481213d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7153");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.6623893268722106d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.227519297364106d + "'", double1 == 1.227519297364106d);
    }

    @Test
    public void test7154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7154");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 1248L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1248 + "'", int1 == 1248);
    }

    @Test
    public void test7155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7155");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-1.3383296635310251d), 0.9224287714823782d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.338329663531025d) + "'", double2 == (-1.338329663531025d));
    }

    @Test
    public void test7156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7156");
        float float2 = org.apache.commons.math.util.FastMath.max(1477896.0f, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1477896.0f + "'", float2 == 1477896.0f);
    }

    @Test
    public void test7157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7157");
        double double1 = org.apache.commons.math.util.FastMath.atan((-28.268076694535583d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5354354786011852d) + "'", double1 == (-1.5354354786011852d));
    }

    @Test
    public void test7158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7158");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.07165345917579712d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07165345917579712d + "'", double1 == 0.07165345917579712d);
    }

    @Test
    public void test7159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7159");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test7160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7160");
        int int2 = org.apache.commons.math.util.FastMath.max(0, 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test7161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7161");
        double double1 = org.apache.commons.math.util.FastMath.signum((-3.046174150757101E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test7162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7162");
        double double2 = org.apache.commons.math.util.FastMath.max(2.382920903210355d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.382920903210355d + "'", double2 == 2.382920903210355d);
    }

    @Test
    public void test7163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7163");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.37755336453841626d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test7164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7164");
        double double1 = org.apache.commons.math.util.FastMath.sin(52.8690419469595d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.512448026033489d + "'", double1 == 0.512448026033489d);
    }

    @Test
    public void test7165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7165");
        double double1 = org.apache.commons.math.util.FastMath.cos(31.59442154605463d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9841120161760346d + "'", double1 == 0.9841120161760346d);
    }

    @Test
    public void test7166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7166");
        double double2 = org.apache.commons.math.util.FastMath.max((-1.2599210498948732d), 0.6494073147094549d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6494073147094549d + "'", double2 == 0.6494073147094549d);
    }

    @Test
    public void test7167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7167");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.9838566398996358d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9616649862498097d + "'", double1 == 2.9616649862498097d);
    }

    @Test
    public void test7168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7168");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.7602765479495022d, (-0.11858913363418261d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6380642846110767d + "'", double2 == 1.6380642846110767d);
    }

    @Test
    public void test7169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7169");
        long long2 = org.apache.commons.math.util.FastMath.max((long) '4', 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test7170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7170");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.0035006424347173598d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0035067768394759d + "'", double1 == 1.0035067768394759d);
    }

    @Test
    public void test7171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7171");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.5258426474391339d, 0.42631174417624496d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5258426474391338d + "'", double2 == 0.5258426474391338d);
    }

    @Test
    public void test7172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7172");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) 72);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8586717452841279E31d + "'", double1 == 1.8586717452841279E31d);
    }

    @Test
    public void test7173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7173");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9999728004113795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.007375596507991767d + "'", double1 == 0.007375596507991767d);
    }

    @Test
    public void test7174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7174");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.49652666007064317d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test7175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7175");
        int int2 = org.apache.commons.math.util.FastMath.min(97, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test7176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7176");
        int int2 = org.apache.commons.math.util.FastMath.min(35, 89);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test7177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7177");
        double double1 = org.apache.commons.math.util.FastMath.expm1(13.359533360579945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 633827.2898766635d + "'", double1 == 633827.2898766635d);
    }

    @Test
    public void test7178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7178");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.303261342348473d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 27.20120686483891d + "'", double1 == 27.20120686483891d);
    }

    @Test
    public void test7179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7179");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 4, (long) 969);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 969L + "'", long2 == 969L);
    }

    @Test
    public void test7180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7180");
        double double1 = org.apache.commons.math.util.FastMath.floor(4.04305126783455d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test7181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7181");
        float float2 = org.apache.commons.math.util.FastMath.min(28.0f, (float) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 28.0f + "'", float2 == 28.0f);
    }

    @Test
    public void test7182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7182");
        double double2 = org.apache.commons.math.util.FastMath.pow(6.144633651371694d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test7183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7183");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.5317885726565768d, (-0.016921204348595564d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5818425745640523d + "'", double2 == 1.5818425745640523d);
    }

    @Test
    public void test7184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7184");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.941208504361988d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4170296708065915d + "'", double1 == 1.4170296708065915d);
    }

    @Test
    public void test7185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7185");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.5501411795197522d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6185837440262903d + "'", double1 == 0.6185837440262903d);
    }

    @Test
    public void test7186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7186");
        double double1 = org.apache.commons.math.util.FastMath.cos((-1.3740813228449729d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1954487498092593d + "'", double1 == 0.1954487498092593d);
    }

    @Test
    public void test7187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7187");
        double double1 = org.apache.commons.math.util.FastMath.abs(4.510392552420711d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.510392552420711d + "'", double1 == 4.510392552420711d);
    }

    @Test
    public void test7188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7188");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.48136823741490475d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.44733871663098906d) + "'", double1 == (-0.44733871663098906d));
    }

    @Test
    public void test7189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7189");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.1784446247204259d, 0.82358273457349d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9608273643459554d + "'", double2 == 0.9608273643459554d);
    }

    @Test
    public void test7190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7190");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.1344240564202083d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7191");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.29849261488782564d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test7192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7192");
        double double1 = org.apache.commons.math.util.FastMath.cosh(3.5217204624939757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16.936075944813155d + "'", double1 == 16.936075944813155d);
    }

    @Test
    public void test7193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7193");
        double double1 = org.apache.commons.math.util.FastMath.acos(14.2206474121905d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7194");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.5206936783915806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5476632633120032d + "'", double1 == 0.5476632633120032d);
    }

    @Test
    public void test7195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7195");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 12);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 12.0f + "'", float1 == 12.0f);
    }

    @Test
    public void test7196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7196");
        long long1 = org.apache.commons.math.util.FastMath.round(0.7677926132124685d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test7197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7197");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.21320856864113585d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7198");
        int int2 = org.apache.commons.math.util.FastMath.max((-1), 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test7199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7199");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.9249242468501242d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7200");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.5607966601082315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test7201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7201");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.7970546072131296d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.45065436536250625d + "'", double1 == 0.45065436536250625d);
    }

    @Test
    public void test7202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7202");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.9985221050176076d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 114.50688188111d + "'", double1 == 114.50688188111d);
    }

    @Test
    public void test7203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7203");
        double double1 = org.apache.commons.math.util.FastMath.floor(4.35414242816297d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test7204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7204");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.7450694027549438d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6891980342959504d + "'", double1 == 0.6891980342959504d);
    }

    @Test
    public void test7205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7205");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 89);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 89L + "'", long1 == 89L);
    }

    @Test
    public void test7206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7206");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.17220518926998146d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7207");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.6027624231806457d), 4.680322147502893d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test7208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7208");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.5255792925185617d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5533958940937419d + "'", double1 == 0.5533958940937419d);
    }

    @Test
    public void test7209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7209");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9999772371651287d, (-5.260052243696693d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999772371651285d + "'", double2 == 0.9999772371651285d);
    }

    @Test
    public void test7210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7210");
        int int2 = org.apache.commons.math.util.FastMath.max(2, 28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 28 + "'", int2 == 28);
    }

    @Test
    public void test7211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7211");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9950026437156599d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7212");
        double double2 = org.apache.commons.math.util.FastMath.pow(9.094947017729282E-13d, 4.474632480815888d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3184271813716724E-54d + "'", double2 == 1.3184271813716724E-54d);
    }

    @Test
    public void test7213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7213");
        long long2 = org.apache.commons.math.util.FastMath.max(32L, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test7214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7214");
        double double1 = org.apache.commons.math.util.FastMath.cos((-1.2599210498948732d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3058920750576734d + "'", double1 == 0.3058920750576734d);
    }

    @Test
    public void test7215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7215");
        double double1 = org.apache.commons.math.util.FastMath.floor(5.461870527159005E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test7216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7216");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.2011784219913253d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2011784219913255d + "'", double1 == 1.2011784219913255d);
    }

    @Test
    public void test7217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7217");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.1295788105004783d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9042324045315422d + "'", double1 == 0.9042324045315422d);
    }

    @Test
    public void test7218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7218");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.6842868307608122d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.837131699124806d) + "'", double1 == (-0.837131699124806d));
    }

    @Test
    public void test7219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7219");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-3.0461741036471235E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.046174056537146E-4d) + "'", double1 == (-3.046174056537146E-4d));
    }

    @Test
    public void test7220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7220");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.08838834764831845d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0536049848239342d) + "'", double1 == (-1.0536049848239342d));
    }

    @Test
    public void test7221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7221");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.6726587729611843d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 38.54050874312451d + "'", double1 == 38.54050874312451d);
    }

    @Test
    public void test7222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7222");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.13360428992833798d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1328149749337444d + "'", double1 == 0.1328149749337444d);
    }

    @Test
    public void test7223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7223");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.2352459649529257d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1114161978992954d + "'", double1 == 1.1114161978992954d);
    }

    @Test
    public void test7224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7224");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.7606971644263034d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7243555431067619d + "'", double1 == 0.7243555431067619d);
    }

    @Test
    public void test7225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7225");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.41399229925728265d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test7226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7226");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9587823055625927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4246618760255017d + "'", double1 == 1.4246618760255017d);
    }

    @Test
    public void test7227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7227");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.3766453324014576d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9812118248296418d + "'", double1 == 0.9812118248296418d);
    }

    @Test
    public void test7228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7228");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.00875022181505636d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test7229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7229");
        double double1 = org.apache.commons.math.util.FastMath.atan(81.80319110677961d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.558572473685422d + "'", double1 == 1.558572473685422d);
    }

    @Test
    public void test7230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7230");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9980845732903537d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7231");
        int int2 = org.apache.commons.math.util.FastMath.min((-2), (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test7232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7232");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.5467250970042676d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7233");
        double double1 = org.apache.commons.math.util.FastMath.log(1.5579741888610903d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4433863804699194d + "'", double1 == 0.4433863804699194d);
    }

    @Test
    public void test7234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7234");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.4667411450004123E-10d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7235");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.43350576899781335d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7236");
        double double1 = org.apache.commons.math.util.FastMath.exp(9.99999999999931d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22026.465794791537d + "'", double1 == 22026.465794791537d);
    }

    @Test
    public void test7237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7237");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.24497082768837525d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.27758404258143715d + "'", double1 == 0.27758404258143715d);
    }

    @Test
    public void test7238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7238");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.7235232133665008d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.061684183053123d + "'", double1 == 2.061684183053123d);
    }

    @Test
    public void test7239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7239");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9999772371651285d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test7240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7240");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.22952338275768086d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0264563317860496d + "'", double1 == 1.0264563317860496d);
    }

    @Test
    public void test7241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7241");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9981175665769844d, 1.5707963267948966d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9981175665769844d + "'", double2 == 0.9981175665769844d);
    }

    @Test
    public void test7242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7242");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.520684332357967d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5772781684778894d + "'", double1 == 0.5772781684778894d);
    }

    @Test
    public void test7243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7243");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.4417418312298101d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test7244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7244");
        double double1 = org.apache.commons.math.util.FastMath.log10(2830.825869680975d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4519131557789033d + "'", double1 == 3.4519131557789033d);
    }

    @Test
    public void test7245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7245");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.01307314909535369d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test7246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7246");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.2583723393689585d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7247");
        int int2 = org.apache.commons.math.util.FastMath.max(2, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test7248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7248");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.8975275723469739d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4535294318697505d + "'", double1 == 1.4535294318697505d);
    }

    @Test
    public void test7249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7249");
        long long1 = org.apache.commons.math.util.FastMath.round(1.665329995925052d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test7250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7250");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 232L, (float) 969L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 232.0f + "'", float2 == 232.0f);
    }

    @Test
    public void test7251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7251");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.9457864398311168E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4411106.935714795d + "'", double1 == 4411106.935714795d);
    }

    @Test
    public void test7252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7252");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.492415024135951d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4727553688245318d) + "'", double1 == (-0.4727553688245318d));
    }

    @Test
    public void test7253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7253");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.47683243740733866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test7254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7254");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.5772781684778894d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2386148663518179d) + "'", double1 == (-0.2386148663518179d));
    }

    @Test
    public void test7255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7255");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test7256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7256");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.015085296975380387d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7257");
        double double2 = org.apache.commons.math.util.FastMath.pow(3.7242338042509196E-22d, (-0.009606545630105158d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.606417074079256d + "'", double2 == 1.606417074079256d);
    }

    @Test
    public void test7258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7258");
        int int2 = org.apache.commons.math.util.FastMath.max(4, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test7259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7259");
        long long1 = org.apache.commons.math.util.FastMath.round(1.8225846997522648d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test7260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7260");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.06728841474049795d), (-4.9E-324d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test7261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7261");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.570796319870359d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963198703592d + "'", double1 == 1.5707963198703592d);
    }

    @Test
    public void test7262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7262");
        double double1 = org.apache.commons.math.util.FastMath.log(0.054831168635193384d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.9034964760017163d) + "'", double1 == (-2.9034964760017163d));
    }

    @Test
    public void test7263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7263");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 7.569412058702345d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test7264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7264");
        double double1 = org.apache.commons.math.util.FastMath.atanh(102.00000000000001d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7265");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 52);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 52.0f + "'", float1 == 52.0f);
    }

    @Test
    public void test7266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7266");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.539809006499305d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9120882697496846d + "'", double1 == 0.9120882697496846d);
    }

    @Test
    public void test7267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7267");
        double double2 = org.apache.commons.math.util.FastMath.max(1.4802234523765398d, 0.8414709848078971d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4802234523765398d + "'", double2 == 1.4802234523765398d);
    }

    @Test
    public void test7268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7268");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.07428284612878822d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7269");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.3284512750821519d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9054597398567241d + "'", double1 == 1.9054597398567241d);
    }

    @Test
    public void test7270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7270");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) 1477896L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.899277193215994d + "'", double1 == 14.899277193215994d);
    }

    @Test
    public void test7271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7271");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 5L, (float) 74);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 74.0f + "'", float2 == 74.0f);
    }

    @Test
    public void test7272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7272");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4711276743037347d + "'", double1 == 1.4711276743037347d);
    }

    @Test
    public void test7273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7273");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.2493163641423473d, 1.194048843227285d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0827746444574402d + "'", double2 == 1.0827746444574402d);
    }

    @Test
    public void test7274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7274");
        double double1 = org.apache.commons.math.util.FastMath.tan(14.899276870949834d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0476958419065936d) + "'", double1 == (-1.0476958419065936d));
    }

    @Test
    public void test7275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7275");
        int int2 = org.apache.commons.math.util.FastMath.min(28, 28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 28 + "'", int2 == 28);
    }

    @Test
    public void test7276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7276");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-3.405442597106097d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.504496521778631d) + "'", double1 == (-1.504496521778631d));
    }

    @Test
    public void test7277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7277");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.5167863873761607d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5683025308972928d + "'", double1 == 0.5683025308972928d);
    }

    @Test
    public void test7278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7278");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9032312123760041d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6190756320410713d + "'", double1 == 0.6190756320410713d);
    }

    @Test
    public void test7279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7279");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.882468649088755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0015492515199613d + "'", double1 == 1.0015492515199613d);
    }

    @Test
    public void test7280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7280");
        long long1 = org.apache.commons.math.util.FastMath.round(1.4874595421493757d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test7281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7281");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.44762327744595565d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.564589168588802d + "'", double1 == 1.564589168588802d);
    }

    @Test
    public void test7282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7282");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.9249242468501242d, 0.01076460674748331d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5652041615169736d + "'", double2 == 1.5652041615169736d);
    }

    @Test
    public void test7283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7283");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.2386148663518179d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2364066514410437d) + "'", double1 == (-0.2364066514410437d));
    }

    @Test
    public void test7284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7284");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.1747717338999963d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7285");
        long long2 = org.apache.commons.math.util.FastMath.min(56L, 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test7286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7286");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.2642218198404007d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.30241706620693265d + "'", double1 == 0.30241706620693265d);
    }

    @Test
    public void test7287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7287");
        long long1 = org.apache.commons.math.util.FastMath.round(1.5725317062401747d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test7288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7288");
        int int2 = org.apache.commons.math.util.FastMath.max(232, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 232 + "'", int2 == 232);
    }

    @Test
    public void test7289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7289");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(4.3112315471152565E15d, 8.000000000000009d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.311231547115256E15d + "'", double2 == 4.311231547115256E15d);
    }

    @Test
    public void test7290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7290");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.005200861212658299d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0052008612126583d + "'", double1 == 0.0052008612126583d);
    }

    @Test
    public void test7291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7291");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.0015952029170108d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5389593020218645d + "'", double1 == 0.5389593020218645d);
    }

    @Test
    public void test7292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7292");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) 6L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10471975511965978d + "'", double1 == 0.10471975511965978d);
    }

    @Test
    public void test7293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7293");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) 1248L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7294");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.5429496506759195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test7295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7295");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.8000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9283177667225558d + "'", double1 == 0.9283177667225558d);
    }

    @Test
    public void test7296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7296");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-2.5757640260722034d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7297");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-77.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.254320865115006d) + "'", double1 == (-4.254320865115006d));
    }

    @Test
    public void test7298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7298");
        long long1 = org.apache.commons.math.util.FastMath.round((-3.0461741978670846E-4d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test7299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7299");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.45593812776599624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6752319066557773d + "'", double1 == 0.6752319066557773d);
    }

    @Test
    public void test7300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7300");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(12.0d, (-0.03769633946808679d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11.999999999999998d + "'", double2 == 11.999999999999998d);
    }

    @Test
    public void test7301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7301");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.5929264334035065d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.010203720239748d + "'", double1 == 1.010203720239748d);
    }

    @Test
    public void test7302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7302");
        double double1 = org.apache.commons.math.util.FastMath.log10(104.95237014951114d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0209922507433933d + "'", double1 == 2.0209922507433933d);
    }

    @Test
    public void test7303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7303");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.8324873537968617d), 1.0678840230978797d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6621571477197064d) + "'", double2 == (-0.6621571477197064d));
    }

    @Test
    public void test7304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7304");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.6352266554776078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7501302570699189d + "'", double1 == 0.7501302570699189d);
    }

    @Test
    public void test7305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7305");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-1.5015017687594445d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7306");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.019059100001444142d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.019060253889834428d) + "'", double1 == (-0.019060253889834428d));
    }

    @Test
    public void test7307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7307");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-1.1752011936438012d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.175201193643801d) + "'", double1 == (-1.175201193643801d));
    }

    @Test
    public void test7308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7308");
        double double1 = org.apache.commons.math.util.FastMath.atan(3.1202790084281963E-20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1202790084281963E-20d + "'", double1 == 3.1202790084281963E-20d);
    }

    @Test
    public void test7309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7309");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 4L, (-3.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.0f) + "'", float2 == (-3.0f));
    }

    @Test
    public void test7310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7310");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7212254887267799d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8055698403985794d + "'", double1 == 0.8055698403985794d);
    }

    @Test
    public void test7311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7311");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.5729527623083676d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.830563686529456d) + "'", double1 == (-0.830563686529456d));
    }

    @Test
    public void test7312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7312");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8813735870195429d, 34.982780458176066d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.012065502657680614d + "'", double2 == 0.012065502657680614d);
    }

    @Test
    public void test7313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7313");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.008837747656337243d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.20675080015374017d) + "'", double1 == (-0.20675080015374017d));
    }

    @Test
    public void test7314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7314");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 3L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.0f + "'", float1 == 3.0f);
    }

    @Test
    public void test7315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7315");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-1L), (float) 2147483647L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test7316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7316");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.0035006424347173598d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7317");
        int int2 = org.apache.commons.math.util.FastMath.max((-1), (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test7318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7318");
        double double1 = org.apache.commons.math.util.FastMath.tan(28.458847799916875d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1866367809529024d + "'", double1 == 0.1866367809529024d);
    }

    @Test
    public void test7319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7319");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.877611156728114d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.877611156728114d + "'", double1 == 0.877611156728114d);
    }

    @Test
    public void test7320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7320");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.0412420976514144d), (-0.8328934556322386d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0412420976514144d) + "'", double2 == (-0.0412420976514144d));
    }

    @Test
    public void test7321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7321");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.543082723008087d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9996160026607501d + "'", double1 == 0.9996160026607501d);
    }

    @Test
    public void test7322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7322");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5643029115666711d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.916114811841311d + "'", double1 == 0.916114811841311d);
    }

    @Test
    public void test7323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7323");
        double double1 = org.apache.commons.math.util.FastMath.rint(286.82547115569156d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 287.0d + "'", double1 == 287.0d);
    }

    @Test
    public void test7324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7324");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.004921566601151856d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0049336974027414d + "'", double1 == 1.0049336974027414d);
    }

    @Test
    public void test7325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7325");
        double double2 = org.apache.commons.math.util.FastMath.min(3.977531867956209d, 16.936075944813155d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.977531867956209d + "'", double2 == 3.977531867956209d);
    }

    @Test
    public void test7326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7326");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.5514266812416906d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test7327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7327");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5710488338654254d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7328");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.9283350632110237d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05110908845462864d + "'", double1 == 0.05110908845462864d);
    }

    @Test
    public void test7329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7329");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.3499748049257176d, 0.6982469888270821d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.815907683720657d + "'", double2 == 1.815907683720657d);
    }

    @Test
    public void test7330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7330");
        double double1 = org.apache.commons.math.util.FastMath.asinh(4.480699513047791d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.205152266145724d + "'", double1 == 2.205152266145724d);
    }

    @Test
    public void test7331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7331");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.0264563317860496d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 58.81161566582077d + "'", double1 == 58.81161566582077d);
    }

    @Test
    public void test7332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7332");
        double double1 = org.apache.commons.math.util.FastMath.ulp(3.58351893845611d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test7333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7333");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.03756258900618957d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1521778176391675d + "'", double1 == 2.1521778176391675d);
    }

    @Test
    public void test7334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7334");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.1526802063667085d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test7335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7335");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-28.419034402957756d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999999999995453d) + "'", double1 == (-0.9999999999995453d));
    }

    @Test
    public void test7336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7336");
        double double1 = org.apache.commons.math.util.FastMath.ulp(91.79781733054413d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test7337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7337");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.6982469888270821d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7338");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-1.5607984507893795d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7339");
        int int2 = org.apache.commons.math.util.FastMath.max(4, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test7340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7340");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.2970310479543554d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0766395574218246d + "'", double1 == 1.0766395574218246d);
    }

    @Test
    public void test7341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7341");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.7922335744099077d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.208323376435104d + "'", double1 == 2.208323376435104d);
    }

    @Test
    public void test7342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7342");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (-5L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-5) + "'", int1 == (-5));
    }

    @Test
    public void test7343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7343");
        long long1 = org.apache.commons.math.util.FastMath.round(2.953280866830926E-8d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test7344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7344");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 1, (long) (-3));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test7345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7345");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.1972245773362196d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.555555555555556d + "'", double1 == 4.555555555555556d);
    }

    @Test
    public void test7346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7346");
        double double2 = org.apache.commons.math.util.FastMath.min(3.106387248181345d, 2.4545050086131437d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4545050086131437d + "'", double2 == 2.4545050086131437d);
    }

    @Test
    public void test7347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7347");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.018756498697388355d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7268482287672338d) + "'", double1 == (-1.7268482287672338d));
    }

    @Test
    public void test7348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7348");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.720075976020836E-44d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.720075976020836E-44d + "'", double1 == 3.720075976020836E-44d);
    }

    @Test
    public void test7349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7349");
        double double1 = org.apache.commons.math.util.FastMath.log((-1.1961853422678859d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7350");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.520684332357967d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.47822800904141777d + "'", double1 == 0.47822800904141777d);
    }

    @Test
    public void test7351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7351");
        double double1 = org.apache.commons.math.util.FastMath.sin(66.8031571064935d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7377365584832909d) + "'", double1 == (-0.7377365584832909d));
    }

    @Test
    public void test7352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7352");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.2228507766040782d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7353");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.1614027504379212d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9173623802871905d + "'", double1 == 0.9173623802871905d);
    }

    @Test
    public void test7354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7354");
        double double2 = org.apache.commons.math.util.FastMath.max(0.21462793138890232d, 10.690128972137646d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.690128972137646d + "'", double2 == 10.690128972137646d);
    }

    @Test
    public void test7355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7355");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.3693207897104474d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5079075814430074d + "'", double1 == 1.5079075814430074d);
    }

    @Test
    public void test7356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7356");
        long long1 = org.apache.commons.math.util.FastMath.round(0.5206936783915806d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test7357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7357");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.5664947917800695d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-32.457760685140336d) + "'", double1 == (-32.457760685140336d));
    }

    @Test
    public void test7358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7358");
        long long1 = org.apache.commons.math.util.FastMath.round((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test7359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7359");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.2555045537071452d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2501526720068403d + "'", double1 == 0.2501526720068403d);
    }

    @Test
    public void test7360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7360");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.0000000000004547d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7361");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.2389045558899838d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7362");
        double double1 = org.apache.commons.math.util.FastMath.log(0.8362020945501539d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.17888495521928655d) + "'", double1 == (-0.17888495521928655d));
    }

    @Test
    public void test7363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7363");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.6384917413123372d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8936226515580039d + "'", double1 == 0.8936226515580039d);
    }

    @Test
    public void test7364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7364");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.5026329548726327d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test7365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7365");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.5929264334035065d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.357395366001277d + "'", double1 == 2.357395366001277d);
    }

    @Test
    public void test7366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7366");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.1344240564202083d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7367");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9445209155423233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9445209155423233d + "'", double1 == 0.9445209155423233d);
    }

    @Test
    public void test7368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7368");
        long long2 = org.apache.commons.math.util.FastMath.min((-53L), (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-53L) + "'", long2 == (-53L));
    }

    @Test
    public void test7369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7369");
        int int2 = org.apache.commons.math.util.FastMath.min(53, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
    }

    @Test
    public void test7370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7370");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.2583723393689585d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7371");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.6042872728524414d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test7372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7372");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 102, (float) 89L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 102.0f + "'", float2 == 102.0f);
    }

    @Test
    public void test7373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7373");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (-2));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test7374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7374");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.011032585021104841d), (-0.47950959629665524d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test7375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7375");
        double double1 = org.apache.commons.math.util.FastMath.exp(104.9439511105971d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.772062468963207E45d + "'", double1 == 3.772062468963207E45d);
    }

    @Test
    public void test7376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7376");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.8549344892399791d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8549344892399792d + "'", double1 == 0.8549344892399792d);
    }

    @Test
    public void test7377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7377");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.6329299089739802d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7378");
        long long2 = org.apache.commons.math.util.FastMath.min(101L, (long) (-2));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test7379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7379");
        double double1 = org.apache.commons.math.util.FastMath.acos(13247.898147933502d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7380");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-3.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9950547536867305d) + "'", double1 == (-0.9950547536867305d));
    }

    @Test
    public void test7381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7381");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(192.49154750458044d, 0.6090693194205808d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 192.4915475045804d + "'", double2 == 192.4915475045804d);
    }

    @Test
    public void test7382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7382");
        double double1 = org.apache.commons.math.util.FastMath.log((-1.945982489867764E-83d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7383");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.029870624878120294d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0303212273960571d + "'", double1 == 1.0303212273960571d);
    }

    @Test
    public void test7384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7384");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.5206130698160022d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.28348493327303786d) + "'", double1 == (-0.28348493327303786d));
    }

    @Test
    public void test7385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7385");
        int int2 = org.apache.commons.math.util.FastMath.min(32, 232);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test7386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7386");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.8420998258122976d, 2.498708618581408d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8420998258122978d + "'", double2 == 1.8420998258122978d);
    }

    @Test
    public void test7387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7387");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 0, (long) 28);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test7388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7388");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) (-3));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.950212931632136d) + "'", double1 == (-0.950212931632136d));
    }

    @Test
    public void test7389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7389");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(3.8318928232769873d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9575221131003826d + "'", double1 == 1.9575221131003826d);
    }

    @Test
    public void test7390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7390");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.4798640040970981d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7391");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.5837567576054801d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.010188477450982078d + "'", double1 == 0.010188477450982078d);
    }

    @Test
    public void test7392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7392");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.7834116559678173d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7834116559678173d + "'", double1 == 0.7834116559678173d);
    }

    @Test
    public void test7393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7393");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(3.10236374558935d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 177.7523491366676d + "'", double1 == 177.7523491366676d);
    }

    @Test
    public void test7394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7394");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(3.053086467974937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0530864679749374d + "'", double1 == 3.0530864679749374d);
    }

    @Test
    public void test7395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7395");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 100, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test7396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7396");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.43248879866156087d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6488921215540093d + "'", double1 == 0.6488921215540093d);
    }

    @Test
    public void test7397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7397");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.7035740325184427d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9910712178493908d + "'", double1 == 0.9910712178493908d);
    }

    @Test
    public void test7398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7398");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.003921736500322172d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test7399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7399");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(104.9439511105971d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 104.94395111059711d + "'", double1 == 104.94395111059711d);
    }

    @Test
    public void test7400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7400");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9224287714823782d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.515392289937179d + "'", double1 == 2.515392289937179d);
    }

    @Test
    public void test7401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7401");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.146655416868485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0708199740705648d + "'", double1 == 1.0708199740705648d);
    }

    @Test
    public void test7402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7402");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.36017358796285076d, (-1.3836270120478895d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8869331356600756d + "'", double2 == 2.8869331356600756d);
    }

    @Test
    public void test7403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7403");
        double double1 = org.apache.commons.math.util.FastMath.expm1(5.298292365610485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 198.99499987499382d + "'", double1 == 198.99499987499382d);
    }

    @Test
    public void test7404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7404");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-2.675024856842625d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9310948843902394d) + "'", double1 == (-0.9310948843902394d));
    }

    @Test
    public void test7405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7405");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.7464968867258402d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9250743510162865d) + "'", double1 == (-0.9250743510162865d));
    }

    @Test
    public void test7406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7406");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.430982375386799d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4309823753867996d + "'", double1 == 2.4309823753867996d);
    }

    @Test
    public void test7407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7407");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(9.907996327355766d, 1.3106472496723418d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.907996327355765d + "'", double2 == 9.907996327355765d);
    }

    @Test
    public void test7408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7408");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.019013538492767164d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.019012393066990783d) + "'", double1 == (-0.019012393066990783d));
    }

    @Test
    public void test7409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7409");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 35, (float) 28L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 28.0f + "'", float2 == 28.0f);
    }

    @Test
    public void test7410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7410");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.47746469952801107d), 0.09917661929213893d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.3659935442578786d) + "'", double2 == (-1.3659935442578786d));
    }

    @Test
    public void test7411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7411");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.1278889674580024d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.810295527926742d + "'", double1 == 0.810295527926742d);
    }

    @Test
    public void test7412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7412");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.0437260685878431d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7413");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 74L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 74.0f + "'", float1 == 74.0f);
    }

    @Test
    public void test7414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7414");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.12796368962739058d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7415");
        double double1 = org.apache.commons.math.util.FastMath.expm1(3.8502266359033825d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 46.00371475388058d + "'", double1 == 46.00371475388058d);
    }

    @Test
    public void test7416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7416");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.94875668844129d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06891880557344843d + "'", double1 == 0.06891880557344843d);
    }

    @Test
    public void test7417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7417");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.9659700754028167d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test7418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7418");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test7419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7419");
        double double1 = org.apache.commons.math.util.FastMath.log10(14.922075780350696d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1738292411826359d + "'", double1 == 1.1738292411826359d);
    }

    @Test
    public void test7420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7420");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5633399621833288d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.915959896856884d + "'", double1 == 0.915959896856884d);
    }

    @Test
    public void test7421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7421");
        double double1 = org.apache.commons.math.util.FastMath.log1p(813.951274474838d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.703128325533169d + "'", double1 == 6.703128325533169d);
    }

    @Test
    public void test7422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7422");
        int int2 = org.apache.commons.math.util.FastMath.min((int) 'a', 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test7423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7423");
        long long1 = org.apache.commons.math.util.FastMath.round((double) (-1));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test7424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7424");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.2083244963961874d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7425");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.4221817811941835E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7426");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.43143142265425977d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test7427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7427");
        double double1 = org.apache.commons.math.util.FastMath.abs(3.621304236535399d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.621304236535399d + "'", double1 == 3.621304236535399d);
    }

    @Test
    public void test7428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7428");
        int int2 = org.apache.commons.math.util.FastMath.min(601302, 1248);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1248 + "'", int2 == 1248);
    }

    @Test
    public void test7429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7429");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8131112435465191d, 2.2204460492503185E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948963d + "'", double2 == 1.5707963267948963d);
    }

    @Test
    public void test7430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7430");
        long long2 = org.apache.commons.math.util.FastMath.min(5L, 53L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test7431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7431");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 100, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test7432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7432");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.8086089434116457d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 103.62565924710243d + "'", double1 == 103.62565924710243d);
    }

    @Test
    public void test7433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7433");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.6912431464778742d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5987800259384346d) + "'", double1 == (-0.5987800259384346d));
    }

    @Test
    public void test7434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7434");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.5314237783053722d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.009275094654817158d) + "'", double1 == (-0.009275094654817158d));
    }

    @Test
    public void test7435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7435");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test7436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7436");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-2.0625582428435867d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0625582428435862d) + "'", double1 == (-2.0625582428435862d));
    }

    @Test
    public void test7437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7437");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9849610023458857d, 1.8308672778518115E43d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.379750975185693E-44d + "'", double2 == 5.379750975185693E-44d);
    }

    @Test
    public void test7438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7438");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.2816949531804002E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2816949729784086E-4d + "'", double1 == 2.2816949729784086E-4d);
    }

    @Test
    public void test7439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7439");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 9223372036854775807L, (float) (-2L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test7440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7440");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.0827746444574402d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.825119746353361d + "'", double1 == 0.825119746353361d);
    }

    @Test
    public void test7441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7441");
        double double1 = org.apache.commons.math.util.FastMath.atanh(104.94395132690269d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7442");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.37841993602148327d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.684942808106084d + "'", double1 == 0.684942808106084d);
    }

    @Test
    public void test7443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7443");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 1248, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1248L + "'", long2 == 1248L);
    }

    @Test
    public void test7444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7444");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9283177667225558d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9634924839989961d + "'", double1 == 0.9634924839989961d);
    }

    @Test
    public void test7445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7445");
        int int2 = org.apache.commons.math.util.FastMath.max(102, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
    }

    @Test
    public void test7446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7446");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.7853424278235795d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7447");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.5013507798060323d, 0.2865262554567682d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5013507798060322d + "'", double2 == 0.5013507798060322d);
    }

    @Test
    public void test7448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7448");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.6470434810831891d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7449");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, (double) 12L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test7450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7450");
        double double2 = org.apache.commons.math.util.FastMath.pow((-1.0106146460254415d), (-53.7871501258819d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test7451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7451");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9963790917388103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test7452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7452");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-53), 601302L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 601302L + "'", long2 == 601302L);
    }

    @Test
    public void test7453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7453");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.2228507766040782d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test7454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7454");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.3515046736041096d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.329786589008662d + "'", double1 == 1.329786589008662d);
    }

    @Test
    public void test7455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7455");
        int int2 = org.apache.commons.math.util.FastMath.max((-5), 28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 28 + "'", int2 == 28);
    }

    @Test
    public void test7456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7456");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.2493184782545368d, 0.5562468617341296d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2493184782545366d + "'", double2 == 1.2493184782545366d);
    }

    @Test
    public void test7457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7457");
        long long1 = org.apache.commons.math.util.FastMath.round(0.5940920277793489d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test7458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7458");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.5836293706283021d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5836293706283022d + "'", double1 == 0.5836293706283022d);
    }

    @Test
    public void test7459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7459");
        long long2 = org.apache.commons.math.util.FastMath.max(57L, (long) 89);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 89L + "'", long2 == 89L);
    }

    @Test
    public void test7460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7460");
        int int2 = org.apache.commons.math.util.FastMath.min(232, 89);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 89 + "'", int2 == 89);
    }

    @Test
    public void test7461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7461");
        double double1 = org.apache.commons.math.util.FastMath.atan(44.3614195558365d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.548258033850413d + "'", double1 == 1.548258033850413d);
    }

    @Test
    public void test7462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7462");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 53.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7463");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9999999535899772d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5403023449208267d + "'", double1 == 0.5403023449208267d);
    }

    @Test
    public void test7464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7464");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 0, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test7465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7465");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.24748960330606537d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49748326937301657d + "'", double1 == 0.49748326937301657d);
    }

    @Test
    public void test7466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7466");
        int int2 = org.apache.commons.math.util.FastMath.min(2147483647, 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test7467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7467");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.811385510344456d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7468");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.029840281693512497d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.029844711977685068d + "'", double1 == 0.029844711977685068d);
    }

    @Test
    public void test7469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7469");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.1736535179105314d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7603164142325384d) + "'", double1 == (-0.7603164142325384d));
    }

    @Test
    public void test7470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7470");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.7166094064727634d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8948718256250384d + "'", double1 == 0.8948718256250384d);
    }

    @Test
    public void test7471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7471");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.3104404468750332d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.32081321463813295d + "'", double1 == 0.32081321463813295d);
    }

    @Test
    public void test7472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7472");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.4764016559700286d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test7473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7473");
        double double1 = org.apache.commons.math.util.FastMath.log(0.5757405129948149d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5520982180639699d) + "'", double1 == (-0.5520982180639699d));
    }

    @Test
    public void test7474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7474");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.5422326689561365d, 0.893943660913561d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5422326689561363d + "'", double2 == 1.5422326689561363d);
    }

    @Test
    public void test7475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7475");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 232L, (float) (-3L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.0f) + "'", float2 == (-3.0f));
    }

    @Test
    public void test7476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7476");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) -1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7477");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(19.071130515668326d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1092.6952890909483d + "'", double1 == 1092.6952890909483d);
    }

    @Test
    public void test7478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7478");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.10862815709014047d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7479");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.6560676710276013d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6560676710276013d + "'", double1 == 0.6560676710276013d);
    }

    @Test
    public void test7480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7480");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.6494073147094548d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8058581231888494d + "'", double1 == 0.8058581231888494d);
    }

    @Test
    public void test7481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7481");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.25469727314226837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7482");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.6621571477197064d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6213890666784979d) + "'", double1 == (-0.6213890666784979d));
    }

    @Test
    public void test7483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7483");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.0000000421468493d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test7484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7484");
        double double1 = org.apache.commons.math.util.FastMath.sinh(14.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 601302.1420819727d + "'", double1 == 601302.1420819727d);
    }

    @Test
    public void test7485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7485");
        double double1 = org.apache.commons.math.util.FastMath.cos(43.42944819032519d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8510319493154874d + "'", double1 == 0.8510319493154874d);
    }

    @Test
    public void test7486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7486");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.7856632231610079d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3248393855056821d + "'", double1 == 1.3248393855056821d);
    }

    @Test
    public void test7487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7487");
        int int2 = org.apache.commons.math.util.FastMath.min((int) ' ', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test7488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7488");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.700744932618965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9910207812792937d + "'", double1 == 0.9910207812792937d);
    }

    @Test
    public void test7489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7489");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.5290826861200238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8632704401895588d + "'", double1 == 0.8632704401895588d);
    }

    @Test
    public void test7490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7490");
        int int1 = org.apache.commons.math.util.FastMath.abs(969);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 969 + "'", int1 == 969);
    }

    @Test
    public void test7491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7491");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.0104380367075194d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0104380367075194d + "'", double1 == 1.0104380367075194d);
    }

    @Test
    public void test7492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7492");
        double double2 = org.apache.commons.math.util.FastMath.max(0.007686630929159932d, 633827.2898766635d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 633827.2898766635d + "'", double2 == 633827.2898766635d);
    }

    @Test
    public void test7493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7493");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.25008839294063845d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.25008839294063845d + "'", double1 == 0.25008839294063845d);
    }

    @Test
    public void test7494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7494");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) -1, 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test7495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7495");
        double double2 = org.apache.commons.math.util.FastMath.min(0.7756969903949167d, 1.8225846997522648d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7756969903949167d + "'", double2 == 0.7756969903949167d);
    }

    @Test
    public void test7496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7496");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.251840827131708d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7497");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9950371902099892d, 103.00961449578338d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5990022811290326d + "'", double2 == 0.5990022811290326d);
    }

    @Test
    public void test7498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7498");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.7042643509780869d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0223583915859706d + "'", double1 == 1.0223583915859706d);
    }

    @Test
    public void test7499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7499");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-3.343890970163151d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.495377021522982d) + "'", double1 == (-1.495377021522982d));
    }

    @Test
    public void test7500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7500");
        double double2 = org.apache.commons.math.util.FastMath.max(0.663208813276331d, 2.382920903210355d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.382920903210355d + "'", double2 == 2.382920903210355d);
    }
}

