import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

    public static boolean debug = false;

    @Test
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (-1), (long) (byte) 10, "P0Y000DT00000.05111");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.05111" + "'", str3, "P0Y000DT00000.05111");
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "P0Y0M0DT0H0M0.66S", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.660" + "'", str3, "P0Y000DT00000.660");
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) 1, "P0Y000DT00000.036-100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.036-100" + "'", str3, "P0Y000DT00000.036-100");
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 'a', (long) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.04S" + "'", str2, "P0Y0M0DT0H0M0.04S");
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 100, (long) (byte) -1, "P0Y000DT00000.05236", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.05236" + "'", str5, "P0Y000DT00000.05236");
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) (-1), "P0Y000DT00000.0000", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0000" + "'", str5, "P0Y000DT00000.0000");
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '#', 0L, "P0000Y0M0DT0H0M0.035S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.035-35" + "'", str3, "P0000Y000DT00000.035-35");
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y000DT00000.10-1", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.10-1" + "'", str3, "P0Y000DT00000.10-1");
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), (long) 0, "P0Y000DT00000.0531");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0531" + "'", str3, "P0Y000DT00000.0531");
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(1L, "P0Y000DT00000.03610");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.03610" + "'", str2, "P0Y000DT00000.03610");
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y000DT00000.011", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.011" + "'", str3, "P0Y000DT00000.011");
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.0311");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0311" + "'", str2, "P0Y000DT00000.0311");
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 0, "P0Y000DT00000.000-34", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.000-34" + "'", str3, "P0Y000DT00000.000-34");
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) (byte) 1, "P0000Y000DT00000.10010", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0000Y000DT00000.10010" + "'", str5, "P0000Y000DT00000.10010");
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(1L, "P0Y000DT00000.98-65", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.98-65" + "'", str3, "P0Y000DT00000.98-65");
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) (byte) 100, "P0000Y000DT00000.096-22");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.096-22" + "'", str3, "P0000Y000DT00000.096-22");
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '4', "P0Y0M0DT0H0M0.10S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.1052" + "'", str3, "P0Y000DT00000.1052");
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '4', "P0Y000DT00000.0220");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0220" + "'", str2, "P0Y000DT00000.0220");
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (byte) 10, (long) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.042S" + "'", str2, "P0Y0M0DT0H0M0.042S");
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) 10, "", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) (short) -1, "P0Y000DT00000.320", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.320" + "'", str5, "P0Y000DT00000.320");
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(100L, "P0Y0M0DT0H0M0.68S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.68100" + "'", str3, "P0Y000DT00000.68100");
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) 10, "P0Y000DT00000.6710");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.6710" + "'", str3, "P0Y000DT00000.6710");
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0000Y000DT00000.032-101", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.032-101" + "'", str3, "P0000Y000DT00000.032-101");
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(100L, 1L, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (-1L), "P0000Y000DT00000.0352");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.0352" + "'", str3, "P0000Y000DT00000.0352");
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(100L, "P0Y000DT00000.0659");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0659" + "'", str2, "P0Y000DT00000.0659");
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(100L, (long) (byte) 0, "P0Y000DT00000.47-11");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.47-11" + "'", str3, "P0Y000DT00000.47-11");
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) (byte) 10, "P0Y000DT00000.00935");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00935" + "'", str3, "P0Y000DT00000.00935");
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 10, 100L, "P0Y0M0DT0H0M0.098S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.09890" + "'", str5, "P0Y000DT00000.09890");
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, 10L, "P0Y000DT00000.130", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.130" + "'", str5, "P0Y000DT00000.130");
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) (short) 0, "P0Y000DT00000.470");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.470" + "'", str3, "P0Y000DT00000.470");
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0Y000DT00000.3510");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.3510" + "'", str2, "P0Y000DT00000.3510");
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 10, (long) (short) 1, "P0Y000DT00000.100100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.100100" + "'", str3, "P0Y000DT00000.100100");
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) -1, 100L, "P0Y000DT00000.045-1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.045-1" + "'", str3, "P0Y000DT00000.045-1");
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 1, 0L, "P0Y0M0DT0H0M0.01S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.01-1" + "'", str5, "P0Y000DT00000.01-1");
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y0M0DT0H0M0.101S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.1010" + "'", str3, "P0Y000DT00000.1010");
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0Y000DT00000.090-96", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.090-96" + "'", str3, "P0Y000DT00000.090-96");
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0Y000DT00000.9835", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.9835" + "'", str3, "P0Y000DT00000.9835");
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y000DT00000.01799");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.01799" + "'", str2, "P0Y000DT00000.01799");
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y000DT00000.03210");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.03210" + "'", str2, "P0Y000DT00000.03210");
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) (short) 100, "P0Y000DT00000.89-53", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.89-53" + "'", str5, "P0Y000DT00000.89-53");
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (-1L), "P0Y000DT00000.4997");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.4997" + "'", str3, "P0Y000DT00000.4997");
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.0991");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0991" + "'", str2, "P0Y000DT00000.0991");
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '4', (long) 0, "P0Y000DT00000.0039", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0039" + "'", str5, "P0Y000DT00000.0039");
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '#', (long) 1, "P0Y000DT00000.04890");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.04890" + "'", str3, "P0Y000DT00000.04890");
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) (byte) -1, "P0Y000DT00000.09010");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.09010" + "'", str3, "P0Y000DT00000.09010");
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0000Y000DT00000.0321");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0000Y000DT00000.0321" + "'", str2, "P0000Y000DT00000.0321");
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) ' ', "P0Y000DT00000.13-1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.13-1" + "'", str3, "P0Y000DT00000.13-1");
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0Y000DT00000.09732", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.09732" + "'", str3, "P0Y000DT00000.09732");
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y000DT00000.09710");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.09710" + "'", str2, "P0Y000DT00000.09710");
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 100, "P0Y000DT00000.032-42", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.032-42" + "'", str3, "P0Y000DT00000.032-42");
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '#', (long) (short) 0, "P0Y000DT00000.0990", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0990" + "'", str5, "P0Y000DT00000.0990");
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(10L, (-1L), "P0Y0M0DT0H0M0.48S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.48-11" + "'", str3, "P0Y000DT00000.48-11");
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0000Y000DT00000.032100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0000Y000DT00000.032100" + "'", str2, "P0000Y000DT00000.032100");
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.650", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.650" + "'", str3, "P0Y000DT00000.650");
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 1, (long) (short) 1, "0:00:00.097", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.097" + "'", str5, "0:00:00.097");
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(10L, "P0Y000DT00000.101");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.101" + "'", str2, "P0Y000DT00000.101");
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y000DT00000.068-48");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.068-48" + "'", str2, "P0Y000DT00000.068-48");
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.9710");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.9710" + "'", str2, "P0Y000DT00000.9710");
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (-1), (long) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.053S" + "'", str2, "P0Y0M0DT0H0M0.053S");
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y000DT00000.065-99", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.065-99" + "'", str3, "P0Y000DT00000.065-99");
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y000DT00000.6699");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.6699" + "'", str2, "P0Y000DT00000.6699");
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '4', (long) '#', "P0000Y000DT00000.100-1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.100-1" + "'", str3, "P0000Y000DT00000.100-1");
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, 0L, "P0Y000DT00000.0252");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0252" + "'", str3, "P0Y000DT00000.0252");
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) 0, "P0Y000DT00000.020-100", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.020-100" + "'", str5, "P0Y000DT00000.020-100");
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.100-98", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.100-98" + "'", str3, "P0Y000DT00000.100-98");
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 10, (long) '#', "P0Y000DT00000.78-11");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.78-11" + "'", str3, "P0Y000DT00000.78-11");
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y000DT00000.5211");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.5211" + "'", str2, "P0Y000DT00000.5211");
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 10, 0L, "P0Y000DT00000.036100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.036100" + "'", str3, "P0Y000DT00000.036100");
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 1, 1L, "P0Y000DT00000.036-98");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.036-98" + "'", str3, "P0Y000DT00000.036-98");
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y000DT00000.32100", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.32100" + "'", str3, "P0Y000DT00000.32100");
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (short) 1, "P0Y000DT00000.990");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.990" + "'", str3, "P0Y000DT00000.990");
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 10, 100L, "0:00:00.000", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), (long) ' ', "P0000Y000DT00000.03510");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.03510" + "'", str3, "P0000Y000DT00000.03510");
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.9810", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.9810" + "'", str3, "P0Y000DT00000.9810");
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y0M0DT0H0M0.66S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.66-1" + "'", str3, "P0Y000DT00000.66-1");
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 10, (long) (byte) -1, "P0Y000DT00000.1001");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.1001" + "'", str3, "P0Y000DT00000.1001");
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 100, "0:00:00.035", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.035" + "'", str3, "0:00:00.035");
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 10, "P0Y000DT00000.025-10", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.025-10" + "'", str3, "P0Y000DT00000.025-10");
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '4', (long) 0, "P0Y000DT00000.100-90", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.100-90" + "'", str5, "P0Y000DT00000.100-90");
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, 100L, "P0Y000DT00000.781");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.781" + "'", str3, "P0Y000DT00000.781");
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '#', "0 0a000 0 hour 0 0inute00 0 econ00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0 0a000 0 hour 0 0inute00 0 econ00" + "'", str2, "0 0a000 0 hour 0 0inute00 0 econ00");
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 100, 100L, "P0Y000DT00000.00-1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00-1" + "'", str3, "P0Y000DT00000.00-1");
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(100L, (long) 1, "P0Y000DT00000.98-97");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.98-97" + "'", str3, "P0Y000DT00000.98-97");
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y000DT00000.00087");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.00087" + "'", str2, "P0Y000DT00000.00087");
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 10, (long) 100, "P0Y000DT00000.0870");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0870" + "'", str3, "P0Y000DT00000.0870");
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.001-11", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.001-11" + "'", str3, "P0Y000DT00000.001-11");
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) '#', "P0Y000DT00000.0011");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0011" + "'", str3, "P0Y000DT00000.0011");
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (-1), (long) 100, "P0Y000DT00000.97100", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.97100" + "'", str5, "P0Y000DT00000.97100");
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0Y000DT00000.00-2", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00-2" + "'", str3, "P0Y000DT00000.00-2");
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, 1L, "P0Y000DT00000.035-1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.035-1" + "'", str3, "P0Y000DT00000.035-1");
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y0M0DT0H0M0.00S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0032" + "'", str2, "P0Y000DT00000.0032");
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 10, "P0Y000DT00000.0681");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0681" + "'", str2, "P0Y000DT00000.0681");
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) (byte) 10, "P0Y000DT00000.00222");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00222" + "'", str3, "P0Y000DT00000.00222");
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) (short) -1, "P0Y000DT00000.05310");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.05310" + "'", str3, "P0Y000DT00000.05310");
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) ' ', (long) 100, "P0Y000DT00000.66-1", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.66-1" + "'", str5, "P0Y000DT00000.66-1");
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) (short) 10, "P0Y000DT00000.640");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.640" + "'", str3, "P0Y000DT00000.640");
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '4', (long) 0, "P0Y000DT00000.1068", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.1068" + "'", str5, "P0Y000DT00000.1068");
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '#', "0 days 0 hours 0 minutes 0 seconds");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0 0a000 0 hour 0 0inute00 0 econ00" + "'", str2, "0 0a000 0 hour 0 0inute00 0 econ00");
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y000DT00000.03610");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.03610" + "'", str2, "P0Y000DT00000.03610");
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 'a', "P0000Y000DT00000.035-100", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.035-100" + "'", str3, "P0000Y000DT00000.035-100");
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) (byte) 1, "P0Y0M0DT0H0M0.97S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.971" + "'", str5, "P0Y000DT00000.971");
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.0132");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0132" + "'", str2, "P0Y000DT00000.0132");
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) -1, 100L, "P0Y000DT00000.0000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0000" + "'", str3, "P0Y000DT00000.0000");
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(1L, (long) (short) 0, "P0Y000DT00000.750", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.750" + "'", str5, "P0Y000DT00000.750");
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y000DT00000.022100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.022100" + "'", str2, "P0Y000DT00000.022100");
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.002100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.002100" + "'", str2, "P0Y000DT00000.002100");
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, 10L, "", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y000DT00000.06511", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.06511" + "'", str3, "P0Y000DT00000.06511");
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(100L, "P0Y000DT00000.0870");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0870" + "'", str2, "P0Y000DT00000.0870");
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) '4', 100L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.048S" + "'", str2, "P0Y0M0DT0H0M0.048S");
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(100L, (long) ' ', "P0Y000DT00000.641");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.641" + "'", str3, "P0Y000DT00000.641");
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(100L, "P0Y000DT00000.64-51");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.64-51" + "'", str2, "P0Y000DT00000.64-51");
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (-1L), "P0Y000DT00000.6732");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.6732" + "'", str3, "P0Y000DT00000.6732");
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 1, "P0Y000DT00000.04810");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.04810" + "'", str2, "P0Y000DT00000.04810");
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '#', "P0Y000DT00000.001-11");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.001-11" + "'", str2, "P0Y000DT00000.001-11");
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y000DT00000.03334", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.03334" + "'", str3, "P0Y000DT00000.03334");
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y000DT00000.651");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.651" + "'", str2, "P0Y000DT00000.651");
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) (-1), "P0Y000DT00000.89101", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.89101" + "'", str5, "P0Y000DT00000.89101");
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(10L, 1L, "P0Y000DT00000.00311");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00311" + "'", str3, "P0Y000DT00000.00311");
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(100L, (long) 'a', "P0Y000DT00000.022-25");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.022-25" + "'", str3, "P0Y000DT00000.022-25");
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 10, (long) (byte) 0, "0:00:00.000", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(10L, (long) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.89S" + "'", str2, "P0Y0M0DT0H0M0.89S");
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0Y000DT00000.98-10");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.98-10" + "'", str2, "P0Y000DT00000.98-10");
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '#', "P0Y000DT00000.011-68");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.011-68" + "'", str2, "P0Y000DT00000.011-68");
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) ' ', 0L, "P0Y000DT00000.0989", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0989" + "'", str5, "P0Y000DT00000.0989");
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 10, "P0Y000DT00000.0111", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0111" + "'", str3, "P0Y000DT00000.0111");
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0Y000DT00000.0110");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0110" + "'", str2, "P0Y000DT00000.0110");
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "P0Y0M0DT0H0M0.068S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0680" + "'", str3, "P0Y000DT00000.0680");
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 'a', (long) '4', "P0000Y000DT00000.035-35", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0000Y000DT00000.035-35" + "'", str5, "P0000Y000DT00000.035-35");
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0Y000DT00000.0651");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0651" + "'", str2, "P0Y000DT00000.0651");
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '#', "P0Y000DT00000.00110");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.00110" + "'", str2, "P0Y000DT00000.00110");
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y000DT00000.009100", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.009100" + "'", str3, "P0Y000DT00000.009100");
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) (short) -1, "P0Y000DT00000.97100", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.97100" + "'", str5, "P0Y000DT00000.97100");
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 100, "P0000Y000DT00000.99100", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.99100" + "'", str3, "P0000Y000DT00000.99100");
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) 1, "P0000Y000DT00000.096-25");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.096-25" + "'", str3, "P0000Y000DT00000.096-25");
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) -1, 100L, "P0Y000DT00000.003-101", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.003-101" + "'", str5, "P0Y000DT00000.003-101");
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0Y000DT00000.03197");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.03197" + "'", str2, "P0Y000DT00000.03197");
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0000Y000DT00000.9910", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.9910" + "'", str3, "P0000Y000DT00000.9910");
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) -1, 0L, "P0Y000DT00000.0039");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0039" + "'", str3, "P0Y000DT00000.0039");
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y000DT00000.1052", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.1052" + "'", str3, "P0Y000DT00000.1052");
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(10L, "P0Y0M0DT0H0M0.80S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.8010" + "'", str3, "P0Y000DT00000.8010");
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) (byte) 1, "P0Y000DT00000.04232", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.04232" + "'", str5, "P0Y000DT00000.04232");
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '4', "P0Y000DT00000.02-101");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.02-101" + "'", str2, "P0Y000DT00000.02-101");
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) (-1), "P0Y000DT00000.04-87", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.04-87" + "'", str5, "P0Y000DT00000.04-87");
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (short) 10, "P0Y0M0DT0H0M0.068S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.068-87" + "'", str3, "P0Y000DT00000.068-87");
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (byte) -1, "P0Y000DT00000.99-1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.99-1" + "'", str3, "P0Y000DT00000.99-1");
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 1, (long) 1, "P0Y000DT00000.0170");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0170" + "'", str3, "P0Y000DT00000.0170");
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-1L), "P0Y000DT00000.99-1", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.99-1" + "'", str3, "P0Y000DT00000.99-1");
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 10, 10L, "P0Y000DT00000.09887", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.09887" + "'", str5, "P0Y000DT00000.09887");
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 1, "P0000Y000DT00000.991", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.991" + "'", str3, "P0000Y000DT00000.991");
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), (long) (short) 10, "P0000Y000DT00000.096-22");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.096-22" + "'", str3, "P0000Y000DT00000.096-22");
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) ' ', "P0Y000DT00000.053-1", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.053-1" + "'", str5, "P0Y000DT00000.053-1");
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 0, (long) 1, "P0000Y000DT00000.032-22");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.032-22" + "'", str3, "P0000Y000DT00000.032-22");
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y000DT00000.69-100", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.69-100" + "'", str3, "P0Y000DT00000.69-100");
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) (short) 1, "P0Y000DT00000.32-1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.32-1" + "'", str3, "P0Y000DT00000.32-1");
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) -1, (-1L), "P0Y000DT00000.087-53");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.087-53" + "'", str3, "P0Y000DT00000.087-53");
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (byte) -1, "P0Y000DT00000.042-1", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.042-1" + "'", str5, "P0Y000DT00000.042-1");
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) (short) 1, "P0Y000DT00000.003-31", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.003-31" + "'", str5, "P0Y000DT00000.003-31");
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y000DT00000.05131", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.05131" + "'", str3, "P0Y000DT00000.05131");
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 10, "P0Y000DT00000.035100", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.035100" + "'", str3, "P0Y000DT00000.035100");
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(10L, "P0Y000DT00000.6699", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.6699" + "'", str3, "P0Y000DT00000.6699");
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 10, "P0Y000DT00000.090-98", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.090-98" + "'", str3, "P0Y000DT00000.090-98");
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 10, "P0Y000DT00000.03142", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.03142" + "'", str3, "P0Y000DT00000.03142");
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 0, (long) (byte) 1, "P0000Y000DT00000.035-1", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0000Y000DT00000.035-1" + "'", str5, "P0000Y000DT00000.035-1");
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (byte) -1, "P0Y000DT00000.100-90");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.100-90" + "'", str3, "P0Y000DT00000.100-90");
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) 0, "P0Y000DT00000.00210", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.00210" + "'", str5, "P0Y000DT00000.00210");
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 10, "P0000Y000DT00000.096-99", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.096-99" + "'", str3, "P0000Y000DT00000.096-99");
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 1, (long) 100, "P0Y000DT00000.025-1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.025-1" + "'", str3, "P0Y000DT00000.025-1");
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 1, "P0Y0M0DT0H0M0.052S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0521" + "'", str2, "P0Y000DT00000.0521");
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) (short) 0, "P0Y000DT00000.100-1", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.100-1" + "'", str5, "P0Y000DT00000.100-1");
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (-1L), "P0Y0M0DT0H0M0.097S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.097-1" + "'", str3, "P0Y000DT00000.097-1");
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.042-1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.042-1" + "'", str2, "P0Y000DT00000.042-1");
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 10, "P0000Y000DT00000.0350", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.0350" + "'", str3, "P0000Y000DT00000.0350");
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 10, 0L, "P0Y000DT00000.00-1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00-1" + "'", str3, "P0Y000DT00000.00-1");
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y0M0DT0H0M0.052S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.052100" + "'", str2, "P0Y000DT00000.052100");
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0Y000DT00000.49-1", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.49-1" + "'", str3, "P0Y000DT00000.49-1");
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0Y000DT00000.03210");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.03210" + "'", str2, "P0Y000DT00000.03210");
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.521");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.521" + "'", str2, "P0Y000DT00000.521");
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) (byte) 10, "P0Y000DT00000.0901");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0901" + "'", str3, "P0Y000DT00000.0901");
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0Y0M0DT0H0M0.087S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0871" + "'", str2, "P0Y000DT00000.0871");
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y000DT00000.0221");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0221" + "'", str2, "P0Y000DT00000.0221");
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) (short) 10, "P0Y000DT00000.0681", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0681" + "'", str5, "P0Y000DT00000.0681");
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '#', (long) '4', "P0Y000DT00000.00090", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.00090" + "'", str5, "P0Y000DT00000.00090");
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 100, "P0000Y0M0DT0H0M0.096S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.096100" + "'", str3, "P0000Y000DT00000.096100");
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) 1, "P0Y000DT00000.02568");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.02568" + "'", str3, "P0Y000DT00000.02568");
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 10, 1L, "P0Y000DT00000.032-99", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.032-99" + "'", str5, "P0Y000DT00000.032-99");
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) ' ', "P0000Y000DT00000.03232", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.03232" + "'", str3, "P0000Y000DT00000.03232");
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 10, (long) (short) 10, "P0Y0M0DT0H0M0.101S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.1010" + "'", str3, "P0Y000DT00000.1010");
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) (byte) 10, "P0Y000DT00000.00110", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.00110" + "'", str5, "P0Y000DT00000.00110");
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "P0Y0M0DT0H0M0.47S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.470" + "'", str3, "P0Y000DT00000.470");
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 'a', 0L, "P0Y000DT00000.01710", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.01710" + "'", str5, "P0Y000DT00000.01710");
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 100, 1L, "P0Y000DT00000.0481");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0481" + "'", str3, "P0Y000DT00000.0481");
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) ' ', 0L, "P0Y000DT00000.0871");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0871" + "'", str3, "P0Y000DT00000.0871");
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) 'a', "", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "P0Y0M0DT0H0M0.99S", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.990" + "'", str3, "P0Y000DT00000.990");
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) (byte) 1, "P0Y000DT00000.02-2", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.02-2" + "'", str5, "P0Y000DT00000.02-2");
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) ' ', "P0Y000DT00000.00935", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.00935" + "'", str5, "P0Y000DT00000.00935");
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (byte) -1, (-1L));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2, "P0Y0M0DT0H0M0.000S");
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y000DT00000.9835", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.9835" + "'", str3, "P0Y000DT00000.9835");
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-1L), "P0000Y000DT00000.03534", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.03534" + "'", str3, "P0000Y000DT00000.03534");
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(1L, (long) 0, "P0Y000DT00000.1000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.1000" + "'", str3, "P0Y000DT00000.1000");
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 'a', (long) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.13S" + "'", str2, "P0Y0M0DT0H0M0.13S");
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 10, (long) '4', "P0Y000DT00000.0001");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0001" + "'", str3, "P0Y000DT00000.0001");
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) 100, "P0000Y000DT00000.035-9");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.035-9" + "'", str3, "P0000Y000DT00000.035-9");
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 'a', (long) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.03S" + "'", str2, "P0Y0M0DT0H0M0.03S");
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 0, "0 days 0 hours 0 minutes 0 seconds", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 0a00 0 hour 0 0inute0 0 econ00" + "'", str3, "0 0a00 0 hour 0 0inute0 0 econ00");
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 10, (long) (-1), "P0000Y000DT00000.99-1", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0000Y000DT00000.99-1" + "'", str5, "P0000Y000DT00000.99-1");
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 10, "P0Y000DT00000.9132", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.9132" + "'", str3, "P0Y000DT00000.9132");
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(1L, "P0Y000DT00000.052101");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.052101" + "'", str2, "P0Y000DT00000.052101");
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4712");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y0M0DT0H0M0.090S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.090100" + "'", str3, "P0Y000DT00000.090100");
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 'a', 0L, "P0Y000DT00000.0681");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0681" + "'", str3, "P0Y000DT00000.0681");
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4714");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 0, (-1L), "P0Y000DT00000.5211", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.5211" + "'", str5, "P0Y000DT00000.5211");
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4715");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, 0L, "P0Y0M0DT0H0M0.022S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0220" + "'", str5, "P0Y000DT00000.0220");
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 1, 1L, "P0Y000DT00000.099100", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.099100" + "'", str5, "P0Y000DT00000.099100");
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4717");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y000DT00000.641", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.641" + "'", str3, "P0Y000DT00000.641");
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4718");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y000DT00000.6997");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.6997" + "'", str2, "P0Y000DT00000.6997");
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4719");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "P0Y0M0DT0H0M0.087S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0870" + "'", str3, "P0Y000DT00000.0870");
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4720");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-1L), "P0Y000DT00000.4997", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.4997" + "'", str3, "P0Y000DT00000.4997");
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4721");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 10, "P0Y000DT00000.05111", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.05111" + "'", str3, "P0Y000DT00000.05111");
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4722");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) (byte) 100, "", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4723");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) 0, "P0Y000DT00000.0521");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0521" + "'", str3, "P0Y000DT00000.0521");
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4724");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), (-1L), "P0Y000DT00000.10-90", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.10-90" + "'", str5, "P0Y000DT00000.10-90");
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4725");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 10, "P0Y000DT00000.032-101", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.032-101" + "'", str3, "P0Y000DT00000.032-101");
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4726");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) (byte) 100, "P0Y000DT00000.98-100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.98-100" + "'", str3, "P0Y000DT00000.98-100");
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4727");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 100, (long) 10, "P0Y000DT00000.01735");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.01735" + "'", str3, "P0Y000DT00000.01735");
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4728");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (-1), (long) (byte) -1, "P0Y000DT00000.02-100", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.02-100" + "'", str5, "P0Y000DT00000.02-100");
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4729");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 100, (long) (byte) 10, "", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4730");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '#', (long) 10, "P0Y000DT00000.91-48");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.91-48" + "'", str3, "P0Y000DT00000.91-48");
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4731");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) 'a', "P0Y000DT00000.3290");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.3290" + "'", str3, "P0Y000DT00000.3290");
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4732");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.033-2");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.033-2" + "'", str2, "P0Y000DT00000.033-2");
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4733");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y000DT00000.090-36");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.090-36" + "'", str2, "P0Y000DT00000.090-36");
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4734");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(100L, "P0Y0M0DT0H0M0.03S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.03100" + "'", str2, "P0Y000DT00000.03100");
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4735");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y000DT00000.5832");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.5832" + "'", str2, "P0Y000DT00000.5832");
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4736");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 0, (long) ' ', "P0Y0M0DT0H0M0.010S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.01032" + "'", str5, "P0Y000DT00000.01032");
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4737");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y0M0DT0H0M0.35S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.350" + "'", str3, "P0Y000DT00000.350");
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4738");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0Y000DT00000.0970", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0970" + "'", str3, "P0Y000DT00000.0970");
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4739");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(100L, "P0Y000DT00000.0110");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0110" + "'", str2, "P0Y000DT00000.0110");
    }

    @Test
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4740");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(10L, (long) '4', "P0Y000DT00000.01799");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.01799" + "'", str3, "P0Y000DT00000.01799");
    }

    @Test
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4741");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 0, "P0Y000DT00000.03117", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.03117" + "'", str3, "P0Y000DT00000.03117");
    }

    @Test
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4742");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(10L, (long) 0, "P0Y000DT00000.64-51");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.64-51" + "'", str3, "P0Y000DT00000.64-51");
    }

    @Test
    public void test4743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4743");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.034-51", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.034-51" + "'", str3, "P0Y000DT00000.034-51");
    }

    @Test
    public void test4744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4744");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(100L, (long) 100, "P0Y000DT00000.021");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.021" + "'", str3, "P0Y000DT00000.021");
    }

    @Test
    public void test4745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4745");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y000DT00000.00110");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.00110" + "'", str2, "P0Y000DT00000.00110");
    }

    @Test
    public void test4746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4746");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) ' ', (long) (short) 10, "P0Y000DT00000.47-10", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.47-10" + "'", str5, "P0Y000DT00000.47-10");
    }

    @Test
    public void test4747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4747");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0Y000DT00000.031-1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.031-1" + "'", str2, "P0Y000DT00000.031-1");
    }

    @Test
    public void test4748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4748");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 10, (-1L), "P0Y000DT00000.4710");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.4710" + "'", str3, "P0Y000DT00000.4710");
    }

    @Test
    public void test4749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4749");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '4', 0L, "P0Y000DT00000.02035");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.02035" + "'", str3, "P0Y000DT00000.02035");
    }

    @Test
    public void test4750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4750");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) (-1), "P0000Y0M0DT0H0M0.001S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0000Y000DT00000.001-101" + "'", str5, "P0000Y000DT00000.001-101");
    }

    @Test
    public void test4751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4751");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(10L, (long) (byte) 10, "P0Y000DT00000.003-31", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.003-31" + "'", str5, "P0Y000DT00000.003-31");
    }

    @Test
    public void test4752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4752");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(10L, 0L, "P0Y0M0DT0H0M0.100S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.100-10" + "'", str5, "P0Y000DT00000.100-10");
    }

    @Test
    public void test4753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4753");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(10L, 0L, "P0Y000DT00000.011100", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.011100" + "'", str5, "P0Y000DT00000.011100");
    }

    @Test
    public void test4754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4754");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (-1), (long) 10, "P0Y000DT00000.090-98", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.090-98" + "'", str5, "P0Y000DT00000.090-98");
    }

    @Test
    public void test4755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4755");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(1L, (long) (-1), "P0Y000DT00000.0200");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0200" + "'", str3, "P0Y000DT00000.0200");
    }

    @Test
    public void test4756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4756");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), 10L, "P0Y000DT00000.0310", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0310" + "'", str5, "P0Y000DT00000.0310");
    }

    @Test
    public void test4757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4757");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(10L, (long) 'a', "P0000Y000DT00000.0351", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0000Y000DT00000.0351" + "'", str5, "P0000Y000DT00000.0351");
    }

    @Test
    public void test4758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4758");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) (short) 1, "P0Y000DT00000.0900", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0900" + "'", str5, "P0Y000DT00000.0900");
    }

    @Test
    public void test4759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4759");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 0, (long) (byte) 1, "P0Y000DT00000.0321", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0321" + "'", str5, "P0Y000DT00000.0321");
    }

    @Test
    public void test4760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4760");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) -1, 0L, "P0Y0M0DT0H0M0.017S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0171" + "'", str3, "P0Y000DT00000.0171");
    }

    @Test
    public void test4761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4761");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.9132");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.9132" + "'", str2, "P0Y000DT00000.9132");
    }

    @Test
    public void test4762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4762");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 1, (long) (short) 100, "P0000Y000DT00000.100-1", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0000Y000DT00000.100-1" + "'", str5, "P0000Y000DT00000.100-1");
    }

    @Test
    public void test4763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4763");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 100, (long) (short) 100, "P0Y000DT00000.0621");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0621" + "'", str3, "P0Y000DT00000.0621");
    }

    @Test
    public void test4764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4764");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-1L), "P0Y000DT00000.0110", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0110" + "'", str3, "P0Y000DT00000.0110");
    }

    @Test
    public void test4765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4765");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y000DT00000.6710", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.6710" + "'", str3, "P0Y000DT00000.6710");
    }

    @Test
    public void test4766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4766");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 10, (long) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.89S" + "'", str2, "P0Y0M0DT0H0M0.89S");
    }

    @Test
    public void test4767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4767");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) (byte) -1, "P0000Y000DT00000.035-100", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0000Y000DT00000.035-100" + "'", str5, "P0000Y000DT00000.035-100");
    }

    @Test
    public void test4768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4768");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (-1L), "P0000Y0M0DT0H0M0.096S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.096-1" + "'", str3, "P0000Y000DT00000.096-1");
    }

    @Test
    public void test4769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4769");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '4', (long) (byte) 0, "P0Y000DT00000.10-1", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.10-1" + "'", str5, "P0Y000DT00000.10-1");
    }

    @Test
    public void test4770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4770");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0Y000DT00000.032-101", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.032-101" + "'", str3, "P0Y000DT00000.032-101");
    }

    @Test
    public void test4771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4771");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) 'a', "P0Y0M0DT0H0M0.00S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0098" + "'", str3, "P0Y000DT00000.0098");
    }

    @Test
    public void test4772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4772");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y0M0DT0H0M0.78S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.7832" + "'", str2, "P0Y000DT00000.7832");
    }

    @Test
    public void test4773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4773");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 0, (long) (byte) 1, "P0Y000DT00000.03117");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.03117" + "'", str3, "P0Y000DT00000.03117");
    }

    @Test
    public void test4774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4774");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "P0000Y000DT00000.096-99");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0000Y000DT00000.096-99" + "'", str2, "P0000Y000DT00000.096-99");
    }

    @Test
    public void test4775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4775");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(100L, "P0Y000DT00000.00090", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00090" + "'", str3, "P0Y000DT00000.00090");
    }

    @Test
    public void test4776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4776");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '4', "P0Y0M0DT0H0M0.38S", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.3852" + "'", str3, "P0Y000DT00000.3852");
    }

    @Test
    public void test4777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4777");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.69-2", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.69-2" + "'", str3, "P0Y000DT00000.69-2");
    }

    @Test
    public void test4778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4778");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 10, 10L, "P0Y000DT00000.0522", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0522" + "'", str5, "P0Y000DT00000.0522");
    }

    @Test
    public void test4779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4779");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y000DT00000.351", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.351" + "'", str3, "P0Y000DT00000.351");
    }

    @Test
    public void test4780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4780");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) -1, "P0000Y000DT00000.03552", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0000Y000DT00000.03552" + "'", str5, "P0000Y000DT00000.03552");
    }

    @Test
    public void test4781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4781");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), (long) 100, "P0Y000DT00000.04510");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.04510" + "'", str3, "P0Y000DT00000.04510");
    }

    @Test
    public void test4782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4782");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 0, "P0Y0M0DT0H0M0.89S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.890" + "'", str2, "P0Y000DT00000.890");
    }

    @Test
    public void test4783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4783");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 0, (long) 10, "P0Y000DT00000.06299", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.06299" + "'", str5, "P0Y000DT00000.06299");
    }

    @Test
    public void test4784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4784");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '#', "P0Y0M0DT0H0M0.031S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.03135" + "'", str3, "P0Y000DT00000.03135");
    }

    @Test
    public void test4785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4785");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) '4', (long) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.83S" + "'", str2, "P0Y0M0DT0H0M0.83S");
    }

    @Test
    public void test4786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4786");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 100, 10L, "P0Y000DT00000.100100", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.100100" + "'", str5, "P0Y000DT00000.100100");
    }

    @Test
    public void test4787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4787");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0Y000DT00000.100-98");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.100-98" + "'", str2, "P0Y000DT00000.100-98");
    }

    @Test
    public void test4788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4788");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y000DT00000.034-1", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.034-1" + "'", str3, "P0Y000DT00000.034-1");
    }

    @Test
    public void test4789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4789");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 10, 1L, "P0Y000DT00000.09710", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.09710" + "'", str5, "P0Y000DT00000.09710");
    }

    @Test
    public void test4790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4790");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 'a', "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0000Y0M0DT0H0M0.097S" + "'", str2, "P0000Y0M0DT0H0M0.097S");
    }

    @Test
    public void test4791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4791");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '4', 0L, "P0Y000DT00000.6699");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.6699" + "'", str3, "P0Y000DT00000.6699");
    }

    @Test
    public void test4792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4792");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '#', (long) (byte) 1, "P0Y0M0DT0H0M0.052S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.052-34" + "'", str3, "P0Y000DT00000.052-34");
    }

    @Test
    public void test4793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4793");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 10, "P0Y000DT00000.680", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.680" + "'", str3, "P0Y000DT00000.680");
    }

    @Test
    public void test4794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4794");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y000DT00000.034-31", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.034-31" + "'", str3, "P0Y000DT00000.034-31");
    }

    @Test
    public void test4795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4795");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0000Y000DT00000.0960");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0000Y000DT00000.0960" + "'", str2, "P0000Y000DT00000.0960");
    }

    @Test
    public void test4796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4796");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) (short) -1, "P0Y000DT00000.101");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.101" + "'", str3, "P0Y000DT00000.101");
    }

    @Test
    public void test4797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4797");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 10, (long) (short) 0, "P0Y000DT00000.6625", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.6625" + "'", str5, "P0Y000DT00000.6625");
    }

    @Test
    public void test4798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4798");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-1L), "P0000Y000DT00000.035-1", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.035-1" + "'", str3, "P0000Y000DT00000.035-1");
    }

    @Test
    public void test4799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4799");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) (-1), "P0Y0M0DT0H0M0.52S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.52-2" + "'", str3, "P0Y000DT00000.52-2");
    }

    @Test
    public void test4800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4800");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 10, "P0Y000DT00000.91-9");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.91-9" + "'", str2, "P0Y000DT00000.91-9");
    }

    @Test
    public void test4801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4801");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (short) 1, "P0Y0M0DT0H0M0.75S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.75-96" + "'", str3, "P0Y000DT00000.75-96");
    }

    @Test
    public void test4802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4802");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 10, (long) (byte) -1, "P0Y000DT00000.020", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.020" + "'", str5, "P0Y000DT00000.020");
    }

    @Test
    public void test4803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4803");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(100L, (long) (byte) 1, "P0Y000DT00000.99-11", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.99-11" + "'", str5, "P0Y000DT00000.99-11");
    }

    @Test
    public void test4804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4804");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y000DT00000.00097", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00097" + "'", str3, "P0Y000DT00000.00097");
    }

    @Test
    public void test4805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4805");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 'a', "P0000Y000DT00000.9910", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.9910" + "'", str3, "P0000Y000DT00000.9910");
    }

    @Test
    public void test4806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4806");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 1, 0L, "P0Y000DT00000.4748");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.4748" + "'", str3, "P0Y000DT00000.4748");
    }

    @Test
    public void test4807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4807");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) 0, "P0Y000DT00000.7810");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.7810" + "'", str3, "P0Y000DT00000.7810");
    }

    @Test
    public void test4808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4808");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), (long) 100, "P0Y000DT00000.001-11");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.001-11" + "'", str3, "P0Y000DT00000.001-11");
    }

    @Test
    public void test4809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4809");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 1, 10L, "P0Y000DT00000.090-96");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.090-96" + "'", str3, "P0Y000DT00000.090-96");
    }

    @Test
    public void test4810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4810");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y000DT00000.053-11");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.053-11" + "'", str2, "P0Y000DT00000.053-11");
    }

    @Test
    public void test4811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4811");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 10, (long) 'a', "P0Y000DT00000.021");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.021" + "'", str3, "P0Y000DT00000.021");
    }

    @Test
    public void test4812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4812");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.0200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0200" + "'", str2, "P0Y000DT00000.0200");
    }

    @Test
    public void test4813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4813");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 0, (long) 1, "P0Y000DT00000.6597");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.6597" + "'", str3, "P0Y000DT00000.6597");
    }

    @Test
    public void test4814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4814");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '4', "P0Y0M0DT0H0M0.100S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.10052" + "'", str3, "P0Y000DT00000.10052");
    }

    @Test
    public void test4815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4815");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y000DT00000.98101", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.98101" + "'", str3, "P0Y000DT00000.98101");
    }

    @Test
    public void test4816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4816");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(10L, "P0Y000DT00000.35-1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.35-1" + "'", str2, "P0Y000DT00000.35-1");
    }

    @Test
    public void test4817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4817");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 1, (long) '#', "P0000Y000DT00000.991");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.991" + "'", str3, "P0000Y000DT00000.991");
    }

    @Test
    public void test4818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4818");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 100, "P0Y000DT00000.010-25", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.010-25" + "'", str3, "P0Y000DT00000.010-25");
    }

    @Test
    public void test4819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4819");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-1L), "P0Y000DT00000.052-1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.052-1" + "'", str2, "P0Y000DT00000.052-1");
    }

    @Test
    public void test4820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4820");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y000DT00000.6410", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.6410" + "'", str3, "P0Y000DT00000.6410");
    }

    @Test
    public void test4821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4821");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) (short) 0, "P0000Y000DT00000.0321", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0000Y000DT00000.0321" + "'", str5, "P0000Y000DT00000.0321");
    }

    @Test
    public void test4822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4822");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) (short) 10, "P0Y000DT00000.034-3");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.034-3" + "'", str3, "P0Y000DT00000.034-3");
    }

    @Test
    public void test4823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4823");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) '4', "P0Y0M0DT0H0M0.062S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.06252" + "'", str3, "P0Y000DT00000.06252");
    }

    @Test
    public void test4824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4824");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) (byte) 100, "P0Y000DT00000.01735");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.01735" + "'", str3, "P0Y000DT00000.01735");
    }

    @Test
    public void test4825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4825");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '#', "P0Y000DT00000.0481", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0481" + "'", str3, "P0Y000DT00000.0481");
    }

    @Test
    public void test4826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4826");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 100, (long) (short) 1, "P0Y000DT00000.4790", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.4790" + "'", str5, "P0Y000DT00000.4790");
    }

    @Test
    public void test4827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4827");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(10L, "P0Y000DT00000.6890");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.6890" + "'", str2, "P0Y000DT00000.6890");
    }

    @Test
    public void test4828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4828");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(100L, "P0Y000DT00000.03197", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.03197" + "'", str3, "P0Y000DT00000.03197");
    }

    @Test
    public void test4829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4829");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '4', 0L, "P0Y000DT00000.58-97");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.58-97" + "'", str3, "P0Y000DT00000.58-97");
    }

    @Test
    public void test4830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4830");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0000Y000DT00000.096-10");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0000Y000DT00000.096-10" + "'", str2, "P0000Y000DT00000.096-10");
    }

    @Test
    public void test4831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4831");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y000DT00000.065-1", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.065-1" + "'", str3, "P0Y000DT00000.065-1");
    }

    @Test
    public void test4832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4832");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) 0, "P0Y000DT00000.090-36", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.090-36" + "'", str5, "P0Y000DT00000.090-36");
    }

    @Test
    public void test4833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4833");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) 1, "P0Y000DT00000.012");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.012" + "'", str3, "P0Y000DT00000.012");
    }

    @Test
    public void test4834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4834");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y000DT00000.09790");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.09790" + "'", str2, "P0Y000DT00000.09790");
    }

    @Test
    public void test4835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4835");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(10L, "P0Y000DT00000.001-100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.001-100" + "'", str2, "P0Y000DT00000.001-100");
    }

    @Test
    public void test4836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4836");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(10L, (long) (-1), "P0Y0M0DT0H0M0.000S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.000-11" + "'", str3, "P0Y000DT00000.000-11");
    }

    @Test
    public void test4837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4837");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) -1, 0L, "P0Y000DT00000.32-1", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.32-1" + "'", str5, "P0Y000DT00000.32-1");
    }

    @Test
    public void test4838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4838");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(10L, (long) 100, "P0Y000DT00000.100100", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.100100" + "'", str5, "P0Y000DT00000.100100");
    }

    @Test
    public void test4839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4839");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 10, "P0Y000DT00000.010-11", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.010-11" + "'", str3, "P0Y000DT00000.010-11");
    }

    @Test
    public void test4840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4840");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(10L, 0L, "P0000Y000DT00000.03232");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.03232" + "'", str3, "P0000Y000DT00000.03232");
    }

    @Test
    public void test4841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4841");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y000DT00000.0311", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0311" + "'", str3, "P0Y000DT00000.0311");
    }

    @Test
    public void test4842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4842");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (-1L), "P0Y000DT00000.02-2");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.02-2" + "'", str3, "P0Y000DT00000.02-2");
    }

    @Test
    public void test4843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4843");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 100, "P0Y000DT00000.0171");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0171" + "'", str2, "P0Y000DT00000.0171");
    }

    @Test
    public void test4844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4844");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y000DT00000.90-2");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.90-2" + "'", str2, "P0Y000DT00000.90-2");
    }

    @Test
    public void test4845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4845");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) 'a', "P0Y000DT00000.0209");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0209" + "'", str3, "P0Y000DT00000.0209");
    }

    @Test
    public void test4846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4846");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) (-1), "P0Y000DT00000.06252", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.06252" + "'", str5, "P0Y000DT00000.06252");
    }

    @Test
    public void test4847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4847");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (short) 1, "P0Y000DT00000.033-34", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.033-34" + "'", str5, "P0Y000DT00000.033-34");
    }

    @Test
    public void test4848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4848");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0Y000DT00000.03631", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.03631" + "'", str3, "P0Y000DT00000.03631");
    }

    @Test
    public void test4849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4849");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), (long) (short) 100, "P0Y000DT00000.03135", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.03135" + "'", str5, "P0Y000DT00000.03135");
    }

    @Test
    public void test4850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4850");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '4', (long) ' ', "P0000Y0M0DT0H0M0.035S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0000Y000DT00000.035-20" + "'", str5, "P0000Y000DT00000.035-20");
    }

    @Test
    public void test4851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4851");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.022-1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.022-1" + "'", str2, "P0Y000DT00000.022-1");
    }

    @Test
    public void test4852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4852");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) 100, "P0Y000DT00000.032100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.032100" + "'", str3, "P0Y000DT00000.032100");
    }

    @Test
    public void test4853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4853");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 10, "P0Y000DT00000.042100", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.042100" + "'", str3, "P0Y000DT00000.042100");
    }

    @Test
    public void test4854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4854");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(10L, "P0Y000DT00000.032-101");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.032-101" + "'", str2, "P0Y000DT00000.032-101");
    }

    @Test
    public void test4855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4855");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y000DT00000.052100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.052100" + "'", str2, "P0Y000DT00000.052100");
    }

    @Test
    public void test4856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4856");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 100, 100L, "P0Y000DT00000.097-35", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.097-35" + "'", str5, "P0Y000DT00000.097-35");
    }

    @Test
    public void test4857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4857");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, 10L, "P0Y0M0DT0H0M0.000S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.00010" + "'", str5, "P0Y000DT00000.00010");
    }

    @Test
    public void test4858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4858");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.003-1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.003-1" + "'", str2, "P0Y000DT00000.003-1");
    }

    @Test
    public void test4859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4859");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 'a', 0L, "P0Y0M0DT0H0M0.033S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.033-97" + "'", str3, "P0Y000DT00000.033-97");
    }

    @Test
    public void test4860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4860");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) (short) 0, "P0Y000DT00000.032-1", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.032-1" + "'", str5, "P0Y000DT00000.032-1");
    }

    @Test
    public void test4861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4861");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((-1L), (long) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.098S" + "'", str2, "P0Y0M0DT0H0M0.098S");
    }

    @Test
    public void test4862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4862");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '4', "P0Y000DT00000.0519");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0519" + "'", str2, "P0Y000DT00000.0519");
    }

    @Test
    public void test4863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4863");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-1L), "P0Y000DT00000.033-1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.033-1" + "'", str2, "P0Y000DT00000.033-1");
    }

    @Test
    public void test4864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4864");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) ' ', "P0Y000DT00000.0310", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0310" + "'", str5, "P0Y000DT00000.0310");
    }

    @Test
    public void test4865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4865");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0Y000DT00000.002100", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.002100" + "'", str3, "P0Y000DT00000.002100");
    }

    @Test
    public void test4866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4866");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(1L, "P0Y000DT00000.097100", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.097100" + "'", str3, "P0Y000DT00000.097100");
    }

    @Test
    public void test4867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4867");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y000DT00000.0681", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0681" + "'", str3, "P0Y000DT00000.0681");
    }

    @Test
    public void test4868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4868");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y000DT00000.0200", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0200" + "'", str3, "P0Y000DT00000.0200");
    }

    @Test
    public void test4869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4869");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(100L, "P0000Y0M0DT0H0M0.097S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0000Y000DT00000.097100" + "'", str2, "P0000Y000DT00000.097100");
    }

    @Test
    public void test4870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4870");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 100, (long) '4', "P0Y000DT00000.7832", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.7832" + "'", str5, "P0Y000DT00000.7832");
    }

    @Test
    public void test4871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4871");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) (short) 10, "P0Y000DT00000.521");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.521" + "'", str3, "P0Y000DT00000.521");
    }

    @Test
    public void test4872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4872");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 100, (long) (byte) 10, "P0Y000DT00000.033-2", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.033-2" + "'", str5, "P0Y000DT00000.033-2");
    }

    @Test
    public void test4873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4873");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(10L, "P0000Y000DT00000.035-35", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.035-35" + "'", str3, "P0000Y000DT00000.035-35");
    }

    @Test
    public void test4874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4874");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 100, (long) (short) 1, "P0000Y000DT00000.991");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.991" + "'", str3, "P0000Y000DT00000.991");
    }

    @Test
    public void test4875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4875");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y000DT00000.00-101", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00-101" + "'", str3, "P0Y000DT00000.00-101");
    }

    @Test
    public void test4876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4876");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 100, (long) (byte) 10, "0 seconds");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 0econ00" + "'", str3, "0 0econ00");
    }

    @Test
    public void test4877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4877");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) 10, "P0Y000DT00000.090-96", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.090-96" + "'", str5, "P0Y000DT00000.090-96");
    }

    @Test
    public void test4878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4878");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 0, (long) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2, "P0Y0M0DT0H0M0.000S");
    }

    @Test
    public void test4879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4879");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(1L, (long) (-1), "P0000Y000DT00000.035-20", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0000Y000DT00000.035-20" + "'", str5, "P0000Y000DT00000.035-20");
    }

    @Test
    public void test4880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4880");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 1, "", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4881");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(10L, "P0Y000DT00000.035-1", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.035-1" + "'", str3, "P0Y000DT00000.035-1");
    }

    @Test
    public void test4882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4882");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(1L, (long) 'a', "0 days", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0 0a00" + "'", str5, "0 0a00");
    }

    @Test
    public void test4883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4883");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(100L, (long) (short) 0, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4884");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '4', "P0Y000DT00000.66-10");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.66-10" + "'", str2, "P0Y000DT00000.66-10");
    }

    @Test
    public void test4885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4885");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 0, 0L, "P0000Y000DT00000.097100", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0000Y000DT00000.097100" + "'", str5, "P0000Y000DT00000.097100");
    }

    @Test
    public void test4886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4886");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 10, "P0Y000DT00000.6710");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.6710" + "'", str2, "P0Y000DT00000.6710");
    }

    @Test
    public void test4887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4887");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), 0L, "P0Y000DT00000.068-1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.068-1" + "'", str3, "P0Y000DT00000.068-1");
    }

    @Test
    public void test4888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4888");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) 10, "P0000Y000DT00000.00110");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.00110" + "'", str3, "P0000Y000DT00000.00110");
    }

    @Test
    public void test4889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4889");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(10L, "P0000Y000DT00000.99-53", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.99-53" + "'", str3, "P0000Y000DT00000.99-53");
    }

    @Test
    public void test4890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4890");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 10, "P0Y000DT00000.01710");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.01710" + "'", str2, "P0Y000DT00000.01710");
    }

    @Test
    public void test4891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4891");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 100, 1L, "P0Y000DT00000.03334", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.03334" + "'", str5, "P0Y000DT00000.03334");
    }

    @Test
    public void test4892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4892");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) 0, "P0000Y000DT00000.035-20", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0000Y000DT00000.035-20" + "'", str5, "P0000Y000DT00000.035-20");
    }

    @Test
    public void test4893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4893");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.062-1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.062-1" + "'", str2, "P0Y000DT00000.062-1");
    }

    @Test
    public void test4894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4894");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) ' ', (long) ' ', "P0Y0M0DT0H0M0.031S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0310" + "'", str5, "P0Y000DT00000.0310");
    }

    @Test
    public void test4895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4895");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (byte) 0, (long) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.032S" + "'", str2, "P0Y0M0DT0H0M0.032S");
    }

    @Test
    public void test4896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4896");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) 10, "P0Y000DT00000.002-100", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.002-100" + "'", str5, "P0Y000DT00000.002-100");
    }

    @Test
    public void test4897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4897");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) 'a', "P0Y0M0DT0H0M0.031S", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.031-3" + "'", str5, "P0Y000DT00000.031-3");
    }

    @Test
    public void test4898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4898");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) (short) 0, "P0Y000DT00000.10100", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.10100" + "'", str5, "P0Y000DT00000.10100");
    }

    @Test
    public void test4899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4899");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(100L, "P0Y000DT00000.0132");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0132" + "'", str2, "P0Y000DT00000.0132");
    }

    @Test
    public void test4900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4900");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) (short) -1, "P0Y000DT00000.0200");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0200" + "'", str3, "P0Y000DT00000.0200");
    }

    @Test
    public void test4901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4901");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) (byte) 10, "P0000Y000DT00000.035-99", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0000Y000DT00000.035-99" + "'", str5, "P0000Y000DT00000.035-99");
    }

    @Test
    public void test4902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4902");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(100L, "P0Y000DT00000.03142");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.03142" + "'", str2, "P0Y000DT00000.03142");
    }

    @Test
    public void test4903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4903");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) (byte) 0, "P0Y000DT00000.01032");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.01032" + "'", str3, "P0Y000DT00000.01032");
    }

    @Test
    public void test4904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4904");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 10, "P0Y000DT00000.7832");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.7832" + "'", str2, "P0Y000DT00000.7832");
    }

    @Test
    public void test4905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4905");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y000DT00000.09935");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.09935" + "'", str2, "P0Y000DT00000.09935");
    }

    @Test
    public void test4906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4906");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y0M0DT0H0M0.011S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0110" + "'", str3, "P0Y000DT00000.0110");
    }

    @Test
    public void test4907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4907");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-1L), "0 seconds", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 0econ00" + "'", str3, "0 0econ00");
    }

    @Test
    public void test4908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4908");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y000DT00000.4736");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.4736" + "'", str2, "P0Y000DT00000.4736");
    }

    @Test
    public void test4909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4909");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) 100, "P0Y000DT00000.053-11", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.053-11" + "'", str5, "P0Y000DT00000.053-11");
    }

    @Test
    public void test4910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4910");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0Y000DT00000.4732");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.4732" + "'", str2, "P0Y000DT00000.4732");
    }

    @Test
    public void test4911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4911");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y000DT00000.05111", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.05111" + "'", str3, "P0Y000DT00000.05111");
    }

    @Test
    public void test4912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4912");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) (short) 10, "P0Y000DT00000.6610", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.6610" + "'", str5, "P0Y000DT00000.6610");
    }

    @Test
    public void test4913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4913");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y0M0DT0H0M0.053S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.053100" + "'", str3, "P0Y000DT00000.053100");
    }

    @Test
    public void test4914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4914");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.00932", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00932" + "'", str3, "P0Y000DT00000.00932");
    }

    @Test
    public void test4915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4915");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.097-35");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.097-35" + "'", str2, "P0Y000DT00000.097-35");
    }

    @Test
    public void test4916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4916");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-1L), "P0Y000DT00000.10100", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.10100" + "'", str3, "P0Y000DT00000.10100");
    }

    @Test
    public void test4917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4917");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (-1), 0L, "P0Y000DT00000.1068");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.1068" + "'", str3, "P0Y000DT00000.1068");
    }

    @Test
    public void test4918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4918");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) (byte) 10, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4919");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 10, "P0000Y000DT00000.03510");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0000Y000DT00000.03510" + "'", str2, "P0000Y000DT00000.03510");
    }

    @Test
    public void test4920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4920");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 100, "P0000Y0M0DT0H0M0.001S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.001100" + "'", str3, "P0000Y000DT00000.001100");
    }

    @Test
    public void test4921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4921");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (byte) 100, (-1L));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.99S" + "'", str2, "P0Y0M0DT0H0M0.99S");
    }

    @Test
    public void test4922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4922");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) (short) 10, "", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test4923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4923");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(10L, "P0Y000DT00000.130", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.130" + "'", str3, "P0Y000DT00000.130");
    }

    @Test
    public void test4924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4924");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y000DT00000.91-1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.91-1" + "'", str2, "P0Y000DT00000.91-1");
    }

    @Test
    public void test4925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4925");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 'a', 10L, "P0Y000DT00000.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.000" + "'", str3, "P0Y000DT00000.000");
    }

    @Test
    public void test4926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4926");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) (byte) 0, "P0Y000DT00000.98101", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.98101" + "'", str5, "P0Y000DT00000.98101");
    }

    @Test
    public void test4927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4927");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0000Y000DT00000.001-53");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0000Y000DT00000.001-53" + "'", str2, "P0000Y000DT00000.001-53");
    }

    @Test
    public void test4928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4928");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) '4', "P0000Y000DT00000.035-99", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0000Y000DT00000.035-99" + "'", str5, "P0000Y000DT00000.035-99");
    }

    @Test
    public void test4929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4929");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '4', (long) (byte) 100, "P0Y0M0DT0H0M0.010S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.01048" + "'", str3, "P0Y000DT00000.01048");
    }

    @Test
    public void test4930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4930");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '#', (long) 1, "P0Y000DT00000.002100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.002100" + "'", str3, "P0Y000DT00000.002100");
    }

    @Test
    public void test4931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4931");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (-1L), "P0Y000DT00000.017-9");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.017-9" + "'", str3, "P0Y000DT00000.017-9");
    }

    @Test
    public void test4932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4932");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(1L, "P0Y000DT00000.042-1", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.042-1" + "'", str3, "P0Y000DT00000.042-1");
    }

    @Test
    public void test4933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4933");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '4', (long) 'a', "P0Y000DT00000.0900", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0900" + "'", str5, "P0Y000DT00000.0900");
    }

    @Test
    public void test4934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4934");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.00010");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.00010" + "'", str2, "P0Y000DT00000.00010");
    }

    @Test
    public void test4935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4935");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y0M0DT0H0M0.011S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.011-1" + "'", str2, "P0Y000DT00000.011-1");
    }

    @Test
    public void test4936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4936");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 10, 10L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2, "P0Y0M0DT0H0M0.000S");
    }

    @Test
    public void test4937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4937");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 10, "P0Y000DT00000.097100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.097100" + "'", str2, "P0Y000DT00000.097100");
    }

    @Test
    public void test4938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4938");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) 'a', "P0Y000DT00000.09732", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.09732" + "'", str5, "P0Y000DT00000.09732");
    }

    @Test
    public void test4939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4939");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y000DT00000.680");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.680" + "'", str2, "P0Y000DT00000.680");
    }

    @Test
    public void test4940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4940");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) (byte) 10, "P0Y000DT00000.0011", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0011" + "'", str5, "P0Y000DT00000.0011");
    }

    @Test
    public void test4941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4941");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 100, "P0Y000DT00000.02035");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.02035" + "'", str2, "P0Y000DT00000.02035");
    }

    @Test
    public void test4942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4942");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 'a', (long) 0, "P0Y000DT00000.09911", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.09911" + "'", str5, "P0Y000DT00000.09911");
    }

    @Test
    public void test4943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4943");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 10, "P0Y000DT00000.036100", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.036100" + "'", str3, "P0Y000DT00000.036100");
    }

    @Test
    public void test4944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4944");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0Y0M0DT0H0M0.38S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.3810" + "'", str3, "P0Y000DT00000.3810");
    }

    @Test
    public void test4945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4945");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) (short) -1, "P0Y000DT00000.520");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.520" + "'", str3, "P0Y000DT00000.520");
    }

    @Test
    public void test4946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4946");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 0, (long) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.052S" + "'", str2, "P0Y0M0DT0H0M0.052S");
    }

    @Test
    public void test4947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4947");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(1L, "P0Y000DT00000.0872");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0872" + "'", str2, "P0Y000DT00000.0872");
    }

    @Test
    public void test4948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4948");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) (short) 100, "P0Y000DT00000.022100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.022100" + "'", str3, "P0Y000DT00000.022100");
    }

    @Test
    public void test4949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4949");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) '4', "P0Y000DT00000.010-25");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.010-25" + "'", str3, "P0Y000DT00000.010-25");
    }

    @Test
    public void test4950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4950");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '4', (long) (byte) -1, "P0Y000DT00000.09010");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.09010" + "'", str3, "P0Y000DT00000.09010");
    }

    @Test
    public void test4951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4951");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '#', "P0Y000DT00000.025-96");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.025-96" + "'", str2, "P0Y000DT00000.025-96");
    }

    @Test
    public void test4952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4952");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 10, "P0Y0M0DT0H0M0.020S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.02010" + "'", str2, "P0Y000DT00000.02010");
    }

    @Test
    public void test4953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4953");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(1L, "P0Y000DT00000.10010", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.10010" + "'", str3, "P0Y000DT00000.10010");
    }

    @Test
    public void test4954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4954");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) ' ', "P0Y000DT00000.9710", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.9710" + "'", str5, "P0Y000DT00000.9710");
    }

    @Test
    public void test4955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4955");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(1L, (long) 100, "P0Y000DT00000.32100", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.32100" + "'", str5, "P0Y000DT00000.32100");
    }

    @Test
    public void test4956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4956");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(1L, 10L, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y0M0DT0H0M0.009S" + "'", str3, "P0000Y0M0DT0H0M0.009S");
    }

    @Test
    public void test4957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4957");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) (short) 100, "P0Y000DT00000.011100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.011100" + "'", str3, "P0Y000DT00000.011100");
    }

    @Test
    public void test4958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4958");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) ' ', "P0000Y000DT00000.03510");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0000Y000DT00000.03510" + "'", str2, "P0000Y000DT00000.03510");
    }

    @Test
    public void test4959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4959");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 'a', 100L, "P0000Y000DT00000.096-22");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.096-22" + "'", str3, "P0000Y000DT00000.096-22");
    }

    @Test
    public void test4960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4960");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(10L, 10L, "P0Y000DT00000.021", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.021" + "'", str5, "P0Y000DT00000.021");
    }

    @Test
    public void test4961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4961");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(100L, (long) (short) 0, "P0Y0M0DT0H0M0.087S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.087-100" + "'", str5, "P0Y000DT00000.087-100");
    }

    @Test
    public void test4962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4962");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (byte) 1, "", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test4963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4963");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 10, "P0000Y000DT00000.0320", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.0320" + "'", str3, "P0000Y000DT00000.0320");
    }

    @Test
    public void test4964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4964");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 10, "P0Y000DT00000.65-1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.65-1" + "'", str2, "P0Y000DT00000.65-1");
    }

    @Test
    public void test4965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4965");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), 100L, "P0Y000DT00000.10-90");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.10-90" + "'", str3, "P0Y000DT00000.10-90");
    }

    @Test
    public void test4966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4966");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 10, (long) 1, "P0Y000DT00000.003-31");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.003-31" + "'", str3, "P0Y000DT00000.003-31");
    }

    @Test
    public void test4967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4967");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '4', "P0Y000DT00000.036-98");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.036-98" + "'", str2, "P0Y000DT00000.036-98");
    }

    @Test
    public void test4968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4968");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-1L), "P0Y000DT00000.003-1", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.003-1" + "'", str3, "P0Y000DT00000.003-1");
    }

    @Test
    public void test4969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4969");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 1, "P0Y000DT00000.97100", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.97100" + "'", str3, "P0Y000DT00000.97100");
    }

    @Test
    public void test4970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4970");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), (long) (-1), "P0Y0M0DT0H0M0.69S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.690" + "'", str5, "P0Y000DT00000.690");
    }

    @Test
    public void test4971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4971");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y000DT00000.0092");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0092" + "'", str2, "P0Y000DT00000.0092");
    }

    @Test
    public void test4972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4972");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.640");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.640" + "'", str2, "P0Y000DT00000.640");
    }

    @Test
    public void test4973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4973");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y0M0DT0H0M0.35S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.3597" + "'", str3, "P0Y000DT00000.3597");
    }

    @Test
    public void test4974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4974");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (-1), (long) (short) 100, "P0Y000DT00000.09610", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.09610" + "'", str5, "P0Y000DT00000.09610");
    }

    @Test
    public void test4975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4975");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 1, (long) '#', "0 0a000 0 hour 0 0inute00 0 econ00", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0 0a000 0 hour 0 0inute00 0 econ00" + "'", str5, "0 0a000 0 hour 0 0inute00 0 econ00");
    }

    @Test
    public void test4976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4976");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y000DT00000.99-48", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.99-48" + "'", str3, "P0Y000DT00000.99-48");
    }

    @Test
    public void test4977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4977");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), (long) '#', "P0Y000DT00000.6997", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.6997" + "'", str5, "P0Y000DT00000.6997");
    }

    @Test
    public void test4978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4978");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.04287");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.04287" + "'", str2, "P0Y000DT00000.04287");
    }

    @Test
    public void test4979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4979");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 10, (long) 100, "P0Y0M0DT0H0M0.033S", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.03390" + "'", str5, "P0Y000DT00000.03390");
    }

    @Test
    public void test4980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4980");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y000DT00000.096-11");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.096-11" + "'", str2, "P0Y000DT00000.096-11");
    }

    @Test
    public void test4981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4981");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) ' ', "0:00:00.035");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.035" + "'", str3, "0:00:00.035");
    }

    @Test
    public void test4982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4982");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) (short) 10, "P0Y000DT00000.67-98");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.67-98" + "'", str3, "P0Y000DT00000.67-98");
    }

    @Test
    public void test4983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4983");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(1L, (long) (short) -1, "P0Y000DT00000.03117", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.03117" + "'", str5, "P0Y000DT00000.03117");
    }

    @Test
    public void test4984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4984");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0000Y0M0DT0H0M0.097S", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.097-1" + "'", str3, "P0000Y000DT00000.097-1");
    }

    @Test
    public void test4985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4985");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 10, "P0Y000DT00000.0209", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0209" + "'", str3, "P0Y000DT00000.0209");
    }

    @Test
    public void test4986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4986");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, 100L, "P0Y000DT00000.91-68");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.91-68" + "'", str3, "P0Y000DT00000.91-68");
    }

    @Test
    public void test4987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4987");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 'a', 1L, "P0Y0M0DT0H0M0.49S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.49-96" + "'", str5, "P0Y000DT00000.49-96");
    }

    @Test
    public void test4988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4988");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '4', (-1L), "P0Y000DT00000.09790", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.09790" + "'", str5, "P0Y000DT00000.09790");
    }

    @Test
    public void test4989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4989");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 100, "P0Y000DT00000.89100", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.89100" + "'", str3, "P0Y000DT00000.89100");
    }

    @Test
    public void test4990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4990");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 10, "P0Y000DT00000.781");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.781" + "'", str2, "P0Y000DT00000.781");
    }

    @Test
    public void test4991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4991");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 0, (-1L), "P0Y000DT00000.020");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.020" + "'", str3, "P0Y000DT00000.020");
    }

    @Test
    public void test4992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4992");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) ' ', 0L, "P0Y000DT00000.090-96");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.090-96" + "'", str3, "P0Y000DT00000.090-96");
    }

    @Test
    public void test4993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4993");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y000DT00000.03135");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.03135" + "'", str2, "P0Y000DT00000.03135");
    }

    @Test
    public void test4994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4994");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0Y000DT00000.0360");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0360" + "'", str2, "P0Y000DT00000.0360");
    }

    @Test
    public void test4995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4995");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(100L, "P0Y0M0DT0H0M0.099S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.099100" + "'", str2, "P0Y000DT00000.099100");
    }

    @Test
    public void test4996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4996");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 100, (long) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.01S" + "'", str2, "P0Y0M0DT0H0M0.01S");
    }

    @Test
    public void test4997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4997");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y000DT00000.00-1", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00-1" + "'", str3, "P0Y000DT00000.00-1");
    }

    @Test
    public void test4998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4998");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y000DT00000.034-1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.034-1" + "'", str2, "P0Y000DT00000.034-1");
    }

    @Test
    public void test4999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4999");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(1L, (long) (byte) -1, "P0Y0M0DT0H0M0.034S", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.034-2" + "'", str5, "P0Y000DT00000.034-2");
    }

    @Test
    public void test5000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test5000");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) (short) -1, "P0Y0M0DT0H0M0.13S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.130" + "'", str5, "P0Y000DT00000.130");
    }
}

