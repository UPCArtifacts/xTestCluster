import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest15 {

    public static boolean debug = false;

    @Test
    public void test7501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7501");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.07463853704904692d, 1.5707803769361628d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.016969638172477982d + "'", double2 == 0.016969638172477982d);
    }

    @Test
    public void test7502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7502");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9751009553485449d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6514348740032216d + "'", double1 == 1.6514348740032216d);
    }

    @Test
    public void test7503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7503");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(200.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.848035476425732d + "'", double1 == 5.848035476425732d);
    }

    @Test
    public void test7504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7504");
        double double2 = org.apache.commons.math.util.FastMath.max(0.8112570643423485d, 2.1644736633175252E39d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1644736633175252E39d + "'", double2 == 2.1644736633175252E39d);
    }

    @Test
    public void test7505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7505");
        double double1 = org.apache.commons.math.util.FastMath.cos((-54.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8293098328631502d) + "'", double1 == (-0.8293098328631502d));
    }

    @Test
    public void test7506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7506");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.56899560935137d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2324356849275815d + "'", double1 == 1.2324356849275815d);
    }

    @Test
    public void test7507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7507");
        double double1 = org.apache.commons.math.util.FastMath.acos(37.40464270515639d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7508");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.2640633033557785d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7679249258932203d + "'", double1 == 0.7679249258932203d);
    }

    @Test
    public void test7509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7509");
        double double1 = org.apache.commons.math.util.FastMath.rint((-2.023940734093681d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test7510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7510");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) -1, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test7511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7511");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(5.431733408790851d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.431733408790852d + "'", double1 == 5.431733408790852d);
    }

    @Test
    public void test7512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7512");
        long long1 = org.apache.commons.math.util.FastMath.round(104.9439511105971d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 105L + "'", long1 == 105L);
    }

    @Test
    public void test7513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7513");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(43.87975471928711d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 43.879754719287114d + "'", double1 == 43.879754719287114d);
    }

    @Test
    public void test7514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7514");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) 192);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test7515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7515");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (-40L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 40.0f + "'", float1 == 40.0f);
    }

    @Test
    public void test7516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7516");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9852330704390814d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9852330704390815d + "'", double1 == 0.9852330704390815d);
    }

    @Test
    public void test7517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7517");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.021726115561043376d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test7518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7518");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.0000121526688588d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6931532568759139d + "'", double1 == 0.6931532568759139d);
    }

    @Test
    public void test7519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7519");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-4.702248465198799d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 55.10186891269844d + "'", double1 == 55.10186891269844d);
    }

    @Test
    public void test7520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7520");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.14642450064787196d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test7521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7521");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.011406874694347337d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5593892047150768d + "'", double1 == 1.5593892047150768d);
    }

    @Test
    public void test7522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7522");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.5802135739451127d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7523");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.21809990377316002d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.21637493119114493d) + "'", double1 == (-0.21637493119114493d));
    }

    @Test
    public void test7524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7524");
        double double2 = org.apache.commons.math.util.FastMath.max(0.4911404781913538d, 0.9430016488922662d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9430016488922662d + "'", double2 == 0.9430016488922662d);
    }

    @Test
    public void test7525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7525");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 3L, 3.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test7526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7526");
        double double1 = org.apache.commons.math.util.FastMath.exp(17.247748258387592d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.094581278827801E7d + "'", double1 == 3.094581278827801E7d);
    }

    @Test
    public void test7527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7527");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.230172207040889d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8570304970053537d + "'", double1 == 1.8570304970053537d);
    }

    @Test
    public void test7528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7528");
        float float2 = org.apache.commons.math.util.FastMath.max(40.0f, (float) 57L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test7529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7529");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.5298038334472441d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9918394538226031d + "'", double1 == 0.9918394538226031d);
    }

    @Test
    public void test7530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7530");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.4251053392695819d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 24.35674178862402d + "'", double1 == 24.35674178862402d);
    }

    @Test
    public void test7531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7531");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.0792211437926118d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0388556895895655d + "'", double1 == 1.0388556895895655d);
    }

    @Test
    public void test7532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7532");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.5707774424688277d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999998216911d + "'", double1 == 0.9999999998216911d);
    }

    @Test
    public void test7533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7533");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.8791697500646949d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 107.66849566736077d + "'", double1 == 107.66849566736077d);
    }

    @Test
    public void test7534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7534");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9918956474731391d, 0.8029179645860509d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9918956474731391d + "'", double2 == 0.9918956474731391d);
    }

    @Test
    public void test7535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7535");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.718281828459045d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test7536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7536");
        float float2 = org.apache.commons.math.util.FastMath.max(41.0f, (float) 1833);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1833.0f + "'", float2 == 1833.0f);
    }

    @Test
    public void test7537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7537");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.9997894669934126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6260684218497006d + "'", double1 == 3.6260684218497006d);
    }

    @Test
    public void test7538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7538");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.5143524375699184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.565086935283835d + "'", double1 == 0.565086935283835d);
    }

    @Test
    public void test7539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7539");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.5943927097962464d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test7540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7540");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 3);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 171.88733853924697d + "'", double1 == 171.88733853924697d);
    }

    @Test
    public void test7541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7541");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.5707963270671181d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7542");
        long long1 = org.apache.commons.math.util.FastMath.round(76.25240960756025d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 76L + "'", long1 == 76L);
    }

    @Test
    public void test7543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7543");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.20494781863014405d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6883566997526174d) + "'", double1 == (-0.6883566997526174d));
    }

    @Test
    public void test7544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7544");
        double double1 = org.apache.commons.math.util.FastMath.tan(46340.95001184158d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8140030595593891d) + "'", double1 == (-0.8140030595593891d));
    }

    @Test
    public void test7545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7545");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.9995086225327711d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36806025325934555d + "'", double1 == 0.36806025325934555d);
    }

    @Test
    public void test7546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7546");
        double double1 = org.apache.commons.math.util.FastMath.log10(11013.232874703415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.04191482247339d + "'", double1 == 4.04191482247339d);
    }

    @Test
    public void test7547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7547");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.7162633894119443d, 0.4636456564559829d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7162633894119441d + "'", double2 == 1.7162633894119441d);
    }

    @Test
    public void test7548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7548");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) -1, (-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test7549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7549");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.5430365305682094d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8561435398520317d + "'", double1 == 0.8561435398520317d);
    }

    @Test
    public void test7550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7550");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.5944033714909972d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6300289098137661d) + "'", double1 == (-0.6300289098137661d));
    }

    @Test
    public void test7551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7551");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(3.6237264565928684d, (-6.884570336239587E-9d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.623726456592868d + "'", double2 == 3.623726456592868d);
    }

    @Test
    public void test7552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7552");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.7165313105737893d, 0.5303468257884512d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7165313105737892d + "'", double2 == 0.7165313105737892d);
    }

    @Test
    public void test7553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7553");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(198.57204013738644d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 198.57204013738647d + "'", double1 == 198.57204013738647d);
    }

    @Test
    public void test7554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7554");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9830787956514044d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test7555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7555");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9999303766736223d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8813243550364138d + "'", double1 == 0.8813243550364138d);
    }

    @Test
    public void test7556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7556");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.006910197462126033d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test7557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7557");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 0, (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test7558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7558");
        long long1 = org.apache.commons.math.util.FastMath.abs((-3L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test7559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7559");
        double double1 = org.apache.commons.math.util.FastMath.log(156.1918541558971d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.051085085955435d + "'", double1 == 5.051085085955435d);
    }

    @Test
    public void test7560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7560");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(7.091500380984786E248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2377003055461679E247d + "'", double1 == 1.2377003055461679E247d);
    }

    @Test
    public void test7561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7561");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.240152057753145E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test7562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7562");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.999303822951033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.999303822951033d + "'", double1 == 0.999303822951033d);
    }

    @Test
    public void test7563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7563");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.35311624476434156d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test7564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7564");
        double double1 = org.apache.commons.math.util.FastMath.asinh(57.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.736275386267657d + "'", double1 == 4.736275386267657d);
    }

    @Test
    public void test7565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7565");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.4521234009544473d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.7634345120705515d + "'", double1 == 5.7634345120705515d);
    }

    @Test
    public void test7566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7566");
        long long2 = org.apache.commons.math.util.FastMath.max((-40L), (long) 4);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test7567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7567");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) (-40L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6981317007977318d) + "'", double1 == (-0.6981317007977318d));
    }

    @Test
    public void test7568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7568");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.571133392963435d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.30214479222872d + "'", double1 == 2.30214479222872d);
    }

    @Test
    public void test7569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7569");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.8564041843827944d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.354678462985771d + "'", double1 == 1.354678462985771d);
    }

    @Test
    public void test7570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7570");
        double double1 = org.apache.commons.math.util.FastMath.acos((-56.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7571");
        long long1 = org.apache.commons.math.util.FastMath.round(0.12376680396006796d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test7572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7572");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.01745583420411082d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01745494773428385d + "'", double1 == 0.01745494773428385d);
    }

    @Test
    public void test7573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7573");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.2214342272920196d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9395912563910053d + "'", double1 == 0.9395912563910053d);
    }

    @Test
    public void test7574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7574");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.175201187282749d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7575");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.4210854715202007E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7576");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.09065421450214453d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0904066903995229d) + "'", double1 == (-0.0904066903995229d));
    }

    @Test
    public void test7577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7577");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.21276782429758892d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7852031021269414d + "'", double1 == 1.7852031021269414d);
    }

    @Test
    public void test7578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7578");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9997844910483683d, (-0.030467198227893608d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.030467198227893608d) + "'", double2 == (-0.030467198227893608d));
    }

    @Test
    public void test7579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7579");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.9640575883393439d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.38134241198560453d + "'", double1 == 0.38134241198560453d);
    }

    @Test
    public void test7580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7580");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.9250245035569946d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3270448216204098d) + "'", double1 == (-1.3270448216204098d));
    }

    @Test
    public void test7581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7581");
        long long2 = org.apache.commons.math.util.FastMath.max(39481480091340L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 39481480091340L + "'", long2 == 39481480091340L);
    }

    @Test
    public void test7582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7582");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.8837010712667019d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test7583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7583");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.7598091759707638d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8350562737122849d + "'", double1 == 0.8350562737122849d);
    }

    @Test
    public void test7584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7584");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.246967376963645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.45900669444514d + "'", double1 == 8.45900669444514d);
    }

    @Test
    public void test7585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7585");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.130889871246794d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7586");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 100, (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test7587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7587");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.565614887623712d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.565614887623712d + "'", double1 == 1.565614887623712d);
    }

    @Test
    public void test7588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7588");
        long long2 = org.apache.commons.math.util.FastMath.min(32L, (long) (-3));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3L) + "'", long2 == (-3L));
    }

    @Test
    public void test7589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7589");
        int int1 = org.apache.commons.math.util.FastMath.round((float) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test7590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7590");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.5709773989134321d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7591");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-1.9127345492505299d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7592");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7848860063260921d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9025121380672287d + "'", double1 == 0.9025121380672287d);
    }

    @Test
    public void test7593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7593");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 2);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test7594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7594");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.035131231835661816d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.012871313279058d + "'", double1 == 2.012871313279058d);
    }

    @Test
    public void test7595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7595");
        double double2 = org.apache.commons.math.util.FastMath.min(2.56173368499807d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test7596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7596");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.49748126200706644d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 28.503576699846814d + "'", double1 == 28.503576699846814d);
    }

    @Test
    public void test7597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7597");
        long long2 = org.apache.commons.math.util.FastMath.max(36L, (long) 3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 36L + "'", long2 == 36L);
    }

    @Test
    public void test7598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7598");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(3.1415926535897927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.141592653589793d + "'", double1 == 3.141592653589793d);
    }

    @Test
    public void test7599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7599");
        double double2 = org.apache.commons.math.util.FastMath.atan2(74.90049393985227d, 1.3887317335324654d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5522574286012465d + "'", double2 == 1.5522574286012465d);
    }

    @Test
    public void test7600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7600");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 72);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.969765070778465d + "'", double1 == 4.969765070778465d);
    }

    @Test
    public void test7601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7601");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.12796368962740468d), 1.3450949723795793d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.09484812178416623d) + "'", double2 == (-0.09484812178416623d));
    }

    @Test
    public void test7602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7602");
        long long1 = org.apache.commons.math.util.FastMath.round(0.7103940468474689d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test7603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7603");
        double double1 = org.apache.commons.math.util.FastMath.log(1.3651941488254717d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3112966520944618d + "'", double1 == 0.3112966520944618d);
    }

    @Test
    public void test7604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7604");
        long long2 = org.apache.commons.math.util.FastMath.min(57L, 2147483647L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 57L + "'", long2 == 57L);
    }

    @Test
    public void test7605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7605");
        long long2 = org.apache.commons.math.util.FastMath.max(2L, (long) 6);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6L + "'", long2 == 6L);
    }

    @Test
    public void test7606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7606");
        long long1 = org.apache.commons.math.util.FastMath.round(1.893622651558004d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test7607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7607");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.8366617438896833d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7610410008828945d) + "'", double1 == (-0.7610410008828945d));
    }

    @Test
    public void test7608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7608");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8809373872769856d, 0.6250984987600411d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9536675017870196d + "'", double2 == 0.9536675017870196d);
    }

    @Test
    public void test7609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7609");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.2039819363249487d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8166805169409184d + "'", double1 == 1.8166805169409184d);
    }

    @Test
    public void test7610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7610");
        double double1 = org.apache.commons.math.util.FastMath.ulp(11013.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8189894035458565E-12d + "'", double1 == 1.8189894035458565E-12d);
    }

    @Test
    public void test7611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7611");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.9999999999999999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.141592638688632d + "'", double1 == 3.141592638688632d);
    }

    @Test
    public void test7612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7612");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.5395389476264498d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7613");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.7783730288530368d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7783730288530368d + "'", double1 == 0.7783730288530368d);
    }

    @Test
    public void test7614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7614");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.5093497777060075d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4876096657890749d + "'", double1 == 0.4876096657890749d);
    }

    @Test
    public void test7615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7615");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.6540753540578407d), 48.58673888783715d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6540753540578406d) + "'", double2 == (-0.6540753540578406d));
    }

    @Test
    public void test7616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7616");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.398032525970685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test7617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7617");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-4.258659887385141d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test7618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7618");
        double double1 = org.apache.commons.math.util.FastMath.log(0.5935574232371058d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5216213160540087d) + "'", double1 == (-0.5216213160540087d));
    }

    @Test
    public void test7619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7619");
        double double1 = org.apache.commons.math.util.FastMath.rint(3.113250378782928d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test7620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7620");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.2900710226066556d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.088607210942353d + "'", double1 == 1.088607210942353d);
    }

    @Test
    public void test7621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7621");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7346568543593086d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8251607552643501d + "'", double1 == 0.8251607552643501d);
    }

    @Test
    public void test7622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7622");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.07414666724177091d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1299083649462789d) + "'", double1 == (-1.1299083649462789d));
    }

    @Test
    public void test7623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7623");
        double double2 = org.apache.commons.math.util.FastMath.pow(22025.465703991664d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test7624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7624");
        int int2 = org.apache.commons.math.util.FastMath.min(32, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test7625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7625");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-10.017874927409903d), 3.1001094562563805d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-10.0178749274099d) + "'", double2 == (-10.0178749274099d));
    }

    @Test
    public void test7626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7626");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.4280746061686456d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1706612908217666d + "'", double1 == 3.1706612908217666d);
    }

    @Test
    public void test7627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7627");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 5, (float) 53L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 53.0f + "'", float2 == 53.0f);
    }

    @Test
    public void test7628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7628");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.5468167745441612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0031725358580863d + "'", double1 == 1.0031725358580863d);
    }

    @Test
    public void test7629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7629");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.08799424496928993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0881081988567413d + "'", double1 == 0.0881081988567413d);
    }

    @Test
    public void test7630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7630");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 100, 8L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8L + "'", long2 == 8L);
    }

    @Test
    public void test7631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7631");
        double double1 = org.apache.commons.math.util.FastMath.rint((-6.35039577400577d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.0d) + "'", double1 == (-6.0d));
    }

    @Test
    public void test7632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7632");
        long long1 = org.apache.commons.math.util.FastMath.round(18.72514057803899d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 19L + "'", long1 == 19L);
    }

    @Test
    public void test7633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7633");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.35994286797179614d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.34550500244040316d + "'", double1 == 0.34550500244040316d);
    }

    @Test
    public void test7634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7634");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.9771597781758796d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.303669529365979d + "'", double1 == 1.303669529365979d);
    }

    @Test
    public void test7635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7635");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.7447148114163482d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7636");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.8431082790768845d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7467141802221501d + "'", double1 == 0.7467141802221501d);
    }

    @Test
    public void test7637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7637");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.02174697385821922d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7638");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9303056814345817d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1952453729448023d + "'", double1 == 1.1952453729448023d);
    }

    @Test
    public void test7639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7639");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.6417418616465844d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5263747530530484d + "'", double1 == 0.5263747530530484d);
    }

    @Test
    public void test7640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7640");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5842760529028772d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7641");
        double double2 = org.apache.commons.math.util.FastMath.max(0.020018482464401233d, 68.40322401739334d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 68.40322401739334d + "'", double2 == 68.40322401739334d);
    }

    @Test
    public void test7642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7642");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.8207422758720628d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7487834366758533d + "'", double1 == 0.7487834366758533d);
    }

    @Test
    public void test7643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7643");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.14336970329182344d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8435426135449042d) + "'", double1 == (-0.8435426135449042d));
    }

    @Test
    public void test7644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7644");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.2917098371502295d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2960139365287292d) + "'", double1 == (-0.2960139365287292d));
    }

    @Test
    public void test7645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7645");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.995053588169564d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.998348470006747d + "'", double1 == 0.998348470006747d);
    }

    @Test
    public void test7646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7646");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.4876096657890749d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1212558129041699d + "'", double1 == 1.1212558129041699d);
    }

    @Test
    public void test7647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7647");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.37076030339985566d, 2.545185591332969E49d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test7648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7648");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 1, 13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test7649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7649");
        double double2 = org.apache.commons.math.util.FastMath.min(0.931066965681273d, 1.0000061571306742d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.931066965681273d + "'", double2 == 0.931066965681273d);
    }

    @Test
    public void test7650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7650");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.9825115290840873d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7651");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test7652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7652");
        long long2 = org.apache.commons.math.util.FastMath.max(1L, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test7653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7653");
        double double1 = org.apache.commons.math.util.FastMath.acos(4.418840607796598d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7654");
        double double1 = org.apache.commons.math.util.FastMath.ulp(9.558548063589361E-45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2446030555722283E-60d + "'", double1 == 1.2446030555722283E-60d);
    }

    @Test
    public void test7655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7655");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.02300811819039169d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0002646984280503d + "'", double1 == 1.0002646984280503d);
    }

    @Test
    public void test7656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7656");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.1311176344695068d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7022925899383916d + "'", double1 == 1.7022925899383916d);
    }

    @Test
    public void test7657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7657");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.5890984799380379d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6237677846415464d + "'", double1 == 0.6237677846415464d);
    }

    @Test
    public void test7658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7658");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.4161342916108155d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7659");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-1.125899906842619E15d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7660");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.01037448200916367d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.734723475976807E-18d + "'", double1 == 1.734723475976807E-18d);
    }

    @Test
    public void test7661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7661");
        int int2 = org.apache.commons.math.util.FastMath.max((-2), 11013);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11013 + "'", int2 == 11013);
    }

    @Test
    public void test7662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7662");
        int int1 = org.apache.commons.math.util.FastMath.abs(13);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 13 + "'", int1 == 13);
    }

    @Test
    public void test7663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7663");
        int int2 = org.apache.commons.math.util.FastMath.max((int) 'a', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test7664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7664");
        double double1 = org.apache.commons.math.util.FastMath.acos(3.810426271697788d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7665");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.24054396071325954d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2155499614204484d + "'", double1 == 0.2155499614204484d);
    }

    @Test
    public void test7666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7666");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.003767538053032665d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.215864029593707d + "'", double1 == 0.215864029593707d);
    }

    @Test
    public void test7667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7667");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.008838207883813802d), 2048.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2048.0d + "'", double2 == 2048.0d);
    }

    @Test
    public void test7668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7668");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.0070912050862004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7669");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-1), (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test7670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7670");
        double double1 = org.apache.commons.math.util.FastMath.log(0.7445203760756168d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.29501505842719694d) + "'", double1 == (-0.29501505842719694d));
    }

    @Test
    public void test7671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7671");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.193861478082777d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5261269750759006d + "'", double1 == 2.5261269750759006d);
    }

    @Test
    public void test7672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7672");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.3092866533194534d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 75.01659940801285d + "'", double1 == 75.01659940801285d);
    }

    @Test
    public void test7673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7673");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.1987501543833528d), (-0.4134332111535645d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.1987501543833528d) + "'", double2 == (-0.1987501543833528d));
    }

    @Test
    public void test7674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7674");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.1441365914888845d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7675");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.7182818172534524d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.574941462290356d + "'", double1 == 5.574941462290356d);
    }

    @Test
    public void test7676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7676");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.4430227241169226d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7623282273954515d + "'", double1 == 0.7623282273954515d);
    }

    @Test
    public void test7677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7677");
        long long2 = org.apache.commons.math.util.FastMath.min(6L, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test7678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7678");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.0017885376783291472d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0017869401493592816d + "'", double1 == 0.0017869401493592816d);
    }

    @Test
    public void test7679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7679");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.4001817886098734d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test7680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7680");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.230172207040889d, 1.1460783373166685d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2679670899058164d + "'", double2 == 1.2679670899058164d);
    }

    @Test
    public void test7681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7681");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.9355072424226104d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test7682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7682");
        long long1 = org.apache.commons.math.util.FastMath.round(0.22226708771129583d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test7683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7683");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.03492076949174774d), 0.011974771730399332d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.03492076949174773d) + "'", double2 == (-0.03492076949174773d));
    }

    @Test
    public void test7684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7684");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.8342233605065102d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7685");
        int int2 = org.apache.commons.math.util.FastMath.min(192, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test7686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7686");
        long long2 = org.apache.commons.math.util.FastMath.min(39481480091340L, (long) (-53));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-53L) + "'", long2 == (-53L));
    }

    @Test
    public void test7687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7687");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.4581113771324175d, (-0.7610410008828945d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4581113771324172d + "'", double2 == 1.4581113771324172d);
    }

    @Test
    public void test7688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7688");
        double double1 = org.apache.commons.math.util.FastMath.atanh(3036.676314193363d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }
}

