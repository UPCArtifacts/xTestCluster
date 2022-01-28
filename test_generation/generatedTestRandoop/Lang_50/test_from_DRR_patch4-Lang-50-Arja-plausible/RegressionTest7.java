import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone6);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 1, timeZone6);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone6);
        java.util.TimeZone timeZone10 = fastDateFormat9.getTimeZone();
        boolean boolean11 = fastDateFormat9.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone12 = fastDateFormat9.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone12);
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
// flaky:         org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
// flaky:         org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Central European Time");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(timeZone12);
// flaky:         org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat13);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.lang.StringBuffer stringBuffer3 = null;
        java.lang.StringBuffer stringBuffer4 = fastDateFormat1.format((long) (byte) 100, stringBuffer3);
        java.lang.String str5 = fastDateFormat1.getPattern();
        java.lang.String str6 = fastDateFormat1.getPattern();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone15 = fastDateFormat14.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone15);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone15);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone15);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone15);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone15);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone27 = fastDateFormat26.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone27);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone31 = fastDateFormat30.getTimeZone();
        java.util.Locale locale32 = fastDateFormat30.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone27, locale32);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, locale32);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(3, locale32);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 1, timeZone15, locale32);
        boolean boolean37 = fastDateFormat1.equals((java.lang.Object) (short) 1);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone45 = fastDateFormat44.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone45);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone45);
        java.util.Locale locale48 = fastDateFormat47.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 1, locale48);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(3, 0, locale48);
        boolean boolean51 = fastDateFormat1.equals((java.lang.Object) fastDateFormat50);
        java.lang.String str53 = fastDateFormat50.format((long) '4');
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertNull(stringBuffer4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(timeZone15);
// flaky:         org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(timeZone27);
// flaky:         org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(timeZone31);
// flaky:         org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(timeZone45);
// flaky:         org.junit.Assert.assertEquals(timeZone45.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "1/1/70 1:00:00 AM CET" + "'", str53, "1/1/70 1:00:00 AM CET");
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang.time.FastDateFormat.getInstance("h:mm:ss a z", timeZone4);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone12 = fastDateFormat11.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone12);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone12);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 0);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone23 = fastDateFormat22.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone23);
        java.util.TimeZone timeZone26 = null;
        java.util.Locale locale27 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone26, locale27);
        java.util.Locale locale29 = fastDateFormat28.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone23, locale29);
        boolean boolean31 = fastDateFormat18.equals((java.lang.Object) timeZone23);
        java.util.Locale locale32 = fastDateFormat18.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, locale32);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getInstance("MMM d, yyyy h:mm:ss a z", timeZone12, locale32);
        java.util.TimeZone timeZone38 = null;
        java.util.Locale locale39 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone38, locale39);
        java.util.Locale locale41 = fastDateFormat40.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 1, locale41);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone12, locale41);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy h:mm:ss a z", timeZone4, locale41);
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertNotNull(timeZone4);
// flaky:         org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
// flaky:         org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(timeZone23);
// flaky:         org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(fastDateFormat44);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone5);
        java.util.TimeZone timeZone8 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone8, locale9);
        java.util.Locale locale11 = fastDateFormat10.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone5, locale11);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone5);
        java.lang.String str14 = fastDateFormat13.getPattern();
        java.util.Locale locale15 = fastDateFormat13.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = fastDateFormat13.parseObject("FastDateFormat[MMMM d, yyyy]");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang.time.FastDateFormat.getInstance("MMM d, yyyy");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone7);
        java.util.TimeZone timeZone12 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone12, locale13);
        java.util.Locale locale15 = fastDateFormat14.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 1, locale15);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getInstance("M/d/yy", timeZone7, locale15);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2, locale15);
        java.lang.String str19 = fastDateFormat18.getPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = fastDateFormat1.format((java.lang.Object) fastDateFormat18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: org.apache.commons.lang.time.FastDateFormat");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
// flaky:         org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat18);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "MMM d, yyyy" + "'", str19, "MMM d, yyyy");
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone10 = fastDateFormat9.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone10);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone10);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone10);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone10);
        java.util.TimeZone timeZone17 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone22 = fastDateFormat21.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone22);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone26 = fastDateFormat25.getTimeZone();
        java.util.Locale locale27 = fastDateFormat25.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone22, locale27);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(2, (int) (short) 1, timeZone17, locale27);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang.time.FastDateFormat.getInstance("MMMM d, yyyy h:mm:ss a z", timeZone10, locale27);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone37 = fastDateFormat36.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone37);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone42 = fastDateFormat41.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone42);
        java.util.Locale locale44 = fastDateFormat43.getLocale();
        java.util.Locale locale45 = fastDateFormat43.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(1, timeZone37, locale45);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang.time.FastDateFormat.getInstance("M/d/yy", timeZone37);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat55 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone56 = fastDateFormat55.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat57 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone56);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone60 = fastDateFormat59.getTimeZone();
        java.util.Locale locale61 = fastDateFormat59.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat62 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone56, locale61);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat63 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, locale61);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat64 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(2, 0, locale61);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat65 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale61);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat66 = org.apache.commons.lang.time.FastDateFormat.getInstance("MMMM d, yyyy h:mm:ss a z", timeZone37, locale61);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat67 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(2, timeZone10, locale61);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat68 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) -1, 3, timeZone10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
// flaky:         org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(timeZone22);
// flaky:         org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(timeZone26);
// flaky:         org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(timeZone37);
// flaky:         org.junit.Assert.assertEquals(timeZone37.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(timeZone42);
// flaky:         org.junit.Assert.assertEquals(timeZone42.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(fastDateFormat55);
        org.junit.Assert.assertNotNull(timeZone56);
// flaky:         org.junit.Assert.assertEquals(timeZone56.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat57);
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertNotNull(timeZone60);
// flaky:         org.junit.Assert.assertEquals(timeZone60.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat62);
        org.junit.Assert.assertNotNull(fastDateFormat63);
        org.junit.Assert.assertNotNull(fastDateFormat64);
        org.junit.Assert.assertNotNull(fastDateFormat65);
        org.junit.Assert.assertNotNull(fastDateFormat66);
        org.junit.Assert.assertNotNull(fastDateFormat67);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone4);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone4);
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        java.lang.Class<?> wildcardClass8 = fastDateFormat6.getClass();
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertNotNull(timeZone4);
// flaky:         org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
// flaky:         org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 1);
        boolean boolean2 = fastDateFormat1.getTimeZoneOverridesCalendar();
        java.lang.String str3 = fastDateFormat1.getPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = fastDateFormat1.parseObject("FastDateFormat[M/d/yy]");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "M/d/yy h:mm a" + "'", str3, "M/d/yy h:mm a");
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone8);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 1, timeZone8);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1);
        boolean boolean15 = fastDateFormat13.equals((java.lang.Object) (byte) 100);
        java.util.Locale locale16 = fastDateFormat13.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getInstance("M/d/yy h:mm a", locale16);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone8, locale16);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getInstance("MMM d, yyyy h:mm:ss a z", locale16);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) '#', (int) (short) 10, locale16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky:         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat19);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1);
        boolean boolean4 = fastDateFormat2.equals((java.lang.Object) (byte) 100);
        java.util.Locale locale5 = fastDateFormat2.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getInstance("M/d/yy h:mm a", locale5);
        boolean boolean7 = fastDateFormat6.getTimeZoneOverridesCalendar();
        boolean boolean8 = fastDateFormat6.getTimeZoneOverridesCalendar();
        java.lang.Object obj9 = fastDateFormat6.clone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone15 = fastDateFormat14.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone15);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone15);
        java.util.Locale locale18 = fastDateFormat17.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, locale18);
        boolean boolean20 = fastDateFormat6.equals((java.lang.Object) 0);
        java.lang.String str21 = fastDateFormat6.toString();
        java.lang.String str22 = fastDateFormat6.getPattern();
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "FastDateFormat[M/d/yy h:mm a]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "FastDateFormat[M/d/yy h:mm a]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "FastDateFormat[M/d/yy h:mm a]");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(timeZone15);
// flaky:         org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "FastDateFormat[M/d/yy h:mm a]" + "'", str21, "FastDateFormat[M/d/yy h:mm a]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "M/d/yy h:mm a" + "'", str22, "M/d/yy h:mm a");
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone7);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone11 = fastDateFormat10.getTimeZone();
        java.util.Locale locale12 = fastDateFormat10.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone7, locale12);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone16 = fastDateFormat15.getTimeZone();
        java.util.Locale locale17 = fastDateFormat15.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone7, locale17);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone22 = fastDateFormat21.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone22);
        java.util.Locale locale24 = fastDateFormat23.getLocale();
        java.util.Locale locale25 = fastDateFormat23.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(2, timeZone7, locale25);
        java.util.TimeZone timeZone27 = fastDateFormat26.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang.time.FastDateFormat.getInstance("M/d/yy", timeZone27);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone37 = fastDateFormat36.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone37);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone37);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone37);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone37);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone37);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone48 = fastDateFormat47.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone48);
        java.util.TimeZone timeZone51 = null;
        java.util.Locale locale52 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone51, locale52);
        java.util.Locale locale54 = fastDateFormat53.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat55 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone48, locale54);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, locale54);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat57 = org.apache.commons.lang.time.FastDateFormat.getInstance("M/d/yy", timeZone37, locale54);
        java.lang.String str59 = fastDateFormat57.format((long) 2);
        boolean boolean60 = fastDateFormat28.equals((java.lang.Object) fastDateFormat57);
        java.lang.String str61 = fastDateFormat28.getPattern();
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
// flaky:         org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(timeZone11);
// flaky:         org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(timeZone16);
// flaky:         org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(timeZone22);
// flaky:         org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(timeZone27);
// flaky:         org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(timeZone37);
// flaky:         org.junit.Assert.assertEquals(timeZone37.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(timeZone48);
// flaky:         org.junit.Assert.assertEquals(timeZone48.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNotNull(fastDateFormat53);
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat55);
        org.junit.Assert.assertNotNull(fastDateFormat56);
        org.junit.Assert.assertNotNull(fastDateFormat57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "1/1/70" + "'", str59, "1/1/70");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "M/d/yy" + "'", str61, "M/d/yy");
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 0);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone11 = fastDateFormat10.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone11);
        java.util.TimeZone timeZone14 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone14, locale15);
        java.util.Locale locale17 = fastDateFormat16.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone11, locale17);
        boolean boolean19 = fastDateFormat6.equals((java.lang.Object) timeZone11);
        java.util.TimeZone timeZone22 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone22, locale23);
        java.util.Locale locale25 = fastDateFormat24.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 1, locale25);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone11, locale25);
        java.util.Locale locale28 = fastDateFormat27.getLocale();
        java.util.Locale locale29 = fastDateFormat27.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1, locale29);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 0, (int) ' ', locale29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(timeZone11);
// flaky:         org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat30);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getInstance("MMM d, yyyy h:mm:ss a z");
        java.lang.String str4 = fastDateFormat2.format((long) 10);
        java.util.Locale locale5 = fastDateFormat2.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(25, locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 25");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Jan 1, 1970 1:00:00 AM CET" + "'", str4, "Jan 1, 1970 1:00:00 AM CET");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone3);
        int int5 = fastDateFormat4.getMaxLengthEstimate();
        java.lang.String str7 = fastDateFormat4.format((long) '4');
        java.lang.String str8 = fastDateFormat4.toString();
        java.util.Locale locale9 = fastDateFormat4.getLocale();
        int int10 = fastDateFormat4.getMaxLengthEstimate();
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertNotNull(timeZone3);
// flaky:         org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "FastDateFormat[]" + "'", str8, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        java.util.TimeZone timeZone3 = null;
        java.util.Locale locale4 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone3, locale4);
        int int6 = fastDateFormat5.getMaxLengthEstimate();
        java.util.Locale locale7 = fastDateFormat5.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale7);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, locale7);
        java.lang.String str11 = fastDateFormat9.format(100L);
        int int12 = fastDateFormat9.getMaxLengthEstimate();
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(fastDateFormat9);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Thursday, January 1, 1970" + "'", str11, "Thursday, January 1, 1970");
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 31 + "'", int12 == 31);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, (int) (byte) 1, timeZone2);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        java.lang.String str5 = fastDateFormat3.toString();
        boolean boolean6 = fastDateFormat3.getTimeZoneOverridesCalendar();
        java.util.Locale locale7 = fastDateFormat3.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone15 = fastDateFormat14.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone15);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone15);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 0, (int) (short) 1, timeZone15);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1);
        boolean boolean22 = fastDateFormat20.equals((java.lang.Object) (byte) 100);
        java.util.Locale locale23 = fastDateFormat20.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getInstance("M/d/yy", timeZone15, locale23);
        java.lang.String str26 = fastDateFormat24.format((long) 10);
        boolean boolean27 = fastDateFormat3.equals((java.lang.Object) str26);
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertNotNull(timeZone4);
// flaky:         org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Central European Time");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FastDateFormat[MMMM d, yyyy h:mm:ss a z]" + "'", str5, "FastDateFormat[MMMM d, yyyy h:mm:ss a z]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(timeZone15);
// flaky:         org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1/1/70" + "'", str26, "1/1/70");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(13);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        java.util.Locale locale6 = fastDateFormat4.getLocale();
        int int7 = fastDateFormat4.getMaxLengthEstimate();
        java.util.TimeZone timeZone8 = fastDateFormat4.getTimeZone();
        java.util.TimeZone timeZone11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone11, locale12);
        int int14 = fastDateFormat13.getMaxLengthEstimate();
        java.util.Locale locale15 = fastDateFormat13.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale15);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone8, locale15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = fastDateFormat1.format((java.lang.Object) fastDateFormat17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: org.apache.commons.lang.time.FastDateFormat");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 21 + "'", int7 == 21);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky:         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone8);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone13 = fastDateFormat12.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone13);
        java.util.Locale locale15 = fastDateFormat14.getLocale();
        java.util.Locale locale16 = fastDateFormat14.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(1, timeZone8, locale16);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone24 = fastDateFormat23.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone24);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone24);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone24);
        java.util.Locale locale28 = fastDateFormat27.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(1, locale28);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(3, timeZone8, locale28);
        java.util.TimeZone timeZone31 = fastDateFormat30.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 0);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone41 = fastDateFormat40.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone41);
        java.util.TimeZone timeZone44 = null;
        java.util.Locale locale45 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone44, locale45);
        java.util.Locale locale47 = fastDateFormat46.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone41, locale47);
        boolean boolean49 = fastDateFormat36.equals((java.lang.Object) timeZone41);
        java.util.Locale locale50 = fastDateFormat36.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat51 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, locale50);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat52 = org.apache.commons.lang.time.FastDateFormat.getInstance("1/1/70", locale50);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone31, locale50);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat61 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone62 = fastDateFormat61.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat63 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone62);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat65 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone66 = fastDateFormat65.getTimeZone();
        java.util.Locale locale67 = fastDateFormat65.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat68 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone62, locale67);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat70 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone71 = fastDateFormat70.getTimeZone();
        java.util.Locale locale72 = fastDateFormat70.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat73 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone62, locale72);
        java.util.TimeZone timeZone75 = null;
        java.util.Locale locale76 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat77 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone75, locale76);
        int int78 = fastDateFormat77.getMaxLengthEstimate();
        java.util.Locale locale79 = fastDateFormat77.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat80 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(1, timeZone62, locale79);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat81 = org.apache.commons.lang.time.FastDateFormat.getInstance("MMM d, yyyy h:mm:ss a z", timeZone62);
        java.util.TimeZone timeZone82 = fastDateFormat81.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat87 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone88 = fastDateFormat87.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat89 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone88);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat90 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone88);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat91 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone88);
        java.util.Locale locale92 = fastDateFormat91.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat93 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone82, locale92);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat94 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone31, locale92);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat95 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(50, locale92);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 50");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky:         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(timeZone24);
// flaky:         org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(timeZone31);
// flaky:         org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(timeZone41);
// flaky:         org.junit.Assert.assertEquals(timeZone41.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat51);
        org.junit.Assert.assertNotNull(fastDateFormat52);
        org.junit.Assert.assertNotNull(fastDateFormat53);
        org.junit.Assert.assertNotNull(fastDateFormat61);
        org.junit.Assert.assertNotNull(timeZone62);
// flaky:         org.junit.Assert.assertEquals(timeZone62.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat63);
        org.junit.Assert.assertNotNull(fastDateFormat65);
        org.junit.Assert.assertNotNull(timeZone66);
// flaky:         org.junit.Assert.assertEquals(timeZone66.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat68);
        org.junit.Assert.assertNotNull(fastDateFormat70);
        org.junit.Assert.assertNotNull(timeZone71);
// flaky:         org.junit.Assert.assertEquals(timeZone71.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat73);
        org.junit.Assert.assertNotNull(fastDateFormat77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 10 + "'", int78 == 10);
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat80);
        org.junit.Assert.assertNotNull(fastDateFormat81);
        org.junit.Assert.assertNotNull(timeZone82);
// flaky:         org.junit.Assert.assertEquals(timeZone82.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat87);
        org.junit.Assert.assertNotNull(timeZone88);
// flaky:         org.junit.Assert.assertEquals(timeZone88.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat89);
        org.junit.Assert.assertNotNull(fastDateFormat90);
        org.junit.Assert.assertNotNull(fastDateFormat91);
        org.junit.Assert.assertNotNull(locale92);
        org.junit.Assert.assertEquals(locale92.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat93);
        org.junit.Assert.assertNotNull(fastDateFormat94);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone4);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone4);
        java.lang.String str8 = fastDateFormat6.format((long) 13);
        int int9 = fastDateFormat6.getMaxLengthEstimate();
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertNotNull(timeZone4);
// flaky:         org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang.time.FastDateFormat.getInstance("h:mm a");
        java.lang.String str3 = fastDateFormat1.format(0L);
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1:00 AM" + "'", str3, "1:00 AM");
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone7);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 1, timeZone7);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone7);
        java.util.TimeZone timeZone11 = fastDateFormat10.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone19 = fastDateFormat18.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone19);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone19);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone19);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone29 = fastDateFormat28.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone29);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone33 = fastDateFormat32.getTimeZone();
        java.util.Locale locale34 = fastDateFormat32.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone29, locale34);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone38 = fastDateFormat37.getTimeZone();
        java.util.Locale locale39 = fastDateFormat37.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone29, locale39);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone45 = fastDateFormat44.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone45);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone49 = fastDateFormat48.getTimeZone();
        java.util.Locale locale50 = fastDateFormat48.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat51 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone45, locale50);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat52 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone29, locale50);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone19, locale50);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat55 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1);
        boolean boolean57 = fastDateFormat55.equals((java.lang.Object) (byte) 100);
        java.util.Locale locale58 = fastDateFormat55.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang.time.FastDateFormat.getInstance("MMMM d, yyyy h:mm:ss a z", timeZone19, locale58);
        java.util.Locale locale60 = fastDateFormat59.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat61 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone11, locale60);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat62 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 100, locale60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
