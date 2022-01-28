import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

    public static boolean debug = false;

    @Test
    public void test5501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5501");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.723728965735361d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.012631453344135275d + "'", double1 == 0.012631453344135275d);
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5502");
        double double1 = org.apache.commons.math.util.FastMath.rint(5.298292365610485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5503");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.5550255395263828d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9998756437119655d + "'", double1 == 0.9998756437119655d);
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5504");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.13211207761779425d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0023057907360808164d + "'", double1 == 0.0023057907360808164d);
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5505");
        double double1 = org.apache.commons.math.util.FastMath.atan(21.487562597823967d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5242913317944078d + "'", double1 == 1.5242913317944078d);
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5506");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.056630991823551025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05660072675846326d + "'", double1 == 0.05660072675846326d);
    }

    @Test
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5507");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.25482123991217503d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2605621335399806d + "'", double1 == 0.2605621335399806d);
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5508");
        float float2 = org.apache.commons.math.util.FastMath.max(11013.0f, (float) (-2));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11013.0f + "'", float2 == 11013.0f);
    }

    @Test
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5509");
        double double1 = org.apache.commons.math.util.FastMath.log10((-3.0972644080713274d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5510");
        double double1 = org.apache.commons.math.util.FastMath.expm1(22.18070977791825d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.2949672949999967E9d + "'", double1 == 4.2949672949999967E9d);
    }

    @Test
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5511");
        double double1 = org.apache.commons.math.util.FastMath.abs(9.998983441196998E-26d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.998983441196998E-26d + "'", double1 == 9.998983441196998E-26d);
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5512");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8143769628516082d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.059704476590046d + "'", double1 == 1.059704476590046d);
    }

    @Test
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5513");
        double double1 = org.apache.commons.math.util.FastMath.atanh(27.722354182756217d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5514");
        double double2 = org.apache.commons.math.util.FastMath.max(0.04742780763900985d, (-0.8554182836643193d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.04742780763900985d + "'", double2 == 0.04742780763900985d);
    }

    @Test
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5515");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.09388108110331789d), 0.24434609527920617d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.24434609527920617d + "'", double2 == 0.24434609527920617d);
    }

    @Test
    public void test5516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5516");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.1711987928317563d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5517");
        double double2 = org.apache.commons.math.util.FastMath.min(0.011974771730399332d, 0.19645390067470775d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.011974771730399332d + "'", double2 == 0.011974771730399332d);
    }

    @Test
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5518");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.2520209545994675d, (-0.008837862706915424d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0122552099119766d + "'", double2 == 1.0122552099119766d);
    }

    @Test
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5519");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) 3.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05235987755982989d + "'", double1 == 0.05235987755982989d);
    }

    @Test
    public void test5520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5520");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.55119399232989d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5521");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.7692389013639721d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.158123084021473d + "'", double1 == 2.158123084021473d);
    }

    @Test
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5522");
        double double1 = org.apache.commons.math.util.FastMath.cosh(3.506328628316938E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5523");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.6296609567811063d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7408541755525594d + "'", double1 == 0.7408541755525594d);
    }

    @Test
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5524");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.3072602306204815d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5525");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.618990892446662d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5802135739451127d + "'", double1 == 0.5802135739451127d);
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5526");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.5664399512265195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5153773811020362d + "'", double1 == 0.5153773811020362d);
    }

    @Test
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5527");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-15.653559774527022d) + "'", double1 == (-15.653559774527022d));
    }

    @Test
    public void test5528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5528");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 100, (float) (-2L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5529");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.386916313601571d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18284554275714865d + "'", double1 == 0.18284554275714865d);
    }

    @Test
    public void test5530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5530");
        double double2 = org.apache.commons.math.util.FastMath.max(2.718281828459047d, 8.88178419700125E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.718281828459047d + "'", double2 == 2.718281828459047d);
    }

    @Test
    public void test5531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5531");
        long long1 = org.apache.commons.math.util.FastMath.round(0.01568485717214877d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test5532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5532");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.9991396955517629d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5533");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.011900427241491611d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011900427241491611d + "'", double1 == 0.011900427241491611d);
    }

    @Test
    public void test5534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5534");
        double double1 = org.apache.commons.math.util.FastMath.log(0.0037857698423101618d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.576506019825743d) + "'", double1 == (-5.576506019825743d));
    }

    @Test
    public void test5535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5535");
        double double1 = org.apache.commons.math.util.FastMath.abs(3.1554436208840472E-30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1554436208840472E-30d + "'", double1 == 3.1554436208840472E-30d);
    }

    @Test
    public void test5536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5536");
        double double1 = org.apache.commons.math.util.FastMath.log(3.414062290979883d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2279028699526873d + "'", double1 == 1.2279028699526873d);
    }

    @Test
    public void test5537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5537");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.5716315636979223d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5538");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.5433467420946743d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.026936482149479832d + "'", double1 == 0.026936482149479832d);
    }

    @Test
    public void test5539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5539");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.6242716385733329d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5895259354388283d + "'", double1 == 0.5895259354388283d);
    }

    @Test
    public void test5540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5540");
        double double2 = org.apache.commons.math.util.FastMath.max(0.07987607545345242d, 1.0602412165727728d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0602412165727728d + "'", double2 == 1.0602412165727728d);
    }

    @Test
    public void test5541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5541");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(5.916079783099616d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4322992790977875d + "'", double1 == 2.4322992790977875d);
    }

    @Test
    public void test5542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5542");
        long long1 = org.apache.commons.math.util.FastMath.round(2.3398626545797663E25d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test5543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5543");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.8366617438896834d), 4.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
    }

    @Test
    public void test5544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5544");
        float float2 = org.apache.commons.math.util.FastMath.max(14.0f, (float) (-3L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 14.0f + "'", float2 == 14.0f);
    }

    @Test
    public void test5545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5545");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.5013507798060324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5251592253256172d + "'", double1 == 0.5251592253256172d);
    }

    @Test
    public void test5546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5546");
        double double1 = org.apache.commons.math.util.FastMath.floor(68.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 68.0d + "'", double1 == 68.0d);
    }

    @Test
    public void test5547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5547");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9171379122748513d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7245406234447188d + "'", double1 == 0.7245406234447188d);
    }

    @Test
    public void test5548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5548");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.9063773800902429d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9063773800902429d + "'", double1 == 0.9063773800902429d);
    }

    @Test
    public void test5549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5549");
        int int2 = org.apache.commons.math.util.FastMath.max((int) 'a', 175);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 175 + "'", int2 == 175);
    }

    @Test
    public void test5550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5550");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.4176620615017429d), 0.26793352011819255d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0004141180816055d) + "'", double2 == (-1.0004141180816055d));
    }

    @Test
    public void test5551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5551");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.1819139347123162d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5552");
        double double1 = org.apache.commons.math.util.FastMath.rint(200.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 200.0d + "'", double1 == 200.0d);
    }

    @Test
    public void test5553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5553");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.993848217574073d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test5554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5554");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.0000000000000018d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.71461973242629E-16d + "'", double1 == 7.71461973242629E-16d);
    }

    @Test
    public void test5555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5555");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.7746914034386123d, 0.9374115152313492d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6906417042268358d + "'", double2 == 0.6906417042268358d);
    }

    @Test
    public void test5556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5556");
        double double1 = org.apache.commons.math.util.FastMath.sin(3.1415926535897927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.66553889764798E-16d + "'", double1 == 5.66553889764798E-16d);
    }

    @Test
    public void test5557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5557");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 72, (float) 5L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test5558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5558");
        double double1 = org.apache.commons.math.util.FastMath.tan(23.140692632779267d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2317672777233026d + "'", double1 == 2.2317672777233026d);
    }

    @Test
    public void test5559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5559");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.017067660809719984d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017214992139553676d) + "'", double1 == (-0.017214992139553676d));
    }

    @Test
    public void test5560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5560");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7615941559557649d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6420149920119997d + "'", double1 == 0.6420149920119997d);
    }

    @Test
    public void test5561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5561");
        double double2 = org.apache.commons.math.util.FastMath.pow(4.941387233322628d, 39.82204982013094d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.270561880171768E27d + "'", double2 == 4.270561880171768E27d);
    }

    @Test
    public void test5562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5562");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.27281660270156344d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2412322421907798d + "'", double1 == 0.2412322421907798d);
    }

    @Test
    public void test5563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5563");
        long long1 = org.apache.commons.math.util.FastMath.round(13.226071567304755d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 13L + "'", long1 == 13L);
    }

    @Test
    public void test5564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5564");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.7237289657353608d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5565");
        double double2 = org.apache.commons.math.util.FastMath.min(1.9771597781758796d, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9771597781758796d + "'", double2 == 1.9771597781758796d);
    }

    @Test
    public void test5566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5566");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.544753606236012E-12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.544753606236012E-12d + "'", double1 == 1.544753606236012E-12d);
    }

    @Test
    public void test5567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5567");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.37754243147639266d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.45869533707796534d + "'", double1 == 0.45869533707796534d);
    }

    @Test
    public void test5568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5568");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-4.258659887385141d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5569");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.023970365332605832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5570");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9918956474731392d, 0.5686300059875781d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5686300059875781d + "'", double2 == 0.5686300059875781d);
    }

    @Test
    public void test5571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5571");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.3168008123704915d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5572");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 4L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test5573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5573");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 175);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10026.761414789406d + "'", double1 == 10026.761414789406d);
    }

    @Test
    public void test5574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5574");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.44863321586778093d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7655328088625728d + "'", double1 == 0.7655328088625728d);
    }

    @Test
    public void test5575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5575");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.7084672892615039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7692389013639721d + "'", double1 == 0.7692389013639721d);
    }

    @Test
    public void test5576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5576");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.44316034533777954d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.41715152977858005d + "'", double1 == 0.41715152977858005d);
    }

    @Test
    public void test5577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5577");
        double double2 = org.apache.commons.math.util.FastMath.min(1.175035239470709d, 0.9171523356672744d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9171523356672744d + "'", double2 == 0.9171523356672744d);
    }

    @Test
    public void test5578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5578");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.2568711084276258d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5579");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(3.948148009133999E13d, 2.41014226417523d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.9481480091339984E13d + "'", double2 == 3.9481480091339984E13d);
    }

    @Test
    public void test5580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5580");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(8.213053064948797d, 0.6763796495118177d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.213053064948795d + "'", double2 == 8.213053064948795d);
    }

    @Test
    public void test5581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5581");
        float float2 = org.apache.commons.math.util.FastMath.max(2.14748365E9f, (float) 35L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test5582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5582");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.7184726744159351d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 41.16545193951d + "'", double1 == 41.16545193951d);
    }

    @Test
    public void test5583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5583");
        double double1 = org.apache.commons.math.util.FastMath.atan(8388608.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.570796207585607d + "'", double1 == 1.570796207585607d);
    }

    @Test
    public void test5584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5584");
        float float2 = org.apache.commons.math.util.FastMath.min(5.0f, (float) 2);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test5585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5585");
        double double2 = org.apache.commons.math.util.FastMath.min(5.955817372303998d, 1.2358573269771982d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2358573269771982d + "'", double2 == 1.2358573269771982d);
    }

    @Test
    public void test5586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5586");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.5396786341454742d, 0.8117490720018438d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0856107434301194d + "'", double2 == 1.0856107434301194d);
    }

    @Test
    public void test5587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5587");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.20140916094505582d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.20007171872399807d) + "'", double1 == (-0.20007171872399807d));
    }

    @Test
    public void test5588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5588");
        double double1 = org.apache.commons.math.util.FastMath.tanh(205.3205109787361d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5589");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.16033135365260598d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16101915387533275d + "'", double1 == 0.16101915387533275d);
    }

    @Test
    public void test5590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5590");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.426490964964291d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5591");
        double double1 = org.apache.commons.math.util.FastMath.log(1.9778913495481287d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6820313022419585d + "'", double1 == 0.6820313022419585d);
    }

    @Test
    public void test5592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5592");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.033755946293507505d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0343321433287331d + "'", double1 == 1.0343321433287331d);
    }

    @Test
    public void test5593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5593");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.717637540215414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5491341039759408d + "'", double1 == 1.5491341039759408d);
    }

    @Test
    public void test5594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5594");
        double double1 = org.apache.commons.math.util.FastMath.log1p(34.29227537470679d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.563664112080941d + "'", double1 == 3.563664112080941d);
    }

    @Test
    public void test5595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5595");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 53, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5596");
        double double2 = org.apache.commons.math.util.FastMath.min(0.4120062944864213d, 0.723728965735361d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4120062944864213d + "'", double2 == 0.4120062944864213d);
    }

    @Test
    public void test5597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5597");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 100, 6L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test5598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5598");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.056630991823551025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05669164842155338d + "'", double1 == 0.05669164842155338d);
    }

    @Test
    public void test5599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5599");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-5.298521458713987d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-303.5829172438119d) + "'", double1 == (-303.5829172438119d));
    }

    @Test
    public void test5600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5600");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.8872978375373093E32d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8872978375373093E32d + "'", double1 == 1.8872978375373093E32d);
    }

    @Test
    public void test5601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5601");
        double double1 = org.apache.commons.math.util.FastMath.log(0.931066965681273d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07142407552568322d) + "'", double1 == (-0.07142407552568322d));
    }

    @Test
    public void test5602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5602");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.234021194410018d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.722217422458344d + "'", double1 == 4.722217422458344d);
    }

    @Test
    public void test5603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5603");
        double double2 = org.apache.commons.math.util.FastMath.pow(28.458847799916846d, 0.026936482149479832d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0943884443750458d + "'", double2 == 1.0943884443750458d);
    }

    @Test
    public void test5604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5604");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 0.7184726744159351d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test5605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5605");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.951998196031877d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5606");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.7105940846527337d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7105940846527337d + "'", double1 == 2.7105940846527337d);
    }

    @Test
    public void test5607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5607");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.5872139151569291d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5608");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.716759133972877d, 1.5563025007672873d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.318882667177545d + "'", double2 == 2.318882667177545d);
    }

    @Test
    public void test5609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5609");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.7112911764025783d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 40.75398241276307d + "'", double1 == 40.75398241276307d);
    }

    @Test
    public void test5610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5610");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.9117339147869651d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7392602334708254d) + "'", double1 == (-0.7392602334708254d));
    }

    @Test
    public void test5611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5611");
        int int1 = org.apache.commons.math.util.FastMath.round(8.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test5612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5612");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.4932054413052554d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3069721406817174d) + "'", double1 == (-0.3069721406817174d));
    }

    @Test
    public void test5613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5613");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2955791.9999996633d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5614");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.1515752048564124d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5615");
        double double1 = org.apache.commons.math.util.FastMath.acos(5506.500045400885d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5616");
        long long1 = org.apache.commons.math.util.FastMath.abs(14L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 14L + "'", long1 == 14L);
    }

    @Test
    public void test5617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5617");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9033391107665127d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.467829725531415d + "'", double1 == 2.467829725531415d);
    }

    @Test
    public void test5618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5618");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.3565686652647782d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8212042568879515d + "'", double1 == 0.8212042568879515d);
    }

    @Test
    public void test5619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5619");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 2147483647L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test5620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5620");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9028219555251866d, 0.8973607083412377d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9028219555251866d + "'", double2 == 0.9028219555251866d);
    }

    @Test
    public void test5621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5621");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.0523779637351338d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2576739981725682d + "'", double1 == 1.2576739981725682d);
    }

    @Test
    public void test5622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5622");
        int int2 = org.apache.commons.math.util.FastMath.max((-2), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5623");
        double double2 = org.apache.commons.math.util.FastMath.max(2.160950374690384d, 0.9999999998798416d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.160950374690384d + "'", double2 == 2.160950374690384d);
    }

    @Test
    public void test5624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5624");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9751009553485449d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test5625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5625");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test5626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5626");
        double double2 = org.apache.commons.math.util.FastMath.atan2(22.248715407683253d, 3.2710663101885897d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4248194237419025d + "'", double2 == 1.4248194237419025d);
    }

    @Test
    public void test5627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5627");
        double double1 = org.apache.commons.math.util.FastMath.acosh(4.9E-324d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5628");
        double double1 = org.apache.commons.math.util.FastMath.tan(16.62301213247846d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.29986057049139d + "'", double1 == 1.29986057049139d);
    }

    @Test
    public void test5629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5629");
        double double2 = org.apache.commons.math.util.FastMath.max(49.808571860978134d, 0.5954732329718483d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 49.808571860978134d + "'", double2 == 49.808571860978134d);
    }

    @Test
    public void test5630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5630");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.3130883967082236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5631");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.9250245035569946d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7464700251546736d) + "'", double1 == (-0.7464700251546736d));
    }

    @Test
    public void test5632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5632");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.5138952820284055d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5443980746053536d + "'", double1 == 3.5443980746053536d);
    }

    @Test
    public void test5633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5633");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9430016488922662d, (-0.16174140574189208d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.16174140574189208d) + "'", double2 == (-0.16174140574189208d));
    }

    @Test
    public void test5634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5634");
        double double1 = org.apache.commons.math.util.FastMath.cosh(4.61512051684126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 50.50495049504951d + "'", double1 == 50.50495049504951d);
    }

    @Test
    public void test5635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5635");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.3069721406817174d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8828062545941502d + "'", double1 == 1.8828062545941502d);
    }

    @Test
    public void test5636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5636");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.7541941649741823d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 157.80370161257864d + "'", double1 == 157.80370161257864d);
    }

    @Test
    public void test5637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5637");
        double double1 = org.apache.commons.math.util.FastMath.asinh(11013.232874703413d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.000000000000002d + "'", double1 == 10.000000000000002d);
    }

    @Test
    public void test5638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5638");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.33784800591283637d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3255548317562731d + "'", double1 == 0.3255548317562731d);
    }

    @Test
    public void test5639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5639");
        int int2 = org.apache.commons.math.util.FastMath.max(8, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test5640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5640");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.42011083099619667d, 57.29577951308232d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.632326872476838E-22d + "'", double2 == 2.632326872476838E-22d);
    }

    @Test
    public void test5641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5641");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.41386729841516146d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5642");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 32, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5643");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(13.782153736230454d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3975758935864295d + "'", double1 == 2.3975758935864295d);
    }

    @Test
    public void test5644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5644");
        int int2 = org.apache.commons.math.util.FastMath.min(36, 72);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test5645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5645");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(3.6237264565928684d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.623726456592868d + "'", double2 == 3.623726456592868d);
    }

    @Test
    public void test5646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5646");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-2.4376760684376033d), (-0.43087067877290786d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.437676068437603d) + "'", double2 == (-2.437676068437603d));
    }

    @Test
    public void test5647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5647");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.594985873324243E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02517207093756238d + "'", double1 == 0.02517207093756238d);
    }

    @Test
    public void test5648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5648");
        float float2 = org.apache.commons.math.util.FastMath.max(72.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 72.0f + "'", float2 == 72.0f);
    }

    @Test
    public void test5649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5649");
        double double1 = org.apache.commons.math.util.FastMath.log(1.8369144593899815d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6080872397649996d + "'", double1 == 0.6080872397649996d);
    }

    @Test
    public void test5650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5650");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 1833, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test5651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5651");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.22269503511219027d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22269503511219027d + "'", double1 == 0.22269503511219027d);
    }

    @Test
    public void test5652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5652");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.7966043547446022d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 45.64206746860794d + "'", double1 == 45.64206746860794d);
    }

    @Test
    public void test5653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5653");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9988046725113348d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9988046725113348d + "'", double1 == 0.9988046725113348d);
    }

    @Test
    public void test5654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5654");
        double double1 = org.apache.commons.math.util.FastMath.tanh(5729.5779513082325d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5655");
        double double1 = org.apache.commons.math.util.FastMath.floor(29.61987058113476d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 29.0d + "'", double1 == 29.0d);
    }

    @Test
    public void test5656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5656");
        double double1 = org.apache.commons.math.util.FastMath.acos((-3.626860407847018d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5657");
        long long1 = org.apache.commons.math.util.FastMath.round(3.469446951953614E-18d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test5658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5658");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.2331159284334476d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.037002019659423d + "'", double1 == 1.037002019659423d);
    }

    @Test
    public void test5659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5659");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 2, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test5660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5660");
        double double2 = org.apache.commons.math.util.FastMath.pow((-11.046068560414216d), 0.4038812776339933d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test5661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5661");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.18349077126961408d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0168817176262221d + "'", double1 == 1.0168817176262221d);
    }

    @Test
    public void test5662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5662");
        long long2 = org.apache.commons.math.util.FastMath.min(8L, (long) 1833);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8L + "'", long2 == 8L);
    }

    @Test
    public void test5663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5663");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.01706517535661036d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5664");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 1477896, 11013L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11013L + "'", long2 == 11013L);
    }

    @Test
    public void test5665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5665");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 4, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test5666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5666");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.07752552270710597d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07752552270710596d) + "'", double1 == (-0.07752552270710596d));
    }

    @Test
    public void test5667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5667");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.917152335778733d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6508409266228803d + "'", double1 == 0.6508409266228803d);
    }

    @Test
    public void test5668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5668");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.1310377402202207d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4257210334580655d + "'", double1 == 0.4257210334580655d);
    }

    @Test
    public void test5669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5669");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.597379374759859d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6802964937290176d + "'", double1 == 0.6802964937290176d);
    }

    @Test
    public void test5670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5670");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.1161530356493914d, 3.302190676759448d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1161530356493916d + "'", double2 == 1.1161530356493916d);
    }

    @Test
    public void test5671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5671");
        double double2 = org.apache.commons.math.util.FastMath.min(1.0737192693285789E-5d, 1.128330879172867d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0737192693285789E-5d + "'", double2 == 1.0737192693285789E-5d);
    }

    @Test
    public void test5672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5672");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.3284512750821519d), 0.9698479895022746d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.3265392325921992d) + "'", double2 == (-0.3265392325921992d));
    }

    @Test
    public void test5673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5673");
        double double1 = org.apache.commons.math.util.FastMath.signum((-103.97207708399179d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5674");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.818989403545857E-12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0389678347315804E-28d + "'", double1 == 4.0389678347315804E-28d);
    }

    @Test
    public void test5675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5675");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 0, (-36));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-36) + "'", int2 == (-36));
    }

    @Test
    public void test5676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5676");
        int int2 = org.apache.commons.math.util.FastMath.max(100, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test5677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5677");
        double double1 = org.apache.commons.math.util.FastMath.signum(7.488068777620869d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5678");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8726936208978296d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9877621911907258d + "'", double1 == 0.9877621911907258d);
    }

    @Test
    public void test5679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5679");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5680");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.5799018512655504d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6129549096811784d + "'", double1 == 0.6129549096811784d);
    }

    @Test
    public void test5681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5681");
        double double2 = org.apache.commons.math.util.FastMath.min(1.8248883136696412d, 0.7189991032004813d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7189991032004813d + "'", double2 == 0.7189991032004813d);
    }

    @Test
    public void test5682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5682");
        double double1 = org.apache.commons.math.util.FastMath.signum(3.1415926535897927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5683");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.995950244065464d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.100109456256378d + "'", double1 == 3.100109456256378d);
    }

    @Test
    public void test5684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5684");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.5430365305682094d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49748126200706644d + "'", double1 == 0.49748126200706644d);
    }

    @Test
    public void test5685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5685");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.010374668122887301d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01037448202118146d) + "'", double1 == (-0.01037448202118146d));
    }

    @Test
    public void test5686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5686");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.7237368419565783d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8978288579319995d + "'", double1 == 0.8978288579319995d);
    }

    @Test
    public void test5687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5687");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.554310590391778d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.554310590391778d + "'", double1 == 0.554310590391778d);
    }

    @Test
    public void test5688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5688");
        int int2 = org.apache.commons.math.util.FastMath.max((-36), 72);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72 + "'", int2 == 72);
    }

    @Test
    public void test5689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5689");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.6931471805599463d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6389612763136355d + "'", double1 == 0.6389612763136355d);
    }

    @Test
    public void test5690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5690");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.999615353518653d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.863185875775808d) + "'", double1 == (-7.863185875775808d));
    }

    @Test
    public void test5691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5691");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) 14.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.0d + "'", double1 == 14.0d);
    }

    @Test
    public void test5692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5692");
        double double1 = org.apache.commons.math.util.FastMath.cos(32.987888475352904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0011656123961307659d) + "'", double1 == (-0.0011656123961307659d));
    }

    @Test
    public void test5693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5693");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.7408541755525594d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7408541755525595d + "'", double1 == 0.7408541755525595d);
    }

    @Test
    public void test5694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5694");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.12376680396006796d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.35180506528483635d + "'", double1 == 0.35180506528483635d);
    }

    @Test
    public void test5695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5695");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.01706517535661036d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01692120090938161d + "'", double1 == 0.01692120090938161d);
    }

    @Test
    public void test5696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5696");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.9442790704566704d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3943740783794965d + "'", double1 == 1.3943740783794965d);
    }

    @Test
    public void test5697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5697");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.01692120090938161d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01706517535661036d + "'", double1 == 0.01706517535661036d);
    }

    @Test
    public void test5698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5698");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9643200333078156d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7672361313065863d + "'", double1 == 0.7672361313065863d);
    }

    @Test
    public void test5699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5699");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.5777877754722899d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1716150192074115d + "'", double1 == 1.1716150192074115d);
    }

    @Test
    public void test5700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5700");
        float float2 = org.apache.commons.math.util.FastMath.max((-3.0f), 9.223372E18f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test5701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5701");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.428182669496151d), (-0.5063656411097588d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5063656411097588d) + "'", double2 == (-0.5063656411097588d));
    }

    @Test
    public void test5702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5702");
        int int1 = org.apache.commons.math.util.FastMath.abs(8);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test5703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5703");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9374115152313492d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5704");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.5815258540844127d), 1.450905222306537d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5815258540844127d) + "'", double2 == (-0.5815258540844127d));
    }

    @Test
    public void test5705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5705");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5706");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.0001456277756542d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01745583420411082d + "'", double1 == 0.01745583420411082d);
    }

    @Test
    public void test5707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5707");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.6356319499883114d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5708");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.9006957856321915d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4261571863366689d + "'", double1 == 1.4261571863366689d);
    }

    @Test
    public void test5709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5709");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9422278221222946d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9803593788579685d + "'", double1 == 0.9803593788579685d);
    }

    @Test
    public void test5710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5710");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.586013452313442E15d, (-0.8813735870195429d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5860134523134418E15d + "'", double2 == 1.5860134523134418E15d);
    }

    @Test
    public void test5711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5711");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.2992643663336907d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.005223148526417374d) + "'", double1 == (-0.005223148526417374d));
    }

    @Test
    public void test5712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5712");
        double double1 = org.apache.commons.math.util.FastMath.sin(41.67132555791601d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7383503679489256d) + "'", double1 == (-0.7383503679489256d));
    }

    @Test
    public void test5713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5713");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 72, (long) 11013);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 72L + "'", long2 == 72L);
    }

    @Test
    public void test5714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5714");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.883847335314108d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test5715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5715");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.761511811895975d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7237936631680894d + "'", double1 == 0.7237936631680894d);
    }

    @Test
    public void test5716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5716");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.18911453025066113d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19026032645010738d + "'", double1 == 0.19026032645010738d);
    }

    @Test
    public void test5717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5717");
        double double1 = org.apache.commons.math.util.FastMath.signum((-100.01791180959569d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5718");
        double double1 = org.apache.commons.math.util.FastMath.acos(3.133577208235657d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5719");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.99822295029797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test5720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5720");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 10, (-36));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-36) + "'", int2 == (-36));
    }

    @Test
    public void test5721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5721");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.1563686078816606d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test5722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5722");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, 4L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5723");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.22766430356286294d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5724");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 32, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test5725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5725");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5726");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9994974667686599d, (double) (-2.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0010058245895832d + "'", double2 == 1.0010058245895832d);
    }

    @Test
    public void test5727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5727");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.9867717342662448d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.71454639108536d + "'", double1 == 3.71454639108536d);
    }

    @Test
    public void test5728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5728");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.5422326689561365d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.6750163915861345d + "'", double1 == 4.6750163915861345d);
    }

    @Test
    public void test5729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5729");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) 9.223372E18f, 100.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.2233720368547748E18d + "'", double2 == 9.2233720368547748E18d);
    }

    @Test
    public void test5730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5730");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.5707963267948954d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19611987703015232d + "'", double1 == 0.19611987703015232d);
    }

    @Test
    public void test5731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5731");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5732");
        double double1 = org.apache.commons.math.util.FastMath.expm1(64.40683631162594d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.365556905258951E27d + "'", double1 == 9.365556905258951E27d);
    }

    @Test
    public void test5733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5733");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.145976303209723d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8533167950857333d + "'", double1 == 0.8533167950857333d);
    }

    @Test
    public void test5734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5734");
        double double1 = org.apache.commons.math.util.FastMath.sin(3.9697296111063074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7366727689725221d) + "'", double1 == (-0.7366727689725221d));
    }

    @Test
    public void test5735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5735");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.9032305497763704d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test5736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5736");
        long long2 = org.apache.commons.math.util.FastMath.max(11013L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11013L + "'", long2 == 11013L);
    }

    @Test
    public void test5737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5737");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-2.872201959037427d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5738");
        double double2 = org.apache.commons.math.util.FastMath.min(140.80202161000474d, 0.4999119425680455d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4999119425680455d + "'", double2 == 0.4999119425680455d);
    }

    @Test
    public void test5739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5739");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 4, (float) (-53));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test5740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5740");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.6931471805599462d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5741");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9991396955517629d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017438277374752006d + "'", double1 == 0.017438277374752006d);
    }

    @Test
    public void test5742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5742");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.9600876852440052d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test5743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5743");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.3440585709080678E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6661404377193025E21d + "'", double1 == 3.6661404377193025E21d);
    }

    @Test
    public void test5744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5744");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.762195691083632d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 21.509799193225266d + "'", double1 == 21.509799193225266d);
    }

    @Test
    public void test5745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5745");
        double double1 = org.apache.commons.math.util.FastMath.log((-1.5085287961297d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5746");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.27631948176648663d, 24.89046237609173d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2763194817664867d + "'", double2 == 0.2763194817664867d);
    }

    @Test
    public void test5747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5747");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(3.320630207612775d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 190.25809621986232d + "'", double1 == 190.25809621986232d);
    }

    @Test
    public void test5748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5748");
        double double1 = org.apache.commons.math.util.FastMath.signum((-1.2026568540739422d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5749");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-2L), 1477896.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test5750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5750");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.3246090892520057d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5751");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.6695915964485293E-9d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5752");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.017154745458683805d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0001471462544045d + "'", double1 == 1.0001471462544045d);
    }

    @Test
    public void test5753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5753");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.158123084021473d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.654877925489926d + "'", double1 == 8.654877925489926d);
    }

    @Test
    public void test5754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5754");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.25d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.25000000000000006d + "'", double1 == 0.25000000000000006d);
    }

    @Test
    public void test5755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5755");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 10L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 10.0f + "'", float1 == 10.0f);
    }

    @Test
    public void test5756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5756");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.07752552270710597d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9969964014706699d + "'", double1 == 0.9969964014706699d);
    }

    @Test
    public void test5757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5757");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.6576833375608168d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5768196182814035d) + "'", double1 == (-0.5768196182814035d));
    }

    @Test
    public void test5758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5758");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 1, (float) 4L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test5759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5759");
        double double2 = org.apache.commons.math.util.FastMath.max(8.303497389620347E13d, 1.0591373678933207d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.303497389620347E13d + "'", double2 == 8.303497389620347E13d);
    }

    @Test
    public void test5760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5760");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.1235887436374343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8088135854621756d + "'", double1 == 0.8088135854621756d);
    }

    @Test
    public void test5761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5761");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.133577208235657d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.456194684324657d + "'", double1 == 11.456194684324657d);
    }

    @Test
    public void test5762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5762");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.6069417913449664d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5763");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 72L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4125.296124941927d + "'", double1 == 4125.296124941927d);
    }

    @Test
    public void test5764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5764");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.07752552270710597d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5765");
        float float2 = org.apache.commons.math.util.FastMath.min(5.0f, (float) (-3));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.0f) + "'", float2 == (-3.0f));
    }

    @Test
    public void test5766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5766");
        double double1 = org.apache.commons.math.util.FastMath.sinh(43.66827237527655d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.6116860184273725E18d + "'", double1 == 4.6116860184273725E18d);
    }

    @Test
    public void test5767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5767");
        double double2 = org.apache.commons.math.util.FastMath.min(1.0168817176262221d, 0.7944146264030464d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7944146264030464d + "'", double2 == 0.7944146264030464d);
    }

    @Test
    public void test5768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5768");
        double double2 = org.apache.commons.math.util.FastMath.min(0.7805951733159242d, 0.5896069690147183d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5896069690147183d + "'", double2 == 0.5896069690147183d);
    }

    @Test
    public void test5769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5769");
        long long1 = org.apache.commons.math.util.FastMath.round((-1.62129253189115E-6d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test5770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5770");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 52L, (float) 2147483647);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test5771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5771");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.8415496589078763d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6663080820223959d + "'", double1 == 0.6663080820223959d);
    }

    @Test
    public void test5772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5772");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.21551488653168732d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9768664149921191d + "'", double1 == 0.9768664149921191d);
    }

    @Test
    public void test5773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5773");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.9434257847789064d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8095738445451324d) + "'", double1 == (-0.8095738445451324d));
    }

    @Test
    public void test5774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5774");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 8, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test5775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5775");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.5711333929634348d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.81209910344353d + "'", double1 == 3.81209910344353d);
    }

    @Test
    public void test5776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5776");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) 53);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.724275869600789d + "'", double1 == 1.724275869600789d);
    }

    @Test
    public void test5777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5777");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.110676677762472d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.001931672432123927d + "'", double1 == 0.001931672432123927d);
    }

    @Test
    public void test5778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5778");
        double double1 = org.apache.commons.math.util.FastMath.rint(45.41047360972814d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 45.0d + "'", double1 == 45.0d);
    }

    @Test
    public void test5779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5779");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 8L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test5780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5780");
        double double1 = org.apache.commons.math.util.FastMath.asin(9.138520470401178E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.138521742370333E-4d + "'", double1 == 9.138521742370333E-4d);
    }

    @Test
    public void test5781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5781");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.0730374999763912d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.477457521705939d + "'", double1 == 0.477457521705939d);
    }

    @Test
    public void test5782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5782");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.05469123964916419d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05471854119667448d + "'", double1 == 0.05471854119667448d);
    }

    @Test
    public void test5783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5783");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.9328075542772654d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7506479903820885d) + "'", double1 == (-0.7506479903820885d));
    }

    @Test
    public void test5784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5784");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.175035239470709d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5785");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.2958646320794195d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5786");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.6360918665423811d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8890836430372238d + "'", double1 == 1.8890836430372238d);
    }

    @Test
    public void test5787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5787");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.5707055250154316d, 0.6906417042268358d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1565394947802499d + "'", double2 == 1.1565394947802499d);
    }

    @Test
    public void test5788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5788");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.594973153695066E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7837533012896467E-7d + "'", double1 == 2.7837533012896467E-7d);
    }

    @Test
    public void test5789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5789");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 36L, 9.223372E18f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 36.0f + "'", float2 == 36.0f);
    }

    @Test
    public void test5790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5790");
        double double1 = org.apache.commons.math.util.FastMath.signum(3.623726456592868d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5791");
        double double2 = org.apache.commons.math.util.FastMath.max(0.09950371902099892d, (-0.39100074888013286d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.09950371902099892d + "'", double2 == 0.09950371902099892d);
    }

    @Test
    public void test5792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5792");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9643200333078156d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8216615418906639d + "'", double1 == 0.8216615418906639d);
    }

    @Test
    public void test5793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5793");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.348459106948174d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5248449994838751d + "'", double1 == 0.5248449994838751d);
    }

    @Test
    public void test5794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5794");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.5706386041602216d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.8097187196293865d + "'", double1 == 4.8097187196293865d);
    }

    @Test
    public void test5795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5795");
        double double1 = org.apache.commons.math.util.FastMath.signum(5.66553889764798E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5796");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 175L, (float) 1833);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1833.0f + "'", float2 == 1833.0f);
    }

    @Test
    public void test5797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5797");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9870017657767483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6866268522339796d + "'", double1 == 0.6866268522339796d);
    }

    @Test
    public void test5798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5798");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.5834576238765345d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8482442834904255d) + "'", double1 == (-0.8482442834904255d));
    }

    @Test
    public void test5799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5799");
        long long2 = org.apache.commons.math.util.FastMath.min(4L, 2147483647L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test5800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5800");
        float float2 = org.apache.commons.math.util.FastMath.min(72.0f, (float) 3L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test5801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5801");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.846168432333387d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.846168432333387d + "'", double1 == 0.846168432333387d);
    }

    @Test
    public void test5802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5802");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.8517150827024451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.106884387721523d + "'", double1 == 3.106884387721523d);
    }

    @Test
    public void test5803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5803");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5804");
        double double1 = org.apache.commons.math.util.FastMath.atan(4.244277192748949d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3394050632363703d + "'", double1 == 1.3394050632363703d);
    }

    @Test
    public void test5805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5805");
        long long1 = org.apache.commons.math.util.FastMath.round(0.5093497777060075d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test5806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5806");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.7420608187820846d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5807");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 100, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test5808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5808");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.2648389735541739d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test5809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5809");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-1.6567305011816795d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5810");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) 52L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.00000000000001d + "'", double1 == 52.00000000000001d);
    }

    @Test
    public void test5811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5811");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.7237936631680894d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5812");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-265.42343799244867d), (-49.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-265.4234379924486d) + "'", double2 == (-265.4234379924486d));
    }

    @Test
    public void test5813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5813");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 1, (float) 14L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test5814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5814");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-1.2245999714347802d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.021373301521365424d) + "'", double1 == (-0.021373301521365424d));
    }

    @Test
    public void test5815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5815");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.0017901380658194d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.723152286329157d + "'", double1 == 2.723152286329157d);
    }

    @Test
    public void test5816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5816");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(53.598150033144236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9354641910562748d + "'", double1 == 0.9354641910562748d);
    }

    @Test
    public void test5817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5817");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 2, 8L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test5818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5818");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.0828994398682557d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03458812907405596d + "'", double1 == 0.03458812907405596d);
    }

    @Test
    public void test5819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5819");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9999990845927568d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5403030761565478d + "'", double1 == 0.5403030761565478d);
    }

    @Test
    public void test5820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5820");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.15958182281264355d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.01276022434347d + "'", double1 == 1.01276022434347d);
    }

    @Test
    public void test5821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5821");
        double double1 = org.apache.commons.math.util.FastMath.exp((-265.42343799244867d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.346450029952159E-116d + "'", double1 == 5.346450029952159E-116d);
    }

    @Test
    public void test5822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5822");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.1161530356493914d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3627745345927076d + "'", double1 == 1.3627745345927076d);
    }

    @Test
    public void test5823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5823");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.7944146264030464d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5824");
        double double2 = org.apache.commons.math.util.FastMath.max(1.7162633894119443d, 0.7203775199467526d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7162633894119443d + "'", double2 == 1.7162633894119443d);
    }

    @Test
    public void test5825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5825");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.5944033714909972d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test5826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5826");
        long long2 = org.apache.commons.math.util.FastMath.min(2L, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test5827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5827");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.2646180550224786d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.313202361858184d + "'", double1 == 1.313202361858184d);
    }

    @Test
    public void test5828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5828");
        double double1 = org.apache.commons.math.util.FastMath.abs(3.100109456256378d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.100109456256378d + "'", double1 == 3.100109456256378d);
    }

    @Test
    public void test5829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5829");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.0602412165727728d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7857561629060152d + "'", double1 == 0.7857561629060152d);
    }

    @Test
    public void test5830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5830");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-4.155599707401653d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5831");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.540302305868139d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7165256995489022d + "'", double1 == 1.7165256995489022d);
    }

    @Test
    public void test5832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5832");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.22689432686663263d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.25469727314226837d + "'", double1 == 0.25469727314226837d);
    }

    @Test
    public void test5833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5833");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.0524310073195241d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.05240698838931919d) + "'", double1 == (-0.05240698838931919d));
    }

    @Test
    public void test5834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5834");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.2460098192572937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02174697385821922d + "'", double1 == 0.02174697385821922d);
    }

    @Test
    public void test5835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5835");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 32, 14L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test5836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5836");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-1.0476958419065934d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-60.02854995465333d) + "'", double1 == (-60.02854995465333d));
    }

    @Test
    public void test5837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5837");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.4485577208425298d, 0.017154745458683805d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0154806632465594d + "'", double2 == 1.0154806632465594d);
    }

    @Test
    public void test5838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5838");
        double double1 = org.apache.commons.math.util.FastMath.ulp(3.6268604078470186d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test5839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5839");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.030555897991319556d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.03056065480822484d) + "'", double1 == (-0.03056065480822484d));
    }

    @Test
    public void test5840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5840");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test5841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5841");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5860134523134418E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.586013452313441E15d + "'", double1 == 1.586013452313441E15d);
    }

    @Test
    public void test5842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5842");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, 14.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5843");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-7.01740826388532E-10d), 0.8415496589078763d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-8.338674004089294E-10d) + "'", double2 == (-8.338674004089294E-10d));
    }

    @Test
    public void test5844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5844");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-2.589527355068891d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5845");
        double double1 = org.apache.commons.math.util.FastMath.asin(57.29577951308232d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5846");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.0311019009248779d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8007097882362314d + "'", double1 == 0.8007097882362314d);
    }

    @Test
    public void test5847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5847");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.26411443765382414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test5848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5848");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.6196139432498801d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5508591762880619d + "'", double1 == 0.5508591762880619d);
    }

    @Test
    public void test5849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5849");
        double double2 = org.apache.commons.math.util.FastMath.min(22.18070977791825d, 9.307013259236445d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.307013259236445d + "'", double2 == 9.307013259236445d);
    }

    @Test
    public void test5850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5850");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.6759364361843174d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test5851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5851");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.999303822951033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5334799003570143d + "'", double1 == 1.5334799003570143d);
    }

    @Test
    public void test5852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5852");
        int int1 = org.apache.commons.math.util.FastMath.abs(175);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 175 + "'", int1 == 175);
    }

    @Test
    public void test5853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5853");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 1477896, 0.03511678415619611d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.646865198820103d + "'", double2 == 1.646865198820103d);
    }

    @Test
    public void test5854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5854");
        int int2 = org.apache.commons.math.util.FastMath.max(0, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test5855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5855");
        double double1 = org.apache.commons.math.util.FastMath.sinh(4.810477380965352d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 61.39103863568024d + "'", double1 == 61.39103863568024d);
    }

    @Test
    public void test5856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5856");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.698137190187897d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5857");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.22766430356286294d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22963608602745358d + "'", double1 == 0.22963608602745358d);
    }

    @Test
    public void test5858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5858");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.4593566380802732d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test5859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5859");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.8726936208978296d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 50.001661285435496d + "'", double1 == 50.001661285435496d);
    }

    @Test
    public void test5860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5860");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.6666666666666667d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test5861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5861");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.5395389476264498d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2239800905693157d + "'", double1 == 2.2239800905693157d);
    }

    @Test
    public void test5862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5862");
        float float2 = org.apache.commons.math.util.FastMath.min(52.0f, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test5863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5863");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 5L, (float) 32L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test5864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5864");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.426490964964291d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.557719796678559d + "'", double1 == 1.557719796678559d);
    }

    @Test
    public void test5865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5865");
        double double1 = org.apache.commons.math.util.FastMath.tan((-2.4376760684376033d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8490057801768939d + "'", double1 == 0.8490057801768939d);
    }

    @Test
    public void test5866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5866");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 11013L, (float) 1477896L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1477896.0f + "'", float2 == 1477896.0f);
    }

    @Test
    public void test5867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5867");
        double double1 = org.apache.commons.math.util.FastMath.log((double) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5868");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.4689057088038128d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5869");
        double double1 = org.apache.commons.math.util.FastMath.log(1.4337042405910987d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36026147306099493d + "'", double1 == 0.36026147306099493d);
    }

    @Test
    public void test5870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5870");
        double double1 = org.apache.commons.math.util.FastMath.expm1(5.778945114895067d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 322.41784174315626d + "'", double1 == 322.41784174315626d);
    }

    @Test
    public void test5871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5871");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 72);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 72 + "'", int1 == 72);
    }

    @Test
    public void test5872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5872");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.5675807421208592d, 50.11367450037566d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5675807421208594d + "'", double2 == 1.5675807421208594d);
    }

    @Test
    public void test5873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5873");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.03490658503988659d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.035530379260790675d) + "'", double1 == (-0.035530379260790675d));
    }

    @Test
    public void test5874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5874");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.7392602334708254d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9488461509048202d) + "'", double1 == (-0.9488461509048202d));
    }

    @Test
    public void test5875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5875");
        float float2 = org.apache.commons.math.util.FastMath.min(2.14748365E9f, 3.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test5876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5876");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.01743935748923473d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5533560852092367d + "'", double1 == 1.5533560852092367d);
    }

    @Test
    public void test5877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5877");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) 6L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.0d + "'", double1 == 6.0d);
    }

    @Test
    public void test5878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5878");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.160950374690384d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.830854962996367d + "'", double1 == 0.830854962996367d);
    }

    @Test
    public void test5879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5879");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.9032305497763704d, 0.5662191695169732d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.439638288176172d + "'", double2 == 1.439638288176172d);
    }

    @Test
    public void test5880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5880");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.00883809281975468d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5881");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.1527522897170941d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0116893337046406d + "'", double1 == 1.0116893337046406d);
    }

    @Test
    public void test5882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5882");
        double double1 = org.apache.commons.math.util.FastMath.signum(5.477053318335443E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5883");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.023974957339495964d, 5.444945510686242d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.023974957339495968d + "'", double2 == 0.023974957339495968d);
    }

    @Test
    public void test5884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5884");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 35L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.930067261567154E14d + "'", double1 == 7.930067261567154E14d);
    }

    @Test
    public void test5885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5885");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.11022806535638537d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9939310354798899d + "'", double1 == 0.9939310354798899d);
    }

    @Test
    public void test5886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5886");
        float float2 = org.apache.commons.math.util.FastMath.min(52.0f, (float) 6);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.0f + "'", float2 == 6.0f);
    }

    @Test
    public void test5887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5887");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.7964493619549832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9269423463777348d + "'", double1 == 0.9269423463777348d);
    }

    @Test
    public void test5888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5888");
        long long1 = org.apache.commons.math.util.FastMath.round(0.6610060414837631d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test5889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5889");
        double double2 = org.apache.commons.math.util.FastMath.pow(42672.42111385361d, 1.3246090892520057d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1358736.2971047058d + "'", double2 == 1358736.2971047058d);
    }

    @Test
    public void test5890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5890");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.29196735084148556d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2919673508414855d) + "'", double1 == (-0.2919673508414855d));
    }

    @Test
    public void test5891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5891");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.0621246647864042d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8733922018678796d + "'", double1 == 0.8733922018678796d);
    }

    @Test
    public void test5892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5892");
        double double2 = org.apache.commons.math.util.FastMath.atan2(23151.90693368639d, 0.24598042946131934d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707857021655667d + "'", double2 == 1.5707857021655667d);
    }

    @Test
    public void test5893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5893");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.3574158419544757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9773206322293115d + "'", double1 == 0.9773206322293115d);
    }

    @Test
    public void test5894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5894");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.4451787324341034d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4451787324341034d + "'", double1 == 1.4451787324341034d);
    }

    @Test
    public void test5895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5895");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.5533560852092367d, 21.323945308420996d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11985.408355492187d + "'", double2 == 11985.408355492187d);
    }

    @Test
    public void test5896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5896");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 10, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test5897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5897");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.5740962263285927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9592964011265267d + "'", double1 == 0.9592964011265267d);
    }

    @Test
    public void test5898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5898");
        float float1 = org.apache.commons.math.util.FastMath.abs(175.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 175.0f + "'", float1 == 175.0f);
    }

    @Test
    public void test5899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5899");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.003215579132524195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.003215573591062522d + "'", double1 == 0.003215573591062522d);
    }

    @Test
    public void test5900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5900");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test5901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5901");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test5902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5902");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.6861038807844514d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 39.310856676496044d + "'", double1 == 39.310856676496044d);
    }

    @Test
    public void test5903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5903");
        float float2 = org.apache.commons.math.util.FastMath.min((-36.0f), (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-36.0f) + "'", float2 == (-36.0f));
    }

    @Test
    public void test5904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5904");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9705211365109138d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5905");
        double double1 = org.apache.commons.math.util.FastMath.atanh(40.17107384637538d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5906");
        double double1 = org.apache.commons.math.util.FastMath.log(89.4270613023165d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.493423335506386d + "'", double1 == 4.493423335506386d);
    }

    @Test
    public void test5907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5907");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.06488501547250208d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0011324571552026256d + "'", double1 == 0.0011324571552026256d);
    }

    @Test
    public void test5908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5908");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '#', 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test5909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5909");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.05240698838931919d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9489425796289765d + "'", double1 == 0.9489425796289765d);
    }

    @Test
    public void test5910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5910");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1072.8715259107928d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5911");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test5912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5912");
        double double1 = org.apache.commons.math.util.FastMath.rint((-1.7405700602011438d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test5913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5913");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.9711243963529564d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-55.641329293214156d) + "'", double1 == (-55.641329293214156d));
    }

    @Test
    public void test5914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5914");
        long long2 = org.apache.commons.math.util.FastMath.min(8L, (long) 4);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test5915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5915");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.8402785435782612d, 0.5353645941168004d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.287695112702267d + "'", double2 == 1.287695112702267d);
    }

    @Test
    public void test5916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5916");
        int int1 = org.apache.commons.math.util.FastMath.round((-36.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-36) + "'", int1 == (-36));
    }

    @Test
    public void test5917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5917");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.20494781863014405d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2078918957510986d + "'", double1 == 0.2078918957510986d);
    }

    @Test
    public void test5918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5918");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 52, (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test5919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5919");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.7730917365506929d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.97568514776469d + "'", double1 == 0.97568514776469d);
    }

    @Test
    public void test5920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5920");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) -1, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test5921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5921");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.240152057753145E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1644736633175252E39d + "'", double1 == 2.1644736633175252E39d);
    }

    @Test
    public void test5922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5922");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.08456102495932247d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.08436004669328309d) + "'", double1 == (-0.08436004669328309d));
    }

    @Test
    public void test5923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5923");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.3072602306204815d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0828699466834848d + "'", double1 == 1.0828699466834848d);
    }

    @Test
    public void test5924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5924");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(9.306831672164943d, 3.9697296111063074d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.306831672164941d + "'", double2 == 9.306831672164941d);
    }

    @Test
    public void test5925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5925");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.0011324571552026256d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5696638693976388d + "'", double1 == 1.5696638693976388d);
    }

    @Test
    public void test5926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5926");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 1, 11013L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11013L + "'", long2 == 11013L);
    }

    @Test
    public void test5927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5927");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (-2));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test5928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5928");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) (-53.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5929");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(37.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3322218516459534d + "'", double1 == 3.3322218516459534d);
    }

    @Test
    public void test5930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5930");
        long long2 = org.apache.commons.math.util.FastMath.min((-2L), 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test5931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5931");
        int int2 = org.apache.commons.math.util.FastMath.min(3, 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test5932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5932");
        double double1 = org.apache.commons.math.util.FastMath.expm1(36.04365338911715d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.5035996273704835E15d + "'", double1 == 4.5035996273704835E15d);
    }

    @Test
    public void test5933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5933");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 2147483647, 1477896L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1477896L + "'", long2 == 1477896L);
    }

    @Test
    public void test5934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5934");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.5430365305682094d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5167380759820517d + "'", double1 == 0.5167380759820517d);
    }

    @Test
    public void test5935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5935");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.008092143267727406d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.008091966640334193d + "'", double1 == 0.008091966640334193d);
    }

    @Test
    public void test5936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5936");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.00883809281975468d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.008838322946974024d) + "'", double1 == (-0.008838322946974024d));
    }

    @Test
    public void test5937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5937");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.348459106948174d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.20986871743247074d + "'", double1 == 0.20986871743247074d);
    }

    @Test
    public void test5938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5938");
        int int2 = org.apache.commons.math.util.FastMath.max(35, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test5939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5939");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.1301927452503902d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5048997448906092d + "'", double1 == 0.5048997448906092d);
    }

    @Test
    public void test5940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5940");
        double double1 = org.apache.commons.math.util.FastMath.cos(4.9E-324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5941");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-2.4582818414204355d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.458281841420435d) + "'", double1 == (-2.458281841420435d));
    }

    @Test
    public void test5942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5942");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.373400766945016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5943");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.0133109241786307d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5944");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.03492076949174774d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0355376593741907d + "'", double1 == 1.0355376593741907d);
    }

    @Test
    public void test5945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5945");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.4497667602778919d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1317905047412211d + "'", double1 == 1.1317905047412211d);
    }

    @Test
    public void test5946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5946");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.38061379651184485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4631824101259606d + "'", double1 == 0.4631824101259606d);
    }

    @Test
    public void test5947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5947");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.9016684086532855d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.264485158261306d) + "'", double1 == (-1.264485158261306d));
    }

    @Test
    public void test5948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5948");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(52.97020634767864d, 1.0609874123115923d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.970206347678634d + "'", double2 == 52.970206347678634d);
    }

    @Test
    public void test5949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5949");
        double double1 = org.apache.commons.math.util.FastMath.signum(5.727787050299033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5950");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.953499812724235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5951");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.21504954471869261d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23992332709672146d + "'", double1 == 0.23992332709672146d);
    }

    @Test
    public void test5952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5952");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(5.637986554446436d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.637986554446437d + "'", double1 == 5.637986554446437d);
    }

    @Test
    public void test5953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5953");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.5878356581161792d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test5954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5954");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-1L), (float) 32L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test5955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5955");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.1229215998502982d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0814402592739842d + "'", double1 == 2.0814402592739842d);
    }

    @Test
    public void test5956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5956");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.3749872852413327d, 1.491013751652984d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6077008336944418d + "'", double2 == 1.6077008336944418d);
    }

    @Test
    public void test5957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5957");
        long long2 = org.apache.commons.math.util.FastMath.min(11013L, (long) 8);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8L + "'", long2 == 8L);
    }

    @Test
    public void test5958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5958");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.8216615418906639d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7494938566397297d + "'", double1 == 0.7494938566397297d);
    }

    @Test
    public void test5959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5959");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.021373301521365424d), 1.3340213311661798E-8d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.570795702641754d) + "'", double2 == (-1.570795702641754d));
    }

    @Test
    public void test5960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5960");
        double double1 = org.apache.commons.math.util.FastMath.rint(1262023.5276316951d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1262024.0d + "'", double1 == 1262024.0d);
    }

    @Test
    public void test5961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5961");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.94427907045667d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.524800986646088d + "'", double1 == 9.524800986646088d);
    }

    @Test
    public void test5962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5962");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.5672839406622014d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5963");
        double double2 = org.apache.commons.math.util.FastMath.pow(28.4764116085372d, 1.1139433523068367d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 41.7075028714666d + "'", double2 == 41.7075028714666d);
    }

    @Test
    public void test5964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5964");
        double double1 = org.apache.commons.math.util.FastMath.tanh(17.247748258387592d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999999979d + "'", double1 == 0.9999999999999979d);
    }

    @Test
    public void test5965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5965");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.3340213311661798E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0023716699886766916d + "'", double1 == 0.0023716699886766916d);
    }

    @Test
    public void test5966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5966");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9904236327584265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13850408558812607d + "'", double1 == 0.13850408558812607d);
    }

    @Test
    public void test5967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5967");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.7520896312851567d), 1.0144073205767572d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test5968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5968");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-1.563625436674731E37d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5969");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.5160777855982221d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1807214842705991d + "'", double1 == 0.1807214842705991d);
    }

    @Test
    public void test5970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5970");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.3283909087132568d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5971");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.32220799131551875d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5972");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 10, 11013);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11013 + "'", int2 == 11013);
    }

    @Test
    public void test5973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5973");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(13.782153736230454d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24054396071325954d + "'", double1 == 0.24054396071325954d);
    }

    @Test
    public void test5974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5974");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.5364793041447001d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5975");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.287695112702267d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7414443288724203d + "'", double1 == 0.7414443288724203d);
    }

    @Test
    public void test5976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5976");
        double double1 = org.apache.commons.math.util.FastMath.asin((-48.18608569304648d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5977");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.570796314980662d, 1.5427661770824743d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0070912050862004d + "'", double2 == 2.0070912050862004d);
    }

    @Test
    public void test5978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5978");
        double double1 = org.apache.commons.math.util.FastMath.expm1(54.631515035613056d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.323110946099802E23d + "'", double1 == 5.323110946099802E23d);
    }

    @Test
    public void test5979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5979");
        double double2 = org.apache.commons.math.util.FastMath.max(0.2117649211245782d, 0.21819433807844027d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.21819433807844027d + "'", double2 == 0.21819433807844027d);
    }

    @Test
    public void test5980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5980");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.011800076512800234d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10862815709014047d + "'", double1 == 0.10862815709014047d);
    }

    @Test
    public void test5981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5981");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.7556616167207904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7556616167207904d + "'", double1 == 0.7556616167207904d);
    }

    @Test
    public void test5982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5982");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.19026032645010738d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5983");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.8225636847100722d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8225636847100724d + "'", double1 == 0.8225636847100724d);
    }

    @Test
    public void test5984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5984");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.051047271336216435d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.909429589759021E-4d + "'", double1 == 8.909429589759021E-4d);
    }

    @Test
    public void test5985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5985");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.6147492292213783d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6147492292213784d + "'", double1 == 0.6147492292213784d);
    }

    @Test
    public void test5986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5986");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, 4.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test5987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5987");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.100109456256378d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4581168967149005d + "'", double1 == 1.4581168967149005d);
    }

    @Test
    public void test5988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5988");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 53L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 53 + "'", int1 == 53);
    }

    @Test
    public void test5989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5989");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.5840734641020676d, 1.7453292519943295d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.39120901483317405d + "'", double2 == 0.39120901483317405d);
    }

    @Test
    public void test5990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5990");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 1833.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1833.0d + "'", double1 == 1833.0d);
    }

    @Test
    public void test5991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5991");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.6048394375639378d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8309582021739188d + "'", double1 == 0.8309582021739188d);
    }

    @Test
    public void test5992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5992");
        double double1 = org.apache.commons.math.util.FastMath.exp(45.15227205151615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.068015484639465E19d + "'", double1 == 4.068015484639465E19d);
    }

    @Test
    public void test5993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5993");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.8402785435782614d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0730374999763912d + "'", double1 == 1.0730374999763912d);
    }

    @Test
    public void test5994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5994");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-1.1508493389168752d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6836320483768433d) + "'", double1 == (-0.6836320483768433d));
    }

    @Test
    public void test5995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5995");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.4096419806687939d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.42119525974162375d + "'", double1 == 0.42119525974162375d);
    }

    @Test
    public void test5996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5996");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.6997597439205169d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7582821617461082d + "'", double1 == 0.7582821617461082d);
    }

    @Test
    public void test5997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5997");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.08558186793850525d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08935074059299675d + "'", double1 == 0.08935074059299675d);
    }

    @Test
    public void test5998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5998");
        long long1 = org.apache.commons.math.util.FastMath.round(0.7853981633974483d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test5999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5999");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 100, (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test6000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test6000");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(4.893147016352981d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.893147016352982d + "'", double1 == 4.893147016352982d);
    }
}

