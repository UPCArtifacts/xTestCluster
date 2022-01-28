import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y000DT00000.00-51", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00-51" + "'", str3, "P0Y000DT00000.00-51");
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0000Y000DT00000.03597");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0000Y000DT00000.03597" + "'", str2, "P0000Y000DT00000.03597");
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) ' ', "P0Y000DT00000.02568", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.02568" + "'", str5, "P0Y000DT00000.02568");
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) ' ', "P0Y000DT00000.00210", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.00210" + "'", str5, "P0Y000DT00000.00210");
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 100, "0:00:00.100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.100" + "'", str2, "0:00:00.100");
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 100, (-1L));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.99S" + "'", str2, "P0Y0M0DT0H0M0.99S");
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(100L, "P0000Y0M0DT0H0M0.99S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0000Y000DT00000.99100" + "'", str2, "P0000Y000DT00000.99100");
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (-1), (long) (short) 0, "P0Y000DT00000.58100", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.58100" + "'", str5, "P0Y000DT00000.58100");
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) 0, "P0Y000DT00000.010100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.010100" + "'", str3, "P0Y000DT00000.010100");
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 0, (long) (byte) 0, "P0Y000DT00000.000-34", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.000-34" + "'", str5, "P0Y000DT00000.000-34");
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y000DT00000.0530", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0530" + "'", str3, "P0Y000DT00000.0530");
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), 0L, "P0000Y000DT00000.0350", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0000Y000DT00000.0350" + "'", str5, "P0000Y000DT00000.0350");
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (byte) 100, (long) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.10S" + "'", str2, "P0Y0M0DT0H0M0.10S");
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(10L, (long) 1, "P0Y000DT00000.0519", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0519" + "'", str5, "P0Y000DT00000.0519");
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 10, (long) (short) 1, "P0Y000DT00000.0530");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0530" + "'", str3, "P0Y000DT00000.0530");
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (-1), (long) (short) 100, "P0Y000DT00000.025-1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.025-1" + "'", str3, "P0Y000DT00000.025-1");
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0Y000DT00000.03610");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.03610" + "'", str2, "P0Y000DT00000.03610");
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) (short) -1, "P0Y000DT00000.67-98", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.67-98" + "'", str5, "P0Y000DT00000.67-98");
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) 'a', "P0Y000DT00000.4710", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.4710" + "'", str5, "P0Y000DT00000.4710");
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (byte) 1, 1L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2, "P0Y0M0DT0H0M0.000S");
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0Y000DT00000.0209");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0209" + "'", str2, "P0Y000DT00000.0209");
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) (short) 10, "P0Y0M0DT0H0M0.10S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.10-90" + "'", str3, "P0Y000DT00000.10-90");
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) ' ', 0L, "P0Y000DT00000.100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.100" + "'", str3, "P0Y000DT00000.100");
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 0, (long) (short) 10, "P0Y000DT00000.01710", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.01710" + "'", str5, "P0Y000DT00000.01710");
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) ' ', (long) (short) 1, "P0Y000DT00000.001100", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.001100" + "'", str5, "P0Y000DT00000.001100");
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 0, "P0Y000DT00000.66-10", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.66-10" + "'", str3, "P0Y000DT00000.66-10");
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 100, "P0Y000DT00000.000-34", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.000-34" + "'", str3, "P0Y000DT00000.000-34");
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y000DT00000.1001");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.1001" + "'", str2, "P0Y000DT00000.1001");
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) ' ', "P0Y000DT00000.0872", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0872" + "'", str5, "P0Y000DT00000.0872");
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), (-1L), "P0Y000DT00000.32101");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.32101" + "'", str3, "P0Y000DT00000.32101");
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '#', "P0Y000DT00000.068-48", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.068-48" + "'", str3, "P0Y000DT00000.068-48");
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '4', 0L, "0:00:00.032");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.032" + "'", str3, "0:00:00.032");
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(10L, "P0Y000DT00000.017100", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.017100" + "'", str3, "P0Y000DT00000.017100");
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.04-87");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.04-87" + "'", str2, "P0Y000DT00000.04-87");
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y000DT00000.6510", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.6510" + "'", str3, "P0Y000DT00000.6510");
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '4', (long) ' ', "P0Y0M0DT0H0M0.087S", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.087-20" + "'", str5, "P0Y000DT00000.087-20");
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.000-33");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.000-33" + "'", str2, "P0Y000DT00000.000-33");
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 1, (long) (short) 100, "P0Y0M0DT0H0M0.062S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.06299" + "'", str3, "P0Y000DT00000.06299");
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-1L), "P0Y000DT00000.096-51", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.096-51" + "'", str3, "P0Y000DT00000.096-51");
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y000DT00000.68100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.68100" + "'", str2, "P0Y000DT00000.68100");
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) (byte) -1, "0 0a00", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0 0a00" + "'", str5, "0 0a00");
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 1, (long) ' ', "P0Y000DT00000.036-100", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.036-100" + "'", str5, "P0Y000DT00000.036-100");
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) ' ', "P0000Y000DT00000.9910", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.9910" + "'", str3, "P0000Y000DT00000.9910");
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-1L), "P0Y000DT00000.0220");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0220" + "'", str2, "P0Y000DT00000.0220");
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "P0Y0M0DT0H0M0.003S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0030" + "'", str2, "P0Y000DT00000.0030");
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 1, "P0Y000DT00000.0001", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0001" + "'", str3, "P0Y000DT00000.0001");
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, 0L, "P0Y000DT00000.02010");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.02010" + "'", str3, "P0Y000DT00000.02010");
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.32100", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.32100" + "'", str3, "P0Y000DT00000.32100");
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 0, "P0Y0M0DT0H0M0.020S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0200" + "'", str2, "P0Y000DT00000.0200");
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y000DT00000.01011");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.01011" + "'", str2, "P0Y000DT00000.01011");
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) '4', (long) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.47S" + "'", str2, "P0Y0M0DT0H0M0.47S");
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 100, (long) (short) 1, "P0000Y0M0DT0H0M0.035S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.035-99" + "'", str3, "P0000Y000DT00000.035-99");
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y000DT00000.32-1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.32-1" + "'", str2, "P0Y000DT00000.32-1");
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (-1), (long) (byte) 0, "P0Y000DT00000.010", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.010" + "'", str5, "P0Y000DT00000.010");
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '#', (long) (byte) 10, "P0Y000DT00000.89100", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.89100" + "'", str5, "P0Y000DT00000.89100");
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) (short) 100, "P0Y000DT00000.65100", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.65100" + "'", str5, "P0Y000DT00000.65100");
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) 1, "P0Y000DT00000.097-1", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.097-1" + "'", str5, "P0Y000DT00000.097-1");
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) (short) -1, "P0Y000DT00000.47-101");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.47-101" + "'", str3, "P0Y000DT00000.47-101");
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y0M0DT0H0M0.010S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.010-1" + "'", str2, "P0Y000DT00000.010-1");
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 10, "P0Y000DT00000.000-101");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.000-101" + "'", str2, "P0Y000DT00000.000-101");
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) '#', true, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 seconds" + "'", str3, "0 seconds");
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 0, "P0Y000DT00000.6710");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.6710" + "'", str2, "P0Y000DT00000.6710");
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0Y0M0DT0H0M0.068S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.06810" + "'", str2, "P0Y000DT00000.06810");
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 0, "P0Y000DT00000.04552", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.04552" + "'", str3, "P0Y000DT00000.04552");
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (-1), (long) (byte) 100, "", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 100, (long) 0, "P0Y000DT00000.01097", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.01097" + "'", str5, "P0Y000DT00000.01097");
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (-1), 0L, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0000Y0M0DT0H0M0.001S" + "'", str5, "P0000Y0M0DT0H0M0.001S");
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) ' ', (long) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.68S" + "'", str2, "P0Y0M0DT0H0M0.68S");
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(1L, "P0Y000DT00000.00210");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.00210" + "'", str2, "P0Y000DT00000.00210");
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y000DT00000.03535");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.03535" + "'", str2, "P0Y000DT00000.03535");
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 1, "P0Y000DT00000.00932", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00932" + "'", str3, "P0Y000DT00000.00932");
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (byte) 10, (long) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.90S" + "'", str2, "P0Y0M0DT0H0M0.90S");
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, 0L, "P0Y000DT00000.47-11");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.47-11" + "'", str3, "P0Y000DT00000.47-11");
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) 'a', "P0Y000DT00000.03197");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.03197" + "'", str3, "P0Y000DT00000.03197");
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 0, (long) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.010S" + "'", str2, "P0Y0M0DT0H0M0.010S");
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) 1, "P0Y000DT00000.09010", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.09010" + "'", str5, "P0Y000DT00000.09010");
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) (short) 100, "P0Y000DT00000.89-1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.89-1" + "'", str3, "P0Y000DT00000.89-1");
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 10, "P0Y000DT00000.101", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.101" + "'", str3, "P0Y000DT00000.101");
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(10L, (long) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.91S" + "'", str2, "P0Y0M0DT0H0M0.91S");
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "0 days", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 0a00" + "'", str3, "0 0a00");
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y000DT00000.0620");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0620" + "'", str2, "P0Y000DT00000.0620");
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 1, "P0Y000DT00000.981");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.981" + "'", str2, "P0Y000DT00000.981");
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(100L, (long) (byte) -1, "P0Y000DT00000.89-53", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.89-53" + "'", str5, "P0Y000DT00000.89-53");
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 10, (long) 0, "P0Y000DT00000.101-100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.101-100" + "'", str3, "P0Y000DT00000.101-100");
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (-1), "P0000Y000DT00000.0350");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0000Y000DT00000.0350" + "'", str2, "P0000Y000DT00000.0350");
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(100L, (long) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.00S" + "'", str2, "P0Y0M0DT0H0M0.00S");
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 'a', 1L, "P0Y000DT00000.05111", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.05111" + "'", str5, "P0Y000DT00000.05111");
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '4', "P0Y000DT00000.0221", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0221" + "'", str3, "P0Y000DT00000.0221");
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(10L, "P0Y000DT00000.096-51");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.096-51" + "'", str2, "P0Y000DT00000.096-51");
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (byte) 1, "P0Y000DT00000.09068");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.09068" + "'", str3, "P0Y000DT00000.09068");
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) (byte) -1, "P0Y0M0DT0H0M0.91S", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.91-1" + "'", str5, "P0Y000DT00000.91-1");
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) (byte) 0, "P0Y000DT00000.09935", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.09935" + "'", str5, "P0Y000DT00000.09935");
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 1, (long) (short) -1, "P0Y000DT00000.000-101", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.000-101" + "'", str5, "P0Y000DT00000.000-101");
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (short) -1, "P0Y0M0DT0H0M0.096S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.096-11" + "'", str3, "P0Y000DT00000.096-11");
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0Y000DT00000.89-53", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.89-53" + "'", str3, "P0Y000DT00000.89-53");
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) 1, "P0Y000DT00000.9810");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.9810" + "'", str3, "P0Y000DT00000.9810");
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (-1), (long) 'a', "P0Y000DT00000.00-101");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00-101" + "'", str3, "P0Y000DT00000.00-101");
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y0M0DT0H0M0.58S", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.5832" + "'", str3, "P0Y000DT00000.5832");
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) '4', "P0Y0M0DT0H0M0.042S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.04252" + "'", str3, "P0Y000DT00000.04252");
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 1, (long) '#', "P0000Y0M0DT0H0M0.035S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0000Y000DT00000.03534" + "'", str5, "P0000Y000DT00000.03534");
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) 0, (long) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.010S" + "'", str2, "P0Y0M0DT0H0M0.010S");
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) (short) -1, "P0Y000DT00000.47-11", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.47-11" + "'", str5, "P0Y000DT00000.47-11");
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) 0, "P0000Y000DT00000.10099");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.10099" + "'", str3, "P0000Y000DT00000.10099");
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '4', (long) (short) 10, "P0Y000DT00000.66-10", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.66-10" + "'", str5, "P0Y000DT00000.66-10");
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 10, "0:00:00.001");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.001" + "'", str2, "0:00:00.001");
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) 1, "P0Y000DT00000.017100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.017100" + "'", str3, "P0Y000DT00000.017100");
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) 1, "P0Y000DT00000.99-53");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.99-53" + "'", str3, "P0Y000DT00000.99-53");
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(10L, "P0000Y000DT00000.096100", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.096100" + "'", str3, "P0000Y000DT00000.096100");
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.580", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.580" + "'", str3, "P0Y000DT00000.580");
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 'a', 1L, "P0Y000DT00000.100-98");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.100-98" + "'", str3, "P0Y000DT00000.100-98");
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '#', (long) (short) -1, "P0Y000DT00000.0001", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0001" + "'", str5, "P0Y000DT00000.0001");
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y000DT00000.35-1", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.35-1" + "'", str3, "P0Y000DT00000.35-1");
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (-1), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 100, (long) 'a', "P0Y0M0DT0H0M0.011S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.011-3" + "'", str5, "P0Y000DT00000.011-3");
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (byte) 0, (long) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2, "P0Y0M0DT0H0M0.000S");
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(10L, (-1L), "P0Y000DT00000.580");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.580" + "'", str3, "P0Y000DT00000.580");
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0Y000DT00000.098-1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.098-1" + "'", str2, "P0Y000DT00000.098-1");
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.04232");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.04232" + "'", str2, "P0Y000DT00000.04232");
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 0, "P0Y000DT00000.009100", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.009100" + "'", str3, "P0Y000DT00000.009100");
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (-1), (long) (short) 0, "P0Y000DT00000.025-101");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.025-101" + "'", str3, "P0Y000DT00000.025-101");
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y000DT00000.0420");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0420" + "'", str2, "P0Y000DT00000.0420");
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y000DT00000.068-1", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.068-1" + "'", str3, "P0Y000DT00000.068-1");
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0Y0M0DT0H0M0.01S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0110" + "'", str2, "P0Y000DT00000.0110");
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(1L, (long) (-1), "P0Y000DT00000.00-2");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00-2" + "'", str3, "P0Y000DT00000.00-2");
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(10L, "P0000Y000DT00000.00165");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0000Y000DT00000.00165" + "'", str2, "P0000Y000DT00000.00165");
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) ' ', (long) (short) 0, "P0Y000DT00000.0421");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0421" + "'", str3, "P0Y000DT00000.0421");
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) (byte) -1, "P0Y000DT00000.036-100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.036-100" + "'", str3, "P0Y000DT00000.036-100");
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 100, "P0Y0M0DT0H0M0.32S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.32100" + "'", str3, "P0Y000DT00000.32100");
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '4', "P0Y000DT00000.0201");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0201" + "'", str2, "P0Y000DT00000.0201");
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0Y000DT00000.09910", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.09910" + "'", str3, "P0Y000DT00000.09910");
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(10L, (long) (byte) -1, "P0Y0M0DT0H0M0.090S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.090-11" + "'", str5, "P0Y000DT00000.090-11");
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.01097");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.01097" + "'", str2, "P0Y000DT00000.01097");
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 'a', (long) 10, "0:00:00.035");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.035" + "'", str3, "0:00:00.035");
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) -1, 100L, "P0Y000DT00000.090-98", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.090-98" + "'", str5, "P0Y000DT00000.090-98");
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.641", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.641" + "'", str3, "P0Y000DT00000.641");
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y000DT00000.03631");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.03631" + "'", str2, "P0Y000DT00000.03631");
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '#', "P0Y000DT00000.01710", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.01710" + "'", str3, "P0Y000DT00000.01710");
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.750", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.750" + "'", str3, "P0Y000DT00000.750");
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(100L, (long) 0, "P0Y000DT00000.981", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.981" + "'", str5, "P0Y000DT00000.981");
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (-1), (long) (byte) 10, "P0Y000DT00000.5211");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.5211" + "'", str3, "P0Y000DT00000.5211");
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(1L, (long) (byte) 0, "P0Y000DT00000.0201", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0201" + "'", str5, "P0Y000DT00000.0201");
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 'a', (long) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.03S" + "'", str2, "P0Y0M0DT0H0M0.03S");
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0Y000DT00000.00100", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00100" + "'", str3, "P0Y000DT00000.00100");
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '#', (long) (short) 1, "P0Y000DT00000.087-20", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.087-20" + "'", str5, "P0Y000DT00000.087-20");
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 100, "P0Y0M0DT0H0M0.052S", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.052100" + "'", str3, "P0Y000DT00000.052100");
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y000DT00000.042100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.042100" + "'", str2, "P0Y000DT00000.042100");
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0Y0M0DT0H0M0.096S", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0961" + "'", str3, "P0Y000DT00000.0961");
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(100L, "P0Y000DT00000.90100", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.90100" + "'", str3, "P0Y000DT00000.90100");
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '4', "P0Y000DT00000.048-99");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.048-99" + "'", str2, "P0Y000DT00000.048-99");
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) '4', "P0Y000DT00000.03297", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.03297" + "'", str5, "P0Y000DT00000.03297");
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0Y000DT00000.131");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.131" + "'", str2, "P0Y000DT00000.131");
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 1, "P0Y000DT00000.04890", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.04890" + "'", str3, "P0Y000DT00000.04890");
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y000DT00000.10010", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.10010" + "'", str3, "P0Y000DT00000.10010");
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 100, "P0Y0M0DT0H0M0.98S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.98100" + "'", str2, "P0Y000DT00000.98100");
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0Y000DT00000.100-98");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.100-98" + "'", str2, "P0Y000DT00000.100-98");
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 0, 1L, "P0Y000DT00000.90100", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.90100" + "'", str5, "P0Y000DT00000.90100");
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) -1, (long) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.101S" + "'", str2, "P0Y0M0DT0H0M0.101S");
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 1, "P0Y000DT00000.98-100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.98-100" + "'", str2, "P0Y000DT00000.98-100");
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 0, "P0Y000DT00000.0090");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0090" + "'", str2, "P0Y000DT00000.0090");
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-1L), "P0000Y000DT00000.096-25", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.096-25" + "'", str3, "P0000Y000DT00000.096-25");
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 10, "", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (byte) -1, "P0Y000DT00000.05310", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.05310" + "'", str5, "P0Y000DT00000.05310");
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(100L, 10L, "P0Y000DT00000.750", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.750" + "'", str5, "P0Y000DT00000.750");
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 1, "P0Y000DT00000.32-45");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.32-45" + "'", str2, "P0Y000DT00000.32-45");
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) (short) 100, "P0Y000DT00000.010-11", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.010-11" + "'", str5, "P0Y000DT00000.010-11");
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(100L, (long) ' ', "P0000Y000DT00000.035-9");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.035-9" + "'", str3, "P0000Y000DT00000.035-9");
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 1, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y0M0DT0H0M0.042S", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.042-1" + "'", str3, "P0Y000DT00000.042-1");
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y000DT00000.036-98", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.036-98" + "'", str3, "P0Y000DT00000.036-98");
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.090100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.090100" + "'", str2, "P0Y000DT00000.090100");
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (byte) 0, (long) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2, "P0Y0M0DT0H0M0.000S");
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (short) -1, "P0Y000DT00000.00-101", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.00-101" + "'", str5, "P0Y000DT00000.00-101");
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '4', "P0Y000DT00000.00087");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.00087" + "'", str2, "P0Y000DT00000.00087");
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(10L, "P0Y000DT00000.020", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.020" + "'", str3, "P0Y000DT00000.020");
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '4', "P0Y000DT00000.09068");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.09068" + "'", str2, "P0Y000DT00000.09068");
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0000Y000DT00000.032100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0000Y000DT00000.032100" + "'", str2, "P0000Y000DT00000.032100");
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y000DT00000.06511");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.06511" + "'", str2, "P0Y000DT00000.06511");
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y000DT00000.1000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.1000" + "'", str2, "P0Y000DT00000.1000");
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(100L, (long) (short) 0, "P0Y000DT00000.009-1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.009-1" + "'", str3, "P0Y000DT00000.009-1");
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y0M0DT0H0M0.100S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.100-1" + "'", str2, "P0Y000DT00000.100-1");
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 0, (long) 1, "P0Y000DT00000.0519", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0519" + "'", str5, "P0Y000DT00000.0519");
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.09732", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.09732" + "'", str3, "P0Y000DT00000.09732");
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) ' ', "P0000Y000DT00000.100-1", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.100-1" + "'", str3, "P0000Y000DT00000.100-1");
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.05131", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.05131" + "'", str3, "P0Y000DT00000.05131");
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(1L, "P0000Y000DT00000.035-1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0000Y000DT00000.035-1" + "'", str2, "P0000Y000DT00000.035-1");
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y000DT00000.4732");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.4732" + "'", str2, "P0Y000DT00000.4732");
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 1, 1L, "P0Y000DT00000.03610", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.03610" + "'", str5, "P0Y000DT00000.03610");
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) (byte) -1, "P0Y000DT00000.91-48", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.91-48" + "'", str5, "P0Y000DT00000.91-48");
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "0 seconds");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0 0econ00" + "'", str2, "0 0econ00");
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 100, "P0Y000DT00000.351");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.351" + "'", str2, "P0Y000DT00000.351");
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 0, (long) 100, "P0Y000DT00000.03552", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.03552" + "'", str5, "P0Y000DT00000.03552");
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y000DT00000.0297");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0297" + "'", str2, "P0Y000DT00000.0297");
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0Y000DT00000.99-11");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.99-11" + "'", str2, "P0Y000DT00000.99-11");
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 10, "0:00:00.001");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.001" + "'", str2, "0:00:00.001");
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) (short) 100, "P0Y000DT00000.0225", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0225" + "'", str5, "P0Y000DT00000.0225");
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(100L, (long) (short) 1, "P0Y000DT00000.6997", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.6997" + "'", str5, "P0Y000DT00000.6997");
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) ' ', (long) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.67S" + "'", str2, "P0Y0M0DT0H0M0.67S");
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y000DT00000.065-1", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.065-1" + "'", str3, "P0Y000DT00000.065-1");
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0Y000DT00000.003-10");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.003-10" + "'", str2, "P0Y000DT00000.003-10");
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '#', 100L, "P0Y000DT00000.036-98");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.036-98" + "'", str3, "P0Y000DT00000.036-98");
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 10, (long) (short) -1, "P0Y000DT00000.91-42", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.91-42" + "'", str5, "P0Y000DT00000.91-42");
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 100, "P0Y000DT00000.000-101", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.000-101" + "'", str3, "P0Y000DT00000.000-101");
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(100L, "P0Y000DT00000.9810");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.9810" + "'", str2, "P0Y000DT00000.9810");
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) '4', "P0Y000DT00000.03535");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.03535" + "'", str3, "P0Y000DT00000.03535");
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y000DT00000.0320");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0320" + "'", str2, "P0Y000DT00000.0320");
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0Y000DT00000.0209", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0209" + "'", str3, "P0Y000DT00000.0209");
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y000DT00000.09732");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.09732" + "'", str2, "P0Y000DT00000.09732");
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 1, (long) (short) 1, "P0Y000DT00000.0420");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0420" + "'", str3, "P0Y000DT00000.0420");
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(10L, "P0Y000DT00000.580", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.580" + "'", str3, "P0Y000DT00000.580");
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 0, 100L, "P0000Y000DT00000.096100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.096100" + "'", str3, "P0000Y000DT00000.096100");
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) ' ', (long) ' ', "P0Y0M0DT0H0M0.99S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.990" + "'", str5, "P0Y000DT00000.990");
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0000Y000DT00000.035101", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.035101" + "'", str3, "P0000Y000DT00000.035101");
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.89100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.89100" + "'", str2, "P0Y000DT00000.89100");
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y000DT00000.0872", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0872" + "'", str3, "P0Y000DT00000.0872");
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.09911");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.09911" + "'", str2, "P0Y000DT00000.09911");
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0Y000DT00000.068-1", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.068-1" + "'", str3, "P0Y000DT00000.068-1");
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) 'a', "P0Y000DT00000.000-33", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.000-33" + "'", str5, "P0Y000DT00000.000-33");
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (-1), (long) (short) -1, "P0Y000DT00000.09910");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.09910" + "'", str3, "P0Y000DT00000.09910");
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) 0, "P0Y000DT00000.0110");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0110" + "'", str3, "P0Y000DT00000.0110");
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) -1, "P0Y000DT00000.009101");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.009101" + "'", str3, "P0Y000DT00000.009101");
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '4', "0 days");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0 0a00" + "'", str2, "0 0a00");
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '4', (long) 0, "P0000Y000DT00000.9997", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0000Y000DT00000.9997" + "'", str5, "P0000Y000DT00000.9997");
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(1L, (long) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.099S" + "'", str2, "P0Y0M0DT0H0M0.099S");
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 100, 0L, "0 0a00", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0 0a00" + "'", str5, "0 0a00");
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y000DT00000.66-1", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.66-1" + "'", str3, "P0Y000DT00000.66-1");
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0Y000DT00000.470", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.470" + "'", str3, "P0Y000DT00000.470");
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) 1, (-1L));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.98S" + "'", str2, "P0Y0M0DT0H0M0.98S");
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '4', (long) 0, "P0Y000DT00000.5832");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.5832" + "'", str3, "P0Y000DT00000.5832");
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) -1, "P0Y0M0DT0H0M0.78S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.78-1" + "'", str5, "P0Y000DT00000.78-1");
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, 10L, "P0000Y000DT00000.096-10");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.096-10" + "'", str3, "P0000Y000DT00000.096-10");
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.00932", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00932" + "'", str3, "P0Y000DT00000.00932");
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 10, "P0Y000DT00000.04810", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.04810" + "'", str3, "P0Y000DT00000.04810");
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (-1), (long) '#', "P0Y000DT00000.0201");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0201" + "'", str3, "P0Y000DT00000.0201");
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(100L, "P0Y000DT00000.00210", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00210" + "'", str3, "P0Y000DT00000.00210");
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '4', 0L, "P0Y000DT00000.05236", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.05236" + "'", str5, "P0Y000DT00000.05236");
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) -1, 10L, "P0000Y000DT00000.096-25", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0000Y000DT00000.096-25" + "'", str5, "P0000Y000DT00000.096-25");
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.09790");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.09790" + "'", str2, "P0Y000DT00000.09790");
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 0, (long) 100, "P0Y000DT00000.101-1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.101-1" + "'", str3, "P0Y000DT00000.101-1");
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, 100L, "P0Y000DT00000.00135");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00135" + "'", str3, "P0Y000DT00000.00135");
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 100, 0L, "P0Y000DT00000.032-101", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.032-101" + "'", str5, "P0Y000DT00000.032-101");
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(10L, 10L, "P0Y000DT00000.03117");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.03117" + "'", str3, "P0Y000DT00000.03117");
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 100, (long) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.00S" + "'", str2, "P0Y0M0DT0H0M0.00S");
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0Y000DT00000.6890", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.6890" + "'", str3, "P0Y000DT00000.6890");
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) (short) 10, "P0Y000DT00000.650");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.650" + "'", str3, "P0Y000DT00000.650");
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) (byte) 0, "P0Y0M0DT0H0M0.001S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0011" + "'", str5, "P0Y000DT00000.0011");
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y000DT00000.32100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.32100" + "'", str2, "P0Y000DT00000.32100");
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '4', (long) 1, "P0000Y000DT00000.99-1", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0000Y000DT00000.99-1" + "'", str5, "P0000Y000DT00000.99-1");
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (byte) 0, (long) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.99S" + "'", str2, "P0Y0M0DT0H0M0.99S");
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) ' ', 0L, "P0Y000DT00000.98-10", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.98-10" + "'", str5, "P0Y000DT00000.98-10");
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 10, (long) (short) -1, "P0Y000DT00000.03552", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.03552" + "'", str5, "P0Y000DT00000.03552");
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '#', (long) (byte) 1, "P0Y000DT00000.003-1", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.003-1" + "'", str5, "P0Y000DT00000.003-1");
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (byte) -1, "P0Y000DT00000.00110", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.00110" + "'", str5, "P0Y000DT00000.00110");
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(10L, "P0Y000DT00000.051-1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.051-1" + "'", str2, "P0Y000DT00000.051-1");
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.66100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.66100" + "'", str2, "P0Y000DT00000.66100");
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '4', "P0Y000DT00000.68-1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.68-1" + "'", str2, "P0Y000DT00000.68-1");
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 10, 100L, "P0Y000DT00000.7897");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.7897" + "'", str3, "P0Y000DT00000.7897");
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y000DT00000.641");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.641" + "'", str2, "P0Y000DT00000.641");
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) (short) -1, "P0Y0M0DT0H0M0.64S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.64-2" + "'", str3, "P0Y000DT00000.64-2");
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 0, "P0Y000DT00000.5211");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.5211" + "'", str2, "P0Y000DT00000.5211");
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.06510", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.06510" + "'", str3, "P0Y000DT00000.06510");
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0Y000DT00000.00910");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.00910" + "'", str2, "P0Y000DT00000.00910");
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 'a', (-1L));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.02S" + "'", str2, "P0Y0M0DT0H0M0.02S");
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 10, (long) 100, "", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) (byte) 1, "P0Y000DT00000.0650", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0650" + "'", str5, "P0Y000DT00000.0650");
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (-1), (long) (-1), "P0Y000DT00000.78-33", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.78-33" + "'", str5, "P0Y000DT00000.78-33");
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y000DT00000.042-1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.042-1" + "'", str2, "P0Y000DT00000.042-1");
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) 1, "P0Y000DT00000.0650");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0650" + "'", str3, "P0Y000DT00000.0650");
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '#', (long) 10, "P0Y000DT00000.0421");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0421" + "'", str3, "P0Y000DT00000.0421");
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.490");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.490" + "'", str2, "P0Y000DT00000.490");
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) (short) 0, "P0Y000DT00000.06511", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.06511" + "'", str5, "P0Y000DT00000.06511");
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y000DT00000.990", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.990" + "'", str3, "P0Y000DT00000.990");
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0Y000DT00000.04287");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.04287" + "'", str2, "P0Y000DT00000.04287");
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y000DT00000.00042");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.00042" + "'", str2, "P0Y000DT00000.00042");
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '#', "P0000Y000DT00000.9910");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0000Y000DT00000.9910" + "'", str2, "P0000Y000DT00000.9910");
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((-1L), (long) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.011S" + "'", str2, "P0Y0M0DT0H0M0.011S");
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 100, 1L, "0 days", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0 0a00" + "'", str5, "0 0a00");
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 10, 1L, "P0Y0M0DT0H0M0.91S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.91-9" + "'", str3, "P0Y000DT00000.91-9");
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (byte) 0, (long) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.100S" + "'", str2, "P0Y0M0DT0H0M0.100S");
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y000DT00000.096-51", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.096-51" + "'", str3, "P0Y000DT00000.096-51");
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) 1, "P0Y000DT00000.5832");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.5832" + "'", str3, "P0Y000DT00000.5832");
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 100, 0L, "P0Y000DT00000.0361");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0361" + "'", str3, "P0Y000DT00000.0361");
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 1, (long) '4', "P0000Y000DT00000.096-100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.096-100" + "'", str3, "P0000Y000DT00000.096-100");
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (-1), 100L, "P0Y000DT00000.131");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.131" + "'", str3, "P0Y000DT00000.131");
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 1, 10L, "P0Y000DT00000.0020");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0020" + "'", str3, "P0Y000DT00000.0020");
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) (short) 0, "P0000Y0M0DT0H0M0.99S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.990" + "'", str3, "P0000Y000DT00000.990");
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y0M0DT0H0M0.10S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.100" + "'", str2, "P0Y000DT00000.100");
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-1L), "P0Y000DT00000.6610", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.6610" + "'", str3, "P0Y000DT00000.6610");
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y000DT00000.6552", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.6552" + "'", str3, "P0Y000DT00000.6552");
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y000DT00000.0110");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0110" + "'", str2, "P0Y000DT00000.0110");
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(1L, (long) 100, "P0Y000DT00000.69-2", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.69-2" + "'", str5, "P0Y000DT00000.69-2");
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) (byte) 0, "P0Y0M0DT0H0M0.001S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.001-100" + "'", str5, "P0Y000DT00000.001-100");
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) (byte) 1, "P0Y000DT00000.0250", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0250" + "'", str5, "P0Y000DT00000.0250");
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0000Y000DT00000.096-100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0000Y000DT00000.096-100" + "'", str2, "P0000Y000DT00000.096-100");
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y000DT00000.0420", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0420" + "'", str3, "P0Y000DT00000.0420");
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.0010", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0010" + "'", str3, "P0Y000DT00000.0010");
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) (byte) -1, "P0Y000DT00000.5832", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.5832" + "'", str5, "P0Y000DT00000.5832");
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y000DT00000.0872", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0872" + "'", str3, "P0Y000DT00000.0872");
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) (byte) 0, "P0Y000DT00000.00135", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.00135" + "'", str5, "P0Y000DT00000.00135");
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, 100L, "P0Y000DT00000.003-1", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.003-1" + "'", str5, "P0Y000DT00000.003-1");
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 1, (long) (byte) 100, "P0Y000DT00000.1010");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.1010" + "'", str3, "P0Y000DT00000.1010");
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (-1), (-1L));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2, "P0Y0M0DT0H0M0.000S");
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 1, (long) '#', "P0Y000DT00000.011");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.011" + "'", str3, "P0Y000DT00000.011");
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '#', (long) (short) 0, "P0000Y000DT00000.0351");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.0351" + "'", str3, "P0000Y000DT00000.0351");
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) 0, "P0Y000DT00000.1033", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.1033" + "'", str5, "P0Y000DT00000.1033");
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) (short) 1, "P0Y0M0DT0H0M0.98S", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.98-99" + "'", str5, "P0Y000DT00000.98-99");
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) (short) 10, "P0Y000DT00000.6710");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.6710" + "'", str3, "P0Y000DT00000.6710");
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-1L), "P0Y0M0DT0H0M0.009S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.009-1" + "'", str2, "P0Y000DT00000.009-1");
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) 10, "P0Y000DT00000.000-33");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.000-33" + "'", str3, "P0Y000DT00000.000-33");
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) (short) 10, "P0Y0M0DT0H0M0.098S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0989" + "'", str3, "P0Y000DT00000.0989");
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) 0, "P0Y000DT00000.011100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.011100" + "'", str3, "P0Y000DT00000.011100");
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (-1), (long) (short) 0, "P0Y000DT00000.04232");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.04232" + "'", str3, "P0Y000DT00000.04232");
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 10, (long) (-1), "P0Y000DT00000.99-65", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.99-65" + "'", str5, "P0Y000DT00000.99-65");
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(1L, "P0Y000DT00000.05310");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.05310" + "'", str2, "P0Y000DT00000.05310");
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 1, "P0Y0M0DT0H0M0.66S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.661" + "'", str2, "P0Y000DT00000.661");
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) -1, 10L, "P0Y000DT00000.7810");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.7810" + "'", str3, "P0Y000DT00000.7810");
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) 'a', "P0000Y000DT00000.096-10");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.096-10" + "'", str3, "P0000Y000DT00000.096-10");
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) ' ', "P0Y000DT00000.99-1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.99-1" + "'", str3, "P0Y000DT00000.99-1");
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 1, 1L, "P0Y000DT00000.0520", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0520" + "'", str5, "P0Y000DT00000.0520");
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 100, (long) (short) 10, "P0Y000DT00000.003-1", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.003-1" + "'", str5, "P0Y000DT00000.003-1");
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) ' ', (long) (short) 1, "P0Y000DT00000.890");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.890" + "'", str3, "P0Y000DT00000.890");
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.001-87");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.001-87" + "'", str2, "P0Y000DT00000.001-87");
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 100, "P0Y0M0DT0H0M0.002S", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.002100" + "'", str3, "P0Y000DT00000.002100");
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.035-1", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.035-1" + "'", str3, "P0Y000DT00000.035-1");
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.66100", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.66100" + "'", str3, "P0Y000DT00000.66100");
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) (byte) 1, "P0Y000DT00000.010-11", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.010-11" + "'", str5, "P0Y000DT00000.010-11");
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '4', (long) 100, "P0000Y000DT00000.096-10", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0000Y000DT00000.096-10" + "'", str5, "P0000Y000DT00000.096-10");
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '#', "P0Y0M0DT0H0M0.045S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.04535" + "'", str2, "P0Y000DT00000.04535");
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) 10, "P0Y0M0DT0H0M0.01S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0110" + "'", str5, "P0Y000DT00000.0110");
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) 'a', "P0Y000DT00000.100-98");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.100-98" + "'", str3, "P0Y000DT00000.100-98");
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 10, (long) (short) 0, "P0Y000DT00000.990", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.990" + "'", str5, "P0Y000DT00000.990");
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(1L, "P0Y000DT00000.0530", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0530" + "'", str3, "P0Y000DT00000.0530");
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y000DT00000.0971", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0971" + "'", str3, "P0Y000DT00000.0971");
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), (long) 10, "P0Y000DT00000.0650");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0650" + "'", str3, "P0Y000DT00000.0650");
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) (short) -1, "P0Y0M0DT0H0M0.52S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.520" + "'", str3, "P0Y000DT00000.520");
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0000Y000DT00000.03210", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.03210" + "'", str3, "P0000Y000DT00000.03210");
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(100L, "P0Y000DT00000.641");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.641" + "'", str2, "P0Y000DT00000.641");
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 0, "P0000Y000DT00000.03552");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0000Y000DT00000.03552" + "'", str2, "P0000Y000DT00000.03552");
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y0M0DT0H0M0.062S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.062-1" + "'", str2, "P0Y000DT00000.062-1");
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(10L, "P0Y0M0DT0H0M0.98S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.9810" + "'", str3, "P0Y000DT00000.9810");
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) (byte) 100, "P0Y000DT00000.011100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.011100" + "'", str3, "P0Y000DT00000.011100");
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 'a', (long) 10, "P0Y000DT00000.052100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.052100" + "'", str3, "P0Y000DT00000.052100");
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 1, (long) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.099S" + "'", str2, "P0Y0M0DT0H0M0.099S");
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (-1), (long) 1, "P0Y000DT00000.09010");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.09010" + "'", str3, "P0Y000DT00000.09010");
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(10L, "P0Y000DT00000.002100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.002100" + "'", str2, "P0Y000DT00000.002100");
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "P0Y0M0DT0H0M0.02S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.020" + "'", str2, "P0Y000DT00000.020");
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) 100, "P0000Y000DT00000.99100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.99100" + "'", str3, "P0000Y000DT00000.99100");
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '#', "P0Y0M0DT0H0M0.035S", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.03535" + "'", str3, "P0Y000DT00000.03535");
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (-1L), "P0Y000DT00000.0001", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0001" + "'", str5, "P0Y000DT00000.0001");
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '4', (long) (-1), "P0Y0M0DT0H0M0.58S", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.58-53" + "'", str5, "P0Y000DT00000.58-53");
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y000DT00000.025-10");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.025-10" + "'", str2, "P0Y000DT00000.025-10");
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 100, "P0000Y000DT00000.10099", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.10099" + "'", str3, "P0000Y000DT00000.10099");
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 100, (long) '4', "P0Y0M0DT0H0M0.99S", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.99-48" + "'", str5, "P0Y000DT00000.99-48");
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y000DT00000.00222", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00222" + "'", str3, "P0Y000DT00000.00222");
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(10L, 0L, "0:00:00.100", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.100" + "'", str5, "0:00:00.100");
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (-1), 10L, "P0Y0M0DT0H0M0.003S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00311" + "'", str3, "P0Y000DT00000.00311");
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, 1L, "P0Y000DT00000.7897", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.7897" + "'", str5, "P0Y000DT00000.7897");
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) '#', "P0000Y000DT00000.03597");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.03597" + "'", str3, "P0000Y000DT00000.03597");
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), (long) 1, "P0Y000DT00000.8952", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.8952" + "'", str5, "P0Y000DT00000.8952");
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) (byte) -1, "P0Y000DT00000.011");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.011" + "'", str3, "P0Y000DT00000.011");
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(10L, "0:00:00.097", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.097" + "'", str3, "0:00:00.097");
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(1L, "P0Y000DT00000.35-33");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.35-33" + "'", str2, "P0Y000DT00000.35-33");
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 100, 0L, "P0Y000DT00000.04890", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.04890" + "'", str5, "P0Y000DT00000.04890");
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) '#', "P0Y0M0DT0H0M0.89S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.89-65" + "'", str3, "P0Y000DT00000.89-65");
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(1L, (long) 100, "", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.053-11", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.053-11" + "'", str3, "P0Y000DT00000.053-11");
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y0M0DT0H0M0.68S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.68100" + "'", str3, "P0Y000DT00000.68100");
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) 0, "P0Y000DT00000.0225");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0225" + "'", str3, "P0Y000DT00000.0225");
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) 100, "0:00:00.097", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.097" + "'", str5, "0:00:00.097");
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 100, "P0Y000DT00000.03297", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.03297" + "'", str3, "P0Y000DT00000.03297");
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) (byte) 0, "P0Y000DT00000.031-1", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.031-1" + "'", str5, "P0Y000DT00000.031-1");
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (-1), "P0Y000DT00000.020");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.020" + "'", str3, "P0Y000DT00000.020");
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 'a', (long) 1, "P0Y000DT00000.000100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.000100" + "'", str3, "P0Y000DT00000.000100");
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y000DT00000.67-98");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.67-98" + "'", str2, "P0Y000DT00000.67-98");
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y000DT00000.03197", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.03197" + "'", str3, "P0Y000DT00000.03197");
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 0, (long) 'a', "P0Y000DT00000.0311");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0311" + "'", str3, "P0Y000DT00000.0311");
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 10, 10L, "P0000Y000DT00000.100-1", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0000Y000DT00000.100-1" + "'", str5, "P0000Y000DT00000.100-1");
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(1L, "P0Y000DT00000.0520", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0520" + "'", str3, "P0Y000DT00000.0520");
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 0, "P0Y000DT00000.8997");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.8997" + "'", str2, "P0Y000DT00000.8997");
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0000Y000DT00000.00110");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0000Y000DT00000.00110" + "'", str2, "P0000Y000DT00000.00110");
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) '4', "P0Y000DT00000.98-100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.98-100" + "'", str3, "P0Y000DT00000.98-100");
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0Y000DT00000.521", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.521" + "'", str3, "P0Y000DT00000.521");
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '4', "P0Y000DT00000.00135", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00135" + "'", str3, "P0Y000DT00000.00135");
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0Y0M0DT0H0M0.35S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.3510" + "'", str3, "P0Y000DT00000.3510");
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 10, "P0Y0M0DT0H0M0.03S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0310" + "'", str2, "P0Y000DT00000.0310");
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(10L, (long) 0, "P0Y000DT00000.0398", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0398" + "'", str5, "P0Y000DT00000.0398");
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0Y000DT00000.000-34");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.000-34" + "'", str2, "P0Y000DT00000.000-34");
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) (-1), "P0Y000DT00000.09732", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.09732" + "'", str5, "P0Y000DT00000.09732");
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) 10, "P0Y0M0DT0H0M0.100S", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.10010" + "'", str5, "P0Y000DT00000.10010");
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 1, (long) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2, "P0Y0M0DT0H0M0.000S");
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 10, (long) 'a', "P0000Y0M0DT0H0M0.99S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.9987" + "'", str3, "P0000Y000DT00000.9987");
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, 1L, "P0Y000DT00000.3210", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.3210" + "'", str5, "P0Y000DT00000.3210");
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '4', (long) 'a', "P0Y000DT00000.0398", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0398" + "'", str5, "P0Y000DT00000.0398");
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) -1, 10L, "P0Y000DT00000.017-9");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.017-9" + "'", str3, "P0Y000DT00000.017-9");
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(1L, "P0Y000DT00000.89-65");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.89-65" + "'", str2, "P0Y000DT00000.89-65");
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.010100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.010100" + "'", str2, "P0Y000DT00000.010100");
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 10, 0L, "P0Y000DT00000.100-1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.100-1" + "'", str3, "P0Y000DT00000.100-1");
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '4', (long) (byte) 1, "P0Y000DT00000.05132");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.05132" + "'", str3, "P0Y000DT00000.05132");
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y000DT00000.00935");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.00935" + "'", str2, "P0Y000DT00000.00935");
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.65-1", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.65-1" + "'", str3, "P0Y000DT00000.65-1");
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) (byte) 0, "P0Y000DT00000.033-2");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.033-2" + "'", str3, "P0Y000DT00000.033-2");
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 0, 1L, "P0Y000DT00000.035-10");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.035-10" + "'", str3, "P0Y000DT00000.035-10");
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) -1, 1L, "P0000Y000DT00000.001-53", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0000Y000DT00000.001-53" + "'", str5, "P0000Y000DT00000.001-53");
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) 1, (long) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.034S" + "'", str2, "P0Y0M0DT0H0M0.034S");
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) ' ', "0 0a000 0 hour 0 0inute00 0 econ00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0 0a000 0 hour 0 0inute00 0 econ00" + "'", str2, "0 0a000 0 hour 0 0inute00 0 econ00");
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 100, (long) (byte) -1, "P0Y0M0DT0H0M0.032S", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.032-101" + "'", str5, "P0Y000DT00000.032-101");
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y000DT00000.4732");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.4732" + "'", str2, "P0Y000DT00000.4732");
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 0, 0L, "P0Y000DT00000.1001", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.1001" + "'", str5, "P0Y000DT00000.1001");
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 1, (long) (short) 0, "P0Y000DT00000.6510", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.6510" + "'", str5, "P0Y000DT00000.6510");
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(1L, (long) '#', "0:00:00.010", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.010" + "'", str5, "0:00:00.010");
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(1L, "P0Y000DT00000.00090");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.00090" + "'", str2, "P0Y000DT00000.00090");
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0Y000DT00000.001-42", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.001-42" + "'", str3, "P0Y000DT00000.001-42");
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0Y000DT00000.100100", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.100100" + "'", str3, "P0Y000DT00000.100100");
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '#', (long) 10, "P0Y000DT00000.052101");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.052101" + "'", str3, "P0Y000DT00000.052101");
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y000DT00000.4997");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.4997" + "'", str2, "P0Y000DT00000.4997");
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) 1, "P0Y000DT00000.06299");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.06299" + "'", str3, "P0Y000DT00000.06299");
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 100, "0:00:00.032");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.032" + "'", str2, "0:00:00.032");
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) 1, "P0Y000DT00000.91-1", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.91-1" + "'", str5, "P0Y000DT00000.91-1");
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y000DT00000.065-99");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.065-99" + "'", str2, "P0Y000DT00000.065-99");
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), 1L, "P0Y000DT00000.4997", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.4997" + "'", str5, "P0Y000DT00000.4997");
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) 100, (long) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.01S" + "'", str2, "P0Y0M0DT0H0M0.01S");
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(100L, "P0Y000DT00000.64-2");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.64-2" + "'", str2, "P0Y000DT00000.64-2");
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 1, "P0Y000DT00000.042-99");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.042-99" + "'", str2, "P0Y000DT00000.042-99");
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) (short) 100, "P0Y000DT00000.1068", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.1068" + "'", str5, "P0Y000DT00000.1068");
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((-1L), (long) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.101S" + "'", str2, "P0Y0M0DT0H0M0.101S");
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(10L, "P0Y000DT00000.0220", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0220" + "'", str3, "P0Y000DT00000.0220");
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.021");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.021" + "'", str2, "P0Y000DT00000.021");
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) 100, (long) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2, "P0Y0M0DT0H0M0.000S");
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 1, "P0Y000DT00000.91-48", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.91-48" + "'", str3, "P0Y000DT00000.91-48");
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 'a', 0L, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 0, "0:00:00.99");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.99" + "'", str2, "0:00:00.99");
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y000DT00000.0132", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0132" + "'", str3, "P0Y000DT00000.0132");
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0Y000DT00000.04232", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.04232" + "'", str3, "P0Y000DT00000.04232");
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 10, "P0000Y000DT00000.03510");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0000Y000DT00000.03510" + "'", str2, "P0000Y000DT00000.03510");
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "0 seconds", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 0econ00" + "'", str3, "0 0econ00");
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '4', (long) (byte) 1, "P0Y000DT00000.010-1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.010-1" + "'", str3, "P0Y000DT00000.010-1");
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y0M0DT0H0M0.13S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.13-1" + "'", str3, "P0Y000DT00000.13-1");
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.78-11", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.78-11" + "'", str3, "P0Y000DT00000.78-11");
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y000DT00000.101-1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.101-1" + "'", str2, "P0Y000DT00000.101-1");
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 1, (long) (short) 0, "P0Y000DT00000.4736");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.4736" + "'", str3, "P0Y000DT00000.4736");
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (byte) 10, (long) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.087S" + "'", str2, "P0Y0M0DT0H0M0.087S");
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 10, (long) 100, "P0Y000DT00000.04232");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.04232" + "'", str3, "P0Y000DT00000.04232");
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 10, "P0000Y000DT00000.035101", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.035101" + "'", str3, "P0000Y000DT00000.035101");
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y000DT00000.06510", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.06510" + "'", str3, "P0Y000DT00000.06510");
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 0, (long) (-1), "P0Y000DT00000.011");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.011" + "'", str3, "P0Y000DT00000.011");
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y0M0DT0H0M0.98S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.98-1" + "'", str2, "P0Y000DT00000.98-1");
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) 1, (long) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2, "P0Y0M0DT0H0M0.000S");
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 1, (long) '#', "P0Y000DT00000.91-9", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.91-9" + "'", str5, "P0Y000DT00000.91-9");
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) ' ', (long) '#', "P0Y0M0DT0H0M0.48S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.483" + "'", str5, "P0Y000DT00000.483");
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), 0L, "P0000Y000DT00000.0960");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.0960" + "'", str3, "P0000Y000DT00000.0960");
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) 0, "P0Y000DT00000.0970");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0970" + "'", str3, "P0Y000DT00000.0970");
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) -1, 0L, "P0Y000DT00000.89101");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.89101" + "'", str3, "P0Y000DT00000.89101");
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 1, (-1L), "P0Y000DT00000.04-87", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.04-87" + "'", str5, "P0Y000DT00000.04-87");
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '4', (long) 1, "P0Y000DT00000.89-1", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.89-1" + "'", str5, "P0Y000DT00000.89-1");
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 100, "0 days", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 0a00" + "'", str3, "0 0a00");
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (-1L), "P0Y000DT00000.05352");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.05352" + "'", str3, "P0Y000DT00000.05352");
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y000DT00000.66-10", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.66-10" + "'", str3, "P0Y000DT00000.66-10");
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (-1L), "P0000Y000DT00000.03552");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.03552" + "'", str3, "P0000Y000DT00000.03552");
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y000DT00000.0870");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0870" + "'", str2, "P0Y000DT00000.0870");
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) 0, "P0Y000DT00000.0297");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0297" + "'", str3, "P0Y000DT00000.0297");
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0Y0M0DT0H0M0.90S", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.901" + "'", str3, "P0Y000DT00000.901");
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (-1), "", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) 100, "P0Y000DT00000.09710");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.09710" + "'", str3, "P0Y000DT00000.09710");
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (byte) 10, (long) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.91S" + "'", str2, "P0Y0M0DT0H0M0.91S");
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y0M0DT0H0M0.042S", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.04297" + "'", str3, "P0Y000DT00000.04297");
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y000DT00000.06510", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.06510" + "'", str3, "P0Y000DT00000.06510");
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0Y000DT00000.032100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.032100" + "'", str2, "P0Y000DT00000.032100");
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) (short) 0, "P0Y000DT00000.653");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.653" + "'", str3, "P0Y000DT00000.653");
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (short) -1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) 100, "P0Y000DT00000.03535", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.03535" + "'", str5, "P0Y000DT00000.03535");
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (-1), (long) (byte) -1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.000-101", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.000-101" + "'", str3, "P0Y000DT00000.000-101");
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 100, (long) 100, "P0Y0M0DT0H0M0.01S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.010" + "'", str5, "P0Y000DT00000.010");
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-1L), "P0Y000DT00000.03552", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.03552" + "'", str3, "P0Y000DT00000.03552");
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.0092", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0092" + "'", str3, "P0Y000DT00000.0092");
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(10L, "P0Y000DT00000.6597", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.6597" + "'", str3, "P0Y000DT00000.6597");
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(10L, (long) 0, "P0Y000DT00000.03197", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.03197" + "'", str5, "P0Y000DT00000.03197");
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 100, 10L, "P0Y000DT00000.0519", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0519" + "'", str5, "P0Y000DT00000.0519");
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) 1, "P0Y000DT00000.64-2", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.64-2" + "'", str5, "P0Y000DT00000.64-2");
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.1090", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.1090" + "'", str3, "P0Y000DT00000.1090");
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (byte) 100, "P0Y000DT00000.0398", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0398" + "'", str5, "P0Y000DT00000.0398");
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '4', (long) (byte) -1, "P0Y000DT00000.03334");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.03334" + "'", str3, "P0Y000DT00000.03334");
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) (short) 0, "P0000Y0M0DT0H0M0.035S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.035-100" + "'", str3, "P0000Y000DT00000.035-100");
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0Y000DT00000.100-1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.100-1" + "'", str2, "P0Y000DT00000.100-1");
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 100, "P0Y000DT00000.0991");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0991" + "'", str2, "P0Y000DT00000.0991");
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(100L, (long) 100, "P0000Y000DT00000.9952");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.9952" + "'", str3, "P0000Y000DT00000.9952");
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) 100, "P0Y000DT00000.01011", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.01011" + "'", str5, "P0Y000DT00000.01011");
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '4', "P0Y000DT00000.0410", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0410" + "'", str3, "P0Y000DT00000.0410");
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y000DT00000.65100", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.65100" + "'", str3, "P0Y000DT00000.65100");
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0Y000DT00000.660");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.660" + "'", str2, "P0Y000DT00000.660");
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0000Y000DT00000.100-1", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.100-1" + "'", str3, "P0000Y000DT00000.100-1");
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y000DT00000.0311");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0311" + "'", str2, "P0Y000DT00000.0311");
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 0, "P0Y000DT00000.910");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.910" + "'", str2, "P0Y000DT00000.910");
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) -1, 1L, "P0Y000DT00000.0310");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0310" + "'", str3, "P0Y000DT00000.0310");
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), (long) (short) 100, "P0000Y000DT00000.035-100", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0000Y000DT00000.035-100" + "'", str5, "P0000Y000DT00000.035-100");
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), (long) (short) -1, "P0Y000DT00000.04535");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.04535" + "'", str3, "P0Y000DT00000.04535");
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 10, (long) (short) 100, "P0000Y000DT00000.035101");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.035101" + "'", str3, "P0000Y000DT00000.035101");
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '4', (long) (byte) 1, "P0Y000DT00000.101-100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.101-100" + "'", str3, "P0Y000DT00000.101-100");
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y0M0DT0H0M0.090S", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0900" + "'", str3, "P0Y000DT00000.0900");
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0Y000DT00000.0200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0200" + "'", str2, "P0Y000DT00000.0200");
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 10, (-1L), "P0Y000DT00000.101-1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.101-1" + "'", str3, "P0Y000DT00000.101-1");
    }
}