// flaky:         org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(timeZone11);
// flaky:         org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(timeZone19);
// flaky:         org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(timeZone29);
// flaky:         org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(timeZone33);
// flaky:         org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(timeZone38);
// flaky:         org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(timeZone45);
// flaky:         org.junit.Assert.assertEquals(timeZone45.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertNotNull(timeZone49);
// flaky:         org.junit.Assert.assertEquals(timeZone49.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat51);
        org.junit.Assert.assertNotNull(fastDateFormat52);
        org.junit.Assert.assertNotNull(fastDateFormat53);
        org.junit.Assert.assertNotNull(fastDateFormat55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat61);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone2);
        java.lang.StringBuffer stringBuffer5 = null;
        java.lang.StringBuffer stringBuffer6 = fastDateFormat3.format(100L, stringBuffer5);
        java.util.Calendar calendar7 = null;
        java.lang.String str8 = fastDateFormat3.format(calendar7);
        java.util.TimeZone timeZone9 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone9);
        java.lang.String str11 = fastDateFormat10.toString();
        int int12 = fastDateFormat10.getMaxLengthEstimate();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone21 = fastDateFormat20.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone21);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone21);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone21);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone31 = fastDateFormat30.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone31);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone35 = fastDateFormat34.getTimeZone();
        java.util.Locale locale36 = fastDateFormat34.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone31, locale36);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone40 = fastDateFormat39.getTimeZone();
        java.util.Locale locale41 = fastDateFormat39.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone31, locale41);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone47 = fastDateFormat46.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone47);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone51 = fastDateFormat50.getTimeZone();
        java.util.Locale locale52 = fastDateFormat50.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone47, locale52);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat54 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone31, locale52);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat55 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone21, locale52);
        java.util.TimeZone timeZone59 = null;
        java.util.Locale locale60 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat61 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone59, locale60);
        java.util.Locale locale62 = fastDateFormat61.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat63 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale62);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat64 = org.apache.commons.lang.time.FastDateFormat.getInstance("MMMM d, yyyy h:mm:ss a z", locale62);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat65 = org.apache.commons.lang.time.FastDateFormat.getInstance("M/d/yy", timeZone21, locale62);
        java.util.TimeZone timeZone66 = fastDateFormat65.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat67 = org.apache.commons.lang.time.FastDateFormat.getInstance("1/1/70", timeZone66);
        boolean boolean68 = fastDateFormat67.getTimeZoneOverridesCalendar();
        java.util.Locale locale69 = fastDateFormat67.getLocale();
        java.util.TimeZone timeZone70 = fastDateFormat67.getTimeZone();
        boolean boolean71 = fastDateFormat10.equals((java.lang.Object) timeZone70);
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertNull(stringBuffer6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(timeZone9);
// flaky:         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "FastDateFormat[h:mm:ss a z]" + "'", str11, "FastDateFormat[h:mm:ss a z]");
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 18 + "'", int12 == 18);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(timeZone21);
// flaky:         org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(timeZone31);
// flaky:         org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(timeZone35);
// flaky:         org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(timeZone40);
// flaky:         org.junit.Assert.assertEquals(timeZone40.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(timeZone47);
// flaky:         org.junit.Assert.assertEquals(timeZone47.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertNotNull(timeZone51);
// flaky:         org.junit.Assert.assertEquals(timeZone51.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat53);
        org.junit.Assert.assertNotNull(fastDateFormat54);
        org.junit.Assert.assertNotNull(fastDateFormat55);
        org.junit.Assert.assertNotNull(fastDateFormat61);
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat63);
        org.junit.Assert.assertNotNull(fastDateFormat64);
        org.junit.Assert.assertNotNull(fastDateFormat65);
        org.junit.Assert.assertNotNull(timeZone66);
// flaky:         org.junit.Assert.assertEquals(timeZone66.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "en_US");
        org.junit.Assert.assertNotNull(timeZone70);
// flaky:         org.junit.Assert.assertEquals(timeZone70.getDisplayName(), "Central European Time");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone5);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone9 = fastDateFormat8.getTimeZone();
        java.util.Locale locale10 = fastDateFormat8.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone5, locale10);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone5);
        boolean boolean14 = fastDateFormat12.equals((java.lang.Object) 0.0d);
        java.util.TimeZone timeZone15 = fastDateFormat12.getTimeZone();
        int int16 = fastDateFormat12.getMaxLengthEstimate();
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
// flaky:         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(timeZone15);
// flaky:         org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Central European Time");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 18 + "'", int16 == 18);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone2 = fastDateFormat1.getTimeZone();
        java.util.Locale locale3 = fastDateFormat1.getLocale();
        int int4 = fastDateFormat1.getMaxLengthEstimate();
        java.lang.String str5 = fastDateFormat1.toString();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone9 = fastDateFormat8.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone9);
        java.util.Locale locale11 = fastDateFormat10.getLocale();
        java.util.Locale locale12 = fastDateFormat10.getLocale();
        boolean boolean13 = fastDateFormat1.equals((java.lang.Object) locale12);
        java.lang.String str14 = fastDateFormat1.getPattern();
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer17 = fastDateFormat1.format((long) 3, stringBuffer16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertNotNull(timeZone2);
// flaky:         org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FastDateFormat[M/d/yy h:mm a]" + "'", str5, "FastDateFormat[M/d/yy h:mm a]");
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
// flaky:         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "M/d/yy h:mm a" + "'", str14, "M/d/yy h:mm a");
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone5);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) '4', timeZone5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(fastDateFormat7);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1);
        boolean boolean3 = fastDateFormat1.equals((java.lang.Object) (byte) 100);
        java.lang.String str4 = fastDateFormat1.toString();
        java.util.Locale locale5 = fastDateFormat1.getLocale();
        java.lang.String str6 = fastDateFormat1.toString();
        java.util.TimeZone timeZone7 = fastDateFormat1.getTimeZone();
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer10 = fastDateFormat1.format((-1L), stringBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "FastDateFormat[h:mm:ss a z]" + "'", str4, "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "FastDateFormat[h:mm:ss a z]" + "'", str6, "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertNotNull(timeZone7);
// flaky:         org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Central European Time");
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone3);
        java.lang.StringBuffer stringBuffer6 = null;
        java.lang.StringBuffer stringBuffer7 = fastDateFormat4.format(100L, stringBuffer6);
        java.lang.Object obj8 = fastDateFormat4.clone();
        java.util.TimeZone timeZone9 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 1, timeZone9);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        int int13 = fastDateFormat12.getMaxLengthEstimate();
        boolean boolean14 = fastDateFormat12.getTimeZoneOverridesCalendar();
        java.util.Locale locale15 = fastDateFormat12.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(13, timeZone9, locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNull(stringBuffer7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone9);
// flaky:         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 21 + "'", int13 == 21);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone9 = fastDateFormat8.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone9);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 1, timeZone9);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone9);
        java.util.TimeZone timeZone13 = fastDateFormat12.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getInstance("MMM d, yyyy h:mm:ss a z", timeZone13);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone17 = fastDateFormat16.getTimeZone();
        java.util.Locale locale18 = fastDateFormat16.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone13, locale18);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(50, 29, locale18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 29");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
// flaky:         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(timeZone17);
// flaky:         org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat19);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 0);
        int int7 = fastDateFormat6.getMaxLengthEstimate();
        java.lang.String str9 = fastDateFormat6.format((long) (byte) 1);
        java.util.TimeZone timeZone10 = fastDateFormat6.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone17 = fastDateFormat16.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone17);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone17);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone17);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone27 = fastDateFormat26.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone27);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone31 = fastDateFormat30.getTimeZone();
        java.util.Locale locale32 = fastDateFormat30.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone27, locale32);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone36 = fastDateFormat35.getTimeZone();
        java.util.Locale locale37 = fastDateFormat35.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone27, locale37);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone43 = fastDateFormat42.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone43);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone47 = fastDateFormat46.getTimeZone();
        java.util.Locale locale48 = fastDateFormat46.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone43, locale48);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone27, locale48);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat51 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone17, locale48);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat52 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone10, locale48);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang.time.FastDateFormat.getInstance("M/d/yy", timeZone10);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat54 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone10);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat55 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone10);
        org.junit.Assert.assertNotNull(fastDateFormat6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 50 + "'", int7 == 50);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Thursday, January 1, 1970 1:00:00 AM CET" + "'", str9, "Thursday, January 1, 1970 1:00:00 AM CET");
        org.junit.Assert.assertNotNull(timeZone10);
// flaky:         org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(timeZone17);
// flaky:         org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(timeZone27);
// flaky:         org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(timeZone31);
// flaky:         org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(timeZone36);
// flaky:         org.junit.Assert.assertEquals(timeZone36.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(timeZone43);
// flaky:         org.junit.Assert.assertEquals(timeZone43.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(timeZone47);
// flaky:         org.junit.Assert.assertEquals(timeZone47.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertNotNull(fastDateFormat51);
        org.junit.Assert.assertNotNull(fastDateFormat52);
        org.junit.Assert.assertNotNull(fastDateFormat53);
        org.junit.Assert.assertNotNull(fastDateFormat54);
        org.junit.Assert.assertNotNull(fastDateFormat55);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone5);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone10 = fastDateFormat9.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone10);
        java.util.Locale locale12 = fastDateFormat11.getLocale();
        java.util.Locale locale13 = fastDateFormat11.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone5, locale13);
        boolean boolean16 = fastDateFormat14.equals((java.lang.Object) (byte) 1);
        java.util.TimeZone timeZone17 = fastDateFormat14.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone17);
        java.util.Locale locale19 = fastDateFormat18.getLocale();
        java.util.Date date20 = null;
        java.lang.StringBuffer stringBuffer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer22 = fastDateFormat18.format(date20, stringBuffer21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
// flaky:         org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(timeZone17);
// flaky:         org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, (int) (byte) 1, timeZone3);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        java.lang.String str6 = fastDateFormat4.toString();
        java.util.TimeZone timeZone7 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone14 = fastDateFormat13.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone14);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 1, timeZone14);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone14);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone23 = fastDateFormat22.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone23);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 1, timeZone23);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone23);
        java.util.Locale locale27 = fastDateFormat26.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone14, locale27);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(3, timeZone7, locale27);
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Central European Time");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "FastDateFormat[MMMM d, yyyy h:mm:ss a z]" + "'", str6, "FastDateFormat[MMMM d, yyyy h:mm:ss a z]");
        org.junit.Assert.assertNotNull(timeZone7);
// flaky:         org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(timeZone14);
// flaky:         org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(timeZone23);
// flaky:         org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(fastDateFormat29);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang.time.FastDateFormat.getInstance("FastDateFormat[h:mm:ss a]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1);
        boolean boolean5 = fastDateFormat3.equals((java.lang.Object) (byte) 100);
        java.util.Locale locale6 = fastDateFormat3.getLocale();
        java.util.TimeZone timeZone7 = fastDateFormat3.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(31, (-1), timeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        org.junit.Assert.assertNotNull(timeZone7);
// flaky:         org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Central European Time");
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone2 = fastDateFormat1.getTimeZone();
        java.util.Locale locale3 = fastDateFormat1.getLocale();
        int int4 = fastDateFormat1.getMaxLengthEstimate();
        java.lang.String str5 = fastDateFormat1.getPattern();
        java.util.Calendar calendar6 = null;
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer8 = fastDateFormat1.format(calendar6, stringBuffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertNotNull(timeZone2);
// flaky:         org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "M/d/yy h:mm a" + "'", str5, "M/d/yy h:mm a");
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone5);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone10 = fastDateFormat9.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone10);
        java.util.Locale locale12 = fastDateFormat11.getLocale();
        java.util.Locale locale13 = fastDateFormat11.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(1, timeZone5, locale13);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone21 = fastDateFormat20.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone21);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone21);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone21);
        java.util.Locale locale25 = fastDateFormat24.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(1, locale25);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(3, timeZone5, locale25);
        int int28 = fastDateFormat27.getMaxLengthEstimate();
        boolean boolean29 = fastDateFormat27.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone30 = fastDateFormat27.getTimeZone();
        java.lang.String str31 = fastDateFormat27.getPattern();
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
// flaky:         org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(timeZone21);
// flaky:         org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(timeZone30);
// flaky:         org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "Central European Time");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "h:mm a" + "'", str31, "h:mm a");
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        java.util.TimeZone timeZone4 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone4);
        java.lang.StringBuffer stringBuffer7 = null;
        java.lang.StringBuffer stringBuffer8 = fastDateFormat5.format(100L, stringBuffer7);
        java.lang.Object obj9 = fastDateFormat5.clone();
        java.util.TimeZone timeZone10 = fastDateFormat5.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 1, timeZone10);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone14 = fastDateFormat13.getTimeZone();
        java.util.Locale locale15 = fastDateFormat13.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone10, locale15);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getInstance("January 1, 1970 1:00:00 AM CET", locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: J");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNull(stringBuffer8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone10);
// flaky:         org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(timeZone14);
// flaky:         org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat16);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone6);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone10 = fastDateFormat9.getTimeZone();
        java.util.Locale locale11 = fastDateFormat9.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone6, locale11);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, locale11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) ' ', locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
// flaky:         org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
// flaky:         org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat13);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(33);
        java.lang.Object obj2 = fastDateFormat1.clone();
        java.lang.String str3 = fastDateFormat1.getPattern();
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertNotNull(obj2);
// flaky:         org.junit.Assert.assertEquals(obj2.toString(), "FastDateFormat[M/d/yy h:mm a]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "FastDateFormat[M/d/yy h:mm a]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "FastDateFormat[M/d/yy h:mm a]");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "M/d/yy h:mm a" + "'", str3, "M/d/yy h:mm a");
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        java.util.TimeZone timeZone1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(100, timeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone7);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone11 = fastDateFormat10.getTimeZone();
        java.util.Locale locale12 = fastDateFormat10.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone7, locale12);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(2, (int) (short) 1, timeZone2, locale12);
        boolean boolean15 = fastDateFormat14.getTimeZoneOverridesCalendar();
        java.lang.Object obj16 = fastDateFormat14.clone();
        java.util.Date date17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = fastDateFormat14.format(date17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
// flaky:         org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(timeZone11);
// flaky:         org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
// flaky:         org.junit.Assert.assertEquals(obj16.toString(), "FastDateFormat[MMM d, yyyy h:mm:ss a z]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "FastDateFormat[MMM d, yyyy h:mm:ss a z]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "FastDateFormat[MMM d, yyyy h:mm:ss a z]");
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        int int3 = fastDateFormat2.getMaxLengthEstimate();
        java.util.TimeZone timeZone4 = fastDateFormat2.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone12 = fastDateFormat11.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone12);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone16 = fastDateFormat15.getTimeZone();
        java.util.Locale locale17 = fastDateFormat15.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone12, locale17);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone21 = fastDateFormat20.getTimeZone();
        java.util.Locale locale22 = fastDateFormat20.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone12, locale22);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone28 = fastDateFormat27.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone28);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone32 = fastDateFormat31.getTimeZone();
        java.util.Locale locale33 = fastDateFormat31.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone28, locale33);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone12, locale33);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone12);
        java.util.Locale locale37 = fastDateFormat36.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(45, timeZone4, locale37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 45");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 21 + "'", int3 == 21);
        org.junit.Assert.assertNotNull(timeZone4);
// flaky:         org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
// flaky:         org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(timeZone16);
// flaky:         org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(timeZone21);
// flaky:         org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(timeZone28);
// flaky:         org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(timeZone32);
// flaky:         org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_US");
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone1);
        java.lang.StringBuffer stringBuffer4 = null;
        java.lang.StringBuffer stringBuffer5 = fastDateFormat2.format(100L, stringBuffer4);
        java.lang.Object obj6 = fastDateFormat2.clone();
        java.util.TimeZone timeZone7 = fastDateFormat2.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1);
        boolean boolean12 = fastDateFormat10.equals((java.lang.Object) (byte) 100);
        java.util.Locale locale13 = fastDateFormat10.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getInstance("M/d/yy h:mm a", locale13);
        java.util.TimeZone timeZone16 = null;
        java.util.Locale locale17 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone16, locale17);
        int int19 = fastDateFormat18.getMaxLengthEstimate();
        java.util.Locale locale20 = fastDateFormat18.getLocale();
        java.lang.Class<?> wildcardClass21 = locale20.getClass();
        boolean boolean22 = fastDateFormat14.equals((java.lang.Object) locale20);
        java.lang.Object obj23 = fastDateFormat14.clone();
        java.lang.String str24 = fastDateFormat14.toString();
        boolean boolean25 = fastDateFormat2.equals((java.lang.Object) fastDateFormat14);
        java.util.TimeZone timeZone26 = fastDateFormat2.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone34 = fastDateFormat33.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone34);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone34);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone34);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone34);
        java.util.TimeZone timeZone39 = fastDateFormat38.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone39);
        java.util.TimeZone timeZone41 = fastDateFormat40.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str42 = fastDateFormat2.format((java.lang.Object) timeZone41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: sun.util.calendar.ZoneInfo");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertNull(stringBuffer5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone7);
// flaky:         org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "FastDateFormat[M/d/yy h:mm a]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "FastDateFormat[M/d/yy h:mm a]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "FastDateFormat[M/d/yy h:mm a]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "FastDateFormat[M/d/yy h:mm a]" + "'", str24, "FastDateFormat[M/d/yy h:mm a]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(timeZone26);
// flaky:         org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(timeZone34);
// flaky:         org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(timeZone39);
// flaky:         org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(timeZone41);
// flaky:         org.junit.Assert.assertEquals(timeZone41.getDisplayName(), "Central European Time");
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone5);
        java.util.Locale locale7 = fastDateFormat6.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 1, locale7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getInstance("FastDateFormat[MMM d, yyyy h:mm:ss a z]", locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat8);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone9 = fastDateFormat8.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone9);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone13 = fastDateFormat12.getTimeZone();
        java.util.Locale locale14 = fastDateFormat12.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone9, locale14);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone9);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", timeZone9);
        java.util.TimeZone timeZone21 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone21, locale22);
        int int24 = fastDateFormat23.getMaxLengthEstimate();
        java.util.Locale locale25 = fastDateFormat23.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale25);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, locale25);
        java.lang.String str29 = fastDateFormat27.format(100L);
        java.util.Locale locale30 = fastDateFormat27.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(3, timeZone9, locale30);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone38 = fastDateFormat37.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone38);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone38);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone38);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone48 = fastDateFormat47.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone48);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat51 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone52 = fastDateFormat51.getTimeZone();
        java.util.Locale locale53 = fastDateFormat51.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat54 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone48, locale53);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone57 = fastDateFormat56.getTimeZone();
        java.util.Locale locale58 = fastDateFormat56.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone48, locale58);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat63 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone64 = fastDateFormat63.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat65 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone64);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat67 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone68 = fastDateFormat67.getTimeZone();
        java.util.Locale locale69 = fastDateFormat67.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat70 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone64, locale69);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat71 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone48, locale69);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat72 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone38, locale69);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat73 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) ' ', 31, timeZone9, locale69);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 31");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
// flaky:         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(fastDateFormat27);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Thursday, January 1, 1970" + "'", str29, "Thursday, January 1, 1970");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(timeZone38);
// flaky:         org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(timeZone48);
// flaky:         org.junit.Assert.assertEquals(timeZone48.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNotNull(fastDateFormat51);
        org.junit.Assert.assertNotNull(timeZone52);
// flaky:         org.junit.Assert.assertEquals(timeZone52.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat54);
        org.junit.Assert.assertNotNull(fastDateFormat56);
        org.junit.Assert.assertNotNull(timeZone57);
// flaky:         org.junit.Assert.assertEquals(timeZone57.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertNotNull(fastDateFormat63);
        org.junit.Assert.assertNotNull(timeZone64);
// flaky:         org.junit.Assert.assertEquals(timeZone64.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat65);
        org.junit.Assert.assertNotNull(fastDateFormat67);
        org.junit.Assert.assertNotNull(timeZone68);
// flaky:         org.junit.Assert.assertEquals(timeZone68.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat70);
        org.junit.Assert.assertNotNull(fastDateFormat71);
        org.junit.Assert.assertNotNull(fastDateFormat72);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone7);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone11 = fastDateFormat10.getTimeZone();
        java.util.Locale locale12 = fastDateFormat10.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone7, locale12);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, locale12);
        java.lang.String str15 = fastDateFormat14.getPattern();
        java.lang.Object obj16 = fastDateFormat14.clone();
        java.lang.String str17 = fastDateFormat14.toString();
        java.util.Locale locale18 = fastDateFormat14.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 10, 0, locale18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
// flaky:         org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(timeZone11);
// flaky:         org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h:mm:ss a z" + "'", str15, "h:mm:ss a z");
        org.junit.Assert.assertNotNull(obj16);
