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
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getSplitTime();
        long long9 = stopWatch0.getTime();
        java.lang.String str10 = stopWatch0.toSplitString();
        long long11 = stopWatch0.getTime();
        java.lang.String str12 = stopWatch0.toString();
        java.lang.String str13 = stopWatch0.toString();
        java.lang.String str14 = stopWatch0.toString();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0:00:00.000" + "'", str12, "0:00:00.000");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0:00:00.000" + "'", str14, "0:00:00.000");
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        long long3 = stopWatch0.getTime();
        stopWatch0.stop();
        stopWatch0.stop();
        long long6 = stopWatch0.getSplitTime();
        long long7 = stopWatch0.getSplitTime();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1637617699225L) + "'", long6 == (-1637617699225L));
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1637617699225L) + "'", long7 == (-1637617699225L));
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.start();
        stopWatch0.stop();
        stopWatch0.split();
        stopWatch0.stop();
        java.lang.String str5 = stopWatch0.toString();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.unsplit();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.start();
        stopWatch0.stop();
        stopWatch0.suspend();
        stopWatch0.unsplit();
        long long5 = stopWatch0.getTime();
        stopWatch0.stop();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.stop();
        stopWatch0.stop();
        java.lang.String str10 = stopWatch0.toSplitString();
        java.lang.String str11 = stopWatch0.toString();
        stopWatch0.unsplit();
        java.lang.Class<?> wildcardClass13 = stopWatch0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1637617699252L) + "'", long5 == (-1637617699252L));
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-454893:-48:-19.48" + "'", str7, "-454893:-48:-19.48");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-454893:-48:-19.48" + "'", str10, "-454893:-48:-19.48");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-454893:-48:-19.48" + "'", str11, "-454893:-48:-19.48");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        long long7 = stopWatch0.getTime();
        long long8 = stopWatch0.getTime();
        stopWatch0.unsplit();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        long long2 = stopWatch0.getTime();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.Class<?> wildcardClass9 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.start();
        stopWatch0.stop();
        stopWatch0.reset();
        stopWatch0.start();
        long long5 = stopWatch0.getTime();
        stopWatch0.suspend();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.stop();
        stopWatch0.stop();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getTime();
        java.lang.String str9 = stopWatch0.toSplitString();
        stopWatch0.split();
        java.lang.String str11 = stopWatch0.toString();
        java.lang.String str12 = stopWatch0.toString();
        stopWatch0.unsplit();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1637617699285L) + "'", long7 == (-1637617699285L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-454893:-48:-19.15" + "'", str9, "-454893:-48:-19.15");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0:00:00.000" + "'", str12, "0:00:00.000");
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        java.lang.String str2 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.stop();
        stopWatch0.split();
        stopWatch0.stop();
        java.lang.String str8 = stopWatch0.toString();
        stopWatch0.stop();
        long long10 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long13 = stopWatch0.getSplitTime();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.start();
        stopWatch0.stop();
        stopWatch0.suspend();
        stopWatch0.unsplit();
        long long5 = stopWatch0.getTime();
        stopWatch0.stop();
        java.lang.String str7 = stopWatch0.toSplitString();
        long long8 = stopWatch0.getTime();
        java.lang.String str9 = stopWatch0.toSplitString();
        stopWatch0.reset();
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1637617699301L) + "'", long5 == (-1637617699301L));
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-454893:-48:-19.99" + "'", str7, "-454893:-48:-19.99");
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1637617699301L) + "'", long8 == (-1637617699301L));
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-454893:-48:-19.99" + "'", str9, "-454893:-48:-19.99");
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        long long3 = stopWatch0.getTime();
        stopWatch0.stop();
        stopWatch0.stop();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getSplitTime();
        stopWatch0.split();
        stopWatch0.unsplit();
        long long11 = stopWatch0.getTime();
        stopWatch0.split();
        stopWatch0.suspend();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toString();
        java.lang.String str5 = stopWatch0.toString();
        stopWatch0.suspend();
        stopWatch0.resume();
        stopWatch0.reset();
        long long9 = stopWatch0.getTime();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.stop();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.suspend();
        stopWatch0.stop();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        long long2 = stopWatch0.getTime();
        java.lang.String str3 = stopWatch0.toString();
        stopWatch0.reset();
        long long5 = stopWatch0.getTime();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.reset();
        long long9 = stopWatch0.getTime();
        long long10 = stopWatch0.getTime();
        java.lang.String str11 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.Class<?> wildcardClass14 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.reset();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.reset();
        java.lang.String str8 = stopWatch0.toString();
        stopWatch0.reset();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.start();
        stopWatch0.stop();
        stopWatch0.suspend();
        stopWatch0.unsplit();
        long long5 = stopWatch0.getTime();
        stopWatch0.stop();
        stopWatch0.resume();
        stopWatch0.reset();
        long long9 = stopWatch0.getTime();
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1637617699377L) + "'", long5 == (-1637617699377L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.stop();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        java.lang.String str8 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        java.lang.String str1 = stopWatch0.toString();
        java.lang.String str2 = stopWatch0.toString();
        stopWatch0.start();
        stopWatch0.reset();
        long long5 = stopWatch0.getTime();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.000" + "'", str1, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        java.lang.String str5 = stopWatch0.toString();
        stopWatch0.stop();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.split();
        java.lang.String str9 = stopWatch0.toString();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-454893:-48:-19.97" + "'", str7, "-454893:-48:-19.97");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        long long2 = stopWatch0.getTime();
        java.lang.String str3 = stopWatch0.toString();
        stopWatch0.reset();
        long long5 = stopWatch0.getTime();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.reset();
        java.lang.String str10 = stopWatch0.toString();
        stopWatch0.start();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        long long3 = stopWatch0.getTime();
        stopWatch0.stop();
        stopWatch0.stop();
        java.lang.String str6 = stopWatch0.toString();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.split();
        java.lang.String str9 = stopWatch0.toSplitString();
        stopWatch0.unsplit();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.start();
        stopWatch0.stop();
        long long3 = stopWatch0.getSplitTime();
        stopWatch0.stop();
        long long5 = stopWatch0.getTime();
        stopWatch0.suspend();
        stopWatch0.unsplit();
        java.lang.String str8 = stopWatch0.toString();
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1637617699436L) + "'", long3 == (-1637617699436L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-454893:-48:-19.64" + "'", str8, "-454893:-48:-19.64");
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.start();
        stopWatch0.stop();
        stopWatch0.suspend();
        long long4 = stopWatch0.getSplitTime();
        long long5 = stopWatch0.getSplitTime();
        stopWatch0.resume();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-454893:-48:-19.57" + "'", str7, "-454893:-48:-19.57");
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        java.lang.String str2 = stopWatch0.toString();
        stopWatch0.reset();
        long long4 = stopWatch0.getTime();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.stop();
        long long8 = stopWatch0.getTime();
        long long9 = stopWatch0.getSplitTime();
        java.lang.String str10 = stopWatch0.toSplitString();
        stopWatch0.reset();
        long long12 = stopWatch0.getTime();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1637617699452L) + "'", long9 == (-1637617699452L));
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-454893:-48:-19.48" + "'", str10, "-454893:-48:-19.48");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        long long2 = stopWatch0.getTime();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getTime();
        java.lang.String str5 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long9 = stopWatch0.getTime();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.start();
        stopWatch0.stop();
        long long3 = stopWatch0.getSplitTime();
        stopWatch0.stop();
        java.lang.String str5 = stopWatch0.toString();
        java.lang.String str6 = stopWatch0.toSplitString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1637617699470L) + "'", long3 == (-1637617699470L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-454893:-48:-19.30" + "'", str6, "-454893:-48:-19.30");
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        long long7 = stopWatch0.getTime();
        long long8 = stopWatch0.getTime();
        java.lang.String str9 = stopWatch0.toSplitString();
        long long10 = stopWatch0.getSplitTime();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.stop();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        java.lang.String str8 = stopWatch0.toString();
        stopWatch0.suspend();
        stopWatch0.reset();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.stop();
        stopWatch0.split();
        java.lang.String str9 = stopWatch0.toString();
        stopWatch0.stop();
        java.lang.String str11 = stopWatch0.toSplitString();
        long long12 = stopWatch0.getTime();
        stopWatch0.split();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        long long7 = stopWatch0.getTime();
        stopWatch0.suspend();
        stopWatch0.stop();
        java.lang.String str10 = stopWatch0.toSplitString();
        stopWatch0.resume();
        stopWatch0.suspend();
        stopWatch0.reset();
        long long14 = stopWatch0.getTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.start();
        stopWatch0.stop();
        stopWatch0.suspend();
        long long4 = stopWatch0.getSplitTime();
        long long5 = stopWatch0.getSplitTime();
        stopWatch0.resume();
        stopWatch0.suspend();
        java.lang.String str8 = stopWatch0.toString();
        long long9 = stopWatch0.getSplitTime();
        long long10 = stopWatch0.getSplitTime();
        java.lang.String str11 = stopWatch0.toSplitString();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getTime();
        java.lang.String str3 = stopWatch0.toString();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.suspend();
        java.lang.String str8 = stopWatch0.toSplitString();
        long long9 = stopWatch0.getSplitTime();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        long long2 = stopWatch0.getTime();
        long long3 = stopWatch0.getTime();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str8 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        stopWatch0.start();
        long long5 = stopWatch0.getTime();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.suspend();
        stopWatch0.resume();
        stopWatch0.stop();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.start();
        stopWatch0.stop();
        stopWatch0.suspend();
        stopWatch0.unsplit();
        long long5 = stopWatch0.getTime();
        stopWatch0.stop();
        stopWatch0.stop();
        stopWatch0.resume();
        java.lang.String str9 = stopWatch0.toString();
        long long10 = stopWatch0.getTime();
        long long11 = stopWatch0.getTime();
        stopWatch0.stop();
        java.lang.String str13 = stopWatch0.toSplitString();
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1637617699549L) + "'", long5 == (-1637617699549L));
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-454893:-48:-19.51" + "'", str9, "-454893:-48:-19.51");
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1637617699549L) + "'", long10 == (-1637617699549L));
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1637617699549L) + "'", long11 == (-1637617699549L));
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-909787:-36:-39.02" + "'", str13, "-909787:-36:-39.02");
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        long long2 = stopWatch0.getTime();
        java.lang.String str3 = stopWatch0.toString();
        stopWatch0.reset();
        long long5 = stopWatch0.getTime();
        java.lang.String str6 = stopWatch0.toString();
        long long7 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.suspend();
        stopWatch0.resume();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.stop();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.stop();
        stopWatch0.split();
        java.lang.String str10 = stopWatch0.toSplitString();
        stopWatch0.reset();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.stop();
        java.lang.String str6 = stopWatch0.toSplitString();
        java.lang.String str7 = stopWatch0.toString();
        java.lang.String str8 = stopWatch0.toSplitString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-454893:-48:-19.28" + "'", str6, "-454893:-48:-19.28");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-454893:-48:-19.28" + "'", str8, "-454893:-48:-19.28");
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        java.lang.String str5 = stopWatch0.toString();
        stopWatch0.stop();
        stopWatch0.split();
        java.lang.String str8 = stopWatch0.toString();
        java.lang.String str9 = stopWatch0.toSplitString();
        long long10 = stopWatch0.getTime();
        long long11 = stopWatch0.getTime();
        stopWatch0.suspend();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.start();
        stopWatch0.stop();
        stopWatch0.suspend();
        stopWatch0.unsplit();
        stopWatch0.stop();
        long long6 = stopWatch0.getTime();
        stopWatch0.reset();
        long long8 = stopWatch0.getTime();
        java.lang.Class<?> wildcardClass9 = stopWatch0.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1637617699587L) + "'", long6 == (-1637617699587L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getTime();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toString();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.stop();
        java.lang.String str6 = stopWatch0.toSplitString();
        stopWatch0.split();
        long long8 = stopWatch0.getTime();
        stopWatch0.split();
        long long10 = stopWatch0.getSplitTime();
        stopWatch0.split();
        java.lang.String str12 = stopWatch0.toString();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-454893:-48:-19.99" + "'", str6, "-454893:-48:-19.99");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0:00:00.000" + "'", str12, "0:00:00.000");
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.stop();
        java.lang.String str6 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.stop();
        stopWatch0.suspend();
        stopWatch0.stop();
        stopWatch0.stop();
        long long12 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.resume();
        java.lang.Class<?> wildcardClass15 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-454893:-48:-19.92" + "'", str6, "-454893:-48:-19.92");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.stop();
        java.lang.String str6 = stopWatch0.toSplitString();
        stopWatch0.split();
        java.lang.String str8 = stopWatch0.toSplitString();
        java.lang.String str9 = stopWatch0.toString();
        stopWatch0.suspend();
        java.lang.String str11 = stopWatch0.toString();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-454893:-48:-19.85" + "'", str6, "-454893:-48:-19.85");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        long long2 = stopWatch0.getTime();
        java.lang.String str3 = stopWatch0.toString();
        stopWatch0.reset();
        long long5 = stopWatch0.getTime();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.start();
        stopWatch0.stop();
        java.lang.String str9 = stopWatch0.toString();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.stop();
        java.lang.String str6 = stopWatch0.toSplitString();
        stopWatch0.split();
        java.lang.String str8 = stopWatch0.toSplitString();
        stopWatch0.stop();
        long long10 = stopWatch0.getTime();
        long long11 = stopWatch0.getSplitTime();
        stopWatch0.stop();
        long long13 = stopWatch0.getTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-454893:-48:-19.70" + "'", str6, "-454893:-48:-19.70");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.suspend();
        long long7 = stopWatch0.getTime();
        long long8 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        java.lang.String str5 = stopWatch0.toString();
        stopWatch0.stop();
        stopWatch0.split();
        java.lang.String str8 = stopWatch0.toString();
        java.lang.String str9 = stopWatch0.toSplitString();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        stopWatch0.reset();
        long long10 = stopWatch0.getTime();
        java.lang.String str11 = stopWatch0.toString();
        long long12 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.stop();
        java.lang.String str6 = stopWatch0.toSplitString();
        stopWatch0.split();
        java.lang.String str8 = stopWatch0.toSplitString();
        stopWatch0.stop();
        long long10 = stopWatch0.getTime();
        long long11 = stopWatch0.getSplitTime();
        stopWatch0.stop();
        stopWatch0.stop();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-454893:-48:-19.36" + "'", str6, "-454893:-48:-19.36");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        long long2 = stopWatch0.getTime();
        java.lang.String str3 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        long long7 = stopWatch0.getTime();
        long long8 = stopWatch0.getTime();
        stopWatch0.stop();
        stopWatch0.stop();
        long long11 = stopWatch0.getTime();
        stopWatch0.stop();
        java.lang.String str13 = stopWatch0.toString();
        long long14 = stopWatch0.getSplitTime();
        stopWatch0.split();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1637617699674L) + "'", long14 == (-1637617699674L));
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        java.lang.String str2 = stopWatch0.toString();
        stopWatch0.reset();
        long long4 = stopWatch0.getTime();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.stop();
        long long8 = stopWatch0.getTime();
        long long9 = stopWatch0.getSplitTime();
        stopWatch0.stop();
        stopWatch0.reset();
        long long12 = stopWatch0.getTime();
        long long13 = stopWatch0.getTime();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1637617699683L) + "'", long9 == (-1637617699683L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.start();
        stopWatch0.stop();
        stopWatch0.suspend();
        long long4 = stopWatch0.getSplitTime();
        long long5 = stopWatch0.getSplitTime();
        stopWatch0.resume();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        java.lang.String str9 = stopWatch0.toSplitString();
        stopWatch0.unsplit();
        stopWatch0.reset();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-454893:-48:-19.08" + "'", str7, "-454893:-48:-19.08");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.suspend();
        stopWatch0.unsplit();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.start();
        stopWatch0.stop();
        long long3 = stopWatch0.getSplitTime();
        stopWatch0.suspend();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getSplitTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1637617699709L) + "'", long3 == (-1637617699709L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.start();
        stopWatch0.stop();
        stopWatch0.suspend();
        long long4 = stopWatch0.getSplitTime();
        long long5 = stopWatch0.getSplitTime();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.resume();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        long long2 = stopWatch0.getTime();
        java.lang.String str3 = stopWatch0.toString();
        stopWatch0.reset();
        long long5 = stopWatch0.getTime();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.reset();
        java.lang.String str9 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        long long3 = stopWatch0.getTime();
        stopWatch0.stop();
        stopWatch0.stop();
        java.lang.String str6 = stopWatch0.toSplitString();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getTime();
        stopWatch0.suspend();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-454893:-48:-19.68" + "'", str6, "-454893:-48:-19.68");
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1637617699732L) + "'", long7 == (-1637617699732L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getSplitTime();
        long long9 = stopWatch0.getTime();
        java.lang.String str10 = stopWatch0.toSplitString();
        long long11 = stopWatch0.getTime();
        long long12 = stopWatch0.getSplitTime();
        stopWatch0.unsplit();
        java.lang.String str14 = stopWatch0.toString();
        stopWatch0.split();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0:00:00.000" + "'", str14, "0:00:00.000");
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        long long2 = stopWatch0.getTime();
        java.lang.String str3 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        long long7 = stopWatch0.getTime();
        long long8 = stopWatch0.getTime();
        stopWatch0.stop();
        stopWatch0.stop();
        long long11 = stopWatch0.getTime();
        stopWatch0.stop();
        java.lang.String str13 = stopWatch0.toString();
        stopWatch0.split();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        long long2 = stopWatch0.getTime();
        java.lang.String str3 = stopWatch0.toString();
        stopWatch0.reset();
        long long5 = stopWatch0.getTime();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        long long10 = stopWatch0.getTime();
        stopWatch0.reset();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getSplitTime();
        long long9 = stopWatch0.getTime();
        java.lang.String str10 = stopWatch0.toString();
        stopWatch0.stop();
        stopWatch0.unsplit();
        stopWatch0.stop();
        stopWatch0.split();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.start();
        stopWatch0.stop();
        stopWatch0.suspend();
        stopWatch0.unsplit();
        long long5 = stopWatch0.getTime();
        stopWatch0.stop();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.stop();
        stopWatch0.resume();
        stopWatch0.suspend();
        stopWatch0.reset();
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1637617699770L) + "'", long5 == (-1637617699770L));
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-454893:-48:-19.30" + "'", str7, "-454893:-48:-19.30");
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.start();
        stopWatch0.stop();
        stopWatch0.reset();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.split();
        java.lang.String str8 = stopWatch0.toString();
        java.lang.String str9 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.start();
        stopWatch0.stop();
        stopWatch0.suspend();
        stopWatch0.unsplit();
        long long5 = stopWatch0.getTime();
        stopWatch0.resume();
        stopWatch0.stop();
        stopWatch0.split();
        stopWatch0.split();
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1637617699786L) + "'", long5 == (-1637617699786L));
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        long long3 = stopWatch0.getTime();
        stopWatch0.stop();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        stopWatch0.reset();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-454893:-48:-19.07" + "'", str5, "-454893:-48:-19.07");
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.start();
        stopWatch0.stop();
        long long3 = stopWatch0.getSplitTime();
        stopWatch0.suspend();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.reset();
        stopWatch0.reset();
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1637617699800L) + "'", long3 == (-1637617699800L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.stop();
        java.lang.String str6 = stopWatch0.toSplitString();
        stopWatch0.split();
        long long8 = stopWatch0.getTime();
        stopWatch0.split();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-454893:-48:-19.93" + "'", str6, "-454893:-48:-19.93");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.stop();
        stopWatch0.stop();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getTime();
        long long9 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.stop();
        java.lang.String str12 = stopWatch0.toSplitString();
        long long13 = stopWatch0.getTime();
        long long14 = stopWatch0.getTime();
        stopWatch0.reset();
        long long16 = stopWatch0.getTime();
        java.lang.String str17 = stopWatch0.toString();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1637617699825L) + "'", long7 == (-1637617699825L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-454893:-48:-19.75" + "'", str12, "-454893:-48:-19.75");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0:00:00.000" + "'", str17, "0:00:00.000");
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getSplitTime();
        long long9 = stopWatch0.getTime();
        java.lang.String str10 = stopWatch0.toString();
        stopWatch0.stop();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        java.lang.String str1 = stopWatch0.toString();
        java.lang.String str2 = stopWatch0.toString();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.reset();
        long long6 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.000" + "'", str1, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.split();
        long long9 = stopWatch0.getSplitTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        long long6 = stopWatch0.getTime();
        stopWatch0.unsplit();
        long long8 = stopWatch0.getTime();
        stopWatch0.suspend();
        stopWatch0.resume();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.start();
        stopWatch0.stop();
        stopWatch0.suspend();
        long long4 = stopWatch0.getSplitTime();
        long long5 = stopWatch0.getSplitTime();
        stopWatch0.resume();
        stopWatch0.split();
        java.lang.String str8 = stopWatch0.toString();
        long long9 = stopWatch0.getTime();
        stopWatch0.suspend();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.stop();
        stopWatch0.stop();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getTime();
        long long9 = stopWatch0.getTime();
        long long10 = stopWatch0.getTime();
        long long11 = stopWatch0.getTime();
        java.lang.String str12 = stopWatch0.toSplitString();
        stopWatch0.split();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1637617699880L) + "'", long7 == (-1637617699880L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-454893:-48:-19.20" + "'", str12, "-454893:-48:-19.20");
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.start();
        stopWatch0.stop();
        long long3 = stopWatch0.getSplitTime();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.stop();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.stop();
        stopWatch0.split();
        long long9 = stopWatch0.getSplitTime();
        stopWatch0.reset();
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1637617699888L) + "'", long3 == (-1637617699888L));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.start();
        stopWatch0.stop();
        stopWatch0.suspend();
        long long4 = stopWatch0.getSplitTime();
        long long5 = stopWatch0.getSplitTime();
        stopWatch0.resume();
        stopWatch0.suspend();
        java.lang.String str8 = stopWatch0.toString();
        stopWatch0.resume();
        long long10 = stopWatch0.getSplitTime();
        java.lang.String str11 = stopWatch0.toSplitString();
        stopWatch0.unsplit();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1637617699897L) + "'", long10 == (-1637617699897L));
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-454893:-48:-19.03" + "'", str11, "-454893:-48:-19.03");
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.suspend();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        java.lang.String str2 = stopWatch0.toString();
        stopWatch0.reset();
        long long4 = stopWatch0.getTime();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.stop();
        stopWatch0.suspend();
        java.lang.String str9 = stopWatch0.toString();
        stopWatch0.unsplit();
        stopWatch0.resume();
        stopWatch0.reset();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getTime();
        long long8 = stopWatch0.getSplitTime();
        stopWatch0.stop();
        stopWatch0.suspend();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.start();
        stopWatch0.stop();
        stopWatch0.reset();
        java.lang.String str4 = stopWatch0.toString();
        long long5 = stopWatch0.getTime();
        long long6 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.suspend();
        stopWatch0.stop();
        stopWatch0.resume();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.start();
        stopWatch0.stop();
        stopWatch0.reset();
        long long4 = stopWatch0.getTime();
        java.lang.String str5 = stopWatch0.toString();
        stopWatch0.start();
        long long7 = stopWatch0.getTime();
        java.lang.String str8 = stopWatch0.toString();
        stopWatch0.stop();
        long long10 = stopWatch0.getSplitTime();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1637617699939L) + "'", long10 == (-1637617699939L));
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        long long2 = stopWatch0.getTime();
        java.lang.String str3 = stopWatch0.toString();
        stopWatch0.reset();
        long long5 = stopWatch0.getTime();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.suspend();
        long long10 = stopWatch0.getTime();
        stopWatch0.stop();
        java.lang.String str12 = stopWatch0.toString();
        long long13 = stopWatch0.getTime();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0:00:00.000" + "'", str12, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.stop();
        java.lang.String str6 = stopWatch0.toSplitString();
        stopWatch0.split();
        java.lang.String str8 = stopWatch0.toSplitString();
        stopWatch0.stop();
        long long10 = stopWatch0.getTime();
        long long11 = stopWatch0.getSplitTime();
        stopWatch0.stop();
        stopWatch0.stop();
        stopWatch0.reset();
        java.lang.String str15 = stopWatch0.toString();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-454893:-48:-19.43" + "'", str6, "-454893:-48:-19.43");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0:00:00.000" + "'", str15, "0:00:00.000");
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.reset();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.start();
        stopWatch0.stop();
        long long3 = stopWatch0.getSplitTime();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.stop();
        stopWatch0.unsplit();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1637617699974L) + "'", long3 == (-1637617699974L));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        long long2 = stopWatch0.getTime();
        java.lang.String str3 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.stop();
        stopWatch0.reset();
        long long9 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        long long2 = stopWatch0.getTime();
        java.lang.String str3 = stopWatch0.toString();
        stopWatch0.reset();
        long long5 = stopWatch0.getTime();
        java.lang.String str6 = stopWatch0.toString();
        long long7 = stopWatch0.getTime();
        stopWatch0.start();
        long long9 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.start();
        stopWatch0.stop();
        stopWatch0.reset();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        stopWatch0.stop();
        long long8 = stopWatch0.getTime();
        java.lang.String str9 = stopWatch0.toSplitString();
        java.lang.String str10 = stopWatch0.toString();
        stopWatch0.suspend();
        java.lang.Class<?> wildcardClass12 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-454893:-48:-20.98" + "'", str9, "-454893:-48:-20.98");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.stop();
        java.lang.String str6 = stopWatch0.toSplitString();
        stopWatch0.split();
        java.lang.String str8 = stopWatch0.toSplitString();
        long long9 = stopWatch0.getSplitTime();
        stopWatch0.stop();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-454893:-48:-20.89" + "'", str6, "-454893:-48:-20.89");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        long long3 = stopWatch0.getTime();
        stopWatch0.stop();
        stopWatch0.stop();
        java.lang.String str6 = stopWatch0.toString();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.unsplit();
        stopWatch0.stop();
        java.lang.String str10 = stopWatch0.toString();
        stopWatch0.split();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getTime();
        long long8 = stopWatch0.getSplitTime();
        stopWatch0.stop();
        long long10 = stopWatch0.getTime();
        java.lang.Class<?> wildcardClass11 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.start();
        stopWatch0.stop();
        long long3 = stopWatch0.getSplitTime();
        stopWatch0.stop();
        java.lang.String str5 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str8 = stopWatch0.toSplitString();
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1637617700039L) + "'", long3 == (-1637617700039L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.stop();
        stopWatch0.stop();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getTime();
        long long9 = stopWatch0.getTime();
        java.lang.String str10 = stopWatch0.toString();
        java.lang.String str11 = stopWatch0.toString();
        java.lang.String str12 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.stop();
        java.lang.String str16 = stopWatch0.toSplitString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1637617700047L) + "'", long7 == (-1637617700047L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.001" + "'", str10, "0:00:00.001");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.001" + "'", str11, "0:00:00.001");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0:00:00.001" + "'", str12, "0:00:00.001");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-454893:-48:-20.52" + "'", str16, "-454893:-48:-20.52");
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.start();
        stopWatch0.stop();
        stopWatch0.suspend();
        stopWatch0.unsplit();
        stopWatch0.resume();
        stopWatch0.suspend();
        long long7 = stopWatch0.getTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1637617700058L) + "'", long7 == (-1637617700058L));
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        long long2 = stopWatch0.getTime();
        java.lang.String str3 = stopWatch0.toString();
        stopWatch0.reset();
        long long5 = stopWatch0.getTime();
        long long6 = stopWatch0.getTime();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        java.lang.String str10 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.stop();
        java.lang.String str6 = stopWatch0.toSplitString();
        stopWatch0.split();
        long long8 = stopWatch0.getTime();
        long long9 = stopWatch0.getTime();
        stopWatch0.stop();
        java.lang.String str11 = stopWatch0.toSplitString();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-454893:-48:-20.23" + "'", str6, "-454893:-48:-20.23");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.start();
        stopWatch0.stop();
        stopWatch0.reset();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getSplitTime();
        stopWatch0.split();
        stopWatch0.unsplit();
        long long11 = stopWatch0.getTime();
        stopWatch0.stop();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        long long2 = stopWatch0.getTime();
        java.lang.String str3 = stopWatch0.toString();
        stopWatch0.reset();
        long long5 = stopWatch0.getTime();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.start();
        stopWatch0.reset();
        long long9 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.stop();
        stopWatch0.stop();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.stop();
        stopWatch0.stop();
        stopWatch0.split();
        stopWatch0.reset();
        stopWatch0.reset();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.stop();
        stopWatch0.stop();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getTime();
        long long9 = stopWatch0.getTime();
        long long10 = stopWatch0.getSplitTime();
        stopWatch0.split();
        stopWatch0.unsplit();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1637617700117L) + "'", long7 == (-1637617700117L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1637617700117L) + "'", long10 == (-1637617700117L));
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.stop();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.unsplit();
        stopWatch0.suspend();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        long long3 = stopWatch0.getTime();
        stopWatch0.stop();
        stopWatch0.stop();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.suspend();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.stop();
        java.lang.String str8 = stopWatch0.toSplitString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getSplitTime();
        long long9 = stopWatch0.getSplitTime();
        stopWatch0.split();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        long long2 = stopWatch0.getTime();
        java.lang.String str3 = stopWatch0.toString();
        stopWatch0.reset();
        long long5 = stopWatch0.getTime();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.stop();
        stopWatch0.reset();
        stopWatch0.start();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.start();
        stopWatch0.stop();
        stopWatch0.suspend();
        stopWatch0.unsplit();
        long long5 = stopWatch0.getTime();
        stopWatch0.stop();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.stop();
        stopWatch0.stop();
        java.lang.String str10 = stopWatch0.toSplitString();
        stopWatch0.reset();
        stopWatch0.start();
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1637617700178L) + "'", long5 == (-1637617700178L));
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-454893:-48:-20.22" + "'", str7, "-454893:-48:-20.22");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-454893:-48:-20.22" + "'", str10, "-454893:-48:-20.22");
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        long long3 = stopWatch0.getTime();
        stopWatch0.suspend();
        long long5 = stopWatch0.getTime();
        stopWatch0.resume();
        stopWatch0.reset();
        java.lang.String str8 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getTime();
        long long3 = stopWatch0.getTime();
        stopWatch0.reset();
        java.lang.String str5 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.stop();
        java.lang.String str6 = stopWatch0.toSplitString();
        stopWatch0.split();
        java.lang.String str8 = stopWatch0.toSplitString();
        long long9 = stopWatch0.getTime();
        long long10 = stopWatch0.getTime();
        stopWatch0.split();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-454893:-48:-20.99" + "'", str6, "-454893:-48:-20.99");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.stop();
        stopWatch0.stop();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getTime();
        long long9 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.stop();
        java.lang.String str12 = stopWatch0.toSplitString();
        long long13 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1637617700209L) + "'", long7 == (-1637617700209L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-454893:-48:-20.91" + "'", str12, "-454893:-48:-20.91");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        long long3 = stopWatch0.getTime();
        stopWatch0.stop();
        stopWatch0.stop();
        java.lang.String str6 = stopWatch0.toSplitString();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getSplitTime();
        java.lang.Class<?> wildcardClass9 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-454893:-48:-20.82" + "'", str6, "-454893:-48:-20.82");
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1637617700218L) + "'", long7 == (-1637617700218L));
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1637617700218L) + "'", long8 == (-1637617700218L));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.start();
        stopWatch0.stop();
        stopWatch0.suspend();
        stopWatch0.unsplit();
        long long5 = stopWatch0.getTime();
        stopWatch0.stop();
        stopWatch0.stop();
        stopWatch0.resume();
        long long9 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long12 = stopWatch0.getSplitTime();
        stopWatch0.suspend();
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1637617700227L) + "'", long5 == (-1637617700227L));
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1637617700227L) + "'", long9 == (-1637617700227L));
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1637617700227L) + "'", long12 == (-1637617700227L));
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        long long2 = stopWatch0.getTime();
        java.lang.String str3 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        long long7 = stopWatch0.getTime();
        long long8 = stopWatch0.getTime();
        stopWatch0.suspend();
        stopWatch0.resume();
        stopWatch0.reset();
        long long12 = stopWatch0.getTime();
        java.lang.String str13 = stopWatch0.toString();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getSplitTime();
        long long9 = stopWatch0.getTime();
        java.lang.String str10 = stopWatch0.toString();
        long long11 = stopWatch0.getSplitTime();
        stopWatch0.suspend();
        stopWatch0.resume();
        long long14 = stopWatch0.getTime();
        stopWatch0.reset();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.suspend();
        long long4 = stopWatch0.getTime();
        java.lang.String str5 = stopWatch0.toString();
        java.lang.String str6 = stopWatch0.toSplitString();
        java.lang.String str7 = stopWatch0.toSplitString();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getSplitTime();
        long long9 = stopWatch0.getTime();
        java.lang.String str10 = stopWatch0.toString();
        long long11 = stopWatch0.getSplitTime();
        stopWatch0.unsplit();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.suspend();
        long long4 = stopWatch0.getTime();
        stopWatch0.resume();
        stopWatch0.stop();
        long long7 = stopWatch0.getTime();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.stop();
        java.lang.String str6 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.stop();
        stopWatch0.suspend();
        stopWatch0.stop();
        long long11 = stopWatch0.getSplitTime();
        long long12 = stopWatch0.getTime();
        long long13 = stopWatch0.getSplitTime();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-454893:-48:-20.18" + "'", str6, "-454893:-48:-20.18");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.stop();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.unsplit();
        java.lang.String str11 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        java.lang.String str1 = stopWatch0.toString();
        java.lang.String str2 = stopWatch0.toString();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getTime();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.000" + "'", str1, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getSplitTime();
        long long9 = stopWatch0.getTime();
        java.lang.String str10 = stopWatch0.toString();
        long long11 = stopWatch0.getSplitTime();
        stopWatch0.suspend();
        stopWatch0.resume();
        long long14 = stopWatch0.getTime();
        java.lang.String str15 = stopWatch0.toString();
        stopWatch0.unsplit();
        java.lang.String str17 = stopWatch0.toString();
        stopWatch0.stop();
        long long19 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0:00:00.000" + "'", str15, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0:00:00.000" + "'", str17, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getTime();
        stopWatch0.reset();
        stopWatch0.start();
        long long5 = stopWatch0.getTime();
        stopWatch0.stop();
        java.lang.String str7 = stopWatch0.toSplitString();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-454893:-48:-20.82" + "'", str7, "-454893:-48:-20.82");
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getSplitTime();
        stopWatch0.split();
        stopWatch0.unsplit();
        stopWatch0.stop();
        stopWatch0.stop();
        long long13 = stopWatch0.getSplitTime();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1637617700326L) + "'", long13 == (-1637617700326L));
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.stop();
        stopWatch0.reset();
        long long7 = stopWatch0.getTime();
        stopWatch0.start();
        java.lang.String str9 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.stop();
        long long12 = stopWatch0.getTime();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.start();
        stopWatch0.stop();
        stopWatch0.split();
        java.lang.String str4 = stopWatch0.toString();
        long long5 = stopWatch0.getTime();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        long long3 = stopWatch0.getTime();
        stopWatch0.reset();
        long long5 = stopWatch0.getTime();
        long long6 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        long long7 = stopWatch0.getTime();
        stopWatch0.suspend();
        stopWatch0.stop();
        java.lang.String str10 = stopWatch0.toString();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.stop();
        java.lang.String str12 = stopWatch0.toSplitString();
        long long13 = stopWatch0.getTime();
        long long14 = stopWatch0.getTime();
        stopWatch0.split();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0:00:00.000" + "'", str12, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.start();
        stopWatch0.stop();
        stopWatch0.suspend();
        long long4 = stopWatch0.getSplitTime();
        long long5 = stopWatch0.getSplitTime();
        stopWatch0.resume();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        java.lang.Class<?> wildcardClass9 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-454893:-48:-20.25" + "'", str7, "-454893:-48:-20.25");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        long long2 = stopWatch0.getTime();
        java.lang.String str3 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        long long7 = stopWatch0.getTime();
        long long8 = stopWatch0.getTime();
        stopWatch0.suspend();
        stopWatch0.stop();
        java.lang.String str11 = stopWatch0.toString();
        java.lang.String str12 = stopWatch0.toString();
        java.lang.String str13 = stopWatch0.toString();
        stopWatch0.unsplit();
        stopWatch0.resume();
        long long16 = stopWatch0.getTime();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0:00:00.000" + "'", str12, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1637617700383L) + "'", long16 == (-1637617700383L));
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.stop();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.stop();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.stop();
        stopWatch0.split();
        java.lang.String str9 = stopWatch0.toString();
        stopWatch0.reset();
        long long11 = stopWatch0.getTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.start();
        stopWatch0.stop();
        stopWatch0.split();
        stopWatch0.stop();
        java.lang.String str5 = stopWatch0.toString();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getTime();
        long long8 = stopWatch0.getSplitTime();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.stop();
        stopWatch0.stop();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getTime();
        long long9 = stopWatch0.getTime();
        long long10 = stopWatch0.getTime();
        stopWatch0.suspend();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1637617700418L) + "'", long7 == (-1637617700418L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.start();
        stopWatch0.stop();
        stopWatch0.suspend();
        long long4 = stopWatch0.getSplitTime();
        stopWatch0.stop();
        java.lang.String str6 = stopWatch0.toSplitString();
        long long7 = stopWatch0.getSplitTime();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.start();
        stopWatch0.stop();
        stopWatch0.suspend();
        long long4 = stopWatch0.getSplitTime();
        stopWatch0.stop();
        stopWatch0.unsplit();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.stop();
        java.lang.String str6 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.suspend();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.suspend();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-454893:-48:-20.56" + "'", str6, "-454893:-48:-20.56");
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        long long6 = stopWatch0.getTime();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        java.lang.String str5 = stopWatch0.toString();
        stopWatch0.stop();
        stopWatch0.split();
        java.lang.String str8 = stopWatch0.toString();
        long long9 = stopWatch0.getSplitTime();
        long long10 = stopWatch0.getSplitTime();
        stopWatch0.suspend();
        long long12 = stopWatch0.getSplitTime();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.stop();
        stopWatch0.reset();
        long long7 = stopWatch0.getTime();
        stopWatch0.start();
        java.lang.String str9 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.stop();
        stopWatch0.stop();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        long long7 = stopWatch0.getTime();
        java.lang.String str8 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getSplitTime();
        stopWatch0.split();
        stopWatch0.split();
        long long11 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        long long13 = stopWatch0.getTime();
        long long14 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getSplitTime();
        long long9 = stopWatch0.getTime();
        java.lang.String str10 = stopWatch0.toString();
        long long11 = stopWatch0.getSplitTime();
        stopWatch0.suspend();
        stopWatch0.resume();
        long long14 = stopWatch0.getTime();
        stopWatch0.split();
        stopWatch0.suspend();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getSplitTime();
        long long9 = stopWatch0.getTime();
        java.lang.String str10 = stopWatch0.toSplitString();
        long long11 = stopWatch0.getTime();
        stopWatch0.split();
        java.lang.String str13 = stopWatch0.toSplitString();
        java.lang.String str14 = stopWatch0.toString();
        stopWatch0.suspend();
        java.lang.String str16 = stopWatch0.toSplitString();
        long long17 = stopWatch0.getSplitTime();
        java.lang.String str18 = stopWatch0.toSplitString();
        java.lang.String str19 = stopWatch0.toString();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0:00:00.000" + "'", str14, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0:00:00.000" + "'", str16, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0:00:00.000" + "'", str18, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0:00:00.000" + "'", str19, "0:00:00.000");
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        long long6 = stopWatch0.getTime();
        stopWatch0.split();
        java.lang.Class<?> wildcardClass8 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.start();
        stopWatch0.stop();
        stopWatch0.suspend();
        stopWatch0.unsplit();
        long long5 = stopWatch0.getTime();
        stopWatch0.stop();
        stopWatch0.stop();
        stopWatch0.resume();
        java.lang.String str9 = stopWatch0.toString();
        long long10 = stopWatch0.getTime();
        long long11 = stopWatch0.getTime();
        java.lang.String str12 = stopWatch0.toSplitString();
        stopWatch0.split();
        java.lang.String str14 = stopWatch0.toString();
        java.lang.String str15 = stopWatch0.toSplitString();
        java.lang.String str16 = stopWatch0.toSplitString();
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1637617700537L) + "'", long5 == (-1637617700537L));
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-454893:-48:-20.63" + "'", str9, "-454893:-48:-20.63");
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1637617700537L) + "'", long10 == (-1637617700537L));
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1637617700537L) + "'", long11 == (-1637617700537L));
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-909787:-36:-41.26" + "'", str12, "-909787:-36:-41.26");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-454893:-48:-20.63" + "'", str14, "-454893:-48:-20.63");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-454893:-48:-20.63" + "'", str15, "-454893:-48:-20.63");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-454893:-48:-20.63" + "'", str16, "-454893:-48:-20.63");
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.stop();
        java.lang.String str6 = stopWatch0.toSplitString();
        stopWatch0.split();
        long long8 = stopWatch0.getTime();
        stopWatch0.split();
        java.lang.Class<?> wildcardClass10 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-454893:-48:-20.53" + "'", str6, "-454893:-48:-20.53");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.stop();
        java.lang.String str6 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.stop();
        java.lang.String str9 = stopWatch0.toString();
        stopWatch0.split();
        long long11 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-454893:-48:-20.44" + "'", str6, "-454893:-48:-20.44");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        long long2 = stopWatch0.getTime();
        java.lang.String str3 = stopWatch0.toString();
        stopWatch0.reset();
        long long5 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.start();
        stopWatch0.stop();
        stopWatch0.reset();
        long long4 = stopWatch0.getTime();
        java.lang.String str5 = stopWatch0.toString();
        stopWatch0.start();
        long long7 = stopWatch0.getTime();
        java.lang.String str8 = stopWatch0.toString();
        stopWatch0.suspend();
        stopWatch0.reset();
        stopWatch0.reset();
        java.lang.Class<?> wildcardClass12 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        long long3 = stopWatch0.getTime();
        stopWatch0.stop();
        stopWatch0.stop();
        java.lang.String str6 = stopWatch0.toString();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.unsplit();
        stopWatch0.stop();
        long long10 = stopWatch0.getTime();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }
}
