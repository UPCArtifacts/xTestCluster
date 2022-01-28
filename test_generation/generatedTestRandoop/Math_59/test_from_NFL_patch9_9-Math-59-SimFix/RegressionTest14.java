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
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.151665335034499d, 53.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.021726115561043376d + "'", double2 == 0.021726115561043376d);
    }

    @Test
    public void test7002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7002");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.8650983882673103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015098815228960848d + "'", double1 == 0.015098815228960848d);
    }

    @Test
    public void test7003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7003");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.557719796678559d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.557719796678559d + "'", double1 == 1.557719796678559d);
    }

    @Test
    public void test7004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7004");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.8182092927093308d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7048992135579963d) + "'", double1 == (-1.7048992135579963d));
    }

    @Test
    public void test7005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7005");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.5702507731119777d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.8078537230517595d + "'", double1 == 4.8078537230517595d);
    }

    @Test
    public void test7006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7006");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.2731465769562508d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0375370417894207d + "'", double1 == 1.0375370417894207d);
    }

    @Test
    public void test7007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7007");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.2648389735541739d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.264838973554174d + "'", double1 == 1.264838973554174d);
    }

    @Test
    public void test7008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7008");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.141681321786792d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.513739938570287d + "'", double1 == 7.513739938570287d);
    }

    @Test
    public void test7009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7009");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.6389612763136355d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 36.60978440506373d + "'", double1 == 36.60978440506373d);
    }

    @Test
    public void test7010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7010");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.0133109241786307d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03513890449328702d + "'", double1 == 0.03513890449328702d);
    }

    @Test
    public void test7011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7011");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.6420149920119997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7476805260785286d + "'", double1 == 0.7476805260785286d);
    }

    @Test
    public void test7012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7012");
        double double1 = org.apache.commons.math.util.FastMath.tanh(5.388267471840756d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999582331939165d + "'", double1 == 0.9999582331939165d);
    }

    @Test
    public void test7013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7013");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 1, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test7014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7014");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 5);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test7015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7015");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9171379122748513d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9171379122748513d + "'", double1 == 0.9171379122748513d);
    }

    @Test
    public void test7016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7016");
        int int2 = org.apache.commons.math.util.FastMath.min(35, 1833);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test7017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7017");
        double double1 = org.apache.commons.math.util.FastMath.expm1(39.71440802747734d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.76908320050472192E17d + "'", double1 == 1.76908320050472192E17d);
    }

    @Test
    public void test7018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7018");
        int int2 = org.apache.commons.math.util.FastMath.max(57, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57 + "'", int2 == 57);
    }

    @Test
    public void test7019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7019");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.05660072675846326d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05660072675846326d + "'", double1 == 0.05660072675846326d);
    }

    @Test
    public void test7020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7020");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) 192.0f, 0.07463853704904692d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 191.99999999999997d + "'", double2 == 191.99999999999997d);
    }

    @Test
    public void test7021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7021");
        double double1 = org.apache.commons.math.util.FastMath.asin(39.82204982013094d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7022");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.373400766945016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.94875668844129d + "'", double1 == 3.94875668844129d);
    }

    @Test
    public void test7023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7023");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.0017885376783291472d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999984005669129d + "'", double1 == 0.9999984005669129d);
    }

    @Test
    public void test7024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7024");
        double double1 = org.apache.commons.math.util.FastMath.expm1(21.18061693582445d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.579883481202417E9d + "'", double1 == 1.579883481202417E9d);
    }

    @Test
    public void test7025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7025");
        double double1 = org.apache.commons.math.util.FastMath.asinh(4.594700892207039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.229687871848033d + "'", double1 == 2.229687871848033d);
    }

    @Test
    public void test7026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7026");
        double double1 = org.apache.commons.math.util.FastMath.rint(73.1282163281567d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 73.0d + "'", double1 == 73.0d);
    }

    @Test
    public void test7027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7027");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.579883481202417E9d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7028");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.339637404328899d, 7.71461973242629E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948961d + "'", double2 == 1.5707963267948961d);
    }

    @Test
    public void test7029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7029");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.951998196031877d), (double) 36.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 36.0d + "'", double2 == 36.0d);
    }

    @Test
    public void test7030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7030");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.4944324908505626d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4745321845077857d + "'", double1 == 0.4745321845077857d);
    }

    @Test
    public void test7031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7031");
        double double1 = org.apache.commons.math.util.FastMath.abs(13.693147180561223d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.693147180561223d + "'", double1 == 13.693147180561223d);
    }

    @Test
    public void test7032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7032");
        int int2 = org.apache.commons.math.util.FastMath.max((-36), 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test7033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7033");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.5982442912835338d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.598244291283534d + "'", double1 == 0.598244291283534d);
    }

    @Test
    public void test7034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7034");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9999990845927568d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.29572706411075d + "'", double1 == 57.29572706411075d);
    }

    @Test
    public void test7035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7035");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.3465735902799727d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.00604885025084334d) + "'", double1 == (-0.00604885025084334d));
    }

    @Test
    public void test7036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7036");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.208718528794109E-17d, 1.1520712071332257d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9171718858335224E-17d + "'", double2 == 1.9171718858335224E-17d);
    }

    @Test
    public void test7037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7037");
        double double1 = org.apache.commons.math.util.FastMath.tan((-1.5704685469035022d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3050.827675647718d) + "'", double1 == (-3050.827675647718d));
    }

    @Test
    public void test7038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7038");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.219022125506721d, (-0.017451520543541533d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9965497097708241d + "'", double2 == 0.9965497097708241d);
    }

    @Test
    public void test7039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7039");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test7040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7040");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.28630352695323197d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7041");
        float float2 = org.apache.commons.math.util.FastMath.min((-53.0f), 57.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-53.0f) + "'", float2 == (-53.0f));
    }

    @Test
    public void test7042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7042");
        double double1 = org.apache.commons.math.util.FastMath.tan(7.5162581810757125E96d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.13779782332273338d) + "'", double1 == (-0.13779782332273338d));
    }

    @Test
    public void test7043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7043");
        double double1 = org.apache.commons.math.util.FastMath.rint((-11.046068560414216d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-11.0d) + "'", double1 == (-11.0d));
    }

    @Test
    public void test7044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7044");
        double double1 = org.apache.commons.math.util.FastMath.log(1.0395711984465767d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03880831894449372d + "'", double1 == 0.03880831894449372d);
    }

    @Test
    public void test7045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7045");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9269423463777348d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7997882272227148d + "'", double1 == 0.7997882272227148d);
    }

    @Test
    public void test7046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7046");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.9589242746631385d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9861162244048773d) + "'", double1 == (-0.9861162244048773d));
    }

    @Test
    public void test7047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7047");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.8912994033449402d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9623680699256677d + "'", double1 == 0.9623680699256677d);
    }

    @Test
    public void test7048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7048");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.02759663015433203d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7049");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 0.045977949371362146d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.045977949371362146d + "'", double2 == 0.045977949371362146d);
    }

    @Test
    public void test7050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7050");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 5, 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test7051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7051");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9039672257169318d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7052");
        float float1 = org.apache.commons.math.util.FastMath.abs(6.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.0f + "'", float1 == 6.0f);
    }

    @Test
    public void test7053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7053");
        double double1 = org.apache.commons.math.util.FastMath.asinh(4.276858964458209d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.159761581911684d + "'", double1 == 2.159761581911684d);
    }

    @Test
    public void test7054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7054");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.5925180786247999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8399121594771659d + "'", double1 == 0.8399121594771659d);
    }

    @Test
    public void test7055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7055");
        double double1 = org.apache.commons.math.util.FastMath.rint(3.692229922941576d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test7056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7056");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.6213429619407828d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1993243360576609d + "'", double1 == 1.1993243360576609d);
    }

    @Test
    public void test7057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7057");
        double double1 = org.apache.commons.math.util.FastMath.floor(194.80905574539727d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 194.0d + "'", double1 == 194.0d);
    }

    @Test
    public void test7058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7058");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.1834687238125812d), 0.6242716385733329d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.2858441653943418d) + "'", double2 == (-0.2858441653943418d));
    }

    @Test
    public void test7059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7059");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.0620536342835328d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5554113478947413d + "'", double1 == 3.5554113478947413d);
    }

    @Test
    public void test7060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7060");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.25921821707943726d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.25632496622778084d + "'", double1 == 0.25632496622778084d);
    }

    @Test
    public void test7061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7061");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.007007049837584d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.737395852958632d + "'", double1 == 2.737395852958632d);
    }

    @Test
    public void test7062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7062");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.25921821707943726d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3085836628619134d + "'", double1 == 1.3085836628619134d);
    }

    @Test
    public void test7063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7063");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.724161534186775d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7064");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.6661404377193025E21d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 21.5642090973306d + "'", double1 == 21.5642090973306d);
    }

    @Test
    public void test7065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7065");
        int int2 = org.apache.commons.math.util.FastMath.min(6, 175);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test7066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7066");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 0.0016855760327141626d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test7067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7067");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.09950371902099892d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.995053588169564d + "'", double1 == 0.995053588169564d);
    }

    @Test
    public void test7068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7068");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.5273248225058396d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.40981829947670745d) + "'", double1 == (-0.40981829947670745d));
    }

    @Test
    public void test7069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7069");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.22123522076451269d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6048087830138751d + "'", double1 == 0.6048087830138751d);
    }

    @Test
    public void test7070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7070");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.7926396995186359d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7269105039016031d + "'", double1 == 0.7269105039016031d);
    }

    @Test
    public void test7071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7071");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.003993711498963172d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.970341503166545E-5d + "'", double1 == 6.970341503166545E-5d);
    }

    @Test
    public void test7072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7072");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.025624541614806685d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.025624541614806682d) + "'", double1 == (-0.025624541614806682d));
    }

    @Test
    public void test7073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7073");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test7074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7074");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 2.980232238769532E-8d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test7075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7075");
        long long1 = org.apache.commons.math.util.FastMath.round(1.0001471462544045d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test7076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7076");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '4', 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test7077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7077");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9754001961551926d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1375934887012635d + "'", double1 == 1.1375934887012635d);
    }

    @Test
    public void test7078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7078");
        long long1 = org.apache.commons.math.util.FastMath.round(3.348459106948174d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test7079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7079");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.7162579075638862d, 2.6177191145603587d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.26708193203237746d + "'", double2 == 0.26708193203237746d);
    }

    @Test
    public void test7080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7080");
        double double2 = org.apache.commons.math.util.FastMath.min(0.5143524375699186d, 0.056630991823551025d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.056630991823551025d + "'", double2 == 0.056630991823551025d);
    }

    @Test
    public void test7081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7081");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 14L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 14.0f + "'", float1 == 14.0f);
    }

    @Test
    public void test7082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7082");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 11013);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test7083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7083");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.9132212823529585d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test7084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7084");
        int int2 = org.apache.commons.math.util.FastMath.min(100, 11013);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test7085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7085");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 1, 42L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 42L + "'", long2 == 42L);
    }

    @Test
    public void test7086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7086");
        double double2 = org.apache.commons.math.util.FastMath.max(1.2576739981725682d, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test7087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7087");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8146443499937901d, 0.48313004522679587d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0354980585019602d + "'", double2 == 1.0354980585019602d);
    }

    @Test
    public void test7088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7088");
        double double1 = org.apache.commons.math.util.FastMath.asin(5.551115123125784E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125784E-17d + "'", double1 == 5.551115123125784E-17d);
    }

    @Test
    public void test7089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7089");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.5982442912835338d, (-0.6482508233950507d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.395207027884442d + "'", double2 == 1.395207027884442d);
    }

    @Test
    public void test7090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7090");
        double double1 = org.apache.commons.math.util.FastMath.cosh(311.9723974410264d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5376614237899635E135d + "'", double1 == 1.5376614237899635E135d);
    }

    @Test
    public void test7091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7091");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.219022125506721d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08601158822566264d + "'", double1 == 0.08601158822566264d);
    }

    @Test
    public void test7092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7092");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.2078918957510986d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2049722769676206d + "'", double1 == 0.2049722769676206d);
    }

    @Test
    public void test7093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7093");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.5686300059875781d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7658461948190802d + "'", double1 == 0.7658461948190802d);
    }

    @Test
    public void test7094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7094");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.5376614237899635E135d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2652552542914545d + "'", double1 == 0.2652552542914545d);
    }

    @Test
    public void test7095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7095");
        double double1 = org.apache.commons.math.util.FastMath.cos(9.138523014339807E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999995824370146d + "'", double1 == 0.9999995824370146d);
    }

    @Test
    public void test7096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7096");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.7615945076219023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7023969868981367d + "'", double1 == 0.7023969868981367d);
    }

    @Test
    public void test7097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7097");
        int int2 = org.apache.commons.math.util.FastMath.max((-36), (-36));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-36) + "'", int2 == (-36));
    }

    @Test
    public void test7098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7098");
        double double1 = org.apache.commons.math.util.FastMath.log((-303.5829172438119d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7099");
        double double1 = org.apache.commons.math.util.FastMath.rint(57.29577951308448d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.0d + "'", double1 == 57.0d);
    }

    @Test
    public void test7100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7100");
        int int2 = org.apache.commons.math.util.FastMath.min(97, 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test7101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7101");
        int int1 = org.apache.commons.math.util.FastMath.round(13.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 13 + "'", int1 == 13);
    }

    @Test
    public void test7102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7102");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.01706683222077747d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017067660857999937d) + "'", double1 == (-0.017067660857999937d));
    }

    @Test
    public void test7103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7103");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.0001153070642954d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test7104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7104");
        double double1 = org.apache.commons.math.util.FastMath.tan(157.80370161257864d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8842926751638963d + "'", double1 == 0.8842926751638963d);
    }

    @Test
    public void test7105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7105");
        double double2 = org.apache.commons.math.util.FastMath.min(2.147483647E9d, 0.01745583420411082d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.01745583420411082d + "'", double2 == 0.01745583420411082d);
    }

    @Test
    public void test7106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7106");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) 35.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6108652381980153d + "'", double1 == 0.6108652381980153d);
    }

    @Test
    public void test7107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7107");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9023126767261935d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test7108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7108");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.0146903407800787d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8493171286668083d + "'", double1 == 0.8493171286668083d);
    }

    @Test
    public void test7109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7109");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.017439357489234728d, (-1.0004141180816055d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 57.437791612875095d + "'", double2 == 57.437791612875095d);
    }

    @Test
    public void test7110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7110");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9126599178967103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015928920518278718d + "'", double1 == 0.015928920518278718d);
    }

    @Test
    public void test7111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7111");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.01976389133388643d, (-0.9995086225327711d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.019763891333886428d + "'", double2 == 0.019763891333886428d);
    }

    @Test
    public void test7112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7112");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 1, 1833);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1833 + "'", int2 == 1833);
    }

    @Test
    public void test7113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7113");
        double double1 = org.apache.commons.math.util.FastMath.atan(3.677261497848975d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3052757984319463d + "'", double1 == 1.3052757984319463d);
    }

    @Test
    public void test7114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7114");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.1758128730549149d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7115");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.28738952988751526d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test7116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7116");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.5675755665735347d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7117");
        long long1 = org.apache.commons.math.util.FastMath.round(2.2204460492503136E-16d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test7118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7118");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.1752048460302915d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.084068653743983d + "'", double1 == 1.084068653743983d);
    }

    @Test
    public void test7119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7119");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9688018598944426d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.989490558521483d + "'", double1 == 0.989490558521483d);
    }

    @Test
    public void test7120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7120");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-1), (float) (-53L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test7121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7121");
        double double1 = org.apache.commons.math.util.FastMath.acos(6.894806889943191E27d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7122");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(36.013886210738235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.001157072660091d + "'", double1 == 6.001157072660091d);
    }

    @Test
    public void test7123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7123");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 32, 72L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test7124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7124");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) 9.223372E18f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2097152.0d + "'", double1 == 2097152.0d);
    }

    @Test
    public void test7125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7125");
        long long2 = org.apache.commons.math.util.FastMath.max(10L, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test7126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7126");
        double double2 = org.apache.commons.math.util.FastMath.max(1.0000000000000002d, 0.8733922018678797d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000000000000002d + "'", double2 == 1.0000000000000002d);
    }

    @Test
    public void test7127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7127");
        double double1 = org.apache.commons.math.util.FastMath.abs(3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1622776601683795d + "'", double1 == 3.1622776601683795d);
    }

    @Test
    public void test7128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7128");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.7138993688283736d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2514116728060787d) + "'", double1 == (-1.2514116728060787d));
    }

    @Test
    public void test7129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7129");
        int int2 = org.apache.commons.math.util.FastMath.min(57, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test7130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7130");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.545185591332969E49d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9941874762610007d + "'", double1 == 0.9941874762610007d);
    }

    @Test
    public void test7131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7131");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.3934128428542537d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7132");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(4.362070671454838d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.08855707881179d + "'", double1 == 2.08855707881179d);
    }

    @Test
    public void test7133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7133");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9993776497372746d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.55527791616532d + "'", double1 == 1.55527791616532d);
    }

    @Test
    public void test7134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7134");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8365164337420496d, (-0.2858441653943418d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0523500313521987d + "'", double2 == 1.0523500313521987d);
    }

    @Test
    public void test7135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7135");
        double double1 = org.apache.commons.math.util.FastMath.cos(5.927436242634382d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9373858581692166d + "'", double1 == 0.9373858581692166d);
    }

    @Test
    public void test7136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7136");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.21809859971375445d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7137");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.356568665264778d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.596302608194128d + "'", double1 == 4.596302608194128d);
    }

    @Test
    public void test7138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7138");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 97, (float) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test7139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7139");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.0134774147872523d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7920916646066769d + "'", double1 == 0.7920916646066769d);
    }

    @Test
    public void test7140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7140");
        float float2 = org.apache.commons.math.util.FastMath.max(2.14748365E9f, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test7141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7141");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.32681535598557454d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3268153559855746d + "'", double1 == 0.3268153559855746d);
    }

    @Test
    public void test7142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7142");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.8864461663714668d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7143");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.4497667602778919d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7144");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.7007434110857121d, 3.1374735898621697d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2197399596258884d + "'", double2 == 0.2197399596258884d);
    }

    @Test
    public void test7145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7145");
        double double1 = org.apache.commons.math.util.FastMath.asin((-1.2599210498948732d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7146");
        double double1 = org.apache.commons.math.util.FastMath.atan(3.490658503988659d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2917899053580517d + "'", double1 == 1.2917899053580517d);
    }

    @Test
    public void test7147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7147");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.5954732329718483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test7148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7148");
        long long2 = org.apache.commons.math.util.FastMath.max((-265L), 13L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 13L + "'", long2 == 13L);
    }

    @Test
    public void test7149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7149");
        double double2 = org.apache.commons.math.util.FastMath.pow(24.678686683130433d, 0.9999467423734001d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 24.674473385245683d + "'", double2 == 24.674473385245683d);
    }

    @Test
    public void test7150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7150");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 13);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 13L + "'", long1 == 13L);
    }

    @Test
    public void test7151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7151");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.30559714930590764d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3105655178906577d + "'", double1 == 0.3105655178906577d);
    }

    @Test
    public void test7152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7152");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(4.2146848510894035E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0034800731177357003d + "'", double1 == 0.0034800731177357003d);
    }

    @Test
    public void test7153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7153");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.8007097882362314d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6961973629752264d + "'", double1 == 0.6961973629752264d);
    }

    @Test
    public void test7154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7154");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.5707857021655667d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.810426271697788d + "'", double1 == 3.810426271697788d);
    }

    @Test
    public void test7155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7155");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.6427154841742911d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8629909757090003d + "'", double1 == 0.8629909757090003d);
    }

    @Test
    public void test7156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7156");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-1.259921049894873d), 4.581561354348932d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.2599210498948727d) + "'", double2 == (-1.2599210498948727d));
    }

    @Test
    public void test7157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7157");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.01645512199317914d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01645660742467781d + "'", double1 == 0.01645660742467781d);
    }

    @Test
    public void test7158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7158");
        long long2 = org.apache.commons.math.util.FastMath.min(52L, (-3L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3L) + "'", long2 == (-3L));
    }

    @Test
    public void test7159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7159");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.14287905018325442d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14336970329182344d + "'", double1 == 0.14336970329182344d);
    }

    @Test
    public void test7160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7160");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.5740962263285927d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7161");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.876278270531895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.902220283447727d + "'", double1 == 8.902220283447727d);
    }

    @Test
    public void test7162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7162");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.217652850343311d, 0.012631453344135275d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2176528503433108d + "'", double2 == 1.2176528503433108d);
    }

    @Test
    public void test7163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7163");
        float float2 = org.apache.commons.math.util.FastMath.max(1477896.0f, (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1477896.0f + "'", float2 == 1477896.0f);
    }

    @Test
    public void test7164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7164");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.5430806348152448d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430806348152448d + "'", double1 == 1.5430806348152448d);
    }

    @Test
    public void test7165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7165");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.22766430356286296d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7166");
        double double2 = org.apache.commons.math.util.FastMath.max(2.969914391648719d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.969914391648719d + "'", double2 == 2.969914391648719d);
    }

    @Test
    public void test7167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7167");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.4599610117337625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7168");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.5500245885985804d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5227081911559017d) + "'", double1 == (-0.5227081911559017d));
    }

    @Test
    public void test7169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7169");
        double double1 = org.apache.commons.math.util.FastMath.cos((-9.28932198342371E-5d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999956854249d + "'", double1 == 0.9999999956854249d);
    }

    @Test
    public void test7170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7170");
        double double2 = org.apache.commons.math.util.FastMath.max(2.545185591332969E49d, (-0.5944033714909972d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.545185591332969E49d + "'", double2 == 2.545185591332969E49d);
    }

    @Test
    public void test7171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7171");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.2994027846609756d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8748629906029737d + "'", double1 == 1.8748629906029737d);
    }

    @Test
    public void test7172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7172");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.2389254154223536d, 0.7658461948190802d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.30240715812390284d + "'", double2 == 0.30240715812390284d);
    }

    @Test
    public void test7173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7173");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 2, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test7174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7174");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9877621911907258d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.685218737681694d + "'", double1 == 2.685218737681694d);
    }

    @Test
    public void test7175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7175");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 175);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 175.0f + "'", float1 == 175.0f);
    }

    @Test
    public void test7176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7176");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.0168817176262221d, 0.44150617158823724d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.016881717626222d + "'", double2 == 1.016881717626222d);
    }

    @Test
    public void test7177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7177");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.7944146264030464d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2131451008411787d + "'", double1 == 1.2131451008411787d);
    }

    @Test
    public void test7178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7178");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.1876059358425726d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7179");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.5029340333685773d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7180");
        int int2 = org.apache.commons.math.util.FastMath.min((-3), 175);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test7181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7181");
        int int2 = org.apache.commons.math.util.FastMath.min(35, (-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test7182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7182");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.25694496900608355d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2929739711587489d + "'", double1 == 0.2929739711587489d);
    }

    @Test
    public void test7183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7183");
        long long2 = org.apache.commons.math.util.FastMath.max(41L, (long) 3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 41L + "'", long2 == 41L);
    }

    @Test
    public void test7184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7184");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.7848860063260921d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test7185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7185");
        float float2 = org.apache.commons.math.util.FastMath.min((float) '4', 53.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test7186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7186");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.3686469200204923d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test7187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7187");
        double double2 = org.apache.commons.math.util.FastMath.atan2(4.327255548039541d, 0.914105834260179d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3626131816412377d + "'", double2 == 1.3626131816412377d);
    }

    @Test
    public void test7188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7188");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.005223148526417374d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0052231247776788935d) + "'", double1 == (-0.0052231247776788935d));
    }

    @Test
    public void test7189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7189");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.8849970445005177d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3983618519740693d + "'", double1 == 1.3983618519740693d);
    }

    @Test
    public void test7190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7190");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.18057375527870234d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9837408116926936d + "'", double1 == 0.9837408116926936d);
    }

    @Test
    public void test7191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7191");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.5063656411097588d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5063656411097588d + "'", double1 == 0.5063656411097588d);
    }

    @Test
    public void test7192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7192");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9428090415820634d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.736510198780109d + "'", double1 == 0.736510198780109d);
    }

    @Test
    public void test7193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7193");
        double double2 = org.apache.commons.math.util.FastMath.atan2(192.99743594923893d, (-2.601710157574577d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5842760529028772d + "'", double2 == 1.5842760529028772d);
    }

    @Test
    public void test7194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7194");
        double double1 = org.apache.commons.math.util.FastMath.log10(6.694732228393676d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.825733211063235d + "'", double1 == 0.825733211063235d);
    }

    @Test
    public void test7195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7195");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.2396873782857314d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test7196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7196");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.5175732278655021d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1369578833507075d + "'", double1 == 1.1369578833507075d);
    }

    @Test
    public void test7197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7197");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.023970365332605832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.546823665392819d + "'", double1 == 1.546823665392819d);
    }

    @Test
    public void test7198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7198");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.6508280503072453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7086745793936428d + "'", double1 == 0.7086745793936428d);
    }

    @Test
    public void test7199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7199");
        float float1 = org.apache.commons.math.util.FastMath.abs(14.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 14.0f + "'", float1 == 14.0f);
    }

    @Test
    public void test7200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7200");
        long long1 = org.apache.commons.math.util.FastMath.round(0.6931471805599453d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test7201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7201");
        double double1 = org.apache.commons.math.util.FastMath.signum((-3.046174056537146E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test7202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7202");
        int int2 = org.apache.commons.math.util.FastMath.max(1477896, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1477896 + "'", int2 == 1477896);
    }

    @Test
    public void test7203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7203");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.18242215781448912d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.18448708583776346d) + "'", double1 == (-0.18448708583776346d));
    }

    @Test
    public void test7204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7204");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.9258949934053917d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test7205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7205");
        double double1 = org.apache.commons.math.util.FastMath.exp(52.97020634767864d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0108071891219171E23d + "'", double1 == 1.0108071891219171E23d);
    }

    @Test
    public void test7206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7206");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.4577979139729038d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 83.52566785362285d + "'", double1 == 83.52566785362285d);
    }

    @Test
    public void test7207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7207");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.373400766945016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7208");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-40.458416869119034d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.393574577516888d) + "'", double1 == (-4.393574577516888d));
    }

    @Test
    public void test7209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7209");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.0591373678933207d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8719334410686833d + "'", double1 == 0.8719334410686833d);
    }

    @Test
    public void test7210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7210");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.21603772555018477d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7211");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.3320915232243828d, 0.9269423463777348d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3599428679717961d + "'", double2 == 0.3599428679717961d);
    }

    @Test
    public void test7212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7212");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.29665946452667546d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3011927403133138d + "'", double1 == 0.3011927403133138d);
    }

    @Test
    public void test7213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7213");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.8407970089415017d), (-0.07752552270710597d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8407970089415016d) + "'", double2 == (-0.8407970089415016d));
    }

    @Test
    public void test7214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7214");
        int int2 = org.apache.commons.math.util.FastMath.max(52, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test7215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7215");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.229687871848033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7216");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9623033716478188d, 0.9919274478344264d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9626019167926102d + "'", double2 == 0.9626019167926102d);
    }

    @Test
    public void test7217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7217");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 2, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test7218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7218");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.8698822455734988d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6449165458848146d + "'", double1 == 0.6449165458848146d);
    }

    @Test
    public void test7219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7219");
        double double1 = org.apache.commons.math.util.FastMath.floor((-1.219022125506721d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test7220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7220");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.895646744719586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8956467447195862d + "'", double1 == 0.8956467447195862d);
    }

    @Test
    public void test7221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7221");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.49536728921867335d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4753548222423668d + "'", double1 == 0.4753548222423668d);
    }

    @Test
    public void test7222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7222");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.38401783008108853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.40476400046171085d + "'", double1 == 0.40476400046171085d);
    }

    @Test
    public void test7223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7223");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.24398053114331036d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24162261086374015d + "'", double1 == 0.24162261086374015d);
    }

    @Test
    public void test7224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7224");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(16.62301213247846d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 952.4284379857783d + "'", double1 == 952.4284379857783d);
    }

    @Test
    public void test7225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7225");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.9328075542772654d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7319001864396504d) + "'", double1 == (-0.7319001864396504d));
    }

    @Test
    public void test7226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7226");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-3.046174056537146E-4d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7227");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.746938918904175d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7337719890985019d + "'", double1 == 0.7337719890985019d);
    }

    @Test
    public void test7228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7228");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.008838092819754678d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test7229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7229");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.6955886362231636d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.834775243288991d + "'", double1 == 0.834775243288991d);
    }

    @Test
    public void test7230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7230");
        double double1 = org.apache.commons.math.util.FastMath.sin(3.8108072797718955d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6203702025697551d) + "'", double1 == (-0.6203702025697551d));
    }

    @Test
    public void test7231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7231");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.0078125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.1072099696478683d) + "'", double1 == (-2.1072099696478683d));
    }

    @Test
    public void test7232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7232");
        double double1 = org.apache.commons.math.util.FastMath.atan(104.9439511105971d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5612677191481816d + "'", double1 == 1.5612677191481816d);
    }

    @Test
    public void test7233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7233");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.8414709848078965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7234");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '#', 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test7235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7235");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.540302305868139d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6045824459415905d + "'", double1 == 0.6045824459415905d);
    }

    @Test
    public void test7236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7236");
        double double1 = org.apache.commons.math.util.FastMath.log(0.020018482464401233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.9110993089470614d) + "'", double1 == (-3.9110993089470614d));
    }

    @Test
    public void test7237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7237");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.8752986176944212d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7238");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-1.125899906842619E15d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test7239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7239");
        double double1 = org.apache.commons.math.util.FastMath.signum(18.013888888888896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7240");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.396718545645432d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.04191482247339d + "'", double1 == 4.04191482247339d);
    }

    @Test
    public void test7241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7241");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9999999958776927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7182818172534524d + "'", double1 == 1.7182818172534524d);
    }

    @Test
    public void test7242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7242");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.24425607142663947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.276671207653211d + "'", double1 == 1.276671207653211d);
    }

    @Test
    public void test7243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7243");
        long long1 = org.apache.commons.math.util.FastMath.round(8525.954375188212d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 8526L + "'", long1 == 8526L);
    }

    @Test
    public void test7244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7244");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9708235100106998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.509444357843956d + "'", double1 == 1.509444357843956d);
    }

    @Test
    public void test7245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7245");
        double double2 = org.apache.commons.math.util.FastMath.min(0.651496622684403d, 0.9705211365109137d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.651496622684403d + "'", double2 == 0.651496622684403d);
    }

    @Test
    public void test7246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7246");
        double double1 = org.apache.commons.math.util.FastMath.atanh(3.626860407847018d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7247");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.033755946293507505d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.938893903907228E-18d + "'", double1 == 6.938893903907228E-18d);
    }

    @Test
    public void test7248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7248");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.5251592253256172d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.017894121583922d + "'", double1 == 1.017894121583922d);
    }

    @Test
    public void test7249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7249");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.7103940468474689d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.14850068663278757d) + "'", double1 == (-0.14850068663278757d));
    }

    @Test
    public void test7250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7250");
        double double1 = org.apache.commons.math.util.FastMath.floor(3.106884387721523d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test7251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7251");
        double double1 = org.apache.commons.math.util.FastMath.floor(10.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test7252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7252");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9994974667686599d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7169161446875767d + "'", double1 == 1.7169161446875767d);
    }

    @Test
    public void test7253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7253");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9720385499927633d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test7254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7254");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2147483647L, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test7255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7255");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.5585053606381855d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7473321621863905d + "'", double1 == 0.7473321621863905d);
    }

    @Test
    public void test7256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7256");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.6808092316663683d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test7257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7257");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.10862815709014047d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9640575883393439d) + "'", double1 == (-0.9640575883393439d));
    }

    @Test
    public void test7258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7258");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, (-53L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test7259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7259");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.0070912050862004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3210423628651728d + "'", double1 == 1.3210423628651728d);
    }

    @Test
    public void test7260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7260");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.8369144593899815d, (-0.9004962809790011d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5783475474088235d + "'", double2 == 0.5783475474088235d);
    }

    @Test
    public void test7261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7261");
        int int2 = org.apache.commons.math.util.FastMath.max((-1), (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test7262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7262");
        long long1 = org.apache.commons.math.util.FastMath.round(11013.232874703413d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 11013L + "'", long1 == 11013L);
    }

    @Test
    public void test7263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7263");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.4564232772900813d), (-0.5942992187596847d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.486669158045064d) + "'", double2 == (-2.486669158045064d));
    }

    @Test
    public void test7264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7264");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(26.205658776827104d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 26.205658776827107d + "'", double1 == 26.205658776827107d);
    }

    @Test
    public void test7265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7265");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.03717534551766489d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7266");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 1.7182818284590453d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test7267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7267");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.2929739711587489d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3018163834347028d + "'", double1 == 0.3018163834347028d);
    }

    @Test
    public void test7268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7268");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.5702670449415695d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5155553701065477d + "'", double1 == 0.5155553701065477d);
    }

    @Test
    public void test7269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7269");
        double double2 = org.apache.commons.math.util.FastMath.max(0.013388202148675738d, 2.120809392302826d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.120809392302826d + "'", double2 == 2.120809392302826d);
    }

    @Test
    public void test7270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7270");
        double double1 = org.apache.commons.math.util.FastMath.signum(29.61987058113476d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7271");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.7182818284590453d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7272");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.1785603199102086d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0021750928549484d + "'", double1 == 1.0021750928549484d);
    }

    @Test
    public void test7273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7273");
        float float2 = org.apache.commons.math.util.FastMath.max(32.0f, 52.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test7274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7274");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.7801576829951964d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6625243235134252d) + "'", double1 == (-0.6625243235134252d));
    }

    @Test
    public void test7275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7275");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.9117339147869651d), 1.5563025007672873d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.529937719693576d) + "'", double2 == (-0.529937719693576d));
    }

    @Test
    public void test7276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7276");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.4311581967195641d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.460023573101524d + "'", double1 == 0.460023573101524d);
    }

    @Test
    public void test7277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7277");
        int int2 = org.apache.commons.math.util.FastMath.min(4, (-53));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-53) + "'", int2 == (-53));
    }

    @Test
    public void test7278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7278");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.8222596433035483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2214342272920196d + "'", double1 == 1.2214342272920196d);
    }

    @Test
    public void test7279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7279");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.5949731538303166E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.594973153965567E-5d + "'", double1 == 1.594973153965567E-5d);
    }

    @Test
    public void test7280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7280");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.01745583420411082d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9998476507946565d + "'", double1 == 0.9998476507946565d);
    }

    @Test
    public void test7281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7281");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-2.7775225130543997d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-8.008471657254299d) + "'", double1 == (-8.008471657254299d));
    }

    @Test
    public void test7282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7282");
        long long1 = org.apache.commons.math.util.FastMath.round(0.22766430356286296d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test7283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7283");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.06728499818968087d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9349287103739221d + "'", double1 == 0.9349287103739221d);
    }

    @Test
    public void test7284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7284");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9917318921852735d, (-303.5829172438119d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1383259073137264d + "'", double2 == 3.1383259073137264d);
    }

    @Test
    public void test7285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7285");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.17083617943820936d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17001593129241488d + "'", double1 == 0.17001593129241488d);
    }

    @Test
    public void test7286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7286");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.860890812949043d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7287");
        double double1 = org.apache.commons.math.util.FastMath.floor(99.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 99.0d + "'", double1 == 99.0d);
    }

    @Test
    public void test7288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7288");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 13, 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test7289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7289");
        double double1 = org.apache.commons.math.util.FastMath.expm1(14.476482730108394d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1936673.2002147394d + "'", double1 == 1936673.2002147394d);
    }

    @Test
    public void test7290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7290");
        long long1 = org.apache.commons.math.util.FastMath.round(0.8419486119476914d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test7291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7291");
        int int2 = org.apache.commons.math.util.FastMath.max(100, 72);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test7292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7292");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-2.1103453443603275d), (-0.0361961097813307d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.110345344360327d) + "'", double2 == (-2.110345344360327d));
    }

    @Test
    public void test7293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7293");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.24101530784419936d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.24101530784419933d) + "'", double1 == (-0.24101530784419933d));
    }

    @Test
    public void test7294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7294");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.4600502299070493d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8960301969229972d + "'", double1 == 0.8960301969229972d);
    }

    @Test
    public void test7295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7295");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.5709773989134321d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02741872808545578d + "'", double1 == 0.02741872808545578d);
    }

    @Test
    public void test7296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7296");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.3500296991663472d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7297");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.24356506942966236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test7298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7298");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(4.59470089220704d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.662464632826401d + "'", double1 == 1.662464632826401d);
    }

    @Test
    public void test7299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7299");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 192L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 192 + "'", int1 == 192);
    }

    @Test
    public void test7300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7300");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.016591253173121d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0082615003921953d + "'", double1 == 1.0082615003921953d);
    }

    @Test
    public void test7301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7301");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.43107595064559234d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7302");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.6769292032740716d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8780402339003771d + "'", double1 == 0.8780402339003771d);
    }

    @Test
    public void test7303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7303");
        long long1 = org.apache.commons.math.util.FastMath.round(77.26503394947865d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 77L + "'", long1 == 77L);
    }

    @Test
    public void test7304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7304");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(3.053086467974937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7473083494263217d + "'", double1 == 1.7473083494263217d);
    }

    @Test
    public void test7305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7305");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.6147492292213784d, 43.42944819032519d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6147492292213785d + "'", double2 == 0.6147492292213785d);
    }

    @Test
    public void test7306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7306");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.09966865249116202d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09934057489936098d + "'", double1 == 0.09934057489936098d);
    }

    @Test
    public void test7307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7307");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.01568485717214877d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.8045194316764734d) + "'", double1 == (-1.8045194316764734d));
    }

    @Test
    public void test7308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7308");
        double double2 = org.apache.commons.math.util.FastMath.atan2(533.252579626545d, 1.1433548139665488d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5686522151570603d + "'", double2 == 1.5686522151570603d);
    }

    @Test
    public void test7309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7309");
        double double1 = org.apache.commons.math.util.FastMath.atanh(35.00000000000002d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7310");
        double double1 = org.apache.commons.math.util.FastMath.atanh(35.350506208557206d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7311");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.147483647E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test7312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7312");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(4.59470089220704d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.594700892207041d + "'", double1 == 4.594700892207041d);
    }

    @Test
    public void test7313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7313");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.8216615418906639d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6878103481733034d + "'", double1 == 0.6878103481733034d);
    }

    @Test
    public void test7314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7314");
        float float2 = org.apache.commons.math.util.FastMath.min(192.0f, (float) 35L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test7315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7315");
        double double1 = org.apache.commons.math.util.FastMath.asin((-1.8045194316764734d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7316");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.3988794632894587d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7361176408480671d + "'", double1 == 0.7361176408480671d);
    }

    @Test
    public void test7317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7317");
        double double2 = org.apache.commons.math.util.FastMath.pow(9.307013259236445d, 6.226322265462393E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000013889491544d + "'", double2 == 1.0000013889491544d);
    }

    @Test
    public void test7318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7318");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.09934057489936098d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.46313637243099626d + "'", double1 == 0.46313637243099626d);
    }

    @Test
    public void test7319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7319");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 192, 8.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 192.0f + "'", float2 == 192.0f);
    }

    @Test
    public void test7320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7320");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9640275800758169d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7321");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 192);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 192L + "'", long1 == 192L);
    }

    @Test
    public void test7322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7322");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.6759364361843174d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.72859658882117d) + "'", double1 == (-0.72859658882117d));
    }

    @Test
    public void test7323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7323");
        int int2 = org.apache.commons.math.util.FastMath.max((-1), (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test7324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7324");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.010374668130899874d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01037504036836601d) + "'", double1 == (-0.01037504036836601d));
    }

    @Test
    public void test7325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7325");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9939715368870689d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9939715368870689d + "'", double1 == 0.9939715368870689d);
    }

    @Test
    public void test7326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7326");
        double double2 = org.apache.commons.math.util.FastMath.max(1.5707963267948961d, 6.000000000000001d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.000000000000001d + "'", double2 == 6.000000000000001d);
    }

    @Test
    public void test7327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7327");
        double double1 = org.apache.commons.math.util.FastMath.sin(71.39110387530145d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7614370932119012d + "'", double1 == 0.7614370932119012d);
    }

    @Test
    public void test7328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7328");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) (-36));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test7329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7329");
        double double1 = org.apache.commons.math.util.FastMath.rint(3.133577208235657d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test7330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7330");
        double double1 = org.apache.commons.math.util.FastMath.exp(39.53797086347916d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4829365577637216E17d + "'", double1 == 1.4829365577637216E17d);
    }

    @Test
    public void test7331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7331");
        double double2 = org.apache.commons.math.util.FastMath.min(2.1521778176391675d, 11013.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1521778176391675d + "'", double2 == 2.1521778176391675d);
    }

    @Test
    public void test7332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7332");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.5508591762880619d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test7333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7333");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9295845569456044d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.19328418158873d + "'", double1 == 1.19328418158873d);
    }

    @Test
    public void test7334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7334");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.29170983715022947d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.005091297118727977d) + "'", double1 == (-0.005091297118727977d));
    }

    @Test
    public void test7335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7335");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 100L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test7336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7336");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.6080872397649996d, 0.13850408558812574d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9334227748699243d + "'", double2 == 0.9334227748699243d);
    }

    @Test
    public void test7337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7337");
        double double1 = org.apache.commons.math.util.FastMath.asinh(4.294967294000012E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.873856958012535d + "'", double1 == 22.873856958012535d);
    }

    @Test
    public void test7338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7338");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.53682479588095d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 88.05357465503265d + "'", double1 == 88.05357465503265d);
    }

    @Test
    public void test7339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7339");
        double double1 = org.apache.commons.math.util.FastMath.ulp(3.1215384062460795E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.776263578034403E-21d + "'", double1 == 6.776263578034403E-21d);
    }

    @Test
    public void test7340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7340");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.502154937700735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 143.36291761807152d + "'", double1 == 143.36291761807152d);
    }

    @Test
    public void test7341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7341");
        double double1 = org.apache.commons.math.util.FastMath.ceil(3.0537144249814574d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test7342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7342");
        double double1 = org.apache.commons.math.util.FastMath.expm1(143.76533696469124d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7320744681002E62d + "'", double1 == 2.7320744681002E62d);
    }

    @Test
    public void test7343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7343");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.12506129236784067d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test7344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7344");
        double double1 = org.apache.commons.math.util.FastMath.rint((-303.5829172438119d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-304.0d) + "'", double1 == (-304.0d));
    }

    @Test
    public void test7345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7345");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9990737979836914d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8385510796192697d + "'", double1 == 3.8385510796192697d);
    }

    @Test
    public void test7346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7346");
        int int2 = org.apache.commons.math.util.FastMath.max(3, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test7347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7347");
        double double1 = org.apache.commons.math.util.FastMath.exp((-2.4390790887957308d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08724115583759054d + "'", double1 == 0.08724115583759054d);
    }

    @Test
    public void test7348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7348");
        long long1 = org.apache.commons.math.util.FastMath.round(0.6846269172035435d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test7349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7349");
        long long2 = org.apache.commons.math.util.FastMath.max((-1L), 77L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 77L + "'", long2 == 77L);
    }

    @Test
    public void test7350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7350");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1844.3935640983048d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test7351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7351");
        double double2 = org.apache.commons.math.util.FastMath.min(0.4775110479056863d, 0.7413633920040708d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4775110479056863d + "'", double2 == 0.4775110479056863d);
    }

    @Test
    public void test7352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7352");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.8112570643423485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.09084150838381813d) + "'", double1 == (-0.09084150838381813d));
    }

    @Test
    public void test7353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7353");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.72859658882117d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7947923387732213d) + "'", double1 == (-0.7947923387732213d));
    }

    @Test
    public void test7354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7354");
        double double1 = org.apache.commons.math.util.FastMath.log(0.8871621889968087d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.11972746220762945d) + "'", double1 == (-0.11972746220762945d));
    }

    @Test
    public void test7355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7355");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.762568627764521d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7356");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.2125660080184589d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2094212833870933d) + "'", double1 == (-0.2094212833870933d));
    }

    @Test
    public void test7357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7357");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.089135847258365d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8862269254527579d + "'", double1 == 0.8862269254527579d);
    }

    @Test
    public void test7358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7358");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.646957225053178d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7359");
        double double1 = org.apache.commons.math.util.FastMath.sin(39.82204982013094d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8514031545544666d + "'", double1 == 0.8514031545544666d);
    }

    @Test
    public void test7360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7360");
        double double2 = org.apache.commons.math.util.FastMath.max(0.26708193203237746d, (-86.33580274416313d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.26708193203237746d + "'", double2 == 0.26708193203237746d);
    }

    @Test
    public void test7361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7361");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.7645563169587528d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7362");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.4895588441567153d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.48955884415671536d + "'", double1 == 0.48955884415671536d);
    }

    @Test
    public void test7363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7363");
        long long1 = org.apache.commons.math.util.FastMath.round(1.7340470340425622d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test7364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7364");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.688117141816173E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.540177670628365E45d + "'", double1 == 1.540177670628365E45d);
    }

    @Test
    public void test7365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7365");
        long long1 = org.apache.commons.math.util.FastMath.round(2.3686469200204923d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test7366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7366");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 8L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 8.0f + "'", float1 == 8.0f);
    }

    @Test
    public void test7367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7367");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9119630497674487d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7393853435050379d + "'", double1 == 0.7393853435050379d);
    }

    @Test
    public void test7368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7368");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.016455121993179136d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.016456607424677805d + "'", double1 == 0.016456607424677805d);
    }

    @Test
    public void test7369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7369");
        double double1 = org.apache.commons.math.util.FastMath.floor(9.365556905258951E27d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.365556905258951E27d + "'", double1 == 9.365556905258951E27d);
    }

    @Test
    public void test7370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7370");
        double double1 = org.apache.commons.math.util.FastMath.log(1.3169578969248166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.27532445332439925d + "'", double1 == 0.27532445332439925d);
    }

    @Test
    public void test7371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7371");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.2049722769676206d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22749103471776816d + "'", double1 == 0.22749103471776816d);
    }

    @Test
    public void test7372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7372");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-1.5707749731629903d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test7373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7373");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.7910068511973d + "'", double1 == 11.7910068511973d);
    }

    @Test
    public void test7374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7374");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.313202361858184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1459504185863296d + "'", double1 == 1.1459504185863296d);
    }

    @Test
    public void test7375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7375");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.0000013889491544d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000013889491544d + "'", double1 == 1.0000013889491544d);
    }

    @Test
    public void test7376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7376");
        long long2 = org.apache.commons.math.util.FastMath.min((long) '4', (long) 192);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test7377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7377");
        int int2 = org.apache.commons.math.util.FastMath.min((int) 'a', (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7378");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 8526L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7379");
        long long1 = org.apache.commons.math.util.FastMath.round(0.21839450088746076d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test7380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7380");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 192L, 3.9481478E13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.9481478E13f + "'", float2 == 3.9481478E13f);
    }

    @Test
    public void test7381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7381");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.00024867560232d, 43.66827237527655d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0109170446939104d + "'", double2 == 1.0109170446939104d);
    }

    @Test
    public void test7382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7382");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9999999956854249d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7182818167308143d + "'", double1 == 2.7182818167308143d);
    }

    @Test
    public void test7383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7383");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.3599428679717961d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.35994286797179614d + "'", double1 == 0.35994286797179614d);
    }

    @Test
    public void test7384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7384");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.9740740045669996E13d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7385");
        long long2 = org.apache.commons.math.util.FastMath.min(13L, 36L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 13L + "'", long2 == 13L);
    }

    @Test
    public void test7386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7386");
        double double1 = org.apache.commons.math.util.FastMath.acos(5.411092370385766E-19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test7387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7387");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9999303766736223d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7615649143946301d + "'", double1 == 0.7615649143946301d);
    }

    @Test
    public void test7388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7388");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8646647167633873d, 0.39550023939513446d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8646647167633872d + "'", double2 == 0.8646647167633872d);
    }

    @Test
    public void test7389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7389");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.9429832520348356d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7390");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.511269604288962d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 33.490760817142494d + "'", double1 == 33.490760817142494d);
    }

    @Test
    public void test7391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7391");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.685218737681694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4289796690667971d + "'", double1 == 0.4289796690667971d);
    }

    @Test
    public void test7392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7392");
        int int2 = org.apache.commons.math.util.FastMath.min(11013, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7393");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.433704240591099d, 47.26171308520733d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4337042405910991d + "'", double2 == 1.4337042405910991d);
    }

    @Test
    public void test7394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7394");
        long long2 = org.apache.commons.math.util.FastMath.min(72L, 13L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 13L + "'", long2 == 13L);
    }

    @Test
    public void test7395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7395");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) (-2.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8646647167633873d) + "'", double1 == (-0.8646647167633873d));
    }

    @Test
    public void test7396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7396");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(4.584967478670572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1412537165573284d + "'", double1 == 2.1412537165573284d);
    }

    @Test
    public void test7397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7397");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.017023944947506645d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test7398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7398");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) 4L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06981317007977318d + "'", double1 == 0.06981317007977318d);
    }

    @Test
    public void test7399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7399");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.5143524375699186d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5143524375699186d + "'", double1 == 0.5143524375699186d);
    }

    @Test
    public void test7400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7400");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.8809373872769856d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 50.473994306252976d + "'", double1 == 50.473994306252976d);
    }

    @Test
    public void test7401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7401");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.4248194237419025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4248194237419027d + "'", double1 == 1.4248194237419027d);
    }

    @Test
    public void test7402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7402");
        int int2 = org.apache.commons.math.util.FastMath.max(4, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test7403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7403");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.44863321586778093d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.566170105494617d + "'", double1 == 1.566170105494617d);
    }

    @Test
    public void test7404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7404");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 72L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7405");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.7216342229204444d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7216342229204445d + "'", double1 == 0.7216342229204445d);
    }

    @Test
    public void test7406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7406");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.9802322387695312E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000298023228d + "'", double1 == 1.0000000298023228d);
    }

    @Test
    public void test7407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7407");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(16.967337547743597d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.119142817109355d + "'", double1 == 4.119142817109355d);
    }

    @Test
    public void test7408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7408");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.2829673798684508E23d, 21.323945308420992d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test7409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7409");
        double double1 = org.apache.commons.math.util.FastMath.expm1(4.0398008129510645E-19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0398008129510645E-19d + "'", double1 == 4.0398008129510645E-19d);
    }

    @Test
    public void test7410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7410");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.34587900271182787d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2924019006218886d) + "'", double1 == (-0.2924019006218886d));
    }

    @Test
    public void test7411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7411");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.2583723393689585d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.519687964982708d + "'", double1 == 2.519687964982708d);
    }

    @Test
    public void test7412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7412");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.025080161104123633d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.025085421022393677d + "'", double1 == 0.025085421022393677d);
    }

    @Test
    public void test7413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7413");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9746912786087358d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.974691278608736d + "'", double1 == 0.974691278608736d);
    }

    @Test
    public void test7414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7414");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9033391107665126d, 0.8081843818082921d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9033391107665125d + "'", double2 == 0.9033391107665125d);
    }

    @Test
    public void test7415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7415");
        int int1 = org.apache.commons.math.util.FastMath.abs(57);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 57 + "'", int1 == 57);
    }

    @Test
    public void test7416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7416");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.4856741544225798d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1867903066669048d + "'", double1 == 1.1867903066669048d);
    }

    @Test
    public void test7417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7417");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 192L, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test7418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7418");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.812549295306508d, 23151.90693368639d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.509643060073873E-5d + "'", double2 == 3.509643060073873E-5d);
    }

    @Test
    public void test7419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7419");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.8412503381137895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6864707559864328d + "'", double1 == 0.6864707559864328d);
    }

    @Test
    public void test7420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7420");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.5686522151570603d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19552666711750058d + "'", double1 == 0.19552666711750058d);
    }

    @Test
    public void test7421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7421");
        double double1 = org.apache.commons.math.util.FastMath.log(3.8385510796192697d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3450949723795793d + "'", double1 == 1.3450949723795793d);
    }

    @Test
    public void test7422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7422");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.15958182281264355d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1730202381093359d + "'", double1 == 0.1730202381093359d);
    }

    @Test
    public void test7423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7423");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(10026.761414789406d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 175.0d + "'", double1 == 175.0d);
    }

    @Test
    public void test7424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7424");
        long long1 = org.apache.commons.math.util.FastMath.round(0.016591253173120858d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test7425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7425");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, 32.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test7426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7426");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.4577979139729036d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.163697324441955d + "'", double1 == 0.163697324441955d);
    }

    @Test
    public void test7427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7427");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.1301927452503904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8110852184180884d + "'", double1 == 0.8110852184180884d);
    }

    @Test
    public void test7428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7428");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.716759133972877d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9994396750506453d + "'", double1 == 0.9994396750506453d);
    }

    @Test
    public void test7429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7429");
        int int2 = org.apache.commons.math.util.FastMath.min(14, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
    }

    @Test
    public void test7430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7430");
        long long1 = org.apache.commons.math.util.FastMath.round((-40.458416869119034d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-40L) + "'", long1 == (-40L));
    }

    @Test
    public void test7431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7431");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.7361176408480671d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9419516319148891d + "'", double1 == 0.9419516319148891d);
    }

    @Test
    public void test7432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7432");
        double double1 = org.apache.commons.math.util.FastMath.ulp(215.5579348013961d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8421709430404007E-14d + "'", double1 == 2.8421709430404007E-14d);
    }

    @Test
    public void test7433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7433");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.2737367544323206E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2737367544323206E-13d + "'", double1 == 2.2737367544323206E-13d);
    }

    @Test
    public void test7434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7434");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.5716776679087391d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test7435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7435");
        int int2 = org.apache.commons.math.util.FastMath.min((-3), 57);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test7436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7436");
        double double2 = org.apache.commons.math.util.FastMath.atan2(49.63039286521482d, (double) 6.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.450486516990388d + "'", double2 == 1.450486516990388d);
    }

    @Test
    public void test7437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7437");
        long long2 = org.apache.commons.math.util.FastMath.min(4L, (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test7438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7438");
        int int2 = org.apache.commons.math.util.FastMath.min((int) 'a', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test7439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7439");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(31.330643198305168d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1795.1136246931453d + "'", double1 == 1795.1136246931453d);
    }

    @Test
    public void test7440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7440");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7938702090612697d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6605959163879956d + "'", double1 == 0.6605959163879956d);
    }

    @Test
    public void test7441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7441");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-2.437676068437603d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.042545473491306794d) + "'", double1 == (-0.042545473491306794d));
    }

    @Test
    public void test7442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7442");
        int int2 = org.apache.commons.math.util.FastMath.min(5, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test7443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7443");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(36.000000000000014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 36.00000000000002d + "'", double1 == 36.00000000000002d);
    }

    @Test
    public void test7444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7444");
        double double2 = org.apache.commons.math.util.FastMath.atan2(3.141592653589793d, (-304.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.131258835086945d + "'", double2 == 3.131258835086945d);
    }

    @Test
    public void test7445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7445");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.8402785435782614d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7446");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 97L, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test7447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7447");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.1752048460302915d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.865771017145505d + "'", double1 == 0.865771017145505d);
    }

    @Test
    public void test7448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7448");
        double double1 = org.apache.commons.math.util.FastMath.atanh(3.506328628316939E14d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7449");
        double double1 = org.apache.commons.math.util.FastMath.exp(4.5035996273704835E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test7450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7450");
        long long2 = org.apache.commons.math.util.FastMath.max(1833L, 42L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1833L + "'", long2 == 1833L);
    }

    @Test
    public void test7451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7451");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test7452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7452");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.21092668861480754d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7453");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.6147492292213785d, 0.8555035296395697d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6147492292213786d + "'", double2 == 0.6147492292213786d);
    }

    @Test
    public void test7454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7454");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 0.26708193203237746d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test7455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7455");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9623680699256677d, (-0.27572056477178236d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.010632295426148d + "'", double2 == 1.010632295426148d);
    }

    @Test
    public void test7456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7456");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.008838207883813802d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test7457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7457");
        long long2 = org.apache.commons.math.util.FastMath.max(8526L, (long) (-36));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8526L + "'", long2 == 8526L);
    }

    @Test
    public void test7458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7458");
        double double1 = org.apache.commons.math.util.FastMath.floor((-55.641329293214156d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-56.0d) + "'", double1 == (-56.0d));
    }

    @Test
    public void test7459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7459");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.947140865203826d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8032434057113662d + "'", double1 == 1.8032434057113662d);
    }

    @Test
    public void test7460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7460");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.3168008123704913d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0960743852277033d + "'", double1 == 1.0960743852277033d);
    }

    @Test
    public void test7461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7461");
        int int2 = org.apache.commons.math.util.FastMath.max(1833, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test7462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7462");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.175201187282749d, 1.5456620010518718d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1752011872827492d + "'", double2 == 1.1752011872827492d);
    }

    @Test
    public void test7463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7463");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9999995824370146d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test7464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7464");
        double double1 = org.apache.commons.math.util.FastMath.sin(4.632512904931238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9968116020407186d) + "'", double1 == (-0.9968116020407186d));
    }

    @Test
    public void test7465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7465");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.15335264995992576d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15335264995992579d + "'", double1 == 0.15335264995992579d);
    }

    @Test
    public void test7466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7466");
        long long2 = org.apache.commons.math.util.FastMath.max(2147483647L, (long) 36);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test7467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7467");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.09470993405978069d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09442826663555036d + "'", double1 == 0.09442826663555036d);
    }

    @Test
    public void test7468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7468");
        double double1 = org.apache.commons.math.util.FastMath.tanh(53.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7469");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.5370480253245054d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.033741895575955645d + "'", double1 == 0.033741895575955645d);
    }

    @Test
    public void test7470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7470");
        int int2 = org.apache.commons.math.util.FastMath.min((-53), (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-53) + "'", int2 == (-53));
    }

    @Test
    public void test7471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7471");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(5.9327515395324766E246d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.435724027785676E123d + "'", double1 == 2.435724027785676E123d);
    }

    @Test
    public void test7472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7472");
        int int2 = org.apache.commons.math.util.FastMath.min((-2), 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test7473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7473");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9746912786087358d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3453358955629788d + "'", double1 == 1.3453358955629788d);
    }

    @Test
    public void test7474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7474");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.3440585709080678E43d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7475");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.49518702726174274d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7911456045223522d + "'", double1 == 0.7911456045223522d);
    }

    @Test
    public void test7476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7476");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.5224112125982794d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.651382593085287d + "'", double1 == 20.651382593085287d);
    }

    @Test
    public void test7477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7477");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9999999999999701d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7478");
        double double1 = org.apache.commons.math.util.FastMath.log(23567.39729090051d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.067619565178726d + "'", double1 == 10.067619565178726d);
    }

    @Test
    public void test7479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7479");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-1.91273454925053d), 0.8277585368656382d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.9127345492505299d) + "'", double2 == (-1.9127345492505299d));
    }

    @Test
    public void test7480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7480");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 77L, (float) 72);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 72.0f + "'", float2 == 72.0f);
    }

    @Test
    public void test7481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7481");
        int int2 = org.apache.commons.math.util.FastMath.min(32, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7482");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.00604885025084334d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3465735902799727d) + "'", double1 == (-0.3465735902799727d));
    }

    @Test
    public void test7483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7483");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.13034332260033038d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7484");
        double double1 = org.apache.commons.math.util.FastMath.abs(26.78541008402805d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 26.78541008402805d + "'", double1 == 26.78541008402805d);
    }

    @Test
    public void test7485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7485");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(7721.570345472033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 87.87246636729866d + "'", double1 == 87.87246636729866d);
    }

    @Test
    public void test7486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7486");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.339637404328899d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test7487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7487");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.5619846939613335d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5359549985579516d) + "'", double1 == (-0.5359549985579516d));
    }

    @Test
    public void test7488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7488");
        double double1 = org.apache.commons.math.util.FastMath.ulp(99.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test7489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7489");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.594985873324243E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5949858733918697E-5d + "'", double1 == 1.5949858733918697E-5d);
    }

    @Test
    public void test7490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7490");
        double double1 = org.apache.commons.math.util.FastMath.cos((-6.884570336239587E-9d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7491");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.762747174039086d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test7492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7492");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test7493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7493");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.02682265271441237d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02681622200387289d + "'", double1 == 0.02681622200387289d);
    }

    @Test
    public void test7494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7494");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.02759663015433203d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02759663015433203d + "'", double1 == 0.02759663015433203d);
    }

    @Test
    public void test7495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7495");
        double double2 = org.apache.commons.math.util.FastMath.max((double) 53L, 0.7203775199467526d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 53.0d + "'", double2 == 53.0d);
    }

    @Test
    public void test7496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7496");
        double double1 = org.apache.commons.math.util.FastMath.abs((-1.0156523399700865d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0156523399700865d + "'", double1 == 1.0156523399700865d);
    }

    @Test
    public void test7497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7497");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 10, 11013L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11013L + "'", long2 == 11013L);
    }

    @Test
    public void test7498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7498");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9995917534020515d, 0.9200340278708842d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9200340278708842d + "'", double2 == 0.9200340278708842d);
    }

    @Test
    public void test7499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7499");
        long long1 = org.apache.commons.math.util.FastMath.round(0.5463286932803015d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test7500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7500");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.8956467447195862d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }
}