// flaky:         org.junit.Assert.assertEquals(obj16.toString(), "FastDateFormat[h:mm:ss a z]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "FastDateFormat[h:mm:ss a z]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "FastDateFormat[h:mm:ss a z]");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "FastDateFormat[h:mm:ss a z]" + "'", str17, "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone2, locale3);
        boolean boolean5 = fastDateFormat4.getTimeZoneOverridesCalendar();
        java.lang.String str7 = fastDateFormat4.format((long) (short) 10);
        java.util.Locale locale8 = fastDateFormat4.getLocale();
        java.util.TimeZone timeZone9 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone9);
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1/1/70" + "'", str7, "1/1/70");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        org.junit.Assert.assertNotNull(timeZone9);
// flaky:         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat10);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone8);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone8);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone8);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone18 = fastDateFormat17.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone18);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone22 = fastDateFormat21.getTimeZone();
        java.util.Locale locale23 = fastDateFormat21.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone18, locale23);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone27 = fastDateFormat26.getTimeZone();
        java.util.Locale locale28 = fastDateFormat26.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone18, locale28);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone34 = fastDateFormat33.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone34);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone38 = fastDateFormat37.getTimeZone();
        java.util.Locale locale39 = fastDateFormat37.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone34, locale39);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone18, locale39);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone8, locale39);
        java.util.TimeZone timeZone46 = null;
        java.util.Locale locale47 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone46, locale47);
        java.util.Locale locale49 = fastDateFormat48.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale49);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat51 = org.apache.commons.lang.time.FastDateFormat.getInstance("MMMM d, yyyy h:mm:ss a z", locale49);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat52 = org.apache.commons.lang.time.FastDateFormat.getInstance("M/d/yy", timeZone8, locale49);
        java.util.TimeZone timeZone53 = fastDateFormat52.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat54 = org.apache.commons.lang.time.FastDateFormat.getInstance("1/1/70", timeZone53);
        java.util.Date date55 = null;
        java.lang.StringBuffer stringBuffer56 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer57 = fastDateFormat54.format(date55, stringBuffer56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky:         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(timeZone18);
// flaky:         org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(timeZone22);
// flaky:         org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(timeZone27);
// flaky:         org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(timeZone34);
// flaky:         org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(timeZone38);
// flaky:         org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertNotNull(fastDateFormat51);
        org.junit.Assert.assertNotNull(fastDateFormat52);
        org.junit.Assert.assertNotNull(timeZone53);
// flaky:         org.junit.Assert.assertEquals(timeZone53.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat54);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone2);
        java.lang.StringBuffer stringBuffer5 = null;
        java.lang.StringBuffer stringBuffer6 = fastDateFormat3.format(100L, stringBuffer5);
        java.lang.Object obj7 = fastDateFormat3.clone();
        java.util.TimeZone timeZone8 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 1, timeZone8);
        java.lang.String str10 = fastDateFormat9.getPattern();
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertNull(stringBuffer6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone8);
// flaky:         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MMMM d, yyyy" + "'", str10, "MMMM d, yyyy");
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        java.util.TimeZone timeZone4 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, (int) (byte) 1, timeZone4);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(1, (int) (short) 0, timeZone6);
        java.lang.Object obj8 = fastDateFormat7.clone();
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
// flaky:         org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(obj8);
// flaky:         org.junit.Assert.assertEquals(obj8.toString(), "FastDateFormat[MMMM d, yyyy h:mm:ss a z]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "FastDateFormat[MMMM d, yyyy h:mm:ss a z]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "FastDateFormat[MMMM d, yyyy h:mm:ss a z]");
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone4);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone4);
        java.lang.String str7 = fastDateFormat6.toString();
        boolean boolean8 = fastDateFormat6.getTimeZoneOverridesCalendar();
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertNotNull(timeZone4);
// flaky:         org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FastDateFormat[h:mm:ss a z]" + "'", str7, "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone5);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone10 = fastDateFormat9.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone10);
        java.util.Locale locale12 = fastDateFormat11.getLocale();
        java.util.Locale locale13 = fastDateFormat11.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(1, timeZone5, locale13);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone5);
        java.util.TimeZone timeZone16 = fastDateFormat15.getTimeZone();
        java.lang.String str18 = fastDateFormat15.format(1L);
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
// flaky:         org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(timeZone16);
// flaky:         org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Central European Time");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1:00:00 AM CET" + "'", str18, "1:00:00 AM CET");
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone5);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone5);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 1);
        java.util.Locale locale10 = fastDateFormat9.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone5, locale10);
        java.lang.Class<?> wildcardClass12 = locale10.getClass();
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(39);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = fastDateFormat1.parseObject("FastDateFormat[M/d/yy]");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat1);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone6);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone10 = fastDateFormat9.getTimeZone();
        java.util.Locale locale11 = fastDateFormat9.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone6, locale11);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone15 = fastDateFormat14.getTimeZone();
        java.util.Locale locale16 = fastDateFormat14.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone6, locale16);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone22 = fastDateFormat21.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone22);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone26 = fastDateFormat25.getTimeZone();
        java.util.Locale locale27 = fastDateFormat25.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone22, locale27);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone6, locale27);
        java.util.Calendar calendar30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = fastDateFormat29.format(calendar30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
// flaky:         org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
// flaky:         org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(timeZone15);
// flaky:         org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(timeZone22);
// flaky:         org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(timeZone26);
// flaky:         org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(fastDateFormat29);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone6);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone6);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 0);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone17 = fastDateFormat16.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone17);
        java.util.TimeZone timeZone20 = null;
        java.util.Locale locale21 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone20, locale21);
        java.util.Locale locale23 = fastDateFormat22.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone17, locale23);
        boolean boolean25 = fastDateFormat12.equals((java.lang.Object) timeZone17);
        java.util.Locale locale26 = fastDateFormat12.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, locale26);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang.time.FastDateFormat.getInstance("MMM d, yyyy h:mm:ss a z", timeZone6, locale26);
        java.lang.Object obj29 = fastDateFormat28.clone();
        boolean boolean30 = fastDateFormat28.getTimeZoneOverridesCalendar();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone39 = fastDateFormat38.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone39);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone43 = fastDateFormat42.getTimeZone();
        java.util.Locale locale44 = fastDateFormat42.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone39, locale44);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, locale44);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(3, locale44);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang.time.FastDateFormat.getInstance("MMM d, yyyy h:mm a", locale44);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, locale44);
        boolean boolean50 = fastDateFormat28.equals((java.lang.Object) locale44);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat51 = org.apache.commons.lang.time.FastDateFormat.getInstance("January 1, 1970 12:59:59 AM CET", locale44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: J");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
// flaky:         org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(timeZone17);
// flaky:         org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "FastDateFormat[MMM d, yyyy h:mm:ss a z]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "FastDateFormat[MMM d, yyyy h:mm:ss a z]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "FastDateFormat[MMM d, yyyy h:mm:ss a z]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(timeZone39);
// flaky:         org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(timeZone43);
// flaky:         org.junit.Assert.assertEquals(timeZone43.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone12 = fastDateFormat11.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone12);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone12);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone12);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone12);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone12);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone23 = fastDateFormat22.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone23);
        java.util.TimeZone timeZone26 = null;
        java.util.Locale locale27 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone26, locale27);
        java.util.Locale locale29 = fastDateFormat28.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone23, locale29);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, locale29);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang.time.FastDateFormat.getInstance("M/d/yy", timeZone12, locale29);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) '4');
        java.util.Locale locale35 = fastDateFormat34.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang.time.FastDateFormat.getInstance("MMM d, yyyy", timeZone12, locale35);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone43 = fastDateFormat42.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone43);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone48 = fastDateFormat47.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone48);
        java.util.Locale locale50 = fastDateFormat49.getLocale();
        java.util.Locale locale51 = fastDateFormat49.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat52 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(1, timeZone43, locale51);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone43);
        java.util.Locale locale54 = fastDateFormat53.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat55 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, locale54);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(2, (int) (short) 1, timeZone12, locale54);
        java.util.TimeZone timeZone60 = null;
        java.util.Locale locale61 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat62 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone60, locale61);
        java.util.Locale locale63 = fastDateFormat62.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat64 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 1, locale63);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat65 = org.apache.commons.lang.time.FastDateFormat.getInstance("hi!", timeZone12, locale63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
// flaky:         org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(timeZone23);
// flaky:         org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(timeZone43);
// flaky:         org.junit.Assert.assertEquals(timeZone43.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(timeZone48);
// flaky:         org.junit.Assert.assertEquals(timeZone48.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat52);
        org.junit.Assert.assertNotNull(fastDateFormat53);
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat55);
        org.junit.Assert.assertNotNull(fastDateFormat56);
        org.junit.Assert.assertNotNull(fastDateFormat62);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat64);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone7);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone7);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone7);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone7);
        java.util.TimeZone timeZone14 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone19 = fastDateFormat18.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone19);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone23 = fastDateFormat22.getTimeZone();
        java.util.Locale locale24 = fastDateFormat22.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone19, locale24);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(2, (int) (short) 1, timeZone14, locale24);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang.time.FastDateFormat.getInstance("MMMM d, yyyy h:mm:ss a z", timeZone7, locale24);
        java.util.TimeZone timeZone28 = fastDateFormat27.getTimeZone();
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
// flaky:         org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(timeZone19);
// flaky:         org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(timeZone23);
// flaky:         org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(timeZone28);
// flaky:         org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "Central European Time");
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        java.util.TimeZone timeZone2 = null;
        java.util.TimeZone timeZone5 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone10 = fastDateFormat9.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone10);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone14 = fastDateFormat13.getTimeZone();
        java.util.Locale locale15 = fastDateFormat13.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone10, locale15);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(2, (int) (short) 1, timeZone5, locale15);
        java.lang.Object obj18 = fastDateFormat17.clone();
        java.util.Locale locale19 = fastDateFormat17.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 0, (int) (short) 1, timeZone2, locale19);
        boolean boolean21 = fastDateFormat20.getTimeZoneOverridesCalendar();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = fastDateFormat20.parseObject("EEEE, MMMM d, yyyy");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
// flaky:         org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(timeZone14);
// flaky:         org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(obj18);
// flaky:         org.junit.Assert.assertEquals(obj18.toString(), "FastDateFormat[MMM d, yyyy h:mm:ss a z]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "FastDateFormat[MMM d, yyyy h:mm:ss a z]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "FastDateFormat[MMM d, yyyy h:mm:ss a z]");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone7);
        java.util.TimeZone timeZone12 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone12, locale13);
        java.util.Locale locale15 = fastDateFormat14.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 1, locale15);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getInstance("M/d/yy", timeZone7, locale15);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2, locale15);
        java.util.TimeZone timeZone23 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone28 = fastDateFormat27.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone28);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone32 = fastDateFormat31.getTimeZone();
        java.util.Locale locale33 = fastDateFormat31.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone28, locale33);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(2, (int) (short) 1, timeZone23, locale33);
        java.lang.String str36 = fastDateFormat35.toString();
        java.util.Locale locale37 = fastDateFormat35.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, locale37);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", locale37);
        boolean boolean40 = fastDateFormat18.equals((java.lang.Object) locale37);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(14, (-1), locale37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
// flaky:         org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(timeZone28);
// flaky:         org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(timeZone32);
// flaky:         org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(fastDateFormat35);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "FastDateFormat[MMM d, yyyy h:mm:ss a z]" + "'", str36, "FastDateFormat[MMM d, yyyy h:mm:ss a z]");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone6);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone10 = fastDateFormat9.getTimeZone();
        java.util.Locale locale11 = fastDateFormat9.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone6, locale11);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone22 = fastDateFormat21.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone22);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone22);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone22);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone32 = fastDateFormat31.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone32);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone36 = fastDateFormat35.getTimeZone();
        java.util.Locale locale37 = fastDateFormat35.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone32, locale37);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone41 = fastDateFormat40.getTimeZone();
        java.util.Locale locale42 = fastDateFormat40.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone32, locale42);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone48 = fastDateFormat47.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone48);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat51 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone52 = fastDateFormat51.getTimeZone();
        java.util.Locale locale53 = fastDateFormat51.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat54 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone48, locale53);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat55 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone32, locale53);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone22, locale53);
        java.util.TimeZone timeZone60 = null;
        java.util.Locale locale61 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat62 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone60, locale61);
        java.util.Locale locale63 = fastDateFormat62.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat64 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale63);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat65 = org.apache.commons.lang.time.FastDateFormat.getInstance("MMMM d, yyyy h:mm:ss a z", locale63);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat66 = org.apache.commons.lang.time.FastDateFormat.getInstance("M/d/yy", timeZone22, locale63);
        java.util.TimeZone timeZone67 = fastDateFormat66.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat68 = org.apache.commons.lang.time.FastDateFormat.getInstance("1/1/70", timeZone67);
        java.util.TimeZone timeZone69 = fastDateFormat68.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat72 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone73 = fastDateFormat72.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat74 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone73);
        java.util.Locale locale75 = fastDateFormat74.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat76 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone69, locale75);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat77 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (byte) 0, timeZone6, locale75);
        java.util.Date date78 = null;
        java.lang.StringBuffer stringBuffer79 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer80 = fastDateFormat77.format(date78, stringBuffer79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
// flaky:         org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
// flaky:         org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(timeZone22);
// flaky:         org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(timeZone32);
// flaky:         org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(timeZone36);
// flaky:         org.junit.Assert.assertEquals(timeZone36.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(timeZone41);
// flaky:         org.junit.Assert.assertEquals(timeZone41.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(timeZone48);
// flaky:         org.junit.Assert.assertEquals(timeZone48.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNotNull(fastDateFormat51);
        org.junit.Assert.assertNotNull(timeZone52);
// flaky:         org.junit.Assert.assertEquals(timeZone52.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat54);
        org.junit.Assert.assertNotNull(fastDateFormat55);
        org.junit.Assert.assertNotNull(fastDateFormat56);
        org.junit.Assert.assertNotNull(fastDateFormat62);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat64);
        org.junit.Assert.assertNotNull(fastDateFormat65);
        org.junit.Assert.assertNotNull(fastDateFormat66);
        org.junit.Assert.assertNotNull(timeZone67);
// flaky:         org.junit.Assert.assertEquals(timeZone67.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat68);
        org.junit.Assert.assertNotNull(timeZone69);
// flaky:         org.junit.Assert.assertEquals(timeZone69.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat72);
        org.junit.Assert.assertNotNull(timeZone73);
// flaky:         org.junit.Assert.assertEquals(timeZone73.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat74);
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat76);
        org.junit.Assert.assertNotNull(fastDateFormat77);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone5);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone9 = fastDateFormat8.getTimeZone();
        java.util.Locale locale10 = fastDateFormat8.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone5, locale10);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, locale10);
        java.util.Locale locale13 = fastDateFormat12.getLocale();
        java.util.TimeZone timeZone14 = fastDateFormat12.getTimeZone();
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
// flaky:         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(timeZone14);
// flaky:         org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Central European Time");
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1);
        boolean boolean4 = fastDateFormat2.equals((java.lang.Object) (byte) 100);
        java.util.Locale locale5 = fastDateFormat2.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getInstance("M/d/yy h:mm a", locale5);
        java.util.TimeZone timeZone8 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone8, locale9);
        int int11 = fastDateFormat10.getMaxLengthEstimate();
        java.util.Locale locale12 = fastDateFormat10.getLocale();
        java.lang.Class<?> wildcardClass13 = locale12.getClass();
        boolean boolean14 = fastDateFormat6.equals((java.lang.Object) locale12);
        java.lang.Object obj15 = fastDateFormat6.clone();
        int int16 = fastDateFormat6.getMaxLengthEstimate();
        boolean boolean17 = fastDateFormat6.getTimeZoneOverridesCalendar();
        java.util.Locale locale18 = fastDateFormat6.getLocale();
        java.lang.Class<?> wildcardClass19 = fastDateFormat6.getClass();
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "FastDateFormat[M/d/yy h:mm a]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "FastDateFormat[M/d/yy h:mm a]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "FastDateFormat[M/d/yy h:mm a]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 21 + "'", int16 == 21);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone9 = fastDateFormat8.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone9);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone9);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone9);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone19 = fastDateFormat18.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone19);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone23 = fastDateFormat22.getTimeZone();
        java.util.Locale locale24 = fastDateFormat22.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone19, locale24);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone28 = fastDateFormat27.getTimeZone();
        java.util.Locale locale29 = fastDateFormat27.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone19, locale29);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone35 = fastDateFormat34.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone35);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone39 = fastDateFormat38.getTimeZone();
        java.util.Locale locale40 = fastDateFormat38.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone35, locale40);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone19, locale40);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone9, locale40);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone48 = fastDateFormat47.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone48);
        java.util.TimeZone timeZone51 = null;
        java.util.Locale locale52 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone51, locale52);
        java.util.Locale locale54 = fastDateFormat53.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat55 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone48, locale54);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 1, timeZone9, locale54);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat64 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone65 = fastDateFormat64.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat66 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone65);
        java.util.TimeZone timeZone68 = null;
        java.util.Locale locale69 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat70 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone68, locale69);
        java.util.Locale locale71 = fastDateFormat70.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat72 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone65, locale71);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat73 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, locale71);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat74 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, locale71);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat75 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale71);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat76 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, locale71);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat77 = org.apache.commons.lang.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone9, locale71);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat78 = org.apache.commons.lang.time.FastDateFormat.getInstance("M/d/yy", locale71);
        java.lang.String str79 = fastDateFormat78.getPattern();
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
// flaky:         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(timeZone19);
// flaky:         org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(timeZone23);
// flaky:         org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(timeZone28);
// flaky:         org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(timeZone35);
// flaky:         org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(timeZone39);
// flaky:         org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(timeZone48);
// flaky:         org.junit.Assert.assertEquals(timeZone48.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNotNull(fastDateFormat53);
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat55);
        org.junit.Assert.assertNotNull(fastDateFormat56);
        org.junit.Assert.assertNotNull(fastDateFormat64);
        org.junit.Assert.assertNotNull(timeZone65);
// flaky:         org.junit.Assert.assertEquals(timeZone65.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat66);
        org.junit.Assert.assertNotNull(fastDateFormat70);
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat72);
        org.junit.Assert.assertNotNull(fastDateFormat73);
        org.junit.Assert.assertNotNull(fastDateFormat74);
        org.junit.Assert.assertNotNull(fastDateFormat75);
        org.junit.Assert.assertNotNull(fastDateFormat76);
        org.junit.Assert.assertNotNull(fastDateFormat77);
        org.junit.Assert.assertNotNull(fastDateFormat78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "M/d/yy" + "'", str79, "M/d/yy");
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.lang.String str5 = fastDateFormat4.getPattern();
        java.util.TimeZone timeZone6 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(2, timeZone6);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 1, timeZone6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(100, timeZone6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "M/d/yy h:mm a" + "'", str5, "M/d/yy h:mm a");
        org.junit.Assert.assertNotNull(timeZone6);
