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
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.6515104748804021d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.18607859737858523d) + "'", double1 == (-0.18607859737858523d));
    }

    @Test
    public void test7502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7502");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-1.998096277817887d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13559316941126331d + "'", double1 == 0.13559316941126331d);
    }

    @Test
    public void test7503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7503");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(83.99396873060411d, 1.1044889974911134d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5576474619326568d + "'", double2 == 1.5576474619326568d);
    }

    @Test
    public void test7504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7504");
        int int1 = org.apache.commons.math3.util.FastMath.round((-45.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-45) + "'", int1 == (-45));
    }

    @Test
    public void test7505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7505");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.2637391709123275d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.25778956689580734d + "'", double1 == 0.25778956689580734d);
    }

    @Test
    public void test7506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7506");
        double double1 = org.apache.commons.math3.util.FastMath.cos(6400.002167999235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.837593826097316d) + "'", double1 == (-0.837593826097316d));
    }

    @Test
    public void test7507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7507");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 46.999992f, (-0.6912431464778742d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6912431464778742d) + "'", double2 == (-0.6912431464778742d));
    }

    @Test
    public void test7508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7508");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 511, (long) (-6));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6L) + "'", long2 == (-6L));
    }

    @Test
    public void test7509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7509");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) (-3.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.9999999999999996d) + "'", double1 == (-2.9999999999999996d));
    }

    @Test
    public void test7510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7510");
        double double2 = org.apache.commons.math3.util.FastMath.pow(8.66334748188207d, 655360);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test7511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7511");
        double double2 = org.apache.commons.math3.util.FastMath.pow(5.123868210250173d, (double) 1.1E-44f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test7512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7512");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-0.6104048481741295d), 0.021622303937752996d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5353882414038456d) + "'", double2 == (-1.5353882414038456d));
    }

    @Test
    public void test7513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7513");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 511.00003f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.236369649924991d + "'", double1 == 6.236369649924991d);
    }

    @Test
    public void test7514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7514");
        float float2 = org.apache.commons.math3.util.FastMath.min(6.1572651E13f, (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test7515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7515");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.5707963267948967d, 0.5027863216186397d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.760659274504261d + "'", double2 == 0.760659274504261d);
    }

    @Test
    public void test7516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7516");
        long long2 = org.apache.commons.math3.util.FastMath.max(4609435868686548992L, (long) 63);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4609435868686548992L + "'", long2 == 4609435868686548992L);
    }

    @Test
    public void test7517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7517");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.4636456564559829d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7518");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test7519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7519");
        int int2 = org.apache.commons.math3.util.FastMath.min((-10), 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10) + "'", int2 == (-10));
    }

    @Test
    public void test7520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7520");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.9999999999999998d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7521");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.5704057018147648d, 1.9360721724123813d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4637968221819215d + "'", double2 == 1.4637968221819215d);
    }

    @Test
    public void test7522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7522");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.1742984407142925d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.776706056514845d + "'", double1 == 0.776706056514845d);
    }

    @Test
    public void test7523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7523");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) (-1.4E-45f), 0.6690316852237953d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.401298464324817E-45d + "'", double2 == 1.401298464324817E-45d);
    }

    @Test
    public void test7524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7524");
        int int2 = org.apache.commons.math3.util.FastMath.max(63, 17);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 63 + "'", int2 == 63);
    }

    @Test
    public void test7525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7525");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.6673940248314076d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test7526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7526");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.5514266812416906d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test7527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7527");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-0.1808772461066962d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.18187833657158073d) + "'", double1 == (-0.18187833657158073d));
    }

    @Test
    public void test7528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7528");
        long long2 = org.apache.commons.math3.util.FastMath.min(87L, 511L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 87L + "'", long2 == 87L);
    }

    @Test
    public void test7529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7529");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.6594942162563324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9781359604493585d + "'", double1 == 0.9781359604493585d);
    }

    @Test
    public void test7530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7530");
        float float2 = org.apache.commons.math3.util.FastMath.max(128.0f, (-3.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 128.0f + "'", float2 == 128.0f);
    }

    @Test
    public void test7531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7531");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(5.59529114079855E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.593726360317318E-4d + "'", double1 == 5.593726360317318E-4d);
    }

    @Test
    public void test7532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7532");
        long long1 = org.apache.commons.math3.util.FastMath.round(3.7776536914795704d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void test7533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7533");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.1449205926874493d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7534");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) (-5L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-74.20321057778875d) + "'", double1 == (-74.20321057778875d));
    }

    @Test
    public void test7535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7535");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.162447350492738d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7536");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 20.000002f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.0d + "'", double1 == 20.0d);
    }

    @Test
    public void test7537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7537");
        double double1 = org.apache.commons.math3.util.FastMath.floor(2.2163925864078933d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test7538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7538");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-0.6318307327098474d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test7539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7539");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-0.9469495741507528d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8116373419564976d) + "'", double1 == (-0.8116373419564976d));
    }

    @Test
    public void test7540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7540");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 8, 188090948814L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 188090948814L + "'", long2 == 188090948814L);
    }

    @Test
    public void test7541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7541");
        float float1 = org.apache.commons.math3.util.FastMath.signum(1.364242E-12f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test7542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7542");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-24.191690961245197d), 0.6007036339115129d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.16354560478467928d) + "'", double2 == (-0.16354560478467928d));
    }

    @Test
    public void test7543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7543");
        float float1 = org.apache.commons.math3.util.FastMath.signum(7.318351E15f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test7544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7544");
        float float1 = org.apache.commons.math3.util.FastMath.signum(7.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test7545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7545");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(57.295779513082316d, 0.6610060414837631d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5592601067862073d + "'", double2 == 1.5592601067862073d);
    }

    @Test
    public void test7546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7546");
        double double2 = org.apache.commons.math3.util.FastMath.min((-0.00883774765993097d), (double) (-2.535301E30f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.5353010493407314E30d) + "'", double2 == (-2.5353010493407314E30d));
    }

    @Test
    public void test7547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7547");
        double double1 = org.apache.commons.math3.util.FastMath.signum(2.080594601624405E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7548");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 9.094948E-13f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-12.041199774787314d) + "'", double1 == (-12.041199774787314d));
    }

    @Test
    public void test7549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7549");
        float float1 = org.apache.commons.math3.util.FastMath.abs(1024.0001f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1024.0001f + "'", float1 == 1024.0001f);
    }

    @Test
    public void test7550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7550");
        int int2 = org.apache.commons.math3.util.FastMath.min(143, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test7551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7551");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(0.048828125f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.7252903E-9f + "'", float1 == 3.7252903E-9f);
    }

    @Test
    public void test7552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7552");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.6672556629700335d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test7553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7553");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(2.3283067E-10f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.7755576E-17f + "'", float1 == 2.7755576E-17f);
    }

    @Test
    public void test7554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7554");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(0.0f, (int) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test7555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7555");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(96.99999f, 2147483647);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test7556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7556");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.021812536565224118d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test7557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7557");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.7771211630872562d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7771211630872562d + "'", double1 == 0.7771211630872562d);
    }

    @Test
    public void test7558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7558");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(Float.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-3.4028235E38f) + "'", float1 == (-3.4028235E38f));
    }

    @Test
    public void test7559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7559");
        double double2 = org.apache.commons.math3.util.FastMath.min((-0.7218595826821476d), (-0.6553210298687463d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7218595826821476d) + "'", double2 == (-0.7218595826821476d));
    }

    @Test
    public void test7560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7560");
        double double1 = org.apache.commons.math3.util.FastMath.log(2.7182818284590455d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7561");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.047442967903742035d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9988747934765346d + "'", double1 == 0.9988747934765346d);
    }

    @Test
    public void test7562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7562");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.4903341516806188d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1422501345202682d + "'", double1 == 1.1422501345202682d);
    }

    @Test
    public void test7563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7563");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 2L, 0.8813735837697563d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.9999999f + "'", float2 == 1.9999999f);
    }

    @Test
    public void test7564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7564");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.0919948905169028d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.738118103808156d + "'", double1 == 0.738118103808156d);
    }

    @Test
    public void test7565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7565");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.001565000444055422d, (double) 35L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void test7566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7566");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 4.5474746E-13f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.54747459306578E-13d + "'", double1 == 4.54747459306578E-13d);
    }

    @Test
    public void test7567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7567");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) (-127.0f), 0.09966865249116201d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 127.00003910960142d + "'", double2 == 127.00003910960142d);
    }

    @Test
    public void test7568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7568");
        double double1 = org.apache.commons.math3.util.FastMath.asin(57.29577951308232d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7569");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.6389612763136348d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6833357813547438d + "'", double1 == 0.6833357813547438d);
    }

    @Test
    public void test7570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7570");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.7601702599438814d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test7571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7571");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.8054745282687201d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8054745282687201d + "'", double1 == 1.8054745282687201d);
    }

    @Test
    public void test7572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7572");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-10.049875621120892d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.17540341900446973d) + "'", double1 == (-0.17540341900446973d));
    }

    @Test
    public void test7573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7573");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(2.718281954078841d, (-0.8813735870195429d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.857599723853286d + "'", double2 == 2.857599723853286d);
    }

    @Test
    public void test7574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7574");
        double double1 = org.apache.commons.math3.util.FastMath.acos(3.3800863156250025d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7575");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(1.8880249E22f, (float) 32);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.8880249E22f + "'", float2 == 1.8880249E22f);
    }

    @Test
    public void test7576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7576");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-0.7755431812723019d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.887575065336563d) + "'", double1 == (-0.887575065336563d));
    }

    @Test
    public void test7577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7577");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.7076170222418037d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.936354518934239d + "'", double1 == 0.936354518934239d);
    }

    @Test
    public void test7578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7578");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(1.7592186E13f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.75921881E13f + "'", float1 == 1.75921881E13f);
    }

    @Test
    public void test7579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7579");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.03391880910465605d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test7580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7580");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 8L, 8.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.0f + "'", float2 == 8.0f);
    }

    @Test
    public void test7581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7581");
        double double2 = org.apache.commons.math3.util.FastMath.min(2.135016052687385E72d, 0.9999998931032008d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999998931032008d + "'", double2 == 0.9999998931032008d);
    }

    @Test
    public void test7582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7582");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 32768L, 9.223372036854776E18d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32768.0d + "'", double2 == 32768.0d);
    }

    @Test
    public void test7583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7583");
        double double1 = org.apache.commons.math3.util.FastMath.exp(365942.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test7584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7584");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.6685117558576993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test7585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7585");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-7.105427357601027E-15d), 0.9988007752196233d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-7.105427357601027E-15d) + "'", double2 == (-7.105427357601027E-15d));
    }

    @Test
    public void test7586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7586");
        int int2 = org.apache.commons.math3.util.FastMath.max((-3), 4096);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4096 + "'", int2 == 4096);
    }

    @Test
    public void test7587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7587");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) (-0.011718746f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.011787951982578546d) + "'", double1 == (-0.011787951982578546d));
    }

    @Test
    public void test7588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7588");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test7589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7589");
        double double2 = org.apache.commons.math3.util.FastMath.max((-1.6090486460720002d), 9.421267929380438d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.421267929380438d + "'", double2 == 9.421267929380438d);
    }

    @Test
    public void test7590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7590");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-2400.8743011177776d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7591");
        int int2 = org.apache.commons.math3.util.FastMath.max(0, (-2147483648));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test7592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7592");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.3642422694998269E-12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3642422694988963E-12d + "'", double1 == 1.3642422694988963E-12d);
    }

    @Test
    public void test7593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7593");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-0.3188855888203308d), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.1594427944101654d) + "'", double2 == (-0.1594427944101654d));
    }

    @Test
    public void test7594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7594");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-2.1988261943012386d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.809186632645002d) + "'", double1 == (-0.809186632645002d));
    }

    @Test
    public void test7595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7595");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(3.4359736319999996E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3250.997289839357d + "'", double1 == 3250.997289839357d);
    }

    @Test
    public void test7596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7596");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.6483635366065764d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7597");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 100, 2.0000005f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test7598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7598");
        int int1 = org.apache.commons.math3.util.FastMath.round(2.8421713E-14f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test7599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7599");
        float float1 = org.apache.commons.math3.util.FastMath.signum((-57.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test7600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7600");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.9999999999999877d, 20);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1048575.9999999871d + "'", double2 == 1048575.9999999871d);
    }

    @Test
    public void test7601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7601");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (short) 1, (float) 212);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 212.0f + "'", float2 == 212.0f);
    }

    @Test
    public void test7602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7602");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 1341L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1341 + "'", int1 == 1341);
    }

    @Test
    public void test7603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7603");
        double double1 = org.apache.commons.math3.util.FastMath.abs(3.2555982551476657d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2555982551476657d + "'", double1 == 3.2555982551476657d);
    }

    @Test
    public void test7604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7604");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 47.0f, (-40));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3064286098522049E-67d + "'", double2 == 1.3064286098522049E-67d);
    }

    @Test
    public void test7605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7605");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 18L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test7606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7606");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(4.3404848255064437E30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.3404848255064437E30d + "'", double1 == 4.3404848255064437E30d);
    }

    @Test
    public void test7607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7607");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-0.02857142857142857d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test7608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7608");
        long long2 = org.apache.commons.math3.util.FastMath.min(512L, 12L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 12L + "'", long2 == 12L);
    }

    @Test
    public void test7609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7609");
        int int1 = org.apache.commons.math3.util.FastMath.round(1023.99994f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1024 + "'", int1 == 1024);
    }

    @Test
    public void test7610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7610");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.66443743043271d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test7611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7611");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.009430054193516519d, 40);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0368454236329243E10d + "'", double2 == 1.0368454236329243E10d);
    }

    @Test
    public void test7612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7612");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) (-46));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8028514559173916d) + "'", double1 == (-0.8028514559173916d));
    }

    @Test
    public void test7613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7613");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.1087413143427255E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.444808567849511d + "'", double1 == 4.444808567849511d);
    }

    @Test
    public void test7614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7614");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(18.687973453650347d, 0.9637866463273798d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 18.71280942306577d + "'", double2 == 18.71280942306577d);
    }

    @Test
    public void test7615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7615");
        double double1 = org.apache.commons.math3.util.FastMath.floor(3.3869694069128182d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test7616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7616");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2.3012989023072965d, 268.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0204039326086497E97d + "'", double2 == 1.0204039326086497E97d);
    }

    @Test
    public void test7617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7617");
        int int2 = org.apache.commons.math3.util.FastMath.max((-40), 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test7618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7618");
        double double1 = org.apache.commons.math3.util.FastMath.exp(3.4359738368E11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test7619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7619");
        int int1 = org.apache.commons.math3.util.FastMath.round(52.000004f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test7620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7620");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 0.9999999f, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999998807907104d + "'", double2 == 0.9999998807907104d);
    }

    @Test
    public void test7621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7621");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-0.9985859267674833d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7622");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) (-18));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.2829984568665247E7d) + "'", double1 == (-3.2829984568665247E7d));
    }

    @Test
    public void test7623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7623");
        double double2 = org.apache.commons.math3.util.FastMath.min(4.554368000990087d, 4.8443635619146716E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.8443635619146716E-5d + "'", double2 == 4.8443635619146716E-5d);
    }

    @Test
    public void test7624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7624");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(5.587424908532976E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.587424908532976E-9d + "'", double1 == 5.587424908532976E-9d);
    }

    @Test
    public void test7625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7625");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.5707963267948967d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7626");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 9.536745E-7f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test7627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7627");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.0018903591682419658d, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0018903591682419658d + "'", double2 == 0.0018903591682419658d);
    }

    @Test
    public void test7628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7628");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 57);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test7629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7629");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(2.0693311117004427d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test7630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7630");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.1920928244535418E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.923689926157535d) + "'", double1 == (-6.923689926157535d));
    }

    @Test
    public void test7631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7631");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-0.6318307327098474d), 1.4637968221819215d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6318307327098472d) + "'", double2 == (-0.6318307327098472d));
    }

    @Test
    public void test7632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7632");
        int int2 = org.apache.commons.math3.util.FastMath.max(1341, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1341 + "'", int2 == 1341);
    }

    @Test
    public void test7633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7633");
        double double1 = org.apache.commons.math3.util.FastMath.exp(2.2204460492503136E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000002d + "'", double1 == 1.0000000000000002d);
    }

    @Test
    public void test7634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7634");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.2981479726743438d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9558821619066447d + "'", double1 == 0.9558821619066447d);
    }

    @Test
    public void test7635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7635");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) ' ', 24L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 24L + "'", long2 == 24L);
    }

    @Test
    public void test7636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7636");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(5.421011E-20f, (-9.0071993E15f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.421011E-20f) + "'", float2 == (-5.421011E-20f));
    }

    @Test
    public void test7637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7637");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 127.00001f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7638");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) (-0.0078124995f), (-0.008837747656336603d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.007812499534338713d) + "'", double2 == (-0.007812499534338713d));
    }

    @Test
    public void test7639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7639");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-51.30611878757968d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test7640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7640");
        float float1 = org.apache.commons.math3.util.FastMath.abs(512.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 512.0f + "'", float1 == 512.0f);
    }

    @Test
    public void test7641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7641");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-12.652395426951063d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1998858299008337E-6d + "'", double1 == 3.1998858299008337E-6d);
    }

    @Test
    public void test7642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7642");
        int int1 = org.apache.commons.math3.util.FastMath.round(9.536743E-7f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test7643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7643");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.5295813285302078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.999150782181398d + "'", double1 == 0.999150782181398d);
    }

    @Test
    public void test7644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7644");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-20.40064126793296d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7645");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (short) 0, (-11));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-11) + "'", int2 == (-11));
    }

    @Test
    public void test7646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7646");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-0.07649252654575009d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07664224113864822d) + "'", double1 == (-0.07664224113864822d));
    }

    @Test
    public void test7647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7647");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(35.000004f, (double) 1023.99994f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.000008f + "'", float2 == 35.000008f);
    }

    @Test
    public void test7648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7648");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-15), (long) 3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test7649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7649");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.9975706724882751d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test7650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7650");
        double double2 = org.apache.commons.math3.util.FastMath.pow(46.999532327864166d, 2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2208.956039037949d + "'", double2 == 2208.956039037949d);
    }

    @Test
    public void test7651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7651");
        long long2 = org.apache.commons.math3.util.FastMath.max(0L, (-64L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test7652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7652");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(6.123233995736766E-17d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7653");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.32580079669902784d, 5.916079783099616d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.055014815465203856d + "'", double2 == 0.055014815465203856d);
    }

    @Test
    public void test7654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7654");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-0.3393554931179893d), (-1.3593642103115025d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.3393554931179893d) + "'", double2 == (-0.3393554931179893d));
    }

    @Test
    public void test7655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7655");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.8414675156134572d, 0.1745336082170135d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9703233871886261d + "'", double2 == 0.9703233871886261d);
    }

    @Test
    public void test7656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7656");
        double double1 = org.apache.commons.math3.util.FastMath.log(5.2601359015483735E210d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 485.2030263919617d + "'", double1 == 485.2030263919617d);
    }

    @Test
    public void test7657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7657");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.394408050322395d, 4.742001862925077d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.39440805032239507d + "'", double2 == 0.39440805032239507d);
    }

    @Test
    public void test7658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7658");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-0.18710109962234836d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7590066259266892d + "'", double1 == 1.7590066259266892d);
    }

    @Test
    public void test7659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7659");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.0994376074027013E12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test7660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7660");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.07813771351531074d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07805841951648224d) + "'", double1 == (-0.07805841951648224d));
    }

    @Test
    public void test7661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7661");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 19.999998f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0445223468972933d + "'", double1 == 3.0445223468972933d);
    }

    @Test
    public void test7662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7662");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.8813735870195428d), (-56.72239180482502d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test7663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7663");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-0.8366804040972827d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5619901184534384d + "'", double1 == 2.5619901184534384d);
    }

    @Test
    public void test7664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7664");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) (-2.68435424E8f), 512);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.5991306065847033E162d) + "'", double2 == (-3.5991306065847033E162d));
    }

    @Test
    public void test7665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7665");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.8344648652598696d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0418531593128664d + "'", double1 == 1.0418531593128664d);
    }

    @Test
    public void test7666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7666");
        double double1 = org.apache.commons.math3.util.FastMath.exp(3.083333333333333d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 21.831051418620834d + "'", double1 == 21.831051418620834d);
    }

    @Test
    public void test7667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7667");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.7364591792920476d, 0.08276253029821971d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0015539569705663586d) + "'", double2 == (-0.0015539569705663586d));
    }

    @Test
    public void test7668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7668");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 188090948814L, (double) 0.013916016f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.88090925E11f + "'", float2 == 1.88090925E11f);
    }

    @Test
    public void test7669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7669");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(9.313225746154783E-10d, 1.0571243112754385d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0571243112754385d + "'", double2 == 1.0571243112754385d);
    }

    @Test
    public void test7670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7670");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(1.1920933E-7f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.1920935E-7f + "'", float1 == 1.1920935E-7f);
    }

    @Test
    public void test7671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7671");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.012097786271219478d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000731791088449d + "'", double1 == 1.0000731791088449d);
    }

    @Test
    public void test7672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7672");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.9992781084116672d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017440693134884437d + "'", double1 == 0.017440693134884437d);
    }

    @Test
    public void test7673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7673");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) (-23));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 23.0d + "'", double1 == 23.0d);
    }

    @Test
    public void test7674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7674");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.4382762607469872d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.213426704768689d + "'", double1 == 3.213426704768689d);
    }

    @Test
    public void test7675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7675");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.002908882086657216d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.076956996445143E-5d + "'", double1 == 5.076956996445143E-5d);
    }

    @Test
    public void test7676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7676");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(343.77322263437395d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.949095979341691E148d + "'", double1 == 9.949095979341691E148d);
    }

    @Test
    public void test7677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7677");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.047500075088242555d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0011283406949916d + "'", double1 == 1.0011283406949916d);
    }

    @Test
    public void test7678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7678");
        float float2 = org.apache.commons.math3.util.FastMath.min(39.999996f, (float) 32768L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 39.999996f + "'", float2 == 39.999996f);
    }

    @Test
    public void test7679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7679");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.09999999618530295d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test7680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7680");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.5707963267768328d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test7681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7681");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.9073489E-6f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-19) + "'", int1 == (-19));
    }

    @Test
    public void test7682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7682");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.318057839217392d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7683");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 68.0f, 32816.70259419283d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0020721125921182113d + "'", double2 == 0.0020721125921182113d);
    }

    @Test
    public void test7684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7684");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.03391880910465605d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.938893903907228E-18d + "'", double1 == 6.938893903907228E-18d);
    }

    @Test
    public void test7685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7685");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) (-5.421011E-20f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.421010862427522E-20d) + "'", double1 == (-5.421010862427522E-20d));
    }

    @Test
    public void test7686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7686");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 511, 1.1097402702744097d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 510.99997f + "'", float2 == 510.99997f);
    }

    @Test
    public void test7687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7687");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.8528601831630559d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7688");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.5990250723553024d, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 613.4016740918297d + "'", double2 == 613.4016740918297d);
    }

    @Test
    public void test7689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7689");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 12, (-24.191690961245197d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11.999999f + "'", float2 == 11.999999f);
    }

    @Test
    public void test7690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7690");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.192093E-7f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-23) + "'", int1 == (-23));
    }

    @Test
    public void test7691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7691");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-4.9E-324d), 2.2415914299460307E-13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0d) + "'", double2 == (-0.0d));
    }

    @Test
    public void test7692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7692");
        double double2 = org.apache.commons.math3.util.FastMath.log(3.3800863156250025d, (double) 10L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8906172400440757d + "'", double2 == 1.8906172400440757d);
    }

    @Test
    public void test7693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7693");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-8), 8L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8L + "'", long2 == 8L);
    }

    @Test
    public void test7694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7694");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.5200525368625861d, 8.97156724279375d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.97156724279375d + "'", double2 == 8.97156724279375d);
    }

    @Test
    public void test7695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7695");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(2.775557561562892E-17d, (-0.6672894683293485d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.775557561562892E-17d) + "'", double2 == (-2.775557561562892E-17d));
    }

    @Test
    public void test7696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7696");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.09959168752759735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.3066765764327033d) + "'", double1 == (-2.3066765764327033d));
    }

    @Test
    public void test7697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7697");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(100.0f, 87.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test7698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7698");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(5.853465795562755d, 0.7183865300061928d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.8973842528969955d + "'", double2 == 5.8973842528969955d);
    }

    @Test
    public void test7699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7699");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(68.9840077059649d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7700");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 46);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 46L + "'", long1 == 46L);
    }

    @Test
    public void test7701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7701");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(27.0d, 0.6007036339115129d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5485517138310576d + "'", double2 == 1.5485517138310576d);
    }

    @Test
    public void test7702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7702");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) (-41));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test7703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7703");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.335442656797612d, 2.775557561562892E-17d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test7704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7704");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.4245783453278988d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test7705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7705");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.2531288525643591d, 2.3205128404736515E-25d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2531288525643591d + "'", double2 == 1.2531288525643591d);
    }

    @Test
    public void test7706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7706");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(7.737545114640002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1146.4181904711d + "'", double1 == 1146.4181904711d);
    }

    @Test
    public void test7707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7707");
        long long1 = org.apache.commons.math3.util.FastMath.round((-0.1587539925732924d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test7708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7708");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.4949531928646023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7035290988044506d + "'", double1 == 0.7035290988044506d);
    }

    @Test
    public void test7709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7709");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(2.7664212902364116d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.766421290236412d + "'", double1 == 2.766421290236412d);
    }

    @Test
    public void test7710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7710");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(14.703675859011925d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4498639857304076d + "'", double1 == 2.4498639857304076d);
    }

    @Test
    public void test7711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7711");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(8.852647460508905E-221d, 0.6931471805599463d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6931471805599463d + "'", double2 == 0.6931471805599463d);
    }

    @Test
    public void test7712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7712");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-0.9888410855273345d), (-3));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.12360513569091681d) + "'", double2 == (-0.12360513569091681d));
    }

    @Test
    public void test7713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7713");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (-20L), 127.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 127.0f + "'", float2 == 127.0f);
    }

    @Test
    public void test7714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7714");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.1422501345202682d, 59.20678401287114d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1422501345202685d + "'", double2 == 1.1422501345202685d);
    }

    @Test
    public void test7715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7715");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.49361759023450513d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6382319650916397d + "'", double1 == 1.6382319650916397d);
    }

    @Test
    public void test7716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7716");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) (-10.000001f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test7717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7717");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.0689622149987218d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test7718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7718");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(6.5321139649540514E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test7719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7719");
        int int2 = org.apache.commons.math3.util.FastMath.max((-19), 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test7720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7720");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) (-2.68435424E8f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7721");
        long long1 = org.apache.commons.math3.util.FastMath.abs(1341L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1341L + "'", long1 == 1341L);
    }

    @Test
    public void test7722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7722");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) 97);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.691673596021348E41d + "'", double1 == 6.691673596021348E41d);
    }

    @Test
    public void test7723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7723");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-1.9184615E21f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 70 + "'", int1 == 70);
    }

    @Test
    public void test7724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7724");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.0000806116985823d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test7725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7725");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 45);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 45L + "'", long1 == 45L);
    }

    @Test
    public void test7726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7726");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 70);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test7727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7727");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.04142214727422398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04139847289438497d + "'", double1 == 0.04139847289438497d);
    }

    @Test
    public void test7728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7728");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.1920928955078097E-7d, (double) 212.00002f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test7729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7729");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.7601702599438814d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013267473911761897d + "'", double1 == 0.013267473911761897d);
    }

    @Test
    public void test7730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7730");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.0787619161000124d, 10321.041622256667d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test7731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7731");
        double double2 = org.apache.commons.math3.util.FastMath.min((-1.0838295454652982d), (double) 320.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0838295454652982d) + "'", double2 == (-1.0838295454652982d));
    }

    @Test
    public void test7732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7732");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(8.435352933112958E63d, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.637801403507669E66d + "'", double2 == 8.637801403507669E66d);
    }

    @Test
    public void test7733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7733");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-3.6557203087106535E-15d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.6557203087106535E-15d) + "'", double1 == (-3.6557203087106535E-15d));
    }

    @Test
    public void test7734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7734");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.8726936208978298d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test7735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7735");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-0.9495627235668462d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6130898268303115d) + "'", double1 == (-0.6130898268303115d));
    }

    @Test
    public void test7736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7736");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-0.647849120599649d), 0.059306170823242965d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.004518758456023564d + "'", double2 == 0.004518758456023564d);
    }

    @Test
    public void test7737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7737");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-8.042848410283348d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7738");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) (-64));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test7739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7739");
        long long1 = org.apache.commons.math3.util.FastMath.round((-0.5667449734836625d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test7740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7740");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.6639399425388491d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7824374321842735d + "'", double1 == 0.7824374321842735d);
    }

    @Test
    public void test7741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7741");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-0.031087507813438716d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.031077498950584523d) + "'", double1 == (-0.031077498950584523d));
    }

    @Test
    public void test7742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7742");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-0.4653937651677232d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4653937651677232d + "'", double1 == 0.4653937651677232d);
    }

    @Test
    public void test7743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7743");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.8342233605065122d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9133582870410233d + "'", double1 == 0.9133582870410233d);
    }

    @Test
    public void test7744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7744");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 35839.996f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.179966938852083d + "'", double1 == 11.179966938852083d);
    }

    @Test
    public void test7745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7745");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(31.999998092651367d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.948140478646509E13d + "'", double1 == 3.948140478646509E13d);
    }

    @Test
    public void test7746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7746");
        double double1 = org.apache.commons.math3.util.FastMath.sin(2.691262368354216E-19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.691262368354216E-19d + "'", double1 == 2.691262368354216E-19d);
    }

    @Test
    public void test7747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7747");
        int int2 = org.apache.commons.math3.util.FastMath.max(212, 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 212 + "'", int2 == 212);
    }

    @Test
    public void test7748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7748");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test7749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7749");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) 1.5625f, (-0.027415567780803774d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5627404977656218d + "'", double2 == 1.5627404977656218d);
    }

    @Test
    public void test7750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7750");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.6389612763136348d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7751");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.4495239865639748d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test7752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7752");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(343.4678242590538d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test7753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7753");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-0.3068528194400547d), 0.9738830555738022d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.3068528194400547d) + "'", double2 == (-0.3068528194400547d));
    }

    @Test
    public void test7754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7754");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.9999999999999977d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test7755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7755");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(8.435352933112958E63d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.43535293311296E63d + "'", double1 == 8.43535293311296E63d);
    }

    @Test
    public void test7756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7756");
        int int2 = org.apache.commons.math3.util.FastMath.min((-11), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-11) + "'", int2 == (-11));
    }

    @Test
    public void test7757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7757");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.010200777470529934d, (-11));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.980848374282194E-6d + "'", double2 == 4.980848374282194E-6d);
    }

    @Test
    public void test7758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7758");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 32768.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7759");
        int int2 = org.apache.commons.math3.util.FastMath.max(2, 101);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
    }

    @Test
    public void test7760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7760");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 0.0039062505f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.003906270334004584d + "'", double1 == 0.003906270334004584d);
    }

    @Test
    public void test7761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7761");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.7893750108307106d, 8.304165199749413E-25d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.304165199749413E-25d + "'", double2 == 8.304165199749413E-25d);
    }

    @Test
    public void test7762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7762");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-0.785398133595125d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8686709220095816d) + "'", double1 == (-0.8686709220095816d));
    }

    @Test
    public void test7763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7763");
        int int2 = org.apache.commons.math3.util.FastMath.min(7, (-12));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-12) + "'", int2 == (-12));
    }

    @Test
    public void test7764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7764");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.8632392928434405d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7765");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 62L, 1.2529398612261406d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.550590369705713d + "'", double2 == 1.550590369705713d);
    }

    @Test
    public void test7766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7766");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-0.07649252654575009d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4244954132397297d) + "'", double1 == (-0.4244954132397297d));
    }

    @Test
    public void test7767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7767");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) (-4.5035996E15f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7768");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.1289103612676163d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4276450369974809d + "'", double1 == 0.4276450369974809d);
    }

    @Test
    public void test7769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7769");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 17, (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test7770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7770");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.799080308109824d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6741799028452762d + "'", double1 == 0.6741799028452762d);
    }

    @Test
    public void test7771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7771");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.38011261180303196d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36324540875073685d + "'", double1 == 0.36324540875073685d);
    }

    @Test
    public void test7772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7772");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.48865461858873344d, 0.0022435944622940323d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5662049884310623d + "'", double2 == 1.5662049884310623d);
    }

    @Test
    public void test7773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7773");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 10.000001f, 0.0014232401139463186d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.570654002798036d + "'", double2 == 1.570654002798036d);
    }

    @Test
    public void test7774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7774");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 8192.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8192.000000000002d + "'", double1 == 8192.000000000002d);
    }

    @Test
    public void test7775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7775");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (byte) -1, (long) 41);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test7776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7776");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.2533140897578763d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0496616358844957d + "'", double1 == 1.0496616358844957d);
    }

    @Test
    public void test7777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7777");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(5.551115123125783E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.232595164407831E-32d + "'", double1 == 1.232595164407831E-32d);
    }

    @Test
    public void test7778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7778");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 48.499996f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 48.0d + "'", double1 == 48.0d);
    }

    @Test
    public void test7779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7779");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.9637866463273798d, (int) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.3115457010380917E10d + "'", double2 == 3.3115457010380917E10d);
    }

    @Test
    public void test7780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7780");
        double double2 = org.apache.commons.math3.util.FastMath.pow(8.864996893061638E35d, (-0.09711515743188391d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.2280149293855554E-4d + "'", double2 == 3.2280149293855554E-4d);
    }

    @Test
    public void test7781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7781");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 6.1572651E13f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0746454918445981E12d + "'", double1 == 1.0746454918445981E12d);
    }

    @Test
    public void test7782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7782");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(7.765733319381213E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.008812339825143612d + "'", double1 == 0.008812339825143612d);
    }

    @Test
    public void test7783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7783");
        double double2 = org.apache.commons.math3.util.FastMath.min(2560.0d, 1.5712934561457763d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5712934561457763d + "'", double2 == 1.5712934561457763d);
    }

    @Test
    public void test7784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7784");
        double double1 = org.apache.commons.math3.util.FastMath.exp(24.904560119111945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.545050984502576E10d + "'", double1 == 6.545050984502576E10d);
    }

    @Test
    public void test7785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7785");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.020288533664930875d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test7786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7786");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-7.105427357601027E-15d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267949037d + "'", double1 == 1.5707963267949037d);
    }

    @Test
    public void test7787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7787");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.8477481924511037d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2271027480681969d + "'", double1 == 1.2271027480681969d);
    }

    @Test
    public void test7788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7788");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(2.995592469141833E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 34.02648051389328d + "'", double1 == 34.02648051389328d);
    }

    @Test
    public void test7789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7789");
        float float2 = org.apache.commons.math3.util.FastMath.min((-41.0f), 200.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-41.0f) + "'", float2 == (-41.0f));
    }

    @Test
    public void test7790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7790");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.6867864058443843d, 97.00317877887012d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-12.175551816921212d) + "'", double2 == (-12.175551816921212d));
    }

    @Test
    public void test7791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7791");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-6.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-201.71315737027922d) + "'", double1 == (-201.71315737027922d));
    }
}

