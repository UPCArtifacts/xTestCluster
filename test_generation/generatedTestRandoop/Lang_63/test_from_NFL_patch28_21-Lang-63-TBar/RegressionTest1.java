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
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 10, "P0Y000DT00000.0991");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0991" + "'", str2, "P0Y000DT00000.0991");
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords(10L, false, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3, "0 days 0 hours 0 minutes 0 seconds");
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) (short) 1, true, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 seconds" + "'", str3, "0 seconds");
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (byte) 100, 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.00S" + "'", str2, "P0Y0M0DT0H0M0.00S");
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) -1, (long) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.053S" + "'", str2, "P0Y0M0DT0H0M0.053S");
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) ' ', (long) (-1), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) (short) 1, "0:00:00.052");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.052" + "'", str3, "0:00:00.052");
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '4', (long) (byte) 100, "P0Y000DT00000.1068", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.1068" + "'", str5, "P0Y000DT00000.1068");
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(10L, (long) (short) 0, "P0000Y0M0DT0H0M0.096S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0000Y000DT00000.096-10" + "'", str5, "P0000Y000DT00000.096-10");
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) 0, "P0Y000DT00000.98-11", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.98-11" + "'", str5, "P0Y000DT00000.98-11");
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '#', (long) 10, "P0Y000DT00000.00935", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.00935" + "'", str5, "P0Y000DT00000.00935");
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.78-1", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.78-1" + "'", str3, "P0Y000DT00000.78-1");
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, 0L, "P0Y000DT00000.68100", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.68100" + "'", str5, "P0Y000DT00000.68100");
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y000DT00000.1000", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.1000" + "'", str3, "P0Y000DT00000.1000");
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) (byte) 0, "P0000Y0M0DT0H0M0.032S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.0321" + "'", str3, "P0000Y000DT00000.0321");
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) '4', "", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0Y000DT00000.0311", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0311" + "'", str3, "P0Y000DT00000.0311");
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 10, 0L, "P0Y0M0DT0H0M0.66S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.66-10" + "'", str3, "P0Y000DT00000.66-10");
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(1L, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y0M0DT0H0M0.097S", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.097-1" + "'", str3, "P0Y000DT00000.097-1");
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(10L, "P0Y0M0DT0H0M0.099S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.09910" + "'", str2, "P0Y000DT00000.09910");
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (-1), 100L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.101S" + "'", str2, "P0Y0M0DT0H0M0.101S");
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 1, "P0Y000DT00000.1001", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.1001" + "'", str3, "P0Y000DT00000.1001");
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) (short) 0, "0 0a00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 0a00" + "'", str3, "0 0a00");
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0Y0M0DT0H0M0.065S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0651" + "'", str3, "P0Y000DT00000.0651");
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (byte) 0, 100L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.100S" + "'", str2, "P0Y0M0DT0H0M0.100S");
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 10, "P0Y000DT00000.66-10");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.66-10" + "'", str2, "P0Y000DT00000.66-10");
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, 1L, "P0Y000DT00000.052101", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.052101" + "'", str5, "P0Y000DT00000.052101");
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y000DT00000.09010");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.09010" + "'", str2, "P0Y000DT00000.09010");
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 1, "", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y000DT00000.0350", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0350" + "'", str3, "P0Y000DT00000.0350");
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0Y000DT00000.09010", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.09010" + "'", str3, "P0Y000DT00000.09010");
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 10, 100L, "P0Y000DT00000.0970", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0970" + "'", str5, "P0Y000DT00000.0970");
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y000DT00000.00310");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.00310" + "'", str2, "P0Y000DT00000.00310");
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) (byte) 1, "P0Y000DT00000.097-1", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.097-1" + "'", str5, "P0Y000DT00000.097-1");
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) 0, "P0Y000DT00000.0101");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0101" + "'", str3, "P0Y000DT00000.0101");
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (short) 100, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 10, (long) (byte) 1, "", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 0, "P0Y000DT00000.0310", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0310" + "'", str3, "P0Y000DT00000.0310");
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '#', "P0Y000DT00000.00935");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.00935" + "'", str2, "P0Y000DT00000.00935");
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(0L, (long) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.097S" + "'", str2, "P0Y0M0DT0H0M0.097S");
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 1, "P0Y000DT00000.651");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.651" + "'", str2, "P0Y000DT00000.651");
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(10L, (long) (short) 0, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, 0L, "P0Y000DT00000.10100", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.10100" + "'", str5, "P0Y000DT00000.10100");
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) 10, (long) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.89S" + "'", str2, "P0Y0M0DT0H0M0.89S");
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 100, (long) (byte) 1, "P0Y0M0DT0H0M0.032S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.032-99" + "'", str3, "P0Y000DT00000.032-99");
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-1L), "P0Y000DT00000.0311", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0311" + "'", str3, "P0Y000DT00000.0311");
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (byte) 10, "P0Y000DT00000.0092", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0092" + "'", str5, "P0Y000DT00000.0092");
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) (byte) 0, "P0Y000DT00000.910");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.910" + "'", str3, "P0Y000DT00000.910");
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((-1L), true, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 seconds" + "'", str3, "0 seconds");
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (-1), "0:00:00.100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.100" + "'", str2, "0:00:00.100");
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '#', (long) (byte) 0, "P0000Y0M0DT0H0M0.035S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.035-35" + "'", str3, "P0000Y000DT00000.035-35");
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.021");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.021" + "'", str2, "P0Y000DT00000.021");
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) (byte) 0, "P0Y000DT00000.98-65");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.98-65" + "'", str3, "P0Y000DT00000.98-65");
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) 0, false, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3, "0 days 0 hours 0 minutes 0 seconds");
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y0M0DT0H0M0.00S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.000" + "'", str2, "P0Y000DT00000.000");
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '4', "P0Y000DT00000.78-31");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.78-31" + "'", str2, "P0Y000DT00000.78-31");
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 0, (long) (byte) -1, "P0Y000DT00000.98-97");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.98-97" + "'", str3, "P0Y000DT00000.98-97");
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) '#', (long) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.66S" + "'", str2, "P0Y0M0DT0H0M0.66S");
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) 0, (long) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.052S" + "'", str2, "P0Y0M0DT0H0M0.052S");
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) ' ', "P0Y0M0DT0H0M0.011S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.011-68" + "'", str3, "P0Y000DT00000.011-68");
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 10, "0:00:00.000", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(100L, 1L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.01S" + "'", str2, "P0Y0M0DT0H0M0.01S");
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y0M0DT0H0M0.47S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.47-1" + "'", str2, "P0Y000DT00000.47-1");
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 100, "P0Y000DT00000.065-1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.065-1" + "'", str2, "P0Y000DT00000.065-1");
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 10, (long) (-1), "P0Y0M0DT0H0M0.47S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.47-11" + "'", str3, "P0Y000DT00000.47-11");
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0Y000DT00000.0901");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0901" + "'", str2, "P0Y000DT00000.0901");
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (-1), 10L, "P0Y000DT00000.68100", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.68100" + "'", str5, "P0Y000DT00000.68100");
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 100, (long) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.32S" + "'", str2, "P0Y0M0DT0H0M0.32S");
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) '4', (long) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.048S" + "'", str2, "P0Y0M0DT0H0M0.048S");
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0Y000DT00000.03110");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.03110" + "'", str2, "P0Y000DT00000.03110");
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.98-11", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.98-11" + "'", str3, "P0Y000DT00000.98-11");
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) (byte) 100, true, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 seconds" + "'", str3, "0 seconds");
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.02-100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.02-100" + "'", str2, "P0Y000DT00000.02-100");
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) 10, "P0Y000DT00000.021");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.021" + "'", str3, "P0Y000DT00000.021");
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '4', (long) 1, "P0Y000DT00000.653", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.653" + "'", str5, "P0Y000DT00000.653");
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 0, (long) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.010S" + "'", str2, "P0Y0M0DT0H0M0.010S");
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 1, 0L, "0:00:00.99");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.99" + "'", str3, "0:00:00.99");
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), (long) (byte) -1, "P0Y0M0DT0H0M0.100S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.1000" + "'", str5, "P0Y000DT00000.1000");
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) -1, 0L, "P0Y000DT00000.09710");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.09710" + "'", str3, "P0Y000DT00000.09710");
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(1L, "P0Y0M0DT0H0M0.032S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0321" + "'", str2, "P0Y000DT00000.0321");
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) '4', "P0Y000DT00000.0901");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0901" + "'", str3, "P0Y000DT00000.0901");
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) 0, (long) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.097S" + "'", str2, "P0Y0M0DT0H0M0.097S");
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 10, 0L, "P0Y0M0DT0H0M0.47S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.47-10" + "'", str5, "P0Y000DT00000.47-10");
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-1L), "P0Y000DT00000.00932");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.00932" + "'", str2, "P0Y000DT00000.00932");
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(10L, (long) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.90S" + "'", str2, "P0Y0M0DT0H0M0.90S");
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        java.lang.String str1 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationHMS((long) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.000" + "'", str1, "0:00:00.000");
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) (short) 10, "P0Y000DT00000.98-11", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.98-11" + "'", str5, "P0Y000DT00000.98-11");
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(0L, (long) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.010S" + "'", str2, "P0Y0M0DT0H0M0.010S");
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 100, (long) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.52S" + "'", str2, "P0Y0M0DT0H0M0.52S");
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), (long) (byte) 100, "P0Y000DT00000.02-100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.02-100" + "'", str3, "P0Y000DT00000.02-100");
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 1, 100L, "P0Y000DT00000.651", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.651" + "'", str5, "P0Y000DT00000.651");
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 0, (long) 0, "P0Y000DT00000.03117", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.03117" + "'", str5, "P0Y000DT00000.03117");
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) ' ', "P0Y0M0DT0H0M0.048S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.04832" + "'", str3, "P0Y000DT00000.04832");
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y000DT00000.98-65", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.98-65" + "'", str3, "P0Y000DT00000.98-65");
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 10, 0L, "P0Y000DT00000.0651");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0651" + "'", str3, "P0Y000DT00000.0651");
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 0, (long) (byte) 100, "", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y0M0DT0H0M0.98S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.980" + "'", str2, "P0Y000DT00000.980");
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) ' ', (long) (byte) 0, "P0Y000DT00000.78-31", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.78-31" + "'", str5, "P0Y000DT00000.78-31");
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, 0L, "P0Y000DT00000.1000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.1000" + "'", str3, "P0Y000DT00000.1000");
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 0, (long) 100, "P0Y000DT00000.011-68");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.011-68" + "'", str3, "P0Y000DT00000.011-68");
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) (short) -1, false, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3, "0 days 0 hours 0 minutes 0 seconds");
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y000DT00000.052101");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.052101" + "'", str2, "P0Y000DT00000.052101");
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) 'a', "P0Y000DT00000.000", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.000" + "'", str5, "P0Y000DT00000.000");
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) -1, 0L, "P0Y000DT00000.98-11");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.98-11" + "'", str3, "P0Y000DT00000.98-11");
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y000DT00000.98101", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.98101" + "'", str3, "P0Y000DT00000.98101");
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(1L, "P0Y000DT00000.00042", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00042" + "'", str3, "P0Y000DT00000.00042");
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '#', "P0Y000DT00000.10100", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.10100" + "'", str3, "P0Y000DT00000.10100");
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) -1, 10L, "P0Y0M0DT0H0M0.099S", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.09911" + "'", str5, "P0Y000DT00000.09911");
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 'a', 10L, "P0Y0M0DT0H0M0.001S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.001-87" + "'", str3, "P0Y000DT00000.001-87");
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 10, (long) '#', "P0Y000DT00000.03110", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.03110" + "'", str5, "P0Y000DT00000.03110");
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y000DT00000.03117");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.03117" + "'", str2, "P0Y000DT00000.03117");
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y000DT00000.99-65", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.99-65" + "'", str3, "P0Y000DT00000.99-65");
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (byte) 1, (long) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.99S" + "'", str2, "P0Y0M0DT0H0M0.99S");
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(100L, (long) (short) 0, "P0Y000DT00000.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.000" + "'", str3, "P0Y000DT00000.000");
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-1L), "P0Y0M0DT0H0M0.010S", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.010-1" + "'", str3, "P0Y000DT00000.010-1");
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) ' ', 1L, "P0000Y000DT00000.0321", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0000Y000DT00000.0321" + "'", str5, "P0000Y000DT00000.0321");
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0Y0M0DT0H0M0.10S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.101" + "'", str3, "P0Y000DT00000.101");
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 0, "P0Y0M0DT0H0M0.98S", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.980" + "'", str3, "P0Y000DT00000.980");
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-1L), "P0Y000DT00000.09710", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.09710" + "'", str3, "P0Y000DT00000.09710");
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 'a', (long) 100, "P0Y000DT00000.00-51", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.00-51" + "'", str5, "P0Y000DT00000.00-51");
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 0, (long) (short) -1, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y0M0DT0H0M0.99S" + "'", str5, "P0Y0M0DT0H0M0.99S");
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 'a', 100L, "P0Y000DT00000.98100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.98100" + "'", str3, "P0Y000DT00000.98100");
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.78-31", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.78-31" + "'", str3, "P0Y000DT00000.78-31");
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(0L, 100L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.100S" + "'", str2, "P0Y0M0DT0H0M0.100S");
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) (short) 100, "P0Y000DT00000.0901");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0901" + "'", str3, "P0Y000DT00000.0901");
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 10, "P0Y000DT00000.100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.100" + "'", str2, "P0Y000DT00000.100");
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 10, "P0Y000DT00000.001", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.001" + "'", str3, "P0Y000DT00000.001");
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '#', (long) (byte) -1, "P0Y000DT00000.653");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.653" + "'", str3, "P0Y000DT00000.653");
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(100L, "P0Y000DT00000.04832", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.04832" + "'", str3, "P0Y000DT00000.04832");
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '4', 10L, "P0000Y000DT00000.0320");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.0320" + "'", str3, "P0000Y000DT00000.0320");
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '4', "", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y000DT00000.000-101", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.000-101" + "'", str3, "P0Y000DT00000.000-101");
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(1L, (long) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.099S" + "'", str2, "P0Y0M0DT0H0M0.099S");
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-1L), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) -1, (long) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.011S" + "'", str2, "P0Y0M0DT0H0M0.011S");
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 1, "P0Y000DT00000.0101", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0101" + "'", str3, "P0Y000DT00000.0101");
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, 0L, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y000DT00000.065-1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.065-1" + "'", str2, "P0Y000DT00000.065-1");
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), (long) (byte) 100, "P0Y0M0DT0H0M0.009S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.009101" + "'", str5, "P0Y000DT00000.009101");
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) (byte) 1, "P0Y000DT00000.89100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.89100" + "'", str3, "P0Y000DT00000.89100");
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 10, "P0000Y000DT00000.0351", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.0351" + "'", str3, "P0000Y000DT00000.0351");
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((-1L), 100L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.101S" + "'", str2, "P0Y0M0DT0H0M0.101S");
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) (short) -1, "P0Y0M0DT0H0M0.02S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.02-2" + "'", str3, "P0Y000DT00000.02-2");
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 10, "0:00:00.035");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.035" + "'", str2, "0:00:00.035");
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 100, "P0Y000DT00000.03117");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.03117" + "'", str2, "P0Y000DT00000.03117");
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 10, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.06510" + "'", str2, "P0Y000DT00000.06510");
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y000DT00000.981", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.981" + "'", str3, "P0Y000DT00000.981");
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(1L, (long) (byte) 0, "P0Y0M0DT0H0M0.099S", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.099-1" + "'", str5, "P0Y000DT00000.099-1");
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0000Y000DT00000.10010");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0000Y000DT00000.10010" + "'", str2, "P0000Y000DT00000.10010");
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (-1), (long) (short) 0, "P0Y000DT00000.03110");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.03110" + "'", str3, "P0Y000DT00000.03110");
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) 'a', "P0Y000DT00000.98-65", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.98-65" + "'", str5, "P0Y000DT00000.98-65");
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) -1, 100L, "P0Y0M0DT0H0M0.036S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.036101" + "'", str3, "P0Y000DT00000.036101");
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 100, (long) (-1), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(100L, "P0000Y000DT00000.0320");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0000Y000DT00000.0320" + "'", str2, "P0000Y000DT00000.0320");
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) -1, 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str2, "P0Y0M0DT0H0M0.001S");
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) (short) -1, true, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 seconds" + "'", str3, "0 seconds");
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0Y000DT00000.09910", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.09910" + "'", str3, "P0Y000DT00000.09910");
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) (short) 100, "P0Y000DT00000.10100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.10100" + "'", str3, "P0Y000DT00000.10100");
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (byte) 1, (long) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2, "P0Y0M0DT0H0M0.000S");
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) (short) -1, "hi!", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 100, "P0Y0M0DT0H0M0.048S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.048100" + "'", str2, "P0Y000DT00000.048100");
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y0M0DT0H0M0.003S", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0030" + "'", str3, "P0Y000DT00000.0030");
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), (long) (byte) 10, "P0Y0M0DT0H0M0.065S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.06511" + "'", str5, "P0Y000DT00000.06511");
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0Y000DT00000.0991");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0991" + "'", str2, "P0Y000DT00000.0991");
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 1, (long) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.099S" + "'", str2, "P0Y0M0DT0H0M0.099S");
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 100, 1L, "P0000Y000DT00000.035-35");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.035-35" + "'", str3, "P0000Y000DT00000.035-35");
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, 1L, "P0Y000DT00000.0090");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0090" + "'", str3, "P0Y000DT00000.0090");
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.036101");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.036101" + "'", str2, "P0Y000DT00000.036101");
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) 1, "P0Y000DT00000.98-11", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.98-11" + "'", str5, "P0Y000DT00000.98-11");
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) 1, (long) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2, "P0Y0M0DT0H0M0.000S");
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (byte) -1, (long) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.011S" + "'", str2, "P0Y0M0DT0H0M0.011S");
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 0, 10L, "P0Y000DT00000.04832");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.04832" + "'", str3, "P0Y000DT00000.04832");
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(10L, (long) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2, "P0Y0M0DT0H0M0.000S");
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(10L, "P0Y000DT00000.0990", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0990" + "'", str3, "P0Y000DT00000.0990");
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-1L), "P0Y000DT00000.10100", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.10100" + "'", str3, "P0Y000DT00000.10100");
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, 0L, "P0Y000DT00000.47-10", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.47-10" + "'", str5, "P0Y000DT00000.47-10");
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) '4', "P0000Y0M0DT0H0M0.99S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0000Y000DT00000.9952" + "'", str5, "P0000Y000DT00000.9952");
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(10L, (long) 10, "P0Y000DT00000.00100", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.00100" + "'", str5, "P0Y000DT00000.00100");
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 1, (long) 'a', "P0Y000DT00000.0901", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0901" + "'", str5, "P0Y000DT00000.0901");
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, 0L, "P0000Y0M0DT0H0M0.096S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0000Y000DT00000.0960" + "'", str5, "P0000Y000DT00000.0960");
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.10100", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.10100" + "'", str3, "P0Y000DT00000.10100");
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(1L, (long) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.98S" + "'", str2, "P0Y0M0DT0H0M0.98S");
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) '4', "0 0a00", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0 0a00" + "'", str5, "0 0a00");
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) '#', "P0Y000DT00000.98-11");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.98-11" + "'", str3, "P0Y000DT00000.98-11");
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(1L, (long) (short) -1, "P0Y000DT00000.00932");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00932" + "'", str3, "P0Y000DT00000.00932");
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) 100, (long) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.52S" + "'", str2, "P0Y0M0DT0H0M0.52S");
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0Y000DT00000.0901");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0901" + "'", str2, "P0Y000DT00000.0901");
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y000DT00000.1068");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.1068" + "'", str2, "P0Y000DT00000.1068");
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 10, 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.90S" + "'", str2, "P0Y0M0DT0H0M0.90S");
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.78-31");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.78-31" + "'", str2, "P0Y000DT00000.78-31");
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) 0, "P0Y000DT00000.00100", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.00100" + "'", str5, "P0Y000DT00000.00100");
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(10L, 100L, "P0Y000DT00000.47-10");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.47-10" + "'", str3, "P0Y000DT00000.47-10");
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) 0, (long) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.99S" + "'", str2, "P0Y0M0DT0H0M0.99S");
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 10, (long) ' ', "P0Y0M0DT0H0M0.65S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.6522" + "'", str5, "P0Y000DT00000.6522");
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) 0, (long) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2, "P0Y0M0DT0H0M0.000S");
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y000DT00000.0090");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0090" + "'", str2, "P0Y000DT00000.0090");
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (-1), (long) (byte) 0, "P0Y0M0DT0H0M0.47S", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.471" + "'", str5, "P0Y000DT00000.471");
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (byte) -1, (long) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.011S" + "'", str2, "P0Y0M0DT0H0M0.011S");
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(100L, 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.00S" + "'", str2, "P0Y0M0DT0H0M0.00S");
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-1L), "", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 0, "0:00:00.000", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) '#', "0:00:00.035");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.035" + "'", str3, "0:00:00.035");
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(100L, "P0Y0M0DT0H0M0.011S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.011100" + "'", str3, "P0Y000DT00000.011100");
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y000DT00000.010-1", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.010-1" + "'", str3, "P0Y000DT00000.010-1");
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.00932");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.00932" + "'", str2, "P0Y000DT00000.00932");
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.0350", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0350" + "'", str3, "P0Y000DT00000.0350");
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 'a', 0L, "P0Y000DT00000.00935", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.00935" + "'", str5, "P0Y000DT00000.00935");
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (-1L), "P0Y0M0DT0H0M0.051S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.051-1" + "'", str3, "P0Y000DT00000.051-1");
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.09010");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.09010" + "'", str2, "P0Y000DT00000.09010");
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0Y000DT00000.04832", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.04832" + "'", str3, "P0Y000DT00000.04832");
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.100100", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.100100" + "'", str3, "P0Y000DT00000.100100");
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(100L, (long) (byte) 0, "P0000Y0M0DT0H0M0.096S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.096-100" + "'", str3, "P0000Y000DT00000.096-100");
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(100L, (long) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.52S" + "'", str2, "P0Y0M0DT0H0M0.52S");
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) ' ', "P0000Y000DT00000.096-100", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.096-100" + "'", str3, "P0000Y000DT00000.096-100");
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y0M0DT0H0M0.47S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.470" + "'", str2, "P0Y000DT00000.470");
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 0, (long) (short) 1, "P0Y000DT00000.99-1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.99-1" + "'", str3, "P0Y000DT00000.99-1");
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 100, (long) 10, "P0Y000DT00000.00100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00100" + "'", str3, "P0Y000DT00000.00100");
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, 0L, "P0Y000DT00000.052101");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.052101" + "'", str3, "P0Y000DT00000.052101");
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) -1, (-1L), "P0Y0M0DT0H0M0.001S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0010" + "'", str3, "P0Y000DT00000.0010");
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.09732");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.09732" + "'", str2, "P0Y000DT00000.09732");
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "P0Y0M0DT0H0M0.042S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0420" + "'", str2, "P0Y000DT00000.0420");
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(100L, "P0Y0M0DT0H0M0.036S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.036100" + "'", str2, "P0Y000DT00000.036100");
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y000DT00000.00035");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.00035" + "'", str2, "P0Y000DT00000.00035");
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 1, 1L, "P0Y000DT00000.00935");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00935" + "'", str3, "P0Y000DT00000.00935");
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y000DT00000.001");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.001" + "'", str2, "P0Y000DT00000.001");
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) 1, "0 days 0 hours 0 minutes 0 seconds");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 0a000 0 hour 0 0inute00 0 econ00" + "'", str3, "0 0a000 0 hour 0 0inute00 0 econ00");
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) (byte) 0, true, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 seconds" + "'", str3, "0 seconds");
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(100L, (long) (byte) 1, "P0Y0M0DT0H0M0.065S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.065-99" + "'", str5, "P0Y000DT00000.065-99");
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(10L, "P0Y0M0DT0H0M0.036S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.03610" + "'", str2, "P0Y000DT00000.03610");
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) 100, 100L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2, "P0Y0M0DT0H0M0.000S");
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.048100", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.048100" + "'", str3, "P0Y000DT00000.048100");
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (byte) 100, "P0Y000DT00000.6610", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.6610" + "'", str5, "P0Y000DT00000.6610");
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y0M0DT0H0M0.000S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.00097" + "'", str2, "P0Y000DT00000.00097");
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) -1, 0L, "P0Y000DT00000.09911", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.09911" + "'", str5, "P0Y000DT00000.09911");
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(100L, "0:00:00.052");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.052" + "'", str2, "0:00:00.052");
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(10L, "P0Y000DT00000.00097", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00097" + "'", str3, "P0Y000DT00000.00097");
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 'a', "0:00:00.052");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.052" + "'", str2, "0:00:00.052");
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '#', (long) (short) 1, "P0Y0M0DT0H0M0.000S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.000-34" + "'", str3, "P0Y000DT00000.000-34");
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.09710");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.09710" + "'", str2, "P0Y000DT00000.09710");
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 'a', 100L, "0 0a000 0 hour 0 0inute00 0 econ00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 0a000 0 hour 0 0inute00 0 econ00" + "'", str3, "0 0a000 0 hour 0 0inute00 0 econ00");
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) (byte) 0, "P0Y0M0DT0H0M0.001S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0011" + "'", str3, "P0Y000DT00000.0011");
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '#', (long) 0, "P0Y0M0DT0H0M0.65S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.65-35" + "'", str3, "P0Y000DT00000.65-35");
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(10L, "P0Y000DT00000.66-10");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.66-10" + "'", str2, "P0Y000DT00000.66-10");
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (byte) -1, (long) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str2, "P0Y0M0DT0H0M0.001S");
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) 10, (long) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.090S" + "'", str2, "P0Y0M0DT0H0M0.090S");
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y000DT00000.0421");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0421" + "'", str2, "P0Y000DT00000.0421");
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) (byte) 1, "P0Y000DT00000.010-1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.010-1" + "'", str3, "P0Y000DT00000.010-1");
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 'a', (long) 1, "P0Y0M0DT0H0M0.025S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.025-96" + "'", str3, "P0Y000DT00000.025-96");
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) (short) 0, false, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3, "0 days 0 hours 0 minutes 0 seconds");
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 0, 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2, "P0Y0M0DT0H0M0.000S");
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) (-1), "P0Y000DT00000.10100", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.10100" + "'", str5, "P0Y000DT00000.10100");
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(100L, 0L, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 0, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0650" + "'", str2, "P0Y000DT00000.0650");
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (byte) -1, "P0Y000DT00000.02100", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.02100" + "'", str5, "P0Y000DT00000.02100");
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y000DT00000.990");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.990" + "'", str2, "P0Y000DT00000.990");
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) -1, "", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (-1), (long) 1, "0 0a000 0 hour 0 0inute00 0 econ00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 0a000 0 hour 0 0inute00 0 econ00" + "'", str3, "0 0a000 0 hour 0 0inute00 0 econ00");
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) (short) 100, "P0Y000DT00000.065-1", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.065-1" + "'", str5, "P0Y000DT00000.065-1");
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(10L, (long) '4', "P0Y000DT00000.00090");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00090" + "'", str3, "P0Y000DT00000.00090");
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (-1), (long) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str2, "P0Y0M0DT0H0M0.001S");
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '#', "P0Y000DT00000.0650", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0650" + "'", str3, "P0Y000DT00000.0650");
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) (short) 100, "P0Y000DT00000.0321");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0321" + "'", str3, "P0Y000DT00000.0321");
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) -1, 0L, "P0Y000DT00000.048100", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.048100" + "'", str5, "P0Y000DT00000.048100");
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 'a', (long) ' ', "P0Y000DT00000.04832");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.04832" + "'", str3, "P0Y000DT00000.04832");
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) 1, "P0Y000DT00000.0350", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0350" + "'", str5, "P0Y000DT00000.0350");
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y000DT00000.09710", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.09710" + "'", str3, "P0Y000DT00000.09710");
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (byte) 100, (long) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.52S" + "'", str2, "P0Y0M0DT0H0M0.52S");
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) ' ', (long) 0, "P0Y000DT00000.0011", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0011" + "'", str5, "P0Y000DT00000.0011");
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 1, 10L, "P0Y000DT00000.1001", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.1001" + "'", str5, "P0Y000DT00000.1001");
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.1001", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.1001" + "'", str3, "P0Y000DT00000.1001");
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) 100, false, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days" + "'", str3, "0 days");
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(1L, (long) '#', "P0Y000DT00000.99-1", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.99-1" + "'", str5, "P0Y000DT00000.99-1");
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0Y000DT00000.09910", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.09910" + "'", str3, "P0Y000DT00000.09910");
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) 'a', "P0Y000DT00000.036101", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.036101" + "'", str5, "P0Y000DT00000.036101");
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "0:00:00.001");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.001" + "'", str2, "0:00:00.001");
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(10L, (-1L), "P0Y000DT00000.01097", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.01097" + "'", str5, "P0Y000DT00000.01097");
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) ' ', "P0000Y0M0DT0H0M0.032S", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0000Y000DT00000.03232" + "'", str5, "P0000Y000DT00000.03232");
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 10, "P0Y000DT00000.000-101", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.000-101" + "'", str3, "P0Y000DT00000.000-101");
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) (byte) 100, "P0Y000DT00000.0101", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0101" + "'", str5, "P0Y000DT00000.0101");
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 'a', "P0000Y0M0DT0H0M0.035S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0000Y000DT00000.03597" + "'", str2, "P0000Y000DT00000.03597");
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 10, "P0Y000DT00000.653", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.653" + "'", str3, "P0Y000DT00000.653");
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 100, "P0Y000DT00000.000-34");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.000-34" + "'", str2, "P0Y000DT00000.000-34");
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 10, (long) (short) 100, "P0Y0M0DT0H0M0.000S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.00090" + "'", str5, "P0Y000DT00000.00090");
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (-1), 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str2, "P0Y0M0DT0H0M0.001S");
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(100L, "P0Y000DT00000.000-34", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.000-34" + "'", str3, "P0Y000DT00000.000-34");
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 100, 100L, "P0Y000DT00000.02100", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.02100" + "'", str5, "P0Y000DT00000.02100");
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) (short) 1, "P0Y000DT00000.98100", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.98100" + "'", str5, "P0Y000DT00000.98100");
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y000DT00000.03110", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.03110" + "'", str3, "P0Y000DT00000.03110");
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (byte) 100, (long) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.35S" + "'", str2, "P0Y0M0DT0H0M0.35S");
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) '#', (long) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.64S" + "'", str2, "P0Y0M0DT0H0M0.64S");
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 10, (long) (byte) 10, "P0000Y0M0DT0H0M0.035S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0000Y000DT00000.0350" + "'", str5, "P0000Y000DT00000.0350");
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "P0Y0M0DT0H0M0.66S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.660" + "'", str2, "P0Y000DT00000.660");
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y0M0DT0H0M0.010S", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0100" + "'", str3, "P0Y000DT00000.0100");
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(100L, 100L, "P0Y000DT00000.0111");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0111" + "'", str3, "P0Y000DT00000.0111");
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 'a', (long) '4', "P0Y000DT00000.10-1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.10-1" + "'", str3, "P0Y000DT00000.10-1");
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 10, (long) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.90S" + "'", str2, "P0Y0M0DT0H0M0.90S");
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(100L, (-1L));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.99S" + "'", str2, "P0Y0M0DT0H0M0.99S");
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) (byte) 1, true, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 seconds" + "'", str3, "0 seconds");
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) 0, (long) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str2, "P0Y0M0DT0H0M0.001S");
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) 1, "P0Y0M0DT0H0M0.01S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.012" + "'", str5, "P0Y000DT00000.012");
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(100L, (long) 'a', "P0Y000DT00000.0990", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0990" + "'", str5, "P0Y000DT00000.0990");
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) (byte) 1, "P0Y000DT00000.0421", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0421" + "'", str5, "P0Y000DT00000.0421");
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.00310", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00310" + "'", str3, "P0Y000DT00000.00310");
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 'a', 1L, "P0Y000DT00000.0111", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0111" + "'", str5, "P0Y000DT00000.0111");
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y0M0DT0H0M0.78S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.7897" + "'", str2, "P0Y000DT00000.7897");
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 1, (long) 1, "P0Y000DT00000.6522");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.6522" + "'", str3, "P0Y000DT00000.6522");
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(10L, (long) '#', "P0Y000DT00000.03610");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.03610" + "'", str3, "P0Y000DT00000.03610");
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) (byte) 1, "P0Y000DT00000.021");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.021" + "'", str3, "P0Y000DT00000.021");
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) 1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) (short) 0, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(1L, "P0Y000DT00000.031-1", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.031-1" + "'", str3, "P0Y000DT00000.031-1");
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (byte) -1, "P0Y0M0DT0H0M0.100S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.100-98" + "'", str3, "P0Y000DT00000.100-98");
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) (byte) 10, "P0Y000DT00000.099-1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.099-1" + "'", str3, "P0Y000DT00000.099-1");
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.00100", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00100" + "'", str3, "P0Y000DT00000.00100");
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 10, (long) (byte) 0, "P0Y0M0DT0H0M0.98S", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.98-10" + "'", str5, "P0Y000DT00000.98-10");
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (-1), (long) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.101S" + "'", str2, "P0Y0M0DT0H0M0.101S");
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 1, (long) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2, "P0Y0M0DT0H0M0.000S");
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(1L, (long) (short) 10, "P0Y000DT00000.048100", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.048100" + "'", str5, "P0Y000DT00000.048100");
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 1, (long) ' ', "P0Y000DT00000.00-51", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.00-51" + "'", str5, "P0Y000DT00000.00-51");
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, 0L, "P0Y000DT00000.010-11", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.010-11" + "'", str5, "P0Y000DT00000.010-11");
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 'a', 10L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.13S" + "'", str2, "P0Y0M0DT0H0M0.13S");
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(10L, (long) 'a', "P0Y000DT00000.98-97");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.98-97" + "'", str3, "P0Y000DT00000.98-97");
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (-1), (long) (byte) 0, "P0Y000DT00000.0901", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0901" + "'", str5, "P0Y000DT00000.0901");
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) (byte) -1, "P0Y000DT00000.06510", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.06510" + "'", str5, "P0Y000DT00000.06510");
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 10, (long) (short) 100, "P0Y000DT00000.06510");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.06510" + "'", str3, "P0Y000DT00000.06510");
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.471");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.471" + "'", str2, "P0Y000DT00000.471");
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) ' ', (long) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.068S" + "'", str2, "P0Y0M0DT0H0M0.068S");
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y0M0DT0H0M0.042S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.04232" + "'", str2, "P0Y000DT00000.04232");
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (byte) 0, (long) (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.99S" + "'", str2, "P0Y0M0DT0H0M0.99S");
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(0L, (long) (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.99S" + "'", str2, "P0Y0M0DT0H0M0.99S");
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (-1), (long) 1, "P0000Y000DT00000.0320");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.0320" + "'", str3, "P0000Y000DT00000.0320");
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0Y000DT00000.89100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.89100" + "'", str2, "P0Y000DT00000.89100");
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '#', 10L, "P0Y000DT00000.03117", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.03117" + "'", str5, "P0Y000DT00000.03117");
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '4', 0L, "P0000Y000DT00000.035-35", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0000Y000DT00000.035-35" + "'", str5, "P0000Y000DT00000.035-35");
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 1, "", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(100L, "P0Y0M0DT0H0M0.048S", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.048100" + "'", str3, "P0Y000DT00000.048100");
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (byte) -1, "P0Y0M0DT0H0M0.036S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.036-98" + "'", str3, "P0Y000DT00000.036-98");
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (byte) 1, (long) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.099S" + "'", str2, "P0Y0M0DT0H0M0.099S");
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 1, (long) '4', "P0000Y000DT00000.10010");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.10010" + "'", str3, "P0000Y000DT00000.10010");
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) 1, "P0Y000DT00000.00090", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.00090" + "'", str5, "P0Y000DT00000.00090");
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(0L, 1L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str2, "P0Y0M0DT0H0M0.001S");
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(1L, "P0Y0M0DT0H0M0.98S", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.981" + "'", str3, "P0Y000DT00000.981");
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y000DT00000.653", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.653" + "'", str3, "P0Y000DT00000.653");
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y0M0DT0H0M0.009S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.009100" + "'", str2, "P0Y000DT00000.009100");
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) 10, "P0Y0M0DT0H0M0.52S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.5211" + "'", str3, "P0Y000DT00000.5211");
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (byte) -1, (long) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.053S" + "'", str2, "P0Y0M0DT0H0M0.053S");
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (byte) 10, 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.90S" + "'", str2, "P0Y0M0DT0H0M0.90S");
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.100-1", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.100-1" + "'", str3, "P0Y000DT00000.100-1");
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) 10, "P0Y0M0DT0H0M0.001S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00110" + "'", str3, "P0Y000DT00000.00110");
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-1L), "P0Y000DT00000.051-1", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.051-1" + "'", str3, "P0Y000DT00000.051-1");
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) -1, 0L, "0:00:00.097", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.097" + "'", str5, "0:00:00.097");
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, 0L, "P0Y000DT00000.47-1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.47-1" + "'", str3, "P0Y000DT00000.47-1");
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) (short) 1, "P0Y0M0DT0H0M0.100S", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.1001" + "'", str5, "P0Y000DT00000.1001");
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y000DT00000.9911");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.9911" + "'", str2, "P0Y000DT00000.9911");
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y000DT00000.99-65");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.99-65" + "'", str2, "P0Y000DT00000.99-65");
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-1L), "P0Y000DT00000.6597");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.6597" + "'", str2, "P0Y000DT00000.6597");
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) (byte) -1, true, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 seconds" + "'", str3, "0 seconds");
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) (short) 100, "P0Y0M0DT0H0M0.032S", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.032100" + "'", str5, "P0Y000DT00000.032100");
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y000DT00000.0420", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0420" + "'", str3, "P0Y000DT00000.0420");
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) (byte) 1, "P0Y0M0DT0H0M0.032S", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.032-99" + "'", str5, "P0Y000DT00000.032-99");
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '4', 1L, "", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.003-1", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.003-1" + "'", str3, "P0Y000DT00000.003-1");
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0000Y000DT00000.10010", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.10010" + "'", str3, "P0000Y000DT00000.10010");
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y000DT00000.5211", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.5211" + "'", str3, "P0Y000DT00000.5211");
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) 0, "P0Y0M0DT0H0M0.100S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.1001" + "'", str3, "P0Y000DT00000.1001");
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "P0000Y000DT00000.10010");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0000Y000DT00000.10010" + "'", str2, "P0000Y000DT00000.10010");
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) 1, (long) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.99S" + "'", str2, "P0Y0M0DT0H0M0.99S");
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0Y0M0DT0H0M0.097S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0971" + "'", str2, "P0Y000DT00000.0971");
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 100, 0L, "P0000Y000DT00000.03597", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0000Y000DT00000.03597" + "'", str5, "P0000Y000DT00000.03597");
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) 1, (long) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.099S" + "'", str2, "P0Y0M0DT0H0M0.099S");
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0000Y0M0DT0H0M0.99S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0000Y000DT00000.991" + "'", str2, "P0000Y000DT00000.991");
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0Y000DT00000.00932", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00932" + "'", str3, "P0Y000DT00000.00932");
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) (byte) 10, "P0Y000DT00000.47-11", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.47-11" + "'", str5, "P0Y000DT00000.47-11");
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0Y000DT00000.00097", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00097" + "'", str3, "P0Y000DT00000.00097");
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (-1), (long) ' ', "P0Y0M0DT0H0M0.100S", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.10033" + "'", str5, "P0Y000DT00000.10033");
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 100, (long) '#', "P0Y000DT00000.09910", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.09910" + "'", str5, "P0Y000DT00000.09910");
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (-1L), "0:00:00.99");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.99" + "'", str3, "0:00:00.99");
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(100L, (long) 10, "P0Y000DT00000.051-1", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.051-1" + "'", str5, "P0Y000DT00000.051-1");
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y0M0DT0H0M0.66S", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.66100" + "'", str3, "P0Y000DT00000.66100");
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '#', (long) (short) 10, "", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (byte) -1, 10L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.011S" + "'", str2, "P0Y0M0DT0H0M0.011S");
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (byte) 1, (long) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.031S" + "'", str2, "P0Y0M0DT0H0M0.031S");
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0Y000DT00000.910");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.910" + "'", str2, "P0Y000DT00000.910");
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((-1L), false, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3, "0 days 0 hours 0 minutes 0 seconds");
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (byte) -1, 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str2, "P0Y0M0DT0H0M0.001S");
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 1, (long) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.99S" + "'", str2, "P0Y0M0DT0H0M0.99S");
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) '4', true, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 seconds" + "'", str3, "0 seconds");
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) (short) 100, "0 days 0 hours 0 minutes 0 seconds", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0 0a000 0 hour 0 0inute00 0 econ00" + "'", str5, "0 0a000 0 hour 0 0inute00 0 econ00");
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) (byte) 0, "P0Y000DT00000.0030", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0030" + "'", str5, "P0Y000DT00000.0030");
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(1L, (long) ' ', "P0Y000DT00000.036101", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.036101" + "'", str5, "P0Y000DT00000.036101");
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 10, 100L, "P0Y000DT00000.0311");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0311" + "'", str3, "P0Y000DT00000.0311");
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) (short) 0, true, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 seconds" + "'", str3, "0 seconds");
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 100, (long) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.01S" + "'", str2, "P0Y0M0DT0H0M0.01S");
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '4', 1L, "0:00:00.99", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.99" + "'", str5, "0:00:00.99");
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) (byte) 100, "P0000Y0M0DT0H0M0.096S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0000Y000DT00000.096100" + "'", str5, "P0000Y000DT00000.096100");
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y000DT00000.98-65", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.98-65" + "'", str3, "P0Y000DT00000.98-65");
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) ' ', (long) (short) 0, "P0000Y000DT00000.035-35");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.035-35" + "'", str3, "P0000Y000DT00000.035-35");
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "hi!", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 100, "", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) ' ', (long) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str2, "P0Y0M0DT0H0M0.065S");
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), 0L, "P0Y0M0DT0H0M0.032S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0321" + "'", str3, "P0Y000DT00000.0321");
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) '4', (long) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.048S" + "'", str2, "P0Y0M0DT0H0M0.048S");
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y0M0DT0H0M0.035S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.035-1" + "'", str2, "P0Y000DT00000.035-1");
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) 10, true, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 seconds" + "'", str3, "0 seconds");
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) -1, (long) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str2, "P0Y0M0DT0H0M0.001S");
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), (long) 'a', "P0000Y000DT00000.096-100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.096-100" + "'", str3, "P0000Y000DT00000.096-100");
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 0, (long) 100, "P0Y000DT00000.036100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.036100" + "'", str3, "P0Y000DT00000.036100");
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0Y000DT00000.052101");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.052101" + "'", str2, "P0Y000DT00000.052101");
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) ' ', (long) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.068S" + "'", str2, "P0Y0M0DT0H0M0.068S");
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 10, "P0Y000DT00000.47-1", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.47-1" + "'", str3, "P0Y000DT00000.47-1");
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) (short) -1, "P0000Y0M0DT0H0M0.100S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0000Y000DT00000.100-1" + "'", str5, "P0000Y000DT00000.100-1");
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) (short) 1, false, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3, "0 days 0 hours 0 minutes 0 seconds");
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 0, 0L, "P0Y0M0DT0H0M0.68S", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.680" + "'", str5, "P0Y000DT00000.680");
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.65-1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.65-1" + "'", str2, "P0Y000DT00000.65-1");
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '#', "P0Y000DT00000.0010");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0010" + "'", str2, "P0Y000DT00000.0010");
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) 100, (long) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.99S" + "'", str2, "P0Y0M0DT0H0M0.99S");
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) -1, "0:00:00.052", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.052" + "'", str3, "0:00:00.052");
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '4', (long) 'a', "0 days 0 hours 0 minutes 0 seconds", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0 0a00 0 hour 0 0inute0 0 econ00" + "'", str5, "0 0a00 0 hour 0 0inute0 0 econ00");
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '4', (long) (byte) -1, "P0000Y0M0DT0H0M0.99S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.99-53" + "'", str3, "P0000Y000DT00000.99-53");
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (byte) 1, (long) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.051S" + "'", str2, "P0Y0M0DT0H0M0.051S");
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 100, (long) '4', "P0Y000DT00000.032-99", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.032-99" + "'", str5, "P0Y000DT00000.032-99");
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) 1, "P0Y0M0DT0H0M0.036S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0361" + "'", str3, "P0Y000DT00000.0361");
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '4', (long) (byte) 0, "P0Y000DT00000.001");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.001" + "'", str3, "P0Y000DT00000.001");
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 10, "P0Y000DT00000.065-1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.065-1" + "'", str2, "P0Y000DT00000.065-1");
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 10, (long) (byte) 10, "P0Y0M0DT0H0M0.65S", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.650" + "'", str5, "P0Y000DT00000.650");
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-1L), "P0Y0M0DT0H0M0.64S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.64-1" + "'", str2, "P0Y000DT00000.64-1");
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) ' ', "P0Y0M0DT0H0M0.051S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.05132" + "'", str5, "P0Y000DT00000.05132");
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 10, (long) 10, "P0Y000DT00000.00110", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.00110" + "'", str5, "P0Y000DT00000.00110");
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) 0, 10L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.010S" + "'", str2, "P0Y0M0DT0H0M0.010S");
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y000DT00000.031-1", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.031-1" + "'", str3, "P0Y000DT00000.031-1");
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (-1), (long) (byte) 10, "P0Y000DT00000.10-1", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.10-1" + "'", str5, "P0Y000DT00000.10-1");
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (byte) -1, (long) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.002S" + "'", str2, "P0Y0M0DT0H0M0.002S");
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) (byte) -1, "P0Y000DT00000.91-48", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.91-48" + "'", str5, "P0Y000DT00000.91-48");
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), (long) (short) 1, "P0Y000DT00000.78-31", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.78-31" + "'", str5, "P0Y000DT00000.78-31");
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "P0Y0M0DT0H0M0.025S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0250" + "'", str3, "P0Y000DT00000.0250");
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0Y000DT00000.1001", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.1001" + "'", str3, "P0Y000DT00000.1001");
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) ' ', "0 days", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 0a00" + "'", str3, "0 0a00");
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) (short) 10, "P0000Y000DT00000.0351", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0000Y000DT00000.0351" + "'", str5, "P0000Y000DT00000.0351");
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '#', "P0Y0M0DT0H0M0.98S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.9835" + "'", str2, "P0Y000DT00000.9835");
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) ' ', (long) (byte) -1, "P0Y0M0DT0H0M0.35S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.35-33" + "'", str3, "P0Y000DT00000.35-33");
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 10, 1L, "P0Y000DT00000.010-1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.010-1" + "'", str3, "P0Y000DT00000.010-1");
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) 0, "P0Y000DT00000.47-101", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.47-101" + "'", str5, "P0Y000DT00000.47-101");
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(100L, (long) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.01S" + "'", str2, "P0Y0M0DT0H0M0.01S");
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 10, "P0Y000DT00000.021", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.021" + "'", str3, "P0Y000DT00000.021");
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '#', (long) (byte) 100, "P0Y000DT00000.0651", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0651" + "'", str5, "P0Y000DT00000.0651");
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (-1), (long) 1, "P0Y000DT00000.47-10");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.47-10" + "'", str3, "P0Y000DT00000.47-10");
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(10L, "P0Y000DT00000.00310", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00310" + "'", str3, "P0Y000DT00000.00310");
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '#', "0:00:00.032", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.032" + "'", str3, "0:00:00.032");
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 10, "P0Y000DT00000.001-87");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.001-87" + "'", str2, "P0Y000DT00000.001-87");
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '4', (long) '#', "P0Y000DT00000.032100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.032100" + "'", str3, "P0Y000DT00000.032100");
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 1, 0L, "P0Y000DT00000.010-11", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.010-11" + "'", str5, "P0Y000DT00000.010-11");
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) '4', "P0Y000DT00000.097-1", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.097-1" + "'", str5, "P0Y000DT00000.097-1");
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(0L, (long) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.032S" + "'", str2, "P0Y0M0DT0H0M0.032S");
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (short) -1, "P0Y000DT00000.011100", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.011100" + "'", str5, "P0Y000DT00000.011100");
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(1L, "P0Y000DT00000.04832", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.04832" + "'", str3, "P0Y000DT00000.04832");
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(100L, "P0Y0M0DT0H0M0.65S", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.65100" + "'", str3, "P0Y000DT00000.65100");
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(100L, "hi!", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0000Y000DT00000.100-1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0000Y000DT00000.100-1" + "'", str2, "P0000Y000DT00000.100-1");
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (-1), "P0000Y000DT00000.9952");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0000Y000DT00000.9952" + "'", str2, "P0000Y000DT00000.9952");
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y0M0DT0H0M0.91S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.91-1" + "'", str2, "P0Y000DT00000.91-1");
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (byte) 0, 10L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.010S" + "'", str2, "P0Y0M0DT0H0M0.010S");
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (byte) 100, (long) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2, "P0Y0M0DT0H0M0.000S");
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 10, (-1L), "P0Y000DT00000.78-1", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.78-1" + "'", str5, "P0Y000DT00000.78-1");
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) 10, (long) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.022S" + "'", str2, "P0Y0M0DT0H0M0.022S");
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (byte) 0, "0:00:00.100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.100" + "'", str3, "0:00:00.100");
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) 10, "P0000Y000DT00000.032100", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0000Y000DT00000.032100" + "'", str5, "P0000Y000DT00000.032100");
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y000DT00000.98100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.98100" + "'", str2, "P0Y000DT00000.98100");
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.100", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.100" + "'", str3, "P0Y000DT00000.100");
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), 0L, "P0Y000DT00000.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.000" + "'", str3, "P0Y000DT00000.000");
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), (long) (short) 10, "P0000Y000DT00000.03232", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0000Y000DT00000.03232" + "'", str5, "P0000Y000DT00000.03232");
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) (byte) 10, true, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 seconds" + "'", str3, "0 seconds");
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(10L, "P0Y000DT00000.03110", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.03110" + "'", str3, "P0Y000DT00000.03110");
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) 100, (long) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.35S" + "'", str2, "P0Y0M0DT0H0M0.35S");
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0Y000DT00000.91-48", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.91-48" + "'", str3, "P0Y000DT00000.91-48");
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) (short) 10, "0 seconds");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 0econ00" + "'", str3, "0 0econ00");
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (byte) 100, (long) (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.99S" + "'", str2, "P0Y0M0DT0H0M0.99S");
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(0L, (long) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str2, "P0Y0M0DT0H0M0.001S");
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y000DT00000.680");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.680" + "'", str2, "P0Y000DT00000.680");
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), (long) (-1), "", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 1, "0:00:00.097");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.097" + "'", str2, "0:00:00.097");
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) ' ', (long) (short) 10, "P0Y000DT00000.01097", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.01097" + "'", str5, "P0Y000DT00000.01097");
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) -1, "0 0econ00", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 0econ00" + "'", str3, "0 0econ00");
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) '#', "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) -1, (long) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2, "P0Y0M0DT0H0M0.000S");
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) 0, 100L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.100S" + "'", str2, "P0Y0M0DT0H0M0.100S");
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 1, "P0Y0M0DT0H0M0.048S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0481" + "'", str3, "P0Y000DT00000.0481");
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) (short) 1, "P0Y000DT00000.98100", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.98100" + "'", str5, "P0Y000DT00000.98100");
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y000DT00000.001", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.001" + "'", str3, "P0Y000DT00000.001");
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(100L, (long) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.10S" + "'", str2, "P0Y0M0DT0H0M0.10S");
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(10L, (long) (byte) 1, "P0Y000DT00000.98-97");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.98-97" + "'", str3, "P0Y000DT00000.98-97");
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), 1L, "P0000Y000DT00000.096100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.096100" + "'", str3, "P0000Y000DT00000.096100");
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) (byte) 0, "P0000Y000DT00000.096-100", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0000Y000DT00000.096-100" + "'", str5, "P0000Y000DT00000.096-100");
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y000DT00000.981", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.981" + "'", str3, "P0Y000DT00000.981");
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 1, "P0Y0M0DT0H0M0.000S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0001" + "'", str2, "P0Y000DT00000.0001");
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 10, "0 days 0 hours 0 minutes 0 seconds", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 0a000 0 hour 0 0inute00 0 econ00" + "'", str3, "0 0a000 0 hour 0 0inute00 0 econ00");
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) (byte) 0, false, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days" + "'", str3, "0 days");
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 100, 1L, "P0Y000DT00000.0010", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0010" + "'", str5, "P0Y000DT00000.0010");
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) ' ', (long) (-1), "P0Y000DT00000.64-1", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.64-1" + "'", str5, "P0Y000DT00000.64-1");
    }
}