// flaky:         org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(fastDateFormat8);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 10);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone14 = fastDateFormat13.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone14);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone14);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone14);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone24 = fastDateFormat23.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone24);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone28 = fastDateFormat27.getTimeZone();
        java.util.Locale locale29 = fastDateFormat27.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone24, locale29);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone33 = fastDateFormat32.getTimeZone();
        java.util.Locale locale34 = fastDateFormat32.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone24, locale34);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone40 = fastDateFormat39.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone40);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone44 = fastDateFormat43.getTimeZone();
        java.util.Locale locale45 = fastDateFormat43.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone40, locale45);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone24, locale45);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone14, locale45);
        java.util.TimeZone timeZone52 = null;
        java.util.Locale locale53 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat54 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone52, locale53);
        java.util.Locale locale55 = fastDateFormat54.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale55);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat57 = org.apache.commons.lang.time.FastDateFormat.getInstance("MMMM d, yyyy h:mm:ss a z", locale55);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat58 = org.apache.commons.lang.time.FastDateFormat.getInstance("M/d/yy", timeZone14, locale55);
        java.util.TimeZone timeZone59 = fastDateFormat58.getTimeZone();
        java.util.TimeZone timeZone61 = null;
        java.util.Locale locale62 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat63 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone61, locale62);
        int int64 = fastDateFormat63.getMaxLengthEstimate();
        java.util.Locale locale65 = fastDateFormat63.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat66 = org.apache.commons.lang.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy h:mm:ss a z", timeZone59, locale65);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat67 = org.apache.commons.lang.time.FastDateFormat.getInstance("h:mm:ss a", timeZone5, locale65);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat68 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1, locale65);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat69 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, locale65);
        java.util.TimeZone timeZone70 = fastDateFormat69.getTimeZone();
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(timeZone14);
// flaky:         org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(timeZone24);
// flaky:         org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(timeZone28);
// flaky:         org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(timeZone33);
// flaky:         org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(timeZone40);
// flaky:         org.junit.Assert.assertEquals(timeZone40.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(timeZone44);
// flaky:         org.junit.Assert.assertEquals(timeZone44.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertNotNull(fastDateFormat54);
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat56);
        org.junit.Assert.assertNotNull(fastDateFormat57);
        org.junit.Assert.assertNotNull(fastDateFormat58);
        org.junit.Assert.assertNotNull(timeZone59);
// flaky:         org.junit.Assert.assertEquals(timeZone59.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 10 + "'", int64 == 10);
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat66);
        org.junit.Assert.assertNotNull(fastDateFormat67);
        org.junit.Assert.assertNotNull(fastDateFormat68);
        org.junit.Assert.assertNotNull(fastDateFormat69);
        org.junit.Assert.assertNotNull(timeZone70);
// flaky:         org.junit.Assert.assertEquals(timeZone70.getDisplayName(), "Central European Time");
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone8);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone8);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone8);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone18 = fastDateFormat17.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone18);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone22 = fastDateFormat21.getTimeZone();
        java.util.Locale locale23 = fastDateFormat21.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone18, locale23);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone27 = fastDateFormat26.getTimeZone();
        java.util.Locale locale28 = fastDateFormat26.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone18, locale28);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone34 = fastDateFormat33.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone34);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone38 = fastDateFormat37.getTimeZone();
        java.util.Locale locale39 = fastDateFormat37.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone34, locale39);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone18, locale39);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone8, locale39);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1);
        boolean boolean46 = fastDateFormat44.equals((java.lang.Object) (byte) 100);
        java.util.Locale locale47 = fastDateFormat44.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang.time.FastDateFormat.getInstance("MMMM d, yyyy h:mm:ss a z", timeZone8, locale47);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang.time.FastDateFormat.getInstance("FastDateFormat[M/d/yy h:mm a]", locale47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky:         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(timeZone18);
// flaky:         org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(timeZone22);
// flaky:         org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(timeZone27);
// flaky:         org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(timeZone34);
// flaky:         org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(timeZone38);
// flaky:         org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat48);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone8);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone8);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 0, (int) (short) 1, timeZone8);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1);
        boolean boolean15 = fastDateFormat13.equals((java.lang.Object) (byte) 100);
        java.util.Locale locale16 = fastDateFormat13.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getInstance("M/d/yy", timeZone8, locale16);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone24 = fastDateFormat23.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone24);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone28 = fastDateFormat27.getTimeZone();
        java.util.Locale locale29 = fastDateFormat27.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone24, locale29);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone33 = fastDateFormat32.getTimeZone();
        java.util.Locale locale34 = fastDateFormat32.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone24, locale34);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone40 = fastDateFormat39.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone40);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone44 = fastDateFormat43.getTimeZone();
        java.util.Locale locale45 = fastDateFormat43.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone40, locale45);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone24, locale45);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 1, timeZone8, locale45);
        java.text.ParsePosition parsePosition50 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj51 = fastDateFormat48.parseObject("FastDateFormat[MMM d, yyyy]", parsePosition50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky:         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(timeZone24);
// flaky:         org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(timeZone28);
// flaky:         org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(timeZone33);
// flaky:         org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(timeZone40);
// flaky:         org.junit.Assert.assertEquals(timeZone40.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(timeZone44);
// flaky:         org.junit.Assert.assertEquals(timeZone44.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(fastDateFormat48);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.util.TimeZone timeZone5 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(2, timeZone5);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone15 = fastDateFormat14.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone15);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone15);
        java.util.Locale locale18 = fastDateFormat17.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 1, locale18);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(3, 0, locale18);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, locale18);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 100, timeZone5, locale18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "M/d/yy h:mm a" + "'", str4, "M/d/yy h:mm a");
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(timeZone15);
// flaky:         org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat21);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone8);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone13 = fastDateFormat12.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone13);
        java.util.Locale locale15 = fastDateFormat14.getLocale();
        java.util.Locale locale16 = fastDateFormat14.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(1, timeZone8, locale16);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone8);
        java.util.Locale locale19 = fastDateFormat18.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, locale19);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(45, 50, locale19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 50");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky:         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat20);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang.time.FastDateFormat.getInstance("M/d/yy", timeZone4);
        java.util.Locale locale6 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 1, timeZone4, locale6);
        java.lang.Class<?> wildcardClass8 = fastDateFormat7.getClass();
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertNotNull(timeZone4);
// flaky:         org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone8);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone13 = fastDateFormat12.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone13);
        java.util.Locale locale15 = fastDateFormat14.getLocale();
        java.util.Locale locale16 = fastDateFormat14.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(1, timeZone8, locale16);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone8);
        java.util.TimeZone timeZone19 = fastDateFormat18.getTimeZone();
        java.util.TimeZone timeZone23 = null;
        java.util.Locale locale24 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone23, locale24);
        int int26 = fastDateFormat25.getMaxLengthEstimate();
        java.util.Locale locale27 = fastDateFormat25.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale27);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, locale27);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(1, 0, timeZone19, locale27);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang.time.FastDateFormat.getInstance("h:mm:ss a", timeZone19);
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky:         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(timeZone19);
// flaky:         org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(fastDateFormat31);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone4);
        java.util.TimeZone timeZone9 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone9, locale10);
        java.util.Locale locale12 = fastDateFormat11.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 1, locale12);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getInstance("M/d/yy", timeZone4, locale12);
        java.lang.Object obj15 = fastDateFormat14.clone();
        java.util.Locale locale16 = fastDateFormat14.getLocale();
        int int17 = fastDateFormat14.getMaxLengthEstimate();
        java.lang.String str18 = fastDateFormat14.toString();
        java.util.Calendar calendar19 = null;
        java.lang.StringBuffer stringBuffer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer21 = fastDateFormat14.format(calendar19, stringBuffer20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertNotNull(timeZone4);
// flaky:         org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "FastDateFormat[M/d/yy]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "FastDateFormat[M/d/yy]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "FastDateFormat[M/d/yy]");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "FastDateFormat[M/d/yy]" + "'", str18, "FastDateFormat[M/d/yy]");
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone2 = fastDateFormat1.getTimeZone();
        java.util.Locale locale3 = fastDateFormat1.getLocale();
        int int4 = fastDateFormat1.getMaxLengthEstimate();
        java.lang.String str5 = fastDateFormat1.toString();
        java.lang.String str7 = fastDateFormat1.format((long) ' ');
        java.util.Date date8 = null;
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer10 = fastDateFormat1.format(date8, stringBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertNotNull(timeZone2);
// flaky:         org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FastDateFormat[M/d/yy h:mm a]" + "'", str5, "FastDateFormat[M/d/yy h:mm a]");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1/1/70 1:00 AM" + "'", str7, "1/1/70 1:00 AM");
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1);
        boolean boolean8 = fastDateFormat6.equals((java.lang.Object) (byte) 100);
        java.util.Locale locale9 = fastDateFormat6.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getInstance("M/d/yy h:mm a", locale9);
        boolean boolean11 = fastDateFormat10.getTimeZoneOverridesCalendar();
        int int12 = fastDateFormat10.getMaxLengthEstimate();
        java.util.TimeZone timeZone13 = fastDateFormat10.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, 0, timeZone13);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 0);
        int int20 = fastDateFormat19.getMaxLengthEstimate();
        java.lang.String str22 = fastDateFormat19.format((long) (byte) 1);
        java.util.TimeZone timeZone23 = fastDateFormat19.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone30 = fastDateFormat29.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone30);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone30);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone30);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone40 = fastDateFormat39.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone40);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone44 = fastDateFormat43.getTimeZone();
        java.util.Locale locale45 = fastDateFormat43.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone40, locale45);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone49 = fastDateFormat48.getTimeZone();
        java.util.Locale locale50 = fastDateFormat48.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat51 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone40, locale50);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat55 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone56 = fastDateFormat55.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat57 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone56);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone60 = fastDateFormat59.getTimeZone();
        java.util.Locale locale61 = fastDateFormat59.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat62 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone56, locale61);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat63 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone40, locale61);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat64 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone30, locale61);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat65 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone23, locale61);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat66 = org.apache.commons.lang.time.FastDateFormat.getInstance("M/d/yy", timeZone23);
        java.lang.String str67 = fastDateFormat66.toString();
        java.util.Locale locale68 = fastDateFormat66.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat69 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(3, (int) 'a', timeZone13, locale68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 21 + "'", int12 == 21);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat19);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 50 + "'", int20 == 50);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Thursday, January 1, 1970 1:00:00 AM CET" + "'", str22, "Thursday, January 1, 1970 1:00:00 AM CET");
        org.junit.Assert.assertNotNull(timeZone23);
// flaky:         org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(timeZone30);
// flaky:         org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(timeZone40);
// flaky:         org.junit.Assert.assertEquals(timeZone40.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(timeZone44);
// flaky:         org.junit.Assert.assertEquals(timeZone44.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertNotNull(timeZone49);
// flaky:         org.junit.Assert.assertEquals(timeZone49.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat51);
        org.junit.Assert.assertNotNull(fastDateFormat55);
        org.junit.Assert.assertNotNull(timeZone56);
// flaky:         org.junit.Assert.assertEquals(timeZone56.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat57);
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertNotNull(timeZone60);
// flaky:         org.junit.Assert.assertEquals(timeZone60.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat62);
        org.junit.Assert.assertNotNull(fastDateFormat63);
        org.junit.Assert.assertNotNull(fastDateFormat64);
        org.junit.Assert.assertNotNull(fastDateFormat65);
        org.junit.Assert.assertNotNull(fastDateFormat66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "FastDateFormat[M/d/yy]" + "'", str67, "FastDateFormat[M/d/yy]");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "en_US");
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone10 = fastDateFormat9.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone10);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone10);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone10);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone10);
        java.util.TimeZone timeZone15 = fastDateFormat14.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone15);
        java.util.TimeZone timeZone17 = fastDateFormat16.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone22 = fastDateFormat21.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone22);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone30 = fastDateFormat29.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone30);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone35 = fastDateFormat34.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone35);
        java.util.Locale locale37 = fastDateFormat36.getLocale();
        java.util.Locale locale38 = fastDateFormat36.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone30, locale38);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone45 = fastDateFormat44.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone45);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone49 = fastDateFormat48.getTimeZone();
        java.util.Locale locale50 = fastDateFormat48.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat51 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone45, locale50);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone54 = fastDateFormat53.getTimeZone();
        java.util.Locale locale55 = fastDateFormat53.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone45, locale55);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat57 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (byte) 1, timeZone30, locale55);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat58 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(2, timeZone22, locale55);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone17, locale55);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat62 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, 2);
        java.util.Locale locale63 = fastDateFormat62.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat64 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 10, 45, timeZone17, locale63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 45");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
// flaky:         org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(timeZone15);
// flaky:         org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(timeZone17);
// flaky:         org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(timeZone22);
// flaky:         org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(timeZone30);
// flaky:         org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(timeZone35);
// flaky:         org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(timeZone45);
// flaky:         org.junit.Assert.assertEquals(timeZone45.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertNotNull(timeZone49);
// flaky:         org.junit.Assert.assertEquals(timeZone49.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat51);
        org.junit.Assert.assertNotNull(fastDateFormat53);
        org.junit.Assert.assertNotNull(timeZone54);
// flaky:         org.junit.Assert.assertEquals(timeZone54.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat56);
        org.junit.Assert.assertNotNull(fastDateFormat57);
        org.junit.Assert.assertNotNull(fastDateFormat58);
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertNotNull(fastDateFormat62);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "en_US");
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 0);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone8);
        java.util.TimeZone timeZone11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone11, locale12);
        java.util.Locale locale14 = fastDateFormat13.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone8, locale14);
        boolean boolean16 = fastDateFormat3.equals((java.lang.Object) timeZone8);
        java.util.Locale locale17 = fastDateFormat3.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, locale17);
        java.lang.String str20 = fastDateFormat18.format((long) (short) 10);
        java.util.Locale locale21 = fastDateFormat18.getLocale();
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky:         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat18);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Thursday, January 1, 1970" + "'", str20, "Thursday, January 1, 1970");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_US");
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0);
        java.lang.Object obj2 = fastDateFormat1.clone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 0);
        int int6 = fastDateFormat5.getMaxLengthEstimate();
        boolean boolean7 = fastDateFormat1.equals((java.lang.Object) fastDateFormat5);
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer10 = fastDateFormat5.format((long) (short) -1, stringBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertNotNull(obj2);
// flaky:         org.junit.Assert.assertEquals(obj2.toString(), "FastDateFormat[h:mm:ss a z]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "FastDateFormat[h:mm:ss a z]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertNotNull(fastDateFormat5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone6);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone11 = fastDateFormat10.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone11);
        java.util.Locale locale13 = fastDateFormat12.getLocale();
        java.util.Locale locale14 = fastDateFormat12.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone6, locale14);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone21 = fastDateFormat20.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone21);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone25 = fastDateFormat24.getTimeZone();
        java.util.Locale locale26 = fastDateFormat24.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone21, locale26);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone30 = fastDateFormat29.getTimeZone();
        java.util.Locale locale31 = fastDateFormat29.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone21, locale31);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (byte) 1, timeZone6, locale31);
        int int34 = fastDateFormat33.getMaxLengthEstimate();
        boolean boolean35 = fastDateFormat33.getTimeZoneOverridesCalendar();
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
// flaky:         org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(timeZone11);
// flaky:         org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(timeZone21);
// flaky:         org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(timeZone25);
// flaky:         org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(timeZone30);
// flaky:         org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(fastDateFormat33);
// flaky:         org.junit.Assert.assertTrue("'" + int34 + "' != '" + 50 + "'", int34 == 50);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.util.TimeZone timeZone5 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(2, timeZone5);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 1, timeZone5);
        java.lang.Object obj8 = null;
        boolean boolean9 = fastDateFormat7.equals(obj8);
        org.junit.Assert.assertNotNull(fastDateFormat3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "M/d/yy h:mm a" + "'", str4, "M/d/yy h:mm a");
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone9 = fastDateFormat8.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone9);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone9);
        java.util.Locale locale12 = fastDateFormat11.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 1, locale12);
        java.util.Locale locale14 = fastDateFormat13.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(1, locale14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) ' ', 50, timeZone2, locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 50");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
// flaky:         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat15);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getInstance("h:mm a");
        java.util.Locale locale3 = fastDateFormat2.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(100, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        java.util.TimeZone timeZone5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone5, locale6);
        int int8 = fastDateFormat7.getMaxLengthEstimate();
        java.util.Locale locale9 = fastDateFormat7.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale9);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, locale9);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 1, locale9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(25, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 25");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat12);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        java.util.TimeZone timeZone5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone5, locale6);
        java.util.Locale locale8 = fastDateFormat7.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 1, locale8);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(1, locale8);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 2, locale8);
        java.util.TimeZone timeZone12 = fastDateFormat11.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1);
        boolean boolean15 = fastDateFormat14.getTimeZoneOverridesCalendar();
        java.lang.String str17 = fastDateFormat14.format(10L);
        boolean boolean18 = fastDateFormat11.equals((java.lang.Object) fastDateFormat14);
        java.lang.String str19 = fastDateFormat14.getPattern();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone28 = fastDateFormat27.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone28);
        java.util.TimeZone timeZone31 = null;
        java.util.Locale locale32 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone31, locale32);
        java.util.Locale locale34 = fastDateFormat33.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone28, locale34);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, locale34);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, locale34);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale34);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale34);
        java.util.Locale locale40 = fastDateFormat39.getLocale();
        java.util.Calendar calendar41 = null;
        java.lang.StringBuffer stringBuffer42 = null;
        java.lang.StringBuffer stringBuffer43 = fastDateFormat39.format(calendar41, stringBuffer42);
        java.lang.StringBuffer stringBuffer45 = null;
        java.lang.StringBuffer stringBuffer46 = fastDateFormat39.format((long) (byte) -1, stringBuffer45);
        boolean boolean47 = fastDateFormat14.equals((java.lang.Object) fastDateFormat39);
        int int48 = fastDateFormat14.getMaxLengthEstimate();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat52 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 0);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone57 = fastDateFormat56.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat58 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone57);
        java.util.TimeZone timeZone60 = null;
        java.util.Locale locale61 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat62 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone60, locale61);
        java.util.Locale locale63 = fastDateFormat62.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat64 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone57, locale63);
        boolean boolean65 = fastDateFormat52.equals((java.lang.Object) timeZone57);
        java.util.Locale locale66 = fastDateFormat52.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat67 = org.apache.commons.lang.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy h:mm:ss a z", locale66);
        java.lang.Object obj68 = fastDateFormat67.clone();
        java.lang.Object obj69 = fastDateFormat67.clone();
        java.util.Locale locale70 = fastDateFormat67.getLocale();
        java.lang.StringBuffer stringBuffer71 = null;
        java.text.FieldPosition fieldPosition72 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer73 = fastDateFormat14.format((java.lang.Object) locale70, stringBuffer71, fieldPosition72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.util.Locale");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
// flaky:         org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1:00:00 AM CET" + "'", str17, "1:00:00 AM CET");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h:mm:ss a z" + "'", str19, "h:mm:ss a z");
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(timeZone28);
// flaky:         org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "en_US");
        org.junit.Assert.assertNull(stringBuffer43);
        org.junit.Assert.assertNull(stringBuffer46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 18 + "'", int48 == 18);
        org.junit.Assert.assertNotNull(fastDateFormat52);
        org.junit.Assert.assertNotNull(fastDateFormat56);
        org.junit.Assert.assertNotNull(timeZone57);
// flaky:         org.junit.Assert.assertEquals(timeZone57.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat58);
        org.junit.Assert.assertNotNull(fastDateFormat62);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat67);
        org.junit.Assert.assertNotNull(obj68);
        org.junit.Assert.assertEquals(obj68.toString(), "FastDateFormat[EEEE, MMMM d, yyyy h:mm:ss a z]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj68), "FastDateFormat[EEEE, MMMM d, yyyy h:mm:ss a z]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj68), "FastDateFormat[EEEE, MMMM d, yyyy h:mm:ss a z]");
        org.junit.Assert.assertNotNull(obj69);
        org.junit.Assert.assertEquals(obj69.toString(), "FastDateFormat[EEEE, MMMM d, yyyy h:mm:ss a z]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj69), "FastDateFormat[EEEE, MMMM d, yyyy h:mm:ss a z]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj69), "FastDateFormat[EEEE, MMMM d, yyyy h:mm:ss a z]");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "en_US");
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone3);
        java.lang.String str6 = fastDateFormat4.format(10L);
        java.lang.String str7 = fastDateFormat4.getPattern();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone16 = fastDateFormat15.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone16);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone16);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone16);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone26 = fastDateFormat25.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone26);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone30 = fastDateFormat29.getTimeZone();
        java.util.Locale locale31 = fastDateFormat29.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone26, locale31);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone35 = fastDateFormat34.getTimeZone();
        java.util.Locale locale36 = fastDateFormat34.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone26, locale36);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone42 = fastDateFormat41.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone42);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone46 = fastDateFormat45.getTimeZone();
        java.util.Locale locale47 = fastDateFormat45.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone42, locale47);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone26, locale47);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone16, locale47);
        java.util.TimeZone timeZone54 = null;
        java.util.Locale locale55 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone54, locale55);
        java.util.Locale locale57 = fastDateFormat56.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat58 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale57);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang.time.FastDateFormat.getInstance("MMMM d, yyyy h:mm:ss a z", locale57);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat60 = org.apache.commons.lang.time.FastDateFormat.getInstance("M/d/yy", timeZone16, locale57);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat61 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone16);
        java.lang.StringBuffer stringBuffer62 = null;
        java.text.FieldPosition fieldPosition63 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer64 = fastDateFormat4.format((java.lang.Object) fastDateFormat61, stringBuffer62, fieldPosition63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: org.apache.commons.lang.time.FastDateFormat");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertNotNull(timeZone3);
// flaky:         org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat4);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Thursday, January 1, 1970" + "'", str6, "Thursday, January 1, 1970");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str7, "EEEE, MMMM d, yyyy");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(timeZone16);
// flaky:         org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(timeZone26);
// flaky:         org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(timeZone30);
// flaky:         org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(timeZone35);
// flaky:         org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(timeZone42);
// flaky:         org.junit.Assert.assertEquals(timeZone42.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(timeZone46);
// flaky:         org.junit.Assert.assertEquals(timeZone46.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertNotNull(fastDateFormat56);
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat58);
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertNotNull(fastDateFormat60);
        org.junit.Assert.assertNotNull(fastDateFormat61);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone2, locale3);
        java.util.Locale locale5 = fastDateFormat4.getLocale();
        java.lang.String str6 = fastDateFormat4.getPattern();
        boolean boolean8 = fastDateFormat4.equals((java.lang.Object) (-1L));
        java.lang.Object obj9 = fastDateFormat4.clone();
        java.util.TimeZone timeZone10 = fastDateFormat4.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getInstance("Thursday, January 1, 1970 12:59:59 AM CET", timeZone10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "M/d/yy" + "'", str6, "M/d/yy");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "FastDateFormat[M/d/yy]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "FastDateFormat[M/d/yy]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "FastDateFormat[M/d/yy]");
        org.junit.Assert.assertNotNull(timeZone10);
