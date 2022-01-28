import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest13 {

    public static boolean debug = false;

    @Test
    public void test6501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6501");
        long long2 = org.apache.commons.math.util.FastMath.min((long) '4', 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test6502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6502");
        double double1 = org.apache.commons.math.util.FastMath.asin(36.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6503");
        double double1 = org.apache.commons.math.util.FastMath.asinh(6.894806889943192E27d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 64.79371319499236d + "'", double1 == 64.79371319499236d);
    }

    @Test
    public void test6504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6504");
        double double2 = org.apache.commons.math.util.FastMath.min(21.323945308420992d, 0.38879069538562044d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.38879069538562044d + "'", double2 == 0.38879069538562044d);
    }

    @Test
    public void test6505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6505");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 52L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test6506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6506");
        double double1 = org.apache.commons.math.util.FastMath.log(1.6370255026277432d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4928808771483711d + "'", double1 == 0.4928808771483711d);
    }

    @Test
    public void test6507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6507");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.5768196182814035d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6576833375608168d) + "'", double1 == (-0.6576833375608168d));
    }

    @Test
    public void test6508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6508");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.16781924358920813d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16781924358920813d + "'", double1 == 0.16781924358920813d);
    }

    @Test
    public void test6509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6509");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) 32L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.505149978319906d + "'", double1 == 1.505149978319906d);
    }

    @Test
    public void test6510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6510");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 53L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 53.0f + "'", float1 == 53.0f);
    }

    @Test
    public void test6511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6511");
        double double1 = org.apache.commons.math.util.FastMath.asin((-1.4193244267567873d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6512");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.7392602334708254d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test6513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6513");
        double double2 = org.apache.commons.math.util.FastMath.max(23.727451426698007d, 1.5472906394139022E7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5472906394139022E7d + "'", double2 == 1.5472906394139022E7d);
    }

    @Test
    public void test6514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6514");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 52, (long) 57);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test6515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6515");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.3887906953856204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3790696406047222d + "'", double1 == 0.3790696406047222d);
    }

    @Test
    public void test6516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6516");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.27922113659304d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6517");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.6535657774206833d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.922383413566985d + "'", double1 == 0.922383413566985d);
    }

    @Test
    public void test6518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6518");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.11952008579643952d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9225591037741008d) + "'", double1 == (-0.9225591037741008d));
    }

    @Test
    public void test6519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6519");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test6520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6520");
        long long1 = org.apache.commons.math.util.FastMath.abs(6L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 6L + "'", long1 == 6L);
    }

    @Test
    public void test6521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6521");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-77.26503394947865d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test6522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6522");
        double double1 = org.apache.commons.math.util.FastMath.expm1(5.2771399790034055d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 194.80905574539727d + "'", double1 == 194.80905574539727d);
    }

    @Test
    public void test6523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6523");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.2520209545994675d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6524");
        double double1 = org.apache.commons.math.util.FastMath.log10((-16.857679757182947d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6525");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.0111706373997405E-10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0111706373997405E-10d + "'", double1 == 1.0111706373997405E-10d);
    }

    @Test
    public void test6526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6526");
        long long1 = org.apache.commons.math.util.FastMath.round(40.75398241276307d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 41L + "'", long1 == 41L);
    }

    @Test
    public void test6527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6527");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.9006957856321915d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9939715368870689d + "'", double1 == 0.9939715368870689d);
    }

    @Test
    public void test6528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6528");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.1521778176391675d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test6529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6529");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.8189894035442023E-12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267930776d + "'", double1 == 1.5707963267930776d);
    }

    @Test
    public void test6530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6530");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.24650636127268888d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.321722614819077d + "'", double1 == 1.321722614819077d);
    }

    @Test
    public void test6531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6531");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9623778619367345d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5715704420535243d + "'", double1 == 0.5715704420535243d);
    }

    @Test
    public void test6532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6532");
        int int2 = org.apache.commons.math.util.FastMath.min((int) 'a', 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
    }

    @Test
    public void test6533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6533");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9879623542931133d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6857562731904099d + "'", double1 == 1.6857562731904099d);
    }

    @Test
    public void test6534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6534");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 52L, (float) 13L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 13.0f + "'", float2 == 13.0f);
    }

    @Test
    public void test6535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6535");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.570796207585607d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.570796207585607d + "'", double1 == 1.570796207585607d);
    }

    @Test
    public void test6536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6536");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.14054753050866103d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1311176344695068d) + "'", double1 == (-0.1311176344695068d));
    }

    @Test
    public void test6537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6537");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-1.7405700602011438d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2029027090629802d) + "'", double1 == (-1.2029027090629802d));
    }

    @Test
    public void test6538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6538");
        double double2 = org.apache.commons.math.util.FastMath.min(0.43305085726475895d, 0.2763194817664867d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2763194817664867d + "'", double2 == 0.2763194817664867d);
    }

    @Test
    public void test6539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6539");
        double double1 = org.apache.commons.math.util.FastMath.tan((-8.711666086263719d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8649540891548834d + "'", double1 == 0.8649540891548834d);
    }

    @Test
    public void test6540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6540");
        double double1 = org.apache.commons.math.util.FastMath.log(1.3340213311661798E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-18.13248280620733d) + "'", double1 == (-18.13248280620733d));
    }

    @Test
    public void test6541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6541");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.41749914352885914d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.914105834260179d + "'", double1 == 0.914105834260179d);
    }

    @Test
    public void test6542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6542");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.8698822455734988d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9326747801744716d + "'", double1 == 0.9326747801744716d);
    }

    @Test
    public void test6543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6543");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.4657022738769552d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test6544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6544");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.023977254200743377d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5468167745441612d + "'", double1 == 1.5468167745441612d);
    }

    @Test
    public void test6545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6545");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.971803247564555d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.012421653948656464d) + "'", double1 == (-0.012421653948656464d));
    }

    @Test
    public void test6546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6546");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.7383503679489256d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6547");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9971678302955945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2792211365930317d + "'", double1 == 3.2792211365930317d);
    }

    @Test
    public void test6548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6548");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.01842081837943866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.215039316330907E-4d + "'", double1 == 3.215039316330907E-4d);
    }

    @Test
    public void test6549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6549");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.24363416035769922d, 1.1740434439996548d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1905478190811001d + "'", double2 == 0.1905478190811001d);
    }

    @Test
    public void test6550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6550");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9187506059390844d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6068137034855982d + "'", double1 == 0.6068137034855982d);
    }

    @Test
    public void test6551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6551");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 0, 192L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test6552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6552");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.9251561992529562d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8274488263120958d) + "'", double1 == (-0.8274488263120958d));
    }

    @Test
    public void test6553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6553");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(8814971.780401375d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2969.0018154931086d + "'", double1 == 2969.0018154931086d);
    }

    @Test
    public void test6554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6554");
        double double1 = org.apache.commons.math.util.FastMath.floor(3.0277272261966697E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6555");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.2361973931514942d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.674453576007286d + "'", double1 == 0.674453576007286d);
    }

    @Test
    public void test6556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6556");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.418095298905577d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1786649330932593d + "'", double1 == 1.1786649330932593d);
    }

    @Test
    public void test6557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6557");
        int int2 = org.apache.commons.math.util.FastMath.max(8, 11013);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11013 + "'", int2 == 11013);
    }

    @Test
    public void test6558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6558");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.0507101442133353d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6559");
        double double1 = org.apache.commons.math.util.FastMath.abs(31.53108212225983d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.53108212225983d + "'", double1 == 31.53108212225983d);
    }

    @Test
    public void test6560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6560");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.5334799003570143d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 26.78541008402805d + "'", double1 == 26.78541008402805d);
    }

    @Test
    public void test6561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6561");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.9225591037741008d), 0.9968116020407186d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9225591037741008d) + "'", double2 == (-0.9225591037741008d));
    }

    @Test
    public void test6562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6562");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.4689057088038128d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6563");
        double double1 = org.apache.commons.math.util.FastMath.floor(157.80370161257864d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 157.0d + "'", double1 == 157.0d);
    }

    @Test
    public void test6564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6564");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.18242215781448912d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7542457123146664d + "'", double1 == 1.7542457123146664d);
    }

    @Test
    public void test6565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6565");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-6.997841595373406d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.91273454925053d) + "'", double1 == (-1.91273454925053d));
    }

    @Test
    public void test6566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6566");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9999990845927568d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test6567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6567");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(4477855.166669106d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5656220232098958E8d + "'", double1 == 2.5656220232098958E8d);
    }

    @Test
    public void test6568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6568");
        double double1 = org.apache.commons.math.util.FastMath.floor(5.551115123125784E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6569");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.82983489855724d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.69267007067491d + "'", double1 == 0.69267007067491d);
    }

    @Test
    public void test6570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6570");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 3, (long) 1833);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test6571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6571");
        double double1 = org.apache.commons.math.util.FastMath.log(2.197706177816559d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7874141699833247d + "'", double1 == 0.7874141699833247d);
    }

    @Test
    public void test6572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6572");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8633639145424554d, 1.719463918234335d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.46533598914067753d + "'", double2 == 0.46533598914067753d);
    }

    @Test
    public void test6573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6573");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.7615911849474077d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.141681321786792d + "'", double1 == 2.141681321786792d);
    }

    @Test
    public void test6574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6574");
        long long2 = org.apache.commons.math.util.FastMath.min(1477896L, 192L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 192L + "'", long2 == 192L);
    }

    @Test
    public void test6575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6575");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.7346342576927686d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6808092316663683d + "'", double1 == 0.6808092316663683d);
    }

    @Test
    public void test6576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6576");
        double double2 = org.apache.commons.math.util.FastMath.atan2(11211.863579677763d, 11.570393614520828d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.569764349423348d + "'", double2 == 1.569764349423348d);
    }

    @Test
    public void test6577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6577");
        float float1 = org.apache.commons.math.util.FastMath.abs(13.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 13.0f + "'", float1 == 13.0f);
    }

    @Test
    public void test6578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6578");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.354085646307371d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.541983156860089d + "'", double1 == 4.541983156860089d);
    }

    @Test
    public void test6579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6579");
        double double2 = org.apache.commons.math.util.FastMath.min((-3.0461741978670857E-4d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.0461741978670857E-4d) + "'", double2 == (-3.0461741978670857E-4d));
    }

    @Test
    public void test6580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6580");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2L, 1833.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1833.0f + "'", float2 == 1833.0f);
    }

    @Test
    public void test6581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6581");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.0171083915764383d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0085179183219495d + "'", double1 == 1.0085179183219495d);
    }

    @Test
    public void test6582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6582");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.7469389189041751d), 1.594985873324243E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707749731629903d) + "'", double2 == (-1.5707749731629903d));
    }

    @Test
    public void test6583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6583");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.658594985530628d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.618416566729088d + "'", double1 == 0.618416566729088d);
    }

    @Test
    public void test6584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6584");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.251366653795176d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-14.4022483727897d) + "'", double1 == (-14.4022483727897d));
    }

    @Test
    public void test6585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6585");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9591348389208239d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4257304694901944d + "'", double1 == 1.4257304694901944d);
    }

    @Test
    public void test6586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6586");
        double double1 = org.apache.commons.math.util.FastMath.ceil(7.000000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.0d + "'", double1 == 8.0d);
    }

    @Test
    public void test6587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6587");
        double double1 = org.apache.commons.math.util.FastMath.asinh(70187.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.852065568290518d + "'", double1 == 11.852065568290518d);
    }

    @Test
    public void test6588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6588");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.0000000000000004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430806348152444d + "'", double1 == 1.5430806348152444d);
    }

    @Test
    public void test6589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6589");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-5.298521458713987d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6590");
        double double1 = org.apache.commons.math.util.FastMath.abs((-35.350506208557206d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.350506208557206d + "'", double1 == 35.350506208557206d);
    }

    @Test
    public void test6591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6591");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.5427661770824743d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test6592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6592");
        double double1 = org.apache.commons.math.util.FastMath.asinh(9.306831672164943d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9267697487785d + "'", double1 == 2.9267697487785d);
    }

    @Test
    public void test6593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6593");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9992015815530141d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5421428242390165d + "'", double1 == 1.5421428242390165d);
    }

    @Test
    public void test6594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6594");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(4.7950337271198835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.795033727119884d + "'", double1 == 4.795033727119884d);
    }

    @Test
    public void test6595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6595");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.0343321433287331d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5843452381455916d + "'", double1 == 1.5843452381455916d);
    }

    @Test
    public void test6596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6596");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-2.4376760684376033d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test6597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6597");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.3394050632363703d, 0.8746486203042797d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2912292337088407d + "'", double2 == 1.2912292337088407d);
    }

    @Test
    public void test6598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6598");
        long long1 = org.apache.commons.math.util.FastMath.round(2.6881171418161737E43d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test6599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6599");
        int int2 = org.apache.commons.math.util.FastMath.max(6, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test6600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6600");
        double double1 = org.apache.commons.math.util.FastMath.signum(1358736.2971047058d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6601");
        double double1 = org.apache.commons.math.util.FastMath.exp((-1.5574077246549018d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2106815084135339d + "'", double1 == 0.2106815084135339d);
    }

    @Test
    public void test6602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6602");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.0691402988655025d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6603");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9173669803900304d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.08624769006542977d) + "'", double1 == (-0.08624769006542977d));
    }

    @Test
    public void test6604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6604");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.19611987703015232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6605");
        double double1 = org.apache.commons.math.util.FastMath.sinh(4.722217422458344d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 56.204178803067194d + "'", double1 == 56.204178803067194d);
    }

    @Test
    public void test6606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6606");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.7651141195590695d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6607");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9978076496695681d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9.531708753428666E-4d) + "'", double1 == (-9.531708753428666E-4d));
    }

    @Test
    public void test6608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6608");
        double double1 = org.apache.commons.math.util.FastMath.sinh(31.531082122259832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4702731529820375E13d + "'", double1 == 2.4702731529820375E13d);
    }

    @Test
    public void test6609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6609");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.8745129512124437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.351950794486537d + "'", double1 == 1.351950794486537d);
    }

    @Test
    public void test6610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6610");
        double double1 = org.apache.commons.math.util.FastMath.ulp(5.66553889764798E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.860761315262648E-32d + "'", double1 == 9.860761315262648E-32d);
    }

    @Test
    public void test6611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6611");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.03619610978133069d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03619610978133069d + "'", double1 == 0.03619610978133069d);
    }

    @Test
    public void test6612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6612");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.7323253214474795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9337237721315811d + "'", double1 == 0.9337237721315811d);
    }

    @Test
    public void test6613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6613");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-1.3485292390836008d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6614");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test6615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6615");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) -1, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test6616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6616");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 41L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 41.0f + "'", float1 == 41.0f);
    }

    @Test
    public void test6617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6617");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.6176678248388561d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9050225767665427d + "'", double1 == 0.9050225767665427d);
    }

    @Test
    public void test6618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6618");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 10, 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test6619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6619");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.525449840305934d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6620");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.4689057088038129d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4519103790856401d + "'", double1 == 0.4519103790856401d);
    }

    @Test
    public void test6621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6621");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.017066003704239316d), 4.270561880171768E27d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.017066003704239316d) + "'", double2 == (-0.017066003704239316d));
    }

    @Test
    public void test6622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6622");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6623");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(3.948148009134E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.262122178163566E15d + "'", double1 == 2.262122178163566E15d);
    }

    @Test
    public void test6624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6624");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.18609382644482833d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18502158493618096d + "'", double1 == 0.18502158493618096d);
    }

    @Test
    public void test6625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6625");
        int int2 = org.apache.commons.math.util.FastMath.min(57, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6626");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.9004962809790011d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1209094033015703d) + "'", double1 == (-1.1209094033015703d));
    }

    @Test
    public void test6627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6627");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.017214992139553676d), 1.0000000002328306d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.017214992139553673d) + "'", double2 == (-0.017214992139553673d));
    }

    @Test
    public void test6628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6628");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.24398053114331036d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.27631948176648663d + "'", double1 == 0.27631948176648663d);
    }

    @Test
    public void test6629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6629");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.6156264703860141d), 0.012631453344135275d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5502811575709778d) + "'", double2 == (-1.5502811575709778d));
    }

    @Test
    public void test6630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6630");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.09807249034549381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09775986513059616d + "'", double1 == 0.09775986513059616d);
    }

    @Test
    public void test6631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6631");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.01037448200916367d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.010374109823779584d) + "'", double1 == (-0.010374109823779584d));
    }

    @Test
    public void test6632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6632");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9999990845927568d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6633");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.351950794486537d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6634");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.0134774147872523d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6635");
        float float2 = org.apache.commons.math.util.FastMath.max(11013.0f, (float) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11013.0f + "'", float2 == 11013.0f);
    }

    @Test
    public void test6636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6636");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5860134523134308E15d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6637");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.381919166334245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.825659180793972d + "'", double1 == 10.825659180793972d);
    }

    @Test
    public void test6638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6638");
        double double1 = org.apache.commons.math.util.FastMath.abs(5506.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5506.0d + "'", double1 == 5506.0d);
    }

    @Test
    public void test6639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6639");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 0L, (float) 36L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test6640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6640");
        double double1 = org.apache.commons.math.util.FastMath.log1p(744.7742482342916d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.614422938098286d + "'", double1 == 6.614422938098286d);
    }

    @Test
    public void test6641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6641");
        float float2 = org.apache.commons.math.util.FastMath.max(2.14748365E9f, (float) 2147483647L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test6642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6642");
        long long1 = org.apache.commons.math.util.FastMath.abs(11013L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 11013L + "'", long1 == 11013L);
    }

    @Test
    public void test6643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6643");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.3314525951486865d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.392990110224075d + "'", double1 == 1.392990110224075d);
    }

    @Test
    public void test6644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6644");
        long long2 = org.apache.commons.math.util.FastMath.min((long) ' ', (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test6645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6645");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.4519103790856401d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1038611614255576d + "'", double1 == 1.1038611614255576d);
    }

    @Test
    public void test6646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6646");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.6288880976732939d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.48789763338271686d + "'", double1 == 0.48789763338271686d);
    }

    @Test
    public void test6647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6647");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.5707857021655667d, 1.7563972637416305d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.570785702165567d + "'", double2 == 1.570785702165567d);
    }

    @Test
    public void test6648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6648");
        double double1 = org.apache.commons.math.util.FastMath.log(3.81209910344353d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3381799832094055d + "'", double1 == 1.3381799832094055d);
    }

    @Test
    public void test6649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6649");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.2509749142499485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5009739656408789d + "'", double1 == 0.5009739656408789d);
    }

    @Test
    public void test6650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6650");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.25000000000000006d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2553419212210363d + "'", double1 == 0.2553419212210363d);
    }

    @Test
    public void test6651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6651");
        double double2 = org.apache.commons.math.util.FastMath.min(1.1460783373166685d, 10.1796701242299d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1460783373166685d + "'", double2 == 1.1460783373166685d);
    }

    @Test
    public void test6652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6652");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(9.223372036854776E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.2846029059076024E20d + "'", double1 == 5.2846029059076024E20d);
    }

    @Test
    public void test6653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6653");
        double double1 = org.apache.commons.math.util.FastMath.floor((-1.2015841995251388E-10d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test6654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6654");
        double double1 = org.apache.commons.math.util.FastMath.floor((-1.2246467991473532E-16d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test6655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6655");
        double double1 = org.apache.commons.math.util.FastMath.log((double) (-53.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6656");
        double double1 = org.apache.commons.math.util.FastMath.acos(5.2771399790034055d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6657");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 1833L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1833.0f + "'", float1 == 1833.0f);
    }

    @Test
    public void test6658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6658");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.0017885376783303671d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1684043449710089E-19d + "'", double1 == 2.1684043449710089E-19d);
    }

    @Test
    public void test6659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6659");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.013310924178631d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.42821320218412157d) + "'", double1 == (-0.42821320218412157d));
    }

    @Test
    public void test6660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6660");
        double double1 = org.apache.commons.math.util.FastMath.atanh(50.11367450037566d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6661");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9999983787087824d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6662");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.525449840305934d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5016022115354974d + "'", double1 == 0.5016022115354974d);
    }

    @Test
    public void test6663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6663");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.01568485717214877d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8986761182296239d + "'", double1 == 0.8986761182296239d);
    }

    @Test
    public void test6664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6664");
        long long2 = org.apache.commons.math.util.FastMath.min(14L, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test6665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6665");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.5696638693976388d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 89.93511497065876d + "'", double1 == 89.93511497065876d);
    }

    @Test
    public void test6666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6666");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 3);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test6667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6667");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.5430365305682094d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7212254887267799d + "'", double1 == 0.7212254887267799d);
    }

    @Test
    public void test6668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6668");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.005223148526417374d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.005223148526417373d) + "'", double1 == (-0.005223148526417373d));
    }

    @Test
    public void test6669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6669");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.25482123991217503d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2520724250293047d + "'", double1 == 0.2520724250293047d);
    }

    @Test
    public void test6670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6670");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 36.013886210738235d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test6671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6671");
        double double1 = org.apache.commons.math.util.FastMath.atan((-1.7507239941348802d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0518283709243457d) + "'", double1 == (-1.0518283709243457d));
    }

    @Test
    public void test6672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6672");
        long long2 = org.apache.commons.math.util.FastMath.min((-3L), (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3L) + "'", long2 == (-3L));
    }

    @Test
    public void test6673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6673");
        float float2 = org.apache.commons.math.util.FastMath.max(41.0f, (float) 3);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 41.0f + "'", float2 == 41.0f);
    }

    @Test
    public void test6674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6674");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.803712352137012d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5043045727249518d + "'", double1 == 2.5043045727249518d);
    }

    @Test
    public void test6675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6675");
        double double1 = org.apache.commons.math.util.FastMath.cos(6.79843248229905E248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9030823562223531d + "'", double1 == 0.9030823562223531d);
    }

    @Test
    public void test6676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6676");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.5311751345663922d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6677");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 3, (long) 53);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test6678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6678");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.8426540432368208d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07435069103532975d) + "'", double1 == (-0.07435069103532975d));
    }

    @Test
    public void test6679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6679");
        long long1 = org.apache.commons.math.util.FastMath.round(1.5705870643612196d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test6680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6680");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9428090415820635d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6641348853709764d + "'", double1 == 0.6641348853709764d);
    }

    @Test
    public void test6681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6681");
        float float1 = org.apache.commons.math.util.FastMath.abs(5.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.0f + "'", float1 == 5.0f);
    }

    @Test
    public void test6682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6682");
        long long2 = org.apache.commons.math.util.FastMath.max(35L, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test6683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6683");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.22269503511219027d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.20105746756615084d + "'", double1 == 0.20105746756615084d);
    }

    @Test
    public void test6684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6684");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.761511811895975d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6508280503072453d + "'", double1 == 0.6508280503072453d);
    }

    @Test
    public void test6685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6685");
        double double1 = org.apache.commons.math.util.FastMath.rint(3.6772614978489746d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test6686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6686");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(43.12841819466121d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7527328986738668d + "'", double1 == 0.7527328986738668d);
    }

    @Test
    public void test6687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6687");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 52L, (float) (-3));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.0f) + "'", float2 == (-3.0f));
    }

    @Test
    public void test6688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6688");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.262451664828748d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1012147593847557d + "'", double1 == 0.1012147593847557d);
    }

    @Test
    public void test6689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6689");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.5146349215357182d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5146349215357182d + "'", double1 == 1.5146349215357182d);
    }

    @Test
    public void test6690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6690");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.469446951953614E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-17.45973974851091d) + "'", double1 == (-17.45973974851091d));
    }

    @Test
    public void test6691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6691");
        double double1 = org.apache.commons.math.util.FastMath.atanh(3.8097187196293865d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6692");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.6427154841742911d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2137501268901603d + "'", double1 == 1.2137501268901603d);
    }

    @Test
    public void test6693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6693");
        double double1 = org.apache.commons.math.util.FastMath.exp(4.7624429094466747E117d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test6694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6694");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6695");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.008838207883813802d), 1.175201187282749d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.007520449568556847d) + "'", double2 == (-0.007520449568556847d));
    }

    @Test
    public void test6696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6696");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.7023967071298753d, 1.3574158419544757d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4775110479056863d + "'", double2 == 0.4775110479056863d);
    }

    @Test
    public void test6697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6697");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.594985873324243E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5949731535598146E-5d + "'", double1 == 1.5949731535598146E-5d);
    }

    @Test
    public void test6698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6698");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.6341811450608946d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5925180786247999d + "'", double1 == 0.5925180786247999d);
    }

    @Test
    public void test6699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6699");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.8380289519085355d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.07252418587547d + "'", double1 == 1.07252418587547d);
    }

    @Test
    public void test6700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6700");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.8698822455734988d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6701");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.5443980746053536d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9983325887783596d + "'", double1 == 0.9983325887783596d);
    }

    @Test
    public void test6702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6702");
        double double1 = org.apache.commons.math.util.FastMath.signum(49.46170004073965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6703");
        long long1 = org.apache.commons.math.util.FastMath.round(0.0037786218504155065d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test6704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6704");
        long long2 = org.apache.commons.math.util.FastMath.max(175L, 72L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 175L + "'", long2 == 175L);
    }

    @Test
    public void test6705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6705");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 2147483647, 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test6706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6706");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.005223148526417374d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.005223124777419736d) + "'", double1 == (-0.005223124777419736d));
    }

    @Test
    public void test6707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6707");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9155040003582885E22d + "'", double1 == 1.9155040003582885E22d);
    }

    @Test
    public void test6708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6708");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.04742780763900985d, 0.013388202148675738d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9600071394235216d + "'", double2 == 0.9600071394235216d);
    }

    @Test
    public void test6709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6709");
        double double1 = org.apache.commons.math.util.FastMath.acos(3.9469968385824012d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6710");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.5222467817471549d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test6711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6711");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.5796345346787104d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6712");
        int int2 = org.apache.commons.math.util.FastMath.min(1833, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6713");
        double double1 = org.apache.commons.math.util.FastMath.floor(4.180078690030054d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test6714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6714");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.18608783129956102d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test6715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6715");
        double double2 = org.apache.commons.math.util.FastMath.max(1.4577979139729036d, 1.818989403545857E-12d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4577979139729036d + "'", double2 == 1.4577979139729036d);
    }

    @Test
    public void test6716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6716");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(5506.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 315470.5619990313d + "'", double1 == 315470.5619990313d);
    }

    @Test
    public void test6717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6717");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.7282657137693634d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7943697297200942d) + "'", double1 == (-0.7943697297200942d));
    }

    @Test
    public void test6718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6718");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.21095412737801214d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2094200204543287d + "'", double1 == 0.2094200204543287d);
    }

    @Test
    public void test6719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6719");
        long long1 = org.apache.commons.math.util.FastMath.round(1.1819139347123162d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test6720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6720");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9700496918579988d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test6721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6721");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1477896.0000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1477897.0d + "'", double1 == 1477897.0d);
    }

    @Test
    public void test6722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6722");
        double double2 = org.apache.commons.math.util.FastMath.min(3.6109179126442243d, 0.6931471805599462d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6931471805599462d + "'", double2 == 0.6931471805599462d);
    }

    @Test
    public void test6723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6723");
        float float2 = org.apache.commons.math.util.FastMath.max(5.0f, (float) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test6724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6724");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.5802135739451127d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8363455872047474d + "'", double1 == 0.8363455872047474d);
    }

    @Test
    public void test6725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6725");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.1161530356493916d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1161530356493918d + "'", double1 == 1.1161530356493918d);
    }

    @Test
    public void test6726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6726");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.9982229502979694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9982229502979694d + "'", double1 == 2.9982229502979694d);
    }

    @Test
    public void test6727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6727");
        double double1 = org.apache.commons.math.util.FastMath.sinh(35.00000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.930067261567322E14d + "'", double1 == 7.930067261567322E14d);
    }

    @Test
    public void test6728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6728");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 175L, (-53.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-53.0f) + "'", float2 == (-53.0f));
    }

    @Test
    public void test6729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6729");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(76.25240960756025d, (-1.5707749731629903d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 76.25240960756024d + "'", double2 == 76.25240960756024d);
    }

    @Test
    public void test6730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6730");
        int int2 = org.apache.commons.math.util.FastMath.min(5, 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test6731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6731");
        int int2 = org.apache.commons.math.util.FastMath.max((int) 'a', 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test6732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6732");
        long long2 = org.apache.commons.math.util.FastMath.max(8L, 5L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8L + "'", long2 == 8L);
    }

    @Test
    public void test6733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6733");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(41.67132555791601d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7273018346560974d + "'", double1 == 0.7273018346560974d);
    }

    @Test
    public void test6734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6734");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.552489187522351d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6735");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.1909687900195496d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07590038071041182d + "'", double1 == 0.07590038071041182d);
    }

    @Test
    public void test6736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6736");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.4466128799118947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test6737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6737");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 72.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6738");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 0.05723320573453925d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test6739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6739");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.4657022738769552d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6740");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.0000023669425406d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1752048460302915d + "'", double1 == 1.1752048460302915d);
    }

    @Test
    public void test6741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6741");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.026936482149479832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027302548641386953d + "'", double1 == 0.027302548641386953d);
    }

    @Test
    public void test6742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6742");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.418095298905577d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.749495033923487d) + "'", double1 == (-0.749495033923487d));
    }

    @Test
    public void test6743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6743");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.7651141195590695d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8419794003192206d + "'", double1 == 0.8419794003192206d);
    }

    @Test
    public void test6744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6744");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 97, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test6745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6745");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.3822932005034183d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test6746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6746");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(19.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 19.000000000000004d + "'", double1 == 19.000000000000004d);
    }

    @Test
    public void test6747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6747");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.768287758044532d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.570011710046592d + "'", double1 == 0.570011710046592d);
    }

    @Test
    public void test6748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6748");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9999467423734001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test6749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6749");
        double double1 = org.apache.commons.math.util.FastMath.sin(34.982780458176066d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.412558793562721d) + "'", double1 == (-0.412558793562721d));
    }

    @Test
    public void test6750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6750");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.7020228836336021d, 0.8631246376794037d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6828286623870384d + "'", double2 == 0.6828286623870384d);
    }

    @Test
    public void test6751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6751");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.2245999714347802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.106616451818235d + "'", double1 == 1.106616451818235d);
    }

    @Test
    public void test6752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6752");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.49137702783716286d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6753");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-1.62129253189115E-6d), (double) 'a');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.6714355998877835E-8d) + "'", double2 == (-1.6714355998877835E-8d));
    }

    @Test
    public void test6754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6754");
        double double1 = org.apache.commons.math.util.FastMath.exp((-3.0972636890463687d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.045172639824097534d + "'", double1 == 0.045172639824097534d);
    }

    @Test
    public void test6755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6755");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 6L, (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.0f + "'", float2 == 6.0f);
    }

    @Test
    public void test6756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6756");
        double double1 = org.apache.commons.math.util.FastMath.cosh(5.421010862427522E-20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6757");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.959675187910034d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7648237731756535d) + "'", double1 == (-0.7648237731756535d));
    }

    @Test
    public void test6758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6758");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-2.6017101575745776d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.601710157574577d) + "'", double1 == (-2.601710157574577d));
    }

    @Test
    public void test6759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6759");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.6427154841742911d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6760");
        long long1 = org.apache.commons.math.util.FastMath.round(0.21551488653168732d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test6761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6761");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 175, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test6762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6762");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.4416248142133119d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.44162481421331196d + "'", double1 == 0.44162481421331196d);
    }

    @Test
    public void test6763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6763");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.5539281628193607d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5870750215402474d) + "'", double1 == (-0.5870750215402474d));
    }

    @Test
    public void test6764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6764");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.09369388631265108d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6765");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 0, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test6766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6766");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) (-3));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-10.017874927409903d) + "'", double1 == (-10.017874927409903d));
    }

    @Test
    public void test6767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6767");
        long long2 = org.apache.commons.math.util.FastMath.min(100L, 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test6768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6768");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.2304174954646191E11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9993776497372746d + "'", double1 == 0.9993776497372746d);
    }

    @Test
    public void test6769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6769");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.8366617438896834d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8366617438896833d) + "'", double1 == (-0.8366617438896833d));
    }

    @Test
    public void test6770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6770");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.450905222306537d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.992821666089425d + "'", double1 == 0.992821666089425d);
    }

    @Test
    public void test6771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6771");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9999999998798416d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.55021571890412E-5d + "'", double1 == 1.55021571890412E-5d);
    }

    @Test
    public void test6772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6772");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 0.6788449528131406d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test6773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6773");
        double double1 = org.apache.commons.math.util.FastMath.asinh(8.208435730874369d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8019994588254207d + "'", double1 == 2.8019994588254207d);
    }

    @Test
    public void test6774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6774");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.43107595064559234d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1251114563747935d + "'", double1 == 1.1251114563747935d);
    }

    @Test
    public void test6775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6775");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.2141704030607639d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2125660080184589d) + "'", double1 == (-0.2125660080184589d));
    }

    @Test
    public void test6776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6776");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.8189894035442023E-12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000000000001819d + "'", double1 == 1.000000000001819d);
    }

    @Test
    public void test6777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6777");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) 35.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6778");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8657694832396585d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9780533157623792d + "'", double1 == 0.9780533157623792d);
    }

    @Test
    public void test6779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6779");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.3477154312047415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.160911465704746d + "'", double1 == 1.160911465704746d);
    }

    @Test
    public void test6780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6780");
        long long1 = org.apache.commons.math.util.FastMath.round(1.089350740592997d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test6781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6781");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.4120062944864213d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.42465483059113923d + "'", double1 == 0.42465483059113923d);
    }

    @Test
    public void test6782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6782");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.8582226493088282d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.653783388941138d + "'", double1 == 0.653783388941138d);
    }

    @Test
    public void test6783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6783");
        double double1 = org.apache.commons.math.util.FastMath.atan(471.123645247015d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5686737449455168d + "'", double1 == 1.5686737449455168d);
    }

    @Test
    public void test6784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6784");
        double double1 = org.apache.commons.math.util.FastMath.log(0.8657694832396585d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1441365914888845d) + "'", double1 == (-0.1441365914888845d));
    }

    @Test
    public void test6785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6785");
        long long1 = org.apache.commons.math.util.FastMath.round(0.03202856368786667d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test6786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6786");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.007520449568556847d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.673617379884035E-19d + "'", double1 == 8.673617379884035E-19d);
    }

    @Test
    public void test6787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6787");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.6268604078470186d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06330065562715487d + "'", double1 == 0.06330065562715487d);
    }

    @Test
    public void test6788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6788");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.16954561468575624d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.17036859043650776d) + "'", double1 == (-0.17036859043650776d));
    }

    @Test
    public void test6789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6789");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(3.912812809961445d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9128128099614456d + "'", double1 == 3.9128128099614456d);
    }

    @Test
    public void test6790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6790");
        double double1 = org.apache.commons.math.util.FastMath.sinh(4.253522697326158d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.169296957863885d + "'", double1 == 35.169296957863885d);
    }

    @Test
    public void test6791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6791");
        long long2 = org.apache.commons.math.util.FastMath.min((-2L), 39481480091340L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test6792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6792");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.22963608602745358d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22766430356286282d + "'", double1 == 0.22766430356286282d);
    }

    @Test
    public void test6793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6793");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-4.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test6794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6794");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.05235987755982989d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0537548970256727d + "'", double1 == 1.0537548970256727d);
    }

    @Test
    public void test6795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6795");
        int int2 = org.apache.commons.math.util.FastMath.min(5, 175);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test6796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6796");
        double double1 = org.apache.commons.math.util.FastMath.signum(5557.690612768985d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6797");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.9267697487785d, 1.5672839406622017d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.079154001661297d + "'", double2 == 1.079154001661297d);
    }

    @Test
    public void test6798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6798");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.39585386311332965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.417914467153084d + "'", double1 == 0.417914467153084d);
    }

    @Test
    public void test6799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6799");
        double double1 = org.apache.commons.math.util.FastMath.atan(3.8120133682438273d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.314248385860658d + "'", double1 == 1.314248385860658d);
    }

    @Test
    public void test6800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6800");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.1301927452503902d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6801");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.5607966601082315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2280208110551356d + "'", double1 == 1.2280208110551356d);
    }

    @Test
    public void test6802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6802");
        double double1 = org.apache.commons.math.util.FastMath.log(0.25694496900608355d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.35889334539667d) + "'", double1 == (-1.35889334539667d));
    }

    @Test
    public void test6803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6803");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1L, (float) 1833);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1833.0f + "'", float2 == 1833.0f);
    }

    @Test
    public void test6804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6804");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.4176620615017429d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test6805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6805");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.3998735867204177d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8668856945829329d + "'", double1 == 0.8668856945829329d);
    }

    @Test
    public void test6806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6806");
        long long2 = org.apache.commons.math.util.FastMath.min((-36L), 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-36L) + "'", long2 == (-36L));
    }

    @Test
    public void test6807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6807");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5146349215357182d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6808");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.5093497777060075d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4895588441567153d + "'", double1 == 0.4895588441567153d);
    }

    @Test
    public void test6809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6809");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.2636600956930295d, 1.9600876852440052d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.07331557899139976d + "'", double2 == 0.07331557899139976d);
    }

    @Test
    public void test6810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6810");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.5063656411097588d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test6811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6811");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.386916313601571d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0024885837369166d + "'", double1 == 3.0024885837369166d);
    }

    @Test
    public void test6812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6812");
        double double2 = org.apache.commons.math.util.FastMath.max(5.551115123125783E-17d, (-0.052455059316914306d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.551115123125783E-17d + "'", double2 == 5.551115123125783E-17d);
    }

    @Test
    public void test6813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6813");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.3297526675165189d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3297526675165189d + "'", double1 == 0.3297526675165189d);
    }

    @Test
    public void test6814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6814");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.4038812776339933d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3937462785673309d) + "'", double1 == (-0.3937462785673309d));
    }

    @Test
    public void test6815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6815");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.5387762400014666d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test6816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6816");
        float float2 = org.apache.commons.math.util.FastMath.max(4.0f, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test6817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6817");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.992821666089425d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5463286932803015d + "'", double1 == 0.5463286932803015d);
    }

    @Test
    public void test6818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6818");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.038940111639949d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test6819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6819");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.00426464387701392d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.004264630950046112d + "'", double1 == 0.004264630950046112d);
    }

    @Test
    public void test6820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6820");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.7938702090612697d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8909939444582492d + "'", double1 == 0.8909939444582492d);
    }

    @Test
    public void test6821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6821");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.14497835658369837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test6822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6822");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.8325987327841914d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6823");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8555035296395697d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8555035296395697d + "'", double1 == 0.8555035296395697d);
    }

    @Test
    public void test6824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6824");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.37076030339985566d, (-1.570796326793582d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3707603033998556d + "'", double2 == 0.3707603033998556d);
    }

    @Test
    public void test6825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6825");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 14);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 802.1409131831525d + "'", double1 == 802.1409131831525d);
    }

    @Test
    public void test6826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6826");
        float float1 = org.apache.commons.math.util.FastMath.abs(2.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test6827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6827");
        long long1 = org.apache.commons.math.util.FastMath.round(0.698137190187897d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test6828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6828");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.301596635145215d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05762373185604994d + "'", double1 == 0.05762373185604994d);
    }

    @Test
    public void test6829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6829");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-1.0476958419065934d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7809089347116511d) + "'", double1 == (-0.7809089347116511d));
    }

    @Test
    public void test6830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6830");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.2285327801518604d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4779794652165228d + "'", double1 == 1.4779794652165228d);
    }

    @Test
    public void test6831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6831");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9706842030868199d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9852330704390814d + "'", double1 == 0.9852330704390814d);
    }

    @Test
    public void test6832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6832");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.2712959543974419d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.271295954397442d + "'", double1 == 0.271295954397442d);
    }

    @Test
    public void test6833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6833");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.8915455315224443d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3902227683698474d + "'", double1 == 3.3902227683698474d);
    }

    @Test
    public void test6834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6834");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.6156264703860166d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8506921561246418d) + "'", double1 == (-0.8506921561246418d));
    }

    @Test
    public void test6835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6835");
        long long2 = org.apache.commons.math.util.FastMath.min((long) '4', (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test6836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6836");
        double double2 = org.apache.commons.math.util.FastMath.max(24.89046237609173d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 24.89046237609173d + "'", double2 == 24.89046237609173d);
    }

    @Test
    public void test6837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6837");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6838");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 175, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 175.0f + "'", float2 == 175.0f);
    }

    @Test
    public void test6839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6839");
        double double1 = org.apache.commons.math.util.FastMath.abs(9.557342734345765d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.557342734345765d + "'", double1 == 9.557342734345765d);
    }

    @Test
    public void test6840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6840");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.893622651558004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test6841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6841");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.3320161349050261d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8697412250847227d + "'", double1 == 0.8697412250847227d);
    }

    @Test
    public void test6842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6842");
        double double1 = org.apache.commons.math.util.FastMath.asin(39.53797086347916d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6843");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.016455121993179136d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.016591253173121d + "'", double1 == 1.016591253173121d);
    }

    @Test
    public void test6844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6844");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.6250984987600411d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7906317086735398d + "'", double1 == 0.7906317086735398d);
    }

    @Test
    public void test6845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6845");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.01743935748923473d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017438473634769573d + "'", double1 == 0.017438473634769573d);
    }

    @Test
    public void test6846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6846");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) 100L, 1.4337042405910987d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 99.99999999999999d + "'", double2 == 99.99999999999999d);
    }

    @Test
    public void test6847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6847");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(3.810327220066308d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8103272200663083d + "'", double1 == 3.8103272200663083d);
    }

    @Test
    public void test6848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6848");
        double double2 = org.apache.commons.math.util.FastMath.pow(51.859317725494705d, 31348.240034421615d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test6849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6849");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.7615911849474076d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6900739206440674d + "'", double1 == 0.6900739206440674d);
    }

    @Test
    public void test6850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6850");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.2829673798684508E23d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test6851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6851");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.005223148526417373d), 11.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11.0d + "'", double2 == 11.0d);
    }

    @Test
    public void test6852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6852");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.09077884483567829d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.09065421450214453d) + "'", double1 == (-0.09065421450214453d));
    }

    @Test
    public void test6853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6853");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.0115104269844304d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test6854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6854");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.958177806871242d, 0.8509245826731492d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9581778068712419d + "'", double2 == 0.9581778068712419d);
    }

    @Test
    public void test6855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6855");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9165031085180287d, 0.827528604144108d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9165031085180286d + "'", double2 == 0.9165031085180286d);
    }

    @Test
    public void test6856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6856");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.16101915387533275d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9870644009321351d + "'", double1 == 0.9870644009321351d);
    }

    @Test
    public void test6857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6857");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.5303468257884512d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.42549439323738014d + "'", double1 == 0.42549439323738014d);
    }

    @Test
    public void test6858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6858");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test6859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6859");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-1.2130532941206642d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-69.50283407755578d) + "'", double1 == (-69.50283407755578d));
    }

    @Test
    public void test6860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6860");
        float float2 = org.apache.commons.math.util.FastMath.max((-1.0f), (float) (-53));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test6861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6861");
        double double2 = org.apache.commons.math.util.FastMath.min(15.169629910668275d, 0.7615911849474076d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7615911849474076d + "'", double2 == 0.7615911849474076d);
    }

    @Test
    public void test6862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6862");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.433704240591099d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6863");
        double double1 = org.apache.commons.math.util.FastMath.signum(11013.232874703393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6864");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.4895588441567153d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5115837511195821d + "'", double1 == 0.5115837511195821d);
    }

    @Test
    public void test6865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6865");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.1758128730549149d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2407762130967854d + "'", double1 == 2.2407762130967854d);
    }

    @Test
    public void test6866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6866");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 175L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 175 + "'", int1 == 175);
    }

    @Test
    public void test6867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6867");
        double double1 = org.apache.commons.math.util.FastMath.floor((-1.7077731966650576d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test6868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6868");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.0000000000000018d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000018d + "'", double1 == 1.0000000000000018d);
    }

    @Test
    public void test6869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6869");
        long long1 = org.apache.commons.math.util.FastMath.abs(57L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 57L + "'", long1 == 57L);
    }

    @Test
    public void test6870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6870");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.9349327016694437E-28d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-27.405062690889043d) + "'", double1 == (-27.405062690889043d));
    }

    @Test
    public void test6871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6871");
        long long2 = org.apache.commons.math.util.FastMath.min(10L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test6872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6872");
        double double1 = org.apache.commons.math.util.FastMath.ceil(13.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.0d + "'", double1 == 13.0d);
    }

    @Test
    public void test6873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6873");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.746938918904175d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9659947296286627d) + "'", double1 == (-0.9659947296286627d));
    }

    @Test
    public void test6874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6874");
        double double2 = org.apache.commons.math.util.FastMath.max(0.5585053606381855d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5585053606381855d + "'", double2 == 0.5585053606381855d);
    }

    @Test
    public void test6875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6875");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.8189894035458565E-12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6876");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.130889871246794d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 64.79521671653437d + "'", double1 == 64.79521671653437d);
    }

    @Test
    public void test6877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6877");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '4', 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test6878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6878");
        double double1 = org.apache.commons.math.util.FastMath.log((-7.369139609590174E-249d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6879");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) -1, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6880");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(64.40683631162594d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3690.239892446104d + "'", double1 == 3690.239892446104d);
    }

    @Test
    public void test6881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6881");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.16174140574189208d), (-53.00704927389939d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.16174140574189208d) + "'", double2 == (-0.16174140574189208d));
    }

    @Test
    public void test6882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6882");
        double double1 = org.apache.commons.math.util.FastMath.tan((-1.5656994050637372d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-196.19515330883445d) + "'", double1 == (-196.19515330883445d));
    }

    @Test
    public void test6883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6883");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.221798175510835E-6d, 0.5702159837110962d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2217981755108351E-6d + "'", double2 == 1.2217981755108351E-6d);
    }

    @Test
    public void test6884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6884");
        long long1 = org.apache.commons.math.util.FastMath.round(1.7182818284590458d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test6885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6885");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7857868058746702d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9039672257169318d + "'", double1 == 0.9039672257169318d);
    }

    @Test
    public void test6886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6886");
        int int2 = org.apache.commons.math.util.FastMath.max(72, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test6887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6887");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.012631453344135275d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.012631453344135275d + "'", double1 == 0.012631453344135275d);
    }

    @Test
    public void test6888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6888");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.5157707046119765d, (-7.01740826388532E-10d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5157707046119764d + "'", double2 == 0.5157707046119764d);
    }

    @Test
    public void test6889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6889");
        double double1 = org.apache.commons.math.util.FastMath.cosh(9.557342734345765d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7074.100373812047d + "'", double1 == 7074.100373812047d);
    }

    @Test
    public void test6890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6890");
        double double1 = org.apache.commons.math.util.FastMath.cos((-1.267013246259975d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.29913219822146764d + "'", double1 == 0.29913219822146764d);
    }

    @Test
    public void test6891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6891");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9109527422195073d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4866905802392272d + "'", double1 == 1.4866905802392272d);
    }

    @Test
    public void test6892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6892");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03490658503988659d + "'", double1 == 0.03490658503988659d);
    }

    @Test
    public void test6893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6893");
        float float2 = org.apache.commons.math.util.FastMath.min((float) '#', (float) ' ');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test6894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6894");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.1520712071332257d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02010743578190037d + "'", double1 == 0.02010743578190037d);
    }

    @Test
    public void test6895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6895");
        double double1 = org.apache.commons.math.util.FastMath.cos((-59.10786673843406d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8351484610157381d) + "'", double1 == (-0.8351484610157381d));
    }

    @Test
    public void test6896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6896");
        double double1 = org.apache.commons.math.util.FastMath.tan(223.06523735925123d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.012159553605310604d + "'", double1 == 0.012159553605310604d);
    }

    @Test
    public void test6897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6897");
        double double1 = org.apache.commons.math.util.FastMath.log(33.4907608171425d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.511269604288962d + "'", double1 == 3.511269604288962d);
    }

    @Test
    public void test6898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6898");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.4257304694901944d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2006144919378494d + "'", double1 == 2.2006144919378494d);
    }

    @Test
    public void test6899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6899");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.5422186167449905d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.217956020461827d + "'", double1 == 1.217956020461827d);
    }

    @Test
    public void test6900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6900");
        double double1 = org.apache.commons.math.util.FastMath.signum(4.584967478670572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6901");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.414213562373095d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1462158347805889d + "'", double1 == 1.1462158347805889d);
    }

    @Test
    public void test6902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6902");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-4.9E-324d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7031839360032603E-108d) + "'", double1 == (-1.7031839360032603E-108d));
    }

    @Test
    public void test6903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6903");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-1.6112949659561453d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6904");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.6931471805599462d, 5.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6931471805599463d + "'", double2 == 0.6931471805599463d);
    }

    @Test
    public void test6905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6905");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-1.2015841995251386E-10d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2015841995251386E-10d) + "'", double1 == (-1.2015841995251386E-10d));
    }

    @Test
    public void test6906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6906");
        long long1 = org.apache.commons.math.util.FastMath.round(0.8214948155164382d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test6907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6907");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.9265028436011328d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test6908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6908");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.415289655969459d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.415289655969459d + "'", double1 == 0.415289655969459d);
    }

    @Test
    public void test6909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6909");
        double double2 = org.apache.commons.math.util.FastMath.atan2(11013.232920103323d, 5.691758600279624d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5702795159606187d + "'", double2 == 1.5702795159606187d);
    }

    @Test
    public void test6910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6910");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.3565686652647782d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test6911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6911");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 5L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 74.20994852478785d + "'", double1 == 74.20994852478785d);
    }

    @Test
    public void test6912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6912");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.9711243963529564d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test6913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6913");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.7727923643371758d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 44.27774091645641d + "'", double1 == 44.27774091645641d);
    }

    @Test
    public void test6914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6914");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.3861829820264634d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.38618298202646345d + "'", double1 == 0.38618298202646345d);
    }

    @Test
    public void test6915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6915");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.05663099182355103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.38401783008108853d + "'", double1 == 0.38401783008108853d);
    }

    @Test
    public void test6916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6916");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-53.00704927389939d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test6917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6917");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.5638717219103803d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5942309894287677d + "'", double1 == 0.5942309894287677d);
    }

    @Test
    public void test6918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6918");
        long long2 = org.apache.commons.math.util.FastMath.max((-53L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test6919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6919");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9803593788579685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.372275535203892d + "'", double1 == 1.372275535203892d);
    }

    @Test
    public void test6920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6920");
        long long1 = org.apache.commons.math.util.FastMath.round(41.7075028714666d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 42L + "'", long1 == 42L);
    }

    @Test
    public void test6921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6921");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.71056440958446d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6922");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.1644736633175252E39d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test6923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6923");
        double double2 = org.apache.commons.math.util.FastMath.min(0.7414443288724203d, 0.03673618878368824d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.03673618878368824d + "'", double2 == 0.03673618878368824d);
    }

    @Test
    public void test6924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6924");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.7162579075638863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6925");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.7944146264030464d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8912994033449402d + "'", double1 == 0.8912994033449402d);
    }

    @Test
    public void test6926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6926");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-36L), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test6927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6927");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.5311751345663923d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4882755621897501d + "'", double1 == 0.4882755621897501d);
    }

    @Test
    public void test6928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6928");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.6054586098430138d), 0.9999999958776927d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test6929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6929");
        double double1 = org.apache.commons.math.util.FastMath.acosh(5.66553889764798E-16d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6930");
        double double1 = org.apache.commons.math.util.FastMath.atan(26.78541008402805d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5334799003570143d + "'", double1 == 1.5334799003570143d);
    }

    @Test
    public void test6931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6931");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-2.872201959037427d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7772392716589014d) + "'", double1 == (-1.7772392716589014d));
    }

    @Test
    public void test6932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6932");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.01037448202118146d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.010374668130899874d) + "'", double1 == (-0.010374668130899874d));
    }

    @Test
    public void test6933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6933");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.09369388631265108d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.09396950480472266d) + "'", double1 == (-0.09396950480472266d));
    }

    @Test
    public void test6934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6934");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.7679249258932203d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7193536551458547d + "'", double1 == 0.7193536551458547d);
    }

    @Test
    public void test6935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6935");
        long long2 = org.apache.commons.math.util.FastMath.max(1833L, 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1833L + "'", long2 == 1833L);
    }

    @Test
    public void test6936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6936");
        double double1 = org.apache.commons.math.util.FastMath.log10((-3.670180049565156E-5d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6937");
        double double1 = org.apache.commons.math.util.FastMath.log(0.24425607142663947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.409538130940798d) + "'", double1 == (-1.409538130940798d));
    }

    @Test
    public void test6938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6938");
        double double2 = org.apache.commons.math.util.FastMath.max((-1.2040758220049488d), 0.8745129512124437d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8745129512124437d + "'", double2 == 0.8745129512124437d);
    }

    @Test
    public void test6939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6939");
        double double1 = org.apache.commons.math.util.FastMath.atan((-1.0664977916380836d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8175660435804902d) + "'", double1 == (-0.8175660435804902d));
    }

    @Test
    public void test6940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6940");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-2.7775225130543997d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.070664054775506d + "'", double1 == 8.070664054775506d);
    }

    @Test
    public void test6941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6941");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.8957199490291566E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000419259705d + "'", double1 == 1.0000000419259705d);
    }

    @Test
    public void test6942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6942");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 52, (long) 72);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 72L + "'", long2 == 72L);
    }

    @Test
    public void test6943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6943");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.9006957856321915d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.065905064947488d + "'", double1 == 9.065905064947488d);
    }

    @Test
    public void test6944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6944");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 1, (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test6945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6945");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.5157707046119764d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6749288798959499d + "'", double1 == 1.6749288798959499d);
    }

    @Test
    public void test6946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6946");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.8366617438896834d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963267948966d) + "'", double2 == (-1.5707963267948966d));
    }

    @Test
    public void test6947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6947");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-1.2040758220049488d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0185797989725927d) + "'", double1 == (-1.0185797989725927d));
    }

    @Test
    public void test6948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6948");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.5942992187596847d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6949");
        double double1 = org.apache.commons.math.util.FastMath.rint((-1.5010608089539734d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test6950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6950");
        double double2 = org.apache.commons.math.util.FastMath.min(0.20105746756615084d, 0.4380253164811876d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.20105746756615084d + "'", double2 == 0.20105746756615084d);
    }

    @Test
    public void test6951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6951");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.0111706373997405E-10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000001011171d + "'", double1 == 1.0000000001011171d);
    }

    @Test
    public void test6952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6952");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.1240849833762582d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12345395387277738d + "'", double1 == 0.12345395387277738d);
    }

    @Test
    public void test6953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6953");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 39481480091340L, (float) 36L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 36.0f + "'", float2 == 36.0f);
    }

    @Test
    public void test6954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6954");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.8479985663995262d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 48.58673888783715d + "'", double1 == 48.58673888783715d);
    }

    @Test
    public void test6955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6955");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 100, (-36.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test6956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6956");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.3887906953856204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1714776677557135d + "'", double1 == 1.1714776677557135d);
    }

    @Test
    public void test6957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6957");
        float float2 = org.apache.commons.math.util.FastMath.min((-53.0f), (float) (-53));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-53.0f) + "'", float2 == (-53.0f));
    }

    @Test
    public void test6958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6958");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-3L), (float) 1833L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1833.0f + "'", float2 == 1833.0f);
    }

    @Test
    public void test6959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6959");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.022602274997922656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2950149647750298d + "'", double1 == 1.2950149647750298d);
    }

    @Test
    public void test6960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6960");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.047442967903742035d + "'", double1 == 0.047442967903742035d);
    }

    @Test
    public void test6961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6961");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.5671826220878473d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1993464580075854d + "'", double1 == 1.1993464580075854d);
    }

    @Test
    public void test6962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6962");
        double double1 = org.apache.commons.math.util.FastMath.signum(21.323945308420992d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6963");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(5.9327515395324766E246d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.932751539532477E246d + "'", double1 == 5.932751539532477E246d);
    }

    @Test
    public void test6964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6964");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.008092143267727406d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6965");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.677261497848975d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5935574232371058d + "'", double1 == 0.5935574232371058d);
    }

    @Test
    public void test6966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6966");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.5942992187596847d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test6967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6967");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 10, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test6968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6968");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 1833, (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test6969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6969");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.7414443288724203d, 44.27774091645641d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7414443288724204d + "'", double2 == 0.7414443288724204d);
    }

    @Test
    public void test6970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6970");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.3308556102312834d, 0.9918956474731391d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9303056814345817d + "'", double2 == 0.9303056814345817d);
    }

    @Test
    public void test6971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6971");
        double double2 = org.apache.commons.math.util.FastMath.min(3.9128128099614456d, 0.25921821707943726d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.25921821707943726d + "'", double2 == 0.25921821707943726d);
    }

    @Test
    public void test6972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6972");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test6973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6973");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-10.017874927409903d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.1557176047248046d) + "'", double1 == (-2.1557176047248046d));
    }

    @Test
    public void test6974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6974");
        int int2 = org.apache.commons.math.util.FastMath.min(1833, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test6975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6975");
        double double1 = org.apache.commons.math.util.FastMath.acosh(157.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.749382843354661d + "'", double1 == 5.749382843354661d);
    }

    @Test
    public void test6976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6976");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.5048997448906092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6977");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.99627207622075d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7081671460884866d + "'", double1 == 1.7081671460884866d);
    }

    @Test
    public void test6978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6978");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.07752552270710596d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07737076559370777d) + "'", double1 == (-0.07737076559370777d));
    }

    @Test
    public void test6979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6979");
        double double1 = org.apache.commons.math.util.FastMath.sinh(32.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9481480091340625E13d + "'", double1 == 3.9481480091340625E13d);
    }

    @Test
    public void test6980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6980");
        int int2 = org.apache.commons.math.util.FastMath.max(52, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test6981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6981");
        double double1 = org.apache.commons.math.util.FastMath.signum((-1.5142773362439195d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test6982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6982");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.5768196182814035d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test6983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6983");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.8520458407940987d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8603169695013334d + "'", double1 == 0.8603169695013334d);
    }

    @Test
    public void test6984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6984");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.27281660270156344d, 0.8752986176944212d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3207882763178331d + "'", double2 == 0.3207882763178331d);
    }

    @Test
    public void test6985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6985");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.8225636847100722d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1646938247174048d + "'", double1 == 1.1646938247174048d);
    }

    @Test
    public void test6986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6986");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.36787944117144233d, 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.539992976248487E-5d + "'", double2 == 4.539992976248487E-5d);
    }

    @Test
    public void test6987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6987");
        long long2 = org.apache.commons.math.util.FastMath.min((-1L), 11013L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test6988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6988");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.0115104269844304d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9648318413383544d + "'", double1 == 0.9648318413383544d);
    }

    @Test
    public void test6989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6989");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.860890812949043d, 0.6666666666666667d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.341854311815827d + "'", double2 == 1.341854311815827d);
    }

    @Test
    public void test6990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6990");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.238952695683498d, 0.7273018346560974d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2389526956834978d + "'", double2 == 2.2389526956834978d);
    }

    @Test
    public void test6991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6991");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9506628842154309d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5874242536606724d + "'", double1 == 1.5874242536606724d);
    }

    @Test
    public void test6992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6992");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.5712556729872574d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6080349100725808d) + "'", double1 == (-0.6080349100725808d));
    }

    @Test
    public void test6993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6993");
        double double1 = org.apache.commons.math.util.FastMath.sin(3.469446951953614E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test6994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6994");
        long long1 = org.apache.commons.math.util.FastMath.round(0.023970365332605832d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test6995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6995");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.10820388341878928d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10778453874476093d + "'", double1 == 0.10778453874476093d);
    }

    @Test
    public void test6996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6996");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.594973153695066E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5949731538303166E-5d + "'", double1 == 1.5949731538303166E-5d);
    }

    @Test
    public void test6997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6997");
        long long1 = org.apache.commons.math.util.FastMath.round(2.201488995569804d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test6998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6998");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.7624008500552837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1434160686124517d + "'", double1 == 1.1434160686124517d);
    }

    @Test
    public void test6999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6999");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.97568514776469d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6809152484542361d + "'", double1 == 0.6809152484542361d);
    }

    @Test
    public void test7000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test7000");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(6.894806889943192E27d, 1.263814502040431d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.894806889943191E27d + "'", double2 == 6.894806889943191E27d);
    }
}

