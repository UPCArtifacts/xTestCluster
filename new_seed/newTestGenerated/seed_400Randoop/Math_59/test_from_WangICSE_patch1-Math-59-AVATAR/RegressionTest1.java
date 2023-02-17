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
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.5900247258946039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9998151400298467d + "'", double1 == 0.9998151400298467d);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        long long2 = org.apache.commons.math.util.FastMath.max((-1L), (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        double double2 = org.apache.commons.math.util.FastMath.min(1.4274266235030733d, (-3.380515006246586d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.380515006246586d) + "'", double2 == (-3.380515006246586d));
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.8310416729209025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.047442967903742035d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 32L, (float) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        long long1 = org.apache.commons.math.util.FastMath.round(0.17453292519943295d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(3.465735902799727d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 198.57204013738647d + "'", double1 == 198.57204013738647d);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.8486007400083447d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        int int1 = org.apache.commons.math.util.FastMath.abs((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 0, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-7.47197233734299E-43d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.47197233734299E-43d) + "'", double1 == (-7.47197233734299E-43d));
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) (-1L));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        double double2 = org.apache.commons.math.util.FastMath.min(0.5403023023993376d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.99822295029797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.731537741517051d + "'", double1 == 1.731537741517051d);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.5954182863428418d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.22517783153706364d) + "'", double1 == (-0.22517783153706364d));
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        long long1 = org.apache.commons.math.util.FastMath.abs(10L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 10, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) 32);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 0, 5L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 100, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-1.2240401467946809d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.7755575615628914E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.268356063861754E-9d + "'", double1 == 5.268356063861754E-9d);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 35, 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 32);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 32.0f + "'", float1 == 32.0f);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        double double2 = org.apache.commons.math.util.FastMath.atan2(11013.232920103323d, 1.1906899454435431d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5706882123157566d + "'", double2 == 1.5706882123157566d);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 'a', (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.2599210498948732d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5251431659552352d + "'", double1 == 3.5251431659552352d);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        double double1 = org.apache.commons.math.util.FastMath.tan(89.42706130231652d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.194972725426231d + "'", double1 == 9.194972725426231d);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        double double1 = org.apache.commons.math.util.FastMath.signum(100.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.047442967903742035d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04747859541485403d + "'", double1 == 0.04747859541485403d);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        double double1 = org.apache.commons.math.util.FastMath.abs(32.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.0d + "'", double1 == 32.0d);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.8259324122591327d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 35, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.28366218546322625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.27629111752846225d + "'", double1 == 0.27629111752846225d);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.5954182863428418d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6774316254928918d + "'", double1 == 0.6774316254928918d);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.6105647004975028d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8414709848078964d + "'", double1 == 0.8414709848078964d);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        long long2 = org.apache.commons.math.util.FastMath.max(35L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        float float2 = org.apache.commons.math.util.FastMath.max(35.0f, (float) ' ');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        double double1 = org.apache.commons.math.util.FastMath.atanh(7.028730419947965d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(3.3554432E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5792.618751480198d + "'", double1 == 5792.618751480198d);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        float float2 = org.apache.commons.math.util.FastMath.min(35.0f, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-1.2240401467946809d), (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.2240401467946807d) + "'", double2 == (-1.2240401467946807d));
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 0L, (float) 97L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.4711276743037347d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.40205067186377547d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.5370437824787192d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        double double1 = org.apache.commons.math.util.FastMath.cos(4.440892098500626E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        long long1 = org.apache.commons.math.util.FastMath.round((double) 32);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 32L + "'", long1 == 32L);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        double double1 = org.apache.commons.math.util.FastMath.log10(11013.232874703393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.041914822473389d + "'", double1 == 4.041914822473389d);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.0038696050023175d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 10, 97.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.0000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.557407724654903d + "'", double1 == 1.557407724654903d);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.1675576188544794d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02037772465575569d + "'", double1 == 0.02037772465575569d);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.9830700822184464d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8130791098485624d + "'", double1 == 1.8130791098485624d);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        double double1 = org.apache.commons.math.util.FastMath.exp((-1.2240401467946807d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.29403979995923674d + "'", double1 == 0.29403979995923674d);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.08794443625241963d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.29655427201849516d + "'", double1 == 0.29655427201849516d);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.17453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.41777137910516676d + "'", double1 == 0.41777137910516676d);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        double double1 = org.apache.commons.math.util.FastMath.log1p(10.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3978952727983707d + "'", double1 == 2.3978952727983707d);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.0038621373392852356d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06214609673410902d + "'", double1 == 0.06214609673410902d);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 32.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.948148009134034E13d + "'", double1 == 3.948148009134034E13d);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) 3L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 19.085536923187668d + "'", double1 == 19.085536923187668d);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        double double1 = org.apache.commons.math.util.FastMath.log10((-1.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.99822295029797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.385849999980594d + "'", double1 == 1.385849999980594d);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        double double1 = org.apache.commons.math.util.FastMath.floor(3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.6782858550610652d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8058302155599487d + "'", double1 == 0.8058302155599487d);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.557407724654903d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        double double1 = org.apache.commons.math.util.FastMath.acos(9.194972725426231d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 10, 97.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.9999999999999999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430806348152437d + "'", double1 == 1.5430806348152437d);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 35, (float) 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7621956910836314d + "'", double1 == 3.7621956910836314d);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        double double2 = org.apache.commons.math.util.FastMath.max(2.302585092994046d, 0.9999468579779085d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.302585092994046d + "'", double2 == 2.302585092994046d);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.5707963267948966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.302585092994046d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3205004784536853d + "'", double1 == 1.3205004784536853d);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9950371902099892d, Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        double double1 = org.apache.commons.math.util.FastMath.cosh(11013.232920103324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.457501399486101d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.295214085529645d + "'", double1 == 4.295214085529645d);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8058302155599487d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8058302155599487d + "'", double1 == 0.8058302155599487d);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        double double1 = org.apache.commons.math.util.FastMath.sin(96.99484522385717d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.384371602954472d + "'", double1 == 0.384371602954472d);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.691673596021348E41d + "'", double1 == 6.691673596021348E41d);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 97, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        float float1 = org.apache.commons.math.util.FastMath.abs(0.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        double double1 = org.apache.commons.math.util.FastMath.asin(1833.4649444186343d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 32, 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        float float1 = org.apache.commons.math.util.FastMath.abs(32.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 32.0f + "'", float1 == 32.0f);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9999999958776928d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5574077105338615d + "'", double1 == 1.5574077105338615d);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        double double1 = org.apache.commons.math.util.FastMath.sin(4.644483341943245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9976952979536658d) + "'", double1 == (-0.9976952979536658d));
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        double double1 = org.apache.commons.math.util.FastMath.log(9.848857801796104d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2873554892516914d + "'", double1 == 2.2873554892516914d);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.9976952979536658d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.13355056135114904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5111502441944042d + "'", double1 == 0.5111502441944042d);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9998000199980002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9998000199980002d + "'", double1 == 0.9998000199980002d);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.8414709848078964d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.319776824715853d + "'", double1 == 1.319776824715853d);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        double double1 = org.apache.commons.math.util.FastMath.floor(3.555348061489414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) 32.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8342233605065102d + "'", double1 == 0.8342233605065102d);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        float float2 = org.apache.commons.math.util.FastMath.min((float) '#', 97.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        double double2 = org.apache.commons.math.util.FastMath.max(3.2710663101885897d, Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 32L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 32.0f + "'", float1 == 32.0f);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 10, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        double double1 = org.apache.commons.math.util.FastMath.cos(564.2979850674102d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.37287332357954484d + "'", double1 == 0.37287332357954484d);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        float float2 = org.apache.commons.math.util.FastMath.max(52.0f, (float) (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.138288992714996d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.5607966601082315d, 0.770170914020331d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1124045972580494d + "'", double2 == 1.1124045972580494d);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        long long1 = org.apache.commons.math.util.FastMath.abs(32L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 32L + "'", long1 == 32L);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.2233932393493425d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) 97.0f, 0.7853981633974484d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 96.99999999999999d + "'", double2 == 96.99999999999999d);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        double double2 = org.apache.commons.math.util.FastMath.max(0.41777137910516676d, (double) 97.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.04747859541485403d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0011273202561264d + "'", double1 == 1.0011273202561264d);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8390715290764524d) + "'", double1 == (-0.8390715290764524d));
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        double double1 = org.apache.commons.math.util.FastMath.log(1.319776824715853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.27746265011900656d + "'", double1 == 0.27746265011900656d);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9221952083958849d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8252737291036185d + "'", double1 == 0.8252737291036185d);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        float float1 = org.apache.commons.math.util.FastMath.abs(35.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 35.0f + "'", float1 == 35.0f);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.2884160242990499d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.29243127846782413d + "'", double1 == 0.29243127846782413d);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430806348152437d + "'", double1 == 1.5430806348152437d);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.12179813610068427d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12952606822871066d + "'", double1 == 0.12952606822871066d);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 52, (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.7595020127952743d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        double double1 = org.apache.commons.math.util.FastMath.cosh(11013.232920103323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(10.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1622776601683795d + "'", double1 == 3.1622776601683795d);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        long long1 = org.apache.commons.math.util.FastMath.round(0.28366218546322625d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(3.970291913552122d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9925591367766533d + "'", double1 == 1.9925591367766533d);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        int int2 = org.apache.commons.math.util.FastMath.max((int) ' ', (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 32L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(11013.232920103324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 631011.7651164598d + "'", double1 == 631011.7651164598d);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        double double2 = org.apache.commons.math.util.FastMath.max(Double.NEGATIVE_INFINITY, 3.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0d + "'", double2 == 3.0d);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.28366218546322625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 35.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        long long1 = org.apache.commons.math.util.FastMath.round(1.375942878091087d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.5063656411097466d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.008837747656337032d) + "'", double1 == (-0.008837747656337032d));
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.8390715290764524d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6853169696133173d) + "'", double1 == (-0.6853169696133173d));
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        int int2 = org.apache.commons.math.util.FastMath.max(10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(5729.5779513082325d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 328280.6350011744d + "'", double1 == 328280.6350011744d);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.1906899454435431d, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1906899454435433d + "'", double2 == 1.1906899454435433d);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 100, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (short) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.457501399486101d, 1.1906899454435431d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4575013994861008d + "'", double2 == 1.4575013994861008d);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        double double1 = org.apache.commons.math.util.FastMath.signum(35.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.047442967903742035d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.047460767623888615d + "'", double1 == 0.047460767623888615d);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        double double1 = org.apache.commons.math.util.FastMath.log(0.02037772465575569d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.8933129033597975d) + "'", double1 == (-3.8933129033597975d));
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 100, 3.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) 3L, (-3.8933129033597975d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.9999999999999996d + "'", double2 == 2.9999999999999996d);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        double double1 = org.apache.commons.math.util.FastMath.log(97.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.574710978503383d + "'", double1 == 4.574710978503383d);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.1535902666964596d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16601303451652813d + "'", double1 == 0.16601303451652813d);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.08760630539897361d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3877787807814457E-17d + "'", double1 == 1.3877787807814457E-17d);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 0, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.8623188722876839d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        double double2 = org.apache.commons.math.util.FastMath.max(1.0000000000000142d, 1.731537741517051d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.731537741517051d + "'", double2 == 1.731537741517051d);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        double double1 = org.apache.commons.math.util.FastMath.ceil(Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.4274266235030735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        double double1 = org.apache.commons.math.util.FastMath.acosh(5792.618751480198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.357486930108681d + "'", double1 == 9.357486930108681d);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        long long2 = org.apache.commons.math.util.FastMath.max(1L, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.385849999980594d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1772213045900053d + "'", double1 == 1.1772213045900053d);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.04747859541485403d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.2240401467946809d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        long long2 = org.apache.commons.math.util.FastMath.min(97L, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9998151400298467d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7615165085805536d + "'", double1 == 0.7615165085805536d);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.8486007400083447d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6144289961559061d + "'", double1 == 0.6144289961559061d);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        double double2 = org.apache.commons.math.util.FastMath.max(1.1189396031849523d, 12.610439577969121d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 12.610439577969121d + "'", double2 == 12.610439577969121d);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        int int1 = org.apache.commons.math.util.FastMath.round(5.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 97, (float) (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        float float2 = org.apache.commons.math.util.FastMath.min(32.0f, (float) 52);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(9.079985974466559E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009528896040185642d + "'", double1 == 0.009528896040185642d);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        double double1 = org.apache.commons.math.util.FastMath.cosh(4.035274726494073E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        float float2 = org.apache.commons.math.util.FastMath.max(10.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        double double1 = org.apache.commons.math.util.FastMath.cos(3.7621956910836314d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8135279227115655d) + "'", double1 == (-0.8135279227115655d));
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(7.028730419947965d, 1.0000000041223074d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.028730419947964d + "'", double2 == 7.028730419947964d);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.3978952727983707d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 137.38927884571783d + "'", double1 == 137.38927884571783d);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9998151400298467d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.28518781699162d + "'", double1 == 57.28518781699162d);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.14287905018325442d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1428790501832544d + "'", double2 == 0.1428790501832544d);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-1.2240401467946809d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5534301753820028d) + "'", double1 == (-1.5534301753820028d));
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) 35.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.0d + "'", double1 == 35.0d);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1833.4649444186343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1834.0d + "'", double1 == 1834.0d);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.9999999999999997d), 0.6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6d + "'", double2 == 0.6d);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        double double1 = org.apache.commons.math.util.FastMath.log1p(3.7621956910836314d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5607088415259998d + "'", double1 == 1.5607088415259998d);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.8486007400083447d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.8310416729209025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        double double1 = org.apache.commons.math.util.FastMath.signum(32.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 52, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1833.4649444186343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.239326967783478d + "'", double1 == 12.239326967783478d);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.2873554892516914d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9795918367346939d + "'", double1 == 0.9795918367346939d);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) -1, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        long long1 = org.apache.commons.math.util.FastMath.round(97.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 97L + "'", long1 == 97L);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.123919126120245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0867705308894857d + "'", double1 == 2.0867705308894857d);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 100L, (float) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        long long1 = org.apache.commons.math.util.FastMath.round(3.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.123919126120245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0768893216246815d + "'", double1 == 3.0768893216246815d);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.4575013994861008d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.788723182374373d + "'", double1 == 8.788723182374373d);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(8.788723182374373d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.788723182374374d + "'", double1 == 8.788723182374374d);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.16601303451652813d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16601303451652816d + "'", double1 == 0.16601303451652816d);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        double double1 = org.apache.commons.math.util.FastMath.asinh(3.7581226324091723d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.034315407113705d + "'", double1 == 2.034315407113705d);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        long long1 = org.apache.commons.math.util.FastMath.round((double) 35.0f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 35L + "'", long1 == 35L);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) -1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        double double1 = org.apache.commons.math.util.FastMath.ulp(4.035274726494073E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.3108872417680944E-30d + "'", double1 == 6.3108872417680944E-30d);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 1, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.9976952979536658d), 0.8524543594406486d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8524543594406486d + "'", double2 == 0.8524543594406486d);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.14782604738794858d, 32.00000000000001d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.004619531120223835d + "'", double2 == 0.004619531120223835d);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 10, (float) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.0038696050023175d, 10.000000000000002d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0393768734000801d + "'", double2 == 1.0393768734000801d);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 1.4274266235030733d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4274266235030733d + "'", double2 == 1.4274266235030733d);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        double double1 = org.apache.commons.math.util.FastMath.log1p(4.493423335506387d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7035516195697273d + "'", double1 == 1.7035516195697273d);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        double double2 = org.apache.commons.math.util.FastMath.atan2(7.930067261567154E14d, 20.049875621120893d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948712d + "'", double2 == 1.5707963267948712d);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        double double1 = org.apache.commons.math.util.FastMath.log10((-1.2240401467946807d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.9925591367766533d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.034776717477448635d + "'", double1 == 0.034776717477448635d);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        double double1 = org.apache.commons.math.util.FastMath.log10(4.9E-324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-323.3062153431158d) + "'", double1 == (-323.3062153431158d));
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(6.3108872417680944E-30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8479780433329283E-10d + "'", double1 == 1.8479780433329283E-10d);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(328280.6350011744d, 0.17453292519943295d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 328280.63500117435d + "'", double2 == 328280.63500117435d);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-1.5534301753820028d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-89.00499281765603d) + "'", double1 == (-89.00499281765603d));
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        double double2 = org.apache.commons.math.util.FastMath.min(3.2710663101885897d, (-0.008837747656337032d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.008837747656337032d) + "'", double2 == (-0.008837747656337032d));
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.1906899454435433d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.059903262040248d + "'", double1 == 1.059903262040248d);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        double double1 = org.apache.commons.math.util.FastMath.expm1(96.99484522385717d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3314536537354545E42d + "'", double1 == 1.3314536537354545E42d);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 52, 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        int int2 = org.apache.commons.math.util.FastMath.max((int) ' ', 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.970291913552122d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5834613951988719d + "'", double1 == 1.5834613951988719d);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.1535902666964597d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.5370437824787192d, Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5370437824787193d + "'", double2 == 0.5370437824787193d);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.2233932393493425d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 70.09526929955547d + "'", double1 == 70.09526929955547d);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.0149280275816275d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7005834764389589d + "'", double1 == 0.7005834764389589d);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.8486007400083447d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) ' ');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 32L + "'", long1 == 32L);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.27629111752846225d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.28354302476765203d + "'", double1 == 0.28354302476765203d);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.37287332357954484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4519004066366517d + "'", double1 == 1.4519004066366517d);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.5063656411097465d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.48689816668285923d) + "'", double1 == (-0.48689816668285923d));
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        double double1 = org.apache.commons.math.util.FastMath.atan(35.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5422326689561365d + "'", double1 == 1.5422326689561365d);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.40205067186377547d), (-0.5063656411097588d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.3314536537354545E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 96.99484522385717d + "'", double1 == 96.99484522385717d);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.059903262040248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2698012268765735d + "'", double1 == 1.2698012268765735d);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) '#');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 35L + "'", long1 == 35L);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        long long2 = org.apache.commons.math.util.FastMath.max((long) '4', (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.412549515873616d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1455452429262174d + "'", double1 == 1.1455452429262174d);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        double double1 = org.apache.commons.math.util.FastMath.floor(4.295214085529645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(6.691673596021348E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1679173671934143E40d + "'", double1 == 1.1679173671934143E40d);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 0, 0.8414709848078965d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        int int2 = org.apache.commons.math.util.FastMath.max(32, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        double double1 = org.apache.commons.math.util.FastMath.atan(3.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2490457723982544d + "'", double1 == 1.2490457723982544d);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.8137894696727874d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8137894696727875d + "'", double1 == 0.8137894696727875d);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.8137894696727875d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 46.62670202444023d + "'", double1 == 46.62670202444023d);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.1675576188544794d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3923993423012373d + "'", double1 == 0.3923993423012373d);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        double double1 = org.apache.commons.math.util.FastMath.tan(100.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5872139151569291d) + "'", double1 == (-0.5872139151569291d));
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 32);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 32L + "'", long1 == 32L);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        double double2 = org.apache.commons.math.util.FastMath.max(3.5251431659552352d, 2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.5251431659552352d + "'", double2 == 3.5251431659552352d);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.993222846126381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1494681981443936d) + "'", double1 == (-0.1494681981443936d));
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-1), (float) 32L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.5403023023993377d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4319786974204731d + "'", double1 == 0.4319786974204731d);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        double double2 = org.apache.commons.math.util.FastMath.max(9.194972725426231d, (double) 3.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.194972725426231d + "'", double2 == 9.194972725426231d);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        double double1 = org.apache.commons.math.util.FastMath.tan(10.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6483608274590866d + "'", double1 == 0.6483608274590866d);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        double double1 = org.apache.commons.math.util.FastMath.atan(4.035274726494073E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.035274726494073E-14d + "'", double1 == 4.035274726494073E-14d);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.5607966601082315d, 0.41777137910516676d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3092616699137571d + "'", double2 == 1.3092616699137571d);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 1.0f, 1.5707963267948966d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 10, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.9999999999999997d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        double double1 = org.apache.commons.math.util.FastMath.log(1.457501399486101d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.37672359943834516d + "'", double1 == 0.37672359943834516d);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.27629111752846225d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24395830743395697d + "'", double1 == 0.24395830743395697d);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.8259324122591327d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.284009411162292d + "'", double1 == 2.284009411162292d);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        long long1 = org.apache.commons.math.util.FastMath.round(0.8414709848078965d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        double double1 = org.apache.commons.math.util.FastMath.tanh(96.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        double double2 = org.apache.commons.math.util.FastMath.pow(137.38927884571783d, 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.241434156324286E213d + "'", double2 == 6.241434156324286E213d);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        double double1 = org.apache.commons.math.util.FastMath.ulp(4.615120516841261d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9999999958776927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1833.4649444186343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.207110122769961d + "'", double1 == 8.207110122769961d);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, (double) (-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        double double1 = org.apache.commons.math.util.FastMath.log(2.302585092994046d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.834032445247956d + "'", double1 == 0.834032445247956d);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 10, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        double double1 = org.apache.commons.math.util.FastMath.cosh(8.788723182374373d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3279.925622497139d + "'", double1 == 3279.925622497139d);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.770170914020331d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6562860065218095d + "'", double1 == 0.6562860065218095d);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.017453292519943295d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.19334632705655572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19216151411464572d + "'", double1 == 0.19216151411464572d);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.1752011936438014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.773775678340353d + "'", double1 == 1.773775678340353d);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.428182669496151d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-24.53305982277447d) + "'", double1 == (-24.53305982277447d));
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        long long1 = org.apache.commons.math.util.FastMath.round((double) 35L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 35L + "'", long1 == 35L);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 'a');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 97L + "'", long1 == 97L);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.3453962389097756d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3322863883917696d + "'", double1 == 0.3322863883917696d);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.319776824715853d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) 32);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.15912713462618d + "'", double1 == 4.15912713462618d);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.3877787807814457E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        double double1 = org.apache.commons.math.util.FastMath.cosh(4.440892098500626E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        double double1 = org.apache.commons.math.util.FastMath.log(0.6144289961559061d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.48706190399811883d) + "'", double1 == (-0.48706190399811883d));
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        int int2 = org.apache.commons.math.util.FastMath.max(100, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(8.881784197001252E-16d, (double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.881784197001254E-16d + "'", double2 == 8.881784197001254E-16d);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.37287332357954484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.35650241886700945d + "'", double1 == 0.35650241886700945d);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.14287905018325442d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.568058636590814d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        double double1 = org.apache.commons.math.util.FastMath.abs(10.000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.000000000000002d + "'", double1 == 10.000000000000002d);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        long long1 = org.apache.commons.math.util.FastMath.round((double) (-1));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.29403979995923674d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2982952388073998d + "'", double1 == 0.2982952388073998d);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        double double1 = org.apache.commons.math.util.FastMath.log10(4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6632456843634444d + "'", double1 == 0.6632456843634444d);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        double double1 = org.apache.commons.math.util.FastMath.ceil(4.158638853279167d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9058595173841506d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 0L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-1L), (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.298342365610589d + "'", double1 == 5.298342365610589d);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        double double1 = org.apache.commons.math.util.FastMath.log(11013.232920103324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.306852821501208d + "'", double1 == 9.306852821501208d);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.6853169696133173d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.325835187949904d + "'", double1 == 2.325835187949904d);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.02048526137339397d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.020482396575802187d + "'", double1 == 0.020482396575802187d);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(3.138288992714996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7715216602443777d + "'", double1 == 1.7715216602443777d);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        int int1 = org.apache.commons.math.util.FastMath.abs(5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 10L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1833.4649444186343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2737367544323206E-13d + "'", double1 == 2.2737367544323206E-13d);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.1752011936438014d, 1.375942878091087d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7068730370437739d + "'", double2 == 0.7068730370437739d);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 10.0f + "'", float1 == 10.0f);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1752011936438014d) + "'", double1 == (-1.1752011936438014d));
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.5422326689561365d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9995920864606948d + "'", double1 == 0.9995920864606948d);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '#', (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '4', 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.07258194039108286d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07270966677774478d + "'", double1 == 0.07270966677774478d);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.16601303451652816d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5496008503596722d + "'", double1 == 0.5496008503596722d);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        double double1 = org.apache.commons.math.util.FastMath.ulp(5.916079783099616d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        double double2 = org.apache.commons.math.util.FastMath.pow(57.28518781699162d, 1.2698012268765735d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 170.75141916320402d + "'", double2 == 170.75141916320402d);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6321205588285577d) + "'", double1 == (-0.6321205588285577d));
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(11013.232874703393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.24871540768837d + "'", double1 == 22.24871540768837d);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        double double1 = org.apache.commons.math.util.FastMath.log(12.239326967783478d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.504654289280179d + "'", double1 == 2.504654289280179d);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        long long1 = org.apache.commons.math.util.FastMath.round(3.9481480091340625E13d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 39481480091341L + "'", long1 == 39481480091341L);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 5L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.0f + "'", float1 == 5.0f);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4342944819032518d + "'", double1 == 0.4342944819032518d);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.8464654362980488d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3588470982042273d + "'", double1 == 1.3588470982042273d);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.7615165085805536d, 0.8137894696727874d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7615165085805538d + "'", double2 == 0.7615165085805538d);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.6105647004975028d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8193243886355482d + "'", double1 == 0.8193243886355482d);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        double double1 = org.apache.commons.math.util.FastMath.ceil(32.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.0d + "'", double1 == 32.0d);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.9036922050915067d), 0.7068730370437739d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) -1, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0038621373392852356d, 4.6151205168412615d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.6151205168412615d + "'", double2 == 4.6151205168412615d);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.35650241886700945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080678E43d + "'", double1 == 1.3440585709080678E43d);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        long long1 = org.apache.commons.math.util.FastMath.abs((-1L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        int int2 = org.apache.commons.math.util.FastMath.min(100, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        double double2 = org.apache.commons.math.util.FastMath.min(3.138288992714996d, 1.3588470982042273d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3588470982042273d + "'", double2 == 1.3588470982042273d);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        long long1 = org.apache.commons.math.util.FastMath.round(32.00000000000001d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 32L + "'", long1 == 32L);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.61512051684126d + "'", double1 == 4.61512051684126d);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.8137894696727875d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.8135279227115655d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.40205067186377547d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4129701157116966d) + "'", double1 == (-0.4129701157116966d));
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.3322863883917696d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9452989832042407d + "'", double1 == 0.9452989832042407d);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        double double1 = org.apache.commons.math.util.FastMath.cos(6.691673596021348E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9992790497916413d) + "'", double1 == (-0.9992790497916413d));
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        long long1 = org.apache.commons.math.util.FastMath.round(3.7621956910836314d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.48706190399811883d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4696098011142062d) + "'", double1 == (-0.4696098011142062d));
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        int int1 = org.apache.commons.math.util.FastMath.abs((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.7005834764389589d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8370086477683244d + "'", double1 == 0.8370086477683244d);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9950371902099892d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4711276743037347d + "'", double1 == 1.4711276743037347d);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        double double1 = org.apache.commons.math.util.FastMath.rint(1833.4649444186343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1833.0d + "'", double1 == 1833.0d);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3978952727983707d + "'", double1 == 2.3978952727983707d);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-1.0278589874552748d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) -1, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        double double1 = org.apache.commons.math.util.FastMath.tan(11.553863346113918d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.6011050627869963d) + "'", double1 == (-1.6011050627869963d));
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 52, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.9830700822184464d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1598639151884341d) + "'", double1 == (-0.1598639151884341d));
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 97L, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        double double2 = org.apache.commons.math.util.FastMath.max((double) (short) -1, 22.24871540768837d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 22.24871540768837d + "'", double2 == 22.24871540768837d);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        double double1 = org.apache.commons.math.util.FastMath.cosh(3.7581226324091723d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 21.445599564021325d + "'", double1 == 21.445599564021325d);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.48706190399811883d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4870619039981188d) + "'", double1 == (-0.4870619039981188d));
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.8414709848078964d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        double double1 = org.apache.commons.math.util.FastMath.ulp(11.553863346113918d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) 3.0f, (double) 35.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0000000000000004d + "'", double2 == 3.0000000000000004d);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.6105647004975028d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6567734310571898d + "'", double1 == 0.6567734310571898d);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        double double1 = org.apache.commons.math.util.FastMath.asinh(4.615120516841261d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.234021194410018d + "'", double1 == 2.234021194410018d);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        double double1 = org.apache.commons.math.util.FastMath.log(1.2698012268765735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23886037395044873d + "'", double1 == 0.23886037395044873d);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.2923550633004577d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.30113949866026923d + "'", double1 == 0.30113949866026923d);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        double double1 = org.apache.commons.math.util.FastMath.log(3.970291913552122d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3788396218579066d + "'", double1 == 1.3788396218579066d);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        double double2 = org.apache.commons.math.util.FastMath.atan2(9.357486930108681d, (double) 32.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.28448959157673537d + "'", double2 == 0.28448959157673537d);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) 5L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 147.4131591025766d + "'", double1 == 147.4131591025766d);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-1.5534301753820028d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2240401467946809d) + "'", double1 == (-1.2240401467946809d));
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 10, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        double double1 = org.apache.commons.math.util.FastMath.log(4.6151205168412615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5293379817723d + "'", double1 == 1.5293379817723d);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.0149280275816275d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8918900011220077d + "'", double1 == 0.8918900011220077d);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 3L, (float) 32L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9452989832042407d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7572859778007773d + "'", double1 == 0.7572859778007773d);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) -1, (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 32);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.948148009134034E13d + "'", double1 == 3.948148009134034E13d);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.1906899454435431d, (double) 35.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1906899454435433d + "'", double2 == 1.1906899454435433d);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.1124045972580494d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.0038696050023175d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9950371902099892d, (double) 0L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.642227864217147d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5708920866202177d) + "'", double1 == (-0.5708920866202177d));
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '4', 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        long long1 = org.apache.commons.math.util.FastMath.round(3.0000000000000004d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.5708920866202177d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5160141294778328d) + "'", double1 == (-0.5160141294778328d));
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.8137894696727875d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9506431907144247d + "'", double1 == 0.9506431907144247d);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) -1, (float) 32);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        double double1 = org.apache.commons.math.util.FastMath.log(1.1675576188544794d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15491406168101263d + "'", double1 == 0.15491406168101263d);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        long long2 = org.apache.commons.math.util.FastMath.max(3L, 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1833.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 42.81354925721529d + "'", double1 == 42.81354925721529d);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.4210854715202004E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        double double1 = org.apache.commons.math.util.FastMath.exp((-3.8933129033597975d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.020377724655755693d + "'", double1 == 0.020377724655755693d);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        double double2 = org.apache.commons.math.util.FastMath.pow(328280.6350011744d, 22.24871540768837d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.362545819211763E122d + "'", double2 == 5.362545819211763E122d);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.6782858550610652d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5960035785549811d + "'", double1 == 0.5960035785549811d);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        double double2 = org.apache.commons.math.util.FastMath.min(0.7853981633974483d, 0.8918900011220077d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7853981633974483d + "'", double2 == 0.7853981633974483d);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        double double1 = org.apache.commons.math.util.FastMath.atan(35.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5422326689561365d + "'", double1 == 1.5422326689561365d);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        double double1 = org.apache.commons.math.util.FastMath.ceil(137.38927884571783d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 138.0d + "'", double1 == 138.0d);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.7615165085805536d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6900198725289799d + "'", double1 == 0.6900198725289799d);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        long long2 = org.apache.commons.math.util.FastMath.max(3L, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) -1, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.4274266235030735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.024913294410754107d + "'", double1 == 0.024913294410754107d);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 32, 4L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        long long1 = org.apache.commons.math.util.FastMath.round((double) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        double double1 = org.apache.commons.math.util.FastMath.atanh(89.42706130231652d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.6900198725289799d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8253695151090449d + "'", double1 == 0.8253695151090449d);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.8252737291036185d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.014403743803069895d + "'", double1 == 0.014403743803069895d);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        double double1 = org.apache.commons.math.util.FastMath.log(11013.232874703393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.306852817378902d + "'", double1 == 9.306852817378902d);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        double double1 = org.apache.commons.math.util.FastMath.abs(8.207110122769961d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.207110122769961d + "'", double1 == 8.207110122769961d);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.22517783153706364d), 0.6567734310571898d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6567734310571898d + "'", double2 == 0.6567734310571898d);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        double double2 = org.apache.commons.math.util.FastMath.atan2(21.445599564021325d, 2.302585092994046d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.463837428330972d + "'", double2 == 1.463837428330972d);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-1.2240401467946809d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0697079433475818d) + "'", double1 == (-1.0697079433475818d));
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.3383347192042695E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3358347343868286E40d + "'", double1 == 2.3358347343868286E40d);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8058302155599487d, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4633067985287282d + "'", double2 == 2.4633067985287282d);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        int int1 = org.apache.commons.math.util.FastMath.round(3.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        double double1 = org.apache.commons.math.util.FastMath.acos(1833.4649444186343d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2005.3522829578812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(9.194972725426231d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0949973684651075d + "'", double1 == 2.0949973684651075d);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        long long2 = org.apache.commons.math.util.FastMath.min(97L, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.1752011936438014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.055287372175112d + "'", double1 == 1.055287372175112d);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 35, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        double double1 = org.apache.commons.math.util.FastMath.floor(4.574710978503383d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.4274266235030735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1259469553800836d + "'", double1 == 1.1259469553800836d);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        int int1 = org.apache.commons.math.util.FastMath.round(35.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.8135279227115655d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8135279227115655d + "'", double1 == 0.8135279227115655d);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        double double1 = org.apache.commons.math.util.FastMath.sin(5729.5779513082325d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6342583428795024d) + "'", double1 == (-0.6342583428795024d));
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(11013.232920103323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 104.94395132690269d + "'", double1 == 104.94395132690269d);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 0.35650241886700945d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.557407724654903d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9149994957367079d + "'", double1 == 0.9149994957367079d);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) -1, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.3788396218579066d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.28354302476765203d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.28748675692952264d + "'", double1 == 0.28748675692952264d);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.412549515873616d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.16601303451652816d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.013811841723194d + "'", double1 == 1.013811841723194d);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        long long1 = org.apache.commons.math.util.FastMath.round((double) 'a');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 97L + "'", long1 == 97L);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.0038621373392852356d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15689504851398525d + "'", double1 == 0.15689504851398525d);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        long long1 = org.apache.commons.math.util.FastMath.abs(5L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        double double2 = org.apache.commons.math.util.FastMath.max((-1.1752011936438014d), 100.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5585053606381855d + "'", double1 == 0.5585053606381855d);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.29243127846782413d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.2599210498948732d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        double double2 = org.apache.commons.math.util.FastMath.max(1.5607966601082315d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5607966601082315d + "'", double2 == 1.5607966601082315d);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.5707963267948948d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.837589179357618E-15d + "'", double1 == 1.837589179357618E-15d);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.0000000000000142d, (-0.6853169696133173d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.000000000000014d + "'", double2 == 1.000000000000014d);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.6782858550610652d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8253690221023695d + "'", double1 == 0.8253690221023695d);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        double double1 = org.apache.commons.math.util.FastMath.log(1.1737190189178428d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1601773562338082d + "'", double1 == 0.1601773562338082d);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8414709848078964d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9443504370351302d + "'", double1 == 0.9443504370351302d);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        int int2 = org.apache.commons.math.util.FastMath.min(52, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        long long2 = org.apache.commons.math.util.FastMath.max(5L, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.834032445247956d, (-3.8933129033597975d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8340324452479558d + "'", double2 == 0.8340324452479558d);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        double double1 = org.apache.commons.math.util.FastMath.expm1(35.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5860134523134298E15d + "'", double1 == 1.5860134523134298E15d);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.0949973684651075d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.1535902666964596d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.2240401467946809d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1063634786066832d + "'", double1 == 1.1063634786066832d);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        double double1 = org.apache.commons.math.util.FastMath.floor(11013.232874703393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.0d + "'", double1 == 11013.0d);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        double double1 = org.apache.commons.math.util.FastMath.log(2.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6931471805599453d + "'", double1 == 0.6931471805599453d);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.24395830743395697d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24154560853011509d + "'", double1 == 0.24154560853011509d);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        double double2 = org.apache.commons.math.util.FastMath.max(1.0d, 0.7853981633974484d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.504654289280179d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        int int2 = org.apache.commons.math.util.FastMath.min((int) 'a', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        long long2 = org.apache.commons.math.util.FastMath.max((-1L), (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.5063656411097465d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5545968900472498d) + "'", double1 == (-0.5545968900472498d));
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9998000199980002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5507969934215644d + "'", double1 == 1.5507969934215644d);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8414709848078964d, 0.034776717477448635d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5294913521432763d + "'", double2 == 1.5294913521432763d);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        double double2 = org.apache.commons.math.util.FastMath.max(2.2873554892516914d, 0.7068730370437739d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2873554892516914d + "'", double2 == 2.2873554892516914d);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(20.049875621120893d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7166721312869937d + "'", double1 == 2.7166721312869937d);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 10L, 0.8657694832396586d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4844347252766887d + "'", double2 == 1.4844347252766887d);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        double double1 = org.apache.commons.math.util.FastMath.floor(138.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 138.0d + "'", double1 == 138.0d);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.8253690221023695d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6017821704857126d + "'", double1 == 0.6017821704857126d);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        double double1 = org.apache.commons.math.util.FastMath.sin(100.0000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5063656411095873d) + "'", double1 == (-0.5063656411095873d));
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        int int2 = org.apache.commons.math.util.FastMath.max((int) ' ', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        double double2 = org.apache.commons.math.util.FastMath.max(1.1189396031849523d, 2.325835187949904d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.325835187949904d + "'", double2 == 2.325835187949904d);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        float float2 = org.apache.commons.math.util.FastMath.min(10.0f, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 32, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(57.28518781699162d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9998151400298467d + "'", double1 == 0.9998151400298467d);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        long long1 = org.apache.commons.math.util.FastMath.round((double) 32.0f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 32L + "'", long1 == 32L);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.1259469553800836d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0611064769287215d + "'", double1 == 1.0611064769287215d);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        double double1 = org.apache.commons.math.util.FastMath.asin((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5707963267948966d) + "'", double1 == (-1.5707963267948966d));
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        long long1 = org.apache.commons.math.util.FastMath.round(4.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.013811841723194d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0045829120729024d + "'", double1 == 1.0045829120729024d);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) 3L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2490457723982544d + "'", double1 == 1.2490457723982544d);
    }
}