// flaky:         org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Central European Time");
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone7);
        java.util.TimeZone timeZone10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone10, locale11);
        java.util.Locale locale13 = fastDateFormat12.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone7, locale13);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, locale13);
        java.util.TimeZone timeZone16 = fastDateFormat15.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone16);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone16);
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
// flaky:         org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(timeZone16);
// flaky:         org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat18);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone3);
        boolean boolean5 = fastDateFormat4.getTimeZoneOverridesCalendar();
        int int6 = fastDateFormat4.getMaxLengthEstimate();
        java.util.Calendar calendar7 = null;
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer9 = fastDateFormat4.format(calendar7, stringBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertNotNull(timeZone3);
// flaky:         org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone4);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone4);
        java.lang.Object obj7 = fastDateFormat6.clone();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertNotNull(timeZone4);
// flaky:         org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "FastDateFormat[]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 0);
        java.lang.String str5 = fastDateFormat3.format(100L);
        java.util.Locale locale6 = fastDateFormat3.getLocale();
        int int7 = fastDateFormat3.getMaxLengthEstimate();
        java.util.Locale locale8 = fastDateFormat3.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getInstance("12:59:59 AM CET", locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: A");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat3);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Thursday, January 1, 1970 1:00:00 AM CET" + "'", str5, "Thursday, January 1, 1970 1:00:00 AM CET");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 50 + "'", int7 == 50);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone7);
        java.util.TimeZone timeZone10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone10, locale11);
        int int13 = fastDateFormat12.getMaxLengthEstimate();
        java.util.Locale locale14 = fastDateFormat12.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone7, locale14);
        java.lang.String str16 = fastDateFormat15.getPattern();
        java.util.TimeZone timeZone17 = fastDateFormat15.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getInstance("MMM d, yyyy", timeZone17);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getInstance("h:mm:ss a z", timeZone17);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 1, timeZone17);
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
// flaky:         org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str16, "EEEE, MMMM d, yyyy");
        org.junit.Assert.assertNotNull(timeZone17);
// flaky:         org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(fastDateFormat20);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone5);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone10 = fastDateFormat9.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone10);
        java.util.Locale locale12 = fastDateFormat11.getLocale();
        java.util.Locale locale13 = fastDateFormat11.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(1, timeZone5, locale13);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getInstance("M/d/yy", timeZone5);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 0);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone24 = fastDateFormat23.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone24);
        java.util.TimeZone timeZone27 = null;
        java.util.Locale locale28 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone27, locale28);
        java.util.Locale locale30 = fastDateFormat29.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone24, locale30);
        boolean boolean32 = fastDateFormat19.equals((java.lang.Object) timeZone24);
        java.util.TimeZone timeZone35 = null;
        java.util.Locale locale36 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone35, locale36);
        java.util.Locale locale38 = fastDateFormat37.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 1, locale38);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone24, locale38);
        java.util.Locale locale41 = fastDateFormat40.getLocale();
        java.util.Locale locale42 = fastDateFormat40.getLocale();
        java.util.TimeZone timeZone46 = null;
        java.util.Locale locale47 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone46, locale47);
        java.util.Locale locale49 = fastDateFormat48.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 1, locale49);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat51 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(1, locale49);
        java.lang.Object obj52 = fastDateFormat51.clone();
        boolean boolean54 = fastDateFormat51.equals((java.lang.Object) "Jan 1, 1970 1:00:00 AM CET");
        boolean boolean55 = fastDateFormat40.equals((java.lang.Object) "Jan 1, 1970 1:00:00 AM CET");
        boolean boolean56 = fastDateFormat15.equals((java.lang.Object) boolean55);
        java.lang.String str57 = fastDateFormat15.getPattern();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone60 = fastDateFormat59.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat64 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone65 = fastDateFormat64.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat66 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone65);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat68 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone69 = fastDateFormat68.getTimeZone();
        java.util.Locale locale70 = fastDateFormat68.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat71 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone65, locale70);
        boolean boolean72 = fastDateFormat71.getTimeZoneOverridesCalendar();
        java.lang.Class<?> wildcardClass73 = fastDateFormat71.getClass();
        boolean boolean74 = fastDateFormat59.equals((java.lang.Object) wildcardClass73);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator75 = fastDateFormat15.formatToCharacterIterator((java.lang.Object) boolean74);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
// flaky:         org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(timeZone24);
// flaky:         org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertNotNull(fastDateFormat51);
        org.junit.Assert.assertNotNull(obj52);
// flaky:         org.junit.Assert.assertEquals(obj52.toString(), "FastDateFormat[MMMM d, yyyy]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj52), "FastDateFormat[MMMM d, yyyy]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj52), "FastDateFormat[MMMM d, yyyy]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "M/d/yy" + "'", str57, "M/d/yy");
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertNotNull(timeZone60);
// flaky:         org.junit.Assert.assertEquals(timeZone60.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat64);
        org.junit.Assert.assertNotNull(timeZone65);
// flaky:         org.junit.Assert.assertEquals(timeZone65.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat66);
        org.junit.Assert.assertNotNull(fastDateFormat68);
        org.junit.Assert.assertNotNull(timeZone69);
// flaky:         org.junit.Assert.assertEquals(timeZone69.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone8);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone12 = fastDateFormat11.getTimeZone();
        java.util.Locale locale13 = fastDateFormat11.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone8, locale13);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, locale13);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(2, 0, locale13);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale13);
        java.util.Date date18 = null;
        java.lang.StringBuffer stringBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer20 = fastDateFormat17.format(date18, stringBuffer19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky:         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
// flaky:         org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone9 = fastDateFormat8.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone9);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone9);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 0, (int) (short) 1, timeZone9);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1);
        boolean boolean16 = fastDateFormat14.equals((java.lang.Object) (byte) 100);
        java.util.Locale locale17 = fastDateFormat14.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getInstance("M/d/yy", timeZone9, locale17);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(1, (int) (byte) 1, locale17);
        java.util.Locale locale20 = fastDateFormat19.getLocale();
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
// flaky:         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_US");
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone8);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone13 = fastDateFormat12.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone13);
        java.util.Locale locale15 = fastDateFormat14.getLocale();
        java.util.Locale locale16 = fastDateFormat14.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(1, timeZone8, locale16);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone24 = fastDateFormat23.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone24);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone24);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone24);
        java.util.Locale locale28 = fastDateFormat27.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(1, locale28);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(3, timeZone8, locale28);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang.time.FastDateFormat.getInstance("h:mm:ss a z", timeZone8);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone40 = fastDateFormat39.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone40);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone40);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone40);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone40);
        java.util.TimeZone timeZone45 = fastDateFormat44.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone45);
        java.util.TimeZone timeZone47 = fastDateFormat46.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat51 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone52 = fastDateFormat51.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone52);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone60 = fastDateFormat59.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat61 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone60);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat64 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone65 = fastDateFormat64.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat66 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone65);
        java.util.Locale locale67 = fastDateFormat66.getLocale();
        java.util.Locale locale68 = fastDateFormat66.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat69 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone60, locale68);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat74 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone75 = fastDateFormat74.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat76 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone75);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat78 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone79 = fastDateFormat78.getTimeZone();
        java.util.Locale locale80 = fastDateFormat78.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat81 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone75, locale80);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat83 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone84 = fastDateFormat83.getTimeZone();
        java.util.Locale locale85 = fastDateFormat83.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat86 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone75, locale85);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat87 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, (int) (byte) 1, timeZone60, locale85);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat88 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(2, timeZone52, locale85);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat89 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone47, locale85);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat90 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone8, locale85);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat91 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 10, timeZone8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky:         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(timeZone24);
// flaky:         org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(timeZone40);
// flaky:         org.junit.Assert.assertEquals(timeZone40.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(timeZone45);
// flaky:         org.junit.Assert.assertEquals(timeZone45.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(timeZone47);
// flaky:         org.junit.Assert.assertEquals(timeZone47.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat51);
        org.junit.Assert.assertNotNull(timeZone52);
// flaky:         org.junit.Assert.assertEquals(timeZone52.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat53);
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertNotNull(timeZone60);
// flaky:         org.junit.Assert.assertEquals(timeZone60.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat61);
        org.junit.Assert.assertNotNull(fastDateFormat64);
        org.junit.Assert.assertNotNull(timeZone65);
// flaky:         org.junit.Assert.assertEquals(timeZone65.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat66);
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat69);
        org.junit.Assert.assertNotNull(fastDateFormat74);
        org.junit.Assert.assertNotNull(timeZone75);
// flaky:         org.junit.Assert.assertEquals(timeZone75.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat76);
        org.junit.Assert.assertNotNull(fastDateFormat78);
        org.junit.Assert.assertNotNull(timeZone79);
// flaky:         org.junit.Assert.assertEquals(timeZone79.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat81);
        org.junit.Assert.assertNotNull(fastDateFormat83);
        org.junit.Assert.assertNotNull(timeZone84);
// flaky:         org.junit.Assert.assertEquals(timeZone84.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale85);
        org.junit.Assert.assertEquals(locale85.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat86);
        org.junit.Assert.assertNotNull(fastDateFormat87);
        org.junit.Assert.assertNotNull(fastDateFormat88);
        org.junit.Assert.assertNotNull(fastDateFormat89);
        org.junit.Assert.assertNotNull(fastDateFormat90);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 0);
        int int5 = fastDateFormat4.getMaxLengthEstimate();
        java.lang.String str7 = fastDateFormat4.format((long) (byte) 1);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 0);
        java.lang.String str12 = fastDateFormat10.format(100L);
        java.util.Locale locale13 = fastDateFormat10.getLocale();
        boolean boolean14 = fastDateFormat4.equals((java.lang.Object) fastDateFormat10);
        int int15 = fastDateFormat4.getMaxLengthEstimate();
        java.util.Locale locale16 = fastDateFormat4.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(3, locale16);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(10, locale16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 50 + "'", int5 == 50);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Thursday, January 1, 1970 1:00:00 AM CET" + "'", str7, "Thursday, January 1, 1970 1:00:00 AM CET");
        org.junit.Assert.assertNotNull(fastDateFormat10);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Thursday, January 1, 1970 1:00:00 AM CET" + "'", str12, "Thursday, January 1, 1970 1:00:00 AM CET");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 50 + "'", int15 == 50);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat17);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone7);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone12 = fastDateFormat11.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone12);
        java.util.Locale locale14 = fastDateFormat13.getLocale();
        java.util.Locale locale15 = fastDateFormat13.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone7, locale15);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone24 = fastDateFormat23.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone24);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone24);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone24);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone24);
        java.util.TimeZone timeZone31 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone36 = fastDateFormat35.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone36);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone40 = fastDateFormat39.getTimeZone();
        java.util.Locale locale41 = fastDateFormat39.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone36, locale41);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(2, (int) (short) 1, timeZone31, locale41);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang.time.FastDateFormat.getInstance("MMMM d, yyyy h:mm:ss a z", timeZone24, locale41);
        boolean boolean45 = fastDateFormat16.equals((java.lang.Object) timeZone24);
        java.util.TimeZone timeZone48 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone48);
        java.lang.StringBuffer stringBuffer51 = null;
        java.lang.StringBuffer stringBuffer52 = fastDateFormat49.format(100L, stringBuffer51);
        java.lang.Object obj53 = fastDateFormat49.clone();
        java.util.TimeZone timeZone54 = fastDateFormat49.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat55 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 1, timeZone54);
        java.util.TimeZone timeZone56 = fastDateFormat55.getTimeZone();
        boolean boolean57 = fastDateFormat16.equals((java.lang.Object) timeZone56);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat65 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone66 = fastDateFormat65.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat67 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone66);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat68 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 1, timeZone66);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat69 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone66);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat75 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone76 = fastDateFormat75.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat77 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone76);
        java.util.TimeZone timeZone79 = null;
        java.util.Locale locale80 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat81 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone79, locale80);
        java.util.Locale locale82 = fastDateFormat81.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat83 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone76, locale82);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat84 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, locale82);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat85 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, locale82);
        java.util.Locale locale86 = fastDateFormat85.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat87 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone66, locale86);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat88 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 1, locale86);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat89 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2, locale86);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat90 = org.apache.commons.lang.time.FastDateFormat.getInstance("M/d/yy", timeZone56, locale86);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat91 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (byte) 0, (int) (short) 0, locale86);
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
// flaky:         org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
// flaky:         org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(timeZone24);
// flaky:         org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(timeZone36);
// flaky:         org.junit.Assert.assertEquals(timeZone36.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(timeZone40);
// flaky:         org.junit.Assert.assertEquals(timeZone40.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNull(stringBuffer52);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertEquals(obj53.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj53), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj53), "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone54);
// flaky:         org.junit.Assert.assertEquals(timeZone54.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat55);
        org.junit.Assert.assertNotNull(timeZone56);
// flaky:         org.junit.Assert.assertEquals(timeZone56.getDisplayName(), "Central European Time");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(fastDateFormat65);
        org.junit.Assert.assertNotNull(timeZone66);
// flaky:         org.junit.Assert.assertEquals(timeZone66.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat67);
        org.junit.Assert.assertNotNull(fastDateFormat68);
        org.junit.Assert.assertNotNull(fastDateFormat69);
        org.junit.Assert.assertNotNull(fastDateFormat75);
        org.junit.Assert.assertNotNull(timeZone76);
// flaky:         org.junit.Assert.assertEquals(timeZone76.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat77);
        org.junit.Assert.assertNotNull(fastDateFormat81);
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat83);
        org.junit.Assert.assertNotNull(fastDateFormat84);
        org.junit.Assert.assertNotNull(fastDateFormat85);
        org.junit.Assert.assertNotNull(locale86);
        org.junit.Assert.assertEquals(locale86.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat87);
        org.junit.Assert.assertNotNull(fastDateFormat88);
        org.junit.Assert.assertNotNull(fastDateFormat89);
        org.junit.Assert.assertNotNull(fastDateFormat90);
        org.junit.Assert.assertNotNull(fastDateFormat91);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone9 = fastDateFormat8.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone9);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone9);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 0, (int) (short) 1, timeZone9);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1);
        boolean boolean16 = fastDateFormat14.equals((java.lang.Object) (byte) 100);
        java.util.Locale locale17 = fastDateFormat14.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getInstance("M/d/yy", timeZone9, locale17);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone25 = fastDateFormat24.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone25);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone29 = fastDateFormat28.getTimeZone();
        java.util.Locale locale30 = fastDateFormat28.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone25, locale30);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone34 = fastDateFormat33.getTimeZone();
        java.util.Locale locale35 = fastDateFormat33.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone25, locale35);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone41 = fastDateFormat40.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone41);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone45 = fastDateFormat44.getTimeZone();
        java.util.Locale locale46 = fastDateFormat44.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone41, locale46);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone25, locale46);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 1, timeZone9, locale46);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang.time.FastDateFormat.getInstance("Jan 1, 1970 1:00 AM", locale46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: J");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
// flaky:         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(timeZone25);
// flaky:         org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(timeZone29);
// flaky:         org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(timeZone34);
// flaky:         org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(timeZone41);
// flaky:         org.junit.Assert.assertEquals(timeZone41.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(timeZone45);
// flaky:         org.junit.Assert.assertEquals(timeZone45.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertNotNull(fastDateFormat49);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 0);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone8);
        java.util.TimeZone timeZone11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone11, locale12);
        java.util.Locale locale14 = fastDateFormat13.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone8, locale14);
        boolean boolean16 = fastDateFormat3.equals((java.lang.Object) timeZone8);
        java.util.Locale locale17 = fastDateFormat3.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getInstance("1/1/70", locale17);
        java.util.TimeZone timeZone19 = fastDateFormat18.getTimeZone();
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky:         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(timeZone19);
// flaky:         org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "Central European Time");
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) '4', 25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 25");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone5);
        java.util.TimeZone timeZone8 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone8, locale9);
        int int11 = fastDateFormat10.getMaxLengthEstimate();
        java.util.Locale locale12 = fastDateFormat10.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone5, locale12);
        java.lang.String str14 = fastDateFormat13.getPattern();
        java.util.TimeZone timeZone15 = fastDateFormat13.getTimeZone();
        java.util.TimeZone timeZone16 = fastDateFormat13.getTimeZone();
        java.util.Locale locale17 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getInstance("MMM d, yyyy h:mm a", timeZone16, locale17);
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str14, "EEEE, MMMM d, yyyy");
        org.junit.Assert.assertNotNull(timeZone15);
