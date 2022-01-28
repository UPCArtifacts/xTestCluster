import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.473814720414451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6883420083174141d + "'", double1 == 0.6883420083174141d);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(100.00000000000004d, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.26765060022823E32d + "'", double2 == 1.26765060022823E32d);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.175201377593356d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4650191511034982d + "'", double1 == 1.4650191511034982d);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        double double2 = org.apache.commons.math3.util.FastMath.pow(90.00000000000001d, (int) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.43368382029253E62d + "'", double2 == 3.43368382029253E62d);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(10.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.536743E-7f + "'", float1 == 9.536743E-7f);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(4.5474735E-13f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.421011E-20f + "'", float1 == 5.421011E-20f);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.7615941559557649d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7237368419565787d + "'", double1 == 0.7237368419565787d);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        int int2 = org.apache.commons.math3.util.FastMath.max(10, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (short) 100, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(3.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05235987755982989d + "'", double1 == 0.05235987755982989d);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.473814720414451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.779595846079306d + "'", double1 == 0.779595846079306d);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(4.547473508864641E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(101.00000000000003d, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 101.00000000000003d + "'", double2 == 101.00000000000003d);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-57.295779513082316d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 52L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.053272382792838d) + "'", double1 == (-6.053272382792838d));
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(2.58037251265019648E17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.58037251265019648E17d + "'", double1 == 2.58037251265019648E17d);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        double double1 = org.apache.commons.math3.util.FastMath.log10(11013.237121318984d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.041914989933878d + "'", double1 == 4.041914989933878d);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-0.017453292519943295d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01745417862959511d) + "'", double1 == (-0.01745417862959511d));
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) ' ', (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((-1.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-0.99999994f) + "'", float1 == (-0.99999994f));
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.09711106517907972d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4735319749387725d + "'", double1 == 1.4735319749387725d);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.5206304090742055d, 1.23874681872885d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3978727715165242d + "'", double2 == 0.3978727715165242d);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.6441739259957566d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9280538062512562d + "'", double1 == 0.9280538062512562d);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        double double1 = org.apache.commons.math3.util.FastMath.floor(37648.554832912145d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 37648.0d + "'", double1 == 37648.0d);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6931471805599453d + "'", double1 == 0.6931471805599453d);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(3.27106631018859d, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.54213262037718d + "'", double2 == 6.54213262037718d);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.047442967903742035d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.938893903907228E-18d + "'", double1 == 6.938893903907228E-18d);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 0.0f, 4.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(96.99999f, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 48.499996f + "'", float2 == 48.499996f);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 'a', (-1.0000001f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0000001f) + "'", float2 == (-1.0000001f));
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        double double1 = org.apache.commons.math3.util.FastMath.sin(35.00000762939454d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4281895641080631d) + "'", double1 == (-0.4281895641080631d));
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (byte) 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        float float1 = org.apache.commons.math3.util.FastMath.signum(4096.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(5.421011E-20f, (float) ' ');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.421011E-20f + "'", float2 == 5.421011E-20f);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.02460092029573991d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.024595958627920467d + "'", double1 == 0.024595958627920467d);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-0.989740156313126d), 1.900849165587834d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.48005689602103446d) + "'", double2 == (-0.48005689602103446d));
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        int int1 = org.apache.commons.math3.util.FastMath.abs(5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(49.99500000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.605170185988092d + "'", double1 == 4.605170185988092d);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        double double2 = org.apache.commons.math3.util.FastMath.log(3.2710663101885897d, 1.5874010519681996d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.38991804378757267d + "'", double2 == 0.38991804378757267d);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.915499384730081d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8203432320660448d + "'", double1 == 0.8203432320660448d);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.4658842241887455d, 0.9999999958776927d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4658842241887455d + "'", double2 == 1.4658842241887455d);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        double double1 = org.apache.commons.math3.util.FastMath.exp(2.4917798526449118d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.082762530298217d + "'", double1 == 12.082762530298217d);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.9280538062512562d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8295742568552614d + "'", double1 == 0.8295742568552614d);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.7313481348387146d, 3.4965075614664802d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7313481348387146d + "'", double2 == 0.7313481348387146d);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        double double2 = org.apache.commons.math3.util.FastMath.pow(6.53313149942335d, 0.6499783639526059d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.3869694069128182d + "'", double2 == 3.3869694069128182d);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) 0L, (double) (-1.0000001f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000001192092896d + "'", double2 == 1.0000001192092896d);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(10.00000038146972d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1622777204840373d + "'", double1 == 3.1622777204840373d);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-5.314369626254345d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        long long2 = org.apache.commons.math3.util.FastMath.max(1L, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.4419647419307422d, (int) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 365942.161553766d + "'", double2 == 365942.161553766d);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 1, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.5707963267948963d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19611987703015257d + "'", double1 == 0.19611987703015257d);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.570796207585607d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19611984407111288d + "'", double1 == 0.19611984407111288d);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        double double1 = org.apache.commons.math3.util.FastMath.rint(7.990534932436728E-20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.1920928955078125E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1920928955078125E-7d + "'", double1 == 1.1920928955078125E-7d);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(9.313225746154783E-10d, 1.175201377593356d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.313225746154783E-10d + "'", double2 == 9.313225746154783E-10d);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(100.0f, 6);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6400.0f + "'", float2 == 6400.0f);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(2.2105354941985667d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(2.301298902307295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3012989023072956d + "'", double1 == 2.3012989023072956d);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (short) 10, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-0.9952731515503572d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01737079345125424d) + "'", double1 == (-0.01737079345125424d));
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-0.6912431464778742d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-0.008837747656336603d), 0.49361759023450513d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.49369669957632584d + "'", double2 == 0.49369669957632584d);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.5707963267948966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.123233995736766E-17d + "'", double1 == 6.123233995736766E-17d);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.7313481348387146d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6314566596416601d + "'", double1 == 0.6314566596416601d);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(100.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 100.00001f + "'", float1 == 100.00001f);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) (-1.2676505E30f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.19611987703015257d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3) + "'", int1 == (-3));
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(48.499996f, 2.154434690031884d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 48.499992f + "'", float2 == 48.499992f);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        double double1 = org.apache.commons.math3.util.FastMath.acos(3.1622777204840373d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.38991804378757267d, 3.296908309475615d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.38991804378757267d + "'", double2 == 0.38991804378757267d);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(97.0d, 3.27106631018859d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(3.744894366675417d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 21.164088169838596d + "'", double1 == 21.164088169838596d);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(5557.690612768985d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) (-1));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(2.99822295029797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7621186826519104d + "'", double1 == 1.7621186826519104d);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) (byte) 0, 5557.690612768985d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5557.690612768985d + "'", double2 == 5557.690612768985d);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        float float2 = org.apache.commons.math3.util.FastMath.min(4096.0f, (-1.0000001f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0000001f) + "'", float2 == (-1.0000001f));
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(4.5474735E-13f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.547474E-13f + "'", float1 == 4.547474E-13f);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        double double1 = org.apache.commons.math3.util.FastMath.rint(2.301298902307295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        double double1 = org.apache.commons.math3.util.FastMath.floor(2.9913014866745806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(3.43368382029253E62d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9673559108511897E64d + "'", double1 == 1.9673559108511897E64d);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.05761413798165514d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.059306170823242965d + "'", double1 == 0.059306170823242965d);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 100.00001f + "'", float1 == 100.00001f);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        double double1 = org.apache.commons.math3.util.FastMath.acos(3.5553480614894135d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.8623188722876839d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.697450486273865d + "'", double1 == 0.697450486273865d);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.9286112600478652d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9286112600478652d + "'", double2 == 0.9286112600478652d);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.791759469228055d, (double) 6);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 33.08858916388626d + "'", double2 == 33.08858916388626d);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-0.008837747656336603d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.008837862706914782d) + "'", double1 == (-0.008837862706914782d));
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (byte) -1, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.192092895507818E-7d, (-0.027415567780803774d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.192092895507818E-7d + "'", double2 == 1.192092895507818E-7d);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (short) 0, 5.421011E-20f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.421011E-20f + "'", float2 == 5.421011E-20f);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-35.35050620855721d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(403.4287934927351d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 403.42879349273517d + "'", double1 == 403.42879349273517d);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) (-3));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.0d) + "'", double1 == (-3.0d));
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(3.1622777204840373d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.055192158084907385d + "'", double1 == 0.055192158084907385d);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 10L, 32768.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32768.0f + "'", float2 == 32768.0f);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(4096.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4096.0005f + "'", float1 == 4096.0005f);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 52L, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.000004f + "'", float2 == 52.000004f);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(90.00000000000001d, 1.5574077246549023d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5534935234725733d + "'", double2 == 1.5534935234725733d);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(6.123233995736766E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.123233995736766E-17d + "'", double1 == 6.123233995736766E-17d);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        double double2 = org.apache.commons.math3.util.FastMath.max(10.536049848239342d, 0.4643056300239326d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.536049848239342d + "'", double2 == 10.536049848239342d);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (byte) 10, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.900849165587834d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.4281895641080631d), 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        double double2 = org.apache.commons.math3.util.FastMath.min((-0.008837862706914782d), 342.7746770784939d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.008837862706914782d) + "'", double2 == (-0.008837862706914782d));
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 32L, 0.9999999999999929d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 31.999998f + "'", float2 == 31.999998f);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-1.5707963267948966d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        double double1 = org.apache.commons.math3.util.FastMath.acos(9.094947017729282E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.570796326793987d + "'", double1 == 1.570796326793987d);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        long long2 = org.apache.commons.math3.util.FastMath.min(52L, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-0.49904707604701226d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(2.99822295029797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.6499783639526059d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.18710109962234833d) + "'", double1 == (-0.18710109962234833d));
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (short) 1, (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        double double1 = org.apache.commons.math3.util.FastMath.cos(16.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9576594803233847d) + "'", double1 == (-0.9576594803233847d));
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 6, 6400.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.0f + "'", float2 == 6.0f);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(100.00001f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.6293945E-6f + "'", float1 == 7.6293945E-6f);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 32L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4657359027997265d + "'", double1 == 3.4657359027997265d);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 3.8146973E-6f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8146899896858897E-6d + "'", double1 == 3.8146899896858897E-6d);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.000000000000002d, (double) 48.499996f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 48.499996185302734d + "'", double2 == 48.499996185302734d);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 1.1920929E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1920928955078097E-7d + "'", double1 == 1.1920928955078097E-7d);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.1920928955078125E-7d, (-0.04669075745245177d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.1920928955078125E-7d) + "'", double2 == (-1.1920928955078125E-7d));
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.5146893481167586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4152103671875394d + "'", double1 == 0.4152103671875394d);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.900849165587834d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        double double1 = org.apache.commons.math3.util.FastMath.log((-0.01745417862959511d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        int int2 = org.apache.commons.math3.util.FastMath.min((-1023), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1023) + "'", int2 == (-1023));
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.0d, 1.1920928955078097E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.570796326793987d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.570796326793987d + "'", double1 == 1.570796326793987d);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) 32768.0f, 0.7237368419565787d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.03109752538365459d) + "'", double2 == (-0.03109752538365459d));
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-1.1920928955078125E-7d), 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.220703125E-4d) + "'", double2 == (-1.220703125E-4d));
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.8203432320660448d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5990250723553024d + "'", double1 == 0.5990250723553024d);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        int int1 = org.apache.commons.math3.util.FastMath.round(4096.0005f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4096 + "'", int1 == 4096);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        int int1 = org.apache.commons.math3.util.FastMath.round(32768.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32768 + "'", int1 == 32768);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(343.77467707849394d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 1.4210855E-14f, (double) 10L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4210854715202004E-14d + "'", double2 == 1.4210854715202004E-14d);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.791759469228055d, 3.27106631018859d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.791759469228055d + "'", double2 == 1.791759469228055d);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.1920928244535474E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999999929d + "'", double1 == 0.9999999999999929d);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        int int1 = org.apache.commons.math3.util.FastMath.round(96.99999f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(6.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.915499384730081d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.038341943233852725d) + "'", double1 == (-0.038341943233852725d));
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.19611984407111288d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.442854201821675d + "'", double1 == 0.442854201821675d);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-57.295779513082316d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (short) 0, (-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.6931471805599453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7692389013639721d + "'", double1 == 0.7692389013639721d);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(35.00000762939454d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.930127763409804E14d + "'", double1 == 7.930127763409804E14d);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8342233605065102d + "'", double1 == 0.8342233605065102d);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        int int1 = org.apache.commons.math3.util.FastMath.abs(4096);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4096 + "'", int1 == 4096);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 35.000004f, 7.990534932436728E-20d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.000003814697266d + "'", double2 == 35.000003814697266d);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(342.7746770784939d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6653951063773365E148d + "'", double1 == 3.6653951063773365E148d);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-35.35050620855721d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        double double2 = org.apache.commons.math3.util.FastMath.min(33.08858916388626d, 2.2105354941985667d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2105354941985667d + "'", double2 == 2.2105354941985667d);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.3802897750888419d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-2), (long) 6);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6L + "'", long2 == 6L);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        float float2 = org.apache.commons.math3.util.FastMath.max((-1.0f), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(9.536743E-7f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.536744E-7f + "'", float1 == 9.536744E-7f);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.04669075745245177d, 35.00000762939454d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.04669075745245177d + "'", double2 == 0.04669075745245177d);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        int int1 = org.apache.commons.math3.util.FastMath.abs(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) (short) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0000001f + "'", float1 == 1.0000001f);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.473814720414451d, (double) (-1L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6991118430775187d + "'", double2 == 2.6991118430775187d);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(9.536744E-7f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-20) + "'", int1 == (-20));
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (short) 0, (-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (-1023), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-511.5f) + "'", float2 == (-511.5f));
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 1.4210855E-14f, 97);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.251799813685248E15d + "'", double2 == 2.251799813685248E15d);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 3.4359738E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        float float2 = org.apache.commons.math3.util.FastMath.min((-1.0f), 35.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-35.35050620855721d), (-0.09275324764611881d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-35.350506208557206d) + "'", double2 == (-35.350506208557206d));
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8813735870195445d + "'", double1 == 0.8813735870195445d);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        double double1 = org.apache.commons.math3.util.FastMath.tan(4.644483341943245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.703675447601967d + "'", double1 == 14.703675447601967d);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(3.4965075614664802d, 342.7746770784939d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.010200246779241787d + "'", double2 == 0.010200246779241787d);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 52);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.831008000716577E22d + "'", double1 == 3.831008000716577E22d);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(32.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) (-20));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 32768);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 32768.004f + "'", float1 == 32768.004f);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) 48.499992f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.784276743882713E20d + "'", double1 == 5.784276743882713E20d);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(4.041914989933878d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 4096);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4096.0d + "'", double1 == 4096.0d);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7182818284590453d + "'", double1 == 1.7182818284590453d);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.5033290854469099d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2981479726743438d) + "'", double1 == (-0.2981479726743438d));
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) 10.0f, 49.99500000000002d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.679522618351296d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9729356641052036d + "'", double1 == 1.9729356641052036d);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(41.90316148102299d, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.951580740511496d + "'", double2 == 20.951580740511496d);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        int int1 = org.apache.commons.math3.util.FastMath.abs((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        int int1 = org.apache.commons.math3.util.FastMath.abs((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        double double2 = org.apache.commons.math3.util.FastMath.max((-0.506365641109722d), (double) (short) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.9999830769532079d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8813616205677707d + "'", double1 == 0.8813616205677707d);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-1.1752011936438014d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 32L, (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) 10, (-0.9036922050915067d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.040749952147157d + "'", double2 == 10.040749952147157d);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        double double1 = org.apache.commons.math3.util.FastMath.abs(2.302585131141017d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.302585131141017d + "'", double1 == 2.302585131141017d);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        double double2 = org.apache.commons.math3.util.FastMath.log(3.4657359027997265d, (double) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.NEGATIVE_INFINITY + "'", double2 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.896296018268069E13d + "'", double1 == 7.896296018268069E13d);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 100L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(9.536743E-7f, Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.536744E-7f + "'", float2 == 9.536744E-7f);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(26.028944477141252d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9527251448743153d + "'", double1 == 3.9527251448743153d);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-3.6268604078470186d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(35.000008f, (float) 35L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.000008f + "'", float2 == 35.000008f);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-0.989740156313126d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        double double1 = org.apache.commons.math3.util.FastMath.tan(3.3869694069128182d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2504230129550942d + "'", double1 == 0.2504230129550942d);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(2.3012989023072956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9801475222605264d + "'", double1 == 0.9801475222605264d);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(4.5474735E-13f, 10240.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.5474735E-13f + "'", float2 == 4.5474735E-13f);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(7.930127763409804E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 34.30686044883459d + "'", double1 == 34.30686044883459d);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(46.999532327864166d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 100, (long) (-3));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3L) + "'", long2 == (-3L));
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.175201377593356d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0552874272350832d + "'", double1 == 1.0552874272350832d);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.7615941559557649d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.1920928955078097E-7d, (double) (-20));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1920928955078097E-7d + "'", double2 == 1.1920928955078097E-7d);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 32L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5514266812416906d + "'", double1 == 0.5514266812416906d);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        double double1 = org.apache.commons.math3.util.FastMath.log10(37648.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.575741909831946d + "'", double1 == 4.575741909831946d);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 31.999998f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.896280957292919E13d + "'", double1 == 7.896280957292919E13d);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.010200246779241787d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.734723475976807E-18d + "'", double1 == 1.734723475976807E-18d);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) (-2));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        double double1 = org.apache.commons.math3.util.FastMath.cos(3.744894366675417d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8234668322384443d) + "'", double1 == (-0.8234668322384443d));
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(49.99500000000002d, 0.9999999999999929d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5507969934215662d + "'", double2 == 1.5507969934215662d);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 10240.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 13 + "'", int1 == 13);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.9280538062512562d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5295813285302078d + "'", double1 == 1.5295813285302078d);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.175201377593356d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7771212476539429d + "'", double1 == 0.7771212476539429d);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 10L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 10.0f + "'", float1 == 10.0f);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.5734395719374923d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4532640331862171d + "'", double1 == 0.4532640331862171d);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        double double1 = org.apache.commons.math3.util.FastMath.rint(32.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.0d + "'", double1 == 32.0d);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(5786.873730821316d, (double) 5);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5786.873730821315d + "'", double2 == 5786.873730821315d);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (byte) 100, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.5206304090742055d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6610060414837631d + "'", double1 == 0.6610060414837631d);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        double double1 = org.apache.commons.math3.util.FastMath.tan(45.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6197751905438615d + "'", double1 == 1.6197751905438615d);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (byte) 1, 0.17453292519943295d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.99999994f + "'", float2 == 0.99999994f);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) 'a', 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(35.000003814697266d, (-1.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.814697265625E-6d + "'", double2 == 3.814697265625E-6d);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        float float1 = org.apache.commons.math3.util.FastMath.abs(4.5474735E-13f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.5474735E-13f + "'", float1 == 4.5474735E-13f);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        double double1 = org.apache.commons.math3.util.FastMath.signum(6.6917246496340396E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 10240.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 586708.782213963d + "'", double1 == 586708.782213963d);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(41.90316148102299d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 41.903161481023d + "'", double1 == 41.903161481023d);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        double double1 = org.apache.commons.math3.util.FastMath.rint(3.2710663101885897d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        double double1 = org.apache.commons.math3.util.FastMath.log(2.154434690031884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7675283643313486d + "'", double1 == 0.7675283643313486d);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 96.99999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4103302129827671d) + "'", double1 == (-0.4103302129827671d));
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(100.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5729.5779513082325d + "'", double1 == 5729.5779513082325d);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.4735319749387725d, 1.192092895507821E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000000462129393d + "'", double2 == 1.0000000462129393d);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(3.141592653589793d, (double) 32768);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.587379894910212E-5d + "'", double2 == 9.587379894910212E-5d);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-1), (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-1.0000001f), (-2));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.25000003f) + "'", float2 == (-0.25000003f));
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        long long1 = org.apache.commons.math3.util.FastMath.abs(32L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 32L + "'", long1 == 32L);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.8342233605065102d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 97);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) '#', 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        long long2 = org.apache.commons.math3.util.FastMath.min((-3L), (long) 4096);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3L) + "'", long2 == (-3L));
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.9286112600478652d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 6400.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18.566355334451117d + "'", double1 == 18.566355334451117d);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.017455064928217585d, 2.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.008727310882701312d + "'", double2 == 0.008727310882701312d);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.008727310882701312d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000380832193412d + "'", double1 == 1.0000380832193412d);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (byte) 0, 9.587379894910212E-5d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4E-45f + "'", float2 == 1.4E-45f);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-0.01737079345125424d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.9999999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8813735870195429d + "'", double1 == 0.8813735870195429d);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        float float2 = org.apache.commons.math3.util.FastMath.min(100.00001f, 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 10L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.536743E-7f + "'", float1 == 9.536743E-7f);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.9867717342662448d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5774089634154596d + "'", double1 == 3.5774089634154596d);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.9286112600478652d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6482076576793505d + "'", double1 == 1.6482076576793505d);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-0.008837862706914782d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5424980307488157E-4d) + "'", double1 == (-1.5424980307488157E-4d));
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-1.5574077246549023d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 0.99999994f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7182816664368272d + "'", double1 == 1.7182816664368272d);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(96.99999f, 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 96.99999f + "'", float2 == 96.99999f);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) (-2));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.0000000462129393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.718281954078841d + "'", double1 == 2.718281954078841d);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.0d, (-0.0927532476461188d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (short) 0, 32768);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 2L, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        int int2 = org.apache.commons.math3.util.FastMath.max(52, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 52);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        double double2 = org.apache.commons.math3.util.FastMath.pow(90.00000000000001d, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(0.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.4E-45f + "'", float1 == 1.4E-45f);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.3716732554246792d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3558508871372632d + "'", double1 == 0.3558508871372632d);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 10, 35);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.43597384E11f + "'", float2 == 3.43597384E11f);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-3));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.1920929E-7f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-23) + "'", int1 == (-23));
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        int int2 = org.apache.commons.math3.util.FastMath.max(3, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.6197751905438615d, 0.6931471805599453d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3969567625600747d + "'", double2 == 1.3969567625600747d);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-57.295779513082316d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-58.0d) + "'", double1 == (-58.0d));
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) (-1023));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1022.99994f) + "'", float1 == (-1022.99994f));
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(14.703675447601967d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2430664.0174340927d + "'", double1 == 2430664.0174340927d);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(1.0000001f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.1920929E-7f + "'", float1 == 1.1920929E-7f);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) (-1022.99994f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2912042544237448d + "'", double1 == 2.2912042544237448d);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        int int2 = org.apache.commons.math3.util.FastMath.max((-1), 32768);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32768 + "'", int2 == 32768);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.017453292519943295d), 6.123233995736766E-17d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-1.1920928955078125E-7d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1920928955078097E-7d) + "'", double1 == (-1.1920928955078097E-7d));
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(5.267831587699267d, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.267831587699267d + "'", double2 == 5.267831587699267d);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-1023), 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-127) + "'", int1 == (-127));
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(3.43368382029253E62d, (-0.4281895641080631d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.07813771351531074d) + "'", double2 == (-0.07813771351531074d));
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(14.703675447601967d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3800863156250025d + "'", double1 == 3.3800863156250025d);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 52L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.3558508871372632d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.30969878586487914d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005405263502771015d + "'", double1 == 0.005405263502771015d);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.9286112600478652d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.03216605451972054d) + "'", double1 == (-0.03216605451972054d));
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.0552874272350832d, 100.00000000000004d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 217.3083407086277d + "'", double2 == 217.3083407086277d);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(10.536049848239344d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4454769016358355d + "'", double1 == 2.4454769016358355d);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(4.9E-324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) (-0.25000003f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2449186904183345d) + "'", double1 == (-0.2449186904183345d));
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.04669075745245177d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36008937454964746d + "'", double1 == 0.36008937454964746d);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.4152103671875394d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9150314823146174d + "'", double1 == 0.9150314823146174d);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (short) -1, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.9801475222605264d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) (-1));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-0.99999994f) + "'", float1 == (-0.99999994f));
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        double double1 = org.apache.commons.math3.util.FastMath.acos(365942.161553766d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        double double1 = org.apache.commons.math3.util.FastMath.exp(2153.28968210235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (byte) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(7.896296018268069E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.69314718055995d + "'", double1 == 32.69314718055995d);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.5707963267948966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5091784786580567d + "'", double1 == 2.5091784786580567d);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (byte) -1, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-0.4103302129827671d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(57.336116942011905d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0007040209466105d + "'", double1 == 1.0007040209466105d);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(5557.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.9999999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.718281828459045d + "'", double1 == 2.718281828459045d);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        int int2 = org.apache.commons.math3.util.FastMath.min((-3), 13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(342.7746770784939d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6653951063773365E148d + "'", double1 == 3.6653951063773365E148d);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-0.9576594803233847d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4212655272004053d) + "'", double1 == (-1.4212655272004053d));
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        double double2 = org.apache.commons.math3.util.FastMath.min(32.69314718055995d, (double) 2L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0d + "'", double2 == 2.0d);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.30969878586487914d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.30033084129497156d + "'", double1 == 0.30033084129497156d);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.505149978319906d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.505149978319906d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        float float1 = org.apache.commons.math3.util.FastMath.abs(6400.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6400.0f + "'", float1 == 6400.0f);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        int int1 = org.apache.commons.math3.util.FastMath.round(1.0000001f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.8813616205677707d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8813616205677708d + "'", double1 == 0.8813616205677708d);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        double double2 = org.apache.commons.math3.util.FastMath.min(3.8146899896858897E-6d, 5557.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.8146899896858897E-6d + "'", double2 == 3.8146899896858897E-6d);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 48.499996f, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (byte) -1, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.8295742568552614d, 4096);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(101.00000000000003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.049875621120892d + "'", double1 == 10.049875621120892d);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) (-3));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 35, (-1.2676505E30f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-35.0f) + "'", float2 == (-35.0f));
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(6400.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6400.0005f + "'", float1 == 6400.0005f);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-1.1920928955078125E-7d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(10240.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 13 + "'", int1 == 13);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 35);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-1.1920928955078125E-7d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(48.499996185302734d, 1.0000000462129393d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5501806885958198d + "'", double2 == 1.5501806885958198d);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        double double1 = org.apache.commons.math3.util.FastMath.acos(342.7746908347008d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        double double1 = org.apache.commons.math3.util.FastMath.sin(5.839986434268865d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4288314664442319d) + "'", double1 == (-0.4288314664442319d));
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-0.0d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1023) + "'", int1 == (-1023));
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        double double1 = org.apache.commons.math3.util.FastMath.atan(4.60497014597542d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.356959696635086d + "'", double1 == 1.356959696635086d);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.356959696635086d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 4096);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(102400.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1787.2171540421934d + "'", double1 == 1787.2171540421934d);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-0.04669075745245177d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (short) 0, (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (-3), (float) 4096);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.8623188722876839d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 100.00001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.298342441900717d + "'", double1 == 5.298342441900717d);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(32768.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.00390625f + "'", float1 == 0.00390625f);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.7692389013639721d, (-127));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.52117991493046E-39d + "'", double2 == 4.52117991493046E-39d);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.0d, 10.049875621120892d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        double double2 = org.apache.commons.math3.util.FastMath.min(35.000003814697266d, (double) (-1.0000001f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0000001192092896d) + "'", double2 == (-1.0000001192092896d));
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) (-35.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.930067261567154E14d) + "'", double1 == (-7.930067261567154E14d));
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (-20));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 20L + "'", long1 == 20L);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        double double2 = org.apache.commons.math3.util.FastMath.pow(5729.5779513082325d, 3);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8809094881441946E11d + "'", double2 == 1.8809094881441946E11d);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (short) 0, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        double double1 = org.apache.commons.math3.util.FastMath.floor(3.27106631018859d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        float float1 = org.apache.commons.math3.util.FastMath.signum(3.4359738E10f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 9.536744E-7f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-20) + "'", int1 == (-20));
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.1129900353232502d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1129900353232505d + "'", double1 == 1.1129900353232505d);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) ' ', 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.49369669957632584d, (-5.314369626254345d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        long long1 = org.apache.commons.math3.util.FastMath.round(100.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(2.4917798526449118d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2504115926466592d + "'", double1 == 1.2504115926466592d);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.0d, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1023.5003663897733d, 52);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.609435868686549E18d + "'", double2 == 4.609435868686549E18d);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        long long2 = org.apache.commons.math3.util.FastMath.max(52L, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        double double1 = org.apache.commons.math3.util.FastMath.asin(5786.873730821316d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 100.00001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5729.578388440339d + "'", double1 == 5729.578388440339d);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        long long2 = org.apache.commons.math3.util.FastMath.max(0L, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 48.499992f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1568553487765425E21d + "'", double1 == 1.1568553487765425E21d);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        float float1 = org.apache.commons.math3.util.FastMath.abs(100.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 100.0f + "'", float1 == 100.0f);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.9801475222605264d, 0.6883420083174141d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.29180551394311227d + "'", double2 == 0.29180551394311227d);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        int int2 = org.apache.commons.math3.util.FastMath.max(0, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        double double2 = org.apache.commons.math3.util.FastMath.max(57.29577951308232d, 3.3869694069128182d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 57.29577951308232d + "'", double2 == 57.29577951308232d);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.5146893481167586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5146893481167586d + "'", double1 == 0.5146893481167586d);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (short) -1, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6931471805599463d + "'", double1 == 0.6931471805599463d);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 2L, 6);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 128.0f + "'", float2 == 128.0f);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (short) 10, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-1.4212655272004053d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        double double1 = org.apache.commons.math3.util.FastMath.log((-0.03109752538365459d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(7.930127763409804E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.125d + "'", double1 == 0.125d);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        double double2 = org.apache.commons.math3.util.FastMath.log(3.4657359027997265d, (-57.295779513082316d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 97);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6929693744344998d + "'", double1 == 1.6929693744344998d);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        long long2 = org.apache.commons.math3.util.FastMath.max((-1L), 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(4.9E-324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 97);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        double double1 = org.apache.commons.math3.util.FastMath.sin(2.220446049250314E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250314E-16d + "'", double1 == 2.220446049250314E-16d);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.8202965860187448d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9619293889805304d + "'", double1 == 0.9619293889805304d);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.0d, 97);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 13, 3.43597384E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 13.0f + "'", float2 == 13.0f);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.697450486273865d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        double double1 = org.apache.commons.math3.util.FastMath.exp(6.938893903907228E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.3978727715165242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.48865461858873344d + "'", double1 == 0.48865461858873344d);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.4095289050836257d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.4419647419307422d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (short) 100, 4.547474E-13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.779595846079306d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7111977130787057d + "'", double1 == 0.7111977130787057d);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 1, (double) (-35.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.99999994f + "'", float2 == 0.99999994f);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.9998000199980002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7852981633977816d + "'", double1 == 0.7852981633977816d);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.49361759023450513d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        long long2 = org.apache.commons.math3.util.FastMath.max(100L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) (-35.0f), (-3));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.375d) + "'", double2 == (-4.375d));
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(5.839986434268865d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1019269915497951d + "'", double1 == 0.1019269915497951d);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 10, 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        double double1 = org.apache.commons.math3.util.FastMath.log((-2.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 2, (float) 52);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        int int2 = org.apache.commons.math3.util.FastMath.min((-23), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-23) + "'", int2 == (-23));
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.5707963267948968d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) (-3L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.950212931632136d) + "'", double1 == (-0.950212931632136d));
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-0.01745417862959511d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.1920928955078097E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 97L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.584967478670572d + "'", double1 == 4.584967478670572d);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.950212931632136d), 0.5990250723553024d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        long long1 = org.apache.commons.math3.util.FastMath.round(4096.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4096L + "'", long1 == 4096L);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1787.2171540421934d, (double) 32768);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32816.70259419283d + "'", double2 == 32816.70259419283d);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 5, 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5120.0d + "'", double2 == 5120.0d);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 100, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.3969567625600747d, 4.61512051684126d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3969567625600747d + "'", double2 == 1.3969567625600747d);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.8813735870195429d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7224284372420832d + "'", double1 == 0.7224284372420832d);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.055192158084907385d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 52, 5);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1664.0d + "'", double2 == 1664.0d);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (-3L), 100.0d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.9999998f) + "'", float2 == (-2.9999998f));
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 10240.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 178.72171540421934d + "'", double1 == 178.72171540421934d);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.005405263502771015d, 0.6931471805599453d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.07020806430388403d + "'", double2 == 0.07020806430388403d);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(7.896296018268069E13d, (-1.1920928955078097E-7d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.896296018268069E13d + "'", double2 == 7.896296018268069E13d);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.3716732554246792d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1899855841769411d + "'", double1 == 1.1899855841769411d);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (-2), (float) 52);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.5206304090742055d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4191249916881351d + "'", double1 == 0.4191249916881351d);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 10L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 10.000001f + "'", float1 == 10.000001f);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(6400.0005f, 2.301298902307295d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6400.0f + "'", float2 == 6400.0f);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        long long1 = org.apache.commons.math3.util.FastMath.round(4.609435868686549E18d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4609435868686548992L + "'", long1 == 4609435868686548992L);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-1.1920928955078097E-7d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.570796446004186d + "'", double1 == 1.570796446004186d);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.5707963267948966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1624473515096265d + "'", double1 == 1.1624473515096265d);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        int int2 = org.apache.commons.math3.util.FastMath.min(52, 4096);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(6.938893903907228E-18d, 6.726254890556496E41d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.938893903907228E-18d + "'", double2 == 6.938893903907228E-18d);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.010200246779241787d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7) + "'", int1 == (-7));
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        int int2 = org.apache.commons.math3.util.FastMath.min(52, (-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.8809094881441946E11d, 3.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.654320150674205E33d + "'", double2 == 6.654320150674205E33d);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.1920928244535446E-7d, 10.536049848239344d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1920928244535446E-7d + "'", double2 == 1.1920928244535446E-7d);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (-23), 1.1920929E-7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 23.0f + "'", float2 == 23.0f);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.0000001192092896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6931472401645883d + "'", double1 == 0.6931472401645883d);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(48.499996f, 4096.0005f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 48.499996f + "'", float2 == 48.499996f);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.986771734266245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1044889974911134d + "'", double1 == 1.1044889974911134d);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.5990250723553024d, 0.125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.025974927644697554d) + "'", double2 == (-0.025974927644697554d));
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.7111977130787057d, (-8.042848410283348d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0533959519657112d + "'", double2 == 3.0533959519657112d);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        double double1 = org.apache.commons.math3.util.FastMath.asin(3.948148009134021E13d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-5.418539921951662d), (-3));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.00628569302695887d) + "'", double2 == (-0.00628569302695887d));
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(9.587379894910212E-5d, (-0.017453292519943295d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.01745355584320953d + "'", double2 == 0.01745355584320953d);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) (-20));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4258259770489514E8d + "'", double1 == 2.4258259770489514E8d);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.9999999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.295779513082316d + "'", double1 == 57.295779513082316d);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        double double1 = org.apache.commons.math3.util.FastMath.exp(3.27106631018859d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 26.339410356026757d + "'", double1 == 26.339410356026757d);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 52, (float) 1L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        float float1 = org.apache.commons.math3.util.FastMath.signum((-0.25000003f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.0d, (-3.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.017455064928217585d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0001015515136908d + "'", double1 == 1.0001015515136908d);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.49904707604701226d, (double) 6400.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6400.000019456874d + "'", double2 == 6400.000019456874d);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.1624473515096265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02028853366493086d + "'", double1 == 0.02028853366493086d);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        long long2 = org.apache.commons.math3.util.FastMath.max(0L, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.0d, 1.5874010519681996d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8761242229100255d + "'", double2 == 1.8761242229100255d);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(100.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080678E43d + "'", double1 == 1.3440585709080678E43d);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        double double1 = org.apache.commons.math3.util.FastMath.signum(7.896280957292919E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.4095289050836257d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (-3L), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2.0d, (-3));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.125d + "'", double2 == 0.125d);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(26.339410356026757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9638529430022156d + "'", double1 == 3.9638529430022156d);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(96.99999f, 6);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6207.9995f + "'", float2 == 6207.9995f);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.6610060414837631d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7221586788190554d + "'", double1 == 0.7221586788190554d);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(2.154434690031884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.369491427691419d + "'", double1 == 4.369491427691419d);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.49369669957632584d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8805870712594983d + "'", double1 == 0.8805870712594983d);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.8805870712594983d, (double) 4.5474735E-13f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 223.47899536523738d + "'", double2 == 223.47899536523738d);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.9999999999999929d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        double double1 = org.apache.commons.math3.util.FastMath.signum(6.54213262037718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 4609435868686548992L, 1.1920929E-7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.60943587E18f + "'", float2 == 4.60943587E18f);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.3440585709080678E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 99.30685281944005d + "'", double1 == 99.30685281944005d);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-0.0d), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0d) + "'", double2 == (-0.0d));
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.356959696635086d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9357051343132584d + "'", double1 == 0.9357051343132584d);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.5990250723553024d, 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0059490826533332725d + "'", double2 == 0.0059490826533332725d);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        int int2 = org.apache.commons.math3.util.FastMath.max((-3), 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-1.0000001192092896d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) 6, (-2.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.324555320336759d + "'", double2 == 6.324555320336759d);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.7182816664368272d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 0.00390625f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (byte) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-35.350506208557206d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2025.4348094013415d) + "'", double1 == (-2025.4348094013415d));
    }
}

