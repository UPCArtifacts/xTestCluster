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
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 100, (-1L), "P0Y000DT00000.04287", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.04287" + "'", str5, "P0Y000DT00000.04287");
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5502");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.03334");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.03334" + "'", str2, "P0Y000DT00000.03334");
    }

    @Test
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5503");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '4', (long) '#', "P0Y000DT00000.033-2", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.033-2" + "'", str5, "P0Y000DT00000.033-2");
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5504");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) (byte) 1, "P0Y000DT00000.03442");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.03442" + "'", str3, "P0Y000DT00000.03442");
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5505");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.750");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.750" + "'", str2, "P0Y000DT00000.750");
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5506");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) 'a', "P0Y000DT00000.012");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.012" + "'", str3, "P0Y000DT00000.012");
    }

    @Test
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5507");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y000DT00000.003-1", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.003-1" + "'", str3, "P0Y000DT00000.003-1");
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5508");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 1, 100L, "P0000Y000DT00000.001-101");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.001-101" + "'", str3, "P0000Y000DT00000.001-101");
    }

    @Test
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5509");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (short) 0, "P0000Y000DT00000.096-100", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0000Y000DT00000.096-100" + "'", str5, "P0000Y000DT00000.096-100");
    }

    @Test
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5510");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) ' ', 0L, "P0Y000DT00000.5832", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.5832" + "'", str5, "P0Y000DT00000.5832");
    }

    @Test
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5511");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y000DT00000.4710");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.4710" + "'", str2, "P0Y000DT00000.4710");
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5512");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '4', 1L, "P0Y000DT00000.1011", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.1011" + "'", str5, "P0Y000DT00000.1011");
    }

    @Test
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5513");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 100, "P0Y000DT00000.03435");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.03435" + "'", str2, "P0Y000DT00000.03435");
    }

    @Test
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5514");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 0, (long) 100, "P0Y000DT00000.6625");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.6625" + "'", str3, "P0Y000DT00000.6625");
    }

    @Test
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5515");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0000Y000DT00000.001-53", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.001-53" + "'", str3, "P0000Y000DT00000.001-53");
    }

    @Test
    public void test5516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5516");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.5832", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.5832" + "'", str3, "P0Y000DT00000.5832");
    }

    @Test
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5517");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y0M0DT0H0M0.087S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0870" + "'", str3, "P0Y000DT00000.0870");
    }

    @Test
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5518");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) (short) -1, "P0Y0M0DT0H0M0.022S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.022-2" + "'", str3, "P0Y000DT00000.022-2");
    }

    @Test
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5519");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 10, "P0Y000DT00000.05397");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.05397" + "'", str2, "P0Y000DT00000.05397");
    }

    @Test
    public void test5520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5520");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.0520");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0520" + "'", str2, "P0Y000DT00000.0520");
    }

    @Test
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5521");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (-1), (long) 10, "P0Y000DT00000.0010");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0010" + "'", str3, "P0Y000DT00000.0010");
    }

    @Test
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5522");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(100L, (long) (short) 100, "P0Y000DT00000.05397", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.05397" + "'", str5, "P0Y000DT00000.05397");
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5523");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(1L, "P0Y000DT00000.0519");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0519" + "'", str2, "P0Y000DT00000.0519");
    }

    @Test
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5524");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 1, (long) (short) 1, "P0Y000DT00000.032-35");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.032-35" + "'", str3, "P0Y000DT00000.032-35");
    }

    @Test
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5525");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), (long) (byte) -1, "P0Y000DT00000.98-11");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.98-11" + "'", str3, "P0Y000DT00000.98-11");
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5526");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-1L), "P0Y000DT00000.10052", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.10052" + "'", str3, "P0Y000DT00000.10052");
    }

    @Test
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5527");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) '4', "P0Y000DT00000.03535", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.03535" + "'", str5, "P0Y000DT00000.03535");
    }

    @Test
    public void test5528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5528");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(100L, "P0Y000DT00000.1010");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.1010" + "'", str2, "P0Y000DT00000.1010");
    }

    @Test
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5529");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0Y000DT00000.00-51", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00-51" + "'", str3, "P0Y000DT00000.00-51");
    }

    @Test
    public void test5530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5530");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y000DT00000.0421", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0421" + "'", str3, "P0Y000DT00000.0421");
    }

    @Test
    public void test5531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5531");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 1, 1L, "P0Y000DT00000.6997", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.6997" + "'", str5, "P0Y000DT00000.6997");
    }

    @Test
    public void test5532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5532");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.001-100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.001-100" + "'", str2, "P0Y000DT00000.001-100");
    }

    @Test
    public void test5533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5533");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 0, "P0Y000DT00000.992");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.992" + "'", str2, "P0Y000DT00000.992");
    }

    @Test
    public void test5534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5534");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0Y000DT00000.000-33", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.000-33" + "'", str3, "P0Y000DT00000.000-33");
    }

    @Test
    public void test5535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5535");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y000DT00000.131");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.131" + "'", str2, "P0Y000DT00000.131");
    }

    @Test
    public void test5536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5536");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 1, (long) (short) 10, "P0Y000DT00000.751", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.751" + "'", str5, "P0Y000DT00000.751");
    }

    @Test
    public void test5537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5537");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(100L, "P0Y000DT00000.051-1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.051-1" + "'", str2, "P0Y000DT00000.051-1");
    }

    @Test
    public void test5538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5538");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y000DT00000.09852", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.09852" + "'", str3, "P0Y000DT00000.09852");
    }

    @Test
    public void test5539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5539");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 1, "P0Y000DT00000.0496", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0496" + "'", str3, "P0Y000DT00000.0496");
    }

    @Test
    public void test5540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5540");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 1, 1L, "P0Y000DT00000.47-65", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.47-65" + "'", str5, "P0Y000DT00000.47-65");
    }

    @Test
    public void test5541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5541");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(10L, (-1L), "P0Y000DT00000.99-1", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.99-1" + "'", str5, "P0Y000DT00000.99-1");
    }

    @Test
    public void test5542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5542");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (-1), (long) (byte) 0, "P0Y000DT00000.090-98", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.090-98" + "'", str5, "P0Y000DT00000.090-98");
    }

    @Test
    public void test5543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5543");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) ' ', "P0Y000DT00000.6552");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.6552" + "'", str3, "P0Y000DT00000.6552");
    }

    @Test
    public void test5544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5544");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 1, "P0Y0M0DT0H0M0.80S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.801" + "'", str3, "P0Y000DT00000.801");
    }

    @Test
    public void test5545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5545");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y000DT00000.003-2", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.003-2" + "'", str3, "P0Y000DT00000.003-2");
    }

    @Test
    public void test5546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5546");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), (long) 0, "", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test5547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5547");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y0M0DT0H0M0.032S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.03232" + "'", str2, "P0Y000DT00000.03232");
    }

    @Test
    public void test5548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5548");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 100, "P0000Y000DT00000.10010");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0000Y000DT00000.10010" + "'", str2, "P0000Y000DT00000.10010");
    }

    @Test
    public void test5549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5549");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) (short) 1, "P0Y000DT00000.10199", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.10199" + "'", str5, "P0Y000DT00000.10199");
    }

    @Test
    public void test5550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5550");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) 'a', "P0Y000DT00000.03631", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.03631" + "'", str5, "P0Y000DT00000.03631");
    }

    @Test
    public void test5551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5551");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 1, 0L, "P0Y000DT00000.0001");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0001" + "'", str3, "P0Y000DT00000.0001");
    }

    @Test
    public void test5552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5552");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(100L, "P0Y000DT00000.3810", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.3810" + "'", str3, "P0Y000DT00000.3810");
    }

    @Test
    public void test5553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5553");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0Y000DT00000.00210");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.00210" + "'", str2, "P0Y000DT00000.00210");
    }

    @Test
    public void test5554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5554");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(10L, (long) 1, "P0Y000DT00000.087-100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.087-100" + "'", str3, "P0Y000DT00000.087-100");
    }

    @Test
    public void test5555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5555");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(100L, 0L, "P0Y000DT00000.48-11", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.48-11" + "'", str5, "P0Y000DT00000.48-11");
    }

    @Test
    public void test5556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5556");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (byte) -1, "P0Y000DT00000.017-9", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.017-9" + "'", str5, "P0Y000DT00000.017-9");
    }

    @Test
    public void test5557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5557");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 10, "P0000Y000DT00000.0350");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0000Y000DT00000.0350" + "'", str2, "P0000Y000DT00000.0350");
    }

    @Test
    public void test5558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5558");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y000DT00000.0989", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0989" + "'", str3, "P0Y000DT00000.0989");
    }

    @Test
    public void test5559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5559");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y000DT00000.49-1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.49-1" + "'", str2, "P0Y000DT00000.49-1");
    }

    @Test
    public void test5560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5560");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), (long) (byte) 0, "P0Y000DT00000.6625", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.6625" + "'", str5, "P0Y000DT00000.6625");
    }

    @Test
    public void test5561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5561");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y000DT00000.64-2", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.64-2" + "'", str3, "P0Y000DT00000.64-2");
    }

    @Test
    public void test5562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5562");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(10L, "P0Y000DT00000.640");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.640" + "'", str2, "P0Y000DT00000.640");
    }

    @Test
    public void test5563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5563");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) (-1), "P0Y0M0DT0H0M0.68S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.68-101" + "'", str3, "P0Y000DT00000.68-101");
    }

    @Test
    public void test5564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5564");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) (byte) 1, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0000Y0M0DT0H0M0.001S" + "'", str5, "P0000Y0M0DT0H0M0.001S");
    }

    @Test
    public void test5565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5565");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 0, 1L, "P0Y000DT00000.970");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.970" + "'", str3, "P0Y000DT00000.970");
    }

    @Test
    public void test5566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5566");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0Y000DT00000.0010", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0010" + "'", str3, "P0Y000DT00000.0010");
    }

    @Test
    public void test5567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5567");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) 100, "P0Y000DT00000.3852", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.3852" + "'", str5, "P0Y000DT00000.3852");
    }

    @Test
    public void test5568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5568");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y000DT00000.9810", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.9810" + "'", str3, "P0Y000DT00000.9810");
    }

    @Test
    public void test5569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5569");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y000DT00000.0989");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0989" + "'", str2, "P0Y000DT00000.0989");
    }

    @Test
    public void test5570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5570");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(10L, "P0Y000DT00000.00110", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00110" + "'", str3, "P0Y000DT00000.00110");
    }

    @Test
    public void test5571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5571");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) 100, "P0Y000DT00000.0311");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0311" + "'", str3, "P0Y000DT00000.0311");
    }

    @Test
    public void test5572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5572");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(10L, (long) 10, "P0Y000DT00000.001-96", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.001-96" + "'", str5, "P0Y000DT00000.001-96");
    }

    @Test
    public void test5573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5573");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) (short) -1, "P0Y000DT00000.053-11");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.053-11" + "'", str3, "P0Y000DT00000.053-11");
    }

    @Test
    public void test5574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5574");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 10, 10L, "P0Y000DT00000.3510");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.3510" + "'", str3, "P0Y000DT00000.3510");
    }

    @Test
    public void test5575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5575");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 10, (long) (-1), "P0Y000DT00000.01-1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.01-1" + "'", str3, "P0Y000DT00000.01-1");
    }

    @Test
    public void test5576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5576");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 1, (long) 1, "P0Y000DT00000.09032", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.09032" + "'", str5, "P0Y000DT00000.09032");
    }

    @Test
    public void test5577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5577");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-1L), "P0Y000DT00000.022-2", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.022-2" + "'", str3, "P0Y000DT00000.022-2");
    }

    @Test
    public void test5578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5578");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) (byte) 100, "P0Y000DT00000.69-2", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.69-2" + "'", str5, "P0Y000DT00000.69-2");
    }

    @Test
    public void test5579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5579");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (-1), "0 days 0 hours 0 minutes 0 seconds");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 0a000 0 hour 0 0inute00 0 econ00" + "'", str3, "0 0a000 0 hour 0 0inute00 0 econ00");
    }

    @Test
    public void test5580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5580");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(1L, "P0Y000DT00000.47-10");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.47-10" + "'", str2, "P0Y000DT00000.47-10");
    }

    @Test
    public void test5581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5581");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) 100, "P0Y000DT00000.0398");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0398" + "'", str3, "P0Y000DT00000.0398");
    }

    @Test
    public void test5582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5582");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y0M0DT0H0M0.045S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.045-1" + "'", str2, "P0Y000DT00000.045-1");
    }

    @Test
    public void test5583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5583");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 1, "P0Y000DT00000.75-96", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.75-96" + "'", str3, "P0Y000DT00000.75-96");
    }

    @Test
    public void test5584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5584");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 1, "P0Y000DT00000.0980");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0980" + "'", str2, "P0Y000DT00000.0980");
    }

    @Test
    public void test5585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5585");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 1, 0L, "P0Y000DT00000.04-87");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.04-87" + "'", str3, "P0Y000DT00000.04-87");
    }

    @Test
    public void test5586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5586");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) 'a', "P0000Y000DT00000.9987");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.9987" + "'", str3, "P0000Y000DT00000.9987");
    }

    @Test
    public void test5587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5587");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) -1, 10L, "P0Y000DT00000.1001");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.1001" + "'", str3, "P0Y000DT00000.1001");
    }

    @Test
    public void test5588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5588");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 0, "P0Y000DT00000.659");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.659" + "'", str2, "P0Y000DT00000.659");
    }

    @Test
    public void test5589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5589");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(10L, "P0000Y000DT00000.032100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0000Y000DT00000.032100" + "'", str2, "P0000Y000DT00000.032100");
    }

    @Test
    public void test5590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5590");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (-1L), "P0Y000DT00000.099100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.099100" + "'", str3, "P0Y000DT00000.099100");
    }

    @Test
    public void test5591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5591");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 10, (long) (-1), "P0000Y000DT00000.10010");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.10010" + "'", str3, "P0000Y000DT00000.10010");
    }

    @Test
    public void test5592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5592");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.9132", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.9132" + "'", str3, "P0Y000DT00000.9132");
    }

    @Test
    public void test5593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5593");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 10, (long) (short) 10, "P0Y000DT00000.980", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.980" + "'", str5, "P0Y000DT00000.980");
    }

    @Test
    public void test5594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5594");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) (short) 10, "P0Y000DT00000.0321");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0321" + "'", str3, "P0Y000DT00000.0321");
    }

    @Test
    public void test5595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5595");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 10, 100L, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5596");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) ' ', (long) 1, "P0Y000DT00000.090-96", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.090-96" + "'", str5, "P0Y000DT00000.090-96");
    }

    @Test
    public void test5597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5597");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(1L, "P0Y000DT00000.49-1", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.49-1" + "'", str3, "P0Y000DT00000.49-1");
    }

    @Test
    public void test5598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5598");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (-1), (long) 0, "P0000Y000DT00000.096100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.096100" + "'", str3, "P0000Y000DT00000.096100");
    }

    @Test
    public void test5599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5599");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (-1), (long) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.033S" + "'", str2, "P0Y0M0DT0H0M0.033S");
    }

    @Test
    public void test5600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5600");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '#', "P0000Y000DT00000.0350");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0000Y000DT00000.0350" + "'", str2, "P0000Y000DT00000.0350");
    }

    @Test
    public void test5601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5601");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0Y000DT00000.91-9", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.91-9" + "'", str3, "P0Y000DT00000.91-9");
    }

    @Test
    public void test5602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5602");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 10, (long) (short) -1, "P0Y000DT00000.0209");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0209" + "'", str3, "P0Y000DT00000.0209");
    }

    @Test
    public void test5603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5603");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.048-99", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.048-99" + "'", str3, "P0Y000DT00000.048-99");
    }

    @Test
    public void test5604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5604");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) 'a', "P0Y000DT00000.03110");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.03110" + "'", str3, "P0Y000DT00000.03110");
    }

    @Test
    public void test5605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5605");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(1L, (long) 'a', "0:00:00.032");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.032" + "'", str3, "0:00:00.032");
    }

    @Test
    public void test5606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5606");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (byte) 1, "P0Y000DT00000.0225");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0225" + "'", str3, "P0Y000DT00000.0225");
    }

    @Test
    public void test5607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5607");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 100, (long) (short) 100, "P0Y000DT00000.83-99", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.83-99" + "'", str5, "P0Y000DT00000.83-99");
    }

    @Test
    public void test5608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5608");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y0M0DT0H0M0.38S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.380" + "'", str3, "P0Y000DT00000.380");
    }

    @Test
    public void test5609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5609");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 10, "", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5610");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 100, (long) (short) 1, "P0Y000DT00000.3235");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.3235" + "'", str3, "P0Y000DT00000.3235");
    }

    @Test
    public void test5611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5611");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 0, 100L, "P0Y000DT00000.67-98");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.67-98" + "'", str3, "P0Y000DT00000.67-98");
    }

    @Test
    public void test5612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5612");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '#', "P0Y000DT00000.00090", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00090" + "'", str3, "P0Y000DT00000.00090");
    }

    @Test
    public void test5613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5613");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 100, 0L, "P0Y000DT00000.0421");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0421" + "'", str3, "P0Y000DT00000.0421");
    }

    @Test
    public void test5614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5614");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 0, "P0Y000DT00000.0990", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0990" + "'", str3, "P0Y000DT00000.0990");
    }

    @Test
    public void test5615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5615");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 0, (long) 100, "P0000Y000DT00000.0350", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0000Y000DT00000.0350" + "'", str5, "P0000Y000DT00000.0350");
    }

    @Test
    public void test5616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5616");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) (byte) 1, "P0Y000DT00000.490", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.490" + "'", str5, "P0Y000DT00000.490");
    }

    @Test
    public void test5617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5617");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) (short) -1, "P0Y000DT00000.66-1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.66-1" + "'", str3, "P0Y000DT00000.66-1");
    }

    @Test
    public void test5618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5618");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), (long) (byte) 1, "P0Y000DT00000.66-10", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.66-10" + "'", str5, "P0Y000DT00000.66-10");
    }

    @Test
    public void test5619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5619");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.00-101");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.00-101" + "'", str2, "P0Y000DT00000.00-101");
    }

    @Test
    public void test5620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5620");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '4', "P0Y000DT00000.00310");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.00310" + "'", str2, "P0Y000DT00000.00310");
    }

    @Test
    public void test5621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5621");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 10, (long) (short) 10, "P0Y000DT00000.100-10");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.100-10" + "'", str3, "P0Y000DT00000.100-10");
    }

    @Test
    public void test5622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5622");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.980");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.980" + "'", str2, "P0Y000DT00000.980");
    }

    @Test
    public void test5623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5623");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 0, (long) (-1), "P0Y000DT00000.0901");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0901" + "'", str3, "P0Y000DT00000.0901");
    }

    @Test
    public void test5624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5624");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(1L, (long) 1, "P0Y0M0DT0H0M0.034S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0340" + "'", str5, "P0Y000DT00000.0340");
    }

    @Test
    public void test5625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5625");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) '#', "P0Y000DT00000.098-1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.098-1" + "'", str3, "P0Y000DT00000.098-1");
    }

    @Test
    public void test5626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5626");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) 'a', "P0Y000DT00000.0872");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0872" + "'", str3, "P0Y000DT00000.0872");
    }

    @Test
    public void test5627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5627");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) (short) 1, "P0Y000DT00000.002100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.002100" + "'", str3, "P0Y000DT00000.002100");
    }

    @Test
    public void test5628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5628");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 10, (long) (short) 100, "P0Y000DT00000.02-101", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.02-101" + "'", str5, "P0Y000DT00000.02-101");
    }

    @Test
    public void test5629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5629");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0000Y000DT00000.9997");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0000Y000DT00000.9997" + "'", str2, "P0000Y000DT00000.9997");
    }

    @Test
    public void test5630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5630");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y0M0DT0H0M0.98S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.980" + "'", str3, "P0Y000DT00000.980");
    }

    @Test
    public void test5631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5631");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 1, 1L, "P0Y000DT00000.053-97");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.053-97" + "'", str3, "P0Y000DT00000.053-97");
    }

    @Test
    public void test5632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5632");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) (short) 10, "P0Y000DT00000.490");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.490" + "'", str3, "P0Y000DT00000.490");
    }

    @Test
    public void test5633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5633");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0Y000DT00000.901", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.901" + "'", str3, "P0Y000DT00000.901");
    }

    @Test
    public void test5634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5634");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 0, (long) ' ', "P0Y0M0DT0H0M0.67S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.6732" + "'", str3, "P0Y000DT00000.6732");
    }

    @Test
    public void test5635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5635");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 10, "P0Y000DT00000.053-97");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.053-97" + "'", str2, "P0Y000DT00000.053-97");
    }

    @Test
    public void test5636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5636");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0Y000DT00000.00100", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00100" + "'", str3, "P0Y000DT00000.00100");
    }

    @Test
    public void test5637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5637");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.04832", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.04832" + "'", str3, "P0Y000DT00000.04832");
    }

    @Test
    public void test5638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5638");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '4', "P0Y000DT00000.67100", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.67100" + "'", str3, "P0Y000DT00000.67100");
    }

    @Test
    public void test5639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5639");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.065-1", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.065-1" + "'", str3, "P0Y000DT00000.065-1");
    }

    @Test
    public void test5640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5640");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.09732", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.09732" + "'", str3, "P0Y000DT00000.09732");
    }

    @Test
    public void test5641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5641");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) 10, "P0Y000DT00000.011-68", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.011-68" + "'", str5, "P0Y000DT00000.011-68");
    }

    @Test
    public void test5642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5642");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(10L, 1L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.91S" + "'", str2, "P0Y0M0DT0H0M0.91S");
    }

    @Test
    public void test5643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5643");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), (long) (short) -1, "P0Y0M0DT0H0M0.035S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0350" + "'", str3, "P0Y000DT00000.0350");
    }

    @Test
    public void test5644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5644");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (-1L), "P0Y000DT00000.101-90");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.101-90" + "'", str3, "P0Y000DT00000.101-90");
    }

    @Test
    public void test5645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5645");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y0M0DT0H0M0.042S", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0420" + "'", str3, "P0Y000DT00000.0420");
    }

    @Test
    public void test5646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5646");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0000Y000DT00000.03534", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.03534" + "'", str3, "P0000Y000DT00000.03534");
    }

    @Test
    public void test5647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5647");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '#', (long) 1, "0:00:00.100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.100" + "'", str3, "0:00:00.100");
    }

    @Test
    public void test5648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5648");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) 100, "P0Y000DT00000.0341", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0341" + "'", str5, "P0Y000DT00000.0341");
    }

    @Test
    public void test5649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5649");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0000Y000DT00000.032-22", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.032-22" + "'", str3, "P0000Y000DT00000.032-22");
    }

    @Test
    public void test5650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5650");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 0, "P0Y000DT00000.49-98");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.49-98" + "'", str2, "P0Y000DT00000.49-98");
    }

    @Test
    public void test5651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5651");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) -1, "P0Y000DT00000.68100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.68100" + "'", str3, "P0Y000DT00000.68100");
    }

    @Test
    public void test5652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5652");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) (short) -1, "P0Y000DT00000.06252", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.06252" + "'", str5, "P0Y000DT00000.06252");
    }

    @Test
    public void test5653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5653");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(10L, (long) 100, "P0Y000DT00000.001100", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.001100" + "'", str5, "P0Y000DT00000.001100");
    }

    @Test
    public void test5654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5654");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (-1), (long) '4', "P0Y000DT00000.01-1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.01-1" + "'", str3, "P0Y000DT00000.01-1");
    }

    @Test
    public void test5655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5655");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 10, (long) (byte) 0, "P0Y000DT00000.000-90");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.000-90" + "'", str3, "P0Y000DT00000.000-90");
    }

    @Test
    public void test5656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5656");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 'a', (long) '#', "P0Y000DT00000.033-100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.033-100" + "'", str3, "P0Y000DT00000.033-100");
    }

    @Test
    public void test5657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5657");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '#', "P0Y000DT00000.01048");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.01048" + "'", str2, "P0Y000DT00000.01048");
    }

    @Test
    public void test5658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5658");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-1L), "P0Y000DT00000.05210", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.05210" + "'", str3, "P0Y000DT00000.05210");
    }

    @Test
    public void test5659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5659");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) 0, "P0Y000DT00000.64-3", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.64-3" + "'", str5, "P0Y000DT00000.64-3");
    }

    @Test
    public void test5660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5660");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(1L, (long) (short) 1, "P0Y000DT00000.0032", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0032" + "'", str5, "P0Y000DT00000.0032");
    }

    @Test
    public void test5661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5661");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(1L, (long) 100, "P0Y000DT00000.009-1", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.009-1" + "'", str5, "P0Y000DT00000.009-1");
    }

    @Test
    public void test5662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5662");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y000DT00000.0297", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0297" + "'", str3, "P0Y000DT00000.0297");
    }

    @Test
    public void test5663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5663");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) (short) 1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5664");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(10L, "P0Y000DT00000.91-68");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.91-68" + "'", str2, "P0Y000DT00000.91-68");
    }

    @Test
    public void test5665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5665");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y000DT00000.5211", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.5211" + "'", str3, "P0Y000DT00000.5211");
    }

    @Test
    public void test5666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5666");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-1L), "P0Y000DT00000.0001", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0001" + "'", str3, "P0Y000DT00000.0001");
    }

    @Test
    public void test5667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5667");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 10, "P0Y000DT00000.101-1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.101-1" + "'", str2, "P0Y000DT00000.101-1");
    }

    @Test
    public void test5668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5668");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 10, 100L, "P0000Y0M0DT0H0M0.032S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0000Y000DT00000.03290" + "'", str5, "P0000Y000DT00000.03290");
    }

    @Test
    public void test5669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5669");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(10L, "P0Y000DT00000.03335");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.03335" + "'", str2, "P0Y000DT00000.03335");
    }

    @Test
    public void test5670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5670");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '#', "P0Y000DT00000.001-87");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.001-87" + "'", str2, "P0Y000DT00000.001-87");
    }

    @Test
    public void test5671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5671");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) (short) 10, "P0Y000DT00000.012");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.012" + "'", str3, "P0Y000DT00000.012");
    }

    @Test
    public void test5672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5672");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 10, 10L, "P0Y000DT00000.0225");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0225" + "'", str3, "P0Y000DT00000.0225");
    }

    @Test
    public void test5673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5673");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 0, 0L, "P0Y000DT00000.0651", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0651" + "'", str5, "P0Y000DT00000.0651");
    }

    @Test
    public void test5674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5674");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.0496", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0496" + "'", str3, "P0Y000DT00000.0496");
    }

    @Test
    public void test5675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5675");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y000DT00000.00-1", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00-1" + "'", str3, "P0Y000DT00000.00-1");
    }

    @Test
    public void test5676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5676");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 1, 100L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.099S" + "'", str2, "P0Y0M0DT0H0M0.099S");
    }

    @Test
    public void test5677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5677");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.01735");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.01735" + "'", str2, "P0Y000DT00000.01735");
    }

    @Test
    public void test5678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5678");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(100L, (long) 'a', "P0Y0M0DT0H0M0.025S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.025-3" + "'", str3, "P0Y000DT00000.025-3");
    }

    @Test
    public void test5679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5679");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '4', (long) (byte) 10, "P0Y000DT00000.042100", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.042100" + "'", str5, "P0Y000DT00000.042100");
    }

    @Test
    public void test5680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5680");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 'a', (long) 100, "P0Y0M0DT0H0M0.78S", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.783" + "'", str5, "P0Y000DT00000.783");
    }

    @Test
    public void test5681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5681");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(1L, (long) '#', "P0Y000DT00000.05399", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.05399" + "'", str5, "P0Y000DT00000.05399");
    }

    @Test
    public void test5682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5682");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0Y000DT00000.6852", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.6852" + "'", str3, "P0Y000DT00000.6852");
    }

    @Test
    public void test5683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5683");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) (short) 100, "P0Y000DT00000.0311", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0311" + "'", str5, "P0Y000DT00000.0311");
    }

    @Test
    public void test5684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5684");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(100L, (long) (byte) 100, "P0Y000DT00000.000-33");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.000-33" + "'", str3, "P0Y000DT00000.000-33");
    }

    @Test
    public void test5685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5685");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) (byte) -1, "P0000Y000DT00000.0351", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0000Y000DT00000.0351" + "'", str5, "P0000Y000DT00000.0351");
    }

    @Test
    public void test5686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5686");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 10, (long) 'a', "P0Y000DT00000.58-97", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.58-97" + "'", str5, "P0Y000DT00000.58-97");
    }

    @Test
    public void test5687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5687");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) (byte) 1, "P0Y000DT00000.10135");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.10135" + "'", str3, "P0Y000DT00000.10135");
    }

    @Test
    public void test5688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5688");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), (long) (short) -1, "P0Y000DT00000.992", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.992" + "'", str5, "P0Y000DT00000.992");
    }

    @Test
    public void test5689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5689");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y000DT00000.053-11", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.053-11" + "'", str3, "P0Y000DT00000.053-11");
    }

    @Test
    public void test5690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5690");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) (short) 1, "P0000Y0M0DT0H0M0.100S", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0000Y000DT00000.1001" + "'", str5, "P0000Y000DT00000.1001");
    }

    @Test
    public void test5691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5691");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.101-1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.101-1" + "'", str2, "P0Y000DT00000.101-1");
    }

    @Test
    public void test5692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5692");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(100L, (long) (short) -1, "P0Y000DT00000.000-1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.000-1" + "'", str3, "P0Y000DT00000.000-1");
    }

    @Test
    public void test5693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5693");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), 0L, "P0000Y000DT00000.10096");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.10096" + "'", str3, "P0000Y000DT00000.10096");
    }

    @Test
    public void test5694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5694");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y000DT00000.801");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.801" + "'", str2, "P0Y000DT00000.801");
    }

    @Test
    public void test5695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5695");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) 10, "P0000Y000DT00000.032-22");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.032-22" + "'", str3, "P0000Y000DT00000.032-22");
    }

    @Test
    public void test5696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5696");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 0, "P0Y0M0DT0H0M0.048S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0480" + "'", str2, "P0Y000DT00000.0480");
    }

    @Test
    public void test5697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5697");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y000DT00000.05131", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.05131" + "'", str3, "P0Y000DT00000.05131");
    }

    @Test
    public void test5698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5698");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) (short) -1, "P0Y000DT00000.097-35");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.097-35" + "'", str3, "P0Y000DT00000.097-35");
    }

    @Test
    public void test5699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5699");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) ' ', (long) ' ', "P0Y000DT00000.3290");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.3290" + "'", str3, "P0Y000DT00000.3290");
    }

    @Test
    public void test5700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5700");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) 'a', "P0Y000DT00000.01048");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.01048" + "'", str3, "P0Y000DT00000.01048");
    }

    @Test
    public void test5701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5701");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(100L, (long) '#', "P0Y000DT00000.033-34");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.033-34" + "'", str3, "P0Y000DT00000.033-34");
    }

    @Test
    public void test5702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5702");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(10L, (long) 1, "P0Y000DT00000.0092", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0092" + "'", str5, "P0Y000DT00000.0092");
    }

    @Test
    public void test5703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5703");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 100, 0L, "P0Y000DT00000.9810", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.9810" + "'", str5, "P0Y000DT00000.9810");
    }

    @Test
    public void test5704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5704");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 10, "P0Y000DT00000.690", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.690" + "'", str3, "P0Y000DT00000.690");
    }

    @Test
    public void test5705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5705");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '4', "P0Y000DT00000.0320", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0320" + "'", str3, "P0Y000DT00000.0320");
    }

    @Test
    public void test5706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5706");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 1, 1L, "P0Y0M0DT0H0M0.89S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.890" + "'", str5, "P0Y000DT00000.890");
    }

    @Test
    public void test5707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5707");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 100, "P0Y000DT00000.6699");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.6699" + "'", str2, "P0Y000DT00000.6699");
    }

    @Test
    public void test5708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5708");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0000Y000DT00000.0351", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.0351" + "'", str3, "P0000Y000DT00000.0351");
    }

    @Test
    public void test5709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5709");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 1, "P0000Y000DT00000.0320");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0000Y000DT00000.0320" + "'", str2, "P0000Y000DT00000.0320");
    }

    @Test
    public void test5710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5710");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) (short) -1, "P0Y000DT00000.031100", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.031100" + "'", str5, "P0Y000DT00000.031100");
    }

    @Test
    public void test5711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5711");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) (-1), "P0000Y000DT00000.035-35", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0000Y000DT00000.035-35" + "'", str5, "P0000Y000DT00000.035-35");
    }

    @Test
    public void test5712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5712");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 0, 0L, "P0Y000DT00000.04535", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.04535" + "'", str5, "P0Y000DT00000.04535");
    }

    @Test
    public void test5713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5713");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y000DT00000.0011");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0011" + "'", str2, "P0Y000DT00000.0011");
    }

    @Test
    public void test5714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5714");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-1L), "P0Y000DT00000.89100", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.89100" + "'", str3, "P0Y000DT00000.89100");
    }

    @Test
    public void test5715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5715");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, 10L, "P0Y0M0DT0H0M0.100S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.10010" + "'", str3, "P0Y000DT00000.10010");
    }

    @Test
    public void test5716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5716");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 10, "P0Y000DT00000.91-68", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.91-68" + "'", str3, "P0Y000DT00000.91-68");
    }

    @Test
    public void test5717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5717");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 10, (-1L), "P0Y000DT00000.68-100", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.68-100" + "'", str5, "P0Y000DT00000.68-100");
    }

    @Test
    public void test5718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5718");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (short) 100, "P0Y000DT00000.042-1", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.042-1" + "'", str5, "P0Y000DT00000.042-1");
    }

    @Test
    public void test5719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5719");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y000DT00000.10033");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.10033" + "'", str2, "P0Y000DT00000.10033");
    }

    @Test
    public void test5720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5720");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0Y000DT00000.090-10", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.090-10" + "'", str3, "P0Y000DT00000.090-10");
    }

    @Test
    public void test5721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5721");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(10L, "P0Y000DT00000.051-1", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.051-1" + "'", str3, "P0Y000DT00000.051-1");
    }

    @Test
    public void test5722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5722");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.010-11", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.010-11" + "'", str3, "P0Y000DT00000.010-11");
    }

    @Test
    public void test5723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5723");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, 100L, "P0Y000DT00000.0340");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0340" + "'", str3, "P0Y000DT00000.0340");
    }

    @Test
    public void test5724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5724");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 100, "P0Y000DT00000.64-3", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.64-3" + "'", str3, "P0Y000DT00000.64-3");
    }

    @Test
    public void test5725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5725");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y0M0DT0H0M0.47S", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.4732" + "'", str3, "P0Y000DT00000.4732");
    }

    @Test
    public void test5726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5726");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 1, (long) (byte) -1, "P0Y000DT00000.01735", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.01735" + "'", str5, "P0Y000DT00000.01735");
    }

    @Test
    public void test5727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5727");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 1, "P0Y000DT00000.1052", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.1052" + "'", str3, "P0Y000DT00000.1052");
    }

    @Test
    public void test5728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5728");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 10, (long) (byte) 0, "P0Y000DT00000.1001");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.1001" + "'", str3, "P0Y000DT00000.1001");
    }

    @Test
    public void test5729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5729");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(10L, 0L, "", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test5730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5730");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 0, "P0Y000DT00000.012", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.012" + "'", str3, "P0Y000DT00000.012");
    }

    @Test
    public void test5731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5731");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(100L, (long) 0, "P0Y000DT00000.05131");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.05131" + "'", str3, "P0Y000DT00000.05131");
    }

    @Test
    public void test5732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5732");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 10, (long) (byte) 0, "P0Y000DT00000.78-31", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.78-31" + "'", str5, "P0Y000DT00000.78-31");
    }

    @Test
    public void test5733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5733");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y000DT00000.048100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.048100" + "'", str2, "P0Y000DT00000.048100");
    }

    @Test
    public void test5734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5734");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 100, (-1L), "P0Y000DT00000.03610");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.03610" + "'", str3, "P0Y000DT00000.03610");
    }

    @Test
    public void test5735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5735");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '4', (long) (byte) 1, "P0Y000DT00000.09068");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.09068" + "'", str3, "P0Y000DT00000.09068");
    }

    @Test
    public void test5736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5736");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.04-101");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.04-101" + "'", str2, "P0Y000DT00000.04-101");
    }

    @Test
    public void test5737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5737");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), 1L, "P0Y0M0DT0H0M0.035S", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0352" + "'", str5, "P0Y000DT00000.0352");
    }

    @Test
    public void test5738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5738");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 1, 1L, "P0Y000DT00000.98-65");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.98-65" + "'", str3, "P0Y000DT00000.98-65");
    }

    @Test
    public void test5739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5739");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) ' ', (long) (byte) 0, "P0Y000DT00000.000-101", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.000-101" + "'", str5, "P0Y000DT00000.000-101");
    }

    @Test
    public void test5740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5740");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(10L, 0L, "P0Y000DT00000.99-65");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.99-65" + "'", str3, "P0Y000DT00000.99-65");
    }

    @Test
    public void test5741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5741");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 'a', (long) '4', "P0Y000DT00000.0991", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0991" + "'", str5, "P0Y000DT00000.0991");
    }

    @Test
    public void test5742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5742");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0000Y000DT00000.00111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0000Y000DT00000.00111" + "'", str2, "P0000Y000DT00000.00111");
    }

    @Test
    public void test5743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5743");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 100, 1L, "P0Y000DT00000.04297", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.04297" + "'", str5, "P0Y000DT00000.04297");
    }

    @Test
    public void test5744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5744");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.097-35", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.097-35" + "'", str3, "P0Y000DT00000.097-35");
    }

    @Test
    public void test5745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5745");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) '#', "P0Y000DT00000.101-90");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.101-90" + "'", str3, "P0Y000DT00000.101-90");
    }

    @Test
    public void test5746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5746");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) 100, "P0000Y000DT00000.03290", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0000Y000DT00000.03290" + "'", str5, "P0000Y000DT00000.03290");
    }

    @Test
    public void test5747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5747");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0Y0M0DT0H0M0.011S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0111" + "'", str2, "P0Y000DT00000.0111");
    }

    @Test
    public void test5748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5748");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) (short) 1, "P0Y000DT00000.09911", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.09911" + "'", str5, "P0Y000DT00000.09911");
    }

    @Test
    public void test5749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5749");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '#', (long) (byte) 1, "P0Y000DT00000.065-99", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.065-99" + "'", str5, "P0Y000DT00000.065-99");
    }

    @Test
    public void test5750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5750");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y000DT00000.8952", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.8952" + "'", str3, "P0Y000DT00000.8952");
    }

    @Test
    public void test5751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5751");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) (byte) 0, "P0Y000DT00000.100-98", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.100-98" + "'", str5, "P0Y000DT00000.100-98");
    }

    @Test
    public void test5752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5752");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 10, (long) (short) 10, "0:00:00.097");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.097" + "'", str3, "0:00:00.097");
    }

    @Test
    public void test5753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5753");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) ' ', (long) ' ', "P0Y000DT00000.67-98");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.67-98" + "'", str3, "P0Y000DT00000.67-98");
    }

    @Test
    public void test5754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5754");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) (-1), "P0Y0M0DT0H0M0.097S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.097-2" + "'", str3, "P0Y000DT00000.097-2");
    }

    @Test
    public void test5755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5755");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) (-1), "P0000Y0M0DT0H0M0.032S", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0000Y000DT00000.032-1" + "'", str5, "P0000Y000DT00000.032-1");
    }

    @Test
    public void test5756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5756");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '#', "P0Y000DT00000.0961", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0961" + "'", str3, "P0Y000DT00000.0961");
    }

    @Test
    public void test5757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5757");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y000DT00000.009-1", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.009-1" + "'", str3, "P0Y000DT00000.009-1");
    }

    @Test
    public void test5758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5758");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (short) 1, "P0Y000DT00000.0321", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0321" + "'", str5, "P0Y000DT00000.0321");
    }

    @Test
    public void test5759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5759");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '4', 100L, "P0Y0M0DT0H0M0.045S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.04548" + "'", str3, "P0Y000DT00000.04548");
    }

    @Test
    public void test5760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5760");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y000DT00000.472", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.472" + "'", str3, "P0Y000DT00000.472");
    }

    @Test
    public void test5761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5761");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 1, "P0Y000DT00000.04252", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.04252" + "'", str3, "P0Y000DT00000.04252");
    }

    @Test
    public void test5762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5762");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.6890", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.6890" + "'", str3, "P0Y000DT00000.6890");
    }

    @Test
    public void test5763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5763");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y000DT00000.009100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.009100" + "'", str2, "P0Y000DT00000.009100");
    }

    @Test
    public void test5764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5764");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.034-3", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.034-3" + "'", str3, "P0Y000DT00000.034-3");
    }

    @Test
    public void test5765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5765");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(1L, (long) 100, "P0Y000DT00000.99-1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.99-1" + "'", str3, "P0Y000DT00000.99-1");
    }

    @Test
    public void test5766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5766");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.91-68", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.91-68" + "'", str3, "P0Y000DT00000.91-68");
    }

    @Test
    public void test5767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5767");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(100L, (-1L), "P0Y0M0DT0H0M0.04S", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.04-101" + "'", str5, "P0Y000DT00000.04-101");
    }

    @Test
    public void test5768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5768");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) (byte) 1, "P0000Y000DT00000.009100", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0000Y000DT00000.009100" + "'", str5, "P0000Y000DT00000.009100");
    }

    @Test
    public void test5769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5769");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.033-1", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.033-1" + "'", str3, "P0Y000DT00000.033-1");
    }

    @Test
    public void test5770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5770");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y000DT00000.49-96");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.49-96" + "'", str2, "P0Y000DT00000.49-96");
    }

    @Test
    public void test5771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5771");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y000DT00000.032100", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.032100" + "'", str3, "P0Y000DT00000.032100");
    }

    @Test
    public void test5772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5772");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y000DT00000.98-10", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.98-10" + "'", str3, "P0Y000DT00000.98-10");
    }

    @Test
    public void test5773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5773");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 0, "P0Y000DT00000.661", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.661" + "'", str3, "P0Y000DT00000.661");
    }

    @Test
    public void test5774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5774");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y000DT00000.009100", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.009100" + "'", str3, "P0Y000DT00000.009100");
    }

    @Test
    public void test5775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5775");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 10, (long) (byte) 10, "P0Y000DT00000.01097", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.01097" + "'", str5, "P0Y000DT00000.01097");
    }

    @Test
    public void test5776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5776");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.025-1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.025-1" + "'", str2, "P0Y000DT00000.025-1");
    }

    @Test
    public void test5777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5777");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(10L, "0 seconds");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0 0econ00" + "'", str2, "0 0econ00");
    }

    @Test
    public void test5778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5778");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) 100, "P0Y000DT00000.0310", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0310" + "'", str5, "P0Y000DT00000.0310");
    }

    @Test
    public void test5779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5779");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) (byte) 1, "P0Y000DT00000.097-35", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.097-35" + "'", str5, "P0Y000DT00000.097-35");
    }

    @Test
    public void test5780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5780");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 1, (long) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2, "P0Y0M0DT0H0M0.000S");
    }

    @Test
    public void test5781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5781");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (-1), (long) '#', "P0000Y0M0DT0H0M0.99S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.9936" + "'", str3, "P0000Y000DT00000.9936");
    }

    @Test
    public void test5782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5782");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 100, "P0Y000DT00000.05397");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.05397" + "'", str2, "P0Y000DT00000.05397");
    }

    @Test
    public void test5783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5783");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-1L), "P0Y000DT00000.053100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.053100" + "'", str2, "P0Y000DT00000.053100");
    }

    @Test
    public void test5784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5784");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) 1, "P0Y000DT00000.00097");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00097" + "'", str3, "P0Y000DT00000.00097");
    }

    @Test
    public void test5785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5785");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y000DT00000.13-1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.13-1" + "'", str2, "P0Y000DT00000.13-1");
    }

    @Test
    public void test5786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5786");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y000DT00000.78-11", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.78-11" + "'", str3, "P0Y000DT00000.78-11");
    }

    @Test
    public void test5787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5787");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, 100L, "P0Y000DT00000.025100", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.025100" + "'", str5, "P0Y000DT00000.025100");
    }

    @Test
    public void test5788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5788");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y000DT00000.000-1", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.000-1" + "'", str3, "P0Y000DT00000.000-1");
    }

    @Test
    public void test5789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5789");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 1, "P0Y000DT00000.680", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.680" + "'", str3, "P0Y000DT00000.680");
    }

    @Test
    public void test5790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5790");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 'a', (long) 'a', "P0Y000DT00000.0320");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0320" + "'", str3, "P0Y000DT00000.0320");
    }

    @Test
    public void test5791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5791");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) 100, "P0000Y000DT00000.99-53", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0000Y000DT00000.99-53" + "'", str5, "P0000Y000DT00000.99-53");
    }

    @Test
    public void test5792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5792");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(100L, (long) (byte) -1, "0:00:00.032");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.032" + "'", str3, "0:00:00.032");
    }

    @Test
    public void test5793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5793");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 0, (long) (byte) 1, "P0Y000DT00000.0651");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0651" + "'", str3, "P0Y000DT00000.0651");
    }

    @Test
    public void test5794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5794");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 1, (long) (byte) 0, "P0Y000DT00000.0421", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0421" + "'", str5, "P0Y000DT00000.0421");
    }

    @Test
    public void test5795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5795");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y000DT00000.472");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.472" + "'", str2, "P0Y000DT00000.472");
    }

    @Test
    public void test5796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5796");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.02-100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.02-100" + "'", str2, "P0Y000DT00000.02-100");
    }

    @Test
    public void test5797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5797");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.10135", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.10135" + "'", str3, "P0Y000DT00000.10135");
    }

    @Test
    public void test5798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5798");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 0, (long) (-1), "P0Y000DT00000.03442");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.03442" + "'", str3, "P0Y000DT00000.03442");
    }

    @Test
    public void test5799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5799");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 100, (long) (byte) -1, "P0Y000DT00000.068-1", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.068-1" + "'", str5, "P0Y000DT00000.068-1");
    }

    @Test
    public void test5800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5800");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 10, (long) (short) 10, "P0Y000DT00000.910", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.910" + "'", str5, "P0Y000DT00000.910");
    }

    @Test
    public void test5801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5801");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (-1), (long) 1, "P0Y000DT00000.0000", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0000" + "'", str5, "P0Y000DT00000.0000");
    }

    @Test
    public void test5802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5802");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0Y000DT00000.10199");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.10199" + "'", str2, "P0Y000DT00000.10199");
    }

    @Test
    public void test5803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5803");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '4', 10L, "P0Y000DT00000.1010");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.1010" + "'", str3, "P0Y000DT00000.1010");
    }

    @Test
    public void test5804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5804");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) (short) -1, "0 0a00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 0a00" + "'", str3, "0 0a00");
    }

    @Test
    public void test5805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5805");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y0M0DT0H0M0.04S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0432" + "'", str2, "P0Y000DT00000.0432");
    }

    @Test
    public void test5806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5806");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.04297");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.04297" + "'", str2, "P0Y000DT00000.04297");
    }

    @Test
    public void test5807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5807");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(1L, "0 0econ00", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 0econ00" + "'", str3, "0 0econ00");
    }

    @Test
    public void test5808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5808");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) 1, (long) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.99S" + "'", str2, "P0Y0M0DT0H0M0.99S");
    }

    @Test
    public void test5809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5809");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 10, (long) 100, "P0Y000DT00000.022-1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.022-1" + "'", str3, "P0Y000DT00000.022-1");
    }

    @Test
    public void test5810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5810");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 10, 0L, "P0Y000DT00000.8997", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.8997" + "'", str5, "P0Y000DT00000.8997");
    }

    @Test
    public void test5811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5811");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(10L, "P0Y000DT00000.0520", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0520" + "'", str3, "P0Y000DT00000.0520");
    }

    @Test
    public void test5812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5812");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y000DT00000.7897");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.7897" + "'", str2, "P0Y000DT00000.7897");
    }

    @Test
    public void test5813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5813");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) 10, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5814");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.011-68");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.011-68" + "'", str2, "P0Y000DT00000.011-68");
    }

    @Test
    public void test5815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5815");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 10, "P0Y000DT00000.47-10");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.47-10" + "'", str2, "P0Y000DT00000.47-10");
    }

    @Test
    public void test5816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5816");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(1L, "0:00:00.097");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.097" + "'", str2, "0:00:00.097");
    }

    @Test
    public void test5817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5817");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y000DT00000.100-1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.100-1" + "'", str2, "P0Y000DT00000.100-1");
    }

    @Test
    public void test5818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5818");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) ' ', "P0Y000DT00000.47-11", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.47-11" + "'", str5, "P0Y000DT00000.47-11");
    }

    @Test
    public void test5819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5819");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) 1, "P0Y000DT00000.03552");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.03552" + "'", str3, "P0Y000DT00000.03552");
    }

    @Test
    public void test5820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5820");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) ' ', (long) 1, "P0Y000DT00000.4725");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.4725" + "'", str3, "P0Y000DT00000.4725");
    }

    @Test
    public void test5821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5821");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 10, "P0Y000DT00000.035-10", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.035-10" + "'", str3, "P0Y000DT00000.035-10");
    }

    @Test
    public void test5822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5822");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, 0L, "0:00:00.001");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.001" + "'", str3, "0:00:00.001");
    }

    @Test
    public void test5823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5823");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), (long) 'a', "P0Y000DT00000.97-10");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.97-10" + "'", str3, "P0Y000DT00000.97-10");
    }

    @Test
    public void test5824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5824");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '4', 10L, "P0Y000DT00000.13-1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.13-1" + "'", str3, "P0Y000DT00000.13-1");
    }

    @Test
    public void test5825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5825");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '4', "P0Y000DT00000.101-100", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.101-100" + "'", str3, "P0Y000DT00000.101-100");
    }

    @Test
    public void test5826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5826");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) '4', "", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test5827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5827");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 100, "0:00:00.001", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.001" + "'", str3, "0:00:00.001");
    }

    @Test
    public void test5828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5828");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) (byte) 1, "P0Y000DT00000.0350", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0350" + "'", str5, "P0Y000DT00000.0350");
    }

    @Test
    public void test5829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5829");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 0, 100L, "P0Y000DT00000.032-1", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.032-1" + "'", str5, "P0Y000DT00000.032-1");
    }

    @Test
    public void test5830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5830");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 100, "P0Y000DT00000.98-97", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.98-97" + "'", str3, "P0Y000DT00000.98-97");
    }

    @Test
    public void test5831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5831");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.003-2", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.003-2" + "'", str3, "P0Y000DT00000.003-2");
    }

    @Test
    public void test5832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5832");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) (byte) 100, "P0Y000DT00000.101-100", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.101-100" + "'", str5, "P0Y000DT00000.101-100");
    }

    @Test
    public void test5833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5833");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(10L, "P0Y000DT00000.3210");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.3210" + "'", str2, "P0Y000DT00000.3210");
    }

    @Test
    public void test5834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5834");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(1L, (-1L), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5835");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '4', (long) ' ', "P0Y000DT00000.03535");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.03535" + "'", str3, "P0Y000DT00000.03535");
    }

    @Test
    public void test5836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5836");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '#', 0L, "P0Y000DT00000.0011");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0011" + "'", str3, "P0Y000DT00000.0011");
    }

    @Test
    public void test5837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5837");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y000DT00000.033-1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.033-1" + "'", str2, "P0Y000DT00000.033-1");
    }

    @Test
    public void test5838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5838");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y000DT00000.048100", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.048100" + "'", str3, "P0Y000DT00000.048100");
    }

    @Test
    public void test5839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5839");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) 1, "P0Y000DT00000.02232", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.02232" + "'", str5, "P0Y000DT00000.02232");
    }

    @Test
    public void test5840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5840");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.04535");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.04535" + "'", str2, "P0Y000DT00000.04535");
    }

    @Test
    public void test5841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5841");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) '4', "P0Y000DT00000.0321", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0321" + "'", str5, "P0Y000DT00000.0321");
    }

    @Test
    public void test5842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5842");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(1L, "P0Y000DT00000.47-11", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.47-11" + "'", str3, "P0Y000DT00000.47-11");
    }

    @Test
    public void test5843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5843");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.06552", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.06552" + "'", str3, "P0Y000DT00000.06552");
    }

    @Test
    public void test5844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5844");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) 100, "P0Y000DT00000.0398");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0398" + "'", str3, "P0Y000DT00000.0398");
    }

    @Test
    public void test5845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5845");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.022-1", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.022-1" + "'", str3, "P0Y000DT00000.022-1");
    }

    @Test
    public void test5846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5846");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0Y000DT00000.58100", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.58100" + "'", str3, "P0Y000DT00000.58100");
    }

    @Test
    public void test5847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5847");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) 0, "P0Y000DT00000.03110");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.03110" + "'", str3, "P0Y000DT00000.03110");
    }

    @Test
    public void test5848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5848");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) 1, "P0Y000DT00000.003-2", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.003-2" + "'", str5, "P0Y000DT00000.003-2");
    }

    @Test
    public void test5849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5849");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) 0, "P0Y000DT00000.03535", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.03535" + "'", str5, "P0Y000DT00000.03535");
    }

    @Test
    public void test5850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5850");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 1, 0L, "P0000Y000DT00000.991");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.991" + "'", str3, "P0000Y000DT00000.991");
    }

    @Test
    public void test5851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5851");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y000DT00000.6890");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.6890" + "'", str2, "P0Y000DT00000.6890");
    }

    @Test
    public void test5852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5852");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) (short) -1, "P0Y000DT00000.009100", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.009100" + "'", str5, "P0Y000DT00000.009100");
    }

    @Test
    public void test5853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5853");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(100L, "P0Y000DT00000.042100", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.042100" + "'", str3, "P0Y000DT00000.042100");
    }

    @Test
    public void test5854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5854");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, 0L, "P0Y000DT00000.003-101");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.003-101" + "'", str3, "P0Y000DT00000.003-101");
    }

    @Test
    public void test5855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5855");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 10, 0L, "P0Y000DT00000.052101", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.052101" + "'", str5, "P0Y000DT00000.052101");
    }

    @Test
    public void test5856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5856");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.483", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.483" + "'", str3, "P0Y000DT00000.483");
    }

    @Test
    public void test5857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5857");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y000DT00000.010");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.010" + "'", str2, "P0Y000DT00000.010");
    }

    @Test
    public void test5858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5858");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(100L, (long) 0, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5859");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) '4', "P0Y000DT00000.66100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.66100" + "'", str3, "P0Y000DT00000.66100");
    }

    @Test
    public void test5860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5860");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0Y0M0DT0H0M0.47S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.4710" + "'", str2, "P0Y000DT00000.4710");
    }

    @Test
    public void test5861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5861");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 10, (long) '#', "P0Y000DT00000.02-101", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.02-101" + "'", str5, "P0Y000DT00000.02-101");
    }

    @Test
    public void test5862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5862");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(10L, 0L, "P0Y000DT00000.09610", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.09610" + "'", str5, "P0Y000DT00000.09610");
    }

    @Test
    public void test5863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5863");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 0, 0L, "P0Y000DT00000.75-96", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.75-96" + "'", str5, "P0Y000DT00000.75-96");
    }

    @Test
    public void test5864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5864");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.0250", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0250" + "'", str3, "P0Y000DT00000.0250");
    }

    @Test
    public void test5865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5865");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) (short) 1, "P0Y000DT00000.033-97");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.033-97" + "'", str3, "P0Y000DT00000.033-97");
    }

    @Test
    public void test5866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5866");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) '4', "P0Y000DT00000.068-48");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.068-48" + "'", str3, "P0Y000DT00000.068-48");
    }

    @Test
    public void test5867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5867");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y000DT00000.097-2", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.097-2" + "'", str3, "P0Y000DT00000.097-2");
    }

    @Test
    public void test5868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5868");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) '4', (long) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.49S" + "'", str2, "P0Y0M0DT0H0M0.49S");
    }

    @Test
    public void test5869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5869");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 1, 0L, "P0Y000DT00000.0225", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0225" + "'", str5, "P0Y000DT00000.0225");
    }

    @Test
    public void test5870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5870");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(10L, (long) (byte) 0, "P0Y000DT00000.087-100", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.087-100" + "'", str5, "P0Y000DT00000.087-100");
    }

    @Test
    public void test5871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5871");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '4', 100L, "P0Y0M0DT0H0M0.035S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.03548" + "'", str3, "P0Y000DT00000.03548");
    }

    @Test
    public void test5872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5872");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.100", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.100" + "'", str3, "P0Y000DT00000.100");
    }

    @Test
    public void test5873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5873");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y000DT00000.09790", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.09790" + "'", str3, "P0Y000DT00000.09790");
    }

    @Test
    public void test5874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5874");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 10, "P0Y000DT00000.032-1", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.032-1" + "'", str3, "P0Y000DT00000.032-1");
    }

    @Test
    public void test5875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5875");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (byte) 10, (long) (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.89S" + "'", str2, "P0Y0M0DT0H0M0.89S");
    }

    @Test
    public void test5876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5876");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 100, "P0Y000DT00000.901");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.901" + "'", str2, "P0Y000DT00000.901");
    }

    @Test
    public void test5877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5877");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (short) 0, "P0Y000DT00000.0961");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0961" + "'", str3, "P0Y000DT00000.0961");
    }

    @Test
    public void test5878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5878");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0Y000DT00000.06510");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.06510" + "'", str2, "P0Y000DT00000.06510");
    }

    @Test
    public void test5879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5879");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 1, 0L, "P0Y000DT00000.99-11", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.99-11" + "'", str5, "P0Y000DT00000.99-11");
    }

    @Test
    public void test5880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5880");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(10L, "P0Y000DT00000.3510", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.3510" + "'", str3, "P0Y000DT00000.3510");
    }

    @Test
    public void test5881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5881");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.7548", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.7548" + "'", str3, "P0Y000DT00000.7548");
    }

    @Test
    public void test5882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5882");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y000DT00000.0970", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0970" + "'", str3, "P0Y000DT00000.0970");
    }

    @Test
    public void test5883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5883");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0Y000DT00000.051-101", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.051-101" + "'", str3, "P0Y000DT00000.051-101");
    }

    @Test
    public void test5884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5884");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0000Y000DT00000.00152");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0000Y000DT00000.00152" + "'", str2, "P0000Y000DT00000.00152");
    }

    @Test
    public void test5885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5885");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) (byte) -1, "P0Y000DT00000.010-11", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.010-11" + "'", str5, "P0Y000DT00000.010-11");
    }

    @Test
    public void test5886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5886");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 1, "", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5887");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) (short) 0, "0:00:00.99");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.99" + "'", str3, "0:00:00.99");
    }

    @Test
    public void test5888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5888");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y000DT00000.033-97");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.033-97" + "'", str2, "P0Y000DT00000.033-97");
    }

    @Test
    public void test5889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5889");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) (short) 10, "P0Y0M0DT0H0M0.32S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.3211" + "'", str3, "P0Y000DT00000.3211");
    }

    @Test
    public void test5890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5890");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(100L, "P0Y000DT00000.003-1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.003-1" + "'", str2, "P0Y000DT00000.003-1");
    }

    @Test
    public void test5891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5891");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(10L, 100L, "P0Y000DT00000.8310");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.8310" + "'", str3, "P0Y000DT00000.8310");
    }

    @Test
    public void test5892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5892");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '4', (long) (short) -1, "P0Y000DT00000.04510", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.04510" + "'", str5, "P0Y000DT00000.04510");
    }

    @Test
    public void test5893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5893");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 100, "P0Y000DT00000.6710");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.6710" + "'", str2, "P0Y000DT00000.6710");
    }

    @Test
    public void test5894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5894");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 100, "P0Y000DT00000.003-31");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.003-31" + "'", str2, "P0Y000DT00000.003-31");
    }

    @Test
    public void test5895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5895");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, 100L, "P0Y000DT00000.097-9", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.097-9" + "'", str5, "P0Y000DT00000.097-9");
    }

    @Test
    public void test5896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5896");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) ' ', "P0Y000DT00000.351");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.351" + "'", str3, "P0Y000DT00000.351");
    }

    @Test
    public void test5897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5897");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (byte) 10, 10L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2, "P0Y0M0DT0H0M0.000S");
    }

    @Test
    public void test5898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5898");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0Y000DT00000.002-101", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.002-101" + "'", str3, "P0Y000DT00000.002-101");
    }

    @Test
    public void test5899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5899");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y000DT00000.89-1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.89-1" + "'", str2, "P0Y000DT00000.89-1");
    }

    @Test
    public void test5900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5900");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 100, 10L, "P0Y000DT00000.4953", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.4953" + "'", str5, "P0Y000DT00000.4953");
    }

    @Test
    public void test5901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5901");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (byte) 1, "P0Y000DT00000.09032");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.09032" + "'", str3, "P0Y000DT00000.09032");
    }

    @Test
    public void test5902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5902");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y000DT00000.0221", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0221" + "'", str3, "P0Y000DT00000.0221");
    }

    @Test
    public void test5903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5903");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y000DT00000.0961");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0961" + "'", str2, "P0Y000DT00000.0961");
    }

    @Test
    public void test5904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5904");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (-1), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5905");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 1, 10L, "P0Y000DT00000.02100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.02100" + "'", str3, "P0Y000DT00000.02100");
    }

    @Test
    public void test5906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5906");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 100, (long) (byte) 100, "P0Y000DT00000.0250");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0250" + "'", str3, "P0Y000DT00000.0250");
    }

    @Test
    public void test5907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5907");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) '4', "P0Y000DT00000.021", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.021" + "'", str5, "P0Y000DT00000.021");
    }

    @Test
    public void test5908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5908");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) (byte) 10, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5909");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(100L, (long) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.00S" + "'", str2, "P0Y0M0DT0H0M0.00S");
    }

    @Test
    public void test5910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5910");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.10033", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.10033" + "'", str3, "P0Y000DT00000.10033");
    }

    @Test
    public void test5911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5911");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.000", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.000" + "'", str3, "P0Y000DT00000.000");
    }

    @Test
    public void test5912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5912");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 1, (long) 0, "P0Y000DT00000.653", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.653" + "'", str5, "P0Y000DT00000.653");
    }

    @Test
    public void test5913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5913");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.10199", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.10199" + "'", str3, "P0Y000DT00000.10199");
    }

    @Test
    public void test5914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5914");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 10, "P0Y000DT00000.320");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.320" + "'", str2, "P0Y000DT00000.320");
    }

    @Test
    public void test5915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5915");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 10, "0 0a000 0 hour 0 0inute00 0 econ00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0 0a000 0 hour 0 0inute00 0 econ00" + "'", str2, "0 0a000 0 hour 0 0inute00 0 econ00");
    }

    @Test
    public void test5916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5916");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(100L, (long) 100, "P0Y000DT00000.65100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.65100" + "'", str3, "P0Y000DT00000.65100");
    }

    @Test
    public void test5917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5917");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.641");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.641" + "'", str2, "P0Y000DT00000.641");
    }

    @Test
    public void test5918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5918");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) 10, "P0Y000DT00000.04297", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.04297" + "'", str5, "P0Y000DT00000.04297");
    }

    @Test
    public void test5919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5919");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 100, (long) (-1), "P0Y000DT00000.05310");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.05310" + "'", str3, "P0Y000DT00000.05310");
    }

    @Test
    public void test5920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5920");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, 10L, "P0Y000DT00000.64-2", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.64-2" + "'", str5, "P0Y000DT00000.64-2");
    }

    @Test
    public void test5921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5921");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 0, (long) (-1), "P0Y000DT00000.0680");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0680" + "'", str3, "P0Y000DT00000.0680");
    }

    @Test
    public void test5922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5922");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y000DT00000.003-2", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.003-2" + "'", str3, "P0Y000DT00000.003-2");
    }

    @Test
    public void test5923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5923");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y000DT00000.0335");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0335" + "'", str2, "P0Y000DT00000.0335");
    }

    @Test
    public void test5924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5924");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), (long) (short) 0, "P0Y000DT00000.000-101", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.000-101" + "'", str5, "P0Y000DT00000.000-101");
    }

    @Test
    public void test5925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5925");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y000DT00000.6732");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.6732" + "'", str2, "P0Y000DT00000.6732");
    }

    @Test
    public void test5926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5926");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(100L, "P0Y000DT00000.4997", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.4997" + "'", str3, "P0Y000DT00000.4997");
    }

    @Test
    public void test5927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5927");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 1, "P0Y000DT00000.090-98");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.090-98" + "'", str2, "P0Y000DT00000.090-98");
    }

    @Test
    public void test5928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5928");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y0M0DT0H0M0.65S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.650" + "'", str2, "P0Y000DT00000.650");
    }

    @Test
    public void test5929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5929");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0Y000DT00000.580");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.580" + "'", str2, "P0Y000DT00000.580");
    }

    @Test
    public void test5930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5930");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '4', "P0Y000DT00000.001100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.001100" + "'", str2, "P0Y000DT00000.001100");
    }

    @Test
    public void test5931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5931");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, 0L, "P0000Y000DT00000.0320", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0000Y000DT00000.0320" + "'", str5, "P0000Y000DT00000.0320");
    }

    @Test
    public void test5932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5932");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y000DT00000.78-31");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.78-31" + "'", str2, "P0Y000DT00000.78-31");
    }

    @Test
    public void test5933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5933");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(1L, "P0Y000DT00000.68-101");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.68-101" + "'", str2, "P0Y000DT00000.68-101");
    }

    @Test
    public void test5934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5934");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y000DT00000.090-11", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.090-11" + "'", str3, "P0Y000DT00000.090-11");
    }

    @Test
    public void test5935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5935");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0Y000DT00000.0620");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0620" + "'", str2, "P0Y000DT00000.0620");
    }

    @Test
    public void test5936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5936");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) 100, "P0Y000DT00000.04252", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.04252" + "'", str5, "P0Y000DT00000.04252");
    }

    @Test
    public void test5937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5937");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) -1, 1L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.002S" + "'", str2, "P0Y0M0DT0H0M0.002S");
    }

    @Test
    public void test5938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5938");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y000DT00000.69-2", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.69-2" + "'", str3, "P0Y000DT00000.69-2");
    }

    @Test
    public void test5939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5939");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 10, (long) (byte) 100, "P0Y000DT00000.0521");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0521" + "'", str3, "P0Y000DT00000.0521");
    }

    @Test
    public void test5940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5940");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), 0L, "P0Y000DT00000.03531");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.03531" + "'", str3, "P0Y000DT00000.03531");
    }

    @Test
    public void test5941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5941");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y000DT00000.098100", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.098100" + "'", str3, "P0Y000DT00000.098100");
    }

    @Test
    public void test5942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5942");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 10, (long) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.91S" + "'", str2, "P0Y0M0DT0H0M0.91S");
    }

    @Test
    public void test5943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5943");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y000DT00000.05397", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.05397" + "'", str3, "P0Y000DT00000.05397");
    }

    @Test
    public void test5944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5944");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(10L, "P0Y000DT00000.0432", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0432" + "'", str3, "P0Y000DT00000.0432");
    }

    @Test
    public void test5945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5945");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '4', "P0Y000DT00000.053-1", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.053-1" + "'", str3, "P0Y000DT00000.053-1");
    }

    @Test
    public void test5946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5946");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y000DT00000.02-2", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.02-2" + "'", str3, "P0Y000DT00000.02-2");
    }

    @Test
    public void test5947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5947");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) '4', "P0Y000DT00000.002-65");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.002-65" + "'", str3, "P0Y000DT00000.002-65");
    }

    @Test
    public void test5948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5948");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '#', (long) (short) 10, "P0Y000DT00000.042-99");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.042-99" + "'", str3, "P0Y000DT00000.042-99");
    }

    @Test
    public void test5949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5949");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 100, 1L, "P0000Y000DT00000.035-99");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.035-99" + "'", str3, "P0000Y000DT00000.035-99");
    }

    @Test
    public void test5950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5950");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, 10L, "P0Y000DT00000.04210", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.04210" + "'", str5, "P0Y000DT00000.04210");
    }

    @Test
    public void test5951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5951");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) 100, "0:00:00.000", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
    }

    @Test
    public void test5952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5952");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 1, 1L, "0:00:00.100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.100" + "'", str3, "0:00:00.100");
    }

    @Test
    public void test5953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5953");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) 0, "P0Y000DT00000.02-101");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.02-101" + "'", str3, "P0Y000DT00000.02-101");
    }

    @Test
    public void test5954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5954");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 1, (long) (short) 10, "P0Y000DT00000.64-1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.64-1" + "'", str3, "P0Y000DT00000.64-1");
    }

    @Test
    public void test5955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5955");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.06552", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.06552" + "'", str3, "P0Y000DT00000.06552");
    }

    @Test
    public void test5956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5956");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), (long) (byte) 1, "", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test5957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5957");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(10L, (long) '4', "P0Y000DT00000.8310", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.8310" + "'", str5, "P0Y000DT00000.8310");
    }

    @Test
    public void test5958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5958");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 0, (long) ' ', "P0Y000DT00000.101-1", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.101-1" + "'", str5, "P0Y000DT00000.101-1");
    }

    @Test
    public void test5959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5959");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) 0, (-1L));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.99S" + "'", str2, "P0Y0M0DT0H0M0.99S");
    }

    @Test
    public void test5960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5960");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0Y000DT00000.04232", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.04232" + "'", str3, "P0Y000DT00000.04232");
    }

    @Test
    public void test5961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5961");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(1L, 0L, "P0Y000DT00000.0011", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0011" + "'", str5, "P0Y000DT00000.0011");
    }

    @Test
    public void test5962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5962");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 100, "P0Y000DT00000.68100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.68100" + "'", str2, "P0Y000DT00000.68100");
    }

    @Test
    public void test5963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5963");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '4', (-1L), "P0Y000DT00000.100-10");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.100-10" + "'", str3, "P0Y000DT00000.100-10");
    }

    @Test
    public void test5964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5964");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 10, "P0Y000DT00000.49-98");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.49-98" + "'", str2, "P0Y000DT00000.49-98");
    }

    @Test
    public void test5965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5965");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0Y000DT00000.035100", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.035100" + "'", str3, "P0Y000DT00000.035100");
    }

    @Test
    public void test5966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5966");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '#', (long) 'a', "P0Y000DT00000.04210", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.04210" + "'", str5, "P0Y000DT00000.04210");
    }

    @Test
    public void test5967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5967");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(1L, "P0Y000DT00000.10034");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.10034" + "'", str2, "P0Y000DT00000.10034");
    }

    @Test
    public void test5968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5968");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.90-2", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.90-2" + "'", str3, "P0Y000DT00000.90-2");
    }

    @Test
    public void test5969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5969");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) 10, "P0Y000DT00000.00100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00100" + "'", str3, "P0Y000DT00000.00100");
    }

    @Test
    public void test5970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5970");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), (long) (short) 1, "P0Y000DT00000.02232");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.02232" + "'", str3, "P0Y000DT00000.02232");
    }

    @Test
    public void test5971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5971");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '#', "P0Y000DT00000.0098", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0098" + "'", str3, "P0Y000DT00000.0098");
    }

    @Test
    public void test5972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5972");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) (short) 1, "P0Y000DT00000.6997");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.6997" + "'", str3, "P0Y000DT00000.6997");
    }

    @Test
    public void test5973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5973");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(100L, "P0Y000DT00000.3290");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.3290" + "'", str2, "P0Y000DT00000.3290");
    }

    @Test
    public void test5974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5974");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 1, (-1L), "P0Y000DT00000.6935");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.6935" + "'", str3, "P0Y000DT00000.6935");
    }

    @Test
    public void test5975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5975");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(100L, "P0Y0M0DT0H0M0.10S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.10100" + "'", str2, "P0Y000DT00000.10100");
    }

    @Test
    public void test5976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5976");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '#', (long) 0, "P0Y000DT00000.035100", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.035100" + "'", str5, "P0Y000DT00000.035100");
    }

    @Test
    public void test5977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5977");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) (short) -1, "P0Y000DT00000.00210", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.00210" + "'", str5, "P0Y000DT00000.00210");
    }

    @Test
    public void test5978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5978");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 1, "P0Y000DT00000.0651");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0651" + "'", str2, "P0Y000DT00000.0651");
    }

    @Test
    public void test5979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5979");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 100, (long) 'a', "P0000Y000DT00000.096-100", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0000Y000DT00000.096-100" + "'", str5, "P0000Y000DT00000.096-100");
    }

    @Test
    public void test5980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5980");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) 100, "P0Y000DT00000.010-1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.010-1" + "'", str3, "P0Y000DT00000.010-1");
    }

    @Test
    public void test5981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5981");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 100, "P0Y000DT00000.7832");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.7832" + "'", str2, "P0Y000DT00000.7832");
    }

    @Test
    public void test5982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5982");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (-1), 1L, "P0Y000DT00000.000-33", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.000-33" + "'", str5, "P0Y000DT00000.000-33");
    }

    @Test
    public void test5983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5983");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0000Y0M0DT0H0M0.001S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0000Y000DT00000.001100" + "'", str2, "P0000Y000DT00000.001100");
    }

    @Test
    public void test5984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5984");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) (short) 10, "P0Y000DT00000.0520");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0520" + "'", str3, "P0Y000DT00000.0520");
    }

    @Test
    public void test5985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5985");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '4', "P0Y000DT00000.13100", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.13100" + "'", str3, "P0Y000DT00000.13100");
    }

    @Test
    public void test5986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5986");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), (-1L), "P0Y000DT00000.3253");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.3253" + "'", str3, "P0Y000DT00000.3253");
    }

    @Test
    public void test5987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5987");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) -1, 0L, "P0000Y000DT00000.0321");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.0321" + "'", str3, "P0000Y000DT00000.0321");
    }

    @Test
    public void test5988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5988");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 10, (long) (short) -1, "P0000Y000DT00000.0320", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0000Y000DT00000.0320" + "'", str5, "P0000Y000DT00000.0320");
    }

    @Test
    public void test5989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5989");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (-1), (-1L), "P0Y000DT00000.090100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.090100" + "'", str3, "P0Y000DT00000.090100");
    }

    @Test
    public void test5990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5990");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(1L, (long) '#', "P0Y000DT00000.68-101", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.68-101" + "'", str5, "P0Y000DT00000.68-101");
    }

    @Test
    public void test5991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5991");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) ' ', 0L, "P0Y000DT00000.0352", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0352" + "'", str5, "P0Y000DT00000.0352");
    }

    @Test
    public void test5992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5992");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 10, "P0000Y000DT00000.00152", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.00152" + "'", str3, "P0000Y000DT00000.00152");
    }

    @Test
    public void test5993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5993");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "0 0a00 0 hour 0 0inute0 0 econ00", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 0a00 0 hour 0 0inute0 0 econ00" + "'", str3, "0 0a00 0 hour 0 0inute0 0 econ00");
    }

    @Test
    public void test5994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5994");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0Y000DT00000.68-100", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.68-100" + "'", str3, "P0Y000DT00000.68-100");
    }

    @Test
    public void test5995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5995");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 0, "P0Y000DT00000.03135");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.03135" + "'", str2, "P0Y000DT00000.03135");
    }

    @Test
    public void test5996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5996");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) (short) -1, "P0Y000DT00000.98100", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.98100" + "'", str5, "P0Y000DT00000.98100");
    }

    @Test
    public void test5997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5997");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) 1, "P0000Y000DT00000.0352");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.0352" + "'", str3, "P0000Y000DT00000.0352");
    }

    @Test
    public void test5998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5998");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 10, "P0Y000DT00000.67100", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.67100" + "'", str3, "P0Y000DT00000.67100");
    }

    @Test
    public void test5999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5999");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (byte) 1, (long) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.096S" + "'", str2, "P0Y0M0DT0H0M0.096S");
    }

    @Test
    public void test6000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test6000");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.0961");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0961" + "'", str2, "P0Y000DT00000.0961");
    }
}