// flaky:         org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(timeZone16);
// flaky:         org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat18);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone4 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone4);
        java.util.TimeZone timeZone7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone7, locale8);
        int int10 = fastDateFormat9.getMaxLengthEstimate();
        java.util.Locale locale11 = fastDateFormat9.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone4, locale11);
        java.lang.String str13 = fastDateFormat12.getPattern();
        java.lang.String str15 = fastDateFormat12.format((long) ' ');
        java.util.Locale locale16 = fastDateFormat12.getLocale();
        java.util.TimeZone timeZone20 = null;
        java.util.Locale locale21 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone20, locale21);
        java.util.Locale locale23 = fastDateFormat22.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 1, locale23);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(1, locale23);
        java.lang.Object obj26 = fastDateFormat25.clone();
        java.lang.StringBuffer stringBuffer27 = null;
        java.text.FieldPosition fieldPosition28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer29 = fastDateFormat12.format((java.lang.Object) fastDateFormat25, stringBuffer27, fieldPosition28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: org.apache.commons.lang.time.FastDateFormat");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertNotNull(timeZone4);
// flaky:         org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str13, "EEEE, MMMM d, yyyy");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Thursday, January 1, 1970" + "'", str15, "Thursday, January 1, 1970");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(obj26);
// flaky:         org.junit.Assert.assertEquals(obj26.toString(), "FastDateFormat[MMMM d, yyyy]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "FastDateFormat[MMMM d, yyyy]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "FastDateFormat[MMMM d, yyyy]");
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 0);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone12 = fastDateFormat11.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone12);
        java.util.TimeZone timeZone15 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone15, locale16);
        java.util.Locale locale18 = fastDateFormat17.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone12, locale18);
        boolean boolean20 = fastDateFormat7.equals((java.lang.Object) timeZone12);
        java.util.TimeZone timeZone23 = null;
        java.util.Locale locale24 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone23, locale24);
        java.util.Locale locale26 = fastDateFormat25.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 1, locale26);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone12, locale26);
        java.util.TimeZone timeZone32 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone37 = fastDateFormat36.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone37);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone41 = fastDateFormat40.getTimeZone();
        java.util.Locale locale42 = fastDateFormat40.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone37, locale42);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(2, (int) (short) 1, timeZone32, locale42);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale42);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone12, locale42);
        java.util.TimeZone timeZone47 = fastDateFormat46.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang.time.FastDateFormat.getInstance("MMM d, yyyy h:mm:ss a z", timeZone47);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", timeZone47);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone47);
        java.text.ParsePosition parsePosition52 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj53 = fastDateFormat50.parseObject("FastDateFormat[M/d/yy h:mm a]", parsePosition52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
// flaky:         org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(timeZone37);
// flaky:         org.junit.Assert.assertEquals(timeZone37.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(timeZone41);
// flaky:         org.junit.Assert.assertEquals(timeZone41.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(timeZone47);
// flaky:         org.junit.Assert.assertEquals(timeZone47.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNotNull(fastDateFormat50);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(20, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 20");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) '#');
        java.util.TimeZone timeZone2 = fastDateFormat1.getTimeZone();
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer5 = fastDateFormat1.format((long) 20, stringBuffer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertNotNull(timeZone2);
// flaky:         org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Central European Time");
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone9 = fastDateFormat8.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone9);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone9);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone9);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone19 = fastDateFormat18.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone19);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone23 = fastDateFormat22.getTimeZone();
        java.util.Locale locale24 = fastDateFormat22.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone19, locale24);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone28 = fastDateFormat27.getTimeZone();
        java.util.Locale locale29 = fastDateFormat27.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone19, locale29);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone35 = fastDateFormat34.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone35);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone39 = fastDateFormat38.getTimeZone();
        java.util.Locale locale40 = fastDateFormat38.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone35, locale40);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone19, locale40);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone9, locale40);
        java.util.TimeZone timeZone47 = null;
        java.util.Locale locale48 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone47, locale48);
        java.util.Locale locale50 = fastDateFormat49.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat51 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale50);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat52 = org.apache.commons.lang.time.FastDateFormat.getInstance("MMMM d, yyyy h:mm:ss a z", locale50);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang.time.FastDateFormat.getInstance("M/d/yy", timeZone9, locale50);
        java.util.TimeZone timeZone54 = fastDateFormat53.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat55 = org.apache.commons.lang.time.FastDateFormat.getInstance("1/1/70", timeZone54);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone54);
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
// flaky:         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(timeZone19);
// flaky:         org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(timeZone23);
// flaky:         org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(timeZone28);
// flaky:         org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(timeZone35);
// flaky:         org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(timeZone39);
// flaky:         org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat51);
        org.junit.Assert.assertNotNull(fastDateFormat52);
        org.junit.Assert.assertNotNull(fastDateFormat53);
        org.junit.Assert.assertNotNull(timeZone54);
// flaky:         org.junit.Assert.assertEquals(timeZone54.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat55);
        org.junit.Assert.assertNotNull(fastDateFormat56);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(2, 3);
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        java.lang.String str4 = fastDateFormat2.getPattern();
        java.util.Calendar calendar5 = null;
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer7 = fastDateFormat2.format(calendar5, stringBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertNotNull(timeZone3);
// flaky:         org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Central European Time");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MMM d, yyyy h:mm a" + "'", str4, "MMM d, yyyy h:mm a");
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy h:mm:ss a z", timeZone5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) ' ', (int) (short) 100, timeZone5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat6);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone5);
        java.util.TimeZone timeZone10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone10, locale11);
        java.util.Locale locale13 = fastDateFormat12.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 1, locale13);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getInstance("M/d/yy", timeZone5, locale13);
        java.lang.Object obj16 = fastDateFormat15.clone();
        java.util.Locale locale17 = fastDateFormat15.getLocale();
        int int18 = fastDateFormat15.getMaxLengthEstimate();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone23 = fastDateFormat22.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone23);
        java.util.TimeZone timeZone26 = null;
        java.util.Locale locale27 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone26, locale27);
        int int29 = fastDateFormat28.getMaxLengthEstimate();
        java.util.Locale locale30 = fastDateFormat28.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone23, locale30);
        java.lang.Object obj32 = fastDateFormat31.clone();
        boolean boolean33 = fastDateFormat15.equals(obj32);
        int int34 = fastDateFormat15.getMaxLengthEstimate();
        java.lang.String str35 = fastDateFormat15.getPattern();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone41 = fastDateFormat40.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone41);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone41);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 1);
        java.util.Locale locale46 = fastDateFormat45.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone41, locale46);
        java.util.TimeZone timeZone48 = fastDateFormat47.getTimeZone();
        boolean boolean49 = fastDateFormat15.equals((java.lang.Object) timeZone48);
        java.util.TimeZone timeZone54 = null;
        java.util.Locale locale55 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone54, locale55);
        int int57 = fastDateFormat56.getMaxLengthEstimate();
        java.util.Locale locale58 = fastDateFormat56.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale58);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat60 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, locale58);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat61 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 0, locale58);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat62 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(21, timeZone48, locale58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 21");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "FastDateFormat[M/d/yy]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "FastDateFormat[M/d/yy]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "FastDateFormat[M/d/yy]");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(timeZone23);
// flaky:         org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(obj32);
// flaky:         org.junit.Assert.assertEquals(obj32.toString(), "FastDateFormat[EEEE, MMMM d, yyyy]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "FastDateFormat[EEEE, MMMM d, yyyy]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "FastDateFormat[EEEE, MMMM d, yyyy]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "M/d/yy" + "'", str35, "M/d/yy");
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(timeZone41);
// flaky:         org.junit.Assert.assertEquals(timeZone41.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(timeZone48);
// flaky:         org.junit.Assert.assertEquals(timeZone48.getDisplayName(), "Central European Time");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(fastDateFormat56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 10 + "'", int57 == 10);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertNotNull(fastDateFormat60);
        org.junit.Assert.assertNotNull(fastDateFormat61);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone1);
        java.util.Calendar calendar3 = null;
        java.lang.String str4 = fastDateFormat2.format(calendar3);
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1);
        java.util.TimeZone timeZone2 = fastDateFormat1.getTimeZone();
        java.lang.Object obj3 = fastDateFormat1.clone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(1);
        java.lang.String str6 = fastDateFormat5.getPattern();
        java.lang.String str7 = fastDateFormat5.toString();
        boolean boolean8 = fastDateFormat1.equals((java.lang.Object) fastDateFormat5);
        java.lang.String str9 = fastDateFormat5.getPattern();
        boolean boolean10 = fastDateFormat5.getTimeZoneOverridesCalendar();
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertNotNull(timeZone2);
// flaky:         org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertNotNull(fastDateFormat5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "M/d/yy h:mm a" + "'", str6, "M/d/yy h:mm a");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FastDateFormat[M/d/yy h:mm a]" + "'", str7, "FastDateFormat[M/d/yy h:mm a]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "M/d/yy h:mm a" + "'", str9, "M/d/yy h:mm a");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        java.util.TimeZone timeZone3 = null;
        java.util.Locale locale4 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone3, locale4);
        java.util.Locale locale6 = fastDateFormat5.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 1, locale6);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(1, locale6);
        java.lang.Object obj9 = fastDateFormat8.clone();
        boolean boolean11 = fastDateFormat8.equals((java.lang.Object) "Jan 1, 1970 1:00:00 AM CET");
        boolean boolean12 = fastDateFormat8.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone15 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone20 = fastDateFormat19.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone20);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone24 = fastDateFormat23.getTimeZone();
        java.util.Locale locale25 = fastDateFormat23.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone20, locale25);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(2, (int) (short) 1, timeZone15, locale25);
        java.lang.Object obj28 = fastDateFormat27.clone();
        java.lang.String str29 = fastDateFormat27.getPattern();
        java.lang.String str30 = fastDateFormat27.toString();
        java.lang.String str31 = fastDateFormat27.getPattern();
        boolean boolean32 = fastDateFormat27.getTimeZoneOverridesCalendar();
        boolean boolean33 = fastDateFormat8.equals((java.lang.Object) boolean32);
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(obj9);
// flaky:         org.junit.Assert.assertEquals(obj9.toString(), "FastDateFormat[MMMM d, yyyy]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "FastDateFormat[MMMM d, yyyy]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "FastDateFormat[MMMM d, yyyy]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(timeZone20);
// flaky:         org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(timeZone24);
// flaky:         org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(obj28);
// flaky:         org.junit.Assert.assertEquals(obj28.toString(), "FastDateFormat[MMM d, yyyy h:mm:ss a z]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "FastDateFormat[MMM d, yyyy h:mm:ss a z]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "FastDateFormat[MMM d, yyyy h:mm:ss a z]");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "MMM d, yyyy h:mm:ss a z" + "'", str29, "MMM d, yyyy h:mm:ss a z");
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "FastDateFormat[MMM d, yyyy h:mm:ss a z]" + "'", str30, "FastDateFormat[MMM d, yyyy h:mm:ss a z]");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "MMM d, yyyy h:mm:ss a z" + "'", str31, "MMM d, yyyy h:mm:ss a z");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        int int3 = fastDateFormat2.getMaxLengthEstimate();
        boolean boolean4 = fastDateFormat2.getTimeZoneOverridesCalendar();
        java.util.Locale locale5 = fastDateFormat2.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 0, locale5);
        boolean boolean7 = fastDateFormat6.getTimeZoneOverridesCalendar();
        java.lang.String str8 = fastDateFormat6.toString();
        org.junit.Assert.assertNotNull(fastDateFormat2);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 21 + "'", int3 == 21);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "FastDateFormat[h:mm:ss a z]" + "'", str8, "FastDateFormat[h:mm:ss a z]");
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone7);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone7);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 0);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone18 = fastDateFormat17.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone18);
        java.util.TimeZone timeZone21 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone21, locale22);
        java.util.Locale locale24 = fastDateFormat23.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone18, locale24);
        boolean boolean26 = fastDateFormat13.equals((java.lang.Object) timeZone18);
        java.util.Locale locale27 = fastDateFormat13.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, locale27);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getInstance("MMM d, yyyy h:mm:ss a z", timeZone7, locale27);
        java.util.TimeZone timeZone33 = null;
        java.util.Locale locale34 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone33, locale34);
        java.util.Locale locale36 = fastDateFormat35.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 1, locale36);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone7, locale36);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(1, timeZone7);
        java.lang.StringBuffer stringBuffer41 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer42 = fastDateFormat39.format((long) 33, stringBuffer41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
// flaky:         org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(timeZone18);
// flaky:         org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(fastDateFormat39);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        java.util.TimeZone timeZone1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) '#', timeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1);
        boolean boolean4 = fastDateFormat2.equals((java.lang.Object) (byte) 100);
        java.util.Locale locale5 = fastDateFormat2.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getInstance("M/d/yy h:mm a", locale5);
        boolean boolean7 = fastDateFormat6.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone8 = fastDateFormat6.getTimeZone();
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky:         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Central European Time");
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone7);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone12 = fastDateFormat11.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone12);
        java.util.Locale locale14 = fastDateFormat13.getLocale();
        java.util.Locale locale15 = fastDateFormat13.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone7, locale15);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone24 = fastDateFormat23.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone24);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone24);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone24);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone24);
        java.util.TimeZone timeZone31 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone36 = fastDateFormat35.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone36);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone40 = fastDateFormat39.getTimeZone();
        java.util.Locale locale41 = fastDateFormat39.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone36, locale41);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(2, (int) (short) 1, timeZone31, locale41);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang.time.FastDateFormat.getInstance("MMMM d, yyyy h:mm:ss a z", timeZone24, locale41);
        boolean boolean45 = fastDateFormat16.equals((java.lang.Object) timeZone24);
        java.util.TimeZone timeZone48 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone48);
        java.lang.StringBuffer stringBuffer51 = null;
        java.lang.StringBuffer stringBuffer52 = fastDateFormat49.format(100L, stringBuffer51);
        java.lang.Object obj53 = fastDateFormat49.clone();
        java.util.TimeZone timeZone54 = fastDateFormat49.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat55 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 1, timeZone54);
        java.util.TimeZone timeZone56 = fastDateFormat55.getTimeZone();
        boolean boolean57 = fastDateFormat16.equals((java.lang.Object) timeZone56);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat65 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone66 = fastDateFormat65.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat67 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone66);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat68 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 1, timeZone66);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat69 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone66);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat75 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone76 = fastDateFormat75.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat77 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone76);
        java.util.TimeZone timeZone79 = null;
        java.util.Locale locale80 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat81 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone79, locale80);
        java.util.Locale locale82 = fastDateFormat81.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat83 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone76, locale82);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat84 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, locale82);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat85 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, locale82);
        java.util.Locale locale86 = fastDateFormat85.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat87 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone66, locale86);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat88 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 1, locale86);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat89 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2, locale86);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat90 = org.apache.commons.lang.time.FastDateFormat.getInstance("M/d/yy", timeZone56, locale86);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat91 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(100, (int) (short) 0, timeZone56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
// flaky:         org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
// flaky:         org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(timeZone24);
// flaky:         org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(timeZone36);
// flaky:         org.junit.Assert.assertEquals(timeZone36.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(timeZone40);
// flaky:         org.junit.Assert.assertEquals(timeZone40.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNull(stringBuffer52);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertEquals(obj53.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj53), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj53), "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone54);
// flaky:         org.junit.Assert.assertEquals(timeZone54.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat55);
        org.junit.Assert.assertNotNull(timeZone56);
// flaky:         org.junit.Assert.assertEquals(timeZone56.getDisplayName(), "Central European Time");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(fastDateFormat65);
        org.junit.Assert.assertNotNull(timeZone66);
// flaky:         org.junit.Assert.assertEquals(timeZone66.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat67);
        org.junit.Assert.assertNotNull(fastDateFormat68);
        org.junit.Assert.assertNotNull(fastDateFormat69);
        org.junit.Assert.assertNotNull(fastDateFormat75);
        org.junit.Assert.assertNotNull(timeZone76);
// flaky:         org.junit.Assert.assertEquals(timeZone76.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat77);
        org.junit.Assert.assertNotNull(fastDateFormat81);
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat83);
        org.junit.Assert.assertNotNull(fastDateFormat84);
        org.junit.Assert.assertNotNull(fastDateFormat85);
        org.junit.Assert.assertNotNull(locale86);
        org.junit.Assert.assertEquals(locale86.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat87);
        org.junit.Assert.assertNotNull(fastDateFormat88);
        org.junit.Assert.assertNotNull(fastDateFormat89);
        org.junit.Assert.assertNotNull(fastDateFormat90);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        java.util.TimeZone timeZone4 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone4);
        java.lang.StringBuffer stringBuffer7 = null;
        java.lang.StringBuffer stringBuffer8 = fastDateFormat5.format(100L, stringBuffer7);
        java.lang.Object obj9 = fastDateFormat5.clone();
        java.util.TimeZone timeZone10 = fastDateFormat5.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 1, timeZone10);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone14 = fastDateFormat13.getTimeZone();
        java.util.Locale locale15 = fastDateFormat13.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone10, locale15);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, locale15);
        java.util.Date date18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = fastDateFormat17.format(date18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNull(stringBuffer8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone10);
// flaky:         org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(timeZone14);
// flaky:         org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        java.util.TimeZone timeZone3 = null;
        java.util.Locale locale4 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone3, locale4);
        java.util.Locale locale6 = fastDateFormat5.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale6);
        java.lang.StringBuffer stringBuffer9 = null;
        java.lang.StringBuffer stringBuffer10 = fastDateFormat7.format((long) 10, stringBuffer9);
        java.lang.String str12 = fastDateFormat7.format((long) 39);
        java.util.Locale locale13 = fastDateFormat7.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getInstance("FastDateFormat[M/d/yy h:mm:ss a z]", locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNull(stringBuffer10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone3);
        int int5 = fastDateFormat4.getMaxLengthEstimate();
        java.lang.String str7 = fastDateFormat4.format((long) '4');
        java.lang.String str8 = fastDateFormat4.toString();
        java.util.Locale locale9 = fastDateFormat4.getLocale();
        java.lang.StringBuffer stringBuffer11 = null;
        java.lang.StringBuffer stringBuffer12 = fastDateFormat4.format((long) 0, stringBuffer11);
        java.util.Locale locale13 = fastDateFormat4.getLocale();
        java.lang.String str15 = fastDateFormat4.format((long) 100);
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertNotNull(timeZone3);
// flaky:         org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "FastDateFormat[]" + "'", str8, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNull(stringBuffer12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone8);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone13 = fastDateFormat12.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone13);
        java.util.Locale locale15 = fastDateFormat14.getLocale();
        java.util.Locale locale16 = fastDateFormat14.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(1, timeZone8, locale16);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getInstance("M/d/yy", timeZone8);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone27 = fastDateFormat26.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone27);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone31 = fastDateFormat30.getTimeZone();
        java.util.Locale locale32 = fastDateFormat30.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone27, locale32);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, locale32);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(2, 0, locale32);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale32);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang.time.FastDateFormat.getInstance("MMMM d, yyyy h:mm:ss a z", timeZone8, locale32);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang.time.FastDateFormat.getInstance("MMM d, yyyy h:mm:ss a z", timeZone8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(20, timeZone8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 20");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky:         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(timeZone27);
// flaky:         org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(timeZone31);
// flaky:         org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(fastDateFormat38);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 0);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone9 = fastDateFormat8.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone9);
        java.util.TimeZone timeZone12 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone12, locale13);
        java.util.Locale locale15 = fastDateFormat14.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone9, locale15);
        boolean boolean17 = fastDateFormat4.equals((java.lang.Object) timeZone9);
        java.util.TimeZone timeZone20 = null;
        java.util.Locale locale21 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone20, locale21);
        java.util.Locale locale23 = fastDateFormat22.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 1, locale23);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone9, locale23);
        java.util.Locale locale26 = fastDateFormat25.getLocale();
        int int27 = fastDateFormat25.getMaxLengthEstimate();
        java.lang.String str28 = fastDateFormat25.getPattern();
        java.util.TimeZone timeZone29 = fastDateFormat25.getTimeZone();
        java.util.TimeZone timeZone33 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone33);
        java.lang.StringBuffer stringBuffer36 = null;
        java.lang.StringBuffer stringBuffer37 = fastDateFormat34.format(100L, stringBuffer36);
        java.lang.Object obj38 = fastDateFormat34.clone();
        java.util.TimeZone timeZone39 = fastDateFormat34.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 1, timeZone39);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone43 = fastDateFormat42.getTimeZone();
        java.util.Locale locale44 = fastDateFormat42.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone39, locale44);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone29, locale44);
        java.lang.Object obj47 = fastDateFormat46.clone();
        int int48 = fastDateFormat46.getMaxLengthEstimate();
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
// flaky:         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 21 + "'", int27 == 21);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "M/d/yy h:mm a" + "'", str28, "M/d/yy h:mm a");
        org.junit.Assert.assertNotNull(timeZone29);
// flaky:         org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNull(stringBuffer37);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertEquals(obj38.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj38), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj38), "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone39);
// flaky:         org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(timeZone43);
// flaky:         org.junit.Assert.assertEquals(timeZone43.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertEquals(obj47.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj47), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj47), "FastDateFormat[]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(13, 33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 33");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone6);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone11 = fastDateFormat10.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone11);
        java.util.Locale locale13 = fastDateFormat12.getLocale();
        java.util.Locale locale14 = fastDateFormat12.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(1, timeZone6, locale14);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone22 = fastDateFormat21.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone22);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone22);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone22);
        java.util.Locale locale26 = fastDateFormat25.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(1, locale26);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(3, timeZone6, locale26);
        int int29 = fastDateFormat28.getMaxLengthEstimate();
        boolean boolean30 = fastDateFormat28.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone31 = fastDateFormat28.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone40 = fastDateFormat39.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone40);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone40);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone40);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone50 = fastDateFormat49.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat51 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone50);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone54 = fastDateFormat53.getTimeZone();
        java.util.Locale locale55 = fastDateFormat53.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone50, locale55);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat58 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone59 = fastDateFormat58.getTimeZone();
        java.util.Locale locale60 = fastDateFormat58.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat61 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone50, locale60);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat65 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone66 = fastDateFormat65.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat67 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone66);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat69 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone70 = fastDateFormat69.getTimeZone();
        java.util.Locale locale71 = fastDateFormat69.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat72 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone66, locale71);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat73 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone50, locale71);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat74 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone40, locale71);
        java.util.TimeZone timeZone78 = null;
        java.util.Locale locale79 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat80 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone78, locale79);
        java.util.Locale locale81 = fastDateFormat80.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat82 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale81);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat83 = org.apache.commons.lang.time.FastDateFormat.getInstance("MMMM d, yyyy h:mm:ss a z", locale81);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat84 = org.apache.commons.lang.time.FastDateFormat.getInstance("M/d/yy", timeZone40, locale81);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat85 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone40);
        java.lang.String str87 = fastDateFormat85.format((long) 31);
        java.lang.String str88 = fastDateFormat85.toString();
        java.util.Locale locale89 = fastDateFormat85.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat90 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 100, timeZone31, locale89);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
// flaky:         org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(timeZone11);
// flaky:         org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(timeZone22);
// flaky:         org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(timeZone31);
// flaky:         org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(timeZone40);
// flaky:         org.junit.Assert.assertEquals(timeZone40.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNotNull(timeZone50);
// flaky:         org.junit.Assert.assertEquals(timeZone50.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat51);
        org.junit.Assert.assertNotNull(fastDateFormat53);
        org.junit.Assert.assertNotNull(timeZone54);
// flaky:         org.junit.Assert.assertEquals(timeZone54.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat56);
        org.junit.Assert.assertNotNull(fastDateFormat58);
        org.junit.Assert.assertNotNull(timeZone59);
// flaky:         org.junit.Assert.assertEquals(timeZone59.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat61);
        org.junit.Assert.assertNotNull(fastDateFormat65);
        org.junit.Assert.assertNotNull(timeZone66);
// flaky:         org.junit.Assert.assertEquals(timeZone66.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat67);
        org.junit.Assert.assertNotNull(fastDateFormat69);
        org.junit.Assert.assertNotNull(timeZone70);
// flaky:         org.junit.Assert.assertEquals(timeZone70.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat72);
        org.junit.Assert.assertNotNull(fastDateFormat73);
        org.junit.Assert.assertNotNull(fastDateFormat74);
        org.junit.Assert.assertNotNull(fastDateFormat80);
        org.junit.Assert.assertNotNull(locale81);
        org.junit.Assert.assertEquals(locale81.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat82);
        org.junit.Assert.assertNotNull(fastDateFormat83);
        org.junit.Assert.assertNotNull(fastDateFormat84);
        org.junit.Assert.assertNotNull(fastDateFormat85);
// flaky:         org.junit.Assert.assertEquals("'" + str87 + "' != '" + "1:00:00 AM CET" + "'", str87, "1:00:00 AM CET");
// flaky:         org.junit.Assert.assertEquals("'" + str88 + "' != '" + "FastDateFormat[h:mm:ss a z]" + "'", str88, "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertNotNull(locale89);
        org.junit.Assert.assertEquals(locale89.toString(), "en_US");
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 0);
        int int7 = fastDateFormat6.getMaxLengthEstimate();
        java.lang.String str9 = fastDateFormat6.format((long) (byte) 1);
        java.util.TimeZone timeZone10 = fastDateFormat6.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone17 = fastDateFormat16.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone17);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone17);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone17);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone27 = fastDateFormat26.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone27);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone31 = fastDateFormat30.getTimeZone();
        java.util.Locale locale32 = fastDateFormat30.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone27, locale32);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone36 = fastDateFormat35.getTimeZone();
        java.util.Locale locale37 = fastDateFormat35.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone27, locale37);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone43 = fastDateFormat42.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone43);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone47 = fastDateFormat46.getTimeZone();
        java.util.Locale locale48 = fastDateFormat46.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone43, locale48);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone27, locale48);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat51 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone17, locale48);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat52 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone10, locale48);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2, locale48);
        boolean boolean54 = fastDateFormat53.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone55 = fastDateFormat53.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 1, timeZone55);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat57 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(50, timeZone55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 50");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 50 + "'", int7 == 50);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Thursday, January 1, 1970 1:00:00 AM CET" + "'", str9, "Thursday, January 1, 1970 1:00:00 AM CET");
        org.junit.Assert.assertNotNull(timeZone10);
// flaky:         org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(timeZone17);
// flaky:         org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(timeZone27);
// flaky:         org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(timeZone31);
// flaky:         org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(timeZone36);
// flaky:         org.junit.Assert.assertEquals(timeZone36.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(timeZone43);
// flaky:         org.junit.Assert.assertEquals(timeZone43.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(timeZone47);
// flaky:         org.junit.Assert.assertEquals(timeZone47.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertNotNull(fastDateFormat51);
        org.junit.Assert.assertNotNull(fastDateFormat52);
        org.junit.Assert.assertNotNull(fastDateFormat53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(timeZone55);
// flaky:         org.junit.Assert.assertEquals(timeZone55.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat56);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1);
        boolean boolean5 = fastDateFormat3.equals((java.lang.Object) (byte) 100);
        int int6 = fastDateFormat3.getMaxLengthEstimate();
        java.lang.String str8 = fastDateFormat3.format((long) (byte) 1);
        java.util.TimeZone timeZone9 = fastDateFormat3.getTimeZone();
        java.util.TimeZone timeZone10 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy h:mm:ss a z", timeZone10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(13, timeZone10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 18 + "'", int6 == 18);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1:00:00 AM CET" + "'", str8, "1:00:00 AM CET");
        org.junit.Assert.assertNotNull(timeZone9);
// flaky:         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(timeZone10);
// flaky:         org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat11);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone1, locale2);
        int int4 = fastDateFormat3.getMaxLengthEstimate();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer7 = fastDateFormat3.format((long) 45, stringBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone5);
        java.util.TimeZone timeZone10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone10, locale11);
        java.util.Locale locale13 = fastDateFormat12.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 1, locale13);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getInstance("M/d/yy", timeZone5, locale13);
        java.lang.Object obj16 = fastDateFormat15.clone();
        java.util.Locale locale17 = fastDateFormat15.getLocale();
        int int18 = fastDateFormat15.getMaxLengthEstimate();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone23 = fastDateFormat22.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone23);
        java.util.TimeZone timeZone26 = null;
        java.util.Locale locale27 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone26, locale27);
        int int29 = fastDateFormat28.getMaxLengthEstimate();
        java.util.Locale locale30 = fastDateFormat28.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone23, locale30);
        java.lang.Object obj32 = fastDateFormat31.clone();
        boolean boolean33 = fastDateFormat15.equals(obj32);
        int int34 = fastDateFormat15.getMaxLengthEstimate();
        java.lang.String str35 = fastDateFormat15.getPattern();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone41 = fastDateFormat40.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone41);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone41);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 1);
        java.util.Locale locale46 = fastDateFormat45.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone41, locale46);
        java.util.TimeZone timeZone48 = fastDateFormat47.getTimeZone();
        boolean boolean49 = fastDateFormat15.equals((java.lang.Object) timeZone48);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(100, timeZone48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "FastDateFormat[M/d/yy]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "FastDateFormat[M/d/yy]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "FastDateFormat[M/d/yy]");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(timeZone23);
// flaky:         org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(obj32);
// flaky:         org.junit.Assert.assertEquals(obj32.toString(), "FastDateFormat[EEEE, MMMM d, yyyy]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "FastDateFormat[EEEE, MMMM d, yyyy]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "FastDateFormat[EEEE, MMMM d, yyyy]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "M/d/yy" + "'", str35, "M/d/yy");
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(timeZone41);
// flaky:         org.junit.Assert.assertEquals(timeZone41.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(timeZone48);
// flaky:         org.junit.Assert.assertEquals(timeZone48.getDisplayName(), "Central European Time");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        java.util.TimeZone timeZone4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone4, locale5);
        java.util.Locale locale7 = fastDateFormat6.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 1, locale7);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(1, locale7);
        java.util.TimeZone timeZone10 = fastDateFormat9.getTimeZone();
        java.lang.String str12 = fastDateFormat9.format((long) (byte) 100);
        java.util.TimeZone timeZone13 = fastDateFormat9.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone21 = fastDateFormat20.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone21);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone21);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 0);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone32 = fastDateFormat31.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone32);
        java.util.TimeZone timeZone35 = null;
        java.util.Locale locale36 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone35, locale36);
        java.util.Locale locale38 = fastDateFormat37.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone32, locale38);
        boolean boolean40 = fastDateFormat27.equals((java.lang.Object) timeZone32);
        java.util.Locale locale41 = fastDateFormat27.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, locale41);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang.time.FastDateFormat.getInstance("MMM d, yyyy h:mm:ss a z", timeZone21, locale41);
        java.util.TimeZone timeZone47 = null;
        java.util.Locale locale48 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone47, locale48);
        java.util.Locale locale50 = fastDateFormat49.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat51 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 1, locale50);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat52 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone21, locale50);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat58 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone59 = fastDateFormat58.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat60 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone59);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat62 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone63 = fastDateFormat62.getTimeZone();
        java.util.Locale locale64 = fastDateFormat62.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat65 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone59, locale64);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat67 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone68 = fastDateFormat67.getTimeZone();
        java.util.Locale locale69 = fastDateFormat67.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat70 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone59, locale69);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat71 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone59);
        java.util.Locale locale72 = fastDateFormat71.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat73 = org.apache.commons.lang.time.FastDateFormat.getInstance("MMM d, yyyy h:mm:ss a z", timeZone21, locale72);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat74 = org.apache.commons.lang.time.FastDateFormat.getInstance("1:00:00 AM", timeZone13, locale72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: A");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
// flaky:         org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Central European Time");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "January 1, 1970" + "'", str12, "January 1, 1970");
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(timeZone21);
// flaky:         org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(timeZone32);
// flaky:         org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat51);
        org.junit.Assert.assertNotNull(fastDateFormat52);
        org.junit.Assert.assertNotNull(fastDateFormat58);
        org.junit.Assert.assertNotNull(timeZone59);
// flaky:         org.junit.Assert.assertEquals(timeZone59.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat60);
        org.junit.Assert.assertNotNull(fastDateFormat62);
        org.junit.Assert.assertNotNull(timeZone63);
// flaky:         org.junit.Assert.assertEquals(timeZone63.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat65);
        org.junit.Assert.assertNotNull(fastDateFormat67);
        org.junit.Assert.assertNotNull(timeZone68);
// flaky:         org.junit.Assert.assertEquals(timeZone68.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat70);
        org.junit.Assert.assertNotNull(fastDateFormat71);
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat73);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        java.util.TimeZone timeZone6 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone6, locale7);
        java.util.Locale locale9 = fastDateFormat8.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale9);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getInstance("MMMM d, yyyy h:mm:ss a z", locale9);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getInstance("h:mm:ss a z", locale9);
        java.util.TimeZone timeZone13 = fastDateFormat12.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getInstance("");
        java.lang.StringBuffer stringBuffer17 = null;
        java.lang.StringBuffer stringBuffer18 = fastDateFormat15.format((long) (byte) 100, stringBuffer17);
        java.lang.String str19 = fastDateFormat15.getPattern();
        java.lang.String str20 = fastDateFormat15.getPattern();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone29 = fastDateFormat28.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone29);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone29);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone29);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone29);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone29);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone41 = fastDateFormat40.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone41);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone45 = fastDateFormat44.getTimeZone();
        java.util.Locale locale46 = fastDateFormat44.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone41, locale46);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, locale46);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(3, locale46);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 1, timeZone29, locale46);
        boolean boolean51 = fastDateFormat15.equals((java.lang.Object) (short) 1);
        java.util.Locale locale52 = fastDateFormat15.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 10, 25, timeZone13, locale52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 25");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNull(stringBuffer18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(timeZone29);
// flaky:         org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(timeZone41);
// flaky:         org.junit.Assert.assertEquals(timeZone41.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(timeZone45);
// flaky:         org.junit.Assert.assertEquals(timeZone45.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "en_US");
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getInstance("h:mm a");
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getInstance("MMM d, yyyy h:mm:ss a z");
        java.lang.String str8 = fastDateFormat6.format((long) 10);
        java.util.Locale locale9 = fastDateFormat6.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, locale9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(45, timeZone3, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 45");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertNotNull(timeZone3);
// flaky:         org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Jan 1, 1970 1:00:00 AM CET" + "'", str8, "Jan 1, 1970 1:00:00 AM CET");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat10);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone1);
        java.lang.StringBuffer stringBuffer4 = null;
        java.lang.StringBuffer stringBuffer5 = fastDateFormat2.format(100L, stringBuffer4);
        java.util.Calendar calendar6 = null;
        java.lang.String str7 = fastDateFormat2.format(calendar6);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone15 = fastDateFormat14.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone15);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone20 = fastDateFormat19.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone20);
        java.util.Locale locale22 = fastDateFormat21.getLocale();
        java.util.Locale locale23 = fastDateFormat21.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(1, timeZone15, locale23);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang.time.FastDateFormat.getInstance("M/d/yy", timeZone15);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone34 = fastDateFormat33.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone34);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone38 = fastDateFormat37.getTimeZone();
        java.util.Locale locale39 = fastDateFormat37.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone34, locale39);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, locale39);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(2, 0, locale39);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale39);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang.time.FastDateFormat.getInstance("MMMM d, yyyy h:mm:ss a z", timeZone15, locale39);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone49 = fastDateFormat48.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone49);
        java.util.TimeZone timeZone54 = null;
        java.util.Locale locale55 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone54, locale55);
        java.util.Locale locale57 = fastDateFormat56.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat58 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 1, locale57);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang.time.FastDateFormat.getInstance("M/d/yy", timeZone49, locale57);
        java.lang.Object obj60 = fastDateFormat59.clone();
        java.util.Locale locale61 = fastDateFormat59.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat62 = org.apache.commons.lang.time.FastDateFormat.getInstance("M/d/yy", timeZone15, locale61);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat64 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 10);
        java.util.TimeZone timeZone65 = fastDateFormat64.getTimeZone();
        boolean boolean66 = fastDateFormat62.equals((java.lang.Object) fastDateFormat64);
        boolean boolean67 = fastDateFormat62.getTimeZoneOverridesCalendar();
        boolean boolean68 = fastDateFormat2.equals((java.lang.Object) fastDateFormat62);
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertNull(stringBuffer5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(timeZone15);
// flaky:         org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(timeZone20);
// flaky:         org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(timeZone34);
// flaky:         org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(timeZone38);
// flaky:         org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertNotNull(timeZone49);
// flaky:         org.junit.Assert.assertEquals(timeZone49.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertNotNull(fastDateFormat56);
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat58);
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertEquals(obj60.toString(), "FastDateFormat[M/d/yy]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj60), "FastDateFormat[M/d/yy]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj60), "FastDateFormat[M/d/yy]");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat62);
        org.junit.Assert.assertNotNull(fastDateFormat64);
        org.junit.Assert.assertNotNull(timeZone65);
// flaky:         org.junit.Assert.assertEquals(timeZone65.getDisplayName(), "Central European Time");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 0);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone11 = fastDateFormat10.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone11);
        java.util.TimeZone timeZone14 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone14, locale15);
        java.util.Locale locale17 = fastDateFormat16.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone11, locale17);
        boolean boolean19 = fastDateFormat6.equals((java.lang.Object) timeZone11);
        java.util.TimeZone timeZone22 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone22, locale23);
        java.util.Locale locale25 = fastDateFormat24.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 1, locale25);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone11, locale25);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(45, (int) ' ', timeZone11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(timeZone11);
// flaky:         org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(fastDateFormat28);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone1);
        java.lang.StringBuffer stringBuffer4 = null;
        java.lang.StringBuffer stringBuffer5 = fastDateFormat2.format(100L, stringBuffer4);
        java.lang.String str7 = fastDateFormat2.format((long) 1);
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertNull(stringBuffer5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone11 = fastDateFormat10.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone11);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone15 = fastDateFormat14.getTimeZone();
        java.util.Locale locale16 = fastDateFormat14.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone11, locale16);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, locale16);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(2, 0, locale16);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale16);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone28 = fastDateFormat27.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone28);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone28);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone28);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone38 = fastDateFormat37.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone38);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone42 = fastDateFormat41.getTimeZone();
        java.util.Locale locale43 = fastDateFormat41.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone38, locale43);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone47 = fastDateFormat46.getTimeZone();
        java.util.Locale locale48 = fastDateFormat46.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone38, locale48);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone54 = fastDateFormat53.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat55 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone54);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat57 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone58 = fastDateFormat57.getTimeZone();
        java.util.Locale locale59 = fastDateFormat57.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat60 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone54, locale59);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat61 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone38, locale59);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat62 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone28, locale59);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat66 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone67 = fastDateFormat66.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat68 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone67);
        java.util.TimeZone timeZone70 = null;
        java.util.Locale locale71 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat72 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone70, locale71);
        java.util.Locale locale73 = fastDateFormat72.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat74 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone67, locale73);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat75 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 1, timeZone28, locale73);
        boolean boolean76 = fastDateFormat20.equals((java.lang.Object) timeZone28);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat77 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(0, 1, timeZone28);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat78 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone28);
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(timeZone11);
// flaky:         org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(timeZone15);
// flaky:         org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(timeZone28);
// flaky:         org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(timeZone38);
// flaky:         org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(timeZone42);
// flaky:         org.junit.Assert.assertEquals(timeZone42.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(timeZone47);
// flaky:         org.junit.Assert.assertEquals(timeZone47.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNotNull(fastDateFormat53);
        org.junit.Assert.assertNotNull(timeZone54);
// flaky:         org.junit.Assert.assertEquals(timeZone54.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat55);
        org.junit.Assert.assertNotNull(fastDateFormat57);
        org.junit.Assert.assertNotNull(timeZone58);
// flaky:         org.junit.Assert.assertEquals(timeZone58.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat60);
        org.junit.Assert.assertNotNull(fastDateFormat61);
        org.junit.Assert.assertNotNull(fastDateFormat62);
        org.junit.Assert.assertNotNull(fastDateFormat66);
        org.junit.Assert.assertNotNull(timeZone67);
// flaky:         org.junit.Assert.assertEquals(timeZone67.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat68);
        org.junit.Assert.assertNotNull(fastDateFormat72);
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat74);
        org.junit.Assert.assertNotNull(fastDateFormat75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(fastDateFormat77);
        org.junit.Assert.assertNotNull(fastDateFormat78);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        java.util.TimeZone timeZone2 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 1, (int) (byte) 1, timeZone2);
        int int4 = fastDateFormat3.getMaxLengthEstimate();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator6 = fastDateFormat3.formatToCharacterIterator((java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 39 + "'", int4 == 39);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone1, locale2);
        java.util.Locale locale4 = fastDateFormat3.getLocale();
        java.lang.String str5 = fastDateFormat3.getPattern();
        int int6 = fastDateFormat3.getMaxLengthEstimate();
        java.lang.String str8 = fastDateFormat3.format((long) (byte) 10);
        java.util.Locale locale9 = fastDateFormat3.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone15 = fastDateFormat14.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone15);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 1, timeZone15);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone15);
        java.lang.String str19 = fastDateFormat18.toString();
        java.lang.String str20 = fastDateFormat18.getPattern();
        boolean boolean21 = fastDateFormat3.equals((java.lang.Object) fastDateFormat18);
        java.util.Date date22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = fastDateFormat3.format(date22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "M/d/yy" + "'", str5, "M/d/yy");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1/1/70" + "'", str8, "1/1/70");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(timeZone15);
// flaky:         org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat18);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "FastDateFormat[h:mm:ss a z]" + "'", str19, "FastDateFormat[h:mm:ss a z]");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "h:mm:ss a z" + "'", str20, "h:mm:ss a z");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        java.util.TimeZone timeZone6 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone6, locale7);
        java.util.Locale locale9 = fastDateFormat8.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 1, locale9);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(1, locale9);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 2, locale9);
        java.util.TimeZone timeZone13 = fastDateFormat12.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1);
        boolean boolean16 = fastDateFormat15.getTimeZoneOverridesCalendar();
        java.lang.String str18 = fastDateFormat15.format(10L);
        boolean boolean19 = fastDateFormat12.equals((java.lang.Object) fastDateFormat15);
        java.util.TimeZone timeZone20 = fastDateFormat12.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone28 = fastDateFormat27.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone28);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone28);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 0);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone39 = fastDateFormat38.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone39);
        java.util.TimeZone timeZone42 = null;
        java.util.Locale locale43 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone42, locale43);
        java.util.Locale locale45 = fastDateFormat44.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone39, locale45);
        boolean boolean47 = fastDateFormat34.equals((java.lang.Object) timeZone39);
        java.util.Locale locale48 = fastDateFormat34.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, locale48);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang.time.FastDateFormat.getInstance("MMM d, yyyy h:mm:ss a z", timeZone28, locale48);
        java.util.TimeZone timeZone54 = null;
        java.util.Locale locale55 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone54, locale55);
        java.util.Locale locale57 = fastDateFormat56.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat58 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 1, locale57);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone28, locale57);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat65 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone66 = fastDateFormat65.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat67 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone66);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat69 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone70 = fastDateFormat69.getTimeZone();
        java.util.Locale locale71 = fastDateFormat69.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat72 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone66, locale71);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat74 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone75 = fastDateFormat74.getTimeZone();
        java.util.Locale locale76 = fastDateFormat74.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat77 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone66, locale76);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat78 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone66);
        java.util.Locale locale79 = fastDateFormat78.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat80 = org.apache.commons.lang.time.FastDateFormat.getInstance("MMM d, yyyy h:mm:ss a z", timeZone28, locale79);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat81 = org.apache.commons.lang.time.FastDateFormat.getInstance("MMM d, yyyy", timeZone20, locale79);
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1:00:00 AM CET" + "'", str18, "1:00:00 AM CET");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(timeZone20);
// flaky:         org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(timeZone28);
// flaky:         org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(timeZone39);
// flaky:         org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertNotNull(fastDateFormat56);
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat58);
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertNotNull(fastDateFormat65);
        org.junit.Assert.assertNotNull(timeZone66);
// flaky:         org.junit.Assert.assertEquals(timeZone66.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat67);
        org.junit.Assert.assertNotNull(fastDateFormat69);
        org.junit.Assert.assertNotNull(timeZone70);
// flaky:         org.junit.Assert.assertEquals(timeZone70.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat72);
        org.junit.Assert.assertNotNull(fastDateFormat74);
        org.junit.Assert.assertNotNull(timeZone75);
// flaky:         org.junit.Assert.assertEquals(timeZone75.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat77);
        org.junit.Assert.assertNotNull(fastDateFormat78);
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat80);
        org.junit.Assert.assertNotNull(fastDateFormat81);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone5);
        java.util.TimeZone timeZone8 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone8, locale9);
        java.util.Locale locale11 = fastDateFormat10.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone5, locale11);
        java.util.TimeZone timeZone13 = fastDateFormat12.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(39, timeZone13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 39");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Central European Time");
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone7);
        java.util.TimeZone timeZone10 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone10, locale11);
        java.util.Locale locale13 = fastDateFormat12.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone7, locale13);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, locale13);
        java.util.TimeZone timeZone16 = fastDateFormat15.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 1, timeZone16);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone25 = fastDateFormat24.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone25);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone25);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone25);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone35 = fastDateFormat34.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone35);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone39 = fastDateFormat38.getTimeZone();
        java.util.Locale locale40 = fastDateFormat38.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone35, locale40);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone44 = fastDateFormat43.getTimeZone();
        java.util.Locale locale45 = fastDateFormat43.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone35, locale45);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone51 = fastDateFormat50.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat52 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone51);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat54 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone55 = fastDateFormat54.getTimeZone();
        java.util.Locale locale56 = fastDateFormat54.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat57 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone51, locale56);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat58 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone35, locale56);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone25, locale56);
        java.util.TimeZone timeZone63 = null;
        java.util.Locale locale64 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat65 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone63, locale64);
        java.util.Locale locale66 = fastDateFormat65.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat67 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale66);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat68 = org.apache.commons.lang.time.FastDateFormat.getInstance("MMMM d, yyyy h:mm:ss a z", locale66);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat69 = org.apache.commons.lang.time.FastDateFormat.getInstance("M/d/yy", timeZone25, locale66);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat70 = org.apache.commons.lang.time.FastDateFormat.getInstance("M/d/yy", timeZone16, locale66);
        int int71 = fastDateFormat70.getMaxLengthEstimate();
        java.util.Calendar calendar72 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str73 = fastDateFormat70.format(calendar72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
// flaky:         org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(timeZone16);
// flaky:         org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(timeZone25);
// flaky:         org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(timeZone35);
// flaky:         org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(timeZone39);
// flaky:         org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(timeZone44);
// flaky:         org.junit.Assert.assertEquals(timeZone44.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertNotNull(timeZone51);
// flaky:         org.junit.Assert.assertEquals(timeZone51.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat52);
        org.junit.Assert.assertNotNull(fastDateFormat54);
        org.junit.Assert.assertNotNull(timeZone55);
// flaky:         org.junit.Assert.assertEquals(timeZone55.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat57);
        org.junit.Assert.assertNotNull(fastDateFormat58);
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertNotNull(fastDateFormat65);
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat67);
        org.junit.Assert.assertNotNull(fastDateFormat68);
        org.junit.Assert.assertNotNull(fastDateFormat69);
        org.junit.Assert.assertNotNull(fastDateFormat70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 10 + "'", int71 == 10);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone11 = fastDateFormat10.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone11);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone11);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 0, (int) (short) 1, timeZone11);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1);
        boolean boolean18 = fastDateFormat16.equals((java.lang.Object) (byte) 100);
        java.util.Locale locale19 = fastDateFormat16.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang.time.FastDateFormat.getInstance("M/d/yy", timeZone11, locale19);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone25 = fastDateFormat24.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone25);
        java.util.Locale locale27 = fastDateFormat26.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 1, locale27);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getInstance("M/d/yy", timeZone11, locale27);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang.time.FastDateFormat.getInstance("1/1/70", timeZone11);
        java.util.TimeZone timeZone36 = null;
        java.util.Locale locale37 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone36, locale37);
        java.util.Locale locale39 = fastDateFormat38.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 1, locale39);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(1, locale39);
        java.util.TimeZone timeZone42 = fastDateFormat41.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone51 = fastDateFormat50.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat52 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone51);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone51);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat54 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 0, (int) (short) 1, timeZone51);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1);
        boolean boolean58 = fastDateFormat56.equals((java.lang.Object) (byte) 100);
        java.util.Locale locale59 = fastDateFormat56.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat60 = org.apache.commons.lang.time.FastDateFormat.getInstance("M/d/yy", timeZone51, locale59);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat66 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone67 = fastDateFormat66.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat68 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone67);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat70 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone71 = fastDateFormat70.getTimeZone();
        java.util.Locale locale72 = fastDateFormat70.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat73 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone67, locale72);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat75 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone76 = fastDateFormat75.getTimeZone();
        java.util.Locale locale77 = fastDateFormat75.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat78 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone67, locale77);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat82 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone83 = fastDateFormat82.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat84 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone83);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat86 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone87 = fastDateFormat86.getTimeZone();
        java.util.Locale locale88 = fastDateFormat86.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat89 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone83, locale88);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat90 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone67, locale88);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat91 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 1, timeZone51, locale88);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat92 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone42, locale88);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat93 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale88);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat94 = org.apache.commons.lang.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone11, locale88);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat95 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (short) 0, locale88);
        java.util.Calendar calendar96 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str97 = fastDateFormat95.format(calendar96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(timeZone11);
// flaky:         org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(timeZone25);
// flaky:         org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(timeZone42);
// flaky:         org.junit.Assert.assertEquals(timeZone42.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertNotNull(timeZone51);
// flaky:         org.junit.Assert.assertEquals(timeZone51.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat52);
        org.junit.Assert.assertNotNull(fastDateFormat53);
        org.junit.Assert.assertNotNull(fastDateFormat54);
        org.junit.Assert.assertNotNull(fastDateFormat56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat60);
        org.junit.Assert.assertNotNull(fastDateFormat66);
        org.junit.Assert.assertNotNull(timeZone67);
// flaky:         org.junit.Assert.assertEquals(timeZone67.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat68);
        org.junit.Assert.assertNotNull(fastDateFormat70);
        org.junit.Assert.assertNotNull(timeZone71);
// flaky:         org.junit.Assert.assertEquals(timeZone71.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat73);
        org.junit.Assert.assertNotNull(fastDateFormat75);
        org.junit.Assert.assertNotNull(timeZone76);
// flaky:         org.junit.Assert.assertEquals(timeZone76.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat78);
        org.junit.Assert.assertNotNull(fastDateFormat82);
        org.junit.Assert.assertNotNull(timeZone83);
// flaky:         org.junit.Assert.assertEquals(timeZone83.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat84);
        org.junit.Assert.assertNotNull(fastDateFormat86);
        org.junit.Assert.assertNotNull(timeZone87);
// flaky:         org.junit.Assert.assertEquals(timeZone87.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale88);
        org.junit.Assert.assertEquals(locale88.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat89);
        org.junit.Assert.assertNotNull(fastDateFormat90);
        org.junit.Assert.assertNotNull(fastDateFormat91);
        org.junit.Assert.assertNotNull(fastDateFormat92);
        org.junit.Assert.assertNotNull(fastDateFormat93);
        org.junit.Assert.assertNotNull(fastDateFormat94);
        org.junit.Assert.assertNotNull(fastDateFormat95);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone8);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone8);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone8);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone8);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 0);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone22 = fastDateFormat21.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone22);
        java.util.TimeZone timeZone25 = null;
        java.util.Locale locale26 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone25, locale26);
        java.util.Locale locale28 = fastDateFormat27.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone22, locale28);
        boolean boolean30 = fastDateFormat17.equals((java.lang.Object) timeZone22);
        java.util.TimeZone timeZone33 = null;
        java.util.Locale locale34 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone33, locale34);
        java.util.Locale locale36 = fastDateFormat35.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 1, locale36);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang.time.FastDateFormat.getInstance("M/d/yy h:mm a", timeZone22, locale36);
        java.util.Locale locale39 = fastDateFormat38.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, locale39);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone8, locale39);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone49 = fastDateFormat48.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone49);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat52 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone53 = fastDateFormat52.getTimeZone();
        java.util.Locale locale54 = fastDateFormat52.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat55 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone49, locale54);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, locale54);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat57 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(3, locale54);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat58 = org.apache.commons.lang.time.FastDateFormat.getInstance("MMM d, yyyy h:mm a", locale54);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone8, locale54);
        java.lang.Class<?> wildcardClass60 = fastDateFormat59.getClass();
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky:         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(timeZone22);
// flaky:         org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertNotNull(timeZone49);
// flaky:         org.junit.Assert.assertEquals(timeZone49.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertNotNull(fastDateFormat52);
        org.junit.Assert.assertNotNull(timeZone53);
// flaky:         org.junit.Assert.assertEquals(timeZone53.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat55);
        org.junit.Assert.assertNotNull(fastDateFormat56);
        org.junit.Assert.assertNotNull(fastDateFormat57);
        org.junit.Assert.assertNotNull(fastDateFormat58);
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone6);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone6);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 0, (int) (short) 1, timeZone6);
        java.util.Locale locale10 = fastDateFormat9.getLocale();
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer13 = fastDateFormat9.format((long) (byte) 10, stringBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
// flaky:         org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone8);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone8);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone8);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone8);
        java.util.TimeZone timeZone15 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone20 = fastDateFormat19.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone20);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone24 = fastDateFormat23.getTimeZone();
        java.util.Locale locale25 = fastDateFormat23.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone20, locale25);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(2, (int) (short) 1, timeZone15, locale25);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang.time.FastDateFormat.getInstance("MMMM d, yyyy h:mm:ss a z", timeZone8, locale25);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone35 = fastDateFormat34.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone35);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone40 = fastDateFormat39.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone40);
        java.util.Locale locale42 = fastDateFormat41.getLocale();
        java.util.Locale locale43 = fastDateFormat41.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(1, timeZone35, locale43);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang.time.FastDateFormat.getInstance("M/d/yy", timeZone35);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone54 = fastDateFormat53.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat55 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone54);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat57 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone58 = fastDateFormat57.getTimeZone();
        java.util.Locale locale59 = fastDateFormat57.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat60 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone54, locale59);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat61 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, locale59);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat62 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(2, 0, locale59);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat63 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale59);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat64 = org.apache.commons.lang.time.FastDateFormat.getInstance("MMMM d, yyyy h:mm:ss a z", timeZone35, locale59);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat65 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(2, timeZone8, locale59);
        java.lang.String str66 = fastDateFormat65.getPattern();
        java.lang.String str67 = fastDateFormat65.getPattern();
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
// flaky:         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(timeZone20);
// flaky:         org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(timeZone24);
// flaky:         org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(timeZone35);
// flaky:         org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(timeZone40);
// flaky:         org.junit.Assert.assertEquals(timeZone40.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(fastDateFormat53);
        org.junit.Assert.assertNotNull(timeZone54);
// flaky:         org.junit.Assert.assertEquals(timeZone54.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat55);
        org.junit.Assert.assertNotNull(fastDateFormat57);
        org.junit.Assert.assertNotNull(timeZone58);
// flaky:         org.junit.Assert.assertEquals(timeZone58.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat60);
        org.junit.Assert.assertNotNull(fastDateFormat61);
        org.junit.Assert.assertNotNull(fastDateFormat62);
        org.junit.Assert.assertNotNull(fastDateFormat63);
        org.junit.Assert.assertNotNull(fastDateFormat64);
        org.junit.Assert.assertNotNull(fastDateFormat65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "h:mm:ss a" + "'", str66, "h:mm:ss a");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "h:mm:ss a" + "'", str67, "h:mm:ss a");
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        org.apache.commons.lang.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone6);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 1, timeZone6);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone6);
        java.util.TimeZone timeZone13 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone18 = fastDateFormat17.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone18);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone22 = fastDateFormat21.getTimeZone();
        java.util.Locale locale23 = fastDateFormat21.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone18, locale23);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance(2, (int) (short) 1, timeZone13, locale23);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang.time.FastDateFormat.getInstance("", locale23);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone6, locale23);
        java.lang.String str29 = fastDateFormat27.format((long) 3);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 0);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone38 = fastDateFormat37.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone38);
        java.util.TimeZone timeZone41 = null;
        java.util.Locale locale42 = null;
        org.apache.commons.lang.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(3, timeZone41, locale42);
        java.util.Locale locale44 = fastDateFormat43.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone38, locale44);
        boolean boolean46 = fastDateFormat33.equals((java.lang.Object) timeZone38);
        java.util.Locale locale47 = fastDateFormat33.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, locale47);
        java.lang.String str50 = fastDateFormat48.format((long) (short) 10);
        boolean boolean51 = fastDateFormat27.equals((java.lang.Object) fastDateFormat48);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat57 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone58 = fastDateFormat57.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(0, timeZone58);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat60 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone58);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat61 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone58);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat67 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone68 = fastDateFormat67.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat69 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone68);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat71 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone72 = fastDateFormat71.getTimeZone();
        java.util.Locale locale73 = fastDateFormat71.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat74 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone68, locale73);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat76 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone77 = fastDateFormat76.getTimeZone();
        java.util.Locale locale78 = fastDateFormat76.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat79 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(1, timeZone68, locale78);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat83 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone84 = fastDateFormat83.getTimeZone();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat85 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone84);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat87 = org.apache.commons.lang.time.FastDateFormat.getDateInstance(2);
        java.util.TimeZone timeZone88 = fastDateFormat87.getTimeZone();
        java.util.Locale locale89 = fastDateFormat87.getLocale();
        org.apache.commons.lang.time.FastDateFormat fastDateFormat90 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance(0, timeZone84, locale89);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat91 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone68, locale89);
        org.apache.commons.lang.time.FastDateFormat fastDateFormat92 = org.apache.commons.lang.time.FastDateFormat.getInstance("", timeZone58, locale89);
        boolean boolean93 = fastDateFormat27.equals((java.lang.Object) fastDateFormat92);
        java.text.ParsePosition parsePosition95 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj96 = fastDateFormat27.parseObject("MMMM d, yyyy", parsePosition95);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
// flaky:         org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(timeZone18);
// flaky:         org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(timeZone22);
// flaky:         org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(fastDateFormat27);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1:00:00 AM CET" + "'", str29, "1:00:00 AM CET");
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(timeZone38);
// flaky:         org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat48);
// flaky:         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Thursday, January 1, 1970" + "'", str50, "Thursday, January 1, 1970");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(fastDateFormat57);
        org.junit.Assert.assertNotNull(timeZone58);
// flaky:         org.junit.Assert.assertEquals(timeZone58.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertNotNull(fastDateFormat60);
        org.junit.Assert.assertNotNull(fastDateFormat61);
        org.junit.Assert.assertNotNull(fastDateFormat67);
        org.junit.Assert.assertNotNull(timeZone68);
// flaky:         org.junit.Assert.assertEquals(timeZone68.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat69);
        org.junit.Assert.assertNotNull(fastDateFormat71);
        org.junit.Assert.assertNotNull(timeZone72);
// flaky:         org.junit.Assert.assertEquals(timeZone72.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat74);
        org.junit.Assert.assertNotNull(fastDateFormat76);
        org.junit.Assert.assertNotNull(timeZone77);
// flaky:         org.junit.Assert.assertEquals(timeZone77.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat79);
        org.junit.Assert.assertNotNull(fastDateFormat83);
        org.junit.Assert.assertNotNull(timeZone84);
// flaky:         org.junit.Assert.assertEquals(timeZone84.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(fastDateFormat85);
        org.junit.Assert.assertNotNull(fastDateFormat87);
        org.junit.Assert.assertNotNull(timeZone88);
// flaky:         org.junit.Assert.assertEquals(timeZone88.getDisplayName(), "Central European Time");
        org.junit.Assert.assertNotNull(locale89);
        org.junit.Assert.assertEquals(locale89.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat90);
        org.junit.Assert.assertNotNull(fastDateFormat91);
        org.junit.Assert.assertNotNull(fastDateFormat92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }
}
